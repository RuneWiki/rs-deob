import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class721 extends class65 implements class556 {
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "Z"
   )
   private boolean field10418 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "Liw;"
   )
   private class332 field10416 = new class332();
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "I"
   )
   private int field10428 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "I"
   )
   private int field10432 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "Lld;"
   )
   private class178 field10433 = new class178(4);
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "Z"
   )
   private boolean field10437 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "Ldfa;"
   )
   private class173 field10430;
   @OriginalMember(
      owner = "client!oa",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10439 = new String[]{method5236(method5235("\r\r\u0002\r :L\u001f\u0013*-\u0005\n\u001ao/\u0000\u001c\u000b.n\u001b\u0005\u0017'n\u0002\u0003\rb#\u0003\u0002\fo(\u0003\u0002\u0017o;\u0002\u0000\u0006<=L\u001f\f\"+\u0003\u0002\u0006o9\u001e\u0005\u0017*=L\u0005\u0017")), method5236(method5235("=\u001b_\u0007")), method5236(method5235("\u001d?)")), method5236(method5235("\r<9")), method5236(method5235("!\n\n")), method5236(method5235("\u0000\u0003L.\u001b")), method5236(method5235("=\t\u0018*( \u0003\u001e\u0006\u001d+\u001c\r\n!:")), method5236(method5235("$\r\u001a\u0002a/\u001b\u0018M\f/\u0002\u001a\u0002<"))};
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "[I"
   )
   private static int[] field10417 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field10420 = field10417;
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "[F"
   )
   private static float[] field10427 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field10426 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[I"
   )
   private static int[] field10424 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "[F"
   )
   private static float[] field10422 = field10427;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "[I"
   )
   private static int[] field10431 = field10417;
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "[S"
   )
   private static short[] field10423 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "[B"
   )
   private static byte[] field10425 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "[I"
   )
   private static int[] field10434 = field10417;
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "[I"
   )
   private static int[] field10421 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "I"
   )
   public int field10436;
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "Ldfa;"
   )
   private class173 field10435;
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "Lp;"
   )
   private class228 field10429;
   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "Lya;"
   )
   private class58 field10419;
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "[La;"
   )
   private class643[] field10438;

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()V",
      line = 3
   )
   public final void method375() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()V",
      line = 5
   )
   public final void method268() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 10
   )
   public final void method315(Canvas arg0) {
      if (arg0 != null) {
         class228 var2 = (class228)this.field10433.method1572((long)arg0.hashCode(), -16289);
         this.field10429 = var2;
         this.method5233(var2);
      } else {
         this.field10429 = null;
         this.method5233((class228)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V",
      line = 24
   )
   public final void method427(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V",
      line = 31
   )
   public final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
      this.method5218(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "(I)V",
      line = 35
   )
   public final void method442(int arg0) {
      this.field10428 = this.field10432 = arg0;
      if (this.field10436 > 1) {
         throw new IllegalStateException(field10439[5]);
      } else {
         this.method312(this.field10436);
         this.method391(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()Z",
      line = 44
   )
   public final boolean method404() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V",
      line = 47
   )
   public final void method323(int arg0) {
      this.field10438[arg0].method4730();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()I",
      line = 50
   )
   public final int method329() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lph;IIII)Lka;",
      line = 53
   )
   public final class495 method352(class668 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class43(this, this.field10419, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V",
      line = 58
   )
   public final void method286(class432 arg0) {
      this.field10419 = (class58)arg0;
      this.method5224(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "()La;",
      line = 65
   )
   public final class643 method5217() {
      for(int var1 = 0; var1 < this.field10436; ++var1) {
         if (this.field10438[var1].field9371 == Thread.currentThread()) {
            return this.field10438[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIIII)V",
      line = 77
   )
   public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method5234(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()V",
      line = 80
   )
   public final void method379() {
      this.method315(this.field10429.field3364);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;",
      line = 83
   )
   public final class510 method304(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class50(this, this.field10419, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lvm;I)V",
      line = 86
   )
   public final void method406(class713 arg0, int arg1) {
      this.method5226(arg0, false);
      this.method5217().method4711(this, field10434, field10424, field10421, field10423, arg0.field10342.method3162(4550));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)Lza;",
      line = 91
   )
   public final class432 method300(int arg0) {
      class58 var2 = new class58(this, arg0);
      this.field10416.method2585(var2, -74);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Z",
      line = 96
   )
   public final boolean method327() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(I)V",
      line = 100
   )
   public final void method391(int arg0) {
      this.field10438[arg0].method4705();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)I",
      line = 104
   )
   public final int method354(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)Leg;",
      line = 110
   )
   public final class117 method358(int arg0, int arg1) {
      return new class525(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()V",
      line = 115
   )
   public final void method438() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()Z",
      line = 118
   )
   public final boolean method274() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 121
   )
   public final void method381(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class328 {
      if (this.field10429 == null) {
         throw new IllegalStateException(field10439[4]);
      } else {
         this.field10429.method1894(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()Z",
      line = 131
   )
   public final boolean method348() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(IIIIII)V",
      line = 134
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method361(arg0, arg1, arg2, arg4, arg5);
      this.method361(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method299(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method299(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()Ldfa;",
      line = 141
   )
   public final class173 method398() {
      return this.field10435;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)V",
      line = 149
   )
   public final void method393(int arg0, int arg1) throws class328 {
      if (this.field10429 == null) {
         throw new IllegalStateException(field10439[4]);
      } else {
         this.field10429.method1896(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()Z",
      line = 159
   )
   public final boolean method351() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lrj;Leg;)Lsfa;",
      line = 163
   )
   public final class723 method301(class619 arg0, class117 arg1) {
      return new class635(this, (class565)arg0, (class525)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()V",
      line = 165
   )
   public final void method321() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Ltd;",
      line = 169
   )
   public final class476 method357(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class565(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()Lvfa;",
      line = 174
   )
   public final class698 method273() {
      return new class698(0, field10439[2], 1, field10439[3], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()Z",
      line = 177
   )
   public final boolean method392() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lsfa;)V",
      line = 181
   )
   public final void method253(class723 arg0) {
      class635 var2 = (class635)arg0;
      this.method5227(var2.field9259.nativeid, var2.field9258.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIZ)Ltd;",
      line = 186
   )
   public final class476 method342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class565(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lpa;)V",
      line = 189
   )
   public final void method402(class386 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z",
      line = 195
   )
   private final boolean method5222(short arg0) {
      synchronized(this) {
         class693 var3 = super.field1192.method1456(-8988, arg0);
         if (var3 == null) {
            return false;
         } else {
            this.method5221(arg0, var3.field10162, var3.field10155, var3.field10167, var3.field10164, var3.field10158, var3.field10153, var3.field10154, var3.field10170, var3.field10152, var3.field10173, var3.field10175, var3.field10172, var3.field10169, var3.field10159, var3.field10171, var3.field10161, var3.field10163, var3.field10157, var3.field10166);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V",
      line = 206
   )
   protected final synchronized void finalize() {
      this.method697(true);
      if (this.nativeid != 0L) {
         class350.method2702((byte)-108, this);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "(I)V",
      line = 212
   )
   public final void method378(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()Z",
      line = 215
   )
   public final boolean method328() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V",
      line = 218
   )
   public final void method371(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()Z",
      line = 224
   )
   public final boolean method267() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V",
      line = 227
   )
   public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 230
   )
   public final void method417(Canvas arg0) {
      if (this.field10429.field3364 == arg0) {
         this.method315((Canvas)null);
      }

      class228 var2 = (class228)this.field10433.method1572((long)arg0.hashCode(), -16289);
      if (var2 != null) {
         var2.method154(53);
         var2.method1893();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V",
      line = 243
   )
   public class721(Canvas arg0, class160 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class621.method4548((byte)68, field10439[1])) {
            throw new RuntimeException("");
         } else {
            class350.method2700((byte)95);
            this.method5232(super.field1192, 0, 0);
            class294.method2297(false, true, -18330);
            this.field10437 = true;
            this.field10430 = new class291();
            this.method338(new class291());
            this.method312(1);
            this.method391(0);
            if (arg0 != null) {
               this.method336(arg0, arg2, arg3);
               this.method315(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method697(true);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ltn;Z)Ltd;",
      line = 271
   )
   public final class476 method307(class94 arg0, boolean arg1) {
      class565 var3 = new class565(this, arg0.field1521, arg0.field1519, arg0.field1527, 0, arg0.field1523, arg0.field1523, arg0.field1520);
      var3.method3006(arg0.field1522, arg0.field1525, arg0.field1526, arg0.field1524);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()Ldfa;",
      line = 277
   )
   public final class173 method255() {
      return this.field10430;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()Z",
      line = 280
   )
   public final boolean method411() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z",
      line = 283
   )
   private final boolean method5225(short arg0) {
      class160 var2 = super.field1192;
      synchronized(super.field1192) {
         if (!super.field1192.method1455(arg0, 9777)) {
            return false;
         } else {
            class693 var4 = super.field1192.method1456(-8988, arg0);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field10155 != 2) {
                  var6 = super.field1192.method1459(0.7F, true, 128, arg0, 124, 128);
               } else {
                  var6 = super.field1192.method1460(0.7F, 128, arg0, true, 5517, 128);
               }

               this.method5219(arg0, var6, var4.field10162, var4.field10155, var4.field10167, var4.field10164, var4.field10158, var4.field10153, var4.field10154, var4.field10170, var4.field10152, var4.field10173, var4.field10175, var4.field10172, var4.field10169, var4.field10159, var4.field10171, var4.field10161, var4.field10163, var4.field10157, var4.field10166);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(Z)V",
      line = 307
   )
   public final void method394(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 309
   )
   public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Z)V",
      line = 311
   )
   public final void method317(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lvm;Z)V",
      line = 315
   )
   private final void method5226(class713 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class599 var8 = (class599)arg0.field10342.method3164(-123); var8 != null; var8 = (class599)arg0.field10342.method3166((byte)-121)) {
         field10434[var3++] = var8.field8645;
         field10434[var3++] = var8.field8630;
         field10434[var3++] = var8.field8634;
         field10424[var4++] = var8.field8641;
         field10423[var6++] = (short)var8.field8644;
         field10421[var5++] = var8.field8638;
         if (arg1) {
            field10425[var7++] = var8.field8642;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lpa;Lpa;FLpa;)Lpa;",
      line = 346
   )
   public final class386 method441(class386 arg0, class386 arg1, float arg2, class386 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 350
   )
   public final void method336(Canvas arg0, int arg1, int arg2) {
      class228 var4 = (class228)this.field10433.method1572((long)arg0.hashCode(), -16289);
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field10439[7]);
            Method var6 = var5.getMethod(field10439[6], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class228 var7 = new class228(this, arg0, arg1, arg2);
         this.field10433.method1566(var7, 24742, (long)arg0.hashCode());
      } else {
         if (var4.field3366 != arg1 || var4.field3363 != arg2) {
            var4.method1899(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Z",
      line = 375
   )
   public final boolean method308() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V",
      line = 377
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Ltd;",
      line = 381
   )
   public final class476 method265(int arg0, int arg1, boolean arg2) {
      return new class565(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ldfa;)V",
      line = 385
   )
   public final void method338(class173 arg0) {
      this.field10435 = arg0;
      this.method5230(((class291)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()V",
      line = 388
   )
   public final void method433() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)Lrj;",
      line = 391
   )
   public final class619 method263(int arg0, int arg1) {
      return this.method265(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(I)V",
      line = 395
   )
   public final void method312(int arg0) {
      this.field10436 = arg0;
      this.field10438 = new class643[this.field10436];

      for(int var2 = 0; var2 < this.field10436; ++var2) {
         this.field10438[var2] = new class643(this, this.field10428, this.field10432);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Lke;)V",
      line = 411
   )
   public final void method364(int arg0, class622[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field10431[var3++] = arg1[var4].method4560((byte)86);
         field10431[var3++] = arg1[var4].method4563(1);
         field10431[var3++] = arg1[var4].method4557((byte)-122);
         field10431[var3++] = arg1[var4].method4564((byte)-108);
         field10422[var4] = arg1[var4].method4556((byte)118);
         field10431[var3++] = arg1[var4].method4559((byte)-56);
      }

      this.method5220(arg0, field10431, field10422);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)I",
      line = 432
   )
   public final int method269(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Lke;",
      line = 439
   )
   public final class622 method258(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class213(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()Ldfa;",
      line = 442
   )
   public final class173 method432() {
      return new class291();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()Z",
      line = 449
   )
   public final boolean method410() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;",
      line = 452
   )
   private final Object method5228() {
      return new class404(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lika;[Ltn;Z)Lda;",
      line = 457
   )
   public final class66 method414(class445 arg0, class94[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field1523;
         var5[var7] = arg1[var7].field1520;
         if (arg1[var7].field1527 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field10439[0]);
         } else {
            return new class691(this, this.field10419, arg0, arg1, (class476[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field10439[0]);
      } else {
         return new class19(this, this.field10419, arg0, arg1, (class476[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V",
      line = 494
   )
   private final void method5229() {
      System.gc();
      System.runFinalization();
      class350.method2701((byte)28);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;",
      line = 503
   )
   public final class293 method396(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class695(this, this.field10419, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 509
   )
   public final void method310(Canvas arg0, int arg1, int arg2) {
      class228 var4 = (class228)this.field10433.method1572((long)arg0.hashCode(), -16289);
      var4.method1899(arg0, arg1, arg2);
      if (arg0 != null && this.field10429.field3364 == arg0) {
         this.method315(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "(I)V",
      line = 517
   )
   public final void method444(int arg0) {
      class350.method2701((byte)28);
      this.method5223(arg0);

      for(class58 var2 = (class58)this.field10416.method2579(-801); var2 != null; var2 = (class58)this.field10416.method2583(1)) {
         var2.method655();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 535
   )
   public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method5217().method4733(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()Z",
      line = 539
   )
   public final boolean method386() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIII)Lpa;",
      line = 547
   )
   public final class386 method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V",
      line = 552
   )
   public final void method264(int[] arg0) {
      Dimension var2 = this.field10429.field3364.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()Z",
      line = 558
   )
   public final boolean method416() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()V",
      line = 563
   )
   public final void method272() {
      if (!this.field10418) {
         this.field10438 = null;
         this.field10429 = null;
         this.field10419 = null;
         this.field10430 = null;
         this.field10433.method1570((byte)15);

         for(class58 var1 = (class58)this.field10416.method2579(-801); var1 != null; var1 = (class58)this.field10416.method2583(1)) {
            var1.method654();
         }

         this.field10416.method2580((byte)-4);
         this.method5231();
         if (this.field10437) {
            class741.method5347(false, 63, true);
            this.field10437 = false;
         }

         this.method5229();
         class350.method2703((byte)-7);
         this.field10418 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lvm;)V",
      line = 649
   )
   public final void method256(class713 arg0) {
      if (arg0.field10342.method3162(4550) != 0) {
         this.method5226(arg0, false);
         this.method5217().method4711(this, field10434, field10424, field10421, field10423, arg0.field10342.method3162(4550));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method280(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method367(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method316(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method309(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method374();

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method5218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method421(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method260(int arg0, class510 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method287();

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method254(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method318();

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5219(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method339(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method5220(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method424(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method297(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method437();

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5221(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method139(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method5223(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method407(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method5224(class432 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method278();

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method346();

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method380();

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method5227(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method408(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method429(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method5230(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method261(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method361(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method291();

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method349();

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method337(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method296(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method333(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method5231();

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method326(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method5232(class160 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method270(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method325(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method389(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method5233(class228 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method5234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5235(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5236(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
