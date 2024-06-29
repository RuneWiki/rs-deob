import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class500 implements class560 {
   @OriginalMember(
      owner = "client!i",
      name = "q",
      descriptor = "Loa;"
   )
   private class724 field600;
   @OriginalMember(
      owner = "client!i",
      name = "t",
      descriptor = "Lya;"
   )
   private class59 field601;
   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "[Ltu;"
   )
   public class370[] field603;
   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "[Lvga;"
   )
   public class94[] field602;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()Z",
      line = 3
   )
   public final boolean method191() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()V",
      line = 5
   )
   public final void method169() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V",
      line = 9
   )
   public final void method187(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lew;Lsb;II)V",
      line = 13
   )
   public final void method182(class521 arg0, class307 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field600.method5258().method4712(this, arg0, (int[])null, arg2, arg3);
      } else {
         class724.field10562[5] = 0;
         this.field600.method5258().method4712(this, arg0, class724.field10562, arg2, arg3);
         arg1.field4194 = class724.field10562[0];
         arg1.field4193 = class724.field10562[1];
         arg1.field4196 = class724.field10562[2];
         arg1.field4192 = class724.field10562[3];
         arg1.field4195 = class724.field10562[4];
         arg1.field4191 = class724.field10562[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lew;IZ)V",
      line = 31
   )
   public final void method167(class521 arg0, int arg1, boolean arg2) {
      this.method371(((class293)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()V",
      line = 41
   )
   public final void method212() {
      if (this.field600.field10573 > 1) {
         synchronized(this) {
            super.field7253 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 59
   )
   public final class500 method159(byte arg0, int arg1, boolean arg2) {
      return this.field600.method5258().method4707(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILew;)V",
      line = 65
   )
   private final void method372(int[] arg0, class521 arg1) {
      this.field600.method5258().method4686(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()V",
      line = 70
   )
   public final void method168() {
      if (this.field600.field10573 > 1) {
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
      name = "a",
      descriptor = "(Lew;)V",
      line = 89
   )
   public final void method190(class521 arg0) {
      this.method372(class724.field10559, arg0);
      int var2 = 0;
      if (this.field603 != null) {
         for(int var3 = 0; var3 < this.field603.length; ++var3) {
            class370 var4 = this.field603[var3];
            var4.field5383 = class724.field10559[var2++];
            var4.field5371 = class724.field10559[var2++];
            var4.field5382 = class724.field10559[var2++];
            var4.field5369 = class724.field10559[var2++];
            var4.field5380 = class724.field10559[var2++];
            var4.field5373 = class724.field10559[var2++];
            var4.field5381 = class724.field10559[var2++];
            var4.field5376 = class724.field10559[var2++];
            var4.field5375 = class724.field10559[var2++];
         }
      }

      if (this.field602 != null) {
         for(int var5 = 0; var5 < this.field602.length; ++var5) {
            class94 var6 = this.field602[var5];
            class94 var7 = var6;
            if (var6.field1217 != null) {
               var7 = var6.field1217;
            }

            if (var6.field1213 != null) {
               var6.field1213.method1230(arg0);
            } else {
               var6.field1213 = arg0.method1219();
            }

            var7.field1212 = class724.field10559[var2++];
            var7.field1211 = class724.field10559[var2++];
            var7.field1218 = class724.field10559[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 147
   )
   public final void method173(class500 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field600.method5258().method4695(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 153
   )
   public final void method210(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method374(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILew;ZI)Z",
      line = 158
   )
   public final boolean method183(int arg0, int arg1, class521 arg2, boolean arg3, int arg4) {
      return this.field600.method5258().method4694(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lew;Lsb;I)V",
      line = 163
   )
   public final void method192(class521 arg0, class307 arg1, int arg2) {
      if (arg1 == null) {
         this.field600.method5258().method4706(this, arg0, (int[])null, arg2);
      } else {
         class724.field10562[5] = 0;
         this.field600.method5258().method4706(this, arg0, class724.field10562, arg2);
         arg1.field4194 = class724.field10562[0];
         arg1.field4193 = class724.field10562[1];
         arg1.field4196 = class724.field10562[2];
         arg1.field4192 = class724.field10562[3];
         arg1.field4195 = class724.field10562[4];
         arg1.field4191 = class724.field10562[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V",
      line = 182
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILew;ZII)Z",
      line = 191
   )
   public final boolean method206(int arg0, int arg1, class521 arg2, boolean arg3, int arg4, int arg5) {
      return this.field600.method5258().method4700(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Lio;IIII)V",
      line = 194
   )
   public class44(class724 arg0, class59 arg1, class464 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field600 = arg0;
      this.field601 = arg1;
      this.field603 = arg2.field6656;
      this.field602 = arg2.field6696;
      int var8 = arg2.field6656 == null ? 0 : arg2.field6656.length;
      int var9 = arg2.field6696 == null ? 0 : arg2.field6696.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field603[var12].field5386;
         var11[var10++] = this.field603[var12].field5368;
         var11[var10++] = this.field603[var12].field5385;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field602[var13].field1214;
      }

      int var14 = arg2.field6678 == null ? 0 : arg2.field6678.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class416 var20 = arg2.field6678[var17];
         class346 var21 = class392.method2978(var20.field5990, (byte)-79);
         var15[var16++] = var20.field5996;
         var15[var16++] = var21.field4680;
         var15[var16++] = var21.field4674;
         var15[var16++] = var21.field4682;
         var15[var16++] = var21.field4675;
         var15[var16++] = var21.field4679;
         var15[var16++] = var21.field4677 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class416 var19 = arg2.field6678[var18];
         var15[var16++] = var19.field5989;
      }

      this.method375(this.field600, this.field601, arg2.field6686, arg2.field6706, arg2.field6694, arg2.field6668, arg2.field6681, arg2.field6658, arg2.field6688, arg2.field6669, arg2.field6674, arg2.field6683, arg2.field6663, arg2.field6672, arg2.field6677, arg2.field6667, arg2.field6676, arg2.field6697, arg2.field6679, arg2.field6704, arg2.field6699, arg2.field6671, arg2.field6664, arg2.field6700, arg2.field6684, arg2.field6708, arg2.field6690, arg2.field6673, arg2.field6689, arg2.field6659, arg2.field6655, arg2.field6666, arg2.field6695, arg2.field6675, arg2.field6682, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()[Lvga;",
      line = 267
   )
   public final class94[] method188() {
      return this.field602;
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V",
      line = 269
   )
   public class44(class724 arg0) {
      this.field600 = arg0;
      this.field601 = null;
      this.method373(arg0);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()[Ltu;",
      line = 276
   )
   public final class370[] method153() {
      return this.field603;
   }

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method215();

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method176(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method186();

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method189();

   @OriginalMember(
      owner = "client!i",
      name = "D",
      descriptor = "(JIZ)V"
   )
   private final native void method371(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method195(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method148();

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method214();

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method164(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method226();

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method197();

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method201();

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method224(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method219(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class196 method154(class196 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method204(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method174();

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method157(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method373(class724 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method225();

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method374(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method166(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method177(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method193(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method222();

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method227(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method220();

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method217();

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method162();

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method375(class724 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method156(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method113(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method205(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method376(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method151();

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method199();
}
