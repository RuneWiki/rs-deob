import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class572 implements class220, class787 {
   @OriginalMember(
      owner = "client!xa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;

   @OriginalMember(
      owner = "client!xa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class611.method4509(-7155, this);
      }

   }

   @OriginalMember(
      owner = "client!xa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method477(boolean arg0) {
      this.method4295(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "va",
      descriptor = "(JZ)V"
   )
   private final native void method4295(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "r",
      descriptor = "(II)V"
   )
   private final native void method4296(int arg0, int arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class572(int arg0, int arg1) {
      this.method4296(arg0, arg1);
   }
}
