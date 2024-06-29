import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class51 extends class515 implements class560 {
   @OriginalMember(
      owner = "client!na",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!na",
      name = "<init>",
      descriptor = "(Loa;Lya;II[I[I)V",
      line = 4
   )
   public class51(class724 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method409(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!na",
      name = "finalize",
      descriptor = "()V",
      line = 8
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!na",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method113(boolean arg0);

   @OriginalMember(
      owner = "client!na",
      name = "ma",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   private final native void method409(class724 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5);
}
