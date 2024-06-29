import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class452 implements class302 {
   @OriginalMember(
      owner = "client!wg",
      name = "d",
      descriptor = "[F"
   )
   public float[] field6398;
   @OriginalMember(
      owner = "client!wg",
      name = "g",
      descriptor = "I"
   )
   public int field6399;
   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "I"
   )
   public int field6401;
   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6404 = new String[]{method3299(method3298("\u0017C\f{S")), method3299(method3298("\u0017C\f\u0005\u0012\u000eMV\u0007S")), method3299(method3298("\u001b\n\f\u0017\u0006")), method3299(method3298("\u000eQNU")), method3299(method3298("\u0017C\fxS"))};
   @OriginalMember(
      owner = "client!wg",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field6395 = new class118(4, 3);
   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "Lek;"
   )
   public static class536 field6402 = new class536(86, 15);
   @OriginalMember(
      owner = "client!wg",
      name = "i",
      descriptor = "Leg;"
   )
   public static class118 field6403 = new class118(24, 4);
   @OriginalMember(
      owner = "client!wg",
      name = "h",
      descriptor = "I"
   )
   public static int field6397;
   @OriginalMember(
      owner = "client!wg",
      name = "e",
      descriptor = "Ldg;"
   )
   public static class436 field6400;
   @OriginalMember(
      owner = "client!wg",
      name = "c",
      descriptor = "[S"
   )
   public static short[] field6396;

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)V"
   )
   public static final void method3296(int arg0, Canvas arg1) {
      try {
         ++field6397;
         if (arg0 == -12371) {
            Dimension var2 = arg1.getSize();
            class395.method2991(var2.height, var2.width, 0);
            if (class614.field9025 == 1) {
               class50.field660.method588(arg1, class752.field11122, class790.field11596);
            } else {
               class50.field660.method588(arg1, class392.field5678, class236.field3290);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6404[4] + arg0 + ',' + (arg1 != null ? field6404[2] : field6404[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3297(int arg0) {
      try {
         field6396 = null;
         field6395 = null;
         field6400 = null;
         field6403 = null;
         if (arg0 > -67) {
            method3296(-51, (Canvas)null);
         }

         field6402 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6404[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class452(int arg0, int arg1) {
      try {
         this.field6398 = new float[arg0 * arg1];
         this.field6399 = arg1;
         this.field6401 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6404[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
