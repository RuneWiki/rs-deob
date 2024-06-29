import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class636 implements class725 {
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "J"
   )
   private long field9253 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "Lj;"
   )
   public class567 field9255;
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "Lxa;"
   )
   public class527 field9254;

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V",
      line = 6
   )
   public final void method4580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4582(this.field9253, this.field9255.nativeid, this.field9254.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V",
      line = 10
   )
   public final void method4581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4583(this.field9253, this.field9255.nativeid, this.field9254.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V",
      line = 18
   )
   public class636(class722 arg0, class567 arg1, class527 arg2) {
      this.field9253 = arg0.nativeid;
      this.field9255 = arg1;
      this.field9254 = arg2;
   }

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4582(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4583(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
