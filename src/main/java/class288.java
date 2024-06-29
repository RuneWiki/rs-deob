import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class288 extends class22 {
   @OriginalMember(
      owner = "client!vja",
      name = "k",
      descriptor = "[S"
   )
   public short[] field4038;
   @OriginalMember(
      owner = "client!vja",
      name = "j",
      descriptor = "[B"
   )
   public byte[] field4039;

   @OriginalMember(
      owner = "client!vja",
      name = "<init>",
      descriptor = "([S[B)V",
      line = 4
   )
   public class288(short[] arg0, byte[] arg1) {
      this.field4038 = arg0;
      this.field4039 = arg1;
   }
}
