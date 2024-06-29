import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class320 extends class70 {
   @OriginalMember(
      owner = "client!ho",
      name = "bb",
      descriptor = "I"
   )
   private int field4387 = 4;
   @OriginalMember(
      owner = "client!ho",
      name = "X",
      descriptor = "I"
   )
   private int field4394 = 1024;
   @OriginalMember(
      owner = "client!ho",
      name = "ab",
      descriptor = "I"
   )
   private int field4396 = 409;
   @OriginalMember(
      owner = "client!ho",
      name = "cb",
      descriptor = "I"
   )
   private int field4399 = 8;
   @OriginalMember(
      owner = "client!ho",
      name = "T",
      descriptor = "I"
   )
   private int field4392 = 0;
   @OriginalMember(
      owner = "client!ho",
      name = "M",
      descriptor = "I"
   )
   private int field4397 = 1024;
   @OriginalMember(
      owner = "client!ho",
      name = "V",
      descriptor = "I"
   )
   private int field4401 = 204;
   @OriginalMember(
      owner = "client!ho",
      name = "U",
      descriptor = "I"
   )
   private int field4406 = 81;
   @OriginalMember(
      owner = "client!ho",
      name = "db",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4408 = new String[]{method2524(method2523(")G\u0003%z")), method2524(method2523(")G\u0003/z")), method2524(method2523(":\u0006\u0003N/")), method2524(method2523(")G\u0003#z")), method2524(method2523("/]A\f")), method2524(method2523(")G\u0003,z")), method2524(method2523(")G\u0003$z"))};
   @OriginalMember(
      owner = "client!ho",
      name = "L",
      descriptor = "Lrca;"
   )
   public static class37 field4398 = new class37();
   @OriginalMember(
      owner = "client!ho",
      name = "W",
      descriptor = "I"
   )
   public static int field4402 = 0;
   @OriginalMember(
      owner = "client!ho",
      name = "P",
      descriptor = "Laka;"
   )
   public static class418 field4405 = new class418(138, 3);
   @OriginalMember(
      owner = "client!ho",
      name = "Z",
      descriptor = "I"
   )
   private int field4388;
   @OriginalMember(
      owner = "client!ho",
      name = "R",
      descriptor = "I"
   )
   public static int field4390;
   @OriginalMember(
      owner = "client!ho",
      name = "N",
      descriptor = "I"
   )
   public static int field4391;
   @OriginalMember(
      owner = "client!ho",
      name = "I",
      descriptor = "I"
   )
   private int field4395;
   @OriginalMember(
      owner = "client!ho",
      name = "K",
      descriptor = "I"
   )
   public static int field4400;
   @OriginalMember(
      owner = "client!ho",
      name = "J",
      descriptor = "I"
   )
   public static int field4403;
   @OriginalMember(
      owner = "client!ho",
      name = "O",
      descriptor = "I"
   )
   private int field4407;
   @OriginalMember(
      owner = "client!ho",
      name = "S",
      descriptor = "[I"
   )
   private int[] field4393;
   @OriginalMember(
      owner = "client!ho",
      name = "Y",
      descriptor = "[[I"
   )
   private int[][] field4389;
   @OriginalMember(
      owner = "client!ho",
      name = "Q",
      descriptor = "[[I"
   )
   private int[][] field4404;

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label91: {
            label90: {
               label89: {
                  label88: {
                     label87: {
                        label86: {
                           label85: {
                              label84: {
                                 if (arg2 != 0) {
                                    if (~arg2 == -2) {
                                       break label84;
                                    }

                                    if (arg2 == 2) {
                                       break label85;
                                    }

                                    if (arg2 == 3) {
                                       break label86;
                                    }

                                    if (~arg2 == -5) {
                                       break label87;
                                    }

                                    if (arg2 == 5) {
                                       break label88;
                                    }

                                    if (~arg2 == -7) {
                                       break label89;
                                    }

                                    if (~arg2 != -8) {
                                       break label91;
                                    }

                                    if (!var4) {
                                       break label90;
                                    }
                                 }

                                 this.field4387 = arg1.method640(255);
                                 if (!var4) {
                                    break label91;
                                 }
                              }

                              this.field4399 = arg1.method640(255);
                              if (!var4) {
                                 break label91;
                              }
                           }

                           this.field4396 = arg1.method603(-2);
                           if (!var4) {
                              break label91;
                           }
                        }

                        this.field4401 = arg1.method603(-2);
                        if (!var4) {
                           break label91;
                        }
                     }

                     this.field4394 = arg1.method603(-2);
                     if (!var4) {
                        break label91;
                     }
                  }

                  this.field4392 = arg1.method603(-2);
                  if (!var4) {
                     break label91;
                  }
               }

               this.field4406 = arg1.method603(-2);
               if (!var4) {
                  break label91;
               }
            }

            this.field4397 = arg1.method603(-2);
         }

         if (arg0 > -34) {
            this.method552(-70);
         }

         ++field4400;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4408[3] + arg0 + ',' + (arg1 != null ? field4408[2] : field4408[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         if (arg0 >= -36) {
            this.field4389 = null;
         }

         this.method2522((byte)-101);
         ++field4390;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4408[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field4391;
         if (arg0 != -63) {
            return null;
         } else {
            int[] var4 = super.field940.method119(false, arg1);
            if (super.field940.field270) {
               int var5 = 0;
               int var6 = class502.field6979[arg1] + this.field4392;
               if (var3) {
                  var6 += 4096;
               }

               while(var6 < 0) {
                  var6 += 4096;
               }

               if (var3) {
                  var6 -= 4096;
               }

               while(var6 > 4096) {
                  var6 -= 4096;
               }

               int var7;
               int var10000;
               int var10001;
               label166: {
                  if (var3) {
                     var10000 = ~this.field4393[var5];
                     var10001 = ~var6;
                  } else if (this.field4399 <= var5) {
                     var7 = var5 - 1;
                     var10000 = ~(var5 & 1);
                     var10001 = -1;
                     if (!var3) {
                        break label166;
                     }
                  } else {
                     var10000 = ~this.field4393[var5];
                     var10001 = ~var6;
                  }

                  label165:
                  while(true) {
                     while(var10000 < var10001) {
                        var7 = var5 - 1;
                        var10000 = ~(var5 & 1);
                        var10001 = -1;
                        if (!var3) {
                           break label165;
                        }
                     }

                     ++var5;
                     if (this.field4399 <= var5) {
                        var7 = var5 - 1;
                        var10000 = ~(var5 & 1);
                        var10001 = -1;
                        if (!var3) {
                           break;
                        }
                     } else {
                        var10000 = ~this.field4393[var5];
                        var10001 = ~var6;
                     }
                  }
               }

               boolean var8 = var10000 == var10001;
               int var9 = this.field4393[var5];
               int var10 = this.field4393[var5 + -1];
               if (~var6 >= ~(this.field4395 + var10) || ~(-this.field4395 + var9) >= ~var6) {
                  class349.method2764(var4, 0, class262.field3328, 0);
                  if (!var3) {
                     return var4;
                  }
               }

               int var11 = 0;
               if (var3 || ~class262.field3328 < ~var11) {
                  do {
                     int var12 = 0;
                     int var13 = !var8 ? -this.field4394 : this.field4394;
                     int var14 = (this.field4407 * var13 >> 12) + class17.field290[var11];
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
                     label129: {
                        int var17;
                        if (var3) {
                           var10000 = var14;
                           var10001 = this.field4389[var7][var12];
                        } else if (~var12 <= ~this.field4387) {
                           var15 = var12 + -1;
                           var16 = this.field4389[var7][var12];
                           var17 = this.field4389[var7][var15];
                           var10000 = ~var14;
                           var10001 = ~(this.field4395 + var17);
                           if (!var3) {
                              break label129;
                           }
                        } else {
                           var10000 = var14;
                           var10001 = this.field4389[var7][var12];
                        }

                        label128:
                        while(true) {
                           while(var10000 < var10001) {
                              var15 = var12 + -1;
                              var16 = this.field4389[var7][var12];
                              var17 = this.field4389[var7][var15];
                              var10000 = ~var14;
                              var10001 = ~(this.field4395 + var17);
                              if (!var3) {
                                 break label128;
                              }
                           }

                           ++var12;
                           if (~var12 <= ~this.field4387) {
                              var15 = var12 + -1;
                              var16 = this.field4389[var7][var12];
                              var17 = this.field4389[var7][var15];
                              var10000 = ~var14;
                              var10001 = ~(this.field4395 + var17);
                              if (!var3) {
                                 break;
                              }
                           } else {
                              var10000 = var14;
                              var10001 = this.field4389[var7][var12];
                           }
                        }
                     }

                     if (var10000 < var10001) {
                        if (-this.field4395 + var16 > var14) {
                           var4[var11] = this.field4404[var7][var15];
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
                  } while(~class262.field3328 < ~var11);
               }
            }

            return var4;
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field4408[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "<init>",
      descriptor = "()V"
   )
   public class320() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ho",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2521(byte arg0) {
      try {
         if (arg0 != -70) {
            field4402 = -17;
         }

         field4398 = null;
         field4405 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4408[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ho",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method2522(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ho",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
