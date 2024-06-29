import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class379 extends class307 {
   @OriginalMember(
      owner = "client!gu",
      name = "v",
      descriptor = "Lsb;"
   )
   private class261 field5535 = new class261();
   @OriginalMember(
      owner = "client!gu",
      name = "s",
      descriptor = "I"
   )
   private int field5546 = 256;
   @OriginalMember(
      owner = "client!gu",
      name = "D",
      descriptor = "I"
   )
   private int field5547 = 256;
   @OriginalMember(
      owner = "client!gu",
      name = "I",
      descriptor = "I"
   )
   private int field5552 = 0;
   @OriginalMember(
      owner = "client!gu",
      name = "K",
      descriptor = "I"
   )
   private int field5544;
   @OriginalMember(
      owner = "client!gu",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5555 = new String[]{method2964(method2963("\u0000\u000e9]t")), method2964(method2963("\u0000\u000e9Ft")), method2964(method2963("\u0000\u000e9Et")), method2964(method2963("\u0000\u000e9M\u001dO")), method2964(method2963("\u0000\u000e9[t")), method2964(method2963("\t\u000e{c")), method2964(method2963("\u001cU9!!")), method2964(method2963("\u0000\u000e9Dt")), method2964(method2963("\u0000\u000e9Gt")), method2964(method2963("\u0000\u000e9Kt")), method2964(method2963("\u0000\u000e9Lt")), method2964(method2963("\u0000\u000e9Ct")), method2964(method2963("\u0000\u000e9Mt")), method2964(method2963("\u0000\u000e9Ht")), method2964(method2963("\u0000\u000e935\t\u0012c1t")), method2964(method2963("\u0000\u000e9It")), method2964(method2963("\u0000\u000e9Nt")), method2964(method2963("\u0000\u000e9Jt")), method2964(method2963("\u0000\u000e9@t"))};
   @OriginalMember(
      owner = "client!gu",
      name = "A",
      descriptor = "Lsb;"
   )
   public static class261 field5534 = new class261();
   @OriginalMember(
      owner = "client!gu",
      name = "w",
      descriptor = "[S"
   )
   public static short[] field5550 = new short[]{16, 20, 60, 52, 53, 18, 48, 4};
   @OriginalMember(
      owner = "client!gu",
      name = "F",
      descriptor = "I"
   )
   public static int field5553 = 0;
   @OriginalMember(
      owner = "client!gu",
      name = "q",
      descriptor = "I"
   )
   public static int field5528;
   @OriginalMember(
      owner = "client!gu",
      name = "C",
      descriptor = "I"
   )
   public static int field5529;
   @OriginalMember(
      owner = "client!gu",
      name = "r",
      descriptor = "I"
   )
   public static int field5530;
   @OriginalMember(
      owner = "client!gu",
      name = "H",
      descriptor = "I"
   )
   public static int field5531;
   @OriginalMember(
      owner = "client!gu",
      name = "B",
      descriptor = "I"
   )
   public static int field5532;
   @OriginalMember(
      owner = "client!gu",
      name = "N",
      descriptor = "I"
   )
   public static int field5533;
   @OriginalMember(
      owner = "client!gu",
      name = "y",
      descriptor = "I"
   )
   public static int field5536;
   @OriginalMember(
      owner = "client!gu",
      name = "p",
      descriptor = "I"
   )
   public static int field5537;
   @OriginalMember(
      owner = "client!gu",
      name = "u",
      descriptor = "I"
   )
   public static int field5538;
   @OriginalMember(
      owner = "client!gu",
      name = "E",
      descriptor = "I"
   )
   public static int field5539;
   @OriginalMember(
      owner = "client!gu",
      name = "n",
      descriptor = "I"
   )
   public static int field5540;
   @OriginalMember(
      owner = "client!gu",
      name = "t",
      descriptor = "I"
   )
   public static int field5541;
   @OriginalMember(
      owner = "client!gu",
      name = "M",
      descriptor = "I"
   )
   public static int field5542;
   @OriginalMember(
      owner = "client!gu",
      name = "L",
      descriptor = "I"
   )
   public static int field5543;
   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "I"
   )
   public static int field5545;
   @OriginalMember(
      owner = "client!gu",
      name = "G",
      descriptor = "I"
   )
   private int field5549;
   @OriginalMember(
      owner = "client!gu",
      name = "J",
      descriptor = "Lsa;"
   )
   public static class39 field5554;
   @OriginalMember(
      owner = "client!gu",
      name = "o",
      descriptor = "Z"
   )
   private boolean field5548;
   @OriginalMember(
      owner = "client!gu",
      name = "x",
      descriptor = "Z"
   )
   private boolean field5551;

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(ZZIZI)I"
   )
   public static final int method2952(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field5531;
         class380 var6 = class231.method2056(arg2, arg1, Integer.MIN_VALUE);
         if (var6 == null) {
            return 0;
         } else {
            int var7 = 0;
            if (!arg3) {
               field5550 = null;
            }

            int var8 = 0;
            int var10000;
            if (var5) {
               var10000 = ~var6.field5559[var8];
            } else if (~var6.field5559.length >= ~var8) {
               var10000 = var7;
               if (!var5) {
                  return var7;
               }
            } else {
               var10000 = ~var6.field5559[var8];
            }

            while(true) {
               if (var10000 <= -1) {
                  if (var6.field5559[var8] < class201.field2882.field11272) {
                     class618 var9 = class201.field2882.method5591(var6.field5559[var8], (byte)-84);
                     int var10 = var9.method4549(class746.field10611.method1224(arg4, 11).field816, 0, arg4);
                     if (!arg0) {
                        var7 += var10;
                        if (var5) {
                           var7 += var6.field5560[var8] * var10;
                           ++var8;
                        } else {
                           ++var8;
                        }
                     } else {
                        var7 += var6.field5560[var8] * var10;
                        ++var8;
                     }
                  } else {
                     ++var8;
                  }
               } else {
                  ++var8;
               }

               if (~var6.field5559.length >= ~var8) {
                  var10000 = var7;
                  if (!var5) {
                     return var7;
                  }
               } else {
                  var10000 = ~var6.field5559[var8];
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field5555[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method564(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field5543;
         if (!this.field5551) {
            if (this.method2954((byte)87) == null) {
               if (this.field5548) {
                  this.method2140((byte)-120);
                  class66.field962.method77(-62);
               }

            } else {
               int var5 = arg1 - -arg2;
               if (class235.field3645) {
                  var5 <<= 1;
               }

               byte var6 = 0;
               byte var7 = 0;
               class269 var8;
               if (~this.field5544 == -3) {
                  var7 = 1;
                  if (var4) {
                     var8 = this.method2954((byte)-106);
                     if (var8 == null) {
                        return;
                     }
                  } else {
                     if (var5 <= arg1) {
                        return;
                     }

                     var8 = this.method2954((byte)-106);
                     if (var8 == null) {
                        return;
                     }
                  }
               } else {
                  if (var5 <= arg1) {
                     return;
                  }

                  var8 = this.method2954((byte)-106);
                  if (var8 == null) {
                     return;
                  }
               }

               label145:
               do {
                  do {
                     int var10000;
                     int var10001;
                     label136: {
                        short[][] var9 = var8.field4124;
                        if (!var4) {
                           if (arg1 >= var5) {
                              var10000 = ~this.field5549;
                              var10001 = ~var9[0].length;
                              break label136;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field5549;
                           if (var4) {
                              break label136;
                           }

                           if (var10000 <= var10001) {
                              var10000 = ~this.field5549;
                              var10001 = ~var9[0].length;
                              break label136;
                           }
                        }

                        while(true) {
                           if (!class235.field3645) {
                              var10001 = arg1++;
                              arg0[var10001] += var9[var6][this.field5549] * this.field5547 + var9[var7][this.field5549] * this.field5546;
                              if (var4) {
                                 arg0[arg1++] = var9[var6][this.field5549] * this.field5547;
                                 arg0[arg1++] = var9[var7][this.field5549] * this.field5546;
                                 ++this.field5549;
                              } else {
                                 ++this.field5549;
                              }
                           } else {
                              arg0[arg1++] = var9[var6][this.field5549] * this.field5547;
                              arg0[arg1++] = var9[var7][this.field5549] * this.field5546;
                              ++this.field5549;
                           }

                           if (arg1 >= var5) {
                              var10000 = ~this.field5549;
                              var10001 = ~var9[0].length;
                              break;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field5549;
                           if (var4) {
                              break;
                           }

                           if (var10000 <= var10001) {
                              var10000 = ~this.field5549;
                              var10001 = ~var9[0].length;
                              break;
                           }
                        }
                     }

                     if (var10000 <= var10001) {
                        if (var4) {
                           var8 = this.method2954((byte)-118);
                           continue label145;
                        }

                        this.method2960((byte)-118);
                     }

                     if (var5 <= arg1) {
                        return;
                     }

                     var8 = this.method2954((byte)-106);
                  } while(var8 != null);

                  return;
               } while(var8 != null);

            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5555[4] + (arg0 != null ? field5555[6] : field5555[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(Z)I"
   )
   public final synchronized int method2953(boolean arg0) {
      try {
         if (arg0) {
            return -20;
         } else {
            ++field5536;
            return this.field5552;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5555[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(B)Lqt;"
   )
   private final synchronized class269 method2954(byte arg0) {
      try {
         int var2 = -70 % ((23 - arg0) / 44);
         ++field5542;
         return (class269)this.field5535.method2245((byte)-94);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5555[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "()Lnj;"
   )
   public final class307 method566() {
      try {
         ++field5533;
         return null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5555[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(IID)Lqt;"
   )
   public final class269 method2955(int arg0, int arg1, double arg2) {
      try {
         class269 var7;
         label19: {
            ++field5537;
            long var5 = (long)(arg0 | this.field5544 << 0);
            var7 = (class269)class66.field962.method78(0, var5);
            if (var7 != null) {
               var7.field4127 = arg2;
               class66.field962.method74(true, var5);
               if (!client.field10022) {
                  break label19;
               }
            }

            var7 = new class269(new short[this.field5544][arg0], arg2);
         }

         if (arg1 != -19681) {
            this.field5551 = false;
         }

         return var7;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5555[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "(I)D"
   )
   public final synchronized double method2956(int arg0) {
      try {
         ++field5545;
         if (~this.field5552 > -2) {
            return -1.0D;
         } else {
            class269 var2 = (class269)this.field5535.method2245((byte)-94);
            if (arg0 <= 57) {
               return 0.4365780673652762D;
            } else {
               return var2 == null ? -1.0D : (double)(-((float)var2.field4124[0].length / (float)class358.field5291)) + var2.field4127;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5555[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "d",
      descriptor = "()I"
   )
   public final int method563() {
      try {
         ++field5540;
         return 1;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5555[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "c",
      descriptor = "()Lnj;"
   )
   public final class307 method558() {
      try {
         ++field5538;
         return null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5555[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "(Z)V"
   )
   public final synchronized void method2957(boolean arg0) {
      try {
         if (arg0) {
            this.method2960((byte)1);
         }

         this.field5548 = true;
         ++field5539;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5555[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(ILqt;)V"
   )
   public final synchronized void method2958(int arg0, class269 arg1) {
      boolean var3 = client.field10022;

      try {
         if (var3) {
            this.field5535.method2235(-92);
            --this.field5552;
         }

         while(true) {
            if (this.field5552 < 100) {
               ++field5529;
               this.field5535.method2238(arg1, arg0 + -87);
               if (!var3) {
                  if (arg0 != 100) {
                     this.field5549 = -60;
                  }

                  ++this.field5552;
                  return;
               }
            } else {
               this.field5535.method2235(-92);
            }

            --this.field5552;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5555[13] + arg0 + ',' + (arg1 != null ? field5555[6] : field5555[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final synchronized void method2959(boolean arg0, int arg1) {
      try {
         if (arg1 > -32) {
            this.method2956(-106);
         }

         ++field5530;
         this.field5551 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5555[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "(B)V"
   )
   private final synchronized void method2960(byte arg0) {
      try {
         if (arg0 != -118) {
            this.field5551 = false;
         }

         ++field5528;
         class269 var2 = this.method2954((byte)89);
         if (var2 != null) {
            var2.method2140((byte)-95);
            this.field5549 = 0;
            --this.field5552;
            class66.field962.method73((byte)108, var2.method2296(false), var2);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5555[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2961(byte arg0, int arg1) {
      try {
         this.field5547 = arg1;
         ++field5541;
         this.field5546 = arg1;
         if (arg0 >= -47) {
            method2962(true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5555[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method561(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field5532;
         if (!this.field5551) {
            while(true) {
               class269 var3 = this.method2954((byte)-115);
               int var10000;
               if (var3 == null) {
                  var10000 = this.field5548;
                  if (!var2) {
                     if (var10000 != 0) {
                        this.method2140((byte)58);
                        class66.field962.method77(-115);
                     }

                     return;
                  }
               } else {
                  var10000 = ~(var3.field4124[0].length - this.field5549);
               }

               if (var10000 < ~arg0) {
                  this.field5549 += arg0;
                  return;
               }

               arg0 -= var3.field4124[0].length + -this.field5549;
               this.method2960((byte)-118);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5555[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method2962(boolean arg0) {
      try {
         field5534 = null;
         field5554 = null;
         field5550 = null;
         if (!arg0) {
            method2952(false, false, 39, false, 46);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5555[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class379(int arg0) {
      try {
         this.field5544 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5555[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2964(char[] arg0) {
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
            var10005 = 123;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
