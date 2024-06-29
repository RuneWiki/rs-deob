import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class756 extends class479 {
   @OriginalMember(
      owner = "client!jw",
      name = "bb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10816 = new String[]{method5464(method5463("Uu\u001cC|")), method5464(method5463("Uu\u001c@|"))};
   @OriginalMember(
      owner = "client!jw",
      name = "Y",
      descriptor = "I"
   )
   public static int field10813 = 0;
   @OriginalMember(
      owner = "client!jw",
      name = "Z",
      descriptor = "[Lcu;"
   )
   public static class65[] field10814 = new class65[2048];
   @OriginalMember(
      owner = "client!jw",
      name = "ab",
      descriptor = "I"
   )
   public static int field10812;
   @OriginalMember(
      owner = "client!jw",
      name = "X",
      descriptor = "I"
   )
   public int field10815;

   @OriginalMember(
      owner = "client!jw",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method5461(int arg0, byte arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field10812;
         int var4 = 1;
         if (arg1 >= -76) {
            field10813 = 47;
            if (var3) {
               if ((1 & arg0) != 0) {
                  var4 = arg2 * var4;
               }

               arg2 *= arg2;
               arg0 >>= 1;
            }
         }

         while(true) {
            int var10000;
            int var10001;
            if (~arg0 >= -2) {
               var10000 = ~arg0;
               var10001 = -2;
               if (!var3) {
                  if (var10000 == -2) {
                     return arg2 * var4;
                  }

                  return var4;
               }
            } else {
               var10000 = 1;
               var10001 = arg0;
            }

            if ((var10000 & var10001) != 0) {
               var4 = arg2 * var4;
            }

            arg2 *= arg2;
            arg0 >>= 1;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10816[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "j",
      descriptor = "(I)V"
   )
   public static void method5462(int arg0) {
      try {
         if (arg0 != 2048) {
            method5462(41);
         }

         field10814 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10816[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jw",
      name = "<init>",
      descriptor = "(Ldea;)V"
   )
   public class756(class471 arg0) {
      super(arg0, false);
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5463(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5464(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
