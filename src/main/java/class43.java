import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class43 extends class495 implements class556 {
   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "Loa;"
   )
   private class721 field983;
   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "Lya;"
   )
   private class58 field980;
   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "[Ltf;"
   )
   public class309[] field982;
   @OriginalMember(
      owner = "client!i",
      name = "q",
      descriptor = "[Llu;"
   )
   public class740[] field981;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method502(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Ldfa;Lija;I)V"
   )
   public final void method503(class173 arg0, class362 arg1, int arg2) {
      if (arg1 == null) {
         this.field983.method5217().method4729(this, arg0, (int[])null, arg2);
      } else {
         class721.field10426[5] = 0;
         this.field983.method5217().method4729(this, arg0, class721.field10426, arg2);
         arg1.field5411 = class721.field10426[0];
         arg1.field5408 = class721.field10426[1];
         arg1.field5407 = class721.field10426[2];
         arg1.field5410 = class721.field10426[3];
         arg1.field5409 = class721.field10426[4];
         arg1.field5406 = class721.field10426[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method504();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method505(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method532(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method506(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method507();

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()V"
   )
   public final void method508() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method509();

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method510();

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method511();

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method512(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method513(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method514(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()[Ltf;"
   )
   public final class309[] method515() {
      return this.field982;
   }

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method516();

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method517();

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method518(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Ldfa;IZ)V"
   )
   public final void method519(class173 arg0, int arg1, boolean arg2) {
      this.method527(((class291)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method520(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILdfa;ZI)Z"
   )
   public final boolean method521(int arg0, int arg1, class173 arg2, boolean arg3, int arg4) {
      return this.field983.method5217().method4720(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method522(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()V"
   )
   public final void method523() {
      if (this.field983.field10436 > 1) {
         synchronized(this) {
            super.field7253 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method524(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method525(class721 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method526(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "D",
      descriptor = "(JIZ)V"
   )
   private final native void method527(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method528();

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method529() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method530(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method531();

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method532(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method533(class495 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field983.method5217().method4708(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method534(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method535();

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method536();

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method537(class43 arg0, class43 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method538(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()[Llu;"
   )
   public final class740[] method539() {
      return this.field981;
   }

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method540();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILdfa;)V"
   )
   private final void method541(int[] arg0, class173 arg1) {
      this.field983.method5217().method4704(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method542();

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method543(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()V"
   )
   public final void method544() {
      if (this.field983.field10436 > 1) {
         synchronized(this) {
            while(super.field7253) {
               try {
                  this.wait();
               } catch (InterruptedException var2) {
               }
            }

            super.field7253 = true;
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method545(class721 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method546();

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class192 method547(class192 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method548();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class495 method549(byte arg0, int arg1, boolean arg2) {
      return this.field983.method5217().method4731(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method550(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILdfa;ZII)Z"
   )
   public final boolean method551(int arg0, int arg1, class173 arg2, boolean arg3, int arg4, int arg5) {
      return this.field983.method5217().method4710(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Ldfa;Lija;II)V"
   )
   public final void method552(class173 arg0, class362 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field983.method5217().method4713(this, arg0, (int[])null, arg2, arg3);
      } else {
         class721.field10426[5] = 0;
         this.field983.method5217().method4713(this, arg0, class721.field10426, arg2, arg3);
         arg1.field5411 = class721.field10426[0];
         arg1.field5408 = class721.field10426[1];
         arg1.field5407 = class721.field10426[2];
         arg1.field5410 = class721.field10426[3];
         arg1.field5409 = class721.field10426[4];
         arg1.field5406 = class721.field10426[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method553();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public final void method554(class173 arg0) {
      this.method541(class721.field10420, arg0);
      int var2 = 0;
      if (this.field982 != null) {
         for(int var3 = 0; var3 < this.field982.length; ++var3) {
            class309 var4 = this.field982[var3];
            var4.field4454 = class721.field10420[var2++];
            var4.field4452 = class721.field10420[var2++];
            var4.field4442 = class721.field10420[var2++];
            var4.field4444 = class721.field10420[var2++];
            var4.field4450 = class721.field10420[var2++];
            var4.field4453 = class721.field10420[var2++];
            var4.field4447 = class721.field10420[var2++];
            var4.field4458 = class721.field10420[var2++];
            var4.field4449 = class721.field10420[var2++];
         }
      }

      if (this.field981 != null) {
         for(int var5 = 0; var5 < this.field981.length; ++var5) {
            class740 var6 = this.field981[var5];
            class740 var7 = var6;
            if (var6.field10656 != null) {
               var7 = var6.field10656;
            }

            if (var6.field10657 != null) {
               var6.field10657.method982(arg0);
            } else {
               var6.field10657 = arg0.method999();
            }

            var7.field10654 = class721.field10420[var2++];
            var7.field10662 = class721.field10420[var2++];
            var7.field10652 = class721.field10420[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class350.method2702((byte)-119, this);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Lph;IIII)V"
   )
   public class43(class721 arg0, class58 arg1, class668 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field983 = arg0;
      this.field980 = arg1;
      this.field982 = arg2.field9712;
      this.field981 = arg2.field9687;
      int var8 = arg2.field9712 == null ? 0 : arg2.field9712.length;
      int var9 = arg2.field9687 == null ? 0 : arg2.field9687.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field982[var12].field4459;
         var11[var10++] = this.field982[var12].field4451;
         var11[var10++] = this.field982[var12].field4455;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field981[var13].field10651;
      }

      int var14 = arg2.field9680 == null ? 0 : arg2.field9680.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class44 var20 = arg2.field9680[var17];
         class53 var21 = class626.method4587((byte)-127, var20.field989);
         var15[var16++] = var20.field991;
         var15[var16++] = var21.field1090;
         var15[var16++] = var21.field1095;
         var15[var16++] = var21.field1097;
         var15[var16++] = var21.field1092;
         var15[var16++] = var21.field1096;
         var15[var16++] = var21.field1094 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class44 var19 = arg2.field9680[var18];
         var15[var16++] = var19.field984;
      }

      this.method545(this.field983, this.field980, arg2.field9717, arg2.field9708, arg2.field9726, arg2.field9706, arg2.field9689, arg2.field9697, arg2.field9681, arg2.field9736, arg2.field9737, arg2.field9734, arg2.field9732, arg2.field9705, arg2.field9727, arg2.field9721, arg2.field9719, arg2.field9715, arg2.field9688, arg2.field9711, arg2.field9682, arg2.field9730, arg2.field9704, arg2.field9709, arg2.field9707, arg2.field9723, arg2.field9693, arg2.field9722, arg2.field9724, arg2.field9731, arg2.field9714, arg2.field9733, arg2.field9701, arg2.field9684, arg2.field9725, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V"
   )
   public class43(class721 arg0) {
      this.field983 = arg0;
      this.field980 = null;
      this.method525(arg0);
   }
}
