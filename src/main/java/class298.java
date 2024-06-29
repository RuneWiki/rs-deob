import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class298 {
   @OriginalMember(
      owner = "client!wha",
      name = "c",
      descriptor = "J"
   )
   public long field3946;
   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "[S"
   )
   public short[] field3949;
   @OriginalMember(
      owner = "client!wha",
      name = "d",
      descriptor = "[I"
   )
   public int[] field3942;
   @OriginalMember(
      owner = "client!wha",
      name = "f",
      descriptor = "[S"
   )
   public short[] field3945;
   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3950 = new String[]{method2251(method2250(",\u0018\u001551")), method2251(method2250(" ^Z5p>XRor\u007f")), method2251(method2250("9CWw")), method2251(method2250(" ^Z5\u000f\u007f")), method2251(method2250(" ^Z5\u000e\u007f")), method2251(method2250(" ^Z5\r\u007f"))};
   @OriginalMember(
      owner = "client!wha",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field3948 = new class616(41, -1);
   @OriginalMember(
      owner = "client!wha",
      name = "e",
      descriptor = "D"
   )
   public static double field3944;
   @OriginalMember(
      owner = "client!wha",
      name = "g",
      descriptor = "I"
   )
   public static int field3943;
   @OriginalMember(
      owner = "client!wha",
      name = "b",
      descriptor = "I"
   )
   public static int field3947;

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(I[Ljava/lang/Object;[J)V"
   )
   public static final void method2247(int arg0, Object[] arg1, long[] arg2) {
      try {
         int var3 = -72 / ((-72 - arg0) / 54);
         ++field3943;
         class194.method1461((byte)-120, 0, arg2.length + -1, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3950[5] + arg0 + ',' + (arg1 != null ? field3950[0] : field3950[2]) + ',' + (arg2 != null ? field3950[0] : field3950[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2248(int arg0) {
      try {
         field3948 = null;
         if (arg0 > -3) {
            method2248(62);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3950[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method2249(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field3947;
         class446 var5 = class635.method4607(117, (long)arg1 | (long)arg0 << 32, 18);
         var5.method3311(true);
         if (arg3 != -89) {
            method2249(-59, -116, 126, (byte)55, -49);
         }

         var5.field6177 = arg4;
         var5.field6167 = arg2;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3950[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class298(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field3946 = arg0;
         this.field3949 = arg3;
         this.field3942 = arg1;
         this.field3945 = arg2;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3950[1] + arg0 + ',' + (arg1 != null ? field3950[0] : field3950[2]) + ',' + (arg2 != null ? field3950[0] : field3950[2]) + ',' + (arg3 != null ? field3950[0] : field3950[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "<init>",
      descriptor = "()V"
   )
   protected class298() {
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2250(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2251(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
