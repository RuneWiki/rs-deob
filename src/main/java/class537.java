import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class537 {
   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;"
   )
   public static final Object method4074(int arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
      return arg0 <= 81 ? null : JSObject.getWindow(arg2).call(arg1, arg3);
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V"
   )
   public static final void method4075(String arg0, Applet arg1, int arg2) throws Throwable {
      JSObject.getWindow(arg1).eval(arg0);
      if (arg2 == 23863) {
         ;
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;"
   )
   public static final Object method4076(String arg0, Applet arg1, boolean arg2) throws Throwable {
      return arg2 ? null : JSObject.getWindow(arg1).call(arg0, (Object[])null);
   }
}
