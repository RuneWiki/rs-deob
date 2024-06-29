import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public abstract class class268 extends class500 {
   @OriginalMember(
      owner = "client!fga",
      name = "j",
      descriptor = "Z"
   )
   public volatile boolean field3474 = true;
   @OriginalMember(
      owner = "client!fga",
      name = "m",
      descriptor = "I"
   )
   public int field3473;
   @OriginalMember(
      owner = "client!fga",
      name = "l",
      descriptor = "Lfga;"
   )
   public class268 field3475;
   @OriginalMember(
      owner = "client!fga",
      name = "k",
      descriptor = "Lcaa;"
   )
   public class320 field3476;

   @OriginalMember(
      owner = "client!fga",
      name = "b",
      descriptor = "()Lfga;"
   )
   public abstract class268 method649();

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method684(int arg0);

   @OriginalMember(
      owner = "client!fga",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method668();

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "([III)V"
   )
   public final void method2057(int[] arg0, int arg1, int arg2) {
      if (this.field3474) {
         this.method669(arg0, arg1, arg2);
      } else {
         this.method684(arg2);
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "d",
      descriptor = "()I"
   )
   public int method2058() {
      return 255;
   }

   @OriginalMember(
      owner = "client!fga",
      name = "b",
      descriptor = "([III)V"
   )
   public abstract void method669(int[] arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "()Lfga;"
   )
   public abstract class268 method650();
}
