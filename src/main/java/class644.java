import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class644 implements class558 {
   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "Loa;"
   )
   private class722 field9379;
   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "Li;"
   )
   private class44 field9382;
   @OriginalMember(
      owner = "client!a",
      name = "l",
      descriptor = "Li;"
   )
   private class44 field9376;
   @OriginalMember(
      owner = "client!a",
      name = "j",
      descriptor = "Li;"
   )
   private class44 field9373;
   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "Li;"
   )
   private class44 field9372;
   @OriginalMember(
      owner = "client!a",
      name = "h",
      descriptor = "Li;"
   )
   private class44 field9383;
   @OriginalMember(
      owner = "client!a",
      name = "g",
      descriptor = "Li;"
   )
   private class44 field9377;
   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "Li;"
   )
   private class44 field9378;
   @OriginalMember(
      owner = "client!a",
      name = "i",
      descriptor = "Li;"
   )
   private class44 field9375;
   @OriginalMember(
      owner = "client!a",
      name = "k",
      descriptor = "Li;"
   )
   private class44 field9374;
   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "Li;"
   )
   private class44 field9380;
   @OriginalMember(
      owner = "client!a",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;
   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "Ljava/lang/Runnable;"
   )
   public Runnable field9381;

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILgq;Z)Z",
      line = 3
   )
   public final boolean method4623(class497 arg0, int arg1, int arg2, class540 arg3, boolean arg4) {
      return this.method4646(this.nativeid, ((class44)arg0).nativeid, arg1, arg2, ((class291)arg3).nativeid, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;IIIIIII)V",
      line = 9
   )
   public final void method4626(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4645(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;III)V",
      line = 13
   )
   public final void method4627(class293 arg0, int arg1, int arg2, int arg3) {
      this.method4634(this.nativeid, ((class696)arg0).nativeid, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;[I[I[I[SI)V",
      line = 16
   )
   public final void method4628(class66 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
      this.method4624(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "()V",
      line = 19
   )
   private final void method4629() {
      this.method4643(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;IIIIIII[[Z)V",
      line = 22
   )
   public final void method4630(class293 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
      this.method4641(this.nativeid, ((class696)arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;[ILgq;)V",
      line = 27
   )
   public final void method4632(class497 arg0, int[] arg1, class540 arg2) {
      this.method4652(this.nativeid, ((class44)arg0).nativeid, arg1, ((class291)arg2).nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lgq;[III)V",
      line = 30
   )
   public final void method4633(class497 arg0, class540 arg1, int[] arg2, int arg3, int arg4) {
      this.method4638(this.nativeid, ((class44)arg0).nativeid, ((class291)arg1).nativeid, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "()V",
      line = 37
   )
   public final void method4636() {
      this.field9381 = null;
      this.method4644();
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Li;BIZ)Lka;",
      line = 43
   )
   public final class497 method4637(class44 arg0, byte arg1, int arg2, boolean arg3) {
      class44 var5;
      class44 var6;
      if (arg1 == 1) {
         var5 = this.field9377;
         var6 = this.field9382;
      } else if (arg1 == 2) {
         var5 = this.field9378;
         var6 = this.field9376;
      } else if (arg1 == 3) {
         var5 = this.field9375;
         var6 = this.field9373;
      } else if (arg1 == 4) {
         var5 = this.field9374;
         var6 = this.field9372;
      } else if (arg1 == 5) {
         var5 = this.field9380;
         var6 = this.field9383;
      } else {
         var6 = var5 = new class44(this.field9379);
      }

      arg0.method305(var6, var5, arg2, arg1 != 0, arg3);
      var6.field468 = arg0.field468;
      var6.field469 = arg0.field469;
      return var6;
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILgq;ZI)Z",
      line = 90
   )
   public final boolean method4640(class497 arg0, int arg1, int arg2, class540 arg3, boolean arg4, int arg5) {
      return this.method4635(this.nativeid, ((class44)arg0).nativeid, arg1, arg2, ((class291)arg3).nativeid, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "()V",
      line = 98
   )
   private final void method4644() {
      this.method4639(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lka;IIIZ)V",
      line = 104
   )
   public final void method4647(class497 arg0, class497 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4648(this.nativeid, ((class44)arg0).nativeid, ((class44)arg1).nativeid, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "finalize",
      descriptor = "()V",
      line = 107
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!a",
      name = "w",
      descriptor = "(Z)V",
      line = 115
   )
   public final void method134(boolean arg0) {
      this.method4625(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lgq;[II)V",
      line = 121
   )
   public final void method4650(class497 arg0, class540 arg1, int[] arg2, int arg3) {
      this.method4631(this.nativeid, ((class44)arg0).nativeid, ((class291)arg1).nativeid, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;II)V",
      line = 124
   )
   public final void method4651(class293 arg0, int arg1, int arg2) {
      this.method4649(this.nativeid, ((class696)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!a",
      name = "<init>",
      descriptor = "(Loa;II)V",
      line = 129
   )
   public class644(class722 arg0, int arg1, int arg2) {
      this.field9379 = arg0;
      this.field9382 = new class44(this.field9379);
      this.field9376 = new class44(this.field9379);
      this.field9373 = new class44(this.field9379);
      this.field9372 = new class44(this.field9379);
      this.field9383 = new class44(this.field9379);
      this.field9377 = new class44(this.field9379);
      this.field9378 = new class44(this.field9379);
      this.field9375 = new class44(this.field9379);
      this.field9374 = new class44(this.field9379);
      this.field9380 = new class44(this.field9379);
      this.method4642(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "()V",
      line = 144
   )
   public final void method4653() {
      this.field9381 = Thread.currentThread();
      this.method4629();
   }

   @OriginalMember(
      owner = "client!a",
      name = "O",
      descriptor = "(JLha;[I[I[I[SI)V"
   )
   private final native void method4624(long arg0, class66 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "E",
      descriptor = "(JZ)V"
   )
   private final native void method4625(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!a",
      name = "UA",
      descriptor = "(JJJ[II)V"
   )
   private final native void method4631(long arg0, long arg1, long arg2, int[] arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "Z",
      descriptor = "(JJIII)V"
   )
   private final native void method4634(long arg0, long arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "n",
      descriptor = "(JJIIJZI)Z"
   )
   private final native boolean method4635(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "(JJJ[III)V"
   )
   private final native void method4638(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!a",
      name = "W",
      descriptor = "(J)V"
   )
   private final native void method4639(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "ta",
      descriptor = "(JJIIIIIII[[Z)V"
   )
   private final native void method4641(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

   @OriginalMember(
      owner = "client!a",
      name = "HA",
      descriptor = "(JLha;II)V"
   )
   private final native void method4642(long arg0, class66 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "M",
      descriptor = "(J)V"
   )
   private final native void method4643(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "na",
      descriptor = "(JLha;IIIIIII)V"
   )
   private final native void method4645(long arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!a",
      name = "R",
      descriptor = "(JJIIJZ)Z"
   )
   private final native boolean method4646(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

   @OriginalMember(
      owner = "client!a",
      name = "r",
      descriptor = "(JJJIIIZ)V"
   )
   private final native void method4648(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!a",
      name = "H",
      descriptor = "(JJII)V"
   )
   private final native void method4649(long arg0, long arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "(JJ[IJ)V"
   )
   private final native void method4652(long arg0, long arg1, int[] arg2, long arg3);
}
