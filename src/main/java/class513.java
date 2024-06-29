import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class513 extends class325 implements class265 {
   @OriginalMember(
      owner = "client!lda",
      name = "E",
      descriptor = "Lwn;"
   )
   private class576 field7161;
   @OriginalMember(
      owner = "client!lda",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7163 = new String[]{method3874(method3873("\n HX")), method3874(method3873("\u001f{\n\u001a\u001b")), method3874(method3873("\b1E\u001a!L")), method3874(method3873("\b1E\u001a\"L")), method3874(method3873("\b1E\u001a%L")), method3874(method3873("\b1E\u001aZ\r;M@XL")), method3874(method3873("\u0017oHF")), method3874(method3873("\b1E\u001a/L")), method3874(method3873("\b1E\u001a.L")), method3874(method3873("\b1E\u001a$L")), method3874(method3873("\b1E\u001a'L")), method3874(method3873("\b1E\u001a#L")), method3874(method3873("\b1E\u001a L")), method3874(method3873("\b1E\u001a,L"))};
   @OriginalMember(
      owner = "client!lda",
      name = "y",
      descriptor = "I"
   )
   public static int field7158 = -1;
   @OriginalMember(
      owner = "client!lda",
      name = "B",
      descriptor = "I"
   )
   public static int field7149;
   @OriginalMember(
      owner = "client!lda",
      name = "G",
      descriptor = "I"
   )
   public static int field7150;
   @OriginalMember(
      owner = "client!lda",
      name = "w",
      descriptor = "I"
   )
   public static int field7151;
   @OriginalMember(
      owner = "client!lda",
      name = "x",
      descriptor = "I"
   )
   public static int field7152;
   @OriginalMember(
      owner = "client!lda",
      name = "H",
      descriptor = "I"
   )
   public static int field7154;
   @OriginalMember(
      owner = "client!lda",
      name = "F",
      descriptor = "I"
   )
   public static int field7155;
   @OriginalMember(
      owner = "client!lda",
      name = "D",
      descriptor = "I"
   )
   public static int field7156;
   @OriginalMember(
      owner = "client!lda",
      name = "A",
      descriptor = "I"
   )
   public static int field7159;
   @OriginalMember(
      owner = "client!lda",
      name = "C",
      descriptor = "I"
   )
   public static int field7160;
   @OriginalMember(
      owner = "client!lda",
      name = "u",
      descriptor = "I"
   )
   public static int field7162;
   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "J"
   )
   public static long field7157;
   @OriginalMember(
      owner = "client!lda",
      name = "v",
      descriptor = "[[B"
   )
   public static byte[][] field7153;

   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1194(byte arg0) {
      try {
         ++field7151;
         if (arg0 < 100) {
            method3872((byte)-103);
         }

         return super.method2554(true, super.field4460.field8512);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7163[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "<init>",
      descriptor = "(Llea;Lwn;Z)V"
   )
   public class513(class574 arg0, class576 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field7161 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7163[5] + (arg0 != null ? field7163[1] : field7163[0]) + ',' + (arg1 != null ? field7163[1] : field7163[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method917(int arg0) {
      try {
         if (arg0 <= 85) {
            return -88;
         } else {
            ++field7160;
            return super.method917(125);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7163[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1192(int arg0, int arg1) {
      try {
         ++field7152;
         if (arg0 >= -51) {
            method3872((byte)-11);
         }

         super.method1192(-66, this.field7161.field8536 * arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7163[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   public final Buffer method1195(boolean arg0, int arg1) {
      try {
         if (arg1 != -4298) {
            field7157 = 116L;
         }

         ++field7155;
         return super.method2551(-1, super.field4460.field8512, arg0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7163[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(BLmb;I)V"
   )
   public static final void method3869(byte arg0, class431 arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field7162;
         boolean var4 = arg1.method3335(4756, 1) == 1;
         if (var4) {
            class487.field6801[class417.field5707++] = arg2;
         }

         int var5 = arg1.method3335(4756, 2);
         class783 var6 = class59.field771[arg2];
         if (var5 == 0) {
            if (var4) {
               var6.field11417 = false;
            } else if (class16.field280 == arg2) {
               throw new RuntimeException(field7163[6]);
            } else {
               class450 var7;
               label191: {
                  var7 = class91.field1231[arg2] = new class450();
                  var7.field6101 = (var6.field205[0] + class353.field4940 >> 6) + (var6.field210[0] + class539.field7889 >> 6 << 14) + (var6.field10457 << 28);
                  if (~var6.field11409 == 0) {
                     var7.field6100 = var6.field129.method3167((byte)113);
                     if (!var3) {
                        break label191;
                     }
                  }

                  var7.field6100 = var6.field11409;
               }

               var7.field6099 = var6.field110;
               var7.field6095 = var6.field11450;
               var7.field6098 = var6.field11406;
               if (~var6.field11403 < -1) {
                  class137.method1145(var6, (byte)66);
               }

               class59.field771[arg2] = null;
               if (arg1.method3335(4756, 1) != 0) {
                  class14.method121(arg2, 19684, arg1);
               }

            }
         } else if (~var5 == -2) {
            int var9;
            int var10;
            label221: {
               int var8 = arg1.method3335(4756, 3);
               var9 = var6.field210[0];
               var10 = var6.field205[0];
               if (~var8 != -1) {
                  if (var8 == 1) {
                     --var10;
                     if (!var3) {
                        break label221;
                     }
                  }

                  if (var8 == 2) {
                     ++var9;
                     --var10;
                     if (!var3) {
                        break label221;
                     }
                  }

                  if (var8 != 3) {
                     if (var8 == 4) {
                        ++var9;
                        if (!var3) {
                           break label221;
                        }
                     }

                     if (~var8 != -6) {
                        if (~var8 == -7) {
                           ++var10;
                           if (!var3) {
                              break label221;
                           }
                        }

                        if (~var8 != -8) {
                           break label221;
                        }

                        ++var9;
                        ++var10;
                        if (!var3) {
                           break label221;
                        }
                     }

                     --var9;
                     ++var10;
                     if (!var3) {
                        break label221;
                     }
                  }

                  --var9;
                  if (!var3) {
                     break label221;
                  }
               }

               --var10;
               --var9;
            }

            if (var4) {
               var6.field11408 = var9;
               var6.field11417 = true;
               var6.field11431 = var10;
            } else {
               var6.method5654(var9, class430.field5850[arg2], -1, var10);
            }
         } else if (~var5 == -3) {
            int var12;
            int var13;
            label272: {
               int var11 = arg1.method3335(4756, 4);
               var12 = var6.field210[0];
               var13 = var6.field205[0];
               if (~var11 != -1) {
                  if (~var11 == -2) {
                     --var12;
                     var13 -= 2;
                     if (!var3) {
                        break label272;
                     }
                  }

                  if (var11 == 2) {
                     var13 -= 2;
                     if (!var3) {
                        break label272;
                     }
                  }

                  if (~var11 == -4) {
                     var13 -= 2;
                     ++var12;
                     if (!var3) {
                        break label272;
                     }
                  }

                  if (var11 != 4) {
                     if (~var11 == -6) {
                        --var13;
                        var12 -= 2;
                        if (!var3) {
                           break label272;
                        }
                     }

                     if (var11 == 6) {
                        var12 += 2;
                        --var13;
                        if (!var3) {
                           break label272;
                        }
                     }

                     if (~var11 == -8) {
                        var12 -= 2;
                        if (!var3) {
                           break label272;
                        }
                     }

                     if (~var11 == -9) {
                        var12 += 2;
                        if (!var3) {
                           break label272;
                        }
                     }

                     if (~var11 != -10) {
                        if (var11 != 10) {
                           if (~var11 == -12) {
                              var12 -= 2;
                              var13 += 2;
                              if (!var3) {
                                 break label272;
                              }
                           }

                           if (var11 != 12) {
                              if (~var11 != -14) {
                                 if (var11 != 14) {
                                    if (~var11 != -16) {
                                       break label272;
                                    }

                                    var13 += 2;
                                    var12 += 2;
                                    if (!var3) {
                                       break label272;
                                    }
                                 }

                                 var13 += 2;
                                 ++var12;
                                 if (!var3) {
                                    break label272;
                                 }
                              }

                              var13 += 2;
                              if (!var3) {
                                 break label272;
                              }
                           }

                           --var12;
                           var13 += 2;
                           if (!var3) {
                              break label272;
                           }
                        }

                        var12 += 2;
                        ++var13;
                        if (!var3) {
                           break label272;
                        }
                     }

                     ++var13;
                     var12 -= 2;
                     if (!var3) {
                        break label272;
                     }
                  }

                  var13 -= 2;
                  var12 += 2;
                  if (!var3) {
                     break label272;
                  }
               }

               var13 -= 2;
               var12 -= 2;
            }

            if (var4) {
               var6.field11417 = true;
               var6.field11431 = var13;
               var6.field11408 = var12;
            } else {
               var6.method5654(var12, class430.field5850[arg2], -1, var13);
            }
         } else {
            int var14 = arg1.method3335(4756, 1);
            if (var14 == 0) {
               int var15 = arg1.method3335(4756, 12);
               int var16 = var15 >> 10;
               int var17 = (var15 & 1004) >> 5;
               if (~var17 < -16) {
                  var17 -= 32;
               }

               int var18 = 31 & var15;
               if (~var18 < -16) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label279: {
                  var19 = var6.field210[0] + var17;
                  var20 = var6.field205[0] + var18;
                  if (!var4) {
                     var6.method5654(var19, class430.field5850[arg2], -1, var20);
                     if (!var3) {
                        break label279;
                     }
                  }

                  var6.field11408 = var19;
                  var6.field11431 = var20;
                  var6.field11417 = true;
               }

               var6.field10457 = var6.field10459 = (byte)(3 & var6.field10457 + var16);
               if (class738.method5357(var20, var19, -20749)) {
                  ++var6.field10459;
               }

               if (class16.field280 == arg2) {
                  if (~class674.field9984 != ~var6.field10457) {
                     class323.field4420 = true;
                  }

                  class674.field9984 = var6.field10457;
               }

            } else {
               int var21 = arg1.method3335(4756, 30);
               if (arg0 > 74) {
                  int var22;
                  int var25;
                  int var26;
                  label287: {
                     var22 = var21 >> 28;
                     int var23 = 16383 & var21 >> 14;
                     int var24 = var21 & 16383;
                     var25 = (16383 & class539.field7889 - -var23 + var6.field210[0]) + -class539.field7889;
                     var26 = (16383 & var6.field205[0] + var24 + class353.field4940) + -class353.field4940;
                     if (var4) {
                        var6.field11417 = true;
                        var6.field11431 = var26;
                        var6.field11408 = var25;
                        if (!var3) {
                           break label287;
                        }
                     }

                     var6.method5654(var25, class430.field5850[arg2], -1, var26);
                  }

                  var6.field10457 = var6.field10459 = (byte)(3 & var6.field10457 + var22);
                  if (class738.method5357(var26, var25, -20749)) {
                     ++var6.field10459;
                  }

                  if (class16.field280 == arg2) {
                     class674.field9984 = var6.field10457;
                  }
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class93.method866(var28, field7163[7] + arg0 + ',' + (arg1 != null ? field7163[1] : field7163[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3870(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         label147: {
            ++field7159;
            if (!(class326.field4481 < class326.field4483)) {
               if (!(class326.field4481 > class326.field4483)) {
                  break label147;
               }

               class326.field4481 = (float)((double)class326.field4481 - (double)class326.field4481 / 30.0D);
               if (class326.field4483 > class326.field4481) {
                  class326.field4481 = class326.field4483;
               }

               class541.method4094(true);
               class326.field4485 = (int)class326.field4481 >> 1;
               class326.field4476 = class737.method5349(false, class326.field4485);
               if (!var3) {
                  break label147;
               }
            }

            class326.field4481 = (float)((double)class326.field4481 / 30.0D + (double)class326.field4481);
            if (class326.field4483 < class326.field4481) {
               class326.field4481 = class326.field4483;
            }

            class541.method4094(true);
            class326.field4485 = (int)class326.field4481 >> 1;
            class326.field4476 = class737.method5349(false, class326.field4485);
         }

         if (~class227.field2847 != arg0 && ~class491.field6864 != 0) {
            int var4 = class227.field2847 - class345.field4731;
            if (~var4 > -3 || ~var4 < -3) {
               var4 /= 8;
            }

            int var5 = -class381.field5303 + class491.field6864;
            class345.field4731 += var4;
            if (~var5 > -3 || ~var5 < -3) {
               var5 /= 8;
            }

            if (var4 == 0 && var5 == 0) {
               class227.field2847 = -1;
               class491.field6864 = -1;
            }

            class381.field5303 -= -var5;
            class541.method4094(true);
         }

         label121: {
            if (class768.field11204 > 0) {
               --class495.field6905;
               if (class495.field6905 != 0) {
                  break label121;
               }

               class495.field6905 = 100;
               --class768.field11204;
               if (!var3) {
                  break label121;
               }
            }

            class16.field282 = -1;
            class204.field2600 = -1;
         }

         if (class370.field5154 && class138.field1748 != null) {
            class387 var6 = (class387)class138.field1748.method288(0);
            if (var3 || var6 != null) {
               do {
                  label152: {
                     class519 var7 = class326.field4471.method4937(var6.field5362.field2052, true);
                     if (!var6.method3056(arg0 + -1, arg1, arg2)) {
                        if (!var6.field5362.field2047) {
                           break label152;
                        }

                        var6.field5362.field2047 = false;
                        class256.method2059(class135.field1717, var6.field5362.field2052, var7.field7280);
                        if (!var3) {
                           break label152;
                        }
                     }

                     if (var7.field7295 != null) {
                        if (var7.field7295[4] != null) {
                           class254.method2040(1003, true, (long)var6.field5362.field2052, var7.field7257, 0, false, false, (byte)-104, -1, -1, var7.field7295[4], var7.field7280, (long)var6.field5362.field2052);
                        }

                        if (var7.field7295[3] != null) {
                           class254.method2040(1001, true, (long)var6.field5362.field2052, var7.field7257, 0, false, false, (byte)-111, -1, -1, var7.field7295[3], var7.field7280, (long)var6.field5362.field2052);
                        }

                        if (var7.field7295[2] != null) {
                           class254.method2040(1009, true, (long)var6.field5362.field2052, var7.field7257, 0, false, false, (byte)-113, -1, -1, var7.field7295[2], var7.field7280, (long)var6.field5362.field2052);
                        }

                        if (var7.field7295[1] != null) {
                           class254.method2040(1007, true, (long)var6.field5362.field2052, var7.field7257, 0, false, false, (byte)-81, -1, -1, var7.field7295[1], var7.field7280, (long)var6.field5362.field2052);
                        }

                        if (var7.field7295[0] != null) {
                           class254.method2040(1006, true, (long)var6.field5362.field2052, var7.field7257, 0, false, false, (byte)-68, -1, -1, var7.field7295[0], var7.field7280, (long)var6.field5362.field2052);
                        }
                     }

                     if (!var6.field5362.field2047) {
                        var6.field5362.field2047 = true;
                        class256.method2059(class732.field10664, var6.field5362.field2052, var7.field7280);
                     }

                     if (var6.field5362.field2047) {
                        class256.method2059(class46.field583, var6.field5362.field2052, var7.field7280);
                     }
                  }

                  var6 = (class387)class138.field1748.method290(arg0 ^ 17958);
               } while(var6 != null);

            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field7163[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(B)Lwn;"
   )
   public final class576 method1193(byte arg0) {
      try {
         ++field7154;
         if (arg0 <= 104) {
            field7153 = null;
         }

         return this.field7161;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7163[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(ZLoca;)Loca;"
   )
   public static final class642 method3871(boolean arg0, class642 arg1) {
      try {
         ++field7150;
         if (!arg0) {
            field7153 = null;
         }

         class642 var2 = client.method998(arg1);
         if (var2 == null) {
            var2 = arg1.field9465;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7163[2] + arg0 + ',' + (arg1 != null ? field7163[1] : field7163[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method105(int arg0) {
      try {
         super.method105(-101);
         ++field7149;
         if (arg0 > -89) {
            field7158 = -119;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7163[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method3872(byte arg0) {
      try {
         field7153 = null;
         if (arg0 < 79) {
            method3871(false, (class642)null);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7163[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3873(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3874(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
