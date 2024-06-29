import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class181 extends class142 {
   @OriginalMember(
      owner = "client!tca",
      name = "q",
      descriptor = "Liw;"
   )
   private class332 field2781 = new class332();
   @OriginalMember(
      owner = "client!tca",
      name = "p",
      descriptor = "Liw;"
   )
   private class332 field2782 = new class332();
   @OriginalMember(
      owner = "client!tca",
      name = "o",
      descriptor = "I"
   )
   private int field2783 = -1;
   @OriginalMember(
      owner = "client!tca",
      name = "n",
      descriptor = "I"
   )
   private int field2784 = 0;

   @OriginalMember(
      owner = "client!tca",
      name = "c",
      descriptor = "([III)V",
      line = 9
   )
   private final void method1602(int[] arg0, int arg1, int arg2) {
      for(class142 var4 = (class142)this.field2781.method2579(-801); var4 != null; var4 = (class142)this.field2781.method2583(1)) {
         var4.method1356(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "(Lhu;)V",
      line = 20
   )
   public final synchronized void method1603(class142 arg0) {
      this.field2781.method2578(-26, arg0);
   }

   @OriginalMember(
      owner = "client!tca",
      name = "d",
      descriptor = "()Lhu;",
      line = 25
   )
   public final class142 method87() {
      return (class142)this.field2781.method2583(1);
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Lub;Lvr;)V",
      line = 30
   )
   private final void method1604(class22 arg0, class146 arg1) {
      while(this.field2782.field4749 != arg0 && ((class146)arg0).field2378 <= arg1.field2378) {
         arg0 = arg0.field346;
      }

      class479.method3622(arg0, arg1, (byte)-112);
      this.field2783 = ((class146)this.field2782.field4749.field346).field2378;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Lvr;)V",
      line = 37
   )
   private final void method1605(class146 arg0) {
      arg0.method154(58);
      arg0.method1377();
      class22 var2 = this.field2782.field4749.field346;
      if (this.field2782.field4749 == var2) {
         this.field2783 = -1;
      } else {
         this.field2783 = ((class146)var2).field2378;
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "([III)V",
      line = 54
   )
   public final synchronized void method85(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field2783 < 0) {
            this.method1602(arg0, arg1, arg2);
            return;
         }

         if (this.field2784 + arg2 < this.field2783) {
            this.field2784 += arg2;
            this.method1602(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field2783 - this.field2784;
         this.method1602(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field2784 += var4;
         this.method1608();
         class146 var5 = (class146)this.field2782.method2579(-801);
         synchronized(var5) {
            int var7 = var5.method1378(this);
            if (var7 < 0) {
               var5.field2378 = 0;
               this.method1605(var5);
            } else {
               var5.field2378 = var7;
               this.method1604(var5.field346, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "()Lhu;",
      line = 98
   )
   public final class142 method90() {
      return (class142)this.field2781.method2579(-801);
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(Lhu;)V",
      line = 101
   )
   public final synchronized void method1606(class142 arg0) {
      arg0.method154(-117);
   }

   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "(I)V",
      line = 108
   )
   private final void method1607(int arg0) {
      for(class142 var2 = (class142)this.field2781.method2579(-801); var2 != null; var2 = (class142)this.field2781.method2583(1)) {
         var2.method86(arg0);
      }

   }

   @OriginalMember(
      owner = "client!tca",
      name = "f",
      descriptor = "()V",
      line = 117
   )
   private final void method1608() {
      if (this.field2784 > 0) {
         for(class146 var1 = (class146)this.field2782.method2579(-801); var1 != null; var1 = (class146)this.field2782.method2583(1)) {
            var1.field2378 -= this.field2784;
         }

         this.field2783 -= this.field2784;
         this.field2784 = 0;
      }

   }

   @OriginalMember(
      owner = "client!tca",
      name = "c",
      descriptor = "()I",
      line = 140
   )
   public final int method88() {
      return 0;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(I)V",
      line = 149
   )
   public final synchronized void method86(int arg0) {
      do {
         if (this.field2783 < 0) {
            this.method1607(arg0);
            return;
         }

         if (this.field2784 + arg0 < this.field2783) {
            this.field2784 += arg0;
            this.method1607(arg0);
            return;
         }

         int var2 = this.field2783 - this.field2784;
         this.method1607(var2);
         arg0 -= var2;
         this.field2784 += var2;
         this.method1608();
         class146 var3 = (class146)this.field2782.method2579(-801);
         synchronized(var3) {
            int var5 = var3.method1378(this);
            if (var5 < 0) {
               var3.field2378 = 0;
               this.method1605(var3);
            } else {
               var3.field2378 = var5;
               this.method1604(var3.field346, var3);
            }
         }
      } while(arg0 != 0);

   }

   @OriginalMember(
      owner = "client!tca",
      name = "e",
      descriptor = "()I",
      line = 193
   )
   public final synchronized int method1609() {
      return this.field2781.method2575(-103);
   }
}
