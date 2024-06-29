import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class792 extends class249 {
   @OriginalMember(
      owner = "client!mp",
      name = "y",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field11569;

   @OriginalMember(
      owner = "client!mp",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;",
      line = 5
   )
   public final Object method2023(byte arg0) {
      if (arg0 != 59) {
         this.field11569 = (SoftReference)null;
      }

      return this.field11569.get();
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(B)Z",
      line = 16
   )
   public final boolean method2022(byte arg0) {
      if (arg0 < 122) {
         this.field11569 = (SoftReference)null;
      }

      return true;
   }

   @OriginalMember(
      owner = "client!mp",
      name = "<init>",
      descriptor = "(Lcba;Ljava/lang/Object;I)V",
      line = 25
   )
   public class792(class574 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field11569 = new SoftReference(arg1);
   }
}
