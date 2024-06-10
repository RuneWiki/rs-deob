import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!na")
public class class31 extends class45 {
   @OriginalMember(
      owner = "loginapplet!na",
      name = "e",
      descriptor = "Ljava/nio/ByteBuffer;"
   )
   private ByteBuffer field203;

   @OriginalMember(
      owner = "loginapplet!na",
      name = "a",
      descriptor = "(I)[B",
      line = 6
   )
   public final byte[] method218(int arg0) {
      try {
         if (arg0 != 50) {
            this.field203 = (ByteBuffer)null;
         }

         byte[] var2 = new byte[this.field203.capacity()];
         this.field203.position(0);
         this.field203.get(var2);
         return var2;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   @OriginalMember(
      owner = "loginapplet!na",
      name = "a",
      descriptor = "([BI)V",
      line = 20
   )
   public final void method222(byte[] arg0, int arg1) {
      try {
         this.field203 = ByteBuffer.allocateDirect(arg0.length);
         this.field203.position(0);
         if (arg1 != -14256) {
            this.method218(8);
         }

         this.field203.put(arg0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }
}
