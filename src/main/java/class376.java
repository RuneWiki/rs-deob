import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class376 {
   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5248 = new String[]{method2970(method2969(">\u000f`?`")), method2970(method2969(">\u000f`7`")), method2970(method2969(":\u0015\"\u0017")), method2970(method2969("/N`U5")), method2970(method2969(">\u000f`8`")), method2970(method2969(">\u000f`0`"))};
   @OriginalMember(
      owner = "client!jo",
      name = "c",
      descriptor = "I"
   )
   public static int field5243 = 0;
   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "I"
   )
   public static int field5244;
   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "I"
   )
   public static int field5245;
   @OriginalMember(
      owner = "client!jo",
      name = "e",
      descriptor = "I"
   )
   public static int field5246;
   @OriginalMember(
      owner = "client!jo",
      name = "d",
      descriptor = "I"
   )
   public static int field5247;

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method2965(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5245;
         int var4 = arg3 / arg2;
         int var5 = arg3 & arg2 + -1;
         int var6 = arg1 / arg2;
         int var7 = arg2 + -1 & arg1;
         int var8 = class438.method3384(var6, var4, arg0);
         int var9 = class438.method3384(var6, var4 - -1, arg0);
         int var10 = class438.method3384(var6 + 1, var4, arg0);
         int var11 = class438.method3384(var6 + 1, var4 + 1, 1);
         int var12 = class198.method1644(arg2, 2616, var8, var9, var5);
         int var13 = class198.method1644(arg2, 2616, var10, var11, var5);
         return class198.method1644(arg2, 2616, var12, var13, var7);
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field5248[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1560(int arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "([IIIIII[I[IBII[[[B[I[IIZZB)V"
   )
   public static final void method2966(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, byte arg8, int arg9, int arg10, byte[][][] arg11, int[] arg12, int[] arg13, int arg14, boolean arg15, boolean arg16, byte arg17) {
      boolean var18 = client.field1481;

      try {
         ++field5246;
         if (~class175.field2258 != 0) {
            int[] var19 = class497.field6954.method419();
            int var20 = var19[0];
            int var21 = var19[1];
            int var22 = var19[2];
            int var23 = var19[3];
            if (arg17 == -54) {
               int var24 = var22;
               int var25 = var23;
               if (~class175.field2258 == -2) {
                  var25 = (int)((double)class429.field5829 * (double)var23 / (double)class345.field4735);
                  var24 = (int)((double)class429.field5829 * (double)var22 / (double)class345.field4735);
               }

               if (!class323.field4420) {
                  label408: {
                     if (~class175.field2258 == -2) {
                        class740.method5375(arg17 + 54);
                     }

                     int var26 = -class420.field5740 + arg10;
                     int var27 = -class81.field1134 + arg4;
                     int var28 = arg2 - class250.field3161;
                     int var29 = (int)(((double)var28 * class504.field7031 + (double)var26 * class32.field481 + (double)var27 * class782.field11392) * (double)var24 / (double)arg3);
                     int var30 = (int)(((double)var28 * class21.field331 + (double)var26 * class372.field5203 + (double)var27 * class598.field8837) * (double)var25 / (double)arg3);
                     double var31 = (double)var28 * class93.field1262 + (double)var26 * class407.field5624 + (double)var27 * class486.field6785;
                     int var33 = class136.field1722 + var29 + -class59.field774;
                     int var34 = class113.field1509 - (-var30 - -class567.field8347);
                     int var35 = class197.field2522 + var33;
                     int var36 = class429.field5829 + var34;
                     if (~var33 <= -1 && var34 >= 0 && var35 <= class713.field10470 && var36 <= class345.field4735 || ~class175.field2258 == -3) {
                        class453.field6250 = var33;
                        if (~class175.field2258 == -3) {
                           class577.field8552 = -var31;
                        }

                        class409.field5641 = var34;
                        if (!var18) {
                           break label408;
                        }
                     }

                     if (~var35 < -1 && var36 > 0 && ~var33 > ~class713.field10470 && class345.field4735 > var34) {
                        int var39;
                        int var40;
                        int var41;
                        int var42;
                        double var43;
                        label332: {
                           int var37 = -class136.field1722 + var33;
                           int var38 = -class113.field1509 + var34;
                           var39 = 0;
                           var40 = 0;
                           var41 = 0;
                           var42 = 0;
                           var43 = 0.0D;
                           if (class175.field2258 != 0) {
                              if (~class175.field2258 != -2) {
                                 break label332;
                              }

                              var42 = var38 / class139.field1759;
                              var41 = var37 / class390.field5409;
                              var39 = class390.field5409 * var41;
                              var40 = class139.field1759 * var42;
                              var43 = (class577.field8552 + var31) * (double)(var37 * var39 + var38 * var40) / (double)(var37 * var37 + var38 * var38);
                              if (!var18) {
                                 break label332;
                              }
                           }

                           var43 = class577.field8552 + var31;
                           var40 = var38;
                           var39 = var37;
                        }

                        double var45;
                        int var47;
                        int var48;
                        int var49;
                        int var50;
                        int var51;
                        int var52;
                        int var53;
                        int var54;
                        int var55;
                        int var56;
                        label325: {
                           var45 = -var43;
                           var47 = 0;
                           var48 = 0;
                           var49 = 0;
                           var50 = 0;
                           var51 = 0;
                           var52 = 0;
                           if (~var39 > -1) {
                              var53 = class713.field10470 - -var39;
                              var54 = 0;
                              var55 = -var39;
                              var56 = var55;
                              if (class175.field2258 != 1) {
                                 break label325;
                              }

                              var49 = 0;
                              var51 = -var41;
                              if (!var18) {
                                 break label325;
                              }
                           }

                           var55 = 0;
                           var53 = class713.field10470 - var39;
                           var56 = var39;
                           var54 = var53;
                           if (~class175.field2258 == -2) {
                              var51 = var41;
                              var49 = -var41 + class32.field475;
                           }
                        }

                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        int var62;
                        label365: {
                           if (~var40 <= -1) {
                              var57 = -var40 + class345.field4735;
                              var58 = 0;
                              var59 = var40;
                              if (class175.field2258 == 1) {
                                 var47 = -var42 + class674.field9985;
                                 var50 = 0;
                                 var48 = var42;
                                 var52 = var47;
                              }

                              var60 = 0;
                              var61 = var57;
                              var62 = var57;
                              if (!var18) {
                                 break label365;
                              }
                           }

                           var58 = -var40;
                           var62 = 0;
                           var57 = class345.field4735 + var40;
                           var59 = var58;
                           if (~class175.field2258 == -2) {
                              var48 = -var42;
                              var47 = 0;
                              var50 = var48;
                              var52 = class674.field9985 + var42;
                           }

                           var61 = var57;
                           var60 = var58;
                        }

                        class627 var63 = class194.field2462.field543;
                        class328 var64 = (class328)var63.method4639(-109);
                        if (var18 || var64 != null) {
                           do {
                              class687[] var65 = var64.field4538;
                              boolean var66 = true;
                              int var67 = 0;
                              if (var18 || var67 < var65.length) {
                                 do {
                                    class687 var68 = var65[var67];
                                    int var69 = var68.field10119;
                                    int var70 = var68.field10120;
                                    int var71 = var68.field10115;
                                    int var72 = var68.field10118;
                                    int var73;
                                    var68.field10118 = var73 = -var40 + var72;
                                    int var74;
                                    var68.field10119 = var74 = var69 - var39;
                                    int var75;
                                    var68.field10120 = var75 = -var40 + var70;
                                    int var76 = var68.field10116;
                                    int var77;
                                    var68.field10115 = var77 = -var39 + var71;
                                    if (var66) {
                                       int var78 = -var76 + (~var77 >= ~var74 ? var77 : var74);
                                       if (var78 <= class713.field10470) {
                                          int var79 = (var73 <= var75 ? var73 : var75) - var76;
                                          if (class345.field4735 >= var79) {
                                             int var80 = var76 + (~var77 >= ~var74 ? var74 : var77);
                                             if (~var80 <= -1) {
                                                int var81 = (~var73 >= ~var75 ? var75 : var73) + var76;
                                                if (var81 >= 0) {
                                                   var66 = false;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    ++var67;
                                 } while(var67 < var65.length);
                              }

                              if (var66) {
                                 var64.method797((byte)76);
                                 class697.method5077((byte)1, var64);
                              }

                              var64 = (class328)var63.method4636((byte)80);
                           } while(var64 != null);
                        }

                        if (~class175.field2258 == -1) {
                           class497.field6954.method510(class308.field4310);
                        }

                        label291: {
                           class497.field6954.method410(-var39, -var40);
                           class497.field6954.method431(var55, var58, var53, var57, var45);
                           class81.method786(class577.field8552 + var45, 0);
                           class355.field4954 = class577.field8552 + var45;
                           if (~class175.field2258 != -2) {
                              class345.field4733 = var24;
                              class467.field6419 = var25;
                              class582.field8599 = class136.field1722 + var20 - (class59.field774 - -var39);
                              class490.field6847 = -class567.field8347 + var21 + -var40 + class113.field1509;
                              class497.field6954.method504(class582.field8599, class490.field6847, class345.field4733, class467.field6419);
                              if (!var18) {
                                 break label291;
                              }
                           }

                           class582.field8599 = var20 - class59.field774 + -var39;
                           class345.field4733 = var24;
                           class467.field6419 = var25;
                           class490.field6847 = -class567.field8347 + -var40 + var21;
                           class497.field6954.method504(class582.field8599, class490.field6847, class345.field4733, class467.field6419);
                        }

                        class183.method1539(class194.field2462);
                        if (~var59 < -1) {
                           class497.field6954.method460(0, var62, class713.field10470, var59 + var62);
                           class497.field6954.method502();
                           class497.field6954.method426(class364.field5052);
                           class686.method5023(arg9, arg10, arg4, arg2, arg11, arg7, arg0, arg12, arg13, arg6, arg1, arg8, arg14, arg5, arg15, arg16, arg3, 1, false);
                        }

                        if (var56 > 0) {
                           class497.field6954.method460(var54, var60, var54 + var56, var60 + var61);
                           class497.field6954.method502();
                           class497.field6954.method426(class364.field5052);
                           class686.method5023(arg9, arg10, arg4, arg2, arg11, arg7, arg0, arg12, arg13, arg6, arg1, arg8, arg14, arg5, arg15, arg16, arg3, 1, false);
                        }

                        class497.field6954.method443();
                        class7.method53();
                        if (class175.field2258 == 0) {
                           class497.field6954.method507();
                        }

                        class59.field774 += var39;
                        class577.field8552 += var45;
                        class567.field8347 += var40;
                        class453.field6250 = class136.field1722 - class59.field774 + var29;
                        class409.field5641 = -class567.field8347 + class113.field1509 + var30;
                        if (class175.field2258 != 1) {
                           break label408;
                        }

                        class728.field10621 += var42;
                        class470.field6471 += var41;
                        int var82 = 0;
                        if (var18 || var82 < class674.field9985) {
                           do {
                              int var83 = class684.method4985(arg17 ^ -73, class674.field9985, class728.field10621 + var82) * class32.field475;
                              int var84 = 0;
                              if (var18 || ~var84 > ~class32.field475) {
                                 do {
                                    int var85 = var83 + class684.method4985(arg17 + 175, class32.field475, class470.field6471 + var84);
                                    boolean var86 = ~var47 >= ~var82 && ~(var47 + var48) < ~var82 ? true : (var82 >= var50 ? (~var82 > ~(var50 + var52) ? (var49 <= var84 ? ~var84 > ~(var49 - -var51) : false) : false) : false);
                                    class543.field7934[var85].method1072(class390.field5409 * var84, class139.field1759 * var82, class390.field5409, class139.field1759, 0, 0, var86, true);
                                    ++var84;
                                 } while(~var84 > ~class32.field475);
                              }

                              ++var82;
                           } while(var82 < class674.field9985);
                        }

                        if (!var18) {
                           break label408;
                        }
                     }

                     class323.field4420 = true;
                  }
               }

               if (class323.field4420) {
                  class250.field3161 = arg2;
                  class567.field8347 = 0;
                  class420.field5740 = arg10;
                  class409.field5641 = class113.field1509;
                  class81.field1134 = arg4;
                  class59.field774 = 0;
                  class453.field6250 = class136.field1722;
                  class577.field8552 = 0.0D;
                  if (~class175.field2258 == -1) {
                     class497.field6954.method510(class308.field4310);
                  }

                  label238: {
                     class497.field6954.method443();
                     class497.field6954.method502();
                     class497.field6954.method426(class364.field5052);
                     class657.field9802.method869(class420.field5740, class81.field1134, class250.field3161, class171.field2227, class781.field11385, class353.field4942);
                     class497.field6954.method397(class657.field9802);
                     if (~class175.field2258 == -2) {
                        class582.field8599 = var20;
                        class490.field6847 = var21;
                        class467.field6419 = var25;
                        class345.field4733 = var24;
                        class497.field6954.method504(class582.field8599, class490.field6847, class345.field4733, class467.field6419);
                        if (!var18) {
                           break label238;
                        }
                     }

                     class490.field6847 = class113.field1509 + var21;
                     class582.field8599 = class136.field1722 + var20;
                     class345.field4733 = var24;
                     class467.field6419 = var25;
                     class497.field6954.method504(class582.field8599, class490.field6847, class345.field4733, class467.field6419);
                  }

                  class355.field4954 = 0.0D;
                  class194.field2462.method297(0);
                  class183.method1539(class194.field2462);
                  class686.method5023(arg9, arg10, arg4, arg2, arg11, arg7, arg0, arg12, arg13, arg6, arg1, arg8, arg14, arg5, arg15, arg16, arg3, 1, false);
                  class7.method53();
                  class323.field4420 = false;
                  if (~class175.field2258 == -1) {
                     class497.field6954.method507();
                  }

                  if (~class175.field2258 == -2) {
                     class558.method4205(-86);
                  }
               }

               if (class175.field2258 == 0) {
                  class308.field4310.method1071(class453.field6250, class409.field5641, class197.field2522, class429.field5829, 0, 0, true, true);
               }

               label406: {
                  ++class631.field9309;
                  class81.method786(class577.field8552, 0);
                  class708.field10404 = class577.field8552;
                  if (class175.field2258 == 0 || class175.field2258 == 2) {
                     if (class175.field2258 == 2) {
                        class497.field6954.method426(class364.field5052);
                        class497.field6954.method502();
                     }

                     class408.field5630 = var24;
                     class385.field5331 = class113.field1509 + var21 - class567.field8347 + -class409.field5641;
                     class778.field11339 = var25;
                     class430.field5849 = var20 - (-class136.field1722 + class59.field774 - -class453.field6250);
                     class497.field6954.method504(class430.field5849, class385.field5331, class408.field5630, class778.field11339);
                     if (!var18) {
                        break label406;
                     }
                  }

                  if (class175.field2258 == 1) {
                     class778.field11339 = var25;
                     class408.field5630 = var24;
                     class385.field5331 = -class567.field8347 + var21;
                     class430.field5849 = var20 - class59.field774;
                     class497.field6954.method504(class430.field5849, class385.field5331, class408.field5630, class778.field11339);
                     class497.field6954.method460(class453.field6250, class409.field5641, class453.field6250 + class197.field2522, class429.field5829 + class409.field5641);
                  }
               }

               class686.method5023(arg9, arg10, arg4, arg2, arg11, arg7, arg0, arg12, arg13, arg6, arg1, arg8, arg14, arg5, arg15, arg16, arg3, class175.field2258 != 2 ? 2 : 0, class175.field2258 == 1);
               class497.field6954.method443();
               class497.field6954.method504(var20, var21, var22, var23);
            }
         }
      } catch (RuntimeException var88) {
         throw class93.method866(var88, field5248[4] + (arg0 != null ? field5248[3] : field5248[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5248[3] : field5248[2]) + ',' + (arg7 != null ? field5248[3] : field5248[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field5248[3] : field5248[2]) + ',' + (arg12 != null ? field5248[3] : field5248[2]) + ',' + (arg13 != null ? field5248[3] : field5248[2]) + ',' + arg14 + ',' + arg15 + ',' + arg16 + ',' + arg17 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "e",
      descriptor = "(I)Lwi;"
   )
   public abstract class505 method1563(int arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method2967(int arg0) {
      try {
         ++field5247;
         if (arg0 != 0) {
            this.method1569((byte)104);
         }

         return this.method1558(78) || this.method1569((byte)19) || this.method1559(false);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5248[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(CI)I"
   )
   public static final int method2968(char arg0, int arg1) {
      try {
         ++field5244;
         return ~arg0 <= arg1 && arg0 < class392.field5429.length ? class392.field5429[arg0] : -1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5248[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "(Z)Z"
   )
   public abstract boolean method1559(boolean arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "f",
      descriptor = "(I)Z"
   )
   public abstract boolean method1558(int arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method1569(byte arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "b",
      descriptor = "(I)I"
   )
   public abstract int method1566(int arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method1565(boolean arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method1570(int arg0);

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2969(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2970(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
