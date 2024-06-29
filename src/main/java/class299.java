import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class299 {
   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "I"
   )
   public int field4183;
   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "I"
   )
   public int field4180;
   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "I"
   )
   public int field4182;
   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "I"
   )
   public int field4181;

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "()V"
   )
   public class299() {
   }

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class299(class299 arg0) {
      this.field4183 = arg0.field4183;
      this.field4180 = arg0.field4180;
      this.field4182 = arg0.field4182;
      this.field4181 = arg0.field4181;
   }
}
