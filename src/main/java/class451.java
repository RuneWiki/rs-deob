import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class451 extends class7 {
   @OriginalMember(
      owner = "client!ika",
      name = "H",
      descriptor = "I"
   )
   private int field6226;
   @OriginalMember(
      owner = "client!ika",
      name = "I",
      descriptor = "Ljq;"
   )
   private static class541 field6227;

   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "()I"
   )
   public final int method54() {
      return field6227.method1368(this.field6226, 256);
   }

   @OriginalMember(
      owner = "client!ika",
      name = "d",
      descriptor = "()V"
   )
   public final void method57() {
      field6227.method1365(this.field6226, super.field47);
   }

   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "()V"
   )
   public final void method49() {
      field6227.method1364((byte)104, this.field6226);
   }

   @OriginalMember(
      owner = "client!ika",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method52(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field6227.method1367(this.field6226, arg0, (byte)-84);
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "<init>",
      descriptor = "(Lbj;I)V"
   )
   public class451(class255 arg0, int arg1) {
      field6227 = (class541)arg0.method1945(8);
      this.field6226 = arg1;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method51(Component arg0) throws Exception {
      field6227.method1366(arg0, 97, class614.field8578, class556.field7644);
   }

   @OriginalMember(
      owner = "client!ika",
      name = "a",
      descriptor = "()V"
   )
   public final void method48() {
      field6227.method1363(this.field6226, -32290);
   }

   @OriginalMember(
      owner = "client!ika",
      name = "e",
      descriptor = "()V"
   )
   public static void method3339() {
      field6227 = null;
   }
}
