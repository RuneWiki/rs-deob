import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class95 extends class605 {
   @OriginalMember(
      owner = "client!wk",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1546 = new String[]{method959(method958("[s/V%")), method959(method958("[s/[%"))};
   @OriginalMember(
      owner = "client!wk",
      name = "B",
      descriptor = "I"
   )
   public static int field1541 = 0;
   @OriginalMember(
      owner = "client!wk",
      name = "A",
      descriptor = "I"
   )
   public static int field1544 = 0;
   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "I"
   )
   public static int field1543;
   @OriginalMember(
      owner = "client!wk",
      name = "C",
      descriptor = "I"
   )
   public static int field1545;
   @OriginalMember(
      owner = "client!wk",
      name = "y",
      descriptor = "[B"
   )
   private byte[] field1542;

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(IIIB)[B"
   )
   public final byte[] method956(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field1543;
         if (arg3 <= 59) {
            this.method956(51, -59, -64, (byte)-51);
         }

         this.field1542 = new byte[arg0 * arg2 * arg1 * 2];
         this.method1522(arg2, arg0, arg1, -115);
         return this.field1542;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1546[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method957(byte arg0, int arg1, int arg2) {
      try {
         ++field1545;
         if (arg1 == 255) {
            byte var7 = (byte)((arg0 >> 1 & 127) + 127);
            int var4 = arg2 * 2;
            int var8 = var4 + 1;
            this.field1542[var4] = var7;
            this.field1542[var8] = var7;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1546[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "<init>",
      descriptor = "()V"
   )
   public class95() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method958(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method959(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
