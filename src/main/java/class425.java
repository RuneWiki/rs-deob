import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class425 extends class792 {
   @OriginalMember(
      owner = "client!bv",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5785 = new String[]{method3300(method3299("Pn$L|")), method3300(method3299("Pn$G|")), method3300(method3299("Pn$H|"))};
   @OriginalMember(
      owner = "client!bv",
      name = "I",
      descriptor = "[F"
   )
   public static float[] field5782 = new float[4];
   @OriginalMember(
      owner = "client!bv",
      name = "H",
      descriptor = "I"
   )
   public static int field5783;
   @OriginalMember(
      owner = "client!bv",
      name = "J",
      descriptor = "I"
   )
   public static int field5784;
   @OriginalMember(
      owner = "client!bv",
      name = "C",
      descriptor = "[B"
   )
   private byte[] field5781;

   @OriginalMember(
      owner = "client!bv",
      name = "b",
      descriptor = "(IIBI)[B"
   )
   public final byte[] method3296(int arg0, int arg1, byte arg2, int arg3) {
      try {
         if (arg2 != 4) {
            method3297(74);
         }

         ++field5784;
         this.field5781 = new byte[arg0 * arg3 * arg1 * 2];
         this.method3281(arg3, arg0, (byte)-123, arg1);
         return this.field5781;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5785[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3297(int arg0) {
      try {
         if (arg0 != 12) {
            method3297(-25);
         }

         field5782 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5785[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "<init>",
      descriptor = "()V"
   )
   public class425() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!bv",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method3298(byte arg0, int arg1, int arg2) {
      try {
         ++field5783;
         int var4 = arg2 * 2;
         byte var7 = (byte)(((arg0 & 255) >> 1) + 127);
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field5781[var10001] = var7;
         if (arg1 != -7499) {
            this.method3298((byte)-79, 71, 25);
         }

         this.field5781[var8] = var7;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5785[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3299(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3300(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
