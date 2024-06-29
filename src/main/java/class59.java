import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class59 extends class434 implements class558 {
   @OriginalMember(
      owner = "client!ya",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ya",
      name = "r",
      descriptor = "()V"
   )
   public final native void method492();

   @OriginalMember(
      owner = "client!ya",
      name = "aa",
      descriptor = "(Loa;I)V"
   )
   private final native void method493(class722 arg0, int arg1);

   @OriginalMember(
      owner = "client!ya",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);

   @OriginalMember(
      owner = "client!ya",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!ya",
      name = "ga",
      descriptor = "()V"
   )
   public final native void method494();

   @OriginalMember(
      owner = "client!ya",
      name = "<init>",
      descriptor = "(Loa;I)V"
   )
   public class59(class722 arg0, int arg1) {
      this.method493(arg0, arg1);
   }
}
