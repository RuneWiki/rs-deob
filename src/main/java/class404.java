import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class404 extends class192 implements class556 {
   @OriginalMember(
      owner = "client!ba",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ba",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!ba",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)-104, this);
      }

   }

   @OriginalMember(
      owner = "client!ba",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class404(class721 arg0) {
   }
}
