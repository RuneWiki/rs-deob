import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class50 extends class516 implements class562 {
   @OriginalMember(
      owner = "client!na",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!na",
      name = "ma",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   private final native void method414(class725 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

   @OriginalMember(
      owner = "client!na",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method167(boolean arg0);

   @OriginalMember(
      owner = "client!na",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(51, this);
      }

   }

   @OriginalMember(
      owner = "client!na",
      name = "<init>",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   public class50(class725 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method414(arg0, arg1, arg2, arg3, arg4, arg5);
   }
}
