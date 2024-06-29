import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public abstract class class633 extends class247 {
   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8986 = new String[]{method4634(method4633("Vrh\u000bi\u001b")), method4634(method4633("]meI")), method4634(method4633("H6'\u000bQ")), method4634(method4633("Vrh\u000bm\u001b")), method4634(method4633("Vrh\u000bo\u001b")), method4634(method4633("Vrh\u000bh\u001b"))};
   @OriginalMember(
      owner = "client!eja",
      name = "s",
      descriptor = "Lhha;"
   )
   public static class724 field8977 = new class724(39, -2);
   @OriginalMember(
      owner = "client!eja",
      name = "r",
      descriptor = "[[I"
   )
   public static int[][] field8980 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!eja",
      name = "q",
      descriptor = "I"
   )
   public static int field8981 = -1;
   @OriginalMember(
      owner = "client!eja",
      name = "p",
      descriptor = "F"
   )
   public static float field8984;
   @OriginalMember(
      owner = "client!eja",
      name = "t",
      descriptor = "I"
   )
   public static int field8976;
   @OriginalMember(
      owner = "client!eja",
      name = "o",
      descriptor = "I"
   )
   public static int field8978;
   @OriginalMember(
      owner = "client!eja",
      name = "k",
      descriptor = "I"
   )
   public int field8979;
   @OriginalMember(
      owner = "client!eja",
      name = "j",
      descriptor = "I"
   )
   public static int field8982;
   @OriginalMember(
      owner = "client!eja",
      name = "n",
      descriptor = "I"
   )
   public int field8983;
   @OriginalMember(
      owner = "client!eja",
      name = "l",
      descriptor = "I"
   )
   public static int field8985;
   @OriginalMember(
      owner = "client!eja",
      name = "m",
      descriptor = "[I"
   )
   public int[] field8975;

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;II)V"
   )
   public abstract void method1196(int arg0, Canvas arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method4629(boolean arg0, int arg1) {
      try {
         ++field8976;
         class521.field7326.method1048(arg1, -8543);
         if (arg0) {
            field8984 = -0.8382646F;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8986[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4630(int arg0, byte arg1, int arg2) {
      try {
         ++field8978;
         return arg1 < 71 ? false : class46.method507(arg2, false, arg0) & ((arg0 & 8192) != 0 | class294.method2458(arg0, false, arg2) | class197.method1734((byte)1, arg0, arg2));
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8986[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ILjava/awt/Graphics;IIIIII)V"
   )
   public abstract void method1194(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4631(int arg0) {
      try {
         if (arg0 == -2) {
            field8977 = null;
            field8980 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8986[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(ILjava/util/Random;I)I"
   )
   public static final int method4632(int arg0, Random arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field8985;
         if (~arg2 >= -1) {
            throw new IllegalArgumentException();
         } else if (class122.method1209(arg2, arg0 ^ 119)) {
            return (int)(((long)arg1.nextInt() & 4294967295L) * (long)arg2 >> 32);
         } else {
            int var4 = -((int)(4294967296L % (long)arg2)) + Integer.MIN_VALUE;

            while(true) {
               int var5 = arg1.nextInt();

               while(~var5 > ~var4) {
                  if (!var3) {
                     if (arg0 != 12) {
                        return 57;
                     }

                     return class315.method2562((byte)-113, arg2, var5);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8986[3] + arg0 + ',' + (arg1 != null ? field8986[2] : field8986[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4633(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4634(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
