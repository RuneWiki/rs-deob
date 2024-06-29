import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class53 extends class479 implements class787 {
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "Z"
   )
   private boolean field716 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "Lrca;"
   )
   private class37 field727 = new class37();
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "I"
   )
   private int field733 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "I"
   )
   private int field732 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "Lhv;"
   )
   private class227 field731 = new class227(4);
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "Z"
   )
   private boolean field735 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "Lkia;"
   )
   private class93 field734;
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field738 = new String[]{method522(method521("Wsi/:")), method522(method521("jkz\u0006")), method522(method521("ZL\u001c")), method522(method521("JO\f")), method522(method521("vz/")), method522(method521("Z}'\f\u0001m<:\u0012\u000bzu/\u001bNxp9\n\u000f9k \u0016\u00069r&\fCts'\rN\u007fs'\u0016Nlr%\u0007\u001dj<:\r\u0003|s'\u0007Nnn \u0016\u000bj< \u0016")), method522(method521("s}?\u0003@xk=L-xr?\u0003\u001d")), method522(method521("jy=+\tws;\u0007<|l(\u000b\u0000m"))};
   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "[I"
   )
   private static int[] field717 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field718 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "[I"
   )
   private static int[] field720 = field717;
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "[B"
   )
   private static byte[] field724 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "[F"
   )
   private static float[] field721 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "R",
      descriptor = "[F"
   )
   private static float[] field719 = field721;
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field723 = field717;
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "[I"
   )
   private static int[] field722 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[S"
   )
   private static short[] field725 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "[I"
   )
   private static int[] field726 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "[I"
   )
   private static int[] field728 = field717;
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "I"
   )
   public int field737;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "Lya;"
   )
   private class319 field715;
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "Lp;"
   )
   private class64 field730;
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "Lkia;"
   )
   private class93 field729;
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "[La;"
   )
   private class685[] field736;

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()V"
   )
   public final void method393() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method394(int arg0) {
      this.field736[arg0].method4989();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()Lkia;"
   )
   public final class93 method396() {
      return this.field734;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkia;)V"
   )
   public final void method397(class93 arg0) {
      this.field729 = arg0;
      this.method475(((class671)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Lpd;"
   )
   public final class648 method398(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class333(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method399() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method400();

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()V"
   )
   public final void method401() {
      if (!this.field716) {
         this.field736 = null;
         this.field730 = null;
         this.field715 = null;
         this.field734 = null;
         this.field731.method1809(true);

         for(class319 var1 = (class319)this.field727.method288(0); var1 != null; var1 = (class319)this.field727.method290(17958)) {
            var1.method2519();
         }

         this.field727.method289(true);
         this.method498();
         if (this.field735) {
            class201.method1661(20251, false, true);
            this.field735 = false;
         }

         this.method441();
         class611.method4510(-31081);
         this.field716 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lu;Z)Lpd;"
   )
   public final class648 method402(class65 arg0, boolean arg1) {
      class333 var3 = new class333(this, arg0.field813, arg0.field818, arg0.field815, 0, arg0.field819, arg0.field819, arg0.field820);
      var3.method2405(arg0.field816, arg0.field814, arg0.field817, arg0.field821);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method453().method5015(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method405(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() {
      this.method3649(false);
      if (this.nativeid != 0L) {
         class611.method4509(-7155, this);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method406(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkc;Lkc;FLkc;)Lkc;"
   )
   public final class72 method407(class72 arg0, class72 arg1, float arg2, class72 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method408() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)Lsq;"
   )
   public final class220 method409(int arg0, int arg1) {
      return new class572(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method410(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method411(Canvas arg0, int arg1, int arg2) {
      class64 var4 = (class64)this.field731.method1818(-1, (long)arg0.hashCode());
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field738[6]);
            Method var6 = var5.getMethod(field738[7], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class64 var7 = new class64(this, arg0, arg1, arg2);
         this.field731.method1808((long)arg0.hashCode(), var7, 26459);
      } else {
         if (var4.field809 != arg1 || var4.field811 != arg2) {
            var4.method573(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method412(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method413(class64 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIIZ)Lpd;"
   )
   public final class648 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class333(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)Loga;"
   )
   public final class179 method415(int arg0, int arg1) {
      return this.method435(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method416(int[] arg0) {
      Dimension var2 = this.field730.field812.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method417(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method418(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method419();

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method420(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method421(int arg0, class87 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method422() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIIII)Lkc;"
   )
   public final class72 method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method424(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()Ljv;"
   )
   public final class776 method425() {
      return new class776(0, field738[3], 1, field738[2], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class53(Canvas arg0, class102 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class52.method385(field738[1], -83)) {
            throw new RuntimeException("");
         } else {
            class611.method4507((byte)35);
            this.method427(super.field6667, 0, 0);
            class387.method3051(-74, true, false);
            this.field735 = true;
            this.field734 = new class671();
            this.method397(new class671());
            this.method514(1);
            this.method394(0);
            if (arg0 != null) {
               this.method411(arg0, arg2, arg3);
               this.method470(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method3649(false);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method426(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method427(class102 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method428(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method429(int arg0) {
      this.field736[arg0].method4994();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkv;[Lu;Z)Lda;"
   )
   public final class447 method430(class19 arg0, class65[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field819;
         var5[var7] = arg1[var7].field820;
         if (arg1[var7].field815 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field738[5]);
         } else {
            return new class240(this, this.field715, arg0, arg1, (class648[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field738[5]);
      } else {
         return new class766(this, this.field715, arg0, arg1, (class648[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method431(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method432(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method433() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Lpd;"
   )
   public final class648 method435(int arg0, int arg1, boolean arg2) {
      return new class333(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method437(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()V"
   )
   public final void method438() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method439(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method440() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V"
   )
   private final void method441() {
      System.gc();
      System.runFinalization();
      class611.method4506(109);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method443();

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method444(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Loga;Lsq;)Lkr;"
   )
   public final class122 method445(class179 arg0, class220 arg1) {
      return new class358(this, (class333)arg0, (class572)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method436(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method447(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method448() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method449(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method450();

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method451(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method452(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "()La;"
   )
   public final class685 method453() {
      for(int var1 = 0; var1 < this.field737; ++var1) {
         if (this.field736[var1].field10099 == Thread.currentThread()) {
            return this.field736[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
      this.method489(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method455() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method458(int arg0) {
      class611.method4506(43);
      this.method449(arg0);

      for(class319 var2 = (class319)this.field727.method288(0); var2 != null; var2 = (class319)this.field727.method290(17958)) {
         var2.method2520();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method459(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method460(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method461() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method474(arg0, arg1, arg2, arg4, arg5);
      this.method474(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method463(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method463(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method463(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method464(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method465() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lnh;Z)V"
   )
   private final void method466(class554 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class74 var8 = (class74)arg0.field8138.method676((byte)121); var8 != null; var8 = (class74)arg0.field8138.method677(-100)) {
         field720[var3++] = var8.field974;
         field720[var3++] = var8.field976;
         field720[var3++] = var8.field977;
         field726[var4++] = var8.field980;
         field725[var6++] = (short)var8.field975;
         field722[var5++] = var8.field982;
         if (arg1) {
            field724[var7++] = var8.field983;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method468(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(I)Lza;"
   )
   public final class735 method469(int arg0) {
      class319 var2 = new class319(this, arg0);
      this.field727.method279(false, var2);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method470(Canvas arg0) {
      if (arg0 != null) {
         class64 var2 = (class64)this.field731.method1818(-1, (long)arg0.hashCode());
         this.field730 = var2;
         this.method413(var2);
      } else {
         this.field730 = null;
         this.method413((class64)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method471(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class221 {
      if (this.field730 == null) {
         throw new IllegalStateException(field738[4]);
      } else {
         this.field730.method575(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method473(Canvas arg0) {
      if (this.field730.field812 == arg0) {
         this.method470((Canvas)null);
      }

      class64 var2 = (class64)this.field731.method1818(-1, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method4924(-2970);
         var2.method568();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method474(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method475(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method476(int arg0, int arg1) throws class221 {
      if (this.field730 == null) {
         throw new IllegalStateException(field738[4]);
      } else {
         this.field730.method569(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method477(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z"
   )
   private final boolean method478(short arg0) {
      class102 var2 = super.field6667;
      synchronized(super.field6667) {
         if (!super.field6667.method915(arg0, 127)) {
            return false;
         } else {
            class668 var4 = super.field6667.method911(arg0, -84);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field9898 != 2) {
                  var6 = super.field6667.method913(128, arg0, true, 112, 0.7F, 128);
               } else {
                  var6 = super.field6667.method914(arg0, 128, 128, true, 0.7F, true);
               }

               this.method424(arg0, var6, var4.field9890, var4.field9898, var4.field9911, var4.field9889, var4.field9895, var4.field9901, var4.field9887, var4.field9891, var4.field9905, var4.field9909, var4.field9894, var4.field9910, var4.field9899, var4.field9906, var4.field9902, var4.field9900, var4.field9896, var4.field9893, var4.field9904);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class87 method479(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class305(this, this.field715, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()Lkia;"
   )
   public final class93 method480() {
      return new class671();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()V"
   )
   public final void method481() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class423 method482(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class678(this, this.field715, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method483(class735 arg0) {
      this.field715 = (class319)arg0;
      this.method492(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()Lkia;"
   )
   public final class93 method484() {
      return this.field729;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Lue;)V"
   )
   public final void method485(int arg0, class243[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field728[var3++] = arg1[var4].method1927((byte)-8);
         field728[var3++] = arg1[var4].method1926(77);
         field728[var3++] = arg1[var4].method1928(-98);
         field728[var3++] = arg1[var4].method1933(false);
         field719[var4] = arg1[var4].method1931(false);
         field728[var3++] = arg1[var4].method1929(-1);
      }

      this.method459(arg0, field728, field719);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;"
   )
   private final Object method486() {
      return new class126(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()I"
   )
   public final int method487() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method488() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkc;)V"
   )
   public final void method490(class72 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Lue;"
   )
   public final class243 method491(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class634(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method492(class735 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method493(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lls;IIII)Lka;"
   )
   public final class232 method494(class167 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class770(this, this.field715, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)I"
   )
   public final int method495(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method496(Canvas arg0, int arg1, int arg2) {
      class64 var4 = (class64)this.field731.method1818(-1, (long)arg0.hashCode());
      var4.method573(arg0, arg1, arg2);
      if (arg0 != null && this.field730.field812 == arg0) {
         this.method470(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method497();

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method498();

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method499();

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method500() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method501(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method502();

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method503(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method504(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()V"
   )
   public final void method505() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method506(int arg0) {
      this.field732 = this.field733 = arg0;
      if (this.field737 > 1) {
         throw new IllegalStateException(field738[0]);
      } else {
         this.method514(this.field737);
         this.method394(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()V"
   )
   public final void method507() {
      this.method470(this.field730.field812);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lnh;)V"
   )
   public final void method508(class554 arg0) {
      if (arg0.field8138.method680(0) != 0) {
         this.method466(arg0, false);
         this.method453().method5005(this, field720, field726, field722, field725, arg0.field8138.method680(0));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method509(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkr;)V"
   )
   public final void method510(class122 arg0) {
      class358 var2 = (class358)arg0;
      this.method503(var2.field4981.nativeid, var2.field4982.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z"
   )
   private final boolean method511(short arg0) {
      synchronized(this) {
         class668 var3 = super.field6667.method911(arg0, 80);
         if (var3 == null) {
            return false;
         } else {
            this.method471(arg0, var3.field9890, var3.field9898, var3.field9911, var3.field9889, var3.field9895, var3.field9901, var3.field9887, var3.field9891, var3.field9905, var3.field9909, var3.field9894, var3.field9910, var3.field9899, var3.field9906, var3.field9902, var3.field9900, var3.field9896, var3.field9893, var3.field9904);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method512();

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method514(int arg0) {
      this.field737 = arg0;
      this.field736 = new class685[this.field737];

      for(int var2 = 0; var2 < this.field737; ++var2) {
         this.field736[var2] = new class685(this, this.field732, this.field733);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method515() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method516(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lnh;I)V"
   )
   public final void method517(class554 arg0, int arg1) {
      this.method466(arg0, false);
      this.method453().method5005(this, field720, field726, field722, field725, arg0.field8138.method680(0));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()V"
   )
   public final void method518() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method519();

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method520() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method521(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method522(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
