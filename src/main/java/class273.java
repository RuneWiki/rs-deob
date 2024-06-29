import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class273 extends class270 {
   @OriginalMember(
      owner = "client!uk",
      name = "t",
      descriptor = "I"
   )
   public int field3748;
   @OriginalMember(
      owner = "client!uk",
      name = "w",
      descriptor = "I"
   )
   public int field3750;
   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3756 = new String[]{method2089(method2088("\\|\u000f\u0010E")), method2089(method2088("I'MR")), method2089(method2088("R9\u000f\u0002QI;U\u0000\u0010")), method2089(method2088("R9\u000f\u007f\u0010")), method2089(method2088("R9\u000f}\u0010")), method2089(method2088("R9\u000f|\u0010"))};
   @OriginalMember(
      owner = "client!uk",
      name = "r",
      descriptor = "Lek;"
   )
   public static class536 field3751 = new class536(21, -1);
   @OriginalMember(
      owner = "client!uk",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field3754 = true;
   @OriginalMember(
      owner = "client!uk",
      name = "u",
      descriptor = "F"
   )
   public static float field3753 = 1024.0F;
   @OriginalMember(
      owner = "client!uk",
      name = "x",
      descriptor = "I"
   )
   public static int field3747;
   @OriginalMember(
      owner = "client!uk",
      name = "s",
      descriptor = "I"
   )
   public static int field3749;
   @OriginalMember(
      owner = "client!uk",
      name = "q",
      descriptor = "I"
   )
   public static int field3752;
   @OriginalMember(
      owner = "client!uk",
      name = "v",
      descriptor = "I"
   )
   public static int field3755;

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "(I)I",
      line = 6
   )
   public static final int method2086(int arg0) {
      try {
         ++field3749;
         if (arg0 != 1024) {
            field3754 = true;
         }

         return class76.field955;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3756[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(I)V",
      line = 17
   )
   public static void method2087(int arg0) {
      try {
         if (arg0 != -9000) {
            field3754 = true;
         }

         field3751 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3756[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "<init>",
      descriptor = "(Lkt;Lada;IIIIIIIII)V",
      line = 28
   )
   public class273(class169 arg0, class175 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field3748 = arg10;
         this.field3750 = arg9;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field3756[2] + (arg0 != null ? field3756[0] : field3756[1]) + ',' + (arg1 != null ? field3756[0] : field3756[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 42
   )
   public final class127 method993(byte arg0) {
      try {
         if (arg0 != -48) {
            this.field3748 = 69;
         }

         ++field3752;
         return class336.field4574;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3756[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2088(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2089(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
