import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!l")
public class class26 extends class9 {
   @OriginalMember(
      owner = "loginapplet!l",
      name = "d",
      descriptor = "I"
   )
   private int field176;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "e",
      descriptor = "I"
   )
   private int field177;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "f",
      descriptor = "J"
   )
   private long field178;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "g",
      descriptor = "I"
   )
   public static volatile int field179 = -1;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "h",
      descriptor = "I"
   )
   private int field180;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "i",
      descriptor = "Laa;"
   )
   public static class2 field181;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "j",
      descriptor = "I"
   )
   private int field182;
   @OriginalMember(
      owner = "loginapplet!l",
      name = "k",
      descriptor = "[J"
   )
   private long[] field183 = new long[10];

   @OriginalMember(
      owner = "loginapplet!l",
      name = "a",
      descriptor = "(II)I",
      line = 12
   )
   public static int method127(int arg0, int arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "l.A(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!l",
      name = "a",
      descriptor = "(III)I",
      line = 33
   )
   public final int method36(int arg0, int arg1, int arg2) {
      try {
         int var4 = this.field177;
         this.field177 = 300;
         int var5 = this.field182;
         this.field182 = 1;
         this.field178 = class42.method212(true);
         if (this.field183[this.field180] != 0L) {
            if (~this.field178 < ~this.field183[this.field180]) {
               this.field177 = (int)((long)(2560 * arg2) / (-this.field183[this.field180] + this.field178));
            }
         } else {
            this.field182 = var5;
            this.field177 = var4;
         }

         if (25 > this.field177) {
            this.field177 = 25;
         }

         if (this.field177 > 256) {
            this.field177 = 256;
            this.field182 = (int)(-((this.field178 + -this.field183[this.field180]) / 10L) + (long)arg2);
         }

         if (this.field182 > arg2) {
            this.field182 = arg2;
         }

         this.field183[this.field180] = this.field178;
         this.field180 = (this.field180 - -1) % 10;
         int var6;
         if (-2 > ~this.field182) {
            for(var6 = 0; var6 < 10; ++var6) {
               if (this.field183[var6] != 0L) {
                  this.field183[var6] += (long)this.field182;
               }
            }
         }

         var6 = arg0;
         if (~this.field182 > ~arg1) {
            this.field182 = arg1;
         }

         class37.method177((long)this.field182, false);

         while(this.field176 < 256) {
            ++var6;
            this.field176 += this.field177;
         }

         this.field176 &= 255;
         return var6;
      } catch (RuntimeException var7) {
         throw class28.method139(var7, "l.C(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!l",
      name = "a",
      descriptor = "(Z)V",
      line = 108
   )
   public static void method128(boolean arg0) {
      try {
         field181 = null;
         if (arg0) {
            field179 = 83;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "l.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!l",
      name = "<init>",
      descriptor = "()V",
      line = 131
   )
   public class26() {
      try {
         this.field176 = 0;
         this.field177 = 256;
         this.field182 = 1;
         this.field178 = class42.method212(true);

         for(int var1 = 0; var1 < 10; ++var1) {
            this.field183[var1] = this.field178;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "l.<init>()");
      }
   }
}
