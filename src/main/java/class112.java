import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class112 {
   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1811 = new String[]{method1065(method1064("4\u0002(|-m")), method1065(method1064("4\u0002(|\u001b*5= \u0006+\u0001a")), method1065(method1064("4\u0002(|,m")), method1065(method1064("4\u0002(|+m"))};
   @OriginalMember(
      owner = "client!qda",
      name = "e",
      descriptor = "Lkea;"
   )
   public static class248 field1808 = new class248("", 12);
   @OriginalMember(
      owner = "client!qda",
      name = "b",
      descriptor = "I"
   )
   public static int field1806;
   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "I"
   )
   public static int field1807;
   @OriginalMember(
      owner = "client!qda",
      name = "d",
      descriptor = "I"
   )
   public static int field1809;
   @OriginalMember(
      owner = "client!qda",
      name = "c",
      descriptor = "Lvia;"
   )
   public static class587 field1810;

   @OriginalMember(
      owner = "client!qda",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1806;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1811[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method1060(int arg0, int arg1, int arg2) {
      try {
         ++field1807;
         int var4 = ~class218.field3296 < ~arg2 ? class218.field3296 : arg2;
         if (class587.field8481 == this) {
            return 0;
         } else {
            int var5 = -43 % ((15 - arg1) / 54);
            if (class470.field6831 == this) {
               return -arg0 + var4;
            } else {
               return class147.field2387 == this ? (-arg0 + var4) / 2 : 0;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1811[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(ILs;)V"
   )
   public static final void method1061(int arg0, class293 arg1) {
      class269.field3810[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1062(boolean arg0) {
      try {
         if (arg0) {
            field1808 = null;
            field1810 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1063(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field1809;
         if (class665.field9664 == null) {
            label497: {
               if (!class442.field6452 && class450.field6572 != null) {
                  return class450.field6572.field8482;
               }

               int var2 = class315.field4531.method1630(true);
               int var3 = class315.field4531.method1632(arg0 ^ -8);
               if (class510.field7456) {
                  if (var2 > class582.field8424 && var2 < class733.field10544 + class582.field8424) {
                     int var4 = -1;
                     int var5 = 0;
                     int var6;
                     int var7;
                     if (var1) {
                        if (!class234.field3420) {
                           var6 = var5 * 16 + class583.field8437 + 31;
                           if (var3 > var6 + -13) {
                              if (var6 + 3 >= var3) {
                                 var4 = var5;
                                 if (var1) {
                                    var7 = var5 * 16 + class583.field8437 + 33;
                                    if (~(var7 + -13) > ~var3 && ~(var7 + 3) <= ~var3) {
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
                           var7 = var5 * 16 + class583.field8437 + 33;
                           if (~(var7 + -13) > ~var3 && ~(var7 + 3) <= ~var3) {
                              var4 = var5;
                           }

                           ++var5;
                        }
                     }

                     label484:
                     while(true) {
                        while(~var5 > ~class255.field3622) {
                           if (!class234.field3420) {
                              var6 = var5 * 16 + class583.field8437 + 31;
                              if (var3 > var6 + -13) {
                                 if (var6 + 3 >= var3) {
                                    var4 = var5;
                                    if (var1) {
                                       var7 = var5 * 16 + class583.field8437 + 33;
                                       if (~(var7 + -13) > ~var3 && ~(var7 + 3) <= ~var3) {
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
                              var7 = var5 * 16 + class583.field8437 + 33;
                              if (~(var7 + -13) > ~var3 && ~(var7 + 3) <= ~var3) {
                                 var4 = var5;
                              }

                              ++var5;
                           }
                        }

                        if (!var1) {
                           if (var4 == -1) {
                              break label497;
                           }

                           int var8 = 0;
                           class741 var9 = new class741(class26.field398);
                           class59 var10 = (class59)var9.method5345(1);
                           if (var1) {
                              if (~(var8++) == ~var4) {
                                 return ((class587)var10.field1134.field11533.field4412).field8482;
                              }

                              var10 = (class59)var9.method5349(arg0 + -1522939454);
                           }

                           while(true) {
                              while(var10 != null) {
                                 if (~(var8++) == ~var4) {
                                    return ((class587)var10.field1134.field11533.field4412).field8482;
                                 }

                                 var10 = (class59)var9.method5349(arg0 + -1522939454);
                              }

                              if (!var1) {
                                 if (!var1) {
                                    break label497;
                                 }
                                 break label484;
                              }

                              var10 = (class59)var9.method5349(arg0 + -1522939454);
                           }
                        }

                        var7 = var4 + -1;
                        if (~(var7 + -13) > ~var3 && ~(var7 + 3) <= ~var3) {
                           var4 = var5;
                        }

                        ++var5;
                     }
                  }

                  if (class636.field9268 == null || ~class401.field5898 <= ~var2 || var2 >= class401.field5898 - -class470.field6832) {
                     break label497;
                  }

                  int var11 = -1;
                  int var12 = 0;
                  int var13;
                  int var14;
                  if (var1) {
                     if (class234.field3420) {
                        var13 = var12 * 16 + (class82.field1380 - -33);
                        if (~var3 < ~(var13 + -13)) {
                           if (~(var13 - -3) <= ~var3) {
                              var11 = var12;
                              if (var1) {
                                 var14 = class82.field1380 + 31 + var12 * 16;
                                 if (var3 > var14 - 13 && var14 + 3 >= var3) {
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
                        var14 = class82.field1380 + 31 + var12 * 16;
                        if (var3 > var14 - 13 && var14 + 3 >= var3) {
                           var11 = var12;
                        }

                        ++var12;
                     }
                  }

                  label360:
                  while(true) {
                     while(~class636.field9268.field1133 < ~var12) {
                        if (class234.field3420) {
                           var13 = var12 * 16 + (class82.field1380 - -33);
                           if (~var3 < ~(var13 + -13)) {
                              if (~(var13 - -3) <= ~var3) {
                                 var11 = var12;
                                 if (var1) {
                                    var14 = class82.field1380 + 31 + var12 * 16;
                                    if (var3 > var14 - 13 && var14 + 3 >= var3) {
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
                           var14 = class82.field1380 + 31 + var12 * 16;
                           if (var3 > var14 - 13 && var14 + 3 >= var3) {
                              var11 = var12;
                           }

                           ++var12;
                        }
                     }

                     if (!var1) {
                        if (var11 == -1) {
                           break label497;
                        }

                        int var15 = 0;
                        class741 var16 = new class741(class636.field9268.field1134);
                        class587 var17 = (class587)var16.method5345(1);
                        if (var1) {
                           if (var15++ == var11) {
                              return var17.field8482;
                           }

                           var17 = (class587)var16.method5349(-1522939354);
                        }

                        while(true) {
                           while(var17 != null) {
                              if (var15++ == var11) {
                                 return var17.field8482;
                              }

                              var17 = (class587)var16.method5349(-1522939354);
                           }

                           if (!var1) {
                              if (!var1) {
                                 break label497;
                              }
                              break label360;
                           }

                           var17 = (class587)var16.method5349(-1522939354);
                        }
                     }

                     var14 = var11 + -1;
                     if (var3 > var14 - 13 && var14 + 3 >= var3) {
                        var11 = var12;
                     }

                     ++var12;
                  }
               }

               if (~class582.field8424 > ~var2 && ~(class582.field8424 - -class733.field10544) < ~var2) {
                  label524: {
                     int var18 = -1;
                     int var19 = 0;
                     int var10000;
                     int var22;
                     class686 var23;
                     class587 var24;
                     if (var1) {
                        var10000 = class234.field3420;
                     } else if (var19 >= class103.field1686) {
                        var10000 = ~var18;
                        if (!var1) {
                           if (var10000 == 0) {
                              break label524;
                           }

                           var22 = 0;
                           var23 = new class686(class685.field10080);
                           var24 = (class587)var23.method5000((byte)101);
                           if (var1) {
                              if (~var18 == ~(var22++)) {
                                 return var24.field8482;
                              }

                              var24 = (class587)var23.method5004(-10649);
                           }

                           while(true) {
                              while(var24 != null) {
                                 if (~var18 == ~(var22++)) {
                                    return var24.field8482;
                                 }

                                 var24 = (class587)var23.method5004(-10649);
                              }

                              if (!var1) {
                                 if (var1) {
                                    return class450.field6572.field8482;
                                 }
                                 break label524;
                              }

                              var24 = (class587)var23.method5004(-10649);
                           }
                        }
                     } else {
                        var10000 = class234.field3420;
                     }

                     label240:
                     while(true) {
                        int var21;
                        if (var10000 == 0) {
                           int var20 = class583.field8437 + 31 - -((class103.field1686 - var19 + -1) * 16);
                           if (var20 + -13 < var3) {
                              if (var20 + 3 >= var3) {
                                 var18 = var19;
                                 if (var1) {
                                    var21 = class583.field8437 + 33 - -((-var19 + -1 + class103.field1686) * 16);
                                    if (var21 + -13 < var3 && var3 <= var21 + 3) {
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
                           var21 = class583.field8437 + 33 - -((-var19 + -1 + class103.field1686) * 16);
                           if (var21 + -13 < var3 && var3 <= var21 + 3) {
                              var18 = var19;
                           }

                           ++var19;
                        }

                        if (var19 >= class103.field1686) {
                           var10000 = ~var18;
                           if (!var1) {
                              if (var10000 == 0) {
                                 break;
                              }

                              var22 = 0;
                              var23 = new class686(class685.field10080);
                              var24 = (class587)var23.method5000((byte)101);
                              if (var1) {
                                 if (~var18 == ~(var22++)) {
                                    return var24.field8482;
                                 }

                                 var24 = (class587)var23.method5004(-10649);
                              }

                              while(true) {
                                 while(var24 != null) {
                                    if (~var18 == ~(var22++)) {
                                       return var24.field8482;
                                    }

                                    var24 = (class587)var23.method5004(-10649);
                                 }

                                 if (!var1) {
                                    if (var1) {
                                       return class450.field6572.field8482;
                                    }
                                    break label240;
                                 }

                                 var24 = (class587)var23.method5004(-10649);
                              }
                           }
                        } else {
                           var10000 = class234.field3420;
                        }
                     }
                  }
               }
            }
         }

         if (arg0 != 100) {
            method1062(false);
         }

         return -1;
      } catch (RuntimeException var26) {
         throw class608.method4462(var26, field1811[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1064(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1065(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
