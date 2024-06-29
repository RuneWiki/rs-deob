import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class775 extends class166 {
   @OriginalMember(
      owner = "client!wo",
      name = "n",
      descriptor = "Lum;"
   )
   private class550 field11337 = new class550();
   @OriginalMember(
      owner = "client!wo",
      name = "o",
      descriptor = "Lum;"
   )
   private class550 field11338 = new class550();
   @OriginalMember(
      owner = "client!wo",
      name = "p",
      descriptor = "I"
   )
   private int field11339 = -1;
   @OriginalMember(
      owner = "client!wo",
      name = "m",
      descriptor = "I"
   )
   private int field11340 = 0;

   @OriginalMember(
      owner = "client!wo",
      name = "d",
      descriptor = "()Lwea;",
      line = 4
   )
   public final class166 method176() {
      return (class166)this.field11337.method4059((byte)-96);
   }

   @OriginalMember(
      owner = "client!wo",
      name = "f",
      descriptor = "()I",
      line = 10
   )
   public final synchronized int method5582() {
      return this.field11337.method4072(false);
   }

   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "([III)V",
      line = 15
   )
   private final void method5583(int[] arg0, int arg1, int arg2) {
      for(class166 var4 = (class166)this.field11337.method4071((byte)126); var4 != null; var4 = (class166)this.field11337.method4059((byte)114)) {
         var4.method1347(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "([III)V",
      line = 29
   )
   public final synchronized void method187(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field11339 < 0) {
            this.method5583(arg0, arg1, arg2);
            return;
         }

         if (this.field11340 + arg2 < this.field11339) {
            this.field11340 += arg2;
            this.method5583(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field11339 - this.field11340;
         this.method5583(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field11340 += var4;
         this.method5587();
         class720 var5 = (class720)this.field11338.method4071((byte)127);
         synchronized(var5) {
            int var7 = var5.method5221(this);
            if (var7 < 0) {
               var5.field10727 = 0;
               this.method5584(var5);
            } else {
               var5.field10727 = var7;
               this.method5586(var5.field5278, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Lev;)V",
      line = 75
   )
   private final void method5584(class720 arg0) {
      arg0.method2720(0);
      arg0.method5220();
      class347 var2 = this.field11338.field8129.field5278;
      if (this.field11338.field8129 == var2) {
         this.field11339 = -1;
      } else {
         this.field11339 = ((class720)var2).field10727;
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(I)V",
      line = 92
   )
   public final synchronized void method179(int arg0) {
      do {
         if (this.field11339 < 0) {
            this.method5588(arg0);
            return;
         }

         if (this.field11340 + arg0 < this.field11339) {
            this.field11340 += arg0;
            this.method5588(arg0);
            return;
         }

         int var2 = this.field11339 - this.field11340;
         this.method5588(var2);
         arg0 -= var2;
         this.field11340 += var2;
         this.method5587();
         class720 var3 = (class720)this.field11338.method4071((byte)127);
         synchronized(var3) {
            int var5 = var3.method5221(this);
            if (var5 < 0) {
               var3.field10727 = 0;
               this.method5584(var3);
            } else {
               var3.field10727 = var5;
               this.method5586(var3.field5278, var3);
            }
         }
      } while(arg0 != 0);

   }

   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "()Lwea;",
      line = 136
   )
   public final class166 method182() {
      return (class166)this.field11337.method4071((byte)127);
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Lwea;)V",
      line = 139
   )
   public final synchronized void method5585(class166 arg0) {
      arg0.method2720(0);
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Lwb;Lev;)V",
      line = 147
   )
   private final void method5586(class347 arg0, class720 arg1) {
      while(this.field11338.field8129 != arg0 && ((class720)arg0).field10727 <= arg1.field10727) {
         arg0 = arg0.field5278;
      }

      class709.method5141(arg0, arg1, 2);
      this.field11339 = ((class720)this.field11338.field8129.field5278).field10727;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "e",
      descriptor = "()V",
      line = 154
   )
   private final void method5587() {
      if (this.field11340 > 0) {
         for(class720 var1 = (class720)this.field11338.method4071((byte)127); var1 != null; var1 = (class720)this.field11338.method4059((byte)126)) {
            var1.field10727 -= this.field11340;
         }

         this.field11339 -= this.field11340;
         this.field11340 = 0;
      }

   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "()I",
      line = 173
   )
   public final int method184() {
      return 0;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(I)V",
      line = 181
   )
   private final void method5588(int arg0) {
      for(class166 var2 = (class166)this.field11337.method4071((byte)127); var2 != null; var2 = (class166)this.field11337.method4059((byte)108)) {
         var2.method179(arg0);
      }

   }

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(Lwea;)V",
      line = 198
   )
   public final synchronized void method5589(class166 arg0) {
      this.field11337.method4070(arg0, (byte)50);
   }
}
