import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 extends class143 {
   @OriginalMember(
      owner = "client!lm",
      name = "s",
      descriptor = "I"
   )
   public int field662;
   @OriginalMember(
      owner = "client!lm",
      name = "q",
      descriptor = "I"
   )
   public int field663;
   @OriginalMember(
      owner = "client!lm",
      name = "t",
      descriptor = "I"
   )
   public int field664;
   @OriginalMember(
      owner = "client!lm",
      name = "r",
      descriptor = "I"
   )
   public int field666;
   @OriginalMember(
      owner = "client!lm",
      name = "u",
      descriptor = "J"
   )
   public long field665;

   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method500(byte arg0) {
      int var2 = 30 / ((28 - arg0) / 50);
      return this.field662;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method501(byte arg0) {
      int var2 = -79 % ((arg0 - -56) / 48);
      return this.field665;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method502(int arg0) {
      if (arg0 != 4) {
         this.method503(false);
      }

      return this.field663;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method503(boolean arg0) {
      if (!arg0) {
         this.method503(false);
      }

      return this.field666;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method504(boolean arg0) {
      if (arg0) {
         this.field664 = -23;
      }

      return this.field664;
   }
}
