import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class521 {
   @OriginalMember(
      owner = "client!uv",
      name = "h",
      descriptor = "Lsca;"
   )
   public class666 field7334 = new class666();
   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7335 = new String[]{method3890(method3889("cb\u0016\u0012f")), method3890(method3889("cb\u0016\u0014f")), method3890(method3889("cb\u0016\u0015f")), method3890(method3889("cb\u0016\u0013f")), method3890(method3889("xaT;")), method3890(method3889("cb\u0016\u0016f")), method3890(method3889("m:\u0016y3"))};
   @OriginalMember(
      owner = "client!uv",
      name = "f",
      descriptor = "Liw;"
   )
   public static class107 field7326 = new class107(20);
   @OriginalMember(
      owner = "client!uv",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field7329 = false;
   @OriginalMember(
      owner = "client!uv",
      name = "i",
      descriptor = "I"
   )
   public static int field7330 = 13156520;
   @OriginalMember(
      owner = "client!uv",
      name = "e",
      descriptor = "I"
   )
   public static int field7325;
   @OriginalMember(
      owner = "client!uv",
      name = "g",
      descriptor = "I"
   )
   public static int field7327;
   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "I"
   )
   public static int field7328;
   @OriginalMember(
      owner = "client!uv",
      name = "d",
      descriptor = "I"
   )
   public static int field7331;
   @OriginalMember(
      owner = "client!uv",
      name = "j",
      descriptor = "I"
   )
   public static int field7332;
   @OriginalMember(
      owner = "client!uv",
      name = "c",
      descriptor = "I"
   )
   public static int field7333;

   @OriginalMember(
      owner = "client!uv",
      name = "b",
      descriptor = "(B)Led;"
   )
   public static final class58 method3884(byte arg0) {
      try {
         ++field7333;
         return arg0 != -61 ? null : class651.field9204;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7335[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3885(int arg0) {
      try {
         if (arg0 != -19215) {
            method3888((Object)null, -17, -80, -64);
         }

         field7326 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7335[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method3886(int arg0) {
      try {
         ++field7332;
         return ~class217.field3113 == arg0 ? class690.field9938 : class517.field7313;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7335[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3887(byte arg0) {
      try {
         class773.field11259 = class131.method1339(2, 8, 2048, 8, 4, true, 35, 0.4F);
         ++field7327;
         if (arg0 <= 21) {
            method3885(-16);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7335[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "a",
      descriptor = "(Ljava/lang/Object;III)[B"
   )
   public static final byte[] method3888(Object arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7325;
         if (arg0 == null) {
            return null;
         } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[])arg0;
            return class75.method833(arg2, arg1 + 23419, arg3, var4);
         } else if (arg0 instanceof class86) {
            class86 var5 = (class86)arg0;
            return var5.method898(arg3, false, arg2);
         } else if (arg1 != -23419) {
            return null;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7335[5] + (arg0 != null ? field7335[6] : field7335[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3889(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3890(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
