import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!h")
public class class18 {
   @OriginalMember(
      owner = "loginapplet!h",
      name = "a",
      descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)Ljava/lang/Object;",
      line = 4
   )
   public static final Object method89(String arg0, byte arg1, Applet arg2) throws Throwable {
      try {
         return arg1 > -69 ? (Object)null : JSObject.getWindow(arg2).eval(arg0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }
}
