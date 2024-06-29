import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class135 {
   @OriginalMember(
      owner = "client!gm",
      name = "c",
      descriptor = "Loi;"
   )
   private class80 field1726 = new class80(64);
   @OriginalMember(
      owner = "client!gm",
      name = "f",
      descriptor = "Lkf;"
   )
   private class266 field1722;
   @OriginalMember(
      owner = "client!gm",
      name = "e",
      descriptor = "I"
   )
   public int field1727;
   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1728 = new String[]{method1073(method1072("\u0015sifF")), method1073(method1072("\u0015simF")), method1073(method1072("\t0i\u0000\u0013")), method1073(method1072("\u001ck+B")), method1073(method1072("\u0015si\u0012\u0007\u001cw3\u0010F")), method1073(method1072("\u0015sijF")), method1073(method1072("\u0015sihF")), method1073(method1072("\u0015sioF")), method1073(method1072("\u0015siiF")), method1073(method1072("\u0015silF")), method1073(method1072("\u0015sikF"))};
   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1725 = new int[5];
   @OriginalMember(
      owner = "client!gm",
      name = "k",
      descriptor = "I"
   )
   public static int field1717;
   @OriginalMember(
      owner = "client!gm",
      name = "h",
      descriptor = "I"
   )
   public static int field1718;
   @OriginalMember(
      owner = "client!gm",
      name = "i",
      descriptor = "I"
   )
   public static int field1719;
   @OriginalMember(
      owner = "client!gm",
      name = "d",
      descriptor = "I"
   )
   public static int field1720;
   @OriginalMember(
      owner = "client!gm",
      name = "j",
      descriptor = "I"
   )
   public static int field1721;
   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "I"
   )
   public static int field1723;
   @OriginalMember(
      owner = "client!gm",
      name = "g",
      descriptor = "I"
   )
   public static int field1724;

   @OriginalMember(
      owner = "client!gm",
      name = "c",
      descriptor = "(B)V",
      line = 3
   )
   public static void method1064(byte arg0) {
      try {
         field1725 = null;
         if (arg0 <= 123) {
            method1065((byte)52);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1728[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(B)Lwn;",
      line = 13
   )
   public static final class755 method1065(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1718;
         class755 var2 = (class755)class308.field4242.method3488((byte)-116);
         if (var2 != null) {
            var2.method3165(115);
            var2.method693((byte)-92);
            return var2;
         } else if (arg0 != -53) {
            return null;
         } else {
            label33:
            while(true) {
               class755 var3 = (class755)class635.field9281.method3488((byte)-122);
               if (var3 == null) {
                  return null;
               }

               class755 var10000 = var3;

               do {
                  if (~var10000.method5484(-1310) < ~class133.method1054(-29025)) {
                     return null;
                  }

                  var3.method3165(116);
                  var3.method693((byte)-94);
                  if (~(var3.field947 & Long.MIN_VALUE) == -1L) {
                     continue label33;
                  }

                  var10000 = var3;
               } while(var1);

               return var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1728[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(II[B)I",
      line = 53
   )
   public static final int method1066(int arg0, int arg1, byte[] arg2) {
      try {
         if (arg1 != 0) {
            field1725 = null;
         }

         ++field1717;
         return class514.method3739(arg2, arg0, 0, -67);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1728[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1728[2] : field1728[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(BI)V",
      line = 71
   )
   public final void method1067(byte arg0, int arg1) {
      try {
         ++field1723;
         if (arg0 == -27) {
            class80 var3 = this.field1726;
            synchronized(this.field1726) {
               this.field1726.method726(arg1, 25324);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1728[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(I)V",
      line = 84
   )
   public final void method1068(int arg0) {
      try {
         ++field1724;
         class80 var2 = this.field1726;
         synchronized(this.field1726) {
            this.field1726.method731(0);
         }

         if (arg0 != -1) {
            this.method1070((byte)60);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1728[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(II)Lpea;",
      line = 100
   )
   public final class757 method1069(int arg0, int arg1) {
      try {
         ++field1719;
         class80 var3 = this.field1726;
         class757 var4;
         synchronized(this.field1726) {
            var4 = (class757)this.field1726.method725(0, (long)arg0);
            if (arg1 != 9786) {
               this.field1726 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field1722;
            byte[] var6;
            synchronized(this.field1722) {
               var6 = this.field1722.method2037(false, arg0, 47);
            }

            class757 var7 = new class757();
            if (var6 != null) {
               var7.method5499(-1, new class147(var6));
            }

            class80 var8 = this.field1726;
            synchronized(this.field1726) {
               this.field1726.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1728[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "(B)V",
      line = 131
   )
   public final void method1070(byte arg0) {
      try {
         if (arg0 != -28) {
            method1071(87, false, 24, 1, (class517[][][])null, (byte)-83);
         }

         class80 var2 = this.field1726;
         synchronized(this.field1726) {
            this.field1726.method715(true);
         }

         ++field1721;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1728[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(IZII[[[Lkp;B)Z",
      line = 146
   )
   public static final boolean method1071(int arg0, boolean arg1, int arg2, int arg3, class517[][][] arg4, byte arg5) {
      boolean var6 = client.field4360;

      try {
         ++field1720;
         byte var7 = arg1 ? 1 : (byte)(class154.field2197 & 255);
         if (class706.field10315[class561.field8019][arg2][arg0] == var7) {
            return false;
         } else if ((4 & class613.field9016[class561.field8019][arg2][arg0]) == 0) {
            return false;
         } else {
            byte var8 = 0;
            class515.field7445[var8] = arg2;
            int var9 = 0;
            int var38 = var8 + 1;
            class350.field4712[var8] = arg0;
            class706.field10315[class561.field8019][arg2][arg0] = var7;
            if (arg5 != 11) {
               return false;
            } else {
               while(true) {
                  label467:
                  while(var38 != var9) {
                     int var10 = class515.field7445[var9] & 65535;
                     int var11 = (class515.field7445[var9] & 16749003) >> 16;
                     int var12 = 255 & class515.field7445[var9] >> 24;
                     int var13 = 65535 & class350.field4712[var9];
                     int var14 = (16762983 & class350.field4712[var9]) >> 16;
                     var9 = var9 + 1 & 4095;
                     boolean var15 = false;
                     int var10000 = ~(class613.field9016[class561.field8019][var10][var13] & 4);
                     byte var40 = -1;

                     do {
                        if (var10000 == var40) {
                           var15 = true;
                        }

                        boolean var16 = false;
                        if (arg4 != null) {
                           int var17 = class561.field8019 + 1;
                           if (var6 || var17 <= 3) {
                              do {
                                 if (arg4[var17] != null && (class613.field9016[var17][var10][var13] & 8) == 0) {
                                    label500: {
                                       class517 var28;
                                       class772 var29;
                                       class627 var30;
                                       int var31;
                                       int var32;
                                       class517 var39;
                                       if (var15) {
                                          var39 = arg4[var17][var10][var13];
                                       } else {
                                          var28 = arg4[var17][var10][var13];
                                          var39 = var28;
                                          if (!var6) {
                                             if (var28 != null && var28.field7468 != null) {
                                                var29 = var28.field7468;
                                                if (var6 || var29 != null) {
                                                   do {
                                                      var30 = var29.field11352;
                                                      if (var30.field9211 == var30.field9207 && ~var30.field9212 == ~var30.field9208) {
                                                         var29 = var29.field11354;
                                                      } else {
                                                         var31 = var30.field9207;
                                                         if (!var6 && ~var30.field9211 > ~var31) {
                                                            var29 = var29.field11354;
                                                         } else {
                                                            do {
                                                               var32 = var30.field9208;
                                                               if (var6) {
                                                                  class706.field10315[var17][var31][var32] = var7;
                                                                  ++var32;
                                                               }

                                                               while(true) {
                                                                  while(~var32 >= ~var30.field9212) {
                                                                     class706.field10315[var17][var31][var32] = var7;
                                                                     ++var32;
                                                                  }

                                                                  if (!var6) {
                                                                     ++var31;
                                                                     break;
                                                                  }

                                                                  ++var32;
                                                               }
                                                            } while(~var30.field9211 <= ~var31);

                                                            var29 = var29.field11354;
                                                         }
                                                      }
                                                   } while(var29 != null);
                                                }
                                             }

                                             class706.field10315[var17][var10][var13] = var7;
                                             var16 = true;
                                             break label500;
                                          }
                                       }

                                       label444:
                                       while(true) {
                                          if (var39 != null) {
                                             if (arg4[var17][var10][var13].field7476 != null) {
                                                int var18 = class113.method919(var11, (byte)19);
                                                if (~arg4[var17][var10][var13].field7476.field10144 == ~var18 || arg4[var17][var10][var13].field7469 != null && arg4[var17][var10][var13].field7469.field10144 == var18 && !var6) {
                                                   break;
                                                }

                                                if (~var12 != -1) {
                                                   int var19 = class113.method919(var12, (byte)-105);
                                                   if (arg4[var17][var10][var13].field7476.field10144 == var19 || arg4[var17][var10][var13].field7469 != null && ~arg4[var17][var10][var13].field7469.field10144 == ~var19 && !var6) {
                                                      break;
                                                   }
                                                }

                                                if (var14 != 0) {
                                                   int var20 = class113.method919(var14, (byte)-83);
                                                   if (~arg4[var17][var10][var13].field7476.field10144 == ~var20 || arg4[var17][var10][var13].field7469 != null && arg4[var17][var10][var13].field7469.field10144 == var20 && !var6) {
                                                      break;
                                                   }
                                                }
                                             }

                                             class517 var21 = arg4[var17][var10][var13];
                                             if (var21.field7468 != null) {
                                                class772 var22 = var21.field7468;
                                                class627 var23;
                                                class604 var24;
                                                int var25;
                                                int var26;
                                                int var27;
                                                if (var6) {
                                                   var23 = var22.field11352;
                                                   if (var23 instanceof class604) {
                                                      var24 = (class604)var23;
                                                      var25 = var24.method237(-127);
                                                      if (~var25 == -22) {
                                                         var25 = 19;
                                                      }

                                                      var26 = var24.method252((byte)6);
                                                      var27 = var26 << 6 | var25;
                                                      if (~var11 == ~var27 || var12 != 0 && ~var12 == ~var27 || ~var14 != -1 && var14 == var27 && !var6) {
                                                         break;
                                                      }
                                                   }

                                                   var22 = var22.field11354;
                                                }

                                                while(var22 != null) {
                                                   var23 = var22.field11352;
                                                   if (var23 instanceof class604) {
                                                      var24 = (class604)var23;
                                                      var25 = var24.method237(-127);
                                                      if (~var25 == -22) {
                                                         var25 = 19;
                                                      }

                                                      var26 = var24.method252((byte)6);
                                                      var27 = var26 << 6 | var25;
                                                      if (~var11 == ~var27 || var12 != 0 && ~var12 == ~var27 || ~var14 != -1 && var14 == var27 && !var6) {
                                                         break label444;
                                                      }
                                                   }

                                                   var22 = var22.field11354;
                                                }
                                             }
                                          }

                                          var28 = arg4[var17][var10][var13];
                                          var39 = var28;
                                          if (!var6) {
                                             if (var28 != null && var28.field7468 != null) {
                                                var29 = var28.field7468;
                                                if (var6 || var29 != null) {
                                                   do {
                                                      var30 = var29.field11352;
                                                      if (var30.field9211 == var30.field9207 && ~var30.field9212 == ~var30.field9208) {
                                                         var29 = var29.field11354;
                                                      } else {
                                                         var31 = var30.field9207;
                                                         if (!var6 && ~var30.field9211 > ~var31) {
                                                            var29 = var29.field11354;
                                                         } else {
                                                            do {
                                                               var32 = var30.field9208;
                                                               if (var6) {
                                                                  class706.field10315[var17][var31][var32] = var7;
                                                                  ++var32;
                                                               }

                                                               while(true) {
                                                                  while(~var32 >= ~var30.field9212) {
                                                                     class706.field10315[var17][var31][var32] = var7;
                                                                     ++var32;
                                                                  }

                                                                  if (!var6) {
                                                                     ++var31;
                                                                     break;
                                                                  }

                                                                  ++var32;
                                                               }
                                                            } while(~var30.field9211 <= ~var31);

                                                            var29 = var29.field11354;
                                                         }
                                                      }
                                                   } while(var29 != null);
                                                }
                                             }

                                             class706.field10315[var17][var10][var13] = var7;
                                             var16 = true;
                                             break;
                                          }
                                       }
                                    }
                                 }

                                 ++var17;
                              } while(var17 <= 3);
                           }
                        }

                        if (var16) {
                           label503: {
                              int var33 = class731.field10698[class561.field8019 + 1].method2219(true, var10, var13);
                              if (class115.field1427[arg3] < var33) {
                                 class115.field1427[arg3] = var33;
                              }

                              label461: {
                                 int var34 = var10 << 9;
                                 if (class18.field206[arg3] > var34) {
                                    class18.field206[arg3] = var34;
                                    if (!var6) {
                                       break label461;
                                    }
                                 }

                                 if (~var34 < ~class457.field6526[arg3]) {
                                    class457.field6526[arg3] = var34;
                                 }
                              }

                              int var35 = var13 << 9;
                              if (~class336.field4576[arg3] < ~var35) {
                                 class336.field4576[arg3] = var35;
                                 if (!var6) {
                                    break label503;
                                 }
                              }

                              if (~var35 < ~class441.field6283[arg3]) {
                                 class441.field6283[arg3] = var35;
                              }
                           }
                        }

                        if (var15) {
                           continue label467;
                        }

                        var10000 = var10;
                        var40 = 1;
                     } while(var6);

                     if (var10 >= 1 && ~class706.field10315[class561.field8019][var10 - 1][var13] != ~var7) {
                        class515.field7445[var38] = class300.method2238(class300.method2238(1179648, var10 - 1), -754974720);
                        class350.field4712[var38] = class300.method2238(var13, 1245184);
                        var38 = var38 + 1 & 4095;
                        class706.field10315[class561.field8019][var10 + -1][var13] = var7;
                     }

                     ++var13;
                     if (var13 < class337.field4594) {
                        if (~(var10 - 1) <= -1 && ~class706.field10315[class561.field8019][var10 - 1][var13] != ~var7 && ~(class613.field9016[class561.field8019][var10][var13] & 4) == -1 && ~(4 & class613.field9016[class561.field8019][var10 - 1][var13 - 1]) == -1) {
                           class515.field7445[var38] = class300.method2238(class300.method2238(var10 + -1, 1179648), 1375731712);
                           class350.field4712[var38] = class300.method2238(1245184, var13);
                           class706.field10315[class561.field8019][var10 + -1][var13] = var7;
                           var38 = 4095 & var38 + 1;
                        }

                        if (class706.field10315[class561.field8019][var10][var13] != var7) {
                           class515.field7445[var38] = class300.method2238(318767104, class300.method2238(5373952, var10));
                           class350.field4712[var38] = class300.method2238(var13, 5439488);
                           var38 = var38 + 1 & 4095;
                           class706.field10315[class561.field8019][var10][var13] = var7;
                        }

                        if (~(var10 - -1) > ~class644.field9403 && class706.field10315[class561.field8019][var10 - -1][var13] != var7 && ~(4 & class613.field9016[class561.field8019][var10][var13]) == -1 && ~(class613.field9016[class561.field8019][var10 + 1][var13 + -1] & 4) == -1) {
                           class515.field7445[var38] = class300.method2238(class300.method2238(5373952, var10 - -1), -1845493760);
                           class350.field4712[var38] = class300.method2238(5439488, var13);
                           class706.field10315[class561.field8019][var10 + 1][var13] = var7;
                           var38 = var38 + 1 & 4095;
                        }
                     }

                     --var13;
                     if (~(var10 + 1) > ~class644.field9403 && class706.field10315[class561.field8019][var10 + 1][var13] != var7) {
                        class515.field7445[var38] = class300.method2238(class300.method2238(var10 - -1, 9568256), 1392508928);
                        class350.field4712[var38] = class300.method2238(9633792, var13);
                        class706.field10315[class561.field8019][var10 + 1][var13] = var7;
                        var38 = 4095 & var38 + 1;
                     }

                     --var13;
                     if (~var13 <= -1) {
                        if (~(var10 - 1) <= -1 && ~class706.field10315[class561.field8019][var10 + -1][var13] != ~var7 && ~(4 & class613.field9016[class561.field8019][var10][var13]) == -1 && (4 & class613.field9016[class561.field8019][var10 + -1][var13 + 1]) == 0) {
                           class515.field7445[var38] = class300.method2238(301989888, class300.method2238(var10 - 1, 13762560));
                           class350.field4712[var38] = class300.method2238(var13, 13828096);
                           var38 = var38 + 1 & 4095;
                           class706.field10315[class561.field8019][var10 + -1][var13] = var7;
                        }

                        if (class706.field10315[class561.field8019][var10][var13] != var7) {
                           class515.field7445[var38] = class300.method2238(-1828716544, class300.method2238(var10, 13762560));
                           class350.field4712[var38] = class300.method2238(var13, 13828096);
                           var38 = var38 + 1 & 4095;
                           class706.field10315[class561.field8019][var10][var13] = var7;
                        }

                        if (~(var10 - -1) > ~class644.field9403 && ~class706.field10315[class561.field8019][var10 + 1][var13] != ~var7 && ~(4 & class613.field9016[class561.field8019][var10][var13]) == -1 && ~(4 & class613.field9016[class561.field8019][var10 - -1][var13 - -1]) == -1) {
                           class515.field7445[var38] = class300.method2238(-771751936, class300.method2238(var10 + 1, 9568256));
                           class350.field4712[var38] = class300.method2238(9633792, var13);
                           class706.field10315[class561.field8019][var10 + 1][var13] = var7;
                           var38 = 4095 & var38 - -1;
                        }
                     }
                  }

                  if (class115.field1427[arg3] != -1000000) {
                     class115.field1427[arg3] += 40;
                     class18.field206[arg3] -= 512;
                     class457.field6526[arg3] += 512;
                     class441.field6283[arg3] += 512;
                     class336.field4576[arg3] -= 512;
                  }

                  return true;
               }
            }
         }
      } catch (RuntimeException var37) {
         throw class237.method1823(var37, field1728[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1728[2] : field1728[3]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 476
   )
   public class135(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field1722 = arg2;
         if (this.field1722 != null) {
            this.field1727 = this.field1722.method2060(2, 47);
         } else {
            this.field1727 = 0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1728[4] + (arg0 != null ? field1728[2] : field1728[3]) + ',' + arg1 + ',' + (arg2 != null ? field1728[2] : field1728[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1073(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
