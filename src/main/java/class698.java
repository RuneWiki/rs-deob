import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class698 {
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "Laea;"
   )
   private class678 field10070;
   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field10071;

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method5107(byte[] arg0, int arg1) {
      if (this.field10071 == null || this.field10071.getSize() < arg1) {
         this.field10071 = this.field10070.field9685.method3170(arg1, false);
      }

      this.field10071.method3134(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!kf",
      name = "<init>",
      descriptor = "(Laea;[BI)V"
   )
   public class698(class678 arg0, byte[] arg1, int arg2) {
      this.field10070 = arg0;
      this.field10071 = this.field10070.field9685.method3170(arg2, false);
      if (arg1 != null) {
         this.field10071.method3134(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!kf",
      name = "<init>",
      descriptor = "(Laea;Ljaclib/memory/Buffer;)V"
   )
   public class698(class678 arg0, Buffer arg1) {
      this.field10070 = arg0;
      this.field10071 = arg1;
   }
}
