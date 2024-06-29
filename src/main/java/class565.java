import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class565 extends class476 implements class556 {
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
   public final void method3007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method4211(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "UA",
      descriptor = "(JFFFFFFIJII)V"
   )
   private final native void method4204(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "()I"
   )
   public final int method3000() {
      return this.method4215(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "I",
      descriptor = "(J)I"
   )
   private final native int method4205(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "YA",
      descriptor = "(JIIIIII)V"
   )
   private final native void method4206(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3006(int arg0, int arg1, int arg2, int arg3) {
      this.method4208(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!j",
      name = "ma",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   private final native void method4207(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method3008(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
      this.method4204(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class50)arg7).nativeid, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "A",
      descriptor = "(JIIII)V"
   )
   private final native void method4208(long arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!j",
      name = "CA",
      descriptor = "(J[I)V"
   )
   private final native void method4209(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "()I"
   )
   public final int method3009() {
      return this.method4213(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "EA",
      descriptor = "(Loa;II)V"
   )
   private final native void method4210(class721 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!j",
      name = "P",
      descriptor = "(JIIIIIII)V"
   )
   private final native void method4211(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "h",
      descriptor = "(Loa;IIIIZ)V"
   )
   private final native void method4212(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!j",
      name = "wa",
      descriptor = "(J)I"
   )
   private final native int method4213(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "RA",
      descriptor = "(JIIIIIIII)V"
   )
   private final native void method4214(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!j",
      name = "JA",
      descriptor = "(J)I"
   )
   private final native int method4215(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method3001(int[] arg0) {
      this.method4209(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "N",
      descriptor = "(JIII)V"
   )
   private final native void method4216(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public final void method1059(int arg0, int arg1, class510 arg2, int arg3, int arg4) {
      this.method4218(this.nativeid, arg0, arg1, ((class50)arg2).nativeid, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;II)V"
   )
   public class565(class721 arg0, int arg1, int arg2) {
      this.method4210(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "W",
      descriptor = "(JIIIII)V"
   )
   private final native void method4217(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "V",
      descriptor = "(JIIJII)V"
   )
   private final native void method4218(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "d",
      descriptor = "()I"
   )
   public final int method3005() {
      return this.method4205(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method4217(this.nativeid, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method4206(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   public class565(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method4222(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method139(boolean arg0) {
      this.method4219(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "()I"
   )
   public final int method3002() {
      return this.method4220(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method3003(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method4221(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1056(int arg0, int arg1, int arg2) {
      this.method4216(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4214(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "R",
      descriptor = "(JZ)V"
   )
   private final native void method4219(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!j",
      name = "M",
      descriptor = "(J)I"
   )
   private final native int method4220(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(JFFFFFFIIII)V"
   )
   private final native void method4221(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   public class565(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method4207(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "ua",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   private final native void method4222(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;IIIIZ)V"
   )
   public class565(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method4212(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)118, this);
      }

   }
}
