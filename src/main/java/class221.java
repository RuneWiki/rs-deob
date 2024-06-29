import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class221 extends class754 {
   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field3320;

   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "(Z)Ljava/lang/Object;"
   )
   public final Object method1864(boolean arg0) {
      if (!arg0) {
         this.field3320 = (SoftReference)null;
      }

      return this.field3320.get();
   }

   @OriginalMember(
      owner = "client!eq",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class221(Object arg0, int arg1) {
      super(arg1);
      this.field3320 = new SoftReference(arg0);
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1865(int arg0) {
      int var2 = 67 / ((19 - arg0) / 55);
      return true;
   }
}
