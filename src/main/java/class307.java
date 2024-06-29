import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class307 extends class247 {
   @OriginalMember(
      owner = "client!nj",
      name = "j",
      descriptor = "Z"
   )
   public volatile boolean field4644 = true;
   @OriginalMember(
      owner = "client!nj",
      name = "l",
      descriptor = "I"
   )
   public int field4645;
   @OriginalMember(
      owner = "client!nj",
      name = "m",
      descriptor = "Lnj;"
   )
   public class307 field4643;
   @OriginalMember(
      owner = "client!nj",
      name = "k",
      descriptor = "Lvia;"
   )
   public class89 field4642;

   @OriginalMember(
      owner = "client!nj",
      name = "b",
      descriptor = "([III)V"
   )
   public abstract void method564(int[] arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method561(int arg0);

   @OriginalMember(
      owner = "client!nj",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method563();

   @OriginalMember(
      owner = "client!nj",
      name = "c",
      descriptor = "()Lnj;"
   )
   public abstract class307 method558();

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "()Lnj;"
   )
   public abstract class307 method566();

   @OriginalMember(
      owner = "client!nj",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method2523(int[] arg0, int arg1, int arg2) {
      if (this.field4644) {
         this.method564(arg0, arg1, arg2);
      } else {
         this.method561(arg2);
      }
   }

   @OriginalMember(
      owner = "client!nj",
      name = "b",
      descriptor = "()I"
   )
   public int method2431() {
      return 255;
   }
}
