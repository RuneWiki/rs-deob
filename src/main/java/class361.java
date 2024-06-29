import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class361 extends class604 {
   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5022 = new String[]{method2850(method2849("'buAuj")), method2850(method2849("'buAvj"))};
   @OriginalMember(
      owner = "client!efa",
      name = "f",
      descriptor = "I"
   )
   public static int field5020;
   @OriginalMember(
      owner = "client!efa",
      name = "g",
      descriptor = "I"
   )
   public static int field5021;

   @OriginalMember(
      owner = "client!efa",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2847(int arg0) {
      try {
         ++class482.field6692;
         ++field5021;
         class702 var1 = class19.method142(class387.field5365.field8765, class210.field2669, (byte)-118);
         int var2 = 52 % ((arg0 - -16) / 55);
         var1.field10264.method593(class137.method1146((byte)23), 867770704);
         var1.field10264.method611(class204.field2605, -1344798296);
         var1.field10264.method611(class91.field1242, -1344798296);
         var1.field10264.method593(class757.field11093.field10969.method5235(-18033), 867770704);
         class387.field5365.method4423(var1, (byte)105);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5022[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "c",
      descriptor = "(I)Luia;"
   )
   public static final class592 method2848(int arg0) {
      try {
         ++field5020;
         class592 var1 = (class592)class480.field6677.method4633(70);
         if (arg0 != -11046) {
            method2848(-112);
         }

         if (var1 != null) {
            --class703.field10282;
            return var1;
         } else {
            return new class592();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5022[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2849(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2850(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
