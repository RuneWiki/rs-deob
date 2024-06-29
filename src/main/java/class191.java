import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class191 {
   @OriginalMember(
      owner = "client!vda",
      name = "k",
      descriptor = "Lcs;"
   )
   private class357 field2880;
   @OriginalMember(
      owner = "client!vda",
      name = "o",
      descriptor = "Lmaa;"
   )
   private class494 field2881;
   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "I"
   )
   public int field2877;
   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "I"
   )
   private int field2890;
   @OriginalMember(
      owner = "client!vda",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field2882;
   @OriginalMember(
      owner = "client!vda",
      name = "t",
      descriptor = "I"
   )
   private int field2879;
   @OriginalMember(
      owner = "client!vda",
      name = "e",
      descriptor = "I"
   )
   private int field2875;
   @OriginalMember(
      owner = "client!vda",
      name = "j",
      descriptor = "I"
   )
   private int field2874;
   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2894 = new String[]{method1672(method1671("{Ey<")), method1672(method1671("n\u001e;~\u001a")), method1672(method1671("cTt~!=")), method1672(method1671("cTt~$=")), method1672(method1671("cTt~.=")), method1672(method1671("cTt~&=")), method1672(method1671("cTt~%=")), method1672(method1671("cTt~\"=")), method1672(method1671("cTt~/=")), method1672(method1671("cTt~[|^|$Y=")), method1672(method1671("cTt~ =")), method1672(method1671("cTt~#="))};
   @OriginalMember(
      owner = "client!vda",
      name = "h",
      descriptor = "Lld;"
   )
   public static class178 field2889 = new class178(8);
   @OriginalMember(
      owner = "client!vda",
      name = "s",
      descriptor = "Lgh;"
   )
   public static class572 field2893 = new class572(16, 12);
   @OriginalMember(
      owner = "client!vda",
      name = "p",
      descriptor = "I"
   )
   public static int field2876;
   @OriginalMember(
      owner = "client!vda",
      name = "m",
      descriptor = "I"
   )
   public static int field2878;
   @OriginalMember(
      owner = "client!vda",
      name = "i",
      descriptor = "I"
   )
   public static int field2883;
   @OriginalMember(
      owner = "client!vda",
      name = "d",
      descriptor = "I"
   )
   public static int field2884;
   @OriginalMember(
      owner = "client!vda",
      name = "r",
      descriptor = "I"
   )
   public static int field2886;
   @OriginalMember(
      owner = "client!vda",
      name = "q",
      descriptor = "I"
   )
   public static int field2887;
   @OriginalMember(
      owner = "client!vda",
      name = "f",
      descriptor = "I"
   )
   public static int field2888;
   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "I"
   )
   public static int field2891;
   @OriginalMember(
      owner = "client!vda",
      name = "g",
      descriptor = "Lpa;"
   )
   public static class386 field2892;
   @OriginalMember(
      owner = "client!vda",
      name = "n",
      descriptor = "[[Lur;"
   )
   private class561[][] field2885;

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(B)Lpq;",
      line = 5
   )
   public static final class203 method1662(byte arg0) {
      try {
         ++field2876;
         if (arg0 < 36) {
            method1664((byte)-128, (class155)null);
         }

         return class771.field11308.length > class375.field5575 ? class771.field11308[class375.field5575++] : null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2894[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(IILr;I)Z",
      line = 19
   )
   public final boolean method1663(int arg0, int arg1, class192 arg2, int arg3) {
      try {
         ++field2888;
         class125 var5 = (class125)arg2;
         arg0 += var5.field2101 + 1;
         arg3 += var5.field2102 + 1;
         int var6 = this.field2877 * arg0 + arg3;
         int var7 = var5.field2105;
         int var8 = var5.field2098;
         if (arg0 <= 0) {
            int var9 = -arg0 + 1;
            var7 -= var9;
            arg0 = 1;
            var6 += this.field2877 * var9;
         }

         int var10 = -var8 + this.field2877;
         if (~(arg0 + var7) <= ~this.field2890) {
            int var11 = var7 + 1 + -this.field2890 + arg0;
            var7 -= var11;
         }

         if (~arg3 >= -1) {
            int var12 = -arg3 + 1;
            arg3 = 1;
            var6 += var12;
            var8 -= var12;
            var10 += var12;
         }

         if (arg1 != 5562) {
            return false;
         } else {
            if (arg3 - -var8 >= this.field2877) {
               int var13 = -this.field2877 + 1 + arg3 - -var8;
               var10 += var13;
               var8 -= var13;
            }

            if (~var8 < -1 && ~var7 < -1) {
               byte var14 = 8;
               int var15 = (var14 + -1) * this.field2877 + var10;
               return class85.method849(this.field2882, var6, var8, true, var14, var15, var7);
            } else {
               return false;
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field2894[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2894[1] : field2894[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(BLct;)Z",
      line = 93
   )
   public static final boolean method1664(byte arg0, class155 arg1) {
      try {
         ++field2887;
         if (arg1 == null) {
            return false;
         } else if (!arg1.field2486) {
            return false;
         } else if (!arg1.method1433(class370.field5483, -21)) {
            return false;
         } else if (class398.field5859.method1572((long)arg1.field2474, -16289) != null) {
            return false;
         } else {
            int var2 = -73 / ((arg0 - -12) / 60);
            return field2889.method1572((long)arg1.field2505, -16289) == null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2894[7] + arg0 + ',' + (arg1 != null ? field2894[1] : field2894[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(IILr;B)V",
      line = 120
   )
   public final void method1665(int arg0, int arg1, class192 arg2, byte arg3) {
      try {
         ++field2886;
         class125 var5 = (class125)arg2;
         if (arg3 >= 106) {
            arg1 += var5.field2101 - -1;
            arg0 += var5.field2102 - -1;
            int var6 = this.field2877 * arg1 + arg0;
            int var7 = 0;
            int var8 = var5.field2105;
            int var9 = var5.field2098;
            int var10 = -var9 + this.field2877;
            int var11 = 0;
            if (arg1 <= 0) {
               int var12 = 1 - arg1;
               arg1 = 1;
               var7 += var9 * var12;
               var8 -= var12;
               var6 += this.field2877 * var12;
            }

            if (~(arg1 - -var8) <= ~this.field2890) {
               int var13 = arg1 - -1 + -this.field2890 + var8;
               var8 -= var13;
            }

            if (arg0 <= 0) {
               int var14 = -arg0 + 1;
               arg0 = 1;
               var9 -= var14;
               var10 += var14;
               var6 += var14;
               var11 += var14;
               var7 += var14;
            }

            if (~this.field2877 >= ~(arg0 + var9)) {
               int var15 = arg0 - -var9 + -this.field2877 + 1;
               var10 += var15;
               var11 += var15;
               var9 -= var15;
            }

            if (~var9 < -1 && ~var8 < -1) {
               class282.method2204(var10, var8, var6, var11, var5.field2097, 40, this.field2882, var7, var9);
               this.method1667((byte)-109, var8, var9, arg0, arg1);
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field2894[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2894[1] : field2894[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(BIILr;)V",
      line = 194
   )
   public final void method1666(byte arg0, int arg1, int arg2, class192 arg3) {
      try {
         ++field2891;
         if (arg0 >= 24) {
            class125 var5 = (class125)arg3;
            arg2 += var5.field2102 + 1;
            arg1 += var5.field2101 - -1;
            int var6 = arg2 - -(this.field2877 * arg1);
            int var7 = 0;
            int var8 = var5.field2105;
            int var9 = var5.field2098;
            int var10 = -var9 + this.field2877;
            int var11 = 0;
            if (arg1 <= 0) {
               int var12 = -arg1 + 1;
               var7 += var9 * var12;
               var6 += this.field2877 * var12;
               arg1 = 1;
               var8 -= var12;
            }

            if (~(arg1 - -var8) <= ~this.field2890) {
               int var13 = -this.field2890 + arg1 + var8 + 1;
               var8 -= var13;
            }

            if (~arg2 >= -1) {
               int var14 = -arg2 + 1;
               var9 -= var14;
               arg2 = 1;
               var6 += var14;
               var10 += var14;
               var11 += var14;
               var7 += var14;
            }

            if (arg2 + var9 >= this.field2877) {
               int var15 = 1 - this.field2877 + arg2 + var9;
               var9 -= var15;
               var11 += var15;
               var10 += var15;
            }

            if (~var9 < -1 && var8 > 0) {
               class39.method474(var7, var8, var9, var6, var5.field2097, this.field2882, var11, 3, var10);
               this.method1667((byte)-109, var8, var9, arg2, arg1);
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field2894[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2894[1] : field2894[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(BIIII)V",
      line = 268
   )
   private final void method1667(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         ++field2884;
         if (this.field2885 != null) {
            int var7 = arg3 + -1 >> 7;
            int var8 = arg2 + -1 + arg3 + -1 >> 7;
            int var9 = arg4 - 1 >> 7;
            if (arg0 == -109) {
               int var10 = arg4 - 1 + arg1 + -1 >> 7;
               int var11 = var7;
               if (var6 || var8 >= var7) {
                  do {
                     class561[] var12 = this.field2885[var11];
                     int var13 = var9;
                     if (var6) {
                        if (var12[var9] != null) {
                           var12[var9].field8157 = true;
                        }

                        var13 = var9 + 1;
                     }

                     while(true) {
                        while(~var13 >= ~var10) {
                           if (var12[var13] != null) {
                              var12[var13].field8157 = true;
                           }

                           ++var13;
                        }

                        if (!var6) {
                           ++var11;
                           break;
                        }

                        ++var13;
                     }
                  } while(var8 >= var11);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field2894[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(I)V",
      line = 312
   )
   public static void method1668(int arg0) {
      try {
         if (arg0 == 3) {
            field2893 = null;
            field2892 = null;
            field2889 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2894[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(IIZII[[Z)V",
      line = 330
   )
   public final void method1669(int param1, int param2, boolean param3, int param4, int param5, boolean[][] param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "(I)V",
      line = 536
   )
   public final void method1670(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 == 21915) {
            ++field2878;
            this.field2885 = new class561[this.field2875][this.field2874];
            int var3 = 0;
            if (var2 || this.field2874 > var3) {
               do {
                  int var4 = 0;
                  if (var2) {
                     this.field2885[var4][var3] = new class561(this.field2880, this, this.field2881, var4, var3, this.field2879, var4 * 128 + 1, var3 * 128 + 1);
                     if (this.field2885[var4][var3].field8154 == 0) {
                        this.field2885[var4][var3] = null;
                     }

                     ++var4;
                  }

                  while(true) {
                     while(~this.field2875 < ~var4) {
                        this.field2885[var4][var3] = new class561(this.field2880, this, this.field2881, var4, var3, this.field2879, var4 * 128 + 1, var3 * 128 + 1);
                        if (this.field2885[var4][var3].field8154 == 0) {
                           this.field2885[var4][var3] = null;
                        }

                        ++var4;
                     }

                     if (!var2) {
                        ++var3;
                        break;
                     }

                     if (this.field2885[var4][var3].field8154 == 0) {
                        this.field2885[var4][var3] = null;
                     }

                     ++var4;
                  }
               } while(this.field2874 > var3);

            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2894[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "<init>",
      descriptor = "(Lcs;Lmaa;)V",
      line = 573
   )
   public class191(class357 arg0, class494 arg1) {
      try {
         this.field2880 = arg0;
         this.field2881 = arg1;
         this.field2877 = (this.field2881.field4083 * this.field2881.field4080 >> this.field2880.field5226) + 2;
         this.field2890 = (this.field2881.field4083 * this.field2881.field4077 >> this.field2880.field5226) + 2;
         this.field2882 = new byte[this.field2890 * this.field2877];
         this.field2879 = -this.field2881.field4081 + 7 - -this.field2880.field5226;
         this.field2875 = this.field2881.field4080 >> this.field2879;
         this.field2874 = this.field2881.field4077 >> this.field2879;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2894[9] + (arg0 != null ? field2894[1] : field2894[0]) + ',' + (arg1 != null ? field2894[1] : field2894[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1671(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1672(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
