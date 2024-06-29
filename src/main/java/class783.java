import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class783 extends class305 {
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[I"
   )
   private int[] field11461;
   @OriginalMember(
      owner = "client!lr",
      name = "F",
      descriptor = "[I"
   )
   private int[] field11468;
   @OriginalMember(
      owner = "client!lr",
      name = "A",
      descriptor = "Lou;"
   )
   private class629 field11465;
   @OriginalMember(
      owner = "client!lr",
      name = "y",
      descriptor = "Lou;"
   )
   private class629 field11466;
   @OriginalMember(
      owner = "client!lr",
      name = "D",
      descriptor = "Lou;"
   )
   private class629 field11459;
   @OriginalMember(
      owner = "client!lr",
      name = "C",
      descriptor = "[Lou;"
   )
   private class629[] field11463;
   @OriginalMember(
      owner = "client!lr",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11472 = new String[]{method5660(method5659("\u0013\u0017-w\u0017")), method5660(method5659("\u0004K-\u001fB")), method5660(method5659("\u0011\u0010o]")), method5660(method5659("\u0013\u0017-p\u0017")), method5660(method5659("\u0013\u0017-\rV\u0011\fw\u000f\u0017")), method5660(method5659("\u0013\u0017-u\u0017")), method5660(method5659("\u0013\u0017-r\u0017")), method5660(method5659("\u0013\u0017-s\u0017")), method5660(method5659("\u0013\u0017-t\u0017"))};
   @OriginalMember(
      owner = "client!lr",
      name = "E",
      descriptor = "F"
   )
   public static float field11462;
   @OriginalMember(
      owner = "client!lr",
      name = "w",
      descriptor = "I"
   )
   public static int field11460;
   @OriginalMember(
      owner = "client!lr",
      name = "x",
      descriptor = "I"
   )
   public static int field11467;
   @OriginalMember(
      owner = "client!lr",
      name = "B",
      descriptor = "I"
   )
   public static int field11469;
   @OriginalMember(
      owner = "client!lr",
      name = "v",
      descriptor = "I"
   )
   public static int field11470;
   @OriginalMember(
      owner = "client!lr",
      name = "G",
      descriptor = "I"
   )
   public static int field11471;
   @OriginalMember(
      owner = "client!lr",
      name = "H",
      descriptor = "Lhw;"
   )
   public static class141 field11464;

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IZLhw;I)Lph;",
      line = 4
   )
   public static final class668 method5653(int arg0, boolean arg1, class141 arg2, int arg3) {
      try {
         ++field11469;
         if (!arg1) {
            method5654(74);
         }

         byte[] var4 = arg2.method1347((byte)126, arg3, arg0);
         return var4 == null ? null : new class668(var4);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11472[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11472[1] : field11472[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(I)V",
      line = 24
   )
   public static void method5654(int arg0) {
      try {
         field11464 = null;
         if (arg0 <= 29) {
            field11462 = 0.33967394F;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11472[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(DIBZILhw;Ld;)[I",
      line = 36
   )
   public final int[] method5655(double arg0, int arg1, byte arg2, boolean arg3, int arg4, class141 arg5, class160 arg6) {
      boolean var9 = client.field4564;

      try {
         class511.field7469 = arg6;
         class106.field1761 = arg5;
         ++field11470;
         if (arg2 < 47) {
            field11464 = null;
         }

         int var10 = 0;
         if (var9) {
            this.field11463[var10].method3477(15, arg4, arg1);
            ++var10;
         }

         while(true) {
            while(var10 < this.field11463.length) {
               this.field11463[var10].method3477(15, arg4, arg1);
               ++var10;
            }

            class491.method3706(arg0, 255);
            class558.method4168(arg4, 0, arg1);
            int[] var11 = new int[arg1 * arg4];
            int var12 = 0;
            int var13 = 0;
            if (!var9) {
               int var28;
               label508: {
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[][] var18;
                  int[] var19;
                  if (var9) {
                     if (this.field11466.field9166) {
                        var14 = this.field11466.method45(var13, 2048);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field11466.method243(var13, 0);
                           var16 = var18[2];
                           var15 = var18[0];
                           var17 = var18[1];
                           if (arg3) {
                              var12 = var13;
                           }

                           if (!this.field11459.field9166) {
                              var19 = this.field11459.method243(var13, 0)[0];
                              if (var9) {
                                 var19 = this.field11459.method45(var13, 2048);
                              }
                           } else {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           if (arg3) {
                              var12 = var13;
                           }

                           if (!this.field11459.field9166) {
                              var19 = this.field11459.method243(var13, 0)[0];
                              if (var9) {
                                 var19 = this.field11459.method45(var13, 2048);
                              }
                           } else {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        }
                     } else {
                        var18 = this.field11466.method243(var13, 0);
                        var16 = var18[2];
                        var15 = var18[0];
                        var17 = var18[1];
                        if (arg3) {
                           var12 = var13;
                        }

                        if (!this.field11459.field9166) {
                           var19 = this.field11459.method243(var13, 0)[0];
                           if (var9) {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     }
                  } else if (~var13 <= ~arg4) {
                     var28 = 0;
                     if (!var9) {
                        break label508;
                     }

                     var18 = this.field11466.method243(var13, 0);
                     var16 = var18[2];
                     var15 = var18[0];
                     var17 = var18[1];
                     if (arg3) {
                        var12 = var13;
                     }

                     if (!this.field11459.field9166) {
                        var19 = this.field11459.method243(var13, 0)[0];
                        if (var9) {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     } else {
                        var19 = this.field11459.method45(var13, 2048);
                     }
                  } else if (this.field11466.field9166) {
                     var14 = this.field11466.method45(var13, 2048);
                     var15 = var14;
                     var16 = var14;
                     var17 = var14;
                     if (var9) {
                        var18 = this.field11466.method243(var13, 0);
                        var16 = var18[2];
                        var15 = var18[0];
                        var17 = var18[1];
                        if (arg3) {
                           var12 = var13;
                        }

                        if (!this.field11459.field9166) {
                           var19 = this.field11459.method243(var13, 0)[0];
                           if (var9) {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     } else {
                        if (arg3) {
                           var12 = var13;
                        }

                        if (!this.field11459.field9166) {
                           var19 = this.field11459.method243(var13, 0)[0];
                           if (var9) {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     }
                  } else {
                     var18 = this.field11466.method243(var13, 0);
                     var16 = var18[2];
                     var15 = var18[0];
                     var17 = var18[1];
                     if (arg3) {
                        var12 = var13;
                     }

                     if (!this.field11459.field9166) {
                        var19 = this.field11459.method243(var13, 0)[0];
                        if (var9) {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     } else {
                        var19 = this.field11459.method45(var13, 2048);
                     }
                  }

                  while(true) {
                     label505: {
                        int var20 = arg1 - 1;
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        if (var9) {
                           var21 = var15[var20] >> 4;
                           if (var21 > 255) {
                              var21 = 255;
                              if (var21 < 0) {
                                 var21 = 0;
                              }
                           } else if (var21 < 0) {
                              var21 = 0;
                           }

                           var22 = var17[var20] >> 4;
                           if (~var22 < -256) {
                              var22 = 255;
                              if (~var22 > -1) {
                                 var22 = 0;
                              }
                           } else if (~var22 > -1) {
                              var22 = 0;
                           }

                           var23 = var16[var20] >> 4;
                           if (~var23 < -256) {
                              var23 = 255;
                              var24 = class321.field4628[var21];
                              if (~var23 > -1) {
                                 var23 = 0;
                              }
                           } else {
                              var24 = class321.field4628[var21];
                              if (~var23 > -1) {
                                 var23 = 0;
                              }
                           }
                        } else {
                           if (~var20 > -1) {
                              break label505;
                           }

                           var21 = var15[var20] >> 4;
                           if (var21 > 255) {
                              var21 = 255;
                              if (var21 < 0) {
                                 var21 = 0;
                              }
                           } else if (var21 < 0) {
                              var21 = 0;
                           }

                           var22 = var17[var20] >> 4;
                           if (~var22 < -256) {
                              var22 = 255;
                              if (~var22 > -1) {
                                 var22 = 0;
                              }
                           } else if (~var22 > -1) {
                              var22 = 0;
                           }

                           var23 = var16[var20] >> 4;
                           if (~var23 < -256) {
                              var23 = 255;
                              var24 = class321.field4628[var21];
                              if (~var23 > -1) {
                                 var23 = 0;
                              }
                           } else {
                              var24 = class321.field4628[var21];
                              if (~var23 > -1) {
                                 var23 = 0;
                              }
                           }
                        }

                        while(true) {
                           int var25 = class321.field4628[var22];
                           int var26 = class321.field4628[var23];
                           int var31;
                           if (~var24 == -1) {
                              if (var25 == 0) {
                                 if (~var26 == -1) {
                                    byte var27 = 0;
                                    if (var9) {
                                       var31 = var19[var20] >> 4;
                                       if (var31 > 255) {
                                          var31 = 255;
                                       }

                                       if (var31 < 0) {
                                          var31 = 0;
                                       }

                                       var11[var12++] = (var24 << 16) + (var25 << 8) + (var31 << 24) + var26;
                                       if (arg3) {
                                          var12 += arg1 + -1;
                                       }

                                       --var20;
                                    } else {
                                       var11[var12++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                                       if (arg3) {
                                          var12 += arg1 + -1;
                                       }

                                       --var20;
                                    }
                                 } else {
                                    var31 = var19[var20] >> 4;
                                    if (var31 > 255) {
                                       var31 = 255;
                                    }

                                    if (var31 < 0) {
                                       var31 = 0;
                                    }

                                    var11[var12++] = (var24 << 16) + (var25 << 8) + (var31 << 24) + var26;
                                    if (arg3) {
                                       var12 += arg1 + -1;
                                    }

                                    --var20;
                                 }
                              } else {
                                 var31 = var19[var20] >> 4;
                                 if (var31 > 255) {
                                    var31 = 255;
                                 }

                                 if (var31 < 0) {
                                    var31 = 0;
                                 }

                                 var11[var12++] = (var24 << 16) + (var25 << 8) + (var31 << 24) + var26;
                                 if (arg3) {
                                    var12 += arg1 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var31 = var19[var20] >> 4;
                              if (var31 > 255) {
                                 var31 = 255;
                              }

                              if (var31 < 0) {
                                 var31 = 0;
                              }

                              var11[var12++] = (var24 << 16) + (var25 << 8) + (var31 << 24) + var26;
                              if (arg3) {
                                 var12 += arg1 + -1;
                              }

                              --var20;
                           }

                           if (~var20 > -1) {
                              break;
                           }

                           var21 = var15[var20] >> 4;
                           if (var21 > 255) {
                              var21 = 255;
                              if (var21 < 0) {
                                 var21 = 0;
                              }
                           } else if (var21 < 0) {
                              var21 = 0;
                           }

                           var22 = var17[var20] >> 4;
                           if (~var22 < -256) {
                              var22 = 255;
                              if (~var22 > -1) {
                                 var22 = 0;
                              }
                           } else if (~var22 > -1) {
                              var22 = 0;
                           }

                           var23 = var16[var20] >> 4;
                           if (~var23 < -256) {
                              var23 = 255;
                              var24 = class321.field4628[var21];
                              if (~var23 > -1) {
                                 var23 = 0;
                              }
                           } else {
                              var24 = class321.field4628[var21];
                              if (~var23 > -1) {
                                 var23 = 0;
                              }
                           }
                        }
                     }

                     ++var13;
                     if (~var13 <= ~arg4) {
                        var28 = 0;
                        if (!var9) {
                           break;
                        }

                        var18 = this.field11466.method243(var13, 0);
                        var16 = var18[2];
                        var15 = var18[0];
                        var17 = var18[1];
                        if (arg3) {
                           var12 = var13;
                        }

                        if (!this.field11459.field9166) {
                           var19 = this.field11459.method243(var13, 0)[0];
                           if (var9) {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     } else if (this.field11466.field9166) {
                        var14 = this.field11466.method45(var13, 2048);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field11466.method243(var13, 0);
                           var16 = var18[2];
                           var15 = var18[0];
                           var17 = var18[1];
                           if (arg3) {
                              var12 = var13;
                           }

                           if (!this.field11459.field9166) {
                              var19 = this.field11459.method243(var13, 0)[0];
                              if (var9) {
                                 var19 = this.field11459.method45(var13, 2048);
                              }
                           } else {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           if (arg3) {
                              var12 = var13;
                           }

                           if (!this.field11459.field9166) {
                              var19 = this.field11459.method243(var13, 0)[0];
                              if (var9) {
                                 var19 = this.field11459.method45(var13, 2048);
                              }
                           } else {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        }
                     } else {
                        var18 = this.field11466.method243(var13, 0);
                        var16 = var18[2];
                        var15 = var18[0];
                        var17 = var18[1];
                        if (arg3) {
                           var12 = var13;
                        }

                        if (!this.field11459.field9166) {
                           var19 = this.field11459.method243(var13, 0)[0];
                           if (var9) {
                              var19 = this.field11459.method45(var13, 2048);
                           }
                        } else {
                           var19 = this.field11459.method45(var13, 2048);
                        }
                     }
                  }
               }

               if (var9) {
                  this.field11463[var28].method1953(102);
                  ++var28;
               }

               while(true) {
                  while(~var28 > ~this.field11463.length) {
                     this.field11463[var28].method1953(102);
                     ++var28;
                  }

                  if (!var9) {
                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field11472[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11472[1] : field11472[2]) + ',' + (arg6 != null ? field11472[1] : field11472[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(ZIILd;ZLhw;)[F",
      line = 173
   )
   public final float[] method5656(boolean arg0, int arg1, int arg2, class160 arg3, boolean arg4, class141 arg5) {
      boolean var7 = client.field4564;

      try {
         ++field11467;
         class106.field1761 = arg5;
         class511.field7469 = arg3;
         int var8 = 0;
         if (var7) {
            this.field11463[var8].method3477(-124, arg2, arg1);
            ++var8;
         }

         while(true) {
            while(~this.field11463.length < ~var8) {
               this.field11463[var8].method3477(-124, arg2, arg1);
               ++var8;
            }

            class558.method4168(arg2, 0, arg1);
            float[] var9 = new float[arg1 * arg2 * 4];
            int var10 = 0;
            int var11 = 0;
            if (!var7) {
               int var22;
               label150: {
                  int[][] var12;
                  int[] var13;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  if (var7) {
                     if (!this.field11466.field9166) {
                        var12 = this.field11466.method243(var11, 0);
                        var13 = var12[0];
                        var14 = var12[2];
                        var15 = var12[1];
                        if (var7) {
                           var16 = this.field11466.method45(var11, 2048);
                           var15 = var16;
                           var14 = var16;
                           var13 = var16;
                        }
                     } else {
                        var16 = this.field11466.method45(var11, 2048);
                        var15 = var16;
                        var14 = var16;
                        var13 = var16;
                     }
                  } else if (~var11 <= ~arg2) {
                     var22 = 0;
                     if (!var7) {
                        break label150;
                     }

                     var16 = this.field11466.method45(var11, 2048);
                     var15 = var16;
                     var14 = var16;
                     var13 = var16;
                  } else if (!this.field11466.field9166) {
                     var12 = this.field11466.method243(var11, 0);
                     var13 = var12[0];
                     var14 = var12[2];
                     var15 = var12[1];
                     if (var7) {
                        var16 = this.field11466.method45(var11, 2048);
                        var15 = var16;
                        var14 = var16;
                        var13 = var16;
                     }
                  } else {
                     var16 = this.field11466.method45(var11, 2048);
                     var15 = var16;
                     var14 = var16;
                     var13 = var16;
                  }

                  while(true) {
                     int[] var17;
                     if (this.field11459.field9166) {
                        var17 = this.field11459.method45(var11, 2048);
                        if (var7) {
                           var17 = this.field11459.method243(var11, 0)[0];
                           if (arg0) {
                              var10 = var11 << 2;
                           }
                        } else if (arg0) {
                           var10 = var11 << 2;
                        }
                     } else {
                        var17 = this.field11459.method243(var11, 0)[0];
                        if (arg0) {
                           var10 = var11 << 2;
                        }
                     }

                     int[] var18;
                     if (this.field11465.field9166) {
                        var18 = this.field11465.method45(var11, 2048);
                        if (var7) {
                           var18 = this.field11465.method243(var11, 0)[0];
                        }
                     } else {
                        var18 = this.field11465.method243(var11, 0)[0];
                     }

                     int var19 = arg1 + -1;
                     if (var7 || var19 >= 0) {
                        do {
                           float var20 = (float)var17[var19] / 4096.0F;
                           if (var20 < 0.0F) {
                              var20 = 0.0F;
                              if (var7 && var20 > 1.0F) {
                                 var20 = 1.0F;
                              }
                           } else if (var20 > 1.0F) {
                              var20 = 1.0F;
                           }

                           float var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                           var9[var10++] = (float)var13[var19] * var21;
                           var9[var10++] = (float)var15[var19] * var21;
                           var9[var10++] = (float)var14[var19] * var21;
                           var9[var10++] = var20;
                           if (arg0) {
                              var10 += (arg1 << 2) + -4;
                           }

                           --var19;
                        } while(var19 >= 0);
                     }

                     ++var11;
                     if (~var11 <= ~arg2) {
                        var22 = 0;
                        if (!var7) {
                           break;
                        }

                        var16 = this.field11466.method45(var11, 2048);
                        var15 = var16;
                        var14 = var16;
                        var13 = var16;
                     } else if (!this.field11466.field9166) {
                        var12 = this.field11466.method243(var11, 0);
                        var13 = var12[0];
                        var14 = var12[2];
                        var15 = var12[1];
                        if (var7) {
                           var16 = this.field11466.method45(var11, 2048);
                           var15 = var16;
                           var14 = var16;
                           var13 = var16;
                        }
                     } else {
                        var16 = this.field11466.method45(var11, 2048);
                        var15 = var16;
                        var14 = var16;
                        var13 = var16;
                     }
                  }
               }

               if (var7) {
                  this.field11463[var22].method1953(116);
                  ++var22;
               }

               while(true) {
                  while(var22 < this.field11463.length) {
                     this.field11463[var22].method1953(116);
                     ++var22;
                  }

                  if (!var7) {
                     if (arg4) {
                        this.field11463 = null;
                     }

                     return var9;
                  }

                  ++var22;
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class608.method4462(var24, field11472[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11472[1] : field11472[2]) + ',' + arg4 + ',' + (arg5 != null ? field11472[1] : field11472[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(DIZILd;Lhw;ZI)[I",
      line = 289
   )
   public final int[] method5657(double arg0, int arg1, boolean arg2, int arg3, class160 arg4, class141 arg5, boolean arg6, int arg7) {
      boolean var10 = client.field4564;

      try {
         ++field11471;
         class511.field7469 = arg4;
         class106.field1761 = arg5;
         if (arg1 != -5347704) {
            return null;
         } else {
            int var11 = 0;
            if (var10) {
               this.field11463[var11].method3477(112, arg3, arg7);
               ++var11;
            }

            while(true) {
               while(~this.field11463.length < ~var11) {
                  this.field11463[var11].method3477(112, arg3, arg7);
                  ++var11;
               }

               class491.method3706(arg0, 255);
               class558.method4168(arg3, 0, arg7);
               int[] var12 = new int[arg3 * arg7];
               if (!var10) {
                  int var13;
                  byte var14;
                  int var15;
                  label219: {
                     if (arg2) {
                        var13 = -1;
                        var14 = -1;
                        var15 = arg7 - 1;
                        if (!var10) {
                           break label219;
                        }
                     }

                     var14 = 1;
                     var13 = arg7;
                     var15 = 0;
                  }

                  int var31;
                  label195: {
                     int var16 = 0;
                     int var17 = 0;
                     int[][] var18;
                     int[] var19;
                     int[] var20;
                     int[] var21;
                     int[] var22;
                     if (var10) {
                        if (!this.field11466.field9166) {
                           var18 = this.field11466.method243(var17, 0);
                           var19 = var18[0];
                           var20 = var18[2];
                           var21 = var18[1];
                           if (var10) {
                              var22 = this.field11466.method45(var17, 2048);
                              var21 = var22;
                              var20 = var22;
                              var19 = var22;
                              if (arg6) {
                                 var16 = var17;
                              }
                           } else if (arg6) {
                              var16 = var17;
                           }
                        } else {
                           var22 = this.field11466.method45(var17, 2048);
                           var21 = var22;
                           var20 = var22;
                           var19 = var22;
                           if (arg6) {
                              var16 = var17;
                           }
                        }
                     } else if (~arg3 >= ~var17) {
                        var31 = 0;
                        if (!var10) {
                           break label195;
                        }

                        var22 = this.field11466.method45(var17, 2048);
                        var21 = var22;
                        var20 = var22;
                        var19 = var22;
                        if (arg6) {
                           var16 = var17;
                        }
                     } else if (!this.field11466.field9166) {
                        var18 = this.field11466.method243(var17, 0);
                        var19 = var18[0];
                        var20 = var18[2];
                        var21 = var18[1];
                        if (var10) {
                           var22 = this.field11466.method45(var17, 2048);
                           var21 = var22;
                           var20 = var22;
                           var19 = var22;
                           if (arg6) {
                              var16 = var17;
                           }
                        } else if (arg6) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field11466.method45(var17, 2048);
                        var21 = var22;
                        var20 = var22;
                        var19 = var22;
                        if (arg6) {
                           var16 = var17;
                        }
                     }

                     while(true) {
                        int var23 = var15;
                        if (var10 || ~var13 != ~var15) {
                           do {
                              int var24 = var19[var23] >> 4;
                              if (~var24 < -256) {
                                 var24 = 255;
                              }

                              if (var24 < 0) {
                                 var24 = 0;
                              }

                              int var25 = var21[var23] >> 4;
                              if (~var25 < -256) {
                                 var25 = 255;
                              }

                              if (var25 < 0) {
                                 var25 = 0;
                              }

                              int var26 = var20[var23] >> 4;
                              if (var26 > 255) {
                                 var26 = 255;
                              }

                              int var27 = class321.field4628[var25];
                              if (~var26 > -1) {
                                 var26 = 0;
                              }

                              int var28 = class321.field4628[var24];
                              int var29 = class321.field4628[var26];
                              int var30 = (var27 << 8) + ((var28 << 16) - -var29);
                              if (var30 != 0) {
                                 var30 |= -16777216;
                              }

                              var12[var16++] = var30;
                              if (arg6) {
                                 var16 += arg7 - 1;
                              }

                              var23 += var14;
                           } while(~var13 != ~var23);
                        }

                        ++var17;
                        if (~arg3 >= ~var17) {
                           var31 = 0;
                           if (!var10) {
                              break;
                           }

                           var22 = this.field11466.method45(var17, 2048);
                           var21 = var22;
                           var20 = var22;
                           var19 = var22;
                           if (arg6) {
                              var16 = var17;
                           }
                        } else if (!this.field11466.field9166) {
                           var18 = this.field11466.method243(var17, 0);
                           var19 = var18[0];
                           var20 = var18[2];
                           var21 = var18[1];
                           if (var10) {
                              var22 = this.field11466.method45(var17, 2048);
                              var21 = var22;
                              var20 = var22;
                              var19 = var22;
                              if (arg6) {
                                 var16 = var17;
                              }
                           } else if (arg6) {
                              var16 = var17;
                           }
                        } else {
                           var22 = this.field11466.method45(var17, 2048);
                           var21 = var22;
                           var20 = var22;
                           var19 = var22;
                           if (arg6) {
                              var16 = var17;
                           }
                        }
                     }
                  }

                  if (var10) {
                     this.field11463[var31].method1953(69);
                     ++var31;
                  }

                  while(true) {
                     while(~var31 > ~this.field11463.length) {
                        this.field11463[var31].method1953(69);
                        ++var31;
                     }

                     if (!var10) {
                        return var12;
                     }

                     ++var31;
                  }
               }

               ++var11;
            }
         }
      } catch (RuntimeException var33) {
         throw class608.method4462(var33, field11472[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11472[1] : field11472[2]) + ',' + (arg5 != null ? field11472[1] : field11472[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(BLd;Lhw;)Z",
      line = 428
   )
   public final boolean method5658(byte arg0, class160 arg1, class141 arg2) {
      boolean var4 = client.field4564;

      try {
         ++field11460;
         int var5;
         int var6;
         if (class401.field5894 < 0) {
            var5 = 0;
            if (var4) {
               if (!arg2.method1335((byte)115, this.field11461[var5])) {
                  return false;
               }

               ++var5;
            }

            while(true) {
               while(this.field11461.length > var5) {
                  if (!arg2.method1335((byte)115, this.field11461[var5])) {
                     return false;
                  }

                  ++var5;
               }

               if (!var4) {
                  if (var4) {
                     var5 = 0;
                     if (var4) {
                        if (!arg2.method1339(this.field11461[var5], -85, class401.field5894)) {
                           return false;
                        }

                        ++var5;
                     }
                  } else {
                     if (!var4) {
                        if (arg0 > -36) {
                           this.field11461 = null;
                        }

                        var6 = 0;
                        if (var4) {
                           if (!arg1.method1455(this.field11468[var6], 9777)) {
                              return false;
                           }

                           ++var6;
                        }

                        while(true) {
                           while(var6 < this.field11468.length) {
                              if (!arg1.method1455(this.field11468[var6], 9777)) {
                                 return false;
                              }

                              ++var6;
                           }

                           if (!var4) {
                              return true;
                           }

                           if (false) {
                              return false;
                           }

                           ++var6;
                        }
                     }

                     if (arg0 == 0) {
                        return false;
                     }

                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var4) {
               if (!arg2.method1339(this.field11461[var5], -85, class401.field5894)) {
                  return false;
               }

               ++var5;
            }
         }

         while(true) {
            while(~this.field11461.length < ~var5) {
               if (!arg2.method1339(this.field11461[var5], -85, class401.field5894)) {
                  return false;
               }

               ++var5;
            }

            if (!var4) {
               if (arg0 > -36) {
                  this.field11461 = null;
               }

               var6 = 0;
               if (var4) {
                  if (!arg1.method1455(this.field11468[var6], 9777)) {
                     return false;
                  }

                  ++var6;
               }

               while(true) {
                  while(var6 < this.field11468.length) {
                     if (!arg1.method1455(this.field11468[var6], 9777)) {
                        return false;
                     }

                     ++var6;
                  }

                  if (!var4) {
                     return true;
                  }

                  if (false) {
                     return false;
                  }

                  ++var6;
               }
            }

            if (arg0 == 0) {
               return false;
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field11472[3] + arg0 + ',' + (arg1 != null ? field11472[1] : field11472[2]) + ',' + (arg2 != null ? field11472[1] : field11472[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "()V",
      line = 485
   )
   public class783() {
      try {
         this.field11461 = new int[0];
         this.field11468 = new int[0];
         this.field11465 = new class361(0);
         this.field11465.field9175 = 1;
         this.field11466 = new class361();
         this.field11466.field9175 = 1;
         this.field11459 = new class361();
         this.field11463 = new class629[]{this.field11466, this.field11459, this.field11465};
         this.field11459.field9175 = 1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11472[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "(Luda;)V",
      line = 501
   )
   public class783(class473 arg0) {
      boolean var2 = client.field4564;
      super();

      try {
         int var3 = arg0.method3564((byte)-128);
         int var4 = 0;
         int var5 = 0;
         this.field11463 = new class629[var3];
         int[][] var6 = new int[var3][];
         int var7 = 0;
         if (var2 || ~var7 > ~var3) {
            do {
               class629 var8 = class439.method3300(arg0, 0);
               if (~var8.method1951(-3) <= -1) {
                  ++var4;
                  if (var8.method3478((byte)112) >= 0) {
                     ++var5;
                  }
               } else if (var8.method3478((byte)112) >= 0) {
                  ++var5;
               }

               int var9 = var8.field9173.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2) {
                  var6[var7][var10] = arg0.method3564((byte)-67);
                  ++var10;
               }

               while(true) {
                  while(~var10 > ~var9) {
                     var6[var7][var10] = arg0.method3564((byte)-67);
                     ++var10;
                  }

                  this.field11463[var7] = var8;
                  if (!var2) {
                     ++var7;
                     break;
                  }

                  ++var10;
               }
            } while(~var7 > ~var3);
         }

         this.field11461 = new int[var4];
         int var11 = 0;
         this.field11468 = new int[var5];
         int var12 = 0;
         int var13 = 0;
         class629 var14;
         int var15;
         int var16;
         class783 var10000;
         Object var19;
         if (var2) {
            var14 = this.field11463[var13];
            var15 = var14.field9173.length;
            var16 = 0;
            if (var2) {
               var14.field9173[var16] = this.field11463[var6[var13][var16]];
               ++var16;
            }
         } else {
            if (var13 >= var3) {
               this.field11466 = this.field11463[arg0.method3564((byte)-126)];
               var10000 = this;
               if (!var2) {
                  this.field11459 = this.field11463[arg0.method3564((byte)-107)];
                  var19 = null;
                  this.field11465 = this.field11463[arg0.method3564((byte)-94)];
                  return;
               }
            } else {
               var10000 = this;
            }

            var14 = var10000.field11463[var13];
            var15 = var14.field9173.length;
            var16 = 0;
            if (var2) {
               var14.field9173[var16] = this.field11463[var6[var13][var16]];
               ++var16;
            }
         }

         while(true) {
            while(var15 > var16) {
               var14.field9173[var16] = this.field11463[var6[var13][var16]];
               ++var16;
            }

            int var17 = var14.method1951(-3);
            int var18 = var14.method3478((byte)120);
            if (!var2) {
               if (~var17 < -1) {
                  this.field11461[var11++] = var17;
               }

               if (~var18 < -1) {
                  this.field11468[var12++] = var18;
               }

               var6[var13] = null;
               ++var13;
               if (var13 >= var3) {
                  this.field11466 = this.field11463[arg0.method3564((byte)-126)];
                  var10000 = this;
                  if (!var2) {
                     this.field11459 = this.field11463[arg0.method3564((byte)-107)];
                     var19 = null;
                     this.field11465 = this.field11463[arg0.method3564((byte)-94)];
                     return;
                  }
               } else {
                  var10000 = this;
               }

               var14 = var10000.field11463[var13];
               var15 = var14.field9173.length;
               var16 = 0;
               if (var2) {
                  var14.field9173[var16] = this.field11463[var6[var13][var16]];
                  ++var16;
               }
            } else {
               ++var16;
            }
         }
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field11472[4] + (arg0 != null ? field11472[1] : field11472[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5659(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5660(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
