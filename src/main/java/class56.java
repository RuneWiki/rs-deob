import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 extends class264 {
   @OriginalMember(
      owner = "client!aea",
      name = "O",
      descriptor = "I"
   )
   private int field692 = 4096;
   @OriginalMember(
      owner = "client!aea",
      name = "P",
      descriptor = "I"
   )
   private int field694 = 0;
   @OriginalMember(
      owner = "client!aea",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field695 = new String[]{method438(method437("j\u0014;*\u0005#")), method438(method437("e\u00046h")), method438(method437("p_t*9")), method438(method437("j\u0014;*\u0000#")), method438(method437("j\u0014;*\u0001#")), method438(method437("j\u0014;*\u0006#")), method438(method437("j\u0014;*\u0003#")), method438(method437("j\u0014;*\u0007#"))};
   @OriginalMember(
      owner = "client!aea",
      name = "G",
      descriptor = "Z"
   )
   public static boolean field691 = false;
   @OriginalMember(
      owner = "client!aea",
      name = "M",
      descriptor = "Lbo;"
   )
   public static class762 field687 = new class762();
   @OriginalMember(
      owner = "client!aea",
      name = "N",
      descriptor = "I"
   )
   public static int field685;
   @OriginalMember(
      owner = "client!aea",
      name = "F",
      descriptor = "I"
   )
   public static int field686;
   @OriginalMember(
      owner = "client!aea",
      name = "L",
      descriptor = "I"
   )
   public static int field688;
   @OriginalMember(
      owner = "client!aea",
      name = "I",
      descriptor = "I"
   )
   public static int field689;
   @OriginalMember(
      owner = "client!aea",
      name = "H",
      descriptor = "I"
   )
   public static int field690;
   @OriginalMember(
      owner = "client!aea",
      name = "K",
      descriptor = "I"
   )
   public static int field693;

   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "(I)Z"
   )
   public static final boolean method434(int arg0) {
      try {
         ++field690;
         if (arg0 != 1) {
            field687 = null;
         }

         return class95.field1227;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field695[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method435(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field693;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            return null;
         } else {
            if (super.field3634.field8828) {
               int[][] var5 = this.method2015(0, (byte)76, arg0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || var12 < class430.field6152) {
                  do {
                     int var13 = var6[var12];
                     int var14 = var7[var12];
                     int var15 = var8[var12];
                     if (~var13 <= ~this.field694) {
                        label66: {
                           if (~this.field692 > ~var13) {
                              var9[var12] = this.field692;
                              if (!var3) {
                                 break label66;
                              }
                           }

                           var9[var12] = var13;
                           if (var3) {
                              var9[var12] = this.field694;
                           }
                        }
                     } else {
                        var9[var12] = this.field694;
                     }

                     if (this.field694 <= var14) {
                        label72: {
                           if (this.field692 < var14) {
                              var10[var12] = this.field692;
                              if (!var3) {
                                 break label72;
                              }
                           }

                           var10[var12] = var14;
                           if (var3) {
                              var10[var12] = this.field694;
                           }
                        }
                     } else {
                        var10[var12] = this.field694;
                     }

                     if (var15 >= this.field694) {
                        if (this.field692 >= var15) {
                           var11[var12] = var15;
                           if (!var3) {
                              ++var12;
                              continue;
                           }
                        }

                        var11[var12] = this.field692;
                        if (var3) {
                           var11[var12] = this.field694;
                           ++var12;
                        } else {
                           ++var12;
                        }
                     } else {
                        var11[var12] = this.field694;
                        ++var12;
                     }
                  } while(var12 < class430.field6152);
               }
            }

            return var4;
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field695[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label57: {
            label51: {
               label50: {
                  if (arg0 != 0) {
                     if (~arg0 == -2) {
                        break label50;
                     }

                     if (arg0 != 2) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field694 = arg1.method1211(-26166);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field692 = arg1.method1211(-26166);
               if (!var4) {
                  break label57;
               }
            }

            super.field3637 = arg1.method1143(-15465) == 1;
         }

         if (arg2 <= 49) {
            this.method4(-119, (byte)55);
         }

         ++field685;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field695[0] + arg0 + ',' + (arg1 != null ? field695[2] : field695[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method436(byte arg0) {
      try {
         int var1 = 68 / ((-27 - arg0) / 62);
         field687 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field695[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "<init>",
      descriptor = "()V"
   )
   public class56() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field686;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var5 = this.method2019(0, -27804, arg0);
            int var6 = 0;
            if (var3 || var6 < class430.field6152) {
               do {
                  int var7 = var5[var6];
                  if (this.field694 <= var7) {
                     if (~this.field692 <= ~var7) {
                        var4[var6] = var7;
                        if (!var3) {
                           ++var6;
                           continue;
                        }
                     }

                     var4[var6] = this.field692;
                     if (var3) {
                        var4[var6] = this.field694;
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var4[var6] = this.field694;
                     ++var6;
                  }
               } while(var6 < class430.field6152);
            }
         }

         int var8 = -107 % ((arg1 - 24) / 44);
         return var4;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field695[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method437(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method438(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
