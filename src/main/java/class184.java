import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class184 extends class46 {
   @OriginalMember(
      owner = "client!ec",
      name = "o",
      descriptor = "I"
   )
   public int field2892;
   @OriginalMember(
      owner = "client!ec",
      name = "q",
      descriptor = "[B"
   )
   public byte[] field2891;
   @OriginalMember(
      owner = "client!ec",
      name = "n",
      descriptor = "I"
   )
   public int field2890;
   @OriginalMember(
      owner = "client!ec",
      name = "r",
      descriptor = "I"
   )
   public int field2894;
   @OriginalMember(
      owner = "client!ec",
      name = "p",
      descriptor = "Z"
   )
   public boolean field2893;

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(Ljf;)Lec;",
      line = 8
   )
   public final class184 method1665(class398 arg0) {
      this.field2891 = arg0.method3210((byte)-6, this.field2891);
      this.field2892 = arg0.method3213((byte)-39, this.field2892);
      if (this.field2894 == this.field2890) {
         this.field2890 = this.field2894 = arg0.method3215(this.field2890, 6);
      } else {
         this.field2890 = arg0.method3215(this.field2890, 6);
         this.field2894 = arg0.method3215(this.field2894, 6);
         if (this.field2894 == this.field2890) {
            --this.field2890;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(I[BII)V",
      line = 25
   )
   public class184(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field2892 = arg0;
      this.field2891 = arg1;
      this.field2890 = arg2;
      this.field2894 = arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(I[BIIZ)V",
      line = 31
   )
   public class184(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field2892 = arg0;
      this.field2891 = arg1;
      this.field2890 = arg2;
      this.field2894 = arg3;
      this.field2893 = arg4;
   }
}
