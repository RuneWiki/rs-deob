import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class213 extends class686 {
   @OriginalMember(
      owner = "client!rh",
      name = "l",
      descriptor = "Z"
   )
   public boolean field3053 = false;
   @OriginalMember(
      owner = "client!rh",
      name = "n",
      descriptor = "I"
   )
   public int field3051;
   @OriginalMember(
      owner = "client!rh",
      name = "o",
      descriptor = "I"
   )
   public int field3052;
   @OriginalMember(
      owner = "client!rh",
      name = "p",
      descriptor = "I"
   )
   public int field3054;
   @OriginalMember(
      owner = "client!rh",
      name = "q",
      descriptor = "I"
   )
   public int field3055;
   @OriginalMember(
      owner = "client!rh",
      name = "m",
      descriptor = "I"
   )
   public int field3056;

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method1844(int arg0, int arg1) {
      if (!this.field3053) {
         return false;
      } else {
         int var3 = this.field3056 - this.field3054;
         int var4 = this.field3051 - this.field3055;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = arg0 * var3 + arg1 * var4 - (this.field3055 * var4 + this.field3054 * var3);
         if (var6 <= 0) {
            int var7 = this.field3054 - arg0;
            int var8 = this.field3055 - arg1;
            return var7 * var7 + var8 * var8 < this.field3052 * this.field3052;
         } else if (var6 > var5) {
            int var9 = this.field3056 - arg0;
            int var10 = this.field3051 - arg1;
            return var9 * var9 + var10 * var10 < this.field3052 * this.field3052;
         } else {
            int var11 = (var6 << 10) / var5;
            int var12 = (var3 * var11 >> 10) + this.field3054 - arg0;
            int var13 = (var4 * var11 >> 10) + this.field3055 - arg1;
            return var12 * var12 + var13 * var13 < this.field3052 * this.field3052;
         }
      }
   }
}
