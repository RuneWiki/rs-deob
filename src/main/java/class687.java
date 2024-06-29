import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class687 extends class82 {
   @OriginalMember(
      owner = "client!mia",
      name = "i",
      descriptor = "Z"
   )
   public boolean field10117 = false;
   @OriginalMember(
      owner = "client!mia",
      name = "g",
      descriptor = "I"
   )
   public int field10115;
   @OriginalMember(
      owner = "client!mia",
      name = "j",
      descriptor = "I"
   )
   public int field10116;
   @OriginalMember(
      owner = "client!mia",
      name = "h",
      descriptor = "I"
   )
   public int field10118;
   @OriginalMember(
      owner = "client!mia",
      name = "l",
      descriptor = "I"
   )
   public int field10119;
   @OriginalMember(
      owner = "client!mia",
      name = "k",
      descriptor = "I"
   )
   public int field10120;

   @OriginalMember(
      owner = "client!mia",
      name = "b",
      descriptor = "(II)Z"
   )
   public final boolean method5026(int arg0, int arg1) {
      if (!this.field10117) {
         return false;
      } else {
         int var3 = this.field10115 - this.field10119;
         int var4 = this.field10118 - this.field10120;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = arg0 * var3 + arg1 * var4 - (this.field10120 * var4 + this.field10119 * var3);
         if (var6 <= 0) {
            int var7 = this.field10119 - arg0;
            int var8 = this.field10120 - arg1;
            return var7 * var7 + var8 * var8 < this.field10116 * this.field10116;
         } else if (var6 > var5) {
            int var9 = this.field10115 - arg0;
            int var10 = this.field10118 - arg1;
            return var9 * var9 + var10 * var10 < this.field10116 * this.field10116;
         } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field10119 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field10120 - arg1;
            return var12 * var12 + var13 * var13 < this.field10116 * this.field10116;
         }
      }
   }
}
