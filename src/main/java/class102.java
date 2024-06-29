import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public interface class102 extends class523 {
   @OriginalMember(
      owner = "client!sd",
      name = "b",
      descriptor = "(I)Z"
   )
   boolean method569(int arg0);

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(III)Z"
   )
   boolean method568(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(IIZLjaclib/memory/Source;)Z"
   )
   boolean method573(int arg0, int arg1, boolean arg2, Source arg3);

   @OriginalMember(
      owner = "client!sd",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   Buffer method567(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!sd",
      name = "d",
      descriptor = "(I)V"
   )
   void method574(int arg0);
}
