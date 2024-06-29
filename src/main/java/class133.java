import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class133 {
   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "Lck;"
   )
   private class667 field1659;
   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field1660;

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method1137(byte[] arg0, int arg1) {
      if (this.field1660 == null || this.field1660.getSize() < arg1) {
         this.field1660 = this.field1659.field9904.method5083(arg1, false);
      }

      this.field1660.method3792(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!gm",
      name = "<init>",
      descriptor = "(Lck;[BI)V"
   )
   public class133(class667 arg0, byte[] arg1, int arg2) {
      this.field1659 = arg0;
      this.field1660 = this.field1659.field9904.method5083(arg2, false);
      if (arg1 != null) {
         this.field1660.method3792(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!gm",
      name = "<init>",
      descriptor = "(Lck;Ljaclib/memory/Buffer;)V"
   )
   public class133(class667 arg0, Buffer arg1) {
      this.field1659 = arg0;
      this.field1660 = arg1;
   }
}
