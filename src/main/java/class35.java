import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class35 {
   @OriginalMember(
      owner = "client!qi",
      name = "g",
      descriptor = "Lcu;"
   )
   private class65 field517 = new class65((byte[])null);
   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "[B"
   )
   private static byte[] field525 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "I"
   )
   public int field521;
   @OriginalMember(
      owner = "client!qi",
      name = "h",
      descriptor = "I"
   )
   private int field523;
   @OriginalMember(
      owner = "client!qi",
      name = "i",
      descriptor = "J"
   )
   private long field518;
   @OriginalMember(
      owner = "client!qi",
      name = "e",
      descriptor = "[I"
   )
   private int[] field519;
   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "[I"
   )
   public int[] field520;
   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "[I"
   )
   private int[] field522;
   @OriginalMember(
      owner = "client!qi",
      name = "d",
      descriptor = "[I"
   )
   private int[] field524;

   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "(I)I"
   )
   private final int method395(int arg0) {
      byte var2 = this.field517.field942[this.field517.field945];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field524[arg0] = var3;
         ++this.field517.field945;
      } else {
         var3 = this.field524[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method408(arg0, var3);
      } else {
         int var4 = this.field517.method669((byte)-114);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field517.field942[this.field517.field945] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field517.field945;
               this.field524[arg0] = var5;
               return this.method408(arg0, var5);
            }
         }

         this.field517.field945 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "d",
      descriptor = "()V"
   )
   public static void method396() {
      field525 = null;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method397() {
      int var1 = this.field522.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field522[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "()I"
   )
   public final int method398() {
      return this.field522.length;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "([B)V"
   )
   public final void method399(byte[] arg0) {
      this.field517.field942 = arg0;
      this.field517.field945 = 10;
      int var2 = this.field517.method685(-2);
      this.field521 = this.field517.method685(-2);
      this.field523 = 500000;
      this.field519 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field517.method701(255);
         int var6 = this.field517.method701(255);
         if (var5 == 1297379947) {
            this.field519[var3] = this.field517.field945;
            ++var3;
         }

         this.field517.field945 += var6;
      }

      this.field518 = 0L;
      this.field522 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field522[var4] = this.field519[var4];
      }

      this.field520 = new int[var2];
      this.field524 = new int[var2];
   }

   @OriginalMember(
      owner = "client!qi",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method400(int arg0) {
      int var2 = this.field517.method669((byte)-122);
      this.field520[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method401(int arg0) {
      return (long)this.field523 * (long)arg0 + this.field518;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method402(int arg0) {
      this.field522[arg0] = this.field517.field945;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "e",
      descriptor = "()V"
   )
   public final void method403() {
      this.field517.field945 = -1;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method404(int arg0) {
      return this.method395(arg0);
   }

   @OriginalMember(
      owner = "client!qi",
      name = "g",
      descriptor = "()I"
   )
   public final int method405() {
      int var1 = this.field522.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field522[var4] >= 0 && this.field520[var4] < var3) {
            var2 = var4;
            var3 = this.field520[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method406(long arg0) {
      this.field518 = arg0;
      int var3 = this.field522.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field520[var4] = 0;
         this.field524[var4] = 0;
         this.field517.field945 = this.field519[var4];
         this.method400(var4);
         this.field522[var4] = this.field517.field945;
      }

   }

   @OriginalMember(
      owner = "client!qi",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method407(int arg0) {
      this.field517.field945 = this.field522[arg0];
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method408(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field517.method665(false);
         int var4 = this.field517.method669((byte)-117);
         if (var3 == 47) {
            this.field517.field945 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field517.method691((byte)-128);
            var4 -= 3;
            int var6 = this.field520[arg0];
            this.field518 += (long)(this.field523 - var5) * (long)var6;
            this.field523 = var5;
            this.field517.field945 += var4;
            return 2;
         } else {
            this.field517.field945 += var4;
            return 3;
         }
      } else {
         byte var7 = field525[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field517.method665(false) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field517.method665(false) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "()V"
   )
   public final void method409() {
      this.field517.field942 = null;
      this.field519 = null;
      this.field522 = null;
      this.field520 = null;
      this.field524 = null;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method410() {
      return this.field517.field942 != null;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "()V"
   )
   public class35() {
   }

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class35(byte[] arg0) {
      this.method399(arg0);
   }
}
