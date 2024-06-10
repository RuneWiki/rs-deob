import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!p")
public class class34 {
   @OriginalMember(
      owner = "loginapplet!p",
      name = "a",
      descriptor = "Lsa;"
   )
   private static class41 field214 = class8.method31(-70, "The part of the website you are trying to connect to is offline at the moment)3 Please try again later)3");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "b",
      descriptor = "Z"
   )
   public static volatile boolean field215 = false;
   @OriginalMember(
      owner = "loginapplet!p",
      name = "c",
      descriptor = "I"
   )
   public static int field216;
   @OriginalMember(
      owner = "loginapplet!p",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field217 = true;
   @OriginalMember(
      owner = "loginapplet!p",
      name = "e",
      descriptor = "Lsa;"
   )
   private static class41 field218 = class8.method31(61, "Please wait while we check your details)3");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "f",
      descriptor = "Lsa;"
   )
   private static class41 field219 = class8.method31(-48, "Please wait while we redirect your browser)3");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "g",
      descriptor = "Lsa;"
   )
   private static class41 field220 = class8.method31(-86, "Sorry)1 there was an error trying to log you in to this part of the website)3 Please try again later)3");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "h",
      descriptor = "Lsa;"
   )
   private static class41 field221 = class8.method31(-126, "The information you entered is incorrect)3 Please try again or contact password support)3");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "i",
      descriptor = "Lsa;"
   )
   private static class41 field222 = class8.method31(56, "Username:");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "j",
      descriptor = "I"
   )
   public static int field223;
   @OriginalMember(
      owner = "loginapplet!p",
      name = "k",
      descriptor = "I"
   )
   public static int field224 = 0;
   @OriginalMember(
      owner = "loginapplet!p",
      name = "l",
      descriptor = "[[B"
   )
   public static byte[][] field225 = new byte[250][];
   @OriginalMember(
      owner = "loginapplet!p",
      name = "m",
      descriptor = "[[D"
   )
   public static double[][] field226 = new double[][]{{0.041D, 0.023D}, {0.047D, 0.024D}};
   @OriginalMember(
      owner = "loginapplet!p",
      name = "n",
      descriptor = "Lsa;"
   )
   private static class41 field227 = class8.method31(-76, "You must enter a valid username to proceed)3 Please try again)3");
   @OriginalMember(
      owner = "loginapplet!p",
      name = "o",
      descriptor = "[Lsa;"
   )
   public static class41[] field228 = new class41[]{field219, field227, field221, field218, field214, field220, field230, field222};
   @OriginalMember(
      owner = "loginapplet!p",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field229 = new int[128];
   @OriginalMember(
      owner = "loginapplet!p",
      name = "q",
      descriptor = "Lsa;"
   )
   private static class41 field230 = class8.method31(-86, "Password:");

   @OriginalMember(
      owner = "loginapplet!p",
      name = "a",
      descriptor = "(B)V",
      line = 44
   )
   public static void method155(byte arg0) {
      try {
         field229 = null;
         field230 = null;
         field227 = null;
         field226 = (double[][])null;
         field214 = null;
         field219 = null;
         field220 = null;
         field228 = null;
         field221 = null;
         field222 = null;
         field225 = (byte[][])null;
         field218 = null;
         int var1 = 42 % ((arg0 - 29) / 40);
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "p.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!p",
      name = "a",
      descriptor = "(BLjava/awt/Component;)V",
      line = 114
   )
   public static final void method156(byte arg0, Component arg1) {
      try {
         Method var2 = class38.field285;
         if (arg0 > -89) {
            field218 = (class41)null;
         }

         if (null != var2) {
            try {
               var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
         }

         arg1.addKeyListener(class8.field73);
         arg1.addFocusListener(class8.field73);
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "p.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }
}
