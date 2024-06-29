import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class722 extends class66 implements class558 {
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "Z"
   )
   private boolean field10739 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "Lum;"
   )
   private class550 field10740 = new class550();
   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "I"
   )
   private int field10746 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "I"
   )
   private int field10756 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "Lwia;"
   )
   private class791 field10743 = new class791(4);
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "Z"
   )
   private boolean field10758 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "Lgq;"
   )
   private class540 field10747;
   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10761 = new String[]{method5245(method5244("~%6")), method5245(method5244("_,pX\u0010")), method5245(method5244("R\u0013\u0005")), method5245(method5244("B\u0010\u0015")), method5245(method5244("R\">{+ec#e!r*6ldp/ }%149a,1-?{i|,>zdw,>add-<p7bc#z)t,>pdf19a!bc9a")), method5245(method5244("{\"&tjp4$;\u0007p-&t7")), method5245(method5244("b&$\\#\u007f,\"p\u0016t31|*e")), method5245(method5244("b4cq"))};
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "[I"
   )
   private static int[] field10741 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[I"
   )
   private static int[] field10745 = field10741;
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field10749 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "[I"
   )
   private static int[] field10753 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "[S"
   )
   private static short[] field10751 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "[I"
   )
   private static int[] field10742 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "[B"
   )
   private static byte[] field10754 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field10748 = field10741;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "[I"
   )
   private static int[] field10752 = field10741;
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "[F"
   )
   private static float[] field10755 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "[F"
   )
   private static float[] field10757 = field10755;
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "I"
   )
   public int field10759;
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "Lp;"
   )
   private class228 field10744;
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "Lgq;"
   )
   private class540 field10750;
   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "Lya;"
   )
   private class59 field10738;
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "[La;"
   )
   private class644[] field10760;

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method587(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5226(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public final class744 method611(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class177(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method643(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method654(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Luaa;)V"
   )
   public final void method583(class126 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method651() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method5227(class160 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method622(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method597(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)Lps;"
   )
   public final class103 method568(int arg0, int arg1) {
      return this.method580(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method625(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lut;IIII)Lka;"
   )
   public final class497 method547(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class44(this, this.field10738, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()Lqha;"
   )
   public final class110 method595() {
      return new class110(0, field10761[3], 1, field10761[2], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method615(arg0, arg1, arg2, arg4, arg5);
      this.method615(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method539(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method539(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method551(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Loda;Z)V"
   )
   private final void method5228(class127 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class611 var8 = (class611)arg0.field1524.method389((byte)-116); var8 != null; var8 = (class611)arg0.field1524.method397(0)) {
         field10752[var3++] = var8.field8960;
         field10752[var3++] = var8.field8954;
         field10752[var3++] = var8.field8953;
         field10753[var4++] = var8.field8948;
         field10751[var6++] = (short)var8.field8956;
         field10742[var5++] = var8.field8952;
         if (arg1) {
            field10754[var7++] = var8.field8950;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)I"
   )
   public final int method632(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method5229(class434 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method648();

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      this.field10756 = this.field10746 = arg0;
      if (this.field10759 > 1) {
         throw new IllegalStateException(field10761[1]);
      } else {
         this.method628(this.field10759);
         this.method563(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method5230(class228 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() {
      this.method653(-119);
      if (this.nativeid != 0L) {
         class206.method1578(0, this);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z"
   )
   private final boolean method5231(short arg0) {
      synchronized(this) {
         class327 var3 = super.field813.method1159(arg0, 126);
         if (var3 == null) {
            return false;
         } else {
            this.method5226(arg0, var3.field4650, var3.field4636, var3.field4655, var3.field4642, var3.field4644, var3.field4646, var3.field4641, var3.field4632, var3.field4654, var3.field4656, var3.field4649, var3.field4643, var3.field4633, var3.field4639, var3.field4631, var3.field4634, var3.field4640, var3.field4648, var3.field4645);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method554(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method5232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()V"
   )
   public final void method549() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "()La;"
   )
   public final class644 method5233() {
      for(int var1 = 0; var1 < this.field10759; ++var1) {
         if (this.field10760[var1].field9381 == Thread.currentThread()) {
            return this.field10760[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method565();

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method569(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method635();

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method627(int arg0, int arg1) throws class280 {
      if (this.field10744 == null) {
         throw new IllegalStateException(field10761[0]);
      } else {
         this.field10744.method1719(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method638(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Lat;"
   )
   public final class396 method580(int arg0, int arg1, boolean arg2) {
      return new class567(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method567() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class512 method572(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class51(this, this.field10738, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method640(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method5234(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "(I)Lza;"
   )
   public final class434 method592(int arg0) {
      class59 var2 = new class59(this, arg0);
      this.field10740.method4060(23, var2);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method571(Canvas arg0) {
      if (arg0 != null) {
         class228 var2 = (class228)this.field10743.method5681((long)arg0.hashCode(), -1);
         this.field10744 = var2;
         this.method5230(var2);
      } else {
         this.field10744 = null;
         this.method5230((class228)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method591() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method563(int arg0) {
      this.field10760[arg0].method4653();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(IIIIII)Luaa;"
   )
   public final class126 method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method630(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method598(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method601(Canvas arg0, int arg1, int arg2) {
      class228 var4 = (class228)this.field10743.method5681((long)arg0.hashCode(), -1);
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field10761[5]);
            Method var6 = var5.getMethod(field10761[6], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class228 var7 = new class228(this, arg0, arg1, arg2);
         this.field10743.method5682((long)arg0.hashCode(), var7, (byte)7);
      } else {
         if (var4.field2914 != arg1 || var4.field2913 != arg2) {
            var4.method1725(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method610(int[] arg0) {
      Dimension var2 = this.field10744.field2917.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Loda;I)V"
   )
   public final void method623(class127 arg0, int arg1) {
      this.method5228(arg0, false);
      this.method5233().method4628(this, field10752, field10753, field10742, field10751, arg0.field1524.method398((byte)117));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method561();

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method644() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lpg;[Lnia;Z)Lda;"
   )
   public final class67 method570(class763 arg0, class671[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field10100;
         var5[var7] = arg1[var7].field10097;
         if (arg1[var7].field10095 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field10761[4]);
         } else {
            return new class692(this, this.field10738, arg0, arg1, (class396[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field10761[4]);
      } else {
         return new class19(this, this.field10738, arg0, arg1, (class396[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIZ)Lat;"
   )
   public final class396 method602(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class567(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method607();

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method573() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method631();

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z"
   )
   private final boolean method5235(short arg0) {
      class160 var2 = super.field813;
      synchronized(super.field813) {
         if (!super.field813.method1165(arg0, -23239)) {
            return false;
         } else {
            class327 var4 = super.field813.method1159(arg0, 123);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field4636 != 2) {
                  var6 = super.field813.method1166((byte)89, 0.7F, 128, 128, true, arg0);
               } else {
                  var6 = super.field813.method1168(0.7F, true, 128, 24521, arg0, 128);
               }

               this.method5236(arg0, var6, var4.field4650, var4.field4636, var4.field4655, var4.field4642, var4.field4644, var4.field4646, var4.field4641, var4.field4632, var4.field4654, var4.field4656, var4.field4649, var4.field4643, var4.field4633, var4.field4639, var4.field4631, var4.field4634, var4.field4640, var4.field4648, var4.field4645);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method618(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5236(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method5237();

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()V"
   )
   public final void method647() {
      this.method571(this.field10744.field2917);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method560(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()V"
   )
   public final void method548() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method620(Canvas arg0) {
      if (this.field10744.field2917 == arg0) {
         this.method571((Canvas)null);
      }

      class228 var2 = (class228)this.field10743.method5681((long)arg0.hashCode(), -1);
      if (var2 != null) {
         var2.method2720(0);
         var2.method1727();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lps;Llba;)Lsea;"
   )
   public final class725 method541(class103 arg0, class575 arg1) {
      return new class636(this, (class567)arg0, (class527)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method621(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method628(int arg0) {
      this.field10759 = arg0;
      this.field10760 = new class644[this.field10759];

      for(int var2 = 0; var2 < this.field10759; ++var2) {
         this.field10760[var2] = new class644(this, this.field10756, this.field10746);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method5232(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method5238(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Lat;"
   )
   public final class396 method603(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class567(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method629(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Lgq;"
   )
   public final class540 method559() {
      return new class291();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method539(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method544() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method585() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method5239(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public final void method550(class540 arg0) {
      this.field10750 = arg0;
      this.method5234(((class291)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method5240(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Luaa;Luaa;FLuaa;)Luaa;"
   )
   public final class126 method608(class126 arg0, class126 arg1, float arg2, class126 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class722(Canvas arg0, class160 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class298.method2280(0, field10761[7])) {
            throw new RuntimeException("");
         } else {
            class206.method1574(true);
            this.method5227(super.field813, 0, 0);
            class301.method2294(-7208, false, true);
            this.field10758 = true;
            this.field10747 = new class291();
            this.method550(new class291());
            this.method628(1);
            this.method563(0);
            if (arg0 != null) {
               this.method601(arg0, arg2, arg3);
               this.method571(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method653(-127);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lnia;Z)Lat;"
   )
   public final class396 method577(class671 arg0, boolean arg1) {
      class567 var3 = new class567(this, arg0.field10096, arg0.field10099, arg0.field10095, 0, arg0.field10100, arg0.field10100, arg0.field10097);
      var3.method1976(arg0.field10103, arg0.field10102, arg0.field10101, arg0.field10098);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()Z"
   )
   public final boolean method604() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method576();

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()Lgq;"
   )
   public final class540 method659() {
      return this.field10747;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public final void method599(int arg0, class744[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field10745[var3++] = arg1[var4].method5420(true);
         field10745[var3++] = arg1[var4].method5423(3378);
         field10745[var3++] = arg1[var4].method5425((byte)-81);
         field10745[var3++] = arg1[var4].method5424(34065);
         field10757[var4] = arg1[var4].method5422((byte)109);
         field10745[var3++] = arg1[var4].method5421(-116);
      }

      this.method5240(arg0, field10745, field10757);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()V"
   )
   public final void method624() {
      if (!this.field10739) {
         this.field10760 = null;
         this.field10744 = null;
         this.field10738 = null;
         this.field10747 = null;
         this.field10743.method5680(true);

         for(class59 var1 = (class59)this.field10740.method4071((byte)127); var1 != null; var1 = (class59)this.field10740.method4059((byte)-65)) {
            var1.method494();
         }

         this.field10740.method4062(0);
         this.method5237();
         if (this.field10758) {
            class442.method3343(true, false, (byte)-111);
            this.field10758 = false;
         }

         this.method5241();
         class206.method1575(-21484);
         this.field10739 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method605(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class280 {
      if (this.field10744 == null) {
         throw new IllegalStateException(field10761[0]);
      } else {
         this.field10744.method1721(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lsea;)V"
   )
   public final void method566(class725 arg0) {
      class636 var2 = (class636)arg0;
      this.method5238(var2.field9255.nativeid, var2.field9254.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
      this.method5242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()V"
   )
   public final void method581() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method5233().method4626(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method596(class434 arg0) {
      this.field10738 = (class59)arg0;
      this.method5229(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method646(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method540(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class293 method658(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class696(this, this.field10738, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method558(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V"
   )
   private final void method5241() {
      System.gc();
      System.runFinalization();
      class206.method1576(false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method543(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()Lgq;"
   )
   public final class540 method656() {
      return this.field10750;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method657() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method641(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method555(int arg0) {
      class206.method1576(false);
      this.method5239(arg0);

      for(class59 var2 = (class59)this.field10740.method4071((byte)126); var2 != null; var2 = (class59)this.field10740.method4059((byte)114)) {
         var2.method492();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method5242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()V"
   )
   public final void method616() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method582(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method636(int arg0, class512 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;"
   )
   private final Object method5243() {
      return new class406(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method134(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method633(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()V"
   )
   public final void method614() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method639();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Loda;)V"
   )
   public final void method562(class127 arg0) {
      if (arg0.field1524.method398((byte)117) != 0) {
         this.method5228(arg0, false);
         this.method5233().method4628(this, field10752, field10753, field10742, field10751, arg0.field1524.method398((byte)117));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method660(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method615(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)Llba;"
   )
   public final class575 method578(int arg0, int arg1) {
      return new class527(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method634() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method584(Canvas arg0, int arg1, int arg2) {
      class228 var4 = (class228)this.field10743.method5681((long)arg0.hashCode(), -1);
      var4.method1725(arg0, arg1, arg2);
      if (arg0 != null && this.field10744.field2917 == arg0) {
         this.method571(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method545() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method613(int arg0) {
      this.field10760[arg0].method4636();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method542() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method649() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method652(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()I"
   )
   public final int method586() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method556();

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5244(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5245(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
