import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class217 extends class55 {
   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3110 = new String[]{method1717(method1716("K?k@\n")), method1717(method1716("K?kB\n")), method1717(method1716("K?kK\n")), method1717(method1716("K?kD\n")), method1717(method1716("K?kF\n")), method1717(method1716("K?kE\n")), method1717(method1716("K?kG\n")), method1717(method1716("K?kA\n")), method1717(method1716("K?kJ\n"))};
   @OriginalMember(
      owner = "client!oc",
      name = "m",
      descriptor = "[[J"
   )
   public static long[][] field3101 = new long[8][256];
   @OriginalMember(
      owner = "client!oc",
      name = "n",
      descriptor = "[J"
   )
   public static long[] field3107 = new long[11];
   @OriginalMember(
      owner = "client!oc",
      name = "e",
      descriptor = "I"
   )
   public static int field3100;
   @OriginalMember(
      owner = "client!oc",
      name = "i",
      descriptor = "I"
   )
   public static int field3102;
   @OriginalMember(
      owner = "client!oc",
      name = "g",
      descriptor = "I"
   )
   public static int field3103;
   @OriginalMember(
      owner = "client!oc",
      name = "l",
      descriptor = "I"
   )
   public static int field3104;
   @OriginalMember(
      owner = "client!oc",
      name = "j",
      descriptor = "I"
   )
   public static int field3105;
   @OriginalMember(
      owner = "client!oc",
      name = "h",
      descriptor = "I"
   )
   public static int field3106;
   @OriginalMember(
      owner = "client!oc",
      name = "k",
      descriptor = "I"
   )
   public static int field3108;
   @OriginalMember(
      owner = "client!oc",
      name = "f",
      descriptor = "I"
   )
   public static int field3109;

   @OriginalMember(
      owner = "client!oc",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1711(int arg0) {
      try {
         int var2 = 113 % ((arg0 - 36) / 41);
         ++field3102;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3110[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method1712(int arg0) {
      boolean var1 = client.field4360;

      try {
         label43: {
            label42: {
               ++field3108;
               class341.method2503(-119);
               int var2 = class300.field4107.field6442.method1028(-85);
               if (~var2 != -3) {
                  if (~var2 != -4) {
                     break label43;
                  }

                  if (!var1) {
                     break label42;
                  }
               }

               class141.method1118(class237.field3310, class692.field10185, 0, 100, 100, class383.field5543);
               if (!var1) {
                  break label43;
               }
            }

            class594.method4313(2, class583.field8642, -9489, class237.field3310, class704.field10281, class383.field5543, class692.field10185, 2);
         }

         if (class300.field4107.field6442.method1033((byte)37)) {
            class452.method3296(-12371, class557.field7990);
         }

         if (class383.field5543 != null) {
            class352.method2568(0);
         }

         if (arg0 != 28041) {
            method1712(50);
         }

         class183.field2581 = ~class300.field4107.field6442.method1028(-65) != -1;
         class681.field10034 = class300.field4107.field6442.method1033((byte)100);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3110[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         if (arg0 != 0) {
            this.method101(93);
         }

         label30: {
            ++field3103;
            if (super.field683.method3308(1) == class185.field2620) {
               if (!super.field683.method3300((byte)-56)) {
                  break label30;
               }

               super.field680 = 0;
               if (!client.field4360) {
                  break label30;
               }
            }

            super.field680 = 1;
         }

         if (~super.field680 != -1 && super.field680 != 1) {
            super.field680 = this.method101(-128);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3110[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class217(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1713(byte arg0) {
      try {
         if (arg0 != 120) {
            return false;
         } else {
            ++field3106;
            if (super.field683.method3300((byte)-56)) {
               return false;
            } else {
               return super.field683.method3308(1) == class185.field2620;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3110[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(CB)B"
   )
   public static final byte method1714(char arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         byte var3;
         label210: {
            ++field3105;
            if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
               if (arg0 != 8364) {
                  if (~arg0 != -8219) {
                     if (~arg0 == -403) {
                        var3 = -125;
                        if (!var2) {
                           break label210;
                        }
                     }

                     if (arg0 != 8222) {
                        if (~arg0 != -8231) {
                           if (~arg0 == -8225) {
                              var3 = -122;
                              if (!var2) {
                                 break label210;
                              }
                           }

                           if (~arg0 != -8226) {
                              if (~arg0 == -711) {
                                 var3 = -120;
                                 if (!var2) {
                                    break label210;
                                 }
                              }

                              if (~arg0 == -8241) {
                                 var3 = -119;
                                 if (!var2) {
                                    break label210;
                                 }
                              }

                              if (arg0 != 352) {
                                 if (~arg0 != -8250) {
                                    if (arg0 == 338) {
                                       var3 = -116;
                                       if (!var2) {
                                          break label210;
                                       }
                                    }

                                    if (~arg0 == -382) {
                                       var3 = -114;
                                       if (!var2) {
                                          break label210;
                                       }
                                    }

                                    if (~arg0 != -8217) {
                                       if (arg0 == 8217) {
                                          var3 = -110;
                                          if (!var2) {
                                             break label210;
                                          }
                                       }

                                       if (~arg0 != -8221) {
                                          if (arg0 == 8221) {
                                             var3 = -108;
                                             if (!var2) {
                                                break label210;
                                             }
                                          }

                                          if (~arg0 == -8227) {
                                             var3 = -107;
                                             if (!var2) {
                                                break label210;
                                             }
                                          }

                                          if (arg0 != 8211) {
                                             if (arg0 != 8212) {
                                                if (arg0 != 732) {
                                                   if (~arg0 == -8483) {
                                                      var3 = -103;
                                                      if (!var2) {
                                                         break label210;
                                                      }
                                                   }

                                                   if (~arg0 == -354) {
                                                      var3 = -102;
                                                      if (!var2) {
                                                         break label210;
                                                      }
                                                   }

                                                   if (~arg0 != -8251) {
                                                      if (~arg0 != -340) {
                                                         if (~arg0 == -383) {
                                                            var3 = -98;
                                                            if (!var2) {
                                                               break label210;
                                                            }
                                                         }

                                                         if (arg0 != 376) {
                                                            var3 = 63;
                                                            if (!var2) {
                                                               break label210;
                                                            }
                                                         }

                                                         var3 = -97;
                                                         if (!var2) {
                                                            break label210;
                                                         }
                                                      }

                                                      var3 = -100;
                                                      if (!var2) {
                                                         break label210;
                                                      }
                                                   }

                                                   var3 = -101;
                                                   if (!var2) {
                                                      break label210;
                                                   }
                                                }

                                                var3 = -104;
                                                if (!var2) {
                                                   break label210;
                                                }
                                             }

                                             var3 = -105;
                                             if (!var2) {
                                                break label210;
                                             }
                                          }

                                          var3 = -106;
                                          if (!var2) {
                                             break label210;
                                          }
                                       }

                                       var3 = -109;
                                       if (!var2) {
                                          break label210;
                                       }
                                    }

                                    var3 = -111;
                                    if (!var2) {
                                       break label210;
                                    }
                                 }

                                 var3 = -117;
                                 if (!var2) {
                                    break label210;
                                 }
                              }

                              var3 = -118;
                              if (!var2) {
                                 break label210;
                              }
                           }

                           var3 = -121;
                           if (!var2) {
                              break label210;
                           }
                        }

                        var3 = -123;
                        if (!var2) {
                           break label210;
                        }
                     }

                     var3 = -124;
                     if (!var2) {
                        break label210;
                     }
                  }

                  var3 = -126;
                  if (!var2) {
                     break label210;
                  }
               }

               var3 = -128;
               if (!var2) {
                  break label210;
               }
            }

            var3 = (byte)arg0;
         }

         if (arg1 != -117) {
            method1712(-70);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3110[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1715(int arg0) {
      try {
         if (arg0 != 18588) {
            method1712(-75);
         }

         field3101 = null;
         field3107 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3110[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field3100;
         if (arg0 > -116) {
            this.method1713((byte)43);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3110[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class217(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field3104;
         int var3 = -9 % ((47 - arg1) / 46);
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3110[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field3109;
         if (super.field683.method3300((byte)-56)) {
            return 3;
         } else if (super.field683.method3308(1) == class185.field2620) {
            if (~arg0 == -1) {
               if (~super.field683.field6455.method5490(106) == -2) {
                  return 2;
               }

               if (~super.field683.field6434.method1454(95) == -2) {
                  return 2;
               }

               if (super.field683.field6407.method752(arg1 + -223) > 0) {
                  return 2;
               }
            }

            return 1;
         } else {
            if (arg1 != 105) {
               field3107 = null;
            }

            return 3;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3110[4] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         char var3 = method1717(method1716("᠇운蟽Ō㚄틑礳鄗悿鮬ꌨ筩ᶥퟁ\u2e69ﹳᔫ㞠鿳䫸壭⥖뇥殆뵿ა쭢Ԣ\ue424䆩ꝙ閄ﮫ籥\udd35䞺쩱뽂굙茑挦ꨭ졜䧚\uf2c1宬驺㋵\ue90c햢뻩㐔＿遜⁊\u1a8a됈鍧擲猰䀬쎰\udbe4贾霢켏盞홞떬橲䗗コ㼐ꋩ斘\u2fe4\ude40ﴈ鉶ڨ닂ใ抑ꢕ裏╽萮㤉幻㢮톁\ue23d덤鰝䏥ﰠ凅浈\ufadc縆㮏칍輋럨㲣铓륏Ⲗ\ue76d쐡噠翵⫾셐\udc29鵈ㄨ\uf603겊ᓃᘞ楕烳탮챠颀⠀\uf8c3")).charAt(var0 / 2);
         long var4 = (long)(~(1 & var0) == -1 ? var3 >>> 8 : var3 & 255);
         long var6 = var4 << 1;
         if (~var6 <= -257L) {
            var6 ^= 285L;
         }

         long var8 = var6 << 1;
         if (var8 >= 256L) {
            var8 ^= 285L;
         }

         long var10 = var4 ^ var8;
         long var12 = var8 << 1;
         if (var12 >= 256L) {
            var12 ^= 285L;
         }

         long var14 = var4 ^ var12;
         field3101[0][var0] = class486.method3527(class486.method3527(var6 << 8, class486.method3527(class486.method3527(class486.method3527(class486.method3527(var8 << 40, class486.method3527(var4 << 48, var4 << 56)), var4 << 32), var12 << 24), var10 << 16)), var14);

         for(int var16 = 1; ~var16 > -9; ++var16) {
            field3101[var16][var0] = class486.method3527(field3101[var16 - 1][var0] << 56, field3101[var16 + -1][var0] >>> 8);
         }
      }

      field3107[0] = 0L;

      for(int var1 = 1; ~var1 >= -11; ++var1) {
         int var2 = var1 * 8 - 8;
         field3107[var1] = class197.method1542(class676.method4915(255L, field3101[7][var2 + 7]), class197.method1542(class197.method1542(class197.method1542(class197.method1542(class676.method4915(field3101[3][var2 + 3], 1095216660480L), class197.method1542(class197.method1542(class676.method4915(71776119061217280L, field3101[1][var2 + 1]), class676.method4915(-72057594037927936L, field3101[0][var2])), class676.method4915(field3101[2][var2 - -2], 280375465082880L))), class676.method4915(4278190080L, field3101[4][var2 + 4])), class676.method4915(16711680L, field3101[5][var2 + 5])), class676.method4915(field3101[6][var2 - -6], 65280L)));
      }

   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1716(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1717(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
