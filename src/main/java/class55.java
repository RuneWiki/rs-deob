import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class55 extends class413 {
   @OriginalMember(
      owner = "client!ms",
      name = "i",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field746;

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(BII)[B"
   )
   public final byte[] method527(byte arg0, int arg1, int arg2) {
      if (arg0 != 111) {
         return (byte[])null;
      } else {
         this.field746.position(arg2);
         byte[] var4 = new byte[arg1];
         this.field746.get(var4, 0, arg1);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(I[B)V"
   )
   public final void method528(int arg0, byte[] arg1) {
      this.field746 = ByteBuffer.allocateDirect(arg1.length);
      if (arg0 > 101) {
         this.field746.position(0);
         this.field746.put(arg1);
      }
   }

   @OriginalMember(
      owner = "client!ms",
      name = "a",
      descriptor = "(I)[B"
   )
   public final byte[] method529(int arg0) {
      if (arg0 != 39) {
         this.field746 = (ByteBuffer)null;
      }

      byte[] var2 = new byte[this.field746.capacity()];
      this.field746.position(0);
      this.field746.get(var2);
      return var2;
   }
}
