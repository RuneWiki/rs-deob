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
      descriptor = "()V",
      line = 3
   )
   public static void method4886() {
      field9731 = null;
   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "()V",
      line = 6
   )
   public final void method1543() {
      field9731.method2396(this.field9732, super.field2778);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V",
      line = 9
   )
   public final void method1540(Component arg0) throws Exception {
      field9731.method2393(-70, class83.field1082, arg0, class65.field790);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "c",
      descriptor = "()I",
      line = 13
   )
   public final int method1552() {
      return field9731.method2398(8, this.field9732);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "a",
      descriptor = "()V",
      line = 16
   )
   public final void method1545() {
      field9731.method2394(this.field9732, true);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "d",
      descriptor = "()V",
      line = 19
   )
   public final void method1549() {
      field9731.method2395(this.field9732, 84);
   }

   @OriginalMember(
      owner = "client!rg",
      name = "b",
      descriptor = "(I)V",
      line = 23
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
      descriptor = "(Lnu;I)V",
      line = 28
   )
   public class671(class619 arg0, int arg1) {
      field9731 = (class323)arg0.method4497(false);
      this.field9732 = arg1;
   }
}
