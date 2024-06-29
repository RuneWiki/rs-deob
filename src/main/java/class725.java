import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class725 extends class65 implements class562 {
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "Z"
   )
   private boolean field10605 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "Lod;"
   )
   private class536 field10615 = new class536();
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "I"
   )
   private int field10620 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "I"
   )
   private int field10623 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "Ldia;"
   )
   private class245 field10622 = new class245(4);
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "Z"
   )
   private boolean field10626 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "Lkh;"
   )
   private class17 field10621;
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10628 = new String[]{method5280(method5279("&2\u0012j{\u0011s\u000ftq\u0006:\u001a}4\u0004?\fluE$\u0015p|E=\u0013j9\b<\u0012k4\u0003<\u0012p4\u0010=\u0010ag\u0016s\u000fky\u0000<\u0012a4\u0012!\u0015pq\u0016s\u0015p")), method5280(method5279("\n5\u001a")), method5280(method5279("\u0016$O`")), method5280(method5279("\u000f2\ne:\u0004$\b*W\u0004=\neg")), method5280(method5279("\u00166\bMs\u000b<\u000eaF\u0000#\u001dmz\u0011")), method5280(method5279("+<\\I@")), method5280(method5279("&\u0003)")), method5280(method5279("6\u00009"))};
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[I"
   )
   private static int[] field10606 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "[I"
   )
   private static int[] field10607 = field10606;
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "[I"
   )
   private static int[] field10608 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field10610 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "[I"
   )
   private static int[] field10611 = field10606;
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "[F"
   )
   private static float[] field10612 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "[I"
   )
   private static int[] field10614 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "[F"
   )
   private static float[] field10613 = field10612;
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "[B"
   )
   private static byte[] field10616 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "[S"
   )
   private static short[] field10619 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field10617 = field10606;
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "I"
   )
   public int field10627;
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "Lkh;"
   )
   private class17 field10624;
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "Lp;"
   )
   private class230 field10618;
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "Lya;"
   )
   private class58 field10609;
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "[La;"
   )
   private class649[] field10625;

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()V"
   )
   public final void method592() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method167(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method511(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method491(int arg0) {
      this.field10623 = this.field10620 = arg0;
      if (this.field10627 > 1) {
         throw new IllegalStateException(field10628[5]);
      } else {
         this.method532(this.field10627);
         this.method580(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method509(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIZ)Lbo;"
   )
   public final class763 method513(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class571(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5261(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V"
   )
   private final void method5262() {
      System.gc();
      System.runFinalization();
      class629.method4573(true);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method5263(class230 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Lkh;"
   )
   public final class17 method600() {
      return this.field10621;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method571(int[] arg0) {
      Dimension var2 = this.field10618.field2863.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method602(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method529(int arg0) {
      this.field10625[arg0].method4692();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method537(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method521(Canvas arg0, int arg1, int arg2) {
      class230 var4 = (class230)this.field10622.method1839(-119, (long)arg0.hashCode());
      var4.method1745(arg0, arg1, arg2);
      if (arg0 != null && this.field10618.field2863 == arg0) {
         this.method588(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method492(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() {
      this.method559(-10565);
      if (this.nativeid != 0L) {
         class629.method4576(8, this);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lg;)V"
   )
   public final void method550(class165 arg0) {
      class641 var2 = (class641)arg0;
      this.method5272(var2.field9024.nativeid, var2.field9022.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z"
   )
   private final boolean method5264(short arg0) {
      synchronized(this) {
         class359 var3 = super.field726.method1293(arg0, -5150);
         if (var3 == null) {
            return false;
         } else {
            this.method5261(arg0, var3.field5112, var3.field5113, var3.field5114, var3.field5104, var3.field5100, var3.field5116, var3.field5105, var3.field5111, var3.field5101, var3.field5103, var3.field5115, var3.field5110, var3.field5097, var3.field5107, var3.field5108, var3.field5106, var3.field5099, var3.field5102, var3.field5098);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljea;Z)V"
   )
   private final void method5265(class478 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class526 var8 = (class526)arg0.field6608.method1827(4); var8 != null; var8 = (class526)arg0.field6608.method1830((byte)119)) {
         field10611[var3++] = var8.field7196;
         field10611[var3++] = var8.field7191;
         field10611[var3++] = var8.field7195;
         field10608[var4++] = var8.field7200;
         field10619[var6++] = (short)var8.field7192;
         field10614[var5++] = var8.field7194;
         if (arg1) {
            field10616[var7++] = var8.field7197;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method578();

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method608();

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()Lkh;"
   )
   public final class17 method507() {
      return this.field10624;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method567();

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method5266();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lok;Z)Lbo;"
   )
   public final class763 method549(class267 arg0, boolean arg1) {
      class571 var3 = new class571(this, arg0.field3468, arg0.field3472, arg0.field3464, 0, arg0.field3467, arg0.field3467, arg0.field3469);
      var3.method2132(arg0.field3465, arg0.field3466, arg0.field3471, arg0.field3470);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method502(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()Lkh;"
   )
   public final class17 method603() {
      return new class293();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method527(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method577(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method562(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()V"
   )
   public final void method552() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method589(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method501(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method5267(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()V"
   )
   public final void method519() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method540(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Loda;"
   )
   public final class127 method591(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class9(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method5268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method526(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method596() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method5269(class438 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public final void method581(class17 arg0) {
      this.field10624 = arg0;
      this.method5267(((class293)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method557(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method530(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljk;[Lok;Z)Lda;"
   )
   public final class66 method496(class663 arg0, class267[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field3467;
         var5[var7] = arg1[var7].field3469;
         if (arg1[var7].field3464 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field10628[0]);
         } else {
            return new class695(this, this.field10609, arg0, arg1, (class763[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field10628[0]);
      } else {
         return new class19(this, this.field10609, arg0, arg1, (class763[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method599();

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method568(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method534() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class516 method604(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class50(this, this.field10609, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method580(int arg0) {
      this.field10625[arg0].method4705();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()Z"
   )
   public final boolean method566() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method593();

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method558(arg0, arg1, arg2, arg4, arg5);
      this.method558(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method527(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method527(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)Lmp;"
   )
   public final class796 method590(int arg0, int arg1) {
      return this.method605(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method585(Canvas arg0, int arg1, int arg2) {
      class230 var4 = (class230)this.field10622.method1839(-123, (long)arg0.hashCode());
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field10628[3]);
            Method var6 = var5.getMethod(field10628[4], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class230 var7 = new class230(this, arg0, arg1, arg2);
         this.field10622.method1841((long)arg0.hashCode(), true, var7);
      } else {
         if (var4.field2865 != arg1 || var4.field2862 != arg2) {
            var4.method1745(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method561() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()Luv;"
   )
   public final class386 method499() {
      return new class386(0, field10628[7], 1, field10628[6], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()V"
   )
   public final void method563() {
      if (!this.field10605) {
         this.field10625 = null;
         this.field10618 = null;
         this.field10609 = null;
         this.field10621 = null;
         this.field10622.method1851(73);

         for(class58 var1 = (class58)this.field10615.method3855(125); var1 != null; var1 = (class58)this.field10615.method3866((byte)110)) {
            var1.method440();
         }

         this.field10615.method3861(100);
         this.method5266();
         if (this.field10626) {
            class481.method3502(-1, false, true);
            this.field10626 = false;
         }

         this.method5262();
         class629.method4572(-124);
         this.field10605 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method583() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)Ldw;"
   )
   public final class751 method531(int arg0, int arg1) {
      return new class531(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method542(int arg0, int arg1) throws class265 {
      if (this.field10618 == null) {
         throw new IllegalStateException(field10628[1]);
      } else {
         this.field10618.method1740(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method582(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)I"
   )
   public final int method503(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lvp;IIII)Lka;"
   )
   public final class501 method573(class200 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class43(this, this.field10609, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method490() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "()La;"
   )
   public final class649 method5270() {
      for(int var1 = 0; var1 < this.field10627; ++var1) {
         if (this.field10625[var1].field9104 == Thread.currentThread()) {
            return this.field10625[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method493() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method5270().method4680(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIII)Ltba;"
   )
   public final class172 method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method498() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method533(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ltba;Ltba;FLtba;)Ltba;"
   )
   public final class172 method597(class172 arg0, class172 arg1, float arg2, class172 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method506(Canvas arg0) {
      if (this.field10618.field2863 == arg0) {
         this.method588((Canvas)null);
      }

      class230 var2 = (class230)this.field10622.method1839(73, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method3609(82);
         var2.method1748();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method516(int arg0, class516 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;"
   )
   private final Object method5271() {
      return new class409(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Loda;)V"
   )
   public final void method601(int arg0, class127[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field10607[var3++] = arg1[var4].method1063(-1);
         field10607[var3++] = arg1[var4].method1065((byte)-86);
         field10607[var3++] = arg1[var4].method1067(-1);
         field10607[var3++] = arg1[var4].method1066(-1);
         field10613[var4] = arg1[var4].method1070(-1);
         field10607[var3++] = arg1[var4].method1064(126);
      }

      this.method5275(arg0, field10607, field10613);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method5272(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "(I)Lza;"
   )
   public final class438 method576(int arg0) {
      class58 var2 = new class58(this, arg0);
      this.field10615.method3859(2, var2);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method570(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ltba;)V"
   )
   public final void method556(class172 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method5273(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8) {
      this.method5274(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()I"
   )
   public final int method500() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class295 method541(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class699(this, this.field10609, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()V"
   )
   public final void method579() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method554(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method551() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method572(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method5274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()V"
   )
   public final void method544() {
      this.method588(this.field10618.field2863);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lmp;Ldw;)Lg;"
   )
   public final class165 method495(class796 arg0, class751 arg1) {
      return new class641(this, (class571)arg0, (class531)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method528();

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method532(int arg0) {
      this.field10627 = arg0;
      this.field10625 = new class649[this.field10627];

      for(int var2 = 0; var2 < this.field10627; ++var2) {
         this.field10625[var2] = new class649(this, this.field10623, this.field10620);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method505();

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method610();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljea;)V"
   )
   public final void method598(class478 arg0) {
      if (arg0.field6608.method1831(117) != 0) {
         this.method5265(arg0, false);
         this.method5270().method4703(this, field10611, field10608, field10614, field10619, arg0.field6608.method1831(101));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method5275(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()Z"
   )
   public final boolean method512() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method558(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method547(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljea;I)V"
   )
   public final void method555(class478 arg0, int arg1) {
      this.method5265(arg0, false);
      this.method5270().method4703(this, field10611, field10608, field10614, field10619, arg0.field6608.method1831(117));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method594(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method494();

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method5276(class160 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method539(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class725(Canvas arg0, class160 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class280.method2139(112, field10628[2])) {
            throw new RuntimeException("");
         } else {
            class629.method4575((byte)126);
            this.method5276(super.field726, 0, 0);
            class593.method4269(-1, true, false);
            this.field10626 = true;
            this.field10621 = new class293();
            this.method581(new class293());
            this.method532(1);
            this.method580(0);
            if (arg0 != null) {
               this.method585(arg0, arg2, arg3);
               this.method588(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method559(-10565);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method546() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method588(Canvas arg0) {
      if (arg0 != null) {
         class230 var2 = (class230)this.field10622.method1839(56, (long)arg0.hashCode());
         this.field10618 = var2;
         this.method5263(var2);
      } else {
         this.field10618 = null;
         this.method5263((class230)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method538() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z"
   )
   private final boolean method5277(short arg0) {
      class160 var2 = super.field726;
      synchronized(super.field726) {
         if (!super.field726.method1289((byte)-80, arg0)) {
            return false;
         } else {
            class359 var4 = super.field726.method1293(arg0, -5150);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field5113 != 2) {
                  var6 = super.field726.method1292(128, true, (byte)124, 0.7F, 128, arg0);
               } else {
                  var6 = super.field726.method1291(128, true, 128, 0.7F, arg0, (byte)63);
               }

               this.method5273(arg0, var6, var4.field5112, var4.field5113, var4.field5114, var4.field5104, var4.field5100, var4.field5116, var4.field5105, var4.field5111, var4.field5101, var4.field5103, var4.field5115, var4.field5110, var4.field5097, var4.field5107, var4.field5108, var4.field5106, var4.field5099, var4.field5102, var4.field5098);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method586(class438 arg0) {
      this.field10609 = (class58)arg0;
      this.method5269(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Lbo;"
   )
   public final class763 method524(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class571(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()Z"
   )
   public final boolean method517() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method553(int arg0) {
      class629.method4573(true);
      this.method5278(arg0);

      for(class58 var2 = (class58)this.field10615.method3855(124); var2 != null; var2 = (class58)this.field10615.method3866((byte)122)) {
         var2.method441();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method5278(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method564(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method606(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(IIIIII)V"
   )
   public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method5268(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Lbo;"
   )
   public final class763 method605(int arg0, int arg1, boolean arg2) {
      return new class571(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method489(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class265 {
      if (this.field10618 == null) {
         throw new IllegalStateException(field10628[1]);
      } else {
         this.field10618.method1744(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()V"
   )
   public final void method560() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method574(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5279(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5280(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
