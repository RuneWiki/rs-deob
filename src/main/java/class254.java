import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class254 extends class672 implements class245 {
   @OriginalMember(
      owner = "client!j",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(III)V",
      line = 3
   )
   public final void method935(int arg0, int arg1, int arg2) {
      this.method2144(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIII)V",
      line = 8
   )
   public final void method938(int arg0, int arg1, int arg2, int arg3, int arg4) {
      this.method2153(this.nativeid, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "finalize",
      descriptor = "()V",
      line = 13
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "(IIII)V",
      line = 22
   )
   public final void method2107(int arg0, int arg1, int arg2, int arg3) {
      this.method2157(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 25
   )
   public final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method2141(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IILaa;II)V",
      line = 29
   )
   public final void method939(int arg0, int arg1, class96 arg2, int arg3, int arg4) {
      this.method2139(this.nativeid, arg0, arg1, ((class575)arg2).nativeid, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "()I",
      line = 35
   )
   public final int method2104() {
      return this.method2156(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFIIII)V",
      line = 39
   )
   public final void method2096(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      this.method2149(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "([I)V",
      line = 42
   )
   public final void method2102(int[] arg0) {
      this.method2147(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "c",
      descriptor = "()I",
      line = 46
   )
   public final int method2095() {
      return this.method2143(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(IIIIIII)V",
      line = 50
   )
   public final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method2142(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "d",
      descriptor = "()I",
      line = 53
   )
   public final int method2106() {
      return this.method2155(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 61
   )
   public final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method2145(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "()I",
      line = 66
   )
   public final int method2108() {
      return this.method2150(this.nativeid);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;II)V",
      line = 70
   )
   public class254(class74 arg0, int arg1, int arg2) {
      this.method2146(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[IIIIIZ)V",
      line = 73
   )
   public class254(class74 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method2148(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;[I[B[BIIII)V",
      line = 76
   )
   public class254(class74 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
      this.method2152(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!j",
      name = "<init>",
      descriptor = "(Loa;IIIIZ)V",
      line = 79
   )
   public class254(class74 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      this.method2154(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!j",
      name = "w",
      descriptor = "(Z)V",
      line = 83
   )
   public final void method625(boolean arg0) {
      this.method2140(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!j",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V",
      line = 86
   )
   public final void method2097(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class96 arg7, int arg8, int arg9) {
      this.method2151(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class575)arg7).nativeid, arg8, arg9);
   }

   @OriginalMember(
      owner = "client!j",
      name = "V",
      descriptor = "(JIIJII)V"
   )
   private final native void method2139(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "R",
      descriptor = "(JZ)V"
   )
   private final native void method2140(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!j",
      name = "YA",
      descriptor = "(JIIIIII)V"
   )
   private final native void method2141(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!j",
      name = "P",
      descriptor = "(JIIIIIII)V"
   )
   private final native void method2142(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "I",
      descriptor = "(J)I"
   )
   private final native int method2143(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "N",
      descriptor = "(JIII)V"
   )
   private final native void method2144(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!j",
      name = "RA",
      descriptor = "(JIIIIIIII)V"
   )
   private final native void method2145(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!j",
      name = "EA",
      descriptor = "(Loa;II)V"
   )
   private final native void method2146(class74 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!j",
      name = "CA",
      descriptor = "(J[I)V"
   )
   private final native void method2147(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!j",
      name = "ua",
      descriptor = "(Loa;[IIIIIZ)V"
   )
   private final native void method2148(class74 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!j",
      name = "b",
      descriptor = "(JFFFFFFIIII)V"
   )
   private final native void method2149(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "JA",
      descriptor = "(J)I"
   )
   private final native int method2150(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "UA",
      descriptor = "(JFFFFFFIJII)V"
   )
   private final native void method2151(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

   @OriginalMember(
      owner = "client!j",
      name = "ma",
      descriptor = "(Loa;[I[B[BIIII)V"
   )
   private final native void method2152(class74 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!j",
      name = "W",
      descriptor = "(JIIIII)V"
   )
   private final native void method2153(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!j",
      name = "h",
      descriptor = "(Loa;IIIIZ)V"
   )
   private final native void method2154(class74 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!j",
      name = "wa",
      descriptor = "(J)I"
   )
   private final native int method2155(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "M",
      descriptor = "(J)I"
   )
   private final native int method2156(long arg0);

   @OriginalMember(
      owner = "client!j",
      name = "A",
      descriptor = "(JIIII)V"
   )
   private final native void method2157(long arg0, int arg1, int arg2, int arg3, int arg4);
}
