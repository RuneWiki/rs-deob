import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public interface class581 extends class285 {
   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(IILjaclib/memory/Source;I)Z"
   )
   boolean method355(int arg0, int arg1, Source arg2, int arg3);

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(I)Z"
   )
   boolean method352(int arg0);

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   Buffer method353(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(BII)Z"
   )
   boolean method351(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Z)V"
   )
   void method358(boolean arg0);
}
