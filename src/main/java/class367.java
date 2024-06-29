import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class367 extends class297 {
   @OriginalMember(
      owner = "client!vm",
      name = "w",
      descriptor = "Z"
   )
   public boolean field5713 = true;
   @OriginalMember(
      owner = "client!vm",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5718 = new String[]{method3013(method3012("i}@7u")), method3013(method3012("[=\u0018xd{7Nkiv:\u0016#")), method3013(method3012("d>@^ ")), method3013(method3012("|&\u0002u")), method3013(method3012("d>@[ ")), method3013(method3012("d>@X ")), method3013(method3012("d>@_ ")), method3013(method3012("d>@V ")), method3013(method3012("d>@Q ")), method3013(method3012("d>@T ")), method3013(method3012("d>@I ")), method3013(method3012("d>@W ")), method3013(method3012("d>@\\ ")), method3013(method3012("d>@] ")), method3013(method3012("<}@"))};
   @OriginalMember(
      owner = "client!vm",
      name = "K",
      descriptor = "I"
   )
   public static int field5701;
   @OriginalMember(
      owner = "client!vm",
      name = "A",
      descriptor = "I"
   )
   public static int field5702;
   @OriginalMember(
      owner = "client!vm",
      name = "E",
      descriptor = "I"
   )
   public static int field5703;
   @OriginalMember(
      owner = "client!vm",
      name = "H",
      descriptor = "I"
   )
   public static int field5705;
   @OriginalMember(
      owner = "client!vm",
      name = "B",
      descriptor = "I"
   )
   public static int field5706;
   @OriginalMember(
      owner = "client!vm",
      name = "v",
      descriptor = "I"
   )
   public static int field5707;
   @OriginalMember(
      owner = "client!vm",
      name = "J",
      descriptor = "I"
   )
   public static int field5710;
   @OriginalMember(
      owner = "client!vm",
      name = "D",
      descriptor = "I"
   )
   public static int field5712;
   @OriginalMember(
      owner = "client!vm",
      name = "y",
      descriptor = "I"
   )
   public static int field5714;
   @OriginalMember(
      owner = "client!vm",
      name = "u",
      descriptor = "I"
   )
   public static int field5715;
   @OriginalMember(
      owner = "client!vm",
      name = "C",
      descriptor = "I"
   )
   public static int field5716;
   @OriginalMember(
      owner = "client!vm",
      name = "F",
      descriptor = "Luga;"
   )
   public class540 field5708;
   @OriginalMember(
      owner = "client!vm",
      name = "G",
      descriptor = "[I"
   )
   public int[] field5711;
   @OriginalMember(
      owner = "client!vm",
      name = "x",
      descriptor = "[I"
   )
   private int[] field5717;
   @OriginalMember(
      owner = "client!vm",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field5709;
   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "[[I"
   )
   private int[][] field5704;

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method3000(int arg0, int arg1, int arg2) {
      try {
         ++field5715;
         if (this.field5717 != null && arg0 >= 0 && arg0 <= this.field5717.length) {
            if (this.field5704[arg0] != null && arg1 >= 0 && ~this.field5704[arg0].length <= ~arg1) {
               return arg2 != -1 ? -70 : this.field5704[arg0][arg1];
            } else {
               return -1;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5718[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(IZILjava/lang/String;)I"
   )
   public static final int method3001(int arg0, boolean arg1, int arg2, String arg3) {
      boolean var4 = client.field1786;

      try {
         ++field5701;
         if (arg2 >= 2 && ~arg2 >= -37) {
            boolean var5 = false;
            if (arg0 != -25122) {
               return -56;
            } else {
               byte var6 = 0;
               int var7 = 0;
               int var8 = arg3.length();
               int var9 = 0;
               char var10000;
               if (var4) {
                  var10000 = arg3.charAt(var9);
               } else if (~var9 <= ~var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     if (var6 == 0) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg3.charAt(var9);
               }

               while(true) {
                  label176: {
                     int var10 = var10000;
                     if (var9 == 0) {
                        if (~var10 == -46) {
                           var5 = true;
                           if (!var4) {
                              ++var9;
                              break label176;
                           }
                        }

                        if (~var10 == -44 && arg1 && !var4) {
                           ++var9;
                           break label176;
                        }
                     }

                     int var11;
                     if (var10 >= 48 && var10 <= 57) {
                        var10 -= 48;
                        if (!var4) {
                           if (arg2 <= var10) {
                              throw new NumberFormatException();
                           }

                           if (var5) {
                              var10 = -var10;
                           }

                           var11 = arg2 * var7 + var10;
                           if (~(var11 / arg2) != ~var7) {
                              throw new NumberFormatException();
                           }

                           var6 = 1;
                           var7 = var11;
                           ++var9;
                           break label176;
                        }
                     }

                     if (var10 >= 65) {
                        if (~var10 >= -91) {
                           var10 -= 55;
                           if (var4) {
                              if (var10 < 97 || ~var10 < -123) {
                                 break;
                              }

                              var10 -= 87;
                           }
                        } else {
                           if (var10 < 97 || ~var10 < -123) {
                              break;
                           }

                           var10 -= 87;
                        }
                     } else {
                        if (var10 < 97 || ~var10 < -123) {
                           break;
                        }

                        var10 -= 87;
                     }

                     if (arg2 <= var10) {
                        throw new NumberFormatException();
                     }

                     if (var5) {
                        var10 = -var10;
                     }

                     var11 = arg2 * var7 + var10;
                     if (~(var11 / arg2) != ~var7) {
                        throw new NumberFormatException();
                     }

                     var6 = 1;
                     var7 = var11;
                     ++var9;
                  }

                  if (~var9 <= ~var8) {
                     var10000 = (char)var6;
                     if (!var4) {
                        if (var6 == 0) {
                           throw new NumberFormatException();
                        }

                        return var7;
                     }
                  } else {
                     var10000 = arg3.charAt(var9);
                  }
               }

               throw new NumberFormatException();
            }
         } else {
            throw new IllegalArgumentException(field5718[1] + arg2);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field5718[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5718[0] : field5718[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method3002(class354 arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         ++field5702;
         int var4 = 112 % ((arg1 - 83) / 37);

         do {
            int var5 = arg0.method2855(-31007);
            if (~var5 == -1) {
               break;
            }

            this.method3008((byte)87, var5, arg0);
         } while(!var3);

      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5718[10] + (arg0 != null ? field5718[0] : field5718[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(Lica;[II)V"
   )
   public final void method3003(class354 arg0, int[] arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field5714;
         if (this.field5717 != null) {
            int var5 = 93 % ((-37 - arg2) / 48);
            int var6 = 0;
            if (!var4) {
               if (this.field5717.length <= var6) {
                  return;
               }

               if (var6 >= arg1.length) {
                  return;
               }
            }

            do {
               int var7 = this.method3007(var6, 123).field11416;
               if (~var7 < -1) {
                  arg0.method2887(-28, (long)arg1[var6], var7);
               }

               ++var6;
               if (this.field5717.length <= var6) {
                  return;
               }
            } while(var6 < arg1.length);

         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5718[9] + (arg0 != null ? field5718[0] : field5718[3]) + ',' + (arg1 != null ? field5718[0] : field5718[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "e",
      descriptor = "(B)Ljava/lang/String;"
   )
   public final String method3004(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field5703;
         StringBuffer var3 = new StringBuffer(80);
         if (this.field5709 == null) {
            return "";
         } else {
            if (arg0 <= 51) {
               this.method3005(false);
            }

            var3.append(this.field5709[0]);
            int var4 = 1;
            if (var2) {
               var3.append(field5718[14]);
               var3.append(this.field5709[var4]);
               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field5709.length) {
                  var3.append(field5718[14]);
                  var3.append(this.field5709[var4]);
                  ++var4;
               }

               if (!var2) {
                  return var3.toString();
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5718[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3005(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         if (arg0) {
            this.method3002((class354)null, (byte)-63);
         }

         if (this.field5711 != null) {
            int var3 = 0;
            if (var2 || this.field5711.length > var3) {
               do {
                  this.field5711[var3] = class119.method1087(this.field5711[var3], 32768);
                  ++var3;
               } while(this.field5711.length > var3);
            }
         }

         ++field5710;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5718[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(BLica;)Ljava/lang/String;"
   )
   public final String method3006(byte arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         int var4 = 9 % ((-34 - arg0) / 61);
         ++field5705;
         StringBuffer var5 = new StringBuffer(80);
         if (this.field5717 != null) {
            int var6 = 0;
            if (var3 || ~var6 > ~this.field5717.length) {
               do {
                  var5.append(this.field5709[var6]);
                  var5.append(this.field5708.method4128(this.method3007(var6, 125), arg1.method2890(11140, class769.method5615(this.field5717[var6], 122).field11418), 1, this.field5704[var6]));
                  ++var6;
               } while(~var6 > ~this.field5717.length);
            }
         }

         var5.append(this.field5709[this.field5709.length + -1]);
         return var5.toString();
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5718[6] + arg0 + ',' + (arg1 != null ? field5718[0] : field5718[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(II)Ljw;"
   )
   public final class779 method3007(int arg0, int arg1) {
      try {
         ++field5716;
         if (this.field5717 != null && arg0 >= 0 && arg0 <= this.field5717.length) {
            if (arg1 < 122) {
               this.method3000(104, 102, -41);
            }

            return class769.method5615(this.field5717[arg0], 111);
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5718[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(BILica;)V"
   )
   private final void method3008(byte arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label106: {
            ++field5706;
            if (~arg1 != -2) {
               if (arg1 != 2) {
                  if (~arg1 == -4) {
                     int var5 = arg2.method2855(-31007);
                     this.field5704 = new int[var5][];
                     this.field5717 = new int[var5];
                     int var6 = 0;
                     if (var4 || var5 > var6) {
                        do {
                           int var7 = arg2.method2848(-119);
                           class779 var8 = class769.method5615(var7, arg0 + 4);
                           if (var8 == null) {
                              ++var6;
                           } else {
                              this.field5717[var6] = var7;
                              this.field5704[var6] = new int[var8.field11419];
                              int var9 = 0;
                              if (!var4 && var9 >= var8.field11419) {
                                 ++var6;
                              } else {
                                 do {
                                    this.field5704[var6][var9] = arg2.method2848(-94);
                                    ++var9;
                                 } while(var9 < var8.field11419);

                                 ++var6;
                              }
                           }
                        } while(var5 > var6);
                     }

                     if (!var4) {
                        break label106;
                     }
                  }

                  if (arg1 != 4) {
                     break label106;
                  }

                  this.field5713 = false;
                  if (!var4) {
                     break label106;
                  }
               }

               int var10 = arg2.method2855(-31007);
               this.field5711 = new int[var10];
               int var11 = 0;
               if (var4) {
                  this.field5711[var11] = arg2.method2848(arg0 + -202);
                  ++var11;
               }

               while(true) {
                  while(var11 < var10) {
                     this.field5711[var11] = arg2.method2848(arg0 + -202);
                     ++var11;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label106;
                     }
                     break;
                  }

                  ++var11;
               }
            }

            this.field5709 = class9.method53(arg2.method2843(arg0 + -88), '<', (byte)-103);
         }

         if (arg0 != 87) {
            method3001(-4, true, -87, (String)null);
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field5718[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5718[0] : field5718[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3009(byte arg0) {
      try {
         class659.field9850.method651(class751.field11147, class573.field8481, class645.field9313);
         ++field5712;
         if (arg0 < -7) {
            ;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5718[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3010() {
      if (class459.field7003 != null) {
         for(int var0 = 0; var0 < class459.field7003.length; ++var0) {
            for(int var1 = 0; var1 < class247.field3734; ++var1) {
               for(int var2 = 0; var2 < class365.field5634; ++var2) {
                  if (class459.field7003[var0][var1][var2] != null) {
                     class459.field7003[var0][var1][var2].method1692((byte)-92);
                  }

                  class459.field7003[var0][var1][var2] = null;
               }
            }
         }
      }

      class459.field7003 = null;
      class96.field1355 = null;
      if (class459.field7006 != null) {
         for(int var3 = 0; var3 < class459.field7006.length; ++var3) {
            for(int var4 = 0; var4 < class247.field3734; ++var4) {
               for(int var5 = 0; var5 < class365.field5634; ++var5) {
                  if (class459.field7006[var3][var4][var5] != null) {
                     class459.field7006[var3][var4][var5].method1692((byte)-118);
                  }

                  class459.field7006[var3][var4][var5] = null;
               }
            }
         }
      }

      class459.field7006 = null;
      class190.field2949 = null;
      class711.field10694 = null;
      class385.field6076 = null;
      class717.field10755 = null;
      class247.field3755 = null;
      class56.field691 = null;
      class392.field6153 = null;
      class312.field4842 = null;
      class309.method2589(-124);
      if (class395.field6195 != null) {
         for(int var6 = 0; var6 < class108.field1485; ++var6) {
            class395.field6195[var6] = null;
         }

         class108.field1485 = 0;
      }

      class6.field36 = null;
      class777.field11406 = null;
      class651.field9383 = null;
      if (class478.field7280 != null) {
         for(int var7 = 0; var7 < class478.field7280.length; ++var7) {
            class478.field7280[var7] = null;
         }

         class711.field10690 = 0;
      }

      if (class19.field241 != null) {
         for(int var8 = 0; var8 < class19.field241.length; ++var8) {
            class19.field241[var8] = null;
         }

         class127.field1832 = 0;
      }

      if (class88.field1276 != null) {
         for(int var9 = 0; var9 < class213.field3240; ++var9) {
            class88.field1276[var9] = null;
         }

         for(int var10 = 0; var10 < class461.field7016; ++var10) {
            for(int var11 = 0; var11 < class247.field3734; ++var11) {
               for(int var12 = 0; var12 < class365.field5634; ++var12) {
                  class226.field3439[var10][var11][var12] = 0L;
               }
            }
         }

         class213.field3240 = 0;
      }

      class453.method3552((byte)-105);
      class154.field2298 = class154.field2299;
      class154.field2298.method2090(0);
      class191.field2968 = null;
      class284.field4485 = null;
      class183.field2879 = null;
      if (class238.field3620 != null) {
         class234.method2014();
         class546.field8193.method685(1);
         class546.field8193.method676(0);
      }

      if (class659.field9842 != null) {
         class659.field9842 = null;
      }

      class546.field8193 = null;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method3011(byte arg0) {
      try {
         ++field5707;
         if (this.field5717 == null) {
            return 0;
         } else {
            return arg0 != 109 ? -11 : this.field5717.length;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5718[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3012(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3013(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
