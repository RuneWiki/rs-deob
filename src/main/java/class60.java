import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class60 extends class647 {
   @OriginalMember(
      owner = "client!pba",
      name = "B",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field777;

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method545(byte arg0) {
      return arg0 != 28 ? true : true;
   }

   @OriginalMember(
      owner = "client!pba",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method546(byte arg0) {
      if (arg0 != -72) {
         this.method546((byte)38);
      }

      return this.field777.get();
   }

   @OriginalMember(
      owner = "client!pba",
      name = "<init>",
      descriptor = "(Lwja;Ljava/lang/Object;I)V"
   )
   public class60(class352 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field777 = new SoftReference(arg1);
   }
}
