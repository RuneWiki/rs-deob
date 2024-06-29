import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class235 extends class380 {
   @OriginalMember(
      owner = "client!em",
      name = "n",
      descriptor = "I"
   )
   public int field3426;
   @OriginalMember(
      owner = "client!em",
      name = "k",
      descriptor = "I"
   )
   public int field3427;
   @OriginalMember(
      owner = "client!em",
      name = "m",
      descriptor = "I"
   )
   public int field3429;
   @OriginalMember(
      owner = "client!em",
      name = "o",
      descriptor = "I"
   )
   public int field3430;
   @OriginalMember(
      owner = "client!em",
      name = "l",
      descriptor = "J"
   )
   public long field3428;

   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "(I)I",
      line = 6
   )
   public final int method1282(int arg0) {
      if (arg0 != 5) {
         this.field3427 = -98;
      }

      return this.field3429;
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(I)I",
      line = 17
   )
   public final int method1278(int arg0) {
      if (arg0 != 2) {
         this.field3426 = 5;
      }

      return this.field3426;
   }

   @OriginalMember(
      owner = "client!em",
      name = "g",
      descriptor = "(I)J",
      line = 28
   )
   public final long method1280(int arg0) {
      int var2 = 37 / ((arg0 - -75) / 35);
      return this.field3428;
   }

   @OriginalMember(
      owner = "client!em",
      name = "f",
      descriptor = "(I)I",
      line = 38
   )
   public final int method1281(int arg0) {
      return arg0 != 1 ? 118 : this.field3427;
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(B)I",
      line = 50
   )
   public final int method1284(byte arg0) {
      return arg0 <= 39 ? -97 : this.field3430;
   }
}
