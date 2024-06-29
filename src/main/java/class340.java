import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class340 {
   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4622 = new String[]{method2500(method2499("\t\u0016\u0003k;G")), method2500(method2499("\u0014\\Lk\u0005")), method2500(method2499("\u0001\u0007\u000e)")), method2500(method2499("\rCP\u001a\u001e\u001a\u001e\u000e")), method2500(method2499("\t\u0016\u0003k:G")), method2500(method2499("\u001fCP\u001a\u001e\u001a\u001e\u000e")), method2500(method2499("\u001fCS\u001a\u001e\u001a\u001e\u000e")), method2500(method2499("\t\u0016\u0003k9G"))};
   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "I"
   )
   public static int field4621 = 1337;
   @OriginalMember(
      owner = "client!fda",
      name = "c",
      descriptor = "I"
   )
   public static int field4618;
   @OriginalMember(
      owner = "client!fda",
      name = "b",
      descriptor = "I"
   )
   public static int field4619;
   @OriginalMember(
      owner = "client!fda",
      name = "d",
      descriptor = "I"
   )
   public static int field4620;

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(Lkf;I)V"
   )
   public static final void method2496(class266 arg0, int arg1) {
      try {
         class660.field9616 = arg0.method2031(0, field4622[6]);
         ++field4618;
         int var2 = -53 / ((79 - arg1) / 33);
         class351.field4726 = arg0.method2031(0, field4622[5]);
         class709.field10357 = arg0.method2031(0, field4622[3]);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4622[4] + (arg0 != null ? field4622[1] : field4622[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(JILkf;IIBZI)V"
   )
   public static final void method2497(long arg0, int arg1, class266 arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7) {
      try {
         int var9 = -77 / ((arg5 - -30) / 36);
         class4.field38 = 1;
         ++field4619;
         class648.field9463 = 10000;
         class282.field3915 = arg7;
         class57.field705 = arg4;
         class265.field3656 = arg6;
         class80.field1029 = null;
         class175.field2409 = arg1;
         class672.field9747 = arg2;
         class746.field10945 = arg0;
         class397.field5738 = arg3;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field4622[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4622[1] : field4622[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method2498(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         if (arg2) {
            label144: {
               ++field4620;
               if (class650.field9497 > class650.field9501) {
                  class650.field9501 = (float)((double)class650.field9501 / 30.0D + (double)class650.field9501);
                  if (class650.field9497 < class650.field9501) {
                     class650.field9501 = class650.field9497;
                  }

                  class707.method5142(0);
                  class650.field9495 = (int)class650.field9501 >> 1;
                  class650.field9496 = class367.method2733(30565, class650.field9495);
                  if (!var3) {
                     break label144;
                  }
               }

               if (class650.field9497 < class650.field9501) {
                  class650.field9501 = (float)((double)class650.field9501 - (double)class650.field9501 / 30.0D);
                  if (class650.field9497 > class650.field9501) {
                     class650.field9501 = class650.field9497;
                  }

                  class707.method5142(0);
                  class650.field9495 = (int)class650.field9501 >> 1;
                  class650.field9496 = class367.method2733(30565, class650.field9495);
               }
            }

            if (~class478.field6866 != 0 && class74.field908 != -1) {
               int var4 = class478.field6866 - class220.field3138;
               if (var4 < 2 || var4 > 2) {
                  var4 /= 8;
               }

               int var5 = -class224.field3191 + class74.field908;
               class220.field3138 += var4;
               if (~var5 > -3 || var5 > 2) {
                  var5 /= 8;
               }

               class224.field3191 -= -var5;
               if (~var4 == -1 && var5 == 0) {
                  class478.field6866 = -1;
                  class74.field908 = -1;
               }

               class707.method5142(0);
            }

            label125: {
               if (~class592.field8717 < -1) {
                  --class697.field10218;
                  if (~class697.field10218 != -1) {
                     break label125;
                  }

                  class697.field10218 = 100;
                  --class592.field8717;
                  if (!var3) {
                     break label125;
                  }
               }

               class612.field8977 = -1;
               class504.field7317 = -1;
            }

            if (class538.field7680 && class792.field11613 != null) {
               class586 var6 = (class586)class792.field11613.method2933(2);
               if (var3 || var6 != null) {
                  do {
                     label114: {
                        class326 var7 = class650.field9488.method5666(var6.field8658.field4793, false);
                        if (var6.method4268(arg0, arg1, 18167)) {
                           if (var7.field4422 != null) {
                              if (var7.field4422[4] != null) {
                                 class655.method4799(var7.field4422[4], false, var7.field4423, false, (long)var6.field8658.field4793, 0, 122, var7.field4447, (long)var6.field8658.field4793, true, 1003, -1, -1);
                              }

                              if (var7.field4422[3] != null) {
                                 class655.method4799(var7.field4422[3], false, var7.field4423, false, (long)var6.field8658.field4793, 0, 47, var7.field4447, (long)var6.field8658.field4793, true, 1001, -1, -1);
                              }

                              if (var7.field4422[2] != null) {
                                 class655.method4799(var7.field4422[2], false, var7.field4423, false, (long)var6.field8658.field4793, 0, 45, var7.field4447, (long)var6.field8658.field4793, true, 1008, -1, -1);
                              }

                              if (var7.field4422[1] != null) {
                                 class655.method4799(var7.field4422[1], false, var7.field4423, false, (long)var6.field8658.field4793, 0, 119, var7.field4447, (long)var6.field8658.field4793, true, 1007, -1, -1);
                              }

                              if (var7.field4422[0] != null) {
                                 class655.method4799(var7.field4422[0], false, var7.field4423, false, (long)var6.field8658.field4793, 0, 30, var7.field4447, (long)var6.field8658.field4793, true, 1011, -1, -1);
                              }
                           }

                           if (!var6.field8658.field4799) {
                              var6.field8658.field4799 = true;
                              class200.method1584(class693.field10188, var6.field8658.field4793, var7.field4447);
                           }

                           if (!var6.field8658.field4799) {
                              break label114;
                           }

                           class200.method1584(class472.field6813, var6.field8658.field4793, var7.field4447);
                           if (!var3) {
                              break label114;
                           }
                        }

                        if (var6.field8658.field4799) {
                           var6.field8658.field4799 = false;
                           class200.method1584(class558.field8001, var6.field8658.field4793, var7.field4447);
                        }
                     }

                     var6 = (class586)class792.field11613.method2940(false);
                  } while(var6 != null);

               }
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4622[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2499(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2500(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
