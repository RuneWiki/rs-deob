import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public interface class215 extends class184 {
   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(I)V"
   )
   void method423(int arg0);

   @OriginalMember(
      owner = "client!hi",
      name = "c",
      descriptor = "(I)Lef;"
   )
   class513 method1623(int arg0);

   @OriginalMember(
      owner = "client!hi",
      name = "d",
      descriptor = "(I)Z"
   )
   boolean method1624(int arg0);

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   Buffer method1625(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(BI)V"
   )
   void method923(byte arg0, int arg1);
}
