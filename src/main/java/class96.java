import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class96 extends class591 {
   @OriginalMember(
      owner = "client!wr",
      name = "I",
      descriptor = "I"
   )
   private int field1293;
   @OriginalMember(
      owner = "client!wr",
      name = "H",
      descriptor = "Lmca;"
   )
   private static class41 field1292;

   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "()I"
   )
   public final int method889() {
      return field1292.method311(-14408, this.field1293);
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "()V"
   )
   public final void method890() {
      field1292.method309(this.field1293, 0);
   }

   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "()V"
   )
   public final void method891() {
      field1292.method307(this.field1293, super.field8712);
   }

   @OriginalMember(
      owner = "client!wr",
      name = "e",
      descriptor = "()V"
   )
   public static void method892() {
      field1292 = null;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "d",
      descriptor = "()V"
   )
   public final void method893() {
      field1292.method310(this.field1293, 2);
   }

   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method894(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field1292.method306(arg0, this.field1293, 6933);
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method895(Component arg0) throws Exception {
      field1292.method308(arg0, class36.field514, class243.field3061, false);
   }

   @OriginalMember(
      owner = "client!wr",
      name = "<init>",
      descriptor = "(Lgj;I)V"
   )
   public class96(class736 arg0, int arg1) {
      field1292 = (class41)arg0.method5330(69);
      this.field1293 = arg1;
   }
}
