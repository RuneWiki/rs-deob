import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 {
   @OriginalMember(
      owner = "client!mca",
      name = "i",
      descriptor = "I"
   )
   public int field371;
   @OriginalMember(
      owner = "client!mca",
      name = "c",
      descriptor = "Z"
   )
   public boolean field365;
   @OriginalMember(
      owner = "client!mca",
      name = "d",
      descriptor = "Z"
   )
   public boolean field369;
   @OriginalMember(
      owner = "client!mca",
      name = "t",
      descriptor = "[S"
   )
   public short[] field368;
   @OriginalMember(
      owner = "client!mca",
      name = "s",
      descriptor = "I"
   )
   private int field361;
   @OriginalMember(
      owner = "client!mca",
      name = "r",
      descriptor = "I"
   )
   public int field370;
   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field375 = new String[]{method237(method236("(\b\u001a_z,\u0005\u0012\u0005xm")), method237(method236("(\b\u001a_\u0004m")), method237(method236("(\b\u001a_\u0001m")), method237(method236("(\b\u001a_\u0002m")), method237(method236(">EU_;")), method237(method236("+\u001e\u0017\u001d")), method237(method236("(\b\u001a_\u0000m")), method237(method236("(\b\u001a_\u0007m")), method237(method236("(\b\u001a_\u0003m")), method237(method236("(\b\u001a_\u0005m"))};
   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "Lum;"
   )
   public static class550 field359 = new class550();
   @OriginalMember(
      owner = "client!mca",
      name = "n",
      descriptor = "Loi;"
   )
   public static class79 field367 = new class79(2, 2);
   @OriginalMember(
      owner = "client!mca",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field372 = new int[2048];
   @OriginalMember(
      owner = "client!mca",
      name = "o",
      descriptor = "I"
   )
   private int field354;
   @OriginalMember(
      owner = "client!mca",
      name = "e",
      descriptor = "I"
   )
   public static int field355;
   @OriginalMember(
      owner = "client!mca",
      name = "f",
      descriptor = "I"
   )
   public static int field357;
   @OriginalMember(
      owner = "client!mca",
      name = "j",
      descriptor = "I"
   )
   private int field358;
   @OriginalMember(
      owner = "client!mca",
      name = "k",
      descriptor = "I"
   )
   public static int field360;
   @OriginalMember(
      owner = "client!mca",
      name = "p",
      descriptor = "I"
   )
   private int field362;
   @OriginalMember(
      owner = "client!mca",
      name = "u",
      descriptor = "I"
   )
   public static int field364;
   @OriginalMember(
      owner = "client!mca",
      name = "q",
      descriptor = "I"
   )
   public static int field366;
   @OriginalMember(
      owner = "client!mca",
      name = "g",
      descriptor = "I"
   )
   public static int field373;
   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "I"
   )
   private int field374;
   @OriginalMember(
      owner = "client!mca",
      name = "m",
      descriptor = "Lsa;"
   )
   public static class214 field363;
   @OriginalMember(
      owner = "client!mca",
      name = "h",
      descriptor = "Llja;"
   )
   public class744 field356;

   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "(I)V",
      line = 15
   )
   public static final void method229(int arg0) {
      try {
         ++field357;
         class321.field4575 = new class581[50];
         if (arg0 != 2048) {
            field367 = null;
         }

         class130.field1612 = 0;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field375[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(ZII)V",
      line = 27
   )
   public final void method230(boolean arg0, int arg1, int arg2) {
      int var4 = client.field4530;

      try {
         if (arg1 > -34) {
            this.method234(-89);
         }

         int var7;
         label67: {
            ++field355;
            if (!arg0) {
               label73: {
                  int var5;
                  label63: {
                     label62: {
                        label61: {
                           label60: {
                              var5 = this.field361 - -(this.field358 * arg2 / 50) & 2047;
                              int var6 = this.field354;
                              if (~var6 != -2) {
                                 if (var6 == 3) {
                                    break label60;
                                 }

                                 if (~var6 == -5) {
                                    break label61;
                                 }

                                 if (var6 == 2) {
                                    break label62;
                                 }

                                 if (~var6 != -6) {
                                    break label73;
                                 }

                                 if (var4 == 0) {
                                    break label63;
                                 }
                              }

                              var7 = (class689.field10389[var5 << 3] >> 4) + 1024;
                              if (var4 == 0) {
                                 break label67;
                              }
                           }

                           var7 = class327.field4635[var5] >> 1;
                           if (var4 == 0) {
                              break label67;
                           }
                        }

                        var7 = var5 >> 10 << 11;
                        if (var4 == 0) {
                           break label67;
                        }
                     }

                     var7 = var5;
                     if (var4 == 0) {
                        break label67;
                     }
                  }

                  var7 = (var5 < 1024 ? var5 : -var5 + 2048) << 1;
                  if (var4 == 0) {
                     break label67;
                  }
               }

               var7 = 2048;
               if (var4 == 0) {
                  break label67;
               }
            }

            var7 = 2048;
         }

         this.field356.method1398((float)((this.field374 * var7 >> 11) + this.field362) / 2048.0F, (byte)-42);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field375[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(IIIII)V",
      line = 103
   )
   public final void method231(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field366;
         this.field358 = arg0;
         this.field374 = arg4;
         this.field362 = arg1;
         if (arg3 != 1024) {
            method229(47);
         }

         this.field354 = arg2;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field375[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(IILha;Lum;I)V",
      line = 119
   )
   public static final void method232(int arg0, int arg1, class66 arg2, class550 arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field364;
         class100.field1216.method4062(0);
         if (arg4 > 64) {
            if (!class387.field5916) {
               class446 var6 = (class446)arg3.method4071((byte)126);
               if (var5 != 0 || var6 != null) {
                  do {
                     class426 var7 = class329.field4666.method3293(27767, var6.field6786);
                     if (class402.method3086((byte)22, var7)) {
                        boolean var8 = class232.method1747(arg0, (byte)30, arg1, var6, var7, arg2);
                        if (var8) {
                           class261.method1981(arg2, (byte)11, var7, var6);
                        }
                     }

                     var6 = (class446)arg3.method4059((byte)-101);
                  } while(var6 != null);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field375[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field375[4] : field375[5]) + ',' + (arg3 != null ? field375[4] : field375[5]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(B)V",
      line = 153
   )
   public static void method233(byte arg0) {
      try {
         field359 = null;
         field372 = null;
         if (arg0 > -2) {
            method232(2, -108, (class66)null, (class550)null, 62);
         }

         field367 = null;
         field363 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field375[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(I)V",
      line = 177
   )
   private final void method234(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != 1280) {
            method233((byte)21);
         }

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
                                                      label136: {
                                                         int var3 = this.field370;
                                                         if (~var3 != -3) {
                                                            if (var3 == 3) {
                                                               break label136;
                                                            }

                                                            if (var3 == 4) {
                                                               break label137;
                                                            }

                                                            if (~var3 == -6) {
                                                               break label138;
                                                            }

                                                            if (var3 == 12) {
                                                               break label139;
                                                            }

                                                            if (var3 == 13) {
                                                               break label140;
                                                            }

                                                            if (var3 == 10) {
                                                               break label141;
                                                            }

                                                            if (~var3 == -12) {
                                                               break label142;
                                                            }

                                                            if (var3 == 6) {
                                                               break label143;
                                                            }

                                                            if (~var3 == -8) {
                                                               break label144;
                                                            }

                                                            if (var3 == 8) {
                                                               break label145;
                                                            }

                                                            if (~var3 == -10) {
                                                               break label146;
                                                            }

                                                            if (var3 == 14) {
                                                               break label147;
                                                            }

                                                            if (var3 == 15) {
                                                               break label148;
                                                            }

                                                            if (~var3 != -17) {
                                                               break label150;
                                                            }

                                                            if (var2 == 0) {
                                                               break label149;
                                                            }
                                                         }

                                                         this.field374 = 2048;
                                                         this.field354 = 1;
                                                         this.field358 = 2048;
                                                         this.field362 = 0;
                                                         if (var2 == 0) {
                                                            break label151;
                                                         }
                                                      }

                                                      this.field354 = 1;
                                                      this.field358 = 4096;
                                                      this.field362 = 0;
                                                      this.field374 = 2048;
                                                      if (var2 == 0) {
                                                         break label151;
                                                      }
                                                   }

                                                   this.field358 = 2048;
                                                   this.field354 = 4;
                                                   this.field362 = 0;
                                                   this.field374 = 2048;
                                                   if (var2 == 0) {
                                                      break label151;
                                                   }
                                                }

                                                this.field354 = 4;
                                                this.field374 = 2048;
                                                this.field358 = 8192;
                                                this.field362 = 0;
                                                if (var2 == 0) {
                                                   break label151;
                                                }
                                             }

                                             this.field358 = 2048;
                                             this.field362 = 0;
                                             this.field374 = 2048;
                                             this.field354 = 2;
                                             if (var2 == 0) {
                                                break label151;
                                             }
                                          }

                                          this.field374 = 2048;
                                          this.field362 = 0;
                                          this.field354 = 2;
                                          this.field358 = 8192;
                                          if (var2 == 0) {
                                             break label151;
                                          }
                                       }

                                       this.field362 = 1536;
                                       this.field354 = 3;
                                       this.field374 = 512;
                                       this.field358 = 2048;
                                       if (var2 == 0) {
                                          break label151;
                                       }
                                    }

                                    this.field374 = 512;
                                    this.field362 = 1536;
                                    this.field354 = 3;
                                    this.field358 = 4096;
                                    if (var2 == 0) {
                                       break label151;
                                    }
                                 }

                                 this.field362 = 1280;
                                 this.field354 = 3;
                                 this.field374 = 768;
                                 this.field358 = 2048;
                                 if (var2 == 0) {
                                    break label151;
                                 }
                              }

                              this.field362 = 1280;
                              this.field374 = 768;
                              this.field358 = 4096;
                              this.field354 = 3;
                              if (var2 == 0) {
                                 break label151;
                              }
                           }

                           this.field358 = 2048;
                           this.field374 = 1024;
                           this.field354 = 3;
                           this.field362 = 1024;
                           if (var2 == 0) {
                              break label151;
                           }
                        }

                        this.field354 = 3;
                        this.field362 = 1024;
                        this.field358 = 4096;
                        this.field374 = 1024;
                        if (var2 == 0) {
                           break label151;
                        }
                     }

                     this.field354 = 1;
                     this.field374 = 768;
                     this.field362 = 1280;
                     this.field358 = 2048;
                     if (var2 == 0) {
                        break label151;
                     }
                  }

                  this.field374 = 512;
                  this.field354 = 1;
                  this.field358 = 4096;
                  this.field362 = 1536;
                  if (var2 == 0) {
                     break label151;
                  }
               }

               this.field362 = 1792;
               this.field354 = 1;
               this.field358 = 8192;
               this.field374 = 256;
               if (var2 == 0) {
                  break label151;
               }
            }

            this.field374 = 2048;
            this.field358 = 2048;
            this.field362 = 0;
            this.field354 = 0;
         }

         ++field360;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field375[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(IIIIIILha;)V",
      line = 389
   )
   private final void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class66 arg6) {
      try {
         this.field356 = arg6.method611(arg5, arg1, arg4, arg2, arg0, 1.0F);
         ++field373;
         if (arg3 != 8) {
            this.field362 = 62;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field375[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field375[4] : field375[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "<init>",
      descriptor = "()V",
      line = 400
   )
   protected class33() {
      try {
         if (class327.field4635 == null) {
            class766.method5546((byte)8);
         }

         this.method234(1280);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field375[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "<init>",
      descriptor = "(Lha;Ljj;I)V",
      line = 414
   )
   public class33(class66 arg0, class128 arg1, int arg2) {
      int var4 = client.field4530;
      super();

      try {
         if (class327.field4635 == null) {
            class766.method5546((byte)8);
         }

         this.field371 = arg1.method1104(255);
         this.field365 = (this.field371 & 8) != 0;
         this.field369 = (this.field371 & 16) != 0;
         this.field371 &= 7;
         int var5 = arg1.method1038((byte)-109) << arg2;
         int var6 = arg1.method1038((byte)-111) << arg2;
         int var7 = arg1.method1038((byte)-110) << arg2;
         int var8 = arg1.method1104(255);
         int var9 = var8 * 2 + 1;
         this.field368 = new short[var9];
         int var10 = 0;
         int var12;
         int var13;
         if (var4 != 0) {
            short var11 = (short)arg1.method1038((byte)-110);
            var12 = var11 >>> 8;
            var13 = var11 & 255;
            if (~var12 <= ~var9) {
               var12 = var9 - 1;
            }

            if (-var12 + var9 < var13) {
               var13 = -var12 + var9;
            }

            this.field368[var10] = (short)class379.method2928(var13, var12 << 8);
            ++var10;
         }

         while(true) {
            int var10000;
            if (~this.field368.length >= ~var10) {
               var10000 = (var8 << class459.field6950) + class572.field8520;
               if (var4 == 0) {
                  int var14 = var10000;
                  int var15 = class628.field9131 == null ? class672.field10111[class562.method4163(-126, arg1.method1038((byte)-118)) & 65535] : class628.field9131[arg1.method1038((byte)-93)];
                  int var16 = arg1.method1104(255);
                  this.field361 = (var16 & 224) << 3;
                  this.field370 = var16 & 31;
                  if (this.field370 != 31) {
                     this.method234(1280);
                  }

                  this.method235(var15, var7, var14, 8, var6, var5, arg0);
                  return;
               }
            } else {
               var10000 = (short)arg1.method1038((byte)-110);
            }

            int var19 = var10000;
            var12 = var19 >>> 8;
            var13 = var19 & 255;
            if (~var12 <= ~var9) {
               var12 = var9 - 1;
            }

            if (-var12 + var9 < var13) {
               var13 = -var12 + var9;
            }

            this.field368[var10] = (short)class379.method2928(var13, var12 << 8);
            ++var10;
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field375[0] + (arg0 != null ? field375[4] : field375[5]) + ',' + (arg1 != null ? field375[4] : field375[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
