import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class446 extends class546 {
   @OriginalMember(
      owner = "client!ep",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6179 = new String[]{method3314(method3313("o!\u0006,r")), method3314(method3313("o!\u0006+r")), method3314(method3313("o!\u0006.r")), method3314(method3313("o!\u0006*r")), method3314(method3313("o!\u0006/r")), method3314(method3313("o!\u0006T3d8\\Vr")), method3314(method3313("o!\u0006)r")), method3314(method3313("o!\u0006-r"))};
   @OriginalMember(
      owner = "client!ep",
      name = "F",
      descriptor = "Lbga;"
   )
   public static class378 field6173 = new class378(13, 1);
   @OriginalMember(
      owner = "client!ep",
      name = "D",
      descriptor = "I"
   )
   public static int field6166;
   @OriginalMember(
      owner = "client!ep",
      name = "u",
      descriptor = "I"
   )
   public int field6167;
   @OriginalMember(
      owner = "client!ep",
      name = "B",
      descriptor = "I"
   )
   public static int field6168;
   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "I"
   )
   public static int field6169;
   @OriginalMember(
      owner = "client!ep",
      name = "w",
      descriptor = "I"
   )
   public static int field6170;
   @OriginalMember(
      owner = "client!ep",
      name = "A",
      descriptor = "I"
   )
   public static int field6171;
   @OriginalMember(
      owner = "client!ep",
      name = "C",
      descriptor = "I"
   )
   public static int field6174;
   @OriginalMember(
      owner = "client!ep",
      name = "E",
      descriptor = "I"
   )
   public int field6175;
   @OriginalMember(
      owner = "client!ep",
      name = "v",
      descriptor = "I"
   )
   public static int field6176;
   @OriginalMember(
      owner = "client!ep",
      name = "t",
      descriptor = "I"
   )
   public int field6177;
   @OriginalMember(
      owner = "client!ep",
      name = "x",
      descriptor = "I"
   )
   public static int field6178;
   @OriginalMember(
      owner = "client!ep",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public String field6172;

   @OriginalMember(
      owner = "client!ep",
      name = "f",
      descriptor = "(I)J"
   )
   public final long method3306(int arg0) {
      try {
         if (arg0 != 638246648) {
            this.field6175 = -99;
         }

         ++field6174;
         return super.field6862 & 72057594037927935L;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6179[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3307(int arg0) {
      try {
         if (arg0 != -2) {
            method3307(-77);
         }

         field6173 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6179[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method3308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg1 != -27647) {
            method3308(44, 72, -53, -49, -109, -127, -33);
         }

         ++field6169;
         if (~class265.field3451 >= ~arg4 && class663.field9442 >= arg6 && ~arg3 <= ~class478.field6604 && ~class313.field4171 <= ~arg2) {
            if (arg0 != 1) {
               class191.method1440(true, arg0, arg4, arg3, arg2, arg5, arg6);
            } else {
               class458.method3369(arg2, arg5, 10, arg6, arg3, arg4);
            }
         } else if (~arg0 == -2) {
            class741.method5368(arg3, arg5, arg4, arg6, arg2, (byte)-110);
         } else {
            class600.method4379(arg3, arg0, arg4, arg6, arg5, arg2, arg1 + 27698);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6179[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method3309(byte arg0) {
      try {
         ++field6170;
         if (arg0 != -87) {
            this.field6175 = 8;
         }

         return (int)(super.field6862 >>> 56 & 255L);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6179[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "e",
      descriptor = "(I)J"
   )
   public final long method3310(int arg0) {
      try {
         ++field6168;
         if (arg0 != 0) {
            this.method3312(-34);
         }

         return Long.MAX_VALUE & super.field7452;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6179[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method3311(boolean arg0) {
      try {
         super.field7452 |= Long.MIN_VALUE;
         if (!arg0) {
            method3308(-88, -51, 24, 89, -20, -50, -31);
         }

         ++field6171;
         if (~this.method3310(0) == -1L) {
            class250.field3137.method3968(this, (byte)6);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6179[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3312(int arg0) {
      try {
         ++field6166;
         super.field7452 = Long.MIN_VALUE & super.field7452 | 500L + class792.method5708(-25005);
         if (arg0 < -113) {
            class356.field5073.method3968(this, (byte)-7);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6179[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "<init>",
      descriptor = "(IJ)V"
   )
   public class446(int arg0, long arg1) {
      try {
         super.field6862 = (long)arg0 << 56 | arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6179[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3313(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3314(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
