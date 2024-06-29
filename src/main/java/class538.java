import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class538 {
   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "I"
   )
   public int field8124;
   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "I"
   )
   public int field8125;
   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "I"
   )
   public int field8127;
   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "I"
   )
   public int field8126;

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "()V",
      line = 6
   )
   public class538() {
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(Lcp;)V",
      line = 8
   )
   public class538(class538 arg0) {
      this.field8124 = arg0.field8124;
      this.field8125 = arg0.field8125;
      this.field8127 = arg0.field8127;
      this.field8126 = arg0.field8126;
   }
}
