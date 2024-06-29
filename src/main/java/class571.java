import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class571 extends class763 implements class562 {
   @OriginalMember(
      owner = "client!j",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method2127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method4108(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "d",
      descriptor = "()I"
   )
   public final int method2125() {
      return this.method4113(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method2128(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class516 arg7, int arg8, int arg9) {
      this.method4098(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class50)arg7).nativeid, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1631(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method4099(this.nativeid, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "UA",
      descriptor = "(JFFFFFFIJII)V"
   )
   private final native void method4098(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1625(int arg0, int arg1, int arg2) {
      this.method4100(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "W",
      descriptor = "(JIIIII)V"
   )
   private final native void method4099(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "N",
      descriptor = "(JIII)V"
   )
   private final native void method4100(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "()I"
   )
   public final int method2129() {
      return this.method4115(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "A",
      descriptor = "(JIIII)V"
   )
   private final native void method4101(long arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(JFFFFFFIIII)V"
   )
   private final native void method4102(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "R",
      descriptor = "(JZ)V"
   )
   private final native void method4103(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!j",
      name = "ua",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   private final native void method4104(class725 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!j",
      name = "CA",
      descriptor = "(J[I)V"
   )
   private final native void method4105(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!j",
      name = "I",
      descriptor = "(J)I"
   )
   private final native int method4106(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "M",
      descriptor = "(J)I"
   )
   private final native int method4107(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(42, this);
      }

   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4109(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method167(boolean arg0) {
      this.method4103(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "P",
      descriptor = "(JIIIIIII)V"
   )
   private final native void method4108(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method1629(int arg0, int arg1, class516 arg2, int arg3, int arg4) {
      this.method4111(this.nativeid, arg0, arg1, ((class50)arg2).nativeid, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "()I"
   )
   public final int method2137() {
      return this.method4106(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "RA",
      descriptor = "(JIIIIIIII)V"
   )
   private final native void method4109(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!j",
      name = "YA",
      descriptor = "(JIIIIII)V"
   )
   private final native void method4110(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!j",
      name = "V",
      descriptor = "(JIIJII)V"
   )
   private final native void method4111(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "ma",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   private final native void method4112(class725 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "wa",
      descriptor = "(J)I"
   )
   private final native int method4113(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method2132(int arg0, int arg1, int arg2, int arg3) {
      this.method4101(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!j",
      name = "EA",
      descriptor = "(Loa;II)V"
   )
   private final native void method4114(class725 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method4110(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "JA",
      descriptor = "(J)I"
   )
   private final native int method4115(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method2135(int[] arg0) {
      this.method4105(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "h",
      descriptor = "(Loa;IIIIZ)V"
   )
   private final native void method4116(class725 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "()I"
   )
   public final int method2126() {
      return this.method4107(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method2138(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method4102(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class571(class725 arg0, int arg1, int arg2) {
      this.method4114(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   public class571(class725 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method4104(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   public class571(class725 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;IIIIZ)V"
   )
   public class571(class725 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4116(arg0, arg1, arg2, arg3, arg4, arg5);
   }
}
