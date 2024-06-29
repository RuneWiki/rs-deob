import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class660 implements class334, class64 {
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
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!xa",
      name = "va",
      descriptor = "(JZ)V"
   )
   private final native void method4796(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "r",
      descriptor = "(II)V"
   )
   private final native void method4797(int arg0, int arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method633(boolean arg0) {
      this.method4796(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class660(int arg0, int arg1) {
      this.method4797(arg0, arg1);
   }
}
