import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class189 extends class502 {
   @OriginalMember(
      owner = "client!tn",
      name = "y",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field2406;

   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method1582(byte arg0) {
      int var2 = -63 % ((arg0 - 61) / 57);
      return this.field2406.get();
   }

   @OriginalMember(
      owner = "client!tn",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class189(Object arg0, int arg1) {
      super(arg1);
      this.field2406 = new SoftReference(arg0);
   }

   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method1583(byte arg0) {
      if (arg0 != 43) {
         this.field2406 = (SoftReference)null;
      }

      return true;
   }
}
