import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class97 {
   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "Lrk;"
   )
   private class35 field1547;
   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field1548;

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "([BI)V",
      line = 6
   )
   public final void method926(byte[] arg0, int arg1) {
      if (this.field1548 == null || this.field1548.getSize() < arg1) {
         this.field1548 = this.field1547.field724.method5080(arg1, false);
      }

      this.field1548.method3821(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "(Lrk;[BI)V",
      line = 12
   )
   public class97(class35 arg0, byte[] arg1, int arg2) {
      this.field1547 = arg0;
      this.field1548 = this.field1547.field724.method5080(arg2, false);
      if (arg1 != null) {
         this.field1548.method3821(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "(Lrk;Ljaclib/memory/Buffer;)V",
      line = 21
   )
   public class97(class35 arg0, Buffer arg1) {
      this.field1547 = arg0;
      this.field1548 = arg1;
   }
}
