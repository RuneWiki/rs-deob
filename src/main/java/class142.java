import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class142 extends class572 {
   @OriginalMember(
      owner = "client!eea",
      name = "g",
      descriptor = "J"
   )
   private long field1808 = 0L;
   @OriginalMember(
      owner = "client!eea",
      name = "f",
      descriptor = "J"
   )
   private long field1809 = 0L;
   @OriginalMember(
      owner = "client!eea",
      name = "h",
      descriptor = "[J"
   )
   private long[] field1810 = new long[10];
   @OriginalMember(
      owner = "client!eea",
      name = "e",
      descriptor = "J"
   )
   private long field1811 = 0L;
   @OriginalMember(
      owner = "client!eea",
      name = "i",
      descriptor = "I"
   )
   private int field1812 = 1;
   @OriginalMember(
      owner = "client!eea",
      name = "j",
      descriptor = "I"
   )
   private int field1813 = 0;

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(Z)J"
   )
   public final long method1108(boolean arg0) {
      if (arg0) {
         this.field1813 = 13;
      }

      this.field1808 += this.method1193(-11048);
      return this.field1809 > this.field1808 ? (-this.field1808 + this.field1809) / 1000000L : 0L;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1109(byte arg0) {
      if (~this.field1808 > ~this.field1809) {
         this.field1808 += this.field1809 - this.field1808;
      }

      if (arg0 != 97) {
         this.field1808 = 84L;
      }

      this.field1811 = 0L;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method1110(byte arg0) {
      if (arg0 <= 66) {
         this.method1110((byte)1);
      }

      return this.field1808;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(IJ)I"
   )
   public final int method1111(int arg0, long arg1) {
      if (arg0 != -23762) {
         this.method1193(5);
      }

      if (this.field1809 > this.field1808) {
         this.field1811 += this.field1809 - this.field1808;
         this.field1808 += this.field1809 - this.field1808;
         this.field1809 += arg1;
         return 1;
      } else {
         int var4 = 0;

         do {
            this.field1809 += arg1;
            ++var4;
         } while(~var4 > -11 && ~this.field1808 < ~this.field1809);

         if (this.field1809 < this.field1808) {
            this.field1809 = this.field1808;
         }

         return var4;
      }
   }

   @OriginalMember(
      owner = "client!eea",
      name = "a",
      descriptor = "(I)J"
   )
   private final long method1193(int arg0) {
      long var2 = jagmisc.nanoTime();
      long var4 = -this.field1811 + var2;
      this.field1811 = var2;
      if (var4 > -5000000000L && ~var4 > -5000000001L) {
         this.field1810[this.field1813] = var4;
         if (this.field1812 < 1) {
            ++this.field1812;
         }

         this.field1813 = (this.field1813 + 1) % 10;
      }

      long var6 = 0L;
      if (arg0 != -11048) {
         this.method1109((byte)-21);
      }

      for(int var8 = 1; var8 <= this.field1812; ++var8) {
         var6 += this.field1810[(-var8 + this.field1813 + 10) % 10];
      }

      return var6 / (long)this.field1812;
   }

   @OriginalMember(
      owner = "client!eea",
      name = "<init>",
      descriptor = "()V"
   )
   public class142() {
      this.field1809 = this.field1808 = jagmisc.nanoTime();
      if (~this.field1808 == -1L) {
         throw new RuntimeException();
      }
   }
}
