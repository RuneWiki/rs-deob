import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public abstract class class109 extends class391 {
   @OriginalMember(
      owner = "client!baa",
      name = "B",
      descriptor = "Z"
   )
   public boolean field1509 = false;
   @OriginalMember(
      owner = "client!baa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1513 = new String[]{method1044(method1043("|l\u0014?&_%")), method1044(method1043("px\u0019}")), method1044(method1043("e#[?\u000f")), method1044(method1043("|l\u0014?'_%")), method1044(method1043("|l\u0014?%_%")), method1044(method1043("|l\u0014?!_%")), method1044(method1043("|l\u0014?$_%"))};
   @OriginalMember(
      owner = "client!baa",
      name = "r",
      descriptor = "Luk;"
   )
   public static class498 field1497 = new class498(56, 6);
   @OriginalMember(
      owner = "client!baa",
      name = "y",
      descriptor = "B"
   )
   public byte field1500;
   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "B"
   )
   public byte field1506;
   @OriginalMember(
      owner = "client!baa",
      name = "k",
      descriptor = "I"
   )
   public int field1494;
   @OriginalMember(
      owner = "client!baa",
      name = "t",
      descriptor = "I"
   )
   public int field1495;
   @OriginalMember(
      owner = "client!baa",
      name = "q",
      descriptor = "I"
   )
   public static int field1496;
   @OriginalMember(
      owner = "client!baa",
      name = "o",
      descriptor = "I"
   )
   public int field1498;
   @OriginalMember(
      owner = "client!baa",
      name = "p",
      descriptor = "I"
   )
   public static int field1499;
   @OriginalMember(
      owner = "client!baa",
      name = "s",
      descriptor = "I"
   )
   public static int field1501;
   @OriginalMember(
      owner = "client!baa",
      name = "m",
      descriptor = "I"
   )
   public static int field1502;
   @OriginalMember(
      owner = "client!baa",
      name = "n",
      descriptor = "I"
   )
   public int field1504;
   @OriginalMember(
      owner = "client!baa",
      name = "u",
      descriptor = "I"
   )
   public int field1505;
   @OriginalMember(
      owner = "client!baa",
      name = "C",
      descriptor = "I"
   )
   public int field1507;
   @OriginalMember(
      owner = "client!baa",
      name = "w",
      descriptor = "I"
   )
   public static int field1512;
   @OriginalMember(
      owner = "client!baa",
      name = "l",
      descriptor = "Lbaa;"
   )
   public class109 field1503;
   @OriginalMember(
      owner = "client!baa",
      name = "A",
      descriptor = "Lkf;"
   )
   public static class401 field1508;
   @OriginalMember(
      owner = "client!baa",
      name = "v",
      descriptor = "Z"
   )
   public boolean field1511;
   @OriginalMember(
      owner = "client!baa",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field1510;

   @OriginalMember(
      owner = "client!baa",
      name = "j",
      descriptor = "(I)V",
      line = 7
   )
   public static void method1038(int arg0) {
      try {
         field1510 = null;
         if (arg0 == 0) {
            field1508 = null;
            field1497 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1513[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(JIIZ)Ljava/lang/String;",
      line = 21
   )
   public static final String method1039(long arg0, int arg1, int arg2, boolean arg3) {
      try {
         Calendar var5;
         label22: {
            ++field1502;
            if (!arg3) {
               class552.method4193(arg1 ^ 27444, arg0);
               var5 = class406.field6327;
               if (!client.field1786) {
                  break label22;
               }
            }

            class17.method134(36, arg0);
            var5 = class406.field6326;
         }

         int var6 = var5.get(5);
         int var7 = var5.get(2);
         if (arg1 != 0) {
            return null;
         } else {
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return ~arg2 == -4 ? class78.method737(arg3, arg2, (byte)-83, arg0) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class578.field8544[arg2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1513[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(IIZ[Llja;)I",
      line = 65
   )
   public final int method1040(int arg0, int arg1, boolean arg2, class404[] arg3) {
      boolean var5 = client.field1786;

      try {
         int var10;
         int var11;
         label57: {
            ++field1512;
            long var6 = class226.field3439[this.field1506][arg1][arg0];
            long var8 = 0L;
            var10 = 0;
            if (var5) {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            } else if (var8 > 48L) {
               var11 = var10;
               if (!var5) {
                  break label57;
               }
            } else {
               var11 = (int)(var6 >> (int)var8 & 65535L);
            }

            label56:
            while(true) {
               while(~var11 >= -1) {
                  var11 = var10;
                  if (!var5) {
                     break label56;
                  }
               }

               var8 += 16L;
               arg3[var10++] = class88.field1276[var11 + -1].field5003;
               if (var8 > 48L) {
                  var11 = var10;
                  if (!var5) {
                     break;
                  }
               } else {
                  var11 = (int)(var6 >> (int)var8 & 65535L);
               }
            }
         }

         if (var5) {
            arg3[var11] = null;
            ++var11;
         }

         while(true) {
            while(~var11 > -5) {
               arg3[var11] = null;
               ++var11;
            }

            if (!var5) {
               if (arg2) {
                  this.field1506 = 95;
               }

               return var10;
            }

            ++var11;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field1513[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1513[2] : field1513[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "c",
      descriptor = "(B)I",
      line = 114
   )
   public int method1041(byte arg0) {
      try {
         if (arg0 > -1) {
            return 105;
         } else {
            ++field1499;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1513[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "e",
      descriptor = "(I)V",
      line = 135
   )
   public static final void method1042(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field1496;
         short var2 = 1024;
         short var3 = 3072;
         if (class334.field5143) {
            var3 = 4096;
            if (class747.field11077) {
               var2 = 2048;
            }
         }

         if (class357.field5520 < (float)var2) {
            class357.field5520 = (float)var2;
            if (var1) {
               class417.field6456 -= 16384.0F;
            }
         }

         while(true) {
            while(class417.field6456 >= 16384.0F) {
               class417.field6456 -= 16384.0F;
            }

            float var10000 = (float)var3;
            float var10001 = class357.field5520;
            if (!var1) {
               if (var10000 < var10001) {
                  class357.field5520 = (float)var3;
                  if (var1) {
                     class417.field6456 += 16384.0F;
                  }
               }

               while(class417.field6456 < 0.0F) {
                  class417.field6456 += 16384.0F;
               }

               int var4 = class674.field10031 >> 9;
               int var5 = class149.field2262 >> 9;
               int var6 = class477.method3711(class464.field7054, class674.field10031, (byte)0, class149.field2262);
               if (arg0 != 19795) {
                  return;
               } else {
                  int var7 = 0;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  int var15;
                  if (~var4 < -4) {
                     if (~var5 < -4) {
                        if (class513.field7828 + -4 > var4) {
                           if (var5 < class475.field7230 + -4) {
                              var8 = var4 + -4;
                              if (var1) {
                                 var9 = var5 - 4;
                                 if (var1) {
                                    var10 = class464.field7054;
                                    if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                                       ++var10;
                                    }

                                    var11 = 0;
                                    if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                                       var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                                    }

                                    if (class385.field6076 != null && class385.field6076[var10] != null) {
                                       var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                                       if (~var12 < ~var7) {
                                          var7 = var12;
                                       }
                                    }

                                    ++var9;
                                 }
                              } else if (~var8 < ~(var4 + 4)) {
                                 var8 = (var7 >> 2) * 1536;
                                 var15 = ~var8;
                                 if (!var1) {
                                    if (var15 < -786433) {
                                       var8 = 786432;
                                    }

                                    if (~var8 > -262145) {
                                       var8 = 262144;
                                    }

                                    if (~class243.field3685 <= ~var8) {
                                       if (~class243.field3685 < ~var8) {
                                          class243.field3685 += (-class243.field3685 + var8) / 80;
                                          return;
                                       }
                                    } else {
                                       class243.field3685 += (-class243.field3685 + var8) / 24;
                                    }

                                    return;
                                 }

                                 var9 = var15 - -786433;
                                 if (var1) {
                                    var10 = class464.field7054;
                                    if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                                       ++var10;
                                    }

                                    var11 = 0;
                                    if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                                       var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                                    }

                                    if (class385.field6076 != null && class385.field6076[var10] != null) {
                                       var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                                       if (~var12 < ~var7) {
                                          var7 = var12;
                                       }
                                    }

                                    ++var9;
                                 }
                              } else {
                                 var9 = var5 - 4;
                                 if (var1) {
                                    var10 = class464.field7054;
                                    if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                                       ++var10;
                                    }

                                    var11 = 0;
                                    if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                                       var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                                    }

                                    if (class385.field6076 != null && class385.field6076[var10] != null) {
                                       var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                                       if (~var12 < ~var7) {
                                          var7 = var12;
                                       }
                                    }

                                    ++var9;
                                 }
                              }
                           } else {
                              var8 = (var7 >> 2) * 1536;
                              var15 = ~var8;
                              if (!var1) {
                                 if (var15 < -786433) {
                                    var8 = 786432;
                                 }

                                 if (~var8 > -262145) {
                                    var8 = 262144;
                                 }

                                 if (~class243.field3685 <= ~var8) {
                                    if (~class243.field3685 < ~var8) {
                                       class243.field3685 += (-class243.field3685 + var8) / 80;
                                       return;
                                    }
                                 } else {
                                    class243.field3685 += (-class243.field3685 + var8) / 24;
                                 }

                                 return;
                              }

                              var9 = var15 - -786433;
                              if (var1) {
                                 var10 = class464.field7054;
                                 if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                                    ++var10;
                                 }

                                 var11 = 0;
                                 if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                                    var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                                 }

                                 if (class385.field6076 != null && class385.field6076[var10] != null) {
                                    var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                                    if (~var12 < ~var7) {
                                       var7 = var12;
                                    }
                                 }

                                 ++var9;
                              }
                           }
                        } else {
                           var8 = (var7 >> 2) * 1536;
                           var15 = ~var8;
                           if (!var1) {
                              if (var15 < -786433) {
                                 var8 = 786432;
                              }

                              if (~var8 > -262145) {
                                 var8 = 262144;
                              }

                              if (~class243.field3685 <= ~var8) {
                                 if (~class243.field3685 < ~var8) {
                                    class243.field3685 += (-class243.field3685 + var8) / 80;
                                    return;
                                 }
                              } else {
                                 class243.field3685 += (-class243.field3685 + var8) / 24;
                              }

                              return;
                           }

                           var9 = var15 - -786433;
                           if (var1) {
                              var10 = class464.field7054;
                              if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                                 ++var10;
                              }

                              var11 = 0;
                              if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                                 var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                              }

                              if (class385.field6076 != null && class385.field6076[var10] != null) {
                                 var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                                 if (~var12 < ~var7) {
                                    var7 = var12;
                                 }
                              }

                              ++var9;
                           }
                        }
                     } else {
                        var8 = (var7 >> 2) * 1536;
                        var15 = ~var8;
                        if (!var1) {
                           if (var15 < -786433) {
                              var8 = 786432;
                           }

                           if (~var8 > -262145) {
                              var8 = 262144;
                           }

                           if (~class243.field3685 <= ~var8) {
                              if (~class243.field3685 < ~var8) {
                                 class243.field3685 += (-class243.field3685 + var8) / 80;
                                 return;
                              }
                           } else {
                              class243.field3685 += (-class243.field3685 + var8) / 24;
                           }

                           return;
                        }

                        var9 = var15 - -786433;
                        if (var1) {
                           var10 = class464.field7054;
                           if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                              var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                           }

                           if (class385.field6076 != null && class385.field6076[var10] != null) {
                              var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  } else {
                     var8 = (var7 >> 2) * 1536;
                     var15 = ~var8;
                     if (!var1) {
                        if (var15 < -786433) {
                           var8 = 786432;
                        }

                        if (~var8 > -262145) {
                           var8 = 262144;
                        }

                        if (~class243.field3685 <= ~var8) {
                           if (~class243.field3685 < ~var8) {
                              class243.field3685 += (-class243.field3685 + var8) / 80;
                              return;
                           }
                        } else {
                           class243.field3685 += (-class243.field3685 + var8) / 24;
                        }

                        return;
                     }

                     var9 = var15 - -786433;
                     if (var1) {
                        var10 = class464.field7054;
                        if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                           var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                        }

                        if (class385.field6076 != null && class385.field6076[var10] != null) {
                           var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                           if (~var12 < ~var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }

                  while(true) {
                     while(~(var5 + 4) <= ~var9) {
                        var10 = class464.field7054;
                        if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                           var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                        }

                        if (class385.field6076 != null && class385.field6076[var10] != null) {
                           var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                           if (~var12 < ~var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }

                     ++var8;
                     if (~var8 < ~(var4 + 4)) {
                        var8 = (var7 >> 2) * 1536;
                        var15 = ~var8;
                        if (!var1) {
                           if (var15 < -786433) {
                              var8 = 786432;
                           }

                           if (~var8 > -262145) {
                              var8 = 262144;
                           }

                           if (~class243.field3685 <= ~var8) {
                              if (~class243.field3685 < ~var8) {
                                 class243.field3685 += (-class243.field3685 + var8) / 80;
                                 return;
                              }
                           } else {
                              class243.field3685 += (-class243.field3685 + var8) / 24;
                           }

                           return;
                        }

                        var9 = var15 - -786433;
                        if (var1) {
                           var10 = class464.field7054;
                           if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                              var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                           }

                           if (class385.field6076 != null && class385.field6076[var10] != null) {
                              var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     } else {
                        var9 = var5 - 4;
                        if (var1) {
                           var10 = class464.field7054;
                           if (~var10 > -4 && class577.method4326(var8, (byte)77, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class401.field6289.field6264 != null && class401.field6289.field6264[var10] != null) {
                              var11 = (class401.field6289.field6264[var10][var8][var9] & 255) * 8 << 2;
                           }

                           if (class385.field6076 != null && class385.field6076[var10] != null) {
                              var12 = var6 + var11 + -class385.field6076[var10].method2313(-119, var8, var9);
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  }
               }
            }

            class417.field6456 = var10000 - var10001;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field1513[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!baa",
      name = "d",
      descriptor = "(B)Z"
   )
   public abstract boolean method45(byte arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "(Lha;B)Z"
   )
   public abstract boolean method734(class610 arg0, byte arg1);

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(IIILha;ZILbaa;)V"
   )
   public abstract void method44(int arg0, int arg1, int arg2, class610 arg3, boolean arg4, int arg5, class109 arg6);

   @OriginalMember(
      owner = "client!baa",
      name = "i",
      descriptor = "(I)Z"
   )
   public abstract boolean method738(int arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "h",
      descriptor = "(I)I"
   )
   public abstract int method230(int arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "k",
      descriptor = "(I)I"
   )
   public abstract int method239(int arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(ILha;)Lil;"
   )
   public abstract class680 method41(int arg0, class610 arg1);

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(BLha;)Lpga;"
   )
   public abstract class788 method56(byte arg0, class610 arg1);

   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "(Lha;I)V"
   )
   public abstract void method49(class610 arg0, int arg1);

   @OriginalMember(
      owner = "client!baa",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method57(int arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "g",
      descriptor = "(I)Z"
   )
   public abstract boolean method228(int arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public abstract boolean method233(boolean arg0);

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(Lha;IIZ)Z"
   )
   public abstract boolean method43(class610 arg0, int arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!baa",
      name = "a",
      descriptor = "(I[Llja;)I"
   )
   public abstract int method740(int arg0, class404[] arg1);

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!baa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
