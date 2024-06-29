import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class138 {
   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "[Lit;"
   )
   private class677[] field2007 = new class677[10];
   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "I"
   )
   private int field2005;
   @OriginalMember(
      owner = "client!vb",
      name = "c",
      descriptor = "I"
   )
   private int field2006;

   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "()[B"
   )
   private final byte[] method1274() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field2007[var2] != null && this.field2007[var2].field10071 + this.field2007[var2].field10057 > var1) {
            var1 = this.field2007[var2].field10071 + this.field2007[var2].field10057;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field2007[var5] != null) {
               int var6 = this.field2007[var5].field10071 * 22050 / 1000;
               int var7 = this.field2007[var5].field10057 * 22050 / 1000;
               int[] var8 = this.field2007[var5].method4993(var6, this.field2007[var5].field10071);

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
      owner = "client!vb",
      name = "a",
      descriptor = "(Lrr;II)Lvb;"
   )
   public static final class138 method1275(class678 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method5017(arg1, arg2, (byte)71);
      return var3 == null ? null : new class138(new class354(var3));
   }

   @OriginalMember(
      owner = "client!vb",
      name = "c",
      descriptor = "()I"
   )
   public final int method1276() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field2007[var2] != null && this.field2007[var2].field10057 / 20 < var1) {
            var1 = this.field2007[var2].field10057 / 20;
         }
      }

      if (this.field2005 < this.field2006 && this.field2005 / 20 < var1) {
         var1 = this.field2005 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field2007[var3] != null) {
               this.field2007[var3].field10057 -= var1 * 20;
            }
         }

         if (this.field2005 < this.field2006) {
            this.field2005 -= var1 * 20;
            this.field2006 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "<init>",
      descriptor = "(Lica;)V"
   )
   private class138(class354 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method2855(-31007);
         if (var3 != 0) {
            --arg0.field5436;
            this.field2007[var2] = new class677();
            this.field2007[var2].method4990(arg0);
         }
      }

      this.field2005 = arg0.method2848(-107);
      this.field2006 = arg0.method2848(-121);
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "()Lec;"
   )
   public final class184 method1277() {
      byte[] var1 = this.method1274();
      return new class184(22050, var1, this.field2005 * 22050 / 1000, this.field2006 * 22050 / 1000);
   }

   @OriginalMember(
      owner = "client!vb",
      name = "<init>",
      descriptor = "()V"
   )
   private class138() {
   }
}
