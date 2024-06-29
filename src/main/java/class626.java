import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class626 {
   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9248 = new String[]{method4630(method4629("}\u001eQcJ")), method4630(method4629("}\u001eQ`J"))};
   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "[C"
   )
   private static char[] field9245 = new char[64];
   @OriginalMember(
      owner = "client!jd",
      name = "c",
      descriptor = "[Z"
   )
   public static boolean[] field9246;
   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "I"
   )
   public static int field9247;

   @OriginalMember(
      owner = "client!jd",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4627(byte arg0) {
      boolean var1 = client.field1481;

      RuntimeException var10000;
      label36: {
         boolean var10001;
         class438 var2;
         try {
            var2 = (class438)class723.field10572.method5265(-127);
            if (arg0 <= 70) {
               return;
            }
         } catch (RuntimeException var6) {
            var10000 = var6;
            var10001 = false;
            break label36;
         }

         while(true) {
            label31: {
               try {
                  if (var2 != null) {
                     if (var2.field5970 > 1) {
                        var2.field5970 = 0;
                        class259.field3299.method3190(var2, ((class541)var2.field5971.field10622.field272).field7901, 8);
                        var2.field5971.method5264(-115);
                     }
                     break label31;
                  }

                  ++field9247;
                  class455.field6279 = 0;
                  class254.field3207 = 0;
                  class500.field6967.method289(true);
                  class466.field6411.method1809(true);
                  class723.field10572.method5264(-119);
                  class652.field9742 = false;
               } catch (RuntimeException var5) {
                  var10000 = var5;
                  var10001 = false;
                  break;
               }

               if (!var1) {
                  return;
               }
            }

            try {
               var2 = (class438)class723.field10572.method5266(false);
            } catch (RuntimeException var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var3 = var10000;
      throw class93.method866(var3, field9248[1] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!jd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4628(byte arg0) {
      try {
         if (arg0 < 10) {
            field9245 = null;
         }

         field9245 = null;
         field9246 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9248[0] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 26; ++var0) {
         field9245[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field9245[var1] = (char)(var1 + -26 + 97);
      }

      for(int var2 = 52; ~var2 > -63; ++var2) {
         field9245[var2] = (char)(var2 + 48 + -52);
      }

      field9245[63] = '/';
      field9245[62] = '+';
      field9246 = new boolean[100];
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4629(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4630(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
