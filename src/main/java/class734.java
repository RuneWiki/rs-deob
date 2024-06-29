import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class734 implements class241 {
   @OriginalMember(
      owner = "client!rs",
      name = "i",
      descriptor = "I"
   )
   private int field10714 = 0;
   @OriginalMember(
      owner = "client!rs",
      name = "j",
      descriptor = "I"
   )
   private int field10716 = -1;
   @OriginalMember(
      owner = "client!rs",
      name = "p",
      descriptor = "[Ldg;"
   )
   private class219[] field10712 = new class219[9];
   @OriginalMember(
      owner = "client!rs",
      name = "n",
      descriptor = "Liu;"
   )
   private class530 field10710;
   @OriginalMember(
      owner = "client!rs",
      name = "t",
      descriptor = "I"
   )
   private int field10719;
   @OriginalMember(
      owner = "client!rs",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10723 = new String[]{method5317(method5316("f\u001dQ\u0001\u001d")), method5317(method5316("o@Q\u007fH")), method5317(method5316("z\u001b\u0013=")), method5317(method5316("f\u001dQ\u001f\u001d")), method5317(method5316("f\u001dQ\u0017\u001d")), method5317(method5316("f\u001dQ\u001d\u001d")), method5317(method5316("f\u001dQ\u001a\u001d")), method5317(method5316("f\u001dQ\u0019\u001d")), method5317(method5316("f\u001dQ\u0015\u001d")), method5317(method5316("f\u001dQ\u001b\u001d")), method5317(method5316("f\u001dQ\u0000\u001d")), method5317(method5316("f\u001dQ\u001c\u001d")), method5317(method5316("f\u001dQm\\z\u0007\u000bo\u001d")), method5317(method5316("f\u001dQ\u0016\u001d")), method5317(method5316("f\u001dQ\u0010\u001d")), method5317(method5316("f\u001dQ\u0018\u001d")), method5317(method5316("f\u001dQ\u0012\u001d")), method5317(method5316("f\u001dQ\u0014\u001d")), method5317(method5316("f\u001dQ7\\z\u000f\u00138OqF")), method5317(method5316("f\u001dQ\u001e\u001d")), method5317(method5316("f\u001dQ\u0013\u001d")), method5317(method5316("f\u001dQ\u0003\u001d"))};
   @OriginalMember(
      owner = "client!rs",
      name = "x",
      descriptor = "I"
   )
   public static int field10696;
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "I"
   )
   public static int field10697;
   @OriginalMember(
      owner = "client!rs",
      name = "h",
      descriptor = "I"
   )
   public static int field10698;
   @OriginalMember(
      owner = "client!rs",
      name = "u",
      descriptor = "I"
   )
   public static int field10699;
   @OriginalMember(
      owner = "client!rs",
      name = "w",
      descriptor = "I"
   )
   public static int field10700;
   @OriginalMember(
      owner = "client!rs",
      name = "v",
      descriptor = "I"
   )
   public static int field10701;
   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "I"
   )
   public static int field10702;
   @OriginalMember(
      owner = "client!rs",
      name = "y",
      descriptor = "I"
   )
   public static int field10703;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "I"
   )
   public static int field10704;
   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "I"
   )
   private int field10705;
   @OriginalMember(
      owner = "client!rs",
      name = "m",
      descriptor = "I"
   )
   private int field10706;
   @OriginalMember(
      owner = "client!rs",
      name = "r",
      descriptor = "I"
   )
   public static int field10707;
   @OriginalMember(
      owner = "client!rs",
      name = "s",
      descriptor = "I"
   )
   public static int field10708;
   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "I"
   )
   public static int field10709;
   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "I"
   )
   public static int field10711;
   @OriginalMember(
      owner = "client!rs",
      name = "A",
      descriptor = "I"
   )
   public static int field10713;
   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "I"
   )
   public static int field10715;
   @OriginalMember(
      owner = "client!rs",
      name = "o",
      descriptor = "I"
   )
   public static int field10717;
   @OriginalMember(
      owner = "client!rs",
      name = "g",
      descriptor = "I"
   )
   public static int field10718;
   @OriginalMember(
      owner = "client!rs",
      name = "k",
      descriptor = "I"
   )
   public static int field10720;
   @OriginalMember(
      owner = "client!rs",
      name = "q",
      descriptor = "I"
   )
   private int field10722;
   @OriginalMember(
      owner = "client!rs",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10721;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1916(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36009, this.field10719);
         ++field10713;
         this.field10714 |= 2;
         this.field10716 = this.method5310(arg0 + 18992);
         if (arg0 != -19117) {
            this.field10706 = -80;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Lkk;II)V"
   )
   public final void method5304(class266 arg0, int arg1, int arg2) {
      try {
         ++field10698;
         this.method5314(arg1, arg0, arg2, arg1 + -3570);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10723[9] + (arg0 != null ? field10723[1] : field10723[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1915(int arg0) {
      try {
         ++field10701;
         OpenGL.glBindFramebufferEXT(36160, this.field10719);
         this.field10714 |= 4;
         this.field10716 = this.method5310(-113);
         if (arg0 != 28366) {
            this.field10706 = -52;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method5305(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field10715;
         if (class548.field8080 == null) {
            class629.field9294.method3643(false, arg2, -16777216, arg5, arg3, arg4);
         } else if (class204.field2593.field10467 >= 0 && class204.field2593.field10467 < class273.field3491 * 512 && class204.field2593.field10468 >= 0 && class204.field2593.field10468 < class211.field2689 * 512) {
            ++class188.field2389;
            if (class204.field2593 != null && class204.field2593.field10467 + -(class204.field2593.method78(0) * 256) + 256 >> 9 == class607.field8981 && class204.field2593.field10468 - -256 - 256 * class204.field2593.method78(0) >> 9 == class549.field8103) {
               class549.field8103 = -1;
               class607.field8981 = -1;
               class121.method1066(arg0 ^ -1595261078);
            }

            class731.method5282(false);
            if (!arg1) {
               class281.method2229((byte)94);
            }

            int var22;
            int var23;
            int var24;
            int var25;
            label272: {
               class66.method662(117);
               class79.method766(arg5, (byte)116, arg4, arg3, arg2, true);
               class629.field9293 = class629.field9295;
               var25 = class546.field8039;
               var24 = class142.field1788;
               var22 = class344.field4724;
               var23 = class92.field1248;
               if (class784.field11454 == 1) {
                  int var7 = (int)class250.field3162;
                  if (var7 < class422.field5759 >> 8) {
                     var7 = class422.field5759 >> 8;
                  }

                  if (class203.field2587[4] && var7 < class170.field2215[4] + 128) {
                     var7 = class170.field2215[4] + 128;
                  }

                  int var8 = (int)class623.field9202 - -class87.field1192 & 16383;
                  class100.method905(var7, (byte)-72, var24, (var7 >> 3) * 3 + 600 << 2, class70.field942, class215.method1757(class204.field2593.field10467, false, class674.field9984, class204.field2593.field10468) + -200, var8, class95.field1290);
                  if (!var6) {
                     break label272;
                  }
               }

               if (~class784.field11454 != -5) {
                  if (~class784.field11454 != -6) {
                     break label272;
                  }

                  class727.method5259(128, var24);
                  if (!var6) {
                     break label272;
                  }
               }

               int var9 = (int)class250.field3162;
               if (class422.field5759 >> 8 > var9) {
                  var9 = class422.field5759 >> 8;
               }

               if (class203.field2587[4] && ~(class170.field2215[4] + 128) < ~var9) {
                  var9 = class170.field2215[4] + 128;
               }

               int var10 = (int)class623.field9202 & 16383;
               class100.method905(var9, (byte)-72, var24, (var9 >> 3) * 3 + 600 << 2, class70.field942, class215.method1757(class2.field27, false, class674.field9984, class274.field3506) - 200, var10, class95.field1290);
            }

            int var11 = class160.field2051;
            int var12 = class546.field8031;
            int var13 = class168.field2195;
            int var14 = class653.field9755;
            int var15 = class242.field3054;
            int var16 = 0;
            int var17;
            if (var6) {
               if (class203.field2587[var16]) {
                  var17 = (int)(Math.random() * (double)(class664.field9848[var16] * 2 - -1) - (double)class664.field9848[var16] + Math.sin((double)class620.field9155[var16] / 100.0D * (double)class764.field11189[var16]) * (double)class170.field2215[var16]);
                  if (~var16 == -5) {
                     class653.field9755 += var17;
                     if (class653.field9755 >= 1024) {
                        if (~class653.field9755 < -3073) {
                           class653.field9755 = 3072;
                           if (var6) {
                              class653.field9755 = 1024;
                           }
                        }
                     } else {
                        class653.field9755 = 1024;
                     }
                  }

                  if (var16 == 1) {
                     class546.field8031 += var17 << 2;
                  }

                  if (var16 == 0) {
                     class160.field2051 += var17 << 2;
                  }

                  if (~var16 == -4) {
                     class242.field3054 = 16383 & class242.field3054 - -var17;
                  }

                  if (~var16 == -3) {
                     class168.field2195 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }

            while(true) {
               int var10000;
               if (~var16 <= -6) {
                  var10000 = ~class160.field2051;
                  if (!var6) {
                     if (var10000 > -1) {
                        class160.field2051 = 0;
                     }

                     if (~((class137.field1743 << 9) - 1) > ~class160.field2051) {
                        class160.field2051 = (class137.field1743 << 9) + -1;
                     }

                     if (~class168.field2195 > -1) {
                        class168.field2195 = 0;
                     }

                     if ((class181.field2297 << 9) + -1 < class168.field2195) {
                        class168.field2195 = (class181.field2297 << 9) - 1;
                     }

                     label276: {
                        class293.method2358(12790);
                        class592.method4411(-61);
                        class629.field9294.method460(var25, var22, var23 + var25, var22 - -var24);
                        class442.method3404(true, arg0 + 1595265208);
                        if (class28.field416) {
                           class127.method1087(2, class773.field11262);
                           if (class629.field9293 != class526.field7362) {
                              class323.field4420 = true;
                           }

                           class526.field7362 = class629.field9293;
                           if (!var6) {
                              break label276;
                           }
                        }

                        class629.field9294.method502();
                        int var18 = class773.field11262;
                        if (class676.field9996 != null) {
                           class676.field9996.method3560(var23, var22, class629.field9294, var18, class653.field9755, class242.field3054, var25, arg0 ^ -1595261624, var24, class559.field8193 << 3);
                           if (!var6) {
                              break label276;
                           }
                        }

                        class629.field9294.method426(var18);
                     }

                     class161.method1344((byte)-104);
                     class428.field5818.method869(class160.field2051, class546.field8031, class168.field2195, -class653.field9755 & 16383, -class242.field3054 & 16383, -class673.field9969 & 16383);
                     class629.field9294.method397(class428.field5818);
                     class629.field9294.method504(var25 - -(var23 / 2), var22 - -(var24 / 2), class484.field6740 << 1, class484.field6740 << 1);
                     class50.method378(var25 - -(var23 / 2), class484.field6740 << 1, class484.field6740 << 1, 0, var24 / 2 + var22);
                     if (arg0 != -1595261112) {
                        field10721 = null;
                     }

                     label277: {
                        class180.method1520(class546.field8031, -class653.field9755 & 16383, 0, 16383 & -class673.field9969, -class242.field3054 & 16383, class168.field2195, class160.field2051);
                        byte var19 = ~class757.field11093.field11018.method204(-18033) != -3 ? 1 : (byte)class188.field2389;
                        if (class28.field416) {
                           class28.method219(16383 & -class653.field9755, -class242.field3054 & 16383, (byte)-84, -class673.field9969 & 16383);
                           class376.method2966(class248.field3133, class204.field2593.field10457 + 1, class168.field2195, class629.field9293, class546.field8031, class204.field2593.field10468 >> 9, class576.field8546, class156.field2019, var19, class413.field5678, class160.field2051, class755.field11063, class499.field6959, class44.field573, class204.field2593.field10467 >> 9, class757.field11093.field10998.method1672(arg0 + 1595243079) == 0, true, (byte)-54);
                           if (!var6) {
                              break label277;
                           }
                        }

                        class686.method5023(class413.field5678, class160.field2051, class546.field8031, class168.field2195, class755.field11063, class156.field2019, class248.field3133, class499.field6959, class44.field573, class576.field8546, class204.field2593.field10457 + 1, var19, class204.field2593.field10467 >> 9, class204.field2593.field10468 >> 9, class757.field11093.field10998.method1672(arg0 ^ 1595246279) == 0, true, !class400.field5500 ? -1 : class629.field9293, 0, false);
                     }

                     class161.method1344((byte)-104);
                     if (~class157.field2022 == -12) {
                        class745.method5396(var24, 256, var22, var23, var25, 0, 256);
                        class268.method2139(var23, 256, 256, var22, 0, var25, var24);
                        class197.method1639(var24, var25, 256, -124, var23, var22, 256);
                        class187.method1571(var23, (byte)-1, var22, var24, var25);
                     }

                     class87.method820();
                     class168.field2195 = var13;
                     class242.field3054 = var15;
                     class653.field9755 = var14;
                     class546.field8031 = var12;
                     class160.field2051 = var11;
                     if (class778.field11340 && ~class507.field7060.method2921(3) == -1) {
                        class778.field11340 = false;
                     }

                     if (class778.field11340) {
                        class629.field9294.method3643(false, var22, -16777216, var25, var23, var24);
                        class120.method1058(false, -570417178, class629.field9294, class689.field10134, class606.field8915.method4490(class782.field11389, -16777216), class209.field2657);
                     }

                     class442.method3404(false, 4096);
                     return;
                  }
               } else {
                  var10000 = class203.field2587[var16];
               }

               if (var10000 != 0) {
                  var17 = (int)(Math.random() * (double)(class664.field9848[var16] * 2 - -1) - (double)class664.field9848[var16] + Math.sin((double)class620.field9155[var16] / 100.0D * (double)class764.field11189[var16]) * (double)class170.field2215[var16]);
                  if (~var16 == -5) {
                     class653.field9755 += var17;
                     if (class653.field9755 >= 1024) {
                        if (~class653.field9755 < -3073) {
                           class653.field9755 = 3072;
                           if (var6) {
                              class653.field9755 = 1024;
                           }
                        }
                     } else {
                        class653.field9755 = 1024;
                     }
                  }

                  if (var16 == 1) {
                     class546.field8031 += var17 << 2;
                  }

                  if (var16 == 0) {
                     class160.field2051 += var17 << 2;
                  }

                  if (~var16 == -4) {
                     class242.field3054 = 16383 & class242.field3054 - -var17;
                  }

                  if (~var16 == -3) {
                     class168.field2195 += var17 << 2;
                  }

                  ++var16;
               } else {
                  ++var16;
               }
            }
         } else {
            class629.field9294.method3643(false, arg2, -16777216, arg5, arg3, arg4);
         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field10723[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Llt;IB)V"
   )
   public final void method5306(class324 arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 78) {
            this.method1918((byte)-14);
         }

         ++field10699;
         if (~this.field10716 == 0) {
            throw new RuntimeException();
         } else {
            int var4 = 1 << arg1;
            if ((~var4 & this.field10706) != 0) {
               if (~this.field10722 != ~arg0.field4436 || ~this.field10705 != ~arg0.field4429) {
                  throw new RuntimeException();
               }
            } else {
               this.field10705 = arg0.field4429;
               this.field10722 = arg0.field4436;
            }

            arg0.method2541(this.field10716, 64, class763.field11168[arg1]);
            this.field10712[arg1] = arg0;
            this.field10706 |= var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10723[11] + (arg0 != null ? field10723[1] : field10723[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1914(boolean arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36008, 0);
         if (arg0) {
            this.method5313(-2, true);
         }

         ++field10697;
         this.field10714 &= -2;
         this.field10716 = this.method5310(-126);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method5307(int arg0, byte arg1) {
      try {
         ++field10718;
         if (arg1 == 86) {
            if (this.field10712[arg0] != null) {
               this.field10712[arg0].method970((byte)-55);
            }

            this.field10706 &= ~(1 << arg0);
            this.field10712[arg0] = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10723[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5308(int arg0, int arg1) {
      try {
         if (arg1 == -5806) {
            ++field10720;
            if (~this.field10716 == 0) {
               throw new RuntimeException();
            } else {
               OpenGL.glDrawBuffer(class763.field11168[arg0]);
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10723[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method5309(int arg0) {
      try {
         ++field10703;
         int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field10716);
         return ~var2 == arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10723[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "e",
      descriptor = "(I)I"
   )
   private final int method5310(int arg0) {
      try {
         ++field10704;
         if ((4 & this.field10714) != 0) {
            return 36160;
         } else {
            if (arg0 >= -108) {
               this.field10714 = -38;
            }

            if (~(2 & this.field10714) != -1) {
               return 36009;
            } else {
               return (this.field10714 & 1) != 0 ? 36008 : -1;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1917(int arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, 0);
         ++field10708;
         this.field10714 &= -5;
         this.field10716 = this.method5310(-110);
         if (arg0 < 119) {
            this.method5313(-14, true);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(Lph;IIIZ)V"
   )
   private final void method5311(class789 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field10709;
         if (this.field10716 == -1) {
            throw new RuntimeException();
         } else {
            int var6;
            label43: {
               var6 = 1 << arg2;
               if ((~var6 & this.field10706) == 0) {
                  this.field10705 = arg0.field11498;
                  this.field10722 = arg0.field11498;
                  if (!client.field1481) {
                     break label43;
                  }
               }

               if (this.field10722 != arg0.field11498 || this.field10705 != arg0.field11498) {
                  throw new RuntimeException();
               }
            }

            arg0.method5681(arg1, class763.field11168[arg2], (byte)123, this.field10716, arg3);
            this.field10712[arg2] = arg0;
            if (!arg4) {
               this.field10712 = null;
            }

            this.field10706 |= var6;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10723[15] + (arg0 != null ? field10723[1] : field10723[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5312(int arg0) {
      try {
         if (arg0 == -1) {
            field10721 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10723[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method5313(int arg0, boolean arg1) {
      try {
         ++field10700;
         if (~this.field10716 == 0) {
            throw new RuntimeException();
         } else if (arg1) {
            OpenGL.glReadBuffer(class763.field11168[arg0]);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10723[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1918(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36009, 0);
         ++field10702;
         this.field10714 &= -3;
         int var2 = -126 % ((29 - arg0) / 57);
         this.field10716 = this.method5310(-123);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10723[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(ILkk;II)V"
   )
   private final void method5314(int arg0, class266 arg1, int arg2, int arg3) {
      try {
         if (arg3 != -3570) {
            method5312(24);
         }

         ++field10696;
         if (this.field10716 == -1) {
            throw new RuntimeException();
         } else {
            int var5 = 1 << arg2;
            if ((~var5 & this.field10706) != 0) {
               if (~this.field10722 != ~arg1.field3363 || this.field10705 != arg1.field3367) {
                  throw new RuntimeException();
               }
            } else {
               this.field10705 = arg1.field3367;
               this.field10722 = arg1.field3363;
            }

            arg1.method2127(arg0, class763.field11168[arg2], arg3 ^ 3569, this.field10716);
            this.field10712[arg2] = arg1;
            this.field10706 |= var5;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10723[3] + arg0 + ',' + (arg1 != null ? field10723[1] : field10723[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(ILph;IB)V"
   )
   public final void method5315(int arg0, class789 arg1, int arg2, byte arg3) {
      try {
         ++field10707;
         int var5 = -56 / ((arg3 - -54) / 37);
         this.method5311(arg1, 0, arg0, arg2, true);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10723[0] + arg0 + ',' + (arg1 != null ? field10723[1] : field10723[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1919(byte arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36008, this.field10719);
         ++field10717;
         this.field10714 |= 1;
         this.field10716 = this.method5310(-116);
         if (arg0 <= 81) {
            this.field10719 = 97;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field10710.method4019(this.field10719, (byte)119);
         ++field10711;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10723[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class734(class530 arg0) {
      try {
         if (!arg0.field7780) {
            throw new IllegalStateException("");
         } else {
            this.field10710 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class78.field1051, 0);
            this.field10719 = class78.field1051[0];
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10723[12] + (arg0 != null ? field10723[1] : field10723[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5316(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5317(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
