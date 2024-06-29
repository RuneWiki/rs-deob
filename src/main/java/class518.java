import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class518 extends class216 implements class64 {
   @OriginalMember(
      owner = "client!n",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!n",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method1878(char arg0, int arg1, int arg2, int arg3, boolean arg4, class684 arg5, int arg6, int arg7) {
      this.method3877(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!n",
      name = "PA",
      descriptor = "(CIIIZLaa;II)V"
   )
   private final native void method3877(char arg0, int arg1, int arg2, int arg3, boolean arg4, class684 arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!n",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!n",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!n",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final native void method1875(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!n",
      name = "<init>",
      descriptor = "(Loa;Lya;Lwm;[Liaa;[Lma;)V"
   )
   public class518(class473 arg0, class770 arg1, class440 arg2, class433[] arg3, class148[] arg4) {
      super(arg0, arg2);
      byte[][] var6 = new byte[arg3.length][];
      int[] var7 = new int[arg3.length];
      int[] var8 = new int[arg3.length];
      int[] var9 = new int[arg3.length];
      int[] var10 = new int[arg3.length];

      for(int var11 = 0; var11 < arg3.length; ++var11) {
         var6[var11] = arg3[var11].field6354;
         var7[var11] = arg3[var11].field6361;
         var8[var11] = arg3[var11].field6353;
         var9[var11] = arg3[var11].field6355;
         var10[var11] = arg3[var11].field6358;
      }

      this.method3878(arg0, arg1, var6, arg3[0].field6357, var7, var8, var9, var10);
   }

   @OriginalMember(
      owner = "client!n",
      name = "S",
      descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V"
   )
   private final native void method3878(class473 arg0, class770 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);
}
