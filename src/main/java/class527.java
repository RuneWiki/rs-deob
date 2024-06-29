import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class527 extends class33 {
   @OriginalMember(
      owner = "client!ku",
      name = "B",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field8010;

   @OriginalMember(
      owner = "client!ku",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class527(Object arg0, int arg1) {
      super(arg1);
      this.field8010 = new SoftReference(arg0);
   }

   @OriginalMember(
      owner = "client!ku",
      name = "g",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method244(int arg0) {
      return arg0 != -1 ? (Object)null : this.field8010.get();
   }

   @OriginalMember(
      owner = "client!ku",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method245(int arg0) {
      if (arg0 >= -32) {
         this.field8010 = (SoftReference)null;
      }

      return true;
   }
}
