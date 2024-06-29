import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class498 extends class247 {
   @OriginalMember(
      owner = "client!ii",
      name = "k",
      descriptor = "[S"
   )
   public short[] field7093;
   @OriginalMember(
      owner = "client!ii",
      name = "j",
      descriptor = "[B"
   )
   public byte[] field7094;

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "([S[B)V"
   )
   public class498(short[] arg0, byte[] arg1) {
      this.field7093 = arg0;
      this.field7094 = arg1;
   }
}
