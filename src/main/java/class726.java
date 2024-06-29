import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class726 {
   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;"
   )
   public static final Object method5252(Object[] arg0, Applet arg1, String arg2, int arg3) throws Throwable {
      return arg3 != 17462 ? null : JSObject.getWindow(arg1).call(arg2, arg0);
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V"
   )
   public static final void method5253(String arg0, Applet arg1, byte arg2) throws Throwable {
      if (arg2 == -106) {
         JSObject.getWindow(arg1).eval(arg0);
      }
   }

   @OriginalMember(
      owner = "client!pu",
      name = "a",
      descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;"
   )
   public static final Object method5254(int arg0, Applet arg1, String arg2) throws Throwable {
      return arg0 < 67 ? null : JSObject.getWindow(arg1).call(arg2, (Object[])null);
   }
}
