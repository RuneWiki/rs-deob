import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class525 {
   @OriginalMember(
      owner = "client!nja",
      name = "b",
      descriptor = "[Lrp;"
   )
   private class683[] field7354 = new class683[10];
   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "I"
   )
   private int field7352;
   @OriginalMember(
      owner = "client!nja",
      name = "c",
      descriptor = "I"
   )
   private int field7353;

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "()I"
   )
   public final int method3927() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field7354[var2] != null && this.field7354[var2].field10051 / 20 < var1) {
            var1 = this.field7354[var2].field10051 / 20;
         }
      }

      if (this.field7352 < this.field7353 && this.field7352 / 20 < var1) {
         var1 = this.field7352 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field7354[var3] != null) {
               this.field7354[var3].field10051 -= var1 * 20;
            }
         }

         if (this.field7352 < this.field7353) {
            this.field7352 -= var1 * 20;
            this.field7353 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!nja",
      name = "a",
      descriptor = "(Lww;II)Lnja;"
   )
   public static final class525 method3928(class339 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2697(arg2, arg1, false);
      return var3 == null ? null : new class525(new class66(var3));
   }

   @OriginalMember(
      owner = "client!nja",
      name = "b",
      descriptor = "()[B"
   )
   private final byte[] method3929() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field7354[var2] != null && this.field7354[var2].field10051 + this.field7354[var2].field10049 > var1) {
            var1 = this.field7354[var2].field10051 + this.field7354[var2].field10049;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field7354[var5] != null) {
               int var6 = this.field7354[var5].field10049 * 22050 / 1000;
               int var7 = this.field7354[var5].field10051 * 22050 / 1000;
               int[] var8 = this.field7354[var5].method4975(var6, this.field7354[var5].field10049);

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
      owner = "client!nja",
      name = "<init>",
      descriptor = "(Lgea;)V"
   )
   private class525(class66 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method640(255);
         if (var3 != 0) {
            --arg0.field864;
            this.field7354[var2] = new class683();
            this.field7354[var2].method4974(arg0);
         }
      }

      this.field7352 = arg0.method603(-2);
      this.field7353 = arg0.method603(-2);
   }

   @OriginalMember(
      owner = "client!nja",
      name = "<init>",
      descriptor = "()V"
   )
   private class525() {
   }

   @OriginalMember(
      owner = "client!nja",
      name = "c",
      descriptor = "()Lgb;"
   )
   public final class521 method3930() {
      byte[] var1 = this.method3929();
      return new class521(22050, var1, this.field7352 * 22050 / 1000, this.field7353 * 22050 / 1000);
   }
}
