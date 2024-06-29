import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class202 extends class294 {
   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3091 = new String[]{method1770(method1769("X+yY\u0013")), method1770(method1769("\u00039>\u001a\t\u001e")), method1770(method1769("Mp;\u001b")), method1770(method1769("Ify>F")), method1770(method1769("Ify?F"))};
   @OriginalMember(
      owner = "client!jc",
      name = "m",
      descriptor = "[J"
   )
   public static long[] field3085 = new long[32];
   @OriginalMember(
      owner = "client!jc",
      name = "r",
      descriptor = "I"
   )
   public static int field3089 = 0;
   @OriginalMember(
      owner = "client!jc",
      name = "o",
      descriptor = "I"
   )
   public int field3084;
   @OriginalMember(
      owner = "client!jc",
      name = "s",
      descriptor = "I"
   )
   public static int field3087;
   @OriginalMember(
      owner = "client!jc",
      name = "p",
      descriptor = "I"
   )
   public int field3090;
   @OriginalMember(
      owner = "client!jc",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field3086;
   @OriginalMember(
      owner = "client!jc",
      name = "q",
      descriptor = "[I"
   )
   public int[] field3088;

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "([II)Ljava/lang/String;",
      line = 3
   )
   public static final String method1765(int[] arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field3087;
         if (arg1 <= 24) {
            field3086 = null;
         }

         StringBuffer var3 = new StringBuffer();
         int var4 = class722.field10808;
         int var5 = 0;
         if (!var2 && var5 >= arg0.length) {
            return var3.toString();
         } else {
            do {
               class385 var6 = class293.field4644.method981((byte)-40, arg0[var5]);
               if (var6.field6068 != -1) {
                  class672 var7 = (class672)class355.field5443.method2544(false, (long)var6.field6068);
                  if (var7 == null) {
                     class776 var8 = class776.method5639(class316.field4879, var6.field6068, 0);
                     if (var8 != null) {
                        var7 = class351.field5356.method606(var8, true);
                        class355.field5443.method2545((long)var6.field6068, 111, var7);
                     }
                  }

                  if (var7 != null) {
                     class610.field8880[var4] = var7;
                     var3.append(field3091[1]).append(var4).append(">");
                     ++var4;
                  }
               }

               ++var5;
            } while(var5 < arg0.length);

            return var3.toString();
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3091[3] + (arg0 != null ? field3091[0] : field3091[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(I)V",
      line = 70
   )
   public static void method1768(int arg0) {
      try {
         field3086 = null;
         if (arg0 >= -46) {
            field3085 = null;
         }

         field3085 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3091[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(IIIIILjava/awt/Graphics;BI)V"
   )
   public abstract void method1766(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, byte arg6, int arg7);

   @OriginalMember(
      owner = "client!jc",
      name = "a",
      descriptor = "(BIILjava/awt/Canvas;)V"
   )
   public abstract void method1767(byte arg0, int arg1, int arg2, Canvas arg3);

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1769(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1770(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
