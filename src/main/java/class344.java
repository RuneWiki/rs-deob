import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class344 {
   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "[Lis;"
   )
   private class531[] field4663 = new class531[10];
   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "I"
   )
   private int field4665;
   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "I"
   )
   private int field4664;

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "()Lvea;",
      line = 9
   )
   public final class289 method2522() {
      byte[] var1 = this.method2523();
      return new class289(22050, var1, this.field4665 * 22050 / 1000, this.field4664 * 22050 / 1000);
   }

   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "()[B",
      line = 14
   )
   private final byte[] method2523() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field4663[var2] != null && this.field4663[var2].field7573 + this.field4663[var2].field7563 > var1) {
            var1 = this.field4663[var2].field7573 + this.field4663[var2].field7563;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field4663[var5] != null) {
               int var6 = this.field4663[var5].field7563 * 22050 / 1000;
               int var7 = this.field4663[var5].field7573 * 22050 / 1000;
               int[] var8 = this.field4663[var5].method3831(var6, this.field4663[var5].field7563);

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
      owner = "client!fp",
      name = "a",
      descriptor = "(Lkf;II)Lfp;",
      line = 73
   )
   public static final class344 method2524(class266 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method2037(false, arg2, arg1);
      return var3 == null ? null : new class344(new class147(var3));
   }

   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "()I",
      line = 81
   )
   public final int method2525() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field4663[var2] != null && this.field4663[var2].field7573 / 20 < var1) {
            var1 = this.field4663[var2].field7573 / 20;
         }
      }

      if (this.field4665 < this.field4664 && this.field4665 / 20 < var1) {
         var1 = this.field4665 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field4663[var3] != null) {
               this.field4663[var3].field7573 -= var1 * 20;
            }
         }

         if (this.field4665 < this.field4664) {
            this.field4665 -= var1 * 20;
            this.field4664 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "<init>",
      descriptor = "(Lwf;)V",
      line = 129
   )
   private class344(class147 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method1143(-15465);
         if (var3 != 0) {
            --arg0.field1856;
            this.field4663[var2] = new class531();
            this.field4663[var2].method3830(arg0);
         }
      }

      this.field4665 = arg0.method1211(-26166);
      this.field4664 = arg0.method1211(-26166);
   }

   @OriginalMember(
      owner = "client!fp",
      name = "<init>",
      descriptor = "()V",
      line = 149
   )
   private class344() {
   }
}
