import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class271 implements Runnable {
   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "[I"
   )
   private int[] field3847 = new int[3];
   @OriginalMember(
      owner = "client!uk",
      name = "h",
      descriptor = "Z"
   )
   private volatile boolean field3843 = true;
   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "[Lke;"
   )
   private class622[] field3844 = new class622[8];
   @OriginalMember(
      owner = "client!uk",
      name = "e",
      descriptor = "Z"
   )
   private volatile boolean field3842 = true;
   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "Z"
   )
   private volatile boolean field3841 = false;
   @OriginalMember(
      owner = "client!uk",
      name = "f",
      descriptor = "I"
   )
   private int field3845;
   @OriginalMember(
      owner = "client!uk",
      name = "g",
      descriptor = "Lha;"
   )
   private class65 field3848;
   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "J"
   )
   private long field3840;
   @OriginalMember(
      owner = "client!uk",
      name = "i",
      descriptor = "Lsaa;"
   )
   private class344 field3846;

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "()V"
   )
   public final void method2140() {
      this.field3843 = false;
      this.field3842 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method2141() {
      return this.field3846 == null || !this.field3841 && this.field3846.method2659((byte)59);
   }

   @OriginalMember(
      owner = "client!uk",
      name = "a",
      descriptor = "(Lsaa;)V"
   )
   public final void method2142(class344 arg0) {
      if (this.field3846 != null) {
         this.field3846.method2658((byte)-121, (class271)null);
      }

      this.field3846 = arg0;
      if (this.field3846 != null) {
         this.field3846.method2658((byte)115, this);
      }

   }

   @OriginalMember(
      owner = "client!uk",
      name = "d",
      descriptor = "()J"
   )
   public final long method2143() {
      return this.field3840;
   }

   @OriginalMember(
      owner = "client!uk",
      name = "f",
      descriptor = "()V"
   )
   private final void method2144() {
      this.field3848.method391(this.field3845);

      while(!this.field3843 && this.field3842) {
         if (this.field3846 != null && !this.field3846.method2659((byte)-85)) {
            this.field3841 = true;
            class246 var1 = this.field3846.method2664((byte)82);
            if (var1 instanceof class294) {
               class294 var2 = (class294)var1;
               if (var2.field4092) {
                  var2.method598(true, class49.field1047);
               } else {
                  class731.method5274(var2, this.field3844);
                  if (class543.field7869 != null) {
                     class543.field7869.method711(var2.field4089, -16777216, var2.field4098, 0, -256, this.field3846.field4904);
                  }
               }
            } else {
               int var3 = ((class169)var1).field2638;
               if (var3 >= 1 && var3 <= 4) {
                  class293 var4 = class269.field3810[var3 - 1];

                  for(int var5 = 0; var5 < class54.field1102 + class54.field1102; ++var5) {
                     for(int var6 = 0; var6 < class54.field1102 + class54.field1102; ++var6) {
                        if (class295.field4141[var3 - 1][var5][var6]) {
                           int var7 = class566.field8206 - class54.field1102 + var5;
                           int var8 = class115.field1864 - class54.field1102 + var6;
                           if (var7 >= 0 && var7 < var4.field4080 && var8 >= 0 && var8 < var4.field4077) {
                              class49.field1047.method367(var7 << class76.field1336, var4.method2289(var7, var8, (byte)124), var8 << class76.field1336, this.field3847);
                              if (class483.method3655(this.field3847[0]) == this.field3845 - 1) {
                                 var4.method2279(var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.field3841 = false;
            this.field3840 = class56.field1116.method803((byte)-121);
            synchronized(this) {
               try {
                  this.wait();
               } catch (InterruptedException var13) {
               }
            }
         }
      }

      this.field3848.method323(this.field3845);

      while(this.field3843 && this.field3842) {
         synchronized(this) {
            try {
               this.wait();
            } catch (InterruptedException var11) {
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!uk",
      name = "b",
      descriptor = "()V"
   )
   public final void method2145() {
      this.field3843 = true;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "c",
      descriptor = "()V"
   )
   public final void method2146() {
      this.field3843 = false;
      synchronized(this) {
         this.notify();
      }
   }

   @OriginalMember(
      owner = "client!uk",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(this.field3842) {
         this.method2144();
      }

   }

   @OriginalMember(
      owner = "client!uk",
      name = "<init>",
      descriptor = "(ILha;)V"
   )
   public class271(int arg0, class65 arg1) {
      this.field3845 = arg0;
      this.field3848 = arg1;
   }
}
