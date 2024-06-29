import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class449 extends class575 {
   @OriginalMember(
      owner = "client!iha",
      name = "r",
      descriptor = "Z"
   )
   private boolean field6547 = false;
   @OriginalMember(
      owner = "client!iha",
      name = "F",
      descriptor = "[F"
   )
   private float[] field6555 = new float[4];
   @OriginalMember(
      owner = "client!iha",
      name = "C",
      descriptor = "Z"
   )
   private boolean field6565;
   @OriginalMember(
      owner = "client!iha",
      name = "D",
      descriptor = "Lwd;"
   )
   private class79 field6557;
   @OriginalMember(
      owner = "client!iha",
      name = "u",
      descriptor = "Lwd;"
   )
   private class79 field6549;
   @OriginalMember(
      owner = "client!iha",
      name = "q",
      descriptor = "Lwd;"
   )
   private class79 field6561;
   @OriginalMember(
      owner = "client!iha",
      name = "v",
      descriptor = "Lwd;"
   )
   private class79 field6554;
   @OriginalMember(
      owner = "client!iha",
      name = "A",
      descriptor = "Lpga;"
   )
   private class371 field6551;
   @OriginalMember(
      owner = "client!iha",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6568 = new String[]{method3485(method3484("^r\u007f\u0017\f\u001f")), method3485(method3484("^r\u007f\u0017\u000f\u001f")), method3485(method3484("L40\u00176")), method3485(method3484("^r\u007f\u0017\u001f\u001f")), method3485(method3484("YorU")), method3485(method3484("BmA^9Xop]\u0014BtrP?")), method3485(method3484("Pv")), method3485(method3484("BmA^9Xop]\u0014[sj")), method3485(method3484("BmAT$S\u007frf'^n")), method3485(method3484("^r\u007f\u0017w^twMu\u001f")), method3485(method3484("BmAT$S\u007frf>YvwM")), method3485(method3484("^r\u007f\u0017\b\u001f")), method3485(method3484("^r\u007f\u0017\u000e\u001f")), method3485(method3484("^r\u007f\u0017\u001a\u001f")), method3485(method3484("^r\u007f\u0017\u0019\u001f")), method3485(method3484("^r\u007f\u0017\u0018\u001f")), method3485(method3484("^r\u007f\u0017\u0007\u001f")), method3485(method3484("^r\u007f\u0017\t\u001f")), method3485(method3484("^r\u007f\u0017\r\u001f")), method3485(method3484("^r\u007f\u0017\n\u001f"))};
   @OriginalMember(
      owner = "client!iha",
      name = "m",
      descriptor = "Lpf;"
   )
   public static class424 field6558 = new class424();
   @OriginalMember(
      owner = "client!iha",
      name = "G",
      descriptor = "I"
   )
   public static int field6546;
   @OriginalMember(
      owner = "client!iha",
      name = "s",
      descriptor = "I"
   )
   public static int field6548;
   @OriginalMember(
      owner = "client!iha",
      name = "l",
      descriptor = "I"
   )
   public static int field6550;
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "I"
   )
   public static int field6553;
   @OriginalMember(
      owner = "client!iha",
      name = "t",
      descriptor = "I"
   )
   public static int field6556;
   @OriginalMember(
      owner = "client!iha",
      name = "o",
      descriptor = "I"
   )
   public static int field6560;
   @OriginalMember(
      owner = "client!iha",
      name = "y",
      descriptor = "I"
   )
   public static int field6562;
   @OriginalMember(
      owner = "client!iha",
      name = "w",
      descriptor = "I"
   )
   public static int field6563;
   @OriginalMember(
      owner = "client!iha",
      name = "p",
      descriptor = "I"
   )
   public static int field6564;
   @OriginalMember(
      owner = "client!iha",
      name = "n",
      descriptor = "I"
   )
   public static int field6566;
   @OriginalMember(
      owner = "client!iha",
      name = "B",
      descriptor = "I"
   )
   public static int field6567;
   @OriginalMember(
      owner = "client!iha",
      name = "x",
      descriptor = "Z"
   )
   private boolean field6552;
   @OriginalMember(
      owner = "client!iha",
      name = "E",
      descriptor = "Z"
   )
   private boolean field6559;

   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         ++field6560;
         if (arg0 != 15385) {
            field6558 = null;
         }

         return this.field6565;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6568[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         ++field6563;
         this.field6559 = arg0;
         super.field8129.method1953(127, 1);
         super.field8129.method1943(0, this.field6551);
         super.field8129.method1945((byte)-86, class74.field1189, class117.field1846);
         super.field8129.method2009(0, 0, class172.field2572);
         super.field8129.method1239(2, class339.field5001, 2, arg1, false);
         super.field8129.method1937(class77.field1238, 0, 0);
         super.field8129.method1953(105, 0);
         this.method3480(0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6568[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "<init>",
      descriptor = "(Lqs;Lsa;)V"
   )
   public class449(class771 arg0, class39 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field11159) {
            this.field6557 = class644.method4688(arg0, (byte)-105, 34336, arg1.method458(0, field6568[6], field6568[5]));
            this.field6549 = class644.method4688(arg0, (byte)120, 34336, arg1.method458(0, field6568[6], field6568[7]));
            this.field6561 = class644.method4688(arg0, (byte)126, 34336, arg1.method458(0, field6568[6], field6568[10]));
            this.field6554 = class644.method4688(arg0, (byte)43, 34336, arg1.method458(0, field6568[6], field6568[8]));
            if (!(this.field6561 != null & this.field6549 != null & this.field6557 != null & this.field6554 != null)) {
               this.field6565 = false;
            } else {
               this.field6551 = super.field8129.method2017(false, 2, 0, 1, new int[]{0, -1});
               this.field6551.method31(false, false, false);
               this.field6565 = true;
            }
         } else {
            this.field6565 = false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6568[9] + (arg0 != null ? field6568[2] : field6568[4]) + ',' + (arg1 != null ? field6568[2] : field6568[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         ++field6546;
         if (arg1 != 23) {
            this.method3480(-63);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6568[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(IILeq;IILkaa;Lbha;I)V"
   )
   public static final void method3479(int arg0, int arg1, class799 arg2, int arg3, int arg4, class158 arg5, class544 arg6, int arg7) {
      try {
         ++field6562;
         if (arg0 <= 9) {
            method3481(false);
         }

         class268 var8 = new class268();
         var8.field4108 = arg1 << 9;
         var8.field4111 = arg7 << 9;
         var8.field4098 = arg4;
         if (arg6 == null) {
            if (arg2 != null) {
               var8.field4110 = arg2;
               class302 var11 = arg2.field11618;
               if (var11.field4550 != null) {
                  var8.field4116 = true;
                  var11 = var11.method2501(class344.field5074, 79);
               }

               if (var11 != null) {
                  var8.field4099 = var11.field4529 + arg1 << 9;
                  var8.field4106 = var11.field4529 + arg7 << 9;
                  var8.field4094 = class507.method3817(0, arg2);
                  var8.field4114 = var11.field4516;
                  var8.field4105 = var11.field4500;
                  var8.field4089 = var11.field4535;
                  var8.field4109 = var11.field4564 << 9;
                  var8.field4101 = var11.field4498 << 9;
                  var8.field4088 = var11.field4511;
               }

               class583.field8187.method2238(var8, 13);
            } else if (arg5 != null) {
               var8.field4097 = arg5;
               var8.field4106 = arg5.method1507(-80) + arg7 << 9;
               var8.field4099 = arg1 + arg5.method1507(-35) << 9;
               var8.field4094 = class97.method969(-30885, arg5);
               var8.field4114 = 256;
               var8.field4088 = 256;
               var8.field4105 = arg5.field2436;
               var8.field4109 = arg5.field2409 << 9;
               var8.field4089 = arg5.field2420;
               var8.field4101 = 0;
               class639.field9022.method3098((long)arg5.field5826, var8, -1);
            }
         } else {
            var8.field4093 = arg6;
            int var9 = arg6.field7755;
            int var10 = arg6.field7687;
            if (~arg3 == -2 || arg3 == 3) {
               var9 = arg6.field7687;
               var10 = arg6.field7755;
            }

            var8.field4091 = arg6.field7667;
            var8.field4106 = arg7 + var9 << 9;
            var8.field4101 = arg6.field7751 << 9;
            var8.field4088 = arg6.field7678;
            var8.field4112 = arg6.field7749;
            var8.field4099 = arg1 - -var10 << 9;
            var8.field4104 = arg6.field7668;
            var8.field4109 = arg6.field7695 << 9;
            var8.field4114 = arg6.field7758;
            var8.field4089 = arg6.field7746;
            var8.field4100 = arg6.field7730;
            var8.field4105 = arg6.field7742;
            var8.field4094 = arg6.field7757;
            if (arg6.field7741 != null) {
               var8.field4116 = true;
               var8.method2288(256);
            }

            if (var8.field4104 != null) {
               var8.field4086 = (int)(Math.random() * (double)(-var8.field4091 + var8.field4100)) + var8.field4091;
            }

            class234.field3623.method2238(var8, 13);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6568[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6568[2] : field6568[4]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6568[2] : field6568[4]) + ',' + (arg6 != null ? field6568[2] : field6568[4]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         ++field6556;
         if (!arg1) {
            this.method87(true, true);
         }

         if (arg2 != null) {
            if (this.field6547) {
               super.field8129.method2009(0, 0, class339.field5001);
               super.field8129.method1937(class339.field5001, 0, 0);
               this.field6547 = false;
            }

            super.field8129.method1943(0, arg2);
            super.field8129.method1966(arg0, -5);
         } else if (!this.field6547) {
            super.field8129.method1943(0, super.field8129.field3409);
            super.field8129.method1966(1, -5);
            super.field8129.method2009(0, 0, class77.field1238);
            super.field8129.method1937(class77.field1238, 0, 0);
            this.field6547 = true;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6568[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6568[2] : field6568[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3480(int arg0) {
      try {
         ++field6548;
         if (arg0 == 0) {
            int var2;
            class522 var3;
            label35: {
               var2 = super.field8129.method1946(-1);
               var3 = super.field8129.method1983(111);
               if (!this.field6559) {
                  OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field6557.field1249 : this.field6561.field1249);
                  if (!client.field10022) {
                     break label35;
                  }
               }

               OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6554.field1249 : this.field6549.field1249);
            }

            OpenGL.glEnable(34336);
            this.field6552 = true;
            var3.method3897((float)var2, 1, 0.0F, -1.0F, 0.0F, this.field6555);
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6555[0], this.field6555[1], this.field6555[2], this.field6555[3]);
            this.method3467((byte)-84);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6568[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3467(byte arg0) {
      try {
         ++field6564;
         if (this.field6552) {
            int var2 = super.field8129.method212();
            int var3 = super.field8129.method141();
            float var4 = (float)var2 + -((float)(-var3 + var2) * 0.125F);
            float var5 = (float)var2 - (float)(-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field8129.method1978(20070), (float)super.field8129.method2007(true) / 255.0F);
            super.field8129.method1953(-27, 1);
            super.field8129.method1939(super.field8129.method2016(30963), (byte)-60);
            super.field8129.method1953(arg0 + -20, 0);
         }

         if (arg0 != -84) {
            method3481(true);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6568[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         ++field6553;
         super.field8129.method1953(-93, 1);
         super.field8129.method1943(0, (class683)null);
         super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
         if (arg0) {
            this.method88(-75, true, (class683)null);
         }

         super.field8129.method2009(0, 0, class339.field5001);
         super.field8129.method2009(0, 2, class172.field2572);
         super.field8129.method1937(class339.field5001, 0, 0);
         super.field8129.method1953(-4, 0);
         if (this.field6547) {
            super.field8129.method2009(0, 0, class339.field5001);
            super.field8129.method1937(class339.field5001, 0, 0);
            this.field6547 = false;
         }

         if (this.field6552) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6552 = false;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6568[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         ++field6566;
         if (arg2 <= 61) {
            method3481(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6568[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "(Z)V"
   )
   public static void method3481(boolean arg0) {
      try {
         field6558 = null;
         if (arg0) {
            method3482(47, 41, 51, 109);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6568[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(IIII)Lrb;"
   )
   public static final class381 method3482(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6567;
         class381 var4 = null;
         if (~arg1 == -1) {
            var4 = class801.method5775(class595.field8385, 0, class745.field10605.field3718);
            ++class759.field10836;
         }

         if (arg1 == 1) {
            var4 = class801.method5775(class14.field200, 0, class745.field10605.field3718);
            ++class645.field9077;
         }

         var4.field5570.method648(!class130.field2085.method4653(arg2, (byte)-106) ? 0 : 1, 110);
         var4.field5570.method675(-32331, arg0 - -class480.field6903);
         var4.field5570.method643(class115.field1824 + arg3, true);
         class7.field128 = false;
         class522.field7355 = arg0;
         class269.field4123 = arg3;
         class720.method5215((byte)-101);
         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6568[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method3483(class17 arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field6550;
         int var3 = 0;
         int var4 = 0;
         if (class563.field8012) {
            var3 = class425.method3319(0);
            var4 = class630.method4620((byte)85);
         }

         label104: {
            int var5 = -10660793;
            class454.method3497(class752.field10679 - -var3, 80, arg0, class685.field9890, class587.field8249, -16777216, var5, class133.field2180 + var4);
            class437.field6409.method1860(var3 + 3 + class752.field10679, false, class133.field2180 - (-var4 + -14), -1, var5, class765.field10927.method5512(-2, class777.field11340));
            int var6 = class387.field5645.method1549(-78) + var3;
            int var7 = class387.field5645.method1560((byte)-66) - -var4;
            if (!class392.field5703) {
               int var8 = 0;
               class272 var9 = (class272)class594.field8377.method2245((byte)-94);
               if (var2 || var9 != null) {
                  do {
                     int var10 = (-var8 + -1 + class687.field9909) * 16 + class133.field2180 - -var4 + 31;
                     class526.method3942(var10, -256, arg0, class133.field2180 - -var4, -1, class685.field9890, class587.field8249, var9, var6, var7, 5, class752.field10679 - -var3);
                     ++var8;
                     var9 = (class272)class594.field8377.method2239((byte)97);
                  } while(var9 != null);
               }

               if (!var2) {
                  break label104;
               }
            }

            int var11 = 0;
            class211 var12 = (class211)class142.field2268.method5225(true);
            if (var2 || var12 != null) {
               do {
                  label75: {
                     int var13 = var11 * 16 + 31 + class133.field2180 + var4;
                     if (var12.field3008 != 1) {
                        class537.method4003(var7, (byte)-73, -256, var13, var6, class685.field9890, class133.field2180 + var4, -1, arg0, class752.field10679 - -var3, class587.field8249, var12);
                        if (!var2) {
                           break label75;
                        }
                     }

                     class526.method3942(var13, -256, arg0, class133.field2180 - -var4, -1, class685.field9890, class587.field8249, (class272)var12.field3011.field10341.field1553, var6, var7, 5, class752.field10679 + var3);
                  }

                  ++var11;
                  var12 = (class211)class142.field2268.method5227(-17856);
               } while(var12 != null);
            }

            if (class562.field8001 != null) {
               int var10000;
               int var10001;
               int var10002;
               label62: {
                  class454.method3497(class552.field7876, 75, arg0, class134.field2185, class128.field2047, -16777216, var5, class674.field9446);
                  class437.field6409.method1860(class552.field7876 + 3, false, class674.field9446 + 14, -1, var5, class562.field8001.field3012);
                  int var14 = 0;
                  class272 var15 = (class272)class562.field8001.field3011.method5225(true);
                  if (var2) {
                     var10000 = var14 * 16;
                     var10001 = class674.field9446;
                     var10002 = -31;
                  } else if (var15 == null) {
                     var10000 = -97;
                     var10001 = class128.field2047;
                     var10002 = class674.field9446;
                     if (!var2) {
                        break label62;
                     }
                  } else {
                     var10000 = var14 * 16;
                     var10001 = class674.field9446;
                     var10002 = -31;
                  }

                  while(true) {
                     int var16 = var10000 + (var10001 - var10002);
                     ++var14;
                     class526.method3942(var16, -256, arg0, class674.field9446, -1, class134.field2185, class128.field2047, var15, var6, var7, 5, class552.field7876);
                     var15 = (class272)class562.field8001.field3011.method5227(-17856);
                     if (var15 == null) {
                        var10000 = -97;
                        var10001 = class128.field2047;
                        var10002 = class674.field9446;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = var14 * 16;
                        var10001 = class674.field9446;
                        var10002 = -31;
                     }
                  }
               }

               class480.method3673(var10000, var10001, var10002, class552.field7876, class134.field2185);
            }
         }

         class480.method3673(99, class587.field8249, class133.field2180 - -var4, class752.field10679 + var3, class685.field9890);
         if (arg1 > -21) {
            field6558 = null;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field6568[14] + (arg0 != null ? field6568[2] : field6568[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
