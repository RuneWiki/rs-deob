import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class673 {
   @OriginalMember(
      owner = "client!lc",
      name = "g",
      descriptor = "Ljj;"
   )
   private class128 field10114 = new class128((byte[])null);
   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "[B"
   )
   private static byte[] field10115 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "I"
   )
   private int field10117;
   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "I"
   )
   public int field10121;
   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "J"
   )
   private long field10118;
   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "[I"
   )
   private int[] field10116;
   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "[I"
   )
   private int[] field10119;
   @OriginalMember(
      owner = "client!lc",
      name = "h",
      descriptor = "[I"
   )
   private int[] field10120;
   @OriginalMember(
      owner = "client!lc",
      name = "i",
      descriptor = "[I"
   )
   public int[] field10122;

   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "()V"
   )
   public final void method4900() {
      this.field10114.field1590 = -1;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4901(int arg0) {
      int var2 = this.field10114.method1065(false);
      this.field10122[arg0] += var2;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method4902(int arg0) {
      this.field10114.field1590 = this.field10120[arg0];
   }

   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "(I)J"
   )
   public final long method4903(int arg0) {
      return (long)this.field10117 * (long)arg0 + this.field10118;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method4904(int arg0) {
      this.field10120[arg0] = this.field10114.field1590;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "()V"
   )
   public static void method4905() {
      field10115 = null;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method4906(int arg0, int arg1) {
      if (arg1 == 255) {
         int var3 = this.field10114.method1104(255);
         int var4 = this.field10114.method1065(false);
         if (var3 == 47) {
            this.field10114.field1590 += var4;
            return 1;
         } else if (var3 == 81) {
            int var5 = this.field10114.method1077(-33);
            var4 -= 3;
            int var6 = this.field10122[arg0];
            this.field10118 += (long)(this.field10117 - var5) * (long)var6;
            this.field10117 = var5;
            this.field10114.field1590 += var4;
            return 2;
         } else {
            this.field10114.field1590 += var4;
            return 3;
         }
      } else {
         byte var7 = field10115[arg1 - 128];
         int var8 = arg1;
         if (var7 >= 1) {
            var8 = arg1 | this.field10114.method1104(255) << 8;
         }

         if (var7 >= 2) {
            var8 |= this.field10114.method1104(255) << 16;
         }

         return var8;
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method4907() {
      return this.field10114.field1552 != null;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "g",
      descriptor = "()I"
   )
   public final int method4908() {
      int var1 = this.field10120.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field10120[var4] >= 0 && this.field10122[var4] < var3) {
            var2 = var4;
            var3 = this.field10122[var4];
         }
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "()V"
   )
   public final void method4909() {
      this.field10114.field1552 = null;
      this.field10116 = null;
      this.field10120 = null;
      this.field10122 = null;
      this.field10119 = null;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method4910() {
      int var1 = this.field10120.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field10120[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(J)V"
   )
   public final void method4911(long arg0) {
      this.field10118 = arg0;
      int var3 = this.field10120.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field10122[var4] = 0;
         this.field10119[var4] = 0;
         this.field10114.field1590 = this.field10116[var4];
         this.method4901(var4);
         this.field10120[var4] = this.field10114.field1590;
      }

   }

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "()I"
   )
   public final int method4912() {
      return this.field10120.length;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4913(int arg0) {
      return this.method4915(arg0);
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "([B)V"
   )
   public final void method4914(byte[] arg0) {
      this.field10114.field1552 = arg0;
      this.field10114.field1590 = 10;
      int var2 = this.field10114.method1038((byte)-100);
      this.field10121 = this.field10114.method1038((byte)-112);
      this.field10117 = 500000;
      this.field10116 = new int[var2];
      int var3 = 0;

      while(var3 < var2) {
         int var5 = this.field10114.method1041(4758);
         int var6 = this.field10114.method1041(4758);
         if (var5 == 1297379947) {
            this.field10116[var3] = this.field10114.field1590;
            ++var3;
         }

         this.field10114.field1590 += var6;
      }

      this.field10118 = 0L;
      this.field10120 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         this.field10120[var4] = this.field10116[var4];
      }

      this.field10122 = new int[var2];
      this.field10119 = new int[var2];
   }

   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "(I)I"
   )
   private final int method4915(int arg0) {
      byte var2 = this.field10114.field1552[this.field10114.field1590];
      int var3;
      if (var2 < 0) {
         var3 = var2 & 255;
         this.field10119[arg0] = var3;
         ++this.field10114.field1590;
      } else {
         var3 = this.field10119[arg0];
      }

      if (var3 != 240 && var3 != 247) {
         return this.method4906(arg0, var3);
      } else {
         int var4 = this.field10114.method1065(false);
         if (var3 == 247 && var4 > 0) {
            int var5 = this.field10114.field1552[this.field10114.field1590] & 255;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
               ++this.field10114.field1590;
               this.field10119[arg0] = var5;
               return this.method4906(arg0, var5);
            }
         }

         this.field10114.field1590 += var4;
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "()V"
   )
   public class673() {
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class673(byte[] arg0) {
      this.method4914(arg0);
   }
}
