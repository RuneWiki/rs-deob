import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class128 {
   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "Lica;"
   )
   private class354 field1838 = new class354((byte[])null);
   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "[B"
   )
   private static byte[] field1837 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!we",
      name = "g",
      descriptor = "I"
   )
   public int field1839;
   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "I"
   )
   private int field1845;
   @OriginalMember(
      owner = "client!we",
      name = "d",
      descriptor = "J"
   )
   private long field1842;
   @OriginalMember(
      owner = "client!we",
      name = "i",
      descriptor = "[I"
   )
   private int[] field1840;
   @OriginalMember(
      owner = "client!we",
      name = "e",
      descriptor = "[I"
   )
   private int[] field1841;
   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "[I"
   )
   private int[] field1843;
   @OriginalMember(
      owner = "client!we",
      name = "h",
      descriptor = "[I"
   )
   public int[] field1844;

   @OriginalMember(
      owner = "client!we",
      name = "d",
      descriptor = "()V",
      line = 3
   )
   public static void method1209() {
      field1837 = null;
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "([B)V",
      line = 7
   )
   public final void method1210(byte[] arg0) {
      this.field1838.field5428 = arg0;
      this.field1838.field5436 = 10;
      int var2 = this.field1838.method2848(-100);
      this.field1839 = this.field1838.method2848(-107);
      this.field1845 = 500000;
      this.field1841 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field1838.method2894(119);
         int var6 = this.field1838.method2894(98);
         if (var5 == 1297379947) {
            this.field1841[var3] = this.field1838.field5436;
            ++var3;
         }

         this.field1838.field5436 += var6;
      }

      this.field1842 = 0L;
      this.field1840 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field1840[var4] = this.field1841[var4];
      }

      this.field1844 = new int[var2];
      this.field1843 = new int[var2];
   }

   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "(I)V",
      line = 61
   )
   public final void method1211(int arg0) {
      this.field1838.field5436 = this.field1840[arg0];
   }

   @OriginalMember(
      owner = "client!we",
      name = "d",
      descriptor = "(I)V",
      line = 64
   )
   public final void method1212(int arg0) {
      this.field1840[arg0] = this.field1838.field5436;
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(I)J",
      line = 68
   )
   public final long method1213(int arg0) {
      return (long)this.field1845 * (long)arg0 + this.field1842;
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(J)V",
      line = 72
   )
   public final void method1214(long arg0) {
      this.field1842 = arg0;
      int var3 = this.field1840.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field1844[var4] = 0;
         this.field1843[var4] = 0;
         this.field1838.field5436 = this.field1841[var4];
         this.method1217(var4);
         this.field1840[var4] = this.field1838.field5436;
      }

   }

   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "()V",
      line = 91
   )
   public final void method1215() {
      this.field1838.field5436 = -1;
   }

   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "()I",
      line = 98
   )
   public final int method1216() {
      return this.field1840.length;
   }

   @OriginalMember(
      owner = "client!we",
      name = "e",
      descriptor = "(I)V",
      line = 103
   )
   public final void method1217(int arg0) {
      int var2 = this.field1838.method2891(0);
      this.field1844[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "()Z",
      line = 108
   )
   public final boolean method1218() {
      int var1 = this.field1840.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field1840[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!we",
      name = "g",
      descriptor = "()Z",
      line = 122
   )
   public final boolean method1219() {
      return this.field1838.field5428 != null;
   }

   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "(I)I",
      line = 126
   )
   public final int method1220(int arg0) {
      return this.method1222(arg0);
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(II)I",
      line = 132
   )
   private final int method1221(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field1838.method2855(-31007);
         int var4 = this.field1838.method2891(0);
         if (var3 == 47) {
            this.field1838.field5436 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field1838.method2872(2);
            var4 -= 3;
            int var6 = this.field1844[arg0];
            this.field1842 += (long)(this.field1845 - var5) * (long)var6;
            this.field1845 = var5;
            this.field1838.field5436 += var4;
            return 2;
         } else {
            this.field1838.field5436 += var4;
            return 3;
         }
      } else {
         byte var7 = field1837[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field1838.method2855(-31007) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field1838.method2855(-31007) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "(I)I",
      line = 176
   )
   private final int method1222(int arg0) {
      byte var2 = this.field1838.field5428[this.field1838.field5436];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field1843[arg0] = var3;
         ++this.field1838.field5436;
      } else {
         var3 = this.field1843[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method1221(arg0, var3);
      } else {
         int var4 = this.field1838.method2891(0);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field1838.field5428[this.field1838.field5436] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field1838.field5436;
               this.field1843[arg0] = var5;
               return this.method1221(arg0, var5);
            }
         }

         this.field1838.field5436 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "e",
      descriptor = "()V",
      line = 214
   )
   public final void method1223() {
      this.field1838.field5428 = null;
      this.field1841 = null;
      this.field1840 = null;
      this.field1844 = null;
      this.field1843 = null;
   }

   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "()I",
      line = 227
   )
   public final int method1224() {
      int var1 = this.field1840.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field1840[var4] >= 0 && this.field1844[var4] < var3) {
            var2 = var4;
            var3 = this.field1844[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!we",
      name = "<init>",
      descriptor = "()V",
      line = 263
   )
   public class128() {
   }

   @OriginalMember(
      owner = "client!we",
      name = "<init>",
      descriptor = "([B)V",
      line = 265
   )
   public class128(byte[] arg0) {
      this.method1210(arg0);
   }
}
