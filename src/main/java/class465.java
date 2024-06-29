import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class465 {
   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6805 = new String[]{method3493(method3492("\u00153^4d")), method3493(method3492("\u00153^9d")), method3493(method3492("\u00153^0d")), method3493(method3492("\u00153^3d")), method3493(method3492("\u0019(\u001c\u001d")), method3493(method3492("\fs^_1")), method3493(method3492("#nP\\l")), method3493(method3492("\u00153^5d")), method3493(method3492("\u00153^6d")), method3493(method3492("\u00153^2d")), method3493(method3492("\u00153^7d"))};
   @OriginalMember(
      owner = "client!bn",
      name = "i",
      descriptor = "I"
   )
   public static int field6795;
   @OriginalMember(
      owner = "client!bn",
      name = "f",
      descriptor = "I"
   )
   public static int field6796;
   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "I"
   )
   private int field6797;
   @OriginalMember(
      owner = "client!bn",
      name = "c",
      descriptor = "I"
   )
   public static int field6798;
   @OriginalMember(
      owner = "client!bn",
      name = "h",
      descriptor = "I"
   )
   public static int field6799;
   @OriginalMember(
      owner = "client!bn",
      name = "g",
      descriptor = "I"
   )
   public int field6800;
   @OriginalMember(
      owner = "client!bn",
      name = "j",
      descriptor = "I"
   )
   public static int field6801;
   @OriginalMember(
      owner = "client!bn",
      name = "e",
      descriptor = "I"
   )
   public static int field6803;
   @OriginalMember(
      owner = "client!bn",
      name = "d",
      descriptor = "I"
   )
   public static int field6804;
   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "Lhw;"
   )
   public static class141 field6802;

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public static final void method3484(class65 arg0, boolean arg1) {
      try {
         ++field6795;
         if (class639.field9311 != class304.field4398.field4090) {
            if (class90.field1473 != null) {
               if (!arg1) {
                  if (class98.method942(arg0, 11, class304.field4398.field4090)) {
                     class639.field9311 = class304.field4398.field4090;
                  }
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6805[9] + (arg0 != null ? field6805[5] : field6805[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method3485(boolean arg0) {
      try {
         if (arg0) {
            this.method3488(-55, true);
         }

         ++field6803;
         this.field6800 &= 16383;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6805[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3486(int arg0, int arg1, byte arg2) {
      try {
         ++field6796;
         if (arg2 != 78) {
            return true;
         } else {
            return class440.method3313(arg0, 53, arg1) | (arg1 & 458752) != 0 || class417.method3182(arg1, true, arg0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6805[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method3487(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field6801;
         int var6 = this.field6797;
         if (this.field6800 == arg2 && this.field6797 == 0) {
            return false;
         } else {
            if (arg3 != 2) {
               this.field6800 = -29;
            }

            boolean var7;
            label166: {
               if (~this.field6797 == -1) {
                  if (this.field6800 < arg2 && arg2 <= this.field6800 + arg1 || ~this.field6800 < ~arg2 && ~arg2 <= ~(-arg1 + this.field6800)) {
                     this.field6800 = arg2;
                     return false;
                  }

                  var7 = true;
                  if (!var5) {
                     break label166;
                  }
               }

               if (~this.field6797 < -1 && this.field6800 < arg2) {
                  int var8 = this.field6797 * this.field6797 / (arg1 * 2);
                  int var9 = this.field6800 - -var8;
                  if (var9 < arg2 && ~this.field6800 >= ~var9) {
                     var7 = true;
                     if (!var5) {
                        break label166;
                     }
                  }

                  var7 = false;
                  if (!var5) {
                     break label166;
                  }
               }

               if (this.field6797 >= 0 || arg2 >= this.field6800) {
                  var7 = false;
                  if (!var5) {
                     break label166;
                  }
               }

               int var10 = this.field6797 * this.field6797 / (arg1 * 2);
               int var11 = this.field6800 - var10;
               if (~var11 >= ~arg2 || this.field6800 < var11) {
                  var7 = false;
                  if (!var5) {
                     break label166;
                  }
               }

               var7 = true;
            }

            label161: {
               if (!var7) {
                  if (this.field6797 <= 0) {
                     this.field6797 += arg1;
                     if (~this.field6797 >= -1) {
                        break label161;
                     }

                     this.field6797 = 0;
                     if (!var5) {
                        break label161;
                     }
                  }

                  this.field6797 -= arg1;
                  if (~this.field6797 <= -1) {
                     break label161;
                  }

                  this.field6797 = 0;
                  if (!var5) {
                     break label161;
                  }
               }

               label101: {
                  if (~this.field6800 <= ~arg2) {
                     this.field6797 -= arg1;
                     if (arg0 == 0 || ~(-arg0) >= ~this.field6797) {
                        break label101;
                     }

                     this.field6797 = -arg0;
                     if (!var5) {
                        break label101;
                     }
                  }

                  this.field6797 += arg1;
                  if (~arg0 != -1 && ~arg0 > ~this.field6797) {
                     this.field6797 = arg0;
                  }
               }

               if (~this.field6797 != ~var6) {
                  label92: {
                     int var12 = this.field6797 * this.field6797 / (arg1 * 2);
                     if (~this.field6800 <= ~arg2) {
                        if (arg2 >= this.field6800 || ~arg2 >= ~(this.field6800 - var12)) {
                           break label92;
                        }

                        this.field6797 = var6;
                        if (!var5) {
                           break label92;
                        }
                     }

                     if (this.field6800 + var12 > arg2) {
                        this.field6797 = var6;
                     }
                  }
               }
            }

            this.field6800 += this.field6797 + var6 >> 1;
            return var7;
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field6805[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method3488(int arg0, boolean arg1) {
      try {
         this.field6797 = 0;
         if (arg1) {
            this.field6800 = arg0;
            ++field6799;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6805[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3489(boolean arg0) {
      try {
         if (!arg0) {
            method3484((class65)null, true);
         }

         field6802 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6805[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3490(byte arg0) {
      try {
         ++field6798;
         int var2 = 67 % ((65 - arg0) / 49);
         return 16383 & this.field6800;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6805[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(Leb;I)V"
   )
   public static final void method3491(class650 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field6804;
         int var10000;
         if (class383.field5660 == arg0) {
            int var3 = class346.field4923.method3524(255);
            int var4 = (7 & var3) + class617.field8965;
            int var5 = class753.field10887 + var4;
            int var6 = (var3 >> 4 & 7) + class186.field2819;
            int var7 = var6 - -class347.field4939;
            int var8 = class346.field4923.method3525(arg1 + 970693884);
            class490 var9 = (class490)class669.field9742.method1572((long)(var5 << 14 | class399.field5866 << 28 | var7), -16289);
            if (var9 != null) {
               label415: {
                  class756 var10 = (class756)var9.field7146.method2579(arg1 ^ 970694619);
                  if (var2) {
                     var10000 = ~(var8 & 32767);
                  } else if (var10 == null) {
                     var10000 = var9.field7146.method2574(-124);
                     if (!var2) {
                        break label415;
                     }
                  } else {
                     var10000 = ~(var8 & 32767);
                  }

                  label414:
                  do {
                     while(true) {
                        if (var10000 == ~var10.field10977) {
                           var10.method154(89);
                           if (!var2) {
                              var10000 = var9.field7146.method2574(-124);
                              break;
                           }

                           var10 = (class756)var9.field7146.method2583(1);
                        } else {
                           var10 = (class756)var9.field7146.method2583(1);
                        }

                        if (var10 == null) {
                           var10000 = var9.field7146.method2574(-124);
                           if (!var2) {
                              break label414;
                           }
                        } else {
                           var10000 = ~(var8 & 32767);
                        }
                     }
                  } while(var2);
               }

               if (var10000 != 0) {
                  var9.method154(-118);
               }

               if (var6 >= 0 && ~var4 <= -1 && ~var6 > ~class209.field3112 && class1.field3 > var4) {
                  class212.method1806(var4, var6, class399.field5866, arg1 + 970694006);
               }
            }

         } else if (class21.field341 == arg0) {
            int var11 = class346.field4923.method3564((byte)-88);
            int var12 = class186.field2819 - -(7 & var11 >> 4);
            int var13 = (var11 & 7) + class617.field8965;
            int var14 = class346.field4923.method3565(true);
            if (var14 == 65535) {
               var14 = -1;
            }

            int var15 = class346.field4923.method3564((byte)-74);
            int var16 = (var15 & 253) >> 4;
            int var17 = 7 & var15;
            int var18 = class346.field4923.method3564((byte)-84);
            int var19 = class346.field4923.method3564((byte)-116);
            int var20 = class346.field4923.method3565(true);
            if (var12 >= 0 && ~var13 <= -1 && ~var12 > ~class209.field3112 && ~class1.field3 < ~var13) {
               int var21 = var16 + 1;
               if (class304.field4398.field11313[0] >= -var21 + var12 && var12 + var21 >= class304.field4398.field11313[0] && class304.field4398.field11322[0] >= var13 - var21 && ~(var13 - -var21) <= ~class304.field4398.field11322[0]) {
                  class594.method4386(var14, var18, var17, var20, true, (class399.field5866 << 24) + (var12 << 16) + (var13 << 8) + var16, var19);
               }
            }

         } else if (class490.field7147 == arg0) {
            int var22 = class346.field4923.method3564((byte)-55);
            int var23 = class186.field2819 - -((122 & var22) >> 4);
            int var24 = class617.field8965 - -(var22 & 7);
            int var25 = class346.field4923.method3565(true);
            int var26 = class346.field4923.method3564((byte)-91);
            int var27 = class346.field4923.method3565(true);
            int var28 = class346.field4923.method3564((byte)-79);
            if (~var23 <= -1 && var24 >= 0 && ~class209.field3112 < ~var23 && ~class1.field3 < ~var24) {
               int var29 = var23 * 512 + 256;
               int var30 = var24 * 512 - -256;
               int var31 = class399.field5866;
               if (~var31 > -4 && class561.method4189(var23, -32018, var24)) {
                  ++var31;
               }

               class210 var32 = new class210(var25, var27, class29.field458, class399.field5866, var31, var29, -var26 + class663.method4851(var30, var29, class399.field5866, arg1 + 970694000), var30, var23, var23, var24, var24, var28);
               class558.field8132.method2585(new class730(var32), -111);
            }

         } else if (class582.field8419 == arg0) {
            int var34;
            int var35;
            boolean var37;
            int var39;
            int var40;
            int var41;
            int var42;
            int var43;
            int var44;
            int var45;
            label423: {
               int var33 = class346.field4923.method3564((byte)-122);
               var34 = ((var33 & 248) >> 4) + class186.field2819 * 2;
               var35 = (var33 & 15) + class617.field8965 * 2;
               int var36 = class346.field4923.method3564((byte)-53);
               var37 = (1 & var36) != 0;
               boolean var38 = ~(var36 & 2) != -1;
               var39 = !var38 ? -1 : var36 >> 2;
               var40 = class346.field4923.method3543(-1132613840) + var34;
               var41 = var35 - -class346.field4923.method3543(-1132613840);
               var42 = class346.field4923.method3538(-128);
               var43 = class346.field4923.method3538(-128);
               var44 = class346.field4923.method3565(true);
               var45 = class346.field4923.method3564((byte)-53);
               if (!var38) {
                  var45 *= 4;
                  if (!var2) {
                     break label423;
                  }
               }

               var45 = (byte)var45;
            }

            int var46 = class346.field4923.method3564((byte)-57) * 4;
            int var47 = class346.field4923.method3565(true);
            int var48 = class346.field4923.method3565(true);
            int var49 = class346.field4923.method3564((byte)-93);
            int var50 = class346.field4923.method3565(true);
            if (~var49 == -256) {
               var49 = -1;
            }

            if (~var34 <= -1 && var35 >= 0 && ~var34 > ~(class209.field3112 * 2) && class209.field3112 * 2 > var35 && ~var40 <= -1 && var41 >= 0 && var40 < class1.field3 * 2 && ~(class1.field3 * 2) < ~var41 && ~var44 != -65536) {
               int var51 = var34 * 256;
               int var52 = var40 * 256;
               int var53 = var35 * 256;
               int var54 = var50 << 2;
               int var55 = var45 << 2;
               int var56 = var46 << 2;
               int var57 = var41 * 256;
               if (var42 != 0 && ~var39 != 0) {
                  class771 var58 = null;
                  if (var42 >= 0) {
                     int var59 = var42 + -1;
                     class272 var60 = (class272)class78.field1344.method1572((long)var59, arg1 + 970677595);
                     if (var60 != null) {
                        var58 = var60.field3851;
                     }
                  } else {
                     int var61 = -var42 + -1;
                     if (class20.field324 == var61) {
                        var58 = class304.field4398;
                     } else {
                        var58 = class458.field6723[var61];
                     }
                  }

                  if (var58 != null) {
                     class654 var62 = var58.method5574(31482);
                     if (var62.field9532 != null && var62.field9532[var39] != null) {
                        var55 -= var62.field9532[var39][1];
                     }

                     if (var62.field9510 != null && var62.field9510[var39] != null) {
                        var55 -= var62.field9510[var39][1];
                     }
                  }
               }

               class488 var63 = new class488(var44, class399.field5866, class399.field5866, var51, var53, var55, var47 - -class29.field458, class29.field458 + var48, var49, var54, var42, var43, var56, var37, var39);
               var63.method3693(var52, -var56 + class663.method4851(var57, var52, class399.field5866, 124), class29.field458 + var47, var57, 0);
               class358.field5361.method2585(new class41(var63), 55);
            }

         } else if (class152.field2434 == arg0) {
            class346.field4923.method3564((byte)-73);
            int var64 = class346.field4923.method3564((byte)-86);
            int var65 = ((114 & var64) >> 4) + class186.field2819;
            int var66 = (var64 & 7) + class617.field8965;
            int var67 = class346.field4923.method3565(true);
            int var68 = class346.field4923.method3564((byte)-127);
            int var69 = class346.field4923.method3577(-2);
            String var70 = class346.field4923.method3566(-16496688);
            class258.method2075(class399.field5866, -256, var69, var68, var66, var65, var67, var70);
         } else if (class315.field4535 == arg0) {
            int var71 = class346.field4923.method3545(-101);
            int var72 = class346.field4923.method3564((byte)-62);
            int var73 = var72 >> 2;
            int var74 = class713.field10346[var73];
            int var75 = class346.field4923.method3572((byte)-127);
            int var76 = class186.field2819 - -((124 & var75) >> 4);
            int var77 = class617.field8965 - -(var75 & 7);
            int var78 = class346.field4923.method3588(65280);
            if (var73 == 11) {
               var73 = 10;
            }

            class670 var79 = class634.field9256.method2559(var78, 0);
            int var80 = 0;
            if (var79.field9839 != null) {
               label490: {
                  int var81 = -1;
                  int var82 = 0;
                  if (var2) {
                     var10000 = var79.field9839[var82];
                  } else if (~var79.field9839.length >= ~var82) {
                     var10000 = var79.field9803[var81].length;
                     if (!var2) {
                        break label490;
                     }
                  } else {
                     var10000 = var79.field9839[var82];
                  }

                  label489:
                  do {
                     while(true) {
                        if (var10000 == var73) {
                           var81 = var82;
                           if (!var2) {
                              var10000 = var79.field9803[var82].length;
                              break;
                           }

                           ++var82;
                        } else {
                           ++var82;
                        }

                        if (~var79.field9839.length >= ~var82) {
                           var10000 = var79.field9803[var81].length;
                           if (!var2) {
                              break label489;
                           }
                        } else {
                           var10000 = var79.field9839[var82];
                        }
                     }
                  } while(var2);
               }

               var80 = var10000;
            }

            int var83 = 0;
            if (var79.field9787 != null) {
               var83 = var79.field9787.length;
            }

            int var84 = 0;
            if (var79.field9764 != null) {
               var84 = var79.field9764.length;
            }

            if ((1 & var71) == 1) {
               class780.method5640((class152)null, var76, 13779, var74, class399.field5866, var77);
            } else {
               int[] var85 = null;
               if ((2 & var71) == 2) {
                  var85 = new int[var80];
                  int var86 = 0;
                  if (var2 || var86 < var80) {
                     do {
                        var85[var86] = class346.field4923.method3565(true);
                        ++var86;
                     } while(var86 < var80);
                  }
               }

               short[] var87 = null;
               if ((4 & var71) == 4) {
                  var87 = new short[var83];
                  int var88 = 0;
                  if (var2 || ~var88 > ~var83) {
                     do {
                        var87[var88] = (short)class346.field4923.method3565(true);
                        ++var88;
                     } while(~var88 > ~var83);
                  }
               }

               short[] var89 = null;
               if (~(var71 & 8) == -9) {
                  var89 = new short[var84];
                  int var90 = 0;
                  if (var2 || var84 > var90) {
                     do {
                        var89[var90] = (short)class346.field4923.method3565(true);
                        ++var90;
                     } while(var84 > var90);
                  }
               }

               class780.method5640(new class152((long)(class381.field5642++), var85, var87, var89), var76, 13779, var74, class399.field5866, var77);
            }
         } else if (class657.field9586 == arg0) {
            int var91 = class346.field4923.method3545(78);
            int var92 = (7 & var91 >> 4) + class186.field2819;
            int var93 = (7 & var91) + class617.field8965;
            int var94 = class346.field4923.method3524(arg1 ^ -970693637);
            int var95 = var94 >> 2;
            int var96 = var94 & 3;
            int var97 = class713.field10346[var95];
            int var98 = class346.field4923.method3539(-67);
            if (class373.method2915(class124.field2049, 25700) || ~var92 <= -1 && ~var93 <= -1 && class209.field3112 > var92 && ~class1.field3 < ~var93) {
               class573.method4247(var95, var98, (byte)-60, class399.field5866, var96, var93, var97, var92);
            }

         } else if (class554.field8034 == arg0) {
            int var99 = class346.field4923.method3564((byte)-105);
            int var100 = class617.field8965 - -(var99 & 7);
            int var101 = class753.field10887 + var100;
            int var102 = ((var99 & 114) >> 4) + class186.field2819;
            int var103 = class347.field4939 + var102;
            int var104 = class346.field4923.method3565(true);
            int var105 = class346.field4923.method3565(true);
            int var106 = class346.field4923.method3565(true);
            if (class669.field9742 != null) {
               class490 var107 = (class490)class669.field9742.method1572((long)(var103 | var101 << 14 | class399.field5866 << 28), -16289);
               if (var107 != null) {
                  int var10001;
                  label540: {
                     class756 var108 = (class756)var107.field7146.method2579(-801);
                     if (var2) {
                        var10000 = 32767 & var104;
                        var10001 = var108.field10977;
                     } else if (var108 == null) {
                        var10000 = ~var102;
                        var10001 = -1;
                        if (!var2) {
                           break label540;
                        }
                     } else {
                        var10000 = 32767 & var104;
                        var10001 = var108.field10977;
                     }

                     label539:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              if (var108.field10973 == var105) {
                                 var108.method154(100);
                                 var108.field10973 = var106;
                                 class670.method4908(var108, class399.field5866, var103, 8192, var101);
                                 if (!var2) {
                                    var10000 = ~var102;
                                    var10001 = -1;
                                    break;
                                 }

                                 var108 = (class756)var107.field7146.method2583(1);
                              } else {
                                 var108 = (class756)var107.field7146.method2583(1);
                              }
                           } else {
                              var108 = (class756)var107.field7146.method2583(1);
                           }

                           if (var108 == null) {
                              var10000 = ~var102;
                              var10001 = -1;
                              if (!var2) {
                                 break label539;
                              }
                           } else {
                              var10000 = 32767 & var104;
                              var10001 = var108.field10977;
                           }
                        }
                     } while(var2);
                  }

                  if (var10000 <= var10001 && var100 >= 0 && var102 < class209.field3112 && class1.field3 > var100) {
                     class212.method1806(var100, var102, class399.field5866, 122);
                  }
               }
            }

         } else if (class282.field3946 == arg0) {
            int var109 = class346.field4923.method3564((byte)-123);
            int var110 = class186.field2819 - -((var109 & 123) >> 4);
            int var111 = class617.field8965 - -(var109 & 7);
            int var112 = class346.field4923.method3565(true);
            if (~var112 == -65536) {
               var112 = -1;
            }

            int var113 = class346.field4923.method3564((byte)-68);
            int var114 = (246 & var113) >> 4;
            int var115 = var113 & 7;
            int var116 = class346.field4923.method3564((byte)-41);
            int var117 = class346.field4923.method3564((byte)-84);
            int var118 = class346.field4923.method3565(true);
            if (~var110 <= -1 && var111 >= 0 && ~var110 > ~class209.field3112 && ~class1.field3 < ~var111) {
               int var119 = var114 + 1;
               if (class304.field4398.field11313[0] >= var110 - var119 && class304.field4398.field11313[0] <= var110 - -var119 && ~class304.field4398.field11322[0] <= ~(-var119 + var111) && ~class304.field4398.field11322[0] >= ~(var111 - -var119)) {
                  class401.method3085(false, var117, var115, var116, true, var118, (class399.field5866 << 24) + var114 + (var110 << 16) + (var111 << 8), var112);
               }
            }

         } else if (class524.field7668 == arg0) {
            int var120 = class346.field4923.method3539(arg1 ^ -970693778);
            int var121 = class346.field4923.method3524(255);
            int var122 = (var121 & 7) + class617.field8965;
            int var123 = class753.field10887 + var122;
            int var124 = (7 & var121 >> 4) + class186.field2819;
            int var125 = class347.field4939 + var124;
            int var126 = class346.field4923.method3588(65280);
            int var127 = class346.field4923.method3539(57);
            if (~class20.field324 != ~var126) {
               boolean var128 = ~var124 <= -1 && var122 >= 0 && class209.field3112 > var124 && ~class1.field3 < ~var122;
               if (var128 || class373.method2915(class124.field2049, 25700)) {
                  class670.method4908(new class756(var120, var127), class399.field5866, var125, arg1 ^ -970702076, var123);
                  if (var128) {
                     class212.method1806(var122, var124, class399.field5866, arg1 + 970694007);
                  }
               }
            }

         } else if (class665.field9666 == arg0) {
            int var129 = class346.field4923.method3564((byte)-95);
            boolean var130 = ~(var129 & 128) != -1;
            int var131 = (var129 >> 3 & 7) + class186.field2819;
            int var132 = class617.field8965 - -(var129 & 7);
            int var133 = var131 + class346.field4923.method3543(-1132613840);
            int var134 = class346.field4923.method3543(-1132613840) + var132;
            int var135 = class346.field4923.method3538(-128);
            int var136 = class346.field4923.method3565(true);
            int var137 = class346.field4923.method3564((byte)-110) * 4;
            int var138 = 4 * class346.field4923.method3564((byte)-113);
            int var139 = class346.field4923.method3565(true);
            int var140 = class346.field4923.method3565(true);
            int var141 = class346.field4923.method3564((byte)-96);
            if (var141 == 255) {
               var141 = -1;
            }

            int var142 = class346.field4923.method3565(true);
            if (var131 >= 0 && var132 >= 0 && ~var131 > ~class209.field3112 && ~class1.field3 < ~var132 && ~var133 <= -1 && ~var134 <= -1 && class209.field3112 > var133 && ~var134 > ~class1.field3 && var136 != 65535) {
               int var143 = var138 << 2;
               int var144 = var134 * 512 - -256;
               int var145 = var133 * 512 + 256;
               int var146 = var142 << 2;
               int var147 = var137 << 2;
               int var148 = var131 * 512 + 256;
               int var149 = var132 * 512 + 256;
               class488 var150 = new class488(var136, class399.field5866, class399.field5866, var148, var149, var147, class29.field458 + var139, var140 - -class29.field458, var141, var146, 0, var135, var143, var130, -1);
               var150.method3693(var145, -var143 + class663.method4851(var144, var145, class399.field5866, 113), class29.field458 + var139, var144, arg1 ^ -970693884);
               class358.field5361.method2585(new class41(var150), -106);
            }

         } else if (class38.field925 == arg0) {
            int var151 = class346.field4923.method3545(arg1 ^ 970693866);
            int var152 = ((var151 & 120) >> 4) + class186.field2819;
            int var153 = (7 & var151) + class617.field8965;
            int var154 = class346.field4923.method3572((byte)-94);
            int var155 = var154 >> 2;
            int var156 = 3 & var154;
            int var157 = class713.field10346[var155];
            if (class373.method2915(class124.field2049, arg1 ^ -970717344) || ~var152 <= -1 && ~var153 <= -1 && ~var152 > ~class209.field3112 && ~class1.field3 < ~var153) {
               class573.method4247(var155, -1, (byte)-60, class399.field5866, var156, var153, var157, var152);
            }

         } else if (class428.field6190 == arg0) {
            int var158 = class346.field4923.method3564((byte)-127);
            int var159 = class186.field2819 - -(7 & var158 >> 4);
            int var160 = (var158 & 7) + class617.field8965;
            int var161 = class346.field4923.method3545(-35);
            int var162 = var161 >> 2;
            int var163 = 3 & var161;
            int var164 = class713.field10346[var162];
            int var165 = class346.field4923.method3588(arg1 + 970759164);
            if (var165 == 65535) {
               var165 = -1;
            }

            class399.method3074(var160, var164, var162, var159, 93, var163, var165, class399.field5866);
         } else {
            if (arg1 != -970693884) {
               field6802 = null;
            }

            if (class380.field5636 == arg0) {
               int var166 = class346.field4923.method3565(true);
               int var167 = class346.field4923.method3564((byte)-57);
               class634.field9256.method2559(var166, 0).method4899(0, var167);
            } else if (class150.field2408 != arg0) {
               class17.method127((byte)-99, (Throwable)null, field6805[6] + arg0);
               class533.method3991(false, 0);
            } else {
               int var168 = class346.field4923.method3524(255);
               int var169 = (7 & var168) + class617.field8965;
               int var170 = class753.field10887 + var169;
               int var171 = class186.field2819 - -(7 & var168 >> 4);
               int var172 = class347.field4939 + var171;
               int var173 = class346.field4923.method3525(0);
               int var174 = class346.field4923.method3539(-46);
               boolean var175 = var171 >= 0 && ~var169 <= -1 && ~var171 > ~class209.field3112 && class1.field3 > var169;
               if (var175 || class373.method2915(class124.field2049, 25700)) {
                  class670.method4908(new class756(var174, var173), class399.field5866, var172, arg1 + 970702076, var170);
                  if (var175) {
                     class212.method1806(var169, var171, class399.field5866, 121);
                  }
               }

            }
         }
      } catch (RuntimeException var177) {
         throw class608.method4462(var177, field6805[7] + (arg0 != null ? field6805[5] : field6805[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
