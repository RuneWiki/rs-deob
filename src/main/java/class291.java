import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class291 extends class173 implements class556 {
   @OriginalMember(
      owner = "client!ja",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ja",
      name = "t",
      descriptor = "(JI)V"
   )
   private final native void method2255(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method981(int arg0) {
      this.method2255(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(III[I)V"
   )
   public final void method1001(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2257(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "la",
      descriptor = "()V"
   )
   private final native void method2256();

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(JIII[I)V"
   )
   private final native void method2257(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method994(int arg0) {
      this.method2259(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1002(int arg0) {
      this.method2258(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "VA",
      descriptor = "(JI)V"
   )
   private final native void method2258(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1008(int arg0, int arg1, int arg2) {
      this.method2264(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "NA",
      descriptor = "(JI)V"
   )
   private final native void method2259(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method976(int[] arg0) {
      this.method2263(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "J",
      descriptor = "(JI)V"
   )
   private final native void method2260(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "<init>",
      descriptor = "()V"
   )
   public class291() {
      this.method2256();
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(JIII)V"
   )
   private final native void method2261(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method990(int arg0, int arg1, int arg2) {
      this.method2261(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "P",
      descriptor = "(JIIIIII)V"
   )
   private final native void method2262(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ja",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1005(int arg0) {
      this.method2270(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III[I)V"
   )
   public final void method988(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2267(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1015(int arg0) {
      this.method2266(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(J[I)V"
   )
   private final native void method2263(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "FA",
      descriptor = "(JIII)V"
   )
   private final native void method2264(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method139(boolean arg0) {
      this.method2269(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public final void method982(class173 arg0) {
      this.method2265(this.nativeid, ((class291)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method998(int arg0) {
      this.method2260(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "()Ldfa;"
   )
   public final class173 method999() {
      class291 var1 = new class291();
      var1.method982(this);
      return var1;
   }

   @OriginalMember(
      owner = "client!ja",
      name = "l",
      descriptor = "(JJ)V"
   )
   private final native void method2265(long arg0, long arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III[I)V"
   )
   public final void method986(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2271(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "za",
      descriptor = "(JI)V"
   )
   private final native void method2266(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "()V"
   )
   public final void method979() {
      this.method2268(this.nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "va",
      descriptor = "(JIII[I)V"
   )
   private final native void method2267(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "u",
      descriptor = "(J)V"
   )
   private final native void method2268(long arg0);

   @OriginalMember(
      owner = "client!ja",
      name = "AA",
      descriptor = "(JZ)V"
   )
   private final native void method2269(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method2262(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "m",
      descriptor = "(JI)V"
   )
   private final native void method2270(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "XA",
      descriptor = "(JIII[I)V"
   )
   private final native void method2271(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)92, this);
      }

   }
}
