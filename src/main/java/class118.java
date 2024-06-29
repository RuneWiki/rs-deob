import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class118 extends class70 {
   @OriginalMember(
      owner = "client!tl",
      name = "F",
      descriptor = "I"
   )
   private int field1575 = 5;
   @OriginalMember(
      owner = "client!tl",
      name = "L",
      descriptor = "[B"
   )
   private byte[] field1580 = new byte[512];
   @OriginalMember(
      owner = "client!tl",
      name = "G",
      descriptor = "I"
   )
   private int field1577 = 1;
   @OriginalMember(
      owner = "client!tl",
      name = "S",
      descriptor = "I"
   )
   private int field1576 = 0;
   @OriginalMember(
      owner = "client!tl",
      name = "K",
      descriptor = "I"
   )
   private int field1579 = 5;
   @OriginalMember(
      owner = "client!tl",
      name = "O",
      descriptor = "[S"
   )
   private short[] field1581 = new short[512];
   @OriginalMember(
      owner = "client!tl",
      name = "J",
      descriptor = "I"
   )
   private int field1588 = 2;
   @OriginalMember(
      owner = "client!tl",
      name = "P",
      descriptor = "I"
   )
   private int field1587 = 2048;
   @OriginalMember(
      owner = "client!tl",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1589 = new String[]{method1086(method1085("+Bxwv")), method1086(method1085("+Bxuv")), method1086(method1085("+Bx{v")), method1086(method1085("$\u0000x\u001d#")), method1086(method1085("1[:_")), method1086(method1085("+Bxpv")), method1086(method1085("+Bxvv")), method1086(method1085("+Bxqv"))};
   @OriginalMember(
      owner = "client!tl",
      name = "M",
      descriptor = "Luk;"
   )
   public static class498 field1578 = new class498(22, 1);
   @OriginalMember(
      owner = "client!tl",
      name = "I",
      descriptor = "I"
   )
   public static int field1582;
   @OriginalMember(
      owner = "client!tl",
      name = "H",
      descriptor = "I"
   )
   public static int field1583;
   @OriginalMember(
      owner = "client!tl",
      name = "R",
      descriptor = "I"
   )
   public static int field1584;
   @OriginalMember(
      owner = "client!tl",
      name = "N",
      descriptor = "I"
   )
   public static int field1585;
   @OriginalMember(
      owner = "client!tl",
      name = "Q",
      descriptor = "I"
   )
   public static int field1586;

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label82: {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              if (~arg1 != -1) {
                                 if (arg1 == 1) {
                                    break label76;
                                 }

                                 if (arg1 == 2) {
                                    break label77;
                                 }

                                 if (~arg1 == -4) {
                                    break label78;
                                 }

                                 if (~arg1 == -5) {
                                    break label79;
                                 }

                                 if (arg1 == 5) {
                                    break label80;
                                 }

                                 if (arg1 != 6) {
                                    break label82;
                                 }

                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field1579 = this.field1575 = arg2.method2855(-31007);
                              if (!var4) {
                                 break label82;
                              }
                           }

                           this.field1576 = arg2.method2855(-31007);
                           if (!var4) {
                              break label82;
                           }
                        }

                        this.field1587 = arg2.method2848(arg0 + -100);
                        if (!var4) {
                           break label82;
                        }
                     }

                     this.field1588 = arg2.method2855(-31007);
                     if (!var4) {
                        break label82;
                     }
                  }

                  this.field1577 = arg2.method2855(-31007);
                  if (!var4) {
                     break label82;
                  }
               }

               this.field1579 = arg2.method2855(-31007);
               if (!var4) {
                  break label82;
               }
            }

            this.field1575 = arg2.method2855(-31007);
         }

         ++field1582;
         if (arg0 != -1) {
            this.field1575 = 24;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1589[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1589[3] : field1589[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(IJZ)Ljava/lang/String;"
   )
   public static final String method1081(int arg0, long arg1, boolean arg2) {
      try {
         ++field1585;
         class552.method4193(27444, arg1);
         int var4 = class406.field6327.get(5);
         if (!arg2) {
            method1084((class78)null, true);
         }

         int var5 = class406.field6327.get(2);
         int var6 = class406.field6327.get(1);
         return ~arg0 == -4 ? class450.method3530(arg0, 8, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class578.field8544[arg0][var5] + "-" + var6;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1589[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "<init>",
      descriptor = "()V"
   )
   public class118() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "(Z)V"
   )
   private final void method1082(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field1583;
         if (arg0 != 87) {
            this.method274(-10, 97, (class354)null);
         }

         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int var5 = class204.field3113[arg1] * this.field1575 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            int var8 = 0;
            if (var3 || var8 < class678.field10127) {
               do {
                  int var10000;
                  int var21;
                  label325: {
                     class453.field6941 = Integer.MAX_VALUE;
                     class485.field7380 = Integer.MAX_VALUE;
                     class628.field9091 = Integer.MAX_VALUE;
                     class707.field10636 = Integer.MAX_VALUE;
                     int var9 = class199.field3060[var8] * this.field1579 + 2048;
                     int var10 = var9 >> 12;
                     int var11 = var10 + 1;
                     int var12 = var6 + -1;
                     if (var3) {
                        var10000 = this.field1580[255 & (~this.field1575 >= ~var12 ? -this.field1575 + var12 : var12)] & 255;
                     } else if (~var7 > ~var12) {
                        var21 = this.field1588;
                        var10000 = var21;
                        if (!var3) {
                           break label325;
                        }
                     } else {
                        var10000 = this.field1580[255 & (~this.field1575 >= ~var12 ? -this.field1575 + var12 : var12)] & 255;
                     }

                     while(true) {
                        label322: {
                           int var13 = var10000;
                           int var14 = var10 + -1;
                           byte[] var10001;
                           int var10002;
                           int var10003;
                           byte var25;
                           if (var3) {
                              var25 = 2;
                              var10001 = this.field1580;
                              var10002 = var13;
                              var10003 = ~var14 <= ~this.field1579 ? -this.field1579 + var14 : var14;
                           } else {
                              if (~var14 < ~var11) {
                                 break label322;
                              }

                              var25 = 2;
                              var10001 = this.field1580;
                              var10002 = var13;
                              var10003 = ~var14 <= ~this.field1579 ? -this.field1579 + var14 : var14;
                           }

                           while(true) {
                              int var19;
                              label319: {
                                 int var16;
                                 int var17;
                                 label318: {
                                    int var26;
                                    double var27;
                                    label363: {
                                       label364: {
                                          int var15 = var25 * (var10001[var10002 + var10003 & 255] & 255);
                                          var10000 = -(var14 << 12);
                                          int var24 = var15 + 1;
                                          var16 = var10000 - (this.field1581[var15] - var9);
                                          var17 = var5 - ((var12 << 12) + this.field1581[var24]);
                                          int var18 = this.field1577;
                                          if (var18 != 1) {
                                             if (~var18 == -4) {
                                                var17 = var17 < 0 ? -var17 : var17;
                                                var16 = ~var16 > -1 ? -var16 : var16;
                                                var10000 = var17 >= var16 ? var17 : var16;
                                                break label364;
                                             }

                                             if (var18 == 4) {
                                                var16 = (int)(4096.0D * Math.sqrt((double)((float)(var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                                var27 = 4096.0D;
                                                var26 = ~var17 > -1 ? -var17 : var17;
                                                break label363;
                                             }

                                             if (var18 == 5) {
                                                break label318;
                                             }

                                             if (~var18 != -3) {
                                                var19 = (int)(Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                                break label319;
                                             }

                                             if (!var3) {
                                                var19 = (~var16 > -1 ? -var16 : var16) + (~var17 > -1 ? -var17 : var17);
                                                if (var3) {
                                                   var19 = (int)(Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                                }
                                                break label319;
                                             }
                                          }

                                          var19 = var16 * var16 + var17 * var17 >> 12;
                                          if (!var3) {
                                             break label319;
                                          }

                                          var17 = var17 < 0 ? -var17 : var17;
                                          var16 = ~var16 > -1 ? -var16 : var16;
                                          var10000 = var17 >= var16 ? var17 : var16;
                                       }

                                       var19 = var10000;
                                       if (!var3) {
                                          break label319;
                                       }

                                       var16 = (int)(4096.0D * Math.sqrt((double)((float)(var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                       var27 = 4096.0D;
                                       var26 = ~var17 > -1 ? -var17 : var17;
                                    }

                                    var17 = (int)(var27 * Math.sqrt((double)((float)var26 / 4096.0F)));
                                    int var20 = var16 - -var17;
                                    var19 = var20 * var20 >> 12;
                                    if (!var3) {
                                       break label319;
                                    }
                                 }

                                 var16 *= var16;
                                 var17 *= var17;
                                 var19 = (int)(4096.0D * Math.sqrt(Math.sqrt((double)((float)(var16 + var17) / 1.6777216E7F))));
                                 if (var3) {
                                    var19 = (~var16 > -1 ? -var16 : var16) + (~var17 > -1 ? -var17 : var17);
                                    if (var3) {
                                       var19 = (int)(Math.sqrt((double)((float)(var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                    }
                                 }
                              }

                              if (var19 >= class707.field10636) {
                                 if (~var19 <= ~class628.field9091) {
                                    if (var19 < class485.field7380) {
                                       class453.field6941 = class485.field7380;
                                       class485.field7380 = var19;
                                       if (var3) {
                                          if (~class453.field6941 < ~var19) {
                                             class453.field6941 = var19;
                                             if (var3) {
                                                class453.field6941 = class485.field7380;
                                                class485.field7380 = class628.field9091;
                                                class628.field9091 = var19;
                                                if (var3) {
                                                   class453.field6941 = class485.field7380;
                                                   class485.field7380 = class628.field9091;
                                                   class628.field9091 = class707.field10636;
                                                   class707.field10636 = var19;
                                                   ++var14;
                                                } else {
                                                   ++var14;
                                                }
                                             } else {
                                                ++var14;
                                             }
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          ++var14;
                                       }
                                    } else if (~class453.field6941 < ~var19) {
                                       class453.field6941 = var19;
                                       if (var3) {
                                          class453.field6941 = class485.field7380;
                                          class485.field7380 = class628.field9091;
                                          class628.field9091 = var19;
                                          if (var3) {
                                             class453.field6941 = class485.field7380;
                                             class485.field7380 = class628.field9091;
                                             class628.field9091 = class707.field10636;
                                             class707.field10636 = var19;
                                             ++var14;
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          ++var14;
                                       }
                                    } else {
                                       ++var14;
                                    }
                                 } else {
                                    class453.field6941 = class485.field7380;
                                    class485.field7380 = class628.field9091;
                                    class628.field9091 = var19;
                                    if (var3) {
                                       class453.field6941 = class485.field7380;
                                       class485.field7380 = class628.field9091;
                                       class628.field9091 = class707.field10636;
                                       class707.field10636 = var19;
                                       ++var14;
                                    } else {
                                       ++var14;
                                    }
                                 }
                              } else {
                                 class453.field6941 = class485.field7380;
                                 class485.field7380 = class628.field9091;
                                 class628.field9091 = class707.field10636;
                                 class707.field10636 = var19;
                                 ++var14;
                              }

                              if (~var14 < ~var11) {
                                 break;
                              }

                              var25 = 2;
                              var10001 = this.field1580;
                              var10002 = var13;
                              var10003 = ~var14 <= ~this.field1579 ? -this.field1579 + var14 : var14;
                           }
                        }

                        ++var12;
                        if (~var7 > ~var12) {
                           var21 = this.field1588;
                           var10000 = var21;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = this.field1580[255 & (~this.field1575 >= ~var12 ? -this.field1575 + var12 : var12)] & 255;
                        }
                     }
                  }

                  label349: {
                     label348: {
                        label347: {
                           label346: {
                              label345: {
                                 if (var10000 != 0) {
                                    if (~var21 == -2) {
                                       break label345;
                                    }

                                    if (var21 == 3) {
                                       break label346;
                                    }

                                    if (var21 == 4) {
                                       break label347;
                                    }

                                    if (~var21 != -3) {
                                       break label349;
                                    }

                                    if (!var3) {
                                       break label348;
                                    }
                                 }

                                 var4[var8] = class707.field10636;
                                 if (!var3) {
                                    break label349;
                                 }
                              }

                              var4[var8] = class628.field9091;
                              if (!var3) {
                                 break label349;
                              }
                           }

                           var4[var8] = class485.field7380;
                           if (!var3) {
                              break label349;
                           }
                        }

                        var4[var8] = class453.field6941;
                        if (!var3) {
                           break label349;
                        }
                     }

                     var4[var8] = class628.field9091 - class707.field10636;
                  }

                  ++var8;
               } while(var8 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field1589[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1083(byte arg0) {
      try {
         if (arg0 <= -25) {
            field1578 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1589[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Ldn;Z)V"
   )
   public static final void method1084(class78 arg0, boolean arg1) {
      for(int var2 = arg0.field1040; var2 <= arg0.field1042; ++var2) {
         for(int var3 = arg0.field1044; var3 <= arg0.field1049; ++var3) {
            class190 var4 = class711.field10694[arg0.field1506][var2][var3];
            if (var4 != null) {
               class605 var5 = var4.field2962;
               class605 var6 = null;

               while(var5 != null) {
                  if (var5.field8839 == arg0) {
                     if (var6 != null) {
                        var6.field8840 = var5.field8840;
                     } else {
                        var4.field2962 = var5.field8840;
                     }

                     var5.method4468((byte)83);
                     break;
                  }

                  var6 = var5;
                  var5 = var5.field8840;
               }
            }
         }
      }

      if (!arg1) {
         class592.method4409(arg0);
      }

   }

   @OriginalMember(
      owner = "client!tl",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method275(boolean arg0) {
      try {
         ++field1586;
         this.field1580 = class486.method3780(this.field1576, (byte)-123);
         this.method1082(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1589[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1085(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1086(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
