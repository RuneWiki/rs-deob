import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class52 extends class770 {
   @OriginalMember(
      owner = "client!gp",
      name = "k",
      descriptor = "Z"
   )
   public boolean field572 = false;
   @OriginalMember(
      owner = "client!gp",
      name = "g",
      descriptor = "I"
   )
   public int field571;
   @OriginalMember(
      owner = "client!gp",
      name = "i",
      descriptor = "I"
   )
   public int field573;
   @OriginalMember(
      owner = "client!gp",
      name = "f",
      descriptor = "I"
   )
   public int field574;
   @OriginalMember(
      owner = "client!gp",
      name = "h",
      descriptor = "I"
   )
   public int field575;
   @OriginalMember(
      owner = "client!gp",
      name = "j",
      descriptor = "I"
   )
   public int field576;

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method418(int arg0, int arg1) {
      if (!this.field572) {
         return false;
      } else {
         int var3 = this.field574 - this.field576;
         int var4 = this.field571 - this.field573;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = arg0 * var3 + arg1 * var4 - (this.field576 * var3 + this.field573 * var4);
         if (var6 <= 0) {
            int var7 = this.field576 - arg0;
            int var8 = this.field573 - arg1;
            return var7 * var7 + var8 * var8 < this.field575 * this.field575;
         } else if (var6 > var5) {
            int var9 = this.field574 - arg0;
            int var10 = this.field571 - arg1;
            return var9 * var9 + var10 * var10 < this.field575 * this.field575;
         } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field576 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field573 - arg1;
            return var12 * var12 + var13 * var13 < this.field575 * this.field575;
         }
      }
   }
}
