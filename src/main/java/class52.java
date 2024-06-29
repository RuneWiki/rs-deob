import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class52 extends class61 {
   @OriginalMember(
      owner = "client!fw",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field649 = new String[]{method357(method356(":\u000bd8!")), method357(method356("2\t&\u001c")), method357(method356("'Rd^t")), method357(method356(":\u000bd4!")), method357(method356(":\u000bd1!")), method357(method356(":\u000bd3!")), method357(method356(":\u000bd2!"))};
   @OriginalMember(
      owner = "client!fw",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field647 = new int[6];
   @OriginalMember(
      owner = "client!fw",
      name = "D",
      descriptor = "I"
   )
   public static int field642;
   @OriginalMember(
      owner = "client!fw",
      name = "F",
      descriptor = "I"
   )
   public static int field643;
   @OriginalMember(
      owner = "client!fw",
      name = "G",
      descriptor = "I"
   )
   public static int field644;
   @OriginalMember(
      owner = "client!fw",
      name = "B",
      descriptor = "I"
   )
   public static int field645;
   @OriginalMember(
      owner = "client!fw",
      name = "H",
      descriptor = "I"
   )
   public static int field646;
   @OriginalMember(
      owner = "client!fw",
      name = "E",
      descriptor = "[B"
   )
   private byte[] field648;

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method351(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var4 = 45 / ((26 - arg3) / 35);
         ++field645;
         int var5 = 255 - arg0;
         int var8 = (-16711936 & (arg2 & 16711935) * arg0 | (65280 & arg2) * arg0 & 16711680) >>> 8;
         return (((arg1 & 16711935) * var5 & -16711936 | (65280 & arg1) * var5 & 16711680) >>> 8) - -var8;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field649[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(Lc;IIII)Lqk;"
   )
   public static final class419 method352(class652 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field642;
         if (arg1 != 65280) {
            method352((class652)null, -114, -81, 31, 88);
         }

         if (arg0.field9652 || class140.method1285(arg2, -11925) && class140.method1285(arg4, -11925)) {
            return new class419(arg0, 3553, arg3, arg2, arg4);
         } else {
            return !arg0.field9700 ? new class419(arg0, arg3, arg2, arg4, class510.method3964(arg2, (byte)123), class510.method3964(arg4, (byte)122)) : new class419(arg0, 34037, arg3, arg2, arg4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field649[3] + (arg0 != null ? field649[2] : field649[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method353(boolean arg0) {
      try {
         if (arg0) {
            method353(false);
         }

         field647 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field649[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method354(byte arg0, int arg1, int arg2) {
      try {
         ++field644;
         int var4 = arg1 * 2;
         int var5 = 255 & arg0;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field648[var10001] = (byte)(var5 * 3 >> 5);
         if (arg2 != -11617) {
            this.method354((byte)15, 40, -39);
         }

         this.field648[var8] = (byte)(var5 * 3 >> 5);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field649[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(IIII)[B"
   )
   public final byte[] method355(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field643;
         this.field648 = new byte[arg3 * 2 * arg2 * arg0];
         if (arg1 != 255) {
            method351(-57, -74, 47, -107);
         }

         this.method4171(arg0, arg3, false, arg2);
         return this.field648;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field649[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "()V"
   )
   public class52() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method356(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method357(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
