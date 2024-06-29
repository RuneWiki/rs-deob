import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class594 {
   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8379 = new String[]{method4365(method4364("S\u0012`PQ")), method4365(method4364("S\u0012`QQ"))};
   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "Lsb;"
   )
   public static class261 field8377 = new class261();
   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field8378 = new int[2048];
   @OriginalMember(
      owner = "client!ei",
      name = "c",
      descriptor = "I"
   )
   public static int field8376;

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4362(byte arg0) {
      try {
         field8378 = null;
         field8377 = null;
         int var1 = -51 % ((arg0 - -64) / 60);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8379[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(JZ)I"
   )
   public abstract int method3558(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method3559(byte arg0);

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(IJ)I"
   )
   public final int method4363(int arg0, long arg1) {
      try {
         ++field8376;
         long var4 = this.method3560((byte)-14);
         if (arg0 != 2048) {
            this.method3560((byte)-12);
         }

         if (var4 > 0L) {
            class97.method968(32353, var4);
         }

         return this.method3558(arg1, true);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8379[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "c",
      descriptor = "(B)J"
   )
   public abstract long method3562(byte arg0);

   @OriginalMember(
      owner = "client!ei",
      name = "d",
      descriptor = "(B)J"
   )
   public abstract long method3560(byte arg0);

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4364(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4365(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
