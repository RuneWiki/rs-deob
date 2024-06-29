import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public interface class1 {
   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7);

   @OriginalMember(
      owner = "client!us",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7);
}
