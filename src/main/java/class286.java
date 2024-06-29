import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class286 extends class268 {
   @OriginalMember(
      owner = "client!kg",
      name = "o",
      descriptor = "Lod;"
   )
   private class536 field3793 = new class536();
   @OriginalMember(
      owner = "client!kg",
      name = "n",
      descriptor = "Lod;"
   )
   private class536 field3794 = new class536();
   @OriginalMember(
      owner = "client!kg",
      name = "p",
      descriptor = "I"
   )
   private int field3795 = 0;
   @OriginalMember(
      owner = "client!kg",
      name = "q",
      descriptor = "I"
   )
   private int field3796 = -1;

   @OriginalMember(
      owner = "client!kg",
      name = "e",
      descriptor = "()V"
   )
   private final void method2168() {
      if (this.field3795 > 0) {
         for(class77 var1 = (class77)this.field3794.method3855(-83); var1 != null; var1 = (class77)this.field3794.method3866((byte)118)) {
            var1.field967 -= this.field3795;
         }

         this.field3796 -= this.field3795;
         this.field3795 = 0;
      }

   }

   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method669(int[] arg0, int arg1, int arg2) {
      do {
         if (this.field3796 < 0) {
            this.method2171(arg0, arg1, arg2);
            return;
         }

         if (this.field3795 + arg2 < this.field3796) {
            this.field3795 += arg2;
            this.method2171(arg0, arg1, arg2);
            return;
         }

         int var4 = this.field3796 - this.field3795;
         this.method2171(arg0, arg1, var4);
         arg1 += var4;
         arg2 -= var4;
         this.field3795 += var4;
         this.method2168();
         class77 var5 = (class77)this.field3794.method3855(-79);
         synchronized(var5) {
            int var7 = var5.method756(this);
            if (var7 < 0) {
               var5.field967 = 0;
               this.method2169(var5);
            } else {
               var5.field967 = var7;
               this.method2170(var5.field6867, var5);
            }
         }
      } while(arg2 != 0);

   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(Lpv;)V"
   )
   private final void method2169(class77 arg0) {
      arg0.method3609(123);
      arg0.method755();
      class500 var2 = this.field3794.field7319.field6867;
      if (this.field3794.field7319 == var2) {
         this.field3796 = -1;
      } else {
         this.field3796 = ((class77)var2).field967;
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(Lmaa;Lpv;)V"
   )
   private final void method2170(class500 arg0, class77 arg1) {
      while(this.field3794.field7319 != arg0 && ((class77)arg0).field967 <= arg1.field967) {
         arg0 = arg0.field6867;
      }

      class120.method1017(arg0, (byte)-97, arg1);
      this.field3796 = ((class77)this.field3794.field7319.field6867).field967;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "c",
      descriptor = "([III)V"
   )
   private final void method2171(int[] arg0, int arg1, int arg2) {
      for(class268 var4 = (class268)this.field3793.method3855(-104); var4 != null; var4 = (class268)this.field3793.method3866((byte)120)) {
         var4.method2057(arg0, arg1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method2172(int arg0) {
      for(class268 var2 = (class268)this.field3793.method3855(115); var2 != null; var2 = (class268)this.field3793.method3866((byte)126)) {
         var2.method684(arg0);
      }

   }

   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "(Lfga;)V"
   )
   public final synchronized void method2173(class268 arg0) {
      this.field3793.method3867(arg0, -3);
   }

   @OriginalMember(
      owner = "client!kg",
      name = "f",
      descriptor = "()I"
   )
   public final synchronized int method2174() {
      return this.field3793.method3857(117);
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(Lfga;)V"
   )
   public final synchronized void method2175(class268 arg0) {
      arg0.method3609(127);
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method684(int arg0) {
      do {
         if (this.field3796 < 0) {
            this.method2172(arg0);
            return;
         }

         if (this.field3795 + arg0 < this.field3796) {
            this.field3795 += arg0;
            this.method2172(arg0);
            return;
         }

         int var2 = this.field3796 - this.field3795;
         this.method2172(var2);
         arg0 -= var2;
         this.field3795 += var2;
         this.method2168();
         class77 var3 = (class77)this.field3794.method3855(126);
         synchronized(var3) {
            int var5 = var3.method756(this);
            if (var5 < 0) {
               var3.field967 = 0;
               this.method2169(var3);
            } else {
               var3.field967 = var5;
               this.method2170(var3.field6867, var3);
            }
         }
      } while(arg0 != 0);

   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "()Lfga;"
   )
   public final class268 method650() {
      return (class268)this.field3793.method3855(-65);
   }

   @OriginalMember(
      owner = "client!kg",
      name = "c",
      descriptor = "()I"
   )
   public final int method668() {
      return 0;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "()Lfga;"
   )
   public final class268 method649() {
      return (class268)this.field3793.method3866((byte)121);
   }
}
