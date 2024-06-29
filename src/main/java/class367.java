import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class367 {
   @OriginalMember(
      owner = "client!qca",
      name = "h",
      descriptor = "I"
   )
   public int field5103 = 512;
   @OriginalMember(
      owner = "client!qca",
      name = "p",
      descriptor = "Z"
   )
   public boolean field5111 = true;
   @OriginalMember(
      owner = "client!qca",
      name = "k",
      descriptor = "Z"
   )
   public boolean field5115 = true;
   @OriginalMember(
      owner = "client!qca",
      name = "c",
      descriptor = "I"
   )
   public int field5112 = -1;
   @OriginalMember(
      owner = "client!qca",
      name = "n",
      descriptor = "I"
   )
   private int field5109 = 0;
   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5121 = new String[]{method2902(method2901(">Ct\u000b\u001ag")), method2902(method2901("#OrB:+O`Q")), method2902(method2901("!UyI")), method2902(method2901("4\u000e;\u000b\"")), method2902(method2901(">Ct\u000b\u0017g")), method2902(method2901(">Ct\u000b\u001cg")), method2902(method2901(">Ct\u000b\u001bg")), method2902(method2901(">Ct\u000b\u0018g")), method2902(method2901(">Ct\u000b\u001dg")), method2902(method2901(">Ct\u000b\u001eg")), method2902(method2901(">Ct\u000b\u0019g"))};
   @OriginalMember(
      owner = "client!qca",
      name = "q",
      descriptor = "Laka;"
   )
   public static class418 field5119 = new class418(45, -2);
   @OriginalMember(
      owner = "client!qca",
      name = "g",
      descriptor = "I"
   )
   public static int field5104;
   @OriginalMember(
      owner = "client!qca",
      name = "j",
      descriptor = "I"
   )
   public int field5105;
   @OriginalMember(
      owner = "client!qca",
      name = "o",
      descriptor = "I"
   )
   public static int field5106;
   @OriginalMember(
      owner = "client!qca",
      name = "r",
      descriptor = "I"
   )
   public int field5107;
   @OriginalMember(
      owner = "client!qca",
      name = "i",
      descriptor = "I"
   )
   public static int field5108;
   @OriginalMember(
      owner = "client!qca",
      name = "d",
      descriptor = "I"
   )
   public static int field5110;
   @OriginalMember(
      owner = "client!qca",
      name = "f",
      descriptor = "I"
   )
   public static int field5113;
   @OriginalMember(
      owner = "client!qca",
      name = "b",
      descriptor = "I"
   )
   public static int field5114;
   @OriginalMember(
      owner = "client!qca",
      name = "e",
      descriptor = "I"
   )
   public int field5116;
   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "I"
   )
   public static int field5117;
   @OriginalMember(
      owner = "client!qca",
      name = "l",
      descriptor = "I"
   )
   public int field5118;
   @OriginalMember(
      owner = "client!qca",
      name = "m",
      descriptor = "I"
   )
   public static int field5120;

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method2893(boolean arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         class594[] var3 = class387.field5366;
         int var4 = 0;
         class594 var5;
         if (var2) {
            var5 = var3[var4];
            var5.method4422((byte)-102);
            ++var4;
         }

         while(~var4 > ~var3.length) {
            var5 = var3[var4];
            var5.method4422((byte)-102);
            ++var4;
         }

         ++field5113;
         class553.method4183(22744);
         class230.method1829((byte)58);
         class469.method3563();
         if (arg1 != 255) {
            field5119 = null;
         }

         int var6 = 0;
         if (var2) {
            class324.field4438[var6].method2596(arg1 + 8873);
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               class324.field4438[var6].method2596(arg1 + 8873);
               ++var6;
            }

            class359.method2833(30, false);
            System.gc();
            class389.method3068(-16164, 2);
            class477.field6647 = false;
            class614.field9048 = -1;
            class318.method2514(70);
            class768.method5549(true, -128);
            class620.method4583((byte)-128);
            class704.method5117(-1);
            class134.method1125(false);
            if (!var2) {
               if (!arg0) {
                  class577.method4324((byte)-127, 3);

                  try {
                     class537.method4076(field5121[1], class152.field1893, false);
                     return;
                  } catch (Throwable var8) {
                     return;
                  }
               }

               class577.method4324((byte)-128, 13);
               return;
            }

            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5121[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(IB)V"
   )
   private final void method2894(int arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5104;
         if (arg1 != 98) {
            this.field5118 = -14;
         }

         double var4 = (double)(255 & arg0 >> 16) / 256.0D;
         double var6 = (double)(255 & arg0 >> 8) / 256.0D;
         double var8 = (double)(arg0 & 255) / 256.0D;
         double var10 = var4;
         if (var4 > var6) {
            var10 = var6;
         }

         if (var10 > var8) {
            var10 = var8;
         }

         double var12 = var4;
         if (var4 < var6) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         double var14 = 0.0D;
         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            if (var18 < 0.5D) {
               var16 = (var12 - var10) / (var10 + var12);
            }

            label101: {
               if (var4 == var12) {
                  var14 = (var6 - var8) / (var12 - var10);
                  if (!var3) {
                     break label101;
                  }
               }

               if (var6 != var12) {
                  if (var8 != var12) {
                     break label101;
                  }

                  var14 = (var4 - var6) / (var12 - var10) + 4.0D;
                  if (!var3) {
                     break label101;
                  }
               }

               var14 = (var8 - var4) / (var12 - var10) + 2.0D;
            }

            if (var18 >= 0.5D) {
               var16 = (-var10 + var12) / (-var12 + 2.0D + -var10);
            }
         }

         double var20;
         label75: {
            this.field5116 = (int)(var16 * 256.0D);
            this.field5118 = (int)(var18 * 256.0D);
            var20 = var14 / 6.0D;
            if (this.field5118 >= 0) {
               if (~this.field5118 >= -256) {
                  break label75;
               }

               this.field5118 = 255;
               if (!var3) {
                  break label75;
               }
            }

            this.field5118 = 0;
         }

         label68: {
            if (var18 > 0.5D) {
               this.field5107 = (int)((1.0D - var18) * var16 * 512.0D);
               if (!var3) {
                  break label68;
               }
            }

            this.field5107 = (int)(var16 * var18 * 512.0D);
         }

         label63: {
            if (~this.field5116 > -1) {
               this.field5116 = 0;
               if (!var3) {
                  break label63;
               }
            }

            if (~this.field5116 < -256) {
               this.field5116 = 255;
            }
         }

         if (this.field5107 < 1) {
            this.field5107 = 1;
         }

         this.field5105 = (int)((double)this.field5107 * var20);
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field5121[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method2895(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg1.method640(255);
            if (~var4 != -1) {
               this.method2898((byte)78, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != -1) {
               this.field5105 = -12;
            }

            ++field5106;
            break;
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5121[9] + arg0 + ',' + (arg1 != null ? field5121[3] : field5121[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2896(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 262144) {
            return false;
         } else {
            ++field5117;
            return ~(arg1 & 262144) != -1 | class516.method3886((byte)67, arg1, arg0) || class481.method3656(true, arg0, arg1);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5121[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2897(byte arg0) {
      try {
         field5119 = null;
         if (arg0 < 116) {
            field5119 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5121[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(BLgea;I)V"
   )
   private final void method2898(byte arg0, class66 arg1, int arg2) {
      try {
         int var4 = -25 / ((-19 - arg0) / 60);
         ++field5110;
         if (arg2 != 1) {
            if (arg2 != 2) {
               if (~arg2 == -4) {
                  this.field5103 = arg1.method603(-2) << 2;
                  return;
               }

               if (arg2 != 4) {
                  if (~arg2 == -6) {
                     this.field5115 = false;
                     return;
                  }
               } else {
                  this.field5111 = false;
               }

               return;
            }

            this.field5112 = arg1.method603(-2);
            if (~this.field5112 == -65536) {
               this.field5112 = -1;
               return;
            }
         } else {
            this.field5109 = arg1.method645((byte)-26);
            this.method2894(this.field5109, (byte)98);
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5121[4] + arg0 + ',' + (arg1 != null ? field5121[3] : field5121[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method2899(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      boolean var5 = client.field1481;

      try {
         ++field5108;
         int var6 = 0;
         int var7 = arg4;
         int var8 = -arg4;
         int var9 = -1;
         class385.method3045(arg2, arg1 + arg4, class237.field3001[arg0], -arg4 + arg1, (byte)-67);
         int var10000;
         byte var10001;
         if (var5) {
            var9 += 2;
            var8 += var9;
            ++var6;
            var10000 = ~var8;
            var10001 = -1;
         } else if (~var6 <= ~arg4) {
            var10000 = arg3;
            var10001 = 7;
            if (!var5) {
               if (arg3 != 7) {
                  method2899(112, -10, -16, (byte)-28, -62);
                  return;
               }

               return;
            }
         } else {
            var9 += 2;
            var8 += var9;
            ++var6;
            var10000 = ~var8;
            var10001 = -1;
         }

         while(true) {
            if (var10000 <= var10001) {
               --var7;
               var8 -= var7 << 1;
               int[] var10 = class237.field3001[arg0 + var7];
               int[] var11 = class237.field3001[-var7 + arg0];
               int var12 = arg1 - -var6;
               int var13 = -var6 + arg1;
               class385.method3045(arg2, var12, var10, var13, (byte)-94);
               class385.method3045(arg2, var12, var11, var13, (byte)-105);
            }

            int var14 = arg1 + var7;
            int var15 = arg1 - var7;
            int[] var16 = class237.field3001[arg0 - -var6];
            int[] var17 = class237.field3001[-var6 + arg0];
            class385.method3045(arg2, var14, var16, var15, (byte)-116);
            class385.method3045(arg2, var14, var17, var15, (byte)-116);
            if (~var6 <= ~var7) {
               var10000 = arg3;
               var10001 = 7;
               if (!var5) {
                  if (arg3 != 7) {
                     method2899(112, -10, -16, (byte)-28, -62);
                     return;
                  }

                  return;
               }
            } else {
               var9 += 2;
               var8 += var9;
               ++var6;
               var10000 = ~var8;
               var10001 = -1;
            }
         }
      } catch (RuntimeException var19) {
         throw class93.method866(var19, field5121[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(II)Lhia;"
   )
   public static final class49 method2900(int arg0, int arg1) {
      try {
         ++field5114;
         class49 var2 = new class49(arg0, false);
         if (arg1 >= -89) {
            field5120 = -107;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5121[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2901(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2902(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
