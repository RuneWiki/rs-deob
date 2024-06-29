import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public interface class398 extends class537 {
   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(B)Z"
   )
   boolean method1409(byte arg0);

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   Buffer method1407(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(I)V"
   )
   void method1412(int arg0);

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(III)Z"
   )
   boolean method1410(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;III)Z"
   )
   boolean method1413(Source arg0, int arg1, int arg2, int arg3);
}
