import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class179 {
   @OriginalMember(
      owner = "client!tn",
      name = "c",
      descriptor = "I"
   )
   public int field2631;
   @OriginalMember(
      owner = "client!tn",
      name = "a",
      descriptor = "I"
   )
   public int field2633;
   @OriginalMember(
      owner = "client!tn",
      name = "b",
      descriptor = "[I"
   )
   public int[] field2630;
   @OriginalMember(
      owner = "client!tn",
      name = "d",
      descriptor = "[I"
   )
   public int[] field2632;

   @OriginalMember(
      owner = "client!tn",
      name = "<init>",
      descriptor = "()V"
   )
   public class179() {
      class469.method3598(16);
      this.field2631 = class469.method3599() != 0 ? class469.method3598(4) + 1 : 1;
      if (class469.method3599() != 0) {
         class469.method3598(8);
      }

      class469.method3598(2);
      if (this.field2631 > 1) {
         this.field2633 = class469.method3598(4);
      }

      this.field2630 = new int[this.field2631];
      this.field2632 = new int[this.field2631];

      for(int var1 = 0; var1 < this.field2631; ++var1) {
         class469.method3598(8);
         this.field2630[var1] = class469.method3598(8);
         this.field2632[var1] = class469.method3598(8);
      }

   }
}
