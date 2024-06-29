import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class476 implements class428 {
   @OriginalMember(
      owner = "client!rj",
      name = "n",
      descriptor = "Lpi;"
   )
   private class427 field7250 = class168.field2573;
   @OriginalMember(
      owner = "client!rj",
      name = "e",
      descriptor = "Lpc;"
   )
   public class650 field7239;
   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "Z"
   )
   private boolean field7234;
   @OriginalMember(
      owner = "client!rj",
      name = "l",
      descriptor = "Leh;"
   )
   public class19 field7246;
   @OriginalMember(
      owner = "client!rj",
      name = "i",
      descriptor = "I"
   )
   private int field7240;
   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "I"
   )
   public int field7248;
   @OriginalMember(
      owner = "client!rj",
      name = "j",
      descriptor = "Lcka;"
   )
   public class174 field7244;
   @OriginalMember(
      owner = "client!rj",
      name = "h",
      descriptor = "I"
   )
   private int field7247;
   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7256 = new String[]{method3710(method3709("\u0002X\u0012eU")), method3710(method3709("\u000b\u001c\u0012\n\u0000")), method3710(method3709("\u0017\u0003P'")), method3710(method3709("\u000b\u001c\u0012\u0019\u0000")), method3710(method3709("\u000b\u001c\u0012\u001d\u0000")), method3710(method3709("\u000b\u001c\u0012-A\u0017\u0017P\"R\u001c^")), method3710(method3709("\u000b\u001c\u0012\u001e\u0000")), method3710(method3709("\u000b\u001c\u0012\u001f\u0000")), method3710(method3709("\u000b\u001c\u0012\u001c\u0000")), method3710(method3709("\u000b\u001c\u0012\tiQ")), method3710(method3709("\u000b\u001c\u0012\biQ")), method3710(method3709("\u000b\u001c\u0012\niQ")), method3710(method3709("\u000b\u001c\u0012\u0018\u0000")), method3710(method3709("\u000b\u001c\u0012\b\u0000")), method3710(method3709("\u000b\u001c\u0012\u000fiQ")), method3710(method3709("\u000b\u001c\u0012wA\u0017\u001fHu\u0000"))};
   @OriginalMember(
      owner = "client!rj",
      name = "d",
      descriptor = "I"
   )
   public static int field7235;
   @OriginalMember(
      owner = "client!rj",
      name = "s",
      descriptor = "I"
   )
   public static int field7236;
   @OriginalMember(
      owner = "client!rj",
      name = "o",
      descriptor = "I"
   )
   public static int field7238;
   @OriginalMember(
      owner = "client!rj",
      name = "q",
      descriptor = "I"
   )
   public static int field7241;
   @OriginalMember(
      owner = "client!rj",
      name = "k",
      descriptor = "I"
   )
   public static int field7242;
   @OriginalMember(
      owner = "client!rj",
      name = "t",
      descriptor = "I"
   )
   public static int field7243;
   @OriginalMember(
      owner = "client!rj",
      name = "g",
      descriptor = "I"
   )
   public static int field7245;
   @OriginalMember(
      owner = "client!rj",
      name = "v",
      descriptor = "I"
   )
   public static int field7249;
   @OriginalMember(
      owner = "client!rj",
      name = "u",
      descriptor = "I"
   )
   public static int field7252;
   @OriginalMember(
      owner = "client!rj",
      name = "p",
      descriptor = "I"
   )
   public static int field7253;
   @OriginalMember(
      owner = "client!rj",
      name = "c",
      descriptor = "I"
   )
   public static int field7254;
   @OriginalMember(
      owner = "client!rj",
      name = "f",
      descriptor = "I"
   )
   public static int field7255;
   @OriginalMember(
      owner = "client!rj",
      name = "r",
      descriptor = "Lwo;"
   )
   public static class9 field7251;
   @OriginalMember(
      owner = "client!rj",
      name = "m",
      descriptor = "[[Lvca;"
   )
   public static class365[][] field7237;

   @OriginalMember(
      owner = "client!rj",
      name = "e",
      descriptor = "(I)I"
   )
   private final int method3699(int arg0) {
      try {
         ++field7235;
         int var2 = this.field7239.field9366 * this.field7240 * this.field7246.field240;
         int var3 = -46 / ((-23 - arg0) / 61);
         return this.field7234 ? var2 * 4 / 3 : var2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7256[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(ILpi;)V"
   )
   public final void method216(int arg0, class427 arg1) {
      try {
         if (this.field7250 != arg1) {
            this.field7250 = arg1;
            this.method3708((byte)-109);
         }

         if (arg0 < 125) {
            this.method3706(113, -42, -4, 16, (int[])null);
         }

         ++field7242;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7256[1] + arg0 + ',' + (arg1 != null ? field7256[0] : field7256[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method3707(125);
         ++field7241;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7256[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method3700(int arg0, String arg1) {
      try {
         ++field7254;
         if (arg0 != -9187) {
            method3700(91, (String)null);
         }

         String var2 = class278.method2335(class583.method4365(arg1, -12607), (byte)96);
         if (var2 == null) {
            var2 = "";
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7256[8] + arg0 + ',' + (arg1 != null ? field7256[0] : field7256[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3701(boolean arg0) {
      try {
         field7251 = null;
         if (!arg0) {
            field7237 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7256[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method3702(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            this.field7234 = true;
         }

         this.field7244.field4130 -= arg1;
         ++field7255;
         this.field7244.field4130 += this.method3699(75);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7256[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(I[FIIB)V"
   )
   public final void method3703(int arg0, float[] arg1, int arg2, int arg3, byte arg4) {
      boolean var6 = client.field1786;

      try {
         ++field7238;
         if (arg2 > 0 && !class140.method1285(arg2, -11925)) {
            throw new IllegalArgumentException("");
         } else if (~arg3 < -1 && !class140.method1285(arg3, -11925)) {
            throw new IllegalArgumentException("");
         } else {
            if (arg4 != 108) {
               this.field7234 = false;
            }

            int var7 = this.field7246.field240;
            int var8 = 0;
            int var9 = arg3 <= arg2 ? arg3 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg3 >> 1;
            float[] var12 = arg1;
            float[] var13 = new float[var7 * var10 * var11];

            while(true) {
               OpenGL.glTexImage2Df(arg0, var8, this.method3704(-8760), arg2, arg3, 0, class158.method1412(50, this.field7246), 5126, var12, 0);
               if (~var9 >= -2) {
                  return;
               }

               int var10000;
               label91: {
                  int var14 = arg2 * var7;
                  float[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (var7 <= var16) {
                     var13 = var12;
                     var12 = var15;
                     arg3 = var11;
                     arg2 = var10;
                     var11 >>= 1;
                     var10 >>= 1;
                     var10000 = var9 >> 1;
                     if (!var6) {
                        break label91;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var14 + var16;
                     int var20 = 0;
                     if (var6 || var11 > var20) {
                        do {
                           int var21 = 0;
                           if (var6 || ~var10 < ~var21) {
                              do {
                                 float var22 = var12[var18];
                                 int var23 = var7 + var18;
                                 float var24 = var12[var23] + var22;
                                 float var25 = var12[var19] + var24;
                                 var18 = var7 + var23;
                                 int var26 = var7 + var19;
                                 float var27 = var12[var26] + var25;
                                 var19 = var7 + var26;
                                 var13[var17] = var27 * 0.25F;
                                 var17 += var7;
                                 ++var21;
                              } while(~var10 < ~var21);
                           }

                           var18 += var14;
                           var19 += var14;
                           ++var20;
                        } while(var11 > var20);
                     }

                     ++var16;
                     if (var7 <= var16) {
                        var13 = var12;
                        var12 = var15;
                        arg3 = var11;
                        arg2 = var10;
                        var11 >>= 1;
                        var10 >>= 1;
                        var10000 = var9 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var9 = var10000;
               ++var8;
            }
         }
      } catch (RuntimeException var29) {
         throw class482.method3757(var29, field7256[9] + arg0 + ',' + (arg1 != null ? field7256[0] : field7256[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method3704(int arg0) {
      try {
         ++field7243;
         if (class650.field9371 == this.field7239) {
            if (class392.field6155 == this.field7246) {
               return 6407;
            }

            if (class364.field5628 == this.field7246) {
               return 6408;
            }

            if (class342.field5203 == this.field7246) {
               return 6406;
            }

            if (class168.field2565 == this.field7246) {
               return 6409;
            }

            if (class681.field10155 == this.field7246) {
               return 6410;
            }

            if (class40.field484 == this.field7246) {
               return 6145;
            }
         } else if (class650.field9374 != this.field7239) {
            if (class650.field9375 == this.field7239) {
               if (class392.field6155 == this.field7246) {
                  return 34837;
               }

               if (class364.field5628 == this.field7246) {
                  return 34836;
               }

               if (class342.field5203 == this.field7246) {
                  return 34838;
               }

               if (class168.field2565 == this.field7246) {
                  return 34840;
               }

               if (class681.field10155 == this.field7246) {
                  return 34841;
               }

               if (class40.field484 == this.field7246) {
                  return 6145;
               }
            }
         } else {
            if (class392.field6155 == this.field7246) {
               return 34843;
            }

            if (class364.field5628 == this.field7246) {
               return 34842;
            }

            if (class342.field5203 == this.field7246) {
               return 34844;
            }

            if (class168.field2565 == this.field7246) {
               return 34846;
            }

            if (class681.field10155 == this.field7246) {
               return 34847;
            }

            if (class40.field484 == this.field7246) {
               return 6145;
            }
         }

         if (arg0 != -8760) {
            this.field7246 = null;
         }

         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7256[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "([BIBII)V"
   )
   public final void method3705(byte[] arg0, int arg1, byte arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field7252;
         if (arg3 > 0 && !class140.method1285(arg3, -11925)) {
            throw new IllegalArgumentException("");
         } else if (~arg1 < -1 && !class140.method1285(arg1, arg2 ^ -11937)) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = this.field7246.field240;
            int var8 = 0;
            int var9 = ~arg3 <= ~arg1 ? arg1 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg1 >> 1;
            if (arg2 != 52) {
               this.field7234 = true;
            }

            byte[] var12 = arg0;
            byte[] var13 = new byte[var7 * var10 * var11];

            while(true) {
               OpenGL.glTexImage2Dub(arg4, var8, this.method3704(arg2 ^ -8708), arg3, arg1, 0, class158.method1412(arg2 + -2, this.field7246), 5121, var12, 0);
               if (~var9 >= -2) {
                  return;
               }

               int var10000;
               label101: {
                  int var14 = arg3 * var7;
                  byte[] var15 = var13;
                  int var16 = 0;
                  if (var6) {
                     var10000 = var16;
                  } else if (var16 >= var7) {
                     var13 = var12;
                     arg3 = var10;
                     arg1 = var11;
                     var12 = var15;
                     ++var8;
                     var10 >>= 1;
                     var11 >>= 1;
                     var10000 = var9 >> 1;
                     if (!var6) {
                        break label101;
                     }
                  } else {
                     var10000 = var16;
                  }

                  while(true) {
                     int var17 = var10000;
                     int var18 = var16;
                     int var19 = var14 + var16;
                     int var20 = 0;
                     if (var6 || ~var11 < ~var20) {
                        do {
                           label95: {
                              int var21 = 0;
                              if (var6) {
                                 var10000 = var12[var18];
                              } else if (var21 >= var10) {
                                 var19 += var14;
                                 var10000 = var14 + var18;
                                 if (!var6) {
                                    break label95;
                                 }
                              } else {
                                 var10000 = var12[var18];
                              }

                              while(true) {
                                 int var22 = var10000;
                                 int var23 = var7 + var18;
                                 int var24 = var12[var23] + var22;
                                 int var25 = var12[var19] + var24;
                                 var18 = var7 + var23;
                                 int var26 = var7 + var19;
                                 int var27 = var12[var26] + var25;
                                 var19 = var7 + var26;
                                 var13[var17] = (byte)(var27 >> 2);
                                 var17 += var7;
                                 ++var21;
                                 if (var21 >= var10) {
                                    var19 += var14;
                                    var10000 = var14 + var18;
                                    if (!var6) {
                                       break;
                                    }
                                 } else {
                                    var10000 = var12[var18];
                                 }
                              }
                           }

                           var18 = var10000;
                           ++var20;
                        } while(~var11 < ~var20);
                     }

                     ++var16;
                     if (var16 >= var7) {
                        var13 = var12;
                        arg3 = var10;
                        arg1 = var11;
                        var12 = var15;
                        ++var8;
                        var10 >>= 1;
                        var11 >>= 1;
                        var10000 = var9 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = var16;
                     }
                  }
               }

               var9 = var10000;
            }
         }
      } catch (RuntimeException var29) {
         throw class482.method3757(var29, field7256[3] + (arg0 != null ? field7256[0] : field7256[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(IIII[I)V"
   )
   public final void method3706(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      boolean var6 = client.field1786;

      try {
         ++field7245;
         if (arg0 > 0 && !class140.method1285(arg0, -11925)) {
            throw new IllegalArgumentException("");
         } else if (arg3 > 0 && !class140.method1285(arg3, -11925)) {
            throw new IllegalArgumentException("");
         } else if (class364.field5628 != this.field7246) {
            throw new IllegalArgumentException("");
         } else {
            int var7 = 0;
            int var8 = ~arg3 < ~arg0 ? arg0 : arg3;
            int var9 = arg0 >> 1;
            int var10 = arg3 >> 1;
            int[] var11 = arg4;
            int[] var12 = new int[var9 * var10];
            if (arg2 != 20110) {
               this.method3703(33, (float[])null, 51, 111, (byte)-2);
            }

            while(true) {
               OpenGL.glTexImage2Di(arg1, var7, this.method3704(-8760), arg0, arg3, 0, 32993, this.field7244.field2736, var11, 0);
               if (var8 <= 1) {
                  return;
               }

               int var10000;
               label90: {
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = arg0 + var14;
                  int var16 = 0;
                  int[] var38;
                  if (var6) {
                     var10000 = 0;
                  } else if (~var10 >= ~var16) {
                     var38 = var12;
                     var12 = var11;
                     var11 = var38;
                     arg0 = var9;
                     arg3 = var10;
                     ++var7;
                     var9 >>= 1;
                     var8 >>= 1;
                     var10000 = var10 >> 1;
                     if (!var6) {
                        break label90;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     label87: {
                        int var17 = var10000;
                        if (var6) {
                           var10000 = var11[var14++];
                        } else if (~var9 >= ~var17) {
                           var15 += arg0;
                           var10000 = arg0 + var14;
                           if (!var6) {
                              break label87;
                           }
                        } else {
                           var10000 = var11[var14++];
                        }

                        while(true) {
                           int var18 = var10000;
                           int var19 = var11[var14++];
                           int var20 = var11[var15++];
                           int var21 = (16772589 & var18) >> 16;
                           int var22 = var18 & 255;
                           int var23 = (65374 & var18) >> 8;
                           int var24 = var18 >> 24 & 255;
                           int var25 = var11[var15++];
                           int var26 = ((var19 & 16719563) >> 16) + var21;
                           int var27 = (255 & var19 >> 24) + var24;
                           int var28 = (255 & var19) + var22;
                           int var29 = ((65338 & var19) >> 8) + var23;
                           int var30 = (var20 & 255) + var28;
                           int var31 = ((65372 & var20) >> 8) + var29;
                           int var32 = (255 & var20 >> 24) + var27;
                           int var33 = (255 & var20 >> 16) + var26;
                           int var34 = (255 & var25 >> 16) + var33;
                           int var35 = (var25 >> 24 & 255) + var32;
                           int var36 = (255 & var25 >> 8) + var31;
                           int var37 = (var25 & 255) + var30;
                           var12[var13++] = class119.method1087(class119.method1087(class119.method1087(class408.method3277(var35 << 22, -16777216), class408.method3277(var34 << 14, 16711680)), class408.method3277(1020, var36) << 6), class408.method3277(255, var37 >> 2));
                           ++var17;
                           if (~var9 >= ~var17) {
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
                     if (~var10 >= ~var16) {
                        var38 = var12;
                        var12 = var11;
                        var11 = var38;
                        arg0 = var9;
                        arg3 = var10;
                        ++var7;
                        var9 >>= 1;
                        var8 >>= 1;
                        var10000 = var10 >> 1;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }

               var10 = var10000;
            }
         }
      } catch (RuntimeException var40) {
         throw class482.method3757(var40, field7256[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7256[0] : field7256[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method3707(int arg0) {
      try {
         ++field7249;
         if (arg0 <= 115) {
            this.method3702(-103, 120);
         }

         if (this.field7247 > 0) {
            this.field7244.method1599(this.field7247, this.method3699(-118), -121);
            this.field7247 = 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7256[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method3708(byte arg0) {
      try {
         label35: {
            ++field7253;
            this.field7244.method2193(this, (byte)-19);
            if (class168.field2573 != this.field7250) {
               OpenGL.glTexParameteri(this.field7248, 10241, !this.field7234 ? 9728 : 9984);
               OpenGL.glTexParameteri(this.field7248, 10240, 9728);
               if (!client.field1786) {
                  break label35;
               }
            }

            OpenGL.glTexParameteri(this.field7248, 10241, this.field7234 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field7248, 10240, 9729);
         }

         if (arg0 > -68) {
            this.method3699(-51);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7256[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method214(int arg0) {
      try {
         ++field7236;
         int var2 = this.field7244.method2241(-114);
         if (arg0 < 44) {
            this.field7234 = false;
         }

         int var3 = this.field7244.field2735[var2];
         if (~this.field7248 != ~var3) {
            if (~var3 != -1) {
               OpenGL.glBindTexture(var3, 0);
               OpenGL.glDisable(var3);
            }

            OpenGL.glEnable(this.field7248);
            this.field7244.field2735[var2] = this.field7248;
         }

         OpenGL.glBindTexture(this.field7248, this.field7247);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7256[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "<init>",
      descriptor = "(Lcka;ILeh;Lpc;IZ)V"
   )
   public class476(class174 arg0, int arg1, class19 arg2, class650 arg3, int arg4, boolean arg5) {
      try {
         this.field7239 = arg3;
         this.field7234 = arg5;
         this.field7246 = arg2;
         this.field7240 = arg4;
         this.field7248 = arg1;
         this.field7244 = arg0;
         OpenGL.glGenTextures(1, class391.field6146, 0);
         this.field7247 = class391.field6146[0];
         this.method3708((byte)-125);
         this.method3702(1, 0);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7256[15] + (arg0 != null ? field7256[0] : field7256[2]) + ',' + arg1 + ',' + (arg2 != null ? field7256[0] : field7256[2]) + ',' + (arg3 != null ? field7256[0] : field7256[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3709(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3710(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
