import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class770 extends class348 implements class64 {
   @OriginalMember(
      owner = "client!ya",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ya",
      name = "ga",
      descriptor = "()V"
   )
   public final native void method5544();

   @OriginalMember(
      owner = "client!ya",
      name = "r",
      descriptor = "()V"
   )
   public final native void method5545();

   @OriginalMember(
      owner = "client!ya",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!ya",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!ya",
      name = "<init>",
      descriptor = "(Loa;I)V"
   )
   public class770(class473 arg0, int arg1) {
      this.method5546(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ya",
      name = "aa",
      descriptor = "(Loa;I)V"
   )
   private final native void method5546(class473 arg0, int arg1);
}
