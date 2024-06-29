import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class293 extends class521 implements class560 {
   @OriginalMember(
      owner = "client!ja",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1218(int arg0) {
      this.method2213(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "l",
      descriptor = "(JJ)V"
   )
   private final native void method2199(long arg0, long arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III[I)V"
   )
   public final void method1227(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2215(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1225(int[] arg0) {
      this.method2203(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "m",
      descriptor = "(JI)V"
   )
   private final native void method2200(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "VA",
      descriptor = "(JI)V"
   )
   private final native void method2201(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "NA",
      descriptor = "(JI)V"
   )
   private final native void method2202(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(J[I)V"
   )
   private final native void method2203(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(JIII)V"
   )
   private final native void method2204(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1221(int arg0) {
      this.method2202(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1224(int arg0) {
      this.method2201(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "la",
      descriptor = "()V"
   )
   private final native void method2205();

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public final void method1230(class521 arg0) {
      this.method2199(this.nativeid, ((class293)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method2207(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method1215(int arg0, int arg1, int arg2) {
      this.method2204(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "u",
      descriptor = "(J)V"
   )
   private final native void method2206(long arg0);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III[I)V"
   )
   public final void method1216(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2209(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1217(int arg0, int arg1, int arg2) {
      this.method2212(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "P",
      descriptor = "(JIIIIII)V"
   )
   private final native void method2207(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ja",
      name = "AA",
      descriptor = "(JZ)V"
   )
   private final native void method2208(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "va",
      descriptor = "(JIII[I)V"
   )
   private final native void method2209(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(III[I)V"
   )
   public final void method1222(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2214(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "za",
      descriptor = "(JI)V"
   )
   private final native void method2210(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!ja",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1228(int arg0) {
      this.method2211(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "J",
      descriptor = "(JI)V"
   )
   private final native void method2211(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "FA",
      descriptor = "(JIII)V"
   )
   private final native void method2212(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "t",
      descriptor = "(JI)V"
   )
   private final native void method2213(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1223(int arg0) {
      this.method2200(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "()Lew;"
   )
   public final class521 method1219() {
      class293 var1 = new class293();
      var1.method1230(this);
      return var1;
   }

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method113(boolean arg0) {
      this.method2208(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "()V"
   )
   public final void method1220() {
      this.method2206(this.nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "XA",
      descriptor = "(JIII[I)V"
   )
   private final native void method2214(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "<init>",
      descriptor = "()V"
   )
   public class293() {
      this.method2205();
   }

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(JIII[I)V"
   )
   private final native void method2215(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1229(int arg0) {
      this.method2210(this.nativeid, arg0);
   }
}
