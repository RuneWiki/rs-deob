import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class765 extends class306 {
   @OriginalMember(
      owner = "client!iia",
      name = "e",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field11305;

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(I)[B",
      line = 7
   )
   public final byte[] method2567(int arg0) {
      if (arg0 != 20661) {
         return (byte[])null;
      } else {
         byte[] var2 = new byte[this.field11305.capacity()];
         this.field11305.position(0);
         this.field11305.get(var2);
         return var2;
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(III)[B",
      line = 24
   )
   public final byte[] method2565(int arg0, int arg1, int arg2) {
      byte[] var4 = new byte[arg1];
      if (arg0 <= 32) {
         this.field11305 = (ByteBuffer)null;
      }

      this.field11305.position(arg2);
      this.field11305.get(var4, 0, arg1);
      return var4;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(Z[B)V",
      line = 37
   )
   public final void method2566(boolean arg0, byte[] arg1) {
      if (!arg0) {
         this.method2566(true, (byte[])null);
      }

      this.field11305 = ByteBuffer.allocateDirect(arg1.length);
      this.field11305.position(0);
      this.field11305.put(arg1);
   }
}
