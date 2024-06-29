import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class409 extends class194 implements class562 {
   @OriginalMember(
      owner = "client!ba",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ba",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class409(class725 arg0) {
   }

   @OriginalMember(
      owner = "client!ba",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method167(boolean arg0);

   @OriginalMember(
      owner = "client!ba",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(18, this);
      }

   }
}
