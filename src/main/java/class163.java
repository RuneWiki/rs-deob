import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class163 extends class761 implements class64 {
   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "Loa;"
   )
   private class473 field2479;
   @OriginalMember(
      owner = "client!i",
      name = "n",
      descriptor = "Lya;"
   )
   private class770 field2476;
   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "[Ldga;"
   )
   public class712[] field2477;
   @OriginalMember(
      owner = "client!i",
      name = "m",
      descriptor = "[Lhaa;"
   )
   public class3[] field2478;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method769();

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method801();

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method762(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method797();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgga;Lrh;I)V"
   )
   public final void method805(class502 arg0, class213 arg1, int arg2) {
      if (arg1 == null) {
         this.field2479.method3627().method5058(this, arg0, (int[])null, arg2);
      } else {
         class473.field6859[5] = 0;
         this.field2479.method3627().method5058(this, arg0, class473.field6859, arg2);
         arg1.field3054 = class473.field6859[0];
         arg1.field3055 = class473.field6859[1];
         arg1.field3056 = class473.field6859[2];
         arg1.field3051 = class473.field6859[3];
         arg1.field3052 = class473.field6859[4];
         arg1.field3053 = class473.field6859[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method747(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method758();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgga;IZ)V"
   )
   public final void method750(class502 arg0, int arg1, boolean arg2) {
      this.method1536(((class728)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method775();

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method781();

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method811(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method807(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgga;Lrh;II)V"
   )
   public final void method763(class502 arg0, class213 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field2479.method3627().method5060(this, arg0, (int[])null, arg2, arg3);
      } else {
         class473.field6859[5] = 0;
         this.field2479.method3627().method5060(this, arg0, class473.field6859, arg2, arg3);
         arg1.field3054 = class473.field6859[0];
         arg1.field3055 = class473.field6859[1];
         arg1.field3056 = class473.field6859[2];
         arg1.field3051 = class473.field6859[3];
         arg1.field3052 = class473.field6859[4];
         arg1.field3053 = class473.field6859[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILgga;ZI)Z"
   )
   public final boolean method748(int arg0, int arg1, class502 arg2, boolean arg3, int arg4) {
      return this.field2479.method3627().method5067(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "g",
      descriptor = "()Z"
   )
   public final boolean method803() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method771(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method770(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method754(class761 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field2479.method3627().method5065(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()V"
   )
   public final void method752() {
      if (this.field2479.field6868 > 1) {
         synchronized(this) {
            super.field10864 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method773(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method767();

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method1533(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method764();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class761 method755(byte arg0, int arg1, boolean arg2) {
      return this.field2479.method3627().method5084(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method778();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(B[B)V"
   )
   public final void method786(byte arg0, byte[] arg1) {
      throw new RuntimeException();
   }

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method1534(class473 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()[Ldga;"
   )
   public final class712[] method753() {
      return this.field2477;
   }

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method782();

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method779();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method765(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method1533(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method798(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()[B"
   )
   public final byte[] method774() {
      throw new RuntimeException();
   }

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()V"
   )
   public final void method756() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method1535(class163 arg0, class163 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILgga;ZII)Z"
   )
   public final boolean method804(int arg0, int arg1, class502 arg2, boolean arg3, int arg4, int arg5) {
      return this.field2479.method3627().method5064(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method806(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method768(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method780();

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()V"
   )
   public final void method795() {
      if (this.field2479.field6868 > 1) {
         synchronized(this) {
            while(super.field10864) {
               try {
                  this.wait();
               } catch (InterruptedException var2) {
               }
            }

            super.field10864 = true;
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method766(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method800();

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method794();

   @OriginalMember(
      owner = "client!i",
      name = "TA",
      descriptor = "(JIZ)V"
   )
   private final native void method1536(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method809(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()[Lhaa;"
   )
   public final class3[] method784() {
      return this.field2478;
   }

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method785(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method1537(class473 arg0, class770 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method799(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method749();

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method783();

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class412 method792(class412 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method791(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILgga;)V"
   )
   private final void method1538(int[] arg0, class502 arg1) {
      this.field2479.method3627().method5070(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public final void method757(class502 arg0) {
      this.method1538(class473.field6851, arg0);
      int var2 = 0;
      if (this.field2477 != null) {
         for(int var3 = 0; var3 < this.field2477.length; ++var3) {
            class712 var4 = this.field2477[var3];
            var4.field10242 = class473.field6851[var2++];
            var4.field10243 = class473.field6851[var2++];
            var4.field10240 = class473.field6851[var2++];
            var4.field10236 = class473.field6851[var2++];
            var4.field10237 = class473.field6851[var2++];
            var4.field10226 = class473.field6851[var2++];
            var4.field10222 = class473.field6851[var2++];
            var4.field10234 = class473.field6851[var2++];
            var4.field10230 = class473.field6851[var2++];
         }
      }

      if (this.field2478 != null) {
         for(int var5 = 0; var5 < this.field2478.length; ++var5) {
            class3 var6 = this.field2478[var5];
            class3 var7 = var6;
            if (var6.field29 != null) {
               var7 = var6.field29;
            }

            if (var6.field28 != null) {
               var6.field28.method323(arg0);
            } else {
               var6.field28 = arg0.method338();
            }

            var7.field25 = class473.field6851[var2++];
            var7.field30 = class473.field6851[var2++];
            var7.field27 = class473.field6851[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Leca;IIII)V"
   )
   public class163(class473 arg0, class770 arg1, class590 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field2479 = arg0;
      this.field2476 = arg1;
      this.field2477 = arg2.field8339;
      this.field2478 = arg2.field8350;
      int var8 = arg2.field8339 == null ? 0 : arg2.field8339.length;
      int var9 = arg2.field8350 == null ? 0 : arg2.field8350.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field2477[var12].field10220;
         var11[var10++] = this.field2477[var12].field10239;
         var11[var10++] = this.field2477[var12].field10223;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field2478[var13].field31;
      }

      int var14 = arg2.field8343 == null ? 0 : arg2.field8343.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class747 var20 = arg2.field8343[var17];
         class766 var21 = class107.method1044(103, var20.field10623);
         var15[var16++] = var20.field10624;
         var15[var16++] = var21.field10990;
         var15[var16++] = var21.field10991;
         var15[var16++] = var21.field10994;
         var15[var16++] = var21.field10997;
         var15[var16++] = var21.field10992;
         var15[var16++] = var21.field10993 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class747 var19 = arg2.field8343[var18];
         var15[var16++] = var19.field10618;
      }

      this.method1537(this.field2479, this.field2476, arg2.field8307, arg2.field8306, arg2.field8344, arg2.field8311, arg2.field8332, arg2.field8329, arg2.field8325, arg2.field8324, arg2.field8342, arg2.field8341, arg2.field8323, arg2.field8318, arg2.field8327, arg2.field8353, arg2.field8348, arg2.field8317, arg2.field8304, arg2.field8310, arg2.field8316, arg2.field8335, arg2.field8345, arg2.field8337, arg2.field8331, arg2.field8308, arg2.field8340, arg2.field8322, arg2.field8330, arg2.field8338, arg2.field8314, arg2.field8354, arg2.field8315, arg2.field8346, arg2.field8309, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class163(class473 arg0) {
      this.field2479 = arg0;
      this.field2476 = null;
      this.method1534(arg0);
   }
}
