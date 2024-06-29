import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class661 implements class245 {
   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "Loa;"
   )
   private class74 field9913;
   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "Li;"
   )
   private class270 field9917;
   @OriginalMember(
      owner = "client!a",
      name = "k",
      descriptor = "Li;"
   )
   private class270 field9922;
   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "Li;"
   )
   private class270 field9916;
   @OriginalMember(
      owner = "client!a",
      name = "j",
      descriptor = "Li;"
   )
   private class270 field9914;
   @OriginalMember(
      owner = "client!a",
      name = "h",
      descriptor = "Li;"
   )
   private class270 field9918;
   @OriginalMember(
      owner = "client!a",
      name = "g",
      descriptor = "Li;"
   )
   private class270 field9915;
   @OriginalMember(
      owner = "client!a",
      name = "l",
      descriptor = "Li;"
   )
   private class270 field9911;
   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "Li;"
   )
   private class270 field9912;
   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "Li;"
   )
   private class270 field9919;
   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "Li;"
   )
   private class270 field9921;
   @OriginalMember(
      owner = "client!a",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;
   @OriginalMember(
      owner = "client!a",
      name = "i",
      descriptor = "Ljava/lang/Runnable;"
   )
   public Runnable field9920;

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lkf;[II)V"
   )
   public final void method4870(class91 arg0, class401 arg1, int[] arg2, int arg3) {
      this.method4886(this.nativeid, ((class270)arg0).nativeid, ((class712)arg1).nativeid, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "M",
      descriptor = "(J)V"
   )
   private final native void method4871(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "W",
      descriptor = "(J)V"
   )
   private final native void method4872(long arg0);

   @OriginalMember(
      owner = "client!a",
      name = "H",
      descriptor = "(JJII)V"
   )
   private final native void method4873(long arg0, long arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "na",
      descriptor = "(JLha;IIIIIII)V"
   )
   private final native void method4874(long arg0, class610 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!a",
      name = "c",
      descriptor = "()V"
   )
   private final void method4875() {
      this.method4872(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Li;BIZ)Lka;"
   )
   public final class91 method4876(class270 arg0, byte arg1, int arg2, boolean arg3) {
      class270 var5;
      class270 var6;
      if (arg1 == 1) {
         var5 = this.field9915;
         var6 = this.field9917;
      } else if (arg1 == 2) {
         var5 = this.field9911;
         var6 = this.field9922;
      } else if (arg1 == 3) {
         var5 = this.field9912;
         var6 = this.field9916;
      } else if (arg1 == 4) {
         var5 = this.field9919;
         var6 = this.field9914;
      } else if (arg1 == 5) {
         var5 = this.field9921;
         var6 = this.field9918;
      } else {
         var6 = var5 = new class270(this.field9913);
      }

      arg0.method2306(var6, var5, arg2, arg1 != 0, arg3);
      var6.field4372 = arg0.field4372;
      var6.field4371 = arg0.field4371;
      return var6;
   }

   @OriginalMember(
      owner = "client!a",
      name = "ta",
      descriptor = "(JJIIIIIII[[Z)V"
   )
   private final native void method4877(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILkf;Z)Z"
   )
   public final boolean method4878(class91 arg0, int arg1, int arg2, class401 arg3, boolean arg4) {
      return this.method4884(this.nativeid, ((class270)arg0).nativeid, arg1, arg2, ((class712)arg3).nativeid, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;II)V"
   )
   public final void method4879(class271 arg0, int arg1, int arg2) {
      this.method4873(this.nativeid, ((class350)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!a",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;IILkf;ZI)Z"
   )
   public final boolean method4880(class91 arg0, int arg1, int arg2, class401 arg3, boolean arg4, int arg5) {
      return this.method4897(this.nativeid, ((class270)arg0).nativeid, arg1, arg2, ((class712)arg3).nativeid, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "b",
      descriptor = "()V"
   )
   public final void method4881() {
      this.field9920 = Thread.currentThread();
      this.method4895();
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lkf;[III)V"
   )
   public final void method4882(class91 arg0, class401 arg1, int[] arg2, int arg3, int arg4) {
      this.method4894(this.nativeid, ((class270)arg0).nativeid, ((class712)arg1).nativeid, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!a",
      name = "d",
      descriptor = "()V"
   )
   public final void method4883() {
      this.field9920 = null;
      this.method4875();
   }

   @OriginalMember(
      owner = "client!a",
      name = "R",
      descriptor = "(JJIIJZ)Z"
   )
   private final native boolean method4884(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;[I[I[I[SI)V"
   )
   public final void method4885(class610 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
      this.method4891(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "UA",
      descriptor = "(JJJ[II)V"
   )
   private final native void method4886(long arg0, long arg1, long arg2, int[] arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "HA",
      descriptor = "(JLha;II)V"
   )
   private final native void method4887(long arg0, class610 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!a",
      name = "e",
      descriptor = "(JJ[IJ)V"
   )
   private final native void method4888(long arg0, long arg1, int[] arg2, long arg3);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;IIIIIII[[Z)V"
   )
   public final void method4889(class271 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
      this.method4877(this.nativeid, ((class350)arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!a",
      name = "Z",
      descriptor = "(JJIII)V"
   )
   private final native void method4890(long arg0, long arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!a",
      name = "O",
      descriptor = "(JLha;[I[I[I[SI)V"
   )
   private final native void method4891(long arg0, class610 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "E",
      descriptor = "(JZ)V"
   )
   private final native void method4892(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lha;IIIIIII)V"
   )
   public final void method4893(class610 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4874(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!a",
      name = "f",
      descriptor = "(JJJ[III)V"
   )
   private final native void method4894(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "()V"
   )
   private final void method4895() {
      this.method4871(this.nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;[ILkf;)V"
   )
   public final void method4896(class91 arg0, int[] arg1, class401 arg2) {
      this.method4888(this.nativeid, ((class270)arg0).nativeid, arg1, ((class712)arg2).nativeid);
   }

   @OriginalMember(
      owner = "client!a",
      name = "n",
      descriptor = "(JJIIJZI)Z"
   )
   private final native boolean method4897(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

   @OriginalMember(
      owner = "client!a",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method625(boolean arg0) {
      this.method4892(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!a",
      name = "r",
      descriptor = "(JJJIIIZ)V"
   )
   private final native void method4898(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Ls;III)V"
   )
   public final void method4899(class271 arg0, int arg1, int arg2, int arg3) {
      this.method4890(this.nativeid, ((class350)arg0).nativeid, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!a",
      name = "a",
      descriptor = "(Lka;Lka;IIIZ)V"
   )
   public final void method4900(class91 arg0, class91 arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4898(this.nativeid, ((class270)arg0).nativeid, ((class270)arg1).nativeid, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!a",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class661(class74 arg0, int arg1, int arg2) {
      this.field9913 = arg0;
      this.field9917 = new class270(this.field9913);
      this.field9922 = new class270(this.field9913);
      this.field9916 = new class270(this.field9913);
      this.field9914 = new class270(this.field9913);
      this.field9918 = new class270(this.field9913);
      this.field9915 = new class270(this.field9913);
      this.field9911 = new class270(this.field9913);
      this.field9912 = new class270(this.field9913);
      this.field9919 = new class270(this.field9913);
      this.field9921 = new class270(this.field9913);
      this.method4887(this.nativeid, arg0, arg1, arg2);
   }
}
