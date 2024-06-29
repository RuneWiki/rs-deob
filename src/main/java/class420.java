import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class420 extends class785 {
   @OriginalMember(
      owner = "client!to",
      name = "I",
      descriptor = "I"
   )
   private int field6128;
   @OriginalMember(
      owner = "client!to",
      name = "H",
      descriptor = "Luja;"
   )
   private static class475 field6129;

   @OriginalMember(
      owner = "client!to",
      name = "c",
      descriptor = "()V"
   )
   public final void method3275() {
      field6129.method3650(this.field6128, super.field11434);
   }

   @OriginalMember(
      owner = "client!to",
      name = "d",
      descriptor = "()V"
   )
   public final void method3276() {
      field6129.method3645(this.field6128, (byte)104);
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3277(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field6129.method3648(this.field6128, -111, arg0);
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "()V"
   )
   public final void method3278() {
      field6129.method3646(0, this.field6128);
   }

   @OriginalMember(
      owner = "client!to",
      name = "<init>",
      descriptor = "(Lfea;I)V"
   )
   public class420(class82 arg0, int arg1) {
      field6129 = (class475)arg0.method871(0);
      this.field6128 = arg1;
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "()I"
   )
   public final int method3279() {
      return field6129.method3649(40, this.field6128);
   }

   @OriginalMember(
      owner = "client!to",
      name = "e",
      descriptor = "()V"
   )
   public static void method3280() {
      field6129 = null;
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method3281(Component arg0) throws Exception {
      field6129.method3647((byte)-74, class235.field3645, class358.field5291, arg0);
   }
}
