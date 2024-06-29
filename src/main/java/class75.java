import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class75 {
   @OriginalMember(
      owner = "client!sga",
      name = "d",
      descriptor = "I"
   )
   public int field948;
   @OriginalMember(
      owner = "client!sga",
      name = "b",
      descriptor = "I"
   )
   public int field949;
   @OriginalMember(
      owner = "client!sga",
      name = "c",
      descriptor = "I"
   )
   public int field951;
   @OriginalMember(
      owner = "client!sga",
      name = "a",
      descriptor = "I"
   )
   public int field950;

   @OriginalMember(
      owner = "client!sga",
      name = "<init>",
      descriptor = "()V"
   )
   public class75() {
   }

   @OriginalMember(
      owner = "client!sga",
      name = "<init>",
      descriptor = "(Lsga;)V"
   )
   public class75(class75 arg0) {
      this.field948 = arg0.field948;
      this.field949 = arg0.field949;
      this.field951 = arg0.field951;
      this.field950 = arg0.field950;
   }
}
