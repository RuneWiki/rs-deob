import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class585 {
   @OriginalMember(
      owner = "client!cc",
      name = "o",
      descriptor = "Lmu;"
   )
   private class258 field8653;
   @OriginalMember(
      owner = "client!cc",
      name = "i",
      descriptor = "Lnd;"
   )
   private class121 field8646;
   @OriginalMember(
      owner = "client!cc",
      name = "d",
      descriptor = "I"
   )
   public int field8642;
   @OriginalMember(
      owner = "client!cc",
      name = "j",
      descriptor = "I"
   )
   private int field8656;
   @OriginalMember(
      owner = "client!cc",
      name = "p",
      descriptor = "I"
   )
   private int field8645;
   @OriginalMember(
      owner = "client!cc",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field8651;
   @OriginalMember(
      owner = "client!cc",
      name = "q",
      descriptor = "I"
   )
   private int field8648;
   @OriginalMember(
      owner = "client!cc",
      name = "l",
      descriptor = "I"
   )
   private int field8655;
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8659 = new String[]{method4379(method4378("5z\u001d\t.")), method4379(method4378(" !_K")), method4379(method4378("-7\u001d\u001b: =G\u0019{")), method4379(method4378("-7\u001d`{")), method4379(method4378("-7\u001da{")), method4379(method4378("-7\u001df{")), method4379(method4378("-7\u001dc{")), method4379(method4378("-7\u001de{")), method4379(method4378("-7\u001dd{")), method4379(method4378("-7\u001db{"))};
   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field8643 = new int[256];
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "I"
   )
   public static int field8644;
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "I"
   )
   public static int field8647;
   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "I"
   )
   public static int field8649;
   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "I"
   )
   public static int field8652;
   @OriginalMember(
      owner = "client!cc",
      name = "m",
      descriptor = "I"
   )
   public static int field8654;
   @OriginalMember(
      owner = "client!cc",
      name = "k",
      descriptor = "I"
   )
   public static int field8657;
   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "Lpr;"
   )
   public static class331 field8658;
   @OriginalMember(
      owner = "client!cc",
      name = "h",
      descriptor = "[[Lpd;"
   )
   private class8[][] field8650;

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(Lr;BII)V"
   )
   public final void method4371(class273 arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field8644;
         class516 var5 = (class516)arg0;
         arg2 += var5.field7840 - -1;
         arg3 += var5.field7841 + 1;
         int var6 = arg3 - -(this.field8642 * arg2);
         int var7 = 0;
         int var8 = var5.field7845;
         int var9 = var5.field7851;
         int var10 = -var9 + this.field8642;
         if (~arg2 >= -1) {
            int var11 = -arg2 + 1;
            var6 += this.field8642 * var11;
            var8 -= var11;
            var7 += var9 * var11;
            arg2 = 1;
         }

         int var12 = 0;
         if (~this.field8656 >= ~(arg2 + var8)) {
            int var13 = arg2 - -var8 + -this.field8656 - -1;
            var8 -= var13;
         }

         if (arg3 <= 0) {
            int var14 = -arg3 + 1;
            var7 += var14;
            var12 += var14;
            var9 -= var14;
            var6 += var14;
            arg3 = 1;
            var10 += var14;
         }

         if (~this.field8642 >= ~(arg3 + var9)) {
            int var15 = arg3 + 1 + -this.field8642 + var9;
            var10 += var15;
            var12 += var15;
            var9 -= var15;
         }

         if (var9 > 0 && ~var8 < -1) {
            if (arg1 != 82) {
               this.method4373(-86, -21, (byte)122, -108, -120);
            }

            class75.method714(this.field8651, var7, var12, var6, var9, var10, var8, var5.field7848, (byte)-105);
            this.method4373(var8, arg2, (byte)98, arg3, var9);
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8659[6] + (arg0 != null ? field8659[0] : field8659[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(Lr;IIB)Z"
   )
   public final boolean method4372(class273 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field8657;
         class516 var5 = (class516)arg0;
         arg2 += var5.field7841 + 1;
         arg1 += var5.field7840 + 1;
         int var6 = this.field8642 * arg1 + arg2;
         int var7 = var5.field7845;
         int var8 = var5.field7851;
         int var9 = -var8 + this.field8642;
         if (~arg1 >= -1) {
            int var10 = -arg1 + 1;
            arg1 = 1;
            var7 -= var10;
            var6 += this.field8642 * var10;
         }

         if (~(arg1 + var7) <= ~this.field8656) {
            int var11 = 1 - this.field8656 + arg1 + var7;
            var7 -= var11;
         }

         if (arg2 <= 0) {
            int var12 = -arg2 + 1;
            var9 += var12;
            arg2 = 1;
            var8 -= var12;
            var6 += var12;
         }

         if (this.field8642 <= arg2 + var8) {
            int var13 = var8 + 1 + -this.field8642 + arg2;
            var8 -= var13;
            var9 += var13;
         }

         if (~var8 < -1 && ~var7 < -1) {
            if (arg3 < 117) {
               method4376(23);
            }

            byte var14 = 8;
            int var15 = (var14 + -1) * this.field8642 + var9;
            return class620.method4559(var6, var8, var15, var7, 4096, var14, this.field8651);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8659[9] + (arg0 != null ? field8659[0] : field8659[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IIBII)V"
   )
   private final void method4373(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field8647;
         if (this.field8650 != null) {
            int var7 = arg3 + -1 >> 7;
            if (arg2 == 98) {
               int var8 = arg3 + arg4 + -1 + -1 >> 7;
               int var9 = arg1 + -1 >> 7;
               int var10 = arg1 - 1 + arg0 + -1 >> 7;
               int var11 = var7;
               if (var6 || var7 <= var8) {
                  do {
                     class8[] var12 = this.field8650[var11];
                     int var13 = var9;
                     if (var6) {
                        if (var12[var9] != null) {
                           var12[var9].field58 = true;
                        }

                        var13 = var9 + 1;
                     }

                     while(true) {
                        while(var10 >= var13) {
                           if (var12[var13] != null) {
                              var12[var13].field58 = true;
                           }

                           ++var13;
                        }

                        if (!var6) {
                           ++var11;
                           break;
                        }

                        ++var13;
                     }
                  } while(var11 <= var8);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field8659[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4374(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field8652;
         this.field8650 = new class8[this.field8648][this.field8655];
         int var3 = 0;
         byte var10000;
         if (var2) {
            var10000 = 0;
         } else if (~this.field8655 >= ~var3) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 >= -14) {
                  this.field8653 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var4 = var10000;
            if (var2) {
               this.field8650[var4][var3] = new class8(this.field8653, this, this.field8646, var4, var3, this.field8645, var4 * 128 + 1, var3 * 128 + 1);
               if (this.field8650[var4][var3].field54 == 0) {
                  this.field8650[var4][var3] = null;
               }

               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field8648) {
                  this.field8650[var4][var3] = new class8(this.field8653, this, this.field8646, var4, var3, this.field8645, var4 * 128 + 1, var3 * 128 + 1);
                  if (this.field8650[var4][var3].field54 == 0) {
                     this.field8650[var4][var3] = null;
                  }

                  ++var4;
               }

               if (!var2) {
                  ++var3;
                  if (~this.field8655 >= ~var3) {
                     var10000 = arg0;
                     if (!var2) {
                        if (arg0 >= -14) {
                           this.field8653 = null;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = 0;
                  }
                  break;
               }

               if (this.field8650[var4][var3].field54 == 0) {
                  this.field8650[var4][var3] = null;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8659[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IIZI[[ZI)V"
   )
   public final void method4375(int param1, int param2, boolean param3, int param4, boolean[][] param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4376(int arg0) {
      try {
         if (arg0 != 21672) {
            field8643 = null;
         }

         field8643 = null;
         field8658 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8659[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IIBLr;)V"
   )
   public final void method4377(int arg0, int arg1, byte arg2, class273 arg3) {
      try {
         ++field8649;
         class516 var5 = (class516)arg3;
         arg0 += var5.field7840 + 1;
         arg1 += var5.field7841 - -1;
         int var6 = this.field8642 * arg0 + arg1;
         int var7 = 0;
         int var8 = var5.field7845;
         int var9 = var5.field7851;
         int var10 = this.field8642 - var9;
         int var11 = 0;
         if (arg2 == -47) {
            if (~arg0 >= -1) {
               int var12 = -arg0 + 1;
               var7 += var9 * var12;
               var6 += this.field8642 * var12;
               var8 -= var12;
               arg0 = 1;
            }

            if (~this.field8656 >= ~(arg0 - -var8)) {
               int var13 = var8 + 1 + arg0 - this.field8656;
               var8 -= var13;
            }

            if (~arg1 >= -1) {
               int var14 = -arg1 + 1;
               var9 -= var14;
               var11 += var14;
               var7 += var14;
               var6 += var14;
               var10 += var14;
               arg1 = 1;
            }

            if (this.field8642 <= arg1 + var9) {
               int var15 = arg1 + var9 + 1 + -this.field8642;
               var9 -= var15;
               var11 += var15;
               var10 += var15;
            }

            if (~var9 < -1 && ~var8 < -1) {
               class390.method3153(var7, 645949058, var8, var10, var6, this.field8651, var9, var11, var5.field7848);
               this.method4373(var8, arg0, (byte)98, arg1, var9);
            }
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field8659[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8659[0] : field8659[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "<init>",
      descriptor = "(Lmu;Lnd;)V"
   )
   public class585(class258 arg0, class121 arg1) {
      try {
         this.field8653 = arg0;
         this.field8646 = arg1;
         this.field8642 = (this.field8646.field4383 * this.field8646.field4377 >> this.field8653.field4166) + 2;
         this.field8656 = (this.field8646.field4379 * this.field8646.field4377 >> this.field8653.field4166) + 2;
         this.field8645 = -this.field8646.field4375 + 7 - -this.field8653.field4166;
         this.field8651 = new byte[this.field8656 * this.field8642];
         this.field8648 = this.field8646.field4383 >> this.field8645;
         this.field8655 = this.field8646.field4379 >> this.field8645;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8659[2] + (arg0 != null ? field8659[0] : field8659[1]) + ',' + (arg1 != null ? field8659[0] : field8659[1]) + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         int var1 = var0;

         for(int var2 = 0; ~var2 > -9; ++var2) {
            if ((var1 & 1) == 1) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         field8643[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4378(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4379(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
