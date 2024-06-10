import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ba")
public class class5 extends class9 {
   @OriginalMember(
      owner = "loginapplet!ba",
      name = "d",
      descriptor = "J"
   )
   private long field55;

   @OriginalMember(
      owner = "loginapplet!ba",
      name = "a",
      descriptor = "(III)I",
      line = 6
   )
   public final int method36(int arg0, int arg1, int arg2) {
      try {
         long var4 = 1000000L * (long)arg1;
         long var6 = this.field55 - System.nanoTime();
         if (~var6 > ~var4) {
            var6 = var4;
         }

         class37.method177(var6 / 1000000L, false);
         int var10 = arg0;
         long var8 = System.nanoTime();

         while(-11 < ~var10 && (~var10 > -2 || ~var8 < ~this.field55)) {
            ++var10;
            this.field55 += (long)arg2 * 1000000L;
         }

         if (var8 > this.field55) {
            this.field55 = var8;
         }

         return var10;
      } catch (RuntimeException var11) {
         throw var11;
      }
   }

   @OriginalMember(
      owner = "loginapplet!ba",
      name = "<init>",
      descriptor = "()V",
      line = 33
   )
   public class5() {
      try {
         this.field55 = System.nanoTime();
      } catch (RuntimeException var2) {
         throw var2;
      }
   }
}
