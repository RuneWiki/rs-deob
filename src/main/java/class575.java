import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class575 extends class96 implements class245 {
   @OriginalMember(
      owner = "client!na",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!na",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!na",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method625(boolean arg0);

   @OriginalMember(
      owner = "client!na",
      name = "ma",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   private final native void method4318(class74 arg0, class515 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

   @OriginalMember(
      owner = "client!na",
      name = "<init>",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   public class575(class74 arg0, class515 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method4318(arg0, arg1, arg2, arg3, arg4, arg5);
   }
}
