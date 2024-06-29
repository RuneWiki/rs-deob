import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class58 extends class438 implements class562 {
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
   private final native void method439(class725 arg0, int arg1);

   @OriginalMember(
      owner = "client!ya",
      name = "ga",
      descriptor = "()V"
   )
   public final native void method440();

   @OriginalMember(
      owner = "client!ya",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method167(boolean arg0);

   @OriginalMember(
      owner = "client!ya",
      name = "r",
      descriptor = "()V"
   )
   public final native void method441();

   @OriginalMember(
      owner = "client!ya",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(75, this);
      }

   }

   @OriginalMember(
      owner = "client!ya",
      name = "<init>",
      descriptor = "(Loa;I)V"
   )
   public class58(class725 arg0, int arg1) {
      this.method439(arg0, arg1);
   }
}
