import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public interface class77 {
   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(B)I"
   )
   int method794(byte arg0);

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(I)I"
   )
   int method795(int arg0);

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(Z)J"
   )
   long method796(boolean arg0);

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "([BIII)V"
   )
   void method797(byte[] arg0, int arg1, int arg2, int arg3);
}
