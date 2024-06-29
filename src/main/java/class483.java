import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public abstract class class483 {
   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6663 = new String[]{method3518(method3517("Q#,/x\u000b")), method3518(method3517("Q#,/{\u000b")), method3518(method3517("Xnc/@")), method3518(method3517("Q#,/y\u000b")), method3518(method3517("M5!m"))};
   @OriginalMember(
      owner = "client!rca",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field6657 = false;
   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field6656 = Calendar.getInstance(TimeZone.getTimeZone(method3518(method3517("d\r\u0019"))));
   @OriginalMember(
      owner = "client!rca",
      name = "d",
      descriptor = "[Lsb;"
   )
   public static class307[] field6661 = new class307[16];
   @OriginalMember(
      owner = "client!rca",
      name = "c",
      descriptor = "I"
   )
   public static int field6662 = -1;
   @OriginalMember(
      owner = "client!rca",
      name = "f",
      descriptor = "D"
   )
   public static double field6658;
   @OriginalMember(
      owner = "client!rca",
      name = "g",
      descriptor = "I"
   )
   public static int field6659;
   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "I"
   )
   public static int field6660;

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3513(int arg0) {
      try {
         ++field6659;
         class421.field5903 = null;
         if (class775.field11283 && ~class600.method4374(111) != -2) {
            class784.method5651(class63.method471(true), ~class445.field6162 == -4 || class445.field6162 == 7, 0, class516.method3745(115), -106, 0);
         }

         int var1 = 0;
         int var2 = 0;
         if (class775.field11283) {
            var1 = class101.method916(39);
            var2 = class291.method2190(-74);
         }

         class503.method3630(var1, var2, 117, class41.field479 + var2, var1, class366.field5168, -1, var2, class252.field3194 + var1);
         if (arg0 >= -93) {
            field6658 = -0.6117973557688945D;
         }

         if (class421.field5903 != null) {
            class445.method3303(class611.field8543.field9342, var2, class777.field11297, class222.field2769, class252.field3194 + var1, (byte)-104, true, -1412584499, class41.field479 + var2, var1, class421.field5903);
            class421.field5903 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6663[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "(BIIIFFFIF[FI)V"
   )
   public abstract void method3514(byte arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7, float arg8, float[] arg9, int arg10);

   @OriginalMember(
      owner = "client!rca",
      name = "a",
      descriptor = "([Ljava/lang/String;[SI)V"
   )
   public static final void method3515(String[] arg0, short[] arg1, int arg2) {
      try {
         if (arg2 != 7) {
            method3515((String[])null, (short[])null, -36);
         }

         class694.method5049((byte)-107, 0, arg0.length - 1, arg0, arg1);
         ++field6660;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6663[3] + (arg0 != null ? field6663[2] : field6663[4]) + ',' + (arg1 != null ? field6663[2] : field6663[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3516(int arg0) {
      try {
         if (arg0 < -52) {
            field6656 = null;
            field6661 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6663[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
