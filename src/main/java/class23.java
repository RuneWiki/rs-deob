import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {
   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "Lwm;"
   )
   private class594 field292 = new class594((byte[])null);
   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "[B"
   )
   private static byte[] field300 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!qia",
      name = "i",
      descriptor = "I"
   )
   public int field293;
   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "I"
   )
   private int field296;
   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "J"
   )
   private long field295;
   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "[I"
   )
   private int[] field294;
   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "[I"
   )
   private int[] field297;
   @OriginalMember(
      owner = "client!qia",
      name = "h",
      descriptor = "[I"
   )
   private int[] field298;
   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "[I"
   )
   public int[] field299;

   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method191(int arg0) {
      int var2 = this.field292.method4282(2057284936);
      this.field299[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method192(int arg0) {
      this.field292.field8243 = this.field294[arg0];
   }

   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "()V"
   )
   public final void method193() {
      this.field292.field8227 = null;
      this.field297 = null;
      this.field294 = null;
      this.field299 = null;
      this.field298 = null;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method194(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field292.method4288((byte)70);
         int var4 = this.field292.method4282(2057284936);
         if (var3 == 47) {
            this.field292.field8243 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field292.method4293(95);
            var4 -= 3;
            int var6 = this.field299[arg0];
            this.field295 += (long)(this.field296 - var5) * (long)var6;
            this.field296 = var5;
            this.field292.field8243 += var4;
            return 2;
         } else {
            this.field292.field8243 += var4;
            return 3;
         }
      } else {
         byte var7 = field300[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field292.method4288((byte)83) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field292.method4288((byte)67) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method195(long arg0) {
      this.field295 = arg0;
      int var3 = this.field294.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field299[var4] = 0;
         this.field298[var4] = 0;
         this.field292.field8243 = this.field297[var4];
         this.method191(var4);
         this.field294[var4] = this.field292.field8243;
      }

   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method196(int arg0) {
      this.field294[arg0] = this.field292.field8243;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "()I"
   )
   public final int method197() {
      int var1 = this.field294.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field294[var4] >= 0 && this.field299[var4] < var3) {
            var2 = var4;
            var3 = this.field299[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "(I)I"
   )
   private final int method198(int arg0) {
      byte var2 = this.field292.field8227[this.field292.field8243];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field298[arg0] = var3;
         ++this.field292.field8243;
      } else {
         var3 = this.field298[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method194(arg0, var3);
      } else {
         int var4 = this.field292.method4282(2057284936);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field292.field8227[this.field292.field8243] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field292.field8243;
               this.field298[arg0] = var5;
               return this.method194(arg0, var5);
            }
         }

         this.field292.field8243 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "([B)V"
   )
   public final void method199(byte[] arg0) {
      this.field292.field8227 = arg0;
      this.field292.field8243 = 10;
      int var2 = this.field292.method4280(-19104);
      this.field293 = this.field292.method4280(-19104);
      this.field296 = 500000;
      this.field297 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field292.method4302(true);
         int var6 = this.field292.method4302(true);
         if (var5 == 1297379947) {
            this.field297[var3] = this.field292.field8243;
            ++var3;
         }

         this.field292.field8243 += var6;
      }

      this.field295 = 0L;
      this.field294 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field294[var4] = this.field297[var4];
      }

      this.field299 = new int[var2];
      this.field298 = new int[var2];
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "()V"
   )
   public final void method200() {
      this.field292.field8243 = -1;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "(I)J"
   )
   public final long method201(int arg0) {
      return (long)this.field296 * (long)arg0 + this.field295;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "()V"
   )
   public static void method202() {
      field300 = null;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "()Z"
   )
   public final boolean method203() {
      int var1 = this.field294.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field294[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "()I"
   )
   public final int method204() {
      return this.field294.length;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method205() {
      return this.field292.field8227 != null;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method206(int arg0) {
      return this.method198(arg0);
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "()V"
   )
   public class23() {
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class23(byte[] arg0) {
      this.method199(arg0);
   }
}
