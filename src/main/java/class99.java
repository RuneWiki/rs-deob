import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public interface class99 extends class285 {
   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(Z)V"
   )
   void method358(boolean arg0);

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   Buffer method979(boolean arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "(I)Lob;"
   )
   class779 method980(int arg0);

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(IB)V"
   )
   void method981(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(I)Z"
   )
   boolean method982(int arg0);
}
