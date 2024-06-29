import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class525 implements class117, class556 {
   @OriginalMember(
      owner = "client!xa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;

   @OriginalMember(
      owner = "client!xa",
      name = "finalize",
      descriptor = "()V",
      line = 5
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)104, this);
      }

   }

   @OriginalMember(
      owner = "client!xa",
      name = "<init>",
      descriptor = "(II)V",
      line = 16
   )
   public class525(int arg0, int arg1) {
      this.method3944(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "w",
      descriptor = "(Z)V",
      line = 14
   )
   public final void method139(boolean arg0) {
      this.method3945(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!xa",
      name = "r",
      descriptor = "(II)V"
   )
   private final native void method3944(int arg0, int arg1);

   @OriginalMember(
      owner = "client!xa",
      name = "va",
      descriptor = "(JZ)V"
   )
   private final native void method3945(long arg0, boolean arg1);
}
