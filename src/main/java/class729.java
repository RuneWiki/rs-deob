import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class729 {
   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "[Lnca;"
   )
   private class788[] field10673 = new class788[10];
   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "I"
   )
   private int field10674;
   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "I"
   )
   private int field10675;

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "()Lin;"
   )
   public final class98 method5300() {
      byte[] var1 = this.method5303();
      return new class98(22050, var1, this.field10674 * 22050 / 1000, this.field10675 * 22050 / 1000);
   }

   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "()I"
   )
   public final int method5301() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field10673[var2] != null && this.field10673[var2].field11510 / 20 < var1) {
            var1 = this.field10673[var2].field11510 / 20;
         }
      }

      if (this.field10674 < this.field10675 && this.field10674 / 20 < var1) {
         var1 = this.field10674 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field10673[var3] != null) {
               this.field10673[var3].field11510 -= var1 * 20;
            }
         }

         if (this.field10674 < this.field10675) {
            this.field10674 -= var1 * 20;
            this.field10675 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Lqh;II)Ldq;"
   )
   public static final class729 method5302(class74 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method732(arg2, arg1, (byte)109);
      return var3 == null ? null : new class729(new class594(var3));
   }

   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "()[B"
   )
   private final byte[] method5303() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field10673[var2] != null && this.field10673[var2].field11510 + this.field10673[var2].field11497 > var1) {
            var1 = this.field10673[var2].field11510 + this.field10673[var2].field11497;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field10673[var5] != null) {
               int var6 = this.field10673[var5].field11497 * 22050 / 1000;
               int var7 = this.field10673[var5].field11510 * 22050 / 1000;
               int[] var8 = this.field10673[var5].method5670(var6, this.field10673[var5].field11497);

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
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   private class729(class594 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method4288((byte)115);
         if (var3 != 0) {
            --arg0.field8243;
            this.field10673[var2] = new class788();
            this.field10673[var2].method5669(arg0);
         }
      }

      this.field10674 = arg0.method4280(-19104);
      this.field10675 = arg0.method4280(-19104);
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "()V"
   )
   private class729() {
   }
}
