import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class641 extends class680 implements class660 {
   @OriginalMember(
      owner = "client!lk",
      name = "bb",
      descriptor = "Z"
   )
   private boolean field9436 = true;
   @OriginalMember(
      owner = "client!lk",
      name = "V",
      descriptor = "Lck;"
   )
   public class234 field9442;
   @OriginalMember(
      owner = "client!lk",
      name = "D",
      descriptor = "Z"
   )
   private boolean field9438;
   @OriginalMember(
      owner = "client!lk",
      name = "mb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9463 = new String[]{method4719(method4718("?V\u0012s")), method4719(method4718("*\rP1\u0003")), method4719(method4718("=HPLV")), method4719(method4718("=HP#\u0017?J\n!V")), method4719(method4718("=HPWV")), method4719(method4718("=HP^?y")), method4719(method4718("=HP]?y")), method4719(method4718("=HPPV")), method4719(method4718("=HPXV")), method4719(method4718("\u0014l8")), method4719(method4718("=HPHV")), method4719(method4718("=HPYV")), method4719(method4718("=HPUV")), method4719(method4718("=HPZV")), method4719(method4718("=HPOV")), method4719(method4718("=HP^V")), method4719(method4718("=HPJV")), method4719(method4718("=HP\\?y")), method4719(method4718("=HPTV")), method4719(method4718("=HPNV")), method4719(method4718("=HPKV")), method4719(method4718("=HPSV")), method4719(method4718("=HPIV")), method4719(method4718("=HP[?y")), method4719(method4718("=HPVV")), method4719(method4718("=HP[V")), method4719(method4718("=HPRV"))};
   @OriginalMember(
      owner = "client!lk",
      name = "T",
      descriptor = "Lid;"
   )
   public static class438 field9433 = null;
   @OriginalMember(
      owner = "client!lk",
      name = "J",
      descriptor = "Lrca;"
   )
   public static class37 field9445 = new class37();
   @OriginalMember(
      owner = "client!lk",
      name = "fb",
      descriptor = "Lrca;"
   )
   public static class37 field9462 = new class37();
   @OriginalMember(
      owner = "client!lk",
      name = "L",
      descriptor = "I"
   )
   public static int field9432;
   @OriginalMember(
      owner = "client!lk",
      name = "db",
      descriptor = "I"
   )
   public static int field9434;
   @OriginalMember(
      owner = "client!lk",
      name = "M",
      descriptor = "I"
   )
   public static int field9435;
   @OriginalMember(
      owner = "client!lk",
      name = "N",
      descriptor = "I"
   )
   public static int field9437;
   @OriginalMember(
      owner = "client!lk",
      name = "cb",
      descriptor = "I"
   )
   public static int field9439;
   @OriginalMember(
      owner = "client!lk",
      name = "U",
      descriptor = "I"
   )
   public static int field9440;
   @OriginalMember(
      owner = "client!lk",
      name = "P",
      descriptor = "I"
   )
   public static int field9443;
   @OriginalMember(
      owner = "client!lk",
      name = "Q",
      descriptor = "I"
   )
   public static int field9446;
   @OriginalMember(
      owner = "client!lk",
      name = "hb",
      descriptor = "I"
   )
   public static int field9447;
   @OriginalMember(
      owner = "client!lk",
      name = "R",
      descriptor = "I"
   )
   public static int field9448;
   @OriginalMember(
      owner = "client!lk",
      name = "lb",
      descriptor = "I"
   )
   public static int field9449;
   @OriginalMember(
      owner = "client!lk",
      name = "gb",
      descriptor = "I"
   )
   public static int field9450;
   @OriginalMember(
      owner = "client!lk",
      name = "Y",
      descriptor = "I"
   )
   public static int field9451;
   @OriginalMember(
      owner = "client!lk",
      name = "X",
      descriptor = "I"
   )
   public static int field9452;
   @OriginalMember(
      owner = "client!lk",
      name = "eb",
      descriptor = "I"
   )
   public static int field9453;
   @OriginalMember(
      owner = "client!lk",
      name = "Z",
      descriptor = "I"
   )
   public static int field9454;
   @OriginalMember(
      owner = "client!lk",
      name = "S",
      descriptor = "I"
   )
   public static int field9455;
   @OriginalMember(
      owner = "client!lk",
      name = "jb",
      descriptor = "I"
   )
   public static int field9456;
   @OriginalMember(
      owner = "client!lk",
      name = "kb",
      descriptor = "I"
   )
   public static int field9457;
   @OriginalMember(
      owner = "client!lk",
      name = "ab",
      descriptor = "I"
   )
   public static int field9458;
   @OriginalMember(
      owner = "client!lk",
      name = "K",
      descriptor = "I"
   )
   public static int field9459;
   @OriginalMember(
      owner = "client!lk",
      name = "W",
      descriptor = "I"
   )
   public static int field9460;
   @OriginalMember(
      owner = "client!lk",
      name = "O",
      descriptor = "I"
   )
   public static int field9461;
   @OriginalMember(
      owner = "client!lk",
      name = "ib",
      descriptor = "J"
   )
   public static long field9441;
   @OriginalMember(
      owner = "client!lk",
      name = "I",
      descriptor = "Lnk;"
   )
   private class484 field9444;

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method4713(int arg0, byte arg1) {
      try {
         ++field9448;
         if (arg1 > -31) {
            field9445 = null;
         }

         return ~arg0 == -4 || ~arg0 == -8 || ~arg0 == -10 || ~arg0 == -12;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method4714(int arg0) {
      try {
         field9462 = null;
         field9445 = null;
         if (arg0 != 262144) {
            field9433 = null;
         }

         field9433 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9463[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method178(int arg0) {
      try {
         if (arg0 != -1) {
            field9462 = null;
         }

         ++field9437;
         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method181(int arg0) {
      try {
         if (arg0 != -6696) {
            return -69;
         } else {
            ++field9446;
            return this.field9442.field2939;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method190(int arg0) {
      try {
         if (arg0 != 0) {
            this.method187((class479)null, 70);
         }

         ++field9461;
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(BLha;)Lwo;"
   )
   public final class328 method176(byte arg0, class479 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9450;
         class232 var4 = this.field9442.method1857(false, 2048, true, (byte)-23, arg1);
         if (var4 == null) {
            return null;
         } else {
            class328 var6;
            label56: {
               class93 var5 = arg1.method396();
               var5.method860(super.field10467, super.field10466, super.field10468);
               var6 = class232.method1838(1, this.field9438, false);
               int var7 = 89 / ((22 - arg0) / 44);
               this.field9442.method1861(super.field10011, true, var4, var5, 49, arg1, super.field10015, super.field10020, super.field10010);
               if (!class400.field5500) {
                  var4.method1305(var5, var6.field4538[0], 0);
                  if (!var3) {
                     break label56;
                  }
               }

               var4.method1297(var5, var6.field4538[0], class629.field9293, 0);
            }

            if (this.field9442.field2948 != null) {
               label50: {
                  class554 var8 = this.field9442.field2948.method4565();
                  if (!class400.field5500) {
                     arg1.method508(var8);
                     if (!var3) {
                        break label50;
                     }
                  }

                  arg1.method517(var8, class629.field9293);
               }
            }

            this.field9436 = var4.method1259() || this.field9442.field2948 != null;
            if (this.field9444 != null) {
               class586.method4370(super.field10467, (byte)-82, super.field10468, super.field10466, var4, this.field9444);
               if (!var3) {
                  return var6;
               }
            }

            this.field9444 = class46.method344((byte)127, var4, super.field10468, super.field10467, super.field10466);
            return var6;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9463[21] + arg0 + ',' + (arg1 != null ? field9463[1] : field9463[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "c",
      descriptor = "(Z)I"
   )
   public final int method74(boolean arg0) {
      try {
         if (!arg0) {
            return -4;
         } else {
            ++field9434;
            return this.field9442.method1854(-115);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "g",
      descriptor = "(B)V"
   )
   public static final void method4715(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field9459;
         class492 var2 = null;

         try {
            class769 var3 = class366.field5092.method5332("2", (byte)-14, true);
            if (var1) {
               class340.method2717(1L, (byte)-119);
            }

            while(var3.field11210 == 0) {
               class340.method2717(1L, (byte)-119);
            }

            if (~var3.field11210 == -2) {
               var2 = (class492)var3.field11212;
               byte[] var4 = new byte[(int)var2.method3743(3)];
               int var5 = 0;
               if (var1 || ~var4.length < ~var5) {
                  do {
                     int var6 = var2.method3739(var4, var4.length + -var5, (byte)-115, var5);
                     if (~var6 == 0) {
                        throw new IOException(field9463[9]);
                     }

                     var5 += var6;
                  } while(~var4.length < ~var5);
               }

               class493.method3750(new class66(var4), true);
            }
         } catch (Exception var9) {
         }

         try {
            if (var2 != null) {
               var2.method3744(1571);
            }
         } catch (Exception var8) {
         }

         if (arg0 != 3) {
            field9441 = -50L;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field9463[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method180(byte arg0) {
      try {
         int var2 = -81 % ((-75 - arg0) / 46);
         ++field9454;
         return this.field9442.method1865(0);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9463[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Lcp;I)V"
   )
   public final void method4716(class271 arg0, int arg1) {
      try {
         this.field9442.method1864(-72, arg0);
         ++field9439;
         int var3 = -34 % ((1 - arg1) / 56);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9463[6] + (arg0 != null ? field9463[1] : field9463[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method175(byte arg0) {
      try {
         if (arg0 != 9) {
            this.field9444 = null;
         }

         ++field9447;
         return this.field9442.field2903;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method67(int arg0) {
      try {
         if (arg0 != 703) {
            return true;
         } else {
            ++field9451;
            return this.field9436;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method187(class479 arg0, int arg1) {
      try {
         this.field9442.method1867(124, arg0);
         ++field9453;
         if (arg1 > -106) {
            this.method187((class479)null, 45);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9463[25] + (arg0 != null ? field9463[1] : field9463[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Lha;IZI)Z"
   )
   public final boolean method185(class479 arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field9458;
         if (!arg2) {
            this.field9442 = null;
         }

         class232 var5 = this.field9442.method1857(false, 131072, false, (byte)-23, arg0);
         if (var5 == null) {
            return false;
         } else {
            class93 var6 = arg0.method396();
            var6.method860(super.field10467, super.field10466, super.field10468);
            return !class400.field5500 ? var5.method1273(arg1, arg3, var6, false, 0) : var5.method1304(arg1, arg3, var6, false, 0, class629.field9293);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9463[4] + (arg0 != null ? field9463[1] : field9463[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "e",
      descriptor = "(B)Z"
   )
   public final boolean method69(byte arg0) {
      try {
         if (arg0 < 61) {
            return true;
         } else {
            ++field9456;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "<init>",
      descriptor = "(Lha;Lfia;IIIIIZIIIIIII)V"
   )
   public class641(class479 arg0, class294 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4085 == 1, class301.method2417(0, arg13, arg12));

      try {
         this.field9442 = new class234(arg0, arg1, arg12, arg13, super.field10457, arg3, this, arg7, arg14);
         this.field9438 = arg1.field4079 != 0 && !arg7;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field9463[3] + (arg0 != null ? field9463[1] : field9463[0]) + ',' + (arg1 != null ? field9463[1] : field9463[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method76(byte arg0) {
      try {
         ++field9460;
         if (arg0 != 21) {
            this.method178(-49);
         }

         return this.field9442.method1860(-1138);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method184(boolean arg0) {
      try {
         ++field9440;
         if (!arg0) {
            this.method178(55);
         }

         return this.field9442.field2914;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method173(boolean arg0) {
      try {
         if (arg0) {
            this.method184(false);
         }

         ++field9443;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9463[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(IIB[BIII)Z"
   )
   public static final boolean method4717(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         int var9;
         label42: {
            ++field9432;
            int var8 = arg0 % arg5;
            if (var8 == 0) {
               var9 = 0;
               if (!var7) {
                  break label42;
               }
            }

            var9 = -var8 + arg5;
         }

         int var10 = -((arg5 + -1 + arg6) / arg5);
         int var11 = -116 / ((arg2 - -20) / 51);
         int var12 = -((arg0 + arg5 - 1) / arg5);
         int var13 = var10;
         int var10000;
         if (var7) {
            var10000 = var12;
         } else if (~var10 <= -1) {
            var10000 = 0;
            if (!var7) {
               return false;
            }
         } else {
            var10000 = var12;
         }

         while(true) {
            int var14 = var10000;
            if (var7) {
               if (arg3[arg1] == 0) {
                  return true;
               }

               arg1 += arg5;
               ++var14;
            }

            while(true) {
               byte var17;
               if (~var14 <= -1) {
                  arg1 -= var9;
                  var17 = arg3[arg1 + -1];
                  if (!var7) {
                     if (var17 == 0) {
                        return true;
                     }

                     arg1 += arg4;
                     ++var13;
                     if (~var13 <= -1) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var12;
                     }
                     break;
                  }
               } else {
                  var17 = arg3[arg1];
               }

               if (var17 == 0) {
                  return true;
               }

               arg1 += arg5;
               ++var14;
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field9463[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9463[1] : field9463[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Lha;ZZLnl;III)V"
   )
   public final void method183(class479 arg0, boolean arg1, boolean arg2, class713 arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg1) {
            this.method181(114);
         }

         ++field9455;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9463[17] + (arg0 != null ? field9463[1] : field9463[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9463[1] : field9463[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ZLha;)V"
   )
   public final void method174(boolean arg0, class479 arg1) {
      try {
         ++field9452;
         class232 var3 = this.field9442.method1857(arg0, 262144, true, (byte)-23, arg1);
         if (var3 != null) {
            class93 var4 = arg1.method396();
            var4.method860(super.field10467, super.field10466, super.field10468);
            this.field9442.method1861(super.field10011, false, var3, var4, -123, arg1, super.field10015, super.field10020, super.field10010);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9463[14] + arg0 + ',' + (arg1 != null ? field9463[1] : field9463[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public final void method182(int arg0, class479 arg1) {
      try {
         if (arg0 != -22276) {
            field9433 = null;
         }

         this.field9442.method1858(arg1, true);
         ++field9449;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9463[18] + arg0 + ',' + (arg1 != null ? field9463[1] : field9463[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(BLha;)Lnk;"
   )
   public final class484 method186(byte arg0, class479 arg1) {
      try {
         int var3 = -126 / ((arg0 - 67) / 40);
         ++field9457;
         return this.field9444;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9463[13] + arg0 + ',' + (arg1 != null ? field9463[1] : field9463[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4718(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4719(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
