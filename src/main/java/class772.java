import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class772 extends class467 {
   @OriginalMember(
      owner = "client!oha",
      name = "n",
      descriptor = "I"
   )
   public int field11310;
   @OriginalMember(
      owner = "client!oha",
      name = "o",
      descriptor = "I"
   )
   public int field11311;
   @OriginalMember(
      owner = "client!oha",
      name = "r",
      descriptor = "I"
   )
   public int field11312;
   @OriginalMember(
      owner = "client!oha",
      name = "q",
      descriptor = "I"
   )
   public int field11313;
   @OriginalMember(
      owner = "client!oha",
      name = "p",
      descriptor = "J"
   )
   public long field11314;

   @OriginalMember(
      owner = "client!oha",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3490(int arg0) {
      int var2 = -14 / ((arg0 - -32) / 45);
      return this.field11312;
   }

   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3489(byte arg0) {
      return arg0 < 30 ? 80 : this.field11311;
   }

   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3491(int arg0) {
      if (arg0 != -5) {
         this.field11311 = -96;
      }

      return this.field11310;
   }

   @OriginalMember(
      owner = "client!oha",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method3494(int arg0) {
      if (arg0 != 3) {
         this.method3490(40);
      }

      return this.field11314;
   }

   @OriginalMember(
      owner = "client!oha",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method3493(byte arg0) {
      if (arg0 <= 50) {
         this.field11314 = -7L;
      }

      return this.field11313;
   }
}
