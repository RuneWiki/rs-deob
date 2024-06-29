import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class724 extends class66 implements class560 {
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "Z"
   )
   private boolean field10555 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "Lll;"
   )
   private class387 field10563 = new class387();
   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "I"
   )
   private int field10570 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "I"
   )
   private int field10568 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "Lwv;"
   )
   private class37 field10571 = new class37(4);
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "Z"
   )
   private boolean field10575 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "Lew;"
   )
   private class521 field10567;
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10576 = new String[]{method5273(method5272("k9o")), method5273(method5272("J0)X\u000b")), method5273(method5272("n>\u007ftqe(};\u001ce1\u007ft,")), method5273(method5272("w:}\\8j0{p\ra/h|1p")), method5273(method5272("G>g{0p\u007fze:g6ol\u007fe3y}>$(`a7$1f{ri0gz\u007fb0ga\u007fq1ep,w\u007fzz2a0gp\u007fs-`a:w\u007f`a")), method5273(method5272("G\u000f\\")), method5273(method5272("W\fL")), method5273(method5272("w(:q"))};
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "[I"
   )
   private static int[] field10554 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "[S"
   )
   private static short[] field10556 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field10559 = field10554;
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "[B"
   )
   private static byte[] field10558 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "[I"
   )
   private static int[] field10561 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "[I"
   )
   private static int[] field10565 = field10554;
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "[F"
   )
   private static float[] field10564 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field10562 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[I"
   )
   private static int[] field10566 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "[I"
   )
   private static int[] field10557 = field10554;
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "[F"
   )
   private static float[] field10560 = field10564;
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "I"
   )
   public int field10573;
   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "Lp;"
   )
   private class231 field10569;
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "Lew;"
   )
   private class521 field10572;
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "Lya;"
   )
   private class59 field10553;
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "[La;"
   )
   private class646[] field10574;

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method499(Canvas arg0, int arg1, int arg2) {
      class231 var4 = (class231)this.field10571.method329((byte)-43, (long)arg0.hashCode());
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field10576[2]);
            Method var6 = var5.getMethod(field10576[3], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class231 var7 = new class231(this, arg0, arg1, arg2);
         this.field10571.method336(-1, (long)arg0.hashCode(), var7);
      } else {
         if (var4.field3247 != arg1 || var4.field3245 != arg2) {
            var4.method1801(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)Luu;"
   )
   public final class302 method498(int arg0, int arg1) {
      return new class530(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method530(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Lbg;"
   )
   public final class492 method565(int arg0, int arg1, boolean arg2) {
      return new class568(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method503() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method563();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class698(this, this.field10553, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIIII)V"
   )
   public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method5254(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method590(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lmha;Z)Lbg;"
   )
   public final class492 method500(class439 arg0, boolean arg1) {
      class568 var3 = new class568(this, arg0.field6264, arg0.field6268, arg0.field6270, 0, arg0.field6269, arg0.field6269, arg0.field6267);
      var3.method961(arg0.field6265, arg0.field6262, arg0.field6266, arg0.field6263);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method575(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method5254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method560(int arg0, int arg1) throws class525 {
      if (this.field10569 == null) {
         throw new IllegalStateException(field10576[0]);
      } else {
         this.field10569.method1802(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lio;IIII)Lka;"
   )
   public final class500 method555(class464 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class44(this, this.field10553, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method572(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(I)Lza;"
   )
   public final class438 method594(int arg0) {
      class59 var2 = new class59(this, arg0);
      this.field10563.method2930((byte)-108, var2);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Llc;Llc;FLlc;)Llc;"
   )
   public final class676 method540(class676 arg0, class676 arg1, float arg2, class676 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V"
   )
   private final void method5255() {
      System.gc();
      System.runFinalization();
      class499.method3619(-14705);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method517(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method525(int arg0) {
      this.field10573 = arg0;
      this.field10574 = new class646[this.field10573];

      for(int var2 = 0; var2 < this.field10573; ++var2) {
         this.field10574[var2] = new class646(this, this.field10568, this.field10570);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method524();

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Lmn;)V"
   )
   public final void method553(int arg0, class389[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field10557[var3++] = arg1[var4].method2955(false);
         field10557[var3++] = arg1[var4].method2959(-127);
         field10557[var3++] = arg1[var4].method2963(true);
         field10557[var3++] = arg1[var4].method2958((byte)114);
         field10560[var4] = arg1[var4].method2962(-1);
         field10557[var3++] = arg1[var4].method2961(127);
      }

      this.method5265(arg0, field10557, field10560);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method521(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method5256(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIII)Llc;"
   )
   public final class676 method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method5257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "()La;"
   )
   public final class646 method5258() {
      for(int var1 = 0; var1 < this.field10573; ++var1) {
         if (this.field10574[var1].field9444 == Thread.currentThread()) {
            return this.field10574[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method113(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method523();

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()V"
   )
   public final void method609() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method564() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method612(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method5258().method4704(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method505() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() {
      this.method567((byte)-123);
      if (this.nativeid != 0L) {
         class499.method3617(this, 0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method526() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()Ljr;"
   )
   public final class122 method573() {
      return new class122(0, field10576[6], 1, field10576[5], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method5259(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method557(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method547(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()Lew;"
   )
   public final class521 method598() {
      return this.field10567;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method506(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5260(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method528() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method545();

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()V"
   )
   public final void method537() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()V"
   )
   public final void method544() {
      if (!this.field10555) {
         this.field10574 = null;
         this.field10569 = null;
         this.field10553 = null;
         this.field10567 = null;
         this.field10571.method334((byte)125);

         for(class59 var1 = (class59)this.field10563.method2933(2); var1 != null; var1 = (class59)this.field10563.method2940(false)) {
            var1.method461();
         }

         this.field10563.method2934(0);
         this.method5269();
         if (this.field10575) {
            class165.method1365(-123, true, false);
            this.field10575 = false;
         }

         this.method5255();
         class499.method3618(0);
         this.field10555 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method5261(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lru;[Lmha;Z)Lda;"
   )
   public final class67 method502(class206 arg0, class439[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field6269;
         var5[var7] = arg1[var7].field6267;
         if (arg1[var7].field6270 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field10576[4]);
         } else {
            return new class694(this, this.field10553, arg0, arg1, (class492[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field10576[4]);
      } else {
         return new class19(this, this.field10553, arg0, arg1, (class492[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method508() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method571() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lst;Luu;)Lus;"
   )
   public final class1 method529(class461 arg0, class302 arg1) {
      return new class638(this, (class568)arg0, (class530)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method592(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lus;)V"
   )
   public final void method556(class1 arg0) {
      class638 var2 = (class638)arg0;
      this.method5259(var2.field9332.nativeid, var2.field9333.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()V"
   )
   public final void method579() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;"
   )
   private final Object method5262() {
      return new class410(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method5263(class231 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()I"
   )
   public final int method593() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z"
   )
   private final boolean method5264(short arg0) {
      class162 var2 = super.field802;
      synchronized(super.field802) {
         if (!super.field802.method1353(arg0, (byte)122)) {
            return false;
         } else {
            class317 var4 = super.field802.method1354(arg0, (byte)-109);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field4319 != 2) {
                  var6 = super.field802.method1350(0.7F, arg0, 128, 128, (byte)101, true);
               } else {
                  var6 = super.field802.method1351(128, 0.7F, true, arg0, 12356, 128);
               }

               this.method5268(arg0, var6, var4.field4314, var4.field4319, var4.field4308, var4.field4316, var4.field4317, var4.field4318, var4.field4321, var4.field4324, var4.field4326, var4.field4327, var4.field4328, var4.field4320, var4.field4310, var4.field4309, var4.field4313, var4.field4322, var4.field4312, var4.field4315, var4.field4329);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method534(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method538() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method606() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lrha;)V"
   )
   public final void method562(class234 arg0) {
      if (arg0.field3266.method4919(-25971) != 0) {
         this.method5271(arg0, false);
         this.method5258().method4689(this, field10565, field10566, field10561, field10556, arg0.field3266.method4919(-25971));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method614(class438 arg0) {
      this.field10553 = (class59)arg0;
      this.method5270(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method536(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()V"
   )
   public final void method514() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()V"
   )
   public final void method549() {
      this.method613(this.field10569.field3244);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)Lst;"
   )
   public final class461 method513(int arg0, int arg1) {
      return this.method565(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method493(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method595();

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method583() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method551(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()Lew;"
   )
   public final class521 method596() {
      return new class293();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()Lew;"
   )
   public final class521 method600() {
      return this.field10572;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8) {
      this.method5257(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method542(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method527(int arg0, class515 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method507() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method601(int arg0) {
      this.field10574[arg0].method4687();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method495(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method5265(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method599(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Llc;)V"
   )
   public final void method561(class676 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method604(int arg0) {
      this.field10568 = this.field10570 = arg0;
      if (this.field10573 > 1) {
         throw new IllegalStateException(field10576[1]);
      } else {
         this.method525(this.field10573);
         this.method570(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method511() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method492(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method546(int[] arg0) {
      Dimension var2 = this.field10569.field3244.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method576(arg0, arg1, arg2, arg4, arg5);
      this.method576(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method520(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method520(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z"
   )
   private final boolean method5266(short arg0) {
      synchronized(this) {
         class317 var3 = super.field802.method1354(arg0, (byte)-109);
         if (var3 == null) {
            return false;
         } else {
            this.method5260(arg0, var3.field4314, var3.field4319, var3.field4308, var3.field4316, var3.field4317, var3.field4318, var3.field4321, var3.field4324, var3.field4326, var3.field4327, var3.field4328, var3.field4320, var3.field4310, var3.field4309, var3.field4313, var3.field4322, var3.field4312, var3.field4315, var3.field4329);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method582(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Lmn;"
   )
   public final class389 method509(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class738(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method516(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method5267(class162 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method584(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method570(int arg0) {
      this.field10574[arg0].method4690();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method550(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class525 {
      if (this.field10569 == null) {
         throw new IllegalStateException(field10576[0]);
      } else {
         this.field10569.method1799(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class515 method602(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class51(this, this.field10553, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method613(Canvas arg0) {
      if (arg0 != null) {
         class231 var2 = (class231)this.field10571.method329((byte)106, (long)arg0.hashCode());
         this.field10569 = var2;
         this.method5263(var2);
      } else {
         this.field10569 = null;
         this.method5263((class231)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method574();

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method605(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method558();

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method520(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class724(Canvas arg0, class162 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class715.method5188(-19503, field10576[7])) {
            throw new RuntimeException("");
         } else {
            class499.method3621((byte)35);
            this.method5267(super.field802, 0, 0);
            class733.method5333(true, 127, false);
            this.field10575 = true;
            this.field10567 = new class293();
            this.method532(new class293());
            this.method525(1);
            this.method570(0);
            if (arg0 != null) {
               this.method499(arg0, arg2, arg3);
               this.method613(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method567((byte)-119);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method569() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method554(Canvas arg0) {
      if (this.field10569.field3244 == arg0) {
         this.method613((Canvas)null);
      }

      class231 var2 = (class231)this.field10571.method329((byte)-43, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method3165(121);
         var2.method1797();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method504();

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method587(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method611(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5268(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIZ)Lbg;"
   )
   public final class492 method552(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class568(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method576(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Lbg;"
   )
   public final class492 method515(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class568(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lew;)V"
   )
   public final void method532(class521 arg0) {
      this.field10572 = arg0;
      this.method5261(((class293)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()V"
   )
   public final void method510() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method597(int arg0) {
      class499.method3619(-14705);
      this.method5256(arg0);

      for(class59 var2 = (class59)this.field10563.method2933(2); var2 != null; var2 = (class59)this.field10563.method2940(false)) {
         var2.method460();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method5269();

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method5270(class438 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lrha;Z)V"
   )
   private final void method5271(class234 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class624 var8 = (class624)arg0.field3266.method4921(0); var8 != null; var8 = (class624)arg0.field3266.method4923(-23743)) {
         field10565[var3++] = var8.field9180;
         field10565[var3++] = var8.field9172;
         field10565[var3++] = var8.field9174;
         field10566[var4++] = var8.field9175;
         field10556[var6++] = (short)var8.field9179;
         field10561[var5++] = var8.field9181;
         if (arg1) {
            field10558[var7++] = var8.field9170;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method531(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method518();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lrha;I)V"
   )
   public final void method535(class234 arg0, int arg1) {
      this.method5271(arg0, false);
      this.method5258().method4689(this, field10565, field10566, field10561, field10556, arg0.field3266.method4919(-25971));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method543(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method588(Canvas arg0, int arg1, int arg2) {
      class231 var4 = (class231)this.field10571.method329((byte)101, (long)arg0.hashCode());
      var4.method1801(arg0, arg1, arg2);
      if (arg0 != null && this.field10569.field3244 == arg0) {
         this.method613(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5272(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5273(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
