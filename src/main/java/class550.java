import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class550 {
   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8113 = new String[]{method4169(method4168("}\u0016_{A&")), method4169(method4168("}\u0016_{@&")), method4169(method4168("}\u0016_{C&"))};
   @OriginalMember(
      owner = "client!sda",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field8106 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!sda",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field8109 = new class418(37, -2);
   @OriginalMember(
      owner = "client!sda",
      name = "g",
      descriptor = "I"
   )
   public static int field8105;
   @OriginalMember(
      owner = "client!sda",
      name = "f",
      descriptor = "I"
   )
   public static int field8108;
   @OriginalMember(
      owner = "client!sda",
      name = "e",
      descriptor = "I"
   )
   public static int field8112;
   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "Lww;"
   )
   public static class339 field8111;
   @OriginalMember(
      owner = "client!sda",
      name = "h",
      descriptor = "Lqn;"
   )
   public static class532 field8107;
   @OriginalMember(
      owner = "client!sda",
      name = "b",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field8110;

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4165(byte arg0) {
      try {
         if (arg0 != 3) {
            field8109 = null;
         }

         field8109 = null;
         field8107 = null;
         field8110 = null;
         field8111 = null;
         field8106 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8113[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(IJ)Ljava/lang/String;"
   )
   public static final String method4166(int arg0, long arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8108;
         if (~arg1 < -1L && arg1 < 6582952005840035281L) {
            if (~(arg1 % (long)arg0) == -1L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3) {
                  var5 = arg1 / 37L;
                  ++var4;
               }

               while(true) {
                  while(var5 != 0L) {
                     var5 /= 37L;
                     ++var4;
                  }

                  StringBuffer var7 = new StringBuffer(var4);
                  if (!var3) {
                     if (!var3 && ~arg1 == -1L) {
                        return var7.reverse().toString();
                     } else {
                        do {
                           long var8 = arg1;
                           arg1 /= 37L;
                           var7.append(class440.field5986[(int)(var8 - arg1 * 37L)]);
                        } while(~arg1 != -1L);

                        return var7.reverse().toString();
                     }
                  }

                  ++var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8113[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4167(byte arg0) {
      try {
         class428.field5822 = -1;
         if (arg0 != -11) {
            field8110 = null;
         }

         ++field8105;
         class10.field235 = 0L;
         class368.field5134 = "";
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8113[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4168(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4169(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
