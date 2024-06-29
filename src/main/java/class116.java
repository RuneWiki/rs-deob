import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class116 {
   @OriginalMember(
      owner = "client!er",
      name = "k",
      descriptor = "I"
   )
   private int field1430 = 2;
   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "[I"
   )
   private int[] field1432 = new int[2];
   @OriginalMember(
      owner = "client!er",
      name = "h",
      descriptor = "[I"
   )
   private int[] field1429 = new int[2];
   @OriginalMember(
      owner = "client!er",
      name = "e",
      descriptor = "I"
   )
   public int field1428;
   @OriginalMember(
      owner = "client!er",
      name = "f",
      descriptor = "I"
   )
   public int field1431;
   @OriginalMember(
      owner = "client!er",
      name = "j",
      descriptor = "I"
   )
   public int field1433;
   @OriginalMember(
      owner = "client!er",
      name = "b",
      descriptor = "I"
   )
   private int field1434;
   @OriginalMember(
      owner = "client!er",
      name = "c",
      descriptor = "I"
   )
   private int field1435;
   @OriginalMember(
      owner = "client!er",
      name = "i",
      descriptor = "I"
   )
   private int field1436;
   @OriginalMember(
      owner = "client!er",
      name = "d",
      descriptor = "I"
   )
   private int field1437;
   @OriginalMember(
      owner = "client!er",
      name = "g",
      descriptor = "I"
   )
   private int field1438;

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "()V"
   )
   public final void method999() {
      this.field1437 = 0;
      this.field1438 = 0;
      this.field1434 = 0;
      this.field1436 = 0;
      this.field1435 = 0;
   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1000(int arg0) {
      if (this.field1435 >= this.field1437) {
         this.field1436 = this.field1429[this.field1438++] << 15;
         if (this.field1438 >= this.field1430) {
            this.field1438 = this.field1430 - 1;
         }

         this.field1437 = (int)((double)this.field1432[this.field1438] / 65536.0D * (double)arg0);
         if (this.field1437 > this.field1435) {
            this.field1434 = ((this.field1429[this.field1438] << 15) - this.field1436) / (this.field1437 - this.field1435);
         }
      }

      this.field1436 += this.field1434;
      ++this.field1435;
      return this.field1436 - this.field1434 >> 15;
   }

   @OriginalMember(
      owner = "client!er",
      name = "b",
      descriptor = "(Lwm;)V"
   )
   public final void method1001(class594 arg0) {
      this.field1430 = arg0.method4288((byte)61);
      this.field1432 = new int[this.field1430];
      this.field1429 = new int[this.field1430];

      for(int var2 = 0; var2 < this.field1430; ++var2) {
         this.field1432[var2] = arg0.method4280(-19104);
         this.field1429[var2] = arg0.method4280(-19104);
      }

   }

   @OriginalMember(
      owner = "client!er",
      name = "a",
      descriptor = "(Lwm;)V"
   )
   public final void method1002(class594 arg0) {
      this.field1428 = arg0.method4288((byte)86);
      this.field1433 = arg0.method4302(true);
      this.field1431 = arg0.method4302(true);
      this.method1001(arg0);
   }

   @OriginalMember(
      owner = "client!er",
      name = "<init>",
      descriptor = "()V"
   )
   public class116() {
      this.field1432[0] = 0;
      this.field1432[1] = 65535;
      this.field1429[0] = 0;
      this.field1429[1] = 65535;
   }
}
