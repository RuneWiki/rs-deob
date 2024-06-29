import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class54 extends class732 {
   @OriginalMember(
      owner = "client!aha",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field745 = new String[]{method526(method525("\u001cdrz\u0014U")), method526(method525("\u001cdrz\u0016U")), method526(method525("\u001cdrz\u0013U"))};
   @OriginalMember(
      owner = "client!aha",
      name = "R",
      descriptor = "I"
   )
   public static int field739 = 0;
   @OriginalMember(
      owner = "client!aha",
      name = "Q",
      descriptor = "I"
   )
   public static int field741;
   @OriginalMember(
      owner = "client!aha",
      name = "V",
      descriptor = "I"
   )
   public static int field743;
   @OriginalMember(
      owner = "client!aha",
      name = "S",
      descriptor = "I"
   )
   public static int field744;
   @OriginalMember(
      owner = "client!aha",
      name = "U",
      descriptor = "[B"
   )
   private byte[] field740;
   @OriginalMember(
      owner = "client!aha",
      name = "T",
      descriptor = "[Lpd;"
   )
   public static class648[] field742;

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(IZB)V"
   )
   public final void method353(int arg0, boolean arg1, byte arg2) {
      try {
         ++field741;
         if (arg1) {
            field742 = null;
         }

         int var4 = arg0 * 2;
         int var5 = 255 & arg2;
         int var8 = var4 + 1;
         this.field740[var4] = -1;
         this.field740[var8] = (byte)(var5 * 3 >> 5);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field745[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "<init>",
      descriptor = "()V"
   )
   public class54() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(IIII)[B"
   )
   public final byte[] method523(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field743;
         this.field740 = new byte[arg1 * arg2 * arg3 * 2];
         if (arg0 != 6743) {
            method524((byte)84);
         }

         this.method3281(arg2, arg3, (byte)-123, arg1);
         return this.field740;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field745[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method524(byte arg0) {
      try {
         if (arg0 < 49) {
            field744 = -78;
         }

         field742 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field745[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method525(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method526(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
