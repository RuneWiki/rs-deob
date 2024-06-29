import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class422 {
   @OriginalMember(
      owner = "client!jba",
      name = "b",
      descriptor = "I"
   )
   public int field6025;
   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "I"
   )
   public int field6024;
   @OriginalMember(
      owner = "client!jba",
      name = "c",
      descriptor = "I"
   )
   public int field6026;

   @OriginalMember(
      owner = "client!jba",
      name = "<init>",
      descriptor = "()V"
   )
   public class422() {
   }

   @OriginalMember(
      owner = "client!jba",
      name = "<init>",
      descriptor = "(Ljba;)V"
   )
   public class422(class422 arg0) {
      this.field6025 = arg0.field6025;
      this.field6024 = arg0.field6024;
      this.field6026 = arg0.field6026;
   }
}
