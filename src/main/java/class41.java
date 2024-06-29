import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public interface class41 {
   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(III)V"
   )
   void method306(int arg0, int arg1, int arg2) throws Exception;

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(I[I)V"
   )
   void method307(int arg0, int[] arg1);

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(Ljava/awt/Component;IZZ)V"
   )
   void method308(Component arg0, int arg1, boolean arg2, boolean arg3) throws Exception;

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(II)V"
   )
   void method309(int arg0, int arg1);

   @OriginalMember(
      owner = "client!mca",
      name = "c",
      descriptor = "(II)V"
   )
   void method310(int arg0, int arg1);

   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "(II)I"
   )
   int method311(int arg0, int arg1);
}
