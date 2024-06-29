import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class289 extends class669 {
   @OriginalMember(
      owner = "client!vea",
      name = "n",
      descriptor = "I"
   )
   public int field4007;
   @OriginalMember(
      owner = "client!vea",
      name = "q",
      descriptor = "[B"
   )
   public byte[] field4006;
   @OriginalMember(
      owner = "client!vea",
      name = "p",
      descriptor = "I"
   )
   public int field4010;
   @OriginalMember(
      owner = "client!vea",
      name = "r",
      descriptor = "I"
   )
   public int field4009;
   @OriginalMember(
      owner = "client!vea",
      name = "o",
      descriptor = "Z"
   )
   public boolean field4008;

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lhe;)Lvea;"
   )
   public final class289 method2182(class393 arg0) {
      this.field4006 = arg0.method2982(this.field4006, 106);
      this.field4007 = arg0.method2985(-108, this.field4007);
      if (this.field4010 == this.field4009) {
         this.field4010 = this.field4009 = arg0.method2984(false, this.field4010);
      } else {
         this.field4010 = arg0.method2984(false, this.field4010);
         this.field4009 = arg0.method2984(false, this.field4009);
         if (this.field4010 == this.field4009) {
            --this.field4010;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "<init>",
      descriptor = "(I[BII)V"
   )
   public class289(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field4007 = arg0;
      this.field4006 = arg1;
      this.field4010 = arg2;
      this.field4009 = arg3;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "<init>",
      descriptor = "(I[BIIZ)V"
   )
   public class289(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field4007 = arg0;
      this.field4006 = arg1;
      this.field4010 = arg2;
      this.field4009 = arg3;
      this.field4008 = arg4;
   }
}
