import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class560 extends class775 {
   @OriginalMember(
      owner = "client!ko",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8335 = new String[]{method4233(method4232("3\u001f@:\u0011")), method4233(method4232("&D\u0002x")), method4233(method4232("#^@WD")), method4233(method4232("#^@UD"))};
   @OriginalMember(
      owner = "client!ko",
      name = "C",
      descriptor = "I"
   )
   public static int field8327 = 0;
   @OriginalMember(
      owner = "client!ko",
      name = "t",
      descriptor = "I"
   )
   public static int field8328 = -1;
   @OriginalMember(
      owner = "client!ko",
      name = "u",
      descriptor = "B"
   )
   private byte field8326;
   @OriginalMember(
      owner = "client!ko",
      name = "v",
      descriptor = "B"
   )
   private byte field8329;
   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "B"
   )
   private byte field8330;
   @OriginalMember(
      owner = "client!ko",
      name = "x",
      descriptor = "B"
   )
   private byte field8332;
   @OriginalMember(
      owner = "client!ko",
      name = "A",
      descriptor = "I"
   )
   public static int field8331;
   @OriginalMember(
      owner = "client!ko",
      name = "w",
      descriptor = "I"
   )
   public static int field8333;
   @OriginalMember(
      owner = "client!ko",
      name = "y",
      descriptor = "I"
   )
   public static int field8334;
   @OriginalMember(
      owner = "client!ko",
      name = "D",
      descriptor = "Z"
   )
   private boolean field8325;

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         this.field8325 = ~arg0.method2855(-31007) == -2;
         ++field8333;
         this.field8329 = arg0.method2886((byte)88);
         this.field8332 = arg0.method2886((byte)88);
         this.field8326 = arg0.method2886((byte)88);
         this.field8330 = arg0.method2886((byte)88);
         int var3 = 19 % ((arg1 - -84) / 34);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8335[2] + (arg0 != null ? field8335[0] : field8335[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(Lsda;I)V"
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         arg0.field3372 = this.field8329;
         arg0.field3351 = this.field8332;
         int var3 = -45 % ((arg1 - -23) / 45);
         arg0.field3386 = this.field8325;
         arg0.field3356 = this.field8330;
         arg0.field3373 = this.field8326;
         ++field8331;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8335[3] + (arg0 != null ? field8335[0] : field8335[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4232(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4233(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
