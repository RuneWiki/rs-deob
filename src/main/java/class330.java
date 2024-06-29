import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class330 {
   @OriginalMember(
      owner = "client!hja",
      name = "h",
      descriptor = "I"
   )
   public int field5008;
   @OriginalMember(
      owner = "client!hja",
      name = "n",
      descriptor = "Z"
   )
   public boolean field4998;
   @OriginalMember(
      owner = "client!hja",
      name = "e",
      descriptor = "Z"
   )
   public boolean field5000;
   @OriginalMember(
      owner = "client!hja",
      name = "r",
      descriptor = "[S"
   )
   public short[] field4997;
   @OriginalMember(
      owner = "client!hja",
      name = "p",
      descriptor = "I"
   )
   private int field5004;
   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "I"
   )
   public int field5009;
   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5015 = new String[]{method2696(method2695("U\u000e;\n\u0002T\n3P\u0000\u0015")), method2696(method2695("S\u00116H")), method2696(method2695("FJt\nC")), method2696(method2695("U\u000e;\nx\u0015")), method2696(method2695("U\u000e;\ny\u0015")), method2696(method2695("U\u000e;\n|\u0015")), method2696(method2695("U\u000e;\nz\u0015")), method2696(method2695("U\u000e;\n}\u0015")), method2696(method2695("U\u000e;\n{\u0015")), method2696(method2695("U\u000e;\n\u007f\u0015"))};
   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "Lsja;"
   )
   public static class671 field5011 = class492.method3807((byte)93);
   @OriginalMember(
      owner = "client!hja",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field5014 = new int[32];
   @OriginalMember(
      owner = "client!hja",
      name = "d",
      descriptor = "I"
   )
   public static int field4996;
   @OriginalMember(
      owner = "client!hja",
      name = "s",
      descriptor = "I"
   )
   public static int field4999;
   @OriginalMember(
      owner = "client!hja",
      name = "m",
      descriptor = "I"
   )
   public static int field5001;
   @OriginalMember(
      owner = "client!hja",
      name = "q",
      descriptor = "I"
   )
   private int field5002;
   @OriginalMember(
      owner = "client!hja",
      name = "o",
      descriptor = "I"
   )
   public static int field5005;
   @OriginalMember(
      owner = "client!hja",
      name = "g",
      descriptor = "I"
   )
   private int field5006;
   @OriginalMember(
      owner = "client!hja",
      name = "k",
      descriptor = "I"
   )
   public static int field5007;
   @OriginalMember(
      owner = "client!hja",
      name = "c",
      descriptor = "I"
   )
   private int field5010;
   @OriginalMember(
      owner = "client!hja",
      name = "l",
      descriptor = "I"
   )
   public static int field5012;
   @OriginalMember(
      owner = "client!hja",
      name = "f",
      descriptor = "I"
   )
   private int field5013;
   @OriginalMember(
      owner = "client!hja",
      name = "j",
      descriptor = "Llja;"
   )
   public class404 field5003;

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method2688(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field5002 = arg3;
         this.field5006 = arg4;
         if (arg1 > -76) {
            this.field5002 = 83;
         }

         this.field5013 = arg2;
         this.field5010 = arg0;
         ++field5005;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5015[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IIIZLha;II)V"
   )
   private final void method2689(int arg0, int arg1, int arg2, boolean arg3, class610 arg4, int arg5, int arg6) {
      try {
         ++field5012;
         if (!arg3) {
            field5014 = null;
         }

         this.field5003 = arg4.method583(arg6, arg0, arg5, arg1, arg2, 1.0F);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5015[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5015[2] : field5015[1]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IB)Llu;"
   )
   public static final class169 method2690(int arg0, byte arg1) {
      try {
         ++field5001;
         if (arg0 >= 0 && ~arg0 > -101) {
            if (arg1 < 99) {
               field5014 = null;
            }

            return class257.field3912[arg0];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5015[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2691(int arg0) {
      try {
         if (arg0 != 18855) {
            method2691(-114);
         }

         field5014 = null;
         field5011 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5015[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method2692(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         if (arg5 < 1) {
            arg5 = 1;
         }

         ++field4999;
         if (~arg3 > -2) {
            arg3 = 1;
         }

         int var7;
         label59: {
            var7 = arg5 - 334;
            if (var7 < 0) {
               var7 = 0;
               if (!var6) {
                  break label59;
               }
            }

            if (var7 > 100) {
               var7 = 100;
            }
         }

         int var8;
         label54: {
            var8 = (-class693.field10308 + class228.field3474) * var7 / 100 + class693.field10308;
            if (var8 < class355.field5465) {
               var8 = class355.field5465;
               if (!var6) {
                  break label54;
               }
            }

            if (~var8 < ~class586.field8664) {
               var8 = class586.field8664;
            }
         }

         label49: {
            int var9 = arg5 * var8 * arg2 / (arg3 * 334);
            if (~var9 > ~class406.field6332) {
               var9 = class406.field6332;
               var8 = arg3 * var9 * 334 / (arg5 * 512);
               if (~var8 >= ~class586.field8664) {
                  break label49;
               }

               var8 = class586.field8664;
               int var10 = var8 * 512 * arg5 / (var9 * 334);
               int var11 = (-var10 + arg3) / 2;
               if (arg1) {
                  class351.field5356.method701();
                  class351.field5356.method4502(arg0, 0, -16777216, var11, arg4, arg5);
                  class351.field5356.method4502(arg0 + arg3 - var11, arg2 + -512, -16777216, var11, arg4, arg5);
               }

               arg0 += var11;
               arg3 -= var11 * 2;
               if (!var6) {
                  break label49;
               }
            }

            if (~class85.field1249 > ~var9) {
               short var12 = class85.field1249;
               var8 = arg3 * var12 * 334 / (arg5 * 512);
               if (~var8 > ~class355.field5465) {
                  var8 = class355.field5465;
                  int var13 = arg3 * var12 * 334 / (var8 * 512);
                  int var14 = (-var13 + arg5) / 2;
                  if (arg1) {
                     class351.field5356.method701();
                     class351.field5356.method4502(arg0, arg2 ^ 512, -16777216, arg3, arg4, var14);
                     class351.field5356.method4502(arg0, arg2 + -512, -16777216, arg3, arg4 + arg5 + -var14, var14);
                  }

                  arg4 += var14;
                  arg5 -= var14 * 2;
               }
            }
         }

         class250.field3801 = (short)arg3;
         class98.field1379 = arg5 * var8 / 334;
         class708.field10660 = arg0;
         class445.field6840 = arg4;
         class735.field10947 = (short)arg5;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field5015[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method2693(int arg0, boolean arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field5007;
         if (arg2 != -15859) {
            this.field4998 = true;
         }

         int var5;
         label74: {
            if (arg1) {
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
                           var6 = this.field5010 * arg0 / 50 + this.field5004 & 2047;
                           int var7 = this.field5002;
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

                           var5 = (class83.field1196[var6 << 3] >> 4) + 1024;
                           if (!var4) {
                              break label74;
                           }
                        }

                        var5 = class595.field8750[var6] >> 1;
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

               var5 = (var6 < 1024 ? var6 : -var6 + 2048) << 1;
               if (!var4) {
                  break label74;
               }
            }

            var5 = 2048;
         }

         this.field5003.method151((byte)-115, (float)((this.field5006 * var5 >> 11) + this.field5013) / 2048.0F);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5015[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method2694(int arg0) {
      boolean var2 = client.field1786;

      try {
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
                                             label136: {
                                                label135: {
                                                   label134: {
                                                      label133: {
                                                         int var3 = this.field5009;
                                                         if (var3 != 2) {
                                                            if (var3 == 3) {
                                                               break label133;
                                                            }

                                                            if (~var3 == -5) {
                                                               break label134;
                                                            }

                                                            if (var3 == 5) {
                                                               break label135;
                                                            }

                                                            if (var3 == 12) {
                                                               break label136;
                                                            }

                                                            if (var3 == 13) {
                                                               break label137;
                                                            }

                                                            if (var3 == 10) {
                                                               break label138;
                                                            }

                                                            if (var3 == 11) {
                                                               break label139;
                                                            }

                                                            if (var3 == 6) {
                                                               break label140;
                                                            }

                                                            if (~var3 == -8) {
                                                               break label141;
                                                            }

                                                            if (var3 == 8) {
                                                               break label142;
                                                            }

                                                            if (~var3 == -10) {
                                                               break label143;
                                                            }

                                                            if (var3 == 14) {
                                                               break label144;
                                                            }

                                                            if (var3 == 15) {
                                                               break label145;
                                                            }

                                                            if (var3 != 16) {
                                                               break label147;
                                                            }

                                                            if (!var2) {
                                                               break label146;
                                                            }
                                                         }

                                                         this.field5010 = 2048;
                                                         this.field5006 = 2048;
                                                         this.field5013 = 0;
                                                         this.field5002 = 1;
                                                         if (!var2) {
                                                            break label148;
                                                         }
                                                      }

                                                      this.field5013 = 0;
                                                      this.field5002 = 1;
                                                      this.field5010 = 4096;
                                                      this.field5006 = 2048;
                                                      if (!var2) {
                                                         break label148;
                                                      }
                                                   }

                                                   this.field5002 = 4;
                                                   this.field5013 = 0;
                                                   this.field5010 = 2048;
                                                   this.field5006 = 2048;
                                                   if (!var2) {
                                                      break label148;
                                                   }
                                                }

                                                this.field5002 = 4;
                                                this.field5010 = 8192;
                                                this.field5013 = 0;
                                                this.field5006 = 2048;
                                                if (!var2) {
                                                   break label148;
                                                }
                                             }

                                             this.field5013 = 0;
                                             this.field5002 = 2;
                                             this.field5010 = 2048;
                                             this.field5006 = 2048;
                                             if (!var2) {
                                                break label148;
                                             }
                                          }

                                          this.field5013 = 0;
                                          this.field5002 = 2;
                                          this.field5006 = 2048;
                                          this.field5010 = 8192;
                                          if (!var2) {
                                             break label148;
                                          }
                                       }

                                       this.field5002 = 3;
                                       this.field5013 = 1536;
                                       this.field5010 = 2048;
                                       this.field5006 = 512;
                                       if (!var2) {
                                          break label148;
                                       }
                                    }

                                    this.field5006 = 512;
                                    this.field5002 = 3;
                                    this.field5013 = 1536;
                                    this.field5010 = 4096;
                                    if (!var2) {
                                       break label148;
                                    }
                                 }

                                 this.field5010 = 2048;
                                 this.field5013 = 1280;
                                 this.field5002 = 3;
                                 this.field5006 = 768;
                                 if (!var2) {
                                    break label148;
                                 }
                              }

                              this.field5010 = 4096;
                              this.field5006 = 768;
                              this.field5002 = 3;
                              this.field5013 = 1280;
                              if (!var2) {
                                 break label148;
                              }
                           }

                           this.field5002 = 3;
                           this.field5006 = 1024;
                           this.field5013 = 1024;
                           this.field5010 = 2048;
                           if (!var2) {
                              break label148;
                           }
                        }

                        this.field5013 = 1024;
                        this.field5006 = 1024;
                        this.field5002 = 3;
                        this.field5010 = 4096;
                        if (!var2) {
                           break label148;
                        }
                     }

                     this.field5013 = 1280;
                     this.field5002 = 1;
                     this.field5010 = 2048;
                     this.field5006 = 768;
                     if (!var2) {
                        break label148;
                     }
                  }

                  this.field5006 = 512;
                  this.field5002 = 1;
                  this.field5010 = 4096;
                  this.field5013 = 1536;
                  if (!var2) {
                     break label148;
                  }
               }

               this.field5006 = 256;
               this.field5002 = 1;
               this.field5013 = 1792;
               this.field5010 = 8192;
               if (!var2) {
                  break label148;
               }
            }

            this.field5006 = 2048;
            this.field5013 = 0;
            this.field5010 = 2048;
            this.field5002 = 0;
         }

         int var4 = 120 % ((arg0 - 54) / 51);
         ++field4996;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5015[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "<init>",
      descriptor = "()V"
   )
   protected class330() {
      try {
         if (class595.field8750 == null) {
            class290.method2447(true);
         }

         this.method2694(114);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5015[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "<init>",
      descriptor = "(Lha;Lica;I)V"
   )
   public class330(class610 arg0, class354 arg1, int arg2) {
      boolean var4 = client.field1786;
      super();

      try {
         if (class595.field8750 == null) {
            class290.method2447(true);
         }

         this.field5008 = arg1.method2855(-31007);
         this.field4998 = (8 & this.field5008) != 0;
         this.field5000 = (16 & this.field5008) != 0;
         this.field5008 &= 7;
         int var5 = arg1.method2848(-92) << arg2;
         int var6 = arg1.method2848(-109) << arg2;
         int var7 = arg1.method2848(-125) << arg2;
         int var8 = arg1.method2855(-31007);
         int var9 = var8 * 2 + 1;
         this.field4997 = new short[var9];
         int var10 = 0;
         int var12;
         int var13;
         if (var4) {
            short var11 = (short)arg1.method2848(-93);
            var12 = var11 >>> 8;
            if (var9 <= var12) {
               var12 = var9 + -1;
            }

            var13 = var11 & 255;
            if (~(-var12 + var9) > ~var13) {
               var13 = -var12 + var9;
            }

            this.field4997[var10] = (short)class119.method1087(var12 << 8, var13);
            ++var10;
         }

         while(true) {
            int var10000;
            if (~var10 <= ~this.field4997.length) {
               var10000 = (var8 << class394.field6180) + class42.field564;
               if (!var4) {
                  int var14 = var10000;
                  int var15 = class228.field3503 != null ? class228.field3503[arg1.method2848(-100)] : class77.field1028[65535 & class221.method1909((byte)-70, arg1.method2848(-94))];
                  int var16 = arg1.method2855(-31007);
                  this.field5004 = (var16 & 224) << 3;
                  this.field5009 = var16 & 31;
                  if (this.field5009 != 31) {
                     this.method2694(107);
                  }

                  this.method2689(var7, var14, var15, true, arg0, var6, var5);
                  return;
               }
            } else {
               var10000 = (short)arg1.method2848(-93);
            }

            int var19 = var10000;
            var12 = var19 >>> 8;
            if (var9 <= var12) {
               var12 = var9 + -1;
            }

            var13 = var19 & 255;
            if (~(-var12 + var9) > ~var13) {
               var13 = -var12 + var9;
            }

            this.field4997[var10] = (short)class119.method1087(var12 << 8, var13);
            ++var10;
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field5015[0] + (arg0 != null ? field5015[2] : field5015[1]) + ',' + (arg1 != null ? field5015[2] : field5015[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2695(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2696(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
