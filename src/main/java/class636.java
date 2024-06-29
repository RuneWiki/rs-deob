import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class636 extends class684 implements class64 {
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
   private final native void method4645(class473 arg0, class770 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

   @OriginalMember(
      owner = "client!na",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!na",
      name = "<init>",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   public class636(class473 arg0, class770 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method4645(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!na",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }
}
