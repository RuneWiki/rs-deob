import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class680 extends class428 {
   @OriginalMember(
      owner = "client!fh",
      name = "n",
      descriptor = "[S"
   )
   public short[] field10021;
   @OriginalMember(
      owner = "client!fh",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field10020;

   @OriginalMember(
      owner = "client!fh",
      name = "<init>",
      descriptor = "([S[B)V"
   )
   public class680(short[] arg0, byte[] arg1) {
      this.field10021 = arg0;
      this.field10020 = arg1;
   }
}
