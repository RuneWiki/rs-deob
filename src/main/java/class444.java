import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class444 {
   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6757 = new String[]{method3359(method3358("\u0011,\u0002\u000e\u0017")), method3359(method3358("\u001fl\u0002aB")), method3359(method3358("\u0004w@L")), method3359(method3358("\u001fl\u0002bB"))};
   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "I"
   )
   public static int field6754 = -1;
   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field6755 = new class269(61, 0);
   @OriginalMember(
      owner = "client!un",
      name = "c",
      descriptor = "I"
   )
   public static int field6756;

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(Liaa;B)V",
      line = 8
   )
   public static final void method3356(class520 arg0, byte arg1) {
      try {
         ++field6756;
         arg0.method1094(-78, class303.field4326.method3879(0));
         arg0.method1094(-120, class793.field11544.method3879(0));
         arg0.method1094(-80, class539.field7873.method3879(0));
         arg0.method1094(-117, class261.field3570.method3879(0));
         arg0.method1094(-41, class491.field7266.method3879(0));
         arg0.method1094(-63, class614.field8980.method3879(0));
         arg0.method1094(-55, class382.field5861.method3879(0));
         arg0.method1094(-99, class551.field8148.method3879(0));
         arg0.method1094(-120, class521.field7580.method3879(0));
         arg0.method1094(-28, class248.field3318.method3879(0));
         arg0.method1094(-84, class351.field5343.method3879(0));
         arg0.method1094(-31, class172.field2157.method3879(0));
         arg0.method1094(-98, class306.field4362.method3879(0));
         arg0.method1094(-70, class712.field10625.method3879(0));
         int var2 = 73 % ((arg1 - -53) / 44);
         arg0.method1094(-21, class604.field8882.method3879(0));
         arg0.method1094(-125, class251.field3357.method3879(0));
         arg0.method1094(-90, class386.field5912.method3879(0));
         arg0.method1094(-99, class276.field3850.method3879(0));
         arg0.method1094(-79, class552.field8187.method3879(0));
         arg0.method1094(-50, class261.field3549.method3879(0));
         arg0.method1094(-70, class728.field10821.method3879(0));
         arg0.method1094(-42, class763.field11220.method3879(0));
         arg0.method1094(-53, class31.field345.method3879(0));
         arg0.method1094(-76, class665.field9670.method3879(0));
         arg0.method1094(-96, class682.field10241.method3879(0));
         arg0.method1094(-115, class356.field5390.method3879(0));
         arg0.method1094(-22, class185.field2312.method3879(0));
         arg0.method1094(-21, class307.field4368.method3879(0));
         arg0.method1094(-121, class421.field6410.method3879(0));
         arg0.method1094(-75, class183.field2269.method3879(0));
         arg0.method1094(-112, class761.field11189.method3879(0));
         arg0.method1094(-47, class552.field8190.method3879(0));
         arg0.method1094(-54, class40.method275(79));
         arg0.method1094(-126, class248.method1865((byte)-112));
         arg0.method1094(-118, class525.field7630.method3879(0));
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6757[1] + (arg0 != null ? field6757[0] : field6757[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(Z)V",
      line = 62
   )
   public static void method3357(boolean arg0) {
      try {
         if (arg0) {
            field6755 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6757[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3358(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3359(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
