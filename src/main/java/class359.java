import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class359 {
   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;"
   )
   public static final Object method2803(String arg0, Applet arg1, byte arg2) throws Throwable {
      return arg2 > -65 ? null : JSObject.getWindow(arg1).call(arg0, (Object[])null);
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;"
   )
   public static final Object method2804(Applet arg0, Object[] arg1, String arg2, byte arg3) throws Throwable {
      int var4 = -69 % ((arg3 - 8) / 45);
      return JSObject.getWindow(arg0).call(arg2, arg1);
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V"
   )
   public static final void method2805(Applet arg0, int arg1, String arg2) throws Throwable {
      JSObject.getWindow(arg0).eval(arg2);
      if (arg1 == -21847) {
         ;
      }
   }
}
