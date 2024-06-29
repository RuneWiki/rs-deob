import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class519 implements Runnable {
   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "[Lmn;"
   )
   private class389[] field7480 = new class389[8];
   @OriginalMember(
      owner = "client!np",
      name = "g",
      descriptor = "Z"
   )
   private volatile boolean field7482 = true;
   @OriginalMember(
      owner = "client!np",
      name = "e",
      descriptor = "[I"
   )
   private int[] field7484 = new int[3];
   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "Z"
   )
   private volatile boolean field7478 = true;
   @OriginalMember(
      owner = "client!np",
      name = "h",
      descriptor = "Z"
   )
   private volatile boolean field7486 = false;
   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "I"
   )
   private int field7479;
   @OriginalMember(
      owner = "client!np",
      name = "d",
      descriptor = "Lha;"
   )
   private class66 field7485;
   @OriginalMember(
      owner = "client!np",
      name = "f",
      descriptor = "J"
   )
   private long field7481;
   @OriginalMember(
      owner = "client!np",
      name = "i",
      descriptor = "Lqga;"
   )
   private class198 field7483;

   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "()J",
      line = 4
   )
   public final long method3769() {
      return this.field7481;
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(Lqga;)V",
      line = 7
   )
   public final void method3770(class198 arg0) {
      if (this.field7483 != null) {
         this.field7483.method1562(16401, (class519)null);
      }

      this.field7483 = arg0;
      if (this.field7483 != null) {
         this.field7483.method1562(16401, this);
      }

   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "()V",
      line = 16
   )
   public final void method3771() {
      this.field7482 = true;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "d",
      descriptor = "()V",
      line = 23
   )
   public final void method3772() {
      this.field7482 = false;
      this.field7478 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "run",
      descriptor = "()V",
      line = 30
   )
   public final void run() {
      while(this.field7478) {
         this.method3775();
      }

   }

   @OriginalMember(
      owner = "client!np",
      name = "f",
      descriptor = "()Z",
      line = 40
   )
   public final boolean method3773() {
      return this.field7483 == null || !this.field7486 && this.field7483.method1561(true);
   }

   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "()V",
      line = 43
   )
   public final void method3774() {
      this.field7482 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "<init>",
      descriptor = "(ILha;)V",
      line = 168
   )
   public class519(int arg0, class66 arg1) {
      this.field7479 = arg0;
      this.field7485 = arg1;
   }

   @OriginalMember(
      owner = "client!np",
      name = "e",
      descriptor = "()V",
      line = 53
   )
   private final void method3775() {
      this.field7485.method570(this.field7479);

      while(!this.field7482 && this.field7478) {
         if (this.field7483 != null && !this.field7483.method1561(true)) {
            this.field7486 = true;
            class3 var1 = this.field7483.method1564(29354);
            if (var1 instanceof class731) {
               class731 var2 = (class731)var1;
               if (var2.field10703) {
                  var2.method245(class80.field1038, false);
               } else {
                  class516.method3759(var2, this.field7480);
                  if (class607.field8908 != null) {
                     class607.field8908.method620(0, var2.field10692, -16777216, var2.field10699, -256, this.field7483.field2813);
                  }
               }
            } else {
               int var3 = ((class516)var1).field7449;
               if (var3 >= 1 && var3 <= 4) {
                  class295 var4 = class731.field10698[var3 - 1];

                  for(int var5 = 0; var5 < class106.field1335 + class106.field1335; ++var5) {
                     for(int var6 = 0; var6 < class106.field1335 + class106.field1335; ++var6) {
                        if (class637.field9318[var3 - 1][var5][var6]) {
                           int var7 = class712.field10385 - class106.field1335 + var5;
                           int var8 = class377.field5453 - class106.field1335 + var6;
                           if (var7 >= 0 && var7 < var4.field4071 && var8 >= 0 && var8 < var4.field4064) {
                              class80.field1038.method551(var7 << class773.field11359, var4.method2219(true, var7, var8), var8 << class773.field11359, this.field7484);
                              if (class662.method4833(this.field7484[0]) == this.field7479 - 1) {
                                 var4.method1617(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field7486 = false;
            this.field7481 = class456.field6489.method394(-16005);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field7485.method601(this.field7479);

      while(this.field7482 && this.field7478) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }
}
