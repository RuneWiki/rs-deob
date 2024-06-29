import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class469 extends class277 {
   @OriginalMember(
      owner = "client!uf",
      name = "f",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field6826;

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I[B)V"
   )
   public final void method2173(int arg0, byte[] arg1) {
      if (arg0 != 10159) {
         this.field6826 = (ByteBuffer)null;
      }

      this.field6826 = ByteBuffer.allocateDirect(arg1.length);
      this.field6826.position(0);
      this.field6826.put(arg1);
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(IIB)[B"
   )
   public final byte[] method2172(int arg0, int arg1, byte arg2) {
      if (arg2 < 49) {
         return (byte[])null;
      } else {
         byte[] var4 = new byte[arg0];
         this.field6826.position(arg1);
         this.field6826.get(var4, 0, arg0);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "(B)[B"
   )
   public final byte[] method2177(byte arg0) {
      byte[] var2 = new byte[this.field6826.capacity()];
      this.field6826.position(0);
      if (arg0 != 115) {
         this.method2172(-22, 43, (byte)-8);
      }

      this.field6826.get(var2);
      return var2;
   }
}
