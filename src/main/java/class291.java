import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class291 extends class540 implements class558 {
   @OriginalMember(
      owner = "client!ja",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ja",
      name = "XA",
      descriptor = "(JIII[I)V"
   )
   private final native void method2211(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(JIII[I)V"
   )
   private final native void method2212(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(III[I)V"
   )
   public final void method1526(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2211(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1529(int arg0) {
      this.method2220(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "<init>",
      descriptor = "()V"
   )
   public class291() {
      this.method2224();
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method2226(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method1512(int arg0, int arg1, int arg2) {
      this.method2223(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "NA",
      descriptor = "(JI)V"
   )
   private final native void method2213(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "va",
      descriptor = "(JIII[I)V"
   )
   private final native void method2214(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "FA",
      descriptor = "(JIII)V"
   )
   private final native void method2215(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "()Lgq;"
   )
   public final class540 method1520() {
      class291 var1 = new class291();
      var1.method1513(this);
      return var1;
   }

   @OriginalMember(
      owner = "client!ja",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1522(int arg0) {
      this.method2218(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III[I)V"
   )
   public final void method1523(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2214(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!ja",
      name = "m",
      descriptor = "(JI)V"
   )
   private final native void method2216(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1524(int arg0) {
      this.method2213(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1530(int arg0, int arg1, int arg2) {
      this.method2215(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "J",
      descriptor = "(JI)V"
   )
   private final native void method2217(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method134(boolean arg0) {
      this.method2222(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1531(int arg0) {
      this.method2217(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public final void method1513(class540 arg0) {
      this.method2227(this.nativeid, ((class291)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1528(int[] arg0) {
      this.method2225(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1516(int arg0) {
      this.method2219(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "za",
      descriptor = "(JI)V"
   )
   private final native void method2218(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "t",
      descriptor = "(JI)V"
   )
   private final native void method2219(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "VA",
      descriptor = "(JI)V"
   )
   private final native void method2220(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "u",
      descriptor = "(J)V"
   )
   private final native void method2221(long arg0);

   @OriginalMember(
      owner = "client!ja",
      name = "AA",
      descriptor = "(JZ)V"
   )
   private final native void method2222(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(JIII)V"
   )
   private final native void method2223(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "la",
      descriptor = "()V"
   )
   private final native void method2224();

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III[I)V"
   )
   public final void method1521(int arg0, int arg1, int arg2, int[] arg3) {
      this.method2212(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(J[I)V"
   )
   private final native void method2225(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "P",
      descriptor = "(JIIIIII)V"
   )
   private final native void method2226(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "()V"
   )
   public final void method1525() {
      this.method2221(this.nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "l",
      descriptor = "(JJ)V"
   )
   private final native void method2227(long arg0, long arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1515(int arg0) {
      this.method2216(this.nativeid, arg0);
   }
}
