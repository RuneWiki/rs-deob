import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class298 extends IOException {
   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4691 = new String[]{method2504(method2503(" \u007f\u0010\u0016Ci")), method2504(method2503(" \u007f\u0010\u0016Ei")), method2504(method2503(" \u007f\u0010\u0016Bi")), method2504(method2503("(t")), method2504(method2503("/i\u001dT")), method2504(method2503(":2_\u0016|")), method2504(method2503(" \u007f\u0010\u0016@i"))};
   @OriginalMember(
      owner = "client!aca",
      name = "b",
      descriptor = "[J"
   )
   public static long[] field4689 = new long[100];
   @OriginalMember(
      owner = "client!aca",
      name = "d",
      descriptor = "D"
   )
   public static double field4690;
   @OriginalMember(
      owner = "client!aca",
      name = "e",
      descriptor = "I"
   )
   public static int field4686;
   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "I"
   )
   public static int field4687;
   @OriginalMember(
      owner = "client!aca",
      name = "c",
      descriptor = "I"
   )
   public static int field4688;

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method2499(int arg0) {
      try {
         field4689 = null;
         if (arg0 != 9) {
            method2499(-59);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4691[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;IIB)Ljc;",
      line = 14
   )
   public static final class202 method2500(Canvas arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field4686;

         try {
            if (arg3 < 9) {
               method2502(71, (byte)-33);
            }

            Class var4 = Class.forName(field4691[3]);
            class202 var5 = (class202)var4.newInstance();
            var5.method1767((byte)107, arg1, arg2, arg0);
            return var5;
         } catch (Throwable var8) {
            class471 var6 = new class471();
            var6.method1767((byte)97, arg1, arg2, arg0);
            return var6;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4691[2] + (arg0 != null ? field4691[5] : field4691[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(II)Z",
      line = 39
   )
   public static final boolean method2501(int arg0, int arg1) {
      try {
         ++field4687;
         if (arg0 != 26256) {
            return true;
         } else {
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4691[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 52
   )
   public class298(String arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(IB)Z",
      line = 55
   )
   public static final boolean method2502(int arg0, byte arg1) {
      try {
         ++field4688;
         if (arg1 != -35) {
            method2501(39, 22);
         }

         return arg0 == 9 || arg0 == 10;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4691[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2503(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2504(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
