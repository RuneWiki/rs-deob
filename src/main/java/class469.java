import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class469 extends class300 {
   @OriginalMember(
      owner = "client!qv",
      name = "B",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field7011;

   @OriginalMember(
      owner = "client!qv",
      name = "<init>",
      descriptor = "(Lsf;Ljava/lang/Object;I)V",
      line = 4
   )
   public class469(class549 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field7011 = new SoftReference(arg1);
   }

   @OriginalMember(
      owner = "client!qv",
      name = "g",
      descriptor = "(I)Z",
      line = 14
   )
   public final boolean method1374(int arg0) {
      return arg0 != -25864 ? true : true;
   }

   @OriginalMember(
      owner = "client!qv",
      name = "a",
      descriptor = "(Z)Ljava/lang/Object;",
      line = 24
   )
   public final Object method1376(boolean arg0) {
      return arg0 ? (Object)null : this.field7011.get();
   }
}
