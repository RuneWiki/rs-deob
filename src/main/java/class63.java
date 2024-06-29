import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class63 {
   @OriginalMember(
      owner = "client!tga",
      name = "d",
      descriptor = "I"
   )
   public int field693;
   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field697 = new String[]{method474(method473("<\f[n\u001c`")), method474(method473("<\f[na!\u0005S4c`")), method474(method473("<\f[n)'8N24&\f\u0012")), method474(method473("<\f[n\u001f`"))};
   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "I"
   )
   public static int field692;
   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "I"
   )
   public static int field694;
   @OriginalMember(
      owner = "client!tga",
      name = "e",
      descriptor = "I"
   )
   public static int field695;
   @OriginalMember(
      owner = "client!tga",
      name = "c",
      descriptor = "I"
   )
   public static int field696;

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method471(boolean arg0) {
      try {
         ++field696;
         if (~class616.field8588 == -2) {
            return class459.field6289;
         } else {
            return !arg0 ? -90 : class314.field4187;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field697[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field694;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field697[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method472(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field692;
         int var4 = arg1;
         if (var3) {
            if ((1 & arg2) != 0) {
               var4 = arg0 * arg1;
            }

            arg2 >>= 1;
            arg0 *= arg0;
         }

         while(true) {
            int var10000;
            int var10001;
            if (~arg2 >= -2) {
               var10000 = ~arg2;
               var10001 = -2;
               if (!var3) {
                  if (var10000 == -2) {
                     return arg0 * var4;
                  }

                  return var4;
               }
            } else {
               var10000 = 1;
               var10001 = arg2;
            }

            if ((var10000 & var10001) != 0) {
               var4 = arg0 * var4;
            }

            arg2 >>= 1;
            arg0 *= arg0;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field697[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class63(int arg0) {
      try {
         this.field693 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field697[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
