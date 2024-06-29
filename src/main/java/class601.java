import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class601 {
   @OriginalMember(
      owner = "client!dc",
      name = "h",
      descriptor = "I"
   )
   private int field8568 = 2;
   @OriginalMember(
      owner = "client!dc",
      name = "j",
      descriptor = "[I"
   )
   private int[] field8570 = new int[2];
   @OriginalMember(
      owner = "client!dc",
      name = "e",
      descriptor = "[I"
   )
   private int[] field8567 = new int[2];
   @OriginalMember(
      owner = "client!dc",
      name = "f",
      descriptor = "I"
   )
   public int field8566;
   @OriginalMember(
      owner = "client!dc",
      name = "i",
      descriptor = "I"
   )
   public int field8569;
   @OriginalMember(
      owner = "client!dc",
      name = "k",
      descriptor = "I"
   )
   public int field8571;
   @OriginalMember(
      owner = "client!dc",
      name = "d",
      descriptor = "I"
   )
   private int field8572;
   @OriginalMember(
      owner = "client!dc",
      name = "g",
      descriptor = "I"
   )
   private int field8573;
   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "I"
   )
   private int field8574;
   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "I"
   )
   private int field8575;
   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "I"
   )
   private int field8576;

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Lcu;)V"
   )
   public final void method4429(class65 arg0) {
      this.field8568 = arg0.method665(false);
      this.field8570 = new int[this.field8568];
      this.field8567 = new int[this.field8568];

      for(int var2 = 0; var2 < this.field8568; ++var2) {
         this.field8570[var2] = arg0.method685(-2);
         this.field8567[var2] = arg0.method685(-2);
      }

   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "()V"
   )
   public final void method4430() {
      this.field8576 = 0;
      this.field8572 = 0;
      this.field8574 = 0;
      this.field8573 = 0;
      this.field8575 = 0;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method4431(int arg0) {
      if (this.field8575 >= this.field8576) {
         this.field8573 = this.field8567[this.field8572++] << 15;
         if (this.field8572 >= this.field8568) {
            this.field8572 = this.field8568 - 1;
         }

         this.field8576 = (int)((double)this.field8570[this.field8572] / 65536.0D * (double)arg0);
         if (this.field8576 > this.field8575) {
            this.field8574 = ((this.field8567[this.field8572] << 15) - this.field8573) / (this.field8576 - this.field8575);
         }
      }

      this.field8573 += this.field8574;
      ++this.field8575;
      return this.field8573 - this.field8574 >> 15;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(Lcu;)V"
   )
   public final void method4432(class65 arg0) {
      this.field8571 = arg0.method665(false);
      this.field8566 = arg0.method701(255);
      this.field8569 = arg0.method701(255);
      this.method4429(arg0);
   }

   @OriginalMember(
      owner = "client!dc",
      name = "<init>",
      descriptor = "()V"
   )
   public class601() {
      this.field8570[0] = 0;
      this.field8570[1] = 65535;
      this.field8567[0] = 0;
      this.field8567[1] = 65535;
   }
}
