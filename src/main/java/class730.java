import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class730 {
   @OriginalMember(
      owner = "client!ic",
      name = "d",
      descriptor = "I"
   )
   public int field10691;
   @OriginalMember(
      owner = "client!ic",
      name = "j",
      descriptor = "Z"
   )
   public boolean field10684;
   @OriginalMember(
      owner = "client!ic",
      name = "e",
      descriptor = "Z"
   )
   public boolean field10683;
   @OriginalMember(
      owner = "client!ic",
      name = "k",
      descriptor = "[S"
   )
   public short[] field10681;
   @OriginalMember(
      owner = "client!ic",
      name = "i",
      descriptor = "I"
   )
   public int field10687;
   @OriginalMember(
      owner = "client!ic",
      name = "n",
      descriptor = "I"
   )
   private int field10682;
   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10695 = new String[]{method5312(method5311(")&d9\u001e")), method5312(method5311("<}&{")), method5312(method5311(";kdQK")), method5312(method5311(";kdSK")), method5312(method5311(";kd+\n<a>)K")), method5312(method5311(";kdPK")), method5312(method5311(";kdTK")), method5312(method5311(";kdRK")), method5312(method5311(";kdVK")), method5312(method5311(";kdUK"))};
   @OriginalMember(
      owner = "client!ic",
      name = "g",
      descriptor = "I"
   )
   public static int field10677;
   @OriginalMember(
      owner = "client!ic",
      name = "l",
      descriptor = "I"
   )
   public static int field10678;
   @OriginalMember(
      owner = "client!ic",
      name = "m",
      descriptor = "I"
   )
   private int field10679;
   @OriginalMember(
      owner = "client!ic",
      name = "q",
      descriptor = "I"
   )
   public static int field10680;
   @OriginalMember(
      owner = "client!ic",
      name = "f",
      descriptor = "I"
   )
   public static int field10685;
   @OriginalMember(
      owner = "client!ic",
      name = "o",
      descriptor = "I"
   )
   public static int field10686;
   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "I"
   )
   public static int field10688;
   @OriginalMember(
      owner = "client!ic",
      name = "s",
      descriptor = "I"
   )
   private int field10689;
   @OriginalMember(
      owner = "client!ic",
      name = "p",
      descriptor = "I"
   )
   private int field10690;
   @OriginalMember(
      owner = "client!ic",
      name = "r",
      descriptor = "I"
   )
   public static int field10692;
   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "I"
   )
   private int field10693;
   @OriginalMember(
      owner = "client!ic",
      name = "h",
      descriptor = "I"
   )
   public static int field10694;
   @OriginalMember(
      owner = "client!ic",
      name = "c",
      descriptor = "Loda;"
   )
   public class127 field10676;

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method5304(boolean arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg1 != 2048) {
            this.method5305(-79, (class65)null, 13, 105, -107, 52, 50);
         }

         int var5;
         label74: {
            ++field10692;
            if (arg0) {
               var5 = 2048;
               if (!var4) {
                  break label74;
               }
            }

            label75: {
               int var6;
               label62: {
                  label61: {
                     label60: {
                        label59: {
                           var6 = 2047 & this.field10690 * arg2 / 50 + this.field10682;
                           int var7 = this.field10689;
                           if (~var7 != -2) {
                              if (~var7 == -4) {
                                 break label59;
                              }

                              if (~var7 == -5) {
                                 break label60;
                              }

                              if (~var7 == -3) {
                                 break label61;
                              }

                              if (var7 != 5) {
                                 break label75;
                              }

                              if (!var4) {
                                 break label62;
                              }
                           }

                           var5 = (class192.field2342[var6 << 3] >> 4) + 1024;
                           if (!var4) {
                              break label74;
                           }
                        }

                        var5 = class457.field6267[var6] >> 1;
                        if (!var4) {
                           break label74;
                        }
                     }

                     var5 = var6 >> 10 << 11;
                     if (!var4) {
                        break label74;
                     }
                  }

                  var5 = var6;
                  if (!var4) {
                     break label74;
                  }
               }

               var5 = (~var6 <= -1025 ? 2048 - var6 : var6) << 1;
               if (!var4) {
                  break label74;
               }
            }

            var5 = 2048;
         }

         this.field10676.method76(-1, (float)((this.field10693 * var5 >> 11) + this.field10679) / 2048.0F);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10695[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(ILha;IIIII)V"
   )
   private final void method5305(int arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg2 != -1) {
            this.field10684 = false;
         }

         this.field10676 = arg1.method591(arg5, arg3, arg6, arg0, arg4, 1.0F);
         ++field10688;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10695[9] + arg0 + ',' + (arg1 != null ? field10695[0] : field10695[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method5306(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         label152: {
            label151: {
               label150: {
                  label149: {
                     label148: {
                        label147: {
                           label146: {
                              label145: {
                                 label144: {
                                    label143: {
                                       label142: {
                                          label141: {
                                             label140: {
                                                label139: {
                                                   label138: {
                                                      label137: {
                                                         int var3 = this.field10687;
                                                         if (~var3 != -3) {
                                                            if (~var3 == -4) {
                                                               break label137;
                                                            }

                                                            if (var3 == 4) {
                                                               break label138;
                                                            }

                                                            if (~var3 == -6) {
                                                               break label139;
                                                            }

                                                            if (~var3 == -13) {
                                                               break label140;
                                                            }

                                                            if (~var3 == -14) {
                                                               break label141;
                                                            }

                                                            if (~var3 == -11) {
                                                               break label142;
                                                            }

                                                            if (~var3 == -12) {
                                                               break label143;
                                                            }

                                                            if (~var3 == -7) {
                                                               break label144;
                                                            }

                                                            if (var3 == 7) {
                                                               break label145;
                                                            }

                                                            if (~var3 == -9) {
                                                               break label146;
                                                            }

                                                            if (var3 == 9) {
                                                               break label147;
                                                            }

                                                            if (var3 == 14) {
                                                               break label148;
                                                            }

                                                            if (var3 == 15) {
                                                               break label149;
                                                            }

                                                            if (~var3 != -17) {
                                                               break label151;
                                                            }

                                                            if (!var2) {
                                                               break label150;
                                                            }
                                                         }

                                                         this.field10679 = 0;
                                                         this.field10689 = 1;
                                                         this.field10690 = 2048;
                                                         this.field10693 = 2048;
                                                         if (!var2) {
                                                            break label152;
                                                         }
                                                      }

                                                      this.field10689 = 1;
                                                      this.field10690 = 4096;
                                                      this.field10679 = 0;
                                                      this.field10693 = 2048;
                                                      if (!var2) {
                                                         break label152;
                                                      }
                                                   }

                                                   this.field10679 = 0;
                                                   this.field10693 = 2048;
                                                   this.field10690 = 2048;
                                                   this.field10689 = 4;
                                                   if (!var2) {
                                                      break label152;
                                                   }
                                                }

                                                this.field10693 = 2048;
                                                this.field10690 = 8192;
                                                this.field10689 = 4;
                                                this.field10679 = 0;
                                                if (!var2) {
                                                   break label152;
                                                }
                                             }

                                             this.field10679 = 0;
                                             this.field10690 = 2048;
                                             this.field10689 = 2;
                                             this.field10693 = 2048;
                                             if (!var2) {
                                                break label152;
                                             }
                                          }

                                          this.field10679 = 0;
                                          this.field10693 = 2048;
                                          this.field10690 = 8192;
                                          this.field10689 = 2;
                                          if (!var2) {
                                             break label152;
                                          }
                                       }

                                       this.field10690 = 2048;
                                       this.field10679 = 1536;
                                       this.field10689 = 3;
                                       this.field10693 = 512;
                                       if (!var2) {
                                          break label152;
                                       }
                                    }

                                    this.field10689 = 3;
                                    this.field10679 = 1536;
                                    this.field10693 = 512;
                                    this.field10690 = 4096;
                                    if (!var2) {
                                       break label152;
                                    }
                                 }

                                 this.field10690 = 2048;
                                 this.field10693 = 768;
                                 this.field10689 = 3;
                                 this.field10679 = 1280;
                                 if (!var2) {
                                    break label152;
                                 }
                              }

                              this.field10689 = 3;
                              this.field10679 = 1280;
                              this.field10690 = 4096;
                              this.field10693 = 768;
                              if (!var2) {
                                 break label152;
                              }
                           }

                           this.field10679 = 1024;
                           this.field10689 = 3;
                           this.field10690 = 2048;
                           this.field10693 = 1024;
                           if (!var2) {
                              break label152;
                           }
                        }

                        this.field10693 = 1024;
                        this.field10690 = 4096;
                        this.field10679 = 1024;
                        this.field10689 = 3;
                        if (!var2) {
                           break label152;
                        }
                     }

                     this.field10693 = 768;
                     this.field10689 = 1;
                     this.field10679 = 1280;
                     this.field10690 = 2048;
                     if (!var2) {
                        break label152;
                     }
                  }

                  this.field10679 = 1536;
                  this.field10693 = 512;
                  this.field10690 = 4096;
                  this.field10689 = 1;
                  if (!var2) {
                     break label152;
                  }
               }

               this.field10693 = 256;
               this.field10679 = 1792;
               this.field10689 = 1;
               this.field10690 = 8192;
               if (!var2) {
                  break label152;
               }
            }

            this.field10689 = 0;
            this.field10690 = 2048;
            this.field10693 = 2048;
            this.field10679 = 0;
         }

         if (!arg0) {
            this.field10693 = 33;
         }

         ++field10694;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10695[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method5307(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg3 != -15746) {
            method5310(true, 31L);
         }

         this.field10689 = arg1;
         this.field10690 = arg2;
         ++field10680;
         this.field10679 = arg0;
         this.field10693 = arg4;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10695[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(IIIILsq;IIILjh;III)V"
   )
   public static final void method5308(int arg0, int arg1, int arg2, int arg3, class190 arg4, int arg5, int arg6, int arg7, class169 arg8, int arg9, int arg10, int arg11) {
      try {
         class257.field3288 = null;
         class188.field2306 = null;
         class619.field8653 = arg2;
         ++field10686;
         class577.field7922 = arg6;
         class435.field6050 = arg3;
         class135.field1753 = arg5;
         class384.field5381 = arg8;
         class766.field11056 = arg9;
         if (arg0 <= 71) {
            method5309((byte)98);
         }

         class299.field3957 = arg10;
         class186.field2280 = arg1;
         class252.field3201 = arg7;
         class622.field8692 = null;
         class348.field4998 = arg4;
         class131.field1656 = arg11;
         class158.method1285(127);
         class432.field6034 = true;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field10695[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10695[0] : field10695[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field10695[0] : field10695[1]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(B)[Lsca;"
   )
   public static final class49[] method5309(byte arg0) {
      try {
         ++field10677;
         int var1 = -18 / ((-11 - arg0) / 40);
         return new class49[]{class718.field10519, class169.field2129, class403.field5647};
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10695[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(ZJ)V"
   )
   public static final void method5310(boolean arg0, long arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10678;
         int var4 = class219.field2735 + class278.field3709.field999;
         int var5 = class397.field5584 + class278.field3709.field1003;
         if (~(class109.field1383 - var4) > 1999 || -var4 + class109.field1383 > 2000 || -var5 + class682.field10004 < -2000 || ~(class682.field10004 - var5) < -2001) {
            class682.field10004 = var5;
            class109.field1383 = var4;
         }

         if (~class109.field1383 != ~var4) {
            int var7;
            label96: {
               int var6 = -class109.field1383 + var4;
               var7 = (int)((long)var6 * arg1 / 320L);
               if (var6 <= 0) {
                  if (var7 != 0) {
                     if (var6 <= var7) {
                        break label96;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label96;
                     }
                  }

                  var7 = -1;
                  if (!var3) {
                     break label96;
                  }
               }

               if (~var7 != -1) {
                  if (var6 >= var7) {
                     break label96;
                  }

                  var7 = var6;
                  if (!var3) {
                     break label96;
                  }
               }

               var7 = 1;
            }

            class109.field1383 += var7;
         }

         if (class682.field10004 != var5) {
            int var9;
            label97: {
               int var8 = var5 - class682.field10004;
               var9 = (int)((long)var8 * arg1 / 320L);
               if (~var8 >= -1) {
                  if (~var9 == -1) {
                     var9 = -1;
                     if (!var3) {
                        break label97;
                     }
                  }

                  if (~var9 <= ~var8) {
                     break label97;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label97;
                  }
               }

               if (~var9 != -1) {
                  if (var9 <= var8) {
                     break label97;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label97;
                  }
               }

               var9 = 1;
            }

            class682.field10004 += var9;
         }

         if (!arg0) {
            method5308(80, 37, -96, 6, (class190)null, -58, 34, -55, (class169)null, -15, -15, -19);
         }

         class363.field5142 += (float)arg1 * class157.field2018 / 6.0F;
         class676.field9918 += (float)arg1 * class138.field1784 / 6.0F;
         class373.method2887(-108);
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field10695[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "<init>",
      descriptor = "()V"
   )
   protected class730() {
      try {
         if (class457.field6267 == null) {
            class354.method2780((byte)-22);
         }

         this.method5306(true);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10695[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "<init>",
      descriptor = "(Lha;Lwm;I)V"
   )
   public class730(class65 arg0, class594 arg1, int arg2) {
      boolean var4 = client.field4273;
      super();

      try {
         if (class457.field6267 == null) {
            class354.method2780((byte)-22);
         }

         this.field10691 = arg1.method4288((byte)83);
         this.field10684 = (this.field10691 & 8) != 0;
         this.field10683 = ~(this.field10691 & 16) != -1;
         this.field10691 &= 7;
         int var5 = arg1.method4280(-19104) << arg2;
         int var6 = arg1.method4280(-19104) << arg2;
         int var7 = arg1.method4280(-19104) << arg2;
         int var8 = arg1.method4288((byte)126);
         int var9 = var8 * 2 - -1;
         this.field10681 = new short[var9];
         int var10 = 0;
         int var12;
         int var13;
         if (var4) {
            short var11 = (short)arg1.method4280(-19104);
            var12 = var11 >>> 8;
            var13 = var11 & 255;
            if (var9 <= var12) {
               var12 = var9 + -1;
            }

            if (var13 > -var12 + var9) {
               var13 = var9 - var12;
            }

            this.field10681[var10] = (short)class283.method2155(var12 << 8, var13);
            ++var10;
         }

         while(true) {
            int var10000;
            if (var10 >= this.field10681.length) {
               var10000 = (var8 << class76.field965) + class187.field2291;
               if (!var4) {
                  int var14 = var10000;
                  int var15 = class661.field9422 != null ? class661.field9422[arg1.method4280(-19104)] : class757.field10972[class210.method1598(arg1.method4280(-19104), 127) & 65535];
                  int var16 = arg1.method4288((byte)113);
                  this.field10687 = var16 & 31;
                  this.field10682 = (var16 & 224) << 3;
                  if (~this.field10687 != -32) {
                     this.method5306(true);
                  }

                  this.method5305(var14, arg0, -1, var7, var15, var5, var6);
                  return;
               }
            } else {
               var10000 = (short)arg1.method4280(-19104);
            }

            int var19 = var10000;
            var12 = var19 >>> 8;
            var13 = var19 & 255;
            if (var9 <= var12) {
               var12 = var9 + -1;
            }

            if (var13 > -var12 + var9) {
               var13 = var9 - var12;
            }

            this.field10681[var10] = (short)class283.method2155(var12 << 8, var13);
            ++var10;
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field10695[4] + (arg0 != null ? field10695[0] : field10695[1]) + ',' + (arg1 != null ? field10695[0] : field10695[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5311(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5312(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
