import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class533 implements Runnable {
   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "Z"
   )
   private volatile boolean field8091 = true;
   @OriginalMember(
      owner = "client!rm",
      name = "e",
      descriptor = "Z"
   )
   private volatile boolean field8093 = true;
   @OriginalMember(
      owner = "client!rm",
      name = "d",
      descriptor = "Z"
   )
   private volatile boolean field8094 = false;
   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "[Llja;"
   )
   private class404[] field8095 = new class404[8];
   @OriginalMember(
      owner = "client!rm",
      name = "g",
      descriptor = "[I"
   )
   private int[] field8096 = new int[3];
   @OriginalMember(
      owner = "client!rm",
      name = "i",
      descriptor = "I"
   )
   private int field8098;
   @OriginalMember(
      owner = "client!rm",
      name = "f",
      descriptor = "Lha;"
   )
   private class610 field8097;
   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "J"
   )
   private long field8092;
   @OriginalMember(
      owner = "client!rm",
      name = "h",
      descriptor = "Lpk;"
   )
   private class451 field8090;

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Lpk;)V",
      line = 4
   )
   public final void method4100(class451 arg0) {
      if (this.field8090 != null) {
         this.field8090.method3537((byte)-32, (class533)null);
      }

      this.field8090 = arg0;
      if (this.field8090 != null) {
         this.field8090.method3537((byte)-32, this);
      }

   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "(ILha;)V",
      line = 165
   )
   public class533(int arg0, class610 arg1) {
      this.field8098 = arg0;
      this.field8097 = arg1;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "f",
      descriptor = "()V",
      line = 17
   )
   public final void method4101() {
      this.field8091 = false;
      this.field8093 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "()V",
      line = 29
   )
   public final void method4102() {
      this.field8091 = true;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "e",
      descriptor = "()V",
      line = 37
   )
   public final void method4103() {
      this.field8091 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "run",
      descriptor = "()V",
      line = 43
   )
   public final void run() {
      while(this.field8093) {
         this.method4104();
      }

   }

   @OriginalMember(
      owner = "client!rm",
      name = "d",
      descriptor = "()V",
      line = 60
   )
   private final void method4104() {
      this.field8097.method676(this.field8098);

      while(!this.field8091 && this.field8093) {
         if (this.field8090 != null && !this.field8090.method3541(false)) {
            this.field8094 = true;
            class391 var1 = this.field8090.method3540((byte)-108);
            if (var1 instanceof class109) {
               class109 var2 = (class109)var1;
               if (var2.field1511) {
                  var2.method49(class546.field8193, -16);
               } else {
                  class366.method2977(var2, this.field8095);
                  if (class451.field6894 != null) {
                     class451.field6894.method2414(var2.field1504, var2.field1507, this.field8090.field6900, true, -256, -16777216);
                  }
               }
            } else {
               int var3 = ((class27)var1).field330;
               if (var3 >= 1 && var3 <= 4) {
                  class271 var4 = class385.field6076[var3 - 1];

                  for(int var5 = 0; var5 < class382.field6038 + class382.field6038; ++var5) {
                     for(int var6 = 0; var6 < class382.field6038 + class382.field6038; ++var6) {
                        if (class392.field6153[var3 - 1][var5][var6]) {
                           int var7 = class487.field7409 - class382.field6038 + var5;
                           int var8 = class701.field10446 - class382.field6038 + var6;
                           if (var7 >= 0 && var7 < var4.field4383 && var8 >= 0 && var8 < var4.field4379) {
                              class546.field8193.method600(var7 << class394.field6180, var4.method2313(48, var7, var8), var8 << class394.field6180, this.field8096);
                              if (class303.method2538(this.field8096[0]) == this.field8098 - 1) {
                                 var4.method1121(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field8094 = false;
            this.field8092 = class754.field11176.method4639(-14239);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field8097.method645(this.field8098);

      while(this.field8091 && this.field8093) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "()J",
      line = 160
   )
   public final long method4105() {
      return this.field8092;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "()Z",
      line = 170
   )
   public final boolean method4106() {
      return this.field8090 == null || !this.field8094 && this.field8090.method3541(false);
   }
}
