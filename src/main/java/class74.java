import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class74 extends class610 implements class245 {
   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "Z"
   )
   private boolean field942 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "Lsn;"
   )
   private class675 field941 = new class675();
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "I"
   )
   private int field955 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "I"
   )
   private int field952 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "Let;"
   )
   private class389 field956 = new class389(4);
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "Z"
   )
   private boolean field960 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "Lkf;"
   )
   private class401 field951;
   @OriginalMember(
      owner = "client!oa",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field963 = new String[]{method709(method708("\u001aBc9")), method709(method708(":f\u0015")), method709(method708("*e\u0005")), method709(method708("\u0006S6")), method709(method708("*T>3^\u001d\u0015#-T\n\\6$\u0011\bY 5PIB9)YI[?3\u001c\u0004Z>2\u0011\u000fZ>)\u0011\u001c[<8B\u001a\u0015#2\\\fZ>8\u0011\u001eG9)T\u001a\u00159)")), method709(method708("\u0003T&<\u001f\bB$sr\b[&<B")), method709(method708("\u001aP$\u0014V\u0007Z\"8c\fE14_\u001d")), method709(method708("'Zp\u0010e"))};
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "[I"
   )
   private static int[] field943 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "[I"
   )
   public static int[] field947 = field943;
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "[F"
   )
   private static float[] field945 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "[F"
   )
   private static float[] field946 = field945;
   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "[I"
   )
   private static int[] field949 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "[I"
   )
   private static int[] field948 = field943;
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "[B"
   )
   private static byte[] field944 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "[I"
   )
   private static int[] field954 = field943;
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "[I"
   )
   private static int[] field958 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field950 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[S"
   )
   private static short[] field961 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "I"
   )
   public int field962;
   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "Lkf;"
   )
   private class401 field957;
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "Lp;"
   )
   private class470 field953;
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "Lya;"
   )
   private class515 field940;
   @OriginalMember(
      owner = "client!oa",
      name = "R",
      descriptor = "[La;"
   )
   private class661[] field959;

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 3
   )
   public final void method579(Canvas arg0) {
      if (arg0 != null) {
         class470 var2 = (class470)this.field956.method3141((long)arg0.hashCode(), true);
         this.field953 = var2;
         this.method644(var2);
      } else {
         this.field953 = null;
         this.method644((class470)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Llja;",
      line = 21
   )
   public final class404 method583(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class461(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)I",
      line = 24
   )
   public final int method584(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()Z",
      line = 27
   )
   public final boolean method585() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()Z",
      line = 31
   )
   public final boolean method587() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 39
   )
   public final void method593(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class623 {
      if (this.field953 == null) {
         throw new IllegalStateException(field963[3]);
      } else {
         this.field953.method3654(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Z",
      line = 49
   )
   public final boolean method594() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "()La;",
      line = 55
   )
   public final class661 method596() {
      for(int var1 = 0; var1 < this.field962; ++var1) {
         if (this.field959[var1].field9920 == Thread.currentThread()) {
            return this.field959[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V",
      line = 67
   )
   public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8) {
      this.method588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lqda;[Lkp;Z)Lda;",
      line = 71
   )
   public final class288 method598(class697 arg0, class776[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field11395;
         var5[var7] = arg1[var7].field11394;
         if (arg1[var7].field11398 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field963[4]);
         } else {
            return new class414(this, this.field940, arg0, arg1, (class672[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field963[4]);
      } else {
         return new class778(this, this.field940, arg0, arg1, (class672[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V",
      line = 110
   )
   public class74(Canvas arg0, class150 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class158.method1410((byte)-93, field963[0])) {
            throw new RuntimeException("");
         } else {
            class613.method4519(100);
            this.method671(super.field8891, 0, 0);
            class274.method2325(false, 1, true);
            this.field960 = true;
            this.field951 = new class712();
            this.method688(new class712());
            this.method685(1);
            this.method676(0);
            if (arg0 != null) {
               this.method674(arg0, arg2, arg3);
               this.method579(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method4495(true);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;",
      line = 137
   )
   private final Object method601() {
      return new class122(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(IIIIII)V",
      line = 142
   )
   public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method665(arg0, arg1, arg2, arg4, arg5);
      this.method665(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method663(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method663(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lpr;Lpr;FLpr;)Lpr;",
      line = 148
   )
   public final class331 method603(class331 arg0, class331 arg1, float arg2, class331 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lfca;Z)V",
      line = 152
   )
   private final void method604(class43 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class194 var8 = (class194)arg0.field571.method120(124); var8 != null; var8 = (class194)arg0.field571.method125(0)) {
         field948[var3++] = var8.field3005;
         field948[var3++] = var8.field3009;
         field948[var3++] = var8.field3014;
         field949[var4++] = var8.field3011;
         field961[var6++] = (short)var8.field3007;
         field958[var5++] = var8.field3013;
         if (arg1) {
            field944[var7++] = var8.field3010;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()Lkf;",
      line = 183
   )
   public final class401 method605() {
      return this.field957;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkp;Z)Ljq;",
      line = 187
   )
   public final class672 method606(class776 arg0, boolean arg1) {
      class254 var3 = new class254(this, arg0.field11400, arg0.field11396, arg0.field11398, 0, arg0.field11395, arg0.field11395, arg0.field11394);
      var3.method2107(arg0.field11401, arg0.field11397, arg0.field11402, arg0.field11399);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(IIIIII)Lpr;",
      line = 192
   )
   public final class331 method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;",
      line = 196
   )
   public final class96 method608(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class575(this, this.field940, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lsv;Lip;)Lcl;",
      line = 199
   )
   public final class141 method609(class166 arg0, class726 arg1) {
      return new class402(this, (class254)arg0, (class229)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()Z",
      line = 202
   )
   public final boolean method610() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V",
      line = 206
   )
   public final void method611(int[] arg0) {
      Dimension var2 = this.field953.field7155.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;",
      line = 211
   )
   public final class271 method612(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class350(this, this.field940, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Z)V",
      line = 214
   )
   public final void method613(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lnga;IIII)Lka;",
      line = 217
   )
   public final class91 method614(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class270(this, this.field940, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Z",
      line = 224
   )
   public final boolean method617() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()V",
      line = 227
   )
   public final void method618() {
      this.method579(this.field953.field7155);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V",
      line = 230
   )
   public final void method619(class624 arg0) {
      this.field940 = (class515)arg0;
      this.method692(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)Lsv;",
      line = 234
   )
   public final class166 method620(int arg0, int arg1) {
      return this.method697(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()V",
      line = 236
   )
   public final void method621() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z",
      line = 239
   )
   private final boolean method622(short arg0) {
      synchronized(this) {
         class453 var3 = super.field8891.method1373(arg0, (byte)-54);
         if (var3 == null) {
            return false;
         } else {
            this.method615(arg0, var3.field6922, var3.field6927, var3.field6924, var3.field6923, var3.field6931, var3.field6933, var3.field6930, var3.field6935, var3.field6926, var3.field6932, var3.field6934, var3.field6942, var3.field6939, var3.field6937, var3.field6938, var3.field6936, var3.field6940, var3.field6928, var3.field6925);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V",
      line = 250
   )
   private final void method623() {
      System.gc();
      System.runFinalization();
      class613.method4517((byte)-107);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()Lkf;",
      line = 255
   )
   public final class401 method624() {
      return new class712();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()Z",
      line = 262
   )
   public final boolean method628() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIZ)Ljq;",
      line = 268
   )
   public final class672 method630(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class254(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Z)V",
      line = 271
   )
   public final void method632(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "(I)Lza;",
      line = 276
   )
   public final class624 method634(int arg0) {
      class515 var2 = new class515(this, arg0);
      this.field941.method4980(var2, 0);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V",
      line = 281
   )
   public final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)Lip;",
      line = 285
   )
   public final class726 method638(int arg0, int arg1) {
      return new class229(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()Lkf;",
      line = 289
   )
   public final class401 method640() {
      return this.field951;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lfca;I)V",
      line = 293
   )
   public final void method641(class43 arg0, int arg1) {
      this.method604(arg0, false);
      this.method596().method4885(this, field948, field949, field958, field961, arg0.field571.method127(0));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(I)V",
      line = 300
   )
   public final void method645(int arg0) {
      this.field959[arg0].method4883();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()V",
      line = 302
   )
   public final void method646() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 306
   )
   public final void method647(Canvas arg0, int arg1, int arg2) {
      class470 var4 = (class470)this.field956.method3141((long)arg0.hashCode(), true);
      var4.method3655(arg0, arg1, arg2);
      if (arg0 != null && this.field953.field7155 == arg0) {
         this.method579(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 314
   )
   public final void method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method596().method4893(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V",
      line = 317
   )
   public final void method651(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lfca;)V",
      line = 320
   )
   public final void method652(class43 arg0) {
      if (arg0.field571.method127(0) != 0) {
         this.method604(arg0, false);
         this.method596().method4885(this, field948, field949, field958, field961, arg0.field571.method127(0));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()Lap;",
      line = 327
   )
   public final class266 method653() {
      return new class266(0, field963[1], 1, field963[2], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V",
      line = 333
   )
   public final void method657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Ljq;",
      line = 336
   )
   public final class672 method658(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class254(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 338
   )
   public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()Z",
      line = 341
   )
   public final boolean method660() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()Z",
      line = 346
   )
   public final boolean method662() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()Z",
      line = 351
   )
   public final boolean method664() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lpr;)V",
      line = 358
   )
   public final void method667(class331 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()Z",
      line = 361
   )
   public final boolean method668() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()V",
      line = 367
   )
   public final void method672() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()Z",
      line = 370
   )
   public final boolean method673() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 375
   )
   public final void method674(Canvas arg0, int arg1, int arg2) {
      class470 var4 = (class470)this.field956.method3141((long)arg0.hashCode(), true);
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field963[5]);
            Method var6 = var5.getMethod(field963[6], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class470 var7 = new class470(this, arg0, arg1, arg2);
         this.field956.method3143(125, var7, (long)arg0.hashCode());
      } else {
         if (var4.field7154 != arg1 || var4.field7153 != arg2) {
            var4.method3655(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()V",
      line = 398
   )
   public final void method675() {
      if (!this.field942) {
         this.field959 = null;
         this.field953 = null;
         this.field940 = null;
         this.field951 = null;
         this.field956.method3149(-71);

         for(class515 var1 = (class515)this.field941.method4972((byte)-84); var1 != null; var1 = (class515)this.field941.method4975((byte)107)) {
            var1.method3988();
         }

         this.field941.method4981((byte)-105);
         this.method637();
         if (this.field960) {
            class595.method4428(false, (byte)-107, true);
            this.field960 = false;
         }

         this.method623();
         class613.method4516((byte)108);
         this.field942 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "(I)V",
      line = 428
   )
   public final void method676(int arg0) {
      this.field959[arg0].method4881();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()Z",
      line = 431
   )
   public final boolean method677() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z",
      line = 434
   )
   private final boolean method678(short arg0) {
      class150 var2 = super.field8891;
      synchronized(super.field8891) {
         if (!super.field8891.method1372(-118, arg0)) {
            return false;
         } else {
            class453 var4 = super.field8891.method1373(arg0, (byte)-54);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field6927 != 2) {
                  var6 = super.field8891.method1375(128, 0.7F, true, 128, arg0, -9197);
               } else {
                  var6 = super.field8891.method1374(-2395, 128, true, arg0, 0.7F, 128);
               }

               this.method633(arg0, var6, var4.field6922, var4.field6927, var4.field6924, var4.field6923, var4.field6931, var4.field6933, var4.field6930, var4.field6935, var4.field6926, var4.field6932, var4.field6934, var4.field6942, var4.field6939, var4.field6937, var4.field6938, var4.field6936, var4.field6940, var4.field6928, var4.field6925);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "()V",
      line = 458
   )
   public final void method680() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V",
      line = 461
   )
   public final void method681(int arg0) {
      class613.method4517((byte)-107);
      this.method682(arg0);

      for(class515 var2 = (class515)this.field941.method4972((byte)-84); var2 != null; var2 = (class515)this.field941.method4975((byte)126)) {
         var2.method3987();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(I)V",
      line = 478
   )
   public final void method685(int arg0) {
      this.field962 = arg0;
      this.field959 = new class661[this.field962];

      for(int var2 = 0; var2 < this.field962; ++var2) {
         this.field959[var2] = new class661(this, this.field955, this.field952);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V",
      line = 492
   )
   public final void method686(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()I",
      line = 495
   )
   public final int method687() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkf;)V",
      line = 498
   )
   public final void method688(class401 arg0) {
      this.field957 = arg0;
      this.method648(((class712)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()Z",
      line = 503
   )
   public final boolean method689() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)I",
      line = 508
   )
   public final int method690(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lcl;)V",
      line = 522
   )
   public final void method693(class141 arg0) {
      class402 var2 = (class402)arg0;
      this.method684(var2.field6293.nativeid, var2.field6291.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(I)V",
      line = 529
   )
   public final void method694(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(IIIIII)V",
      line = 532
   )
   public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method698(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Llja;)V",
      line = 536
   )
   public final void method696(int arg0, class404[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field954[var3++] = arg1[var4].method3246((byte)-127);
         field954[var3++] = arg1[var4].method3253(0);
         field954[var3++] = arg1[var4].method3247((byte)-117);
         field954[var3++] = arg1[var4].method3249((byte)3);
         field946[var4] = arg1[var4].method3252((byte)-120);
         field954[var3++] = arg1[var4].method3251(0);
      }

      this.method595(arg0, field954, field946);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Ljq;",
      line = 554
   )
   public final class672 method697(int arg0, int arg1, boolean arg2) {
      return new class254(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)V",
      line = 558
   )
   public final void method699(int arg0, int arg1) throws class623 {
      if (this.field953 == null) {
         throw new IllegalStateException(field963[3]);
      } else {
         this.field953.method3658(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()Z",
      line = 575
   )
   public final boolean method702() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 584
   )
   public final void method703(Canvas arg0) {
      if (this.field953.field7155 == arg0) {
         this.method579((Canvas)null);
      }

      class470 var2 = (class470)this.field956.method3141((long)arg0.hashCode(), true);
      if (var2 != null) {
         var2.method2477(1976);
         var2.method3660();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)V",
      line = 609
   )
   public final void method704(int arg0) {
      this.field955 = this.field952 = arg0;
      if (this.field962 > 1) {
         throw new IllegalStateException(field963[7]);
      } else {
         this.method685(this.field962);
         this.method676(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V",
      line = 631
   )
   protected final synchronized void finalize() {
      this.method4495(true);
      if (this.nativeid != 0L) {
         class613.method4518(this, -1);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()V",
      line = 637
   )
   public final void method705() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method580(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method581(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method582(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method586(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method589(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method590(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method591();

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method592(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method595(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method600(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method615(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method616();

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method625(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method626(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method627(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method629(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method633(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method635();

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method637();

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method639(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method642(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method643(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method644(class470 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method648(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method654(int arg0, class96 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method655();

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method656(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method661();

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method663(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method665(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method666();

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method669();

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method670(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method671(class150 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method679(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method682(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method683(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method684(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method691(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method692(class624 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method700(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method701();

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method706();

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
