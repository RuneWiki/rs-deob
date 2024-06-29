import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class270 extends class91 implements class245 {
   @OriginalMember(
      owner = "client!i",
      name = "q",
      descriptor = "Loa;"
   )
   private class74 field4370;
   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "Lya;"
   )
   private class515 field4369;
   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "[Lgl;"
   )
   public class574[] field4372;
   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "[Lqw;"
   )
   public class253[] field4371;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method2305(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method918();

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method894();

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method917(int arg0, int arg1, class271 arg2, class271 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILkf;ZII)Z"
   )
   public final boolean method912(int arg0, int arg1, class401 arg2, boolean arg3, int arg4, int arg5) {
      return this.field4370.method596().method4880(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method911();

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method919();

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method889(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method2306(class270 arg0, class270 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(B[B)V"
   )
   public final void method893(byte arg0, byte[] arg1) {
      throw new RuntimeException();
   }

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method871();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILkf;)V"
   )
   private final void method2307(int[] arg0, class401 arg1) {
      this.field4370.method596().method4896(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method625(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method877(class91 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field4370.method596().method4900(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()[B"
   )
   public final byte[] method885() {
      throw new RuntimeException();
   }

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method896(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkf;IZ)V"
   )
   public final void method914(class401 arg0, int arg1, boolean arg2) {
      this.method2310(((class712)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method880(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method2305(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method866();

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method899();

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method2308(class74 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method922(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method906();

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method872(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method915();

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method904();

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method878(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method882(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILkf;ZI)Z"
   )
   public final boolean method886(int arg0, int arg1, class401 arg2, boolean arg3, int arg4) {
      return this.field4370.method596().method4878(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class91 method868(byte arg0, int arg1, boolean arg2) {
      return this.field4370.method596().method4876(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method890() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method874(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method892();

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class273 method881(class273 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method887(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method916();

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()[Lgl;"
   )
   public final class574[] method873() {
      return this.field4372;
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()[Lqw;"
   )
   public final class253[] method913() {
      return this.field4371;
   }

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()V"
   )
   public final void method920() {
      if (this.field4370.field962 > 1) {
         synchronized(this) {
            while(super.field1314) {
               try {
                  this.wait();
               } catch (InterruptedException var2) {
               }
            }

            super.field1314 = true;
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method876();

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method895();

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method901(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkf;Lk;I)V"
   )
   public final void method897(class401 arg0, class49 arg1, int arg2) {
      if (arg1 == null) {
         this.field4370.method596().method4870(this, arg0, (int[])null, arg2);
      } else {
         class74.field950[5] = 0;
         this.field4370.method596().method4870(this, arg0, class74.field950, arg2);
         arg1.field636 = class74.field950[0];
         arg1.field634 = class74.field950[1];
         arg1.field635 = class74.field950[2];
         arg1.field633 = class74.field950[3];
         arg1.field631 = class74.field950[4];
         arg1.field632 = class74.field950[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method864(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method891();

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method923(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method900(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method2309(class74 arg0, class515 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method888(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkf;)V"
   )
   public final void method909(class401 arg0) {
      this.method2307(class74.field947, arg0);
      int var2 = 0;
      if (this.field4372 != null) {
         for(int var3 = 0; var3 < this.field4372.length; ++var3) {
            class574 var4 = this.field4372[var3];
            var4.field8502 = class74.field947[var2++];
            var4.field8500 = class74.field947[var2++];
            var4.field8508 = class74.field947[var2++];
            var4.field8510 = class74.field947[var2++];
            var4.field8505 = class74.field947[var2++];
            var4.field8504 = class74.field947[var2++];
            var4.field8506 = class74.field947[var2++];
            var4.field8498 = class74.field947[var2++];
            var4.field8512 = class74.field947[var2++];
         }
      }

      if (this.field4371 != null) {
         for(int var5 = 0; var5 < this.field4371.length; ++var5) {
            class253 var6 = this.field4371[var5];
            class253 var7 = var6;
            if (var6.field3812 != null) {
               var7 = var6.field3812;
            }

            if (var6.field3818 != null) {
               var6.field3818.method1549(arg0);
            } else {
               var6.field3818 = arg0.method1548();
            }

            var7.field3813 = class74.field947[var2++];
            var7.field3819 = class74.field947[var2++];
            var7.field3815 = class74.field947[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "E",
      descriptor = "(JIZ)V"
   )
   private final native void method2310(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method902();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkf;Lk;II)V"
   )
   public final void method905(class401 arg0, class49 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field4370.method596().method4882(this, arg0, (int[])null, arg2, arg3);
      } else {
         class74.field950[5] = 0;
         this.field4370.method596().method4882(this, arg0, class74.field950, arg2, arg3);
         arg1.field636 = class74.field950[0];
         arg1.field634 = class74.field950[1];
         arg1.field635 = class74.field950[2];
         arg1.field633 = class74.field950[3];
         arg1.field631 = class74.field950[4];
         arg1.field632 = class74.field950[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()V"
   )
   public final void method903() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "g",
      descriptor = "()V"
   )
   public final void method907() {
      if (this.field4370.field962 > 1) {
         synchronized(this) {
            super.field1314 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method867(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Lnga;IIII)V"
   )
   public class270(class74 arg0, class515 arg1, class159 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field4370 = arg0;
      this.field4369 = arg1;
      this.field4372 = arg2.field2383;
      this.field4371 = arg2.field2395;
      int var8 = arg2.field2383 == null ? 0 : arg2.field2383.length;
      int var9 = arg2.field2395 == null ? 0 : arg2.field2395.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field4372[var12].field8514;
         var11[var10++] = this.field4372[var12].field8503;
         var11[var10++] = this.field4372[var12].field8507;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field4371[var13].field3816;
      }

      int var14 = arg2.field2407 == null ? 0 : arg2.field2407.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class369 var20 = arg2.field2407[var17];
         class59 var21 = class396.method3194(0, var20.field5732);
         var15[var16++] = var20.field5731;
         var15[var16++] = var21.field726;
         var15[var16++] = var21.field735;
         var15[var16++] = var21.field731;
         var15[var16++] = var21.field729;
         var15[var16++] = var21.field730;
         var15[var16++] = var21.field732 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class369 var19 = arg2.field2407[var18];
         var15[var16++] = var19.field5734;
      }

      this.method2309(this.field4370, this.field4369, arg2.field2384, arg2.field2391, arg2.field2387, arg2.field2357, arg2.field2371, arg2.field2376, arg2.field2379, arg2.field2362, arg2.field2372, arg2.field2368, arg2.field2405, arg2.field2398, arg2.field2388, arg2.field2402, arg2.field2378, arg2.field2360, arg2.field2358, arg2.field2364, arg2.field2374, arg2.field2370, arg2.field2365, arg2.field2394, arg2.field2406, arg2.field2386, arg2.field2397, arg2.field2380, arg2.field2369, arg2.field2361, arg2.field2375, arg2.field2367, arg2.field2381, arg2.field2396, arg2.field2401, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class270(class74 arg0) {
      this.field4370 = arg0;
      this.field4369 = null;
      this.method2308(arg0);
   }
}
