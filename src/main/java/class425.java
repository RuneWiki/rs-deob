import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class425 {
   @OriginalMember(
      owner = "client!saa",
      name = "w",
      descriptor = "I"
   )
   public int field6217;
   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6211;
   @OriginalMember(
      owner = "client!saa",
      name = "c",
      descriptor = "Z"
   )
   public boolean field6215;
   @OriginalMember(
      owner = "client!saa",
      name = "h",
      descriptor = "[S"
   )
   public short[] field6214;
   @OriginalMember(
      owner = "client!saa",
      name = "n",
      descriptor = "I"
   )
   private int field6210;
   @OriginalMember(
      owner = "client!saa",
      name = "l",
      descriptor = "I"
   )
   public int field6221;
   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6228 = new String[]{method3324(method3323("\u001bHo\u000eS\u0001GgTQ@")), method3324(method3323("\u0006\\bL")), method3324(method3323("\u0013\u0007 \u000e\u0012")), method3324(method3323("\u001bHo\u000e.@")), method3324(method3323("\u001bHo\u000e+@")), method3324(method3323("\u001bHo\u000e'@")), method3324(method3323("\u001bHo\u000e*@")), method3324(method3323("\u001bHo\u000e&@")), method3324(method3323("\u001bHo\u000e,@")), method3324(method3323("\u001bHo\u000e)@")), method3324(method3323("\u001bHo\u000e(@")), method3324(method3323("\u001bHo\u000e-@"))};
   @OriginalMember(
      owner = "client!saa",
      name = "g",
      descriptor = "I"
   )
   public static int field6219 = 1405;
   @OriginalMember(
      owner = "client!saa",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field6225 = false;
   @OriginalMember(
      owner = "client!saa",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6223 = new int[1];
   @OriginalMember(
      owner = "client!saa",
      name = "t",
      descriptor = "I"
   )
   public static int field6205;
   @OriginalMember(
      owner = "client!saa",
      name = "i",
      descriptor = "I"
   )
   public static int field6206;
   @OriginalMember(
      owner = "client!saa",
      name = "s",
      descriptor = "I"
   )
   private int field6207;
   @OriginalMember(
      owner = "client!saa",
      name = "f",
      descriptor = "I"
   )
   public static int field6208;
   @OriginalMember(
      owner = "client!saa",
      name = "r",
      descriptor = "I"
   )
   private int field6209;
   @OriginalMember(
      owner = "client!saa",
      name = "m",
      descriptor = "I"
   )
   public static int field6212;
   @OriginalMember(
      owner = "client!saa",
      name = "u",
      descriptor = "I"
   )
   public static int field6213;
   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "I"
   )
   private int field6216;
   @OriginalMember(
      owner = "client!saa",
      name = "d",
      descriptor = "I"
   )
   private int field6220;
   @OriginalMember(
      owner = "client!saa",
      name = "p",
      descriptor = "I"
   )
   public static int field6222;
   @OriginalMember(
      owner = "client!saa",
      name = "v",
      descriptor = "I"
   )
   public static int field6224;
   @OriginalMember(
      owner = "client!saa",
      name = "o",
      descriptor = "I"
   )
   public static int field6226;
   @OriginalMember(
      owner = "client!saa",
      name = "q",
      descriptor = "I"
   )
   public static int field6227;
   @OriginalMember(
      owner = "client!saa",
      name = "k",
      descriptor = "Lpha;"
   )
   public class757 field6218;

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IILha;IIII)V"
   )
   private final void method3314(int arg0, int arg1, class17 arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field6206;
         this.field6218 = arg2.method220(arg3, arg1, arg4, arg5, arg0, (float)arg6);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6228[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6228[2] : field6228[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ZBI)V"
   )
   public final void method3315(boolean arg0, byte arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         int var7;
         label64: {
            ++field6212;
            if (!arg0) {
               label68: {
                  int var5;
                  label60: {
                     label59: {
                        label58: {
                           label57: {
                              var5 = this.field6220 * arg2 / 50 + this.field6210 & 2047;
                              int var6 = this.field6216;
                              if (var6 != 1) {
                                 if (var6 == 3) {
                                    break label57;
                                 }

                                 if (var6 == 4) {
                                    break label58;
                                 }

                                 if (var6 == 2) {
                                    break label59;
                                 }

                                 if (~var6 != -6) {
                                    break label68;
                                 }

                                 if (!var4) {
                                    break label60;
                                 }
                              }

                              var7 = 1024 - -(class160.field2447[var5 << 3] >> 4);
                              if (!var4) {
                                 break label64;
                              }
                           }

                           var7 = class773.field11259[var5] >> 1;
                           if (!var4) {
                              break label64;
                           }
                        }

                        var7 = var5 >> 10 << 11;
                        if (!var4) {
                           break label64;
                        }
                     }

                     var7 = var5;
                     if (!var4) {
                        break label64;
                     }
                  }

                  var7 = (~var5 <= -1025 ? -var5 + 2048 : var5) << 1;
                  if (!var4) {
                     break label64;
                  }
               }

               var7 = 2048;
               if (!var4) {
                  break label64;
               }
            }

            var7 = 2048;
         }

         int var8 = 11 % ((50 - arg1) / 62);
         this.field6218.method115((float)((this.field6209 * var7 >> 11) + this.field6207) / 2048.0F, (byte)71);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6228[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(I[BII[BIIII)V"
   )
   public static final void method3316(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field10022;

      try {
         ++field6205;
         int var10 = -(arg0 >> 2);
         int var16 = -(arg0 & 3);
         if (arg5 != 1369181506) {
            method3322(true, (String)null);
         }

         int var11 = -arg3;
         if (var9 || var11 < 0) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg8++;
                  arg1[var10001] += arg4[arg6++];
                  int var17 = arg8++;
                  arg1[var17] += arg4[arg6++];
                  int var18 = arg8++;
                  arg1[var18] += arg4[arg6++];
                  int var19 = arg8++;
                  arg1[var19] += arg4[arg6++];
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg8++;
                     arg1[var10001] += arg4[arg6++];
                     var10001 = arg8++;
                     arg1[var10001] += arg4[arg6++];
                     var10001 = arg8++;
                     arg1[var10001] += arg4[arg6++];
                     var10001 = arg8++;
                     arg1[var10001] += arg4[arg6++];
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg8++;
                        arg1[var10001] += arg4[arg6++];
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(~var13 > -1) {
                           var10001 = arg8++;
                           arg1[var10001] += arg4[arg6++];
                           ++var13;
                        }

                        arg6 += arg7;
                        arg8 += arg2;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(var11 < 0);

         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field6228[7] + arg0 + ',' + (arg1 != null ? field6228[2] : field6228[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6228[2] : field6228[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public final void method3317(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         ++field6226;
         this.field6207 = arg0;
         if (arg4 == -52) {
            this.field6220 = arg2;
            this.field6216 = arg1;
            this.field6209 = arg3;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6228[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method3318(byte arg0) {
      boolean var2 = client.field10022;

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
                                                         int var3 = this.field6221;
                                                         if (~var3 != -3) {
                                                            if (var3 == 3) {
                                                               break label137;
                                                            }

                                                            if (var3 == 4) {
                                                               break label138;
                                                            }

                                                            if (var3 == 5) {
                                                               break label139;
                                                            }

                                                            if (~var3 == -13) {
                                                               break label140;
                                                            }

                                                            if (var3 == 13) {
                                                               break label141;
                                                            }

                                                            if (~var3 == -11) {
                                                               break label142;
                                                            }

                                                            if (var3 == 11) {
                                                               break label143;
                                                            }

                                                            if (~var3 == -7) {
                                                               break label144;
                                                            }

                                                            if (~var3 == -8) {
                                                               break label145;
                                                            }

                                                            if (var3 == 8) {
                                                               break label146;
                                                            }

                                                            if (~var3 == -10) {
                                                               break label147;
                                                            }

                                                            if (var3 == 14) {
                                                               break label148;
                                                            }

                                                            if (~var3 == -16) {
                                                               break label149;
                                                            }

                                                            if (var3 != 16) {
                                                               break label151;
                                                            }

                                                            if (!var2) {
                                                               break label150;
                                                            }
                                                         }

                                                         this.field6220 = 2048;
                                                         this.field6216 = 1;
                                                         this.field6207 = 0;
                                                         this.field6209 = 2048;
                                                         if (!var2) {
                                                            break label152;
                                                         }
                                                      }

                                                      this.field6209 = 2048;
                                                      this.field6216 = 1;
                                                      this.field6207 = 0;
                                                      this.field6220 = 4096;
                                                      if (!var2) {
                                                         break label152;
                                                      }
                                                   }

                                                   this.field6209 = 2048;
                                                   this.field6220 = 2048;
                                                   this.field6216 = 4;
                                                   this.field6207 = 0;
                                                   if (!var2) {
                                                      break label152;
                                                   }
                                                }

                                                this.field6220 = 8192;
                                                this.field6216 = 4;
                                                this.field6207 = 0;
                                                this.field6209 = 2048;
                                                if (!var2) {
                                                   break label152;
                                                }
                                             }

                                             this.field6207 = 0;
                                             this.field6216 = 2;
                                             this.field6220 = 2048;
                                             this.field6209 = 2048;
                                             if (!var2) {
                                                break label152;
                                             }
                                          }

                                          this.field6216 = 2;
                                          this.field6220 = 8192;
                                          this.field6207 = 0;
                                          this.field6209 = 2048;
                                          if (!var2) {
                                             break label152;
                                          }
                                       }

                                       this.field6216 = 3;
                                       this.field6207 = 1536;
                                       this.field6220 = 2048;
                                       this.field6209 = 512;
                                       if (!var2) {
                                          break label152;
                                       }
                                    }

                                    this.field6216 = 3;
                                    this.field6209 = 512;
                                    this.field6220 = 4096;
                                    this.field6207 = 1536;
                                    if (!var2) {
                                       break label152;
                                    }
                                 }

                                 this.field6220 = 2048;
                                 this.field6209 = 768;
                                 this.field6216 = 3;
                                 this.field6207 = 1280;
                                 if (!var2) {
                                    break label152;
                                 }
                              }

                              this.field6220 = 4096;
                              this.field6209 = 768;
                              this.field6207 = 1280;
                              this.field6216 = 3;
                              if (!var2) {
                                 break label152;
                              }
                           }

                           this.field6216 = 3;
                           this.field6209 = 1024;
                           this.field6207 = 1024;
                           this.field6220 = 2048;
                           if (!var2) {
                              break label152;
                           }
                        }

                        this.field6216 = 3;
                        this.field6220 = 4096;
                        this.field6209 = 1024;
                        this.field6207 = 1024;
                        if (!var2) {
                           break label152;
                        }
                     }

                     this.field6207 = 1280;
                     this.field6216 = 1;
                     this.field6209 = 768;
                     this.field6220 = 2048;
                     if (!var2) {
                        break label152;
                     }
                  }

                  this.field6216 = 1;
                  this.field6220 = 4096;
                  this.field6209 = 512;
                  this.field6207 = 1536;
                  if (!var2) {
                     break label152;
                  }
               }

               this.field6209 = 256;
               this.field6220 = 8192;
               this.field6207 = 1792;
               this.field6216 = 1;
               if (!var2) {
                  break label152;
               }
            }

            this.field6209 = 2048;
            this.field6216 = 0;
            this.field6207 = 0;
            this.field6220 = 2048;
         }

         if (arg0 < 46) {
            method3320((byte)-99);
         }

         ++field6224;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6228[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method3319(int arg0) {
      try {
         ++field6222;
         if (arg0 != 0) {
            method3322(true, (String)null);
         }

         return class217.field3113 == 1 ? class235.field3639 : 0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6228[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3320(byte arg0) {
      try {
         field6223 = null;
         if (arg0 < 11) {
            method3316(42, (byte[])null, -12, -31, (byte[])null, -72, 16, 116, -75);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6228[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILsa;)V"
   )
   public static final void method3321(int arg0, class39 arg1) {
      try {
         if (arg0 < 79) {
            method3321(-1, (class39)null);
         }

         class237.field3666 = arg1;
         ++field6227;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6228[9] + arg0 + ',' + (arg1 != null ? field6228[2] : field6228[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ZLjava/lang/String;)Z"
   )
   public static final boolean method3322(boolean arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         ++field6213;
         if (arg1 == null) {
            return false;
         } else {
            if (!arg0) {
               method3316(-123, (byte[])null, -25, -46, (byte[])null, 82, 49, 72, -27);
            }

            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class201.field2879[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               while(~var3 > ~class428.field6272) {
                  if (arg1.equalsIgnoreCase(class201.field2879[var3])) {
                     return true;
                  }

                  ++var3;
               }

               boolean var10000 = arg1.equalsIgnoreCase(class117.field1849.field2402);
               if (!var2) {
                  if (var10000) {
                     return true;
                  }

                  return false;
               }

               if (var10000) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6228[5] + arg0 + ',' + (arg1 != null ? field6228[2] : field6228[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "()V"
   )
   protected class425() {
      try {
         if (class773.field11259 == null) {
            class521.method3887((byte)29);
         }

         this.method3318((byte)59);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6228[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "(Lha;Lcu;I)V"
   )
   public class425(class17 arg0, class65 arg1, int arg2) {
      boolean var4 = client.field10022;
      super();

      try {
         if (class773.field11259 == null) {
            class521.method3887((byte)127);
         }

         this.field6217 = arg1.method665(false);
         this.field6211 = ~(8 & this.field6217) != -1;
         this.field6215 = (this.field6217 & 16) != 0;
         this.field6217 &= 7;
         int var5 = arg1.method685(-2) << arg2;
         int var6 = arg1.method685(-2) << arg2;
         int var7 = arg1.method685(-2) << arg2;
         int var8 = arg1.method665(false);
         int var9 = var8 * 2 - -1;
         this.field6214 = new short[var9];
         int var10 = 0;
         int var12;
         int var13;
         if (var4) {
            short var11 = (short)arg1.method685(-2);
            var12 = var11 >>> 8;
            if (~var12 <= ~var9) {
               var12 = var9 + -1;
            }

            var13 = var11 & 255;
            if (var13 > -var12 + var9) {
               var13 = var9 - var12;
            }

            this.field6214[var10] = (short)class91.method932(var13, var12 << 8);
            ++var10;
         }

         while(true) {
            int var10000;
            if (this.field6214.length <= var10) {
               var10000 = (var8 << class313.field4707) + class744.field10587;
               if (!var4) {
                  int var14 = var10000;
                  int var15 = class744.field10589 == null ? class584.field8198[65535 & class270.method2299(arg1.method685(-2), false)] : class744.field10589[arg1.method685(-2)];
                  int var16 = arg1.method665(false);
                  this.field6210 = (224 & var16) << 3;
                  this.field6221 = 31 & var16;
                  if (this.field6221 != 31) {
                     this.method3318((byte)73);
                  }

                  this.method3314(var15, var7, arg0, var5, var6, var14, 1);
                  return;
               }
            } else {
               var10000 = (short)arg1.method685(-2);
            }

            int var19 = var10000;
            var12 = var19 >>> 8;
            if (~var12 <= ~var9) {
               var12 = var9 + -1;
            }

            var13 = var19 & 255;
            if (var13 > -var12 + var9) {
               var13 = var9 - var12;
            }

            this.field6214[var10] = (short)class91.method932(var13, var12 << 8);
            ++var10;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field6228[0] + (arg0 != null ? field6228[2] : field6228[1]) + ',' + (arg1 != null ? field6228[2] : field6228[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
