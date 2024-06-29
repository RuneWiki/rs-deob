import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class575 {
   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V"
   )
   public static final void method4252(Applet arg0, int arg1, String arg2) throws Throwable {
      JSObject.getWindow(arg0).eval(arg2);
      int var3 = -89 % ((-3 - arg1) / 62);
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(ILjava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;"
   )
   public static final Object method4253(int arg0, String arg1, Object[] arg2, Applet arg3) throws Throwable {
      return arg0 != 3288 ? null : JSObject.getWindow(arg3).call(arg1, arg2);
   }

   @OriginalMember(
      owner = "client!nl",
      name = "a",
      descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;"
   )
   public static final Object method4254(Applet arg0, byte arg1, String arg2) throws Throwable {
      return arg1 != 16 ? null : JSObject.getWindow(arg0).call(arg2, (Object[])null);
   }
}
