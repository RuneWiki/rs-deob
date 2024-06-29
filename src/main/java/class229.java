import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class229 implements Runnable {
   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "Z"
   )
   private volatile boolean field2918 = true;
   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "[I"
   )
   private int[] field2922 = new int[3];
   @OriginalMember(
      owner = "client!cu",
      name = "i",
      descriptor = "Z"
   )
   private volatile boolean field2924 = true;
   @OriginalMember(
      owner = "client!cu",
      name = "e",
      descriptor = "Z"
   )
   private volatile boolean field2923 = false;
   @OriginalMember(
      owner = "client!cu",
      name = "d",
      descriptor = "[Llja;"
   )
   private class744[] field2926 = new class744[8];
   @OriginalMember(
      owner = "client!cu",
      name = "f",
      descriptor = "I"
   )
   private int field2920;
   @OriginalMember(
      owner = "client!cu",
      name = "h",
      descriptor = "Lha;"
   )
   private class66 field2919;
   @OriginalMember(
      owner = "client!cu",
      name = "c",
      descriptor = "J"
   )
   private long field2921;
   @OriginalMember(
      owner = "client!cu",
      name = "g",
      descriptor = "Laha;"
   )
   private class400 field2925;

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(Laha;)V",
      line = 3
   )
   public final void method1728(class400 arg0) {
      if (this.field2925 != null) {
         this.field2925.method3070(17243, (class229)null);
      }

      this.field2925 = arg0;
      if (this.field2925 != null) {
         this.field2925.method3070(17243, this);
      }

   }

   @OriginalMember(
      owner = "client!cu",
      name = "d",
      descriptor = "()J",
      line = 12
   )
   public final long method1729() {
      return this.field2921;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "<init>",
      descriptor = "(ILha;)V",
      line = 168
   )
   public class229(int arg0, class66 arg1) {
      this.field2920 = arg0;
      this.field2919 = arg1;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "f",
      descriptor = "()V",
      line = 21
   )
   public final void method1730() {
      this.field2918 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "()V",
      line = 29
   )
   public final void method1731() {
      this.field2918 = false;
      this.field2924 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "run",
      descriptor = "()V",
      line = 41
   )
   public final void run() {
      while(this.field2924) {
         this.method1732();
      }

   }

   @OriginalMember(
      owner = "client!cu",
      name = "e",
      descriptor = "()V",
      line = 50
   )
   private final void method1732() {
      this.field2919.method563(this.field2920);

      while(!this.field2918 && this.field2924) {
         if (this.field2925 != null && !this.field2925.method3069((byte)-19)) {
            this.field2923 = true;
            class604 var1 = this.field2925.method3072(0);
            if (var1 instanceof class616) {
               class616 var2 = (class616)var1;
               if (var2.field9008) {
                  var2.method4(class261.field3550, 50);
               } else {
                  class563.method4167(var2, this.field2926);
                  if (class634.field9238 != null) {
                     class634.field9238.method678(-256, var2.field9006, -16777216, this.field2925.field6147, var2.field9001, 0);
                  }
               }
            } else {
               int var3 = ((class63)var1).field777;
               if (var3 >= 1 && var3 <= 4) {
                  class293 var4 = class377.field5711[var3 - 1];

                  for(int var5 = 0; var5 < class488.field7212 + class488.field7212; ++var5) {
                     for(int var6 = 0; var6 < class488.field7212 + class488.field7212; ++var6) {
                        if (class243.field3107[var3 - 1][var5][var6]) {
                           int var7 = class681.field10228 - class488.field7212 + var5;
                           int var8 = class518.field7555 - class488.field7212 + var6;
                           if (var7 >= 0 && var7 < var4.field4087 && var8 >= 0 && var8 < var4.field4081) {
                              class261.field3550.method621(var7 << class459.field6950, var4.method2235(var8, 2116912585, var7), var8 << class459.field6950, this.field2922);
                              if (class92.method846(this.field2922[0]) == this.field2920 - 1) {
                                 var4.method790(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field2923 = false;
            this.field2921 = class314.field4489.method740(110);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field2919.method613(this.field2920);

      while(this.field2918 && this.field2924) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!cu",
      name = "c",
      descriptor = "()Z",
      line = 149
   )
   public final boolean method1733() {
      return this.field2925 == null || !this.field2923 && this.field2925.method3069((byte)-46);
   }

   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "()V",
      line = 160
   )
   public final void method1734() {
      this.field2918 = true;
      synchronized(this) {
         this.notify();
      }
   }
}
