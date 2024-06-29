import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public class class413 {
   @OriginalMember(
      owner = "client!lka",
      name = "c",
      descriptor = "I"
   )
   public int field5954;
   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "I"
   )
   public int field5956;
   @OriginalMember(
      owner = "client!lka",
      name = "d",
      descriptor = "[I"
   )
   public int[] field5957;
   @OriginalMember(
      owner = "client!lka",
      name = "b",
      descriptor = "[I"
   )
   public int[] field5955;

   @OriginalMember(
      owner = "client!lka",
      name = "<init>",
      descriptor = "()V"
   )
   public class413() {
      class332.method2461(16);
      this.field5954 = class332.method2453() != 0 ? class332.method2461(4) + 1 : 1;
      if (class332.method2453() != 0) {
         class332.method2461(8);
      }

      class332.method2461(2);
      if (this.field5954 > 1) {
         this.field5956 = class332.method2461(4);
      }

      this.field5957 = new int[this.field5954];
      this.field5955 = new int[this.field5954];

      for(int var1 = 0; var1 < this.field5954; ++var1) {
         class332.method2461(8);
         this.field5957[var1] = class332.method2461(8);
         this.field5955[var1] = class332.method2461(8);
      }

   }
}
