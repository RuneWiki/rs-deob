import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public interface class265 extends class677 {
   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(B)Lwn;"
   )
   class576 method1193(byte arg0);

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(II)V"
   )
   void method1192(int arg0, int arg1);

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(I)V"
   )
   void method105(int arg0);

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   Buffer method1195(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(B)Z"
   )
   boolean method1194(byte arg0);
}
