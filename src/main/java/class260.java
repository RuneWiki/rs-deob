import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class260 extends class391 {
   @OriginalMember(
      owner = "client!nea",
      name = "m",
      descriptor = "B"
   )
   public byte field4273;
   @OriginalMember(
      owner = "client!nea",
      name = "p",
      descriptor = "B"
   )
   public byte field4272;
   @OriginalMember(
      owner = "client!nea",
      name = "n",
      descriptor = "I"
   )
   public int field4275;
   @OriginalMember(
      owner = "client!nea",
      name = "k",
      descriptor = "B"
   )
   public byte field4278;
   @OriginalMember(
      owner = "client!nea",
      name = "l",
      descriptor = "B"
   )
   public byte field4277;
   @OriginalMember(
      owner = "client!nea",
      name = "o",
      descriptor = "[S"
   )
   public short[] field4276;
   @OriginalMember(
      owner = "client!nea",
      name = "q",
      descriptor = "[B"
   )
   public byte[] field4274;

   @OriginalMember(
      owner = "client!nea",
      name = "<init>",
      descriptor = "(IIIII[S[B)V"
   )
   public class260(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field4273 = (byte)arg0;
      this.field4272 = (byte)arg1;
      this.field4275 = arg2;
      this.field4278 = (byte)arg3;
      this.field4277 = (byte)arg4;
      this.field4276 = arg5;
      this.field4274 = arg6;
   }
}
