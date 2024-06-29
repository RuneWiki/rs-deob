import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class51 extends class512 implements class558 {
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
      line = 6
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!na",
      name = "<init>",
      descriptor = "(Loa;Lya;II[I[I)V",
      line = 10
   )
   public class51(class722 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      this.method406(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!na",
      name = "ma",
      descriptor = "(Loa;Lya;II[I[I)V"
   )
   private final native void method406(class722 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

   @OriginalMember(
      owner = "client!na",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);
}
