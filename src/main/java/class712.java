import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class712 extends class401 implements class245 {
   @OriginalMember(
      owner = "client!ja",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1541(int[] arg0) {
      this.method5278(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(Lkf;)V"
   )
   public final void method1549(class401 arg0) {
      this.method5270(this.nativeid, ((class712)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1540(int arg0) {
      this.method5268(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method1547(int arg0) {
      this.method5276(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "t",
      descriptor = "(JI)V"
   )
   private final native void method5266(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(III[I)V"
   )
   public final void method1550(int arg0, int arg1, int arg2, int[] arg3) {
      this.method5272(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "AA",
      descriptor = "(JZ)V"
   )
   private final native void method5267(long arg0, boolean arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1560(int arg0) {
      this.method5269(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "NA",
      descriptor = "(JI)V"
   )
   private final native void method5268(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "J",
      descriptor = "(JI)V"
   )
   private final native void method5269(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "l",
      descriptor = "(JJ)V"
   )
   private final native void method5270(long arg0, long arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method1552(int arg0) {
      this.method5271(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(Z)V"
   )
   public final void method625(boolean arg0) {
      this.method5267(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "VA",
      descriptor = "(JI)V"
   )
   private final native void method5271(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(JIII[I)V"
   )
   private final native void method5272(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "za",
      descriptor = "(JI)V"
   )
   private final native void method5273(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III[I)V"
   )
   public final void method1545(int arg0, int arg1, int arg2, int[] arg3) {
      this.method5277(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "va",
      descriptor = "(JIII[I)V"
   )
   private final native void method5274(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "()V"
   )
   public final void method1551() {
      this.method5279(this.nativeid);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "P",
      descriptor = "(JIIIIII)V"
   )
   private final native void method5275(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ja",
      name = "m",
      descriptor = "(JI)V"
   )
   private final native void method5276(long arg0, int arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1555(int arg0) {
      this.method5273(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1554(int arg0) {
      this.method5266(this.nativeid, arg0);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1542(int arg0, int arg1, int arg2) {
      this.method5281(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "XA",
      descriptor = "(JIII[I)V"
   )
   private final native void method5277(long arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method5275(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "w",
      descriptor = "(J[I)V"
   )
   private final native void method5278(long arg0, int[] arg1);

   @OriginalMember(
      owner = "client!ja",
      name = "u",
      descriptor = "(J)V"
   )
   private final native void method5279(long arg0);

   @OriginalMember(
      owner = "client!ja",
      name = "la",
      descriptor = "()V"
   )
   private final native void method5280();

   @OriginalMember(
      owner = "client!ja",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method1546(int arg0, int arg1, int arg2) {
      this.method5282(this.nativeid, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "FA",
      descriptor = "(JIII)V"
   )
   private final native void method5281(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(III[I)V"
   )
   public final void method1553(int arg0, int arg1, int arg2, int[] arg3) {
      this.method5274(this.nativeid, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ja",
      name = "<init>",
      descriptor = "()V"
   )
   public class712() {
      this.method5280();
   }

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "(JIII)V"
   )
   private final native void method5282(long arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ja",
      name = "a",
      descriptor = "()Lkf;"
   )
   public final class401 method1548() {
      class712 var1 = new class712();
      var1.method1549(this);
      return var1;
   }
}
