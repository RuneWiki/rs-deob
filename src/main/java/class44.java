import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class497 implements class558 {
   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "Loa;"
   )
   private class722 field466;
   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "Lya;"
   )
   private class59 field467;
   @OriginalMember(
      owner = "client!i",
      name = "q",
      descriptor = "[Lria;"
   )
   public class299[] field468;
   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "[Lhka;"
   )
   public class57[] field469;
   @OriginalMember(
      owner = "client!i",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid;

   @OriginalMember(
      owner = "client!i",
      name = "b",
      descriptor = "()V",
      line = 3
   )
   public final void method296() {
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "()[Lhka;",
      line = 6
   )
   public final class57[] method297() {
      return this.field469;
   }

   @OriginalMember(
      owner = "client!i",
      name = "d",
      descriptor = "()Z",
      line = 9
   )
   public final boolean method298() {
      return true;
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgq;Lpda;I)V",
      line = 16
   )
   public final void method301(class540 arg0, class655 arg1, int arg2) {
      if (arg1 == null) {
         this.field466.method5233().method4650(this, arg0, (int[])null, arg2);
      } else {
         class722.field10749[5] = 0;
         this.field466.method5233().method4650(this, arg0, class722.field10749, arg2);
         arg1.field9521 = class722.field10749[0];
         arg1.field9519 = class722.field10749[1];
         arg1.field9522 = class722.field10749[2];
         arg1.field9524 = class722.field10749[3];
         arg1.field9520 = class722.field10749[4];
         arg1.field9523 = class722.field10749[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "finalize",
      descriptor = "()V",
      line = 33
   )
   protected final void finalize() {
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "e",
      descriptor = "()V",
      line = 44
   )
   public final void method307() {
      if (this.field466.field10759 > 1) {
         synchronized(this) {
            super.field7365 = false;
            this.notifyAll();
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 55
   )
   public final void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      this.method337(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgq;)V",
      line = 60
   )
   public final void method312(class540 arg0) {
      this.method321(class722.field10748, arg0);
      int var2 = 0;
      if (this.field468 != null) {
         for(int var3 = 0; var3 < this.field468.length; ++var3) {
            class299 var4 = this.field468[var3];
            var4.field4266 = class722.field10748[var2++];
            var4.field4263 = class722.field10748[var2++];
            var4.field4268 = class722.field10748[var2++];
            var4.field4275 = class722.field10748[var2++];
            var4.field4280 = class722.field10748[var2++];
            var4.field4273 = class722.field10748[var2++];
            var4.field4281 = class722.field10748[var2++];
            var4.field4271 = class722.field10748[var2++];
            var4.field4262 = class722.field10748[var2++];
         }
      }

      if (this.field469 != null) {
         for(int var5 = 0; var5 < this.field469.length; ++var5) {
            class57 var6 = this.field469[var5];
            class57 var7 = var6;
            if (var6.field719 != null) {
               var7 = var6.field719;
            }

            if (var6.field724 != null) {
               var6.field724.method1513(arg0);
            } else {
               var6.field724 = arg0.method1520();
            }

            var7.field725 = class722.field10748[var2++];
            var7.field715 = class722.field10748[var2++];
            var7.field720 = class722.field10748[var2++];
         }
      }

   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILgq;ZI)Z",
      line = 120
   )
   public final boolean method318(int arg0, int arg1, class540 arg2, boolean arg3, int arg4) {
      return this.field466.method5233().method4623(this, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "([ILgq;)V",
      line = 125
   )
   private final void method321(int[] arg0, class540 arg1) {
      this.field466.method5233().method4632(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!i",
      name = "f",
      descriptor = "()[Lria;",
      line = 129
   )
   public final class299[] method323() {
      return this.field468;
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IIII)V",
      line = 140
   )
   public final void method329(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(IILgq;ZII)Z",
      line = 146
   )
   public final boolean method331(int arg0, int arg1, class540 arg2, boolean arg3, int arg4, int arg5) {
      return this.field466.method5233().method4640(this, arg0, arg1, arg2, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgq;IZ)V",
      line = 153
   )
   public final void method335(class540 arg0, int arg1, boolean arg2) {
      this.method325(((class291)arg0).nativeid, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lgq;Lpda;II)V",
      line = 158
   )
   public final void method338(class540 arg0, class655 arg1, int arg2, int arg3) {
      if (arg1 == null) {
         this.field466.method5233().method4633(this, arg0, (int[])null, arg2, arg3);
      } else {
         class722.field10749[5] = 0;
         this.field466.method5233().method4633(this, arg0, class722.field10749, arg2, arg3);
         arg1.field9521 = class722.field10749[0];
         arg1.field9519 = class722.field10749[1];
         arg1.field9522 = class722.field10749[2];
         arg1.field9524 = class722.field10749[3];
         arg1.field9520 = class722.field10749[4];
         arg1.field9523 = class722.field10749[5] != 0;
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 176
   )
   public final void method341(class497 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      this.field466.method5233().method4647(this, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 180
   )
   public final class497 method343(byte arg0, int arg1, boolean arg2) {
      return this.field466.method5233().method4637(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!i",
      name = "c",
      descriptor = "()V",
      line = 185
   )
   public final void method345() {
      if (this.field466.field10759 > 1) {
         synchronized(this) {
            while(super.field7365) {
               try {
                  this.wait();
               } catch (InterruptedException var2) {
               }
            }

            super.field7365 = true;
         }
      }
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;Lya;Lut;IIII)V",
      line = 203
   )
   public class44(class722 arg0, class59 arg1, class134 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field466 = arg0;
      this.field467 = arg1;
      this.field468 = arg2.field1695;
      this.field469 = arg2.field1702;
      int var8 = arg2.field1695 == null ? 0 : arg2.field1695.length;
      int var9 = arg2.field1702 == null ? 0 : arg2.field1702.length;
      int var10 = 0;
      int[] var11 = new int[var8 * 3 + var9];

      for(int var12 = 0; var12 < var8; ++var12) {
         var11[var10++] = this.field468[var12].field4278;
         var11[var10++] = this.field468[var12].field4264;
         var11[var10++] = this.field468[var12].field4265;
      }

      for(int var13 = 0; var13 < var9; ++var13) {
         var11[var10++] = this.field469[var13].field718;
      }

      int var14 = arg2.field1679 == null ? 0 : arg2.field1679.length;
      int[] var15 = new int[var14 * 8];
      int var16 = 0;

      for(int var17 = 0; var17 < var14; ++var17) {
         class556 var20 = arg2.field1679[var17];
         class571 var21 = class286.method2178((byte)-71, var20.field8251);
         var15[var16++] = var20.field8252;
         var15[var16++] = var21.field8515;
         var15[var16++] = var21.field8516;
         var15[var16++] = var21.field8511;
         var15[var16++] = var21.field8513;
         var15[var16++] = var21.field8517;
         var15[var16++] = var21.field8512 ? -1 : 0;
      }

      for(int var18 = 0; var18 < var14; ++var18) {
         class556 var19 = arg2.field1679[var18];
         var15[var16++] = var19.field8255;
      }

      this.method347(this.field466, this.field467, arg2.field1672, arg2.field1671, arg2.field1696, arg2.field1714, arg2.field1699, arg2.field1718, arg2.field1685, arg2.field1691, arg2.field1701, arg2.field1707, arg2.field1674, arg2.field1690, arg2.field1688, arg2.field1694, arg2.field1697, arg2.field1682, arg2.field1683, arg2.field1693, arg2.field1678, arg2.field1706, arg2.field1664, arg2.field1665, arg2.field1698, arg2.field1661, arg2.field1716, arg2.field1689, arg2.field1673, arg2.field1703, arg2.field1681, arg2.field1675, arg2.field1666, arg2.field1677, arg2.field1680, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
   }

   @OriginalMember(
      owner = "client!i",
      name = "<init>",
      descriptor = "(Loa;)V",
      line = 274
   )
   public class44(class722 arg0) {
      this.field466 = arg0;
      this.field467 = null;
      this.method319(arg0);
   }

   @OriginalMember(
      owner = "client!i",
      name = "F",
      descriptor = "()Z"
   )
   public final native boolean method295();

   @OriginalMember(
      owner = "client!i",
      name = "ma",
      descriptor = "()I"
   )
   public final native int method299();

   @OriginalMember(
      owner = "client!i",
      name = "G",
      descriptor = "()I"
   )
   public final native int method300();

   @OriginalMember(
      owner = "client!i",
      name = "na",
      descriptor = "()I"
   )
   public final native int method302();

   @OriginalMember(
      owner = "client!i",
      name = "H",
      descriptor = "(III)V"
   )
   public final native void method303(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);

   @OriginalMember(
      owner = "client!i",
      name = "EA",
      descriptor = "()I"
   )
   public final native int method304();

   @OriginalMember(
      owner = "client!i",
      name = "ZA",
      descriptor = "(Li;Li;IZZ)V"
   )
   public final native void method305(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

   @OriginalMember(
      owner = "client!i",
      name = "RA",
      descriptor = "()I"
   )
   public final native int method306();

   @OriginalMember(
      owner = "client!i",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final native void method308(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!i",
      name = "VA",
      descriptor = "(I)V"
   )
   public final native void method310(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "da",
      descriptor = "()I"
   )
   public final native int method311();

   @OriginalMember(
      owner = "client!i",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final native class193 method313(class193 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "LA",
      descriptor = "(I)V"
   )
   public final native void method314(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "WA",
      descriptor = "()I"
   )
   public final native int method315();

   @OriginalMember(
      owner = "client!i",
      name = "a",
      descriptor = "(I)V"
   )
   public final native void method316(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "wa",
      descriptor = "()V"
   )
   public final native void method317();

   @OriginalMember(
      owner = "client!i",
      name = "oa",
      descriptor = "(Loa;)V"
   )
   private final native void method319(class722 arg0);

   @OriginalMember(
      owner = "client!i",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final native void method320(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final native void method322(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!i",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final native void method324(short arg0, short arg1);

   @OriginalMember(
      owner = "client!i",
      name = "J",
      descriptor = "(JIZ)V"
   )
   private final native void method325(long arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!i",
      name = "ua",
      descriptor = "()I"
   )
   public final native int method326();

   @OriginalMember(
      owner = "client!i",
      name = "v",
      descriptor = "()V"
   )
   public final native void method327();

   @OriginalMember(
      owner = "client!i",
      name = "k",
      descriptor = "(I)V"
   )
   public final native void method328(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final native void method330(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!i",
      name = "r",
      descriptor = "()Z"
   )
   public final native boolean method332();

   @OriginalMember(
      owner = "client!i",
      name = "s",
      descriptor = "(I)V"
   )
   public final native void method333(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "NA",
      descriptor = "()Z"
   )
   public final native boolean method334();

   @OriginalMember(
      owner = "client!i",
      name = "C",
      descriptor = "(I)V"
   )
   public final native void method336(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "l",
      descriptor = "(JI[IIIIIZ)V"
   )
   private final native void method337(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

   @OriginalMember(
      owner = "client!i",
      name = "fa",
      descriptor = "()I"
   )
   public final native int method339();

   @OriginalMember(
      owner = "client!i",
      name = "FA",
      descriptor = "(I)V"
   )
   public final native void method340(int arg0);

   @OriginalMember(
      owner = "client!i",
      name = "HA",
      descriptor = "()I"
   )
   public final native int method342();

   @OriginalMember(
      owner = "client!i",
      name = "V",
      descriptor = "()I"
   )
   public final native int method344();

   @OriginalMember(
      owner = "client!i",
      name = "O",
      descriptor = "(III)V"
   )
   public final native void method346(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!i",
      name = "R",
      descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V"
   )
   private final native void method347(class722 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);
}
