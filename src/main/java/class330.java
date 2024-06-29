import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public abstract class class330 extends class673 {
   @OriginalMember(
      owner = "client!mv",
      name = "m",
      descriptor = "Z"
   )
   public volatile boolean field4559 = true;
   @OriginalMember(
      owner = "client!mv",
      name = "l",
      descriptor = "I"
   )
   public int field4558;
   @OriginalMember(
      owner = "client!mv",
      name = "n",
      descriptor = "Lmv;"
   )
   public class330 field4560;
   @OriginalMember(
      owner = "client!mv",
      name = "o",
      descriptor = "Lus;"
   )
   public class342 field4557;

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "()Lmv;"
   )
   public abstract class330 method1949();

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method1950();

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1959(int arg0);

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method2619(int[] arg0, int arg1, int arg2) {
      if (this.field4559) {
         this.method1948(arg0, arg1, arg2);
      } else {
         this.method1959(arg2);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "d",
      descriptor = "()I"
   )
   public int method2028() {
      return 255;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "([III)V"
   )
   public abstract void method1948(int[] arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!mv",
      name = "c",
      descriptor = "()Lmv;"
   )
   public abstract class330 method1961();
}
