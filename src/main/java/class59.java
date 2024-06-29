import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class438 implements class560 {
   @OriginalMember(
      owner = "client!ya",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ya",
      name = "aa",
      descriptor = "(Loa;I)V"
   )
   private final native void method459(class724 arg0, int arg1);

   @OriginalMember(
      owner = "client!ya",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!ya",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method113(boolean arg0);

   @OriginalMember(
      owner = "client!ya",
      name = "<init>",
      descriptor = "(Loa;I)V"
   )
   public class59(class724 arg0, int arg1) {
      this.method459(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ya",
      name = "r",
      descriptor = "()V"
   )
   public final native void method460();

   @OriginalMember(
      owner = "client!ya",
      name = "ga",
      descriptor = "()V"
   )
   public final native void method461();
}
