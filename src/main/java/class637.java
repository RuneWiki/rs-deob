import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class637 {
   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9366 = new String[]{method4703(method4702("-D=\u0018:")), method4703(method4702("*G\u007f2")), method4703(method4702("?\u001c=po")), method4703(method4702("-D=\u001a:")), method4703(method4702("-D=\u001f:")), method4703(method4702("-D=\u001c:")), method4703(method4702("-D=\u001d:")), method4703(method4702("-D=\u001b:"))};
   @OriginalMember(
      owner = "client!iv",
      name = "h",
      descriptor = "Lse;"
   )
   public static class6 field9357 = new class6(35, 8);
   @OriginalMember(
      owner = "client!iv",
      name = "g",
      descriptor = "I"
   )
   public int field9356;
   @OriginalMember(
      owner = "client!iv",
      name = "f",
      descriptor = "I"
   )
   public static int field9358;
   @OriginalMember(
      owner = "client!iv",
      name = "i",
      descriptor = "I"
   )
   public int field9359;
   @OriginalMember(
      owner = "client!iv",
      name = "e",
      descriptor = "I"
   )
   public static int field9360;
   @OriginalMember(
      owner = "client!iv",
      name = "j",
      descriptor = "I"
   )
   public int field9361;
   @OriginalMember(
      owner = "client!iv",
      name = "c",
      descriptor = "I"
   )
   public static int field9362;
   @OriginalMember(
      owner = "client!iv",
      name = "d",
      descriptor = "I"
   )
   public static int field9363;
   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "I"
   )
   public static int field9365;
   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field9364;

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIIZ)Lww;"
   )
   public static final class339 method4696(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         if (arg2 != -30169) {
            method4698(-85, 60, true, -72, 16);
         }

         ++field9360;
         class347 var4 = null;
         if (class550.field8107 != null) {
            var4 = new class347(arg1, class550.field8107, class372.field5210[arg1], 1000000);
         }

         class87.field1193[arg1] = class476.field6638.method4534(arg1, var4, -117, class169.field2209);
         class87.field1193[arg1].method3775(-1);
         return new class339(class87.field1193[arg1], arg3, arg0);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9366[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4697(byte arg0) {
      try {
         class551.field8114.method3201((byte)-109);
         if (arg0 == 101) {
            ++field9365;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9366[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(IIZII)V"
   )
   public static final void method4698(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      boolean var5 = client.field1481;

      try {
         ++field9362;
         if (arg2 || class751.field10959 != arg3 || ~class703.field10273 != ~arg1 || class674.field9984 != class600.field8858 && class757.field11093.field10978.method2092(-18033) != 1) {
            class600.field8858 = class674.field9984;
            class703.field10273 = arg1;
            class751.field10959 = arg3;
            if (~class757.field11093.field10978.method2092(-18033) == -2) {
               class600.field8858 = 0;
            }

            class577.method4324((byte)-125, arg4);
            class120.method1058(true, -570417178, class629.field9294, class689.field10134, class606.field8915.method4490(class782.field11389, -16777216), class209.field2657);
            int var6 = class539.field7889;
            int var7 = class353.field4940;
            class539.field7889 = (-(class273.field3491 >> 4) + class751.field10959) * 8;
            class353.field4940 = (-(class211.field2689 >> 4) + class703.field10273) * 8;
            if (arg0 > -94) {
               method4700((byte)-26);
            }

            int var8;
            int var9;
            int var10000;
            label467: {
               class454.field6258 = class326.method2577(class751.field10959 * 8, class703.field10273 * 8);
               class795.field11625 = null;
               var8 = -var6 + class539.field7889;
               var9 = -var7 + class353.field4940;
               if (arg4 == 12) {
                  int var10 = 0;
                  if (var5 || var10 < class418.field5713) {
                     do {
                        class411 var11 = class332.field4584[var10];
                        if (var11 == null) {
                           ++var10;
                        } else {
                           class81 var12 = var11.field5654;
                           int var13 = 0;
                           if (var5) {
                              var12.field210[var13] -= var8;
                              var12.field205[var13] -= var9;
                              ++var13;
                           }

                           while(true) {
                              while(~var13 > -11) {
                                 var12.field210[var13] -= var8;
                                 var12.field205[var13] -= var9;
                                 ++var13;
                              }

                              var12.field10468 -= var9 * 512;
                              if (!var5) {
                                 var12.field10467 -= var8 * 512;
                                 ++var10;
                                 break;
                              }

                              var12.field205[var13] -= var9;
                              ++var13;
                           }
                        }
                     } while(var10 < class418.field5713);
                  }

                  if (!var5) {
                     break label467;
                  }
               }

               class737.field10798 = 0;
               boolean var14 = false;
               int var15 = (class273.field3491 - 1) * 512;
               int var16 = class211.field2689 * 512 + -512;
               int var17 = 0;
               if (var5 || ~class418.field5713 < ~var17) {
                  do {
                     class411 var18 = class332.field4584[var17];
                     if (var18 == null) {
                        ++var17;
                     } else {
                        class81 var19 = var18.field5654;
                        var19.field10467 -= var8 * 512;
                        var19.field10468 -= var9 * 512;
                        if (var19.field10467 >= 0 && ~var15 <= ~var19.field10467 && ~var19.field10468 <= -1 && ~var19.field10468 >= ~var16) {
                           label367: {
                              byte var20 = 1;
                              int var21 = 0;
                              if (var5) {
                                 var19.field210[var21] -= var8;
                                 var19.field205[var21] -= var9;
                                 var10000 = ~var19.field210[var21];
                              } else if (~var21 <= -11) {
                                 var10000 = var20;
                                 if (!var5) {
                                    break label367;
                                 }
                              } else {
                                 var19.field210[var21] -= var8;
                                 var19.field205[var21] -= var9;
                                 var10000 = ~var19.field210[var21];
                              }

                              while(true) {
                                 if (var10000 <= -1) {
                                    if (class273.field3491 > var19.field210[var21]) {
                                       if (var19.field205[var21] >= 0) {
                                          if (var19.field205[var21] >= class211.field2689) {
                                             var20 = 0;
                                             ++var21;
                                          } else {
                                             ++var21;
                                          }
                                       } else {
                                          var20 = 0;
                                          ++var21;
                                       }
                                    } else {
                                       var20 = 0;
                                       ++var21;
                                    }
                                 } else {
                                    var20 = 0;
                                    ++var21;
                                 }

                                 if (~var21 <= -11) {
                                    var10000 = var20;
                                    if (!var5) {
                                       break;
                                    }
                                 } else {
                                    var19.field210[var21] -= var8;
                                    var19.field205[var21] -= var9;
                                    var10000 = ~var19.field210[var21];
                                 }
                              }
                           }

                           if (var10000 != 0) {
                              class277.field3534[class737.field10798++] = var19.field145;
                              if (!var5) {
                                 ++var17;
                                 continue;
                              }
                           }

                           var19.method787(false, (class473)null);
                           var14 = true;
                           var18.method4924(-2970);
                           if (!var5) {
                              ++var17;
                              continue;
                           }
                        }

                        var19.method787(false, (class473)null);
                        var18.method4924(-2970);
                        var14 = true;
                        ++var17;
                     }
                  } while(~class418.field5713 < ~var17);
               }

               if (var14) {
                  class418.field5713 = class35.field493.method1810((byte)-114);
                  class35.field493.method1814(0, class332.field4584);
               }
            }

            int var22 = 0;
            if (var5 || var22 < 2048) {
               do {
                  class783 var23 = class59.field771[var22];
                  if (var23 == null) {
                     ++var22;
                  } else {
                     int var24 = 0;
                     if (var5) {
                        var23.field210[var24] -= var8;
                        var23.field205[var24] -= var9;
                        ++var24;
                     }

                     while(true) {
                        while(var24 < 10) {
                           var23.field210[var24] -= var8;
                           var23.field205[var24] -= var9;
                           ++var24;
                        }

                        var23.field10468 -= var9 * 512;
                        if (!var5) {
                           var23.field10467 -= var8 * 512;
                           ++var22;
                           break;
                        }

                        var23.field205[var24] -= var9;
                        ++var24;
                     }
                  }
               } while(var22 < 2048);
            }

            class337[] var25 = class570.field8383;
            int var26 = 0;
            class337 var27;
            if (var5) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field4610 -= var8 * 512;
                  var27.field4617 -= var9 * 512;
               }

               ++var26;
            }

            while(var25.length > var26) {
               var27 = var25[var26];
               if (var27 != null) {
                  var27.field4610 -= var8 * 512;
                  var27.field4617 -= var9 * 512;
               }

               ++var26;
            }

            class614 var28;
            label210: {
               var28 = (class614)class109.field1456.method288(0);
               if (var5) {
                  var28.field9035 -= var9;
                  var28.field9040 -= var8;
               } else if (var28 == null) {
                  var28 = (class614)class40.field546.method288(0);
                  if (!var5) {
                     break label210;
                  }
               } else {
                  var28.field9035 -= var9;
                  var28.field9040 -= var8;
               }

               while(true) {
                  if (class493.field6885 != 4) {
                     if (var28.field9040 >= 0) {
                        if (~var28.field9035 <= -1) {
                           if (~class273.field3491 < ~var28.field9040) {
                              if (~class211.field2689 >= ~var28.field9035) {
                                 var28.method4924(-2970);
                              }
                           } else {
                              var28.method4924(-2970);
                           }
                        } else {
                           var28.method4924(-2970);
                        }
                     } else {
                        var28.method4924(-2970);
                     }
                  }

                  var28 = (class614)class109.field1456.method290(17958);
                  if (var28 == null) {
                     var28 = (class614)class40.field546.method288(0);
                     if (!var5) {
                        break;
                     }
                  } else {
                     var28.field9035 -= var9;
                     var28.field9040 -= var8;
                  }
               }
            }

            if (var5) {
               var28.field9040 -= var8;
               var28.field9035 -= var9;
               if (~class493.field6885 != -5) {
                  if (~var28.field9040 <= -1) {
                     if (~var28.field9035 <= -1) {
                        if (~var28.field9040 > ~class273.field3491) {
                           if (~var28.field9035 <= ~class211.field2689) {
                              var28.method4924(-2970);
                           }
                        } else {
                           var28.method4924(-2970);
                        }
                     } else {
                        var28.method4924(-2970);
                     }
                  } else {
                     var28.method4924(-2970);
                  }
               }

               var28 = (class614)class40.field546.method290(17958);
            }

            while(true) {
               byte var10001;
               if (var28 == null) {
                  var10000 = ~class493.field6885;
                  var10001 = -5;
                  if (!var5) {
                     if (var10000 != -5) {
                        class206 var29 = (class206)class207.field2635.method1817(-38);
                        if (var5 || var29 != null) {
                           do {
                              int var30 = (int)(var29.field9965 & 16383L);
                              int var31 = var30 - class539.field7889;
                              int var32 = (int)(16383L & var29.field9965 >> 14);
                              int var33 = -class353.field4940 + var32;
                              if (~var31 > -1 || ~var33 > -1 || var31 >= class273.field3491 || ~var33 <= ~class211.field2689) {
                                 var29.method4924(-2970);
                              }

                              var29 = (class206)class207.field2635.method1812(353);
                           } while(var29 != null);
                        }
                     }

                     if (~class607.field8981 != -1) {
                        class607.field8981 -= var8;
                        class549.field8103 -= var9;
                     }

                     label454: {
                        class101.method908(0);
                        if (arg4 == 12) {
                           if (~class784.field11454 == -5) {
                              class274.field3506 -= var9 * 512;
                              class70.field942 -= var8 * 512;
                              class95.field1290 -= var9 * 512;
                              class2.field27 -= var8 * 512;
                              if (!var5) {
                                 break label454;
                              }
                           }

                           class574.field8442 = -1;
                           class81.field1137 = -1;
                           class784.field11454 = 1;
                           if (!var5) {
                              break label454;
                           }
                        }

                        class283.field3927 -= var8;
                        class565.field8322 -= var9;
                        class168.field2195 -= var9 * 512;
                        class175.field2264 -= var9;
                        class160.field2051 -= var8 * 512;
                        class567.field8342 -= var8;
                        if (Math.abs(var8) > class273.field3491 || Math.abs(var9) > class211.field2689) {
                           class274.method2167(-1662);
                        }
                     }

                     class626.method4627((byte)93);
                     class598.method4450(true);
                     class194.field2464.method289(true);
                     class696.field10201.method289(true);
                     class94.field1271.method4631((byte)-124);
                     class173.method1486(71);
                     return;
                  }
               } else {
                  var28.field9040 -= var8;
                  var28.field9035 -= var9;
                  var10000 = ~class493.field6885;
                  var10001 = -5;
               }

               if (var10000 != var10001) {
                  if (~var28.field9040 <= -1) {
                     if (~var28.field9035 <= -1) {
                        if (~var28.field9040 > ~class273.field3491) {
                           if (~var28.field9035 <= ~class211.field2689) {
                              var28.method4924(-2970);
                           }
                        } else {
                           var28.method4924(-2970);
                        }
                     } else {
                        var28.method4924(-2970);
                     }
                  } else {
                     var28.method4924(-2970);
                  }
               }

               var28 = (class614)class40.field546.method290(17958);
            }
         }
      } catch (RuntimeException var35) {
         throw class93.method866(var35, field9366[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(Lgea;BI)V"
   )
   private final void method4699(class66 arg0, byte arg1, int arg2) {
      try {
         if (arg2 == 1) {
            this.field9361 = arg0.method603(-2);
            this.field9359 = arg0.method640(255);
            this.field9356 = arg0.method640(255);
         }

         if (arg1 != 87) {
            field9357 = null;
         }

         ++field9363;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9366[3] + (arg0 != null ? field9366[2] : field9366[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4700(byte arg0) {
      try {
         field9357 = null;
         if (arg0 != 126) {
            method4697((byte)37);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9366[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method4701(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != 0) {
            method4697((byte)68);
         }

         while(true) {
            int var4 = arg1.method640(255);
            if (var4 != 0) {
               this.method4699(arg1, (byte)87, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field9358;
            break;
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9366[5] + arg0 + ',' + (arg1 != null ? field9366[2] : field9366[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4703(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
