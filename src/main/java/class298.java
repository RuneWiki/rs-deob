import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class298 extends class686 {
   @OriginalMember(
      owner = "client!uh",
      name = "o",
      descriptor = "B"
   )
   public byte field4421;
   @OriginalMember(
      owner = "client!uh",
      name = "r",
      descriptor = "B"
   )
   public byte field4425;
   @OriginalMember(
      owner = "client!uh",
      name = "q",
      descriptor = "I"
   )
   public int field4419;
   @OriginalMember(
      owner = "client!uh",
      name = "p",
      descriptor = "B"
   )
   public byte field4420;
   @OriginalMember(
      owner = "client!uh",
      name = "n",
      descriptor = "B"
   )
   public byte field4422;
   @OriginalMember(
      owner = "client!uh",
      name = "l",
      descriptor = "[S"
   )
   public short[] field4424;
   @OriginalMember(
      owner = "client!uh",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field4423;

   @OriginalMember(
      owner = "client!uh",
      name = "<init>",
      descriptor = "(IIIII[S[B)V"
   )
   public class298(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field4421 = (byte)arg0;
      this.field4425 = (byte)arg1;
      this.field4419 = arg2;
      this.field4420 = (byte)arg3;
      this.field4422 = (byte)arg4;
      this.field4424 = arg5;
      this.field4423 = arg6;
   }
}
