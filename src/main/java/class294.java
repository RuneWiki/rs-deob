import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class294 extends class606 {
   @OriginalMember(
      owner = "client!dka",
      name = "N",
      descriptor = "I"
   )
   private int field4380 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "E",
      descriptor = "I"
   )
   private int field4379 = 20;
   @OriginalMember(
      owner = "client!dka",
      name = "I",
      descriptor = "I"
   )
   private int field4382 = 1365;
   @OriginalMember(
      owner = "client!dka",
      name = "D",
      descriptor = "I"
   )
   private int field4391 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4392 = new String[]{method2462(method2461("X A#;\u0014")), method2462(method2461("X A#5\u0014")), method2462(method2461("X A#:\u0014")), method2462(method2461("Ge\u000e#\u000f")), method2462(method2461("X A#3\u0014")), method2462(method2461("R>La")), method2462(method2461("X A#7\u0014")), method2462(method2461("X A#1\u0014")), method2462(method2461("X A#8\u0014"))};
   @OriginalMember(
      owner = "client!dka",
      name = "G",
      descriptor = "I"
   )
   public static int field4383 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "Q",
      descriptor = "Ldi;"
   )
   public static class577 field4385 = new class577(7, 2);
   @OriginalMember(
      owner = "client!dka",
      name = "F",
      descriptor = "I"
   )
   public static int field4381;
   @OriginalMember(
      owner = "client!dka",
      name = "P",
      descriptor = "I"
   )
   public static int field4384;
   @OriginalMember(
      owner = "client!dka",
      name = "O",
      descriptor = "I"
   )
   public static int field4386;
   @OriginalMember(
      owner = "client!dka",
      name = "L",
      descriptor = "I"
   )
   public static int field4387;
   @OriginalMember(
      owner = "client!dka",
      name = "M",
      descriptor = "I"
   )
   public static int field4388;
   @OriginalMember(
      owner = "client!dka",
      name = "K",
      descriptor = "I"
   )
   public static int field4390;
   @OriginalMember(
      owner = "client!dka",
      name = "J",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4389;

   @OriginalMember(
      owner = "client!dka",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method2456(byte arg0) {
      try {
         field4385 = null;
         if (arg0 > 79) {
            field4389 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4392[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "<init>",
      descriptor = "()V"
   )
   public class294() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public static final int method2457(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            field4389 = null;
         }

         ++field4387;
         int var3 = arg1 >>> 31;
         return (arg1 + var3) / arg0 + -var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4392[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method2458(int arg0, boolean arg1, int arg2) {
      try {
         ++field4386;
         if (arg1) {
            method2457(-39, 8, false);
         }

         return ~(arg0 & 24) != -1 | (arg0 & 544) == 544;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4392[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method2459(int arg0, byte arg1, int arg2) {
      try {
         ++field4390;
         if (arg1 > -29) {
            return true;
         } else {
            return (2048 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4392[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(CI)Z"
   )
   public static final boolean method2460(char arg0, int arg1) {
      try {
         ++field4384;
         if (arg1 != -3) {
            field4383 = 27;
         }

         return arg0 == 160 || arg0 == ' ' || arg0 == '_' || ~arg0 == -46;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4392[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field4381;
         if (arg0 != 0) {
            method2456((byte)-11);
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int var5 = 0;
            int var10000;
            int var10001;
            if (var3 || ~var5 > ~class563.field8014) {
               label67:
               do {
                  do {
                     int var14;
                     label63: {
                        int var6 = (class387.field5650[var5] << 12) / this.field4382 - -this.field4391;
                        int var7 = (class693.field10001[arg1] << 12) / this.field4382 + this.field4380;
                        int var8 = var6;
                        int var9 = var7;
                        int var10 = var6;
                        int var11 = var7;
                        int var12 = var6 * var6 >> 12;
                        int var13 = var7 * var7 >> 12;
                        var14 = 0;
                        if (!var3) {
                           if (var12 + var13 >= 16384) {
                              break label63;
                           }

                           var10000 = this.field4379;
                           var10001 = var14;
                           if (var3) {
                              continue label67;
                           }

                           if (var10000 <= var14) {
                              break label63;
                           }
                        }

                        do {
                           var11 = (var10 * var11 >> 12) * 2 + var9;
                           var10 = -var13 + var8 + var12;
                           ++var14;
                           var12 = var10 * var10 >> 12;
                           var13 = var11 * var11 >> 12;
                           if (var12 + var13 >= 16384) {
                              break;
                           }

                           var10000 = this.field4379;
                           var10001 = var14;
                           if (var3) {
                              continue label67;
                           }
                        } while(var10000 > var14);
                     }

                     var4[var5] = var14 < this.field4379 + -1 ? (var14 << 12) / this.field4379 : 0;
                     ++var5;
                  } while(~var5 > ~class563.field8014);

                  return var4;
               } while(var10000 > var10001);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field4392[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     if (~arg1 != -1) {
                        if (~arg1 == -2) {
                           break label52;
                        }

                        if (~arg1 == -3) {
                           break label53;
                        }

                        if (~arg1 != -4) {
                           break label55;
                        }

                        if (!var4) {
                           break label54;
                        }
                     }

                     this.field4382 = arg0.method685(-2);
                     if (!var4) {
                        break label55;
                     }
                  }

                  this.field4379 = arg0.method685(-2);
                  if (!var4) {
                     break label55;
                  }
               }

               this.field4391 = arg0.method685(-2);
               if (!var4) {
                  break label55;
               }
            }

            this.field4380 = arg0.method685(-2);
         }

         if (arg2 > -6) {
            this.field4391 = -112;
         }

         ++field4388;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4392[4] + (arg0 != null ? field4392[3] : field4392[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2461(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2462(char[] arg0) {
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
            var10005 = 75;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
