import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class122 extends class500 {
   @OriginalMember(
      owner = "client!ri",
      name = "l",
      descriptor = "I"
   )
   public int field1955;
   @OriginalMember(
      owner = "client!ri",
      name = "k",
      descriptor = "[B"
   )
   public byte[] field1957;
   @OriginalMember(
      owner = "client!ri",
      name = "o",
      descriptor = "I"
   )
   public int field1956;
   @OriginalMember(
      owner = "client!ri",
      name = "n",
      descriptor = "I"
   )
   public int field1954;
   @OriginalMember(
      owner = "client!ri",
      name = "m",
      descriptor = "Z"
   )
   public boolean field1953;

   @OriginalMember(
      owner = "client!ri",
      name = "a",
      descriptor = "(Lkaa;)Lri;"
   )
   public final class122 method1140(class51 arg0) {
      this.field1957 = arg0.method614((byte)72, this.field1957);
      this.field1955 = arg0.method613(29375, this.field1955);
      if (this.field1956 == this.field1954) {
         this.field1956 = this.field1954 = arg0.method612(false, this.field1956);
      } else {
         this.field1956 = arg0.method612(false, this.field1956);
         this.field1954 = arg0.method612(false, this.field1954);
         if (this.field1956 == this.field1954) {
            --this.field1956;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "<init>",
      descriptor = "(I[BII)V"
   )
   public class122(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field1955 = arg0;
      this.field1957 = arg1;
      this.field1956 = arg2;
      this.field1954 = arg3;
   }

   @OriginalMember(
      owner = "client!ri",
      name = "<init>",
      descriptor = "(I[BIIZ)V"
   )
   public class122(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field1955 = arg0;
      this.field1957 = arg1;
      this.field1956 = arg2;
      this.field1954 = arg3;
      this.field1953 = arg4;
   }
}
