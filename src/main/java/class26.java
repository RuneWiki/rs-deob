import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 extends class22 {
   @OriginalMember(
      owner = "client!nc",
      name = "m",
      descriptor = "I"
   )
   public int field399;
   @OriginalMember(
      owner = "client!nc",
      name = "n",
      descriptor = "I"
   )
   public int field397;
   @OriginalMember(
      owner = "client!nc",
      name = "u",
      descriptor = "I"
   )
   public int field393;
   @OriginalMember(
      owner = "client!nc",
      name = "v",
      descriptor = "I"
   )
   public int field390;
   @OriginalMember(
      owner = "client!nc",
      name = "k",
      descriptor = "Z"
   )
   public boolean field400;
   @OriginalMember(
      owner = "client!nc",
      name = "t",
      descriptor = "I"
   )
   public int field396;
   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field403 = new String[]{method188(method187("f\"\u00148\rf(N:L")), method188(method187("f\"\u0014@L")), method188(method187("f\"\u0014AL")), method188(method187("f4Vh")), method188(method187("f\"\u0014GL")), method188(method187("F4Vh")), method188(method187("so\u0014*\u0019")), method188(method187("4\"UhYn'\\b\u0002n\u007f")), method188(method187("f\"\u0014FL")), method188(method187("f\"\u0014EL"))};
   @OriginalMember(
      owner = "client!nc",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field391 = false;
   @OriginalMember(
      owner = "client!nc",
      name = "s",
      descriptor = "Lrw;"
   )
   public static class788 field398 = new class788();
   @OriginalMember(
      owner = "client!nc",
      name = "o",
      descriptor = "Luw;"
   )
   private static class435 field402 = new class435(72, 7);
   @OriginalMember(
      owner = "client!nc",
      name = "l",
      descriptor = "I"
   )
   public static int field392;
   @OriginalMember(
      owner = "client!nc",
      name = "p",
      descriptor = "I"
   )
   public static int field394;
   @OriginalMember(
      owner = "client!nc",
      name = "r",
      descriptor = "I"
   )
   public static int field395;
   @OriginalMember(
      owner = "client!nc",
      name = "q",
      descriptor = "I"
   )
   public static int field401;

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(IILvia;I)V"
   )
   public static final void method182(int arg0, int arg1, class587 arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         ++field401;
         if (arg2 != null && class685.field10080.field4749 != arg2) {
            int var5 = arg2.field8489;
            int var6 = arg2.field8483;
            int var7 = arg2.field8485;
            int var8 = (int)arg2.field8494;
            long var9 = arg2.field8494;
            if (var7 >= 2000) {
               var7 -= 2000;
            }

            if (var7 == 6) {
               class534.field7783 = 0;
               class432.field6255 = arg3;
               class741.field10679 = arg1;
               class395.field5807 = 2;
               ++class176.field2699;
               class542 var11 = class549.method4093((byte)-113, class198.field2986, class126.field2108);
               var11.field7859.method3555(var8, (byte)-36);
               var11.field7859.method3541(arg0 + -23110, class753.field10887 + var6);
               var11.field7859.method3550(class347.field4939 + var5, 29620);
               var11.field7859.method3530(arg0 ^ 15815, !class292.field4073.method2913(82, (byte)-76) ? 0 : 1);
               class740.method5332(var11, (byte)77);
               class217.method1847(var6, var5, arg0 + 2);
            }

            if (~var7 == -6) {
               class457 var12 = class458.field6723[var8];
               if (var12 != null) {
                  ++class188.field2835;
                  class395.field5807 = 2;
                  class741.field10679 = arg1;
                  class432.field6255 = arg3;
                  class534.field7783 = 0;
                  class542 var13 = class549.method4093((byte)-113, class318.field4595, class126.field2108);
                  var13.field7859.method3557(12879, !class292.field4073.method2913(82, (byte)-81) ? 0 : 1);
                  var13.field7859.method3541(-23112, var8);
                  class740.method5332(var13, (byte)77);
                  class681.method4970(var12.method3438(false), 0, -2, var12.method3438(false), true, var12.field11313[0], 0, var12.field11322[0], 0);
               }
            }

            if (var7 == 51 && class581.field8351 == null) {
               class258.method2070(5000, var6, var5);
               class581.field8351 = class345.method2670(var5, (byte)111, var6);
               class322.method2512(16, class581.field8351);
            }

            if (var7 == 4) {
               class457 var14 = class458.field6723[var8];
               if (var14 != null) {
                  class432.field6255 = arg3;
                  class534.field7783 = 0;
                  class395.field5807 = 2;
                  class741.field10679 = arg1;
                  ++class171.field2655;
                  class542 var15 = class549.method4093((byte)-113, class416.field6093, class126.field2108);
                  var15.field7859.method3571(arg0 ^ -255, class292.field4073.method2913(82, (byte)-111) ? 1 : 0);
                  var15.field7859.method3532(class780.field11429, 1605771280);
                  var15.field7859.method3550(class752.field10823, 29620);
                  var15.field7859.method3541(-23112, class513.field7486);
                  var15.field7859.method3541(-23112, var8);
                  class740.method5332(var15, (byte)77);
                  class681.method4970(var14.method3438(false), 0, -2, var14.method3438(false), true, var14.field11313[0], 0, var14.field11322[0], 0);
               }
            }

            if (arg0 != -2) {
               field391 = false;
            }

            if (var7 == 44) {
               class303 var16 = class345.method2670(var5, (byte)118, var6);
               if (var16 != null) {
                  method185(var16, 8240);
               }
            }

            if (var7 == 46) {
               class534.field7783 = 0;
               class395.field5807 = 2;
               class741.field10679 = arg1;
               ++class754.field10953;
               class432.field6255 = arg3;
               class542 var17 = class549.method4093((byte)-113, class529.field7703, class126.field2108);
               var17.field7859.method3530(-15815, !class292.field4073.method2913(82, (byte)-104) ? 0 : 1);
               var17.field7859.method3541(-23112, var6 - -class753.field10887);
               var17.field7859.method3555(var8, (byte)57);
               var17.field7859.method3554(var5 - -class347.field4939, arg0 + 257);
               class740.method5332(var17, (byte)77);
               class217.method1847(var6, var5, 0);
            }

            if (~var7 == -17) {
               class534.field7783 = 0;
               class741.field10679 = arg1;
               class432.field6255 = arg3;
               class395.field5807 = 2;
               ++class416.field6087;
               class542 var18 = class549.method4093((byte)-113, class328.field4692, class126.field2108);
               var18.field7859.method3554(var8, arg0 ^ -255);
               var18.field7859.method3550(class753.field10887 + var6, 29620);
               var18.field7859.method3557(12879, class292.field4073.method2913(82, (byte)-127) ? 1 : 0);
               var18.field7859.method3554(class347.field4939 + var5, 255);
               class740.method5332(var18, (byte)77);
               class217.method1847(var6, var5, arg0 ^ -2);
            }

            if (~var7 == -60) {
               class272 var19 = (class272)class78.field1344.method1572((long)var8, -16289);
               if (var19 != null) {
                  class432.field6255 = arg3;
                  ++class773.field11329;
                  class534.field7783 = 0;
                  class395.field5807 = 2;
                  class741.field10679 = arg1;
                  class451 var20 = var19.field3851;
                  class542 var21 = class549.method4093((byte)-113, class760.field11024, class126.field2108);
                  var21.field7859.method3541(-23112, var8);
                  var21.field7859.method3530(-15815, class292.field4073.method2913(82, (byte)-105) ? 1 : 0);
                  class740.method5332(var21, (byte)77);
                  class681.method4970(var20.method3438(false), 0, -2, var20.method3438(false), true, var20.field11313[0], 0, var20.field11322[0], 0);
               }
            }

            if (var7 == 19) {
               class741.field10679 = arg1;
               class395.field5807 = 2;
               ++class171.field2655;
               class534.field7783 = 0;
               class432.field6255 = arg3;
               class542 var22 = class549.method4093((byte)-113, class416.field6093, class126.field2108);
               var22.field7859.method3571(255, !class292.field4073.method2913(82, (byte)-73) ? 0 : 1);
               var22.field7859.method3532(class780.field11429, 1605771280);
               var22.field7859.method3550(class752.field10823, 29620);
               var22.field7859.method3541(-23112, class513.field7486);
               var22.field7859.method3541(arg0 + -23110, class304.field4398.field11306);
               class740.method5332(var22, (byte)77);
            }

            if (var7 == 21) {
               class741.field10679 = arg1;
               class432.field6255 = arg3;
               class395.field5807 = 2;
               class534.field7783 = 0;
               ++class242.field3496;
               class542 var23 = class549.method4093((byte)-113, class745.field10736, class126.field2108);
               var23.field7859.method3571(255, !class292.field4073.method2913(82, (byte)-119) ? 0 : 1);
               var23.field7859.method3554(class347.field4939 + var5, 255);
               var23.field7859.method3554(Integer.MAX_VALUE & (int)(var9 >>> 32), arg0 ^ -255);
               var23.field7859.method3554(class753.field10887 + var6, 255);
               class740.method5332(var23, (byte)77);
               class170.method1530(var9, var6, var5, 106);
            }

            if (~var7 == -9) {
               class272 var24 = (class272)class78.field1344.method1572((long)var8, arg0 + -16287);
               if (var24 != null) {
                  class395.field5807 = 2;
                  class451 var25 = var24.field3851;
                  ++class346.field4925;
                  class534.field7783 = 0;
                  class432.field6255 = arg3;
                  class741.field10679 = arg1;
                  class542 var26 = class549.method4093((byte)-113, class677.field9934, class126.field2108);
                  var26.field7859.method3541(-23112, class752.field10823);
                  var26.field7859.method3540(class780.field11429, 898075920);
                  var26.field7859.method3541(-23112, class513.field7486);
                  var26.field7859.method3557(12879, !class292.field4073.method2913(82, (byte)-69) ? 0 : 1);
                  var26.field7859.method3541(-23112, var8);
                  class740.method5332(var26, (byte)77);
                  class681.method4970(var25.method3438(false), 0, -2, var25.method3438(false), true, var25.field11313[0], 0, var25.field11322[0], 0);
               }
            }

            if (var7 == 25) {
               class457 var27 = class458.field6723[var8];
               if (var27 != null) {
                  class395.field5807 = 2;
                  class741.field10679 = arg1;
                  ++class33.field496;
                  class432.field6255 = arg3;
                  class534.field7783 = 0;
                  class542 var28 = class549.method4093((byte)-113, class790.field11552, class126.field2108);
                  var28.field7859.method3541(-23112, var8);
                  var28.field7859.method3557(12879, !class292.field4073.method2913(82, (byte)-89) ? 0 : 1);
                  class740.method5332(var28, (byte)77);
                  class681.method4970(var27.method3438(false), 0, -2, var27.method3438(false), true, var27.field11313[0], 0, var27.field11322[0], 0);
               }
            }

            if (~var7 == -59) {
               class457 var29 = class458.field6723[var8];
               if (var29 != null) {
                  class432.field6255 = arg3;
                  class395.field5807 = 2;
                  ++class313.field4497;
                  class534.field7783 = 0;
                  class741.field10679 = arg1;
                  class542 var30 = class549.method4093((byte)-113, class458.field6718, class126.field2108);
                  var30.field7859.method3557(12879, class292.field4073.method2913(82, (byte)-118) ? 1 : 0);
                  var30.field7859.method3554(var8, 255);
                  class740.method5332(var30, (byte)77);
                  class681.method4970(var29.method3438(false), 0, -2, var29.method3438(false), true, var29.field11313[0], 0, var29.field11322[0], 0);
               }
            }

            if (~var7 == -58) {
               ++class633.field9236;
               class534.field7783 = 0;
               class395.field5807 = 2;
               class432.field6255 = arg3;
               class741.field10679 = arg1;
               class542 var31 = class549.method4093((byte)-113, class215.field3224, class126.field2108);
               var31.field7859.method3554(class752.field10823, arg0 ^ -255);
               var31.field7859.method3541(-23112, class753.field10887 + var6);
               var31.field7859.method3540(class780.field11429, 898075920);
               var31.field7859.method3557(12879, !class292.field4073.method2913(82, (byte)-94) ? 0 : 1);
               var31.field7859.method3554(var8, 255);
               var31.field7859.method3554(var5 - -class347.field4939, 255);
               var31.field7859.method3554(class513.field7486, 255);
               class740.method5332(var31, (byte)77);
               class217.method1847(var6, var5, 0);
            }

            if (var7 == 1011) {
               class432.field6255 = arg3;
               class741.field10679 = arg1;
               class395.field5807 = 2;
               class534.field7783 = 0;
               ++class215.field3227;
               class542 var32 = class549.method4093((byte)-113, class385.field5686, class126.field2108);
               var32.field7859.method3541(-23112, class347.field4939 + var5);
               var32.field7859.method3541(-23112, class753.field10887 + var6);
               var32.field7859.method3557(12879, class292.field4073.method2913(82, (byte)-97) ? 1 : 0);
               var32.field7859.method3541(arg0 ^ 23110, Integer.MAX_VALUE & (int)(var9 >>> 32));
               class740.method5332(var32, (byte)77);
               class170.method1530(var9, var6, var5, -82);
            }

            if (~var7 == -10) {
               class457 var33 = class458.field6723[var8];
               if (var33 != null) {
                  class432.field6255 = arg3;
                  ++class358.field5352;
                  class741.field10679 = arg1;
                  class534.field7783 = 0;
                  class395.field5807 = 2;
                  class542 var34 = class549.method4093((byte)-113, class531.field7743, class126.field2108);
                  var34.field7859.method3554(var8, 255);
                  var34.field7859.method3571(255, !class292.field4073.method2913(82, (byte)-61) ? 0 : 1);
                  class740.method5332(var34, (byte)77);
                  class681.method4970(var33.method3438(false), 0, -2, var33.method3438(false), true, var33.field11313[0], 0, var33.field11322[0], 0);
               }
            }

            if (~var7 == -61) {
               label433: {
                  if (class292.field4071 > 0 && class292.field4073.method2913(82, (byte)-95) && class292.field4073.method2913(81, (byte)-69)) {
                     class772.method5589(class753.field10887 + var6, (byte)38, class347.field4939 + var5, class304.field4398.field4090);
                     if (!var4) {
                        break label433;
                     }
                  }

                  ++class537.field7818;
                  class395.field5807 = 1;
                  class432.field6255 = arg3;
                  class741.field10679 = arg1;
                  class534.field7783 = 0;
                  class542 var35 = class549.method4093((byte)-113, class515.field7504, class126.field2108);
                  var35.field7859.method3555(class347.field4939 - -var5, (byte)-75);
                  var35.field7859.method3554(class753.field10887 + var6, 255);
                  class740.method5332(var35, (byte)77);
               }
            }

            if (~var7 == -13) {
               class457 var36 = class458.field6723[var8];
               if (var36 != null) {
                  ++class329.field4697;
                  class741.field10679 = arg1;
                  class534.field7783 = 0;
                  class432.field6255 = arg3;
                  class395.field5807 = 2;
                  class542 var37 = class549.method4093((byte)-113, class547.field7907, class126.field2108);
                  var37.field7859.method3555(var8, (byte)-116);
                  var37.field7859.method3530(-15815, class292.field4073.method2913(82, (byte)-92) ? 1 : 0);
                  class740.method5332(var37, (byte)77);
                  class681.method4970(var36.method3438(false), 0, -2, var36.method3438(false), true, var36.field11313[0], 0, var36.field11322[0], 0);
               }
            }

            if (~var7 == -46) {
               class432.field6255 = arg3;
               class534.field7783 = 0;
               ++class612.field8888;
               class741.field10679 = arg1;
               class395.field5807 = 2;
               class542 var38 = class549.method4093((byte)-113, class27.field404, class126.field2108);
               var38.field7859.method3554(var6 - -class753.field10887, 255);
               var38.field7859.method3580(!class292.field4073.method2913(82, (byte)-80) ? 0 : 1, 125);
               var38.field7859.method3540(class780.field11429, 898075920);
               var38.field7859.method3541(-23112, class752.field10823);
               var38.field7859.method3555(var5 - -class347.field4939, (byte)-24);
               var38.field7859.method3554(class513.field7486, 255);
               var38.field7859.method3550((int)(var9 >>> 32) & Integer.MAX_VALUE, 29620);
               class740.method5332(var38, (byte)77);
               class170.method1530(var9, var6, var5, arg0 ^ -118);
            }

            if (var7 == 22) {
               label469: {
                  if (~class292.field4071 < -1 && class292.field4073.method2913(82, (byte)-80) && class292.field4073.method2913(81, (byte)-75)) {
                     class772.method5589(class753.field10887 + var6, (byte)38, class347.field4939 + var5, class304.field4398.field4090);
                     if (!var4) {
                        break label469;
                     }
                  }

                  class542 var39;
                  label415: {
                     var39 = class71.method751(-74, var6, var5, var8);
                     if (var8 != 1) {
                        class534.field7783 = 0;
                        class432.field6255 = arg3;
                        class741.field10679 = arg1;
                        class395.field5807 = 1;
                        if (!var4) {
                           break label415;
                        }
                     }

                     var39.field7859.method3571(255, -1);
                     var39.field7859.method3571(255, -1);
                     var39.field7859.method3550((int)class756.field10975, 29620);
                     var39.field7859.method3571(255, 57);
                     var39.field7859.method3571(255, class395.field5809);
                     var39.field7859.method3571(255, class449.field6559);
                     var39.field7859.method3571(255, 89);
                     var39.field7859.method3550(class304.field4398.field4101, 29620);
                     var39.field7859.method3550(class304.field4398.field4096, 29620);
                     var39.field7859.method3571(arg0 ^ -255, 63);
                  }

                  class740.method5332(var39, (byte)77);
                  class681.method4970(1, 0, -4, 1, true, var5, 0, var6, 0);
               }
            }

            if (~var7 == -14) {
               class741.field10679 = arg1;
               class395.field5807 = 2;
               class534.field7783 = 0;
               class432.field6255 = arg3;
               ++class758.field11006;
               class542 var40 = class549.method4093((byte)-113, class516.field7512, class126.field2108);
               var40.field7859.method3550(class753.field10887 + var6, 29620);
               var40.field7859.method3580(class292.field4073.method2913(82, (byte)-65) ? 1 : 0, 125);
               var40.field7859.method3554(class347.field4939 + var5, 255);
               var40.field7859.method3541(-23112, (int)(var9 >>> 32) & Integer.MAX_VALUE);
               class740.method5332(var40, (byte)77);
               class170.method1530(var9, var6, var5, arg0 ^ 93);
            }

            if (~var7 == -1007) {
               class534.field7783 = 0;
               class395.field5807 = 2;
               class432.field6255 = arg3;
               class741.field10679 = arg1;
               class272 var41 = (class272)class78.field1344.method1572((long)var8, -16289);
               if (var41 != null) {
                  class451 var42 = var41.field3851;
                  class15 var43 = var42.field6586;
                  if (var43.field230 != null) {
                     var43 = var43.method111(class616.field8951, -2690);
                  }

                  if (var43 != null) {
                     ++class526.field7674;
                     class542 var44 = class549.method4093((byte)-113, class196.field2965, class126.field2108);
                     var44.field7859.method3550(var43.field256, 29620);
                     class740.method5332(var44, (byte)77);
                  }
               }
            }

            if (~var7 == -51) {
               class303 var45 = class345.method2670(var5, (byte)117, var6);
               if (var45 != null) {
                  class449.method3386((byte)-9);
                  class710 var46 = client.method2454(var45);
                  class518.method3907(var45, var46.field10322, -61, var46.method5160(false));
                  class133.field2194 = class696.method5058(var45, (byte)80);
                  class123.field1965 = var45.field4228 + field403[7];
                  if (class133.field2194 == null) {
                     class133.field2194 = field403[5];
                  }
               }

            } else {
               if (~var7 == -4) {
                  class395.field5807 = 2;
                  class534.field7783 = 0;
                  ++class557.field8080;
                  class741.field10679 = arg1;
                  class432.field6255 = arg3;
                  class542 var47 = class549.method4093((byte)-113, class782.field11453, class126.field2108);
                  var47.field7859.method3554(var8, 255);
                  var47.field7859.method3580(class292.field4073.method2913(82, (byte)-85) ? 1 : 0, -117);
                  var47.field7859.method3555(class347.field4939 + var5, (byte)-77);
                  var47.field7859.method3554(class753.field10887 + var6, 255);
                  class740.method5332(var47, (byte)77);
                  class217.method1847(var6, var5, 0);
               }

               if (var7 == 10) {
                  class457 var48 = class458.field6723[var8];
                  if (var48 != null) {
                     class395.field5807 = 2;
                     class432.field6255 = arg3;
                     ++class313.field4497;
                     class534.field7783 = 0;
                     class741.field10679 = arg1;
                     class542 var49 = class549.method4093((byte)-113, class614.field8913, class126.field2108);
                     var49.field7859.method3557(12879, class292.field4073.method2913(82, (byte)-94) ? 1 : 0);
                     var49.field7859.method3541(-23112, var8);
                     class740.method5332(var49, (byte)77);
                     class681.method4970(var48.method3438(false), 0, -2, var48.method3438(false), true, var48.field11313[0], 0, var48.field11322[0], 0);
                  }
               }

               if (var7 == 49) {
                  class457 var50 = class458.field6723[var8];
                  if (var50 != null) {
                     ++class313.field4497;
                     class534.field7783 = 0;
                     class432.field6255 = arg3;
                     class741.field10679 = arg1;
                     class395.field5807 = 2;
                     class542 var51 = class549.method4093((byte)-113, class213.field3185, class126.field2108);
                     var51.field7859.method3571(255, !class292.field4073.method2913(82, (byte)-93) ? 0 : 1);
                     var51.field7859.method3550(var8, 29620);
                     class740.method5332(var51, (byte)77);
                     class681.method4970(var50.method3438(false), 0, -2, var50.method3438(false), true, var50.field11313[0], 0, var50.field11322[0], 0);
                  }
               }

               if (var7 == 15) {
                  class457 var52 = class458.field6723[var8];
                  if (var52 != null) {
                     class741.field10679 = arg1;
                     ++class578.field8320;
                     class534.field7783 = 0;
                     class395.field5807 = 2;
                     class432.field6255 = arg3;
                     class542 var53 = class549.method4093((byte)-113, class570.field8252, class126.field2108);
                     var53.field7859.method3555(var8, (byte)-122);
                     var53.field7859.method3557(12879, !class292.field4073.method2913(82, (byte)-114) ? 0 : 1);
                     class740.method5332(var53, (byte)77);
                     class681.method4970(var52.method3438(false), 0, -2, var52.method3438(false), true, var52.field11313[0], 0, var52.field11322[0], 0);
                  }
               }

               if (var7 == 1012 || var7 == 1008 || ~var7 == -1002 || var7 == 1009 || ~var7 == -1003) {
                  class61.method667(var5, false, var8, var7);
               }

               if (var7 == 1007) {
                  class395.field5807 = 2;
                  class432.field6255 = arg3;
                  class534.field7783 = 0;
                  ++class470.field6830;
                  class741.field10679 = arg1;
                  class542 var54 = class549.method4093((byte)-113, class17.field300, class126.field2108);
                  var54.field7859.method3550(var8, arg0 + 29622);
                  class740.method5332(var54, (byte)77);
               }

               if (var7 == 2) {
                  class457 var55 = class458.field6723[var8];
                  if (var55 != null) {
                     ++class119.field1935;
                     class741.field10679 = arg1;
                     class534.field7783 = 0;
                     class432.field6255 = arg3;
                     class395.field5807 = 2;
                     class542 var56 = class549.method4093((byte)-113, class12.field134, class126.field2108);
                     var56.field7859.method3571(255, !class292.field4073.method2913(82, (byte)-120) ? 0 : 1);
                     var56.field7859.method3555(var8, (byte)-106);
                     class740.method5332(var56, (byte)77);
                     class681.method4970(var55.method3438(false), 0, -2, var55.method3438(false), true, var55.field11313[0], 0, var55.field11322[0], 0);
                  }
               }

               if (var7 == 30) {
                  class457 var57 = class458.field6723[var8];
                  if (var57 != null) {
                     class432.field6255 = arg3;
                     class741.field10679 = arg1;
                     ++class348.field4950;
                     class395.field5807 = 2;
                     class534.field7783 = 0;
                     class542 var58 = class549.method4093((byte)-113, class557.field8088, class126.field2108);
                     var58.field7859.method3541(-23112, var8);
                     var58.field7859.method3580(class292.field4073.method2913(82, (byte)-111) ? 1 : 0, 125);
                     class740.method5332(var58, (byte)77);
                     class681.method4970(var57.method3438(false), 0, -2, var57.method3438(false), true, var57.field11313[0], 0, var57.field11322[0], 0);
                  }
               }

               if (var7 == 52) {
                  class432.field6255 = arg3;
                  ++class14.field205;
                  class395.field5807 = 2;
                  class534.field7783 = 0;
                  class741.field10679 = arg1;
                  class542 var59 = class549.method4093((byte)-113, class668.field9699, class126.field2108);
                  var59.field7859.method3530(-15815, class292.field4073.method2913(82, (byte)-61) ? 1 : 0);
                  var59.field7859.method3541(-23112, var8);
                  var59.field7859.method3555(class347.field4939 + var5, (byte)-32);
                  var59.field7859.method3550(var6 - -class753.field10887, 29620);
                  class740.method5332(var59, (byte)77);
                  class217.method1847(var6, var5, arg0 + 2);
               }

               if (~var7 == -21) {
                  class272 var60 = (class272)class78.field1344.method1572((long)var8, arg0 ^ 16289);
                  if (var60 != null) {
                     ++class203.field3036;
                     class451 var61 = var60.field3851;
                     class534.field7783 = 0;
                     class395.field5807 = 2;
                     class432.field6255 = arg3;
                     class741.field10679 = arg1;
                     class542 var62 = class549.method4093((byte)-113, class321.field4625, class126.field2108);
                     var62.field7859.method3530(arg0 ^ 15815, class292.field4073.method2913(82, (byte)-93) ? 1 : 0);
                     var62.field7859.method3554(var8, 255);
                     class740.method5332(var62, (byte)77);
                     class681.method4970(var61.method3438(false), 0, -2, var61.method3438(false), true, var61.field11313[0], 0, var61.field11322[0], 0);
                  }
               }

               if (var7 == 11) {
                  class534.field7783 = 0;
                  class432.field6255 = arg3;
                  class741.field10679 = arg1;
                  ++class788.field11529;
                  class395.field5807 = 2;
                  class542 var63 = class549.method4093((byte)-113, field402, class126.field2108);
                  var63.field7859.method3541(arg0 + -23110, var5 - -class347.field4939);
                  var63.field7859.method3541(-23112, Integer.MAX_VALUE & (int)(var9 >>> 32));
                  var63.field7859.method3541(-23112, var6 - -class753.field10887);
                  var63.field7859.method3557(12879, class292.field4073.method2913(82, (byte)-88) ? 1 : 0);
                  class740.method5332(var63, (byte)77);
                  class170.method1530(var9, var6, var5, -93);
               }

               if (~var7 == -49 || var7 == 1003) {
                  class281.method2200(0, var5, arg2.field8477, var6, var8);
               }

               if (~var7 == -24) {
                  class272 var64 = (class272)class78.field1344.method1572((long)var8, -16289);
                  if (var64 != null) {
                     class432.field6255 = arg3;
                     ++class755.field10958;
                     class451 var65 = var64.field3851;
                     class534.field7783 = 0;
                     class741.field10679 = arg1;
                     class395.field5807 = 2;
                     class542 var66 = class549.method4093((byte)-113, class759.field11022, class126.field2108);
                     var66.field7859.method3550(var8, arg0 + 29622);
                     var66.field7859.method3530(-15815, class292.field4073.method2913(82, (byte)-68) ? 1 : 0);
                     class740.method5332(var66, (byte)77);
                     class681.method4970(var65.method3438(false), arg0 + 2, -2, var65.method3438(false), true, var65.field11313[0], 0, var65.field11322[0], 0);
                  }
               }

               if (var7 == 1010) {
                  ++class367.field5450;
                  class534.field7783 = 0;
                  class395.field5807 = 2;
                  class741.field10679 = arg1;
                  class432.field6255 = arg3;
                  class542 var67 = class549.method4093((byte)-113, class622.field9078, class126.field2108);
                  var67.field7859.method3550(var8, 29620);
                  class740.method5332(var67, (byte)77);
               }

               if (~var7 == -18) {
                  class272 var68 = (class272)class78.field1344.method1572((long)var8, -16289);
                  if (var68 != null) {
                     class534.field7783 = 0;
                     class741.field10679 = arg1;
                     class395.field5807 = 2;
                     class432.field6255 = arg3;
                     ++class141.field2331;
                     class451 var69 = var68.field3851;
                     class542 var70 = class549.method4093((byte)-113, class210.field3132, class126.field2108);
                     var70.field7859.method3571(arg0 ^ -255, !class292.field4073.method2913(82, (byte)-73) ? 0 : 1);
                     var70.field7859.method3555(var8, (byte)66);
                     class740.method5332(var70, (byte)77);
                     class681.method4970(var69.method3438(false), 0, -2, var69.method3438(false), true, var69.field11313[0], 0, var69.field11322[0], 0);
                  }
               }

               if (var7 == 18) {
                  class432.field6255 = arg3;
                  ++class292.field4068;
                  class534.field7783 = 0;
                  class741.field10679 = arg1;
                  class395.field5807 = 2;
                  class542 var71 = class549.method4093((byte)-113, class435.field6291, class126.field2108);
                  var71.field7859.method3530(-15815, !class292.field4073.method2913(82, (byte)-69) ? 0 : 1);
                  var71.field7859.method3555(class753.field10887 + var6, (byte)127);
                  var71.field7859.method3555(Integer.MAX_VALUE & (int)(var9 >>> 32), (byte)-39);
                  var71.field7859.method3541(-23112, class347.field4939 + var5);
                  class740.method5332(var71, (byte)77);
                  class170.method1530(var9, var6, var5, 96);
               }

               if (~var7 == -54) {
                  class741.field10679 = arg1;
                  ++class728.field10472;
                  class534.field7783 = 0;
                  class395.field5807 = 1;
                  class432.field6255 = arg3;
                  class542 var72 = class549.method4093((byte)-113, class438.field6316, class126.field2108);
                  var72.field7859.method3558(arg0 + -99, class780.field11429);
                  var72.field7859.method3554(class347.field4939 + var5, 255);
                  var72.field7859.method3555(class752.field10823, (byte)-48);
                  var72.field7859.method3541(-23112, class753.field10887 - -var6);
                  var72.field7859.method3550(class513.field7486, arg0 + 29622);
                  class740.method5332(var72, (byte)77);
                  class681.method4970(1, 0, -4, 1, true, var5, 0, var6, 0);
               }

               if (~var7 == -48) {
                  class272 var73 = (class272)class78.field1344.method1572((long)var8, arg0 ^ 16289);
                  if (var73 != null) {
                     class741.field10679 = arg1;
                     class395.field5807 = 2;
                     class432.field6255 = arg3;
                     class451 var74 = var73.field3851;
                     ++class747.field10777;
                     class534.field7783 = 0;
                     class542 var75 = class549.method4093((byte)-113, class441.field6435, class126.field2108);
                     var75.field7859.method3550(var8, 29620);
                     var75.field7859.method3580(class292.field4073.method2913(82, (byte)-72) ? 1 : 0, 127);
                     class740.method5332(var75, (byte)77);
                     class681.method4970(var74.method3438(false), arg0 ^ -2, -2, var74.method3438(false), true, var74.field11313[0], 0, var74.field11322[0], 0);
                  }
               }

               if (class85.field1410) {
                  class449.method3386((byte)-65);
               }

               if (class516.field7515 != null && class657.field9584 == 0) {
                  class322.method2512(arg0 ^ -18, class516.field7515);
               }
            }
         }
      } catch (RuntimeException var77) {
         throw class608.method4462(var77, field403[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field403[6] : field403[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(CZ)B"
   )
   public static final byte method183(char arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         ++field392;
         if (arg1) {
            return 111;
         } else {
            byte var3;
            if (~arg0 < -1 && arg0 < 128 || arg0 >= 160 && arg0 <= 255) {
               var3 = (byte)arg0;
               if (!var2) {
                  return var3;
               }
            }

            if (arg0 == 8364) {
               var3 = -128;
               if (!var2) {
                  return var3;
               }
            }

            if (arg0 != 8218) {
               if (~arg0 != -403) {
                  if (~arg0 == -8223) {
                     var3 = -124;
                     if (!var2) {
                        return var3;
                     }
                  }

                  if (arg0 != 8230) {
                     if (arg0 == 8224) {
                        var3 = -122;
                        if (!var2) {
                           return var3;
                        }
                     }

                     if (arg0 == 8225) {
                        var3 = -121;
                        if (!var2) {
                           return var3;
                        }
                     }

                     if (~arg0 != -711) {
                        if (arg0 == 8240) {
                           var3 = -119;
                           if (!var2) {
                              return var3;
                           }
                        }

                        if (~arg0 != -353) {
                           if (~arg0 != -8250) {
                              if (~arg0 == -339) {
                                 var3 = -116;
                                 if (!var2) {
                                    return var3;
                                 }
                              }

                              if (~arg0 != -382) {
                                 if (~arg0 == -8217) {
                                    var3 = -111;
                                    if (!var2) {
                                       return var3;
                                    }
                                 }

                                 if (~arg0 != -8218) {
                                    if (~arg0 != -8221) {
                                       if (arg0 != 8221) {
                                          if (~arg0 != -8227) {
                                             if (~arg0 != -8212) {
                                                if (~arg0 == -8213) {
                                                   var3 = -105;
                                                   if (!var2) {
                                                      return var3;
                                                   }
                                                }

                                                if (~arg0 == -733) {
                                                   var3 = -104;
                                                   if (!var2) {
                                                      return var3;
                                                   }
                                                }

                                                if (~arg0 != -8483) {
                                                   if (~arg0 != -354) {
                                                      if (~arg0 == -8251) {
                                                         var3 = -101;
                                                         if (!var2) {
                                                            return var3;
                                                         }
                                                      }

                                                      if (~arg0 != -340) {
                                                         if (arg0 == 382) {
                                                            var3 = -98;
                                                            if (!var2) {
                                                               return var3;
                                                            }
                                                         }

                                                         if (arg0 == 376) {
                                                            var3 = -97;
                                                            if (!var2) {
                                                               return var3;
                                                            }
                                                         }

                                                         var3 = 63;
                                                         if (!var2) {
                                                            return var3;
                                                         }
                                                      }

                                                      var3 = -100;
                                                      if (!var2) {
                                                         return var3;
                                                      }
                                                   }

                                                   var3 = -102;
                                                   if (!var2) {
                                                      return var3;
                                                   }
                                                }

                                                var3 = -103;
                                                if (!var2) {
                                                   return var3;
                                                }
                                             }

                                             var3 = -106;
                                             if (!var2) {
                                                return var3;
                                             }
                                          }

                                          var3 = -107;
                                          if (!var2) {
                                             return var3;
                                          }
                                       }

                                       var3 = -108;
                                       if (!var2) {
                                          return var3;
                                       }
                                    }

                                    var3 = -109;
                                    if (!var2) {
                                       return var3;
                                    }
                                 }

                                 var3 = -110;
                                 if (!var2) {
                                    return var3;
                                 }
                              }

                              var3 = -114;
                              if (!var2) {
                                 return var3;
                              }
                           }

                           var3 = -117;
                           if (!var2) {
                              return var3;
                           }
                        }

                        var3 = -118;
                        if (!var2) {
                           return var3;
                        }
                     }

                     var3 = -120;
                     if (!var2) {
                        return var3;
                     }
                  }

                  var3 = -123;
                  if (!var2) {
                     return var3;
                  }
               }

               var3 = -125;
               if (!var2) {
                  return var3;
               }
            }

            var3 = -126;
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field403[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method184(int arg0) {
      try {
         class314.method2436(false);
         ++field395;
         class448.field6548 = null;
         class419.field6121 = null;
         class191.field2892 = null;
         class749.field10810 = null;
         class625.field9095 = null;
         if (arg0 != 82) {
            method183('|', false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field403[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(Ljfa;I)V"
   )
   private static final void method185(class303 arg0, int arg1) {
      try {
         ++field394;
         if (class85.field1410) {
            if (arg0.field4224 != null) {
               class303 var2 = class345.method2670(class752.field10823, (byte)98, class780.field11429);
               if (var2 != null) {
                  class227 var3 = new class227();
                  var3.field3357 = var2;
                  var3.field3352 = arg0.field4224;
                  var3.field3360 = arg0;
                  class161.method1463(var3);
               }
            }

            ++class687.field10099;
            if (arg1 == 8240) {
               class542 var4 = class549.method4093((byte)-113, class61.field1153, class126.field2108);
               var4.field7859.method3540(arg0.field4263, arg1 ^ 898084128);
               var4.field7859.method3541(-23112, class752.field10823);
               var4.field7859.method3541(arg1 + -31352, arg0.field4265);
               var4.field7859.method3581(class780.field11429, (byte)41);
               var4.field7859.method3554(arg0.field4346, 255);
               var4.field7859.method3555(class513.field7486, (byte)-92);
               class740.method5332(var4, (byte)77);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field403[9] + (arg0 != null ? field403[6] : field403[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "<init>",
      descriptor = "(IIIIIZ)V"
   )
   public class26(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field399 = arg2;
         this.field397 = arg4;
         this.field393 = arg3;
         this.field390 = arg0;
         this.field400 = arg5;
         this.field396 = arg1;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field403[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method186(int arg0) {
      try {
         if (arg0 == 8230) {
            field398 = null;
            field402 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field403[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method187(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method188(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
