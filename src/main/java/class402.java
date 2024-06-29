import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class402 implements class141 {
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "J"
   )
   private long field6292 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "Lj;"
   )
   public class254 field6293;
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "Lxa;"
   )
   public class229 field6291;

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V",
      line = 3
   )
   public final void method1288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method3243(this.field6292, this.field6293.nativeid, this.field6291.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V",
      line = 10
   )
   public final void method1289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method3244(this.field6292, this.field6293.nativeid, this.field6291.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V",
      line = 18
   )
   public class402(class74 arg0, class254 arg1, class229 arg2) {
      this.field6292 = arg0.nativeid;
      this.field6293 = arg1;
      this.field6291 = arg2;
   }

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method3243(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method3244(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);
}
