import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class101 extends class55 {
   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1304 = new String[]{method847(method846(")=I=Q")), method847(method846(")=I0Q")), method847(method846(")=I9Q")), method847(method846(")=I;Q")), method847(method846(")=I:Q")), method847(method846(")=I?Q")), method847(method846(")=I>Q"))};
   @OriginalMember(
      owner = "client!tt",
      name = "e",
      descriptor = "[Lnq;"
   )
   public static class488[] field1295 = new class488[37];
   @OriginalMember(
      owner = "client!tt",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field1292 = false;
   @OriginalMember(
      owner = "client!tt",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field1296 = new int[]{-1, -1, 1, 1};
   @OriginalMember(
      owner = "client!tt",
      name = "q",
      descriptor = "I"
   )
   public static int field1297 = 0;
   @OriginalMember(
      owner = "client!tt",
      name = "f",
      descriptor = "I"
   )
   public static int field1300 = 0;
   @OriginalMember(
      owner = "client!tt",
      name = "k",
      descriptor = "Leg;"
   )
   public static class118 field1290 = new class118(117, -2);
   @OriginalMember(
      owner = "client!tt",
      name = "i",
      descriptor = "I"
   )
   public static int field1303 = -1;
   @OriginalMember(
      owner = "client!tt",
      name = "p",
      descriptor = "I"
   )
   public static int field1291;
   @OriginalMember(
      owner = "client!tt",
      name = "j",
      descriptor = "I"
   )
   public static int field1293;
   @OriginalMember(
      owner = "client!tt",
      name = "m",
      descriptor = "I"
   )
   public static int field1298;
   @OriginalMember(
      owner = "client!tt",
      name = "h",
      descriptor = "I"
   )
   public static int field1299;
   @OriginalMember(
      owner = "client!tt",
      name = "l",
      descriptor = "I"
   )
   public static int field1301;
   @OriginalMember(
      owner = "client!tt",
      name = "o",
      descriptor = "I"
   )
   public static int field1302;
   @OriginalMember(
      owner = "client!tt",
      name = "g",
      descriptor = "Lrga;"
   )
   public static class253 field1294;

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(ZIZI)V"
   )
   public static final void method842(boolean arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg2) {
            field1296 = null;
         }

         ++field1301;
         if (class148.field1935.method329((byte)113, (long)arg3) == null) {
            if (!class257.field3487) {
               class542.method3900(arg0, arg3, -82);
            } else {
               class699 var4 = new class699(arg3, new class711(4096, class742.field10816, arg3), arg1, arg0);
               var4.field10230.method4676(class528.field7552[class608.field8920], 6727);
               class148.field1935.method336(-1, (long)arg3, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1304[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method843(int arg0) {
      try {
         int var2 = -75 % ((36 - arg0) / 41);
         ++field1298;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1304[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class101(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(Lgn;IIIII)V"
   )
   public static final void method844(class731 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class154.field2185 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class457.field6539) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class16.field190 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class517 var14 = class663.field9659[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class731.field10698[var11].method2219(true, var12, var13) + class731.field10698[var11].method2219(true, var12 + 1, var13) + class731.field10698[var11].method2219(true, var12, var13 + 1) + class731.field10698[var11].method2219(true, var12 + 1, var13 + 1)) / 4 - (class731.field10698[arg1].method2219(true, arg2, arg3) + class731.field10698[arg1].method2219(true, arg2 + 1, arg3) + class731.field10698[arg1].method2219(true, arg2, arg3 + 1) + class731.field10698[arg1].method2219(true, arg2 + 1, arg3 + 1)) / 4;
                           class688 var16 = var14.field7476;
                           class688 var17 = var14.field7469;
                           if (var16 != null && var16.method239(true)) {
                              arg0.method233(class80.field1038, var6, var16, (var13 - arg3) * class729.field10681 + (1 - arg5) * class436.field6247, (var12 - arg2) * class729.field10681 + (1 - arg4) * class436.field6247, var15, -127);
                           }

                           if (var17 != null && var17.method239(true)) {
                              arg0.method233(class80.field1038, var6, var17, (var13 - arg3) * class729.field10681 + (1 - arg5) * class436.field6247, (var12 - arg2) * class729.field10681 + (1 - arg4) * class436.field6247, var15, -128);
                           }

                           for(class772 var18 = var14.field7468; var18 != null; var18 = var18.field11354) {
                              class627 var19 = var18.field11352;
                              if (var19 != null && var19.method239(true) && (var19.field9207 == var12 || var7 == var12) && (var19.field9208 == var13 || var9 == var13)) {
                                 int var20 = var19.field9211 - var19.field9207 + 1;
                                 int var21 = var19.field9212 - var19.field9208 + 1;
                                 arg0.method233(class80.field1038, var6, var19, (var19.field9208 - arg3) * class729.field10681 + (var21 - arg5) * class436.field6247, (var19.field9207 - arg2) * class729.field10681 + (var20 - arg4) * class436.field6247, var15, -128);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         super.field680 = arg0;
         ++field1293;
         int var3 = -52 % ((47 - arg1) / 46);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1304[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method845(int arg0) {
      try {
         field1290 = null;
         field1296 = null;
         if (arg0 == -20720) {
            field1295 = null;
            field1294 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1304[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field1291;
         if (arg0 != 0) {
            this.method96(43, (byte)31);
         }

         if (~super.field680 != -2 && super.field680 != 0) {
            super.field680 = this.method101(arg0 + -125);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1304[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class101(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tt",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         if (arg0 > -116) {
            method844((class731)null, -71, -16, -81, -66, -15);
         }

         ++field1302;
         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1304[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            this.method843(-52);
         }

         ++field1299;
         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1304[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method846(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method847(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
