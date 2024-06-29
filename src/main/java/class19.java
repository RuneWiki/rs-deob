import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class19 extends class67 implements class560 {
   @OriginalMember(
      owner = "client!n",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!n",
      name = "a",
      descriptor = "(CIIIZLaa;II)V",
      line = 3
   )
   public final void method109(char arg0, int arg1, int arg2, int arg3, boolean arg4, class515 arg5, int arg6, int arg7) {
      this.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!n",
      name = "finalize",
      descriptor = "()V",
      line = 6
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!n",
      name = "<init>",
      descriptor = "(Loa;Lya;Lru;[Lmha;[Lbg;)V",
      line = 12
   )
   public class19(class724 arg0, class59 arg1, class206 arg2, class439[] arg3, class492[] arg4) {
      super(arg0, arg2);
      byte[][] var6 = new byte[arg3.length][];
      int[] var7 = new int[arg3.length];
      int[] var8 = new int[arg3.length];
      int[] var9 = new int[arg3.length];
      int[] var10 = new int[arg3.length];

      for(int var11 = 0; var11 < arg3.length; ++var11) {
         var6[var11] = arg3[var11].field6268;
         var7[var11] = arg3[var11].field6269;
         var8[var11] = arg3[var11].field6267;
         var9[var11] = arg3[var11].field6265;
         var10[var11] = arg3[var11].field6262;
      }

      this.method112(arg0, arg1, var6, arg3[0].field6264, var7, var8, var9, var10);
   }

   @OriginalMember(
      owner = "client!n",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final native void method110(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!n",
      name = "PA",
      descriptor = "(CIIIZLaa;II)V"
   )
   private final native void method111(char arg0, int arg1, int arg2, int arg3, boolean arg4, class515 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!n",
      name = "S",
      descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V"
   )
   private final native void method112(class724 arg0, class59 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

   @OriginalMember(
      owner = "client!n",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method113(boolean arg0);
}
