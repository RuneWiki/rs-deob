import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class113 {
   @OriginalMember(
      owner = "client!kba",
      name = "c",
      descriptor = "I"
   )
   public int field1365;
   @OriginalMember(
      owner = "client!kba",
      name = "b",
      descriptor = "I"
   )
   public int field1366;
   @OriginalMember(
      owner = "client!kba",
      name = "a",
      descriptor = "I"
   )
   public int field1367;

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "()V",
      line = 5
   )
   public class113() {
   }

   @OriginalMember(
      owner = "client!kba",
      name = "<init>",
      descriptor = "(Lkba;)V",
      line = 7
   )
   public class113(class113 arg0) {
      this.field1365 = arg0.field1365;
      this.field1366 = arg0.field1366;
      this.field1367 = arg0.field1367;
   }
}
