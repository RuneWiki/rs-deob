import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class372 extends class3 {
   @OriginalMember(
      owner = "client!rq",
      name = "n",
      descriptor = "B"
   )
   public byte field5395;
   @OriginalMember(
      owner = "client!rq",
      name = "k",
      descriptor = "B"
   )
   public byte field5396;
   @OriginalMember(
      owner = "client!rq",
      name = "m",
      descriptor = "I"
   )
   public int field5400;
   @OriginalMember(
      owner = "client!rq",
      name = "o",
      descriptor = "B"
   )
   public byte field5398;
   @OriginalMember(
      owner = "client!rq",
      name = "j",
      descriptor = "B"
   )
   public byte field5397;
   @OriginalMember(
      owner = "client!rq",
      name = "l",
      descriptor = "[S"
   )
   public short[] field5399;
   @OriginalMember(
      owner = "client!rq",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field5394;

   @OriginalMember(
      owner = "client!rq",
      name = "<init>",
      descriptor = "(IIIII[S[B)V",
      line = 9
   )
   public class372(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
      this.field5395 = (byte)arg0;
      this.field5396 = (byte)arg1;
      this.field5400 = arg2;
      this.field5398 = (byte)arg3;
      this.field5397 = (byte)arg4;
      this.field5399 = arg5;
      this.field5394 = arg6;
   }
}
