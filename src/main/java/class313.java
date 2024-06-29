import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class313 extends class361 {
   @OriginalMember(
      owner = "client!pfa",
      name = "e",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field4285;

   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "(B)[B",
      line = 6
   )
   public final byte[] method2310(byte arg0) {
      if (arg0 != -85) {
         this.method2310((byte)83);
      }

      byte[] var2 = new byte[this.field4285.capacity()];
      this.field4285.position(0);
      this.field4285.get(var2);
      return var2;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(I[B)V",
      line = 20
   )
   public final void method2311(int arg0, byte[] arg1) {
      this.field4285 = ByteBuffer.allocateDirect(arg1.length);
      this.field4285.position(0);
      if (arg0 != 402) {
         this.field4285 = (ByteBuffer)null;
      }

      this.field4285.put(arg1);
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IBI)[B",
      line = 33
   )
   public final byte[] method2312(int arg0, byte arg1, int arg2) {
      byte[] var4 = new byte[arg2];
      this.field4285.position(arg0);
      this.field4285.get(var4, 0, arg2);
      int var5 = 116 % ((56 - arg1) / 62);
      return var4;
   }
}
