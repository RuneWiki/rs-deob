import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class602 extends class220 {
   @OriginalMember(
      owner = "client!uo",
      name = "H",
      descriptor = "I"
   )
   private int field8835;
   @OriginalMember(
      owner = "client!uo",
      name = "I",
      descriptor = "Lfda;"
   )
   private static class337 field8834;

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public final void method1668(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field8834.method2249(this.field8835, (byte)42, arg0);
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "()V",
      line = 9
   )
   public final void method1674() {
      field8834.method2247(true, this.field8835);
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "()V",
      line = 12
   )
   public final void method1661() {
      field8834.method2246(this.field8835, (byte)47);
   }

   @OriginalMember(
      owner = "client!uo",
      name = "e",
      descriptor = "()V",
      line = 15
   )
   public static void method4399() {
      field8834 = null;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "()I",
      line = 18
   )
   public final int method1667() {
      return field8834.method2245((byte)9, this.field8835);
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V",
      line = 21
   )
   public final void method1669(Component arg0) throws Exception {
      field8834.method2244(class532.field7780, class335.field4787, arg0, -101);
   }

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "()V",
      line = 25
   )
   public final void method1676() {
      field8834.method2248(this.field8835, super.field2800);
   }

   @OriginalMember(
      owner = "client!uo",
      name = "<init>",
      descriptor = "(Lhg;I)V",
      line = 28
   )
   public class602(class719 arg0, int arg1) {
      field8834 = (class337)arg0.method5216(-17207);
      this.field8835 = arg1;
   }
}
