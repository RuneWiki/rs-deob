import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public interface class53 extends class184 {
   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;II)Z"
   )
   boolean method420(int arg0, Source arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   Buffer method421(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(B)Z"
   )
   boolean method422(byte arg0);

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(I)V"
   )
   void method423(int arg0);

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(IBI)Z"
   )
   boolean method424(int arg0, byte arg1, int arg2);
}
