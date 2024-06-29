import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class34 extends class86 {
   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field395;

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method268(byte arg0) {
      int var2 = 8 / ((62 - arg0) / 55);
      return this.field395.get();
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class34(Object arg0, int arg1) {
      super(arg1);
      this.field395 = new SoftReference(arg0);
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method269(int arg0) {
      if (arg0 != 134) {
         this.method269(90);
      }

      return true;
   }
}
