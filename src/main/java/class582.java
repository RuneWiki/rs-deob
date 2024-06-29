import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class582 extends class70 {
   @OriginalMember(
      owner = "client!vaa",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8602 = new String[]{method4353(method4352("\u001cX6!\u001f")), method4353(method4352("\u0011\u0017y!&O")), method4353(method4352("\t\u0003tc")), method4353(method4352("\u0011\u0017y!-O")), method4353(method4352("\u0011\u0017y!!O")), method4353(method4352("\u0011\u0017y!%O")), method4353(method4352("\u0011\u0017y! O")), method4353(method4352("\u0011\u0017y!'O"))};
   @OriginalMember(
      owner = "client!vaa",
      name = "J",
      descriptor = "Lifa;"
   )
   public static class75 field8596 = new class75(2, 2);
   @OriginalMember(
      owner = "client!vaa",
      name = "I",
      descriptor = "I"
   )
   public static int field8593;
   @OriginalMember(
      owner = "client!vaa",
      name = "N",
      descriptor = "I"
   )
   public static int field8594;
   @OriginalMember(
      owner = "client!vaa",
      name = "O",
      descriptor = "I"
   )
   public static int field8597;
   @OriginalMember(
      owner = "client!vaa",
      name = "M",
      descriptor = "I"
   )
   public static int field8598;
   @OriginalMember(
      owner = "client!vaa",
      name = "Q",
      descriptor = "I"
   )
   public static int field8599;
   @OriginalMember(
      owner = "client!vaa",
      name = "L",
      descriptor = "I"
   )
   public static int field8600;
   @OriginalMember(
      owner = "client!vaa",
      name = "K",
      descriptor = "I"
   )
   public static int field8601;
   @OriginalMember(
      owner = "client!vaa",
      name = "P",
      descriptor = "[Lwda;"
   )
   private class493[] field8595;

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method4349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field8600;
         if (arg0 != 0) {
            field8596 = null;
         }

         if (~arg3 == ~arg7) {
            class362.method2853(arg5, arg6, arg1, arg2, arg4, arg7, (byte)-112);
         } else if (~(-arg7 + arg1) <= ~class415.field5689 && ~class282.field3921 <= ~(arg1 - -arg7) && class577.field8561 <= arg5 - arg3 && ~class586.field8647 <= ~(arg3 + arg5)) {
            class255.method2052(arg6, arg4, arg7, arg1, 0, arg2, arg3, arg5);
         } else {
            class428.method3312(arg3, arg5, 3, arg2, arg1, arg4, arg7, arg6);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8602[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label133: {
            if (~arg2 == -1) {
               this.field8595 = new class493[arg1.method640(255)];
               int var5 = 0;
               if (var4 || ~var5 > ~this.field8595.length) {
                  do {
                     int var6 = arg1.method640(255);
                     if (var6 != 0) {
                        if (~var6 != -2) {
                           if (~var6 != -3) {
                              if (~var6 == -4) {
                                 if (var4) {
                                    this.field8595[var5] = class365.method2885(-27532, arg1);
                                    if (var4) {
                                       this.field8595[var5] = class796.method5737(arg1, (byte)108);
                                       if (var4) {
                                          this.field8595[var5] = class633.method4668(arg1, (byte)58);
                                          if (var4) {
                                             this.field8595[var5] = class423.method3285(-104, arg1);
                                             ++var5;
                                          } else {
                                             ++var5;
                                          }
                                       } else {
                                          ++var5;
                                       }
                                    } else {
                                       ++var5;
                                    }
                                 } else {
                                    this.field8595[var5] = class423.method3285(-104, arg1);
                                    ++var5;
                                 }
                              } else {
                                 ++var5;
                              }
                           } else {
                              this.field8595[var5] = class633.method4668(arg1, (byte)58);
                              if (var4) {
                                 this.field8595[var5] = class423.method3285(-104, arg1);
                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           }
                        } else {
                           this.field8595[var5] = class796.method5737(arg1, (byte)108);
                           if (var4) {
                              this.field8595[var5] = class633.method4668(arg1, (byte)58);
                              if (var4) {
                                 this.field8595[var5] = class423.method3285(-104, arg1);
                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        }
                     } else {
                        this.field8595[var5] = class365.method2885(-27532, arg1);
                        if (var4) {
                           this.field8595[var5] = class796.method5737(arg1, (byte)108);
                           if (var4) {
                              this.field8595[var5] = class633.method4668(arg1, (byte)58);
                              if (var4) {
                                 this.field8595[var5] = class423.method3285(-104, arg1);
                                 ++var5;
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     }
                  } while(~var5 > ~this.field8595.length);
               }

               if (!var4) {
                  break label133;
               }
            }

            if (~arg2 == -2) {
               super.field930 = arg1.method640(255) == 1;
            }
         }

         if (arg0 > -34) {
            this.method547(2, 68);
         }

         ++field8601;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8602[4] + arg0 + ',' + (arg1 != null ? field8602[0] : field8602[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(I[[I)V"
   )
   private final void method4350(int arg0, int[][] arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8594;
         int var4 = class262.field3328;
         int var5 = class99.field1313;
         if (arg0 != 9533) {
            this.method550(-16, (class66)null, 14);
         }

         class659.method4831(arg1, true);
         class188.method1578(class623.field9205, class174.field2249, 0, 0, 9472);
         if (this.field8595 != null) {
            int var6 = 0;
            if (var3 || this.field8595.length > var6) {
               do {
                  class493 var7 = this.field8595[var6];
                  int var8 = var7.field6886;
                  int var9 = var7.field6887;
                  if (~var8 <= -1) {
                     if (var9 >= 0) {
                        var7.method2668(var4, false, var5);
                        if (!var3) {
                           ++var6;
                           continue;
                        }
                     }

                     var7.method2671(var5, -2, var4);
                     if (var3) {
                        if (~var9 <= -1) {
                           var7.method2673(var4, var5, true);
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     if (~var9 <= -1) {
                        var7.method2673(var4, var5, true);
                     }

                     ++var6;
                  }
               } while(this.field8595.length > var6);

            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8602[1] + arg0 + ',' + (arg1 != null ? field8602[0] : field8602[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method4351(int arg0) {
      try {
         if (arg0 != 9526) {
            method4349(49, 47, 77, -66, -29, 44, 80, -123);
         }

         field8596 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8602[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field8597;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (arg0 != -6752) {
            this.method4350(46, (int[][])null);
         }

         if (super.field926.field5048) {
            int var5 = class262.field3328;
            int var6 = class99.field1313;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field926.method2859(arg0 ^ -6666);
            this.method4350(arg0 ^ -16227, var7);
            int var9 = 0;
            if (var3 || class99.field1313 > var9) {
               do {
                  int[] var10 = var7[var9];
                  int[][] var11 = var8[var9];
                  int[] var12 = var11[0];
                  int[] var13 = var11[1];
                  int[] var14 = var11[2];
                  int var15 = 0;
                  if (var3 || class262.field3328 > var15) {
                     do {
                        int var16 = var10[var15];
                        var14[var15] = class109.method974(var16, 255) << 4;
                        var13[var15] = class109.method974(4080, var16 >> 4);
                        var12[var15] = class109.method974(16711680, var16) >> 12;
                        ++var15;
                     } while(class262.field3328 > var15);
                  }

                  ++var9;
               } while(class99.field1313 > var9);
            }
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field8602[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "<init>",
      descriptor = "()V"
   )
   public class582() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      try {
         ++field8593;
         int[] var3 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            this.method4350(9533, super.field940.method117((byte)-101));
         }

         return arg0 != -63 ? null : var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8602[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
