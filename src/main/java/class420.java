import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class420 {
   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5898 = new String[]{method3181(method3180("\u0004\u0002\u007fk2")), method3181(method3180("\u0004\u0002\u007fo2")), method3181(method3180("\u0004\u0002\u007fn2")), method3181(method3180("\u0004\u0002\u007fi2")), method3181(method3180("\u0012X\u007f\u0004g")), method3181(method3180("\u0007\u0003=F")), method3181(method3180("\u0004\u0002\u007fh2"))};
   @OriginalMember(
      owner = "client!mt",
      name = "e",
      descriptor = "I"
   )
   public static int field5894 = 0;
   @OriginalMember(
      owner = "client!mt",
      name = "f",
      descriptor = "I"
   )
   public static int field5892 = 503;
   @OriginalMember(
      owner = "client!mt",
      name = "b",
      descriptor = "I"
   )
   public static int field5893;
   @OriginalMember(
      owner = "client!mt",
      name = "g",
      descriptor = "I"
   )
   public static int field5895;
   @OriginalMember(
      owner = "client!mt",
      name = "c",
      descriptor = "I"
   )
   public static int field5896;
   @OriginalMember(
      owner = "client!mt",
      name = "d",
      descriptor = "I"
   )
   public static int field5897;
   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field5891;

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3175(byte arg0) {
      try {
         int var1 = 60 / ((arg0 - 46) / 35);
         class450.field6221.method1851(-46);
         ++field5896;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5898[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(II)Leb;"
   )
   public static final class657 method3176(int arg0, int arg1) {
      try {
         ++field5897;
         int var2 = arg0 >> 16;
         int var3 = arg0 & 65535;
         int var4 = 113 % ((-49 - arg1) / 56);
         if (class468.field6451[var2] == null || class468.field6451[var2][var3] == null) {
            boolean var5 = class603.method4400(2, var2);
            if (!var5) {
               return null;
            }
         }

         return class468.field6451[var2][var3];
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5898[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(IIIIZ[[[Lcea;)Z"
   )
   public static final boolean method3177(int arg0, int arg1, int arg2, int arg3, boolean arg4, class225[][][] arg5) {
      try {
         ++field5895;
         byte var6 = !arg4 ? (byte)(255 & class766.field11053) : 1;
         if (class737.field10749[class239.field2981][arg0][arg1] == var6) {
            return false;
         } else if (~(4 & class100.field1295[class239.field2981][arg0][arg1]) == -1) {
            return false;
         } else {
            byte var7 = 0;
            class620.field8667[var7] = arg0;
            if (arg2 != -18734) {
               return true;
            } else {
               int var8 = 0;
               int var37 = var7 + 1;
               class429.field5975[var7] = arg1;
               class737.field10749[class239.field2981][arg0][arg1] = var6;

               while(var37 != var8) {
                  int var9 = 65535 & class620.field8667[var8];
                  int var10 = 255 & class620.field8667[var8] >> 16;
                  int var11 = 255 & class620.field8667[var8] >> 24;
                  int var12 = 65535 & class429.field5975[var8];
                  int var13 = (class429.field5975[var8] & 16767892) >> 16;
                  var8 = 4095 & var8 + 1;
                  boolean var14 = false;
                  if ((4 & class100.field1295[class239.field2981][var9][var12]) == 0) {
                     var14 = true;
                  }

                  boolean var15 = false;
                  if (arg5 != null) {
                     label286:
                     for(int var16 = class239.field2981 + 1; ~var16 >= -4; ++var16) {
                        if (arg5[var16] != null && (class100.field1295[var16][var9][var12] & 8) == 0) {
                           if (var14 && arg5[var16][var9][var12] != null) {
                              if (arg5[var16][var9][var12].field2831 != null) {
                                 int var17 = class157.method1281(var10, true);
                                 if (~arg5[var16][var9][var12].field2831.field10521 == ~var17 || arg5[var16][var9][var12].field2830 != null && arg5[var16][var9][var12].field2830.field10521 == var17) {
                                    continue;
                                 }

                                 if (~var11 != -1) {
                                    int var18 = class157.method1281(var11, true);
                                    if (arg5[var16][var9][var12].field2831.field10521 == var18 || arg5[var16][var9][var12].field2830 != null && arg5[var16][var9][var12].field2830.field10521 == var18) {
                                       continue;
                                    }
                                 }

                                 if (~var13 != -1) {
                                    int var19 = class157.method1281(var13, true);
                                    if (arg5[var16][var9][var12].field2831.field10521 == var19 || arg5[var16][var9][var12].field2830 != null && ~arg5[var16][var9][var12].field2830.field10521 == ~var19) {
                                       continue;
                                    }
                                 }
                              }

                              class225 var20 = arg5[var16][var9][var12];
                              if (var20.field2821 != null) {
                                 for(class752 var21 = var20.field2821; var21 != null; var21 = var21.field10923) {
                                    class47 var22 = var21.field10922;
                                    if (var22 instanceof class712) {
                                       class712 var23 = (class712)var22;
                                       int var24 = var23.method2273((byte)121);
                                       int var25 = var23.method2280(-31276);
                                       if (var24 == 21) {
                                          var24 = 19;
                                       }

                                       int var26 = var24 | var25 << 6;
                                       if (~var10 == ~var26 || var11 != 0 && var11 == var26 || var13 != 0 && ~var13 == ~var26) {
                                          continue label286;
                                       }
                                    }
                                 }
                              }
                           }

                           class225 var27 = arg5[var16][var9][var12];
                           if (var27 != null && var27.field2821 != null) {
                              for(class752 var28 = var27.field2821; var28 != null; var28 = var28.field10923) {
                                 class47 var29 = var28.field10922;
                                 if (~var29.field548 != ~var29.field547 || ~var29.field541 != ~var29.field540) {
                                    for(int var30 = var29.field547; ~var30 >= ~var29.field548; ++var30) {
                                       for(int var31 = var29.field540; var29.field541 >= var31; ++var31) {
                                          class737.field10749[var16][var30][var31] = var6;
                                       }
                                    }
                                 }
                              }
                           }

                           var15 = true;
                           class737.field10749[var16][var9][var12] = var6;
                        }
                     }
                  }

                  if (var15) {
                     int var32 = class93.field1241[class239.field2981 + 1].method2221(false, var12, var9);
                     if (var32 > class329.field4719[arg3]) {
                        class329.field4719[arg3] = var32;
                     }

                     int var33 = var9 << 9;
                     int var34 = var12 << 9;
                     if (~class779.field11372[arg3] >= ~var33) {
                        if (~var33 < ~class540.field7380[arg3]) {
                           class540.field7380[arg3] = var33;
                        }
                     } else {
                        class779.field11372[arg3] = var33;
                     }

                     if (~var34 <= ~class53.field579[arg3]) {
                        if (class441.field6116[arg3] < var34) {
                           class441.field6116[arg3] = var34;
                        }
                     } else {
                        class53.field579[arg3] = var34;
                     }
                  }

                  if (!var14) {
                     if (~var9 <= -2 && class737.field10749[class239.field2981][var9 + -1][var12] != var6) {
                        class620.field8667[var37] = class283.method2155(class283.method2155(var9 + -1, 1179648), -754974720);
                        class429.field5975[var37] = class283.method2155(1245184, var12);
                        var37 = 4095 & var37 + 1;
                        class737.field10749[class239.field2981][var9 + -1][var12] = var6;
                     }

                     ++var12;
                     if (class215.field2667 > var12) {
                        if (~(var9 + -1) <= -1 && class737.field10749[class239.field2981][var9 + -1][var12] != var6 && ~(class100.field1295[class239.field2981][var9][var12] & 4) == -1 && (4 & class100.field1295[class239.field2981][var9 - 1][var12 + -1]) == 0) {
                           class620.field8667[var37] = class283.method2155(1375731712, class283.method2155(var9 + -1, 1179648));
                           class429.field5975[var37] = class283.method2155(var12, 1245184);
                           var37 = 4095 & var37 + 1;
                           class737.field10749[class239.field2981][var9 + -1][var12] = var6;
                        }

                        if (~class737.field10749[class239.field2981][var9][var12] != ~var6) {
                           class620.field8667[var37] = class283.method2155(318767104, class283.method2155(var9, 5373952));
                           class429.field5975[var37] = class283.method2155(5439488, var12);
                           var37 = 4095 & var37 + 1;
                           class737.field10749[class239.field2981][var9][var12] = var6;
                        }

                        if (var9 + 1 < class507.field7030 && class737.field10749[class239.field2981][var9 + 1][var12] != var6 && (class100.field1295[class239.field2981][var9][var12] & 4) == 0 && ~(class100.field1295[class239.field2981][var9 - -1][var12 - 1] & 4) == -1) {
                           class620.field8667[var37] = class283.method2155(class283.method2155(5373952, var9 + 1), -1845493760);
                           class429.field5975[var37] = class283.method2155(var12, 5439488);
                           class737.field10749[class239.field2981][var9 + 1][var12] = var6;
                           var37 = 4095 & var37 + 1;
                        }
                     }

                     --var12;
                     if (var9 + 1 < class507.field7030 && class737.field10749[class239.field2981][var9 + 1][var12] != var6) {
                        class620.field8667[var37] = class283.method2155(1392508928, class283.method2155(var9 - -1, 9568256));
                        class429.field5975[var37] = class283.method2155(var12, 9633792);
                        var37 = 4095 & var37 - -1;
                        class737.field10749[class239.field2981][var9 - -1][var12] = var6;
                     }

                     --var12;
                     if (var12 >= 0) {
                        if (var9 + -1 >= 0 && ~class737.field10749[class239.field2981][var9 - 1][var12] != ~var6 && ~(class100.field1295[class239.field2981][var9][var12] & 4) == -1 && (class100.field1295[class239.field2981][var9 - 1][var12 + 1] & 4) == 0) {
                           class620.field8667[var37] = class283.method2155(class283.method2155(var9 + -1, 13762560), 301989888);
                           class429.field5975[var37] = class283.method2155(var12, 13828096);
                           class737.field10749[class239.field2981][var9 + -1][var12] = var6;
                           var37 = 4095 & var37 + 1;
                        }

                        if (class737.field10749[class239.field2981][var9][var12] != var6) {
                           class620.field8667[var37] = class283.method2155(class283.method2155(var9, 13762560), -1828716544);
                           class429.field5975[var37] = class283.method2155(var12, 13828096);
                           var37 = var37 + 1 & 4095;
                           class737.field10749[class239.field2981][var9][var12] = var6;
                        }

                        if (~class507.field7030 < ~(var9 + 1) && ~class737.field10749[class239.field2981][var9 + 1][var12] != ~var6 && ~(class100.field1295[class239.field2981][var9][var12] & 4) == -1 && ~(4 & class100.field1295[class239.field2981][var9 + 1][var12 - -1]) == -1) {
                           class620.field8667[var37] = class283.method2155(class283.method2155(9568256, var9 + 1), -771751936);
                           class429.field5975[var37] = class283.method2155(var12, 9633792);
                           var37 = var37 + 1 & 4095;
                           class737.field10749[class239.field2981][var9 + 1][var12] = var6;
                        }
                     }
                  }
               }

               if (~class329.field4719[arg3] != 999999) {
                  class329.field4719[arg3] += 40;
                  class779.field11372[arg3] -= 512;
                  class540.field7380[arg3] += 512;
                  class441.field6116[arg3] += 512;
                  class53.field579[arg3] -= 512;
               }

               return true;
            }
         }
      } catch (RuntimeException var36) {
         throw class534.method3846(var36, field5898[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5898[4] : field5898[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3178(boolean arg0) {
      try {
         field5891 = null;
         if (arg0) {
            method3175((byte)-99);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5898[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3179(int arg0, int arg1, int arg2) {
      try {
         ++field5893;
         if (class521.method3770(true)) {
            class766.field11046 = arg1;
            if (~class25.field324 != ~arg2) {
               class762.field11020 = "";
            }

            if (arg0 == 1124524848) {
               class25.field324 = arg2;
               class397.method3019(-70, 6);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5898[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
