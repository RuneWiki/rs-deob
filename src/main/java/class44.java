import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!u")
public class class44 {
   @OriginalMember(
      owner = "loginapplet!u",
      name = "a",
      descriptor = "[J"
   )
   public static long[] field330 = new long[32];
   @OriginalMember(
      owner = "loginapplet!u",
      name = "b",
      descriptor = "[J"
   )
   public static long[] field331 = new long[32];
   @OriginalMember(
      owner = "loginapplet!u",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field332 = new String[]{".jagex.com", ".runescape.com", ".runescape.de"};

   @OriginalMember(
      owner = "loginapplet!u",
      name = "a",
      descriptor = "(ILjava/awt/Component;)V",
      line = 4
   )
   public static final void method216(int arg0, Component arg1) {
      try {
         arg1.removeKeyListener(class8.field73);
         arg1.removeFocusListener(class8.field73);
         if (arg0 > -39) {
            method217(127);
         }

         class34.field224 = -1;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "u.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!u",
      name = "a",
      descriptor = "(I)V",
      line = 38
   )
   public static void method217(int arg0) {
      try {
         field330 = null;
         field331 = null;
         if (arg0 == -1) {
            field332 = null;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "u.A(" + arg0 + ')');
      }
   }
}
