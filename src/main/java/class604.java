import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class604 {
   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8701 = new String[]{method4450(method4449("$kb\u000fe")), method4450(method4449("$kb\u000ee")), method4450(method4449("$kb\fe"))};
   @OriginalMember(
      owner = "client!gu",
      name = "d",
      descriptor = "Lqg;"
   )
   public static class485 field8697 = new class485(1, 2);
   @OriginalMember(
      owner = "client!gu",
      name = "b",
      descriptor = "I"
   )
   public static int field8698;
   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "I"
   )
   public static int field8699;
   @OriginalMember(
      owner = "client!gu",
      name = "c",
      descriptor = "Lbm;"
   )
   public static class123 field8696;
   @OriginalMember(
      owner = "client!gu",
      name = "e",
      descriptor = "[Lpq;"
   )
   public static class203[] field8700;

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(BI)V",
      line = 6
   )
   public static final void method4446(byte arg0, int arg1) {
      try {
         class320.field4615 = arg1;
         ++field8699;
         class179 var2 = class774.field11334;
         synchronized(class774.field11334) {
            int var3 = 106 % ((arg0 - -19) / 62);
            class774.field11334.method1589((byte)105);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8701[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static final void method4447(int arg0) {
      try {
         if (arg0 <= -5) {
            class719.field10380.method1591((byte)58);
            ++field8698;
            class388.field5733.method1591((byte)58);
            class402.field5910.method1591((byte)58);
            class414.field6070.method1591((byte)58);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8701[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "a",
      descriptor = "(Z)V",
      line = 33
   )
   public static void method4448(boolean arg0) {
      try {
         field8697 = null;
         if (!arg0) {
            method4447(105);
         }

         field8700 = null;
         field8696 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8701[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
