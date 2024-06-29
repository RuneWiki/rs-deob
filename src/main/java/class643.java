import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class643 {
   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "Lwf;"
   )
   private class147 field9391 = new class147((byte[])null);
   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "[B"
   )
   private static byte[] field9390 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!mfa",
      name = "e",
      descriptor = "I"
   )
   private int field9396;
   @OriginalMember(
      owner = "client!mfa",
      name = "g",
      descriptor = "I"
   )
   public int field9397;
   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "J"
   )
   private long field9398;
   @OriginalMember(
      owner = "client!mfa",
      name = "f",
      descriptor = "[I"
   )
   private int[] field9392;
   @OriginalMember(
      owner = "client!mfa",
      name = "h",
      descriptor = "[I"
   )
   public int[] field9393;
   @OriginalMember(
      owner = "client!mfa",
      name = "i",
      descriptor = "[I"
   )
   private int[] field9394;
   @OriginalMember(
      owner = "client!mfa",
      name = "d",
      descriptor = "[I"
   )
   private int[] field9395;

   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4642(int arg0) {
      return this.method4656(arg0);
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method4643(int arg0) {
      return (long)this.field9396 * (long)arg0 + this.field9398;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "()V"
   )
   public static void method4644() {
      field9390 = null;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method4645(long arg0) {
      this.field9398 = arg0;
      int var3 = this.field9392.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field9393[var4] = 0;
         this.field9394[var4] = 0;
         this.field9391.field1856 = this.field9395[var4];
         this.method4654(var4);
         this.field9392[var4] = this.field9391.field1856;
      }

   }

   @OriginalMember(
      owner = "client!mfa",
      name = "g",
      descriptor = "()Z"
   )
   public final boolean method4646() {
      return this.field9391.field1889 != null;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "()I"
   )
   public final int method4647() {
      int var1 = this.field9392.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field9392[var4] >= 0 && this.field9393[var4] < var3) {
            var2 = var4;
            var3 = this.field9393[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "([B)V"
   )
   public final void method4648(byte[] arg0) {
      this.field9391.field1889 = arg0;
      this.field9391.field1856 = 10;
      int var2 = this.field9391.method1211(-26166);
      this.field9397 = this.field9391.method1211(-26166);
      this.field9396 = 500000;
      this.field9395 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field9391.method1164(19693);
         int var6 = this.field9391.method1164(19693);
         if (var5 == 1297379947) {
            this.field9395[var3] = this.field9391.field1856;
            ++var3;
         }

         this.field9391.field1856 += var6;
      }

      this.field9398 = 0L;
      this.field9392 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field9392[var4] = this.field9395[var4];
      }

      this.field9393 = new int[var2];
      this.field9394 = new int[var2];
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "()V"
   )
   public final void method4649() {
      this.field9391.field1856 = -1;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "d",
      descriptor = "()V"
   )
   public final void method4650() {
      this.field9391.field1889 = null;
      this.field9395 = null;
      this.field9392 = null;
      this.field9393 = null;
      this.field9394 = null;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method4651(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field9391.method1143(-15465);
         int var4 = this.field9391.method1198(96);
         if (var3 == 47) {
            this.field9391.field1856 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field9391.method1166((byte)-87);
            var4 -= 3;
            int var6 = this.field9393[arg0];
            this.field9398 += (long)(this.field9396 - var5) * (long)var6;
            this.field9396 = var5;
            this.field9391.field1856 += var4;
            return 2;
         } else {
            this.field9391.field1856 += var4;
            return 3;
         }
      } else {
         byte var7 = field9390[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field9391.method1143(-15465) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field9391.method1143(-15465) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method4652(int arg0) {
      this.field9391.field1856 = this.field9392[arg0];
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method4653() {
      int var1 = this.field9392.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field9392[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method4654(int arg0) {
      int var2 = this.field9391.method1198(123);
      this.field9393[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "e",
      descriptor = "()I"
   )
   public final int method4655() {
      return this.field9392.length;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "d",
      descriptor = "(I)I"
   )
   private final int method4656(int arg0) {
      byte var2 = this.field9391.field1889[this.field9391.field1856];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field9394[arg0] = var3;
         ++this.field9391.field1856;
      } else {
         var3 = this.field9394[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method4651(arg0, var3);
      } else {
         int var4 = this.field9391.method1198(102);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field9391.field1889[this.field9391.field1856] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field9391.field1856;
               this.field9394[arg0] = var5;
               return this.method4651(arg0, var5);
            }
         }

         this.field9391.field1856 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4657(int arg0) {
      this.field9392[arg0] = this.field9391.field1856;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "()V"
   )
   public class643() {
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class643(byte[] arg0) {
      this.method4648(arg0);
   }
}
