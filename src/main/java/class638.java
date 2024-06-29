import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class638 extends class82 {
   @OriginalMember(
      owner = "client!nba",
      name = "k",
      descriptor = "B"
   )
   public byte field9372;
   @OriginalMember(
      owner = "client!nba",
      name = "j",
      descriptor = "B"
   )
   public byte field9373;
   @OriginalMember(
      owner = "client!nba",
      name = "g",
      descriptor = "I"
   )
   public int field9367;
   @OriginalMember(
      owner = "client!nba",
      name = "h",
      descriptor = "B"
   )
   public byte field9369;
   @OriginalMember(
      owner = "client!nba",
      name = "i",
      descriptor = "B"
   )
   public byte field9371;
   @OriginalMember(
      owner = "client!nba",
      name = "m",
      descriptor = "[S"
   )
   public short[] field9368;
   @OriginalMember(
      owner = "client!nba",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field9370;

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(IIIII[S[B)V"
   )
   public class638(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field9372 = (byte)arg0;
      this.field9373 = (byte)arg1;
      this.field9367 = arg2;
      this.field9369 = (byte)arg3;
      this.field9371 = (byte)arg4;
      this.field9368 = arg5;
      this.field9370 = arg6;
   }
}
