import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class692 extends class67 implements class558 {
   @OriginalMember(
      owner = "client!h",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!h",
      name = "JA",
      descriptor = "(Loa;Lya;[[B[I[I[I[I)V"
   )
   private final native void method5031(class722 arg0, class59 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

   @OriginalMember(
      owner = "client!h",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final native void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!h",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);

   @OriginalMember(
      owner = "client!h",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!h",
      name = "NA",
      descriptor = "(CIIIZLaa;II)V"
   )
   private final native void method5032(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!h",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
      this.method5032(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!h",
      name = "<init>",
      descriptor = "(Loa;Lya;Lpg;[Lnia;[Lat;)V"
   )
   public class692(class722 arg0, class59 arg1, class763 arg2, class671[] arg3, class396[] arg4) {
      super(arg0, arg2);
      byte[][] var6 = new byte[arg3.length][];
      int[] var7 = new int[arg3.length];
      int[] var8 = new int[arg3.length];
      int[] var9 = new int[arg3.length];
      int[] var10 = new int[arg3.length];

      for(int var11 = 0; var11 < arg3.length; ++var11) {
         var6[var11] = arg3[var11].field10099;
         var7[var11] = arg3[var11].field10100;
         var8[var11] = arg3[var11].field10097;
         var9[var11] = arg3[var11].field10103;
         var10[var11] = arg3[var11].field10102;
      }

      this.method5031(arg0, arg1, var6, var7, var8, var9, var10);
   }
}
