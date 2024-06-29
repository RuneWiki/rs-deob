import jaclib.peer.class704;
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
import jagdx.class512;
import jagdx.class513;
import jagdx.class514;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class332 extends class327 {
   @OriginalMember(
      owner = "client!vn",
      name = "Rg",
      descriptor = "I"
   )
   private int field4757 = 0;
   @OriginalMember(
      owner = "client!vn",
      name = "Ug",
      descriptor = "Z"
   )
   private boolean field4745 = false;
   @OriginalMember(
      owner = "client!vn",
      name = "Xg",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field4754;
   @OriginalMember(
      owner = "client!vn",
      name = "Gg",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field4766;
   @OriginalMember(
      owner = "client!vn",
      name = "Bg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field4768;
   @OriginalMember(
      owner = "client!vn",
      name = "Ig",
      descriptor = "Ljaclib/peer/go;"
   )
   public class704 field4749;
   @OriginalMember(
      owner = "client!vn",
      name = "ch",
      descriptor = "I"
   )
   private int field4744;
   @OriginalMember(
      owner = "client!vn",
      name = "ah",
      descriptor = "Lmfa;"
   )
   private class646 field4748;
   @OriginalMember(
      owner = "client!vn",
      name = "Ng",
      descriptor = "I"
   )
   private int field4767;
   @OriginalMember(
      owner = "client!vn",
      name = "Fg",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field4751;
   @OriginalMember(
      owner = "client!vn",
      name = "Lg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class514 field4761;
   @OriginalMember(
      owner = "client!vn",
      name = "bh",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class514 field4759;
   @OriginalMember(
      owner = "client!vn",
      name = "Vg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class514 field4753;
   @OriginalMember(
      owner = "client!vn",
      name = "Eg",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field4747;
   @OriginalMember(
      owner = "client!vn",
      name = "Yg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field4758;
   @OriginalMember(
      owner = "client!vn",
      name = "Qg",
      descriptor = "Z"
   )
   public boolean field4763;
   @OriginalMember(
      owner = "client!vn",
      name = "Pg",
      descriptor = "Z"
   )
   public boolean field4752;
   @OriginalMember(
      owner = "client!vn",
      name = "Zg",
      descriptor = "Z"
   )
   public boolean field4760;
   @OriginalMember(
      owner = "client!vn",
      name = "Og",
      descriptor = "[Z"
   )
   private boolean[] field4742;
   @OriginalMember(
      owner = "client!vn",
      name = "Cg",
      descriptor = "[I"
   )
   private int[] field4746;
   @OriginalMember(
      owner = "client!vn",
      name = "Mg",
      descriptor = "[Lrb;"
   )
   private class374[] field4743;
   @OriginalMember(
      owner = "client!vn",
      name = "Jg",
      descriptor = "[Z"
   )
   private boolean[] field4769;
   @OriginalMember(
      owner = "client!vn",
      name = "Sg",
      descriptor = "[Z"
   )
   private boolean[] field4750;
   @OriginalMember(
      owner = "client!vn",
      name = "Kg",
      descriptor = "[Z"
   )
   private boolean[] field4756;
   @OriginalMember(
      owner = "client!vn",
      name = "dh",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4770 = method2647(method2646("a\u0004\u0003]CQ^5"));
   @OriginalMember(
      owner = "client!vn",
      name = "Tg",
      descriptor = "[I"
   )
   private static int[] field4762 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!vn",
      name = "Hg",
      descriptor = "[I"
   )
   private static int[] field4764 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!vn",
      name = "Wg",
      descriptor = "[F"
   )
   private static float[] field4755 = new float[16];
   @OriginalMember(
      owner = "client!vn",
      name = "Dg",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4765;

   @OriginalMember(
      owner = "client!vn",
      name = "B",
      descriptor = "(I)V"
   )
   public final void method2551(int arg0) {
      this.field4606 = (float)(-this.field4613 + this.field4567);
      this.field4635 = (float)(-this.field4580) + this.field4606;
      if ((float)this.field4592 > this.field4635) {
         this.field4635 = (float)this.field4592;
      }

      this.field4766.method3727(36, this.field4635);
      this.field4766.method3727(37, this.field4606);
      if (arg0 != 0) {
         this.field4763 = false;
      }

      this.field4766.SetRenderState(34, this.field4628);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "y",
      descriptor = "(I)F"
   )
   public final float method2474(int arg0) {
      if (arg0 != 0) {
         field4764 = (int[])null;
      }

      return -0.5F;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "o",
      descriptor = "(B)V"
   )
   public final void method2518(byte arg0) {
      int var2 = 85 / ((arg0 - 17) / 39);
      this.field4766.SetRenderState(60, this.field4614);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILie;)V"
   )
   public final void method2633(int arg0, class6 arg1) {
      if (arg0 == 1) {
         this.method2642(false, arg1);
         if (arg1.field34 == !this.field4750[this.field4631]) {
            this.field4766.SetSamplerState(this.field4631, 1, !arg1.field34 ? 3 : 1);
            this.field4750[this.field4631] = arg1.field34;
         }

         if (this.field4769[this.field4631] == !arg1.field33) {
            this.field4766.SetSamplerState(this.field4631, 2, arg1.field33 ? 1 : 3);
            this.field4769[this.field4631] = arg1.field33;
         }

      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method2485(int arg0) {
      if (arg0 != 2) {
         this.method2577((byte)-79, (Object)null, (Canvas)null);
      }

      this.field4766.SetScissorRect(this.field4639 - -this.field4602, this.field4653 - -this.field4583, this.field4654, this.field4598);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "()V"
   )
   public final void method552() {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method570(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method2477(byte arg0) {
      if (arg0 != 97) {
         this.method544();
      }

      this.field4766.method3733(27, this.field4659);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(BLrb;)I"
   )
   private static final int method2634(byte arg0, class374 arg1) {
      if (class213.field2642 != arg1) {
         if (class715.field10464 == arg1) {
            return 1;
         } else {
            int var2 = 42 / ((-61 - arg0) / 59);
            throw new IllegalArgumentException();
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IIZ[IBII)Lgu;"
   )
   public final class610 method2487(int arg0, int arg1, boolean arg2, int[] arg3, byte arg4, int arg5, int arg6) {
      int var8 = -23 % ((arg4 - 66) / 56);
      return new class6(this, arg6, arg5, arg2, arg3, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ltga;ILiw;IZ)Lgu;"
   )
   public final class610 method2590(class63 arg0, int arg1, class335 arg2, int arg3, boolean arg4) {
      if (!arg4) {
         field4755 = (float[])null;
      }

      return new class6(this, arg0, arg2, arg3, arg1);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lmp;Ldw;)Lg;"
   )
   public final class165 method495(class796 arg0, class751 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "j",
      descriptor = "(Z)V"
   )
   public final void method2470(boolean arg0) {
      if (!this.field4627.method4723(32290)) {
         field4755[4] = 0.0F;
         field4755[14] = 0.0F;
         field4755[13] = 0.0F;
         field4755[10] = 1.0F;
         field4755[7] = 0.0F;
         field4755[3] = 0.0F;
         field4755[0] = 1.0F;
         field4755[12] = 0.0F;
         field4755[2] = 0.0F;
         field4755[5] = 1.0F;
         field4755[1] = 0.0F;
         field4755[8] = 0.0F;
         field4755[6] = 0.0F;
         field4755[15] = 1.0F;
         field4755[11] = 0.0F;
         field4755[9] = 0.0F;
      } else {
         this.field4563.method1900(-104, field4755);
      }

      this.field4766.SetTransform(2, field4755);
      if (!arg0) {
         this.method2602(103);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "p",
      descriptor = "()V"
   )
   public final void method560() {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([Lfu;I)Loj;"
   )
   public final class403 method2496(class414[] arg0, int arg1) {
      if (arg1 != -7406) {
         this.field4759 = (class514)null;
      }

      return new dxVertexLayout(this, arg0);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ltga;ILiw;)Z"
   )
   public final boolean method2594(class63 arg0, int arg1, class335 arg2) {
      if (arg1 != 15903) {
         this.method2642(true, (class598)null);
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return class512.method3718(this.field4754.method3717(this.field4744, var4), arg1 + 2005514616) && class512.method3718(this.field4754.CheckDeviceFormat(this.field4744, this.field4767, var4.Format, 0, 3, method2641(21, arg2, arg0)), 2005530519);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ltga;IZ[BIZII)Lgu;"
   )
   public final class610 method2523(class63 arg0, int arg1, boolean arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
      return !arg5 ? (class610)null : new class6(this, arg0, arg1, arg6, arg2, arg3, arg4, arg7);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method553(int arg0) {
      this.field4749.method5127((byte)-105);
      super.method553(arg0);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(BLjagdx/IDirect3DVertexShader;)V"
   )
   public final void method2635(byte arg0, IDirect3DVertexShader arg1) {
      if (arg0 != -102) {
         this.method531(57, -88);
      }

      this.field4765 = arg1;
      this.field4766.SetVertexShader(arg1);
      this.method2516((byte)-101);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2572(byte arg0, int arg1) {
      this.field4766.SetTextureStageState(this.field4631, 11, arg1);
      if (arg0 < 74) {
         this.field4752 = true;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method2516(byte arg0) {
      if (arg0 >= -80) {
         this.method2582((byte)56);
      }

      if (this.field4765 == null && this.field4648[this.field4631] != class636.field8982) {
         if (this.field4648[this.field4631] != class489.field6745) {
            this.field4766.SetTransform(this.field4631 + 16, this.field4633[this.field4631].method1900(-107, field4755));
         } else {
            this.field4766.SetTransform(this.field4631 + 16, this.field4633[this.field4631].method1907((byte)119, field4755));
         }

         int var2 = method2638((byte)94, this.field4648[this.field4631]);
         if (~this.field4746[this.field4631] != ~var2) {
            this.field4766.SetTextureStageState(this.field4631, 24, var2);
            this.field4746[this.field4631] = var2;
         }
      } else {
         this.field4766.SetTextureStageState(this.field4631, 24, 0);
         this.field4746[this.field4631] = 0;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "x",
      descriptor = "()V"
   )
   public final void method579() {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "r",
      descriptor = "()V"
   )
   public final void method544() {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "(I)V"
   )
   public final void method2502(int arg0) {
      for(int var2 = 0; this.field4643 > var2; ++var2) {
         this.field4766.SetSamplerState(var2, 7, 0);
         this.field4766.SetSamplerState(var2, 6, 2);
         this.field4766.SetSamplerState(var2, 5, 2);
         this.field4766.SetSamplerState(var2, 1, 1);
         this.field4766.SetSamplerState(var2, 2, 1);
         this.field4743[var2] = class213.field2642;
         this.field4750[var2] = this.field4769[var2] = true;
         this.field4742[var2] = false;
         this.field4746[var2] = 0;
      }

      this.field4766.SetTextureStageState(0, 6, 1);
      this.field4766.SetRenderState(9, 2);
      this.field4766.SetRenderState(23, 4);
      this.field4766.SetRenderState(25, 5);
      this.field4766.SetRenderState(24, 0);
      if (arg0 >= 62) {
         this.field4766.SetRenderState(22, 2);
         this.field4766.SetRenderState(147, 1);
         this.field4766.SetRenderState(145, 1);
         this.field4766.method3727(38, 0.95F);
         this.field4766.SetRenderState(140, 3);
         this.field4761.SetType(3);
         this.field4759.SetType(3);
         this.field4753.SetType(1);
         this.field4745 = false;
         super.method2502(93);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ljagdx/D3DPRESENT_PARAMETERS;IIILjagdx/IDirect3D;I)Z"
   )
   private static final boolean method2636(D3DPRESENT_PARAMETERS arg0, int arg1, int arg2, int arg3, IDirect3D arg4, int arg5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         if (arg2 != 1) {
            return false;
         } else {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class512.method3719(arg4.method3717(arg3, var9), -2005530586)) {
               return false;
            } else {
               label94:
               while(0 <= arg5) {
                  if (~arg5 != -2) {
                     var8 = arg5 + 0;

                     for(int var10 = 0; field4764.length > var10; ++var10) {
                        if (0 == arg4.CheckDeviceType(arg3, arg1, var9.Format, field4764[var10], true) && -1 == ~arg4.CheckDeviceFormat(arg3, arg1, var9.Format, 1, 1, field4764[var10]) && (~arg5 == -1 || arg4.CheckDeviceMultiSampleType(arg3, arg1, field4764[var10], true, var8) == 0)) {
                           for(int var11 = 0; field4762.length > var11; ++var11) {
                              if (arg4.CheckDeviceFormat(arg3, arg1, var9.Format, 2, 1, field4762[var11]) == 0 && arg4.CheckDepthStencilMatch(arg3, arg1, var9.Format, field4764[var10], field4762[var11]) == 0 && (~arg5 == -1 || ~arg4.CheckDeviceMultiSampleType(arg3, arg1, field4762[var10], true, var8) == -1)) {
                                 var6 = field4762[var11];
                                 var7 = field4764[var10];
                                 break label94;
                              }
                           }
                        }
                     }
                  }

                  --arg5;
               }

               if (arg5 >= 0 && ~var7 != -1 && ~var6 != -1) {
                  arg0.AutoDepthStencilFormat = var6;
                  arg0.MultiSampleQuality = 0;
                  arg0.BackBufferFormat = var7;
                  arg0.MultiSampleType = var8;
                  return true;
               } else {
                  return false;
               }
            }
         }
      } catch (Throwable var13) {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "I",
      descriptor = "()I"
   )
   public final int method494() {
      return 0;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method537(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(III[BLtga;B)Lfd;"
   )
   public final class557 method2490(int arg0, int arg1, int arg2, byte[] arg3, class63 arg4, byte arg5) {
      int var7 = -53 / ((arg5 - -55) / 52);
      return new class431(this, arg4, arg2, arg1, arg0, arg3);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Z[[III)Leea;"
   )
   public final class142 method2569(boolean arg0, int[][] arg1, int arg2, int arg3) {
      int var5 = 88 / ((50 - arg3) / 49);
      return new class54(this, arg2, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IILso;)V"
   )
   public final void method2580(int arg0, int arg1, class499 arg2) {
      class644 var4 = (class644)arg2;
      this.field4766.SetStreamSource(arg1, var4.field9041, 0, var4.method4646(false));
      if (arg0 != -8833) {
         this.field4765 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "i",
      descriptor = "(II)Lur;"
   )
   public final class567 method2501(int arg0, int arg1) {
      if (arg0 != 4) {
         return (class567)null;
      } else if (~arg1 != -4) {
         if (arg1 != 4) {
            return ~arg1 == -9 ? new class83(this, this.field4431, this.field4536) : super.method2501(4, arg1);
         } else {
            return new class1(this, this.field4431, this.field4536);
         }
      } else {
         return new class62(this, this.field4431);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method502(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "w",
      descriptor = "(I)V"
   )
   public final void method2491(int arg0) {
      if (arg0 != 0) {
         this.method2485(-9);
      }

      if (this.field4756[this.field4631]) {
         this.field4756[this.field4631] = false;
         this.field4766.SetTexture(this.field4631, (IDirect3DBaseTexture)null);
         this.method2513(false);
         this.method2571(5863);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "L",
      descriptor = "(I)V"
   )
   public final void method2602(int arg0) {
      this.field4761.SetDirection(-this.field4662[0], -this.field4662[1], -this.field4662[2]);
      if (arg0 == 3) {
         this.field4759.SetDirection(-this.field4656[0], -this.field4656[1], -this.field4656[2]);
         this.field4745 = false;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lwe;I)V"
   )
   public final void method2637(class431 arg0, int arg1) {
      this.method2642(false, arg0);
      if (!this.field4750[this.field4631]) {
         this.field4766.SetSamplerState(this.field4631, 1, 1);
         this.field4750[this.field4631] = true;
      }

      if (!this.field4769[this.field4631]) {
         this.field4766.SetSamplerState(this.field4631, 2, 1);
         this.field4769[this.field4631] = true;
      }

      if (arg1 > -55) {
         method2636((D3DPRESENT_PARAMETERS)null, 23, 31, 63, (IDirect3D)null, -18);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "l",
      descriptor = "(Z)V"
   )
   public final void method2514(boolean arg0) {
      if (!arg0) {
         this.method2481(10, -70, (class317)null, 3);
      }

      float var2 = this.field4649 ? this.field4644 : 0.0F;
      float var3 = !this.field4649 ? 0.0F : -this.field4586;
      this.field4761.SetDiffuse(this.field4584 * var2, this.field4622 * var2, this.field4568 * var2, 0.0F);
      this.field4759.SetDiffuse(this.field4584 * var3, this.field4622 * var3, this.field4568 * var3, 0.0F);
      this.field4745 = false;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method589(int arg0) {
      this.field4766.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public final Object method2597(int arg0, Canvas arg1) {
      if (arg0 != 2379) {
         this.field4767 = 35;
      }

      return null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "o",
      descriptor = "()Luv;"
   )
   public final class386 method499() {
      D3DADAPTER_IDENTIFIER var1 = this.field4754.method3715(this.field4744, 0);
      return new class386(var1.VendorID, field4770, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method489(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class265 {
      this.method542(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(BLnm;)I"
   )
   private static final int method2638(byte arg0, class502 arg1) {
      if (class552.field7592 != arg1) {
         if (class489.field6745 == arg1) {
            return 2;
         } else if (class517.field7092 != arg1) {
            if (class42.field493 != arg1) {
               if (class346.field4954 == arg1) {
                  return 256;
               } else {
                  if (arg0 < 0) {
                     field4755 = (float[])null;
                  }

                  return 0;
               }
            } else {
               return 4;
            }
         } else {
            return 3;
         }
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lol;IIZZ)V"
   )
   public final void method2517(class300 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      if (arg1 == -1) {
         int var6 = 0;
         byte var8;
         if (arg2 == 1) {
            var8 = 3;
         } else if (arg2 != 2) {
            var8 = 2;
         } else {
            var8 = 26;
         }

         if (arg3) {
            var6 |= 32;
         }

         if (arg4) {
            var6 |= 16;
         }

         this.field4766.SetTextureStageState(this.field4631, var8, var6 | method2643(arg0, arg1 ^ -4));
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "P",
      descriptor = "(I)V"
   )
   public final void method2561(int arg0) {
      this.field4766.method3733(137, this.field4623 && !this.field4624);
      if (arg0 != 2376) {
         this.field4753 = (class514)null;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V"
   )
   public final void method2509(Canvas arg0, int arg1, Object arg2) {
      if (arg1 != 1) {
         this.field4748 = (class646)null;
      }

      this.field4748 = (class646)arg2;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Liw;ILtga;)Z"
   )
   public final boolean method2493(class335 arg0, int arg1, class63 arg2) {
      if (arg1 > -38) {
         this.method2597(-16, (Canvas)null);
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return class512.method3718(this.field4754.method3717(this.field4744, var4), 2005530519) && class512.method3718(this.field4754.CheckDeviceFormat(this.field4744, this.field4767, var4.Format, 0, 4, method2641(21, arg0, arg2)), 2005530519);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/go;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lmfa;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lqh;I)V"
   )
   private class332(int arg0, int arg1, Canvas arg2, class704 arg3, IDirect3D arg4, IDirect3DDevice arg5, class646 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class160 arg9, class74 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field4754 = arg4;
         this.field4766 = arg5;
         this.field4768 = arg8;
         this.field4749 = arg3;
         this.field4744 = arg0;
         this.field4748 = arg6;
         this.field4767 = arg1;
         this.field4751 = arg7;
         this.field4761 = new class514(this.field4749);
         this.field4759 = new class514(this.field4749);
         this.field4753 = new class514(this.field4749);
         this.field4747 = new PixelBuffer(this.field4749);
         this.field4758 = new GeometryBuffer(this.field4749);
         new GeometryBuffer(this.field4749);
         this.field4593 = (this.field4768.TextureCaps & 2048) != 0;
         this.field4763 = (2 & this.field4768.TextureCaps) == 0;
         this.field4643 = this.field4768.MaxSimultaneousTextures;
         this.field4752 = (16384 & this.field4768.TextureCaps) != 0;
         this.field4760 = ~(this.field4768.TextureCaps & 65536) != -1;
         this.field4666 = ~(this.field4768.TextureCaps & 8192) != -1;
         this.field4641 = this.field4768.MaxActiveLights > 0 ? this.field4768.MaxActiveLights : 8;
         this.field4575 = this.field4620 > 0 || this.field4754.CheckDeviceMultiSampleType(this.field4744, this.field4767, this.field4751.BackBufferFormat, true, 2) == 0;
         this.field4742 = new boolean[this.field4643];
         this.field4746 = new int[this.field4643];
         this.field4743 = new class374[this.field4643];
         this.field4769 = new boolean[this.field4643];
         this.field4750 = new boolean[this.field4643];
         this.field4756 = new boolean[this.field4643];
         this.field4766.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method559(-10565);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IIZLtga;III[F)Lgu;"
   )
   public final class610 method2558(int arg0, int arg1, boolean arg2, class63 arg3, int arg4, int arg5, int arg6, float[] arg7) {
      if (arg6 != 19473) {
         this.field4768 = (D3DCAPS)null;
      }

      return null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "h",
      descriptor = "()V"
   )
   public final void method563() {
      this.field4749.method5125(14969);
      super.method563();
   }

   @OriginalMember(
      owner = "client!vn",
      name = "D",
      descriptor = "(B)V"
   )
   public final void method2480(byte arg0) {
      if (arg0 != 26) {
         this.field4743 = (class374[])null;
      }

      if (class359.field5109 == this.field4652) {
         this.field4766.SetRenderState(19, 5);
         this.field4766.SetRenderState(20, 6);
      } else if (class33.field385 != this.field4652) {
         if (class775.field11270 == this.field4652) {
            this.field4766.SetRenderState(19, 9);
            this.field4766.SetRenderState(20, 2);
         }
      } else {
         this.field4766.SetRenderState(19, 2);
         this.field4766.SetRenderState(20, 2);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "ya",
      descriptor = "()V"
   )
   public final void method608() {
      this.method2488(4, true);
      this.field4766.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "x",
      descriptor = "(I)V"
   )
   public final void method2571(int arg0) {
      int var2 = !this.field4756[this.field4631] ? 1 : method2640(arg0 ^ 5861, this.field4661[this.field4631]);
      if (arg0 != 5863) {
         this.method2551(-126);
      }

      this.field4766.SetTextureStageState(this.field4631, 1, var2);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Luk;B)V"
   )
   public final void method2583(class273 arg0, byte arg1) {
      int var3 = 117 / ((-48 - arg1) / 57);
      int var4 = 0;
      if (class219.field2733 == arg0) {
         var4 = 65536;
      } else if (class426.field5960 != arg0) {
         if (class585.field8030 == arg0) {
            var4 = 196608;
         }
      } else {
         var4 = 131072;
      }

      this.field4766.SetTextureStageState(this.field4631, 11, this.field4631 | var4);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lg;)V"
   )
   public final void method550(class165 arg0) {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(BZ)Lso;"
   )
   public final class499 method2584(byte arg0, boolean arg1) {
      return arg0 > -76 ? (class499)null : new class644(this, arg1);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "F",
      descriptor = "(I)V"
   )
   public final void method2482(int arg0) {
      this.field4766.SetTransform(3, this.field4664);
      int var2 = 49 % ((8 - arg0) / 44);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "()Z"
   )
   public final boolean method583() {
      return false;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(ZB)V"
   )
   public final void method2598(boolean arg0, byte arg1) {
      this.field4766.method3733(161, arg0);
      if (arg1 > -8) {
         this.field4767 = 75;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public final void method2577(byte arg0, Object arg1, Canvas arg2) {
      if (arg0 != 6) {
         this.method2637((class431)null, 117);
      }

      if (this.field4506 == arg2) {
         Dimension var4 = arg2.getSize();
         if (~var4.width < -1 && 0 < var4.height) {
            this.field4766.EndScene();
            this.method2639(arg0 ^ 123);
            this.field4766.BeginScene();
         }
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "T",
      descriptor = "(I)Z"
   )
   private final boolean method2639(int arg0) {
      int var2 = this.field4766.TestCooperativeLevel();
      if (arg0 < 114) {
         this.method2637((class431)null, -65);
      }

      if (var2 == 0 || ~var2 == 2005530518) {
         class646 var3 = (class646)this.field4508;
         this.method2600((byte)-116);
         var3.method4655(0);
         this.field4751.BackBufferWidth = 0;
         this.field4751.BackBufferHeight = 0;
         if (method2636(this.field4751, this.field4767, 1, this.field4744, this.field4754, this.field4620)) {
            int var4 = this.field4766.Reset(this.field4751);
            if (class512.method3718(var4, 2005530519)) {
               var3.method4654(this.field4766.method3720(), this.field4766.method3729(0), (byte)-98);
               this.method2498(0);
               this.method2502(99);
               return true;
            }
         }
      }

      return false;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILou;)I"
   )
   private static final int method2640(int arg0, class635 arg1) {
      if (class535.field7314 != arg1) {
         if (class449.field6203 != arg1) {
            if (class581.field7982 == arg1) {
               return 26;
            } else if (class59.field623 == arg1) {
               return 7;
            } else if (class767.field11065 != arg1) {
               if (arg0 != 2) {
                  method2638((byte)-85, (class502)null);
               }

               throw new IllegalArgumentException();
            } else {
               return 10;
            }
         } else {
            return 4;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "r",
      descriptor = "(B)V"
   )
   public final void method2550(byte arg0) {
      if (!this.field4745) {
         this.field4766.LightEnable(0, false);
         this.field4766.LightEnable(1, false);
         this.field4766.SetLight(0, this.field4761);
         this.field4766.SetLight(1, this.field4759);
         this.field4766.LightEnable(0, true);
         this.field4766.LightEnable(1, true);
         this.field4745 = true;
      }

      if (arg0 < 46) {
         this.method2572((byte)-66, -31);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILoj;)V"
   )
   public final void method2529(int arg0, class403 arg1) {
      dxVertexLayout var3 = (dxVertexLayout)arg1;
      int var4 = 9 / ((-37 - arg0) / 46);
      this.field4766.SetVertexDeclaration(var3.field4905);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "k",
      descriptor = "(B)V"
   )
   public final void method2596(byte arg0) {
      if (this.field4551) {
         field4755[7] = 0.0F;
         field4755[5] = 1.0F;
         field4755[14] = 0.0F;
         field4755[12] = 0.0F;
         field4755[6] = 0.0F;
         field4755[3] = 0.0F;
         field4755[11] = 0.0F;
         field4755[1] = 0.0F;
         field4755[4] = 0.0F;
         field4755[10] = 1.0F;
         field4755[0] = 1.0F;
         field4755[9] = 0.0F;
         field4755[2] = 0.0F;
         field4755[15] = 1.0F;
         field4755[13] = 0.0F;
         field4755[8] = 0.0F;
      } else {
         this.field4559.method1900(arg0 + -28, field4755);
      }

      this.field4766.SetTransform(256, field4755);
      if (arg0 != -84) {
         method2636((D3DPRESENT_PARAMETERS)null, -44, 39, 107, (IDirect3D)null, -5);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILiw;Ltga;)I"
   )
   public static final int method2641(int arg0, class335 arg1, class63 arg2) {
      if (class335.field4803 == arg1) {
         if (class657.field9377 == arg2) {
            return 22;
         }

         if (class622.field8682 == arg2) {
            return 21;
         }

         if (class128.field1618 == arg2) {
            return 28;
         }

         if (class548.field7492 == arg2) {
            return 50;
         }

         if (class630.field8824 == arg2) {
            return 51;
         }

         if (class567.field7729 == arg2) {
            return 77;
         }
      }

      if (arg0 != 21) {
         method2641(125, (class335)null, (class63)null);
      }

      throw new IllegalArgumentException("");
   }

   @OriginalMember(
      owner = "client!vn",
      name = "v",
      descriptor = "(I)V"
   )
   public final void method2499(int arg0) {
      if (arg0 == -29914) {
         this.field4766.method3733(174, this.field4690);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "s",
      descriptor = "(B)V"
   )
   public final void method2582(byte arg0) {
      if (arg0 > 53) {
         this.field4766.method3733(28, this.field4582 && this.field4608 && -1 >= ~this.field4580);
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "q",
      descriptor = "(I)V"
   )
   public final void method2578(int arg0) {
      int var2;
      for(var2 = 0; ~this.field4640 < ~var2; ++var2) {
         class127 var3 = this.field4609[var2];
         int var4 = var2 - -2;
         int var5 = var3.method1064(127);
         float var6 = var3.method1070(-1) / 255.0F;
         this.field4753.SetPosition((float)var3.method1063(-1), (float)var3.method1065((byte)-70), (float)var3.method1067(-1));
         this.field4753.SetDiffuse((float)((var5 & 16721886) >> 16) * var6, (float)((65329 & var5) >> 8) * var6, (float)(var5 & 255) * var6, 0.0F);
         this.field4753.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method1066(-1) * var3.method1066(-1)));
         this.field4753.SetRange((float)var3.method1066(-1));
         this.field4766.SetLight(var4, this.field4753);
         this.field4766.LightEnable(var4, true);
      }

      while(var2 < this.field4566) {
         this.field4766.LightEnable(var2 + 2, false);
         ++var2;
      }

      if (arg0 > -14) {
         this.field4753 = (class514)null;
      }

      super.method2578(-39);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ZLcv;)V"
   )
   public final void method2642(boolean arg0, class598 arg1) {
      this.field4766.SetTexture(this.field4631, arg1.method43((byte)98));
      if (arg0) {
         this.method2511((byte)5);
      }

      if (this.field4743[this.field4631] != arg1.field8324) {
         int var3 = method2634((byte)-125, arg1.field8324);
         this.field4766.SetSamplerState(this.field4631, 6, var3);
         this.field4766.SetSamplerState(this.field4631, 5, var3);
         this.field4743[this.field4631] = arg1.field8324;
         if (!arg1.field8327 == this.field4742[this.field4631]) {
            this.field4766.SetSamplerState(this.field4631, 7, !arg1.field8327 ? 0 : method2634((byte)42, arg1.field8324));
            this.field4742[this.field4631] = arg1.field8327;
         }
      } else if (!arg1.field8327 != !this.field4742[this.field4631]) {
         this.field4766.SetSamplerState(this.field4631, 7, arg1.field8327 ? method2634((byte)119, arg1.field8324) : 0);
         this.field4742[this.field4631] = arg1.field8327;
      }

      if (!this.field4756[this.field4631]) {
         this.field4756[this.field4631] = true;
         this.method2513(false);
         this.method2571(5863);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "u",
      descriptor = "(I)V"
   )
   public final void method2603(int arg0) {
      if (arg0 != -32230) {
         this.field4750 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method554(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(II)Ldw;"
   )
   public final class751 method531(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Lqh;Ljava/lang/Integer;)Lha;"
   )
   public static final class65 createToolkit(Canvas arg0, class160 arg1, class74 arg2, Integer arg3) {
      class332 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class704 var7 = new class704();
         IDirect3D var8 = IDirect3D.method3713(-2147483616, var7);
         D3DCAPS var9 = var8.method3714(var5, var6);
         if (~(var9.RasterCaps & 16777216) != -1) {
            if (2 > var9.MaxSimultaneousTextures) {
               throw new RuntimeException("");
            } else if ((var9.TextureOpCaps & 2) == 0) {
               throw new RuntimeException("");
            } else if (~(var9.TextureOpCaps & 8) == -1) {
               throw new RuntimeException("");
            } else if ((64 & var9.TextureOpCaps) != 0) {
               if (~(512 & var9.TextureOpCaps) != -1) {
                  if ((33554432 & var9.TextureOpCaps) != 0) {
                     if ((var9.DestBlendCaps & var9.SrcBlendCaps & 16) != 0) {
                        if (~(var9.DestBlendCaps & var9.SrcBlendCaps & 32) == -1) {
                           throw new RuntimeException("");
                        } else if (~(var9.SrcBlendCaps & var9.DestBlendCaps & 2) == -1) {
                           throw new RuntimeException("");
                        } else if (~var9.MaxActiveLights < -1 && ~var9.MaxActiveLights > -3) {
                           throw new RuntimeException("");
                        } else if (-6 >= ~var9.MaxStreams) {
                           D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                           if (!method2636(var10, var6, 1, var5, var8, arg3)) {
                              throw new RuntimeException("");
                           } else {
                              var10.PresentationInterval = Integer.MIN_VALUE;
                              var10.EnableAutoDepthStencil = true;
                              var10.Windowed = true;
                              int var11 = 2;
                              if ((var9.DevCaps & 1048576) != 0) {
                                 var11 |= 16;
                              }

                              Object var12 = null;

                              IDirect3DDevice var13;
                              try {
                                 var13 = var8.method3716(var5, var6, arg0, 64 | var11, var10);
                              } catch (class513 var17) {
                                 var13 = var8.method3716(var5, var6, arg0, 32 | var11, var10);
                              }

                              class646 var15 = new class646(var13.method3729(0), var13.method3720());
                              var4 = new class332(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                              var4.method2495(-37);
                              return var4;
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
            var4.method563();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "J",
      descriptor = "(I)V"
   )
   public final void method2554(int arg0) {
      this.field4766.method3733(15, this.field4637);
      if (arg0 != 0) {
         this.method531(-17, 19);
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lol;IBZ)V"
   )
   public final void method2520(class300 arg0, int arg1, byte arg2, boolean arg3) {
      if (arg2 != 103) {
         this.method2501(-59, -74);
      }

      int var5 = 0;
      byte var7;
      if (~arg1 == -2) {
         var7 = 6;
      } else if (~arg1 == -3) {
         var7 = 27;
      } else {
         var7 = 5;
      }

      if (arg3) {
         var5 |= 16;
      }

      this.field4766.SetTextureStageState(this.field4631, var7, var5 | method2643(arg0, arg2 ^ 100));
   }

   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "(Z)V"
   )
   public final void method2513(boolean arg0) {
      if (arg0) {
         this.field4756 = (boolean[])null;
      }

      int var2 = this.field4756[this.field4631] ? method2640(2, this.field4573[this.field4631]) : 1;
      this.field4766.SetTextureStageState(this.field4631, 4, var2);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(II)Lmp;"
   )
   public final class796 method590(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V"
   )
   public final void method2548(Object arg0, byte arg1, Canvas arg2) {
      if (arg1 <= 93) {
         this.field4750 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Ltba;Ltba;FLtba;)Ltba;"
   )
   public final class172 method597(class172 arg0, class172 arg1, float arg2, class172 arg3) {
      return !(0.5F > arg2) ? arg1 : arg0;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method551() {
      return false;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lol;I)I"
   )
   private static final int method2643(class300 arg0, int arg1) {
      if (arg1 != 3) {
         method2643((class300)null, 81);
      }

      if (class550.field7513 == arg0) {
         return 2;
      } else if (class544.field7429 == arg0) {
         return 0;
      } else if (class529.field7261 == arg0) {
         return 1;
      } else if (class206.field2525 == arg0) {
         return 3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IIIIILw;Loia;)V"
   )
   public final void method2483(int arg0, int arg1, int arg2, int arg3, int arg4, class317 arg5, class96 arg6) {
      if (arg4 < 61) {
         this.method2580(72, -50, (class499)null);
      }

      this.field4766.SetIndices(((class376)arg6).field5280);
      this.field4766.DrawIndexedPrimitive(method2644(arg5, 1), 0, arg3, arg0, arg2, arg1);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method539(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field4766.method3735(0);
      IDirect3DSurface var7 = this.field4766.method3737(arg2, arg3, 21, 0, 0, true);
      if (class512.method3718(this.field4766.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), 2005530519) && class512.method3718(var7.LockRect(0, 0, arg2, arg3, 16, this.field4747), 2005530519)) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field4747.getRowPitch();
         if (arg2 * 4 != var8) {
            for(int var9 = 0; ~arg3 < ~var9; ++var9) {
               this.field4747.method3741(var5, arg2 * var9, var8 * var9, arg2);
            }
         } else {
            this.field4747.method3741(var5, 0, 0, arg2 * arg3);
         }

         var7.UnlockRect();
      }

      var6.method5123(-1928);
      var7.method5123(-1928);
      return var5;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "()V"
   )
   public final void method592() {
      IDirect3DEventQuery var1 = this.field4766.method3722();
      if (class512.method3718(var1.Issue(), 2005530519)) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (~var2 != -2) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method5123(-1928);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lw;I)I"
   )
   private static final int method2644(class317 arg0, int arg1) {
      if (class505.field6920 == arg0) {
         return 2;
      } else if (class504.field6901 != arg0) {
         if (class25.field322 == arg0) {
            return 1;
         } else if (class631.field8832 == arg0) {
            return 4;
         } else if (class504.field6912 == arg0) {
            return 6;
         } else if (class606.field8483 == arg0) {
            return 5;
         } else {
            if (arg1 != 1) {
               method2641(76, (class335)null, (class63)null);
            }

            throw new IllegalArgumentException("");
         }
      } else {
         return 3;
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "A",
      descriptor = "(B)V"
   )
   public final void method2604(byte arg0) {
      if (arg0 <= 70) {
         this.method2483(39, 61, -13, 59, 110, (class317)null, (class96)null);
      }

      this.method2514(true);
      this.method2550((byte)89);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "e",
      descriptor = "(II)V"
   )
   public final void method542(int arg0, int arg1) throws class265 {
      this.field4766.EndScene();
      if (!this.field4748.method4656((byte)-48)) {
         if (~(++this.field4757) < -51) {
            throw new class265();
         }

         this.method2639(117);
      } else {
         this.field4757 = 0;
         if (class512.method3719(this.field4748.method4657((byte)69, 0), -2005530586)) {
            this.method2639(124);
         }
      }

      this.field4766.BeginScene();
   }

   @OriginalMember(
      owner = "client!vn",
      name = "d",
      descriptor = "(IZ)Loia;"
   )
   public final class96 method2559(int arg0, boolean arg1) {
      if (arg0 != -31494) {
         this.field4761 = (class514)null;
      }

      return new class376(this, class335.field4804, arg1);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILjagdx/IDirect3DPixelShader;)V"
   )
   public final void method2645(int arg0, IDirect3DPixelShader arg1) {
      this.field4766.SetPixelShader(arg1);
      if (arg0 >= -3) {
         this.field4756 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "I",
      descriptor = "(I)V"
   )
   public final void method2570(int arg0) {
      this.field4766.method3733(arg0, this.field4581 && this.field4570);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method2562(int arg0) {
      this.field4766.SetViewport(this.field4639, this.field4653, this.field4432, this.field4454, (float)arg0, 1.0F);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "m",
      descriptor = "(Z)V"
   )
   public final void method2585(boolean arg0) {
      this.field4761.SetAmbient(this.field4584 * this.field4571, this.field4622 * this.field4571, this.field4571 * this.field4568, 0.0F);
      if (!arg0) {
         this.field4769 = (boolean[])null;
      }

      this.field4745 = false;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "i",
      descriptor = "(B)V"
   )
   public final void method2511(byte arg0) {
      if (arg0 != -109) {
         this.method560();
      }

      this.field4766.method3733(7, this.field4658);
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(IILw;I)V"
   )
   public final void method2481(int arg0, int arg1, class317 arg2, int arg3) {
      this.field4766.DrawPrimitive(method2644(arg2, 1), arg1, arg0);
      if (arg3 != 0) {
         this.field4759 = (class514)null;
      }

   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2646(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2647(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
