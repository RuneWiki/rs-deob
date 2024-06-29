import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class310 extends class751 implements class64 {
   @OriginalMember(
      owner = "client!t",
      name = "k",
      descriptor = "Lsb;"
   )
   private class261 field4664 = new class261();
   @OriginalMember(
      owner = "client!t",
      name = "j",
      descriptor = "I"
   )
   private int field4665 = -1;
   @OriginalMember(
      owner = "client!t",
      name = "l",
      descriptor = "Loa;"
   )
   private class473 field4663;
   @OriginalMember(
      owner = "client!t",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final void method45(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
         this.method57(arg0, arg1, var23, var29, var24, var30, var25, var28, var26, var27, arg13, arg14, arg15, arg16);
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final native void method53(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public final void method47(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
      this.field4665 = -1;
      int var7 = 0;
      float[] var8 = new float[this.field4664.method2249(true)];

      for(class757 var9 = (class757)this.field4664.method2245((byte)-94); var9 != null; var9 = (class757)this.field4664.method2239((byte)113)) {
         var8[var7++] = var9.method5471(0);
      }

      this.method2538(var8);

      for(int var10 = 0; var10 < arg2 + arg2; ++var10) {
         for(int var11 = 0; var11 < arg2 + arg2; ++var11) {
            if (arg3[var10][var11]) {
               int var12 = arg0 - arg2 + var10;
               int var13 = arg1 - arg2 + var11;
               if (var12 >= 0 && var12 < super.field10665 && var13 >= 0 && var13 < super.field10666) {
                  this.method50(var12, var13);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!t",
      name = "V",
      descriptor = "(IIIIII[I)V"
   )
   private final native void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6);

   @OriginalMember(
      owner = "client!t",
      name = "<init>",
      descriptor = "(Loa;Lya;II[[I[[IIII)V"
   )
   public class310(class473 arg0, class770 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8) {
      super(arg2, arg3, arg6, arg4);
      this.field4663 = arg0;
      this.method2539(this.field4663, arg1, arg2, arg3, super.field10669, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(Lpha;[I)V"
   )
   public final void method46(class757 arg0, int[] arg1) {
      this.field4664.method2238(arg0, 13);
      this.method2537(arg0.hashCode(), arg0.method5474(10368), arg0.method5470(true), arg0.method5469((byte)13), arg0.method5465((byte)108), arg0.method5466(true), arg1);
   }

   @OriginalMember(
      owner = "client!t",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public final native class412 method43(int arg0, int arg1, class412 arg2);

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public final boolean method52(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return true;
   }

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
      this.field4663.method3627().method5088(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
   }

   @OriginalMember(
      owner = "client!t",
      name = "YA",
      descriptor = "()V"
   )
   public final native void method54();

   @OriginalMember(
      owner = "client!t",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public final native void method57(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!t",
      name = "q",
      descriptor = "([F)V"
   )
   private final native void method2538(float[] arg0);

   @OriginalMember(
      owner = "client!t",
      name = "ga",
      descriptor = "(Loa;Lya;II[[I[[IIII)V"
   )
   private final native void method2539(class473 arg0, class770 arg1, int arg2, int arg3, int[][] arg4, int[][] arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public final void method44(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
      this.field4665 = arg5;
      int var8 = 0;
      float[] var9 = new float[this.field4664.method2249(true)];

      for(class757 var10 = (class757)this.field4664.method2245((byte)-94); var10 != null; var10 = (class757)this.field4664.method2239((byte)125)) {
         var9[var8++] = var10.method5471(0);
      }

      this.method2538(var9);

      for(int var11 = 0; var11 < arg2 + arg2; ++var11) {
         for(int var12 = 0; var12 < arg2 + arg2; ++var12) {
            if (arg3[var11][var12]) {
               int var13 = arg0 - arg2 + var11;
               int var14 = arg1 - arg2 + var12;
               if (var13 >= 0 && var13 < super.field10665 && var14 >= 0 && var14 < super.field10666) {
                  this.method50(var13, var14);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public final native void method49(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!t",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method50(int arg0, int arg1) {
      if (this.field4665 < 0) {
         this.field4663.method3627().method5076(this, arg0, arg1);
      } else {
         this.field4663.method3627().method5059(this, arg0, arg1, this.field4665);
      }
   }

   @OriginalMember(
      owner = "client!t",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!t",
      name = "ka",
      descriptor = "(III)V"
   )
   public final native void method48(int arg0, int arg1, int arg2);
}
