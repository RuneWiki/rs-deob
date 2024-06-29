import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public abstract class class110 implements class683 {
   @OriginalMember(
      owner = "client!lr",
      name = "k",
      descriptor = "Lmb;"
   )
   private class359 field1723 = class391.field5689;
   @OriginalMember(
      owner = "client!lr",
      name = "u",
      descriptor = "Lqs;"
   )
   public class771 field1715;
   @OriginalMember(
      owner = "client!lr",
      name = "j",
      descriptor = "Lob;"
   )
   public class779 field1714;
   @OriginalMember(
      owner = "client!lr",
      name = "w",
      descriptor = "Lsr;"
   )
   public class78 field1720;
   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "I"
   )
   public int field1719;
   @OriginalMember(
      owner = "client!lr",
      name = "d",
      descriptor = "Z"
   )
   private boolean field1712;
   @OriginalMember(
      owner = "client!lr",
      name = "o",
      descriptor = "I"
   )
   private int field1728;
   @OriginalMember(
      owner = "client!lr",
      name = "g",
      descriptor = "I"
   )
   private int field1722;
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1730 = new String[]{method1081(method1080("Jr(o")), method1081(method1080("_)j-X")), method1081(method1080("HujV\r")), method1081(method1080("HujU\r")), method1081(method1080("HujP\r")), method1081(method1080("HujR\r")), method1081(method1080("HujW\r")), method1081(method1080("HujeLJf(j_A/")), method1081(method1080("HujS\r")), method1081(method1080("HujQ\r")), method1081(method1080("HujJ\r")), method1081(method1080("HujT\r")), method1081(method1080("Huj?LJn0=\r")), method1081(method1080("HujH\r")), method1081(method1080("HujL\r")), method1081(method1080("HujF\r"))};
   @OriginalMember(
      owner = "client!lr",
      name = "m",
      descriptor = "I"
   )
   public static int field1707;
   @OriginalMember(
      owner = "client!lr",
      name = "s",
      descriptor = "I"
   )
   public static int field1708;
   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "I"
   )
   public static int field1709;
   @OriginalMember(
      owner = "client!lr",
      name = "p",
      descriptor = "I"
   )
   public static int field1711;
   @OriginalMember(
      owner = "client!lr",
      name = "i",
      descriptor = "I"
   )
   public static int field1713;
   @OriginalMember(
      owner = "client!lr",
      name = "q",
      descriptor = "I"
   )
   public static int field1716;
   @OriginalMember(
      owner = "client!lr",
      name = "t",
      descriptor = "I"
   )
   public static int field1717;
   @OriginalMember(
      owner = "client!lr",
      name = "e",
      descriptor = "I"
   )
   public static int field1718;
   @OriginalMember(
      owner = "client!lr",
      name = "l",
      descriptor = "I"
   )
   public static int field1721;
   @OriginalMember(
      owner = "client!lr",
      name = "h",
      descriptor = "I"
   )
   public static int field1724;
   @OriginalMember(
      owner = "client!lr",
      name = "v",
      descriptor = "I"
   )
   public static int field1725;
   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "I"
   )
   public static int field1726;
   @OriginalMember(
      owner = "client!lr",
      name = "n",
      descriptor = "I"
   )
   public static int field1727;
   @OriginalMember(
      owner = "client!lr",
      name = "f",
      descriptor = "I"
   )
   public static int field1729;
   @OriginalMember(
      owner = "client!lr",
      name = "r",
      descriptor = "Lgga;"
   )
   public static class502 field1710;

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(III[IB)V"
   )
   public final void method1068(int arg0, int arg1, int arg2, int[] arg3, byte arg4) {
      boolean var6 = client.field10022;

      try {
         ++field1724;
         if (arg0 > 0 && !class122.method1209(arg0, -64)) {
            throw new IllegalArgumentException("");
         } else if (arg1 > 0 && !class122.method1209(arg1, 109)) {
            throw new IllegalArgumentException("");
         } else if (class31.field438 != this.field1720) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = 0;
            int var8 = arg1 <= arg0 ? arg1 : arg0;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            int[] var11 = arg3;
            int[] var12 = new int[var9 * var10];

            label101:
            while(true) {
               OpenGL.glTexImage2Di(arg2, var7, this.method1073(-2), arg0, arg1, 0, 32993, this.field1715.field11153, var11, 0);
               if (~var8 >= -2 && !var6) {
                  break;
               }

               int var13 = 0;
               int var14 = 0;
               int var15 = var14 - -arg0;
               int var16 = 0;
               int var10000;
               int[] var38;
               if (var6) {
                  var10000 = 0;
               } else if (~var16 <= ~var10) {
                  var38 = var12;
                  var12 = var11;
                  arg1 = var10;
                  var11 = var38;
                  arg0 = var9;
                  var8 >>= 1;
                  ++var7;
                  var9 >>= 1;
                  var10000 = var10 >> 1;
                  if (!var6) {
                     var10 = var10000;
                     if (var6) {
                        break;
                     }
                     continue;
                  }
               } else {
                  var10000 = 0;
               }

               while(true) {
                  label96: {
                     int var17 = var10000;
                     if (var6) {
                        var10000 = var11[var14++];
                     } else if (var9 <= var17) {
                        var15 += arg0;
                        var10000 = arg0 + var14;
                        if (!var6) {
                           break label96;
                        }
                     } else {
                        var10000 = var11[var14++];
                     }

                     while(true) {
                        int var18 = var10000;
                        int var19 = var11[var15++];
                        int var20 = var11[var14++];
                        int var21 = var18 >> 16 & 255;
                        int var22 = var11[var15++];
                        int var23 = var18 & 255;
                        int var24 = 255 & var18 >> 24;
                        int var25 = (65349 & var18) >> 8;
                        int var26 = (255 & var20) + var23;
                        int var27 = (var20 >> 8 & 255) + var25;
                        int var28 = (var20 >> 24 & 255) + var24;
                        int var29 = ((var20 & 16772312) >> 16) + var21;
                        int var30 = ((16765497 & var19) >> 16) + var29;
                        int var31 = (255 & var19) + var26;
                        int var32 = ((65434 & var19) >> 8) + var27;
                        int var33 = (var19 >> 24 & 255) + var28;
                        int var34 = ((65332 & var22) >> 8) + var32;
                        int var35 = (var22 & 255) + var31;
                        int var36 = ((16764393 & var22) >> 16) + var30;
                        int var37 = (var22 >> 24 & 255) + var33;
                        var12[var13++] = class91.method932(class697.method5101(var35, 1020) >> 2, class91.method932(class697.method5101(var34, 1020) << 6, class91.method932(class697.method5101(var37 << 22, -16777216), class697.method5101(var36, 1020) << 14)));
                        ++var17;
                        if (var9 <= var17) {
                           var15 += arg0;
                           var10000 = arg0 + var14;
                           if (!var6) {
                              break;
                           }
                        } else {
                           var10000 = var11[var14++];
                        }
                     }
                  }

                  var14 = var10000;
                  ++var16;
                  if (~var16 <= ~var10) {
                     var38 = var12;
                     var12 = var11;
                     arg1 = var10;
                     var11 = var38;
                     arg0 = var9;
                     var8 >>= 1;
                     ++var7;
                     var9 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        var10 = var10000;
                        if (var6) {
                           break label101;
                        }
                        break;
                     }
                  } else {
                     var10000 = 0;
                  }
               }
            }

            if (arg4 != 28) {
               this.method1068(-126, 79, -95, (int[])null, (byte)-18);
            }
         }
      } catch (RuntimeException var40) {
         throw class612.method4503(var40, field1730[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1730[1] : field1730[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "(Z)I"
   )
   private final int method1069(boolean arg0) {
      try {
         ++field1716;
         if (arg0) {
            this.field1712 = true;
         }

         int var2 = this.field1720.field1242 * this.field1728 * this.field1714.field11369;
         return !this.field1712 ? var2 : var2 * 4 / 3;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1730[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method1070(byte arg0, int arg1) {
      try {
         this.field1715.field3393 -= arg1;
         ++field1707;
         this.field1715.field3393 += this.method1069(false);
         if (arg0 != -119) {
            this.method1071(true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1730[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1071(boolean arg0) {
      try {
         ++field1717;
         int var2 = this.field1715.method1970((byte)-66);
         if (arg0) {
            int var3 = this.field1715.field11155[var2];
            if (this.field1719 != var3) {
               if (var3 != 0) {
                  OpenGL.glBindTexture(var3, 0);
                  OpenGL.glDisable(var3);
               }

               OpenGL.glEnable(this.field1719);
               this.field1715.field11155[var2] = this.field1719;
            }

            OpenGL.glBindTexture(this.field1719, this.field1722);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1730[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(II[BII)V"
   )
   public final void method1072(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field1725;
         if (~arg0 < -1 && !class122.method1209(arg0, 108)) {
            throw new IllegalArgumentException("");
         } else if (~arg1 < -1 && !class122.method1209(arg1, -104)) {
            throw new IllegalArgumentException("");
         } else {
            if (arg4 > -4) {
               this.method1069(true);
            }

            int var7 = this.field1720.field1242;
            int var8 = 0;
            int var9 = arg1 <= arg0 ? arg1 : arg0;
            int var10 = arg0 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var7 * var11 * var10];

            while(true) {
               OpenGL.glTexImage2Dub(arg3, var8, this.method1073(-2), arg0, arg1, 0, class186.method1672((byte)-89, this.field1720), 5121, var12, 0);
               if (~var9 >= -2) {
                  return;
               }

               int var10000;
               label101: {
                  int var14 = arg0 * var7;
                  int var15 = 0;
                  byte[] var27;
                  if (var6) {
                     var10000 = var15;
                  } else if (var15 >= var7) {
                     var27 = var13;
                     var13 = var12;
                     arg0 = var10;
                     var12 = var27;
                     arg1 = var11;
                     var9 >>= 1;
                     var11 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label101;
                     }
                  } else {
                     var10000 = var15;
                  }

                  while(true) {
                     int var16 = var10000;
                     int var17 = var15;
                     int var18 = var14 + var15;
                     int var19 = 0;
                     if (var6 || ~var11 < ~var19) {
                        do {
                           label95: {
                              int var20 = 0;
                              if (var6) {
                                 var10000 = var12[var17];
                              } else if (~var20 <= ~var10) {
                                 var18 += var14;
                                 var10000 = var14 + var17;
                                 if (!var6) {
                                    break label95;
                                 }
                              } else {
                                 var10000 = var12[var17];
                              }

                              while(true) {
                                 int var21 = var10000;
                                 int var22 = var7 + var17;
                                 int var23 = var12[var22] + var21;
                                 int var24 = var12[var18] + var23;
                                 var17 = var7 + var22;
                                 int var25 = var7 + var18;
                                 int var26 = var12[var25] + var24;
                                 var13[var16] = (byte)(var26 >> 2);
                                 var18 = var7 + var25;
                                 var16 += var7;
                                 ++var20;
                                 if (~var20 <= ~var10) {
                                    var18 += var14;
                                    var10000 = var14 + var17;
                                    if (!var6) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var12[var17];
                                 }
                              }
                           }

                           var17 = var10000;
                           ++var19;
                        } while(~var11 < ~var19);
                     }

                     ++var15;
                     if (var15 >= var7) {
                        var27 = var13;
                        var13 = var12;
                        arg0 = var10;
                        var12 = var27;
                        arg1 = var11;
                        var9 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var15;
                     }
                  }
               }

               var10 = var10000;
               ++var8;
            }
         }
      } catch (RuntimeException var29) {
         throw class612.method4503(var29, field1730[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1730[1] : field1730[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1073(int arg0) {
      try {
         ++field1708;
         if (arg0 != -2) {
            this.method1070((byte)10, 63);
         }

         if (class779.field11371 == this.field1714) {
            if (class317.field4744 == this.field1720) {
               return 6407;
            }

            if (class31.field438 == this.field1720) {
               return 6408;
            }

            if (class106.field1654 == this.field1720) {
               return 6406;
            }

            if (class171.field2564 == this.field1720) {
               return 6409;
            }

            if (class73.field1175 == this.field1720) {
               return 6410;
            }

            if (class480.field6902 == this.field1720) {
               return 6145;
            }
         } else if (class779.field11374 != this.field1714) {
            if (class779.field11375 == this.field1714) {
               if (class317.field4744 == this.field1720) {
                  return 34837;
               }

               if (class31.field438 == this.field1720) {
                  return 34836;
               }

               if (class106.field1654 == this.field1720) {
                  return 34838;
               }

               if (class171.field2564 == this.field1720) {
                  return 34840;
               }

               if (class73.field1175 == this.field1720) {
                  return 34841;
               }

               if (class480.field6902 == this.field1720) {
                  return 6145;
               }
            }
         } else {
            if (class317.field4744 == this.field1720) {
               return 34843;
            }

            if (class31.field438 == this.field1720) {
               return 34842;
            }

            if (class106.field1654 == this.field1720) {
               return 34844;
            }

            if (class171.field2564 == this.field1720) {
               return 34846;
            }

            if (class73.field1175 == this.field1720) {
               return 34847;
            }

            if (class480.field6902 == this.field1720) {
               return 6145;
            }
         }

         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1730[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method1074(int arg0) {
      try {
         ++field1718;
         if (this.field1722 > 0) {
            this.field1715.method5549(26083, this.field1722, this.method1069(false));
            this.field1722 = 0;
         }

         if (arg0 != 11522) {
            method1077(-105, 22, 94, 25, (class395)null, false, 47);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1730[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(Lmb;B)V"
   )
   public final void method1075(class359 arg0, byte arg1) {
      try {
         if (this.field1723 != arg0) {
            this.field1723 = arg0;
            this.method1078(1);
         }

         ++field1709;
         if (arg1 != 34) {
            this.method1069(false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1730[15] + (arg0 != null ? field1730[1] : field1730[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IIIZ[F)V"
   )
   public final void method1076(int arg0, int arg1, int arg2, boolean arg3, float[] arg4) {
      boolean var6 = client.field10022;

      try {
         ++field1721;
         if (arg1 > 0 && !class122.method1209(arg1, 109)) {
            throw new IllegalArgumentException("");
         } else if (~arg2 < -1 && !class122.method1209(arg2, -78)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field1720.field1242;
            int var8 = 0;
            int var9 = ~arg2 < ~arg1 ? arg1 : arg2;
            int var10 = arg1 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg4;
            float[] var13 = new float[var7 * var11 * var10];
            if (arg3) {
               while(true) {
                  OpenGL.glTexImage2Df(arg0, var8, this.method1073(-2), arg1, arg2, 0, class186.method1672((byte)-103, this.field1720), 5126, var12, 0);
                  if (~var9 >= -2) {
                     return;
                  }

                  int var10000;
                  label89: {
                     int var14 = arg1 * var7;
                     int var15 = 0;
                     float[] var27;
                     if (var6) {
                        var10000 = var15;
                     } else if (var15 >= var7) {
                        var27 = var13;
                        var13 = var12;
                        arg1 = var10;
                        arg2 = var11;
                        var12 = var27;
                        var9 >>= 1;
                        var11 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break label89;
                        }
                     } else {
                        var10000 = var15;
                     }

                     while(true) {
                        int var16 = var10000;
                        int var17 = var15;
                        int var18 = var14 + var15;
                        int var19 = 0;
                        if (var6 || var19 < var11) {
                           do {
                              int var20 = 0;
                              if (var6 || var20 < var10) {
                                 do {
                                    float var21 = var12[var17];
                                    int var22 = var7 + var17;
                                    float var23 = var12[var22] + var21;
                                    float var24 = var12[var18] + var23;
                                    var17 = var7 + var22;
                                    int var25 = var7 + var18;
                                    float var26 = var12[var25] + var24;
                                    var18 = var7 + var25;
                                    var13[var16] = var26 * 0.25F;
                                    var16 += var7;
                                    ++var20;
                                 } while(var20 < var10);
                              }

                              var17 += var14;
                              var18 += var14;
                              ++var19;
                           } while(var19 < var11);
                        }

                        ++var15;
                        if (var15 >= var7) {
                           var27 = var13;
                           var13 = var12;
                           arg1 = var10;
                           arg2 = var11;
                           var12 = var27;
                           var9 >>= 1;
                           var11 >>= 1;
                           var10000 = var10 >> 1;
                           if (!var6) {
                              break;
                           }
                        } else {
                           var10000 = var15;
                        }
                     }
                  }

                  var10 = var10000;
                  ++var8;
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class612.method4503(var29, field1730[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1730[1] : field1730[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IIIILbt;ZI)V"
   )
   public static final void method1077(int arg0, int arg1, int arg2, int arg3, class395 arg4, boolean arg5, int arg6) {
      try {
         if (arg5) {
            method1079(36);
         }

         class776.method5602(arg3, 0, arg2, arg6, arg0, (byte)96, arg4.field6824, arg4.field6833, arg4.field6832, arg1);
         ++field1729;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1730[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1730[1] : field1730[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method1078(int arg0) {
      try {
         ++field1727;
         if (arg0 != 1) {
            this.field1719 = 77;
         }

         this.field1715.method1943(0, this);
         if (class391.field5689 == this.field1723) {
            OpenGL.glTexParameteri(this.field1719, 10241, this.field1712 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field1719, 10240, 9729);
         } else {
            OpenGL.glTexParameteri(this.field1719, 10241, this.field1712 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field1719, 10240, 9728);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1730[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method1074(11522);
         ++field1726;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1730[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "(Lqs;ILsr;Lob;IZ)V"
   )
   public class110(class771 arg0, int arg1, class78 arg2, class779 arg3, int arg4, boolean arg5) {
      try {
         this.field1715 = arg0;
         this.field1714 = arg3;
         this.field1720 = arg2;
         this.field1719 = arg1;
         this.field1712 = arg5;
         this.field1728 = arg4;
         OpenGL.glGenTextures(1, class766.field10988, 0);
         this.field1722 = class766.field10988[0];
         this.method1078(1);
         this.method1070((byte)-119, 0);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1730[12] + (arg0 != null ? field1730[1] : field1730[0]) + ',' + arg1 + ',' + (arg2 != null ? field1730[1] : field1730[0]) + ',' + (arg3 != null ? field1730[1] : field1730[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1079(int arg0) {
      try {
         field1710 = null;
         if (arg0 > -55) {
            method1079(-8);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1730[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1080(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1081(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
