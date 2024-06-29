import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class683 extends class347 {
   @OriginalMember(
      owner = "client!qp",
      name = "j",
      descriptor = "[S"
   )
   public short[] field10249;
   @OriginalMember(
      owner = "client!qp",
      name = "i",
      descriptor = "[B"
   )
   public byte[] field10250;

   @OriginalMember(
      owner = "client!qp",
      name = "<init>",
      descriptor = "([S[B)V",
      line = 4
   )
   public class683(short[] arg0, byte[] arg1) {
      this.field10249 = arg0;
      this.field10250 = arg1;
   }
}
