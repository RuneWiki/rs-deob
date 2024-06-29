import jaclib.peer.class700;
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
import jagdx.class506;
import jagdx.class507;
import jagdx.class508;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class287 extends class357 {
   @OriginalMember(
      owner = "client!vea",
      name = "Rg",
      descriptor = "Z"
   )
   private boolean field4028 = false;
   @OriginalMember(
      owner = "client!vea",
      name = "ch",
      descriptor = "I"
   )
   private int field4026 = 0;
   @OriginalMember(
      owner = "client!vea",
      name = "Pg",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field4032;
   @OriginalMember(
      owner = "client!vea",
      name = "gh",
      descriptor = "Ljaclib/peer/du;"
   )
   public class700 field4009;
   @OriginalMember(
      owner = "client!vea",
      name = "Xg",
      descriptor = "Lqw;"
   )
   private class83 field4012;
   @OriginalMember(
      owner = "client!vea",
      name = "Yg",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field4018;
   @OriginalMember(
      owner = "client!vea",
      name = "Gg",
      descriptor = "I"
   )
   private int field4022;
   @OriginalMember(
      owner = "client!vea",
      name = "Zg",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field4011;
   @OriginalMember(
      owner = "client!vea",
      name = "fh",
      descriptor = "I"
   )
   private int field4024;
   @OriginalMember(
      owner = "client!vea",
      name = "Wg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field4014;
   @OriginalMember(
      owner = "client!vea",
      name = "Lg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class508 field4029;
   @OriginalMember(
      owner = "client!vea",
      name = "Tg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class508 field4010;
   @OriginalMember(
      owner = "client!vea",
      name = "Kg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class508 field4020;
   @OriginalMember(
      owner = "client!vea",
      name = "eh",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field4017;
   @OriginalMember(
      owner = "client!vea",
      name = "Jg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field4013;
   @OriginalMember(
      owner = "client!vea",
      name = "Sg",
      descriptor = "Z"
   )
   public boolean field4036;
   @OriginalMember(
      owner = "client!vea",
      name = "Ig",
      descriptor = "Z"
   )
   public boolean field4033;
   @OriginalMember(
      owner = "client!vea",
      name = "Ug",
      descriptor = "Z"
   )
   public boolean field4015;
   @OriginalMember(
      owner = "client!vea",
      name = "dh",
      descriptor = "[Z"
   )
   private boolean[] field4025;
   @OriginalMember(
      owner = "client!vea",
      name = "hh",
      descriptor = "[I"
   )
   private int[] field4021;
   @OriginalMember(
      owner = "client!vea",
      name = "bh",
      descriptor = "[Z"
   )
   private boolean[] field4023;
   @OriginalMember(
      owner = "client!vea",
      name = "ah",
      descriptor = "[Z"
   )
   private boolean[] field4034;
   @OriginalMember(
      owner = "client!vea",
      name = "Ng",
      descriptor = "[Lega;"
   )
   private class738[] field4016;
   @OriginalMember(
      owner = "client!vea",
      name = "Qg",
      descriptor = "[Z"
   )
   private boolean[] field4031;
   @OriginalMember(
      owner = "client!vea",
      name = "ih",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4037 = method2242(method2241("~\u0005\f0{N_:"));
   @OriginalMember(
      owner = "client!vea",
      name = "Og",
      descriptor = "[I"
   )
   private static int[] field4019 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!vea",
      name = "Hg",
      descriptor = "[F"
   )
   private static float[] field4027 = new float[16];
   @OriginalMember(
      owner = "client!vea",
      name = "Vg",
      descriptor = "[I"
   )
   private static int[] field4035 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!vea",
      name = "Mg",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4030;

   @OriginalMember(
      owner = "client!vea",
      name = "q",
      descriptor = "()V"
   )
   public final void method438() {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "c",
      descriptor = "()V"
   )
   public final void method379() {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "l",
      descriptor = "(Z)V"
   )
   public final void method1199(boolean arg0) {
      this.method1165(-104);
      if (!arg0) {
         this.method1195((byte)-127);
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILega;)I"
   )
   private static final int method2228(int arg0, class738 arg1) {
      if (arg0 >= -58) {
         method2232((class443)null, -77);
      }

      if (class185.field2801 == arg1) {
         return 2;
      } else if (class308.field4438 != arg1) {
         throw new IllegalArgumentException();
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILrfa;Ltv;)I"
   )
   public static final int method2229(int arg0, class209 arg1, class584 arg2) {
      if (class209.field3106 == arg1) {
         if (class431.field6246 == arg2) {
            return 22;
         }

         if (class296.field4146 == arg2) {
            return 21;
         }

         if (class776.field11354 == arg2) {
            return 28;
         }

         if (class153.field2444 == arg2) {
            return 50;
         }

         if (class434.field6278 == arg2) {
            return 51;
         }

         if (class669.field9743 == arg2) {
            return 77;
         }
      }

      if (arg0 != 631) {
         method2229(-22, (class209)null, (class584)null);
      }

      throw new IllegalArgumentException("");
   }

   @OriginalMember(
      owner = "client!vea",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/du;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lqw;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lhw;I)V"
   )
   private class287(int arg0, int arg1, Canvas arg2, class700 arg3, IDirect3D arg4, IDirect3DDevice arg5, class83 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class160 arg9, class141 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field4032 = arg7;
         this.field4009 = arg3;
         this.field4012 = arg6;
         this.field4018 = arg5;
         this.field4022 = arg1;
         this.field4011 = arg4;
         this.field4024 = arg0;
         this.field4014 = arg8;
         this.field4029 = new class508(this.field4009);
         this.field4010 = new class508(this.field4009);
         this.field4020 = new class508(this.field4009);
         this.field4017 = new PixelBuffer(this.field4009);
         this.field4013 = new GeometryBuffer(this.field4009);
         new GeometryBuffer(this.field4009);
         this.field5242 = (this.field4014.TextureCaps & 8192) != 0;
         this.field5293 = (this.field4014.TextureCaps & 2048) != 0;
         this.field4036 = ~(this.field4014.TextureCaps & 2) == -1;
         this.field5312 = 0 >= this.field4014.MaxActiveLights ? 8 : this.field4014.MaxActiveLights;
         this.field5318 = this.field4014.MaxSimultaneousTextures;
         this.field4033 = ~(65536 & this.field4014.TextureCaps) != -1;
         this.field4015 = (16384 & this.field4014.TextureCaps) != 0;
         this.field5248 = -1 > ~this.field5268 || ~this.field4011.CheckDeviceMultiSampleType(this.field4024, this.field4022, this.field4032.BackBufferFormat, true, 2) == -1;
         this.field4025 = new boolean[this.field5318];
         this.field4021 = new int[this.field5318];
         this.field4023 = new boolean[this.field5318];
         this.field4034 = new boolean[this.field5318];
         this.field4016 = new class738[this.field5318];
         this.field4031 = new boolean[this.field5318];
         this.field4018.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method697(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "ya",
      descriptor = "()V"
   )
   public final void method380() {
      this.method2731((byte)108, true);
      this.field4018.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILej;)I"
   )
   private static final int method2230(int arg0, class133 arg1) {
      if (class331.field4734 != arg1) {
         if (class21.field339 != arg1) {
            if (class178.field2744 == arg1) {
               return 1;
            } else if (class421.field6132 != arg1) {
               if (class368.field5464 != arg1) {
                  if (class244.field3508 != arg1) {
                     int var2 = -56 / ((37 - arg0) / 44);
                     throw new IllegalArgumentException("");
                  } else {
                     return 5;
                  }
               } else {
                  return 6;
               }
            } else {
               return 4;
            }
         } else {
            return 3;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "K",
      descriptor = "(I)V"
   )
   public final void method1172(int arg0) {
      if (arg0 != 13) {
         this.field4013 = (GeometryBuffer)null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method427(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(BLuj;)V"
   )
   public final void method1166(byte arg0, class401 arg1) {
      if (arg0 == 121) {
         dxVertexLayout var3 = (dxVertexLayout)arg1;
         this.field4018.SetVertexDeclaration(var3.field4837);
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method410() {
      return false;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(BILjagdx/D3DPRESENT_PARAMETERS;ILjagdx/IDirect3D;I)Z"
   )
   private static final boolean method2231(byte arg0, int arg1, D3DPRESENT_PARAMETERS arg2, int arg3, IDirect3D arg4, int arg5) {
      if (arg0 != 101) {
         field4035 = (int[])null;
      }

      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
         if (class507.method3796(0, arg4.method3800(arg3, var9))) {
            return false;
         } else {
            label92:
            while(~arg1 <= -1) {
               if (~arg1 != -2) {
                  var8 = arg1 + 0;

                  for(int var10 = 0; var10 < field4019.length; ++var10) {
                     if (~arg4.CheckDeviceType(arg3, arg5, var9.Format, field4019[var10], true) == -1 && ~arg4.CheckDeviceFormat(arg3, arg5, var9.Format, 1, 1, field4019[var10]) == -1 && (arg1 == 0 || arg4.CheckDeviceMultiSampleType(arg3, arg5, field4019[var10], true, var8) == 0)) {
                        for(int var11 = 0; var11 < field4035.length; ++var11) {
                           if (~arg4.CheckDeviceFormat(arg3, arg5, var9.Format, 2, 1, field4035[var11]) == -1 && 0 == arg4.CheckDepthStencilMatch(arg3, arg5, var9.Format, field4019[var10], field4035[var11]) && (~arg1 == -1 || -1 == ~arg4.CheckDeviceMultiSampleType(arg3, arg5, field4035[var10], true, var8))) {
                              var7 = field4019[var10];
                              var6 = field4035[var11];
                              break label92;
                           }
                        }
                     }
                  }
               }

               --arg1;
            }

            if (0 <= arg1 && ~var7 != -1 && var6 != 0) {
               arg2.MultiSampleQuality = 0;
               arg2.MultiSampleType = var8;
               arg2.BackBufferFormat = var7;
               arg2.AutoDepthStencilFormat = var6;
               return true;
            } else {
               return false;
            }
         }
      } catch (Throwable var13) {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1169(byte arg0) {
      this.field4018.SetTransform(3, this.field5308);
      if (arg0 >= -51) {
         this.method1210(false);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "q",
      descriptor = "(Z)V"
   )
   public final void method1210(boolean arg0) {
      if (arg0) {
         this.field4009 = (class700)null;
      }

      int var2 = this.field4034[this.field5286] ? method2232(this.field5250[this.field5286], 16384) : 1;
      this.field4018.SetTextureStageState(this.field5286, 4, var2);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V"
   )
   public final void method1151(Object arg0, int arg1, Canvas arg2) {
      if (arg1 != 3584) {
         this.method1182(103);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lhea;I)I"
   )
   private static final int method2232(class443 arg0, int arg1) {
      if (class641.field9348 != arg0) {
         if (class621.field9036 == arg0) {
            return 4;
         } else if (class226.field3348 == arg0) {
            return 26;
         } else if (class345.field4912 != arg0) {
            if (class566.field8200 != arg0) {
               if (arg1 != 16384) {
                  field4027 = (float[])null;
               }

               throw new IllegalArgumentException();
            } else {
               return 10;
            }
         } else {
            return 7;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIILtv;Lrfa;)Lnfa;"
   )
   public final class706 method1197(int arg0, int arg1, int arg2, class584 arg3, class209 arg4) {
      if (arg2 != 17171) {
         this.field4024 = 72;
      }

      return new class406(this, arg3, arg4, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;"
   )
   public final Object method1160(Canvas arg0, byte arg1) {
      return arg1 > -43 ? (Object)null : null;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method326(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "d",
      descriptor = "(IZ)Lue;"
   )
   public final class242 method1168(int arg0, boolean arg1) {
      if (!arg1) {
         return (class242)null;
      } else if (arg0 == 3) {
         return new class652(this, this.field5205);
      } else if (arg0 == 4) {
         return new class180(this, this.field5205, this.field5055);
      } else {
         return arg0 == 8 ? new class325(this, this.field5205, this.field5055) : super.method1168(arg0, true);
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lrj;Leg;)Lsfa;"
   )
   public final class723 method301(class619 arg0, class117 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "I",
      descriptor = "()I"
   )
   public final int method346() {
      return 0;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "m",
      descriptor = "()Lvfa;"
   )
   public final class698 method273() {
      D3DADAPTER_IDENTIFIER var1 = this.field4011.method3799(this.field4024, 0);
      return new class698(var1.VendorID, field4037, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "e",
      descriptor = "(II)Lrj;"
   )
   public final class619 method263(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "o",
      descriptor = "(Z)V"
   )
   public final void method1193(boolean arg0) {
      if (!arg0) {
         this.field4016 = (class738[])null;
      }

      int var2 = this.field4034[this.field5286] ? method2232(this.field5252[this.field5286], 16384) : 1;
      this.field4018.SetTextureStageState(this.field5286, 1, var2);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILsd;I)V"
   )
   public final void method1202(int arg0, class102 arg1, int arg2) {
      class134 var4 = (class134)arg1;
      if (arg2 == 10) {
         this.field4018.SetStreamSource(arg0, var4.field2207, 0, var4.method1277(arg2 + 31284));
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IILrn;IILej;I)V"
   )
   public final void method1175(int arg0, int arg1, class280 arg2, int arg3, int arg4, class133 arg5, int arg6) {
      this.field4018.SetIndices(((class430)arg2).field6208);
      this.field4018.DrawIndexedPrimitive(method2230(109, arg5), arg3, arg0, arg6, arg1, arg4);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V"
   )
   public final void method1192(Canvas arg0, Object arg1, int arg2) {
      if (arg2 >= 125) {
         if (this.field5081 == arg0) {
            Dimension var4 = arg0.getSize();
            if (-1 > ~var4.width && var4.height > 0) {
               this.field4018.EndScene();
               this.method2235(2);
               this.field4018.BeginScene();
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method1211(int arg0) {
      this.field4029.SetDirection(-this.field5260[0], -this.field5260[1], -this.field5260[2]);
      this.field4010.SetDirection(-this.field5225[0], -this.field5225[arg0], -this.field5225[2]);
      this.field4028 = false;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V"
   )
   public final void method1191(Canvas arg0, Object arg1, byte arg2) {
      this.field4012 = (class83)arg1;
      if (arg2 != -16) {
         this.field4029 = (class508)null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ZIII[BLtv;)Lwe;"
   )
   public final class425 method1185(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4, class584 arg5) {
      if (!arg0) {
         field4027 = (float[])null;
      }

      return new class86(this, arg5, arg1, arg3, arg2, arg4);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1180(boolean arg0, boolean arg1) {
      if (arg1) {
         this.method1177(true, -51, false, (class649)null, 70);
      }

      this.field4018.method3804(161, arg0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "g",
      descriptor = "(Z)V"
   )
   public final void method1179(boolean arg0) {
      this.field4018.method3804(7, this.field5322);
      if (!arg0) {
         this.field4017 = (PixelBuffer)null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lej;III)V"
   )
   public final void method1156(class133 arg0, int arg1, int arg2, int arg3) {
      if (arg3 != 0) {
         this.method2233((byte)122, (class86)null);
      }

      this.field4018.DrawPrimitive(method2230(104, arg0), arg2, arg1);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(ZI)Lrn;"
   )
   public final class280 method1205(boolean arg0, int arg1) {
      return arg1 != 0 ? (class280)null : new class430(this, class209.field3107, arg0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(BLkl;)V"
   )
   public final void method2233(byte arg0, class86 arg1) {
      this.method2240(arg1, arg0 + -36);
      if (!this.field4023[this.field5286]) {
         this.field4018.SetSamplerState(this.field5286, 1, 1);
         this.field4023[this.field5286] = true;
      }

      if (!this.field4031[this.field5286]) {
         this.field4018.SetSamplerState(this.field5286, 2, 1);
         this.field4031[this.field5286] = true;
      }

      if (arg0 != 36) {
         this.field4022 = -31;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(II)Leg;"
   )
   public final class117 method358(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "f",
      descriptor = "()V"
   )
   public final void method268() {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method371(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ILjagdx/IDirect3DVertexShader;)V"
   )
   public final void method2234(int arg0, IDirect3DVertexShader arg1) {
      this.field4030 = arg1;
      this.field4018.SetVertexShader(arg1);
      this.method1150(-96);
      if (arg0 != 36) {
         this.method267();
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "u",
      descriptor = "(I)V"
   )
   public final void method1165(int arg0) {
      if (arg0 >= -29) {
         this.method2233((byte)78, (class86)null);
      }

      float var2 = !this.field5234 ? 0.0F : this.field5239;
      float var3 = this.field5234 ? -this.field5240 : 0.0F;
      this.field4029.SetDiffuse(this.field5274 * var2, this.field5313 * var2, this.field5324 * var2, 0.0F);
      this.field4010.SetDiffuse(this.field5274 * var3, this.field5313 * var3, this.field5324 * var3, 0.0F);
      this.field4028 = false;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "j",
      descriptor = "(B)V"
   )
   public final void method1189(byte arg0) {
      this.field4018.SetViewport(this.field5265, this.field5314, this.field5076, this.field5167, 0.0F, 1.0F);
      if (arg0 < 108) {
         this.field4023 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "cb",
      descriptor = "(I)Z"
   )
   private final boolean method2235(int arg0) {
      int var2 = this.field4018.TestCooperativeLevel();
      if (arg0 != 2) {
         this.method1157(false);
      }

      if (var2 == 0 || var2 == -2005530519) {
         class83 var3 = (class83)this.field5115;
         this.method2791((byte)-73);
         var3.method831(arg0 + -2);
         this.field4032.BackBufferHeight = 0;
         this.field4032.BackBufferWidth = 0;
         if (method2231((byte)101, this.field5268, this.field4032, this.field4024, this.field4011, this.field4022)) {
            int var4 = this.field4018.Reset(this.field4032);
            if (class507.method3795(var4, arg0 ^ -2)) {
               var3.method833(this.field4018.method3812(), this.field4018.method3811(0), (byte)75);
               this.method2768(false);
               this.method1183(-21724);
               return true;
            }
         }
      }

      return false;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "t",
      descriptor = "()V"
   )
   public final void method321() {
      IDirect3DEventQuery var1 = this.field4018.method3810();
      if (class507.method3795(var1.Issue(), -111)) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method5108((byte)7);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "r",
      descriptor = "(B)V"
   )
   public final void method1171(byte arg0) {
      this.field5238 = (float)(-this.field5309 + this.field5320);
      this.field5301 = (float)(-this.field5310) + this.field5238;
      if (arg0 != -57) {
         this.method380();
      }

      if (this.field5301 < (float)this.field5288) {
         this.field5301 = (float)this.field5288;
      }

      this.field4018.method3814(36, this.field5301);
      this.field4018.method3814(37, this.field5238);
      this.field4018.SetRenderState(34, this.field5319);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "w",
      descriptor = "(I)V"
   )
   public final void method1155(int arg0) {
      if (!this.field5315.method4107(-127)) {
         field4027[8] = 0.0F;
         field4027[14] = 0.0F;
         field4027[1] = 0.0F;
         field4027[2] = 0.0F;
         field4027[6] = 0.0F;
         field4027[4] = 0.0F;
         field4027[0] = 1.0F;
         field4027[13] = 0.0F;
         field4027[12] = 0.0F;
         field4027[9] = 0.0F;
         field4027[15] = 1.0F;
         field4027[3] = 0.0F;
         field4027[7] = 0.0F;
         field4027[11] = 0.0F;
         field4027[5] = 1.0F;
         field4027[10] = 1.0F;
      } else {
         this.field5221.method1011(field4027, 119);
      }

      int var2 = 70 / ((arg0 - -67) / 55);
      this.field4018.SetTransform(2, field4027);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DPixelShader;B)V"
   )
   public final void method2236(IDirect3DPixelShader arg0, byte arg1) {
      this.field4018.SetPixelShader(arg0);
      if (arg1 != 3) {
         this.method1200((float[])null, 13, -86, 8, (byte)-16, -79, true, (class584)null);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "v",
      descriptor = "(I)V"
   )
   public final void method1208(int arg0) {
      if (arg0 != 2) {
         this.field4014 = (D3DCAPS)null;
      }

      this.field4018.method3804(28, this.field5278 && this.field5271 && ~this.field5310 <= -1);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method317(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lrfa;BLtv;)Z"
   )
   public final boolean method1186(class209 arg0, byte arg1, class584 arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg1 <= 97) {
         this.field4023 = (boolean[])null;
      }

      return class507.method3795(this.field4011.method3800(this.field4024, var4), -106) && class507.method3795(this.field4011.CheckDeviceFormat(this.field4024, this.field4022, var4.Format, 0, 4, method2229(631, arg0, arg2)), -95);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method421(int arg0) {
      this.field4018.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lkda;B)V"
   )
   public final void method2237(class406 arg0, byte arg1) {
      this.method2240(arg0, 0);
      if (!arg0.field5987 == this.field4023[this.field5286]) {
         this.field4018.SetSamplerState(this.field5286, 1, !arg0.field5987 ? 3 : 1);
         this.field4023[this.field5286] = arg0.field5987;
      }

      if (this.field4031[this.field5286] != arg0.field5986) {
         this.field4018.SetSamplerState(this.field5286, 2, !arg0.field5986 ? 3 : 1);
         this.field4031[this.field5286] = arg0.field5986;
      }

      if (arg1 != 105) {
         this.field4024 = 123;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "x",
      descriptor = "(I)V"
   )
   public final void method1152(int arg0) {
      this.field4018.method3804(27, this.field5230);
      if (arg0 != 8) {
         this.method1177(true, -83, false, (class649)null, -42);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "n",
      descriptor = "(I)V"
   )
   public final void method1153(int arg0) {
      int var2;
      for(var2 = 0; this.field5251 > var2; ++var2) {
         class622 var3 = this.field5259[var2];
         int var4 = var2 + 2;
         int var5 = var3.method4559((byte)-24);
         float var6 = var3.method4556((byte)125) / 255.0F;
         this.field4020.SetPosition((float)var3.method4560((byte)120), (float)var3.method4563(1), (float)var3.method4557((byte)-123));
         this.field4020.SetDiffuse((float)((var5 & 16729199) >> 16) * var6, (float)((var5 & 65394) >> 8) * var6, (float)(255 & var5) * var6, 0.0F);
         this.field4020.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method4564((byte)-108) * var3.method4564((byte)-108)));
         this.field4020.SetRange((float)var3.method4564((byte)-108));
         this.field4018.SetLight(var4, this.field4020);
         this.field4018.LightEnable(var4, true);
      }

      while(var2 < this.field5298) {
         this.field4018.LightEnable(var2 + 2, false);
         ++var2;
      }

      super.method1153(arg0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Llha;I)I"
   )
   private static final int method2238(class649 arg0, int arg1) {
      if (arg1 != 3) {
         field4019 = (int[])null;
      }

      if (class540.field7850 != arg0) {
         if (class701.field10248 == arg0) {
            return 0;
         } else if (class315.field4537 != arg0) {
            if (class295.field4119 == arg0) {
               return 3;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 1;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(BLlha;ZI)V"
   )
   public final void method1206(byte arg0, class649 arg1, boolean arg2, int arg3) {
      int var5 = 0;
      byte var7;
      if (arg3 != 1) {
         if (~arg3 != -3) {
            var7 = 5;
         } else {
            var7 = 27;
         }
      } else {
         var7 = 6;
      }

      if (arg2) {
         var5 |= 16;
      }

      this.field4018.SetTextureStageState(this.field5286, var7, var5 | method2238(arg1, arg0 + 75));
      if (arg0 != -72) {
         this.method1165(99);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ZIZLlha;I)V"
   )
   public final void method1177(boolean arg0, int arg1, boolean arg2, class649 arg3, int arg4) {
      if (arg4 > -49) {
         this.method267();
      }

      int var6 = 0;
      byte var8;
      if (~arg1 == -2) {
         var8 = 3;
      } else if (arg1 == 2) {
         var8 = 26;
      } else {
         var8 = 2;
      }

      if (arg2) {
         var6 |= 32;
      }

      if (arg0) {
         var6 |= 16;
      }

      this.field4018.SetTextureStageState(this.field5286, var8, method2238(arg3, 3) | var6);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "C",
      descriptor = "(I)V"
   )
   public final void method1159(int arg0) {
      this.field4018.SetRenderState(60, this.field5282);
      if (arg0 != 14) {
         this.field4026 = 42;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "bb",
      descriptor = "(I)V"
   )
   public final void method1150(int arg0) {
      if (this.field4030 == null && this.field5316[this.field5286] != class557.field8079) {
         if (this.field5316[this.field5286] == class392.field5781) {
            this.field4018.SetTransform(this.field5286 + 16, this.field5297[this.field5286].method992(field4027, 19060));
         } else {
            this.field4018.SetTransform(this.field5286 + 16, this.field5297[this.field5286].method1011(field4027, 118));
         }

         int var2 = method2239(true, this.field5316[this.field5286]);
         if (~this.field4021[this.field5286] != ~var2) {
            this.field4018.SetTextureStageState(this.field5286, 24, var2);
            this.field4021[this.field5286] = var2;
         }
      } else {
         this.field4018.SetTextureStageState(this.field5286, 24, 0);
         this.field4021[this.field5286] = 0;
      }

      if (arg0 >= -88) {
         this.field4023 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "e",
      descriptor = "()V"
   )
   public final void method375() {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lpa;Lpa;FLpa;)Lpa;"
   )
   public final class386 method441(class386 arg0, class386 arg1, float arg2, class386 arg3) {
      return arg2 < 0.5F ? arg0 : arg1;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "I",
      descriptor = "(I)V"
   )
   public final void method1182(int arg0) {
      if (arg0 == -15042) {
         this.field4018.method3804(15, this.field5264);
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method444(int arg0) {
      this.field4009.method5107(-79);
      super.method444(arg0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Lhw;Ljava/lang/Integer;)Lha;"
   )
   public static final class65 createToolkit(Canvas arg0, class160 arg1, class141 arg2, Integer arg3) {
      class287 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class700 var7 = new class700();
         IDirect3D var8 = IDirect3D.method3798(-2147483616, var7);
         D3DCAPS var9 = var8.method3797(var5, var6);
         if ((var9.RasterCaps & 16777216) == 0) {
            throw new RuntimeException("");
         } else if (-3 >= ~var9.MaxSimultaneousTextures) {
            if (~(var9.TextureOpCaps & 2) != -1) {
               if (~(var9.TextureOpCaps & 8) != -1) {
                  if (~(var9.TextureOpCaps & 64) != -1) {
                     if (~(var9.TextureOpCaps & 512) == -1) {
                        throw new RuntimeException("");
                     } else if (~(var9.TextureOpCaps & 33554432) != -1) {
                        if ((var9.DestBlendCaps & var9.SrcBlendCaps & 16) != 0) {
                           if (~(var9.SrcBlendCaps & var9.DestBlendCaps & 32) == -1) {
                              throw new RuntimeException("");
                           } else if (~(var9.SrcBlendCaps & var9.DestBlendCaps & 2) == -1) {
                              throw new RuntimeException("");
                           } else if (-1 > ~var9.MaxActiveLights && ~var9.MaxActiveLights > -3) {
                              throw new RuntimeException("");
                           } else if (~var9.MaxStreams > -6) {
                              throw new RuntimeException("");
                           } else {
                              D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                              if (!method2231((byte)101, arg3, var10, var5, var8, var6)) {
                                 throw new RuntimeException("");
                              } else {
                                 var10.PresentationInterval = Integer.MIN_VALUE;
                                 var10.Windowed = true;
                                 var10.EnableAutoDepthStencil = true;
                                 int var11 = 2;
                                 if (~(1048576 & var9.DevCaps) != -1) {
                                    var11 |= 16;
                                 }

                                 Object var12 = null;

                                 IDirect3DDevice var13;
                                 try {
                                    var13 = var8.method3801(var5, var6, arg0, var11 | 64, var10);
                                 } catch (class506 var17) {
                                    var13 = var8.method3801(var5, var6, arg0, 32 | var11, var10);
                                 }

                                 class83 var15 = new class83(var13.method3811(0), var13.method3812());
                                 var4 = new class287(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                                 var4.method2787(true);
                                 return var4;
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
            var4.method272();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "O",
      descriptor = "(I)V"
   )
   public final void method1161(int arg0) {
      if (!this.field5218) {
         this.field5215.method1011(field4027, 35);
      } else {
         field4027[5] = 1.0F;
         field4027[4] = 0.0F;
         field4027[7] = 0.0F;
         field4027[10] = 1.0F;
         field4027[13] = 0.0F;
         field4027[11] = 0.0F;
         field4027[12] = 0.0F;
         field4027[14] = 0.0F;
         field4027[0] = 1.0F;
         field4027[9] = 0.0F;
         field4027[3] = 0.0F;
         field4027[6] = 0.0F;
         field4027[15] = 1.0F;
         field4027[8] = 0.0F;
         field4027[2] = 0.0F;
         field4027[1] = 0.0F;
      }

      if (arg0 != 12383) {
         this.field4028 = false;
      }

      this.field4018.SetTransform(256, field4027);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method393(int arg0, int arg1) throws class328 {
      this.field4018.EndScene();
      if (!this.field4012.method832((byte)21)) {
         if (-51 > ~(++this.field4026)) {
            throw new class328();
         }

         this.method2235(2);
      } else {
         this.field4026 = 0;
         if (class507.method3796(0, this.field4012.method834((byte)124, 0))) {
            this.method2235(2);
         }
      }

      this.field4018.BeginScene();
   }

   @OriginalMember(
      owner = "client!vea",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method261(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method1183(int arg0) {
      for(int var2 = 0; var2 < this.field5318; ++var2) {
         this.field4018.SetSamplerState(var2, 7, 0);
         this.field4018.SetSamplerState(var2, 6, 2);
         this.field4018.SetSamplerState(var2, 5, 2);
         this.field4018.SetSamplerState(var2, 1, 1);
         this.field4018.SetSamplerState(var2, 2, 1);
         this.field4016[var2] = class185.field2801;
         this.field4023[var2] = this.field4031[var2] = true;
         this.field4025[var2] = false;
         this.field4021[var2] = 0;
      }

      this.field4018.SetTextureStageState(0, 6, 1);
      this.field4018.SetRenderState(9, 2);
      if (arg0 == -21724) {
         this.field4018.SetRenderState(23, 4);
         this.field4018.SetRenderState(25, 5);
         this.field4018.SetRenderState(24, 0);
         this.field4018.SetRenderState(22, 2);
         this.field4018.SetRenderState(147, 1);
         this.field4018.SetRenderState(145, 1);
         this.field4018.method3814(38, 0.95F);
         this.field4018.SetRenderState(140, 3);
         this.field4029.SetType(3);
         this.field4010.SetType(3);
         this.field4020.SetType(1);
         this.field4028 = false;
         super.method1183(arg0 ^ 0);
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "c",
      descriptor = "(BZ)Lsd;"
   )
   public final class102 method1194(byte arg0, boolean arg1) {
      if (arg0 < 10) {
         this.field4030 = (IDirect3DVertexShader)null;
      }

      return new class134(this, arg1);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lsfa;)V"
   )
   public final void method253(class723 arg0) {
   }

   @OriginalMember(
      owner = "client!vea",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method267() {
      return false;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "t",
      descriptor = "(B)V"
   )
   public final void method1195(byte arg0) {
      if (!this.field4028) {
         this.field4018.LightEnable(0, false);
         this.field4018.LightEnable(1, false);
         this.field4018.SetLight(0, this.field4029);
         this.field4018.SetLight(1, this.field4010);
         this.field4018.LightEnable(0, true);
         this.field4018.LightEnable(1, true);
         this.field4028 = true;
      }

      if (arg0 > -124) {
         this.field4013 = (GeometryBuffer)null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Ltv;ILrfa;)Z"
   )
   public final boolean method1190(class584 arg0, int arg1, class209 arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg1 >= -72) {
         field4019 = (int[])null;
      }

      return class507.method3795(this.field4011.method3800(this.field4024, var4), -63) && class507.method3795(this.field4011.CheckDeviceFormat(this.field4024, this.field4022, var4.Format, 0, 3, method2229(631, arg2, arg0)), -109);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "i",
      descriptor = "(B)V"
   )
   public final void method1167(byte arg0) {
      if (this.field4034[this.field5286]) {
         this.field4034[this.field5286] = false;
         this.field4018.SetTexture(this.field5286, (IDirect3DBaseTexture)null);
         this.method1210(false);
         this.method1193(true);
      }

      if (arg0 <= 63) {
         field4027 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIZI[III)Lnfa;"
   )
   public final class706 method1212(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
      if (arg1 != -13473) {
         field4035 = (int[])null;
      }

      return new class406(this, arg5, arg0, arg2, arg4, arg6, arg3);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(I[Ljq;)Luj;"
   )
   public final class401 method1170(int arg0, class535[] arg1) {
      return arg0 != 0 ? (class401)null : new dxVertexLayout(this, arg1);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method407(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field4018.method3808(0);
      IDirect3DSurface var7 = this.field4018.method3802(arg2, arg3, 21, 0, 0, true);
      if (class507.method3795(this.field4018.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), -20) && class507.method3795(var7.LockRect(0, 0, arg2, arg3, 16, this.field4017), -35)) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field4017.getRowPitch();
         if (~(arg2 * 4) == ~var8) {
            this.field4017.method3824(var5, 0, 0, arg2 * arg3);
         } else {
            for(int var9 = 0; arg3 > var9; ++var9) {
               this.field4017.method3824(var5, arg2 * var9, var8 * var9, arg2);
            }
         }

         var7.UnlockRect();
      }

      var6.method5108((byte)7);
      var7.method5108((byte)7);
      return var5;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "p",
      descriptor = "(B)V"
   )
   public final void method1188(byte arg0) {
      this.field4029.SetAmbient(this.field5274 * this.field5270, this.field5313 * this.field5270, this.field5324 * this.field5270, 0.0F);
      if (arg0 == 1) {
         this.field4028 = false;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "n",
      descriptor = "(Z)V"
   )
   public final void method1157(boolean arg0) {
      if (arg0) {
         this.method407(50, -104, -41, -47);
      }

      this.field4018.method3804(137, this.field5253 && !this.field5290);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIZ[[I)Lnd;"
   )
   public final class568 method1209(int arg0, int arg1, boolean arg2, int[][] arg3) {
      if (arg1 != 1) {
         this.method1202(1, (class102)null, 85);
      }

      return new class84(this, arg0, arg2, arg3);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lqe;I)V"
   )
   public final void method1173(class491 arg0, int arg1) {
      int var3 = 0;
      if (arg1 != 13) {
         field4019 = (int[])null;
      }

      if (class692.field10145 != arg0) {
         if (class560.field8147 != arg0) {
            if (class483.field7015 == arg0) {
               var3 = 196608;
            }
         } else {
            var3 = 131072;
         }
      } else {
         var3 = 65536;
      }

      this.field4018.SetTextureStageState(this.field5286, 11, this.field5286 | var3);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "([FIIIBIZLtv;)Lnfa;"
   )
   public final class706 method1200(float[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, class584 arg7) {
      if (arg4 != 1) {
         this.method379();
      }

      return null;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(ZLqh;)I"
   )
   private static final int method2239(boolean arg0, class74 arg1) {
      if (class776.field11356 == arg1) {
         return 1;
      } else if (class392.field5781 != arg1) {
         if (class608.field8730 != arg1) {
            if (class741.field10676 == arg1) {
               return 4;
            } else if (class16.field292 == arg1) {
               return 256;
            } else {
               if (!arg0) {
                  method2231((byte)-93, -44, (D3DPRESENT_PARAMETERS)null, 75, (IDirect3D)null, -48);
               }

               return 0;
            }
         } else {
            return 3;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!vea",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method1158(byte arg0) {
      if (arg0 != -89) {
         this.field4012 = (class83)null;
      }

      this.field4018.method3804(14, this.field5306 && this.field5232);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "g",
      descriptor = "(B)V"
   )
   public final void method1178(byte arg0) {
      if (arg0 != -123) {
         this.field4036 = false;
      }

      this.field4018.SetScissorRect(this.field5265 + this.field5224, this.field5314 + this.field5280, this.field5294, this.field5249);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "p",
      descriptor = "()V"
   )
   public final void method272() {
      this.field4009.method5105((byte)-83);
      super.method272();
   }

   @OriginalMember(
      owner = "client!vea",
      name = "F",
      descriptor = "(I)F"
   )
   public final float method1181(int arg0) {
      if (arg0 != 0) {
         this.field4022 = 10;
      }

      return -0.5F;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(IIIILtv;IZ[B)Lnfa;"
   )
   public final class706 method1203(int arg0, int arg1, int arg2, int arg3, class584 arg4, int arg5, boolean arg6, byte[] arg7) {
      return arg3 >= -104 ? (class706)null : new class406(this, arg4, arg2, arg5, arg6, arg7, arg1, arg0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "(Lkb;I)V"
   )
   public final void method2240(class717 arg0, int arg1) {
      this.field4018.SetTexture(this.field5286, arg0.method835(false));
      if (this.field4016[this.field5286] == arg0.field10366) {
         if (arg0.field10364 == !this.field4025[this.field5286]) {
            this.field4018.SetSamplerState(this.field5286, 7, !arg0.field10364 ? 0 : method2228(arg1 ^ -93, arg0.field10366));
            this.field4025[this.field5286] = arg0.field10364;
         }
      } else {
         int var3 = method2228(-87, arg0.field10366);
         this.field4018.SetSamplerState(this.field5286, 6, var3);
         this.field4018.SetSamplerState(this.field5286, 5, var3);
         this.field4016[this.field5286] = arg0.field10366;
         if (this.field4025[this.field5286] != arg0.field10364) {
            this.field4018.SetSamplerState(this.field5286, 7, arg0.field10364 ? method2228(-117, arg0.field10366) : 0);
            this.field4025[this.field5286] = arg0.field10364;
         }
      }

      if (arg1 != 0) {
         this.field4011 = (IDirect3D)null;
      }

      if (!this.field4034[this.field5286]) {
         this.field4034[this.field5286] = true;
         this.method1210(false);
         this.method1193(true);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method381(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class328 {
      this.method393(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "d",
      descriptor = "(Z)V"
   )
   public final void method1187(boolean arg0) {
      this.field4018.method3804(174, this.field5347);
      if (arg0) {
         this.field4033 = true;
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "p",
      descriptor = "(Z)V"
   )
   public final void method1163(boolean arg0) {
      if (class551.field7952 != this.field5256) {
         if (class375.field5574 != this.field5256) {
            if (class246.field3531 == this.field5256) {
               this.field4018.SetRenderState(19, 9);
               this.field4018.SetRenderState(20, 2);
            }
         } else {
            this.field4018.SetRenderState(19, 2);
            this.field4018.SetRenderState(20, 2);
         }
      } else {
         this.field4018.SetRenderState(19, 5);
         this.field4018.SetRenderState(20, 6);
      }

      if (arg0) {
         this.method1156((class133)null, 97, -18, -25);
      }

   }

   @OriginalMember(
      owner = "client!vea",
      name = "c",
      descriptor = "(IB)V"
   )
   public final void method1176(int arg0, byte arg1) {
      int var3 = -38 / ((arg1 - 6) / 56);
      this.field4018.SetTextureStageState(this.field5286, 11, arg0);
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2241(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2242(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
