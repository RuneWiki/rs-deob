import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class164 {
   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;"
   )
   public static final Object method1306(String arg0, int arg1, Applet arg2, Object[] arg3) throws Throwable {
      return arg1 != -29876 ? null : JSObject.getWindow(arg2).call(arg0, arg3);
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;"
   )
   public static final Object method1307(int arg0, Applet arg1, String arg2) throws Throwable {
      return arg0 != -22955 ? null : JSObject.getWindow(arg1).call(arg2, (Object[])null);
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V"
   )
   public static final void method1308(String arg0, int arg1, Applet arg2) throws Throwable {
      if (arg1 == -31829) {
         JSObject.getWindow(arg2).eval(arg0);
      }
   }
}
