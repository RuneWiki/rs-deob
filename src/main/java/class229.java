import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class229 implements class726, class245 {
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
   private final native void method1978(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method625(boolean arg0) {
      this.method1978(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "r",
      descriptor = "(II)V"
   )
   private final native void method1979(int arg0, int arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class229(int arg0, int arg1) {
      this.method1979(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }
}
