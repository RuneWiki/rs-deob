import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class361 {
   @OriginalMember(
      owner = "client!cs",
      name = "c",
      descriptor = "I"
   )
   public int field5126;
   @OriginalMember(
      owner = "client!cs",
      name = "b",
      descriptor = "I"
   )
   public int field5127;
   @OriginalMember(
      owner = "client!cs",
      name = "a",
      descriptor = "I"
   )
   public int field5125;

   @OriginalMember(
      owner = "client!cs",
      name = "<init>",
      descriptor = "()V"
   )
   public class361() {
   }

   @OriginalMember(
      owner = "client!cs",
      name = "<init>",
      descriptor = "(Lcs;)V"
   )
   public class361(class361 arg0) {
      this.field5126 = arg0.field5126;
      this.field5127 = arg0.field5127;
      this.field5125 = arg0.field5125;
   }
}
