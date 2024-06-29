import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class593 extends class428 {
   @OriginalMember(
      owner = "client!kj",
      name = "m",
      descriptor = "Z"
   )
   public volatile boolean field8720 = true;
   @OriginalMember(
      owner = "client!kj",
      name = "n",
      descriptor = "I"
   )
   public int field8722;
   @OriginalMember(
      owner = "client!kj",
      name = "o",
      descriptor = "Lkj;"
   )
   public class593 field8723;
   @OriginalMember(
      owner = "client!kj",
      name = "p",
      descriptor = "Lor;"
   )
   public class669 field8721;

   @OriginalMember(
      owner = "client!kj",
      name = "d",
      descriptor = "()I",
      line = 4
   )
   public int method1891() {
      return 255;
   }

   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "([III)V",
      line = 20
   )
   public final void method4308(int[] arg0, int arg1, int arg2) {
      if (this.field8720) {
         this.method1607(arg0, arg1, arg2);
      } else {
         this.method1606(arg2);
      }
   }

   @OriginalMember(
      owner = "client!kj",
      name = "c",
      descriptor = "()Lkj;"
   )
   public abstract class593 method1605();

   @OriginalMember(
      owner = "client!kj",
      name = "b",
      descriptor = "()Lkj;"
   )
   public abstract class593 method1603();

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "([III)V"
   )
   public abstract void method1607(int[] arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1606(int arg0);

   @OriginalMember(
      owner = "client!kj",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method1602();
}
