import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class485 extends class500 {
   @OriginalMember(
      owner = "client!iga",
      name = "k",
      descriptor = "[S"
   )
   public short[] field6680;
   @OriginalMember(
      owner = "client!iga",
      name = "j",
      descriptor = "[B"
   )
   public byte[] field6679;

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "([S[B)V"
   )
   public class485(short[] arg0, byte[] arg1) {
      this.field6680 = arg0;
      this.field6679 = arg1;
   }
}
