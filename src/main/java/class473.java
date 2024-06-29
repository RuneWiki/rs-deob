import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class473 extends class17 implements class64 {
   @OriginalMember(
      owner = "client!oa",
      name = "nativeid",
      descriptor = "J"
   )
   public long nativeid = 0L;
   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "Z"
   )
   private boolean field6854 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "Lsb;"
   )
   private class261 field6856 = new class261();
   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "I"
   )
   private int field6861 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "I"
   )
   private int field6862 = 4096;
   @OriginalMember(
      owner = "client!oa",
      name = "D",
      descriptor = "Lbga;"
   )
   private class398 field6860 = new class398(4);
   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "Z"
   )
   private boolean field6866 = false;
   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "Lgga;"
   )
   private class502 field6863;
   @OriginalMember(
      owner = "client!oa",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6869 = new String[]{method3636(method3635("2e]f")), method3636(method3635("\u000f}NO\u001d")), method3636(method3635(".t\b")), method3636(method3635("\u0012A+")), method3636(method3635("\u0002B;")), method3636(method3635("+s\u0018cg e\u001a,\n |\u0018c:")), method3636(method3635("2w\u001aK./}\u001cg\u001b$b\u000fk'5")), method3636(method3635("\u0002s\u0000l&52\u001dr,\"{\b{i ~\u001ej(ae\u0007v!a|\u0001ld,}\u0000mi'}\u0000vi4|\u0002g:22\u001dm$$}\u0000gi6`\u0007v,22\u0007v"))};
   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "[I"
   )
   private static int[] field6846 = new int[Math.max(Math.max(104, 20), 24573)];
   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field6851 = field6846;
   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "[I"
   )
   private static int[] field6849 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "[I"
   )
   private static int[] field6855 = field6846;
   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "[F"
   )
   private static float[] field6850 = new float[20];
   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "[S"
   )
   private static short[] field6857 = new short[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "G",
      descriptor = "[I"
   )
   private static int[] field6847 = new int[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "[F"
   )
   private static float[] field6858 = field6850;
   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "[I"
   )
   private static int[] field6853 = field6846;
   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "[B"
   )
   private static byte[] field6848 = new byte[8191];
   @OriginalMember(
      owner = "client!oa",
      name = "O",
      descriptor = "[I"
   )
   public static int[] field6859 = new int[6];
   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "I"
   )
   public int field6868;
   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "Lgga;"
   )
   private class502 field6865;
   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "Lya;"
   )
   private class770 field6852;
   @OriginalMember(
      owner = "client!oa",
      name = "J",
      descriptor = "Lp;"
   )
   private class780 field6864;
   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "[La;"
   )
   private class694[] field6867;

   @OriginalMember(
      owner = "client!oa",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final native void method218(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([IIIIIZ)Lma;"
   )
   public final class148 method219(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      return new class600(this, arg0, arg1, arg2, arg3, arg4, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "s",
      descriptor = "()V"
   )
   public final void method229() {
      if (!this.field6854) {
         this.field6867 = null;
         this.field6864 = null;
         this.field6852 = null;
         this.field6863 = null;
         this.field6860.method3096(-112);

         for(class770 var1 = (class770)this.field6856.method2245((byte)-94); var1 != null; var1 = (class770)this.field6856.method2239((byte)121)) {
            var1.method5544();
         }

         this.field6856.method2237(67);
         this.method3632();
         if (this.field6866) {
            class130.method1327(false, true, 0);
            this.field6866 = false;
         }

         this.method3631();
         class422.method3291((byte)-128);
         this.field6854 = true;
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "(Z)V"
   )
   public final native void method262(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIF)Lpha;"
   )
   public final class757 method220(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      return new class319(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lni;Ljj;)Lbh;"
   )
   public final class758 method261(class795 arg0, class334 arg1) {
      return new class63(this, (class600)arg0, (class660)arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "(Lp;)V"
   )
   private final native void method3617(class780 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "(I)Lza;"
   )
   public final class348 method167(int arg0) {
      class770 var2 = new class770(this, arg0);
      this.field6856.method2238(var2, 13);
      return var2;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method237() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method204(int arg0) {
      throw new IllegalStateException();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "l",
      descriptor = "()V"
   )
   public final void method151() {
      this.method158(this.field6864.field11380);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "GA",
      descriptor = "(I)V"
   )
   public final native void method184(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Luv;Z)V"
   )
   private final void method3618(class521 arg0, boolean arg1) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      for(class137 var8 = (class137)arg0.field7334.method4837(-102); var8 != null; var8 = (class137)arg0.field7334.method4835(8)) {
         field6855[var3++] = var8.field2201;
         field6855[var3++] = var8.field2209;
         field6855[var3++] = var8.field2198;
         field6849[var4++] = var8.field2207;
         field6857[var6++] = (short)var8.field2199;
         field6847[var5++] = var8.field2204;
         if (arg1) {
            field6848[var7++] = var8.field2210;
         }
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(IIIIII)V"
   )
   public final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method218(arg0, arg1, arg2, arg4, arg5);
      this.method218(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
      this.method145(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
      this.method145(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "X",
      descriptor = "(I)V"
   )
   public final native void method160(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "()V"
   )
   public final void method178() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "(II)V"
   )
   public final native void method238(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class684 method224(int arg0, int arg1, int[] arg2, int[] arg3) {
      return new class636(this, this.field6852, arg0, arg1, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method153(Canvas arg0) {
      if (this.field6864.field11380 == arg0) {
         this.method158((Canvas)null);
      }

      class780 var2 = (class780)this.field6860.method3101(-1, (long)arg0.hashCode());
      if (var2 != null) {
         var2.method2140((byte)63);
         var2.method5635();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method246(int arg0, int arg1) {
      return arg0 | arg1;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(II)Ljj;"
   )
   public final class334 method236(int arg0, int arg1) {
      return new class660(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "()I"
   )
   public final int method203() {
      return 4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lwm;[Liaa;Z)Lda;"
   )
   public final class216 method170(class440 arg0, class433[] arg1, boolean arg2) {
      int[] var4 = new int[arg1.length];
      int[] var5 = new int[arg1.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < arg1.length; ++var7) {
         var4[var7] = arg1[var7].field6361;
         var5[var7] = arg1[var7].field6353;
         if (arg1[var7].field6356 != null) {
            var6 = true;
         }
      }

      if (arg2) {
         if (var6) {
            throw new IllegalArgumentException(field6869[7]);
         } else {
            return new class665(this, this.field6852, arg0, arg1, (class148[])null);
         }
      } else if (var6) {
         throw new IllegalArgumentException(field6869[7]);
      } else {
         return new class518(this, this.field6852, arg0, arg1, (class148[])null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method148(Canvas arg0, int arg1, int arg2) {
      class780 var4 = (class780)this.field6860.method3101(-1, (long)arg0.hashCode());
      var4.method5636(arg0, arg1, arg2);
      if (arg0 != null && this.field6864.field11380 == arg0) {
         this.method158(arg0);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lns;Lns;FLns;)Lns;"
   )
   public final class382 method152(class382 arg0, class382 arg1, float arg2, class382 arg3) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "()I"
   )
   public final native int method141();

   @OriginalMember(
      owner = "client!oa",
      name = "x",
      descriptor = "()V"
   )
   public final void method210() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "M",
      descriptor = "()I"
   )
   public final native int method149();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8) {
      this.method3622(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method155(int arg0) {
      this.field6868 = arg0;
      this.field6867 = new class694[this.field6868];

      for(int var2 = 0; var2 < this.field6868; ++var2) {
         this.field6867[var2] = new class694(this, this.field6862, this.field6861);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "XA",
      descriptor = "()I"
   )
   public final native int method212();

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method158(Canvas arg0) {
      if (arg0 != null) {
         class780 var2 = (class780)this.field6860.method3101(-1, (long)arg0.hashCode());
         this.field6864 = var2;
         this.method3617(var2);
      } else {
         this.field6864 = null;
         this.method3617((class780)null);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method208() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "la",
      descriptor = "()V"
   )
   public final native void method231();

   @OriginalMember(
      owner = "client!oa",
      name = "v",
      descriptor = "()Lam;"
   )
   public final class56 method157() {
      return new class56(0, field6869[3], 1, field6869[4], 0L);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public final void method255(class502 arg0) {
      this.field6865 = arg0;
      this.method3630(((class728)arg0).nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "()V"
   )
   public final void method171() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final native void method209(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Luv;I)V"
   )
   public final void method169(class521 arg0, int arg1) {
      this.method3618(arg0, false);
      this.method3627().method5069(this, field6855, field6849, field6847, field6857, arg0.field7334.method4834(-67));
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method191(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "pa",
      descriptor = "()V"
   )
   public final native void method192();

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method175(int arg0) {
      this.field6867[arg0].method5085();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;II)V"
   )
   public class473(Canvas arg0, class672 arg1, int arg2, int arg3) {
      super(arg1);

      try {
         if (!class354.method2785(field6869[0], -110)) {
            throw new RuntimeException("");
         } else {
            class422.method3288((byte)110);
            this.method3628(super.field240, 0, 0);
            class274.method2317(true, false, (byte)24);
            this.field6866 = true;
            this.field6863 = new class728();
            this.method255(new class728());
            this.method155(1);
            this.method174(0);
            if (arg0 != null) {
               this.method146(arg0, arg2, arg3);
               this.method158(arg0);
            }
         }
      } catch (Throwable var5) {
         this.method181(true);
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final native void method221(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "E",
      descriptor = "()I"
   )
   public final native int method161();

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method146(Canvas arg0, int arg1, int arg2) {
      class780 var4 = (class780)this.field6860.method3101(-1, (long)arg0.hashCode());
      if (var4 == null) {
         try {
            Class var5 = Class.forName(field6869[5]);
            Method var6 = var5.getMethod(field6869[6], Boolean.TYPE);
            var6.invoke(arg0, Boolean.TRUE);
         } catch (Exception var8) {
         }

         class780 var7 = new class780(this, arg0, arg1, arg2);
         this.field6860.method3098((long)arg0.hashCode(), var7, -1);
      } else {
         if (var4.field11383 != arg1 || var4.field11382 != arg2) {
            var4.method5636(arg0, arg1, arg2);
         }

      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method205() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final native void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final native void method179(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final native void method250(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final native void method241(int arg0, int arg1, int arg2, int arg3, int[] arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final native void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method189(class348 arg0) {
      this.field6852 = (class770)arg0;
      this.method3634(arg0);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(I)V"
   )
   private final native void method3619(int arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final synchronized void finalize() {
      this.method181(true);
      if (this.nativeid != 0L) {
         class422.method3289((byte)-31, this);
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method252(int arg0) {
      class422.method3287(-81);
      this.method3619(arg0);

      for(class770 var2 = (class770)this.field6856.method2245((byte)-94); var2 != null; var2 = (class770)this.field6856.method2239((byte)125)) {
         var2.method5545();
      }

   }

   @OriginalMember(
      owner = "client!oa",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final native void method248(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "wa",
      descriptor = "(IIIIII)V"
   )
   private final native void method3620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIZ)Lma;"
   )
   public final class148 method159(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      return new class600(this, arg0, arg1, arg2, arg3, !arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final native void method217(int arg0, int arg1, int arg2, int arg3, double arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method228(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method164(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "(Z)V"
   )
   public final native void method633(boolean arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "xa",
      descriptor = "(F)V"
   )
   public final native void method197(float arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(S)Z"
   )
   private final boolean method3621(short arg0) {
      synchronized(this) {
         class390 var3 = super.field240.method2043(-72, arg0);
         if (var3 == null) {
            return false;
         } else {
            this.method3633(arg0, var3.field5674, var3.field5678, var3.field5668, var3.field5671, var3.field5687, var3.field5685, var3.field5679, var3.field5677, var3.field5681, var3.field5667, var3.field5670, var3.field5684, var3.field5683, var3.field5672, var3.field5682, var3.field5675, var3.field5666, var3.field5680, var3.field5686);
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "o",
      descriptor = "()V"
   )
   public final void method207() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "i",
      descriptor = "(I)V"
   )
   public final void method174(int arg0) {
      this.field6867[arg0].method5072();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final native void method256(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "I",
      descriptor = "()I"
   )
   public final native int method156();

   @OriginalMember(
      owner = "client!oa",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final native void method173(int arg0, class684 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "K",
      descriptor = "([I)V"
   )
   public final native void method211(int[] arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "Z",
      descriptor = "(IIIIIILaa;II)V"
   )
   private final native void method3622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!oa",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method243() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method3627().method5077(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "n",
      descriptor = "(JJ)V"
   )
   private final native void method3623(long arg0, long arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method182(int arg0, int arg1) throws class37 {
      if (this.field6864 == null) {
         throw new IllegalStateException(field6869[2]);
      } else {
         this.field6864.method5641(arg0, arg1);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lns;)V"
   )
   public final void method166(class382 arg0) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "N",
      descriptor = "(I[I[F)V"
   )
   private final native void method3624(int arg0, int[] arg1, float[] arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Lbh;)V"
   )
   public final void method251(class758 arg0) {
      class63 var2 = (class63)arg0;
      this.method3623(var2.field883.nativeid, var2.field884.nativeid);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "j",
      descriptor = "()Z"
   )
   public final boolean method242() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      this.method3620(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "OA",
      descriptor = "()Ljava/lang/Object;"
   )
   private final Object method3625() {
      return new class67(this);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Leca;IIII)Lka;"
   )
   public final class761 method240(class590 arg0, int arg1, int arg2, int arg3, int arg4) {
      return new class163(this, this.field6852, arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method239(int[] arg0) {
      Dimension var2 = this.field6864.field11380.getSize();
      arg0[0] = var2.width;
      arg0[1] = var2.height;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ya",
      descriptor = "()V"
   )
   public final native void method144();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class751 method245(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      return new class310(this, this.field6852, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method195(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "CA",
      descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method3626(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIZ)Lma;"
   )
   public final class148 method247(int arg0, int arg1, boolean arg2) {
      return new class600(this, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "h",
      descriptor = "()Lgga;"
   )
   public final class502 method176() {
      return this.field6865;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method206(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class37 {
      if (this.field6864 == null) {
         throw new IllegalStateException(field6869[2]);
      } else {
         this.field6864.method5638(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final native int method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!oa",
      name = "Y",
      descriptor = "()[I"
   )
   public final native int[] method147();

   @OriginalMember(
      owner = "client!oa",
      name = "m",
      descriptor = "()Lgga;"
   )
   public final class502 method254() {
      return this.field6863;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Luv;)V"
   )
   public final void method194(class521 arg0) {
      if (arg0.field7334.method4834(-76) != 0) {
         this.method3618(arg0, false);
         this.method3627().method5069(this, field6855, field6849, field6847, field6857, arg0.field7334.method4834(-112));
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "C",
      descriptor = "()La;"
   )
   public final class694 method3627() {
      for(int var1 = 0; var1 < this.field6868; ++var1) {
         if (this.field6867[var1].field10032 == Thread.currentThread()) {
            return this.field6867[var1];
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "(II)Lni;"
   )
   public final class795 method216(int arg0, int arg1) {
      return this.method247(arg0, arg1, false);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "MA",
      descriptor = "(Ld;II)V"
   )
   private final native void method3628(class672 arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method263(int arg0) {
      this.field6862 = this.field6861 = arg0;
      if (this.field6868 > 1) {
         throw new IllegalStateException(field6869[1]);
      } else {
         this.method155(this.field6868);
         this.method174(0);
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method200() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "p",
      descriptor = "()Z"
   )
   public final boolean method249() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "y",
      descriptor = "()Lgga;"
   )
   public final class502 method183() {
      return new class728();
   }

   @OriginalMember(
      owner = "client!oa",
      name = "L",
      descriptor = "(III)V"
   )
   public final native void method227(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!oa",
      name = "WA",
      descriptor = "(S)Z"
   )
   private final boolean method3629(short arg0) {
      class672 var2 = super.field240;
      synchronized(super.field240) {
         if (!super.field240.method2036(arg0, (byte)-115)) {
            return false;
         } else {
            class390 var4 = super.field240.method2043(-65, arg0);
            if (var4 == null) {
               return false;
            } else {
               int[] var6;
               if (var4.field5678 != 2) {
                  var6 = super.field240.method2038(0.7F, 128, true, arg0, 128, -23361);
               } else {
                  var6 = super.field240.method2042(0.7F, arg0, true, 128, 128, true);
               }

               this.method3626(arg0, var6, var4.field5674, var4.field5678, var4.field5668, var4.field5671, var4.field5687, var4.field5685, var4.field5679, var4.field5677, var4.field5681, var4.field5667, var4.field5670, var4.field5684, var4.field5683, var4.field5672, var4.field5682, var4.field5675, var4.field5666, var4.field5680, var4.field5686);
               return true;
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final native void method232(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(I[Lpha;)V"
   )
   public final void method199(int arg0, class757[] arg1) {
      int var3 = 0;

      for(int var4 = 0; var4 < arg0; ++var4) {
         field6853[var3++] = arg1[var4].method5474(10368);
         field6853[var3++] = arg1[var4].method5470(true);
         field6853[var3++] = arg1[var4].method5469((byte)13);
         field6853[var3++] = arg1[var4].method5465((byte)-47);
         field6858[var4] = arg1[var4].method5471(0);
         field6853[var3++] = arg1[var4].method5466(true);
      }

      this.method3624(arg0, field6853, field6858);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "ma",
      descriptor = "(J)V"
   )
   private final native void method3630(long arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "g",
      descriptor = "()V"
   )
   private final void method3631() {
      System.gc();
      System.runFinalization();
      class422.method3287(-122);
   }

   @OriginalMember(
      owner = "client!oa",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method188() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "c",
      descriptor = "()Z"
   )
   public final boolean method230() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method260() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final native void method145(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!oa",
      name = "FA",
      descriptor = "()V"
   )
   private final native void method3632();

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(Liaa;Z)Lma;"
   )
   public final class148 method187(class433 arg0, boolean arg1) {
      class600 var3 = new class600(this, arg0.field6357, arg0.field6354, arg0.field6356, 0, arg0.field6361, arg0.field6361, arg0.field6353);
      var3.method1343(arg0.field6355, arg0.field6358, arg0.field6360, arg0.field6359);
      return var3;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "w",
      descriptor = "()Z"
   )
   public final boolean method201() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final native int method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "b",
      descriptor = "()Z"
   )
   public final boolean method168() {
      return false;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method190() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final native int[] method202(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "AA",
      descriptor = "(SSIBBIZBBBBZZZZZBZZI)V"
   )
   private final native void method3633(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

   @OriginalMember(
      owner = "client!oa",
      name = "F",
      descriptor = "(II)V"
   )
   public final native void method235(int arg0, int arg1);

   @OriginalMember(
      owner = "client!oa",
      name = "B",
      descriptor = "()Z"
   )
   public final boolean method180() {
      return true;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "()V"
   )
   public final void method193() {
   }

   @OriginalMember(
      owner = "client!oa",
      name = "va",
      descriptor = "(Lza;)V"
   )
   private final native void method3634(class348 arg0);

   @OriginalMember(
      owner = "client!oa",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final native void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method214(int arg0, int arg1) {
      int var3 = arg0 & 1048575;
      int var4 = arg1 & 1048575;
      return var3 & var4 ^ var4;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "a",
      descriptor = "(IIIIII)Lns;"
   )
   public final class382 method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      return null;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final native void method150(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3635(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3636(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
