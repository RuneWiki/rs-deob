import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class744 {
   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10591 = new String[]{method5363(method5362("m\u000e0v9")), method5363(method5362("k\u000b")), method5363(method5362("k\n")), method5363(method5362("m\u000e0w9")), method5363(method5362("eI0\u001bl")), method5363(method5362("p\u0012rY")), method5363(method5362("m\u000e0t9")), method5363(method5362("m\u000e0p9")), method5363(method5362("m\u000e0q9"))};
   @OriginalMember(
      owner = "client!si",
      name = "c",
      descriptor = "I"
   )
   public static int field10580 = 0;
   @OriginalMember(
      owner = "client!si",
      name = "f",
      descriptor = "Liw;"
   )
   public static class107 field10581 = new class107(4);
   @OriginalMember(
      owner = "client!si",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field10590 = new class724(0, -1);
   @OriginalMember(
      owner = "client!si",
      name = "d",
      descriptor = "I"
   )
   public static int field10583;
   @OriginalMember(
      owner = "client!si",
      name = "e",
      descriptor = "I"
   )
   public static int field10584;
   @OriginalMember(
      owner = "client!si",
      name = "j",
      descriptor = "I"
   )
   public static int field10585;
   @OriginalMember(
      owner = "client!si",
      name = "h",
      descriptor = "I"
   )
   public static int field10586;
   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "I"
   )
   public static int field10587;
   @OriginalMember(
      owner = "client!si",
      name = "i",
      descriptor = "I"
   )
   public static int field10588;
   @OriginalMember(
      owner = "client!si",
      name = "b",
      descriptor = "Lkn;"
   )
   public static class437 field10582;
   @OriginalMember(
      owner = "client!si",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10589;

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5357(int arg0) {
      boolean var1 = client.field10022;

      try {
         class22.field325 = 0;
         ++field10588;
         class408 var2 = class745.field10605.field3719;
         int var3 = var2.method651(-1);
         int var4 = var2.method637(arg0 + 65540);
         boolean var5 = var2.method647((byte)124) == 1;
         int var6 = var2.method693((byte)114);
         class204.method1770(-126);
         class69.method729(var6, (byte)84);
         if (arg0 == -5) {
            int var7;
            int var9;
            label92: {
               var7 = (-var2.field945 + class745.field10605.field3721) / 16;
               class701.field10107 = new int[var7][4];
               int var8 = 0;
               if (var1) {
                  var9 = 0;
                  if (var1) {
                     class701.field10107[var8][var9] = var2.method701(class607.method4473(arg0, -252));
                     ++var9;
                  }
               } else {
                  if (~var8 <= ~var7) {
                     class277.field4198 = new byte[var7][];
                     class387.field5648 = null;
                     class251.field3825 = new int[var7];
                     class626.field8942 = new int[var7];
                     class16.field220 = new byte[var7][];
                     class168.field2520 = new byte[var7][];
                     class460.field6709 = new int[var7];
                     class65.field897 = new int[var7];
                     class51.field762 = new byte[var7][];
                     class282.field4260 = new int[var7];
                     class320.field4776 = null;
                     var7 = 0;
                     var9 = (-(class234.field3626 >> 4) + var3) / 8;
                     if (!var1) {
                        break label92;
                     }
                  } else {
                     var9 = 0;
                  }

                  if (var1) {
                     class701.field10107[var8][var9] = var2.method701(class607.method4473(arg0, -252));
                     ++var9;
                  }
               }

               while(true) {
                  while(~var9 > -5) {
                     class701.field10107[var8][var9] = var2.method701(class607.method4473(arg0, -252));
                     ++var9;
                  }

                  if (!var1) {
                     ++var8;
                     if (~var8 <= ~var7) {
                        class277.field4198 = new byte[var7][];
                        class387.field5648 = null;
                        class251.field3825 = new int[var7];
                        class626.field8942 = new int[var7];
                        class16.field220 = new byte[var7][];
                        class168.field2520 = new byte[var7][];
                        class460.field6709 = new int[var7];
                        class65.field897 = new int[var7];
                        class51.field762 = new byte[var7][];
                        class282.field4260 = new int[var7];
                        class320.field4776 = null;
                        var7 = 0;
                        var9 = (-(class234.field3626 >> 4) + var3) / 8;
                        if (!var1) {
                           break;
                        }
                     } else {
                        var9 = 0;
                     }

                     if (var1) {
                        class701.field10107[var8][var9] = var2.method701(class607.method4473(arg0, -252));
                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               }
            }

            int var10000;
            byte var10001;
            if (var1) {
               var10000 = -(class209.field2989 >> 4) + var4;
               var10001 = 8;
            } else if (~var9 < ~(((class234.field3626 >> 4) + var3) / 8)) {
               var10000 = var3;
               var10001 = 12;
               if (!var1) {
                  class240.method2107(var3, 12, var5, var4, (byte)18);
                  return;
               }
            } else {
               var10000 = -(class209.field2989 >> 4) + var4;
               var10001 = 8;
            }

            while(true) {
               int var10 = var10000 / var10001;
               if (var1) {
                  class460.field6709[var7] = (var9 << 8) + var10;
                  class626.field8942[var7] = class488.field6962.method443("m" + var9 + "_" + var10, class607.method4473(arg0, -21));
                  class282.field4260[var7] = class488.field6962.method443("l" + var9 + "_" + var10, 16);
                  class65.field897[var7] = class488.field6962.method443(field10591[2] + var9 + "_" + var10, 16);
                  class251.field3825[var7] = class488.field6962.method443(field10591[1] + var9 + "_" + var10, 16);
                  ++var7;
                  ++var10;
               }

               while(true) {
                  while(var10 <= ((class209.field2989 >> 4) + var4) / 8) {
                     class460.field6709[var7] = (var9 << 8) + var10;
                     class626.field8942[var7] = class488.field6962.method443("m" + var9 + "_" + var10, class607.method4473(arg0, -21));
                     class282.field4260[var7] = class488.field6962.method443("l" + var9 + "_" + var10, 16);
                     class65.field897[var7] = class488.field6962.method443(field10591[2] + var9 + "_" + var10, 16);
                     class251.field3825[var7] = class488.field6962.method443(field10591[1] + var9 + "_" + var10, 16);
                     ++var7;
                     ++var10;
                  }

                  if (!var1) {
                     ++var9;
                     if (~var9 < ~(((class234.field3626 >> 4) + var3) / 8)) {
                        var10000 = var3;
                        var10001 = 12;
                        if (!var1) {
                           class240.method2107(var3, 12, var5, var4, (byte)18);
                           return;
                        }
                     } else {
                        var10000 = -(class209.field2989 >> 4) + var4;
                        var10001 = 8;
                     }
                     break;
                  }

                  ++var10;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field10591[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method5358(class17 arg0, byte arg1) {
      try {
         label27: {
            if (!class678.field9669) {
               class292.method2450(-81, arg0);
               if (!client.field10022) {
                  break label27;
               }
            }

            class542.method4043(arg0, -95);
         }

         ++field10584;
         if (arg1 <= 53) {
            field10580 = -118;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10591[6] + (arg0 != null ? field10591[4] : field10591[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(ILjava/lang/String;)Z"
   )
   public static final boolean method5359(int arg0, String arg1) {
      try {
         ++field10585;
         if (arg0 <= 0) {
            field10590 = null;
         }

         return class417.method3259(0, arg1, 10, true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10591[3] + arg0 + ',' + (arg1 != null ? field10591[4] : field10591[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5360(byte arg0) {
      try {
         field10581 = null;
         if (arg0 > 16) {
            field10590 = null;
            field10582 = null;
            field10589 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10591[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(IIIIIZI)V"
   )
   public static final void method5361(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
      boolean var7 = client.field10022;

      try {
         ++field10583;
         class183.method1651(89, arg4);
         int var8 = 0;
         int var9 = -arg0 + arg4;
         if (var9 < 0) {
            var9 = 0;
         }

         int var10 = arg4;
         int var11 = -arg4;
         int var12 = var9;
         int var13 = -var9;
         byte var14 = -1;
         byte var15 = -1;
         if (~arg1 <= ~class587.field8239 && arg1 <= class767.field11011) {
            int[] var16 = class788.field11482[arg1];
            int var17 = class437.method3398(class729.field10384, (byte)95, arg2 - arg4, class604.field8618);
            int var18 = class437.method3398(class729.field10384, (byte)111, arg2 + arg4, class604.field8618);
            int var19 = class437.method3398(class729.field10384, (byte)105, -var9 + arg2, class604.field8618);
            int var20 = class437.method3398(class729.field10384, (byte)114, arg2 + var9, class604.field8618);
            class100.method989(var17, (byte)22, var19, arg6, var16);
            class100.method989(var19, (byte)22, var20, arg3, var16);
            class100.method989(var20, (byte)22, var18, arg6, var16);
         }

         int var45;
         int var46;
         if (!arg5) {
            method5360((byte)-8);
            if (var7) {
               var45 = var14 + 2;
               var46 = var15 + 2;
               var11 += var45;
               var13 += var46;
               if (~var13 <= -1 && ~var9 <= -2) {
                  var12 = var9 - 1;
                  class460.field6712[var12] = var8;
                  var13 -= var12 << 1;
               }
            } else {
               if (arg4 <= var8) {
                  return;
               }

               var45 = var14 + 2;
               var46 = var15 + 2;
               var11 += var45;
               var13 += var46;
               if (~var13 <= -1 && ~var9 <= -2) {
                  var12 = var9 - 1;
                  class460.field6712[var12] = var8;
                  var13 -= var12 << 1;
               }
            }
         } else {
            if (arg4 <= var8) {
               return;
            }

            var45 = var14 + 2;
            var46 = var15 + 2;
            var11 += var45;
            var13 += var46;
            if (~var13 <= -1 && ~var9 <= -2) {
               var12 = var9 - 1;
               class460.field6712[var12] = var8;
               var13 -= var12 << 1;
            }
         }

         while(true) {
            while(true) {
               ++var8;
               if (var11 >= 0) {
                  --var10;
                  var11 -= var10 << 1;
                  int var21 = arg1 - var10;
                  int var22 = arg1 + var10;
                  if (var22 >= class587.field8239 && ~var21 >= ~class767.field11011) {
                     int var25;
                     int var26;
                     int var27;
                     int var28;
                     int var29;
                     int[] var30;
                     int[] var31;
                     if (~var9 >= ~var10) {
                        int var23 = class437.method3398(class729.field10384, (byte)118, arg2 - -var8, class604.field8618);
                        int var24 = class437.method3398(class729.field10384, (byte)115, arg2 - var8, class604.field8618);
                        if (var22 <= class767.field11011) {
                           class100.method989(var24, (byte)22, var23, arg6, class788.field11482[var22]);
                        }

                        if (~class587.field8239 >= ~var21) {
                           class100.method989(var24, (byte)22, var23, arg6, class788.field11482[var21]);
                           if (var7) {
                              var25 = class460.field6712[var10];
                              var26 = class437.method3398(class729.field10384, (byte)-56, arg2 - -var8, class604.field8618);
                              var27 = class437.method3398(class729.field10384, (byte)-74, -var8 + arg2, class604.field8618);
                              var28 = class437.method3398(class729.field10384, (byte)100, arg2 - -var25, class604.field8618);
                              var29 = class437.method3398(class729.field10384, (byte)-120, -var25 + arg2, class604.field8618);
                              if (var22 <= class767.field11011) {
                                 var30 = class788.field11482[var22];
                                 class100.method989(var27, (byte)22, var29, arg6, var30);
                                 class100.method989(var29, (byte)22, var28, arg3, var30);
                                 class100.method989(var28, (byte)22, var26, arg6, var30);
                              }

                              if (~class587.field8239 >= ~var21) {
                                 var31 = class788.field11482[var21];
                                 class100.method989(var27, (byte)22, var29, arg6, var31);
                                 class100.method989(var29, (byte)22, var28, arg3, var31);
                                 class100.method989(var28, (byte)22, var26, arg6, var31);
                              }
                           }
                        }
                     } else {
                        var25 = class460.field6712[var10];
                        var26 = class437.method3398(class729.field10384, (byte)-56, arg2 - -var8, class604.field8618);
                        var27 = class437.method3398(class729.field10384, (byte)-74, -var8 + arg2, class604.field8618);
                        var28 = class437.method3398(class729.field10384, (byte)100, arg2 - -var25, class604.field8618);
                        var29 = class437.method3398(class729.field10384, (byte)-120, -var25 + arg2, class604.field8618);
                        if (var22 <= class767.field11011) {
                           var30 = class788.field11482[var22];
                           class100.method989(var27, (byte)22, var29, arg6, var30);
                           class100.method989(var29, (byte)22, var28, arg3, var30);
                           class100.method989(var28, (byte)22, var26, arg6, var30);
                        }

                        if (~class587.field8239 >= ~var21) {
                           var31 = class788.field11482[var21];
                           class100.method989(var27, (byte)22, var29, arg6, var31);
                           class100.method989(var29, (byte)22, var28, arg3, var31);
                           class100.method989(var28, (byte)22, var26, arg6, var31);
                        }
                     }
                  }
               }

               int var32 = -var8 + arg1;
               int var33 = arg1 - -var8;
               if (class587.field8239 <= var33) {
                  int var10000 = ~var32;
                  int var10001 = ~class767.field11011;
                  if (var7) {
                     if (var10000 <= var10001 && ~var12 <= -2) {
                        --var12;
                        class460.field6712[var12] = var8;
                        var13 -= var12 << 1;
                     }
                     continue;
                  }

                  if (var10000 >= var10001) {
                     int var34 = arg2 + var10;
                     int var35 = -var10 + arg2;
                     if (~class729.field10384 >= ~var34 && ~var35 >= ~class604.field8618) {
                        int var36 = class437.method3398(class729.field10384, (byte)86, var34, class604.field8618);
                        int var37 = class437.method3398(class729.field10384, (byte)-108, var35, class604.field8618);
                        if (~var9 < ~var8) {
                           int var38 = var12 < var8 ? class460.field6712[var8] : var12;
                           int var39 = class437.method3398(class729.field10384, (byte)-103, arg2 + var38, class604.field8618);
                           int var40 = class437.method3398(class729.field10384, (byte)81, -var38 + arg2, class604.field8618);
                           if (var33 <= class767.field11011) {
                              int[] var41 = class788.field11482[var33];
                              class100.method989(var37, (byte)22, var40, arg6, var41);
                              class100.method989(var40, (byte)22, var39, arg3, var41);
                              class100.method989(var39, (byte)22, var36, arg6, var41);
                           }

                           if (class587.field8239 <= var32) {
                              int[] var42 = class788.field11482[var32];
                              class100.method989(var37, (byte)22, var40, arg6, var42);
                              class100.method989(var40, (byte)22, var39, arg3, var42);
                              class100.method989(var39, (byte)22, var36, arg6, var42);
                              if (var7) {
                                 if (~var33 >= ~class767.field11011) {
                                    class100.method989(var37, (byte)22, var36, arg6, class788.field11482[var33]);
                                 }

                                 if (class587.field8239 <= var32) {
                                    class100.method989(var37, (byte)22, var36, arg6, class788.field11482[var32]);
                                 }
                              }
                           }
                        } else {
                           if (~var33 >= ~class767.field11011) {
                              class100.method989(var37, (byte)22, var36, arg6, class788.field11482[var33]);
                           }

                           if (class587.field8239 <= var32) {
                              class100.method989(var37, (byte)22, var36, arg6, class788.field11482[var32]);
                           }
                        }
                     }
                  }
               }

               if (var10 <= var8) {
                  return;
               }

               var45 += 2;
               var46 += 2;
               var11 += var45;
               var13 += var46;
               if (~var13 <= -1 && ~var12 <= -2) {
                  --var12;
                  class460.field6712[var12] = var8;
                  var13 -= var12 << 1;
               }
            }
         }
      } catch (RuntimeException var44) {
         throw class612.method4503(var44, field10591[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5362(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5363(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
