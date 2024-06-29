import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class328 extends Exception {
   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4695 = new String[]{method2543(method2542("aP\u0007Db")), method2543(method2542("r\u0018HDZ2")), method2543(method2542("t\u000bE\u0006")), method2543(method2542("r\u0018HD\\2")), method2543(method2542("r\u0018HD]2")), method2543(method2542("r\u0018HD^2")), method2543(method2542("r\u0018HD[2"))};
   @OriginalMember(
      owner = "client!hfa",
      name = "f",
      descriptor = "Luw;"
   )
   public static class435 field4692 = new class435(23, 7);
   @OriginalMember(
      owner = "client!hfa",
      name = "d",
      descriptor = "I"
   )
   public static int field4693 = 0;
   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field4694 = new class572(1, 4);
   @OriginalMember(
      owner = "client!hfa",
      name = "g",
      descriptor = "I"
   )
   public static int field4688;
   @OriginalMember(
      owner = "client!hfa",
      name = "c",
      descriptor = "I"
   )
   public static int field4689;
   @OriginalMember(
      owner = "client!hfa",
      name = "e",
      descriptor = "I"
   )
   public static int field4690;
   @OriginalMember(
      owner = "client!hfa",
      name = "b",
      descriptor = "I"
   )
   public static int field4691;

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(Ld;Ljava/awt/Canvas;ILhw;BI)Lha;"
   )
   public static final class65 method2537(class160 arg0, Canvas arg1, int arg2, class141 arg3, byte arg4, int arg5) {
      try {
         ++field4689;
         int var6 = 0;
         int var7 = 0;
         if (arg1 != null) {
            Dimension var8 = arg1.getSize();
            var7 = var8.height;
            var6 = var8.width;
         }

         int var9 = 85 / ((arg4 - -15) / 60);
         return class65.method692(arg1, arg2, arg5, arg3, arg0, 2048, var6, var7);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4695[3] + (arg0 != null ? field4695[0] : field4695[2]) + ',' + (arg1 != null ? field4695[0] : field4695[2]) + ',' + arg2 + ',' + (arg3 != null ? field4695[0] : field4695[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2538(boolean arg0) {
      try {
         field4692 = null;
         if (arg0) {
            field4694 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4695[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2539(int arg0, int arg1) {
      try {
         ++field4690;
         return arg0 != 255 ? -74 : arg1 & 255;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4695[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(ILuda;)Lfea;"
   )
   public static final class151 method2540(int arg0, class473 arg1) {
      try {
         ++field4688;
         class411 var2 = class650.method4770(1995480456, arg1);
         int var3 = arg1.method3538(-128);
         return arg0 != 7 ? null : new class151(var2.field6556, var2.field6564, var2.field6561, var2.field6560, var2.field6555, var2.field6566, var2.field6551, var2.field6562, var2.field6554, var2.field6027, var2.field6020, var2.field6019, var2.field6018, var2.field6021, var2.field6024, var3);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4695[1] + arg0 + ',' + (arg1 != null ? field4695[0] : field4695[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2541(byte arg0, int arg1) {
      try {
         ++field4691;
         class179 var2 = class774.field11334;
         synchronized(class774.field11334) {
            if (arg0 == -27) {
               class774.field11334.method1579(120, arg1);
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4695[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2542(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2543(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
