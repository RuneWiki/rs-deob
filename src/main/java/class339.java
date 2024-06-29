import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class339 extends class434 {
   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5002 = new String[]{method2703(method2702("23mwp")), method2703(method2702("9+/X")), method2703(method2702("23mvp")), method2703(method2702(",pm\u001a%"))};
   @OriginalMember(
      owner = "client!em",
      name = "j",
      descriptor = "I"
   )
   public static int field4997 = 0;
   @OriginalMember(
      owner = "client!em",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field4999 = new class724(70, -2);
   @OriginalMember(
      owner = "client!em",
      name = "i",
      descriptor = "Lhj;"
   )
   public static class670 field5001 = new class670();
   @OriginalMember(
      owner = "client!em",
      name = "l",
      descriptor = "I"
   )
   public static int field4998;
   @OriginalMember(
      owner = "client!em",
      name = "m",
      descriptor = "I"
   )
   public static int field5000;

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(Lsa;Lsa;Lsa;BLsa;)V"
   )
   public static final void method2700(class39 arg0, class39 arg1, class39 arg2, byte arg3, class39 arg4) {
      try {
         class558.field7924 = arg4;
         class290.field4342 = arg0;
         if (arg3 == 87) {
            ++field4998;
            class289.field4304 = arg1;
            class315.field4719 = new class91[class558.field7924.method454(arg3 ^ 51)][];
            class14.field203 = new boolean[class558.field7924.method454(100)];
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5002[2] + (arg0 != null ? field5002[3] : field5002[1]) + ',' + (arg1 != null ? field5002[3] : field5002[1]) + ',' + (arg2 != null ? field5002[3] : field5002[1]) + ',' + arg3 + ',' + (arg4 != null ? field5002[3] : field5002[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2701(byte arg0) {
      try {
         field5001 = null;
         int var1 = 16 % ((arg0 - -1) / 56);
         field4999 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5002[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2703(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
