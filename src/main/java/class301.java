import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class301 extends class89 {
   @OriginalMember(
      owner = "client!aia",
      name = "l",
      descriptor = "I"
   )
   public int field4494;
   @OriginalMember(
      owner = "client!aia",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field4493;
   @OriginalMember(
      owner = "client!aia",
      name = "k",
      descriptor = "I"
   )
   public int field4495;
   @OriginalMember(
      owner = "client!aia",
      name = "m",
      descriptor = "I"
   )
   public int field4492;
   @OriginalMember(
      owner = "client!aia",
      name = "o",
      descriptor = "Z"
   )
   public boolean field4496;

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(Lwe;)Laia;"
   )
   public final class301 method2494(class195 arg0) {
      this.field4493 = arg0.method1716(-12904, this.field4493);
      this.field4494 = arg0.method1715(this.field4494, (byte)-96);
      if (this.field4495 == this.field4492) {
         this.field4495 = this.field4492 = arg0.method1713(this.field4495, 28729);
      } else {
         this.field4495 = arg0.method1713(this.field4495, 28729);
         this.field4492 = arg0.method1713(this.field4492, 28729);
         if (this.field4495 == this.field4492) {
            --this.field4495;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(I[BII)V"
   )
   public class301(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field4494 = arg0;
      this.field4493 = arg1;
      this.field4495 = arg2;
      this.field4492 = arg3;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(I[BIIZ)V"
   )
   public class301(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field4494 = arg0;
      this.field4493 = arg1;
      this.field4495 = arg2;
      this.field4492 = arg3;
      this.field4496 = arg4;
   }
}
