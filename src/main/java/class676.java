import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class676 {
   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(ZLjava/applet/Applet;Ljava/lang/String;)V",
      line = 5
   )
   public static final void method4987(boolean arg0, Applet arg1, String arg2) throws Throwable {
      JSObject.getWindow(arg1).eval(arg2);
      if (!arg0) {
         ;
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;",
      line = 15
   )
   public static final Object method4988(Object[] arg0, String arg1, Applet arg2, int arg3) throws Throwable {
      return arg3 != 22523 ? null : JSObject.getWindow(arg2).call(arg1, arg0);
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;",
      line = 25
   )
   public static final Object method4989(Applet arg0, String arg1, int arg2) throws Throwable {
      return arg2 != -23226 ? null : JSObject.getWindow(arg0).call(arg1, (Object[])null);
   }
}
