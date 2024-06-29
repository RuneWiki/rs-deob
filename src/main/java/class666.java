import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class666 extends class176 {
   @OriginalMember(
      owner = "client!ck",
      name = "F",
      descriptor = "I"
   )
   private int field9671;
   @OriginalMember(
      owner = "client!ck",
      name = "G",
      descriptor = "Len;"
   )
   private static class336 field9672;

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "()V"
   )
   public final void method727() {
      field9672.method2611(this.field9671, (byte)37);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "()I"
   )
   public final int method730() {
      return field9672.method2608(this.field9671, 256);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "()V"
   )
   public final void method732() {
      field9672.method2607(this.field9671, super.field2702);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "()V"
   )
   public static void method4865() {
      field9672 = null;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method729(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field9672.method2609(-71, arg0, this.field9671);
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "()V"
   )
   public final void method728() {
      field9672.method2610(-110, this.field9671);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "<init>",
      descriptor = "(Loo;I)V"
   )
   public class666(class651 arg0, int arg1) {
      field9672 = (class336)arg0.method4784(10000);
      this.field9671 = arg1;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method731(Component arg0) throws Exception {
      field9672.method2606(class755.field10967, class483.field7024, arg0, 1);
   }
}
