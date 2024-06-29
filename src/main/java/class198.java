import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class198 implements class221 {
   @OriginalMember(
      owner = "client!hf",
      name = "b",
      descriptor = "I"
   )
   public int field2869;
   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2873 = new String[]{method1741(method1740("X\u000b1Fuc\u0019m[tWE")), method1741(method1740("X\u000b1\u000es^\u0004k\f2")), method1741(method1740("^\u0018s^")), method1741(method1740("KC1\u001cg")), method1741(method1740("X\u000b1s2"))};
   @OriginalMember(
      owner = "client!hf",
      name = "c",
      descriptor = "S"
   )
   public static short field2870 = 32767;
   @OriginalMember(
      owner = "client!hf",
      name = "e",
      descriptor = "I"
   )
   public static int field2868;
   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "I"
   )
   public static int field2871;
   @OriginalMember(
      owner = "client!hf",
      name = "d",
      descriptor = "I"
   )
   public static int field2872;

   @OriginalMember(
      owner = "client!hf",
      name = "a",
      descriptor = "(ZIZILjava/lang/String;)V"
   )
   public static final void method1739(boolean arg0, int arg1, boolean arg2, int arg3, String arg4) {
      try {
         class414.method3237(arg0, arg1, arg4, arg2, true, (String)null, arg3);
         ++field2868;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2873[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2873[3] : field2873[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2872;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2873[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class198(String arg0, int arg1) {
      try {
         this.field2869 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2873[1] + (arg0 != null ? field2873[3] : field2873[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1740(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1741(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
