import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ska")
public class class117 {
   @OriginalMember(
      owner = "client!ska",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1574 = new String[]{method1080(method1079("\u000f\u0012]&BT")), method1080(method1079("\u000f\u0012]&AT")), method1080(method1079("\u0012\fPd")), method1080(method1079("\u0007W\u0012&~"))};
   @OriginalMember(
      owner = "client!ska",
      name = "a",
      descriptor = "Lhka;"
   )
   public static class377 field1569 = new class377(0, 3);
   @OriginalMember(
      owner = "client!ska",
      name = "b",
      descriptor = "F"
   )
   public static float field1568;
   @OriginalMember(
      owner = "client!ska",
      name = "d",
      descriptor = "I"
   )
   public static int field1570;
   @OriginalMember(
      owner = "client!ska",
      name = "c",
      descriptor = "Les;"
   )
   public static class191 field1571;
   @OriginalMember(
      owner = "client!ska",
      name = "f",
      descriptor = "[B"
   )
   public static byte[] field1573;
   @OriginalMember(
      owner = "client!ska",
      name = "e",
      descriptor = "[Ljq;"
   )
   public static class672[] field1572;

   @OriginalMember(
      owner = "client!ska",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method1077(int arg0) {
      try {
         field1572 = null;
         field1569 = null;
         field1573 = null;
         if (arg0 > -95) {
            method1078(false, 25, 123, -23, (class678)null, 88, 12, -124L);
         }

         field1571 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1574[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ska",
      name = "a",
      descriptor = "(ZIIILrr;IIJ)V",
      line = 19
   )
   public static final void method1078(boolean arg0, int arg1, int arg2, int arg3, class678 arg4, int arg5, int arg6, long arg7) {
      try {
         class618.field8993 = 10000;
         class583.field8598 = arg3;
         class61.field788 = arg6;
         class489.field7417 = null;
         class487.field7407 = arg0;
         class516.field7852 = arg5;
         class218.field3277 = arg4;
         ++field1570;
         if (arg2 >= -30) {
            method1077(75);
         }

         class222.field3337 = arg1;
         class326.field4957 = 1;
         class329.field4990 = arg7;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1574[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1574[3] : field1574[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ska",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1079(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ska",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1080(char[] arg0) {
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
            var10005 = 121;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
