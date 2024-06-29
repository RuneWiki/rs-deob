import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class484 {
   @OriginalMember(
      owner = "client!sj",
      name = "d",
      descriptor = "I"
   )
   public int field7178;
   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "I"
   )
   public int field7177;
   @OriginalMember(
      owner = "client!sj",
      name = "c",
      descriptor = "[I"
   )
   public int[] field7179;
   @OriginalMember(
      owner = "client!sj",
      name = "b",
      descriptor = "[I"
   )
   public int[] field7176;

   @OriginalMember(
      owner = "client!sj",
      name = "<init>",
      descriptor = "()V",
      line = 7
   )
   public class484() {
      class116.method967(16);
      this.field7178 = class116.method969() != 0 ? class116.method967(4) + 1 : 1;
      if (class116.method969() != 0) {
         class116.method967(8);
      }

      class116.method967(2);
      if (this.field7178 > 1) {
         this.field7177 = class116.method967(4);
      }

      this.field7179 = new int[this.field7178];
      this.field7176 = new int[this.field7178];

      for(int var1 = 0; var1 < this.field7178; ++var1) {
         class116.method967(8);
         this.field7179[var1] = class116.method967(8);
         this.field7176[var1] = class116.method967(8);
      }

   }
}
