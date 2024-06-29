import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class649 implements class562 {
   @OriginalMember(
      owner = "client!a",
      name = "j",
      descriptor = "Loa;"
   )
   private class725 field9107;
   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "Li;"
   )
   private class43 field9105;
   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "Li;"
   )
   private class43 field9100;
   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "Li;"
   )
   private class43 field9098;
   @OriginalMember(
      owner = "client!a",
      name = "k",
      descriptor = "Li;"
   )
   private class43 field9099;
   @OriginalMember(
      owner = "client!a",
      name = "l",
      descriptor = "Li;"
   )
   private class43 field9097;
   @OriginalMember(
      owner = "client!a",
      name = "i",
      descriptor = "Li;"
   )
   private class43 field9096;
   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "Li;"
   )
   private class43 field9101;
   @OriginalMember(
      owner = "client!a",
      name = "h",
      descriptor = "Li;"
   )
   private class43 field9106;
   @OriginalMember(
      owner = "client!a",
      name = "g",
      descriptor = "Li;"
   )
   private class43 field9103;
   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "Li;"
   )
   private class43 field9102;
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
   public Runnable field9104;

   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "(JJ[IJ)V"
   )
   private final native void method4679(long arg0, long arg1, int[] arg2, long arg3);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;IIIIIII)V"
   )
   public final void method4680(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4682(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILkh;Z)Z"
   )
   public final boolean method4681(class501 arg0, int arg1, int arg2, class17 arg3, boolean arg4) {
      return this.method4695(this.nativeid, ((class43)arg0).nativeid, arg1, arg2, ((class293)arg3).nativeid, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "na",
      descriptor = "(JLha;IIIIIII)V"
   )
   private final native void method4682(long arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;IIIIIII[[Z)V"
   )
   public final void method4683(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
      this.method4694(this.nativeid, ((class699)arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!a",
      name = "O",
      descriptor = "(JLha;[I[I[I[SI)V"
   )
   private final native void method4684(long arg0, class65 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILkh;ZI)Z"
   )
   public final boolean method4685(class501 arg0, int arg1, int arg2, class17 arg3, boolean arg4, int arg5) {
      return this.method4706(this.nativeid, ((class43)arg0).nativeid, arg1, arg2, ((class293)arg3).nativeid, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "UA",
      descriptor = "(JJJ[II)V"
   )
   private final native void method4686(long arg0, long arg1, long arg2, int[] arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(68, this);
      }

   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;[ILkh;)V"
   )
   public final void method4687(class501 arg0, int[] arg1, class17 arg2) {
      this.method4679(this.nativeid, ((class43)arg0).nativeid, arg1, ((class293)arg2).nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "HA",
      descriptor = "(JLha;II)V"
   )
   private final native void method4688(long arg0, class65 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "E",
      descriptor = "(JZ)V"
   )
   private final native void method4689(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!a",
      name = "M",
      descriptor = "(J)V"
   )
   private final native void method4690(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "H",
      descriptor = "(JJII)V"
   )
   private final native void method4691(long arg0, long arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "()V"
   )
   public final void method4692() {
      this.field9104 = null;
      this.method4702();
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;III)V"
   )
   public final void method4693(class295 arg0, int arg1, int arg2, int arg3) {
      this.method4709(this.nativeid, ((class699)arg0).nativeid, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "ta",
      descriptor = "(JJIIIIIII[[Z)V"
   )
   private final native void method4694(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

   @OriginalMember(
      owner = "client!a",
      name = "R",
      descriptor = "(JJIIJZ)Z"
   )
   private final native boolean method4695(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "(JJJ[III)V"
   )
   private final native void method4696(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lkh;[II)V"
   )
   public final void method4697(class501 arg0, class17 arg1, int[] arg2, int arg3) {
      this.method4686(this.nativeid, ((class43)arg0).nativeid, ((class293)arg1).nativeid, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method167(boolean arg0) {
      this.method4689(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lkh;[III)V"
   )
   public final void method4698(class501 arg0, class17 arg1, int[] arg2, int arg3, int arg4) {
      this.method4696(this.nativeid, ((class43)arg0).nativeid, ((class293)arg1).nativeid, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "r",
      descriptor = "(JJJIIIZ)V"
   )
   private final native void method4699(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "()V"
   )
   private final void method4700() {
      this.method4690(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "W",
      descriptor = "(J)V"
   )
   private final native void method4701(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "()V"
   )
   private final void method4702() {
      this.method4701(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;[I[I[I[SI)V"
   )
   public final void method4703(class65 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
      this.method4684(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Li;BIZ)Lka;"
   )
   public final class501 method4704(class43 arg0, byte arg1, int arg2, boolean arg3) {
      class43 var5;
      class43 var6;
      if (arg1 == 1) {
         var5 = this.field9096;
         var6 = this.field9105;
      } else if (arg1 == 2) {
         var5 = this.field9101;
         var6 = this.field9100;
      } else if (arg1 == 3) {
         var5 = this.field9106;
         var6 = this.field9098;
      } else if (arg1 == 4) {
         var5 = this.field9103;
         var6 = this.field9099;
      } else if (arg1 == 5) {
         var5 = this.field9102;
         var6 = this.field9097;
      } else {
         var6 = var5 = new class43(this.field9107);
      }

      arg0.method333(var6, var5, arg2, arg1 != 0, arg3);
      var6.field499 = arg0.field499;
      var6.field498 = arg0.field498;
      return var6;
   }

   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "()V"
   )
   public final void method4705() {
      this.field9104 = Thread.currentThread();
      this.method4700();
   }

   @OriginalMember(
      owner = "client!a",
      name = "n",
      descriptor = "(JJIIJZI)Z"
   )
   private final native boolean method4706(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;II)V"
   )
   public final void method4707(class295 arg0, int arg1, int arg2) {
      this.method4691(this.nativeid, ((class699)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!a",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class649(class725 arg0, int arg1, int arg2) {
      this.field9107 = arg0;
      this.field9105 = new class43(this.field9107);
      this.field9100 = new class43(this.field9107);
      this.field9098 = new class43(this.field9107);
      this.field9099 = new class43(this.field9107);
      this.field9097 = new class43(this.field9107);
      this.field9096 = new class43(this.field9107);
      this.field9101 = new class43(this.field9107);
      this.field9106 = new class43(this.field9107);
      this.field9103 = new class43(this.field9107);
      this.field9102 = new class43(this.field9107);
      this.method4688(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lka;IIIZ)V"
   )
   public final void method4708(class501 arg0, class501 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4699(this.nativeid, ((class43)arg0).nativeid, ((class43)arg1).nativeid, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "Z",
      descriptor = "(JJIII)V"
   )
   private final native void method4709(long arg0, long arg1, int arg2, int arg3, int arg4);
}
