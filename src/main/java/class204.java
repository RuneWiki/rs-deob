import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class204 extends class588 {
   @OriginalMember(
      owner = "client!me",
      name = "u",
      descriptor = "I"
   )
   private int field3045 = -1;
   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3050 = new String[]{method1742(method1741("g9C[{")), method1742(method1741("qrC=.")), method1742(method1741("d)\u0001\u007f")), method1742(method1741("g9CQ{"))};
   @OriginalMember(
      owner = "client!me",
      name = "s",
      descriptor = "B"
   )
   private byte field3048;
   @OriginalMember(
      owner = "client!me",
      name = "q",
      descriptor = "I"
   )
   public static int field3044;
   @OriginalMember(
      owner = "client!me",
      name = "t",
      descriptor = "I"
   )
   public static int field3046;
   @OriginalMember(
      owner = "client!me",
      name = "p",
      descriptor = "I"
   )
   public static int field3047;
   @OriginalMember(
      owner = "client!me",
      name = "r",
      descriptor = "I"
   )
   public static int field3049;

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         if (arg1 < -120) {
            ++field3046;
            arg0.method5624(this.field3045, this.field3048, -1);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3050[3] + (arg0 != null ? field3050[1] : field3050[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field3045 = arg1.method3565(true);
         ++field3044;
         this.field3048 = arg1.method3543(-1132613840);
         int var3 = -54 % ((arg0 - -26) / 33);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3050[0] + arg0 + ',' + (arg1 != null ? field3050[1] : field3050[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1741(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1742(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
