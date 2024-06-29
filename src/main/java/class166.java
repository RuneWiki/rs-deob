import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public abstract class class166 extends class347 {
   @OriginalMember(
      owner = "client!wea",
      name = "k",
      descriptor = "Z"
   )
   public volatile boolean field2083 = true;
   @OriginalMember(
      owner = "client!wea",
      name = "i",
      descriptor = "I"
   )
   public int field2082;
   @OriginalMember(
      owner = "client!wea",
      name = "l",
      descriptor = "Lwea;"
   )
   public class166 field2080;
   @OriginalMember(
      owner = "client!wea",
      name = "j",
      descriptor = "Lrj;"
   )
   public class620 field2081;

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "([III)V",
      line = 4
   )
   public final void method1347(int[] arg0, int arg1, int arg2) {
      if (this.field2083) {
         this.method187(arg0, arg1, arg2);
      } else {
         this.method179(arg2);
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "()I",
      line = 15
   )
   public int method1348() {
      return 255;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "c",
      descriptor = "()Lwea;"
   )
   public abstract class166 method182();

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "([III)V"
   )
   public abstract void method187(int[] arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!wea",
      name = "d",
      descriptor = "()Lwea;"
   )
   public abstract class166 method176();

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method184();

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method179(int arg0);
}
