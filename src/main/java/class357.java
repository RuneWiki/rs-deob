import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class357 extends class174 {
   @OriginalMember(
      owner = "client!nb",
      name = "f",
      descriptor = "J"
   )
   private long field4975 = 0L;
   @OriginalMember(
      owner = "client!nb",
      name = "g",
      descriptor = "J"
   )
   private long field4976 = 0L;
   @OriginalMember(
      owner = "client!nb",
      name = "h",
      descriptor = "J"
   )
   private long field4977 = 0L;
   @OriginalMember(
      owner = "client!nb",
      name = "i",
      descriptor = "I"
   )
   private int field4980 = 0;
   @OriginalMember(
      owner = "client!nb",
      name = "k",
      descriptor = "[J"
   )
   private long[] field4978 = new long[10];
   @OriginalMember(
      owner = "client!nb",
      name = "j",
      descriptor = "I"
   )
   private int field4979 = 1;

   @OriginalMember(
      owner = "client!nb",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method238(byte arg0) {
      if (arg0 != -99) {
         this.method236((byte)-86);
      }

      this.field4975 += this.method2830(1);
      return this.field4975 < this.field4976 ? (-this.field4975 + this.field4976) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "d",
      descriptor = "(B)J"
   )
   public final long method237(byte arg0) {
      int var2 = -109 % ((arg0 - -55) / 56);
      return this.field4975;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(I)J"
   )
   private final long method2830(int arg0) {
      long var2 = System.nanoTime();
      long var4 = var2 - this.field4977;
      this.field4977 = var2;
      if (var4 > -5000000000L && var4 < 5000000000L) {
         this.field4978[this.field4980] = var4;
         this.field4980 = (this.field4980 + 1) % 10;
         if (-2 < ~this.field4979) {
            ++this.field4979;
         }
      }

      long var6 = 0L;

      for(int var8 = arg0; var8 <= this.field4979; ++var8) {
         var6 += this.field4978[(this.field4980 + 10 - var8) % 10];
      }

      return var6 / (long)this.field4979;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method236(byte arg0) {
      if (arg0 > 113) {
         this.field4977 = 0L;
         if (this.field4975 < this.field4976) {
            this.field4975 += -this.field4975 + this.field4976;
         }

      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(JI)I"
   )
   public final int method235(long arg0, int arg1) {
      if (arg1 != 2) {
         return 61;
      } else if (~this.field4975 > ~this.field4976) {
         this.field4977 += -this.field4975 + this.field4976;
         this.field4975 += this.field4976 - this.field4975;
         this.field4976 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field4976 += arg0;
            ++var4;
         } while(var4 < 10 && this.field4975 > this.field4976);

         if (~this.field4975 < ~this.field4976) {
            this.field4976 = this.field4975;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "<init>",
      descriptor = "()V"
   )
   public class357() {
      this.field4975 = System.nanoTime();
      this.field4976 = System.nanoTime();
   }
}
