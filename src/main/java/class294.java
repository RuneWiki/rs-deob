import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class294 {
   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "[Lbga;"
   )
   private class375[] field4091 = new class375[10];
   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "I"
   )
   private int field4093;
   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "I"
   )
   private int field4092;

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "()[B",
      line = 7
   )
   private final byte[] method2240() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field4091[var2] != null && this.field4091[var2].field5691 + this.field4091[var2].field5683 > var1) {
            var1 = this.field4091[var2].field5691 + this.field4091[var2].field5683;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field4091[var5] != null) {
               int var6 = this.field4091[var5].field5691 * 22050 / 1000;
               int var7 = this.field4091[var5].field5683 * 22050 / 1000;
               int[] var8 = this.field4091[var5].method2907(var6, this.field4091[var5].field5691);

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
      owner = "client!vca",
      name = "a",
      descriptor = "()Ljaa;",
      line = 66
   )
   public final class640 method2241() {
      byte[] var1 = this.method2240();
      return new class640(22050, var1, this.field4093 * 22050 / 1000, this.field4092 * 22050 / 1000);
   }

   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "()I",
      line = 76
   )
   public final int method2242() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field4091[var2] != null && this.field4091[var2].field5683 / 20 < var1) {
            var1 = this.field4091[var2].field5683 / 20;
         }
      }

      if (this.field4093 < this.field4092 && this.field4093 / 20 < var1) {
         var1 = this.field4093 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field4091[var3] != null) {
               this.field4091[var3].field5683 -= var1 * 20;
            }
         }

         if (this.field4093 < this.field4092) {
            this.field4093 -= var1 * 20;
            this.field4092 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(Leaa;II)Lvca;",
      line = 119
   )
   public static final class294 method2243(class526 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method3899(-71, arg2, arg1);
      return var3 == null ? null : new class294(new class128(var3));
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "(Ljj;)V",
      line = 129
   )
   private class294(class128 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method1104(255);
         if (var3 != 0) {
            --arg0.field1590;
            this.field4091[var2] = new class375();
            this.field4091[var2].method2909(arg0);
         }
      }

      this.field4093 = arg0.method1038((byte)-109);
      this.field4092 = arg0.method1038((byte)-119);
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "()V",
      line = 149
   )
   private class294() {
   }
}
