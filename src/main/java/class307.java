import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class307 implements class586 {
   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4373 = new String[]{method2327(method2326("A\u001f%>")), method2327(method2326("[\u0002(|#\u0007")), method2327(method2326("TDg|\u001f")), method2327(method2326("[\u0002(|&\u0007")), method2327(method2326("[\u0002(|!\u0007")), method2327(method2326("[\u0002(| \u0007"))};
   @OriginalMember(
      owner = "client!tha",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field4371 = false;
   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "D"
   )
   public static double field4369;
   @OriginalMember(
      owner = "client!tha",
      name = "e",
      descriptor = "I"
   )
   public static int field4367;
   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "I"
   )
   public static int field4370;
   @OriginalMember(
      owner = "client!tha",
      name = "d",
      descriptor = "I"
   )
   public static int field4372;
   @OriginalMember(
      owner = "client!tha",
      name = "f",
      descriptor = "Leaa;"
   )
   public static class526 field4368;

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "([IBLcj;J)Ljava/lang/String;"
   )
   public final String method2322(int[] arg0, byte arg1, class721 arg2, long arg3) {
      try {
         ++field4367;
         if (class633.field9220 == arg2) {
            class248 var6 = class370.field5634.method2154((byte)-76, arg0[0]);
            return var6.method1868(-121, (int)arg3);
         } else if (class762.field11198 != arg2 && class690.field10395 != arg2) {
            if (arg1 >= -67) {
               field4368 = null;
            }

            return class42.field454 != arg2 && class109.field1321 != arg2 && class68.field858 != arg2 ? null : class370.field5634.method2154((byte)-76, arg0[0]).method1868(-116, (int)arg3);
         } else {
            class91 var7 = class54.field616.method1689((int)arg3, (byte)101);
            return var7.field1138;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4373[1] + (arg0 != null ? field4373[2] : field4373[0]) + ',' + arg1 + ',' + (arg2 != null ? field4373[2] : field4373[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(IIIIIIB)I"
   )
   public static final int method2323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         ++field4372;
         if (~(arg2 & 1) == -2) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
         }

         int var10 = arg1 & 3;
         if (~var10 == -1) {
            return arg5;
         } else {
            if (arg6 <= 105) {
               field4368 = null;
            }

            if (~var10 == -2) {
               return arg4;
            } else {
               return var10 == 2 ? -arg5 + 7 - arg0 + 1 : -arg4 - -1 - arg3 + 7;
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4373[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2324(int arg0) {
      try {
         if (arg0 > 41) {
            field4368 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4373[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(IIILeaa;)Lut;"
   )
   public static final class134 method2325(int arg0, int arg1, int arg2, class526 arg3) {
      try {
         ++field4370;
         byte[] var4 = arg3.method3899(-60, arg2, arg1);
         if (arg0 != 0) {
            return null;
         } else {
            return var4 == null ? null : new class134(var4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4373[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4373[2] : field4373[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
