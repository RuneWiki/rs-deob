import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class304 extends class604 {
   @OriginalMember(
      owner = "client!bq",
      name = "l",
      descriptor = "B"
   )
   public byte field4337;
   @OriginalMember(
      owner = "client!bq",
      name = "j",
      descriptor = "B"
   )
   public byte field4338;
   @OriginalMember(
      owner = "client!bq",
      name = "n",
      descriptor = "I"
   )
   public int field4341;
   @OriginalMember(
      owner = "client!bq",
      name = "m",
      descriptor = "B"
   )
   public byte field4340;
   @OriginalMember(
      owner = "client!bq",
      name = "i",
      descriptor = "B"
   )
   public byte field4339;
   @OriginalMember(
      owner = "client!bq",
      name = "o",
      descriptor = "[S"
   )
   public short[] field4342;
   @OriginalMember(
      owner = "client!bq",
      name = "k",
      descriptor = "[B"
   )
   public byte[] field4336;

   @OriginalMember(
      owner = "client!bq",
      name = "<init>",
      descriptor = "(IIIII[S[B)V",
      line = 9
   )
   public class304(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field4337 = (byte)arg0;
      this.field4338 = (byte)arg1;
      this.field4341 = arg2;
      this.field4340 = (byte)arg3;
      this.field4339 = (byte)arg4;
      this.field4342 = arg5;
      this.field4336 = arg6;
   }
}
