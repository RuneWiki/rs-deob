import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class523 {
   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "Lea;"
   )
   private class573 field7511;
   @OriginalMember(
      owner = "client!iaa",
      name = "b",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field7510;

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method3795(byte[] arg0, int arg1) {
      if (this.field7510 == null || this.field7510.getSize() < arg1) {
         this.field7510 = this.field7511.field8350.method5096(arg1, false);
      }

      this.field7510.method3733(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "<init>",
      descriptor = "(Lea;[BI)V"
   )
   public class523(class573 arg0, byte[] arg1, int arg2) {
      this.field7511 = arg0;
      this.field7510 = this.field7511.field8350.method5096(arg2, false);
      if (arg1 != null) {
         this.field7510.method3733(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!iaa",
      name = "<init>",
      descriptor = "(Lea;Ljaclib/memory/Buffer;)V"
   )
   public class523(class573 arg0, Buffer arg1) {
      this.field7511 = arg0;
      this.field7510 = arg1;
   }
}
