import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class162 {
   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2423 = new String[]{method1445(method1444("d\u001eYz ")), method1445(method1444("d\u001eYy "))};
   @OriginalMember(
      owner = "client!hu",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field2422 = false;
   @OriginalMember(
      owner = "client!hu",
      name = "c",
      descriptor = "I"
   )
   public static int field2419 = -60;
   @OriginalMember(
      owner = "client!hu",
      name = "e",
      descriptor = "D"
   )
   public static double field2420;
   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "I"
   )
   public static int field2418;
   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "I"
   )
   public static int field2421;

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(I)J"
   )
   public static final synchronized long method1442(int arg0) {
      try {
         ++field2421;
         long var1 = System.currentTimeMillis();
         if (arg0 != 14080) {
            field2420 = 0.6626022652013579D;
         }

         if (var1 < class136.field1964) {
            class19.field244 += -var1 + class136.field1964;
         }

         class136.field1964 = var1;
         return class19.field244 + var1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2423[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method1443(int arg0) {
      boolean var1 = client.field1786;

      try {
         if (arg0 > -17) {
            return -31;
         } else {
            ++field2418;
            if (class358.field5551 == null) {
               if (!class304.field4759 && class305.field4780 != null) {
                  return class305.field4780.field2902;
               }

               int var2 = class690.field10254.method2571(66);
               int var3 = class690.field10254.method2578(true);
               if (class510.field7804) {
                  int var10000;
                  if (~class108.field1490 > ~var2 && ~(class108.field1490 - -class344.field5235) < ~var2) {
                     label462: {
                        int var4 = -1;
                        int var5 = 0;
                        int var8;
                        class793 var9;
                        class525 var10;
                        if (var1) {
                           var10000 = class485.field7378;
                        } else if (var5 >= class97.field1368) {
                           var10000 = ~var4;
                           if (!var1) {
                              if (var10000 == 0) {
                                 return -1;
                              }

                              var8 = 0;
                              var9 = new class793(class681.field10158);
                              var10 = (class525)var9.method5729(21614);
                              if (var1) {
                                 if (~var4 == ~(var8++)) {
                                    return ((class185)var10.field8005.field7220.field4682).field2902;
                                 }

                                 var10 = (class525)var9.method5731(true);
                              }

                              while(true) {
                                 while(var10 != null) {
                                    if (~var4 == ~(var8++)) {
                                       return ((class185)var10.field8005.field7220.field4682).field2902;
                                    }

                                    var10 = (class525)var9.method5731(true);
                                 }

                                 if (!var1) {
                                    if (!var1) {
                                       return -1;
                                    }
                                    break label462;
                                 }

                                 var10 = (class525)var9.method5731(true);
                              }
                           }
                        } else {
                           var10000 = class485.field7378;
                        }

                        label426:
                        while(true) {
                           int var7;
                           if (var10000 != 0) {
                              int var6 = var5 * 16 + class190.field2947 + 33;
                              if (var6 + -13 < var3) {
                                 if (~var3 >= ~(var6 - -3)) {
                                    var4 = var5;
                                    if (var1) {
                                       var7 = var5 * 16 + class190.field2947 + 31;
                                       if (var3 > var7 + -13 && ~(var7 + 3) <= ~var3) {
                                          var4 = var5;
                                       }

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
                              var7 = var5 * 16 + class190.field2947 + 31;
                              if (var3 > var7 + -13 && ~(var7 + 3) <= ~var3) {
                                 var4 = var5;
                              }

                              ++var5;
                           }

                           if (var5 >= class97.field1368) {
                              var10000 = ~var4;
                              if (!var1) {
                                 if (var10000 == 0) {
                                    return -1;
                                 }

                                 var8 = 0;
                                 var9 = new class793(class681.field10158);
                                 var10 = (class525)var9.method5729(21614);
                                 if (var1) {
                                    if (~var4 == ~(var8++)) {
                                       return ((class185)var10.field8005.field7220.field4682).field2902;
                                    }

                                    var10 = (class525)var9.method5731(true);
                                 }

                                 while(true) {
                                    while(var10 != null) {
                                       if (~var4 == ~(var8++)) {
                                          return ((class185)var10.field8005.field7220.field4682).field2902;
                                       }

                                       var10 = (class525)var9.method5731(true);
                                    }

                                    if (!var1) {
                                       if (!var1) {
                                          return -1;
                                       }
                                       break label426;
                                    }

                                    var10 = (class525)var9.method5731(true);
                                 }
                              }
                           } else {
                              var10000 = class485.field7378;
                           }
                        }
                     }
                  }

                  if (class525.field7997 == null || ~class532.field8084 <= ~var2 || class532.field8084 - -class785.field11521 <= var2) {
                     return -1;
                  }

                  int var11;
                  label319: {
                     var11 = -1;
                     int var12 = 0;
                     if (var1) {
                        var10000 = class485.field7378;
                     } else if (class525.field7997.field8004 <= var12) {
                        var10000 = ~var11;
                        if (!var1) {
                           break label319;
                        }
                     } else {
                        var10000 = class485.field7378;
                     }

                     while(true) {
                        int var14;
                        if (var10000 == 0) {
                           int var13 = var12 * 16 + 31 + class255.field3853;
                           if (~(var13 - 13) > ~var3) {
                              if (var3 <= var13 + 3) {
                                 var11 = var12;
                                 if (var1) {
                                    var14 = var12 * 16 + class255.field3853 + 33;
                                    if (~(var14 - 13) > ~var3 && var3 <= var14 - -3) {
                                       var11 = var12;
                                    }

                                    ++var12;
                                 } else {
                                    ++var12;
                                 }
                              } else {
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        } else {
                           var14 = var12 * 16 + class255.field3853 + 33;
                           if (~(var14 - 13) > ~var3 && var3 <= var14 - -3) {
                              var11 = var12;
                           }

                           ++var12;
                        }

                        if (class525.field7997.field8004 <= var12) {
                           var10000 = ~var11;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = class485.field7378;
                        }
                     }
                  }

                  if (var10000 == 0) {
                     return -1;
                  }

                  int var15 = 0;
                  class793 var16 = new class793(class525.field7997.field8005);
                  class185 var17 = (class185)var16.method5729(21614);
                  if (var1) {
                     if (var11 == var15++) {
                        return var17.field2902;
                     }

                     var17 = (class185)var16.method5731(true);
                  }

                  while(true) {
                     while(var17 != null) {
                        if (var11 == var15++) {
                           return var17.field2902;
                        }

                        var17 = (class185)var16.method5731(true);
                     }

                     if (!var1) {
                        if (!var1) {
                           return -1;
                        }
                        break;
                     }

                     var17 = (class185)var16.method5731(true);
                  }
               }

               if (class108.field1490 < var2 && ~(class344.field5235 + class108.field1490) < ~var2) {
                  int var18 = -1;
                  int var19 = 0;
                  int var20;
                  int var21;
                  if (var1) {
                     if (class485.field7378) {
                        var20 = class190.field2947 - -((class558.field8307 - 1 - var19) * 16) + 33;
                        if (var3 > var20 + -13) {
                           if (~var3 >= ~(var20 + 3)) {
                              var18 = var19;
                              if (var1) {
                                 var21 = (-var19 + class558.field8307 + -1) * 16 + 31 + class190.field2947;
                                 if (~(var21 + -13) > ~var3 && var3 <= var21 + 3) {
                                    var18 = var19;
                                 }

                                 ++var19;
                              } else {
                                 ++var19;
                              }
                           } else {
                              ++var19;
                           }
                        } else {
                           ++var19;
                        }
                     } else {
                        var21 = (-var19 + class558.field8307 + -1) * 16 + 31 + class190.field2947;
                        if (~(var21 + -13) > ~var3 && var3 <= var21 + 3) {
                           var18 = var19;
                        }

                        ++var19;
                     }
                  }

                  while(true) {
                     while(var19 < class558.field8307) {
                        if (class485.field7378) {
                           var20 = class190.field2947 - -((class558.field8307 - 1 - var19) * 16) + 33;
                           if (var3 > var20 + -13) {
                              if (~var3 >= ~(var20 + 3)) {
                                 var18 = var19;
                                 if (var1) {
                                    var21 = (-var19 + class558.field8307 + -1) * 16 + 31 + class190.field2947;
                                    if (~(var21 + -13) > ~var3 && var3 <= var21 + 3) {
                                       var18 = var19;
                                    }

                                    ++var19;
                                 } else {
                                    ++var19;
                                 }
                              } else {
                                 ++var19;
                              }
                           } else {
                              ++var19;
                           }
                        } else {
                           var21 = (-var19 + class558.field8307 + -1) * 16 + 31 + class190.field2947;
                           if (~(var21 + -13) > ~var3 && var3 <= var21 + 3) {
                              var18 = var19;
                           }

                           ++var19;
                        }
                     }

                     if (!var1) {
                        if (var18 == -1) {
                           break;
                        }

                        int var22 = 0;
                        class602 var23 = new class602(class326.field4958);
                        class185 var24 = (class185)var23.method4453((byte)127);
                        if (var1) {
                           if (var18 == var22++) {
                              return var24.field2902;
                           }

                           var24 = (class185)var23.method4451(true);
                        }

                        while(true) {
                           while(var24 != null) {
                              if (var18 == var22++) {
                                 return var24.field2902;
                              }

                              var24 = (class185)var23.method4451(true);
                           }

                           if (!var1) {
                              if (var1) {
                                 return class305.field4780.field2902;
                              }

                              return -1;
                           }

                           var24 = (class185)var23.method4451(true);
                        }
                     }

                     var21 = var18 + -1;
                     if (~(var21 + -13) > ~var3 && var3 <= var21 + 3) {
                        var18 = var19;
                     }

                     ++var19;
                  }
               }
            }

            return -1;
         }
      } catch (RuntimeException var26) {
         throw class482.method3757(var26, field2423[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1444(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1445(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
