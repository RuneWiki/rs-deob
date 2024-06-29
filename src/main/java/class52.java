import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class52 extends class307 {
   @OriginalMember(
      owner = "client!nq",
      name = "n",
      descriptor = "Lsb;"
   )
   private class261 field772 = new class261();
   @OriginalMember(
      owner = "client!nq",
      name = "q",
      descriptor = "Lsb;"
   )
   private class261 field773 = new class261();
   @OriginalMember(
      owner = "client!nq",
      name = "p",
      descriptor = "I"
   )
   private int field774 = 0;
   @OriginalMember(
      owner = "client!nq",
      name = "o",
      descriptor = "I"
   )
   private int field775 = -1;

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(Lnj;)V"
   )
   public final synchronized void method557(class307 arg0) {
      arg0.method2140((byte)-74);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "()Lnj;"
   )
   public final class307 method558() {
      return (class307)this.field772.method2245((byte)-94);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "f",
      descriptor = "()V"
   )
   private final void method559() {
      if (this.field774 > 0) {
         for(class295 var1 = (class295)this.field773.method2245((byte)-94); var1 != null; var1 = (class295)this.field773.method2239((byte)102)) {
            var1.field4393 -= this.field774;
         }

         this.field775 -= this.field774;
         this.field774 = 0;
      }

   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method560(int arg0) {
      for(class307 var2 = (class307)this.field772.method2245((byte)-94); var2 != null; var2 = (class307)this.field772.method2239((byte)119)) {
         var2.method561(arg0);
      }

   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method561(int arg0) {
      do {
         if (this.field775 < 0) {
            this.method560(arg0);
            return;
         }

         if (this.field774 + arg0 < this.field775) {
            this.field774 += arg0;
            this.method560(arg0);
            return;
         }

         int var2 = this.field775 - this.field774;
         this.method560(var2);
         arg0 -= var2;
         this.field774 += var2;
         this.method559();
         class295 var3 = (class295)this.field773.method2245((byte)-94);
         synchronized(var3) {
            int var5 = var3.method2464(this);
            if (var5 < 0) {
               var3.field4393 = 0;
               this.method569(var3);
            } else {
               var3.field4393 = var5;
               this.method567(var3.field3781, var3);
            }
         }
      } while(arg0 != 0);

   }

   @OriginalMember(
      owner = "client!nq",
      name = "c",
      descriptor = "([III)V"
   )
   private final void method562(int[] arg0, int arg1, int arg2) {
      for(class307 var4 = (class307)this.field772.method2245((byte)-94); var4 != null; var4 = (class307)this.field772.method2239((byte)119)) {
         var4.method2523(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!nq",
      name = "d",
      descriptor = "()I"
   )
   public final int method563() {
      return 0;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method564(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field775 < 0) {
            this.method562(arg0, arg1, arg2);
            return;
         }

         if (this.field774 + arg2 < this.field775) {
            this.field774 += arg2;
            this.method562(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field775 - this.field774;
         this.method562(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field774 += var4;
         this.method559();
         class295 var5 = (class295)this.field773.method2245((byte)-94);
         synchronized(var5) {
            int var7 = var5.method2464(this);
            if (var7 < 0) {
               var5.field4393 = 0;
               this.method569(var5);
            } else {
               var5.field4393 = var7;
               this.method567(var5.field3781, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!nq",
      name = "e",
      descriptor = "()I"
   )
   public final synchronized int method565() {
      return this.field772.method2249(true);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "()Lnj;"
   )
   public final class307 method566() {
      return (class307)this.field772.method2239((byte)94);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Llba;Lmk;)V"
   )
   private final void method567(class247 arg0, class295 arg1) {
      while(this.field773.field4002 != arg0 && ((class295)arg0).field4393 <= arg1.field4393) {
         arg0 = arg0.field3781;
      }

      class598.method4381((byte)111, arg1, arg0);
      this.field775 = ((class295)this.field773.field4002.field3781).field4393;
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Lnj;)V"
   )
   public final synchronized void method568(class307 arg0) {
      this.field772.method2241(3, arg0);
   }

   @OriginalMember(
      owner = "client!nq",
      name = "a",
      descriptor = "(Lmk;)V"
   )
   private final void method569(class295 arg0) {
      arg0.method2140((byte)-74);
      arg0.method2463();
      class247 var2 = this.field773.field4002.field3781;
      if (this.field773.field4002 == var2) {
         this.field775 = -1;
      } else {
         this.field775 = ((class295)var2).field4393;
      }
   }
}
