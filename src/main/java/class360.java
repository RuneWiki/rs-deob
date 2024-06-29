import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class360 extends class330 {
   @OriginalMember(
      owner = "client!mk",
      name = "s",
      descriptor = "Lrca;"
   )
   private class37 field5016 = new class37();
   @OriginalMember(
      owner = "client!mk",
      name = "q",
      descriptor = "Lrca;"
   )
   private class37 field5017 = new class37();
   @OriginalMember(
      owner = "client!mk",
      name = "p",
      descriptor = "I"
   )
   private int field5018 = 0;
   @OriginalMember(
      owner = "client!mk",
      name = "r",
      descriptor = "I"
   )
   private int field5019 = -1;

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(Lmv;)V"
   )
   public final synchronized void method2839(class330 arg0) {
      this.field5016.method291(arg0, 79);
   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "()I"
   )
   public final int method1950() {
      return 0;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(Laga;)V"
   )
   private final void method2840(class675 arg0) {
      arg0.method4924(-2970);
      arg0.method4941();
      class673 var2 = this.field5017.field527.field9972;
      if (this.field5017.field527 == var2) {
         this.field5019 = -1;
      } else {
         this.field5019 = ((class675)var2).field9994;
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(Lcm;Laga;)V"
   )
   private final void method2841(class673 arg0, class675 arg1) {
      while(this.field5017.field527 != arg0 && ((class675)arg0).field9994 <= arg1.field9994) {
         arg0 = arg0.field9972;
      }

      class614.method4525(arg0, -51, arg1);
      this.field5019 = ((class675)this.field5017.field527.field9972).field9994;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "()Lmv;"
   )
   public final class330 method1949() {
      return (class330)this.field5016.method290(17958);
   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method2842(int arg0) {
      for(class330 var2 = (class330)this.field5016.method288(0); var2 != null; var2 = (class330)this.field5016.method290(17958)) {
         var2.method1959(arg0);
      }

   }

   @OriginalMember(
      owner = "client!mk",
      name = "f",
      descriptor = "()I"
   )
   public final synchronized int method2843() {
      return this.field5016.method286(true);
   }

   @OriginalMember(
      owner = "client!mk",
      name = "c",
      descriptor = "()Lmv;"
   )
   public final class330 method1961() {
      return (class330)this.field5016.method288(0);
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method1959(int arg0) {
      do {
         if (this.field5019 < 0) {
            this.method2842(arg0);
            return;
         }

         if (this.field5018 + arg0 < this.field5019) {
            this.field5018 += arg0;
            this.method2842(arg0);
            return;
         }

         int var2 = this.field5019 - this.field5018;
         this.method2842(var2);
         arg0 -= var2;
         this.field5018 += var2;
         this.method2846();
         class675 var3 = (class675)this.field5017.method288(0);
         synchronized(var3) {
            int var5 = var3.method4940(this);
            if (var5 < 0) {
               var3.field9994 = 0;
               this.method2840(var3);
            } else {
               var3.field9994 = var5;
               this.method2841(var3.field9972, var3);
            }
         }
      } while(arg0 != 0);

   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method1948(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field5019 < 0) {
            this.method2845(arg0, arg1, arg2);
            return;
         }

         if (this.field5018 + arg2 < this.field5019) {
            this.field5018 += arg2;
            this.method2845(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field5019 - this.field5018;
         this.method2845(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field5018 += var4;
         this.method2846();
         class675 var5 = (class675)this.field5017.method288(0);
         synchronized(var5) {
            int var7 = var5.method4940(this);
            if (var7 < 0) {
               var5.field9994 = 0;
               this.method2840(var5);
            } else {
               var5.field9994 = var7;
               this.method2841(var5.field9972, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "(Lmv;)V"
   )
   public final synchronized void method2844(class330 arg0) {
      arg0.method4924(-2970);
   }

   @OriginalMember(
      owner = "client!mk",
      name = "c",
      descriptor = "([III)V"
   )
   private final void method2845(int[] arg0, int arg1, int arg2) {
      for(class330 var4 = (class330)this.field5016.method288(0); var4 != null; var4 = (class330)this.field5016.method290(17958)) {
         var4.method2619(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!mk",
      name = "e",
      descriptor = "()V"
   )
   private final void method2846() {
      if (this.field5018 > 0) {
         for(class675 var1 = (class675)this.field5017.method288(0); var1 != null; var1 = (class675)this.field5017.method290(17958)) {
            var1.field9994 -= this.field5018;
         }

         this.field5019 -= this.field5018;
         this.field5018 = 0;
      }

   }
}
