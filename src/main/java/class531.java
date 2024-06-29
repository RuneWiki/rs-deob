import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class531 implements class751, class562 {
   @OriginalMember(
      owner = "client!xa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;

   @OriginalMember(
      owner = "client!xa",
      name = "va",
      descriptor = "(JZ)V"
   )
   private final native void method3832(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "r",
      descriptor = "(II)V"
   )
   private final native void method3833(int arg0, int arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(8, this);
      }

   }

   @OriginalMember(
      owner = "client!xa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method167(boolean arg0) {
      this.method3832(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class531(int arg0, int arg1) {
      this.method3833(arg0, arg1);
   }
}
