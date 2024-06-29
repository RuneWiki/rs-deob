import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class695 extends class293 implements class556 {
   @OriginalMember(
      owner = "client!t",
      name = "k",
      descriptor = "Liw;"
   )
   private class332 field10190 = new class332();
   @OriginalMember(
      owner = "client!t",
      name = "l",
      descriptor = "I"
   )
   private int field10191 = -1;
   @OriginalMember(
      owner = "client!t",
      name = "j",
      descriptor = "Loa;"
   )
   private class721 field10189;
   @OriginalMember(
      owner = "client!t",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(II)V",
      line = 7
   )
   public final void method2279(int arg0, int arg1) {
      if (this.field10191 < 0) {
         this.field10189.method5217().method4714(this, arg0, arg1);
      } else {
         this.field10189.method5217().method4723(this, arg0, arg1, this.field10191);
      }
   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V",
      line = 18
   )
   public final void method2282(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
      boolean var18 = false;
      if (arg9 != null) {
         int[] var19 = arg9;

         for(int var20 = 0; var20 < var19.length; ++var20) {
            int var21 = var19[var20];
            if (var21 != -1) {
               var18 = true;
               break;
            }
         }
      }

      int var22 = arg9.length;
      int[] var23 = new int[var22 * 3];
      int[] var24 = new int[var22 * 3];
      int[] var25 = new int[var22 * 3];
      int[] var26 = new int[var22 * 3];
      int[] var27 = new int[var22 * 3];
      int[] var28 = arg10 != null ? new int[var22 * 3] : null;
      int[] var29 = arg3 != null ? new int[var22 * 3] : null;
      int[] var30 = arg5 != null ? new int[var22 * 3] : null;
      int var31 = 0;

      for(int var32 = 0; var32 < var22; ++var32) {
         int var33 = arg6[var32];
         int var34 = arg7[var32];
         int var35 = arg8[var32];
         var23[var31] = arg2[var33];
         var24[var31] = arg4[var33];
         var25[var31] = arg9[var32];
         var26[var31] = arg11[var32];
         var27[var31] = arg12[var32];
         if (arg10 != null) {
            var28[var31] = arg10[var32];
         }

         if (arg3 != null) {
            var29[var31] = arg3[var33];
         }

         if (arg5 != null) {
            var30[var31] = arg5[var33];
         }

         ++var31;
         var23[var31] = arg2[var34];
         var24[var31] = arg4[var34];
         var25[var31] = arg9[var32];
         var26[var31] = arg11[var32];
         var27[var31] = arg12[var32];
         if (arg10 != null) {
            var28[var31] = arg10[var32];
         }

         if (arg3 != null) {
            var29[var31] = arg3[var34];
         }

         if (arg5 != null) {
            var30[var31] = arg5[var34];
         }

         ++var31;
         var23[var31] = arg2[var35];
         var24[var31] = arg4[var35];
         var25[var31] = arg9[var32];
         var26[var31] = arg11[var32];
         var27[var31] = arg12[var32];
         if (arg10 != null) {
            var28[var31] = arg10[var32];
         }

         if (arg3 != null) {
            var29[var31] = arg3[var35];
         }

         if (arg5 != null) {
            var30[var31] = arg5[var35];
         }

         ++var31;
      }

      if (var18 || var28 != null) {
         this.method2292(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(III[[ZZI)V",
      line = 129
   )
   public final void method2284(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      this.field10191 = -1;
      int var7 = 0;
      float[] var8 = new float[this.field10190.method2575(-98)];

      for(class622 var9 = (class622)this.field10190.method2579(-801); var9 != null; var9 = (class622)this.field10190.method2583(1)) {
         var8[var7++] = var9.method4556((byte)114);
      }

      this.method5054(var8);

      for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
         for(int var11 = 0; var11 < arg2 + arg2; ++var11) {
            if (arg3[var10][var11]) {
               int var12 = arg0 - arg2 + var10;
               int var13 = arg1 - arg2 + var11;
               if (var12 >= 0 && var12 < super.field4080 && var13 >= 0 && var13 < super.field4077) {
                  this.method2279(var12, var13);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z",
      line = 176
   )
   public final boolean method2277(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return true;
   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(IIIIIII[[Z)V",
      line = 181
   )
   public final void method2290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      this.field10189.method5217().method4727(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(III[[ZZII)V",
      line = 186
   )
   public final void method2291(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      this.field10191 = arg5;
      int var8 = 0;
      float[] var9 = new float[this.field10190.method2575(-118)];

      for(class622 var10 = (class622)this.field10190.method2579(-801); var10 != null; var10 = (class622)this.field10190.method2583(1)) {
         var9[var8++] = var10.method4556((byte)94);
      }

      this.method5054(var9);

      for(int var11 = 0; var11 < arg2 + arg2; ++var11) {
         for(int var12 = 0; var12 < arg2 + arg2; ++var12) {
            if (arg3[var11][var12]) {
               int var13 = arg0 - arg2 + var11;
               int var14 = arg1 - arg2 + var12;
               if (var13 >= 0 && var13 < super.field4080 && var14 >= 0 && var14 < super.field4077) {
                  this.method2279(var13, var14);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "<init>",
      descriptor = "(Loa;Lya;II[[I[[IIII)V",
      line = 243
   )
   public class695(class721 arg0, class58 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
      super(arg2, arg3, arg6, arg4);
      this.field10189 = arg0;
      this.method5052(this.field10189, arg1, arg2, arg3, super.field4078, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!t",
      name = "finalize",
      descriptor = "()V",
      line = 238
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)-116, this);
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(Lke;[I)V",
      line = 251
   )
   public final void method2283(class622 arg0, int[] arg1) {
      this.field10190.method2585(arg0, -84);
      this.method5053(arg0.hashCode(), arg0.method4560((byte)110), arg0.method4563(1), arg0.method4557((byte)-127), arg0.method4564((byte)-108), arg0.method4559((byte)-110), arg1);
   }

   @OriginalMember(
      owner = "client!t",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final native void method2292(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!t",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!t",
      name = "YA",
      descriptor = "()V"
   )
   public final native void method2281();

   @OriginalMember(
      owner = "client!t",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final native void method2288(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!t",
      name = "ga",
      descriptor = "(Loa;Lya;II[[I[[IIII)V"
   )
   private final native void method5052(class721 arg0, class58 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!t",
      name = "ka",
      descriptor = "(III)V"
   )
   public final native void method2280(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!t",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final native void method2285(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!t",
      name = "V",
      descriptor = "(IIIIII[I)V"
   )
   private final native void method5053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

   @OriginalMember(
      owner = "client!t",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final native class192 method2286(int arg0, int arg1, class192 arg2);

   @OriginalMember(
      owner = "client!t",
      name = "q",
      descriptor = "([F)V"
   )
   private final native void method5054(float[] arg0);
}
