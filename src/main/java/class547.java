import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class547 {
   @OriginalMember(
      owner = "client!fo",
      name = "j",
      descriptor = "I"
   )
   public int field7473 = -1;
   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7483 = new String[]{method3958(method3957("z\n\u0005\u0019\u0005")), method3958(method3957("z\n\u0005\u0017\u0005")), method3958(method3957("z\n\u0005\u001a\u0005")), method3958(method3957("r\u0010G3")), method3958(method3957("gK\u0005qP")), method3958(method3957("z\n\u0005\u001e\u0005")), method3958(method3957("z\n\u0005\u001c\u0005")), method3958(method3957("z\n\u0005\u001b\u0005")), method3958(method3957("z\n\u0005\u0018\u0005"))};
   @OriginalMember(
      owner = "client!fo",
      name = "w",
      descriptor = "Lnw;"
   )
   public static class616 field7463 = new class616(91, 8);
   @OriginalMember(
      owner = "client!fo",
      name = "u",
      descriptor = "F"
   )
   public static float field7476;
   @OriginalMember(
      owner = "client!fo",
      name = "n",
      descriptor = "I"
   )
   public static int field7462;
   @OriginalMember(
      owner = "client!fo",
      name = "o",
      descriptor = "I"
   )
   public static int field7464;
   @OriginalMember(
      owner = "client!fo",
      name = "g",
      descriptor = "I"
   )
   public static int field7468;
   @OriginalMember(
      owner = "client!fo",
      name = "c",
      descriptor = "I"
   )
   public static int field7470;
   @OriginalMember(
      owner = "client!fo",
      name = "k",
      descriptor = "I"
   )
   public static int field7479;
   @OriginalMember(
      owner = "client!fo",
      name = "y",
      descriptor = "I"
   )
   public static int field7482;
   @OriginalMember(
      owner = "client!fo",
      name = "d",
      descriptor = "Ldia;"
   )
   private class245 field7480;
   @OriginalMember(
      owner = "client!fo",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   private String field7460;
   @OriginalMember(
      owner = "client!fo",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   private String field7461;
   @OriginalMember(
      owner = "client!fo",
      name = "x",
      descriptor = "[I"
   )
   private int[] field7458;
   @OriginalMember(
      owner = "client!fo",
      name = "r",
      descriptor = "[I"
   )
   private int[] field7465;
   @OriginalMember(
      owner = "client!fo",
      name = "m",
      descriptor = "[I"
   )
   private int[] field7469;
   @OriginalMember(
      owner = "client!fo",
      name = "l",
      descriptor = "[I"
   )
   private int[] field7471;
   @OriginalMember(
      owner = "client!fo",
      name = "v",
      descriptor = "[I"
   )
   private int[] field7472;
   @OriginalMember(
      owner = "client!fo",
      name = "f",
      descriptor = "[I"
   )
   private int[] field7474;
   @OriginalMember(
      owner = "client!fo",
      name = "e",
      descriptor = "[I"
   )
   private int[] field7475;
   @OriginalMember(
      owner = "client!fo",
      name = "b",
      descriptor = "[I"
   )
   private int[] field7478;
   @OriginalMember(
      owner = "client!fo",
      name = "q",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field7459;
   @OriginalMember(
      owner = "client!fo",
      name = "p",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field7466;
   @OriginalMember(
      owner = "client!fo",
      name = "s",
      descriptor = "[[I"
   )
   private int[][] field7467;
   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "[[I"
   )
   private int[][] field7477;
   @OriginalMember(
      owner = "client!fo",
      name = "t",
      descriptor = "[[I"
   )
   private int[][] field7481;

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method3949(byte arg0, int arg1, int arg2) {
      try {
         ++field7470;
         if (arg0 != -49) {
            field7476 = -0.89563304F;
         }

         return ~arg2 != -2 && arg2 != 3 ? class143.field1895[3 & arg1] : class46.field527[arg1 & 3];
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7483[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3950(byte arg0) {
      try {
         field7463 = null;
         int var1 = 25 / ((arg0 - -68) / 46);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7483[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IZI)I"
   )
   public static final int method3951(int arg0, boolean arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field7464;
         if (arg0 > arg2) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
         }

         int var5;
         if (arg1) {
            field7476 = 0.90445733F;
            if (var3) {
               var5 = arg2 % arg0;
               arg2 = arg0;
               arg0 = var5;
            }
         }

         while(true) {
            int var10000;
            if (~arg0 == -1) {
               var10000 = arg2;
               if (!var3) {
                  return arg2;
               }
            } else {
               var10000 = arg2 % arg0;
            }

            var5 = var10000;
            arg2 = arg0;
            arg0 = var5;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7483[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(ILwm;I)V"
   )
   private final void method3952(int arg0, class594 arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label384: {
            if (arg2 == 1) {
               this.field7461 = arg1.method4325(false);
               if (!var4) {
                  break label384;
               }
            }

            if (~arg2 != -3) {
               if (~arg2 != -4) {
                  if (~arg2 != -5) {
                     if (arg2 == 5) {
                        arg1.method4280(arg0 + -28700);
                        if (!var4) {
                           break label384;
                        }
                     }

                     if (arg2 != 6) {
                        if (arg2 == 7) {
                           arg1.method4288((byte)109);
                           if (!var4) {
                              break label384;
                           }
                        }

                        if (~arg2 == -9) {
                           break label384;
                        }

                        if (arg2 == 9) {
                           arg1.method4288((byte)66);
                           if (!var4) {
                              break label384;
                           }
                        }

                        if (~arg2 != -11) {
                           if (arg2 == 12) {
                              arg1.method4302(true);
                              if (!var4) {
                                 break label384;
                              }
                           }

                           if (~arg2 != -14) {
                              if (~arg2 == -15) {
                                 int var5 = arg1.method4288((byte)98);
                                 this.field7477 = new int[var5][2];
                                 int var6 = 0;
                                 if (var4) {
                                    this.field7477[var6][0] = arg1.method4288((byte)121);
                                    this.field7477[var6][1] = arg1.method4288((byte)72);
                                    ++var6;
                                 }

                                 while(true) {
                                    while(var6 < var5) {
                                       this.field7477[var6][0] = arg1.method4288((byte)121);
                                       this.field7477[var6][1] = arg1.method4288((byte)72);
                                       ++var6;
                                    }

                                    if (!var4) {
                                       if (!var4) {
                                          break label384;
                                       }
                                       break;
                                    }

                                    ++var6;
                                 }
                              }

                              if (arg2 != 15) {
                                 if (arg2 != 17) {
                                    if (arg2 != 18) {
                                       if (~arg2 == -20) {
                                          int var7 = arg1.method4288((byte)103);
                                          this.field7474 = new int[var7];
                                          this.field7458 = new int[var7];
                                          this.field7459 = new String[var7];
                                          this.field7478 = new int[var7];
                                          int var8 = 0;
                                          if (var4) {
                                             this.field7478[var8] = arg1.method4302(true);
                                             this.field7474[var8] = arg1.method4302(true);
                                             this.field7458[var8] = arg1.method4302(true);
                                             this.field7459[var8] = arg1.method4291(-57);
                                             ++var8;
                                          }

                                          while(true) {
                                             while(~var7 < ~var8) {
                                                this.field7478[var8] = arg1.method4302(true);
                                                this.field7474[var8] = arg1.method4302(true);
                                                this.field7458[var8] = arg1.method4302(true);
                                                this.field7459[var8] = arg1.method4291(-57);
                                                ++var8;
                                             }

                                             if (!var4) {
                                                if (!var4) {
                                                   break label384;
                                                }
                                                break;
                                             }

                                             ++var8;
                                          }
                                       }

                                       if (~arg2 != -250) {
                                          break label384;
                                       }

                                       int var9 = arg1.method4288((byte)72);
                                       if (this.field7480 == null) {
                                          int var10 = class546.method3944(10, var9);
                                          this.field7480 = new class245(var10);
                                       }

                                       label250: {
                                          int var11 = 0;
                                          boolean var10000;
                                          if (var4) {
                                             var10000 = arg1.method4288((byte)103) == 1;
                                          } else if (var9 <= var11) {
                                             if (!var4) {
                                                break label250;
                                             }

                                             var10000 = true;
                                          } else {
                                             var10000 = arg1.method4288((byte)103) == 1;
                                          }

                                          while(true) {
                                             boolean var12 = var10000;
                                             int var13 = arg1.method4293(121);
                                             class500 var14;
                                             if (!var12) {
                                                var14 = new class144(arg1.method4302(true));
                                                if (var4) {
                                                   var14 = new class154(arg1.method4291(-78));
                                                }
                                             } else {
                                                var14 = new class154(arg1.method4291(-78));
                                             }

                                             this.field7480.method1841((long)var13, true, var14);
                                             ++var11;
                                             if (var9 <= var11) {
                                                if (!var4) {
                                                   break;
                                                }

                                                var10000 = true;
                                             } else {
                                                var10000 = arg1.method4288((byte)103) == 1;
                                             }
                                          }
                                       }

                                       if (!var4) {
                                          break label384;
                                       }
                                    }

                                    int var15 = arg1.method4288((byte)113);
                                    this.field7466 = new String[var15];
                                    this.field7475 = new int[var15];
                                    this.field7465 = new int[var15];
                                    this.field7472 = new int[var15];
                                    int var16 = 0;
                                    if (var4) {
                                       this.field7465[var16] = arg1.method4302(true);
                                       this.field7475[var16] = arg1.method4302(true);
                                       this.field7472[var16] = arg1.method4302(true);
                                       this.field7466[var16] = arg1.method4291(-37);
                                       ++var16;
                                    }

                                    while(true) {
                                       while(var15 > var16) {
                                          this.field7465[var16] = arg1.method4302(true);
                                          this.field7475[var16] = arg1.method4302(true);
                                          this.field7472[var16] = arg1.method4302(true);
                                          this.field7466[var16] = arg1.method4291(-37);
                                          ++var16;
                                       }

                                       if (!var4) {
                                          if (!var4) {
                                             break label384;
                                          }
                                          break;
                                       }

                                       ++var16;
                                    }
                                 }

                                 this.field7473 = arg1.method4280(-19104);
                                 if (!var4) {
                                    break label384;
                                 }
                              }

                              arg1.method4280(-19104);
                              if (!var4) {
                                 break label384;
                              }
                           }

                           int var17 = arg1.method4288((byte)70);
                           this.field7471 = new int[var17];
                           int var18 = 0;
                           if (var4) {
                              this.field7471[var18] = arg1.method4280(-19104);
                              ++var18;
                           }

                           while(true) {
                              while(~var17 < ~var18) {
                                 this.field7471[var18] = arg1.method4280(-19104);
                                 ++var18;
                              }

                              if (!var4) {
                                 if (!var4) {
                                    break label384;
                                 }
                                 break;
                              }

                              ++var18;
                           }
                        }

                        int var19 = arg1.method4288((byte)118);
                        this.field7469 = new int[var19];
                        int var20 = 0;
                        if (var4) {
                           this.field7469[var20] = arg1.method4302(true);
                           ++var20;
                        }

                        while(true) {
                           while(~var19 < ~var20) {
                              this.field7469[var20] = arg1.method4302(true);
                              ++var20;
                           }

                           if (!var4) {
                              if (!var4) {
                                 break label384;
                              }
                              break;
                           }

                           ++var20;
                        }
                     }

                     arg1.method4288((byte)95);
                     if (!var4) {
                        break label384;
                     }
                  }

                  int var21 = arg1.method4288((byte)127);
                  this.field7467 = new int[var21][3];
                  int var22 = 0;
                  if (var4) {
                     this.field7467[var22][0] = arg1.method4280(class168.method1321(arg0, -28644));
                     this.field7467[var22][1] = arg1.method4302(true);
                     this.field7467[var22][2] = arg1.method4302(true);
                     ++var22;
                  }

                  while(true) {
                     while(~var22 > ~var21) {
                        this.field7467[var22][0] = arg1.method4280(class168.method1321(arg0, -28644));
                        this.field7467[var22][1] = arg1.method4302(true);
                        this.field7467[var22][2] = arg1.method4302(true);
                        ++var22;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label384;
                        }
                        break;
                     }

                     ++var22;
                  }
               }

               int var23 = arg1.method4288((byte)64);
               this.field7481 = new int[var23][3];
               int var24 = 0;
               if (var4) {
                  this.field7481[var24][0] = arg1.method4280(-19104);
                  this.field7481[var24][1] = arg1.method4302(true);
                  this.field7481[var24][2] = arg1.method4302(true);
                  ++var24;
               }

               while(true) {
                  while(var24 < var23) {
                     this.field7481[var24][0] = arg1.method4280(-19104);
                     this.field7481[var24][1] = arg1.method4302(true);
                     this.field7481[var24][2] = arg1.method4302(true);
                     ++var24;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label384;
                     }
                     break;
                  }

                  ++var24;
               }
            }

            this.field7460 = arg1.method4325(false);
         }

         if (arg0 == 9596) {
            ++field7479;
         }
      } catch (RuntimeException var26) {
         throw class534.method3846(var26, field7483[5] + arg0 + ',' + (arg1 != null ? field7483[4] : field7483[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3953(boolean arg0) {
      try {
         if (!arg0) {
            method3956(-20, -77, 114, (byte)-34, 36);
         }

         ++field7468;
         if (this.field7460 == null) {
            this.field7460 = this.field7461;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7483[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Lwm;I)V"
   )
   public final void method3954(class594 arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         int var4 = 108 / ((-29 - arg1) / 59);

         while(true) {
            int var5 = arg0.method4288((byte)117);
            if (~var5 != -1) {
               this.method3952(9596, arg0, var5);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field7482;
            break;
         }

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7483[8] + (arg0 != null ? field7483[4] : field7483[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3955() {
      for(int var0 = class575.field7913; var0 < class398.field5594; ++var0) {
         for(int var1 = 0; var1 < class635.field8973; ++var1) {
            for(int var2 = 0; var2 < class304.field4042; ++var2) {
               class225 var3 = class111.field1404[var0][var1][var2];
               if (var3 != null) {
                  class718 var4 = var3.field2831;
                  class718 var5 = var3.field2830;
                  if (var4 != null && var4.method771(116)) {
                     class592.method4260(var4, var0, var1, var2, 1, 1);
                     if (var5 != null && var5.method771(57)) {
                        class592.method4260(var5, var0, var1, var2, 1, 1);
                        var5.method783(0, var4, 0, -1, false, 0, class292.field3851);
                        var5.method768(117);
                     }

                     var4.method768(111);
                  }

                  for(class752 var6 = var3.field2821; var6 != null; var6 = var6.field10923) {
                     class47 var8 = var6.field10922;
                     if (var8 != null && var8.method771(125)) {
                        class592.method4260(var8, var0, var1, var2, var8.field548 - var8.field547 + 1, var8.field541 - var8.field540 + 1);
                        var8.method768(127);
                     }
                  }

                  class525 var7 = var3.field2820;
                  if (var7 != null && var7.method771(62)) {
                     class438.method3257(var7, var0, var1, var2);
                     var7.method768(122);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method3956(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         if (arg3 != 86) {
            method3951(18, false, -17);
         }

         ++field7462;
         if (-arg0 + arg1 >= class265.field3451 && class663.field9442 >= arg0 + arg1 && class478.field6604 <= arg2 - arg0 && class313.field4171 >= arg0 + arg2) {
            class294.method2216(arg1, arg4, (byte)-119, arg2, arg0);
         } else {
            class687.method5015(arg1, arg2, arg4, -40, arg0);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7483[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3957(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3958(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
