import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class349 extends class761 {
   @OriginalMember(
      owner = "client!vfa",
      name = "I",
      descriptor = "I"
   )
   private int field5346;
   @OriginalMember(
      owner = "client!vfa",
      name = "H",
      descriptor = "Lmr;"
   )
   private static class216 field5345;

   @OriginalMember(
      owner = "client!vfa",
      name = "c",
      descriptor = "()V",
      line = 3
   )
   public final void method2812() {
      field5345.method1875(this.field5346, super.field11250);
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "d",
      descriptor = "()V",
      line = 6
   )
   public final void method2813() {
      field5345.method1872(this.field5346, (byte)-50);
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V",
      line = 10
   )
   public final void method2814(Component arg0) throws Exception {
      field5345.method1874(256, class752.field11155, class262.field4308, arg0);
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "e",
      descriptor = "()V",
      line = 13
   )
   public static void method2815() {
      field5345 = null;
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "b",
      descriptor = "()V",
      line = 16
   )
   public final void method2816() {
      field5345.method1873((byte)-123, this.field5346);
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "e",
      descriptor = "(I)V",
      line = 19
   )
   public final void method2817(int arg0) throws Exception {
      if (arg0 > 32768) {
         throw new IllegalArgumentException();
      } else {
         field5345.method1876(this.field5346, (byte)-110, arg0);
      }
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "a",
      descriptor = "()I",
      line = 25
   )
   public final int method2818() {
      return field5345.method1871(this.field5346, 24632);
   }

   @OriginalMember(
      owner = "client!vfa",
      name = "<init>",
      descriptor = "(Lsu;I)V",
      line = 28
   )
   public class349(class289 arg0, int arg1) {
      field5345 = (class216)arg0.method2432(false);
      this.field5346 = arg1;
   }
}
