import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class656 implements Runnable {
   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "[Lue;"
   )
   private class243[] field9789 = new class243[8];
   @OriginalMember(
      owner = "client!jca",
      name = "i",
      descriptor = "[I"
   )
   private int[] field9792 = new int[3];
   @OriginalMember(
      owner = "client!jca",
      name = "g",
      descriptor = "Z"
   )
   private volatile boolean field9787 = true;
   @OriginalMember(
      owner = "client!jca",
      name = "d",
      descriptor = "Z"
   )
   private volatile boolean field9790 = true;
   @OriginalMember(
      owner = "client!jca",
      name = "h",
      descriptor = "Z"
   )
   private volatile boolean field9788 = false;
   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "I"
   )
   private int field9793;
   @OriginalMember(
      owner = "client!jca",
      name = "c",
      descriptor = "Lha;"
   )
   private class479 field9794;
   @OriginalMember(
      owner = "client!jca",
      name = "e",
      descriptor = "J"
   )
   private long field9786;
   @OriginalMember(
      owner = "client!jca",
      name = "f",
      descriptor = "Lef;"
   )
   private class204 field9791;

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "(Lef;)V"
   )
   public final void method4812(class204 arg0) {
      if (this.field9791 != null) {
         this.field9791.method1686((class656)null, 65280);
      }

      this.field9791 = arg0;
      if (this.field9791 != null) {
         this.field9791.method1686(this, 65280);
      }

   }

   @OriginalMember(
      owner = "client!jca",
      name = "f",
      descriptor = "()V"
   )
   private final void method4813() {
      this.field9794.method394(this.field9793);

      while(!this.field9787 && this.field9790) {
         if (this.field9791 != null && !this.field9791.method1689(true)) {
            this.field9788 = true;
            class82 var1 = this.field9791.method1688((byte)-124);
            if (var1 instanceof class713) {
               class713 var2 = (class713)var1;
               if (var2.field10458) {
                  var2.method174(true, class158.field2032);
               } else {
                  class782.method5644(var2, this.field9789);
                  if (class519.field7302 != null) {
                     class519.field7302.method3433(this.field9791.field2597, var2.field10464, 15, -16777216, var2.field10465, -256);
                  }
               }
            } else {
               int var3 = ((class25)var1).field387;
               if (var3 >= 1 && var3 <= 4) {
                  class423 var4 = class659.field9815[var3 - 1];

                  for(int var5 = 0; var5 < class106.field1403 + class106.field1403; ++var5) {
                     for(int var6 = 0; var6 < class106.field1403 + class106.field1403; ++var6) {
                        if (class372.field5217[var3 - 1][var5][var6]) {
                           int var7 = class699.field10231 - class106.field1403 + var5;
                           int var8 = class664.field9833 - class106.field1403 + var6;
                           if (var7 >= 0 && var7 < var4.field5769 && var8 >= 0 && var8 < var4.field5767) {
                              class158.field2032.method452(var7 << class783.field11447, var4.method3284(-1, var7, var8), var8 << class783.field11447, this.field9792);
                              if (class49.method363(this.field9792[0]) == this.field9793 - 1) {
                                 var4.method956(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field9788 = false;
            this.field9786 = class575.field8534.method3269(false);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field9794.method429(this.field9793);

      while(this.field9787 && this.field9790) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!jca",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method4814() {
      return this.field9791 == null || !this.field9788 && this.field9791.method1689(true);
   }

   @OriginalMember(
      owner = "client!jca",
      name = "d",
      descriptor = "()J"
   )
   public final long method4815() {
      return this.field9786;
   }

   @OriginalMember(
      owner = "client!jca",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(this.field9790) {
         this.method4813();
      }

   }

   @OriginalMember(
      owner = "client!jca",
      name = "c",
      descriptor = "()V"
   )
   public final void method4816() {
      this.field9787 = true;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "a",
      descriptor = "()V"
   )
   public final void method4817() {
      this.field9787 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "e",
      descriptor = "()V"
   )
   public final void method4818() {
      this.field9787 = false;
      this.field9790 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!jca",
      name = "<init>",
      descriptor = "(ILha;)V"
   )
   public class656(int arg0, class479 arg1) {
      this.field9793 = arg0;
      this.field9794 = arg1;
   }
}
