import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class569 extends class302 {
   @OriginalMember(
      owner = "client!md",
      name = "O",
      descriptor = "I"
   )
   private int field8488 = 32768;
   @OriginalMember(
      owner = "client!md",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8490 = new String[]{method4221(method4220("WG,\n\u0018")), method4221(method4220("WG,\f\u0018")), method4221(method4220("WG,\u000b\u0018")), method4221(method4220("WG,\b\u0018")), method4221(method4220("TVn\"")), method4221(method4220("A\r,`M")), method4221(method4220("WG,\r\u0018")), method4221(method4220("WG,\u000f\u0018"))};
   @OriginalMember(
      owner = "client!md",
      name = "Q",
      descriptor = "I"
   )
   public static int field8481 = 1407;
   @OriginalMember(
      owner = "client!md",
      name = "P",
      descriptor = "I"
   )
   public static int field8485 = 0;
   @OriginalMember(
      owner = "client!md",
      name = "L",
      descriptor = "I"
   )
   public static int field8479;
   @OriginalMember(
      owner = "client!md",
      name = "I",
      descriptor = "I"
   )
   public static int field8480;
   @OriginalMember(
      owner = "client!md",
      name = "H",
      descriptor = "I"
   )
   public static int field8482;
   @OriginalMember(
      owner = "client!md",
      name = "S",
      descriptor = "I"
   )
   public static int field8483;
   @OriginalMember(
      owner = "client!md",
      name = "N",
      descriptor = "I"
   )
   public static int field8484;
   @OriginalMember(
      owner = "client!md",
      name = "K",
      descriptor = "I"
   )
   public static int field8489;
   @OriginalMember(
      owner = "client!md",
      name = "M",
      descriptor = "J"
   )
   public static long field8486;
   @OriginalMember(
      owner = "client!md",
      name = "R",
      descriptor = "[[Z"
   )
   public static boolean[][] field8487;

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(II)[I",
      line = 3
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8484;
         if (arg1 > -37) {
            method4218(27);
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 1);
            int[] var6 = this.method2299(arg0, false, 2);
            int var7 = 0;
            if (var3 != 0 || ~class344.field5238 < ~var7) {
               do {
                  int var8 = 255 & var5[var7] >> 4;
                  int var9 = var6[var7] * this.field8488 >> 12;
                  int var10 = class724.field10777[var8] * var9 >> 12;
                  int var11 = class731.field10851[var8] * var9 >> 12;
                  int var12 = class264.field3612 & (var10 >> 12) + var7;
                  int var13 = (var11 >> 12) + arg0 & class275.field3837;
                  int[] var14 = this.method2299(var13, false, 0);
                  var4[var7] = var14[var12];
                  ++var7;
               } while(~class344.field5238 < ~var7);
            }
         }

         return var4;
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field8490[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "<init>",
      descriptor = "()V",
      line = 52
   )
   public class569() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 55
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         if (arg1 != 0) {
            field8485 = 119;
         }

         label48: {
            label41: {
               if (~arg0 != -1) {
                  if (arg0 != 1) {
                     break label48;
                  }

                  if (var4 == 0) {
                     break label41;
                  }
               }

               this.field8488 = arg2.method1038((byte)-106) << 4;
               if (var4 == 0) {
                  break label48;
               }
            }

            super.field4313 = ~arg2.method1104(arg1 + 255) == -2;
         }

         ++field8483;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8490[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8490[5] : field8490[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "g",
      descriptor = "(I)V",
      line = 93
   )
   public static void method4218(int arg0) {
      try {
         if (arg0 != 1047757) {
            field8486 = -69L;
         }

         field8487 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8490[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "f",
      descriptor = "(I)V",
      line = 105
   )
   public static final void method4219(int arg0) {
      try {
         if (arg0 == -1056576788) {
            ++field8482;
            class792.field11511 = false;
            class491.method3635((byte)-19);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8490[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "a",
      descriptor = "(BI)[[I",
      line = 122
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8489;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            int[] var5 = this.method2299(arg1, false, 1);
            int[] var6 = this.method2299(arg1, false, 2);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int var10 = 0;
            if (var3 != 0 || ~var10 > ~class344.field5238) {
               do {
                  int var11 = (var5[var10] * 255 & 1047757) >> 12;
                  int var12 = var6[var10] * this.field8488 >> 12;
                  int var13 = class724.field10777[var11] * var12 >> 12;
                  int var14 = class731.field10851[var11] * var12 >> 12;
                  int var15 = var10 - -(var13 >> 12) & class264.field3612;
                  int var16 = (var14 >> 12) + arg1 & class275.field3837;
                  int[][] var17 = this.method2297(0, var16, 0);
                  var7[var10] = var17[0][var15];
                  var8[var10] = var17[1][var15];
                  var9[var10] = var17[2][var15];
                  ++var10;
               } while(~var10 > ~class344.field5238);
            }
         }

         if (arg0 != -90) {
            field8485 = 15;
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field8490[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "b",
      descriptor = "(B)V",
      line = 184
   )
   public final void method708(byte arg0) {
      try {
         ++field8480;
         if (arg0 >= -87) {
            this.method401(-58, 112);
         }

         class378.method2923(-119);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8490[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4220(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!md",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4221(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
