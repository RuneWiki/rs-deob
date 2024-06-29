import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 extends class227 {
   @OriginalMember(
      owner = "client!fw",
      name = "v",
      descriptor = "I"
   )
   public int field766;
   @OriginalMember(
      owner = "client!fw",
      name = "t",
      descriptor = "I"
   )
   public int field768;
   @OriginalMember(
      owner = "client!fw",
      name = "s",
      descriptor = "I"
   )
   public int field769;
   @OriginalMember(
      owner = "client!fw",
      name = "u",
      descriptor = "I"
   )
   public int field770;
   @OriginalMember(
      owner = "client!fw",
      name = "w",
      descriptor = "J"
   )
   public long field767;

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method478(byte arg0) {
      int var2 = 73 % ((arg0 - -45) / 62);
      return this.field770;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method479(byte arg0) {
      return arg0 >= -74 ? 42 : this.field766;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "e",
      descriptor = "(B)J"
   )
   public final long method480(byte arg0) {
      int var2 = 126 % ((arg0 - 65) / 49);
      return this.field767;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method481(byte arg0) {
      if (arg0 != 35) {
         this.method479((byte)119);
      }

      return this.field769;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method482(byte arg0) {
      if (arg0 >= -72) {
         this.method480((byte)92);
      }

      return this.field768;
   }
}
