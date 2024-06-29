import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public interface class499 extends class515 {
   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(B)V"
   )
   void method788(byte arg0);

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(III)Z"
   )
   boolean method789(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!so",
      name = "b",
      descriptor = "(B)Z"
   )
   boolean method787(byte arg0);

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IZILjaclib/memory/Source;)Z"
   )
   boolean method792(int arg0, boolean arg1, int arg2, Source arg3);

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IZ)Ljaclib/memory/Buffer;"
   )
   Buffer method786(int arg0, boolean arg1);
}
