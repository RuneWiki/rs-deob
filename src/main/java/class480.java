import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class480 extends class327 {
   @OriginalMember(
      owner = "client!ms",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6904 = new String[]{method3676(method3675("\u0006\nuE~")), method3676(method3675("\u0006\nuD~")), method3676(method3675("\u0006\nuA~")), method3676(method3675("\u0006\nuG~")), method3676(method3675("\u0006\nuN~")), method3676(method3675("\u0006\nuF~"))};
   @OriginalMember(
      owner = "client!ms",
      name = "M",
      descriptor = "Lsr;"
   )
   public static class78 field6902 = new class78(1);
   @OriginalMember(
      owner = "client!ms",
      name = "H",
      descriptor = "I"
   )
   public static int field6897;
   @OriginalMember(
      owner = "client!ms",
      name = "L",
      descriptor = "I"
   )
   public static int field6898;
   @OriginalMember(
      owner = "client!ms",
      name = "I",
      descriptor = "I"
   )
   public static int field6899;
   @OriginalMember(
      owner = "client!ms",
      name = "J",
      descriptor = "I"
   )
   public static int field6900;
   @OriginalMember(
      owner = "client!ms",
      name = "O",
      descriptor = "I"
   )
   public static int field6901;
   @OriginalMember(
      owner = "client!ms",
      name = "N",
      descriptor = "I"
   )
   public static int field6903;
   @OriginalMember(
      owner = "client!ms",
      name = "K",
      descriptor = "[B"
   )
   private byte[] field6896;

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3670(int arg0, int arg1) {
      try {
         if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
         }

         ++field6898;
         if (arg1 != 2) {
            field6902 = null;
         }

         class679.field9837 = arg0;
         class183.field2690 = new class532[class668.field9390[class679.field9837] - -1];
         class152.field2327 = 0;
         class670.field9408 = 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6904[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(BI)[I"
   )
   public static final int[] method3671(byte arg0, int arg1) {
      try {
         ++field6899;
         if (arg0 != 77) {
            field6903 = -126;
         }

         class623.method4590(false, class403.method3149(1, arg1));
         return new int[]{class309.field4659.get(5), class309.field4659.get(2), class309.field4659.get(1)};
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6904[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(IIBI)[B"
   )
   public final byte[] method3672(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field6900;
         this.field6896 = new byte[arg3 * 2 * arg1 * arg0];
         this.method1522(arg0, arg1, arg3, -112);
         int var5 = 77 / ((32 - arg2) / 43);
         return this.field6896;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6904[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "<init>",
      descriptor = "()V"
   )
   public class480() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3673(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field6897;
         int var6 = 3 % ((12 - arg0) / 40);
         int var7 = 0;
         if (!var5 && ~var7 <= ~class766.field10999) {
            class515.method3870(arg2, arg1 + arg3, (byte)-50, arg2 + arg4, arg3);
         } else {
            do {
               Rectangle var8 = class223.field3167[var7];
               if (arg3 < var8.x - -var8.width && ~(arg1 + arg3) < ~var8.x && arg2 < var8.y + var8.height && var8.y < arg2 + arg4) {
                  class55.field798[var7] = true;
               }

               ++var7;
            } while(~var7 > ~class766.field10999);

            class515.method3870(arg2, arg1 + arg3, (byte)-50, arg2 + arg4, arg3);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6904[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3674(int arg0) {
      try {
         if (arg0 > -37) {
            method3673(-70, -33, 123, -12, -63);
         }

         field6902 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6904[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1011(int arg0, int arg1, byte arg2) {
      try {
         ++field6901;
         if (arg1 >= 3) {
            int var4 = arg0 * 2;
            int var5 = 255 & arg2;
            int var8 = var4 + 1;
            this.field6896[var4] = (byte)(var5 * 3 >> 5);
            this.field6896[var8] = (byte)(var5 * 3 >> 5);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6904[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3675(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ms",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3676(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
