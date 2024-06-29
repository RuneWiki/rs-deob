import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class751 {
   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11121 = new String[]{method5474(method5473("Y\u001fUj\u0005")), method5474(method5473("Y\u001fUi\u0005")), method5474(method5473("Y\u001fU_Bb\u0005\tBCVY"))};
   @OriginalMember(
      owner = "client!hn",
      name = "b",
      descriptor = "[Lma;"
   )
   public static class14[] field11113 = new class14[5];
   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "I"
   )
   public static int field11118;
   @OriginalMember(
      owner = "client!hn",
      name = "d",
      descriptor = "I"
   )
   public static int field11117;
   @OriginalMember(
      owner = "client!hn",
      name = "f",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field11119;
   @OriginalMember(
      owner = "client!hn",
      name = "e",
      descriptor = "D"
   )
   public static double field11120;
   @OriginalMember(
      owner = "client!hn",
      name = "c",
      descriptor = "I"
   )
   public static int field11114;
   @OriginalMember(
      owner = "client!hn",
      name = "h",
      descriptor = "I"
   )
   public static int field11115;
   @OriginalMember(
      owner = "client!hn",
      name = "g",
      descriptor = "I"
   )
   public static int field11116;

   static {
      for(int var0 = 0; ~var0 > ~field11113.length; ++var0) {
         field11113[var0] = new class14();
      }

      field11118 = -1;
      field11117 = 0;
      field11119 = new String[200];
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(I)V",
      line = 9
   )
   public static void method5471(int arg0) {
      try {
         int var1 = -1 % ((arg0 - 19) / 44);
         field11113 = null;
         field11119 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11121[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 20
   )
   public final String toString() {
      try {
         ++field11114;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11121[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(ZIIIII)V",
      line = 29
   )
   public static final void method5472(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (!arg0) {
            ++field11115;
            if (~class197.field2442 >= ~arg4 && class100.field1232 >= arg2 && arg3 >= class506.field7472 && ~class22.field234 <= ~arg1) {
               class621.method4487(arg4, arg5, arg1, arg2, arg3, (byte)-83);
            } else {
               class272.method2099(arg1, (byte)-42, arg2, arg4, arg5, arg3);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11121[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "<init>",
      descriptor = "(II)V",
      line = 74
   )
   public class751(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
