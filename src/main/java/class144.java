import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class144 extends class428 {
   @OriginalMember(
      owner = "client!eea",
      name = "n",
      descriptor = "Lmn;"
   )
   private class389 field1818;
   @OriginalMember(
      owner = "client!eea",
      name = "F",
      descriptor = "Lea;"
   )
   private class573 field1827;
   @OriginalMember(
      owner = "client!eea",
      name = "C",
      descriptor = "Lkk;"
   )
   private class204 field1822;
   @OriginalMember(
      owner = "client!eea",
      name = "I",
      descriptor = "I"
   )
   private int field1830;
   @OriginalMember(
      owner = "client!eea",
      name = "q",
      descriptor = "I"
   )
   private int field1829;
   @OriginalMember(
      owner = "client!eea",
      name = "u",
      descriptor = "I"
   )
   private int field1817;
   @OriginalMember(
      owner = "client!eea",
      name = "M",
      descriptor = "I"
   )
   private int field1836;
   @OriginalMember(
      owner = "client!eea",
      name = "H",
      descriptor = "[[F"
   )
   private float[][] field1825;
   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "[[F"
   )
   private float[][] field1823;
   @OriginalMember(
      owner = "client!eea",
      name = "s",
      descriptor = "[[F"
   )
   private float[][] field1831;
   @OriginalMember(
      owner = "client!eea",
      name = "G",
      descriptor = "I"
   )
   private int field1835;
   @OriginalMember(
      owner = "client!eea",
      name = "o",
      descriptor = "Lwf;"
   )
   private class147 field1838;
   @OriginalMember(
      owner = "client!eea",
      name = "N",
      descriptor = "Lsh;"
   )
   private class77 field1840;
   @OriginalMember(
      owner = "client!eea",
      name = "K",
      descriptor = "Lwv;"
   )
   private class37 field1837;
   @OriginalMember(
      owner = "client!eea",
      name = "A",
      descriptor = "Llfa;"
   )
   private class126 field1824;
   @OriginalMember(
      owner = "client!eea",
      name = "v",
      descriptor = "Lwr;"
   )
   private class485 field1820;
   @OriginalMember(
      owner = "client!eea",
      name = "J",
      descriptor = "Lil;"
   )
   private class7 field1815;
   @OriginalMember(
      owner = "client!eea",
      name = "E",
      descriptor = "Lil;"
   )
   private class7 field1814;
   @OriginalMember(
      owner = "client!eea",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1841 = new String[]{method1132(method1131("Y6LZ\u000f\u0014")), method1132(method1131("Y6LZ\n\u0014")), method1132(method1131("R&A\u0018")), method1132(method1131("G}\u0003Z6")), method1132(method1131("Y6LZ\u000e\u0014")), method1132(method1131("Y6LZwU=D\u0000u\u0014")), method1132(method1131("Y6LZ\t\u0014")), method1132(method1131("Y6LZ\b\u0014"))};
   @OriginalMember(
      owner = "client!eea",
      name = "w",
      descriptor = "Lwia;"
   )
   public static class793 field1826 = new class793();
   @OriginalMember(
      owner = "client!eea",
      name = "D",
      descriptor = "S"
   )
   public static short field1832 = 32767;
   @OriginalMember(
      owner = "client!eea",
      name = "L",
      descriptor = "I"
   )
   public static int field1834 = 0;
   @OriginalMember(
      owner = "client!eea",
      name = "x",
      descriptor = "I"
   )
   public static int field1813;
   @OriginalMember(
      owner = "client!eea",
      name = "B",
      descriptor = "I"
   )
   public static int field1816;
   @OriginalMember(
      owner = "client!eea",
      name = "m",
      descriptor = "I"
   )
   private int field1819;
   @OriginalMember(
      owner = "client!eea",
      name = "y",
      descriptor = "I"
   )
   public static int field1821;
   @OriginalMember(
      owner = "client!eea",
      name = "p",
      descriptor = "I"
   )
   public static int field1833;
   @OriginalMember(
      owner = "client!eea",
      name = "r",
      descriptor = "Lci;"
   )
   public static class476 field1839;
   @OriginalMember(
      owner = "client!eea",
      name = "t",
      descriptor = "Lnu;"
   )
   public static class619 field1828;

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(I[[ZIBI)V",
      line = 3
   )
   public final void method1126(int arg0, boolean[][] arg1, int arg2, byte arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field1833;
         if (this.field1824 != null) {
            if (~this.field1830 >= ~(arg2 + arg4)) {
               if (this.field1829 >= -arg2 + arg4) {
                  if (arg3 != -75) {
                     field1826 = null;
                  }

                  if (arg0 + arg2 >= this.field1817) {
                     if (~(-arg2 + arg0) >= ~this.field1836) {
                        int var7 = this.field1817;
                        if (var6 || var7 <= this.field1836) {
                           do {
                              int var8 = this.field1830;
                              if (var6 || ~this.field1829 <= ~var8) {
                                 do {
                                    int var9 = -arg4 + var8;
                                    int var10 = -arg0 + var7;
                                    if (~var9 < ~(-arg2) && ~var9 > ~arg2 && ~var10 < ~(-arg2) && var10 < arg2 && arg1[arg2 + var9][arg2 + var10]) {
                                       this.field1827.method4160((int)(this.field1818.method2962(-1) * 255.0F) << 24, 2);
                                       this.field1827.method4144((class7)null, (byte)71, this.field1814, this.field1815, (class7)null);
                                       this.field1827.method4136(4, this.field1824, 0, this.field1835, 81);
                                       return;
                                    }

                                    ++var8;
                                 } while(~this.field1829 <= ~var8);
                              }

                              ++var7;
                           } while(var7 <= this.field1836);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1841[4] + arg0 + ',' + (arg1 != null ? field1841[3] : field1841[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(IS)V",
      line = 67
   )
   private final void method1127(int arg0, short arg1) {
      try {
         label20: {
            if (!this.field1827.field8469) {
               this.field1838.method1205(117, arg1);
               if (!client.field4360) {
                  break label20;
               }
            }

            this.field1838.method1185(arg1, true);
         }

         ++field1816;
         if (arg0 <= 2) {
            this.field1829 = -124;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1841[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(Z)V",
      line = 97
   )
   public static void method1128(boolean arg0) {
      try {
         field1828 = null;
         field1826 = null;
         field1839 = null;
         if (arg0) {
            method1130(38);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1841[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(BIIIIII)V",
      line = 112
   )
   private final void method1129(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field1821;
         long var9 = -1L;
         int var11 = (arg2 << this.field1822.field4065) + arg1;
         int var12 = arg5 - -(arg4 << this.field1822.field4065);
         int var13 = this.field1822.method2220(var12, var11, -49);
         if (~(127 & arg1) == -1 || (127 & arg5) == 0) {
            var9 = 65535L & (long)var11 | ((long)var12 & 65535L) << 16;
            class428 var14 = this.field1837.method329((byte)-87, var9);
            if (var14 != null) {
               this.method1127(103, ((class275)var14).field3766);
               return;
            }
         }

         short var15 = (short)(this.field1819++);
         if (var9 != -1L) {
            this.field1837.method336(-1, var9, new class275(var15));
         }

         float var16;
         float var17;
         float var18;
         label102: {
            if (~arg1 == -1 && arg5 == 0) {
               var16 = this.field1831[arg6][arg3];
               var17 = this.field1823[arg6][arg3];
               var18 = this.field1825[arg6][arg3];
               if (!var8) {
                  break label102;
               }
            }

            if (this.field1822.field4062 == arg1 && ~arg5 == -1) {
               var17 = this.field1823[arg6 + 1][arg3];
               var18 = this.field1825[arg6 + 1][arg3];
               var16 = this.field1831[arg6 + 1][arg3];
               if (!var8) {
                  break label102;
               }
            }

            if (this.field1822.field4062 == arg1 && ~this.field1822.field4062 == ~arg5) {
               var17 = this.field1823[arg6 + 1][arg3 - -1];
               var16 = this.field1831[arg6 + 1][arg3 + 1];
               var18 = this.field1825[arg6 - -1][arg3 + 1];
               if (!var8) {
                  break label102;
               }
            }

            if (~arg1 == -1 && ~this.field1822.field4062 == ~arg5) {
               var18 = this.field1825[arg6][arg3 - -1];
               var17 = this.field1823[arg6][arg3 + 1];
               var16 = this.field1831[arg6][arg3 + 1];
               if (!var8) {
                  break label102;
               }
            }

            float var19 = (float)arg1 / (float)this.field1822.field4062;
            float var20 = (float)arg5 / (float)this.field1822.field4062;
            float var21 = this.field1823[arg6][arg3];
            float var22 = this.field1825[arg6][arg3];
            float var23 = this.field1831[arg6][arg3];
            float var24 = this.field1823[arg6 + 1][arg3];
            float var25 = this.field1825[arg6 + 1][arg3];
            float var26 = this.field1831[arg6 + 1][arg3];
            float var27 = (this.field1823[arg6 + 1][arg3 + 1] - var24) * var19 + var24;
            float var28 = (this.field1825[arg6][arg3 + 1] - var22) * var19 + var22;
            float var29 = (this.field1823[arg6][arg3 + 1] - var21) * var19 + var21;
            float var30 = (this.field1831[arg6][arg3 + 1] + -var23) * var19 + var23;
            float var31 = (this.field1825[arg6 + 1][arg3 + 1] - var25) * var19 + var25;
            var17 = (var27 - var29) * var20 + var29;
            var18 = (var31 - var28) * var20 + var28;
            float var32 = (this.field1831[arg6 + 1][arg3 - -1] + -var26) * var19 + var26;
            var16 = (var32 - var30) * var20 + var30;
         }

         float var33 = (float)(this.field1818.method2955(false) - var11);
         float var34 = (float)(-var13 + this.field1818.method2959(1));
         float var35 = (float)(this.field1818.method2963(true) - var12);
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var33 * var37;
         float var39 = var35 * var37;
         float var40 = var34 * var37;
         float var41 = var36 / (float)this.field1818.method2958((byte)120);
         float var42 = -(var41 * var41) + 1.0F;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var16 * var39 + var17 * var38 + var18 * var40;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         int var44 = -24 % ((3 - arg0) / 57);
         float var45 = var42 * var43 * 2.0F;
         if (var45 > 1.0F) {
            var45 = 1.0F;
         }

         int var46 = this.field1818.method2961(111);
         int var47 = (int)((float)((16762641 & var46) >> 16) * var45);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48 = (int)((float)(var46 >> 8 & 255) * var45);
         if (var48 > 255) {
            var48 = 255;
         }

         int var49 = (int)((float)(255 & var46) * var45);
         if (var49 > 255) {
            var49 = 255;
         }

         label61: {
            if (!this.field1827.field8469) {
               this.field1840.method699((float)var11, (byte)123);
               this.field1840.method699((float)var13, (byte)126);
               this.field1840.method699((float)var12, (byte)126);
               if (!var8) {
                  break label61;
               }
            }

            this.field1840.method701((float)var11, 1871583144);
            this.field1840.method701((float)var13, 1871583144);
            this.field1840.method701((float)var12, 1871583144);
         }

         this.field1840.method1186(var47, 0);
         this.field1840.method1186(var48, 0);
         this.field1840.method1186(var49, 0);
         this.field1840.method1186(255, 0);
         this.method1127(4, var15);
      } catch (RuntimeException var51) {
         throw class237.method1823(var51, field1841[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(I)I",
      line = 286
   )
   public static final int method1130(int arg0) {
      try {
         ++field1813;
         int var1 = class230.field3233.method1478(100);
         if (class285.field3948.length + -1 > var1) {
            class230.field3233 = class285.field3948[var1 + 1];
         }

         int var2 = 40 / ((18 - arg0) / 56);
         return 100;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1841[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "<init>",
      descriptor = "(Lea;Lkk;Lmn;[I)V",
      line = 306
   )
   public class144(class573 param1, class204 param2, class389 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
