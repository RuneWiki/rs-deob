import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class120 {
   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "[Lst;"
   )
   private class256[] field1937 = new class256[10];
   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "I"
   )
   private int field1938;
   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "I"
   )
   private int field1936;

   @OriginalMember(
      owner = "client!uc",
      name = "b",
      descriptor = "()I"
   )
   public final int method1189() {
      int var1 = 9999999;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field1937[var2] != null && this.field1937[var2].field3878 / 20 < var1) {
            var1 = this.field1937[var2].field3878 / 20;
         }
      }

      if (this.field1938 < this.field1936 && this.field1938 / 20 < var1) {
         var1 = this.field1938 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(int var3 = 0; var3 < 10; ++var3) {
            if (this.field1937[var3] != null) {
               this.field1937[var3].field3878 -= var1 * 20;
            }
         }

         if (this.field1938 < this.field1936) {
            this.field1938 -= var1 * 20;
            this.field1936 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "(Lsa;II)Luc;"
   )
   public static final class120 method1190(class39 arg0, int arg1, int arg2) {
      byte[] var3 = arg0.method460((byte)-11, arg2, arg1);
      return var3 == null ? null : new class120(new class65(var3));
   }

   @OriginalMember(
      owner = "client!uc",
      name = "a",
      descriptor = "()Laia;"
   )
   public final class301 method1191() {
      byte[] var1 = this.method1192();
      return new class301(22050, var1, this.field1938 * 22050 / 1000, this.field1936 * 22050 / 1000);
   }

   @OriginalMember(
      owner = "client!uc",
      name = "c",
      descriptor = "()[B"
   )
   private final byte[] method1192() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         if (this.field1937[var2] != null && this.field1937[var2].field3878 + this.field1937[var2].field3875 > var1) {
            var1 = this.field1937[var2].field3878 + this.field1937[var2].field3875;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = var1 * 22050 / 1000;
         byte[] var4 = new byte[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field1937[var5] != null) {
               int var6 = this.field1937[var5].field3875 * 22050 / 1000;
               int var7 = this.field1937[var5].field3878 * 22050 / 1000;
               int[] var8 = this.field1937[var5].method2180(var6, this.field1937[var5].field3875);

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
      owner = "client!uc",
      name = "<init>",
      descriptor = "(Lcu;)V"
   )
   private class120(class65 arg0) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = arg0.method665(false);
         if (var3 != 0) {
            --arg0.field945;
            this.field1937[var2] = new class256();
            this.field1937[var2].method2182(arg0);
         }
      }

      this.field1938 = arg0.method685(-2);
      this.field1936 = arg0.method685(-2);
   }

   @OriginalMember(
      owner = "client!uc",
      name = "<init>",
      descriptor = "()V"
   )
   private class120() {
   }
}
