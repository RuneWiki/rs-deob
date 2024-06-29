import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class527 implements class575, class558 {
   @OriginalMember(
      owner = "client!xa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;

   @OriginalMember(
      owner = "client!xa",
      name = "w",
      descriptor = "(Z)V",
      line = 4
   )
   public final void method134(boolean arg0) {
      this.method3910(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "finalize",
      descriptor = "()V",
      line = 9
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!xa",
      name = "<init>",
      descriptor = "(II)V",
      line = 16
   )
   public class527(int arg0, int arg1) {
      this.method3909(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "r",
      descriptor = "(II)V"
   )
   private final native void method3909(int arg0, int arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "va",
      descriptor = "(JZ)V"
   )
   private final native void method3910(long arg0, boolean arg1);
}
