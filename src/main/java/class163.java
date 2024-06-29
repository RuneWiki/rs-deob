import jaclib.peer.class709;
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
import jagdx.class71;
import jagdx.class72;
import jagdx.class73;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class163 extends class258 {
   @OriginalMember(
      owner = "client!eb",
      name = "Pg",
      descriptor = "Z"
   )
   private boolean field2426 = false;
   @OriginalMember(
      owner = "client!eb",
      name = "gh",
      descriptor = "I"
   )
   private int field2446 = 0;
   @OriginalMember(
      owner = "client!eb",
      name = "ch",
      descriptor = "I"
   )
   private int field2451;
   @OriginalMember(
      owner = "client!eb",
      name = "ah",
      descriptor = "I"
   )
   private int field2444;
   @OriginalMember(
      owner = "client!eb",
      name = "Mg",
      descriptor = "Ljaclib/peer/jv;"
   )
   public class709 field2424;
   @OriginalMember(
      owner = "client!eb",
      name = "Vg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field2438;
   @OriginalMember(
      owner = "client!eb",
      name = "dh",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field2432;
   @OriginalMember(
      owner = "client!eb",
      name = "eh",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field2436;
   @OriginalMember(
      owner = "client!eb",
      name = "Ig",
      descriptor = "Lfm;"
   )
   private class251 field2427;
   @OriginalMember(
      owner = "client!eb",
      name = "Tg",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field2447;
   @OriginalMember(
      owner = "client!eb",
      name = "Wg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class72 field2425;
   @OriginalMember(
      owner = "client!eb",
      name = "bh",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class72 field2440;
   @OriginalMember(
      owner = "client!eb",
      name = "Rg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class72 field2439;
   @OriginalMember(
      owner = "client!eb",
      name = "Xg",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field2428;
   @OriginalMember(
      owner = "client!eb",
      name = "Lg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field2443;
   @OriginalMember(
      owner = "client!eb",
      name = "Kg",
      descriptor = "Z"
   )
   public boolean field2430;
   @OriginalMember(
      owner = "client!eb",
      name = "Jg",
      descriptor = "Z"
   )
   public boolean field2433;
   @OriginalMember(
      owner = "client!eb",
      name = "Qg",
      descriptor = "Z"
   )
   public boolean field2448;
   @OriginalMember(
      owner = "client!eb",
      name = "Zg",
      descriptor = "[Z"
   )
   private boolean[] field2441;
   @OriginalMember(
      owner = "client!eb",
      name = "Og",
      descriptor = "[I"
   )
   private int[] field2449;
   @OriginalMember(
      owner = "client!eb",
      name = "hh",
      descriptor = "[Z"
   )
   private boolean[] field2445;
   @OriginalMember(
      owner = "client!eb",
      name = "Sg",
      descriptor = "[Z"
   )
   private boolean[] field2431;
   @OriginalMember(
      owner = "client!eb",
      name = "Gg",
      descriptor = "[Z"
   )
   private boolean[] field2434;
   @OriginalMember(
      owner = "client!eb",
      name = "fh",
      descriptor = "[Lpi;"
   )
   private class427[] field2442;
   @OriginalMember(
      owner = "client!eb",
      name = "ih",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2452 = method1513(method1512("I;Y'\u0007yao"));
   @OriginalMember(
      owner = "client!eb",
      name = "Yg",
      descriptor = "[I"
   )
   private static int[] field2429 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!eb",
      name = "Ng",
      descriptor = "[F"
   )
   private static float[] field2437 = new float[16];
   @OriginalMember(
      owner = "client!eb",
      name = "Hg",
      descriptor = "[I"
   )
   private static int[] field2435 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!eb",
      name = "Ug",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2450;

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public final void method1446(byte arg0) {
      this.field4156 = (float)(this.field4199 - this.field4143);
      this.field4175 = this.field4156 - (float)this.field4169;
      if ((float)this.field4216 > this.field4175) {
         this.field4175 = (float)this.field4216;
      }

      this.field2447.method577(36, this.field4175);
      if (arg0 >= -123) {
         field2435 = (int[])null;
      }

      this.field2447.method577(37, this.field4156);
      this.field2447.SetRenderState(34, this.field4219);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "(II)Lsv;",
      line = 24
   )
   public final class166 method620(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "Z",
      descriptor = "(I)V",
      line = 31
   )
   public final void method1447(int arg0) {
      this.method1462((byte)-48);
      if (arg0 != 3) {
         method1487(29, (class588)null);
      }

      this.method1454(-112);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "O",
      descriptor = "(I)V",
      line = 43
   )
   public final void method1448(int arg0) {
      if (this.field2441[this.field4172]) {
         this.field2441[this.field4172] = false;
         this.field2447.SetTexture(this.field4172, (IDirect3DBaseTexture)null);
         this.method1467(9);
         this.method1457((byte)99);
      }

      if (arg0 != 0) {
         this.method1492(-21);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "fb",
      descriptor = "(I)Z",
      line = 61
   )
   private final boolean method1449(int arg0) {
      if (arg0 != 4) {
         return false;
      } else {
         int var2 = this.field2447.TestCooperativeLevel();
         if (var2 == 0 || ~var2 == 2005530518) {
            class251 var3 = (class251)this.field4086;
            this.method2230(arg0 + -112);
            var3.method2129((byte)-4);
            this.field2432.BackBufferHeight = 0;
            this.field2432.BackBufferWidth = 0;
            if (method1480(this.field2451, (byte)108, this.field2432, this.field4187, this.field2436, this.field2444)) {
               int var4 = this.field2447.Reset(this.field2432);
               if (class71.method550(var4, (byte)-80)) {
                  var3.method2128(this.field2447.method574(), 13384, this.field2447.method569(0));
                  this.method2254(-91);
                  this.method1455(arg0 ^ 30166);
                  return true;
               }
            }
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "t",
      descriptor = "(I)V",
      line = 102
   )
   public final void method1450(int arg0) {
      this.field2447.method562(137, this.field4238 && !this.field4242);
      if (arg0 != 29866) {
         this.method651(-0.41831797F, -1.408394F, 0.98392624F);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lkka;B)V",
      line = 112
   )
   public final void method1451(class379 arg0, byte arg1) {
      this.method1466(arg0, (byte)-104);
      if (!this.field2434[this.field4172] != !arg0.field6008) {
         this.field2447.SetSamplerState(this.field4172, 1, arg0.field6008 ? 1 : 3);
         this.field2434[this.field4172] = arg0.field6008;
      }

      if (!arg0.field6006 != !this.field2431[this.field4172]) {
         this.field2447.SetSamplerState(this.field4172, 2, arg0.field6006 ? 1 : 3);
         this.field2431[this.field4172] = arg0.field6006;
      }

      if (arg1 < 86) {
         this.field2438 = (D3DCAPS)null;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lpr;Lpr;FLpr;)Lpr;",
      line = 136
   )
   public final class331 method603(class331 arg0, class331 arg1, float arg2, class331 arg3) {
      return !(0.5F > arg2) ? arg1 : arg0;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "([Ldr;B)Lvi;",
      line = 143
   )
   public final class371 method1452(class570[] arg0, byte arg1) {
      if (arg1 != 1) {
         this.method653();
      }

      return new dxVertexLayout(this, arg0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Leh;Lpc;B)Z",
      line = 155
   )
   public final boolean method1453(class19 arg0, class650 arg1, byte arg2) {
      if (arg2 >= -62) {
         return false;
      } else {
         D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
         return class71.method550(this.field2436.method557(this.field2451, var4), (byte)-80) && class71.method550(this.field2436.CheckDeviceFormat(this.field2451, this.field2444, var4.Format, 0, 3, method1482(arg0, false, arg1)), (byte)-80);
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "Y",
      descriptor = "(I)V",
      line = 166
   )
   public final void method1454(int arg0) {
      if (arg0 >= -88) {
         this.field2444 = 35;
      }

      if (!this.field2426) {
         this.field2447.LightEnable(0, false);
         this.field2447.LightEnable(1, false);
         this.field2447.SetLight(0, this.field2425);
         this.field2447.SetLight(1, this.field2440);
         this.field2447.LightEnable(0, true);
         this.field2447.LightEnable(1, true);
         this.field2426 = true;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "P",
      descriptor = "(I)V",
      line = 190
   )
   public final void method1455(int arg0) {
      for(int var2 = 0; var2 < this.field4150; ++var2) {
         this.field2447.SetSamplerState(var2, 7, 0);
         this.field2447.SetSamplerState(var2, 6, 2);
         this.field2447.SetSamplerState(var2, 5, 2);
         this.field2447.SetSamplerState(var2, 1, 1);
         this.field2447.SetSamplerState(var2, 2, 1);
         this.field2442[var2] = class168.field2573;
         this.field2434[var2] = this.field2431[var2] = true;
         this.field2445[var2] = false;
         this.field2449[var2] = 0;
      }

      this.field2447.SetTextureStageState(0, 6, 1);
      this.field2447.SetRenderState(9, 2);
      this.field2447.SetRenderState(23, 4);
      this.field2447.SetRenderState(25, 5);
      this.field2447.SetRenderState(24, 0);
      this.field2447.SetRenderState(22, 2);
      this.field2447.SetRenderState(147, 1);
      this.field2447.SetRenderState(145, 1);
      this.field2447.method577(38, 0.95F);
      this.field2447.SetRenderState(140, 3);
      this.field2425.SetType(3);
      this.field2440.SetType(3);
      this.field2439.SetType(1);
      this.field2426 = false;
      super.method1455(arg0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DVertexShader;B)V",
      line = 226
   )
   public final void method1456(IDirect3DVertexShader arg0, byte arg1) {
      this.field2450 = arg0;
      this.field2447.SetVertexShader(arg0);
      this.method1477(-128);
      int var3 = -121 % ((45 - arg1) / 39);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "x",
      descriptor = "(B)V",
      line = 239
   )
   public final void method1457(byte arg0) {
      if (arg0 >= 93) {
         int var2 = this.field2441[this.field4172] ? method1487(-8743, this.field4237[this.field4172]) : 1;
         this.field2447.SetTextureStageState(this.field4172, 1, var2);
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "na",
      descriptor = "(IIII)[I",
      line = 251
   )
   public final int[] method642(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field2447.method568(0);
      IDirect3DSurface var7 = this.field2447.method564(arg2, arg3, 21, 0, 0, true);
      if (class71.method550(this.field2447.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), (byte)-80) && class71.method550(var7.LockRect(0, 0, arg2, arg3, 16, this.field2428), (byte)-80)) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field2428.getRowPitch();
         if (arg2 * 4 != var8) {
            for(int var9 = 0; arg3 > var9; ++var9) {
               this.field2428.method559(var5, arg2 * var9, var8 * var9, arg2);
            }
         } else {
            this.field2428.method559(var5, 0, 0, arg2 * arg3);
         }

         var7.UnlockRect();
      }

      var6.method5223(-18900);
      var7.method5223(-18900);
      return var5;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(BI)V",
      line = 292
   )
   public final void method1458(byte arg0, int arg1) {
      int var3 = -106 % ((-51 - arg0) / 50);
      this.field2447.SetTextureStageState(this.field4172, 11, arg1);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "ya",
      descriptor = "()V",
      line = 300
   )
   public final void method655() {
      this.method2219(true, 112);
      this.field2447.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "(IIIID)V",
      line = 307
   )
   public final void method592(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "GA",
      descriptor = "(I)V",
      line = 310
   )
   public final void method590(int arg0) {
      this.field2447.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lfba;Z)V",
      line = 318
   )
   public final void method1459(class30 arg0, boolean arg1) {
      this.method1466(arg0, (byte)-98);
      if (!this.field2434[this.field4172]) {
         this.field2447.SetSamplerState(this.field4172, 1, 1);
         this.field2434[this.field4172] = true;
      }

      if (!this.field2431[this.field4172]) {
         this.field2447.SetSamplerState(this.field4172, 2, 1);
         this.field2431[this.field4172] = true;
      }

      if (arg1) {
         this.method1495((Canvas)null, 119, (Object)null);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "l",
      descriptor = "(B)V",
      line = 342
   )
   public final void method1460(byte arg0) {
      if (arg0 != -20) {
         this.method1460((byte)107);
      }

      this.field2425.SetAmbient(this.field4177 * this.field4160, this.field4194 * this.field4177, this.field4211 * this.field4177, 0.0F);
      this.field2426 = false;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "s",
      descriptor = "(B)V",
      line = 355
   )
   public final void method1461(byte arg0) {
      int var2 = -112 / ((-55 - arg0) / 60);
      this.field2447.method562(7, this.field4163);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "j",
      descriptor = "(B)V",
      line = 365
   )
   public final void method1462(byte arg0) {
      float var2 = !this.field4206 ? 0.0F : this.field4161;
      float var3 = !this.field4206 ? 0.0F : -this.field4213;
      this.field2425.SetDiffuse(this.field4160 * var2, this.field4194 * var2, this.field4211 * var2, 0.0F);
      if (arg0 > -41) {
         this.method1502((class371)null, -88);
      }

      this.field2440.SetDiffuse(this.field4160 * var3, this.field4194 * var3, this.field4211 * var3, 0.0F);
      this.field2426 = false;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;",
      line = 379
   )
   public final Object method1463(int arg0, Canvas arg1) {
      if (arg0 < 55) {
         this.method1485(-84);
      }

      return null;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "(IZ)Lqq;",
      line = 389
   )
   public final class800 method1464(int arg0, boolean arg1) {
      if (arg0 != 7983) {
         this.field2431 = (boolean[])null;
      }

      return new class403(this, class650.field9372, arg1);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "f",
      descriptor = "()V",
      line = 398
   )
   public final void method672() {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILjl;II)V",
      line = 406
   )
   public final void method1465(int arg0, class133 arg1, int arg2, int arg3) {
      if (arg3 == 0) {
         this.field2447.DrawPrimitive(method1496(1, arg1), arg2, arg0);
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "q",
      descriptor = "()V",
      line = 418
   )
   public final void method646() {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lir;B)V",
      line = 422
   )
   public final void method1466(class567 arg0, byte arg1) {
      if (arg1 < -91) {
         this.field2447.SetTexture(this.field4172, arg0.method215((byte)-25));
         if (this.field2442[this.field4172] == arg0.field8405) {
            if (!this.field2445[this.field4172] == arg0.field8404) {
               this.field2447.SetSamplerState(this.field4172, 7, !arg0.field8404 ? 0 : method1484(-102, arg0.field8405));
               this.field2445[this.field4172] = arg0.field8404;
            }
         } else {
            int var3 = method1484(-112, arg0.field8405);
            this.field2447.SetSamplerState(this.field4172, 6, var3);
            this.field2447.SetSamplerState(this.field4172, 5, var3);
            this.field2442[this.field4172] = arg0.field8405;
            if (!arg0.field8404 != !this.field2445[this.field4172]) {
               this.field2447.SetSamplerState(this.field4172, 7, arg0.field8404 ? method1484(-14, arg0.field8405) : 0);
               this.field2445[this.field4172] = arg0.field8404;
            }
         }

         if (!this.field2441[this.field4172]) {
            this.field2441[this.field4172] = true;
            this.method1467(9);
            this.method1457((byte)123);
         }

      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "o",
      descriptor = "(I)V",
      line = 465
   )
   public final void method1467(int arg0) {
      int var2 = this.field2441[this.field4172] ? method1487(-8743, this.field4185[this.field4172]) : 1;
      if (arg0 != 9) {
         this.method1458((byte)-99, 42);
      }

      this.field2447.SetTextureStageState(this.field4172, 4, var2);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "d",
      descriptor = "()V",
      line = 476
   )
   public final void method675() {
      this.field2424.method5228((byte)-8);
      super.method675();
   }

   @OriginalMember(
      owner = "client!eb",
      name = "bb",
      descriptor = "(I)V",
      line = 485
   )
   public final void method1468(int arg0) {
      if (arg0 != 0) {
         this.method1494(3, false, 75, (class308)null, false);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILeh;ILpc;B)Lbc;",
      line = 495
   )
   public final class282 method1469(int arg0, class19 arg1, int arg2, class650 arg3, byte arg4) {
      int var6 = -8 % ((arg4 - -41) / 39);
      return new class379(this, arg1, arg3, arg0, arg2);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "V",
      descriptor = "(I)V",
      line = 504
   )
   public final void method1470(int arg0) {
      if (this.field4123) {
         field2437[6] = 0.0F;
         field2437[7] = 0.0F;
         field2437[8] = 0.0F;
         field2437[14] = 0.0F;
         field2437[1] = 0.0F;
         field2437[2] = 0.0F;
         field2437[3] = 0.0F;
         field2437[0] = 1.0F;
         field2437[12] = 0.0F;
         field2437[13] = 0.0F;
         field2437[9] = 0.0F;
         field2437[4] = 0.0F;
         field2437[15] = 1.0F;
         field2437[5] = 1.0F;
         field2437[11] = 0.0F;
         field2437[10] = 1.0F;
      } else {
         this.field4121.method3906(field2437, (byte)-117);
      }

      this.field2447.SetTransform(256, field2437);
      if (arg0 != 0) {
         this.method1495((Canvas)null, 114, (Object)null);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "v",
      descriptor = "(B)V",
      line = 544
   )
   public final void method1471(byte arg0) {
      int var2;
      for(var2 = 0; var2 < this.field4232; ++var2) {
         class404 var3 = this.field4190[var2];
         int var4 = var2 - -2;
         int var5 = var3.method3251(arg0 + -87);
         float var6 = var3.method3252((byte)-106) / 255.0F;
         this.field2439.SetPosition((float)var3.method3246((byte)-127), (float)var3.method3253(arg0 + -87), (float)var3.method3247((byte)-126));
         this.field2439.SetDiffuse((float)((16765357 & var5) >> 16) * var6, (float)((65532 & var5) >> 8) * var6, (float)(255 & var5) * var6, 0.0F);
         this.field2439.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method3249((byte)14) * var3.method3249((byte)48)));
         this.field2439.SetRange((float)var3.method3249((byte)127));
         this.field2447.SetLight(var4, this.field2439);
         this.field2447.LightEnable(var4, true);
      }

      while(~this.field4198 < ~var2) {
         this.field2447.LightEnable(var2 - -2, false);
         ++var2;
      }

      super.method1471(arg0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "c",
      descriptor = "(ZI)Lgfa;",
      line = 580
   )
   public final class631 method1472(boolean arg0, int arg1) {
      int var3 = -50 % ((55 - arg1) / 34);
      return new class165(this, arg0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "([[IZIB)Lan;",
      line = 588
   )
   public final class496 method1473(int[][] arg0, boolean arg1, int arg2, byte arg3) {
      return arg3 <= 97 ? (class496)null : new class597(this, arg2, arg1, arg0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "B",
      descriptor = "()V",
      line = 598
   )
   public final void method680() {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Z)V",
      line = 601
   )
   public final void method632(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ZZ)V",
      line = 604
   )
   public final void method1474(boolean arg0, boolean arg1) {
      this.field2447.method562(161, arg0);
      if (!arg1) {
         this.field2434 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lsg;I)V",
      line = 615
   )
   public final void method1475(class742 arg0, int arg1) {
      if (arg1 != -27302) {
         this.field2438 = (D3DCAPS)null;
      }

      int var3 = 0;
      if (class47.field619 == arg0) {
         var3 = 65536;
      } else if (class442.field6799 != arg0) {
         if (class598.field8768 == arg0) {
            var3 = 196608;
         }
      } else {
         var3 = 131072;
      }

      this.field2447.SetTextureStageState(this.field4172, 11, this.field4172 | var3);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V",
      line = 639
   )
   public final void method1476(int arg0, Object arg1, Canvas arg2) {
      if (this.field4066 == arg2) {
         Dimension var4 = arg2.getSize();
         if (-1 > ~var4.width && -1 > ~var4.height) {
            this.field2447.EndScene();
            this.method1449(arg0 + -10);
            this.field2447.BeginScene();
         }
      }

      if (arg0 != 14) {
         field2437 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(I)V",
      line = 664
   )
   public final synchronized void method681(int arg0) {
      this.field2424.method5225((byte)-5);
      super.method681(arg0);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "F",
      descriptor = "(I)V",
      line = 672
   )
   public final void method1477(int arg0) {
      if (this.field2450 == null && this.field4220[this.field4172] != class256.field3869) {
         if (this.field4220[this.field4172] == class655.field9787) {
            this.field2447.SetTransform(this.field4172 + 16, this.field4144[this.field4172].method3901(2, field2437));
         } else {
            this.field2447.SetTransform(16 - -this.field4172, this.field4144[this.field4172].method3906(field2437, (byte)-102));
         }

         int var2 = method1511(this.field4220[this.field4172], 22370);
         if (~this.field2449[this.field4172] != ~var2) {
            this.field2447.SetTextureStageState(this.field4172, 24, var2);
            this.field2449[this.field4172] = var2;
         }
      } else {
         this.field2447.SetTextureStageState(this.field4172, 24, 0);
         this.field2449[this.field4172] = 0;
      }

      int var3 = 39 % ((arg0 - -66) / 59);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "S",
      descriptor = "(I)V",
      line = 702
   )
   public final void method1478(int arg0) {
      if (arg0 < 30) {
         this.field2440 = (class72)null;
      }

      this.field2447.SetRenderState(60, this.field4195);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "(Leh;Lpc;B)Z",
      line = 713
   )
   public final boolean method1479(class19 arg0, class650 arg1, byte arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg2 <= 87) {
         this.method1463(-101, (Canvas)null);
      }

      return class71.method550(this.field2436.method557(this.field2451, var4), (byte)-80) && class71.method550(this.field2436.CheckDeviceFormat(this.field2451, this.field2444, var4.Format, 0, 4, method1482(arg0, false, arg1)), (byte)-80);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "n",
      descriptor = "()Z",
      line = 724
   )
   public final boolean method668() {
      return false;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IBLjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;I)Z",
      line = 733
   )
   private static final boolean method1480(int arg0, byte arg1, D3DPRESENT_PARAMETERS arg2, int arg3, IDirect3D arg4, int arg5) {
      int var6 = 0;
      if (arg1 < 105) {
         return false;
      } else {
         int var7 = 0;
         int var8 = 0;

         try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class71.method549(arg4.method557(arg0, var9), 17)) {
               return false;
            } else {
               label89:
               while(-1 >= ~arg3) {
                  if (arg3 != 1) {
                     var8 = arg3 + 0;

                     for(int var10 = 0; var10 < field2429.length; ++var10) {
                        if (-1 == ~arg4.CheckDeviceType(arg0, arg5, var9.Format, field2429[var10], true) && -1 == ~arg4.CheckDeviceFormat(arg0, arg5, var9.Format, 1, 1, field2429[var10]) && (arg3 == 0 || ~arg4.CheckDeviceMultiSampleType(arg0, arg5, field2429[var10], true, var8) == -1)) {
                           for(int var11 = 0; ~var11 > ~field2435.length; ++var11) {
                              if (-1 == ~arg4.CheckDeviceFormat(arg0, arg5, var9.Format, 2, 1, field2435[var11]) && 0 == arg4.CheckDepthStencilMatch(arg0, arg5, var9.Format, field2429[var10], field2435[var11]) && (~arg3 == -1 || -1 == ~arg4.CheckDeviceMultiSampleType(arg0, arg5, field2435[var10], true, var8))) {
                                 var7 = field2429[var10];
                                 var6 = field2435[var11];
                                 break label89;
                              }
                           }
                        }
                     }
                  }

                  --arg3;
               }

               if (~arg3 <= -1 && ~var7 != -1 && var6 != 0) {
                  arg2.BackBufferFormat = var7;
                  arg2.AutoDepthStencilFormat = var6;
                  arg2.MultiSampleQuality = 0;
                  arg2.MultiSampleType = var8;
                  return true;
               } else {
                  return false;
               }
            }
         } catch (Throwable var13) {
            return false;
         }
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/jv;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lfm;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lrr;I)V",
      line = 956
   )
   private class163(int arg0, int arg1, Canvas arg2, class709 arg3, IDirect3D arg4, IDirect3DDevice arg5, class251 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class150 arg9, class678 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field2451 = arg0;
         this.field2444 = arg1;
         this.field2424 = arg3;
         this.field2438 = arg8;
         this.field2432 = arg7;
         this.field2436 = arg4;
         this.field2427 = arg6;
         this.field2447 = arg5;
         this.field2425 = new class72(this.field2424);
         this.field2440 = new class72(this.field2424);
         this.field2439 = new class72(this.field2424);
         this.field2428 = new PixelBuffer(this.field2424);
         this.field2443 = new GeometryBuffer(this.field2424);
         new GeometryBuffer(this.field2424);
         this.field2430 = (this.field2438.TextureCaps & 65536) != 0;
         this.field2433 = ~(16384 & this.field2438.TextureCaps) != -1;
         this.field4215 = (2048 & this.field2438.TextureCaps) != 0;
         this.field4173 = -1 <= ~this.field2438.MaxActiveLights ? 8 : this.field2438.MaxActiveLights;
         this.field4150 = this.field2438.MaxSimultaneousTextures;
         this.field2448 = (this.field2438.TextureCaps & 2) == 0;
         this.field4205 = ~(8192 & this.field2438.TextureCaps) != -1;
         this.field4227 = -1 > ~this.field4187 || ~this.field2436.CheckDeviceMultiSampleType(this.field2451, this.field2444, this.field2432.BackBufferFormat, true, 2) == -1;
         this.field2441 = new boolean[this.field4150];
         this.field2449 = new int[this.field4150];
         this.field2445 = new boolean[this.field4150];
         this.field2431 = new boolean[this.field4150];
         this.field2434 = new boolean[this.field4150];
         this.field2442 = new class427[this.field4150];
         this.field2447.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method4495(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "u",
      descriptor = "(I)V",
      line = 840
   )
   public final void method1481(int arg0) {
      if (arg0 != 3) {
         method1487(-12, (class588)null);
      }

      this.field2447.method562(15, this.field4214);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Leh;ZLpc;)I",
      line = 850
   )
   public static final int method1482(class19 arg0, boolean arg1, class650 arg2) {
      if (arg1) {
         field2429 = (int[])null;
      }

      if (class650.field9371 == arg2) {
         if (class392.field6155 == arg0) {
            return 22;
         }

         if (class364.field5628 == arg0) {
            return 21;
         }

         if (class342.field5203 == arg0) {
            return 28;
         }

         if (class168.field2565 == arg0) {
            return 50;
         }

         if (class681.field10155 == arg0) {
            return 51;
         }

         if (class40.field484 == arg0) {
            return 77;
         }
      }

      throw new IllegalArgumentException("");
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lvv;BIZ)V",
      line = 890
   )
   public final void method1483(class308 arg0, byte arg1, int arg2, boolean arg3) {
      int var5 = 0;
      byte var7;
      if (arg2 == 1) {
         var7 = 6;
      } else if (~arg2 == -3) {
         var7 = 27;
      } else {
         var7 = 5;
      }

      int var8 = 48 % ((arg1 - -58) / 48);
      if (arg3) {
         var5 |= 16;
      }

      this.field2447.SetTextureStageState(this.field4172, var7, var5 | method1499(true, arg0));
   }

   @OriginalMember(
      owner = "client!eb",
      name = "F",
      descriptor = "(II)V",
      line = 934
   )
   public final void method643(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILpi;)I",
      line = 939
   )
   private static final int method1484(int arg0, class427 arg1) {
      int var2 = -67 % ((28 - arg0) / 39);
      if (class168.field2573 != arg1) {
         if (class175.field2747 == arg1) {
            return 1;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "E",
      descriptor = "(I)V",
      line = 1006
   )
   public final void method1485(int arg0) {
      this.field2425.SetDirection(-this.field4203[0], -this.field4203[1], -this.field4203[2]);
      if (arg0 != -1) {
         this.method680();
      }

      this.field2440.SetDirection(-this.field4226[0], -this.field4226[1], -this.field4226[2]);
      this.field2426 = false;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "h",
      descriptor = "()V",
      line = 1019
   )
   public final void method621() {
      IDirect3DEventQuery var1 = this.field2447.method578();
      if (class71.method550(var1.Issue(), (byte)-80)) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (~var2 != -2) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method5223(-18900);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(I[BILeh;BI)Lje;",
      line = 1044
   )
   public final class196 method1486(int arg0, byte[] arg1, int arg2, class19 arg3, byte arg4, int arg5) {
      int var7 = -17 / ((arg4 - 13) / 43);
      return new class30(this, arg3, arg2, arg5, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILhf;)I",
      line = 1053
   )
   private static final int method1487(int arg0, class588 arg1) {
      if (class453.field6943 == arg1) {
         return 2;
      } else if (class716.field10733 == arg1) {
         return 4;
      } else if (class582.field8586 != arg1) {
         if (class154.field2302 == arg1) {
            return 7;
         } else if (class371.field5756 != arg1) {
            if (arg0 != -8743) {
               field2437 = (float[])null;
            }

            throw new IllegalArgumentException();
         } else {
            return 10;
         }
      } else {
         return 26;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "r",
      descriptor = "()V",
      line = 1082
   )
   public final void method618() {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "([IIIIIIZ)Lbc;",
      line = 1085
   )
   public final class282 method1488(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      return arg1 != 14943 ? (class282)null : new class379(this, arg4, arg2, arg6, arg0, arg3, arg5);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Lrr;Ljava/lang/Integer;)Lha;",
      line = 1096
   )
   public static final class610 createToolkit(Canvas arg0, class150 arg1, class678 arg2, Integer arg3) {
      class163 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class709 var7 = new class709();
         IDirect3D var8 = IDirect3D.method553(-2147483616, var7);
         D3DCAPS var9 = var8.method554(var5, var6);
         if ((16777216 & var9.RasterCaps) == 0) {
            throw new RuntimeException("");
         } else if (2 <= var9.MaxSimultaneousTextures) {
            if ((2 & var9.TextureOpCaps) == 0) {
               throw new RuntimeException("");
            } else if (~(8 & var9.TextureOpCaps) == -1) {
               throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 64) == 0) {
               throw new RuntimeException("");
            } else if (~(512 & var9.TextureOpCaps) != -1) {
               if ((33554432 & var9.TextureOpCaps) == 0) {
                  throw new RuntimeException("");
               } else if ((16 & var9.DestBlendCaps & var9.SrcBlendCaps) != 0) {
                  if (~(var9.DestBlendCaps & var9.SrcBlendCaps & 32) == -1) {
                     throw new RuntimeException("");
                  } else if (~(2 & var9.SrcBlendCaps & var9.DestBlendCaps) == -1) {
                     throw new RuntimeException("");
                  } else if (~var9.MaxActiveLights < -1 && var9.MaxActiveLights < 2) {
                     throw new RuntimeException("");
                  } else if (var9.MaxStreams < 5) {
                     throw new RuntimeException("");
                  } else {
                     D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                     if (method1480(var5, (byte)115, var10, arg3, var8, var6)) {
                        var10.EnableAutoDepthStencil = true;
                        var10.PresentationInterval = Integer.MIN_VALUE;
                        var10.Windowed = true;
                        int var11 = 2;
                        if (~(1048576 & var9.DevCaps) != -1) {
                           var11 |= 16;
                        }

                        Object var12 = null;

                        IDirect3DDevice var13;
                        try {
                           var13 = var8.method556(var5, var6, arg0, var11 | 64, var10);
                        } catch (class73 var17) {
                           var13 = var8.method556(var5, var6, arg0, 32 | var11, var10);
                        }

                        class251 var15 = new class251(var13.method569(0), var13.method574());
                        var4 = new class163(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                        var4.method2227(1);
                        return var4;
                     } else {
                        throw new RuntimeException("");
                     }
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
            var4.method675();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "()Lap;",
      line = 1195
   )
   public final class266 method653() {
      D3DADAPTER_IDENTIFIER var1 = this.field2436.method555(this.field2451, 0);
      return new class266(var1.VendorID, field2452, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V",
      line = 1203
   )
   public final void method1489(Canvas arg0, Object arg1, int arg2) {
      if (arg2 == 1) {
         this.field2427 = (class251)arg1;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "L",
      descriptor = "(I)V",
      line = 1213
   )
   public final void method1490(int arg0) {
      if (arg0 != 1) {
         this.field2425 = (class72)null;
      }

      this.field2447.method562(14, this.field4223 && this.field4239);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "db",
      descriptor = "(I)V",
      line = 1224
   )
   public final void method1491(int arg0) {
      this.field2447.SetTransform(3, this.field4154);
      if (arg0 != 3715) {
         this.field2448 = false;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "N",
      descriptor = "(I)V",
      line = 1239
   )
   public final void method1492(int arg0) {
      if (arg0 != 0) {
         this.method1452((class570[])null, (byte)11);
      }

      if (class182.field2819 == this.field4240) {
         this.field2447.SetRenderState(19, 5);
         this.field2447.SetRenderState(20, 6);
      } else if (class562.field8345 != this.field4240) {
         if (class664.field9944 == this.field4240) {
            this.field2447.SetRenderState(19, 9);
            this.field2447.SetRenderState(20, 2);
         }
      } else {
         this.field2447.SetRenderState(19, 2);
         this.field2447.SetRenderState(20, 2);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(BIIILqq;Ljl;I)V",
      line = 1269
   )
   public final void method1493(byte arg0, int arg1, int arg2, int arg3, class800 arg4, class133 arg5, int arg6) {
      this.field2447.SetIndices(((class403)arg4).field6294);
      if (arg0 > -72) {
         this.method1451((class379)null, (byte)-6);
      }

      this.field2447.DrawIndexedPrimitive(method1496(1, arg5), 0, arg2, arg6, arg3, arg1);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IZILvv;Z)V",
      line = 1301
   )
   public final void method1494(int arg0, boolean arg1, int arg2, class308 arg3, boolean arg4) {
      byte var7;
      if (~arg2 == -2) {
         var7 = 3;
      } else if (arg2 == 2) {
         var7 = 26;
      } else {
         var7 = 2;
      }

      int var8 = arg0;
      if (arg1) {
         var8 = arg0 | 32;
      }

      if (arg4) {
         var8 |= 16;
      }

      this.field2447.SetTextureStageState(this.field4172, var7, var8 | method1499(true, arg3));
   }

   @OriginalMember(
      owner = "client!eb",
      name = "I",
      descriptor = "()I",
      line = 1335
   )
   public final int method591() {
      return 0;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lsv;Lip;)Lcl;",
      line = 1342
   )
   public final class141 method609(class166 arg0, class726 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V",
      line = 1350
   )
   public final void method1495(Canvas arg0, int arg1, Object arg2) {
      if (arg1 != 0) {
         this.field2427 = (class251)null;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILjl;)I",
      line = 1359
   )
   private static final int method1496(int arg0, class133 arg1) {
      if (arg0 != 1) {
         method1480(-117, (byte)19, (D3DPRESENT_PARAMETERS)null, 96, (IDirect3D)null, 51);
      }

      if (class766.field11310 != arg1) {
         if (class751.field11146 == arg1) {
            return 3;
         } else if (class573.field8484 == arg1) {
            return 1;
         } else if (class331.field5019 == arg1) {
            return 4;
         } else if (class145.field2065 == arg1) {
            return 6;
         } else if (class535.field8111 == arg1) {
            return 5;
         } else {
            throw new IllegalArgumentException("");
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ILjagdx/IDirect3DPixelShader;)V",
      line = 1392
   )
   public final void method1497(int arg0, IDirect3DPixelShader arg1) {
      this.field2447.SetPixelShader(arg1);
      if (arg0 != 0) {
         this.field2427 = (class251)null;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "d",
      descriptor = "(IB)Llga;",
      line = 1404
   )
   public final class550 method1498(int arg0, byte arg1) {
      if (arg1 != 125) {
         return (class550)null;
      } else if (~arg0 != -4) {
         if (~arg0 != -5) {
            return arg0 != 8 ? super.method1498(arg0, (byte)125) : new class732(this, this.field3948, this.field4082);
         } else {
            return new class139(this, this.field3948, this.field4082);
         }
      } else {
         return new class10(this, this.field3948);
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(II)V",
      line = 1449
   )
   public final void method699(int arg0, int arg1) throws class623 {
      this.field2447.EndScene();
      if (!this.field2427.method2127(-94)) {
         if (~(++this.field2446) < -51) {
            throw new class623();
         }

         this.method1449(4);
      } else {
         this.field2446 = 0;
         if (class71.method549(this.field2427.method2126(123, 0), 56)) {
            this.method1449(4);
         }
      }

      this.field2447.BeginScene();
   }

   @OriginalMember(
      owner = "client!eb",
      name = "c",
      descriptor = "(II)Lip;",
      line = 1475
   )
   public final class726 method638(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(ZLvv;)I",
      line = 1482
   )
   private static final int method1499(boolean arg0, class308 arg1) {
      if (class751.field11122 == arg1) {
         return 2;
      } else if (class53.field655 == arg1) {
         return 0;
      } else if (class36.field435 != arg1) {
         if (class700.field10441 == arg1) {
            return 3;
         } else if (!arg0) {
            return 107;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "e",
      descriptor = "(Z)V",
      line = 1507
   )
   public final void method1500(boolean arg0) {
      this.field2447.SetViewport(this.field4178, this.field4201, this.field3960, this.field3975, 0.0F, 1.0F);
      if (!arg0) {
         this.field2428 = (PixelBuffer)null;
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "ab",
      descriptor = "(I)F",
      line = 1517
   )
   public final float method1501(int arg0) {
      if (arg0 < 5) {
         this.method668();
      }

      return -0.5F;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lvi;I)V",
      line = 1527
   )
   public final void method1502(class371 arg0, int arg1) {
      if (arg1 > 108) {
         dxVertexLayout var3 = (dxVertexLayout)arg0;
         this.field2447.SetVertexDeclaration(var3.field2889);
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Leh;III[BIZI)Lbc;",
      line = 1540
   )
   public final class282 method1503(class19 arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
      if (arg3 >= -53) {
         this.field2432 = (D3DPRESENT_PARAMETERS)null;
      }

      return new class379(this, arg0, arg7, arg1, arg6, arg4, arg2, arg5);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "b",
      descriptor = "(B)V",
      line = 1550
   )
   public final void method1504(byte arg0) {
      this.field2447.SetScissorRect(this.field4178 + this.field4165, this.field4241 + this.field4201, this.field4191, this.field4193);
      if (arg0 != -101) {
         this.method1452((class570[])null, (byte)61);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Leh;I[FIZIII)Lbc;",
      line = 1560
   )
   public final class282 method1505(class19 arg0, int arg1, float[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
      return arg7 != 3 ? (class282)null : null;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(IIII)V",
      line = 1571
   )
   public final void method686(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "i",
      descriptor = "(B)V",
      line = 1579
   )
   public final void method1506(byte arg0) {
      int var2 = 3 % ((arg0 - -44) / 46);
      this.field2447.method562(28, this.field4202 && this.field4157 && 0 <= this.field4169);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lgfa;IB)V",
      line = 1588
   )
   public final void method1507(class631 arg0, int arg1, byte arg2) {
      class165 var4 = (class165)arg0;
      this.field2447.SetStreamSource(arg1, var4.field2509, 0, var4.method1539(101));
      if (arg2 != 15) {
         this.method1504((byte)-55);
      }

   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 1599
   )
   public final void method593(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class623 {
      this.method699(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "d",
      descriptor = "(I)V",
      line = 1606
   )
   public final void method1508(int arg0) {
      if (arg0 > -90) {
         this.field2433 = false;
      }

      this.field2447.method562(174, this.field4265);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "W",
      descriptor = "(I)V",
      line = 1616
   )
   public final void method1509(int arg0) {
      if (arg0 != 255) {
         this.method668();
      }

      this.field2447.method562(27, this.field4179);
   }

   @OriginalMember(
      owner = "client!eb",
      name = "K",
      descriptor = "(I)V",
      line = 1627
   )
   public final void method1510(int arg0) {
      if (arg0 == 6650) {
         if (!this.field4188.method16((byte)86)) {
            field2437[7] = 0.0F;
            field2437[11] = 0.0F;
            field2437[9] = 0.0F;
            field2437[3] = 0.0F;
            field2437[6] = 0.0F;
            field2437[14] = 0.0F;
            field2437[0] = 1.0F;
            field2437[12] = 0.0F;
            field2437[4] = 0.0F;
            field2437[2] = 0.0F;
            field2437[5] = 1.0F;
            field2437[8] = 0.0F;
            field2437[10] = 1.0F;
            field2437[13] = 0.0F;
            field2437[1] = 0.0F;
            field2437[15] = 1.0F;
         } else {
            this.field4139.method3906(field2437, (byte)-125);
         }

         this.field2447.SetTransform(2, field2437);
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lcl;)V",
      line = 1663
   )
   public final void method693(class141 arg0) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(Lhr;I)I",
      line = 1666
   )
   private static final int method1511(class666 arg0, int arg1) {
      if (arg1 != 22370) {
         createToolkit((Canvas)null, (class150)null, (class678)null, (Integer)null);
      }

      if (class113.field1543 == arg0) {
         return 1;
      } else if (class655.field9787 != arg0) {
         if (class443.field6802 == arg0) {
            return 3;
         } else if (class369.field5739 == arg0) {
            return 4;
         } else {
            return class535.field8110 == arg0 ? 256 : 0;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!eb",
      name = "a",
      descriptor = "(FFF)V",
      line = 1694
   )
   public final void method651(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!eb",
      name = "j",
      descriptor = "()Z",
      line = 1697
   )
   public final boolean method617() {
      return false;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1512(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1513(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
