import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class689 extends class554 {
   @OriginalMember(
      owner = "client!dv",
      name = "o",
      descriptor = "I"
   )
   public int field10083;
   @OriginalMember(
      owner = "client!dv",
      name = "n",
      descriptor = "I"
   )
   public int field10085;
   @OriginalMember(
      owner = "client!dv",
      name = "q",
      descriptor = "I"
   )
   public int field10086;
   @OriginalMember(
      owner = "client!dv",
      name = "p",
      descriptor = "I"
   )
   public int field10087;
   @OriginalMember(
      owner = "client!dv",
      name = "r",
      descriptor = "J"
   )
   public long field10084;

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method3705(boolean arg0) {
      if (!arg0) {
         this.field10087 = -4;
      }

      return this.field10083;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3707(byte arg0) {
      if (arg0 > -51) {
         this.method3705(true);
      }

      return this.field10087;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3706(int arg0) {
      return arg0 != -7560 ? 54 : this.field10085;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method3702(byte arg0) {
      return arg0 != -54 ? -32L : this.field10084;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3704(int arg0) {
      if (arg0 != 3) {
         this.field10087 = -20;
      }

      return this.field10086;
   }
}
