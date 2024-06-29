import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class295 {
   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4668 = new String[]{method2485(method2484("\u001b\u0000[a\tT")), method2485(method2484("\u0007E\u0014a6")), method2485(method2484("\u001b\u0000[a\nT")), method2485(method2484("\u0012\u001eV#")), method2485(method2484("\u001b\u0000[a\bT"))};
   @OriginalMember(
      owner = "client!gka",
      name = "b",
      descriptor = "I"
   )
   public static int field4665;
   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "I"
   )
   public static int field4666;
   @OriginalMember(
      owner = "client!gka",
      name = "c",
      descriptor = "I"
   )
   public static int field4667;

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(I[Ljava/lang/Object;I[JI)V",
      line = 5
   )
   public static final void method2481(int param0, Object[] param1, int param2, long[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gka",
      name = "b",
      descriptor = "(I)[Luk;",
      line = 61
   )
   public static final class498[] method2482(int arg0) {
      try {
         if (arg0 >= -82) {
            return null;
         } else {
            ++field4666;
            return new class498[]{class530.field8041, class681.field10154, class440.field6762, class439.field6722, class624.field9059, class501.field7664, class214.field3250, class780.field11434, class678.field10126, class316.field4881, class550.field8236, class381.field6024, class525.field8006, class456.field6993, class797.field11597, class213.field3238, class623.field9052, class690.field10253, class757.field11212, class373.field5767, class406.field6329, class465.field7058, class118.field1578, class565.field8385, class589.field8684, class736.field10956, class382.field6035, class8.field57, class206.field3125, class793.field11580, class548.field8205, class542.field8167, class689.field10234, class11.field146, class535.field8106, class28.field342, class486.field7394, class238.field3610, class665.field9968, class657.field9822, class104.field1446, class207.field3138, class124.field1789, class620.field9019, class276.field4407, class668.field9987, class666.field9974, class66.field872, class59.field733, class445.field6829, class741.field11025, class194.field3018, class90.field1301, class265.field4335, class594.field8745, class263.field4327, class109.field1497, class483.field7353, class542.field8172, class506.field7753, class438.field6713, class571.field8449, class464.field7041, class120.field1700, class378.field6002, class291.field4582, class144.field2055, class506.field7754, class456.field6990, class376.field5981, class168.field2579, class429.field6630, class730.field10898, class129.field1846, class537.field8121, class25.field320, class698.field10376, class483.field7355, class691.field10256, class286.field4503, class576.field8523, class474.field7212, class569.field8415, class759.field11227, class2.field10, class22.field281, class701.field10452, class783.field11504, class785.field11520, class625.field9063, class790.field11560, class756.field11195, class692.field10285, class111.field1533, class325.field4944, class42.field566, class539.field8132, class271.field4381, class748.field11096, class657.field9816, class357.field5508, class611.field8895, class391.field6148, class63.field841, class440.field6770, class69.field905, class232.field3554, class625.field9069, class654.field9783, class571.field8460, class665.field9961, class24.field296, class391.field6143, class752.field11154, class798.field11620, class703.field10570, class623.field9048, class752.field11150, class721.field10799, class394.field6172, class461.field7013, class722.field10801, class311.field4828, class563.field8368, class68.field892, class400.field6277, class513.field7826, class409.field6365, class13.field171, class425.field6573, class399.field6248, class554.field8279, class430.field6639, class58.field718, class137.field1998, class67.field878, class504.field7718, class755.field11191, class674.field10025, class733.field10927, class471.field7164, class593.field8737, class509.field7787};
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4668[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(I)V",
      line = 73
   )
   public static final void method2483(int arg0) {
      try {
         ++field4665;
         class745.field11066 = arg0;
         class655.field9789 = -1;
         class581.field8579 = -1;
         class79.field1054 = 0;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4668[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
