import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class239 {
   @OriginalMember(
      owner = "client!ui",
      name = "b",
      descriptor = "[Lsha;"
   )
   private class757[] field3472 = new class757[10];
   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "I"
   )
   private int field3471;
   @OriginalMember(
      owner = "client!ui",
      name = "c",
      descriptor = "I"
   )
   private int field3470;

   @OriginalMember(
      owner = "client!ui",
      name = "c",
      descriptor = "()[B",
      line = 4
   )
   private final byte[] method1956() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field3472[var2] != null && this.field3472[var2].field10990 + this.field3472[var2].field10989 > var1) {
            var1 = this.field3472[var2].field10990 + this.field3472[var2].field10989;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field3472[var5] != null) {
               int var6 = this.field3472[var5].field10989 * 22050 / 1000;
               int var7 = this.field3472[var5].field10990 * 22050 / 1000;
               int[] var8 = this.field3472[var5].method5480(var6, this.field3472[var5].field10989);

               for(int var9 = 0; var9 < var6; ++var9) {
                  int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                  if ((var10 + 128 & -256) != 0) {
                     var10 = var10 >> 31 ^ 127;
                  }

                  var4[var7 + var9] = (byte)var10;
               }
            }
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(Lhw;II)Lui;",
      line = 68
   )
   public static final class239 method1957(class141 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method1347((byte)122, arg1, arg2);
      return var3 == null ? null : new class239(new class473(var3));
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Luda;)V",
      line = 128
   )
   private class239(class473 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method3564((byte)-88);
         if (var3 != 0) {
            --arg0.field6907;
            this.field3472[var2] = new class757();
            this.field3472[var2].method5482(arg0);
         }
      }

      this.field3471 = arg0.method3565(true);
      this.field3470 = arg0.method3565(true);
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "()V",
      line = 148
   )
   private class239() {
   }

   @OriginalMember(
      owner = "client!ui",
      name = "b",
      descriptor = "()Lri;",
      line = 81
   )
   public final class122 method1958() {
      byte[] var1 = this.method1956();
      return new class122(22050, var1, this.field3471 * 22050 / 1000, this.field3470 * 22050 / 1000);
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "()I",
      line = 86
   )
   public final int method1959() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field3472[var2] != null && this.field3472[var2].field10990 / 20 < var1) {
            var1 = this.field3472[var2].field10990 / 20;
         }
      }

      if (this.field3471 < this.field3470 && this.field3471 / 20 < var1) {
         var1 = this.field3471 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field3472[var3] != null) {
               this.field3472[var3].field10990 -= var1 * 20;
            }
         }

         if (this.field3471 < this.field3470) {
            this.field3471 -= var1 * 20;
            this.field3470 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }
}
