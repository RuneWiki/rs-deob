import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class453 implements Runnable {
   @OriginalMember(
      owner = "client!ifa",
      name = "c",
      descriptor = "Z"
   )
   private volatile boolean field6231 = true;
   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "[I"
   )
   private int[] field6235 = new int[3];
   @OriginalMember(
      owner = "client!ifa",
      name = "f",
      descriptor = "Z"
   )
   private volatile boolean field6237 = true;
   @OriginalMember(
      owner = "client!ifa",
      name = "d",
      descriptor = "[Loda;"
   )
   private class127[] field6233 = new class127[8];
   @OriginalMember(
      owner = "client!ifa",
      name = "b",
      descriptor = "Z"
   )
   private volatile boolean field6232 = false;
   @OriginalMember(
      owner = "client!ifa",
      name = "h",
      descriptor = "I"
   )
   private int field6236;
   @OriginalMember(
      owner = "client!ifa",
      name = "i",
      descriptor = "Lha;"
   )
   private class65 field6234;
   @OriginalMember(
      owner = "client!ifa",
      name = "g",
      descriptor = "J"
   )
   private long field6230;
   @OriginalMember(
      owner = "client!ifa",
      name = "e",
      descriptor = "Lnk;"
   )
   private class750 field6229;

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "()V"
   )
   private final void method3340() {
      this.field6234.method580(this.field6236);

      while(!this.field6231 && this.field6237) {
         if (this.field6229 != null && !this.field6229.method5422(0)) {
            this.field6232 = true;
            class770 var1 = this.field6229.method5418(0);
            if (var1 instanceof class80) {
               class80 var2 = (class80)var1;
               if (var2.field997) {
                  var2.method776((byte)36, class292.field3851);
               } else {
                  class349.method2756(var2, this.field6233);
                  if (class520.field7122 != null) {
                     class520.field7122.method630(-256, var2.field994, this.field6229.field10905, -16777216, var2.field1006, 16656);
                  }
               }
            } else {
               int var3 = ((class614)var1).field8581;
               if (var3 >= 1 && var3 <= 4) {
                  class295 var4 = class93.field1241[var3 - 1];

                  for(int var5 = 0; var5 < class224.field2812 + class224.field2812; ++var5) {
                     for(int var6 = 0; var6 < class224.field2812 + class224.field2812; ++var6) {
                        if (class505.field6922[var3 - 1][var5][var6]) {
                           int var7 = class367.field5174 - class224.field2812 + var5;
                           int var8 = class406.field5720 - class224.field2812 + var6;
                           if (var7 >= 0 && var7 < var4.field3873 && var8 >= 0 && var8 < var4.field3871) {
                              class292.field3851.method568(var7 << class76.field965, var4.method2221(false, var8, var7), var8 << class76.field965, this.field6235);
                              if (class340.method2695(this.field6235[0]) == this.field6236 - 1) {
                                 var4.method1671(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field6232 = false;
            this.field6230 = class573.field7893.method978(10766);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field6234.method529(this.field6236);

      while(this.field6231 && this.field6237) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!ifa",
      name = "c",
      descriptor = "()V"
   )
   public final void method3341() {
      this.field6231 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "f",
      descriptor = "()V"
   )
   public final void method3342() {
      this.field6231 = true;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(this.field6237) {
         this.method3340();
      }

   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Lnk;)V"
   )
   public final void method3343(class750 arg0) {
      if (this.field6229 != null) {
         this.field6229.method5423((byte)96, (class453)null);
      }

      this.field6229 = arg0;
      if (this.field6229 != null) {
         this.field6229.method5423((byte)-21, this);
      }

   }

   @OriginalMember(
      owner = "client!ifa",
      name = "e",
      descriptor = "()J"
   )
   public final long method3344() {
      return this.field6230;
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method3345() {
      return this.field6229 == null || !this.field6232 && this.field6229.method5422(0);
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "d",
      descriptor = "()V"
   )
   public final void method3346() {
      this.field6231 = false;
      this.field6237 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "<init>",
      descriptor = "(ILha;)V"
   )
   public class453(int arg0, class65 arg1) {
      this.field6236 = arg0;
      this.field6234 = arg1;
   }
}
