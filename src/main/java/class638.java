import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class638 implements class1 {
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "J"
   )
   private long field9331 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "Lj;"
   )
   public class568 field9332;
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "Lxa;"
   )
   public class530 field9333;

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4614(this.field9331, this.field9332.nativeid, this.field9333.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4614(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4615(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V"
   )
   public class638(class724 arg0, class568 arg1, class530 arg2) {
      this.field9331 = arg0.nativeid;
      this.field9332 = arg1;
      this.field9333 = arg2;
   }

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4615(this.field9331, this.field9332.nativeid, this.field9333.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }
}
