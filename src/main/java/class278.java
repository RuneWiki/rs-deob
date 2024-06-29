import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class278 extends class606 {
   @OriginalMember(
      owner = "client!cl",
      name = "Y",
      descriptor = "I"
   )
   private int field4213 = 4;
   @OriginalMember(
      owner = "client!cl",
      name = "I",
      descriptor = "I"
   )
   private int field4208 = 0;
   @OriginalMember(
      owner = "client!cl",
      name = "F",
      descriptor = "I"
   )
   private int field4206 = 1024;
   @OriginalMember(
      owner = "client!cl",
      name = "D",
      descriptor = "I"
   )
   private int field4217 = 409;
   @OriginalMember(
      owner = "client!cl",
      name = "S",
      descriptor = "I"
   )
   private int field4210 = 8;
   @OriginalMember(
      owner = "client!cl",
      name = "O",
      descriptor = "I"
   )
   private int field4203 = 1024;
   @OriginalMember(
      owner = "client!cl",
      name = "V",
      descriptor = "I"
   )
   private int field4223 = 81;
   @OriginalMember(
      owner = "client!cl",
      name = "R",
      descriptor = "I"
   )
   private int field4224 = 204;
   @OriginalMember(
      owner = "client!cl",
      name = "ab",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4225 = new String[]{method2343(method2342("Yod6A")), method2343(method2342("Yod4A")), method2343(method2342("Yod;A")), method2343(method2342("Yod9A")), method2343(method2342("Yod7A")), method2343(method2342("A-dP\u0014")), method2343(method2342("Tv&\u0012")), method2343(method2342("Yod?A")), method2343(method2342("Yod5A"))};
   @OriginalMember(
      owner = "client!cl",
      name = "E",
      descriptor = "Lef;"
   )
   public static class171 field4211 = new class171();
   @OriginalMember(
      owner = "client!cl",
      name = "G",
      descriptor = "I"
   )
   public static int field4202;
   @OriginalMember(
      owner = "client!cl",
      name = "U",
      descriptor = "I"
   )
   public static int field4204;
   @OriginalMember(
      owner = "client!cl",
      name = "P",
      descriptor = "I"
   )
   public static int field4205;
   @OriginalMember(
      owner = "client!cl",
      name = "H",
      descriptor = "I"
   )
   public static int field4207;
   @OriginalMember(
      owner = "client!cl",
      name = "L",
      descriptor = "I"
   )
   public static int field4209;
   @OriginalMember(
      owner = "client!cl",
      name = "Q",
      descriptor = "I"
   )
   private int field4212;
   @OriginalMember(
      owner = "client!cl",
      name = "M",
      descriptor = "I"
   )
   private int field4214;
   @OriginalMember(
      owner = "client!cl",
      name = "X",
      descriptor = "I"
   )
   private int field4215;
   @OriginalMember(
      owner = "client!cl",
      name = "J",
      descriptor = "I"
   )
   public static int field4216;
   @OriginalMember(
      owner = "client!cl",
      name = "T",
      descriptor = "I"
   )
   public static int field4222;
   @OriginalMember(
      owner = "client!cl",
      name = "N",
      descriptor = "Lsa;"
   )
   public static class39 field4220;
   @OriginalMember(
      owner = "client!cl",
      name = "Z",
      descriptor = "[I"
   )
   private int[] field4218;
   @OriginalMember(
      owner = "client!cl",
      name = "W",
      descriptor = "[[I"
   )
   private int[][] field4219;
   @OriginalMember(
      owner = "client!cl",
      name = "K",
      descriptor = "[[I"
   )
   private int[][] field4221;

   @OriginalMember(
      owner = "client!cl",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2337(int arg0) {
      try {
         field4211 = null;
         field4220 = null;
         if (arg0 != -7049) {
            field4202 = -109;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4225[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         ++field4205;
         if (arg0 <= 118) {
            this.field4213 = 14;
         }

         this.method2340((byte)8);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4225[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label91: {
            label90: {
               label89: {
                  label88: {
                     label87: {
                        label86: {
                           label85: {
                              label84: {
                                 if (~arg1 != -1) {
                                    if (arg1 == 1) {
                                       break label84;
                                    }

                                    if (arg1 == 2) {
                                       break label85;
                                    }

                                    if (~arg1 == -4) {
                                       break label86;
                                    }

                                    if (~arg1 == -5) {
                                       break label87;
                                    }

                                    if (arg1 == 5) {
                                       break label88;
                                    }

                                    if (arg1 == 6) {
                                       break label89;
                                    }

                                    if (arg1 != 7) {
                                       break label91;
                                    }

                                    if (!var4) {
                                       break label90;
                                    }
                                 }

                                 this.field4213 = arg0.method665(false);
                                 if (!var4) {
                                    break label91;
                                 }
                              }

                              this.field4210 = arg0.method665(false);
                              if (!var4) {
                                 break label91;
                              }
                           }

                           this.field4217 = arg0.method685(-2);
                           if (!var4) {
                              break label91;
                           }
                        }

                        this.field4224 = arg0.method685(-2);
                        if (!var4) {
                           break label91;
                        }
                     }

                     this.field4206 = arg0.method685(-2);
                     if (!var4) {
                        break label91;
                     }
                  }

                  this.field4208 = arg0.method685(-2);
                  if (!var4) {
                     break label91;
                  }
               }

               this.field4223 = arg0.method685(-2);
               if (!var4) {
                  break label91;
               }
            }

            this.field4203 = arg0.method685(-2);
         }

         if (arg2 > -6) {
            method2337(77);
         }

         ++field4209;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4225[7] + (arg0 != null ? field4225[5] : field4225[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(Lr;III[Z)V"
   )
   public static final void method2338(class412 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class634.field8989 != class225.field3197) {
         int var5 = class558.field7922[arg1].method5401(arg2, true, arg3);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class751 var7 = class558.field7922[var6];
               if (var7 != null) {
                  var7.method53(arg0, arg2, var5 - var7.method5401(arg2, true, arg3), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method2339(int arg0, byte arg1) {
      try {
         ++field4216;
         int var2 = -81 / ((51 - arg1) / 62);
         return ~arg0 <= -13 && ~arg0 >= -18;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4225[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method2340(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public static final void method2341(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         if (arg4 > -18) {
            field4211 = null;
         }

         if (arg1 >= class729.field10384 && arg1 <= class604.field8618) {
            int var8 = class437.method3398(class587.field8239, (byte)-20, arg3, class767.field11011);
            int var7 = class437.method3398(class587.field8239, (byte)81, arg2, class767.field11011);
            class385.method3007(arg1, 25638, arg0, var7, var8);
         }

         ++field4204;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4225[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "<init>",
      descriptor = "()V"
   )
   public class278() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 0) {
            this.method270((byte)-115);
         }

         ++field4207;
         int[] var4 = super.field8645.method2632(arg1, arg0 ^ 27230);
         if (super.field8645.field4884) {
            int var5 = 0;
            int var6 = class693.field10001[arg1] - -this.field4208;
            if (var3) {
               var6 += 4096;
            }

            while(~var6 > -1) {
               var6 += 4096;
            }

            if (var3) {
               var6 -= 4096;
            }

            while(~var6 < -4097) {
               var6 -= 4096;
            }

            int var7;
            int var10000;
            label191: {
               if (var3) {
                  var10000 = this.field4218[var5];
               } else if (var5 >= this.field4210) {
                  var7 = var5 + -1;
                  var10000 = var5 & 1;
                  if (!var3) {
                     break label191;
                  }
               } else {
                  var10000 = this.field4218[var5];
               }

               label190:
               while(true) {
                  while(var10000 > var6) {
                     var7 = var5 + -1;
                     var10000 = var5 & 1;
                     if (!var3) {
                        break label190;
                     }
                  }

                  ++var5;
                  if (var5 >= this.field4210) {
                     var7 = var5 + -1;
                     var10000 = var5 & 1;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = this.field4218[var5];
                  }
               }
            }

            boolean var8 = var10000 == 0;
            int var9 = this.field4218[var5];
            int var10 = this.field4218[var5 - 1];
            if (var6 > var10 - -this.field4215 && ~var6 > ~(-this.field4215 + var9)) {
               label161: {
                  int var11 = 0;
                  if (var3) {
                     var10000 = var8 ? this.field4206 : -this.field4206;
                  } else if (class563.field8014 <= var11) {
                     if (!var3) {
                        break label161;
                     }

                     var10000 = -this.field4206;
                  } else {
                     var10000 = var8 ? this.field4206 : -this.field4206;
                  }

                  while(true) {
                     int var12 = var10000;
                     int var13 = 0;
                     int var14 = (this.field4212 * var12 >> 12) + class387.field5650[var11];
                     if (var3) {
                        var14 += 4096;
                     }

                     while(var14 < 0) {
                        var14 += 4096;
                     }

                     if (var3) {
                        var14 -= 4096;
                     }

                     while(var14 > 4096) {
                        var14 -= 4096;
                     }

                     int var15;
                     int var16;
                     int var10001;
                     label157: {
                        int var17;
                        if (var3) {
                           var10000 = this.field4219[var7][var13];
                           var10001 = var14;
                        } else if (~this.field4213 >= ~var13) {
                           var15 = var13 + -1;
                           var16 = this.field4219[var7][var13];
                           var17 = this.field4219[var7][var15];
                           var10000 = ~(var17 - -this.field4215);
                           var10001 = ~var14;
                           if (!var3) {
                              break label157;
                           }
                        } else {
                           var10000 = this.field4219[var7][var13];
                           var10001 = var14;
                        }

                        label156:
                        while(true) {
                           while(var10000 > var10001) {
                              var15 = var13 + -1;
                              var16 = this.field4219[var7][var13];
                              var17 = this.field4219[var7][var15];
                              var10000 = ~(var17 - -this.field4215);
                              var10001 = ~var14;
                              if (!var3) {
                                 break label156;
                              }
                           }

                           ++var13;
                           if (~this.field4213 >= ~var13) {
                              var15 = var13 + -1;
                              var16 = this.field4219[var7][var13];
                              var17 = this.field4219[var7][var15];
                              var10000 = ~(var17 - -this.field4215);
                              var10001 = ~var14;
                              if (!var3) {
                                 break;
                              }
                           } else {
                              var10000 = this.field4219[var7][var13];
                              var10001 = var14;
                           }
                        }
                     }

                     if (var10000 > var10001) {
                        if (var14 < -this.field4215 + var16) {
                           var4[var11] = this.field4221[var7][var15];
                           if (var3) {
                              var4[var11] = 0;
                              ++var11;
                           } else {
                              ++var11;
                           }
                        } else {
                           var4[var11] = 0;
                           ++var11;
                        }
                     } else {
                        var4[var11] = 0;
                        ++var11;
                     }

                     if (class563.field8014 <= var11) {
                        if (!var3) {
                           break;
                        }

                        var10000 = -this.field4206;
                     } else {
                        var10000 = var8 ? this.field4206 : -this.field4206;
                     }
                  }
               }

               if (!var3) {
                  return var4;
               }
            }

            class474.method3643(var4, 0, class563.field8014, 0);
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field4225[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2342(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2343(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
