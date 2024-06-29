import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class156 {
   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2387 = new String[]{method1493(method1492("w\u000by\"_")), method1493(method1492("w\u000by!_"))};
   @OriginalMember(
      owner = "client!ik",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field2384 = new class724(54, -1);
   @OriginalMember(
      owner = "client!ik",
      name = "c",
      descriptor = "I"
   )
   public static int field2383;
   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "I"
   )
   public static int field2385;
   @OriginalMember(
      owner = "client!ik",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class39 field2386;

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1490(byte arg0) {
      try {
         if (arg0 == 111) {
            field2384 = null;
            field2386 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2387[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1491(int arg0) {
      try {
         ++field2383;
         class476.field6870.method4707(1, false, class476.field6870.field9127);
         class476.field6870.method4707(1, false, class476.field6870.field9133);
         class476.field6870.method4707(2, false, class476.field6870.field9110);
         class476.field6870.method4707(2, false, class476.field6870.field9145);
         class476.field6870.method4707(1, false, class476.field6870.field9151);
         class476.field6870.method4707(1, false, class476.field6870.field9119);
         class476.field6870.method4707(1, false, class476.field6870.field9104);
         class476.field6870.method4707(arg0, false, class476.field6870.field9126);
         class476.field6870.method4707(1, false, class476.field6870.field9148);
         class476.field6870.method4707(1, false, class476.field6870.field9138);
         class476.field6870.method4707(1, false, class476.field6870.field9118);
         class476.field6870.method4707(1, false, class476.field6870.field9128);
         class476.field6870.method4707(0, false, class476.field6870.field9149);
         class476.field6870.method4707(1, false, class476.field6870.field9117);
         class476.field6870.method4707(0, false, class476.field6870.field9147);
         class476.field6870.method4707(0, false, class476.field6870.field9146);
         class476.field6870.method4707(1, false, class476.field6870.field9140);
         class476.field6870.method4707(0, false, class476.field6870.field9150);
         class476.field6870.method4707(0, false, class476.field6870.field9142);
         class476.field6870.method4707(1, false, class476.field6870.field9141);
         class267.method2281(arg0 ^ 3);
         class476.field6870.method4707(1, false, class476.field6870.field9108);
         class476.field6870.method4707(3, false, class476.field6870.field9105);
         class345.method2741(0);
         class215.method1854((byte)-128);
         class350.field5131 = true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2387[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
