import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class770 extends class232 implements class787 {
   @OriginalMember(
      owner = "client!i",
      name = "n",
      descriptor = "Loa;"
   )
   private class53 field11219;
   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "Lya;"
   )
   private class319 field11220;
   @OriginalMember(
      owner = "client!i",
      name = "o",
      descriptor = "[Lmha;"
   )
   public class426[] field11218;
   @OriginalMember(
      owner = "client!i",
      name = "m",
      descriptor = "[Llba;"
   )
   public class224[] field11221;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method1300();

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method1224(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method1260(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method1285();

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()[Llba;"
   )
   public final class224[] method1231() {
      return this.field11221;
   }

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method1230(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method5552(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method1303();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class232 method1256(byte arg0, int arg1, boolean arg2) {
      return this.field11219.method453().method5000(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method1269(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method5553(class53 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method1298(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "B",
      descriptor = "(JIZ)V"
   )
   private final native void method5554(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method1250();

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method1279(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method1237();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkia;Lmia;II)V"
   )
   public final void method1297(class93 arg0, class687 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field11219.method453().method5010(this, arg0, (int[])null, arg2, arg3);
      } else {
         class53.field718[5] = 0;
         this.field11219.method453().method5010(this, arg0, class53.field718, arg2, arg3);
         arg1.field10119 = class53.field718[0];
         arg1.field10120 = class53.field718[1];
         arg1.field10115 = class53.field718[2];
         arg1.field10118 = class53.field718[3];
         arg1.field10116 = class53.field718[4];
         arg1.field10117 = class53.field718[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method1293();

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()V"
   )
   public final void method1228() {
      if (this.field11219.field737 > 1) {
         synchronized(this) {
            super.field2885 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method1259();

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method477(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method1258();

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method1270(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkia;IZ)V"
   )
   public final void method1276(class93 arg0, int arg1, boolean arg2) {
      this.method5554(((class671)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method1275(int arg0, int arg1, class423 arg2, class423 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class611.method4509(-7155, this);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method1236();

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method1295();

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method1262(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkia;Lmia;I)V"
   )
   public final void method1305(class93 arg0, class687 arg1, int arg2) {
      if (arg1 == null) {
         this.field11219.method453().method4995(this, arg0, (int[])null, arg2);
      } else {
         class53.field718[5] = 0;
         this.field11219.method453().method4995(this, arg0, class53.field718, arg2);
         arg1.field10119 = class53.field718[0];
         arg1.field10120 = class53.field718[1];
         arg1.field10115 = class53.field718[2];
         arg1.field10118 = class53.field718[3];
         arg1.field10116 = class53.field718[4];
         arg1.field10117 = class53.field718[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public final void method1232(class93 arg0) {
      this.method5556(class53.field723, arg0);
      int var2 = 0;
      if (this.field11218 != null) {
         for(int var3 = 0; var3 < this.field11218.length; ++var3) {
            class426 var4 = this.field11218[var3];
            var4.field5800 = class53.field723[var2++];
            var4.field5804 = class53.field723[var2++];
            var4.field5798 = class53.field723[var2++];
            var4.field5787 = class53.field723[var2++];
            var4.field5796 = class53.field723[var2++];
            var4.field5797 = class53.field723[var2++];
            var4.field5799 = class53.field723[var2++];
            var4.field5786 = class53.field723[var2++];
            var4.field5806 = class53.field723[var2++];
         }
      }

      if (this.field11221 != null) {
         for(int var5 = 0; var5 < this.field11221.length; ++var5) {
            class224 var6 = this.field11221[var5];
            class224 var7 = var6;
            if (var6.field2801 != null) {
               var7 = var6.field2801;
            }

            if (var6.field2807 != null) {
               var6.field2807.method874(arg0);
            } else {
               var6.field2807 = arg0.method854();
            }

            var7.field2802 = class53.field723[var2++];
            var7.field2799 = class53.field723[var2++];
            var7.field2800 = class53.field723[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method1243();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method1238(class232 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field11219.method453().method5009(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method5555(class770 arg0, class770 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method1255(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method1280(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method1289(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method1287();

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method1266(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()[Lmha;"
   )
   public final class426[] method1272() {
      return this.field11218;
   }

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method1261();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILkia;)V"
   )
   private final void method5556(int[] arg0, class93 arg1) {
      this.field11219.method453().method4992(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method1225(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method5552(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method1248(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class114 method1253(class114 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method1242(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method1246() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method1252();

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method1286();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILkia;ZI)Z"
   )
   public final boolean method1273(int arg0, int arg1, class93 arg2, boolean arg3, int arg4) {
      return this.field11219.method453().method5007(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Lls;IIII)V"
   )
   public class770(class53 arg0, class319 arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field11219 = arg0;
      this.field11220 = arg1;
      this.field11218 = arg2.field2157;
      this.field11221 = arg2.field2164;
      int var8 = arg2.field2157 == null ? 0 : arg2.field2157.length;
      int var9 = arg2.field2164 == null ? 0 : arg2.field2164.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field11218[var12].field5789;
         var11[var10++] = this.field11218[var12].field5794;
         var11[var10++] = this.field11218[var12].field5791;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field11221[var13].field2808;
      }

      int var14 = arg2.field2187 == null ? 0 : arg2.field2187.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class115 var20 = arg2.field2187[var17];
         class696 var21 = class579.method4332(var20.field1518, (byte)-101);
         var15[var16++] = var20.field1522;
         var15[var16++] = var21.field10200;
         var15[var16++] = var21.field10202;
         var15[var16++] = var21.field10204;
         var15[var16++] = var21.field10198;
         var15[var16++] = var21.field10197;
         var15[var16++] = var21.field10194 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class115 var19 = arg2.field2187[var18];
         var15[var16++] = var19.field1514;
      }

      this.method5557(this.field11219, this.field11220, arg2.field2179, arg2.field2142, arg2.field2170, arg2.field2143, arg2.field2181, arg2.field2167, arg2.field2166, arg2.field2156, arg2.field2135, arg2.field2147, arg2.field2177, arg2.field2189, arg2.field2140, arg2.field2145, arg2.field2134, arg2.field2174, arg2.field2152, arg2.field2186, arg2.field2176, arg2.field2139, arg2.field2163, arg2.field2161, arg2.field2155, arg2.field2182, arg2.field2162, arg2.field2169, arg2.field2158, arg2.field2138, arg2.field2154, arg2.field2171, arg2.field2188, arg2.field2141, arg2.field2146, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class770(class53 arg0) {
      this.field11219 = arg0;
      this.field11220 = null;
      this.method5553(arg0);
   }

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method1226();

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()V"
   )
   public final void method1234() {
      if (this.field11219.field737 > 1) {
         synchronized(this) {
            while(super.field2885) {
               try {
                  this.wait();
               } catch (InterruptedException var2) {
               }
            }

            super.field2885 = true;
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILkia;ZII)Z"
   )
   public final boolean method1304(int arg0, int arg1, class93 arg2, boolean arg3, int arg4, int arg5) {
      return this.field11219.method453().method5016(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()V"
   )
   public final void method1244() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method5557(class53 arg0, class319 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);
}
