import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class359 {
   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5310 = new String[]{method2824(method2823("\b;\u0013*b")), method2824(method2823("\u001d`Qh")), method2824(method2823("\u001ew\u0013E7")), method2824(method2823("\u001ew\u0013pp aOmq\u0014=")), method2824(method2823("\u001ew\u0013F7"))};
   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "I"
   )
   public static int field5306 = 0;
   @OriginalMember(
      owner = "client!mb",
      name = "f",
      descriptor = "Lbu;"
   )
   public static class234 field5305 = new class234(8, 0, 4, 1);
   @OriginalMember(
      owner = "client!mb",
      name = "e",
      descriptor = "I"
   )
   public static int field5304;
   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "I"
   )
   public static int field5308;
   @OriginalMember(
      owner = "client!mb",
      name = "c",
      descriptor = "J"
   )
   public static long field5309;
   @OriginalMember(
      owner = "client!mb",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5307;

   @OriginalMember(
      owner = "client!mb",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field5308;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5310[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(II[B)I"
   )
   public static final int method2821(int arg0, int arg1, byte[] arg2) {
      try {
         if (arg0 != 8052) {
            return -34;
         } else {
            ++field5304;
            return class28.method356(arg2, 0, arg1, (byte)-122);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5310[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5310[0] : field5310[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2822(int arg0) {
      try {
         if (arg0 == 0) {
            field5307 = null;
            field5305 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5310[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2823(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2824(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
