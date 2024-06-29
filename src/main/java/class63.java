import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class63 implements class758 {
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "J"
   )
   private long field882 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "Lj;"
   )
   public class600 field883;
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "Lxa;"
   )
   public class660 field884;

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method629(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method630(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method630(this.field882, this.field883.nativeid, this.field884.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method629(this.field882, this.field883.nativeid, this.field884.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V"
   )
   public class63(class473 arg0, class600 arg1, class660 arg2) {
      this.field882 = arg0.nativeid;
      this.field883 = arg1;
      this.field884 = arg2;
   }
}
