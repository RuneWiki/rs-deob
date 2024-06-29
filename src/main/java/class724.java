import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class724 {
   @OriginalMember(
      owner = "client!sea",
      name = "c",
      descriptor = "I"
   )
   public int field10452;
   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "I"
   )
   public int field10454;
   @OriginalMember(
      owner = "client!sea",
      name = "b",
      descriptor = "I"
   )
   public int field10453;

   @OriginalMember(
      owner = "client!sea",
      name = "<init>",
      descriptor = "()V"
   )
   public class724() {
   }

   @OriginalMember(
      owner = "client!sea",
      name = "<init>",
      descriptor = "(Lsea;)V"
   )
   public class724(class724 arg0) {
      this.field10452 = arg0.field10452;
      this.field10454 = arg0.field10454;
      this.field10453 = arg0.field10453;
   }
}
