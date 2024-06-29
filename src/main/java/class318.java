import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class318 {
   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "Lc;"
   )
   private class652 field4899;
   @OriginalMember(
      owner = "client!eca",
      name = "b",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field4900;

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method2627(byte[] arg0, int arg1) {
      if (this.field4900 == null || this.field4900.getSize() < arg1) {
         this.field4900 = this.field4899.field9618.method5236(arg1, false);
      }

      this.field4900.method548(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!eca",
      name = "<init>",
      descriptor = "(Lc;[BI)V"
   )
   public class318(class652 arg0, byte[] arg1, int arg2) {
      this.field4899 = arg0;
      this.field4900 = this.field4899.field9618.method5236(arg2, false);
      if (arg1 != null) {
         this.field4900.method548(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!eca",
      name = "<init>",
      descriptor = "(Lc;Ljaclib/memory/Buffer;)V"
   )
   public class318(class652 arg0, Buffer arg1) {
      this.field4899 = arg0;
      this.field4900 = arg1;
   }
}
