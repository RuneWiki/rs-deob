import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class49 extends class391 {
   @OriginalMember(
      owner = "client!k",
      name = "o",
      descriptor = "Z"
   )
   public boolean field632 = false;
   @OriginalMember(
      owner = "client!k",
      name = "m",
      descriptor = "I"
   )
   public int field631;
   @OriginalMember(
      owner = "client!k",
      name = "n",
      descriptor = "I"
   )
   public int field633;
   @OriginalMember(
      owner = "client!k",
      name = "p",
      descriptor = "I"
   )
   public int field634;
   @OriginalMember(
      owner = "client!k",
      name = "l",
      descriptor = "I"
   )
   public int field635;
   @OriginalMember(
      owner = "client!k",
      name = "k",
      descriptor = "I"
   )
   public int field636;

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method344(int arg0, int arg1) {
      if (!this.field632) {
         return false;
      } else {
         int var3 = this.field635 - this.field636;
         int var4 = this.field633 - this.field634;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = arg0 * var3 + arg1 * var4 - (this.field636 * var3 + this.field634 * var4);
         if (var6 <= 0) {
            int var7 = this.field636 - arg0;
            int var8 = this.field634 - arg1;
            return var7 * var7 + var8 * var8 < this.field631 * this.field631;
         } else if (var6 > var5) {
            int var9 = this.field635 - arg0;
            int var10 = this.field633 - arg1;
            return var9 * var9 + var10 * var10 < this.field631 * this.field631;
         } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field636 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field634 - arg1;
            return var12 * var12 + var13 * var13 < this.field631 * this.field631;
         }
      }
   }
}
