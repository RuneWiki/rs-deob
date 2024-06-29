import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class245 extends class629 {
   @OriginalMember(
      owner = "client!ec",
      name = "I",
      descriptor = "I"
   )
   private int field3517 = 1024;
   @OriginalMember(
      owner = "client!ec",
      name = "F",
      descriptor = "I"
   )
   private int field3519 = 3072;
   @OriginalMember(
      owner = "client!ec",
      name = "K",
      descriptor = "I"
   )
   private int field3524 = 2048;
   @OriginalMember(
      owner = "client!ec",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3529 = new String[]{method1994(method1993("&~y;")), method1994(method1993("-h;\u0012\u0013")), method1994(method1993("3%;yF")), method1994(method1993("-h;\u001d\u0013")), method1994(method1993("-h;\u001a\u0013")), method1994(method1993("-h;\u001b\u0013")), method1994(method1993("-h;\u0019\u0013")), method1994(method1993("-h;\u0007\u0013")), method1994(method1993("-h;\u001e\u0013")), method1994(method1993("-h;\u0018\u0013"))};
   @OriginalMember(
      owner = "client!ec",
      name = "J",
      descriptor = "J"
   )
   public static long field3518 = 0L;
   @OriginalMember(
      owner = "client!ec",
      name = "D",
      descriptor = "Lgh;"
   )
   public static class572 field3521 = new class572(131, -2);
   @OriginalMember(
      owner = "client!ec",
      name = "P",
      descriptor = "I"
   )
   public static int field3528 = -1;
   @OriginalMember(
      owner = "client!ec",
      name = "O",
      descriptor = "I"
   )
   public static int field3514;
   @OriginalMember(
      owner = "client!ec",
      name = "R",
      descriptor = "I"
   )
   public static int field3515;
   @OriginalMember(
      owner = "client!ec",
      name = "G",
      descriptor = "I"
   )
   public static int field3516;
   @OriginalMember(
      owner = "client!ec",
      name = "L",
      descriptor = "I"
   )
   public static int field3520;
   @OriginalMember(
      owner = "client!ec",
      name = "E",
      descriptor = "I"
   )
   public static int field3522;
   @OriginalMember(
      owner = "client!ec",
      name = "H",
      descriptor = "I"
   )
   public static int field3523;
   @OriginalMember(
      owner = "client!ec",
      name = "Q",
      descriptor = "I"
   )
   public static int field3525;
   @OriginalMember(
      owner = "client!ec",
      name = "M",
      descriptor = "[Llja;"
   )
   public static class743[] field3527;
   @OriginalMember(
      owner = "client!ec",
      name = "N",
      descriptor = "[[B"
   )
   public static byte[][] field3526;

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method1988(int arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         label46: {
            if (~arg0 != -38) {
               if (arg0 == 50) {
                  class370.field5484 = 4.0F;
                  if (!var2) {
                     break label46;
                  }
               }

               if (~arg0 != -76) {
                  if (arg0 != 100) {
                     if (~arg0 != -201) {
                        break label46;
                     }

                     class370.field5484 = 16.0F;
                     if (!var2) {
                        break label46;
                     }
                  }

                  class370.field5484 = 8.0F;
                  if (!var2) {
                     break label46;
                  }
               }

               class370.field5484 = 6.0F;
               if (!var2) {
                  break label46;
               }
            }

            class370.field5484 = 3.0F;
         }

         class3.field22 = -1;
         ++field3525;
         if (arg1 == -2548) {
            class3.field22 = -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3529[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "([I[Ljava/lang/String;I)V"
   )
   public static final void method1989(int[] arg0, String[] arg1, int arg2) {
      try {
         if (arg2 == 25555) {
            class353.method2714(0, arg0, arg1, -87, arg1.length + -1);
            ++field3523;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3529[4] + (arg0 != null ? field3529[2] : field3529[0]) + ',' + (arg1 != null ? field3529[2] : field3529[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(III)Lnm;"
   )
   public static final class496 method1990(int arg0, int arg1, int arg2) {
      class600 var3 = class90.field1473[arg0][arg1][arg2];
      return var3 == null ? null : var3.field8659;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 2048) {
            return null;
         } else {
            ++field3516;
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int[] var5 = this.method4622((byte)116, 0, arg0);
               int var6 = 0;
               if (var3 || class66.field1214 > var6) {
                  do {
                     var4[var6] = (var5[var6] * this.field3524 >> 12) + this.field3517;
                     ++var6;
                  } while(class66.field1214 > var6);
               }
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3529[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(BLjfa;IILha;I)V"
   )
   public static final void method1991(byte arg0, class303 arg1, int arg2, int arg3, class65 arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         if (arg0 >= -1) {
            method1991((byte)-65, (class303)null, -25, 86, (class65)null, 24);
         }

         ++field3520;
         int var7 = 7;
         if (var6 || ~var7 <= -1) {
            do {
               int var8 = 127;
               if (var6 || ~var8 <= -1) {
                  do {
                     int var9 = var8 & 127 | (var7 & 7) << 7 | arg2 << 10 & 64512;
                     class294.method2297(false, true, -18330);
                     int var10 = class451.field6600[var9];
                     class741.method5347(false, 63, true);
                     arg4.method295((arg1.field4308 * var8 >> 7) + arg3, arg5 - -((-var7 + 7) * arg1.field4226 >> 3), (arg1.field4308 >> 7) + 1, (arg1.field4226 >> 3) + 1, var10, 0);
                     --var8;
                  } while(~var8 <= -1);
               }

               --var7;
            } while(~var7 <= -1);

         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field3529[7] + arg0 + ',' + (arg1 != null ? field3529[2] : field3529[0]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3529[2] : field3529[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method901(int arg0) {
      try {
         if (arg0 != 245880940) {
            this.field3519 = -3;
         }

         ++field3515;
         this.field3524 = -this.field3517 + this.field3519;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3529[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label57: {
            label51: {
               label50: {
                  ++field3514;
                  if (~arg2 != -1) {
                     if (arg2 == 1) {
                        break label50;
                     }

                     if (arg2 != 2) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field3517 = arg0.method3565(true);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field3519 = arg0.method3565(true);
               if (!var4) {
                  break label57;
               }
            }

            super.field9166 = ~arg0.method3564((byte)-119) == -2;
         }

         if (arg1 != 0) {
            method1988(76, 29);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3529[1] + (arg0 != null ? field3529[2] : field3529[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3522;
         if (arg1 != 0) {
            method1989((int[])null, (String[])null, 114);
         }

         int[][] var4 = super.field9169.method785((byte)36, arg0);
         if (super.field9169.field1332) {
            int[][] var5 = this.method4621(arg1 ^ -117, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || class66.field1214 > var12) {
               do {
                  var9[var12] = this.field3517 - -(var6[var12] * this.field3524 >> 12);
                  var10[var12] = (var7[var12] * this.field3524 >> 12) + this.field3517;
                  var11[var12] = (var8[var12] * this.field3524 >> 12) + this.field3517;
                  ++var12;
               } while(class66.field1214 > var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field3529[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "()V"
   )
   public class245() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ec",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1992(int arg0) {
      try {
         if (arg0 != -1791695705) {
            field3521 = null;
         }

         field3527 = null;
         field3526 = null;
         field3521 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3529[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1993(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1994(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
