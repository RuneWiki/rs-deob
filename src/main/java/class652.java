import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class652 {
   @OriginalMember(
      owner = "client!kia",
      name = "b",
      descriptor = "I"
   )
   public int field9139;
   @OriginalMember(
      owner = "client!kia",
      name = "c",
      descriptor = "I"
   )
   public int field9141;
   @OriginalMember(
      owner = "client!kia",
      name = "a",
      descriptor = "[I"
   )
   public int[] field9142;
   @OriginalMember(
      owner = "client!kia",
      name = "d",
      descriptor = "[I"
   )
   public int[] field9140;

   @OriginalMember(
      owner = "client!kia",
      name = "<init>",
      descriptor = "()V"
   )
   public class652() {
      class36.method276(16);
      this.field9139 = class36.method282() != 0 ? class36.method276(4) + 1 : 1;
      if (class36.method282() != 0) {
         class36.method276(8);
      }

      class36.method276(2);
      if (this.field9139 > 1) {
         this.field9141 = class36.method276(4);
      }

      this.field9142 = new int[this.field9139];
      this.field9140 = new int[this.field9139];

      for(int var1 = 0; var1 < this.field9139; ++var1) {
         class36.method276(8);
         this.field9142[var1] = class36.method276(8);
         this.field9140[var1] = class36.method276(8);
      }

   }
}
