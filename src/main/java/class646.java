import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class646 extends InputStream {
   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9678 = new String[]{method4752(method4751("N\u007fMA?DwHG")), method4752(method4751("N\u007fMA\f\t")), method4752(method4751("N\u007fMA\u000f\t"))};
   @OriginalMember(
      owner = "client!oia",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field9677 = new class418(87, 6);
   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "I"
   )
   public static int field9675;
   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "I"
   )
   public static int field9676;

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4749(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 > -11) {
            return false;
         } else {
            ++field9676;
            return ~(2048 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9678[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         class340.method2717(30000L, (byte)-119);
         ++field9675;
         return -1;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9678[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4750(boolean arg0) {
      try {
         if (!arg0) {
            field9677 = null;
         }

         field9677 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9678[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4751(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4752(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
