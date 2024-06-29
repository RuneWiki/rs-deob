import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class667 extends class246 {
   @OriginalMember(
      owner = "client!rg",
      name = "m",
      descriptor = "B"
   )
   public byte field9673;
   @OriginalMember(
      owner = "client!rg",
      name = "j",
      descriptor = "B"
   )
   public byte field9677;
   @OriginalMember(
      owner = "client!rg",
      name = "o",
      descriptor = "I"
   )
   public int field9678;
   @OriginalMember(
      owner = "client!rg",
      name = "n",
      descriptor = "B"
   )
   public byte field9674;
   @OriginalMember(
      owner = "client!rg",
      name = "k",
      descriptor = "B"
   )
   public byte field9679;
   @OriginalMember(
      owner = "client!rg",
      name = "l",
      descriptor = "[S"
   )
   public short[] field9675;
   @OriginalMember(
      owner = "client!rg",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field9676;

   @OriginalMember(
      owner = "client!rg",
      name = "<init>",
      descriptor = "(IIIII[S[B)V"
   )
   public class667(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field9673 = (byte)arg0;
      this.field9677 = (byte)arg1;
      this.field9678 = arg2;
      this.field9674 = (byte)arg3;
      this.field9679 = (byte)arg4;
      this.field9675 = arg5;
      this.field9676 = arg6;
   }
}
