import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class665 extends class299 {
   @OriginalMember(
      owner = "client!qt",
      name = "D",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field9663;

   @OriginalMember(
      owner = "client!qt",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class665(Object arg0, int arg1) {
      super(arg1);
      this.field9663 = new SoftReference(arg0);
   }

   @OriginalMember(
      owner = "client!qt",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method2234(byte arg0) {
      if (arg0 <= 58) {
         this.field9663 = (SoftReference)null;
      }

      return true;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method2235(int arg0) {
      if (arg0 != 100) {
         this.field9663 = (SoftReference)null;
      }

      return this.field9663.get();
   }
}
