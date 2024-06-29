import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class93 extends class629 {
   @OriginalMember(
      owner = "client!vga",
      name = "R",
      descriptor = "I"
   )
   private int field1498 = 204;
   @OriginalMember(
      owner = "client!vga",
      name = "T",
      descriptor = "I"
   )
   private int field1494 = 0;
   @OriginalMember(
      owner = "client!vga",
      name = "O",
      descriptor = "I"
   )
   private int field1507 = 4;
   @OriginalMember(
      owner = "client!vga",
      name = "J",
      descriptor = "I"
   )
   private int field1504 = 8;
   @OriginalMember(
      owner = "client!vga",
      name = "N",
      descriptor = "I"
   )
   private int field1501 = 1024;
   @OriginalMember(
      owner = "client!vga",
      name = "E",
      descriptor = "I"
   )
   private int field1508 = 1024;
   @OriginalMember(
      owner = "client!vga",
      name = "I",
      descriptor = "I"
   )
   private int field1511 = 81;
   @OriginalMember(
      owner = "client!vga",
      name = "X",
      descriptor = "I"
   )
   private int field1492 = 409;
   @OriginalMember(
      owner = "client!vga",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1518 = new String[]{method904(method903(";\u007f$1\u001fe")), method904(method903(";\u007f$1\u0006e")), method904(method903(";\u007f$1\u0000e")), method904(method903(";\u007f$1\u0001e")), method904(method903(";\u007f$1\u001ee")), method904(method903(";\u007f$1\ne")), method904(method903("66k12")), method904(method903("#m)s")), method904(method903(";\u007f$1\u0002e")), method904(method903(";\u007f$1\u0005e"))};
   @OriginalMember(
      owner = "client!vga",
      name = "F",
      descriptor = "[Lhca;"
   )
   public static class513[] field1499 = new class513[14];
   @OriginalMember(
      owner = "client!vga",
      name = "cb",
      descriptor = "[B"
   )
   public static byte[] field1493;
   @OriginalMember(
      owner = "client!vga",
      name = "bb",
      descriptor = "Lgh;"
   )
   public static class572 field1514;
   @OriginalMember(
      owner = "client!vga",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field1517;
   @OriginalMember(
      owner = "client!vga",
      name = "S",
      descriptor = "Lpg;"
   )
   public static class762 field1516;
   @OriginalMember(
      owner = "client!vga",
      name = "H",
      descriptor = "I"
   )
   public static int field1496;
   @OriginalMember(
      owner = "client!vga",
      name = "Q",
      descriptor = "I"
   )
   private int field1497;
   @OriginalMember(
      owner = "client!vga",
      name = "K",
      descriptor = "I"
   )
   public static int field1502;
   @OriginalMember(
      owner = "client!vga",
      name = "U",
      descriptor = "I"
   )
   public static int field1503;
   @OriginalMember(
      owner = "client!vga",
      name = "ab",
      descriptor = "I"
   )
   public static int field1505;
   @OriginalMember(
      owner = "client!vga",
      name = "Z",
      descriptor = "I"
   )
   private int field1506;
   @OriginalMember(
      owner = "client!vga",
      name = "P",
      descriptor = "I"
   )
   public static int field1510;
   @OriginalMember(
      owner = "client!vga",
      name = "V",
      descriptor = "I"
   )
   public static int field1512;
   @OriginalMember(
      owner = "client!vga",
      name = "L",
      descriptor = "I"
   )
   private int field1513;
   @OriginalMember(
      owner = "client!vga",
      name = "D",
      descriptor = "I"
   )
   public static int field1515;
   @OriginalMember(
      owner = "client!vga",
      name = "M",
      descriptor = "[I"
   )
   private int[] field1500;
   @OriginalMember(
      owner = "client!vga",
      name = "Y",
      descriptor = "[[I"
   )
   private int[][] field1495;
   @OriginalMember(
      owner = "client!vga",
      name = "db",
      descriptor = "[[I"
   )
   private int[][] field1509;

   @OriginalMember(
      owner = "client!vga",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method897(int arg0) {
      try {
         field1517 = null;
         field1493 = null;
         if (arg0 != 0) {
            method897(54);
         }

         field1499 = null;
         field1514 = null;
         field1516 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1518[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method898(int arg0, byte arg1, int arg2) {
      try {
         ++field1505;
         if (arg1 < 31) {
            method897(68);
         }

         class3.field22 = -class370.field5494 + arg0;
         class493.field7185 = -class370.field5513 + arg2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1518[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "<init>",
      descriptor = "()V"
   )
   public class93() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!vga",
      name = "c",
      descriptor = "(II)I"
   )
   public static int method899(int arg0, int arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1518[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method900(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1510;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            this.method45(-32, -124);
         }

         if (super.field9161.field7474) {
            int var5 = 0;
            int var6 = class442.field6448[arg0] - -this.field1494;
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
            label161: {
               if (var3) {
                  var10000 = ~var6;
                  var10001 = ~this.field1500[var5];
               } else if (~this.field1504 >= ~var5) {
                  var7 = var5 + -1;
                  var10000 = ~(1 & var5);
                  var10001 = -1;
                  if (!var3) {
                     break label161;
                  }
               } else {
                  var10000 = ~var6;
                  var10001 = ~this.field1500[var5];
               }

               label160:
               while(true) {
                  while(var10000 > var10001) {
                     var7 = var5 + -1;
                     var10000 = ~(1 & var5);
                     var10001 = -1;
                     if (!var3) {
                        break label160;
                     }
                  }

                  ++var5;
                  if (~this.field1504 >= ~var5) {
                     var7 = var5 + -1;
                     var10000 = ~(1 & var5);
                     var10001 = -1;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = ~var6;
                     var10001 = ~this.field1500[var5];
                  }
               }
            }

            boolean var8 = var10000 == var10001;
            int var9 = this.field1500[var5];
            int var10 = this.field1500[var5 + -1];
            if (var10 - -this.field1513 >= var6 || ~(-this.field1513 + var9) >= ~var6) {
               class365.method2852(var4, 0, class66.field1214, 0);
               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || class66.field1214 > var11) {
               do {
                  int var12 = var8 ? this.field1501 : -this.field1501;
                  int var13 = 0;
                  int var14 = (this.field1497 * var12 >> 12) + class429.field6201[var11];
                  if (var3) {
                     var14 += 4096;
                  }

                  while(~var14 > -1) {
                     var14 += 4096;
                  }

                  if (var3) {
                     var14 -= 4096;
                  }

                  while(~var14 < -4097) {
                     var14 -= 4096;
                  }

                  int var15;
                  int var16;
                  label116: {
                     int var17;
                     if (var3) {
                        var10000 = ~var14;
                        var10001 = ~this.field1495[var7][var13];
                     } else if (var13 >= this.field1507) {
                        var15 = var13 + -1;
                        var16 = this.field1495[var7][var13];
                        var17 = this.field1495[var7][var15];
                        var10000 = ~var14;
                        var10001 = ~(this.field1513 + var17);
                        if (!var3) {
                           break label116;
                        }
                     } else {
                        var10000 = ~var14;
                        var10001 = ~this.field1495[var7][var13];
                     }

                     label115:
                     while(true) {
                        while(var10000 > var10001) {
                           var15 = var13 + -1;
                           var16 = this.field1495[var7][var13];
                           var17 = this.field1495[var7][var15];
                           var10000 = ~var14;
                           var10001 = ~(this.field1513 + var17);
                           if (!var3) {
                              break label115;
                           }
                        }

                        ++var13;
                        if (var13 >= this.field1507) {
                           var15 = var13 + -1;
                           var16 = this.field1495[var7][var13];
                           var17 = this.field1495[var7][var15];
                           var10000 = ~var14;
                           var10001 = ~(this.field1513 + var17);
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = ~var14;
                           var10001 = ~this.field1495[var7][var13];
                        }
                     }
                  }

                  if (var10000 >= var10001 || ~(-this.field1513 + var16) >= ~var14) {
                     var4[var11] = 0;
                     if (!var3) {
                        ++var11;
                        continue;
                     }
                  }

                  var4[var11] = this.field1509[var7][var15];
                  ++var11;
               } while(class66.field1214 > var11);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field1518[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg1 == 0) {
            label90: {
               label89: {
                  label88: {
                     label87: {
                        label86: {
                           label85: {
                              label84: {
                                 label83: {
                                    if (~arg2 != -1) {
                                       if (arg2 == 1) {
                                          break label83;
                                       }

                                       if (arg2 == 2) {
                                          break label84;
                                       }

                                       if (~arg2 == -4) {
                                          break label85;
                                       }

                                       if (arg2 == 4) {
                                          break label86;
                                       }

                                       if (~arg2 == -6) {
                                          break label87;
                                       }

                                       if (~arg2 == -7) {
                                          break label88;
                                       }

                                       if (arg2 != 7) {
                                          break label90;
                                       }

                                       if (!var4) {
                                          break label89;
                                       }
                                    }

                                    this.field1507 = arg0.method3564((byte)-110);
                                    if (!var4) {
                                       break label90;
                                    }
                                 }

                                 this.field1504 = arg0.method3564((byte)-110);
                                 if (!var4) {
                                    break label90;
                                 }
                              }

                              this.field1492 = arg0.method3565(true);
                              if (!var4) {
                                 break label90;
                              }
                           }

                           this.field1498 = arg0.method3565(true);
                           if (!var4) {
                              break label90;
                           }
                        }

                        this.field1501 = arg0.method3565(true);
                        if (!var4) {
                           break label90;
                        }
                     }

                     this.field1494 = arg0.method3565(true);
                     if (!var4) {
                        break label90;
                     }
                  }

                  this.field1511 = arg0.method3565(true);
                  if (!var4) {
                     break label90;
                  }
               }

               this.field1508 = arg0.method3565(true);
            }

            ++field1496;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1518[5] + (arg0 != null ? field1518[6] : field1518[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method901(int arg0) {
      try {
         ++field1502;
         if (arg0 == 245880940) {
            this.method900(21541);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1518[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method902(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field1512;
         class728.method5259(81);
         if (arg0 != -30146) {
            method897(-54);
         }

         label42: {
            label41: {
               int var2 = class510.field7454.field11167.method3448(false);
               if (var2 != 2) {
                  if (~var2 != -4) {
                     break label42;
                  }

                  if (!var1) {
                     break label41;
                  }
               }

               class640.method4685(class444.field6473, class720.field10406, arg0 ^ 20388, 100, class218.field3296, 100);
               if (!var1) {
                  break label42;
               }
            }

            class164.method1498(class720.field10406, class548.field7916, 2, class218.field3296, class151.field2424, 2, class444.field6473, arg0 + 30085);
         }

         if (class510.field7454.field11167.method3445(false)) {
            class460.method3455(class386.field5692, (byte)106);
         }

         if (class444.field6473 != null) {
            class763.method5510(-25909);
         }

         class679.field9962 = class510.field7454.field11167.method3448(false) != 0;
         class262.field3734 = class510.field7454.field11167.method3445(false);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1518[0] + arg0 + ')');
      }
   }

   static {
      int var0 = 0;
      field1493 = new byte[32896];

      for(int var1 = 0; ~var1 > -257; ++var1) {
         for(int var2 = 0; var2 <= var1; ++var2) {
            field1493[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)(var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
         }
      }

      field1514 = new class572(134, 17);
      field1517 = new int[3];
      field1516 = new class762(method904(method903("\u0004V\u0011]\n\u0019Y")), method904(method903("\"~#v,(")), method904(method903("\u0012q+k-(l$")), 6);
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method903(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method904(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
