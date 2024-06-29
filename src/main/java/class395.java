import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class395 {
   @OriginalMember(
      owner = "client!pda",
      name = "d",
      descriptor = "Ltha;"
   )
   private class297 field6188 = new class297();
   @OriginalMember(
      owner = "client!pda",
      name = "j",
      descriptor = "Lsf;"
   )
   private class475 field6201 = new class475();
   @OriginalMember(
      owner = "client!pda",
      name = "g",
      descriptor = "I"
   )
   private int field6198;
   @OriginalMember(
      owner = "client!pda",
      name = "m",
      descriptor = "I"
   )
   private int field6197;
   @OriginalMember(
      owner = "client!pda",
      name = "f",
      descriptor = "Let;"
   )
   private class389 field6199;
   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6202 = new String[]{method3189(method3188("N\u0017[Z\u0019\u0016")), method3189(method3188("N\u0017[ZdW\u001dS\u0000f\u0016")), method3189(method3188("N\u0017[Z\u0012\u0016")), method3189(method3188("N\u0017[Z\u001b\u0016")), method3189(method3188("N\u0017[Z\u001c\u0016")), method3189(method3188("P\u0006V\u0018")), method3189(method3188("E]\u0014Z%")), method3189(method3188("N\u0017[Z\u001e\u0016")), method3189(method3188("N\u0017[Z\u001f\u0016")), method3189(method3188("N\u0017[Z\u0011\u0016")), method3189(method3188("I\u001aT")), method3189(method3188("N\u0017[Z\u001d\u0016")), method3189(method3188("N\u0017[Z\u0010\u0016")), method3189(method3188("N\u0017[Z\u001a\u0016"))};
   @OriginalMember(
      owner = "client!pda",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6192 = null;
   @OriginalMember(
      owner = "client!pda",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field6196 = new int[25];
   @OriginalMember(
      owner = "client!pda",
      name = "q",
      descriptor = "I"
   )
   public static int field6182;
   @OriginalMember(
      owner = "client!pda",
      name = "e",
      descriptor = "I"
   )
   public static int field6183;
   @OriginalMember(
      owner = "client!pda",
      name = "r",
      descriptor = "I"
   )
   public static int field6184;
   @OriginalMember(
      owner = "client!pda",
      name = "s",
      descriptor = "I"
   )
   public static int field6185;
   @OriginalMember(
      owner = "client!pda",
      name = "k",
      descriptor = "I"
   )
   public static int field6186;
   @OriginalMember(
      owner = "client!pda",
      name = "t",
      descriptor = "I"
   )
   public static int field6187;
   @OriginalMember(
      owner = "client!pda",
      name = "h",
      descriptor = "I"
   )
   public static int field6189;
   @OriginalMember(
      owner = "client!pda",
      name = "p",
      descriptor = "I"
   )
   public static int field6190;
   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "I"
   )
   public static int field6191;
   @OriginalMember(
      owner = "client!pda",
      name = "c",
      descriptor = "I"
   )
   public static int field6193;
   @OriginalMember(
      owner = "client!pda",
      name = "i",
      descriptor = "I"
   )
   public static int field6194;
   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "I"
   )
   public static int field6200;
   @OriginalMember(
      owner = "client!pda",
      name = "l",
      descriptor = "[Ldn;"
   )
   public static class78[] field6195;

   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "(IJ)Ltha;"
   )
   public final class297 method3178(int arg0, long arg1) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field6191;
            class297 var4 = (class297)this.field6199.method3141(arg1, true);
            if (var4 != null) {
               this.field6201.method3693(var4, true);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6202[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method3179(byte arg0, boolean arg1) {
      try {
         int var2 = -62 % ((-43 - arg0) / 46);
         if (class443.field6804 == null) {
            class591.method4403(true);
         }

         ++field6190;
         if (arg1) {
            class443.field6804.method1336((byte)-77);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6202[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3180(int arg0) {
      try {
         field6195 = null;
         field6192 = null;
         if (arg0 != -1) {
            field6195 = null;
         }

         field6196 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6202[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method3181(int arg0, int arg1) {
      try {
         if (arg0 != 28566) {
            field6196 = null;
         }

         ++field6187;
         return arg1 == 11 || arg1 == 12 || ~arg1 == -14;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6202[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(IBILfr;IIIIIII)Z"
   )
   public static final boolean method3182(int arg0, byte arg1, int arg2, class482 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field1786;

      try {
         ++field6200;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg7;
         if (arg1 >= -75) {
            method3187(-89, 95);
         }

         int var17 = arg6 - var15;
         class589.field8691[var14][var15] = 99;
         class456.field6995[var14][var15] = 0;
         byte var18 = 0;
         class703.field10469[var18] = arg7;
         int var19 = 0;
         byte var10001 = var18;
         int var28 = var18 + 1;
         class524.field7994[var10001] = arg6;
         int[][] var20 = arg3.field7339;
         if (!var11 && var28 == var19) {
            class76.field982 = arg6;
            class583.field8603 = arg7;
            return false;
         } else {
            int var12;
            int var13;
            label229:
            do {
               var12 = class703.field10469[var19];
               var13 = class524.field7994[var19];
               int var21 = var13 - var17;
               var19 = var19 + 1 & 4095;
               int var22 = -var16 + var12;
               int var23 = -arg3.field7329 + var12;
               int var24 = -arg3.field7337 + var13;
               int var25 = arg8;
               int var10000 = ~arg8;
               byte var29 = 3;

               do {
                  label223: {
                     label222: {
                        if (var10000 != var29) {
                           if (var25 == -3) {
                              if (class56.method414(arg9, false, var12, arg0, arg5, arg10, var13, 2, 2)) {
                                 class76.field982 = var13;
                                 class583.field8603 = var12;
                                 return true;
                              }
                              break label223;
                           }

                           if (~var25 == 1) {
                              if (arg3.method3743(arg0, -99, arg10, var12, arg4, 2, var13, arg5, 2, arg9)) {
                                 class76.field982 = var13;
                                 class583.field8603 = var12;
                                 return true;
                              }
                              break label223;
                           }

                           if (~var25 == 0) {
                              if (arg3.method3755(var12, arg4, arg0, var13, arg5, 2, arg10, arg9, 0)) {
                                 class583.field8603 = var12;
                                 class76.field982 = var13;
                                 return true;
                              }
                              break label223;
                           }

                           if (~var25 == -1 || ~var25 == -2 || var25 == 2 || var25 == 3) {
                              break label222;
                           }

                           if (var25 != 9) {
                              if (arg3.method3758(arg8, 2, var13, arg5, var12, arg2, false, arg9)) {
                                 class583.field8603 = var12;
                                 class76.field982 = var13;
                                 return true;
                              }
                              break label223;
                           }

                           if (!var11) {
                              break label222;
                           }
                        }

                        if (~arg9 == ~var12 && ~arg5 == ~var13) {
                           class76.field982 = var13;
                           class583.field8603 = var12;
                           return true;
                        }
                        break label223;
                     }

                     if (arg3.method3752(arg8, var12, var13, arg5, arg9, -1, 2, arg2)) {
                        class583.field8603 = var12;
                        class76.field982 = var13;
                        return true;
                     }
                  }

                  var25 = class456.field6995[var22][var21] + 1;
                  if (~var22 < -1 && ~class589.field8691[var22 + -1][var21] == -1 && (1134821376 & var20[var23 - 1][var24]) == 0 && ~(1310982144 & var20[var23 + -1][var24 + 1]) == -1) {
                     class703.field10469[var28] = var12 + -1;
                     class524.field7994[var28] = var13;
                     var28 = 4095 & var28 - -1;
                     class589.field8691[var22 + -1][var21] = 2;
                     class456.field6995[var22 + -1][var21] = var25;
                  }

                  if (var22 < 126 && ~class589.field8691[var22 - -1][var21] == -1 && ~(1625554944 & var20[var23 - -2][var24]) == -1 && (2015625216 & var20[var23 + 2][var24 + 1]) == 0) {
                     class703.field10469[var28] = var12 + 1;
                     class524.field7994[var28] = var13;
                     class589.field8691[var22 + 1][var21] = 8;
                     var28 = var28 - -1 & 4095;
                     class456.field6995[var22 + 1][var21] = var25;
                  }

                  if (~var21 < -1 && class589.field8691[var22][var21 + -1] == 0 && ~(var20[var23][var24 - 1] & 1134821376) == -1 && ~(var20[var23 + 1][var24 + -1] & 1625554944) == -1) {
                     class703.field10469[var28] = var12;
                     class524.field7994[var28] = var13 + -1;
                     var28 = 4095 & var28 - -1;
                     class589.field8691[var22][var21 + -1] = 1;
                     class456.field6995[var22][var21 + -1] = var25;
                  }

                  if (~var21 > -127 && ~class589.field8691[var22][var21 - -1] == -1 && (var20[var23][var24 + 2] & 1310982144) == 0 && ~(2015625216 & var20[var23 - -1][var24 + 2]) == -1) {
                     class703.field10469[var28] = var12;
                     class524.field7994[var28] = var13 - -1;
                     class589.field8691[var22][var21 + 1] = 4;
                     var28 = 4095 & var28 + 1;
                     class456.field6995[var22][var21 + 1] = var25;
                  }

                  if (var22 > 0 && ~var21 < -1 && class589.field8691[var22 + -1][var21 - 1] == 0 && (1336147968 & var20[var23 + -1][var24]) == 0 && (1134821376 & var20[var23 + -1][var24 + -1]) == 0 && ~(1675886592 & var20[var23][var24 + -1]) == -1) {
                     class703.field10469[var28] = var12 - 1;
                     class524.field7994[var28] = var13 + -1;
                     class589.field8691[var22 - 1][var21 + -1] = 3;
                     var28 = 4095 & var28 - -1;
                     class456.field6995[var22 - 1][var21 + -1] = var25;
                  }

                  if (var22 < 126 && var21 > 0 && ~class589.field8691[var22 - -1][var21 + -1] == -1 && ~(var20[var23 + 1][var24 + -1] & 1675886592) == -1 && (var20[var23 - -2][var24 + -1] & 1625554944) == 0 && ~(var20[var23 - -2][var24] & 2028208128) == -1) {
                     class703.field10469[var28] = var12 + 1;
                     class524.field7994[var28] = var13 + -1;
                     var28 = 4095 & var28 + 1;
                     class589.field8691[var22 + 1][var21 + -1] = 9;
                     class456.field6995[var22 + 1][var21 + -1] = var25;
                  }

                  if (var22 > 0 && ~var21 > -127 && ~class589.field8691[var22 + -1][var21 + 1] == -1 && (var20[var23 - 1][var24 - -1] & 1336147968) == 0 && (var20[var23 + -1][var24 + 2] & 1310982144) == 0 && (var20[var23][var24 - -2] & 2116288512) == 0) {
                     class703.field10469[var28] = var12 - 1;
                     class524.field7994[var28] = var13 + 1;
                     var28 = 4095 & var28 + 1;
                     class589.field8691[var22 + -1][var21 + 1] = 6;
                     class456.field6995[var22 - 1][var21 - -1] = var25;
                  }

                  if (~var22 <= -127) {
                     continue label229;
                  }

                  var10000 = ~var21;
                  var29 = -127;
               } while(var11);

               if (var10000 > -127 && class589.field8691[var22 + 1][var21 + 1] == 0 && ~(var20[var23 + 1][var24 + 2] & 2116288512) == -1 && (var20[var23 + 2][var24 + 2] & 2015625216) == 0 && ~(2028208128 & var20[var23 + 2][var24 + 1]) == -1) {
                  class703.field10469[var28] = var12 + 1;
                  class524.field7994[var28] = var13 + 1;
                  class589.field8691[var22 - -1][var21 - -1] = 12;
                  var28 = 4095 & var28 + 1;
                  class456.field6995[var22 + 1][var21 + 1] = var25;
               }
            } while(var28 != var19);

            class76.field982 = var13;
            class583.field8603 = var12;
            return false;
         }
      } catch (RuntimeException var27) {
         throw class482.method3757(var27, field6202[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6202[6] : field6202[5]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(JLtha;B)V"
   )
   public final void method3183(long arg0, class297 arg1, byte arg2) {
      try {
         label29: {
            if (this.field6198 != 0) {
               --this.field6198;
               if (!client.field1786) {
                  break label29;
               }
            }

            class297 var5 = this.field6201.method3692((byte)46);
            var5.method2477(1976);
            var5.method2495(-24134);
            if (this.field6188 == var5) {
               class297 var6 = this.field6201.method3692((byte)46);
               var6.method2477(1976);
               var6.method2495(-24134);
            }
         }

         if (arg2 >= 62) {
            ++field6182;
            this.field6199.method3143(89, arg1, arg0);
            this.field6201.method3693(arg1, true);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6202[12] + arg0 + ',' + (arg1 != null ? field6202[6] : field6202[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method3184(byte arg0) {
      boolean var1 = client.field1786;

      try {
         if (arg0 != 69) {
            field6189 = 44;
         }

         ++field6193;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         if (class498.field7578.field4556 && !class498.field7578.field4542) {
            label132: {
               var2 = true;
               if (class610.field8885.field9141 < 512 && class610.field8885.field9141 != 0) {
                  var2 = false;
               }

               if (!class289.field4558.startsWith(field6202[10])) {
                  var3 = true;
                  if (!var1) {
                     break label132;
                  }
               }

               var4 = true;
               var3 = true;
            }
         }

         if (class151.field2270) {
            var3 = false;
         }

         if (class249.field3787) {
            var2 = false;
         }

         if (class724.field10843) {
            var4 = false;
         }

         if (!var2 && !var3 && !var4) {
            return class720.method5328(-39);
         } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
               try {
                  var5 = class693.method5099(2, 1000, arg0 + -1867552921);
               } catch (Exception var16) {
               }
            }

            if (var4) {
               try {
                  var7 = class693.method5099(3, 1000, arg0 + -1867552921);
                  if (class687.field10213.field507.method3440(arg0 ^ 480102370) == 3) {
                     label133: {
                        long var9;
                        label134: {
                           class266 var8 = class351.field5356.method653();
                           var9 = var8.field4346 & 281474976710655L;
                           int var11 = var8.field4347;
                           if (var11 != 4318) {
                              if (var11 != 4098) {
                                 break label133;
                              }

                              if (!var1) {
                                 break label134;
                              }
                           }

                           var3 &= var9 >= 64425238954L;
                           if (!var1) {
                              break label133;
                           }
                        }

                        var3 &= ~var9 <= -60129613780L;
                     }
                  }
               } catch (Exception var17) {
               }
            }

            if (var3) {
               try {
                  var6 = class693.method5099(1, 1000, -1867552852);
               } catch (Exception var15) {
               }
            }

            if (~var5 == 0 && var6 == -1 && var7 == -1) {
               return class720.method5328(-91);
            } else {
               int var12 = (int)((float)var7 * 1.1F);
               int var13 = (int)((float)var6 * 1.1F);
               if (~var5 < ~var12 && ~var13 > ~var5) {
                  return class754.method5533(var5, (byte)-118);
               } else {
                  return ~var13 <= ~var12 ? class200.method1759(-114, 1, var13) : class200.method1759(arg0 + -180, 3, var12);
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field6202[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(IJ)V"
   )
   public final void method3185(int arg0, long arg1) {
      try {
         ++field6183;
         if (arg0 == 9) {
            class297 var4 = (class297)this.field6199.method3141(arg1, true);
            if (var4 != null) {
               var4.method2477(1976);
               var4.method2495(-24134);
               ++this.field6198;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6202[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3186(boolean arg0) {
      try {
         ++field6184;
         this.field6201.method3696(71);
         this.field6199.method3149(-99);
         this.field6188 = new class297();
         if (arg0) {
            field6189 = -96;
         }

         this.field6198 = this.field6197;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6202[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(II)Lrf;"
   )
   public static final class780 method3187(int arg0, int arg1) {
      try {
         ++field6194;
         if (arg1 != 2075) {
            method3182(-65, (byte)-107, -33, (class482)null, -125, 54, 57, 22, 20, 84, 19);
         }

         return new class780(arg0, false);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6202[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class395(int arg0) {
      try {
         this.field6198 = arg0;
         this.field6197 = arg0;

         int var2;
         for(var2 = 1; var2 + var2 < arg0; var2 += var2) {
         }

         this.field6199 = new class389(var2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6202[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3188(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3189(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
