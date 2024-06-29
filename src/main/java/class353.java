import jaclib.peer.class702;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.class511;
import jagdx.class512;
import jagdx.class513;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class353 extends class369 {
   @OriginalMember(
      owner = "client!bb",
      name = "Kg",
      descriptor = "Z"
   )
   private boolean field4743 = false;
   @OriginalMember(
      owner = "client!bb",
      name = "Zg",
      descriptor = "I"
   )
   private int field4741 = 0;
   @OriginalMember(
      owner = "client!bb",
      name = "Xg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field4747;
   @OriginalMember(
      owner = "client!bb",
      name = "Ug",
      descriptor = "I"
   )
   private int field4739;
   @OriginalMember(
      owner = "client!bb",
      name = "Pg",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field4756;
   @OriginalMember(
      owner = "client!bb",
      name = "Jg",
      descriptor = "Ljaclib/peer/pga;"
   )
   public class702 field4757;
   @OriginalMember(
      owner = "client!bb",
      name = "Gg",
      descriptor = "I"
   )
   private int field4755;
   @OriginalMember(
      owner = "client!bb",
      name = "Rg",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field4751;
   @OriginalMember(
      owner = "client!bb",
      name = "Ng",
      descriptor = "Ldd;"
   )
   private class734 field4740;
   @OriginalMember(
      owner = "client!bb",
      name = "ch",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field4742;
   @OriginalMember(
      owner = "client!bb",
      name = "Og",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class513 field4738;
   @OriginalMember(
      owner = "client!bb",
      name = "Fg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class513 field4746;
   @OriginalMember(
      owner = "client!bb",
      name = "Hg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class513 field4752;
   @OriginalMember(
      owner = "client!bb",
      name = "Wg",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field4763;
   @OriginalMember(
      owner = "client!bb",
      name = "Mg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field4754;
   @OriginalMember(
      owner = "client!bb",
      name = "ah",
      descriptor = "Z"
   )
   public boolean field4737;
   @OriginalMember(
      owner = "client!bb",
      name = "gh",
      descriptor = "Z"
   )
   public boolean field4748;
   @OriginalMember(
      owner = "client!bb",
      name = "Vg",
      descriptor = "Z"
   )
   public boolean field4761;
   @OriginalMember(
      owner = "client!bb",
      name = "Ig",
      descriptor = "[Z"
   )
   private boolean[] field4744;
   @OriginalMember(
      owner = "client!bb",
      name = "Lg",
      descriptor = "[Z"
   )
   private boolean[] field4759;
   @OriginalMember(
      owner = "client!bb",
      name = "bh",
      descriptor = "[I"
   )
   private int[] field4745;
   @OriginalMember(
      owner = "client!bb",
      name = "dh",
      descriptor = "[Lgj;"
   )
   private class663[] field4750;
   @OriginalMember(
      owner = "client!bb",
      name = "Qg",
      descriptor = "[Z"
   )
   private boolean[] field4764;
   @OriginalMember(
      owner = "client!bb",
      name = "fh",
      descriptor = "[Z"
   )
   private boolean[] field4753;
   @OriginalMember(
      owner = "client!bb",
      name = "hh",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4765 = method2640(method2639("\nf1A>:<\u0007"));
   @OriginalMember(
      owner = "client!bb",
      name = "Tg",
      descriptor = "[I"
   )
   private static int[] field4749 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!bb",
      name = "Sg",
      descriptor = "[F"
   )
   private static float[] field4758 = new float[16];
   @OriginalMember(
      owner = "client!bb",
      name = "Yg",
      descriptor = "[I"
   )
   private static int[] field4760 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!bb",
      name = "eh",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4762;

   @OriginalMember(
      owner = "client!bb",
      name = "v",
      descriptor = "()V",
      line = 4
   )
   public final void method544() {
      this.field4757.method5122(true);
      super.method544();
   }

   @OriginalMember(
      owner = "client!bb",
      name = "i",
      descriptor = "(B)V",
      line = 14
   )
   public final void method2573(byte arg0) {
      if (arg0 >= 19) {
         this.field4742.SetTransform(3, this.field5288);
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lgj;I)I",
      line = 28
   )
   private static final int method2574(class663 arg0, int arg1) {
      if (arg1 != 1) {
         return -110;
      } else if (class711.field10376 != arg0) {
         if (class212.field3023 == arg0) {
            return 1;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "()V",
      line = 45
   )
   public final void method579() {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "(IZ)Llba;",
      line = 49
   )
   public final class576 method2575(int arg0, boolean arg1) {
      int var3 = -24 / ((-53 - arg0) / 51);
      return new class306(this, class301.field4118, arg1);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "m",
      descriptor = "()V",
      line = 59
   )
   public final void method537() {
      IDirect3DEventQuery var1 = this.field4742.method3722();
      if (class512.method3730((byte)-122, var1.Issue())) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method5120(9575);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V",
      line = 83
   )
   public final void method2576(Object arg0, Canvas arg1, int arg2) {
      if (this.field5089 == arg1) {
         Dimension var4 = arg1.getSize();
         if (~var4.width < -1 && -1 > ~var4.height) {
            this.field4742.EndScene();
            this.method2618(-56);
            this.field4742.BeginScene();
         }
      }

      if (arg2 != 9) {
         this.method2583((Object)null, (Canvas)null, (byte)-5);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(FFF)V",
      line = 108
   )
   public final void method572(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "(II)Lst;",
      line = 111
   )
   public final class461 method513(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "I",
      descriptor = "()I",
      line = 119
   )
   public final int method563() {
      return 0;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "V",
      descriptor = "(I)V",
      line = 127
   )
   public final void method2577(int arg0) {
      int var2 = !this.field4759[this.field5309] ? 1 : method2604(this.field5325[this.field5309], 19711);
      this.field4742.SetTextureStageState(this.field5309, 4, var2);
      if (arg0 != 4785) {
         this.method2615(-109, true);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "d",
      descriptor = "(I)V",
      line = 138
   )
   public final void method2578(int arg0) {
      if (arg0 != -4957) {
         this.method544();
      }

      this.field4742.method3723(137, this.field5299 && !this.field5292);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IZ)V",
      line = 149
   )
   public final void method2579(int arg0, boolean arg1) {
      this.field4742.method3723(161, arg1);
      if (arg0 != 0) {
         this.field4737 = false;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IIIZ[BLak;)Lkd;",
      line = 159
   )
   public final class297 method2580(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, class371 arg5) {
      if (!arg3) {
         this.method2576((Object)null, (Canvas)null, -100);
      }

      return new class177(this, arg5, arg2, arg0, arg1, arg4);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "bb",
      descriptor = "(I)V",
      line = 169
   )
   public final void method2581(int arg0) {
      this.field4742.method3723(15, this.field5266);
      if (arg0 != 133) {
         this.field4738 = (class513)null;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "(BI)V",
      line = 180
   )
   public final void method2582(byte arg0, int arg1) {
      this.field4742.SetTextureStageState(this.field5309, 11, arg1);
      if (arg0 > -1) {
         this.field4748 = false;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V",
      line = 190
   )
   public final void method2583(Object arg0, Canvas arg1, byte arg2) {
      if (arg2 != 61) {
         this.method579();
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "(IIIID)V",
      line = 198
   )
   public final void method612(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "fb",
      descriptor = "(I)V",
      line = 203
   )
   public final void method2584(int arg0) {
      if (this.field5286.method1102((byte)-16)) {
         this.field5239.method5210(field4758, true);
      } else {
         field4758[12] = 0.0F;
         field4758[5] = 1.0F;
         field4758[4] = 0.0F;
         field4758[8] = 0.0F;
         field4758[2] = 0.0F;
         field4758[7] = 0.0F;
         field4758[1] = 0.0F;
         field4758[9] = 0.0F;
         field4758[11] = 0.0F;
         field4758[0] = 1.0F;
         field4758[14] = 0.0F;
         field4758[15] = 1.0F;
         field4758[10] = 1.0F;
         field4758[3] = 0.0F;
         field4758[13] = 0.0F;
         field4758[6] = 0.0F;
      }

      this.field4742.SetTransform(2, field4758);
      if (arg0 != 0) {
         method2608((class371)null, (byte)-96, (class301)null);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IILbk;)V",
      line = 240
   )
   public final void method2585(int arg0, int arg1, class398 arg2) {
      class174 var4 = (class174)arg2;
      if (arg0 != 12) {
         this.method2626((byte)7, (IDirect3DPixelShader)null);
      }

      this.field4742.SetStreamSource(arg1, var4.field2408, 0, var4.method1411(arg0 + -17450));
   }

   @OriginalMember(
      owner = "client!bb",
      name = "i",
      descriptor = "(Z)V",
      line = 251
   )
   public final void method2586(boolean arg0) {
      if (!arg0) {
         this.method611(false);
      }

      this.field4738.SetAmbient(this.field5296 * this.field5255, this.field5322 * this.field5255, this.field5283 * this.field5255, 0.0F);
      this.field4743 = false;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(B[Lhja;)Lbr;",
      line = 262
   )
   public final class418 method2587(byte arg0, class430[] arg1) {
      return arg0 >= -14 ? (class418)null : new dxVertexLayout(this, arg1);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "U",
      descriptor = "(I)V",
      line = 273
   )
   public final void method2588(int arg0) {
      if (arg0 <= 109) {
         this.method612(82, -120, -107, 61, 1.2035779242913318D);
      }

      this.field4738.SetDirection(-this.field5338[0], -this.field5338[1], -this.field5338[2]);
      this.field4746.SetDirection(-this.field5321[0], -this.field5321[1], -this.field5321[2]);
      this.field4743 = false;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "h",
      descriptor = "()V",
      line = 285
   )
   public final void method510() {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "t",
      descriptor = "(I)V",
      line = 288
   )
   public final void method2589(int arg0) {
      if (arg0 != -1) {
         this.method2613(115, -124, (int[])null, -78, 69, -122, false);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "H",
      descriptor = "(I)V",
      line = 299
   )
   public final void method2590(int arg0) {
      for(int var2 = arg0; ~var2 > ~this.field5307; ++var2) {
         this.field4742.SetSamplerState(var2, 7, 0);
         this.field4742.SetSamplerState(var2, 6, 2);
         this.field4742.SetSamplerState(var2, 5, 2);
         this.field4742.SetSamplerState(var2, 1, 1);
         this.field4742.SetSamplerState(var2, 2, 1);
         this.field4750[var2] = class711.field10376;
         this.field4753[var2] = this.field4744[var2] = true;
         this.field4764[var2] = false;
         this.field4745[var2] = 0;
      }

      this.field4742.SetTextureStageState(0, 6, 1);
      this.field4742.SetRenderState(9, 2);
      this.field4742.SetRenderState(23, 4);
      this.field4742.SetRenderState(25, 5);
      this.field4742.SetRenderState(24, 0);
      this.field4742.SetRenderState(22, 2);
      this.field4742.SetRenderState(147, 1);
      this.field4742.SetRenderState(145, 1);
      this.field4742.method3718(38, 0.95F);
      this.field4742.SetRenderState(140, 3);
      this.field4738.SetType(3);
      this.field4746.SetType(3);
      this.field4752.SetType(1);
      this.field4743 = false;
      super.method2590(0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "e",
      descriptor = "(II)V",
      line = 336
   )
   public final void method560(int arg0, int arg1) throws class525 {
      this.field4742.EndScene();
      if (!this.field4740.method5340(119)) {
         if (-51 > ~(++this.field4741)) {
            throw new class525();
         }

         this.method2618(-50);
      } else {
         this.field4741 = 0;
         if (class512.method3731(this.field4740.method5339(0, -25046), (byte)-125)) {
            this.method2618(-93);
         }
      }

      this.field4742.BeginScene();
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IIII)V",
      line = 360
   )
   public final void method575(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "p",
      descriptor = "(I)V",
      line = 363
   )
   public final void method2591(int arg0) {
      if (!this.field4743) {
         this.field4742.LightEnable(0, false);
         this.field4742.LightEnable(1, false);
         this.field4742.SetLight(0, this.field4738);
         this.field4742.SetLight(1, this.field4746);
         this.field4742.LightEnable(0, true);
         this.field4742.LightEnable(1, true);
         this.field4743 = true;
      }

      if (arg0 > -107) {
         this.method537();
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "s",
      descriptor = "(B)V",
      line = 383
   )
   public final void method2592(byte arg0) {
      this.field4742.SetScissorRect(this.field5331 + this.field5275, this.field5326 + this.field5280, this.field5323, this.field5339);
      if (arg0 > -60) {
         field4758 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "C",
      descriptor = "(I)V",
      line = 394
   )
   public final void method2593(int arg0) {
      int var2 = !this.field4759[this.field5309] ? 1 : method2604(this.field5262[this.field5309], arg0 + 19709);
      this.field4742.SetTextureStageState(this.field5309, 1, var2);
      if (arg0 != 2) {
         method2633((byte)-21, (class95)null);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "na",
      descriptor = "(IIII)[I",
      line = 407
   )
   public final int[] method517(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field4742.method3712(0);
      IDirect3DSurface var7 = this.field4742.method3724(arg2, arg3, 21, 0, 0, true);
      if (class512.method3730((byte)121, this.field4742.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class512.method3730((byte)-63, var7.LockRect(0, 0, arg2, arg3, 16, this.field4763))) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field4763.getRowPitch();
         if (~(arg2 * 4) == ~var8) {
            this.field4763.method3736(var5, 0, 0, arg2 * arg3);
         } else {
            for(int var9 = 0; ~var9 > ~arg3; ++var9) {
               this.field4763.method3736(var5, arg2 * var9, var8 * var9, arg2);
            }
         }

         var7.UnlockRect();
      }

      var6.method5120(9575);
      var7.method5120(9575);
      return var5;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "()V",
      line = 445
   )
   public final void method549() {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/pga;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ldd;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lkf;I)V",
      line = 449
   )
   private class353(int arg0, int arg1, Canvas arg2, class702 arg3, IDirect3D arg4, IDirect3DDevice arg5, class734 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class162 arg9, class266 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field4747 = arg8;
         this.field4739 = arg1;
         this.field4756 = arg7;
         this.field4757 = arg3;
         this.field4755 = arg0;
         this.field4751 = arg4;
         this.field4740 = arg6;
         this.field4742 = arg5;
         this.field4738 = new class513(this.field4757);
         this.field4746 = new class513(this.field4757);
         this.field4752 = new class513(this.field4757);
         this.field4763 = new PixelBuffer(this.field4757);
         this.field4754 = new GeometryBuffer(this.field4757);
         new GeometryBuffer(this.field4757);
         this.field5250 = 0 >= this.field4747.MaxActiveLights ? 8 : this.field4747.MaxActiveLights;
         this.field4737 = (this.field4747.TextureCaps & 65536) != 0;
         this.field4748 = ~(16384 & this.field4747.TextureCaps) != -1;
         this.field5324 = ~(this.field4747.TextureCaps & 2048) != -1;
         this.field4761 = ~(2 & this.field4747.TextureCaps) == -1;
         this.field5281 = (8192 & this.field4747.TextureCaps) != 0;
         this.field5307 = this.field4747.MaxSimultaneousTextures;
         this.field5249 = 0 < this.field5289 || this.field4751.CheckDeviceMultiSampleType(this.field4755, this.field4739, this.field4756.BackBufferFormat, true, 2) == 0;
         this.field4744 = new boolean[this.field5307];
         this.field4759 = new boolean[this.field5307];
         this.field4745 = new int[this.field5307];
         this.field4750 = new class663[this.field5307];
         this.field4764 = new boolean[this.field5307];
         this.field4753 = new boolean[this.field5307];
         this.field4742.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method567((byte)-127);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "Z",
      descriptor = "(I)V",
      line = 496
   )
   public final void method2594(int arg0) {
      this.field5293 = (float)(-this.field5263 + this.field5332);
      this.field5313 = (float)(-this.field5285) + this.field5293;
      if (arg0 != 0) {
         this.method556((class1)null);
      }

      if ((float)this.field5258 > this.field5313) {
         this.field5313 = (float)this.field5258;
      }

      this.field4742.method3718(36, this.field5313);
      this.field4742.method3718(37, this.field5293);
      this.field4742.SetRenderState(34, this.field5269);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ldfa;I)V",
      line = 518
   )
   public final void method2595(class177 arg0, int arg1) {
      this.method2616((byte)-107, arg0);
      if (arg1 == 1) {
         if (!this.field4753[this.field5309]) {
            this.field4742.SetSamplerState(this.field5309, 1, 1);
            this.field4753[this.field5309] = true;
         }

         if (!this.field4744[this.field5309]) {
            this.field4742.SetSamplerState(this.field5309, 2, 1);
            this.field4744[this.field5309] = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(ZIBI[FIILak;)Lfc;",
      line = 541
   )
   public final class272 method2596(boolean arg0, int arg1, byte arg2, int arg3, float[] arg4, int arg5, int arg6, class371 arg7) {
      if (arg2 >= -81) {
         method2633((byte)46, (class95)null);
      }

      return null;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Llg;B)I",
      line = 552
   )
   private static final int method2597(class437 arg0, byte arg1) {
      if (class660.field9617 != arg0) {
         if (class93.field1202 != arg0) {
            if (class131.field1676 == arg0) {
               return 1;
            } else if (class394.field5700 == arg0) {
               return 4;
            } else if (class62.field761 != arg0) {
               if (class38.field546 != arg0) {
                  if (arg1 > -83) {
                     method2604((class793)null, 44);
                  }

                  throw new IllegalArgumentException("");
               } else {
                  return 5;
               }
            } else {
               return 6;
            }
         } else {
            return 3;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "y",
      descriptor = "(I)V",
      line = 588
   )
   public final void method2598(int arg0) {
      this.field4742.SetRenderState(60, this.field5291);
      if (arg0 != 10) {
         this.field4740 = (class734)null;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lria;BLak;)Z",
      line = 599
   )
   public final boolean method2599(class301 arg0, byte arg1, class371 arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg1 <= 34) {
         return false;
      } else {
         return class512.method3730((byte)122, this.field4751.method3710(this.field4755, var4)) && class512.method3730((byte)124, this.field4751.CheckDeviceFormat(this.field4755, this.field4739, var4.Format, 0, 4, method2608(arg2, (byte)51, arg0)));
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Loba;I)I",
      line = 610
   )
   private static final int method2600(class274 arg0, int arg1) {
      if (class583.field8635 != arg0) {
         if (class148.field1961 != arg0) {
            if (class505.field7325 != arg0) {
               if (class684.field10074 == arg0) {
                  return 4;
               } else if (class708.field10339 != arg0) {
                  int var2 = -85 / ((-8 - arg1) / 55);
                  return 0;
               } else {
                  return 256;
               }
            } else {
               return 3;
            }
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "GA",
      descriptor = "(I)V",
      line = 639
   )
   public final void method495(int arg0) {
      this.field4742.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "eb",
      descriptor = "(I)V",
      line = 648
   )
   public final void method2601(int arg0) {
      if (arg0 == 0) {
         this.field4742.method3723(174, this.field5366);
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "g",
      descriptor = "(Z)V",
      line = 658
   )
   public final void method2602(boolean arg0) {
      if (arg0) {
         this.field4754 = (GeometryBuffer)null;
      }

      this.field4742.SetViewport(this.field5331, this.field5280, this.field5100, this.field5117, 0.0F, 1.0F);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lst;Luu;)Lus;",
      line = 668
   )
   public final class1 method529(class461 arg0, class302 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Llg;III)V",
      line = 679
   )
   public final void method2603(class437 arg0, int arg1, int arg2, int arg3) {
      this.field4742.DrawPrimitive(method2597(arg0, (byte)-86), arg2, arg1);
      int var5 = -9 % ((arg3 - 51) / 34);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lwia;I)I",
      line = 689
   )
   private static final int method2604(class793 arg0, int arg1) {
      if (arg1 != 19711) {
         field4758 = (float[])null;
      }

      if (class603.field8872 == arg0) {
         return 2;
      } else if (class458.field6587 != arg0) {
         if (class144.field1826 == arg0) {
            return 26;
         } else if (class358.field4889 != arg0) {
            if (class470.field6749 == arg0) {
               return 10;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 7;
         }
      } else {
         return 4;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "G",
      descriptor = "(I)F",
      line = 720
   )
   public final float method2605(int arg0) {
      int var2 = -126 / ((arg0 - -47) / 43);
      return -0.5F;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "ya",
      descriptor = "()V",
      line = 728
   )
   public final void method523() {
      this.method2750(true, (byte)22);
      this.field4742.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IIIIZ[BLak;I)Lfc;",
      line = 736
   )
   public final class272 method2606(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, class371 arg6, int arg7) {
      if (arg3 != 0) {
         this.field4744 = (boolean[])null;
      }

      return new class574(this, arg6, arg1, arg0, arg4, arg5, arg7, arg2);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLns;)V",
      line = 749
   )
   public final void method2607(byte arg0, class427 arg1) {
      int var3 = 0;
      if (class647.field9458 == arg1) {
         var3 = 65536;
      } else if (class423.field6028 == arg1) {
         var3 = 131072;
      } else if (class679.field10013 == arg1) {
         var3 = 196608;
      }

      this.field4742.SetTextureStageState(this.field5309, 11, var3 | this.field5309);
      if (arg0 >= -6) {
         this.field4763 = (PixelBuffer)null;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lak;BLria;)I",
      line = 771
   )
   public static final int method2608(class371 arg0, byte arg1, class301 arg2) {
      if (arg1 != 51) {
         return -125;
      } else {
         if (class301.field4117 == arg2) {
            if (class14.field155 == arg0) {
               return 22;
            }

            if (class424.field6036 == arg0) {
               return 21;
            }

            if (class46.field621 == arg0) {
               return 28;
            }

            if (class14.field166 == arg0) {
               return 50;
            }

            if (class227.field3212 == arg0) {
               return 51;
            }

            if (class626.field9193 == arg0) {
               return 77;
            }
         }

         throw new IllegalArgumentException("");
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 810
   )
   public final void method550(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class525 {
      this.method560(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "([[IZIZ)Lofa;",
      line = 817
   )
   public final class349 method2609(int[][] arg0, boolean arg1, int arg2, boolean arg3) {
      if (arg1) {
         this.method2628((class576)null, (byte)-49, (class437)null, -12, -91, 37, -39);
      }

      return new class315(this, arg2, arg3, arg0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "s",
      descriptor = "()Z",
      line = 827
   )
   public final boolean method606() {
      return false;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "E",
      descriptor = "(I)V",
      line = 835
   )
   public final void method2610(int arg0) {
      if (arg0 != 25970) {
         this.method2578(50);
      }

      this.field4742.method3723(7, this.field5328);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "J",
      descriptor = "(I)V",
      line = 847
   )
   public final void method2611(int arg0) {
      if (class701.field10254 != this.field5287) {
         if (class328.field4475 != this.field5287) {
            if (class246.field3399 == this.field5287) {
               this.field4742.SetRenderState(19, 9);
               this.field4742.SetRenderState(20, 2);
            }
         } else {
            this.field4742.SetRenderState(19, 2);
            this.field4742.SetRenderState(20, 2);
         }
      } else {
         this.field4742.SetRenderState(19, 5);
         this.field4742.SetRenderState(20, 6);
      }

      if (arg0 != -2) {
         this.method537();
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Llc;Llc;FLlc;)Llc;",
      line = 876
   )
   public final class676 method540(class676 arg0, class676 arg1, float arg2, class676 arg3) {
      return arg2 < 0.5F ? arg0 : arg1;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "K",
      descriptor = "(I)V",
      line = 883
   )
   public final void method2612(int arg0) {
      this.method2625((byte)70);
      this.method2591(-110);
      if (arg0 != 12) {
         this.method2606(-2, -17, 90, 28, true, (byte[])null, (class371)null, 51);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(II[IIIIZ)Lfc;",
      line = 894
   )
   public final class272 method2613(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, boolean arg6) {
      return arg3 > -52 ? (class272)null : new class574(this, arg4, arg5, arg6, arg2, arg1, arg0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "u",
      descriptor = "(I)V",
      line = 905
   )
   public final void method2614(int arg0) {
      if (this.field4762 == null && this.field5342[this.field5309] != class552.field7905) {
         if (this.field5342[this.field5309] != class148.field1961) {
            this.field4742.SetTransform(16 - -this.field5309, this.field5302[this.field5309].method5210(field4758, true));
         } else {
            this.field4742.SetTransform(this.field5309 + 16, this.field5302[this.field5309].method5206((byte)-43, field4758));
         }

         int var2 = method2600(this.field5342[this.field5309], -89);
         if (this.field4745[this.field5309] != var2) {
            this.field4742.SetTextureStageState(this.field5309, 24, var2);
            this.field4745[this.field5309] = var2;
         }
      } else {
         this.field4742.SetTextureStageState(this.field5309, 24, 0);
         this.field4745[this.field5309] = 0;
      }

      if (arg0 != -3339) {
         method2604((class793)null, 109);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "d",
      descriptor = "(IZ)Lbk;",
      line = 937
   )
   public final class398 method2615(int arg0, boolean arg1) {
      if (arg0 < 35) {
         this.method2613(-66, 117, (int[])null, -104, -88, 93, true);
      }

      return new class174(this, arg1);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "b",
      descriptor = "(II)Luu;",
      line = 947
   )
   public final class302 method498(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "n",
      descriptor = "()Z",
      line = 954
   )
   public final boolean method528() {
      return false;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLtha;)V",
      line = 961
   )
   public final void method2616(byte arg0, class309 arg1) {
      this.field4742.SetTexture(this.field5309, arg1.method1424((byte)-89));
      if (arg0 > -87) {
         this.field4743 = true;
      }

      if (this.field4750[this.field5309] != arg1.field4254) {
         int var3 = method2574(arg1.field4254, 1);
         this.field4742.SetSamplerState(this.field5309, 6, var3);
         this.field4742.SetSamplerState(this.field5309, 5, var3);
         this.field4750[this.field5309] = arg1.field4254;
         if (this.field4764[this.field5309] != arg1.field4251) {
            this.field4742.SetSamplerState(this.field5309, 7, arg1.field4251 ? method2574(arg1.field4254, 1) : 0);
            this.field4764[this.field5309] = arg1.field4251;
         }
      } else if (!arg1.field4251 != !this.field4764[this.field5309]) {
         this.field4742.SetSamplerState(this.field5309, 7, !arg1.field4251 ? 0 : method2574(arg1.field4254, 1));
         this.field4764[this.field5309] = arg1.field4251;
      }

      if (!this.field4759[this.field5309]) {
         this.field4759[this.field5309] = true;
         this.method2577(4785);
         this.method2593(2);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "h",
      descriptor = "(Z)V",
      line = 1004
   )
   public final void method2617(boolean arg0) {
      this.field4742.method3723(28, this.field5335 && this.field5333 && ~this.field5285 <= -1);
      if (arg0) {
         this.field4742 = (IDirect3DDevice)null;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "B",
      descriptor = "(I)Z",
      line = 1014
   )
   private final boolean method2618(int arg0) {
      if (arg0 > -43) {
         return false;
      } else {
         int var2 = this.field4742.TestCooperativeLevel();
         if (var2 == 0 || ~var2 == 2005530518) {
            class734 var3 = (class734)this.field5144;
            this.method2800((byte)-73);
            var3.method5338(68);
            this.field4756.BackBufferWidth = 0;
            this.field4756.BackBufferHeight = 0;
            if (method2630(this.field4751, this.field4755, this.field4756, 108, this.field4739, this.field5289)) {
               int var4 = this.field4742.Reset(this.field4756);
               if (class512.method3730((byte)18, var4)) {
                  var3.method5341((byte)-10, this.field4742.method3725(0), this.field4742.method3727());
                  this.method2746(-14279);
                  this.method2590(0);
                  return true;
               }
            }
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lria;IIILak;)Lfc;",
      line = 1054
   )
   public final class272 method2619(class301 arg0, int arg1, int arg2, int arg3, class371 arg4) {
      if (arg2 != -1025288952) {
         this.field4752 = (class513)null;
      }

      return new class574(this, arg4, arg0, arg3, arg1);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "j",
      descriptor = "(I)V",
      line = 1065
   )
   public final void method2620(int arg0) {
      int var2;
      for(var2 = arg0; ~this.field5256 < ~var2; ++var2) {
         class389 var3 = this.field5329[var2];
         int var4 = var2 - -2;
         int var5 = var3.method2961(109);
         float var6 = var3.method2962(arg0 + -1) / 255.0F;
         this.field4752.SetPosition((float)var3.method2955(false), (float)var3.method2959(-127), (float)var3.method2963(true));
         this.field4752.SetDiffuse((float)((16740651 & var5) >> 16) * var6, (float)(var5 >> 8 & 255) * var6, (float)(255 & var5) * var6, 0.0F);
         this.field4752.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method2958((byte)107) * var3.method2958((byte)-101)));
         this.field4752.SetRange((float)var3.method2958((byte)-111));
         this.field4742.SetLight(var4, this.field4752);
         this.field4742.LightEnable(var4, true);
      }

      while(~var2 > ~this.field5290) {
         this.field4742.LightEnable(var2 + 2, false);
         ++var2;
      }

      super.method2620(0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lbr;I)V",
      line = 1101
   )
   public final void method2621(class418 arg0, int arg1) {
      dxVertexLayout var3 = (dxVertexLayout)arg0;
      if (arg1 != -18344) {
         field4749 = (int[])null;
      }

      this.field4742.SetVertexDeclaration(var3.field4653);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V",
      line = 1112
   )
   public final void method2622(Object arg0, boolean arg1, Canvas arg2) {
      this.field4740 = (class734)arg0;
      if (!arg1) {
         this.method2627((byte)10);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BI)Lhh;",
      line = 1123
   )
   public final class141 method2623(byte arg0, int arg1) {
      if (arg0 != -43) {
         return (class141)null;
      } else if (~arg1 == -4) {
         return new class335(this, this.field5113);
      } else if (arg1 != 4) {
         return ~arg1 == -9 ? new class717(this, this.field5113, this.field5227) : super.method2623((byte)-43, arg1);
      } else {
         return new class35(this, this.field5113, this.field5227);
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;",
      line = 1166
   )
   public final Object method2624(Canvas arg0, int arg1) {
      return arg1 != 1 ? (Object)null : null;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "r",
      descriptor = "(B)V",
      line = 1177
   )
   public final void method2625(byte arg0) {
      if (arg0 != 70) {
         this.field4757 = (class702)null;
      }

      float var2 = !this.field5252 ? 0.0F : this.field5244;
      float var3 = this.field5252 ? -this.field5257 : 0.0F;
      this.field4738.SetDiffuse(this.field5296 * var2, this.field5322 * var2, this.field5283 * var2, 0.0F);
      this.field4746.SetDiffuse(this.field5296 * var3, this.field5322 * var3, this.field5283 * var3, 0.0F);
      this.field4743 = false;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLjagdx/IDirect3DPixelShader;)V",
      line = 1194
   )
   public final void method2626(byte arg0, IDirect3DPixelShader arg1) {
      if (arg0 <= 86) {
         this.field4745 = (int[])null;
      }

      this.field4742.SetPixelShader(arg1);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Lus;)V",
      line = 1203
   )
   public final void method556(class1 arg0) {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "k",
      descriptor = "(B)V",
      line = 1207
   )
   public final void method2627(byte arg0) {
      if (this.field4759[this.field5309]) {
         this.field4759[this.field5309] = false;
         this.field4742.SetTexture(this.field5309, (IDirect3DBaseTexture)null);
         this.method2577(4785);
         this.method2593(2);
      }

      if (arg0 >= -80) {
         this.method2592((byte)23);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Llba;BLlg;IIII)V",
      line = 1227
   )
   public final void method2628(class576 arg0, byte arg1, class437 arg2, int arg3, int arg4, int arg5, int arg6) {
      this.field4742.SetIndices(((class306)arg0).field4188);
      int var8 = 84 % ((-2 - arg1) / 48);
      this.field4742.DrawIndexedPrimitive(method2597(arg2, (byte)-113), 0, arg5, arg6, arg4, arg3);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "F",
      descriptor = "(II)V",
      line = 1249
   )
   public final void method521(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLjagdx/IDirect3DVertexShader;)V",
      line = 1252
   )
   public final void method2629(byte arg0, IDirect3DVertexShader arg1) {
      this.field4762 = arg1;
      if (arg0 == 102) {
         this.field4742.SetVertexShader(arg1);
         this.method2614(-3339);
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ljagdx/IDirect3D;ILjagdx/D3DPRESENT_PARAMETERS;III)Z",
      line = 1265
   )
   private static final boolean method2630(IDirect3D arg0, int arg1, D3DPRESENT_PARAMETERS arg2, int arg3, int arg4, int arg5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
         int var10 = -106 % ((-5 - arg3) / 57);
         if (class512.method3731(arg0.method3710(arg1, var9), (byte)71)) {
            return false;
         } else {
            label87:
            while(-1 >= ~arg5) {
               if (~arg5 != -2) {
                  var8 = 0 - -arg5;

                  for(int var11 = 0; ~field4749.length < ~var11; ++var11) {
                     if (arg0.CheckDeviceType(arg1, arg4, var9.Format, field4749[var11], true) == 0 && 0 == arg0.CheckDeviceFormat(arg1, arg4, var9.Format, 1, 1, field4749[var11]) && (arg5 == 0 || ~arg0.CheckDeviceMultiSampleType(arg1, arg4, field4749[var11], true, var8) == -1)) {
                        for(int var12 = 0; var12 < field4760.length; ++var12) {
                           if (0 == arg0.CheckDeviceFormat(arg1, arg4, var9.Format, 2, 1, field4760[var12]) && arg0.CheckDepthStencilMatch(arg1, arg4, var9.Format, field4749[var11], field4760[var12]) == 0 && (~arg5 == -1 || 0 == arg0.CheckDeviceMultiSampleType(arg1, arg4, field4760[var11], true, var8))) {
                              var6 = field4760[var12];
                              var7 = field4749[var11];
                              break label87;
                           }
                        }
                     }
                  }
               }

               --arg5;
            }

            if (0 <= arg5 && ~var7 != -1 && var6 != 0) {
               arg2.MultiSampleQuality = 0;
               arg2.MultiSampleType = var8;
               arg2.AutoDepthStencilFormat = var6;
               arg2.BackBufferFormat = var7;
               return true;
            } else {
               return false;
            }
         }
      } catch (Throwable var14) {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "r",
      descriptor = "(I)V",
      line = 1367
   )
   public final void method2631(int arg0) {
      if (arg0 != 0) {
         this.method2636(false, (class301)null, (class371)null);
      }

      this.field4742.method3723(27, this.field5330);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLel;)V",
      line = 1377
   )
   public final void method2632(byte arg0, class574 arg1) {
      this.method2616((byte)-100, arg1);
      if (!arg1.field8508 == this.field4753[this.field5309]) {
         this.field4742.SetSamplerState(this.field5309, 1, arg1.field8508 ? 1 : 3);
         this.field4753[this.field5309] = arg1.field8508;
      }

      int var3 = 38 / ((arg0 - -73) / 50);
      if (!arg1.field8506 != !this.field4744[this.field5309]) {
         this.field4742.SetSamplerState(this.field5309, 2, arg1.field8506 ? 1 : 3);
         this.field4744[this.field5309] = arg1.field8506;
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(BLtn;)I",
      line = 1398
   )
   private static final int method2633(byte arg0, class95 arg1) {
      if (class10.field93 == arg1) {
         return 2;
      } else if (class691.field10171 != arg1) {
         if (class706.field10312 != arg1) {
            if (class304.field4150 != arg1) {
               if (arg0 < 98) {
                  return -123;
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return 3;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "F",
      descriptor = "(I)V",
      line = 1424
   )
   public final void method2634(int arg0) {
      this.field4742.method3723(14, this.field5270 && this.field5276);
      if (arg0 != 0) {
         this.method540((class676)null, (class676)null, -1.2483331F, (class676)null);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "r",
      descriptor = "()V",
      line = 1433
   )
   public final void method609() {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(Ltn;IIZZ)V",
      line = 1448
   )
   public final void method2635(class95 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      byte var7;
      if (~arg1 == -2) {
         var7 = 3;
      } else if (arg1 == 2) {
         var7 = 26;
      } else {
         var7 = 2;
      }

      int var8 = 0;
      if (arg2 >= -123) {
         this.method2617(false);
      }

      if (arg3) {
         var8 |= 32;
      }

      if (arg4) {
         var8 |= 16;
      }

      this.field4742.SetTextureStageState(this.field5309, var7, method2633((byte)101, arg0) | var8);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(ZLria;Lak;)Z",
      line = 1487
   )
   public final boolean method2636(boolean arg0, class301 arg1, class371 arg2) {
      if (!arg0) {
         this.field4746 = (class513)null;
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return class512.method3730((byte)119, this.field4751.method3710(this.field4755, var4)) && class512.method3730((byte)-128, this.field4751.CheckDeviceFormat(this.field4755, this.field4739, var4.Format, 0, 3, method2608(arg2, (byte)51, arg1)));
   }

   @OriginalMember(
      owner = "client!bb",
      name = "c",
      descriptor = "(Z)V",
      line = 1500
   )
   public final void method611(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!bb",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Lkf;Ljava/lang/Integer;)Lha;",
      line = 1504
   )
   public static final class66 createToolkit(Canvas arg0, class162 arg1, class266 arg2, Integer arg3) {
      class353 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class702 var7 = new class702();
         IDirect3D var8 = IDirect3D.method3708(-2147483616, var7);
         D3DCAPS var9 = var8.method3707(var5, var6);
         if ((var9.RasterCaps & 16777216) == 0) {
            throw new RuntimeException("");
         } else if (~var9.MaxSimultaneousTextures <= -3) {
            if ((2 & var9.TextureOpCaps) == 0) {
               throw new RuntimeException("");
            } else if (~(var9.TextureOpCaps & 8) != -1) {
               if (~(64 & var9.TextureOpCaps) != -1) {
                  if ((512 & var9.TextureOpCaps) == 0) {
                     throw new RuntimeException("");
                  } else if ((var9.TextureOpCaps & 33554432) != 0) {
                     if ((var9.DestBlendCaps & var9.SrcBlendCaps & 16) == 0) {
                        throw new RuntimeException("");
                     } else if ((32 & var9.DestBlendCaps & var9.SrcBlendCaps) == 0) {
                        throw new RuntimeException("");
                     } else if ((var9.SrcBlendCaps & var9.DestBlendCaps & 2) != 0) {
                        if (var9.MaxActiveLights > 0 && -3 < ~var9.MaxActiveLights) {
                           throw new RuntimeException("");
                        } else if (var9.MaxStreams >= 5) {
                           D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                           if (method2630(var8, var5, var10, 63, var6, arg3)) {
                              var10.PresentationInterval = Integer.MIN_VALUE;
                              var10.EnableAutoDepthStencil = true;
                              var10.Windowed = true;
                              int var11 = 2;
                              if ((1048576 & var9.DevCaps) != 0) {
                                 var11 |= 16;
                              }

                              Object var12 = null;

                              IDirect3DDevice var13;
                              try {
                                 var13 = var8.method3709(var5, var6, arg0, var11 | 64, var10);
                              } catch (class511 var17) {
                                 var13 = var8.method3709(var5, var6, arg0, 32 | var11, var10);
                              }

                              class734 var15 = new class734(var13.method3725(0), var13.method3727());
                              var4 = new class353(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                              var4.method2740(-14130);
                              return var4;
                           } else {
                              throw new RuntimeException("");
                           }
                        } else {
                           throw new RuntimeException("");
                        }
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  throw new RuntimeException("");
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var18) {
         if (var4 != null) {
            var4.method544();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!bb",
      name = "A",
      descriptor = "()Ljr;",
      line = 1605
   )
   public final class122 method573() {
      D3DADAPTER_IDENTIFIER var1 = this.field4751.method3711(this.field4755, 0);
      return new class122(var1.VendorID, field4765, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(I)V",
      line = 1613
   )
   public final synchronized void method597(int arg0) {
      this.field4757.method5121(-30274);
      super.method597(arg0);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "a",
      descriptor = "(IILtn;Z)V",
      line = 1625
   )
   public final void method2637(int arg0, int arg1, class95 arg2, boolean arg3) {
      int var5 = 113 / ((arg0 - -27) / 56);
      int var6 = 0;
      byte var8;
      if (arg1 != 1) {
         if (arg1 != 2) {
            var8 = 5;
         } else {
            var8 = 27;
         }
      } else {
         var8 = 6;
      }

      if (arg3) {
         var6 |= 16;
      }

      this.field4742.SetTextureStageState(this.field5309, var8, method2633((byte)126, arg2) | var6);
   }

   @OriginalMember(
      owner = "client!bb",
      name = "w",
      descriptor = "(B)V",
      line = 1675
   )
   public final void method2638(byte arg0) {
      if (this.field5235) {
         field4758[10] = 1.0F;
         field4758[14] = 0.0F;
         field4758[3] = 0.0F;
         field4758[6] = 0.0F;
         field4758[1] = 0.0F;
         field4758[12] = 0.0F;
         field4758[0] = 1.0F;
         field4758[8] = 0.0F;
         field4758[15] = 1.0F;
         field4758[2] = 0.0F;
         field4758[5] = 1.0F;
         field4758[13] = 0.0F;
         field4758[9] = 0.0F;
         field4758[4] = 0.0F;
         field4758[11] = 0.0F;
         field4758[7] = 0.0F;
      } else {
         this.field5236.method5210(field4758, true);
      }

      this.field4742.SetTransform(256, field4758);
      if (arg0 > -71) {
         this.method2586(false);
      }

   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2640(char[] arg0) {
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
            var10005 = 15;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
