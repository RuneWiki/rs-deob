import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public interface class280 extends class523 {
   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   Buffer method2188(byte arg0, boolean arg1);

   @OriginalMember(
      owner = "client!rn",
      name = "d",
      descriptor = "(I)V"
   )
   void method574(int arg0);

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(II)V"
   )
   void method2189(int arg0, int arg1);

   @OriginalMember(
      owner = "client!rn",
      name = "c",
      descriptor = "(I)Z"
   )
   boolean method2190(int arg0);

   @OriginalMember(
      owner = "client!rn",
      name = "b",
      descriptor = "(I)Lrfa;"
   )
   class209 method2191(int arg0);
}
