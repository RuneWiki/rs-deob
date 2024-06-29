import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public interface class576 extends class537 {
   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   Buffer method2283(boolean arg0, byte arg1);

   @OriginalMember(
      owner = "client!lba",
      name = "c",
      descriptor = "(I)Z"
   )
   boolean method2282(int arg0);

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(I)V"
   )
   void method1412(int arg0);

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(I)Lria;"
   )
   class301 method2284(int arg0);

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(II)V"
   )
   void method2281(int arg0, int arg1);
}
