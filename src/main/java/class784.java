import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class784 extends class70 {
   @OriginalMember(
      owner = "client!lia",
      name = "K",
      descriptor = "I"
   )
   private int field11513 = -1;
   @OriginalMember(
      owner = "client!lia",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11516 = new String[]{method5698(method5697("?$\b\u001aN{")), method5698(method5697("?$\b\u001aI{")), method5698(method5697("?$\b\u001aE{")), method5698(method5697("(cG\u001ay")), method5698(method5697("=8\u0005X")), method5698(method5697("?$\b\u001aH{")), method5698(method5697("?$\b\u001aU{")), method5698(method5697("?$\b\u001aL{"))};
   @OriginalMember(
      owner = "client!lia",
      name = "H",
      descriptor = "I"
   )
   private int field11507;
   @OriginalMember(
      owner = "client!lia",
      name = "M",
      descriptor = "I"
   )
   public static int field11508;
   @OriginalMember(
      owner = "client!lia",
      name = "N",
      descriptor = "I"
   )
   public static int field11509;
   @OriginalMember(
      owner = "client!lia",
      name = "Q",
      descriptor = "I"
   )
   private int field11510;
   @OriginalMember(
      owner = "client!lia",
      name = "L",
      descriptor = "I"
   )
   public static int field11511;
   @OriginalMember(
      owner = "client!lia",
      name = "J",
      descriptor = "I"
   )
   public static int field11512;
   @OriginalMember(
      owner = "client!lia",
      name = "F",
      descriptor = "I"
   )
   public static int field11514;
   @OriginalMember(
      owner = "client!lia",
      name = "O",
      descriptor = "I"
   )
   public static int field11515;
   @OriginalMember(
      owner = "client!lia",
      name = "P",
      descriptor = "[I"
   )
   private int[] field11506;

   @OriginalMember(
      owner = "client!lia",
      name = "c",
      descriptor = "(I)I",
      line = 4
   )
   public final int method542(int arg0) {
      try {
         if (arg0 != -1) {
            this.field11510 = -97;
         }

         ++field11508;
         return this.field11513;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11516[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(II)[[I",
      line = 15
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11512;
         int[][] var4 = super.field918.method3276((byte)119, arg1);
         if (super.field918.field6361) {
            int var5 = (class304.field4744 != this.field11507 ? this.field11507 * arg1 / class304.field4744 : arg1) * this.field11510;
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (~class678.field10127 != ~this.field11510) {
               int var9 = 0;
               if (var3 || ~class678.field10127 < ~var9) {
                  do {
                     int var10 = this.field11510 * var9 / class678.field10127;
                     int var11 = this.field11506[var5 + var10];
                     var8[var9] = class408.method3277(4080, var11 << 4);
                     var7[var9] = class408.method3277(var11, 65280) >> 4;
                     var6[var9] = class408.method3277(var11, 16711680) >> 12;
                     ++var9;
                  } while(~class678.field10127 < ~var9);
               }

               if (!var3) {
                  return arg0 != 32 ? null : var4;
               }
            }

            int var12 = 0;
            if (var3 || ~class678.field10127 < ~var12) {
               do {
                  int var13 = this.field11506[var5++];
                  var8[var12] = class408.method3277(4080, var13 << 4);
                  var7[var12] = class408.method3277(var13, 65280) >> 4;
                  var6[var12] = class408.method3277(16711680, var13) >> 12;
                  ++var12;
               } while(~class678.field10127 < ~var12);
            }
         }

         return arg0 != 32 ? null : var4;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field11516[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(I)V",
      line = 83
   )
   public final void method541(int arg0) {
      try {
         ++field11515;
         super.method541(120);
         int var2 = 107 % ((arg0 - 7) / 60);
         this.field11506 = null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11516[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(III)V",
      line = 94
   )
   public final void method538(int arg0, int arg1, int arg2) {
      try {
         ++field11509;
         if (arg1 <= -69) {
            super.method538(arg0, -88, arg2);
            if (~this.field11513 <= -1 && class419.field6480 != null) {
               int var4 = !class419.field6480.method1373(this.field11513, (byte)-54).field6933 ? 128 : 64;
               this.field11506 = class419.field6480.method1375(var4, 1.0F, false, var4, this.field11513, -9197);
               this.field11510 = var4;
               this.field11507 = var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11516[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(BILjava/util/Random;)I",
      line = 116
   )
   public static final int method5696(byte arg0, int arg1, Random arg2) {
      try {
         ++field11514;
         if (arg1 <= 0) {
            throw new IllegalArgumentException();
         } else if (class140.method1285(arg1, arg0 + -11950)) {
            return (int)((4294967295L & (long)arg2.nextInt()) * (long)arg1 >> 32);
         } else {
            if (arg0 != 25) {
               method5696((byte)-83, 91, (Random)null);
            }

            int var3 = -((int)(4294967296L % (long)arg1)) + Integer.MIN_VALUE;

            int var4;
            do {
               var4 = arg2.nextInt();
            } while(var3 <= var4);

            return class409.method3280(var4, (byte)65, arg1);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11516[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11516[3] : field11516[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(IILica;)V",
      line = 147
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field11511;
         if (~arg1 == arg0) {
            this.field11513 = arg2.method2848(-121);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11516[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11516[3] : field11516[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "<init>",
      descriptor = "()V",
      line = 162
   )
   public class784() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5697(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5698(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
