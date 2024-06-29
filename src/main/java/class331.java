import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class331 {
   @OriginalMember(
      owner = "client!fr",
      name = "h",
      descriptor = "Lsia;"
   )
   private class407 field4563 = new class407(64);
   @OriginalMember(
      owner = "client!fr",
      name = "j",
      descriptor = "Lww;"
   )
   private class339 field4564;
   @OriginalMember(
      owner = "client!fr",
      name = "k",
      descriptor = "Lhj;"
   )
   public class170 field4571;
   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4573 = new String[]{method2629(method2628("Uq\u007fIs")), method2629(method2628("]v=`")), method2629(method2628("H-\u007f\"&")), method2629(method2628("Uq\u007f02]j%2s")), method2629(method2628("Uq\u007fNs")), method2629(method2628("Cj0")), method2629(method2628("Uq\u007fKs")), method2629(method2628("Uq\u007fOs")), method2629(method2628("Uq\u007fJs")), method2629(method2628("Uq\u007fHs"))};
   @OriginalMember(
      owner = "client!fr",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field4565 = new class418(134, 8);
   @OriginalMember(
      owner = "client!fr",
      name = "c",
      descriptor = "I"
   )
   public static int field4568 = -1;
   @OriginalMember(
      owner = "client!fr",
      name = "l",
      descriptor = "I"
   )
   public static int field4570 = 0;
   @OriginalMember(
      owner = "client!fr",
      name = "i",
      descriptor = "I"
   )
   public static int field4561;
   @OriginalMember(
      owner = "client!fr",
      name = "e",
      descriptor = "I"
   )
   public static int field4562;
   @OriginalMember(
      owner = "client!fr",
      name = "f",
      descriptor = "I"
   )
   public static int field4566;
   @OriginalMember(
      owner = "client!fr",
      name = "g",
      descriptor = "I"
   )
   public static int field4567;
   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "I"
   )
   public static int field4569;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4572;

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2620(int arg0, byte arg1) {
      try {
         ++field4569;
         if (arg1 <= -81) {
            class407 var3 = this.field4563;
            synchronized(this.field4563) {
               this.field4563.method3197(5, arg0);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4573[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2621(byte arg0) {
      try {
         if (arg0 == 96) {
            field4565 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4573[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method2622(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1481;

      try {
         class258 var6 = (class258)class52.field710.method288(0);
         if (var5) {
            class120.method1062(arg0, (byte)-6, arg1, arg2, arg4, var6);
            var6 = (class258)class52.field710.method290(17958);
         }

         while(true) {
            while(var6 != null) {
               class120.method1062(arg0, (byte)-6, arg1, arg2, arg4, var6);
               var6 = (class258)class52.field710.method290(17958);
            }

            ++field4567;
            class258 var7 = (class258)class320.field4398.method288(0);
            if (!var5) {
               class258 var13;
               label206: {
                  int var8;
                  if (var5) {
                     var8 = 1;
                  } else if (var7 == null) {
                     var8 = 97 % ((13 - arg3) / 43);
                     var13 = (class258)class328.field4539.method1817(-127);
                     if (!var5) {
                        break label206;
                     }
                  } else {
                     var8 = 1;
                  }

                  while(true) {
                     class516 var9 = var7.field3289.method71(-12710);
                     if (var7.field3289.field125 != -1) {
                        if (var7.field3289.field154) {
                           var8 = 0;
                        } else {
                           label306: {
                              if (~var7.field3289.field125 == ~var9.field7208 || var7.field3289.field125 == var9.field7225 || ~var7.field3289.field125 == ~var9.field7238 || ~var7.field3289.field125 == ~var9.field7184) {
                                 var8 = 2;
                                 if (!var5) {
                                    break label306;
                                 }
                              }

                              if (~var7.field3289.field125 != ~var9.field7197) {
                                 if (var7.field3289.field125 != var9.field7226) {
                                    if (~var7.field3289.field125 != ~var9.field7231) {
                                       if (~var7.field3289.field125 == ~var9.field7224) {
                                          var8 = 3;
                                          if (var5) {
                                             var8 = 0;
                                          }
                                       }
                                    } else {
                                       var8 = 3;
                                       if (var5) {
                                          var8 = 0;
                                       }
                                    }
                                 } else {
                                    var8 = 3;
                                    if (var5) {
                                       var8 = 0;
                                    }
                                 }
                              } else {
                                 var8 = 3;
                                 if (var5) {
                                    var8 = 0;
                                 }
                              }
                           }
                        }
                     } else {
                        var8 = 0;
                     }

                     if (~var7.field3258 != ~var8) {
                        int var10 = class650.method4776(var7.field3289, -62);
                        class473 var11 = var7.field3289.field1135;
                        if (var11.field6583 != null) {
                           var11 = var11.method3603(class175.field2266, 4764);
                        }

                        if (var11 != null) {
                           if (var10 != -1) {
                              if (var7.field3286 == var10 && !var7.field3269 == !var11.field6519) {
                                 var7.field3274 = var11.field6533;
                                 var7.field3258 = var8;
                                 if (var5) {
                                    var7.field3258 = var8;
                                    var7.field3269 = false;
                                    var7.field3286 = -1;
                                 }
                              } else {
                                 boolean var12 = false;
                                 if (var7.field3280 != null) {
                                    var7.field3274 -= 512;
                                    if (var7.field3274 <= 0) {
                                       class674.field9978.method2844(var7.field3280);
                                       var7.field3280 = null;
                                       var12 = true;
                                       if (var5) {
                                          var12 = true;
                                       }
                                    }
                                 } else {
                                    var12 = true;
                                 }

                                 if (var12) {
                                    var7.field3255 = null;
                                    var7.field3258 = var8;
                                    var7.field3290 = null;
                                    var7.field3269 = var11.field6519;
                                    var7.field3274 = var11.field6533;
                                    var7.field3286 = var10;
                                    if (var5) {
                                       var7.field3274 = var11.field6533;
                                       var7.field3258 = var8;
                                       if (var5) {
                                          var7.field3258 = var8;
                                          var7.field3269 = false;
                                          var7.field3286 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var7.field3258 = var8;
                              var7.field3269 = false;
                              var7.field3286 = -1;
                           }
                        } else {
                           var7.field3258 = var8;
                           var7.field3269 = false;
                           var7.field3286 = -1;
                        }
                     }

                     var7.field3266 = var7.field3289.field10467;
                     var7.field3264 = var7.field3289.field10467 - -(var7.field3289.method78(0) << 8);
                     var7.field3261 = var7.field3289.field10468;
                     var7.field3271 = var7.field3289.field10468 - -(var7.field3289.method78(0) << 8);
                     class120.method1062(arg0, (byte)-6, arg1, arg2, arg4, var7);
                     var7 = (class258)class320.field4398.method290(17958);
                     if (var7 == null) {
                        var8 = 97 % ((13 - arg3) / 43);
                        var13 = (class258)class328.field4539.method1817(-127);
                        if (!var5) {
                           break;
                        }
                     } else {
                        var8 = 1;
                     }
                  }
               }

               if (!var5 && var13 == null) {
                  return;
               }

               do {
                  byte var14;
                  label303: {
                     var14 = 1;
                     class516 var15 = var13.field3282.method71(-12710);
                     if (var13.field3282.field125 == -1 || var13.field3282.field154) {
                        var14 = 0;
                        if (!var5) {
                           break label303;
                        }
                     }

                     if (~var13.field3282.field125 != ~var15.field7208 && var13.field3282.field125 != var15.field7225 && var13.field3282.field125 != var15.field7238 && var13.field3282.field125 != var15.field7184) {
                        if (~var13.field3282.field125 != ~var15.field7197 && var13.field3282.field125 != var15.field7226 && var13.field3282.field125 != var15.field7231 && ~var13.field3282.field125 != ~var15.field7224) {
                           break label303;
                        }

                        var14 = 3;
                        if (!var5) {
                           break label303;
                        }
                     }

                     var14 = 2;
                  }

                  if (~var13.field3258 != ~var14) {
                     label307: {
                        int var16 = class383.method3035(127, var13.field3282);
                        if (var13.field3286 != var16 || !var13.field3282.field11404 != !var13.field3269) {
                           boolean var17;
                           label243: {
                              var17 = false;
                              if (var13.field3280 == null) {
                                 var17 = true;
                                 if (!var5) {
                                    break label243;
                                 }
                              }

                              var13.field3274 -= 512;
                              if (~var13.field3274 >= -1) {
                                 class674.field9978.method2844(var13.field3280);
                                 var13.field3280 = null;
                                 var17 = true;
                              }
                           }

                           if (!var17) {
                              break label307;
                           }

                           var13.field3258 = var14;
                           var13.field3255 = null;
                           var13.field3286 = var16;
                           var13.field3274 = var13.field3282.field11448;
                           var13.field3290 = null;
                           var13.field3269 = var13.field3282.field11404;
                           if (!var5) {
                              break label307;
                           }
                        }

                        var13.field3274 = var13.field3282.field11448;
                        var13.field3258 = var14;
                     }
                  }

                  var13.field3266 = var13.field3282.field10467;
                  var13.field3264 = var13.field3282.field10467 - -(var13.field3282.method78(0) << 8);
                  var13.field3261 = var13.field3282.field10468;
                  var13.field3271 = var13.field3282.field10468 + (var13.field3282.method78(0) << 8);
                  class120.method1062(arg0, (byte)-6, arg1, arg2, arg4, var13);
                  var13 = (class258)class328.field4539.method1812(353);
               } while(var13 != null);

               return;
            }

            var6 = (class258)class52.field710.method290(17958);
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field4573[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(II)Log;"
   )
   public final class516 method2623(int arg0, int arg1) {
      try {
         ++field4561;
         class407 var3 = this.field4563;
         class516 var4;
         synchronized(this.field4563) {
            var4 = (class516)this.field4563.method3192((long)arg0, (byte)-128);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field4564;
            byte[] var6;
            synchronized(this.field4564) {
               if (arg1 != 512) {
                  this.field4564 = null;
               }

               var6 = this.field4564.method2697(arg0, 32, false);
            }

            class516 var7 = new class516();
            var7.field7204 = this;
            if (var6 != null) {
               var7.method3883(new class66(var6), (byte)76);
            }

            class407 var8 = this.field4563;
            synchronized(this.field4563) {
               this.field4563.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field4573[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2624(int arg0) {
      try {
         class407 var2 = this.field4563;
         synchronized(this.field4563) {
            if (arg0 != 1) {
               return;
            }

            this.field4563.method3187(-23825);
         }

         ++field4566;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4573[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2625(int arg0) {
      try {
         class407 var2 = this.field4563;
         synchronized(this.field4563) {
            if (arg0 != 512) {
               this.method2624(-81);
            }

            this.field4563.method3201((byte)104);
         }

         ++field4562;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4573[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2626() {
      for(int var0 = 0; var0 < class77.field1023; ++var0) {
         if (!class436.field5952[var0]) {
            class664 var1 = class375.field5241[var0];
            class243 var2 = var1.field9839;
            int var3 = var1.field9836;
            int var4 = var2.method1933(false) - class486.field6788;
            int var5 = (var4 * 2 >> class783.field11447) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method1927((byte)-8) - var4 >> class783.field11447;
            int var9 = var2.method1928(45) - var4 >> class783.field11447;
            int var10 = var2.method1928(-74) + var4 >> class783.field11447;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class181.field2297) {
               var10 = class181.field2297 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field9849[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class137.field1743) {
                  var16 = class137.field1743 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class680 var19 = class338.method2672(var3, var17, var11, field4572 != null ? field4572 : (field4572 = method2627(field4573[5])));
                  if (var19 != null && var19.field10012 != 0) {
                     if (var19.field10012 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field9849[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field9849[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field9849[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field9849[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class436.field5952[var0] = true;
            class659.field9815[var3].method955(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!fr",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lhj;)V"
   )
   public class331(class500 arg0, int arg1, class339 arg2, class170 arg3) {
      try {
         this.field4564 = arg2;
         this.field4564.method2691(32, 13);
         this.field4571 = arg3;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4573[3] + (arg0 != null ? field4573[2] : field4573[1]) + ',' + arg1 + ',' + (arg2 != null ? field4573[2] : field4573[1]) + ',' + (arg3 != null ? field4573[2] : field4573[1]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!fr",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2627(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2628(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2629(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
