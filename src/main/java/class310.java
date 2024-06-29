import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class310 {
   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4113 = new String[]{method2329(method2328("\u001e1+\"3")), method2329(method2328("Osd")), method2329(method2328("/1w\biPc")), method2329(method2328("$6i\u000b")), method2329(method2328("\u0011m+If")), method2329(method2328("\u00046i\u000b")), method2329(method2328("V j\u000b&\f%c\u0001}\f}")), method2329(method2328("\u001e1+!3")), method2329(method2328("\u001e1+&3")), method2329(method2328("\u001e1+#3")), method2329(method2328("\u001e1+%3"))};
   @OriginalMember(
      owner = "client!tr",
      name = "e",
      descriptor = "I"
   )
   public static int field4111 = -1;
   @OriginalMember(
      owner = "client!tr",
      name = "b",
      descriptor = "I"
   )
   public static int field4106;
   @OriginalMember(
      owner = "client!tr",
      name = "d",
      descriptor = "I"
   )
   public static int field4107;
   @OriginalMember(
      owner = "client!tr",
      name = "f",
      descriptor = "I"
   )
   public static int field4109;
   @OriginalMember(
      owner = "client!tr",
      name = "g",
      descriptor = "I"
   )
   public static int field4110;
   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "I"
   )
   public static int field4112;
   @OriginalMember(
      owner = "client!tr",
      name = "c",
      descriptor = "Lqh;"
   )
   public static class74 field4108;

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2322(byte arg0) {
      try {
         class604.field8418 = class605.field8473;
         class619.field8658 = 1;
         class766.field11046 = -1;
         ++field4109;
         String var1 = null;
         if (class280.field3748 != null) {
            class594 var2 = new class594(class280.field3748);
            var1 = class263.method2023(-121, var2.method4304((byte)120));
            class436.field6059 = var2.method4304((byte)-115);
         }

         if (var1 == null) {
            class365.method2827(35, true);
         } else {
            class396.method3008(false, var1, (byte)-86, true, "");
            if (arg0 < 59) {
               method2326(35, 9, 79, 49, (class65)null, (class774)null);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4113[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(IIILui;)V"
   )
   public static final void method2323(int arg0, int arg1, int arg2, class241 arg3) {
      boolean var4 = client.field4273;

      try {
         ++field4106;
         if (arg3 != null && class280.field3738.field7319 != arg3) {
            int var5 = arg3.field3002;
            int var6 = arg3.field2992;
            int var7 = arg3.field2993;
            int var8 = (int)arg3.field3010;
            long var9 = arg3.field3010;
            if (var7 >= 2000) {
               var7 -= 2000;
            }

            if (~var7 == -10) {
               class404 var11 = class136.field1773[var8];
               if (var11 != null) {
                  class430.field6007 = 2;
                  ++class686.field10069;
                  class233.field2887 = arg0;
                  class172.field2152 = 0;
                  class463.field6353 = arg1;
                  class471 var12 = class133.method1118(class605.field8474.field2787, 2, class35.field396);
                  var12.field6527.method4314(-100, var8);
                  var12.field6527.method4298(class42.field495.method3876(-38, 82) ? 1 : 0, 128);
                  class605.field8474.method1702((byte)-97, var12);
                  class280.method2134(true, var11.field7853[0], 0, var11.method3060((byte)38), -102, var11.method3060((byte)38), 0, var11.field7855[0], -2);
               }
            }

            if (~var7 == -12) {
               class404 var13 = class136.field1773[var8];
               if (var13 != null) {
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class430.field6007 = 2;
                  ++class593.field8191;
                  class463.field6353 = arg1;
                  class471 var14 = class133.method1118(class605.field8474.field2787, 2, class254.field3233);
                  var14.field6527.method4324(class42.field495.method3876(122, 82) ? 1 : 0, 32203);
                  var14.field6527.method4274(arg2 + -1165420230, var8);
                  class605.field8474.method1702((byte)-54, var14);
                  class280.method2134(true, var13.field7853[0], 0, var13.method3060((byte)38), -91, var13.method3060((byte)38), 0, var13.field7855[0], -2);
               }
            }

            if (var7 == 1007) {
               class463.field6353 = arg1;
               class430.field6007 = 2;
               class172.field2152 = 0;
               ++class529.field7257;
               class233.field2887 = arg0;
               class471 var15 = class133.method1118(class605.field8474.field2787, 2, class469.field6490);
               var15.field6527.method4284(var8, -31429);
               class605.field8474.method1702((byte)-109, var15);
            }

            if (~var7 == -4) {
               class404 var16 = class136.field1773[var8];
               if (var16 != null) {
                  class172.field2152 = 0;
                  ++class336.field4816;
                  class233.field2887 = arg0;
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  class471 var17 = class133.method1118(class605.field8474.field2787, arg2 ^ -4, class22.field286);
                  var17.field6527.method4301(!class42.field495.method3876(-80, 82) ? 0 : 1, (byte)-43);
                  var17.field6527.method4274(-1165420232, var8);
                  class605.field8474.method1702((byte)-108, var17);
                  class280.method2134(true, var16.field7853[0], 0, var16.method3060((byte)38), -110, var16.method3060((byte)38), 0, var16.field7855[0], -2);
               }
            }

            if (var7 == 20) {
               class172.field2152 = 0;
               class463.field6353 = arg1;
               ++class739.field10767;
               class233.field2887 = arg0;
               class430.field6007 = 2;
               class471 var18 = class133.method1118(class605.field8474.field2787, 2, class684.field10043);
               var18.field6527.method4308(true, class226.field2837);
               var18.field6527.method4308(true, class752.field10921 + var5);
               var18.field6527.method4308(true, class110.field1389);
               var18.field6527.method4278(arg2 ^ 27, class593.field8208);
               var18.field6527.method4314(-124, Integer.MAX_VALUE & (int)(var9 >>> 32));
               var18.field6527.method4298(!class42.field495.method3876(125, 82) ? 0 : 1, 128);
               var18.field6527.method4308(true, class17.field237 + var6);
               class605.field8474.method1702((byte)-58, var18);
               class275.method2092(var5, (byte)97, var6, var9);
            }

            if (~var7 == -61) {
               class172.field2152 = 0;
               class233.field2887 = arg0;
               class463.field6353 = arg1;
               ++class422.field5914;
               class430.field6007 = 2;
               class471 var19 = class133.method1118(class605.field8474.field2787, 2, class169.field2130);
               var19.field6527.method4298(!class42.field495.method3876(36, 82) ? 0 : 1, 128);
               var19.field6527.method4308(true, class226.field2837);
               var19.field6527.method4337(class593.field8208, 1184007664);
               var19.field6527.method4314(-94, class278.field3709.field7843);
               var19.field6527.method4284(class110.field1389, -31429);
               class605.field8474.method1702((byte)-82, var19);
            }

            if (var7 == 50 && class392.field5480 == null) {
               class132.method1113(243040912, var6, var5);
               class392.field5480 = class728.method5295(var6, var5, arg2 ^ 1);
               class383.method2943(false, class392.field5480);
            }

            if (~var7 == -7) {
               class657 var20 = class728.method5295(var6, var5, arg2 ^ 1);
               if (var20 != null) {
                  class239.method1790(83);
                  class418 var21 = client.method2396(var20);
                  class341.method2700(var21.method3160(-26038), var20, (byte)-59, var21.field5871);
                  class460.field6309 = class237.method1780(38, var20);
                  if (class460.field6309 == null) {
                     class460.field6309 = field4113[3];
                  }

                  class88.field1123 = var20.field9328 + field4113[6];
               }

            } else {
               if (var7 == 13) {
                  class657 var22 = class728.method5295(var6, var5, arg2 + 1);
                  if (var22 != null) {
                     class561.method4040(arg2 + 86, var22);
                  }
               }

               if (~var7 == -1013 || ~var7 == -1011 || ~var7 == -1005 || ~var7 == -1010 || ~var7 == -1002) {
                  class490.method3561(false, var5, var7, var8);
               }

               if (~var7 == -59) {
                  ++class203.field2496;
                  class172.field2152 = 0;
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  class233.field2887 = arg0;
                  class471 var23 = class133.method1118(class605.field8474.field2787, 2, class469.field6497);
                  var23.field6527.method4308(true, class752.field10921 + var5);
                  var23.field6527.method4308(true, var8);
                  var23.field6527.method4301(!class42.field495.method3876(126, 82) ? 0 : 1, (byte)-43);
                  var23.field6527.method4308(true, class17.field237 + var6);
                  class605.field8474.method1702((byte)-81, var23);
                  class597.method4358(var5, 27218, var6);
               }

               if (var7 == 12) {
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  ++class574.field7899;
                  class233.field2887 = arg0;
                  class172.field2152 = 0;
                  class471 var24 = class133.method1118(class605.field8474.field2787, 2, class273.field3649);
                  var24.field6527.method4284(var6 - -class17.field237, arg2 ^ 31429);
                  var24.field6527.method4308(true, class752.field10921 + var5);
                  var24.field6527.method4274(arg2 ^ 1165420230, Integer.MAX_VALUE & (int)(var9 >>> 32));
                  var24.field6527.method4324(class42.field495.method3876(127, 82) ? 1 : 0, 32203);
                  class605.field8474.method1702((byte)-119, var24);
                  class275.method2092(var5, (byte)-38, var6, var9);
               }

               if (~var7 == -5) {
                  class243 var25 = (class243)class335.field4808.method1839(-119, (long)var8);
                  if (var25 != null) {
                     class233.field2887 = arg0;
                     class463.field6353 = arg1;
                     class172.field2152 = 0;
                     class430.field6007 = 2;
                     ++class186.field2289;
                     class680 var26 = var25.field3043;
                     class471 var27 = class133.method1118(class605.field8474.field2787, arg2 + 4, class306.field4061);
                     var27.field6527.method4324(class42.field495.method3876(-35, 82) ? 1 : 0, 32203);
                     var27.field6527.method4274(-1165420232, var8);
                     class605.field8474.method1702((byte)-111, var27);
                     class280.method2134(true, var26.field7853[0], 0, var26.method3060((byte)38), arg2 + -107, var26.method3060((byte)38), 0, var26.field7855[0], -2);
                  }
               }

               if (~var7 == -54) {
                  class404 var28 = class136.field1773[var8];
                  if (var28 != null) {
                     ++class591.field8162;
                     class463.field6353 = arg1;
                     class430.field6007 = 2;
                     class233.field2887 = arg0;
                     class172.field2152 = 0;
                     class471 var29 = class133.method1118(class605.field8474.field2787, 2, class437.field6064);
                     var29.field6527.method4324(!class42.field495.method3876(-43, 82) ? 0 : 1, arg2 + 32205);
                     var29.field6527.method4274(-1165420232, var8);
                     class605.field8474.method1702((byte)-125, var29);
                     class280.method2134(true, var28.field7853[0], 0, var28.method3060((byte)38), -79, var28.method3060((byte)38), 0, var28.field7855[0], -2);
                  }
               }

               if (~var7 == -16) {
                  class430.field6007 = 2;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class463.field6353 = arg1;
                  ++class101.field1305;
                  class471 var30 = class133.method1118(class605.field8474.field2787, 2, class237.field2939);
                  var30.field6527.method4274(-1165420232, class17.field237 + var6);
                  var30.field6527.method4274(-1165420232, Integer.MAX_VALUE & (int)(var9 >>> 32));
                  var30.field6527.method4314(-20, class752.field10921 + var5);
                  var30.field6527.method4318(class42.field495.method3876(-101, 82) ? 1 : 0, 0);
                  class605.field8474.method1702((byte)-71, var30);
                  class275.method2092(var5, (byte)85, var6, var9);
               }

               if (~var7 == -46) {
                  class243 var31 = (class243)class335.field4808.method1839(-127, (long)var8);
                  if (var31 != null) {
                     class680 var32 = var31.field3043;
                     class430.field6007 = 2;
                     class172.field2152 = 0;
                     class463.field6353 = arg1;
                     class233.field2887 = arg0;
                     ++class208.field2564;
                     class471 var33 = class133.method1118(class605.field8474.field2787, 2, class269.field3478);
                     var33.field6527.method4274(-1165420232, var8);
                     var33.field6527.method4318(class42.field495.method3876(-58, 82) ? 1 : 0, 0);
                     class605.field8474.method1702((byte)-119, var33);
                     class280.method2134(true, var32.field7853[0], 0, var32.method3060((byte)38), 109, var32.method3060((byte)38), 0, var32.field7855[0], -2);
                  }
               }

               if (var7 == 22) {
                  class404 var34 = class136.field1773[var8];
                  if (var34 != null) {
                     class463.field6353 = arg1;
                     ++class325.field4359;
                     class233.field2887 = arg0;
                     class430.field6007 = 2;
                     class172.field2152 = 0;
                     class471 var35 = class133.method1118(class605.field8474.field2787, 2, class2.field11);
                     var35.field6527.method4284(var8, arg2 ^ 31429);
                     var35.field6527.method4318(class42.field495.method3876(arg2 ^ -124, 82) ? 1 : 0, 0);
                     class605.field8474.method1702((byte)-69, var35);
                     class280.method2134(true, var34.field7853[0], 0, var34.method3060((byte)38), arg2 ^ 122, var34.method3060((byte)38), 0, var34.field7855[0], -2);
                  }
               }

               if (~var7 == -24) {
                  label429: {
                     if (class179.field2223 > 0 && class42.field495.method3876(arg2 + 129, 82) && class42.field495.method3876(arg2 ^ -126, 81)) {
                        class383.method2942((byte)-112, class17.field237 + var6, class278.field3709.field1001, class752.field10921 + var5);
                        if (!var4) {
                           break label429;
                        }
                     }

                     class430.field6007 = 1;
                     class463.field6353 = arg1;
                     class172.field2152 = 0;
                     class233.field2887 = arg0;
                     ++class556.field7636;
                     class471 var36 = class133.method1118(class605.field8474.field2787, 2, class570.field7860);
                     var36.field6527.method4274(arg2 ^ 1165420230, class752.field10921 - -var5);
                     var36.field6527.method4274(-1165420232, class17.field237 + var6);
                     class605.field8474.method1702((byte)-65, var36);
                  }
               }

               if (var7 == 8) {
                  class404 var37 = class136.field1773[var8];
                  if (var37 != null) {
                     class463.field6353 = arg1;
                     class172.field2152 = 0;
                     ++class675.field9911;
                     class233.field2887 = arg0;
                     class430.field6007 = 2;
                     class471 var38 = class133.method1118(class605.field8474.field2787, 2, class534.field7299);
                     var38.field6527.method4324(!class42.field495.method3876(123, 82) ? 0 : 1, 32203);
                     var38.field6527.method4308(true, var8);
                     class605.field8474.method1702((byte)-95, var38);
                     class280.method2134(true, var37.field7853[0], 0, var37.method3060((byte)38), -80, var37.method3060((byte)38), 0, var37.field7855[0], -2);
                  }
               }

               if (var7 == 18) {
                  ++class53.field581;
                  class463.field6353 = arg1;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class430.field6007 = 2;
                  class471 var39 = class133.method1118(class605.field8474.field2787, 2, class743.field10820);
                  var39.field6527.method4308(true, var8);
                  var39.field6527.method4284(var6 - -class17.field237, -31429);
                  var39.field6527.method4298(class42.field495.method3876(arg2 ^ -126, 82) ? 1 : 0, 128);
                  var39.field6527.method4274(-1165420232, class752.field10921 + var5);
                  class605.field8474.method1702((byte)-83, var39);
                  class597.method4358(var5, 27218, var6);
               }

               if (~var7 == -22) {
                  ++class315.field4200;
                  class233.field2887 = arg0;
                  class172.field2152 = 0;
                  class430.field6007 = 1;
                  class463.field6353 = arg1;
                  class471 var40 = class133.method1118(class605.field8474.field2787, arg2 + 4, class657.field9384);
                  var40.field6527.method4317(class593.field8208, -101);
                  var40.field6527.method4314(arg2 + -15, class226.field2837);
                  var40.field6527.method4314(-26, class110.field1389);
                  var40.field6527.method4274(arg2 ^ 1165420230, class752.field10921 + var5);
                  var40.field6527.method4284(class17.field237 - -var6, -31429);
                  class605.field8474.method1702((byte)-51, var40);
                  class280.method2134(true, var5, 0, 1, -111, 1, 0, var6, -4);
               }

               if (arg2 != -2) {
                  field4111 = -55;
               }

               if (~var7 == -20) {
                  class243 var41 = (class243)class335.field4808.method1839(arg2 + 119, (long)var8);
                  if (var41 != null) {
                     ++class290.field3838;
                     class172.field2152 = 0;
                     class680 var42 = var41.field3043;
                     class233.field2887 = arg0;
                     class430.field6007 = 2;
                     class463.field6353 = arg1;
                     class471 var43 = class133.method1118(class605.field8474.field2787, 2, class660.field9410);
                     var43.field6527.method4298(!class42.field495.method3876(124, 82) ? 0 : 1, arg2 ^ -130);
                     var43.field6527.method4314(-114, var8);
                     class605.field8474.method1702((byte)-127, var43);
                     class280.method2134(true, var42.field7853[0], 0, var42.method3060((byte)38), -80, var42.method3060((byte)38), 0, var42.field7855[0], -2);
                  }
               }

               if (var7 == 16) {
                  class243 var44 = (class243)class335.field4808.method1839(85, (long)var8);
                  if (var44 != null) {
                     class430.field6007 = 2;
                     class463.field6353 = arg1;
                     class233.field2887 = arg0;
                     ++class232.field2881;
                     class172.field2152 = 0;
                     class680 var45 = var44.field3043;
                     class471 var46 = class133.method1118(class605.field8474.field2787, 2, class657.field9269);
                     var46.field6527.method4318(class42.field495.method3876(124, 82) ? 1 : 0, 0);
                     var46.field6527.method4314(-91, var8);
                     class605.field8474.method1702((byte)-63, var46);
                     class280.method2134(true, var45.field7853[0], 0, var45.method3060((byte)38), arg2 ^ 64, var45.method3060((byte)38), 0, var45.field7855[0], -2);
                  }
               }

               if (var7 == 44) {
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  ++class478.field6606;
                  class471 var47 = class133.method1118(class605.field8474.field2787, 2, class360.field5123);
                  var47.field6527.method4274(-1165420232, var8);
                  var47.field6527.method4284(class752.field10921 + var5, -31429);
                  var47.field6527.method4274(-1165420232, class17.field237 + var6);
                  var47.field6527.method4301(!class42.field495.method3876(121, 82) ? 0 : 1, (byte)-43);
                  class605.field8474.method1702((byte)-73, var47);
                  class597.method4358(var5, 27218, var6);
               }

               if (var7 == 25) {
                  class243 var48 = (class243)class335.field4808.method1839(arg2 + -117, (long)var8);
                  if (var48 != null) {
                     class680 var49 = var48.field3043;
                     class172.field2152 = 0;
                     class463.field6353 = arg1;
                     class430.field6007 = 2;
                     ++class171.field2147;
                     class233.field2887 = arg0;
                     class471 var50 = class133.method1118(class605.field8474.field2787, arg2 + 4, class591.field8179);
                     var50.field6527.method4318(class42.field495.method3876(121, 82) ? 1 : 0, 0);
                     var50.field6527.method4308(true, var8);
                     class605.field8474.method1702((byte)-48, var50);
                     class280.method2134(true, var49.field7853[0], 0, var49.method3060((byte)38), 122, var49.method3060((byte)38), 0, var49.field7855[0], -2);
                  }
               }

               if (var7 == 46) {
                  class404 var51 = class136.field1773[var8];
                  if (var51 != null) {
                     class172.field2152 = 0;
                     class430.field6007 = 2;
                     class463.field6353 = arg1;
                     class233.field2887 = arg0;
                     ++class256.field3274;
                     class471 var52 = class133.method1118(class605.field8474.field2787, 2, class715.field10455);
                     var52.field6527.method4314(arg2 + -25, var8);
                     var52.field6527.method4324(class42.field495.method3876(-39, 82) ? 1 : 0, 32203);
                     class605.field8474.method1702((byte)-58, var52);
                     class280.method2134(true, var51.field7853[0], 0, var51.method3060((byte)38), -106, var51.method3060((byte)38), 0, var51.field7855[0], -2);
                  }
               }

               if (~var7 == -53) {
                  class430.field6007 = 2;
                  class233.field2887 = arg0;
                  ++class354.field5056;
                  class463.field6353 = arg1;
                  class172.field2152 = 0;
                  class471 var53 = class133.method1118(class605.field8474.field2787, 2, class626.field8751);
                  var53.field6527.method4284(class752.field10921 + var5, -31429);
                  var53.field6527.method4324(!class42.field495.method3876(-8, 82) ? 0 : 1, arg2 + 32205);
                  var53.field6527.method4314(arg2 + -68, class17.field237 + var6);
                  var53.field6527.method4284((int)(var9 >>> 32) & Integer.MAX_VALUE, -31429);
                  class605.field8474.method1702((byte)-123, var53);
                  class275.method2092(var5, (byte)-90, var6, var9);
               }

               if (var7 == 10) {
                  label471: {
                     if (class179.field2223 > 0 && class42.field495.method3876(125, 82) && class42.field495.method3876(127, 81)) {
                        class383.method2942((byte)-75, class17.field237 + var6, class278.field3709.field1001, class752.field10921 + var5);
                        if (!var4) {
                           break label471;
                        }
                     }

                     class471 var54;
                     label399: {
                        var54 = class542.method3913(var5, var6, -1, var8);
                        if (~var8 != -2) {
                           class172.field2152 = 0;
                           class430.field6007 = 1;
                           class233.field2887 = arg0;
                           class463.field6353 = arg1;
                           if (!var4) {
                              break label399;
                           }
                        }

                        var54.field6527.method4318(-1, 0);
                        var54.field6527.method4318(-1, 0);
                        var54.field6527.method4284((int)class363.field5142, arg2 + -31427);
                        var54.field6527.method4318(57, 0);
                        var54.field6527.method4318(class661.field9423, 0);
                        var54.field6527.method4318(class356.field5080, 0);
                        var54.field6527.method4318(89, 0);
                        var54.field6527.method4284(class278.field3709.field999, -31429);
                        var54.field6527.method4284(class278.field3709.field1003, -31429);
                        var54.field6527.method4318(63, 0);
                     }

                     class605.field8474.method1702((byte)-70, var54);
                     class280.method2134(true, var5, 0, 1, arg2 + -101, 1, 0, var6, -4);
                  }
               }

               if (var7 == 48) {
                  ++class276.field3686;
                  class463.field6353 = arg1;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class430.field6007 = 2;
                  class471 var55 = class133.method1118(class605.field8474.field2787, 2, class554.field7625);
                  var55.field6527.method4314(-63, var8);
                  var55.field6527.method4301(class42.field495.method3876(arg2 ^ 69, 82) ? 1 : 0, (byte)-43);
                  var55.field6527.method4308(true, class752.field10921 + var5);
                  var55.field6527.method4284(class17.field237 + var6, -31429);
                  class605.field8474.method1702((byte)-75, var55);
                  class597.method4358(var5, arg2 + 27220, var6);
               }

               if (~var7 == -48) {
                  class463.field6353 = arg1;
                  ++class711.field10434;
                  class233.field2887 = arg0;
                  class430.field6007 = 2;
                  class172.field2152 = 0;
                  class471 var56 = class133.method1118(class605.field8474.field2787, arg2 + 4, class574.field7900);
                  var56.field6527.method4337(class593.field8208, 1184007664);
                  var56.field6527.method4308(true, class110.field1389);
                  var56.field6527.method4274(-1165420232, var8);
                  var56.field6527.method4284(class226.field2837, -31429);
                  var56.field6527.method4318(class42.field495.method3876(-29, 82) ? 1 : 0, 0);
                  var56.field6527.method4308(true, class752.field10921 + var5);
                  var56.field6527.method4284(class17.field237 + var6, -31429);
                  class605.field8474.method1702((byte)-45, var56);
                  class597.method4358(var5, 27218, var6);
               }

               if (~var7 == -58) {
                  ++class88.field1125;
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  class233.field2887 = arg0;
                  class172.field2152 = 0;
                  class471 var57 = class133.method1118(class605.field8474.field2787, 2, class114.field1415);
                  var57.field6527.method4284(class752.field10921 + var5, arg2 ^ 31429);
                  var57.field6527.method4314(-109, class17.field237 + var6);
                  var57.field6527.method4308(true, var8);
                  var57.field6527.method4298(!class42.field495.method3876(126, 82) ? 0 : 1, 128);
                  class605.field8474.method1702((byte)-110, var57);
                  class597.method4358(var5, 27218, var6);
               }

               if (~var7 == -1007) {
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  ++class187.field2294;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class471 var58 = class133.method1118(class605.field8474.field2787, 2, class439.field6097);
                  var58.field6527.method4284(var8, -31429);
                  class605.field8474.method1702((byte)-85, var58);
               }

               if (var7 == 1008) {
                  ++class211.field2630;
                  class463.field6353 = arg1;
                  class430.field6007 = 2;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class471 var59 = class133.method1118(class605.field8474.field2787, 2, class397.field5578);
                  var59.field6527.method4298(class42.field495.method3876(123, 82) ? 1 : 0, 128);
                  var59.field6527.method4308(true, (int)(var9 >>> 32) & Integer.MAX_VALUE);
                  var59.field6527.method4314(-110, class17.field237 + var6);
                  var59.field6527.method4284(class752.field10921 + var5, -31429);
                  class605.field8474.method1702((byte)-111, var59);
                  class275.method2092(var5, (byte)-46, var6, var9);
               }

               if (~var7 == -18) {
                  class463.field6353 = arg1;
                  class172.field2152 = 0;
                  class233.field2887 = arg0;
                  class430.field6007 = 2;
                  ++class374.field5268;
                  class471 var60 = class133.method1118(class605.field8474.field2787, 2, class198.field2397);
                  var60.field6527.method4301(class42.field495.method3876(125, 82) ? 1 : 0, (byte)-43);
                  var60.field6527.method4308(true, var5 - -class752.field10921);
                  var60.field6527.method4308(true, class17.field237 + var6);
                  var60.field6527.method4284(Integer.MAX_VALUE & (int)(var9 >>> 32), -31429);
                  class605.field8474.method1702((byte)-51, var60);
                  class275.method2092(var5, (byte)115, var6, var9);
               }

               if (var7 == 30) {
                  class404 var61 = class136.field1773[var8];
                  if (var61 != null) {
                     class463.field6353 = arg1;
                     ++class422.field5914;
                     class430.field6007 = 2;
                     class233.field2887 = arg0;
                     class172.field2152 = 0;
                     class471 var62 = class133.method1118(class605.field8474.field2787, 2, class169.field2130);
                     var62.field6527.method4298(class42.field495.method3876(127, 82) ? 1 : 0, 128);
                     var62.field6527.method4308(true, class226.field2837);
                     var62.field6527.method4337(class593.field8208, 1184007664);
                     var62.field6527.method4314(-115, var8);
                     var62.field6527.method4284(class110.field1389, -31429);
                     class605.field8474.method1702((byte)-119, var62);
                     class280.method2134(true, var61.field7853[0], 0, var61.method3060((byte)38), -79, var61.method3060((byte)38), 0, var61.field7855[0], -2);
                  }
               }

               if (var7 == 2 || ~var7 == -1012) {
                  class297.method2236(arg3.field3011, var5, var8, var6, (byte)64);
               }

               if (~var7 == -6) {
                  class404 var63 = class136.field1773[var8];
                  if (var63 != null) {
                     ++class686.field10069;
                     class233.field2887 = arg0;
                     class430.field6007 = 2;
                     class172.field2152 = 0;
                     class463.field6353 = arg1;
                     class471 var64 = class133.method1118(class605.field8474.field2787, 2, class184.field2266);
                     var64.field6527.method4274(arg2 + -1165420230, var8);
                     var64.field6527.method4318(!class42.field495.method3876(arg2 ^ -123, 82) ? 0 : 1, arg2 ^ -2);
                     class605.field8474.method1702((byte)-99, var64);
                     class280.method2134(true, var63.field7853[0], 0, var63.method3060((byte)38), arg2 + -126, var63.method3060((byte)38), 0, var63.field7855[0], -2);
                  }
               }

               if (~var7 == -1003) {
                  class172.field2152 = 0;
                  class430.field6007 = 2;
                  class233.field2887 = arg0;
                  class463.field6353 = arg1;
                  class243 var65 = (class243)class335.field4808.method1839(-112, (long)var8);
                  if (var65 != null) {
                     class680 var66 = var65.field3043;
                     class392 var67 = var66.field9989;
                     if (var67.field5516 != null) {
                        var67 = var67.method2986(-47, class259.field3320);
                     }

                     if (var67 != null) {
                        ++class794.field11603;
                        class471 var68 = class133.method1118(class605.field8474.field2787, 2, class705.field10238);
                        var68.field6527.method4284(var67.field5535, -31429);
                        class605.field8474.method1702((byte)-56, var68);
                     }
                  }
               }

               if (var7 == 51) {
                  class243 var69 = (class243)class335.field4808.method1839(-116, (long)var8);
                  if (var69 != null) {
                     class172.field2152 = 0;
                     class463.field6353 = arg1;
                     class680 var70 = var69.field3043;
                     class430.field6007 = 2;
                     ++class41.field477;
                     class233.field2887 = arg0;
                     class471 var71 = class133.method1118(class605.field8474.field2787, 2, class438.field6068);
                     var71.field6527.method4308(true, var8);
                     var71.field6527.method4317(class593.field8208, arg2 ^ 104);
                     var71.field6527.method4284(class226.field2837, -31429);
                     var71.field6527.method4274(-1165420232, class110.field1389);
                     var71.field6527.method4298(!class42.field495.method3876(-74, 82) ? 0 : 1, arg2 ^ -130);
                     class605.field8474.method1702((byte)-83, var71);
                     class280.method2134(true, var70.field7853[0], 0, var70.method3060((byte)38), 63, var70.method3060((byte)38), 0, var70.field7855[0], -2);
                  }
               }

               if (var7 == 59) {
                  class404 var72 = class136.field1773[var8];
                  if (var72 != null) {
                     class463.field6353 = arg1;
                     ++class686.field10069;
                     class430.field6007 = 2;
                     class172.field2152 = 0;
                     class233.field2887 = arg0;
                     class471 var73 = class133.method1118(class605.field8474.field2787, 2, class64.field700);
                     var73.field6527.method4308(true, var8);
                     var73.field6527.method4298(class42.field495.method3876(arg2 + 28, 82) ? 1 : 0, 128);
                     class605.field8474.method1702((byte)-120, var73);
                     class280.method2134(true, var72.field7853[0], 0, var72.method3060((byte)38), -75, var72.method3060((byte)38), 0, var72.field7855[0], -2);
                  }
               }

               if (var7 == 49) {
                  class404 var74 = class136.field1773[var8];
                  if (var74 != null) {
                     ++class722.field10591;
                     class233.field2887 = arg0;
                     class172.field2152 = 0;
                     class430.field6007 = 2;
                     class463.field6353 = arg1;
                     class471 var75 = class133.method1118(class605.field8474.field2787, 2, class128.field1614);
                     var75.field6527.method4274(-1165420232, var8);
                     var75.field6527.method4298(!class42.field495.method3876(-65, 82) ? 0 : 1, 128);
                     class605.field8474.method1702((byte)-76, var75);
                     class280.method2134(true, var74.field7853[0], 0, var74.method3060((byte)38), arg2 ^ -95, var74.method3060((byte)38), 0, var74.field7855[0], -2);
                  }
               }

               if (class221.field2764) {
                  class239.method1790(arg2 ^ -20);
               }

               if (class416.field5848 != null && class391.field5459 == 0) {
                  class383.method2943(false, class416.field5848);
               }
            }
         }
      } catch (RuntimeException var77) {
         throw class534.method3846(var77, field4113[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4113[4] : field4113[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2324(int arg0) {
      try {
         if (arg0 == -1881416416) {
            field4108 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4113[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method2325(String arg0, int arg1) {
      System.out.println(field4113[2] + class250.method1882("\n", 78, field4113[1], arg0));
      if (arg1 == -21996) {
         ++field4110;
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(IIIILha;Lkn;)V"
   )
   public static final void method2326(int arg0, int arg1, int arg2, int arg3, class65 arg4, class774 arg5) {
      try {
         ++field4107;
         class146 var6 = class599.field8358.method2386(arg5.field11161, true);
         if (var6.field1924 != -1) {
            label46: {
               if (arg5.field11230) {
                  int var14 = arg5.field11170 + arg0;
                  arg0 = var14 & 3;
                  if (!client.field4273) {
                     break label46;
                  }
               }

               arg0 = 0;
            }

            class763 var7 = var6.method1234(arg3 ^ arg3, arg4, arg0, arg5.field11172);
            if (var7 != null) {
               int var8 = arg5.field11251;
               int var9 = arg5.field11168;
               if (~(1 & arg0) == -2) {
                  var8 = arg5.field11168;
                  var9 = arg5.field11251;
               }

               int var10 = var7.method2125();
               int var11 = var7.method2129();
               if (var6.field1930) {
                  var11 = var9 * 4;
                  var10 = var8 * 4;
               }

               if (var6.field1931 == 0) {
                  var7.method5477(arg1, -(var9 * 4) + 4 + arg2, var10, var11);
               } else {
                  var7.method5486(arg1, arg2 - var9 * 4 + 4, var10, var11, 0, var6.field1931 | -16777216, 1);
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field4113[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4113[4] : field4113[5]) + ',' + (arg5 != null ? field4113[4] : field4113[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method2327(int arg0, boolean arg1) {
      try {
         ++field4112;
         return arg1 ? -85 : arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4113[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2328(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2329(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
