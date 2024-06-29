import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class188 extends class294 {
   @OriginalMember(
      owner = "client!bn",
      name = "m",
      descriptor = "Z"
   )
   public volatile boolean field2938 = true;
   @OriginalMember(
      owner = "client!bn",
      name = "n",
      descriptor = "I"
   )
   public int field2939;
   @OriginalMember(
      owner = "client!bn",
      name = "o",
      descriptor = "Lbn;"
   )
   public class188 field2937;
   @OriginalMember(
      owner = "client!bn",
      name = "p",
      descriptor = "Lrja;"
   )
   public class46 field2936;

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "()Lbn;"
   )
   public abstract class188 method375();

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method383(int arg0);

   @OriginalMember(
      owner = "client!bn",
      name = "d",
      descriptor = "()I"
   )
   public int method399() {
      return 255;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "()Lbn;"
   )
   public abstract class188 method394();

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "([III)V"
   )
   public abstract void method391(int[] arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bn",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method372();

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "([III)V"
   )
   public final void method1686(int[] arg0, int arg1, int arg2) {
      if (this.field2938) {
         this.method391(arg0, arg1, arg2);
      } else {
         this.method383(arg2);
      }
   }
}
