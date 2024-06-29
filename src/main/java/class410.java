import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class410 extends class427 {
   @OriginalMember(
      owner = "client!pp",
      name = "i",
      descriptor = "J"
   )
   private long field6012 = 0L;
   @OriginalMember(
      owner = "client!pp",
      name = "j",
      descriptor = "J"
   )
   private long field6013 = 0L;
   @OriginalMember(
      owner = "client!pp",
      name = "g",
      descriptor = "J"
   )
   private long field6014 = 0L;
   @OriginalMember(
      owner = "client!pp",
      name = "f",
      descriptor = "I"
   )
   private int field6015 = 1;
   @OriginalMember(
      owner = "client!pp",
      name = "e",
      descriptor = "[J"
   )
   private long[] field6016 = new long[10];
   @OriginalMember(
      owner = "client!pp",
      name = "h",
      descriptor = "I"
   )
   private int field6017 = 0;

   @OriginalMember(
      owner = "client!pp",
      name = "b",
      descriptor = "(B)J"
   )
   private final long method3137(byte arg0) {
      long var2 = System.nanoTime();
      long var4 = -this.field6014 + var2;
      this.field6014 = var2;
      if (var4 > -5000000000L && 5000000000L > var4) {
         this.field6016[this.field6017] = var4;
         this.field6017 = (this.field6017 + 1) % 10;
         if (this.field6015 < 1) {
            ++this.field6015;
         }
      }

      if (arg0 > -29) {
         this.method3141(-94);
      }

      long var6 = 0L;

      for(int var8 = 1; var8 <= this.field6015; ++var8) {
         var6 += this.field6016[(this.field6017 + 10 + -var8) % 10];
      }

      return var6 / (long)this.field6015;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3138(int arg0) {
      if (arg0 != 8) {
         this.method3141(-94);
      }

      if (~this.field6013 < ~this.field6012) {
         this.field6012 += -this.field6012 + this.field6013;
      }

      this.field6014 = 0L;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(JZ)I"
   )
   public final int method3139(long arg0, boolean arg1) {
      if (!arg1) {
         this.method3137((byte)116);
      }

      if (~this.field6013 < ~this.field6012) {
         this.field6014 += this.field6013 - this.field6012;
         this.field6012 += -this.field6012 + this.field6013;
         this.field6013 += arg0;
         return 1;
      } else {
         int var4 = 0;

         do {
            ++var4;
            this.field6013 += arg0;
         } while(10 > var4 && ~this.field6012 < ~this.field6013);

         if (this.field6012 > this.field6013) {
            this.field6013 = this.field6012;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method3140(byte arg0) {
      if (arg0 != 82) {
         this.field6015 = 59;
      }

      return this.field6012;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method3141(int arg0) {
      if (arg0 != -23401) {
         this.method3141(83);
      }

      this.field6012 += this.method3137((byte)-124);
      return this.field6013 <= this.field6012 ? 0L : (this.field6013 - this.field6012) / 1000000L;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "<init>",
      descriptor = "()V"
   )
   public class410() {
      this.field6012 = System.nanoTime();
      this.field6013 = System.nanoTime();
   }
}
