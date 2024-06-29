import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class548 {
   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;",
      line = 5
   )
   public static final Object method3932(String arg0, int arg1, Applet arg2, Object[] arg3) throws Throwable {
      return arg1 != 1082 ? null : JSObject.getWindow(arg2).call(arg0, arg3);
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V",
      line = 15
   )
   public static final void method3933(String arg0, Applet arg1, int arg2) throws Throwable {
      if (arg2 <= -114) {
         JSObject.getWindow(arg1).eval(arg0);
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;)Ljava/lang/Object;",
      line = 25
   )
   public static final Object method3934(Applet arg0, boolean arg1, String arg2) throws Throwable {
      return arg1 ? null : JSObject.getWindow(arg0).call(arg2, (Object[])null);
   }
}
