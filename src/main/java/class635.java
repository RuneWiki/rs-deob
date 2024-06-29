import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class635 implements class723 {
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "J"
   )
   private long field9260 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "Lj;"
   )
   public class565 field9259;
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "Lxa;"
   )
   public class525 field9258;

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4656(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4657(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method4465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4657(this.field9260, this.field9259.nativeid, this.field9258.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method4466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4656(this.field9260, this.field9259.nativeid, this.field9258.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V"
   )
   public class635(class721 arg0, class565 arg1, class525 arg2) {
      this.field9260 = arg0.nativeid;
      this.field9259 = arg1;
      this.field9258 = arg2;
   }
}
