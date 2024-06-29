import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class545 extends class539 {
   @OriginalMember(
      owner = "client!kl",
      name = "A",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field8185;

   @OriginalMember(
      owner = "client!kl",
      name = "d",
      descriptor = "(B)Ljava/lang/Object;",
      line = 6
   )
   public final Object method4123(byte arg0) {
      if (arg0 != 86) {
         this.method4124((byte)42);
      }

      return this.field8185.get();
   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(B)Z",
      line = 16
   )
   public final boolean method4124(byte arg0) {
      if (arg0 != 101) {
         this.method4124((byte)-66);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!kl",
      name = "<init>",
      descriptor = "(Lic;Ljava/lang/Object;I)V",
      line = 25
   )
   public class545(class51 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field8185 = new SoftReference(arg1);
   }
}
