import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class647 {
   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9426 = new String[]{method4672(method4671("v1\f\u0014\u0014")), method4672(method4671("p1\u0013")), method4672(method4671("v1\f\u0017\u0014"))};
   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "I"
   )
   public static int field9424;
   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field9425;

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method4669(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field9424;
         if (class685.field10272[arg0]) {
            return true;
         } else if (!class241.field3064.method3881(arg0, -1)) {
            return false;
         } else {
            int var3 = class241.field3064.method3875(0, arg0);
            if (~var3 == -1) {
               class685.field10272[arg0] = true;
               return true;
            } else {
               if (class136.field1744[arg0] == null) {
                  class136.field1744[arg0] = new class544[var3];
               }

               if (arg1 >= -46) {
                  method4670(-98);
               }

               int var4 = 0;
               byte[] var5;
               class544 var6;
               if (var2 != 0) {
                  if (class136.field1744[arg0][var4] == null) {
                     var5 = class241.field3064.method3899(-109, var4, arg0);
                     if (var5 != null) {
                        var6 = class136.field1744[arg0][var4] = new class544();
                        var6.field8054 = (arg0 << 16) + var4;
                        if (var5[0] != -1) {
                           throw new IllegalStateException(field9426[1]);
                        }

                        var6.method4024((byte)33, new class128(var5));
                     }
                  }

                  ++var4;
               }

               while(true) {
                  while(~var4 > ~var3) {
                     if (class136.field1744[arg0][var4] == null) {
                        var5 = class241.field3064.method3899(-109, var4, arg0);
                        if (var5 != null) {
                           var6 = class136.field1744[arg0][var4] = new class544();
                           var6.field8054 = (arg0 << 16) + var4;
                           if (var5[0] != -1) {
                              throw new IllegalStateException(field9426[1]);
                           }

                           var6.method4024((byte)33, new class128(var5));
                        }
                     }

                     ++var4;
                  }

                  class685.field10272[arg0] = true;
                  if (var2 == 0) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field9426[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4670(int arg0) {
      try {
         if (arg0 != -23720) {
            field9425 = null;
         }

         field9425 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9426[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4671(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4672(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
