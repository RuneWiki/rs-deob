import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class671 extends class197 {
   @OriginalMember(
      owner = "client!rg",
      name = "G",
      descriptor = "I"
   )
   private int field9732;
   @OriginalMember(
      owner = "client!rg",
      name = "F",
      descriptor = "Lca;"
   )
   private static class323 field9731;

   @OriginalMember(
      owner = "client!rg",
      name = "e",
      descriptor = "()V"
   )
   public static void method4886() {
      field9731 = null;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "()V"
   )
   public final void method1543() {
      field9731.method2396(this.field9732, super.field2778);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method1540(Component arg0) throws Exception {
      field9731.method2393(-70, class83.field1082, arg0, class65.field790);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "c",
      descriptor = "()I"
   )
   public final int method1552() {
      return field9731.method2398(8, this.field9732);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "()V"
   )
   public final void method1545() {
      field9731.method2394(this.field9732, true);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "d",
      descriptor = "()V"
   )
   public final void method1549() {
      field9731.method2395(this.field9732, 84);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1550(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field9731.method2397(72, arg0, this.field9732);
      }
   }

   @OriginalMember(
      owner = "client!rg",
      name = "<init>",
      descriptor = "(Lnu;I)V"
   )
   public class671(class619 arg0, int arg1) {
      field9731 = (class323)arg0.method4497(false);
      this.field9732 = arg1;
   }
}
