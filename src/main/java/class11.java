import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public interface class11 extends class677 {
   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(III)Z"
   )
   boolean method101(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   Buffer method102(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;IB)Z"
   )
   boolean method103(int arg0, Source arg1, int arg2, byte arg3);

   @OriginalMember(
      owner = "client!bc",
      name = "a",
      descriptor = "(I)Z"
   )
   boolean method104(int arg0);

   @OriginalMember(
      owner = "client!bc",
      name = "b",
      descriptor = "(I)V"
   )
   void method105(int arg0);
}
