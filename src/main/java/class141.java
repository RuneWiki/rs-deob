import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class141 extends class175 {
   @OriginalMember(
      owner = "client!hu",
      name = "D",
      descriptor = "Ljava/lang/ref/SoftReference;"
   )
   private SoftReference field1807;

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(B)Z",
      line = 6
   )
   public final boolean method1191(byte arg0) {
      int var2 = -83 / ((arg0 - -84) / 38);
      return true;
   }

   @OriginalMember(
      owner = "client!hu",
      name = "g",
      descriptor = "(I)Ljava/lang/Object;",
      line = 14
   )
   public final Object method1192(int arg0) {
      if (arg0 != -1) {
         this.method1191((byte)122);
      }

      return this.field1807.get();
   }

   @OriginalMember(
      owner = "client!hu",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V",
      line = 23
   )
   public class141(Object arg0, int arg1) {
      super(arg1);
      this.field1807 = new SoftReference(arg0);
   }
}
