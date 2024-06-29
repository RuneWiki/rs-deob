import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class351 {
   @OriginalMember(
      owner = "client!b",
      name = "d",
      descriptor = "I"
   )
   public int field4976;
   @OriginalMember(
      owner = "client!b",
      name = "b",
      descriptor = "I"
   )
   public int field4973;
   @OriginalMember(
      owner = "client!b",
      name = "c",
      descriptor = "[I"
   )
   public int[] field4975;
   @OriginalMember(
      owner = "client!b",
      name = "a",
      descriptor = "[I"
   )
   public int[] field4974;

   @OriginalMember(
      owner = "client!b",
      name = "<init>",
      descriptor = "()V",
      line = 7
   )
   public class351() {
      class214.method1824(16);
      this.field4976 = class214.method1828() != 0 ? class214.method1824(4) + 1 : 1;
      if (class214.method1828() != 0) {
         class214.method1824(8);
      }

      class214.method1824(2);
      if (this.field4976 > 1) {
         this.field4973 = class214.method1824(4);
      }

      this.field4975 = new int[this.field4976];
      this.field4974 = new int[this.field4976];

      for(int var1 = 0; var1 < this.field4976; ++var1) {
         class214.method1824(8);
         this.field4975[var1] = class214.method1824(8);
         this.field4974[var1] = class214.method1824(8);
      }

   }
}
