import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class273 extends class297 {
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4387 = new String[]{method2322(method2321("y<I:")), method2322(method2321("7d\u0005")), method2322(method2321("7 Ul")), method2322(method2321("egm~")), method2322(method2321("+ H1\u001a&w")), method2322(method2321("+ H1\u001a'w")), method2322(method2321("x9@8Ty")), method2322(method2321("~'S9\u001d")), method2322(method2321("lg\u000bxZ")), method2322(method2321("Cx\u0005{\u0007")), method2322(method2321("egb~"))};
   @OriginalMember(
      owner = "client!r",
      name = "u",
      descriptor = "I"
   )
   public static int field4385;
   @OriginalMember(
      owner = "client!r",
      name = "v",
      descriptor = "I"
   )
   public static int field4386;

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(ILrga;IBIILgea;IIIII)V",
      line = 4
   )
   public static final void method2319(int arg0, class694 arg1, int arg2, byte arg3, int arg4, int arg5, class750 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         if (arg3 >= -21) {
            method2319(1, (class694)null, 26, (byte)18, -105, -46, (class750)null, 64, 98, 59, -65, -84);
         }

         class610.field8877 = null;
         class8.field46 = arg8;
         class535.field8109 = arg1;
         class12.field157 = arg7;
         class249.field3785 = arg6;
         class609.field8870 = null;
         class629.field9104 = arg10;
         class346.field5306 = arg2;
         class656.field9805 = arg4;
         ++field4385;
         class335.field5147 = null;
         class754.field11177 = arg9;
         class601.field8798 = arg5;
         class491.field7428 = arg0;
         class127.field1817 = arg11;
         class421.method3346((byte)-116);
         class146.field2180 = true;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field4387[10] + arg0 + ',' + (arg1 != null ? field4387[8] : field4387[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field4387[8] : field4387[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(Lgb;B)Z",
      line = 34
   )
   public static final boolean method2320(class29 param0, byte param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2321(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2322(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
