import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class268 {
   @OriginalMember(
      owner = "client!ht",
      name = "b",
      descriptor = "I"
   )
   public int field4355;
   @OriginalMember(
      owner = "client!ht",
      name = "d",
      descriptor = "I"
   )
   public int field4357;
   @OriginalMember(
      owner = "client!ht",
      name = "c",
      descriptor = "[I"
   )
   public int[] field4358;
   @OriginalMember(
      owner = "client!ht",
      name = "a",
      descriptor = "[I"
   )
   public int[] field4356;

   @OriginalMember(
      owner = "client!ht",
      name = "<init>",
      descriptor = "()V",
      line = 7
   )
   public class268() {
      class617.method4543(16);
      this.field4355 = class617.method4539() != 0 ? class617.method4543(4) + 1 : 1;
      if (class617.method4539() != 0) {
         class617.method4543(8);
      }

      class617.method4543(2);
      if (this.field4355 > 1) {
         this.field4357 = class617.method4543(4);
      }

      this.field4358 = new int[this.field4355];
      this.field4356 = new int[this.field4355];

      for(int var1 = 0; var1 < this.field4355; ++var1) {
         class617.method4543(8);
         this.field4358[var1] = class617.method4543(8);
         this.field4356[var1] = class617.method4543(8);
      }

   }
}
