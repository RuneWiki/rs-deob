import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class636 {
   @OriginalMember(
      owner = "client!ie",
      name = "i",
      descriptor = "Lgea;"
   )
   private class66 field9348 = new class66((byte[])null);
   @OriginalMember(
      owner = "client!ie",
      name = "h",
      descriptor = "[B"
   )
   private static byte[] field9347 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!ie",
      name = "f",
      descriptor = "I"
   )
   public int field9349;
   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "I"
   )
   private int field9354;
   @OriginalMember(
      owner = "client!ie",
      name = "c",
      descriptor = "J"
   )
   private long field9353;
   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "[I"
   )
   private int[] field9350;
   @OriginalMember(
      owner = "client!ie",
      name = "d",
      descriptor = "[I"
   )
   private int[] field9351;
   @OriginalMember(
      owner = "client!ie",
      name = "e",
      descriptor = "[I"
   )
   private int[] field9352;
   @OriginalMember(
      owner = "client!ie",
      name = "g",
      descriptor = "[I"
   )
   public int[] field9355;

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method4680(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field9348.method640(255);
         int var4 = this.field9348.method616((byte)-125);
         if (var3 == 47) {
            this.field9348.field864 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field9348.method645((byte)-26);
            var4 -= 3;
            int var6 = this.field9355[arg0];
            this.field9353 += (long)(this.field9354 - var5) * (long)var6;
            this.field9354 = var5;
            this.field9348.field864 += var4;
            return 2;
         } else {
            this.field9348.field864 += var4;
            return 3;
         }
      } else {
         byte var7 = field9347[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field9348.method640(255) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field9348.method640(255) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method4681() {
      int var1 = this.field9350.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field9350[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "d",
      descriptor = "(I)I"
   )
   private final int method4682(int arg0) {
      byte var2 = this.field9348.field859[this.field9348.field864];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field9351[arg0] = var3;
         ++this.field9348.field864;
      } else {
         var3 = this.field9351[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method4680(arg0, var3);
      } else {
         int var4 = this.field9348.method616((byte)-125);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field9348.field859[this.field9348.field864] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field9348.field864;
               this.field9351[arg0] = var5;
               return this.method4680(arg0, var5);
            }
         }

         this.field9348.field864 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "([B)V"
   )
   public final void method4683(byte[] arg0) {
      this.field9348.field859 = arg0;
      this.field9348.field864 = 10;
      int var2 = this.field9348.method603(-2);
      this.field9349 = this.field9348.method603(-2);
      this.field9354 = 500000;
      this.field9352 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field9348.method610(-33);
         int var6 = this.field9348.method610(-58);
         if (var5 == 1297379947) {
            this.field9352[var3] = this.field9348.field864;
            ++var3;
         }

         this.field9348.field864 += var6;
      }

      this.field9353 = 0L;
      this.field9350 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field9350[var4] = this.field9352[var4];
      }

      this.field9355 = new int[var2];
      this.field9351 = new int[var2];
   }

   @OriginalMember(
      owner = "client!ie",
      name = "d",
      descriptor = "()V"
   )
   public final void method4684() {
      this.field9348.field859 = null;
      this.field9352 = null;
      this.field9350 = null;
      this.field9355 = null;
      this.field9351 = null;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method4685(int arg0) {
      int var2 = this.field9348.method616((byte)-110);
      this.field9355[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "f",
      descriptor = "(I)J"
   )
   public final long method4686(int arg0) {
      return (long)this.field9354 * (long)arg0 + this.field9353;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method4687(int arg0) {
      return this.method4682(arg0);
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "()I"
   )
   public final int method4688() {
      int var1 = this.field9350.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field9350[var4] >= 0 && this.field9355[var4] < var3) {
            var2 = var4;
            var3 = this.field9355[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method4689() {
      return this.field9348.field859 != null;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method4690(int arg0) {
      this.field9350[arg0] = this.field9348.field864;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "()V"
   )
   public static void method4691() {
      field9347 = null;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "g",
      descriptor = "()I"
   )
   public final int method4692() {
      return this.field9350.length;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "c",
      descriptor = "()V"
   )
   public final void method4693() {
      this.field9348.field864 = -1;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method4694(long arg0) {
      this.field9353 = arg0;
      int var3 = this.field9350.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field9355[var4] = 0;
         this.field9351[var4] = 0;
         this.field9348.field864 = this.field9352[var4];
         this.method4685(var4);
         this.field9350[var4] = this.field9348.field864;
      }

   }

   @OriginalMember(
      owner = "client!ie",
      name = "<init>",
      descriptor = "()V"
   )
   public class636() {
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4695(int arg0) {
      this.field9348.field864 = this.field9350[arg0];
   }

   @OriginalMember(
      owner = "client!ie",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class636(byte[] arg0) {
      this.method4683(arg0);
   }
}
