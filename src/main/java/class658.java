import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class658 extends class593 {
   @OriginalMember(
      owner = "client!pda",
      name = "t",
      descriptor = "Lll;"
   )
   private class387 field9608 = new class387();
   @OriginalMember(
      owner = "client!pda",
      name = "r",
      descriptor = "Lll;"
   )
   private class387 field9609 = new class387();
   @OriginalMember(
      owner = "client!pda",
      name = "q",
      descriptor = "I"
   )
   private int field9610 = 0;
   @OriginalMember(
      owner = "client!pda",
      name = "s",
      descriptor = "I"
   )
   private int field9611 = -1;

   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "()Lkj;"
   )
   public final class593 method1603() {
      return (class593)this.field9608.method2933(2);
   }

   @OriginalMember(
      owner = "client!pda",
      name = "e",
      descriptor = "()V"
   )
   private final void method4810() {
      if (this.field9610 > 0) {
         for(class250 var1 = (class250)this.field9609.method2933(2); var1 != null; var1 = (class250)this.field9609.method2940(false)) {
            var1.field3434 -= this.field9610;
         }

         this.field9611 -= this.field9610;
         this.field9610 = 0;
      }

   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(Loh;Llf;)V"
   )
   private final void method4811(class428 arg0, class250 arg1) {
      while(this.field9609.field5611 != arg0 && ((class250)arg0).field3434 <= arg1.field3434) {
         arg0 = arg0.field6126;
      }

      class495.method3597(arg0, (byte)92, arg1);
      this.field9611 = ((class250)this.field9609.field5611.field6126).field3434;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "f",
      descriptor = "()I"
   )
   public final synchronized int method4812() {
      return this.field9608.method2939((byte)86);
   }

   @OriginalMember(
      owner = "client!pda",
      name = "c",
      descriptor = "([III)V"
   )
   private final void method4813(int[] arg0, int arg1, int arg2) {
      for(class593 var4 = (class593)this.field9608.method2933(2); var4 != null; var4 = (class593)this.field9608.method2940(false)) {
         var4.method4308(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "(Lkj;)V"
   )
   public final synchronized void method4814(class593 arg0) {
      this.field9608.method2932(-17488, arg0);
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "([III)V"
   )
   public final synchronized void method1607(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field9611 < 0) {
            this.method4813(arg0, arg1, arg2);
            return;
         }

         if (this.field9610 + arg2 < this.field9611) {
            this.field9610 += arg2;
            this.method4813(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field9611 - this.field9610;
         this.method4813(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field9610 += var4;
         this.method4810();
         class250 var5 = (class250)this.field9609.method2933(2);
         synchronized(var5) {
            int var7 = var5.method1925(this);
            if (var7 < 0) {
               var5.field3434 = 0;
               this.method4816(var5);
            } else {
               var5.field3434 = var7;
               this.method4811(var5.field6126, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!pda",
      name = "c",
      descriptor = "()Lkj;"
   )
   public final class593 method1605() {
      return (class593)this.field9608.method2940(false);
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(Lkj;)V"
   )
   public final synchronized void method4815(class593 arg0) {
      arg0.method3165(118);
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(Llf;)V"
   )
   private final void method4816(class250 arg0) {
      arg0.method3165(126);
      arg0.method1926();
      class428 var2 = this.field9609.field5611.field6126;
      if (this.field9609.field5611 == var2) {
         this.field9611 = -1;
      } else {
         this.field9611 = ((class250)var2).field3434;
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "()I"
   )
   public final int method1602() {
      return 0;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method4817(int arg0) {
      for(class593 var2 = (class593)this.field9608.method2933(2); var2 != null; var2 = (class593)this.field9608.method2940(false)) {
         var2.method1606(arg0);
      }

   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method1606(int arg0) {
      do {
         if (this.field9611 < 0) {
            this.method4817(arg0);
            return;
         }

         if (this.field9610 + arg0 < this.field9611) {
            this.field9610 += arg0;
            this.method4817(arg0);
            return;
         }

         int var2 = this.field9611 - this.field9610;
         this.method4817(var2);
         arg0 -= var2;
         this.field9610 += var2;
         this.method4810();
         class250 var3 = (class250)this.field9609.method2933(2);
         synchronized(var3) {
            int var5 = var3.method1925(this);
            if (var5 < 0) {
               var3.field3434 = 0;
               this.method4816(var3);
            } else {
               var3.field3434 = var5;
               this.method4811(var3.field6126, var3);
            }
         }
      } while(arg0 != 0);

   }
}
