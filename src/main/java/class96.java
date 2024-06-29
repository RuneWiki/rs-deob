import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public interface class96 extends class515 {
   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(BI)V"
   )
   void method895(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(B)V"
   )
   void method788(byte arg0);

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   Buffer method896(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(B)Liw;"
   )
   class335 method897(byte arg0);

   @OriginalMember(
      owner = "client!oia",
      name = "c",
      descriptor = "(B)Z"
   )
   boolean method898(byte arg0);
}
