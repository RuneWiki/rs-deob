import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class364 extends class562 {
   @OriginalMember(
      owner = "client!tk",
      name = "A",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field5002;

   @OriginalMember(
      owner = "client!tk",
      name = "<init>",
      descriptor = "(Liv;Ljava/lang/Object;I)V",
      line = 4
   )
   public class364(class107 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field5002 = new SoftReference(arg1);
   }

   @OriginalMember(
      owner = "client!tk",
      name = "a",
      descriptor = "(I)Z",
      line = 14
   )
   public final boolean method2448(int arg0) {
      return arg0 == 0;
   }

   @OriginalMember(
      owner = "client!tk",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;",
      line = 24
   )
   public final Object method2447(int arg0) {
      return arg0 <= 16 ? (Object)null : this.field5002.get();
   }
}
