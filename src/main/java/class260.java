import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class260 extends class770 {
   @OriginalMember(
      owner = "client!cca",
      name = "h",
      descriptor = "B"
   )
   public byte field3331;
   @OriginalMember(
      owner = "client!cca",
      name = "k",
      descriptor = "B"
   )
   public byte field3330;
   @OriginalMember(
      owner = "client!cca",
      name = "j",
      descriptor = "I"
   )
   public int field3326;
   @OriginalMember(
      owner = "client!cca",
      name = "f",
      descriptor = "B"
   )
   public byte field3327;
   @OriginalMember(
      owner = "client!cca",
      name = "l",
      descriptor = "B"
   )
   public byte field3325;
   @OriginalMember(
      owner = "client!cca",
      name = "g",
      descriptor = "[S"
   )
   public short[] field3328;
   @OriginalMember(
      owner = "client!cca",
      name = "i",
      descriptor = "[B"
   )
   public byte[] field3329;

   @OriginalMember(
      owner = "client!cca",
      name = "<init>",
      descriptor = "(IIIII[S[B)V"
   )
   public class260(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field3331 = (byte)arg0;
      this.field3330 = (byte)arg1;
      this.field3326 = arg2;
      this.field3327 = (byte)arg3;
      this.field3325 = (byte)arg4;
      this.field3328 = arg5;
      this.field3329 = arg6;
   }
}
