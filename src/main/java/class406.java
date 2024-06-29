import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class406 extends class193 implements class558 {
   @OriginalMember(
      owner = "client!ba",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ba",
      name = "finalize",
      descriptor = "()V",
      line = 5
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!ba",
      name = "<init>",
      descriptor = "(Loa;)V",
      line = 9
   )
   public class406(class722 arg0) {
   }

   @OriginalMember(
      owner = "client!ba",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);
}
