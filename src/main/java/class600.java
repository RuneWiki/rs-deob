import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class600 extends class148 implements class64 {
   @OriginalMember(
      owner = "client!j",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!j",
      name = "ua",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   private final native void method4410(class473 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!j",
      name = "R",
      descriptor = "(JZ)V"
   )
   private final native void method4411(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!j",
      name = "N",
      descriptor = "(JIII)V"
   )
   private final native void method4412(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!j",
      name = "P",
      descriptor = "(JIIIIIII)V"
   )
   private final native void method4413(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "JA",
      descriptor = "(J)I"
   )
   private final native int method4414(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "M",
      descriptor = "(J)I"
   )
   private final native int method4415(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "ma",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   private final native void method4416(class473 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "EA",
      descriptor = "(Loa;II)V"
   )
   private final native void method4417(class473 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!j",
      name = "h",
      descriptor = "(Loa;IIIIZ)V"
   )
   private final native void method4418(class473 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!j",
      name = "d",
      descriptor = "()I"
   )
   public final int method1356() {
      return this.method4414(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4424(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "CA",
      descriptor = "(J[I)V"
   )
   private final native void method4419(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!j",
      name = "W",
      descriptor = "(JIIIII)V"
   )
   private final native void method4420(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "()I"
   )
   public final int method1354() {
      return this.method4428(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method633(boolean arg0) {
      this.method4411(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "wa",
      descriptor = "(J)I"
   )
   private final native int method4421(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "()I"
   )
   public final int method1351() {
      return this.method4421(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "UA",
      descriptor = "(JFFFFFFIJII)V"
   )
   private final native void method4422(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method1347(int arg0, int arg1, class684 arg2, int arg3, int arg4) {
      this.method4427(this.nativeid, arg0, arg1, ((class636)arg2).nativeid, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "YA",
      descriptor = "(JIIIIII)V"
   )
   private final native void method4423(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1344(int[] arg0) {
      this.method4419(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method4423(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method4420(this.nativeid, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "RA",
      descriptor = "(JIIIIIIII)V"
   )
   private final native void method4424(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method1346(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method4425(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(JFFFFFFIIII)V"
   )
   private final native void method4425(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "A",
      descriptor = "(JIIII)V"
   )
   private final native void method4426(long arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method1343(int arg0, int arg1, int arg2, int arg3) {
      this.method4426(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class600(class473 arg0, int arg1, int arg2) {
      this.method4417(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1360(int arg0, int arg1, int arg2) {
      this.method4412(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method1349(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class684 arg7, int arg8, int arg9) {
      this.method4422(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class636)arg7).nativeid, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   public class600(class473 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method4410(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "V",
      descriptor = "(JIIJII)V"
   )
   private final native void method4427(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   public class600(class473 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4416(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "I",
      descriptor = "(J)I"
   )
   private final native int method4428(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method4413(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "()I"
   )
   public final int method1350() {
      return this.method4415(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;IIIIZ)V"
   )
   public class600(class473 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4418(arg0, arg1, arg2, arg3, arg4, arg5);
   }
}
