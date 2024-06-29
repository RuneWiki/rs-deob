import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class81 {
   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "Luda;"
   )
   private class473 field1371 = new class473((byte[])null);
   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "[B"
   )
   private static byte[] field1372 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!gea",
      name = "e",
      descriptor = "I"
   )
   private int field1375;
   @OriginalMember(
      owner = "client!gea",
      name = "d",
      descriptor = "I"
   )
   public int field1379;
   @OriginalMember(
      owner = "client!gea",
      name = "i",
      descriptor = "J"
   )
   private long field1376;
   @OriginalMember(
      owner = "client!gea",
      name = "g",
      descriptor = "[I"
   )
   private int[] field1373;
   @OriginalMember(
      owner = "client!gea",
      name = "f",
      descriptor = "[I"
   )
   public int[] field1374;
   @OriginalMember(
      owner = "client!gea",
      name = "c",
      descriptor = "[I"
   )
   private int[] field1377;
   @OriginalMember(
      owner = "client!gea",
      name = "h",
      descriptor = "[I"
   )
   private int[] field1378;

   @OriginalMember(
      owner = "client!gea",
      name = "g",
      descriptor = "()V"
   )
   public static void method815() {
      field1372 = null;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method816(long arg0) {
      this.field1376 = arg0;
      int var3 = this.field1378.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field1374[var4] = 0;
         this.field1377[var4] = 0;
         this.field1371.field6907 = this.field1373[var4];
         this.method828(var4);
         this.field1378[var4] = this.field1371.field6907;
      }

   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "([B)V"
   )
   public final void method817(byte[] arg0) {
      this.field1371.field6889 = arg0;
      this.field1371.field6907 = 10;
      int var2 = this.field1371.method3565(true);
      this.field1379 = this.field1371.method3565(true);
      this.field1375 = 500000;
      this.field1373 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field1371.method3567(31871);
         int var6 = this.field1371.method3567(31871);
         if (var5 == 1297379947) {
            this.field1373[var3] = this.field1371.field6907;
            ++var3;
         }

         this.field1371.field6907 += var6;
      }

      this.field1376 = 0L;
      this.field1378 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field1378[var4] = this.field1373[var4];
      }

      this.field1374 = new int[var2];
      this.field1377 = new int[var2];
   }

   @OriginalMember(
      owner = "client!gea",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method818(int arg0) {
      return (long)this.field1375 * (long)arg0 + this.field1376;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method819() {
      int var1 = this.field1378.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field1378[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "d",
      descriptor = "()I"
   )
   public final int method820() {
      int var1 = this.field1378.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field1378[var4] >= 0 && this.field1374[var4] < var3) {
            var2 = var4;
            var3 = this.field1374[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "()V"
   )
   public final void method821() {
      this.field1371.field6907 = -1;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method822() {
      return this.field1371.field6889 != null;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method823(int arg0) {
      this.field1378[arg0] = this.field1371.field6907;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method824(int arg0) {
      this.field1371.field6907 = this.field1378[arg0];
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method825(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field1371.method3564((byte)-86);
         int var4 = this.field1371.method3585(0);
         if (var3 == 47) {
            this.field1371.field6907 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field1371.method3577(-2);
            var4 -= 3;
            int var6 = this.field1374[arg0];
            this.field1376 += (long)(this.field1375 - var5) * (long)var6;
            this.field1375 = var5;
            this.field1371.field6907 += var4;
            return 2;
         } else {
            this.field1371.field6907 += var4;
            return 3;
         }
      } else {
         byte var7 = field1372[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field1371.method3564((byte)-80) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field1371.method3564((byte)-41) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method826(int arg0) {
      return this.method830(arg0);
   }

   @OriginalMember(
      owner = "client!gea",
      name = "e",
      descriptor = "()I"
   )
   public final int method827() {
      return this.field1378.length;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method828(int arg0) {
      int var2 = this.field1371.method3585(0);
      this.field1374[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "f",
      descriptor = "()V"
   )
   public final void method829() {
      this.field1371.field6889 = null;
      this.field1373 = null;
      this.field1378 = null;
      this.field1374 = null;
      this.field1377 = null;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "(I)I"
   )
   private final int method830(int arg0) {
      byte var2 = this.field1371.field6889[this.field1371.field6907];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field1377[arg0] = var3;
         ++this.field1371.field6907;
      } else {
         var3 = this.field1377[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method825(arg0, var3);
      } else {
         int var4 = this.field1371.method3585(0);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field1371.field6889[this.field1371.field6907] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field1371.field6907;
               this.field1377[arg0] = var5;
               return this.method825(arg0, var5);
            }
         }

         this.field1371.field6907 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "<init>",
      descriptor = "()V"
   )
   public class81() {
   }

   @OriginalMember(
      owner = "client!gea",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class81(byte[] arg0) {
      this.method817(arg0);
   }
}
