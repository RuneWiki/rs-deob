import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class18 extends class673 {
   @OriginalMember(
      owner = "client!ge",
      name = "l",
      descriptor = "[S"
   )
   public short[] field294;
   @OriginalMember(
      owner = "client!ge",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field293;

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "([S[B)V"
   )
   public class18(short[] arg0, byte[] arg1) {
      this.field294 = arg0;
      this.field293 = arg1;
   }
}
