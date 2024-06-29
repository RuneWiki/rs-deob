import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class641 implements class165 {
   @OriginalMember(
      owner = "client!wa",
      name = "c",
      descriptor = "J"
   )
   private long field9023 = 0L;
   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "Lj;"
   )
   public class571 field9024;
   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "Lxa;"
   )
   public class531 field9022;

   @OriginalMember(
      owner = "client!wa",
      name = "Z",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4638(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4638(this.field9023, this.field9024.nativeid, this.field9022.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "X",
      descriptor = "(JJJIIIIIIZZ)V"
   )
   private final native void method4639(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10);

   @OriginalMember(
      owner = "client!wa",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      this.method4639(this.field9023, this.field9024.nativeid, this.field9022.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!wa",
      name = "<init>",
      descriptor = "(Loa;Lj;Lxa;)V"
   )
   public class641(class725 arg0, class571 arg1, class531 arg2) {
      this.field9023 = arg0.nativeid;
      this.field9024 = arg1;
      this.field9022 = arg2;
   }
}
