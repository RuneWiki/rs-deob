import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class34 {
   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "Liu;"
   )
   private class530 field488;
   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field489;

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method271(byte[] arg0, int arg1) {
      if (this.field489 == null || this.field489.getSize() < arg1) {
         this.field489 = this.field488.field7646.method2987(arg1, false);
      }

      this.field489.method231(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "<init>",
      descriptor = "(Liu;[BI)V"
   )
   public class34(class530 arg0, byte[] arg1, int arg2) {
      this.field488 = arg0;
      this.field489 = this.field488.field7646.method2987(arg2, false);
      if (arg1 != null) {
         this.field489.method231(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!bo",
      name = "<init>",
      descriptor = "(Liu;Ljaclib/memory/Buffer;)V"
   )
   public class34(class530 arg0, Buffer arg1) {
      this.field488 = arg0;
      this.field489 = arg1;
   }
}
