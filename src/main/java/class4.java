import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class4 {
   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "Lod;"
   )
   private class761 field57;
   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "Liu;"
   )
   private class530 field52;
   @OriginalMember(
      owner = "client!jja",
      name = "j",
      descriptor = "I"
   )
   public int field56;
   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "I"
   )
   private int field50;
   @OriginalMember(
      owner = "client!jja",
      name = "s",
      descriptor = "I"
   )
   private int field58;
   @OriginalMember(
      owner = "client!jja",
      name = "o",
      descriptor = "[B"
   )
   public byte[] field54;
   @OriginalMember(
      owner = "client!jja",
      name = "e",
      descriptor = "I"
   )
   private int field59;
   @OriginalMember(
      owner = "client!jja",
      name = "d",
      descriptor = "I"
   )
   private int field55;
   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field65 = new String[]{method40(method39("KWXF")), method40(method39("OHU\u0004\u000f\r")), method40(method39("^\f\u001a\u00041")), method40(method39("OHU\u0004\u000e\r")), method40(method39("OHU\u0004pLL]^r\r")), method40(method39("OHU\u0004\b\r")), method40(method39("OHU\u0004\u0004\r")), method40(method39("OHU\u0004\u000b\r")), method40(method39("OHU\u0004\t\r")), method40(method39("OHU\u0004\r\r")), method40(method39("OHU\u0004\n\r"))};
   @OriginalMember(
      owner = "client!jja",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field47 = new class418(118, -1);
   @OriginalMember(
      owner = "client!jja",
      name = "k",
      descriptor = "F"
   )
   public static float field61;
   @OriginalMember(
      owner = "client!jja",
      name = "i",
      descriptor = "I"
   )
   public static int field48;
   @OriginalMember(
      owner = "client!jja",
      name = "q",
      descriptor = "I"
   )
   public static int field49;
   @OriginalMember(
      owner = "client!jja",
      name = "f",
      descriptor = "I"
   )
   public static int field51;
   @OriginalMember(
      owner = "client!jja",
      name = "g",
      descriptor = "I"
   )
   public static int field53;
   @OriginalMember(
      owner = "client!jja",
      name = "m",
      descriptor = "I"
   )
   public static int field60;
   @OriginalMember(
      owner = "client!jja",
      name = "l",
      descriptor = "I"
   )
   public static int field62;
   @OriginalMember(
      owner = "client!jja",
      name = "n",
      descriptor = "I"
   )
   public static int field63;
   @OriginalMember(
      owner = "client!jja",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field64;
   @OriginalMember(
      owner = "client!jja",
      name = "r",
      descriptor = "[[Ljj;"
   )
   private class264[][] field46;

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field51;
         if (this.field46 != null) {
            int var7 = arg0 - 1 >> 7;
            int var8 = arg0 + -1 + -1 + arg2 >> 7;
            int var9 = arg3 + -1 >> 7;
            int var10 = arg3 + -1 + arg1 + -1 >> 7;
            int var11 = var7;
            class264[] var12;
            int var13;
            if (arg4 != 0) {
               method33(51);
               if (var6) {
                  var12 = this.field46[var7];
                  var13 = var9;
                  if (var6) {
                     var12[var9].field3348 = true;
                     var13 = var9 + 1;
                  }
               } else {
                  if (~var7 < ~var8) {
                     return;
                  }

                  var12 = this.field46[var7];
                  var13 = var9;
                  if (var6) {
                     var12[var9].field3348 = true;
                     var13 = var9 + 1;
                  }
               }
            } else {
               if (~var7 < ~var8) {
                  return;
               }

               var12 = this.field46[var7];
               var13 = var9;
               if (var6) {
                  var12[var9].field3348 = true;
                  var13 = var9 + 1;
               }
            }

            while(true) {
               while(var13 <= var10) {
                  var12[var13].field3348 = true;
                  ++var13;
               }

               if (!var6) {
                  ++var11;
                  if (~var11 < ~var8) {
                     return;
                  }

                  var12 = this.field46[var11];
                  var13 = var9;
                  if (var6) {
                     var12[var9].field3348 = true;
                     var13 = var9 + 1;
                  }
               } else {
                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field65[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IILr;I)V"
   )
   public final void method32(int arg0, int arg1, class114 arg2, int arg3) {
      try {
         ++field53;
         class684 var5 = (class684)arg2;
         arg0 += var5.field10087 - -1;
         arg3 += var5.field10080 + arg1;
         int var6 = arg0 - -(this.field56 * arg3);
         int var7 = 0;
         int var8 = var5.field10084;
         int var9 = var5.field10077;
         int var10 = -var9 + this.field56;
         int var11 = 0;
         if (~arg3 >= -1) {
            int var12 = -arg3 + 1;
            arg3 = 1;
            var8 -= var12;
            var7 += var9 * var12;
            var6 += this.field56 * var12;
         }

         if (arg3 + var8 >= this.field50) {
            int var13 = arg3 + 1 + var8 + -this.field50;
            var8 -= var13;
         }

         if (arg0 <= 0) {
            int var14 = -arg0 + 1;
            var11 += var14;
            arg0 = 1;
            var7 += var14;
            var10 += var14;
            var6 += var14;
            var9 -= var14;
         }

         if (~(arg0 + var9) <= ~this.field56) {
            int var15 = arg0 - -1 + -this.field56 + var9;
            var11 += var15;
            var10 += var15;
            var9 -= var15;
         }

         if (~var9 < -1 && var8 > 0) {
            class782.method5642(var7, var10, var5.field10076, var9, var11, false, var6, var8, this.field54);
            this.method31(arg0, var8, var9, arg3, 0);
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field65[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field65[2] : field65[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method33(int arg0) {
      boolean var1 = client.field1481;

      try {
         if (arg0 == 0) {
            label34: {
               if (class226.field2825 != null) {
                  class433.method3353(arg0 + -119, class139.field1755);
                  if (!var1) {
                     break label34;
                  }
               }

               if (~class428.field5822 != 0) {
                  class258.method2084(95, class139.field1755);
                  if (!var1) {
                     break label34;
                  }
               }

               class642.method4735(class76.field1009, 86, class139.field1755, class130.field1666);
            }

            ++field60;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field65[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method34(byte arg0) {
      try {
         if (arg0 >= -125) {
            field47 = null;
         }

         field47 = null;
         field64 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field65[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Lr;III)V"
   )
   public final void method35(class114 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field48;
         class684 var5 = (class684)arg0;
         arg3 += var5.field10087 + 1;
         arg2 += var5.field10080 + arg1;
         int var6 = arg3 - -(this.field56 * arg2);
         int var7 = 0;
         int var8 = var5.field10084;
         int var9 = var5.field10077;
         int var10 = -var9 + this.field56;
         if (arg2 <= 0) {
            int var11 = 1 - arg2;
            arg2 = 1;
            var8 -= var11;
            var7 += var9 * var11;
            var6 += this.field56 * var11;
         }

         int var12 = 0;
         if (~this.field50 >= ~(arg2 + var8)) {
            int var13 = -this.field50 + arg2 + var8 + 1;
            var8 -= var13;
         }

         if (~arg3 >= -1) {
            int var14 = 1 - arg3;
            arg3 = 1;
            var10 += var14;
            var12 += var14;
            var9 -= var14;
            var7 += var14;
            var6 += var14;
         }

         if (arg3 + var9 >= this.field56) {
            int var15 = var9 + 1 + arg3 + -this.field56;
            var12 += var15;
            var9 -= var15;
            var10 += var15;
         }

         if (~var9 < -1 && ~var8 < -1) {
            class207.method1708(this.field54, var8, var5.field10076, var10, var12, var9, var7, var6, (byte)-44);
            this.method31(arg3, var8, var9, arg2, arg1 ^ 1);
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field65[1] + (arg0 != null ? field65[2] : field65[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "([[ZIZIZI)V"
   )
   public final void method36(boolean[][] param1, int param2, boolean param3, int param4, boolean param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method37(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         this.field46 = new class264[this.field59][this.field55];
         ++field63;
         if (!arg0) {
            field47 = null;
         }

         int var3 = 0;
         if (var2 || ~this.field55 < ~var3) {
            do {
               int var4 = 0;
               if (var2) {
                  this.field46[var4][var3] = new class264(this.field52, this, this.field57, var4, var3, this.field58, var4 * 128 + 1, var3 * 128 + 1);
                  ++var4;
               }

               while(true) {
                  while(this.field59 > var4) {
                     this.field46[var4][var3] = new class264(this.field52, this, this.field57, var4, var3, this.field58, var4 * 128 + 1, var3 * 128 + 1);
                     ++var4;
                  }

                  if (!var2) {
                     ++var3;
                     break;
                  }

                  ++var4;
               }
            } while(~this.field55 < ~var3);

         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field65[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(ILr;IZ)Z"
   )
   public final boolean method38(int arg0, class114 arg1, int arg2, boolean arg3) {
      try {
         ++field62;
         class684 var5 = (class684)arg1;
         arg2 += var5.field10087 + 1;
         arg0 += var5.field10080 - -1;
         int var6 = arg2 - -(this.field56 * arg0);
         int var7 = var5.field10084;
         int var8 = var5.field10077;
         if (~arg0 >= -1) {
            int var9 = -arg0 + 1;
            arg0 = 1;
            var7 -= var9;
            var6 += this.field56 * var9;
         }

         int var10 = -var8 + this.field56;
         if (~(arg0 + var7) <= ~this.field50) {
            int var11 = arg0 + var7 + 1 + -this.field50;
            var7 -= var11;
         }

         if (~arg2 >= -1) {
            int var12 = 1 - arg2;
            var6 += var12;
            var10 += var12;
            arg2 = 1;
            var8 -= var12;
         }

         if (~this.field56 >= ~(arg2 + var8)) {
            int var13 = arg2 + var8 + -this.field56 - -1;
            var10 += var13;
            var8 -= var13;
         }

         if (!arg3) {
            return true;
         } else if (~var8 < -1 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field56 + var10;
            return class641.method4717(var8, var6, (byte)-75, this.field54, var15, var14, var7);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field65[6] + arg0 + ',' + (arg1 != null ? field65[2] : field65[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "<init>",
      descriptor = "(Liu;Lod;)V"
   )
   public class4(class530 arg0, class761 arg1) {
      try {
         this.field57 = arg1;
         this.field52 = arg0;
         this.field56 = (this.field57.field5769 * this.field57.field5764 >> this.field52.field7645) + 2;
         this.field50 = (this.field57.field5767 * this.field57.field5764 >> this.field52.field7645) + 2;
         this.field58 = 7 - -this.field52.field7645 + -this.field57.field5773;
         this.field54 = new byte[this.field56 * this.field50];
         this.field59 = this.field57.field5769 >> this.field58;
         this.field55 = this.field57.field5767 >> this.field58;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field65[4] + (arg0 != null ? field65[2] : field65[0]) + ',' + (arg1 != null ? field65[2] : field65[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method39(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method40(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
