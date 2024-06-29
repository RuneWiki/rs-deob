import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class628 extends class580 {
   @OriginalMember(
      owner = "client!dl",
      name = "v",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field8954;

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2067(byte arg0) {
      if (arg0 < 117) {
         this.method2068((byte)-47);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!dl",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class628(Object arg0, int arg1) {
      super(arg1);
      this.field8954 = new SoftReference(arg0);
   }

   @OriginalMember(
      owner = "client!dl",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method2068(byte arg0) {
      if (arg0 != 50) {
         this.method2068((byte)91);
      }

      return this.field8954.get();
   }
}
