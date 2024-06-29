import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class19 extends class66 implements class556 {
   @OriginalMember(
      owner = "client!n",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!n",
      name = "finalize",
      descriptor = "()V",
      line = 5
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)-56, this);
      }

   }

   @OriginalMember(
      owner = "client!n",
      name = "<init>",
      descriptor = "(Loa;Lya;Lika;[Ltn;[Ltd;)V",
      line = 14
   )
   public class19(class721 arg0, class58 arg1, class445 arg2, class94[] arg3, class476[] arg4) {
      super(arg0, arg2);
      byte[][] var6 = new byte[arg3.length][];
      int[] var7 = new int[arg3.length];
      int[] var8 = new int[arg3.length];
      int[] var9 = new int[arg3.length];
      int[] var10 = new int[arg3.length];

      for(int var11 = 0; var11 < arg3.length; ++var11) {
         var6[var11] = arg3[var11].field1519;
         var7[var11] = arg3[var11].field1523;
         var8[var11] = arg3[var11].field1520;
         var9[var11] = arg3[var11].field1522;
         var10[var11] = arg3[var11].field1525;
      }

      this.method141(arg0, arg1, var6, arg3[0].field1521, var7, var8, var9, var10);
   }

   @OriginalMember(
      owner = "client!n",
      name = "a",
      descriptor = "(CIIIZLaa;II)V",
      line = 41
   )
   public final void method143(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7) {
      this.method142(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!n",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!n",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final native void method140(char arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!n",
      name = "S",
      descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V"
   )
   private final native void method141(class721 arg0, class58 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

   @OriginalMember(
      owner = "client!n",
      name = "PA",
      descriptor = "(CIIIZLaa;II)V"
   )
   private final native void method142(char arg0, int arg1, int arg2, int arg3, boolean arg4, class510 arg5, int arg6, int arg7);
}
