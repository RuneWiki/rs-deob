import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class58 extends class432 implements class556 {
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
   private final native void method653(class721 arg0, int arg1);

   @OriginalMember(
      owner = "client!ya",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!ya",
      name = "ga",
      descriptor = "()V"
   )
   public final native void method654();

   @OriginalMember(
      owner = "client!ya",
      name = "r",
      descriptor = "()V"
   )
   public final native void method655();

   @OriginalMember(
      owner = "client!ya",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)92, this);
      }

   }

   @OriginalMember(
      owner = "client!ya",
      name = "<init>",
      descriptor = "(Loa;I)V"
   )
   public class58(class721 arg0, int arg1) {
      this.method653(arg0, arg1);
   }
}
