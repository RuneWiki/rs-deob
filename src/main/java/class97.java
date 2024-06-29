import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class97 {
   @OriginalMember(
      owner = "client!je",
      name = "b",
      descriptor = "I"
   )
   public int field1295;
   @OriginalMember(
      owner = "client!je",
      name = "c",
      descriptor = "I"
   )
   public int field1296;
   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "I"
   )
   public int field1294;

   @OriginalMember(
      owner = "client!je",
      name = "<init>",
      descriptor = "()V"
   )
   public class97() {
   }

   @OriginalMember(
      owner = "client!je",
      name = "<init>",
      descriptor = "(Lje;)V"
   )
   public class97(class97 arg0) {
      this.field1295 = arg0.field1295;
      this.field1296 = arg0.field1296;
      this.field1294 = arg0.field1294;
   }
}
