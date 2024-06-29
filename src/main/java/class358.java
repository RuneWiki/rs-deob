import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class358 implements class122 {
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "J"
   )
   private long field4983 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "Lj;"
   )
   public class333 field4981;
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "Lxa;"
   )
   public class572 field4982;

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method2831(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method2832(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method2832(this.field4983, this.field4981.nativeid, this.field4982.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V"
   )
   public class358(class53 arg0, class333 arg1, class572 arg2) {
      this.field4983 = arg0.nativeid;
      this.field4981 = arg1;
      this.field4982 = arg2;
   }

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method2831(this.field4983, this.field4981.nativeid, this.field4982.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }
}
