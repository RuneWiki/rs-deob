import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class129 extends class570 {
   @OriginalMember(
      owner = "client!co",
      name = "z",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field1620;

   @OriginalMember(
      owner = "client!co",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method1078(int arg0) {
      if (arg0 != 100) {
         this.method1079((byte)-108);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!co",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method1079(byte arg0) {
      return arg0 > -43 ? (Object)null : this.field1620.get();
   }

   @OriginalMember(
      owner = "client!co",
      name = "<init>",
      descriptor = "(Lli;Ljava/lang/Object;I)V"
   )
   public class129(class455 arg0, Object arg1, int arg2) {
      super(arg0, arg2);
      this.field1620 = new SoftReference(arg1);
   }
}
