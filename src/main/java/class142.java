import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class142 extends class22 {
   @OriginalMember(
      owner = "client!hu",
      name = "k",
      descriptor = "Z"
   )
   public volatile boolean field2341 = true;
   @OriginalMember(
      owner = "client!hu",
      name = "l",
      descriptor = "I"
   )
   public int field2343;
   @OriginalMember(
      owner = "client!hu",
      name = "m",
      descriptor = "Lhu;"
   )
   public class142 field2342;
   @OriginalMember(
      owner = "client!hu",
      name = "j",
      descriptor = "Lap;"
   )
   public class500 field2340;

   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "([III)V"
   )
   public final void method1356(int[] arg0, int arg1, int arg2) {
      if (this.field2341) {
         this.method85(arg0, arg1, arg2);
      } else {
         this.method86(arg2);
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "()Lhu;"
   )
   public abstract class142 method90();

   @OriginalMember(
      owner = "client!hu",
      name = "d",
      descriptor = "()Lhu;"
   )
   public abstract class142 method87();

   @OriginalMember(
      owner = "client!hu",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method88();

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "()I"
   )
   public int method1357() {
      return 255;
   }

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method86(int arg0);

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "([III)V"
   )
   public abstract void method85(int[] arg0, int arg1, int arg2);
}
