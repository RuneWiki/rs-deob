import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class567 extends class396 implements class558 {
   @OriginalMember(
      owner = "client!j",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method4185(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method4194(this.nativeid, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "ua",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   private final native void method4184(class722 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!j",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!j",
      name = "YA",
      descriptor = "(JIIIIII)V"
   )
   private final native void method4185(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!j",
      name = "EA",
      descriptor = "(Loa;II)V"
   )
   private final native void method4186(class722 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!j",
      name = "R",
      descriptor = "(JZ)V"
   )
   private final native void method4187(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!j",
      name = "JA",
      descriptor = "(J)I"
   )
   private final native int method4188(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4197(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1969(int[] arg0) {
      this.method4189(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "CA",
      descriptor = "(J[I)V"
   )
   private final native void method4189(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method1973(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method4199(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "V",
      descriptor = "(JIIJII)V"
   )
   private final native void method4190(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "M",
      descriptor = "(J)I"
   )
   private final native int method4191(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method262(int arg0, int arg1, class512 arg2, int arg3, int arg4) {
      this.method4190(this.nativeid, arg0, arg1, ((class51)arg2).nativeid, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "()I"
   )
   public final int method1971() {
      return this.method4195(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class567(class722 arg0, int arg1, int arg2) {
      this.method4186(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method1976(int arg0, int arg1, int arg2, int arg3) {
      this.method4202(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!j",
      name = "I",
      descriptor = "(J)I"
   )
   private final native int method4192(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "h",
      descriptor = "(Loa;IIIIZ)V"
   )
   private final native void method4193(class722 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!j",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method134(boolean arg0) {
      this.method4187(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method4198(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "d",
      descriptor = "()I"
   )
   public final int method1965() {
      return this.method4191(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "W",
      descriptor = "(JIIIII)V"
   )
   private final native void method4194(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "wa",
      descriptor = "(J)I"
   )
   private final native int method4195(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "()I"
   )
   public final int method1967() {
      return this.method4192(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "N",
      descriptor = "(JIII)V"
   )
   private final native void method4196(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!j",
      name = "RA",
      descriptor = "(JIIIIIIII)V"
   )
   private final native void method4197(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!j",
      name = "P",
      descriptor = "(JIIIIIII)V"
   )
   private final native void method4198(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   public class567(class722 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method4184(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   public class567(class722 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(JFFFFFFIIII)V"
   )
   private final native void method4199(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;IIIIZ)V"
   )
   public class567(class722 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4193(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "UA",
      descriptor = "(JFFFFFFIJII)V"
   )
   private final native void method4200(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "()I"
   )
   public final int method1975() {
      return this.method4188(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method1970(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
      this.method4200(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class51)arg7).nativeid, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method263(int arg0, int arg1, int arg2) {
      this.method4196(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "ma",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   private final native void method4201(class722 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "A",
      descriptor = "(JIIII)V"
   )
   private final native void method4202(long arg0, int arg1, int arg2, int arg3, int arg4);
}
