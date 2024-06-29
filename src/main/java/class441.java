import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class441 {
   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "I"
   )
   public int field6464;
   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "I"
   )
   public int field6463;
   @OriginalMember(
      owner = "client!fv",
      name = "c",
      descriptor = "I"
   )
   public int field6461;
   @OriginalMember(
      owner = "client!fv",
      name = "d",
      descriptor = "I"
   )
   public int field6462;

   @OriginalMember(
      owner = "client!fv",
      name = "<init>",
      descriptor = "()V"
   )
   public class441() {
   }

   @OriginalMember(
      owner = "client!fv",
      name = "<init>",
      descriptor = "(Lfv;)V"
   )
   public class441(class441 arg0) {
      this.field6464 = arg0.field6464;
      this.field6463 = arg0.field6463;
      this.field6461 = arg0.field6461;
      this.field6462 = arg0.field6462;
   }
}
