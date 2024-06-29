import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class647 extends class188 {
   @OriginalMember(
      owner = "client!kja",
      name = "q",
      descriptor = "Lsn;"
   )
   private class675 field9328 = new class675();
   @OriginalMember(
      owner = "client!kja",
      name = "t",
      descriptor = "Lsn;"
   )
   private class675 field9329 = new class675();
   @OriginalMember(
      owner = "client!kja",
      name = "r",
      descriptor = "I"
   )
   private int field9330 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "s",
      descriptor = "I"
   )
   private int field9331 = -1;

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Lbn;)V"
   )
   public final synchronized void method4699(class188 arg0) {
      this.field9328.method4983(-17121, arg0);
   }

   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "()I"
   )
   public final int method372() {
      return 0;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "e",
      descriptor = "()I"
   )
   public final synchronized int method4700() {
      return this.field9328.method4971(-126);
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Loh;)V"
   )
   private final void method4701(class340 arg0) {
      arg0.method2477(1976);
      arg0.method2760();
      class294 var2 = this.field9329.field10053.field4656;
      if (this.field9329.field10053 == var2) {
         this.field9331 = -1;
      } else {
         this.field9331 = ((class340)var2).field5189;
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method383(int arg0) {
      do {
         if (this.field9331 < 0) {
            this.method4703(arg0);
            return;
         }

         if (this.field9330 + arg0 < this.field9331) {
            this.field9330 += arg0;
            this.method4703(arg0);
            return;
         }

         int var2 = this.field9331 - this.field9330;
         this.method4703(var2);
         arg0 -= var2;
         this.field9330 += var2;
         this.method4702();
         class340 var3 = (class340)this.field9329.method4972((byte)-84);
         synchronized(var3) {
            int var5 = var3.method2759(this);
            if (var5 < 0) {
               var3.field5189 = 0;
               this.method4701(var3);
            } else {
               var3.field5189 = var5;
               this.method4705(var3.field4656, var3);
            }
         }
      } while(arg0 != 0);

   }

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "()Lbn;"
   )
   public final class188 method375() {
      return (class188)this.field9328.method4975((byte)107);
   }

   @OriginalMember(
      owner = "client!kja",
      name = "f",
      descriptor = "()V"
   )
   private final void method4702() {
      if (this.field9330 > 0) {
         for(class340 var1 = (class340)this.field9329.method4972((byte)-84); var1 != null; var1 = (class340)this.field9329.method4975((byte)94)) {
            var1.field5189 -= this.field9330;
         }

         this.field9331 -= this.field9330;
         this.field9330 = 0;
      }

   }

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method4703(int arg0) {
      for(class188 var2 = (class188)this.field9328.method4972((byte)-84); var2 != null; var2 = (class188)this.field9328.method4975((byte)96)) {
         var2.method383(arg0);
      }

   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "([III)V"
   )
   public final synchronized void method391(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field9331 < 0) {
            this.method4706(arg0, arg1, arg2);
            return;
         }

         if (this.field9330 + arg2 < this.field9331) {
            this.field9330 += arg2;
            this.method4706(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field9331 - this.field9330;
         this.method4706(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field9330 += var4;
         this.method4702();
         class340 var5 = (class340)this.field9329.method4972((byte)-84);
         synchronized(var5) {
            int var7 = var5.method2759(this);
            if (var7 < 0) {
               var5.field5189 = 0;
               this.method4701(var5);
            } else {
               var5.field5189 = var7;
               this.method4705(var5.field4656, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "(Lbn;)V"
   )
   public final synchronized void method4704(class188 arg0) {
      arg0.method2477(1976);
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Lhe;Loh;)V"
   )
   private final void method4705(class294 arg0, class340 arg1) {
      while(this.field9329.field10053 != arg0 && ((class340)arg0).field5189 <= arg1.field5189) {
         arg0 = arg0.field4656;
      }

      class437.method3435(arg0, arg1, (byte)87);
      this.field9331 = ((class340)this.field9329.field10053.field4656).field5189;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "([III)V"
   )
   private final void method4706(int[] arg0, int arg1, int arg2) {
      for(class188 var4 = (class188)this.field9328.method4972((byte)-84); var4 != null; var4 = (class188)this.field9328.method4975((byte)127)) {
         var4.method1686(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "()Lbn;"
   )
   public final class188 method394() {
      return (class188)this.field9328.method4972((byte)-84);
   }
}
