import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class452 extends class205 {
   @OriginalMember(
      owner = "client!wg",
      name = "f",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field6228;

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(I)[B"
   )
   public final byte[] method1548(int arg0) {
      if (arg0 != 1) {
         this.field6228 = (ByteBuffer)null;
      }

      byte[] var2 = new byte[this.field6228.capacity()];
      this.field6228.position(0);
      this.field6228.get(var2);
      return var2;
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "([BB)V"
   )
   public final void method1550(byte[] arg0, byte arg1) {
      this.field6228 = ByteBuffer.allocateDirect(arg0.length);
      this.field6228.position(0);
      if (arg1 < 48) {
         this.field6228 = (ByteBuffer)null;
      }

      this.field6228.put(arg0);
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(IIB)[B"
   )
   public final byte[] method1545(int arg0, int arg1, byte arg2) {
      this.field6228.position(arg0);
      if (arg2 != -30) {
         return (byte[])null;
      } else {
         byte[] var4 = new byte[arg1];
         this.field6228.get(var4, 0, arg1);
         return var4;
      }
   }
}
