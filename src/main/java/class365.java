import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class365 {
   @OriginalMember(
      owner = "client!vca",
      name = "s",
      descriptor = "F"
   )
   public float field5640 = 0.25F;
   @OriginalMember(
      owner = "client!vca",
      name = "k",
      descriptor = "F"
   )
   public float field5646 = 1.0F;
   @OriginalMember(
      owner = "client!vca",
      name = "t",
      descriptor = "F"
   )
   public float field5649 = 1.0F;
   @OriginalMember(
      owner = "client!vca",
      name = "p",
      descriptor = "F"
   )
   public float field5650;
   @OriginalMember(
      owner = "client!vca",
      name = "n",
      descriptor = "I"
   )
   public int field5639;
   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "F"
   )
   public float field5635;
   @OriginalMember(
      owner = "client!vca",
      name = "e",
      descriptor = "I"
   )
   public int field5654;
   @OriginalMember(
      owner = "client!vca",
      name = "x",
      descriptor = "Lpr;"
   )
   public class331 field5647;
   @OriginalMember(
      owner = "client!vca",
      name = "u",
      descriptor = "I"
   )
   public int field5637;
   @OriginalMember(
      owner = "client!vca",
      name = "d",
      descriptor = "F"
   )
   public float field5631;
   @OriginalMember(
      owner = "client!vca",
      name = "f",
      descriptor = "Lgg;"
   )
   public class429 field5632;
   @OriginalMember(
      owner = "client!vca",
      name = "q",
      descriptor = "I"
   )
   public int field5636;
   @OriginalMember(
      owner = "client!vca",
      name = "w",
      descriptor = "I"
   )
   public int field5651;
   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "I"
   )
   public int field5638;
   @OriginalMember(
      owner = "client!vca",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5657 = new String[]{method2971(method2970("eb}^7;")), method2971(method2970("h/2^\f")), method2971(method2970("}tp\u001c")), method2971(method2970("eb}^3;")), method2971(method2970("eb}^Mzou\u0004O;")), method2971(method2970("eb}^0;")), method2971(method2970("eb}^4;")), method2971(method2970("eb}^2;")), method2971(method2970("eb}^5;"))};
   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "[J"
   )
   public static long[] field5633 = new long[11];
   @OriginalMember(
      owner = "client!vca",
      name = "h",
      descriptor = "[[J"
   )
   public static long[][] field5643 = new long[8][256];
   @OriginalMember(
      owner = "client!vca",
      name = "o",
      descriptor = "Z"
   )
   public static volatile boolean field5653 = true;
   @OriginalMember(
      owner = "client!vca",
      name = "m",
      descriptor = "[F"
   )
   public static float[] field5655;
   @OriginalMember(
      owner = "client!vca",
      name = "g",
      descriptor = "[F"
   )
   public static float[] field5656;
   @OriginalMember(
      owner = "client!vca",
      name = "l",
      descriptor = "F"
   )
   public static float field5645;
   @OriginalMember(
      owner = "client!vca",
      name = "r",
      descriptor = "I"
   )
   public static int field5634;
   @OriginalMember(
      owner = "client!vca",
      name = "j",
      descriptor = "I"
   )
   public static int field5641;
   @OriginalMember(
      owner = "client!vca",
      name = "y",
      descriptor = "I"
   )
   public static int field5642;
   @OriginalMember(
      owner = "client!vca",
      name = "i",
      descriptor = "I"
   )
   public static int field5644;
   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "I"
   )
   public static int field5648;
   @OriginalMember(
      owner = "client!vca",
      name = "v",
      descriptor = "I"
   )
   public static int field5652;

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2964(boolean arg0) {
      try {
         field5643 = null;
         field5633 = null;
         field5656 = null;
         field5655 = null;
         if (!arg0) {
            method2964(true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5657[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(Lica;I)V"
   )
   public final void method2965(class354 arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg1 == 16384) {
            int var4;
            label127: {
               ++field5644;
               var4 = arg0.method2855(-31007);
               if (~class687.field10213.field513.method4463(arg1 ^ 480085927) != -2 || ~class659.field9850.method687() >= -1) {
                  if ((var4 & 1) != 0) {
                     arg0.method2894(125);
                  }

                  if ((2 & var4) != 0) {
                     arg0.method2848(-110);
                  }

                  if (~(var4 & 4) != -1) {
                     arg0.method2848(-96);
                  }

                  if (~(var4 & 8) != -1) {
                     arg0.method2848(-123);
                  }

                  this.field5650 = 1.2F;
                  this.field5635 = 0.69921875F;
                  this.field5637 = class589.field8679;
                  this.field5631 = 1.1523438F;
                  if (!var3) {
                     break label127;
                  }
               }

               label100: {
                  if (~(var4 & 1) == -1) {
                     this.field5637 = class589.field8679;
                     if (!var3) {
                        break label100;
                     }
                  }

                  this.field5637 = arg0.method2894(104);
               }

               label95: {
                  if (~(2 & var4) == -1) {
                     this.field5631 = 1.1523438F;
                     if (!var3) {
                        break label95;
                     }
                  }

                  this.field5631 = (float)arg0.method2848(arg1 ^ -16497) / 256.0F;
               }

               label90: {
                  if ((4 & var4) != 0) {
                     this.field5635 = (float)arg0.method2848(-92) / 256.0F;
                     if (!var3) {
                        break label90;
                     }
                  }

                  this.field5635 = 0.69921875F;
               }

               if (~(var4 & 8) == -1) {
                  this.field5650 = 1.2F;
                  if (!var3) {
                     break label127;
                  }
               }

               this.field5650 = (float)arg0.method2848(arg1 + -16488) / 256.0F;
            }

            label81: {
               if (~(16 & var4) == -1) {
                  this.field5639 = -50;
                  this.field5638 = -50;
                  this.field5654 = -60;
                  if (!var3) {
                     break label81;
                  }
               }

               this.field5638 = arg0.method2869(false);
               this.field5654 = arg0.method2869(false);
               this.field5639 = arg0.method2869(false);
            }

            label76: {
               if (~(32 & var4) == -1) {
                  this.field5651 = class582.field8595;
                  if (!var3) {
                     break label76;
                  }
               }

               this.field5651 = arg0.method2894(118);
            }

            label71: {
               if (~(var4 & 64) != -1) {
                  this.field5636 = arg0.method2848(-116);
                  if (!var3) {
                     break label71;
                  }
               }

               this.field5636 = 0;
            }

            if (~(var4 & 128) == -1) {
               this.field5647 = class185.field2897;
            } else {
               int var5 = arg0.method2848(-105);
               int var6 = arg0.method2848(-120);
               int var7 = arg0.method2848(-118);
               int var8 = arg0.method2848(arg1 ^ -16506);
               int var9 = arg0.method2848(-127);
               int var10 = arg0.method2848(-104);
               this.field5647 = class281.method2350(var5, 0, var6, var10, var9, var7, var8);
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field5657[7] + (arg0 != null ? field5657[1] : field5657[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(ILica;)V"
   )
   public final void method2966(int arg0, class354 arg1) {
      try {
         this.field5649 = (float)(8 * arg1.method2855(-31007)) / 255.0F;
         ++field5648;
         this.field5640 = (float)(arg1.method2855(-31007) * 8) / 255.0F;
         int var3 = -43 / ((30 - arg0) / 39);
         this.field5646 = (float)(arg1.method2855(-31007) * 8) / 255.0F;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5657[3] + arg0 + ',' + (arg1 != null ? field5657[1] : field5657[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method2967(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            method2964(false);
         }

         ++field5652;
         return arg1 >>> 8;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5657[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method2968(class354 arg0, int arg1) {
      try {
         if (arg1 != 2) {
            method2967(false, 125);
         }

         ++field5641;
         int var3 = arg0.method2848(arg1 + -129);
         int var4 = arg0.method2869(false);
         int var5 = arg0.method2869(false);
         int var6 = arg0.method2869(false);
         int var7 = arg0.method2848(arg1 ^ -119);
         class153.field2291 = var7;
         this.field5632 = class464.method3606(var4, 27718, var3, var6, var5);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field5657[5] + (arg0 != null ? field5657[1] : field5657[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(ILvca;)Z"
   )
   public final boolean method2969(int arg0, class365 arg1) {
      try {
         ++field5642;
         if (arg0 != -1) {
            field5655 = null;
         }

         return this.field5637 == arg1.field5637 && this.field5631 == arg1.field5631 && this.field5635 == arg1.field5635 && this.field5650 == arg1.field5650 && this.field5640 == arg1.field5640 && this.field5649 == arg1.field5649 && this.field5646 == arg1.field5646 && this.field5651 == arg1.field5651 && this.field5636 == arg1.field5636 && this.field5647 == arg1.field5647 && this.field5632 == arg1.field5632;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5657[6] + arg0 + ',' + (arg1 != null ? field5657[1] : field5657[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "()V"
   )
   public class365() {
      try {
         this.field5650 = 1.2F;
         this.field5639 = -50;
         this.field5635 = 0.69921875F;
         this.field5654 = -60;
         this.field5647 = class185.field2897;
         this.field5637 = class589.field8679;
         this.field5631 = 1.1523438F;
         this.field5632 = class735.field10951;
         this.field5636 = 0;
         this.field5651 = class582.field8595;
         this.field5638 = -50;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5657[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "(Lica;)V"
   )
   public class365(class354 arg0) {
      try {
         this.method2965(arg0, 16384);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5657[4] + (arg0 != null ? field5657[1] : field5657[2]) + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         char var6 = method2971(method2970("ᠰ웩螤Ŀ㛗틦祮酎惌鯿ꌟ笴᷼ힲ⸺﹄ᕶ㟹龀䪫壚⤋놼毵봬ყ쬿ջ\ue457䇺Ꝯ闙ﯲ簖\udd66䞍쨬뼛괪荂挑ꩰ젅䦩\uf292宛騧㊬\ue97f헱뻞㑉ｦ逯’᪽둕錾撁獣䀛쏭\udbbd赍靱켸皃혇뗟模䗠ヮ㽉ꊚ旋⿓\ude1dﵑ鈅ۻ답พ拈꣦領╊葳㥐师㣽톶\ue260댽鱮䎶ﰗ冘洑絛繕㮸츐轒랛㳰铤뤒ⳏ\ue71e쑲噗羨⪧섣\udc7a鵿ㅵ\uf65a곹ᒐᘩ椈炪킝찳颷⡝\uf89a")).charAt(var0 / 2);
         long var7 = (long)(~(var0 & 1) == -1 ? var6 >>> 8 : 255 & var6);
         long var9 = var7 << 1;
         if (~var9 <= -257L) {
            var9 ^= 285L;
         }

         long var11 = var9 << 1;
         if (~var11 <= -257L) {
            var11 ^= 285L;
         }

         long var13 = var7 ^ var11;
         long var15 = var11 << 1;
         if (~var15 <= -257L) {
            var15 ^= 285L;
         }

         long var17 = var7 ^ var15;
         field5643[0][var0] = class686.method5061(class686.method5061(var9 << 8, class686.method5061(var13 << 16, class686.method5061(class686.method5061(var7 << 32, class686.method5061(class686.method5061(var7 << 56, var7 << 48), var11 << 40)), var15 << 24))), var17);

         for(int var19 = 1; ~var19 > -9; ++var19) {
            field5643[var19][var0] = class686.method5061(field5643[var19 + -1][var0] << 56, field5643[var19 - 1][var0] >>> 8);
         }
      }

      field5633[0] = 0L;

      for(int var1 = 1; ~var1 >= -11; ++var1) {
         int var5 = (var1 - 1) * 8;
         field5633[var1] = class757.method5554(class757.method5554(class757.method5554(class757.method5554(class757.method5554(class704.method5193(field5643[3][var5 + 3], 1095216660480L), class757.method5554(class704.method5193(field5643[2][var5 + 2], 280375465082880L), class757.method5554(class704.method5193(-72057594037927936L, field5643[0][var5]), class704.method5193(field5643[1][var5 - -1], 71776119061217280L)))), class704.method5193(field5643[4][var5 - -4], 4278190080L)), class704.method5193(16711680L, field5643[5][var5 - -5])), class704.method5193(65280L, field5643[6][var5 + 6])), class704.method5193(255L, field5643[7][var5 + 7]));
      }

      field5655 = new float[16384];
      field5656 = new float[16384];
      double var2 = 3.834951969714103E-4D;

      for(int var4 = 0; var4 < 16384; ++var4) {
         field5655[var4] = (float)Math.sin((double)var4 * var2);
         field5656[var4] = (float)Math.cos((double)var4 * var2);
      }

   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
