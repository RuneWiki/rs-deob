import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class640 extends class620 {
   @OriginalMember(
      owner = "client!jaa",
      name = "j",
      descriptor = "I"
   )
   public int field9326;
   @OriginalMember(
      owner = "client!jaa",
      name = "m",
      descriptor = "[B"
   )
   public byte[] field9329;
   @OriginalMember(
      owner = "client!jaa",
      name = "k",
      descriptor = "I"
   )
   public int field9327;
   @OriginalMember(
      owner = "client!jaa",
      name = "l",
      descriptor = "I"
   )
   public int field9328;
   @OriginalMember(
      owner = "client!jaa",
      name = "n",
      descriptor = "Z"
   )
   public boolean field9330;

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(Lwh;)Ljaa;",
      line = 9
   )
   public final class640 method4606(class157 arg0) {
      this.field9329 = arg0.method1298(this.field9329, (byte)-99);
      this.field9326 = arg0.method1302(this.field9326, 120);
      if (this.field9328 == this.field9327) {
         this.field9327 = this.field9328 = arg0.method1303(this.field9327, 80);
      } else {
         this.field9327 = arg0.method1303(this.field9327, -63);
         this.field9328 = arg0.method1303(this.field9328, -68);
         if (this.field9328 == this.field9327) {
            --this.field9327;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "<init>",
      descriptor = "(I[BII)V",
      line = 25
   )
   public class640(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field9326 = arg0;
      this.field9329 = arg1;
      this.field9327 = arg2;
      this.field9328 = arg3;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "<init>",
      descriptor = "(I[BIIZ)V",
      line = 31
   )
   public class640(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field9326 = arg0;
      this.field9329 = arg1;
      this.field9327 = arg2;
      this.field9328 = arg3;
      this.field9330 = arg4;
   }
}
