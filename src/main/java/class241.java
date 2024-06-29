import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class241 {
   @OriginalMember(
      owner = "client!mb",
      name = "i",
      descriptor = "Llj;"
   )
   private class304 field3663;
   @OriginalMember(
      owner = "client!mb",
      name = "g",
      descriptor = "Llj;"
   )
   public class304 field3665;
   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "Lqt;"
   )
   public class197 field3666;
   @OriginalMember(
      owner = "client!mb",
      name = "x",
      descriptor = "Lok;"
   )
   private class183 field3668;
   @OriginalMember(
      owner = "client!mb",
      name = "t",
      descriptor = "I"
   )
   public int field3649;
   @OriginalMember(
      owner = "client!mb",
      name = "k",
      descriptor = "Ltv;"
   )
   private class311 field3656;
   @OriginalMember(
      owner = "client!mb",
      name = "m",
      descriptor = "Lfu;"
   )
   private class24 field3671;
   @OriginalMember(
      owner = "client!mb",
      name = "q",
      descriptor = "Lrr;"
   )
   public class678 field3651;
   @OriginalMember(
      owner = "client!mb",
      name = "v",
      descriptor = "Lrr;"
   )
   private class678 field3660;
   @OriginalMember(
      owner = "client!mb",
      name = "f",
      descriptor = "Z"
   )
   private boolean field3650;
   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "I"
   )
   public int field3661;
   @OriginalMember(
      owner = "client!mb",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field3669;
   @OriginalMember(
      owner = "client!mb",
      name = "w",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field3670;
   @OriginalMember(
      owner = "client!mb",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3673 = new String[]{method2063(method2062("G[K&H")), method2063(method2062("G[K H")), method2063(method2062("Q\u0017KJ\u001d")), method2063(method2062("G[K%H")), method2063(method2062("DL\t\b")), method2063(method2062("G[K)H")), method2063(method2062("G[K/H")), method2063(method2062("G[K,H")), method2063(method2062("G[KX\tDP\u0011ZH")), method2063(method2062("G[K#H")), method2063(method2062("G[K-H")), method2063(method2062("G[K'H")), method2063(method2062("G[K(H")), method2063(method2062("G[K\"H")), method2063(method2062("G[K.H")), method2063(method2062("G[K!H"))};
   @OriginalMember(
      owner = "client!mb",
      name = "e",
      descriptor = "I"
   )
   public static int field3645;
   @OriginalMember(
      owner = "client!mb",
      name = "n",
      descriptor = "I"
   )
   public static int field3646;
   @OriginalMember(
      owner = "client!mb",
      name = "l",
      descriptor = "I"
   )
   public static int field3647;
   @OriginalMember(
      owner = "client!mb",
      name = "d",
      descriptor = "I"
   )
   public static int field3648;
   @OriginalMember(
      owner = "client!mb",
      name = "c",
      descriptor = "I"
   )
   public static int field3652;
   @OriginalMember(
      owner = "client!mb",
      name = "A",
      descriptor = "I"
   )
   public static int field3653;
   @OriginalMember(
      owner = "client!mb",
      name = "j",
      descriptor = "I"
   )
   public static int field3654;
   @OriginalMember(
      owner = "client!mb",
      name = "B",
      descriptor = "I"
   )
   public static int field3655;
   @OriginalMember(
      owner = "client!mb",
      name = "r",
      descriptor = "I"
   )
   public static int field3657;
   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "I"
   )
   public static int field3658;
   @OriginalMember(
      owner = "client!mb",
      name = "o",
      descriptor = "I"
   )
   public static int field3659;
   @OriginalMember(
      owner = "client!mb",
      name = "u",
      descriptor = "I"
   )
   public static int field3662;
   @OriginalMember(
      owner = "client!mb",
      name = "p",
      descriptor = "I"
   )
   public static int field3664;
   @OriginalMember(
      owner = "client!mb",
      name = "h",
      descriptor = "I"
   )
   public int field3672;
   @OriginalMember(
      owner = "client!mb",
      name = "s",
      descriptor = "[Ljq;"
   )
   public static class672[] field3667;

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(Ltf;Lha;IIIBII)Ljq;",
      line = 3
   )
   public final class672 method2049(class456 arg0, class610 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
      try {
         this.field3668.field2875 = arg6;
         this.field3668.field2882 = arg1.field8875;
         if (arg5 != 28) {
            this.method2051(97, false);
         }

         this.field3668.field2872 = arg4;
         this.field3668.field2871 = arg2;
         this.field3668.field2876 = arg7;
         ++field3655;
         this.field3668.field2885 = arg3;
         this.field3668.field2884 = arg0 != null;
         return (class672)this.field3666.method1732(this.field3668, (byte)124);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3673[3] + (arg0 != null ? field3673[2] : field3673[4]) + ',' + (arg1 != null ? field3673[2] : field3673[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(Lvl;II)Z",
      line = 21
   )
   public static final boolean method2050(class409 arg0, int arg1, int arg2) {
      try {
         class109.field1508.method1550(arg0.field6364[arg1], arg0.field6372[arg1], arg0.field6368[arg1], class481.field7319);
         ++field3659;
         int var3 = 29 % ((-65 - arg2) / 60);
         int var4 = class481.field7319[2];
         if (var4 < 50) {
            return false;
         } else {
            arg0.field6367[arg1] = (short)(class481.field7319[0] * class5.field24 / var4 + class56.field686);
            arg0.field6376[arg1] = (short)(class481.field7319[1] * class799.field11632 / var4 + class106.field1480);
            arg0.field6370[arg1] = (short)var4;
            return true;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3673[7] + (arg0 != null ? field3673[2] : field3673[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IZ)V",
      line = 40
   )
   public final void method2051(int arg0, boolean arg1) {
      try {
         ++field3657;
         if (!this.field3650 == arg1) {
            this.field3650 = arg1;
            this.method2052((byte)117);
            if (arg0 != -1) {
               this.field3672 = 14;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3673[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(B)V",
      line = 56
   )
   public final void method2052(byte arg0) {
      try {
         class304 var2 = this.field3663;
         synchronized(this.field3663) {
            this.field3663.method2551(true);
            if (arg0 < 70) {
               this.field3672 = 9;
            }
         }

         ++field3646;
         class304 var3 = this.field3665;
         synchronized(this.field3665) {
            this.field3665.method2551(true);
         }

         class197 var4 = this.field3666;
         synchronized(this.field3666) {
            this.field3666.method1741(77);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field3673[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "d",
      descriptor = "(I)V",
      line = 75
   )
   public final void method2053(int arg0) {
      try {
         class304 var2 = this.field3663;
         synchronized(this.field3663) {
            this.field3663.method2554(-104);
         }

         int var3 = -73 % ((57 - arg0) / 59);
         ++field3648;
         class304 var4 = this.field3665;
         synchronized(this.field3665) {
            this.field3665.method2554(-118);
         }

         class197 var5 = this.field3666;
         synchronized(this.field3666) {
            this.field3666.method1735(0);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3673[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(I)V",
      line = 94
   )
   public static void method2054(int arg0) {
      try {
         field3667 = null;
         int var1 = 66 % ((arg0 - -49) / 38);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3673[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IZIZLha;ILha;ILda;Ltf;II)Ljq;",
      line = 106
   )
   public final class672 method2055(int arg0, boolean arg1, int arg2, boolean arg3, class610 arg4, int arg5, class610 arg6, int arg7, class288 arg8, class456 arg9, int arg10, int arg11) {
      boolean var13 = client.field1786;

      try {
         ++field3654;
         class672 var14 = this.method2049(arg9, arg6, arg7, arg10, arg2, (byte)28, arg5, arg11);
         if (var14 != null) {
            return var14;
         } else {
            if (arg0 != 0) {
               this.method2049((class456)null, (class610)null, -97, 13, -123, (byte)102, -91, -121);
            }

            class136 var15 = this.method2058(arg0 + -11, arg10);
            if (~arg5 < -2 && var15.field1994 != null) {
               int var16 = -1;
               int var17 = 0;
               if (var13) {
                  if (var15.field1974[var17] <= arg5 && var15.field1974[var17] != 0) {
                     var16 = var15.field1994[var17];
                  }

                  ++var17;
               }

               while(true) {
                  int var10000;
                  int var10001;
                  if (~var17 <= -11) {
                     var10000 = var16;
                     var10001 = -1;
                     if (!var13) {
                        if (var16 != -1) {
                           var15 = this.method2058(-11, var16);
                        }
                        break;
                     }
                  } else {
                     var10000 = var15.field1974[var17];
                     var10001 = arg5;
                  }

                  if (var10000 <= var10001 && var15.field1974[var17] != 0) {
                     var16 = var15.field1994[var17];
                  }

                  ++var17;
               }
            }

            int[] var18 = var15.method1261(arg3, arg7, arg2, arg6, arg8, arg4, arg5, arg9, -11959, arg11);
            if (var18 == null) {
               return null;
            } else {
               class672 var19;
               label73: {
                  if (!arg1) {
                     var19 = arg6.method4494((byte)-108, 32, 36, 36, 0, var18);
                     if (!var13) {
                        break label73;
                     }
                  }

                  var19 = arg4.method4494((byte)-67, 32, 36, 36, 0, var18);
               }

               if (!arg1) {
                  class183 var20 = new class183();
                  var20.field2884 = arg9 != null;
                  var20.field2871 = arg7;
                  var20.field2882 = arg6.field8875;
                  var20.field2872 = arg2;
                  var20.field2876 = arg11;
                  var20.field2885 = arg10;
                  var20.field2875 = arg5;
                  this.field3666.method1733(-10428, var20, var19);
               }

               return var19;
            }
         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field3673[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3673[2] : field3673[4]) + ',' + arg5 + ',' + (arg6 != null ? field3673[2] : field3673[4]) + ',' + arg7 + ',' + (arg8 != null ? field3673[2] : field3673[4]) + ',' + (arg9 != null ? field3673[2] : field3673[4]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "c",
      descriptor = "(I)Ljava/lang/String;",
      line = 178
   )
   public static final String method2056(int arg0) {
      try {
         ++field3653;
         if (!class304.field4759 && class305.field4780 != null) {
            int var1 = 85 / ((arg0 - -13) / 46);
            return (class305.field4780.field2910 == null || ~class305.field4780.field2910.length() == -1) && class305.field4780.field2899 != null && class305.field4780.field2899.length() > 0 ? class305.field4780.field2899 : class305.field4780.field2910;
         } else {
            return "";
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3673[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(BI)V",
      line = 201
   )
   public final void method2057(byte arg0, int arg1) {
      try {
         if (arg0 >= -117) {
            this.method2057((byte)-31, -81);
         }

         ++field3645;
         class304 var3 = this.field3663;
         synchronized(this.field3663) {
            this.field3663.method2552(arg1, 21533);
         }

         class304 var4 = this.field3665;
         synchronized(this.field3665) {
            this.field3665.method2552(arg1, 21533);
         }

         class197 var5 = this.field3666;
         synchronized(this.field3666) {
            this.field3666.method1739(0, arg1);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3673[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(II)Luj;",
      line = 220
   )
   public final class136 method2058(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field3647;
         class304 var4 = this.field3663;
         class136 var5;
         synchronized(this.field3663) {
            if (arg0 != -11) {
               this.field3671 = null;
            }

            var5 = (class136)this.field3663.method2544(false, (long)arg1);
         }

         if (var5 != null) {
            return var5;
         } else {
            class678 var6 = this.field3660;
            byte[] var7;
            synchronized(this.field3660) {
               var7 = this.field3660.method5017(class724.method5354(arg1, (byte)-103), class213.method1859(arg1, -11744), (byte)71);
            }

            class136 var8 = new class136();
            var8.field1993 = this;
            var8.field1984 = arg1;
            var8.field1967 = (String[])this.field3669.clone();
            var8.field1963 = (String[])this.field3670.clone();
            if (var7 != null) {
               var8.method1255(new class354(var7), (byte)-91);
            }

            var8.method1262(arg0 + -16777204);
            if (var8.field1960 != -1) {
               var8.method1257(-17522, this.method2058(-11, var8.field1960), this.method2058(-11, var8.field1940));
            }

            if (var8.field1924 != -1) {
               var8.method1247(this.method2058(-11, var8.field1924), 0, this.method2058(-11, var8.field1910));
            }

            if (~var8.field1968 != 0) {
               var8.method1266(this.method2058(arg0, var8.field1968), this.method2058(-11, var8.field1939), false);
            }

            if (!this.field3650 && var8.field1962) {
               var8.field1975 = class499.field7593.method3875(this.field3649, 80);
               var8.field1931 = null;
               var8.field1970 = 0;
               var8.field1976 = false;
               var8.field1967 = this.field3669;
               var8.field1963 = this.field3670;
               if (var8.field1937 != null) {
                  boolean var9 = false;
                  class294 var10 = var8.field1937.method3139(-55);
                  if (var3 || var10 != null) {
                     do {
                        class58 var11 = this.field3671.method179(-1572, (int)var10.field4655);
                        if (var11.field711) {
                           var10.method2477(1976);
                           if (var3) {
                              var9 = true;
                           }
                        } else {
                           var9 = true;
                        }

                        var10 = var8.field1937.method3147(-21068);
                     } while(var10 != null);
                  }

                  if (!var9) {
                     var8.field1937 = null;
                  }
               }
            }

            class304 var12 = this.field3663;
            synchronized(this.field3663) {
               this.field3663.method2545((long)arg1, 108, var8);
               return var8;
            }
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field3673[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IB)V",
      line = 301
   )
   public final void method2059(int arg0, byte arg1) {
      try {
         int var3 = -127 % ((arg1 - 49) / 42);
         this.field3672 = arg0;
         ++field3652;
         class304 var4 = this.field3665;
         synchronized(this.field3665) {
            this.field3665.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3673[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(B)V",
      line = 317
   )
   public final void method2060(byte arg0) {
      try {
         ++field3664;
         class304 var2 = this.field3665;
         synchronized(this.field3665) {
            this.field3665.method2551(true);
            int var3 = 74 % ((-17 - arg0) / 61);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3673[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(I)V",
      line = 332
   )
   public final void method2061(int arg0) {
      try {
         class197 var2 = this.field3666;
         synchronized(this.field3666) {
            this.field3666.method1741(51);
            if (arg0 <= 19) {
               this.method2057((byte)-51, -109);
            }
         }

         ++field3662;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3673[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "(Ltv;IZLfu;Lrr;Lrr;)V",
      line = 369
   )
   public class241(class311 arg0, int arg1, boolean arg2, class24 arg3, class678 arg4, class678 arg5) {
      boolean var7 = client.field1786;
      super();
      this.field3663 = new class304(64);
      this.field3665 = new class304(50);
      this.field3666 = new class197(250);
      this.field3668 = new class183();

      try {
         label47: {
            this.field3649 = arg1;
            this.field3656 = arg0;
            this.field3671 = arg3;
            this.field3651 = arg5;
            this.field3660 = arg4;
            this.field3650 = arg2;
            if (this.field3660 != null) {
               int var8 = this.field3660.method5008(-1) + -1;
               this.field3661 = var8 * 256 + this.field3660.method4998((byte)-82, var8);
               if (!var7) {
                  break label47;
               }
            }

            this.field3661 = 0;
         }

         label42: {
            if (class619.field9004 != this.field3656) {
               this.field3669 = new String[]{null, null, class499.field7596.method3875(this.field3649, 104), null, null, null};
               if (!var7) {
                  break label42;
               }
            }

            this.field3669 = new String[]{null, null, class499.field7596.method3875(this.field3649, 94), null, null, class499.field7610.method3875(this.field3649, 111)};
         }

         this.field3670 = new String[]{null, null, null, null, class499.field7597.method3875(this.field3649, 107)};
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3673[8] + (arg0 != null ? field3673[2] : field3673[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3673[2] : field3673[4]) + ',' + (arg4 != null ? field3673[2] : field3673[4]) + ',' + (arg5 != null ? field3673[2] : field3673[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2062(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2063(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
