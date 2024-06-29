import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class43 extends class501 implements class562 {
   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "Loa;"
   )
   private class725 field497;
   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "Lya;"
   )
   private class58 field500;
   @OriginalMember(
      owner = "client!i",
      name = "q",
      descriptor = "[Lub;"
   )
   public class22[] field499;
   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "[Luo;"
   )
   public class606[] field498;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method320(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method350(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkh;Lgp;II)V"
   )
   public final void method321(class17 arg0, class52 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field497.method5270().method4698(this, arg0, (int[])null, arg2, arg3);
      } else {
         class725.field10610[5] = 0;
         this.field497.method5270().method4698(this, arg0, class725.field10610, arg2, arg3);
         arg1.field576 = class725.field10610[0];
         arg1.field573 = class725.field10610[1];
         arg1.field574 = class725.field10610[2];
         arg1.field571 = class725.field10610[3];
         arg1.field575 = class725.field10610[4];
         arg1.field572 = class725.field10610[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method322() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method323(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method324();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method325(class501 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field497.method5270().method4708(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()V"
   )
   public final void method326() {
      if (this.field497.field10627 > 1) {
         synchronized(this) {
            while(super.field6872) {
               try {
                  this.wait();
               } catch (InterruptedException var2) {
               }
            }

            super.field6872 = true;
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method327();

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method328();

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method329();

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method330(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method331(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method332(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method333(class43 arg0, class43 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method334();

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method335();

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method336(class725 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class629.method4576(72, this);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()[Luo;"
   )
   public final class606[] method337() {
      return this.field498;
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class501 method338(byte arg0, int arg1, boolean arg2) {
      return this.field497.method5270().method4704(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILkh;ZI)Z"
   )
   public final boolean method339(int arg0, int arg1, class17 arg2, boolean arg3, int arg4) {
      return this.field497.method5270().method4681(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public final void method340(class17 arg0) {
      this.method354(class725.field10617, arg0);
      int var2 = 0;
      if (this.field499 != null) {
         for(int var3 = 0; var3 < this.field499.length; ++var3) {
            class22 var4 = this.field499[var3];
            var4.field289 = class725.field10617[var2++];
            var4.field287 = class725.field10617[var2++];
            var4.field276 = class725.field10617[var2++];
            var4.field282 = class725.field10617[var2++];
            var4.field288 = class725.field10617[var2++];
            var4.field283 = class725.field10617[var2++];
            var4.field273 = class725.field10617[var2++];
            var4.field278 = class725.field10617[var2++];
            var4.field284 = class725.field10617[var2++];
         }
      }

      if (this.field498 != null) {
         for(int var5 = 0; var5 < this.field498.length; ++var5) {
            class606 var6 = this.field498[var5];
            class606 var7 = var6;
            if (var6.field8482 != null) {
               var7 = var6.field8482;
            }

            if (var6.field8485 != null) {
               var6.field8485.method158(arg0);
            } else {
               var6.field8485 = arg0.method157();
            }

            var7.field8492 = class725.field10617[var2++];
            var7.field8481 = class725.field10617[var2++];
            var7.field8489 = class725.field10617[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method341();

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method342(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method343(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method344();

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method345();

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method167(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method346();

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method347(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method348(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method349(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method350(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()[Lub;"
   )
   public final class22[] method351() {
      return this.field499;
   }

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method352(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method353(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILkh;)V"
   )
   private final void method354(int[] arg0, class17 arg1) {
      this.field497.method5270().method4687(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method355(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()V"
   )
   public final void method356() {
      if (this.field497.field10627 > 1) {
         synchronized(this) {
            super.field6872 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method357();

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method358();

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method359(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method360(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class194 method361(class194 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkh;IZ)V"
   )
   public final void method362(class17 arg0, int arg1, boolean arg2) {
      this.method371(((class293)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILkh;ZII)Z"
   )
   public final boolean method363(int arg0, int arg1, class17 arg2, boolean arg3, int arg4, int arg5) {
      return this.field497.method5270().method4685(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()V"
   )
   public final void method364() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method365(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method366();

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method367(class725 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method368();

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method369();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lkh;Lgp;I)V"
   )
   public final void method370(class17 arg0, class52 arg1, int arg2) {
      if (arg1 == null) {
         this.field497.method5270().method4697(this, arg0, (int[])null, arg2);
      } else {
         class725.field10610[5] = 0;
         this.field497.method5270().method4697(this, arg0, class725.field10610, arg2);
         arg1.field576 = class725.field10610[0];
         arg1.field573 = class725.field10610[1];
         arg1.field574 = class725.field10610[2];
         arg1.field571 = class725.field10610[3];
         arg1.field575 = class725.field10610[4];
         arg1.field572 = class725.field10610[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "A",
      descriptor = "(JIZ)V"
   )
   private final native void method371(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method372();

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Lvp;IIII)V"
   )
   public class43(class725 arg0, class58 arg1, class200 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field497 = arg0;
      this.field500 = arg1;
      this.field499 = arg2.field2421;
      this.field498 = arg2.field2427;
      int var8 = arg2.field2421 == null ? 0 : arg2.field2421.length;
      int var9 = arg2.field2427 == null ? 0 : arg2.field2427.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field499[var12].field277;
         var11[var10++] = this.field499[var12].field271;
         var11[var10++] = this.field499[var12].field275;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field498[var13].field8484;
      }

      int var14 = arg2.field2422 == null ? 0 : arg2.field2422.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class135 var20 = arg2.field2422[var17];
         class674 var21 = class207.method1569(var20.field1749, 23258);
         var15[var16++] = var20.field1755;
         var15[var16++] = var21.field9898;
         var15[var16++] = var21.field9899;
         var15[var16++] = var21.field9901;
         var15[var16++] = var21.field9897;
         var15[var16++] = var21.field9900;
         var15[var16++] = var21.field9896 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class135 var19 = arg2.field2422[var18];
         var15[var16++] = var19.field1750;
      }

      this.method336(this.field497, this.field500, arg2.field2418, arg2.field2415, arg2.field2423, arg2.field2424, arg2.field2448, arg2.field2447, arg2.field2429, arg2.field2444, arg2.field2453, arg2.field2434, arg2.field2417, arg2.field2426, arg2.field2443, arg2.field2435, arg2.field2458, arg2.field2450, arg2.field2455, arg2.field2446, arg2.field2451, arg2.field2440, arg2.field2436, arg2.field2439, arg2.field2412, arg2.field2430, arg2.field2432, arg2.field2428, arg2.field2414, arg2.field2457, arg2.field2441, arg2.field2456, arg2.field2438, arg2.field2431, arg2.field2416, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class43(class725 arg0) {
      this.field497 = arg0;
      this.field500 = null;
      this.method367(arg0);
   }
}
