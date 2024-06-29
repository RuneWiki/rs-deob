import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class460 {
   @OriginalMember(
      owner = "client!rba",
      name = "m",
      descriptor = "Lor;"
   )
   private class670 field6315;
   @OriginalMember(
      owner = "client!rba",
      name = "q",
      descriptor = "Lvj;"
   )
   private class469 field6299;
   @OriginalMember(
      owner = "client!rba",
      name = "o",
      descriptor = "I"
   )
   public int field6304;
   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "I"
   )
   private int field6306;
   @OriginalMember(
      owner = "client!rba",
      name = "n",
      descriptor = "I"
   )
   private int field6308;
   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field6307;
   @OriginalMember(
      owner = "client!rba",
      name = "d",
      descriptor = "I"
   )
   private int field6305;
   @OriginalMember(
      owner = "client!rba",
      name = "e",
      descriptor = "I"
   )
   private int field6314;
   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6316 = new String[]{method3392(method3391("\u000e\r{r\u0007")), method3392(method3391("\u001bV90")), method3392(method3391("\u0007A4r2]")), method3392(method3391("\u0007A4r=]")), method3392(method3391("\u0007A4r>]")), method3392(method3391("\u0007A4r?]")), method3392(method3391("\u0007A4r9]")), method3392(method3391("\u0007A4r8]")), method3392(method3391("\u0007A4r<]")), method3392(method3391("\u0007A4r;]")), method3392(method3391("\u0007A4rF\u001cM<(D]"))};
   @OriginalMember(
      owner = "client!rba",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public static String field6309 = null;
   @OriginalMember(
      owner = "client!rba",
      name = "r",
      descriptor = "I"
   )
   public static int field6298;
   @OriginalMember(
      owner = "client!rba",
      name = "g",
      descriptor = "I"
   )
   public static int field6300;
   @OriginalMember(
      owner = "client!rba",
      name = "p",
      descriptor = "I"
   )
   public static int field6302;
   @OriginalMember(
      owner = "client!rba",
      name = "l",
      descriptor = "I"
   )
   public static int field6303;
   @OriginalMember(
      owner = "client!rba",
      name = "c",
      descriptor = "I"
   )
   public static int field6310;
   @OriginalMember(
      owner = "client!rba",
      name = "f",
      descriptor = "I"
   )
   public static int field6311;
   @OriginalMember(
      owner = "client!rba",
      name = "j",
      descriptor = "I"
   )
   public static int field6312;
   @OriginalMember(
      owner = "client!rba",
      name = "h",
      descriptor = "I"
   )
   public static int field6313;
   @OriginalMember(
      owner = "client!rba",
      name = "i",
      descriptor = "[[Lnl;"
   )
   private class581[][] field6301;

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3383(boolean arg0) {
      try {
         if (!arg0) {
            method3383(true);
         }

         field6309 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6316[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3384(int arg0) {
      boolean var2 = client.field4273;

      try {
         this.field6301 = new class581[this.field6305][this.field6314];
         ++field6303;
         if (arg0 == 2) {
            int var3 = 0;
            if (var2 || this.field6314 > var3) {
               do {
                  int var4 = 0;
                  if (var2) {
                     this.field6301[var4][var3] = new class581(this.field6315, this, this.field6299, var4, var3, this.field6308, var4 * 128 + 1, var3 * 128 + 1);
                     ++var4;
                  }

                  while(true) {
                     while(~this.field6305 < ~var4) {
                        this.field6301[var4][var3] = new class581(this.field6315, this, this.field6299, var4, var3, this.field6308, var4 * 128 + 1, var3 * 128 + 1);
                        ++var4;
                     }

                     if (!var2) {
                        ++var3;
                        break;
                     }

                     ++var4;
                  }
               } while(this.field6314 > var3);

            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6316[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "(Lr;IIB)V"
   )
   public final void method3385(class194 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field6302;
         class132 var5 = (class132)arg0;
         arg2 += var5.field1690 + 1;
         arg1 += var5.field1684 + 1;
         int var6 = this.field6304 * arg2 + arg1;
         int var7 = 0;
         int var8 = var5.field1686;
         int var9 = var5.field1693;
         int var10 = -var9 + this.field6304;
         if (~arg2 >= -1) {
            int var11 = 1 - arg2;
            arg2 = 1;
            var8 -= var11;
            var6 += this.field6304 * var11;
            var7 += var9 * var11;
         }

         int var12 = 0;
         if (~(arg2 + var8) <= ~this.field6306) {
            int var13 = arg2 - (-var8 + this.field6306) + 1;
            var8 -= var13;
         }

         if (arg1 <= 0) {
            int var14 = -arg1 + 1;
            var9 -= var14;
            arg1 = 1;
            var10 += var14;
            var7 += var14;
            var12 += var14;
            var6 += var14;
         }

         if (~(arg1 - -var9) <= ~this.field6304) {
            int var15 = arg1 + 1 + -this.field6304 + var9;
            var12 += var15;
            var9 -= var15;
            var10 += var15;
         }

         if (var9 > 0 && ~var8 < -1) {
            class794.method5722(var5.field1683, -115, var8, this.field6307, var7, var12, var6, var9, var10);
            int var16 = -8 % ((47 - arg3) / 41);
            this.method3389(arg2, var8, arg1, var9, (byte)121);
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field6316[5] + (arg0 != null ? field6316[0] : field6316[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(Lr;IIB)V"
   )
   public final void method3386(class194 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field6298;
         class132 var5 = (class132)arg0;
         arg1 += var5.field1690 + 1;
         arg2 += var5.field1684 + 1;
         int var6 = this.field6304 * arg1 + arg2;
         int var7 = 0;
         int var8 = var5.field1686;
         if (arg3 == -50) {
            int var9 = var5.field1693;
            int var10 = -var9 + this.field6304;
            if (arg1 <= 0) {
               int var11 = -arg1 + 1;
               var7 += var9 * var11;
               var6 += this.field6304 * var11;
               var8 -= var11;
               arg1 = 1;
            }

            int var12 = 0;
            if (~(arg1 + var8) <= ~this.field6306) {
               int var13 = arg1 + 1 - -var8 - this.field6306;
               var8 -= var13;
            }

            if (arg2 <= 0) {
               int var14 = 1 - arg2;
               var9 -= var14;
               var10 += var14;
               var7 += var14;
               arg2 = 1;
               var12 += var14;
               var6 += var14;
            }

            if (~(arg2 + var9) <= ~this.field6304) {
               int var15 = -this.field6304 + 1 + arg2 + var9;
               var10 += var15;
               var12 += var15;
               var9 -= var15;
            }

            if (var9 > 0 && var8 > 0) {
               class539.method3892(var10, var7, var9, this.field6307, var6, 3, var8, var12, var5.field1683);
               this.method3389(arg1, var8, arg2, var9, (byte)123);
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field6316[8] + (arg0 != null ? field6316[0] : field6316[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(IZ[[ZIII)V"
   )
   public final void method3387(int param1, boolean param2, boolean[][] param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3388(int arg0, int arg1) {
      try {
         if (arg1 != -15095) {
            return false;
         } else {
            ++field6300;
            return ~arg0 == -4 || arg0 == 5 || ~arg0 == -7;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6316[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   private final void method3389(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      boolean var6 = client.field4273;

      try {
         ++field6313;
         if (arg4 > 115) {
            if (this.field6301 != null) {
               int var7 = arg2 - 1 >> 7;
               int var8 = arg3 - 1 + -1 + arg2 >> 7;
               int var9 = arg0 + -1 >> 7;
               int var10 = arg0 + -1 + -1 - -arg1 >> 7;
               int var11 = var7;
               if (var6 || ~var8 <= ~var7) {
                  do {
                     class581[] var12 = this.field6301[var11];
                     int var13 = var9;
                     if (var6) {
                        var12[var9].field7969 = true;
                        var13 = var9 + 1;
                     }

                     while(true) {
                        while(~var10 <= ~var13) {
                           var12[var13].field7969 = true;
                           ++var13;
                        }

                        if (!var6) {
                           ++var11;
                           break;
                        }

                        ++var13;
                     }
                  } while(~var8 <= ~var11);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field6316[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(ILr;ZI)Z"
   )
   public final boolean method3390(int arg0, class194 arg1, boolean arg2, int arg3) {
      try {
         ++field6312;
         class132 var5 = (class132)arg1;
         arg0 += var5.field1690 - -1;
         arg3 += var5.field1684 + 1;
         int var6 = this.field6304 * arg0 + arg3;
         if (!arg2) {
            this.field6308 = -34;
         }

         int var7 = var5.field1686;
         int var8 = var5.field1693;
         if (~arg0 >= -1) {
            int var9 = -arg0 + 1;
            var7 -= var9;
            var6 += this.field6304 * var9;
            arg0 = 1;
         }

         int var10 = -var8 + this.field6304;
         if (this.field6306 <= arg0 + var7) {
            int var11 = -this.field6306 + 1 + var7 + arg0;
            var7 -= var11;
         }

         if (~arg3 >= -1) {
            int var12 = -arg3 + 1;
            arg3 = 1;
            var6 += var12;
            var8 -= var12;
            var10 += var12;
         }

         if (this.field6304 <= arg3 + var8) {
            int var13 = -this.field6304 + 1 + arg3 + var8;
            var8 -= var13;
            var10 += var13;
         }

         if (~var8 < -1 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field6304 + var10;
            return class91.method866(var8, 111, var14, var15, var6, this.field6307, var7);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field6316[4] + arg0 + ',' + (arg1 != null ? field6316[0] : field6316[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "<init>",
      descriptor = "(Lor;Lvj;)V"
   )
   public class460(class670 arg0, class469 arg1) {
      try {
         this.field6315 = arg0;
         this.field6299 = arg1;
         this.field6304 = (this.field6299.field3873 * this.field6299.field3869 >> this.field6315.field9709) + 2;
         this.field6306 = (this.field6299.field3871 * this.field6299.field3869 >> this.field6315.field9709) + 2;
         this.field6308 = -this.field6299.field3874 + this.field6315.field9709 + 7;
         this.field6307 = new byte[this.field6306 * this.field6304];
         this.field6305 = this.field6299.field3873 >> this.field6308;
         this.field6314 = this.field6299.field3871 >> this.field6308;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6316[10] + (arg0 != null ? field6316[0] : field6316[1]) + ',' + (arg1 != null ? field6316[0] : field6316[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
