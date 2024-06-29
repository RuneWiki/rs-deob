import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class186 extends class143 {
   @OriginalMember(
      owner = "client!dca",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   private String field2814 = null;
   @OriginalMember(
      owner = "client!dca",
      name = "n",
      descriptor = "J"
   )
   private long field2817 = -1L;
   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2820 = new String[]{method1629(method1628("7~t\u0007\\")), method1629(method1628("\"%6E")), method1629(method1628("(3;\u0007cd")), method1629(method1628("(3;\u0007ed")), method1629(method1628("l=?DC)\"4HL)j")), method1629(method1628("!57KD>8;ZIv"))};
   @OriginalMember(
      owner = "client!dca",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field2813 = false;
   @OriginalMember(
      owner = "client!dca",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field2818 = true;
   @OriginalMember(
      owner = "client!dca",
      name = "s",
      descriptor = "B"
   )
   private byte field2811;
   @OriginalMember(
      owner = "client!dca",
      name = "l",
      descriptor = "I"
   )
   public static int field2812;
   @OriginalMember(
      owner = "client!dca",
      name = "t",
      descriptor = "I"
   )
   private int field2815;
   @OriginalMember(
      owner = "client!dca",
      name = "q",
      descriptor = "I"
   )
   public static int field2816;
   @OriginalMember(
      owner = "client!dca",
      name = "o",
      descriptor = "I"
   )
   public static int field2819;

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Lan;I)V",
      line = 14
   )
   public final void method456(class25 arg0, int arg1) {
      try {
         ++field2812;
         class444 var3 = new class444();
         if (arg1 == 117) {
            var3.field6472 = this.field2811;
            var3.field6470 = this.field2814;
            var3.field6471 = this.field2815;
            arg0.method177(var3, arg1 ^ 112);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2820[2] + (arg0 != null ? field2820[0] : field2820[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Luda;B)V",
      line = 53
   )
   public final void method457(class473 arg0, byte arg1) {
      try {
         ++field2816;
         if (arg1 > -81) {
            this.method456((class25)null, 54);
         }

         if (arg0.method3564((byte)-57) != 255) {
            --arg0.field6907;
            this.field2817 = arg0.method3523(80);
         }

         this.field2814 = arg0.method3529(false);
         this.field2815 = arg0.method3565(true);
         this.field2811 = arg0.method3543(-1132613840);
         arg0.method3523(34);
         if (class468.field6823) {
            System.out.println(field2820[5] + this.field2817 + field2820[4] + this.field2814);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2820[3] + (arg0 != null ? field2820[0] : field2820[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1628(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1629(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
