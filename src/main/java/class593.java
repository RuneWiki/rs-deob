import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class593 extends class347 {
   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8752 = new String[]{method4359(method4358("cJ\u0007bV")), method4359(method4358("cJ\u0007mV"))};
   @OriginalMember(
      owner = "client!qi",
      name = "n",
      descriptor = "Ljca;"
   )
   public static class712 field8746 = new class712();
   @OriginalMember(
      owner = "client!qi",
      name = "l",
      descriptor = "I"
   )
   public static int field8747;
   @OriginalMember(
      owner = "client!qi",
      name = "i",
      descriptor = "I"
   )
   public static int field8748;
   @OriginalMember(
      owner = "client!qi",
      name = "k",
      descriptor = "I"
   )
   public int field8749;
   @OriginalMember(
      owner = "client!qi",
      name = "m",
      descriptor = "I"
   )
   public int field8750;
   @OriginalMember(
      owner = "client!qi",
      name = "j",
      descriptor = "[I"
   )
   public int[] field8751;

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   public static void method4356(byte arg0) {
      try {
         field8746 = null;
         if (arg0 != 99) {
            method4356((byte)81);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8752[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(B)V",
      line = 24
   )
   public static final void method4357(byte arg0) {
      try {
         ++field8747;
         if (class236.field2997 != null) {
            if (~class236.field2997.field159 == -2) {
               class236.field2997 = null;
               return;
            }

            if (~class236.field2997.field159 == -3) {
               class417.method3190(2, -125, class653.field9513, class689.field10372);
               class236.field2997 = null;
               return;
            }
         }

         if (arg0 <= 71) {
            field8746 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8752[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(IIIIILjava/awt/Graphics;II)V"
   )
   public abstract void method985(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(IILjava/awt/Canvas;B)V"
   )
   public abstract void method986(int arg0, int arg1, Canvas arg2, byte arg3);

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4358(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4359(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
