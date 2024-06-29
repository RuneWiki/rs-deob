import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public interface class631 extends class264 {
   @OriginalMember(
      owner = "client!gfa",
      name = "b",
      descriptor = "(I)Z"
   )
   boolean method1534(int arg0);

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;III)Z"
   )
   boolean method1536(Source arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(III)Z"
   )
   boolean method1537(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(I)V"
   )
   void method1533(int arg0);

   @OriginalMember(
      owner = "client!gfa",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   Buffer method1535(boolean arg0, int arg1);
}
