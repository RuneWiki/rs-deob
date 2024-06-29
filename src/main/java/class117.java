import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class117 extends class428 {
   @OriginalMember(
      owner = "client!er",
      name = "o",
      descriptor = "I"
   )
   public volatile int field1463 = -1;
   @OriginalMember(
      owner = "client!er",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public volatile String field1465;
   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1468 = new String[]{method943(method942("R\u0004\f\u0017\u000e")), method943(method942("R\u0004\f\u0016\u000e")), method943(method942("R\u0004\f\u0010\u000e")), method943(method942("R\u0004\f\u0011\u000e")), method943(method942("Y\u0003N?")), method943(method942("R\u0004\foOY\u001fVm\u000e")), method943(method942("LX\f}["))};
   @OriginalMember(
      owner = "client!er",
      name = "u",
      descriptor = "Leg;"
   )
   public static class118 field1461 = new class118(116, 8);
   @OriginalMember(
      owner = "client!er",
      name = "m",
      descriptor = "F"
   )
   public static float field1467 = 0.0F;
   @OriginalMember(
      owner = "client!er",
      name = "r",
      descriptor = "I"
   )
   public static int field1459;
   @OriginalMember(
      owner = "client!er",
      name = "q",
      descriptor = "I"
   )
   public static int field1460;
   @OriginalMember(
      owner = "client!er",
      name = "p",
      descriptor = "I"
   )
   public static int field1462;
   @OriginalMember(
      owner = "client!er",
      name = "n",
      descriptor = "I"
   )
   public static int field1464;
   @OriginalMember(
      owner = "client!er",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1466;

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method937(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         int var6;
         label83: {
            ++field1462;
            if (~arg4 <= ~arg1) {
               var6 = arg1;
               if (var5) {
                  class341.field4631[arg1][arg2] = arg0;
                  var6 = arg1 + 1;
               }

               while(true) {
                  while(arg4 > var6) {
                     class341.field4631[var6][arg2] = arg0;
                     ++var6;
                  }

                  if (!var5) {
                     if (!var5) {
                        if (!var5) {
                           if (arg3 != 5473) {
                              method938(true);
                              return;
                           }

                           return;
                        }

                        ++var6;
                        break label83;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            var6 = arg4;
            if (var5) {
               class341.field4631[arg4][arg2] = arg0;
               var6 = arg4 + 1;
            }
         }

         while(true) {
            while(~arg1 < ~var6) {
               class341.field4631[var6][arg2] = arg0;
               ++var6;
            }

            if (!var5) {
               if (arg3 != 5473) {
                  method938(true);
                  return;
               }

               return;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1468[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method938(boolean arg0) {
      try {
         field1461 = null;
         field1466 = null;
         if (!arg0) {
            field1466 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1468[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method939(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1464;
         if (arg0 < 98) {
            return true;
         } else {
            try {
               if (~class4.field38 == -3) {
                  if (class655.field9588 == null) {
                     class655.field9588 = class664.method4849(class672.field9747, class397.field5738, class282.field3915);
                     if (class655.field9588 == null) {
                        return false;
                     }
                  }

                  if (class457.field6537 == null) {
                     class457.field6537 = new class787(class325.field4408, class17.field196);
                  }

                  class582 var2 = class270.field3737;
                  if (class80.field1029 != null) {
                     var2 = class80.field1029;
                  }

                  if (var2.method4242(class738.field10771, 22050, class655.field9588, class457.field6537, 88)) {
                     class270.field3737 = var2;
                     class270.field3737.method4218((byte)127);
                     class582 var10000;
                     int var3;
                     if (class175.field2409 <= 0) {
                        class4.field38 = 0;
                        class270.field3737.method4243(class57.field705, (byte)-94);
                        var3 = 0;
                        if (var1) {
                           class270.field3737.method4246(0, class352.field4733[var3], var3);
                           class352.field4733[var3] = 255;
                           ++var3;
                        }

                        while(true) {
                           while(class352.field4733.length > var3) {
                              class270.field3737.method4246(0, class352.field4733[var3], var3);
                              class352.field4733[var3] = 255;
                              ++var3;
                           }

                           if (!var1) {
                              if (var1) {
                                 class4.field38 = 3;
                                 class270.field3737.method4243(class57.field705 < class175.field2409 ? class57.field705 : class175.field2409, (byte)-94);
                                 var3 = 0;
                                 if (var1) {
                                    class270.field3737.method4246(0, class352.field4733[var3], var3);
                                    class352.field4733[var3] = 255;
                                    ++var3;
                                 }
                              } else {
                                 var10000 = class80.field1029;
                                 if (!var1) {
                                    if (var10000 == null) {
                                       label177: {
                                          if (~class746.field10945 >= -1L) {
                                             class270.field3737.method4235(117, class655.field9588, class265.field3656);
                                             if (!var1) {
                                                break label177;
                                             }
                                          }

                                          class270.field3737.method4225(class265.field3656, class746.field10945, class655.field9588, -148040441, true);
                                       }
                                    }

                                    if (class3.field19 != null) {
                                       class3.field19.method1548(class270.field3737, -20253);
                                    }

                                    class672.field9747 = null;
                                    class457.field6537 = null;
                                    class80.field1029 = null;
                                    class655.field9588 = null;
                                    class746.field10945 = 0L;
                                    return true;
                                 }

                                 var10000.method4246(0, class352.field4733[var3], var3);
                                 class352.field4733[var3] = 255;
                                 ++var3;
                              }
                              break;
                           }

                           ++var3;
                        }
                     } else {
                        class4.field38 = 3;
                        class270.field3737.method4243(class57.field705 < class175.field2409 ? class57.field705 : class175.field2409, (byte)-94);
                        var3 = 0;
                        if (var1) {
                           class270.field3737.method4246(0, class352.field4733[var3], var3);
                           class352.field4733[var3] = 255;
                           ++var3;
                        }
                     }

                     while(true) {
                        while(~class352.field4733.length < ~var3) {
                           class270.field3737.method4246(0, class352.field4733[var3], var3);
                           class352.field4733[var3] = 255;
                           ++var3;
                        }

                        var10000 = class80.field1029;
                        if (!var1) {
                           if (var10000 == null) {
                              label180: {
                                 if (~class746.field10945 >= -1L) {
                                    class270.field3737.method4235(117, class655.field9588, class265.field3656);
                                    if (!var1) {
                                       break label180;
                                    }
                                 }

                                 class270.field3737.method4225(class265.field3656, class746.field10945, class655.field9588, -148040441, true);
                              }
                           }

                           if (class3.field19 != null) {
                              class3.field19.method1548(class270.field3737, -20253);
                           }

                           class672.field9747 = null;
                           class457.field6537 = null;
                           class80.field1029 = null;
                           class655.field9588 = null;
                           class746.field10945 = 0L;
                           return true;
                        }

                        var10000.method4246(0, class352.field4733[var3], var3);
                        class352.field4733[var3] = 255;
                        ++var3;
                     }
                  }
               }
            } catch (Exception var6) {
               var6.printStackTrace();
               class270.field3737.method4215(false);
               class457.field6537 = null;
               class672.field9747 = null;
               class4.field38 = 0;
               class655.field9588 = null;
               class80.field1029 = null;
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1468[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(Lgn;Z[[[BIB)Z"
   )
   public static final boolean method940(class731 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!class621.field9143) {
         return false;
      } else {
         int var5 = arg0.field10694 >> class773.field11359;
         int var6 = var5;
         int var7 = arg0.field10693 >> class773.field11359;
         int var8 = var7;
         if (arg0 instanceof class627) {
            var6 = ((class627)arg0).field9211;
            var8 = ((class627)arg0).field9212;
            var5 = ((class627)arg0).field9207;
            var7 = ((class627)arg0).field9208;
         }

         for(int var9 = var5; var9 <= var6; ++var9) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (arg0.field10702 < class154.field2185 && var9 >= class741.field10805 && var9 < class786.field11546 && var10 >= class110.field1388 && var10 < class559.field8011) {
                  if ((arg2 == null || arg0.field10701 < arg3 || arg2[arg0.field10701][var9][var10] != arg4) && arg0.method1764((byte)-78) && !arg0.method1762(false, class80.field1038)) {
                     return false;
                  }

                  if (!arg1 && var9 >= class712.field10385 - 16 && var9 <= class712.field10385 + 16 && var10 >= class377.field5453 - 16 && var10 <= class377.field5453 + 16) {
                     if (class767.field11310) {
                        class390.field5654[class130.field1661++].method1557(arg0, false);
                        class130.field1661 %= class199.field2833;
                     } else {
                        arg0.method245(class80.field1038, false);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method941(int arg0) {
      try {
         ++field1460;
         class266.field3701.method2379(5, 26601);
         class375.field5415.method4339((byte)122, 5);
         class427.field6121.method1097(5, 7);
         class387.field5618.method3975(5, 0);
         class195.field2761.method1733(5, arg0 + 6930);
         class468.field6728.method2265(5, (byte)-109);
         class190.field2702.method4416(125, 5);
         class478.field6875.method1952(5, 48);
         class631.field9253.method4275(0, 5);
         class468.field6732.method3512((byte)-87, 5);
         class657.field9605.method1067((byte)-27, 5);
         class184.field2587.method5279(5, (byte)-44);
         class780.field11425.method1109(5, (byte)-80);
         class61.field747.method5669(5, (byte)-78);
         class294.field4046.method4591((byte)-9, 5);
         class327.field4469.method1331(5, -114);
         class741.field10810.method2475((byte)66, 5);
         class685.field10097.method669(5, (byte)-71);
         class426.field6104.method2422((byte)-51, 5);
         if (arg0 == -9087) {
            class645.field9420.method5150(-7836, 5);
            class247.field3409.method910(arg0 + 9087, 5);
            class612.field8982.method3450(-29921, 5);
            class778.field11405.method3264(true, 5);
            class425.method3140(5, arg0 + 8969);
            class241.method1844(50, 117);
            class427.method3162(50, -83);
            class720.method5235(5, (byte)5);
            class766.method5546(true, 5);
            class360.field4902.method726(5, arg0 ^ -16787);
            class252.field3435.method726(5, 25324);
            class319.field4374.method726(5, 25324);
            class685.field10094.method726(5, 25324);
            class200.field2861.method726(5, 25324);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1468[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class117(String arg0) {
      try {
         this.field1465 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1468[5] + (arg0 != null ? field1468[6] : field1468[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method942(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method943(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
