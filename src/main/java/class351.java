import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class351 {
   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "Lor;"
   )
   private class670 field5022;
   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "Ljaclib/memory/Buffer;"
   )
   public Buffer field5021;

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "([BI)V"
   )
   public final void method2766(byte[] arg0, int arg1) {
      if (this.field5021 == null || this.field5021.getSize() < arg1) {
         this.field5021 = this.field5022.field9714.method5098(arg1, false);
      }

      this.field5021.method3739(arg0, 0, 0, arg1);
   }

   @OriginalMember(
      owner = "client!js",
      name = "<init>",
      descriptor = "(Lor;[BI)V"
   )
   public class351(class670 arg0, byte[] arg1, int arg2) {
      this.field5022 = arg0;
      this.field5021 = this.field5022.field9714.method5098(arg2, false);
      if (arg1 != null) {
         this.field5021.method3739(arg1, 0, 0, arg2);
      }

   }

   @OriginalMember(
      owner = "client!js",
      name = "<init>",
      descriptor = "(Lor;Ljaclib/memory/Buffer;)V"
   )
   public class351(class670 arg0, Buffer arg1) {
      this.field5022 = arg0;
      this.field5021 = arg1;
   }
}
