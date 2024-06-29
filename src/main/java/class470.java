import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class470 extends class657 {
   @OriginalMember(
      owner = "client!vs",
      name = "w",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field6822;

   @OriginalMember(
      owner = "client!vs",
      name = "e",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method3607(int arg0) {
      return arg0 != 12 ? (Object)null : this.field6822.get();
   }

   @OriginalMember(
      owner = "client!vs",
      name = "<init>",
      descriptor = "(Lhh;Ljava/lang/Object;I)V"
   )
   public class470(class250 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field6822 = new SoftReference(arg1);
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method3608(int arg0) {
      if (arg0 != 14336) {
         this.field6822 = (SoftReference)null;
      }

      return true;
   }
}
