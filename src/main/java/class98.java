import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class98 implements Runnable {
   @OriginalMember(
      owner = "client!hr",
      name = "f",
      descriptor = "[Lpha;"
   )
   private class757[] field1567 = new class757[8];
   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "Z"
   )
   private volatile boolean field1572 = true;
   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "Z"
   )
   private volatile boolean field1568 = true;
   @OriginalMember(
      owner = "client!hr",
      name = "h",
      descriptor = "Z"
   )
   private volatile boolean field1569 = false;
   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "[I"
   )
   private int[] field1574 = new int[3];
   @OriginalMember(
      owner = "client!hr",
      name = "i",
      descriptor = "I"
   )
   private int field1573;
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "Lha;"
   )
   private class17 field1570;
   @OriginalMember(
      owner = "client!hr",
      name = "g",
      descriptor = "J"
   )
   private long field1566;
   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "Ljh;"
   )
   private class697 field1571;

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "()J"
   )
   public final long method972() {
      return this.field1566;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method973() {
      return this.field1571 == null || !this.field1569 && this.field1571.method5100(107);
   }

   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "()V"
   )
   public final void method974() {
      this.field1572 = false;
      this.field1568 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(this.field1568) {
         this.method977();
      }

   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(Ljh;)V"
   )
   public final void method975(class697 arg0) {
      if (this.field1571 != null) {
         this.field1571.method5098(173, (class98)null);
      }

      this.field1571 = arg0;
      if (this.field1571 != null) {
         this.field1571.method5098(173, this);
      }

   }

   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "()V"
   )
   public final void method976() {
      this.field1572 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "()V"
   )
   private final void method977() {
      this.field1570.method174(this.field1573);

      while(!this.field1572 && this.field1568) {
         if (this.field1571 != null && !this.field1571.method5100(60)) {
            this.field1569 = true;
            class686 var1 = this.field1571.method5103(0);
            if (var1 instanceof class471) {
               class471 var2 = (class471)var1;
               if (var2.field6827) {
                  var2.method726(class720.field10315, (byte)-23);
               } else {
                  class479.method3663(var2, this.field1567);
                  if (class319.field4764 != null) {
                     class319.field4764.method1860(var2.field6825, false, var2.field6830, -16777216, -256, this.field1571.field10060);
                  }
               }
            } else {
               int var3 = ((class555)var1).field7888;
               if (var3 >= 1 && var3 <= 4) {
                  class751 var4 = class225.field3197[var3 - 1];

                  for(int var5 = 0; var5 < class15.field214 + class15.field214; ++var5) {
                     for(int var6 = 0; var6 < class15.field214 + class15.field214; ++var6) {
                        if (class279.field4226[var3 - 1][var5][var6]) {
                           int var7 = class507.field7207 - class15.field214 + var5;
                           int var8 = class477.field6876 - class15.field214 + var6;
                           if (var7 >= 0 && var7 < var4.field10665 && var8 >= 0 && var8 < var4.field10666) {
                              class720.field10315.method248(var7 << class313.field4707, var4.method5400(-1, var8, var7), var8 << class313.field4707, this.field1574);
                              if (class755.method5456(this.field1574[0]) == this.field1573 - 1) {
                                 var4.method50(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field1569 = false;
            this.field1566 = class344.field5072.method888(-26038);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field1570.method175(this.field1573);

      while(this.field1572 && this.field1568) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!hr",
      name = "f",
      descriptor = "()V"
   )
   public final void method978() {
      this.field1572 = true;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "(ILha;)V"
   )
   public class98(int arg0, class17 arg1) {
      this.field1573 = arg0;
      this.field1570 = arg1;
   }
}
