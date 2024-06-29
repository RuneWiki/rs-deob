import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class685 implements class787 {
   @OriginalMember(
      owner = "client!a",
      name = "i",
      descriptor = "Loa;"
   )
   private class53 field10097;
   @OriginalMember(
      owner = "client!a",
      name = "h",
      descriptor = "Li;"
   )
   private class770 field10089;
   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "Li;"
   )
   private class770 field10095;
   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "Li;"
   )
   private class770 field10096;
   @OriginalMember(
      owner = "client!a",
      name = "l",
      descriptor = "Li;"
   )
   private class770 field10093;
   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "Li;"
   )
   private class770 field10090;
   @OriginalMember(
      owner = "client!a",
      name = "j",
      descriptor = "Li;"
   )
   private class770 field10094;
   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "Li;"
   )
   private class770 field10091;
   @OriginalMember(
      owner = "client!a",
      name = "k",
      descriptor = "Li;"
   )
   private class770 field10092;
   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "Li;"
   )
   private class770 field10098;
   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "Li;"
   )
   private class770 field10100;
   @OriginalMember(
      owner = "client!a",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;
   @OriginalMember(
      owner = "client!a",
      name = "g",
      descriptor = "Ljava/lang/Runnable;"
   )
   public Runnable field10099;

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;IIIIIII[[Z)V"
   )
   public final void method4988(class423 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
      this.method4997(this.nativeid, ((class678)arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "()V"
   )
   public final void method4989() {
      this.field10099 = Thread.currentThread();
      this.method5017();
   }

   @OriginalMember(
      owner = "client!a",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method477(boolean arg0) {
      this.method5003(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!a",
      name = "HA",
      descriptor = "(JLha;II)V"
   )
   private final native void method4990(long arg0, class479 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "na",
      descriptor = "(JLha;IIIIIII)V"
   )
   private final native void method4991(long arg0, class479 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;[ILkia;)V"
   )
   public final void method4992(class232 arg0, int[] arg1, class93 arg2) {
      this.method4999(this.nativeid, ((class770)arg0).nativeid, arg1, ((class671)arg2).nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "W",
      descriptor = "(J)V"
   )
   private final native void method4993(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "()V"
   )
   public final void method4994() {
      this.field10099 = null;
      this.method5008();
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lkia;[II)V"
   )
   public final void method4995(class232 arg0, class93 arg1, int[] arg2, int arg3) {
      this.method5011(this.nativeid, ((class770)arg0).nativeid, ((class671)arg1).nativeid, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "(JJJ[III)V"
   )
   private final native void method4996(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!a",
      name = "ta",
      descriptor = "(JJIIIIIII[[Z)V"
   )
   private final native void method4997(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;III)V"
   )
   public final void method4998(class423 arg0, int arg1, int arg2, int arg3) {
      this.method5006(this.nativeid, ((class678)arg0).nativeid, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "(JJ[IJ)V"
   )
   private final native void method4999(long arg0, long arg1, int[] arg2, long arg3);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Li;BIZ)Lka;"
   )
   public final class232 method5000(class770 arg0, byte arg1, int arg2, boolean arg3) {
      class770 var5;
      class770 var6;
      if (arg1 == 1) {
         var5 = this.field10094;
         var6 = this.field10089;
      } else if (arg1 == 2) {
         var5 = this.field10091;
         var6 = this.field10095;
      } else if (arg1 == 3) {
         var5 = this.field10092;
         var6 = this.field10096;
      } else if (arg1 == 4) {
         var5 = this.field10098;
         var6 = this.field10093;
      } else if (arg1 == 5) {
         var5 = this.field10100;
         var6 = this.field10090;
      } else {
         var6 = var5 = new class770(this.field10097);
      }

      arg0.method5555(var6, var5, arg2, arg1 != 0, arg3);
      var6.field11218 = arg0.field11218;
      var6.field11221 = arg0.field11221;
      return var6;
   }

   @OriginalMember(
      owner = "client!a",
      name = "O",
      descriptor = "(JLha;[I[I[I[SI)V"
   )
   private final native void method5001(long arg0, class479 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "R",
      descriptor = "(JJIIJZ)Z"
   )
   private final native boolean method5002(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

   @OriginalMember(
      owner = "client!a",
      name = "E",
      descriptor = "(JZ)V"
   )
   private final native void method5003(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!a",
      name = "M",
      descriptor = "(J)V"
   )
   private final native void method5004(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;[I[I[I[SI)V"
   )
   public final void method5005(class479 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
      this.method5001(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "Z",
      descriptor = "(JJIII)V"
   )
   private final native void method5006(long arg0, long arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILkia;Z)Z"
   )
   public final boolean method5007(class232 arg0, int arg1, int arg2, class93 arg3, boolean arg4) {
      return this.method5002(this.nativeid, ((class770)arg0).nativeid, arg1, arg2, ((class671)arg3).nativeid, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "()V"
   )
   private final void method5008() {
      this.method4993(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lka;IIIZ)V"
   )
   public final void method5009(class232 arg0, class232 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method5014(this.nativeid, ((class770)arg0).nativeid, ((class770)arg1).nativeid, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lkia;[III)V"
   )
   public final void method5010(class232 arg0, class93 arg1, int[] arg2, int arg3, int arg4) {
      this.method4996(this.nativeid, ((class770)arg0).nativeid, ((class671)arg1).nativeid, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "UA",
      descriptor = "(JJJ[II)V"
   )
   private final native void method5011(long arg0, long arg1, long arg2, int[] arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "n",
      descriptor = "(JJIIJZI)Z"
   )
   private final native boolean method5012(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "H",
      descriptor = "(JJII)V"
   )
   private final native void method5013(long arg0, long arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "r",
      descriptor = "(JJJIIIZ)V"
   )
   private final native void method5014(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!a",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class611.method4509(-7155, this);
      }

   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;IIIIIII)V"
   )
   public final void method5015(class479 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4991(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILkia;ZI)Z"
   )
   public final boolean method5016(class232 arg0, int arg1, int arg2, class93 arg3, boolean arg4, int arg5) {
      return this.method5012(this.nativeid, ((class770)arg0).nativeid, arg1, arg2, ((class671)arg3).nativeid, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "()V"
   )
   private final void method5017() {
      this.method5004(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;II)V"
   )
   public final void method5018(class423 arg0, int arg1, int arg2) {
      this.method5013(this.nativeid, ((class678)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!a",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class685(class53 arg0, int arg1, int arg2) {
      this.field10097 = arg0;
      this.field10089 = new class770(this.field10097);
      this.field10095 = new class770(this.field10097);
      this.field10096 = new class770(this.field10097);
      this.field10093 = new class770(this.field10097);
      this.field10090 = new class770(this.field10097);
      this.field10094 = new class770(this.field10097);
      this.field10091 = new class770(this.field10097);
      this.field10092 = new class770(this.field10097);
      this.field10098 = new class770(this.field10097);
      this.field10100 = new class770(this.field10097);
      this.method4990(this.nativeid, arg0, arg1, arg2);
   }
}
