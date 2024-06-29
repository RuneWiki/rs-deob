import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class325 {
   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4410 = new String[]{method2408(method2407("\u0015Hh\tF")), method2408(method2407("\u0015Hh\nF")), method2408(method2407("\u0002\u0003hf\u0013")), method2408(method2407("\u0017X*$"))};
   @OriginalMember(
      owner = "client!le",
      name = "c",
      descriptor = "I"
   )
   public static int field4409;
   @OriginalMember(
      owner = "client!le",
      name = "b",
      descriptor = "Lkf;"
   )
   public static class266 field4408;
   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4407;

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(IIIILjava/lang/String;IIB)V"
   )
   public static final void method2405(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6, byte arg7) {
      try {
         ++field4409;
         class29 var8 = new class29();
         if (arg7 >= -115) {
            field4407 = null;
         }

         var8.field430 = class96.field1234 - -arg5;
         var8.field426 = arg1;
         var8.field432 = arg6;
         var8.field425 = arg0;
         var8.field427 = arg3;
         var8.field431 = arg4;
         var8.field424 = arg2;
         class477.field6863.method5530(126, var8);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4410[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4410[2] : field4410[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2406(byte arg0) {
      try {
         field4408 = null;
         if (arg0 >= -2) {
            field4407 = null;
         }

         field4407 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4410[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!le",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
