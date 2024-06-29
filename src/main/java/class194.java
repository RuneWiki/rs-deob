import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class194 extends class65 {
   @OriginalMember(
      owner = "client!efa",
      name = "e",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field2428;

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(IBI)[B",
      line = 6
   )
   public final byte[] method535(int arg0, byte arg1, int arg2) {
      this.field2428.position(arg2);
      byte[] var4 = new byte[arg0];
      if (arg1 != 125) {
         this.field2428 = (ByteBuffer)null;
      }

      this.field2428.get(var4, 0, arg0);
      return var4;
   }

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(B)[B",
      line = 20
   )
   public final byte[] method536(byte arg0) {
      int var2 = -65 / ((55 - arg0) / 46);
      byte[] var3 = new byte[this.field2428.capacity()];
      this.field2428.position(0);
      this.field2428.get(var3);
      return var3;
   }

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(B[B)V",
      line = 32
   )
   public final void method532(byte arg0, byte[] arg1) {
      this.field2428 = ByteBuffer.allocateDirect(arg1.length);
      if (arg0 != 50) {
         this.method532((byte)124, (byte[])null);
      }

      this.field2428.position(0);
      this.field2428.put(arg1);
   }
}
