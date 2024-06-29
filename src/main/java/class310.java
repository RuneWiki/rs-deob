import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class310 extends class294 {
   @OriginalMember(
      owner = "client!qj",
      name = "m",
      descriptor = "[S"
   )
   public short[] field4820;
   @OriginalMember(
      owner = "client!qj",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field4819;

   @OriginalMember(
      owner = "client!qj",
      name = "<init>",
      descriptor = "([S[B)V",
      line = 4
   )
   public class310(short[] arg0, byte[] arg1) {
      this.field4820 = arg0;
      this.field4819 = arg1;
   }
}
