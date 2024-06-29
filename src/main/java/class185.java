import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class185 extends class505 {
   @OriginalMember(
      owner = "client!cr",
      name = "s",
      descriptor = "I"
   )
   public int field2365;
   @OriginalMember(
      owner = "client!cr",
      name = "q",
      descriptor = "I"
   )
   public int field2367;
   @OriginalMember(
      owner = "client!cr",
      name = "t",
      descriptor = "I"
   )
   public int field2368;
   @OriginalMember(
      owner = "client!cr",
      name = "u",
      descriptor = "I"
   )
   public int field2369;
   @OriginalMember(
      owner = "client!cr",
      name = "r",
      descriptor = "J"
   )
   public long field2366;

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1553(int arg0) {
      return arg0 < 117 ? 25 : this.field2368;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1554(byte arg0) {
      if (arg0 < 96) {
         this.field2365 = -125;
      }

      return this.field2367;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method1555(byte arg0) {
      return arg0 != -3 ? -9L : this.field2366;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1556(boolean arg0) {
      if (!arg0) {
         this.field2367 = -69;
      }

      return this.field2369;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1557(int arg0) {
      if (arg0 != -1012) {
         this.method1553(64);
      }

      return this.field2365;
   }
}
