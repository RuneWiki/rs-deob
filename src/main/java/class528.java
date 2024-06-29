import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class528 extends class302 {
   @OriginalMember(
      owner = "client!is",
      name = "ab",
      descriptor = "I"
   )
   private int field7681 = 204;
   @OriginalMember(
      owner = "client!is",
      name = "H",
      descriptor = "I"
   )
   private int field7679 = 1024;
   @OriginalMember(
      owner = "client!is",
      name = "O",
      descriptor = "I"
   )
   private int field7680 = 1024;
   @OriginalMember(
      owner = "client!is",
      name = "W",
      descriptor = "I"
   )
   private int field7682 = 8;
   @OriginalMember(
      owner = "client!is",
      name = "S",
      descriptor = "I"
   )
   private int field7683 = 0;
   @OriginalMember(
      owner = "client!is",
      name = "K",
      descriptor = "I"
   )
   private int field7688 = 4;
   @OriginalMember(
      owner = "client!is",
      name = "M",
      descriptor = "I"
   )
   private int field7694 = 81;
   @OriginalMember(
      owner = "client!is",
      name = "N",
      descriptor = "I"
   )
   private int field7687 = 409;
   @OriginalMember(
      owner = "client!is",
      name = "bb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7698 = new String[]{method3914(method3913("#DnNn")), method3914(method3913("#DnKn")), method3914(method3913("#DnLn")), method3914(method3913("#DnJn")), method3914(method3913("1\u0019n!;")), method3914(method3913("#DnIn")), method3914(method3913("$B,c"))};
   @OriginalMember(
      owner = "client!is",
      name = "Q",
      descriptor = "I"
   )
   public static int field7678;
   @OriginalMember(
      owner = "client!is",
      name = "L",
      descriptor = "I"
   )
   public static int field7684;
   @OriginalMember(
      owner = "client!is",
      name = "V",
      descriptor = "I"
   )
   public static int field7685;
   @OriginalMember(
      owner = "client!is",
      name = "R",
      descriptor = "I"
   )
   private int field7686;
   @OriginalMember(
      owner = "client!is",
      name = "T",
      descriptor = "I"
   )
   public static int field7690;
   @OriginalMember(
      owner = "client!is",
      name = "U",
      descriptor = "I"
   )
   public static int field7691;
   @OriginalMember(
      owner = "client!is",
      name = "X",
      descriptor = "I"
   )
   public static int field7693;
   @OriginalMember(
      owner = "client!is",
      name = "Z",
      descriptor = "I"
   )
   private int field7695;
   @OriginalMember(
      owner = "client!is",
      name = "I",
      descriptor = "I"
   )
   private int field7696;
   @OriginalMember(
      owner = "client!is",
      name = "P",
      descriptor = "[I"
   )
   private int[] field7697;
   @OriginalMember(
      owner = "client!is",
      name = "J",
      descriptor = "[[I"
   )
   private int[][] field7689;
   @OriginalMember(
      owner = "client!is",
      name = "Y",
      descriptor = "[[I"
   )
   private int[][] field7692;

   @OriginalMember(
      owner = "client!is",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method3911(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         ++field7690;
         this.method3911(96);
         if (arg0 >= -87) {
            this.method708((byte)-98);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7698[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label91: {
            label90: {
               label89: {
                  label88: {
                     label87: {
                        label86: {
                           label85: {
                              label84: {
                                 ++field7691;
                                 if (arg0 != 0) {
                                    if (~arg0 == -2) {
                                       break label84;
                                    }

                                    if (~arg0 == -3) {
                                       break label85;
                                    }

                                    if (arg0 == 3) {
                                       break label86;
                                    }

                                    if (~arg0 == -5) {
                                       break label87;
                                    }

                                    if (~arg0 == -6) {
                                       break label88;
                                    }

                                    if (arg0 == 6) {
                                       break label89;
                                    }

                                    if (~arg0 != -8) {
                                       break label91;
                                    }

                                    if (var4 == 0) {
                                       break label90;
                                    }
                                 }

                                 this.field7688 = arg2.method1104(255);
                                 if (var4 == 0) {
                                    break label91;
                                 }
                              }

                              this.field7682 = arg2.method1104(arg1 + 255);
                              if (var4 == 0) {
                                 break label91;
                              }
                           }

                           this.field7687 = arg2.method1038((byte)-99);
                           if (var4 == 0) {
                              break label91;
                           }
                        }

                        this.field7681 = arg2.method1038((byte)-102);
                        if (var4 == 0) {
                           break label91;
                        }
                     }

                     this.field7680 = arg2.method1038((byte)-113);
                     if (var4 == 0) {
                        break label91;
                     }
                  }

                  this.field7683 = arg2.method1038((byte)-125);
                  if (var4 == 0) {
                     break label91;
                  }
               }

               this.field7694 = arg2.method1038((byte)-122);
               if (var4 == 0) {
                  break label91;
               }
            }

            this.field7679 = arg2.method1038((byte)-113);
         }

         if (arg1 != 0) {
            this.field7687 = 40;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7698[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7698[4] : field7698[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "<init>",
      descriptor = "()V"
   )
   public class528() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field7685;
         if (arg1 > -37) {
            return null;
         } else {
            int[] var4 = super.field4298.method3175(arg0, (byte)-127);
            if (super.field4298.field6356) {
               int var5 = 0;
               int var6 = class23.field241[arg0] + this.field7683;
               if (var3 != 0) {
                  var6 += 4096;
               }

               while(~var6 > -1) {
                  var6 += 4096;
               }

               if (var3 != 0) {
                  var6 -= 4096;
               }

               while(~var6 < -4097) {
                  var6 -= 4096;
               }

               int var7;
               int var10000;
               int var10001;
               label163: {
                  if (var3 != 0) {
                     var10000 = var6;
                     var10001 = this.field7697[var5];
                  } else if (var5 >= this.field7682) {
                     var7 = var5 + -1;
                     var10000 = ~(1 & var5);
                     var10001 = -1;
                     if (var3 == 0) {
                        break label163;
                     }
                  } else {
                     var10000 = var6;
                     var10001 = this.field7697[var5];
                  }

                  label162:
                  while(true) {
                     while(var10000 < var10001) {
                        var7 = var5 + -1;
                        var10000 = ~(1 & var5);
                        var10001 = -1;
                        if (var3 == 0) {
                           break label162;
                        }
                     }

                     ++var5;
                     if (var5 >= this.field7682) {
                        var7 = var5 + -1;
                        var10000 = ~(1 & var5);
                        var10001 = -1;
                        if (var3 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var6;
                        var10001 = this.field7697[var5];
                     }
                  }
               }

               boolean var8 = var10000 == var10001;
               int var9 = this.field7697[var5];
               int var10 = this.field7697[var5 - 1];
               if (~(this.field7696 + var10) > ~var6 && ~(-this.field7696 + var9) < ~var6) {
                  int var11 = 0;
                  if (var3 != 0 || ~var11 > ~class344.field5238) {
                     do {
                        int var12 = 0;
                        int var13 = !var8 ? -this.field7680 : this.field7680;
                        int var14 = (this.field7695 * var13 >> 12) + class757.field11167[var11];
                        if (var3 != 0) {
                           var14 += 4096;
                        }

                        while(var14 < 0) {
                           var14 += 4096;
                        }

                        if (var3 != 0) {
                           var14 -= 4096;
                        }

                        while(var14 > 4096) {
                           var14 -= 4096;
                        }

                        int var15;
                        int var16;
                        label124: {
                           int var17;
                           if (var3 != 0) {
                              var10000 = ~this.field7692[var7][var12];
                              var10001 = ~var14;
                           } else if (var12 >= this.field7688) {
                              var15 = var12 - 1;
                              var16 = this.field7692[var7][var12];
                              var17 = this.field7692[var7][var15];
                              var10000 = ~var14;
                              var10001 = ~(var17 - -this.field7696);
                              if (var3 == 0) {
                                 break label124;
                              }
                           } else {
                              var10000 = ~this.field7692[var7][var12];
                              var10001 = ~var14;
                           }

                           label123:
                           while(true) {
                              while(var10000 < var10001) {
                                 var15 = var12 - 1;
                                 var16 = this.field7692[var7][var12];
                                 var17 = this.field7692[var7][var15];
                                 var10000 = ~var14;
                                 var10001 = ~(var17 - -this.field7696);
                                 if (var3 == 0) {
                                    break label123;
                                 }
                              }

                              ++var12;
                              if (var12 >= this.field7688) {
                                 var15 = var12 - 1;
                                 var16 = this.field7692[var7][var12];
                                 var17 = this.field7692[var7][var15];
                                 var10000 = ~var14;
                                 var10001 = ~(var17 - -this.field7696);
                                 if (var3 == 0) {
                                    break;
                                 }
                              } else {
                                 var10000 = ~this.field7692[var7][var12];
                                 var10001 = ~var14;
                              }
                           }
                        }

                        if (var10000 < var10001 && ~(-this.field7696 + var16) < ~var14) {
                           var4[var11] = this.field7689[var7][var15];
                           ++var11;
                        } else {
                           var4[var11] = 0;
                           if (var3 != 0) {
                              var4[var11] = this.field7689[var7][var15];
                              ++var11;
                           } else {
                              ++var11;
                           }
                        }
                     } while(~var11 > ~class344.field5238);
                  }

                  if (var3 == 0) {
                     return var4;
                  }
               }

               class195.method1494(var4, 0, class344.field5238, 0);
            }

            return var4;
         }
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field7698[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(IIIZI)V"
   )
   public static final void method3912(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field7678;
         if (arg3) {
            if (arg0 != 8 && ~arg0 != -17) {
               class72 var6 = class353.field5360[arg1][arg4][arg2];
               if (var6 != null) {
                  label47: {
                     if (arg0 == 1) {
                        var6.field909 = 0;
                        if (var5 == 0) {
                           break label47;
                        }
                     }

                     if (~arg0 == -3) {
                        var6.field914 = 0;
                     }
                  }
               }

               class749.method5463((byte)-46);
            } else {
               int var7 = 0;
               if (var5 != 0 || ~class601.field8821 < ~var7) {
                  do {
                     class246 var8 = class368.field5540[var7];
                     if (var8.field3179 == arg0 && ~var8.field3170 == ~arg4 && var8.field3173 == arg2 || ~var8.field3171 == ~arg4 && ~var8.field3173 == ~arg2) {
                        if (~class601.field8821 != ~var7) {
                           class195.method1496(class368.field5540, var7 + 1, class368.field5540, var7, -var7 - 1 + class368.field5540.length);
                        }

                        --class601.field8821;
                        return;
                     }

                     ++var7;
                  } while(~class601.field8821 < ~var7);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7698[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3913(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3914(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
