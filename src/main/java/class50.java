import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class50 extends class510 implements class556 {
   @OriginalMember(
      owner = "client!na",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!na",
      name = "finalize",
      descriptor = "()V",
      line = 3
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)123, this);
      }

   }

   @OriginalMember(
      owner = "client!na",
      name = "<init>",
      descriptor = "(Loa;Lya;II[I[I)V",
      line = 9
   )
   public class50(class721 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method610(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!na",
      name = "ma",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   private final native void method610(class721 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

   @OriginalMember(
      owner = "client!na",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);
}
