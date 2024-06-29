import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class520 extends class86 {
   @OriginalMember(
      owner = "client!li",
      name = "f",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field7324;

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(I[B)V"
   )
   public final void method903(int arg0, byte[] arg1) {
      if (arg0 != -29528) {
         this.field7324 = (ByteBuffer)null;
      }

      this.field7324 = ByteBuffer.allocateDirect(arg1.length);
      this.field7324.position(0);
      this.field7324.put(arg1);
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(I)[B"
   )
   public final byte[] method899(int arg0) {
      if (arg0 > -43) {
         return (byte[])null;
      } else {
         byte[] var2 = new byte[this.field7324.capacity()];
         this.field7324.position(0);
         this.field7324.get(var2);
         return var2;
      }
   }

   @OriginalMember(
      owner = "client!li",
      name = "a",
      descriptor = "(IZI)[B"
   )
   public final byte[] method898(int arg0, boolean arg1, int arg2) {
      byte[] var4 = new byte[arg2];
      this.field7324.position(arg0);
      this.field7324.get(var4, 0, arg2);
      if (arg1) {
         this.field7324 = (ByteBuffer)null;
      }

      return var4;
   }
}
