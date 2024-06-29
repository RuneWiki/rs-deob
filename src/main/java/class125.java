import jaclib.peer.class406;
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
import jagdx.class400;
import jagdx.class401;
import jagdx.class402;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class125 extends class226 {
   @OriginalMember(
      owner = "client!mv",
      name = "ah",
      descriptor = "Z"
   )
   private boolean field2001 = false;
   @OriginalMember(
      owner = "client!mv",
      name = "Ug",
      descriptor = "I"
   )
   private int field2005 = 0;
   @OriginalMember(
      owner = "client!mv",
      name = "Pg",
      descriptor = "Lu;"
   )
   private class741 field1992;
   @OriginalMember(
      owner = "client!mv",
      name = "jh",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field2004;
   @OriginalMember(
      owner = "client!mv",
      name = "Vg",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field2013;
   @OriginalMember(
      owner = "client!mv",
      name = "dh",
      descriptor = "I"
   )
   private int field2012;
   @OriginalMember(
      owner = "client!mv",
      name = "Mg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field2014;
   @OriginalMember(
      owner = "client!mv",
      name = "hh",
      descriptor = "I"
   )
   private int field2016;
   @OriginalMember(
      owner = "client!mv",
      name = "fh",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field1997;
   @OriginalMember(
      owner = "client!mv",
      name = "Og",
      descriptor = "Ljaclib/peer/aj;"
   )
   public class406 field2006;
   @OriginalMember(
      owner = "client!mv",
      name = "Wg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class400 field2015;
   @OriginalMember(
      owner = "client!mv",
      name = "Ig",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class400 field1994;
   @OriginalMember(
      owner = "client!mv",
      name = "Rg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class400 field2007;
   @OriginalMember(
      owner = "client!mv",
      name = "Yg",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field2017;
   @OriginalMember(
      owner = "client!mv",
      name = "Sg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field2009;
   @OriginalMember(
      owner = "client!mv",
      name = "Kg",
      descriptor = "Z"
   )
   public boolean field2000;
   @OriginalMember(
      owner = "client!mv",
      name = "ih",
      descriptor = "Z"
   )
   public boolean field1991;
   @OriginalMember(
      owner = "client!mv",
      name = "Qg",
      descriptor = "Z"
   )
   public boolean field1999;
   @OriginalMember(
      owner = "client!mv",
      name = "gh",
      descriptor = "[Z"
   )
   private boolean[] field2002;
   @OriginalMember(
      owner = "client!mv",
      name = "Jg",
      descriptor = "[I"
   )
   private int[] field1998;
   @OriginalMember(
      owner = "client!mv",
      name = "Xg",
      descriptor = "[Z"
   )
   private boolean[] field1993;
   @OriginalMember(
      owner = "client!mv",
      name = "Tg",
      descriptor = "[Z"
   )
   private boolean[] field2003;
   @OriginalMember(
      owner = "client!mv",
      name = "Ng",
      descriptor = "[Z"
   )
   private boolean[] field2018;
   @OriginalMember(
      owner = "client!mv",
      name = "ch",
      descriptor = "[Lmb;"
   )
   private class359[] field1995;
   @OriginalMember(
      owner = "client!mv",
      name = "kh",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2019 = method1294(method1293("@j\boBp0>"));
   @OriginalMember(
      owner = "client!mv",
      name = "Zg",
      descriptor = "[I"
   )
   private static int[] field2008 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!mv",
      name = "eh",
      descriptor = "[I"
   )
   private static int[] field2010 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!mv",
      name = "Lg",
      descriptor = "[F"
   )
   private static float[] field1996 = new float[16];
   @OriginalMember(
      owner = "client!mv",
      name = "bh",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2011;

   @OriginalMember(
      owner = "client!mv",
      name = "l",
      descriptor = "()V"
   )
   public final void method151() {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "o",
      descriptor = "(I)V"
   )
   public final void method1227(int arg0) {
      if (arg0 != Integer.MAX_VALUE) {
         field2010 = (int[])null;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method202(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field2013.method3122(0);
      IDirect3DSurface var7 = this.field2013.method3120(arg2, arg3, 21, 0, 0, true);
      if (class402.method3144(-2005530595, this.field2013.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class402.method3144(-2005530595, var7.LockRect(0, 0, arg2, arg3, 16, this.field2017))) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field2017.getRowPitch();
         if (~(arg2 * 4) == ~var8) {
            this.field2017.method3135(var5, 0, 0, arg2 * arg3);
         } else {
            for(int var9 = 0; arg3 > var9; ++var9) {
               this.field2017.method3135(var5, arg2 * var9, var8 * var9, arg2);
            }
         }

         var7.UnlockRect();
      }

      var6.method3157(118);
      var7.method3157(-78);
      return var5;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIIIZ[BLsr;I)Lpga;"
   )
   public final class371 method1228(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, class78 arg6, int arg7) {
      return arg7 <= 81 ? (class371)null : new class641(this, arg6, arg1, arg3, arg4, arg5, arg0, arg2);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ILsr;Lob;)Z"
   )
   public final boolean method1229(int arg0, class78 arg1, class779 arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg0 != 0) {
         this.field2017 = (PixelBuffer)null;
      }

      return class402.method3144(-2005530595, this.field2004.method3141(this.field2016, var4)) && class402.method3144(-2005530595, this.field2004.CheckDeviceFormat(this.field2016, this.field2012, var4.Format, 0, 3, method1277((byte)46, arg2, arg1)));
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IILida;BLvf;II)V"
   )
   public final void method1230(int arg0, int arg1, class99 arg2, byte arg3, class73 arg4, int arg5, int arg6) {
      this.field2013.SetIndices(((class389)arg2).field5662);
      if (arg3 > 85) {
         this.field2013.DrawIndexedPrimitive(method1247(arg4, 1), 0, arg5, arg0, arg6, arg1);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "(B)V"
   )
   public final void method1231(byte arg0) {
      this.field2013.SetScissorRect(this.field3473 + this.field3466, this.field3464 + this.field3452, this.field3481, this.field3425);
      if (arg0 != 26) {
         this.method229();
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "x",
      descriptor = "(I)V"
   )
   public final void method1232(int arg0) {
      if (arg0 != -2) {
         this.method1276(-10, false, (class670)null, -47);
      }

      if (!this.field2001) {
         this.field2013.LightEnable(0, false);
         this.field2013.LightEnable(1, false);
         this.field2013.SetLight(0, this.field2015);
         this.field2013.SetLight(1, this.field1994);
         this.field2013.LightEnable(0, true);
         this.field2013.LightEnable(1, true);
         this.field2001 = true;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "i",
      descriptor = "(B)V"
   )
   public final void method1233(byte arg0) {
      if (arg0 >= 93) {
         int var2;
         for(var2 = 0; ~this.field3445 < ~var2; ++var2) {
            class757 var3 = this.field3440[var2];
            int var4 = var2 + 2;
            int var5 = var3.method5466(true);
            float var6 = var3.method5471(0) / 255.0F;
            this.field2007.SetPosition((float)var3.method5474(10368), (float)var3.method5470(true), (float)var3.method5469((byte)13));
            this.field2007.SetDiffuse((float)(255 & var5 >> 16) * var6, (float)(255 & var5 >> 8) * var6, (float)(var5 & 255) * var6, 0.0F);
            this.field2007.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method5465((byte)-96) * var3.method5465((byte)98)));
            this.field2007.SetRange((float)var3.method5465((byte)127));
            this.field2013.SetLight(var4, this.field2007);
            this.field2013.LightEnable(var4, true);
         }

         while(var2 < this.field3410) {
            this.field2013.LightEnable(var2 + 2, false);
            ++var2;
         }

         super.method1233((byte)102);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "v",
      descriptor = "(I)V"
   )
   public final void method1234(int arg0) {
      this.field2015.SetDirection(-this.field3435[arg0], -this.field3435[1], -this.field3435[2]);
      this.field1994.SetDirection(-this.field3498[0], -this.field3498[1], -this.field3498[2]);
      this.field2001 = false;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "S",
      descriptor = "(I)F"
   )
   public final float method1235(int arg0) {
      int var2 = -112 / ((arg0 - 78) / 45);
      return -0.5F;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "e",
      descriptor = "(ZI)Lida;"
   )
   public final class99 method1236(boolean arg0, int arg1) {
      if (arg1 != 0) {
         this.method1231((byte)-18);
      }

      return new class389(this, class779.field11372, arg0);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "l",
      descriptor = "(Z)V"
   )
   public final void method1237(boolean arg0) {
      int var2 = !this.field2003[this.field3434] ? 1 : method1242(this.field3496[this.field3434], -18847);
      if (arg0) {
         this.field2013.SetTextureStageState(this.field3434, 1, var2);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1238(byte arg0) {
      this.field2013.method3127(14, this.field3418 && this.field3501);
      if (arg0 < 10) {
         this.field2012 = 51;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ILhj;IZZ)V"
   )
   public final void method1239(int arg0, class670 arg1, int arg2, boolean arg3, boolean arg4) {
      if (arg0 == 2) {
         int var6 = 0;
         byte var8;
         if (~arg2 != -2) {
            if (arg2 != 2) {
               var8 = 2;
            } else {
               var8 = 26;
            }
         } else {
            var8 = 3;
         }

         if (arg3) {
            var6 |= 32;
         }

         if (arg4) {
            var6 |= 16;
         }

         this.field2013.SetTextureStageState(this.field3434, var8, method1258((byte)36, arg1) | var6);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "A",
      descriptor = "(B)Z"
   )
   private final boolean method1240(byte arg0) {
      int var2 = this.field2013.TestCooperativeLevel();
      if (~var2 == -1 || var2 == -2005530519) {
         class741 var3 = (class741)this.field3338;
         this.method2008(-79);
         var3.method5347(false);
         this.field1997.BackBufferHeight = 0;
         this.field1997.BackBufferWidth = 0;
         if (method1282(this.field3415, this.field2012, (byte)96, this.field2016, this.field2004, this.field1997)) {
            int var4 = this.field2013.Reset(this.field1997);
            if (class402.method3144(-2005530595, var4)) {
               var3.method5349(this.field2013.method3116(), (byte)-80, this.field2013.method3124(0));
               this.method1980(-79);
               this.method1268(arg0 + -51);
               return true;
            }
         }
      }

      if (arg0 != 52) {
         this.method1283(77, (Canvas)null, (Object)null);
      }

      return false;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public final void method1241(int arg0, Object arg1, Canvas arg2) {
      if (this.field3279 == arg2) {
         Dimension var4 = arg2.getSize();
         if (var4.width > 0 && 0 < var4.height) {
            this.field2013.EndScene();
            this.method1240((byte)52);
            this.field2013.BeginScene();
         }
      }

      if (arg0 != 4268) {
         this.field1998 = (int[])null;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lgq;I)I"
   )
   private static final int method1242(class200 arg0, int arg1) {
      if (arg1 != -18847) {
         field1996 = (float[])null;
      }

      if (class74.field1189 != arg0) {
         if (class561.field7986 == arg0) {
            return 4;
         } else if (class117.field1846 != arg0) {
            if (class717.field10280 == arg0) {
               return 7;
            } else if (class504.field7180 != arg0) {
               throw new IllegalArgumentException();
            } else {
               return 10;
            }
         } else {
            return 26;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(BLqn;)V"
   )
   public final void method1243(byte arg0, class641 arg1) {
      this.method1275(arg1, 8679);
      if (arg0 >= -112) {
         this.method1235(36);
      }

      if (this.field1993[this.field3434] == !arg1.field9031) {
         this.field2013.SetSamplerState(this.field3434, 1, !arg1.field9031 ? 3 : 1);
         this.field1993[this.field3434] = arg1.field9031;
      }

      if (!arg1.field9028 != !this.field2018[this.field3434]) {
         this.field2013.SetSamplerState(this.field3434, 2, !arg1.field9028 ? 3 : 1);
         this.field2018[this.field3434] = arg1.field9028;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method228(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method206(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class37 {
      this.method182(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DVertexShader;I)V"
   )
   public final void method1244(IDirect3DVertexShader arg0, int arg1) {
      this.field2011 = arg0;
      if (arg1 < 75) {
         this.method1253(35);
      }

      this.field2013.SetVertexShader(arg0);
      this.method1291(true);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ILmb;)I"
   )
   private static final int method1245(int arg0, class359 arg1) {
      if (arg0 != 12612) {
         return 120;
      } else if (class391.field5689 == arg1) {
         return 2;
      } else if (class687.field9911 != arg1) {
         throw new IllegalArgumentException();
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "j",
      descriptor = "(B)V"
   )
   public final void method1246(byte arg0) {
      int var2 = 77 % ((arg0 - 16) / 56);
      this.field2013.method3127(174, this.field3525);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lvf;I)I"
   )
   private static final int method1247(class73 arg0, int arg1) {
      if (class598.field8416 != arg0) {
         if (class268.field4103 == arg0) {
            return 3;
         } else if (class153.field2341 != arg0) {
            if (class482.field6912 == arg0) {
               return 4;
            } else if (class40.field606 == arg0) {
               return 6;
            } else if (class421.field6133 == arg0) {
               return 5;
            } else {
               if (arg1 != 1) {
                  field2010 = (int[])null;
               }

               throw new IllegalArgumentException("");
            }
         } else {
            return 1;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lsr;BI[BII)Laga;"
   )
   public final class145 method1248(class78 arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5) {
      return arg1 <= 40 ? (class145)null : new class658(this, arg0, arg2, arg5, arg4, arg3);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "()V"
   )
   public final void method193() {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIILvf;)V"
   )
   public final void method1249(int arg0, int arg1, int arg2, class73 arg3) {
      this.field2013.DrawPrimitive(method1247(arg3, 1), arg1, arg2);
      if (arg0 != 0) {
         this.field2012 = 72;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "e",
      descriptor = "(II)Ljj;"
   )
   public final class334 method236(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "E",
      descriptor = "(I)V"
   )
   public final void method1250(int arg0) {
      if (arg0 != 11) {
         this.field2018 = (boolean[])null;
      }

      this.field2013.SetRenderState(60, this.field3484);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "N",
      descriptor = "(I)V"
   )
   public final void method1251(int arg0) {
      if (this.field2003[this.field3434]) {
         this.field2003[this.field3434] = false;
         this.field2013.SetTexture(this.field3434, (IDirect3DBaseTexture)null);
         this.method1292(1);
         this.method1237(true);
      }

      if (arg0 != 0) {
         field2008 = (int[])null;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method252(int arg0) {
      this.field2006.method3165((byte)-44);
      super.method252(arg0);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1252(int arg0, boolean arg1) {
      if (arg0 != 8) {
         this.field2005 = -57;
      }

      this.field2013.method3127(161, arg1);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lns;Lns;FLns;)Lns;"
   )
   public final class382 method152(class382 arg0, class382 arg1, float arg2, class382 arg3) {
      return arg2 < 0.5F ? arg0 : arg1;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Lsa;Ljava/lang/Integer;)Lha;"
   )
   public static final class17 createToolkit(Canvas arg0, class672 arg1, class39 arg2, Integer arg3) {
      class125 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class406 var7 = new class406();
         IDirect3D var8 = IDirect3D.method3139(-2147483616, var7);
         D3DCAPS var9 = var8.method3137(var5, var6);
         if (~(var9.RasterCaps & 16777216) != -1) {
            if (~var9.MaxSimultaneousTextures <= -3) {
               if ((2 & var9.TextureOpCaps) == 0) {
                  throw new RuntimeException("");
               } else if (~(8 & var9.TextureOpCaps) != -1) {
                  if (~(var9.TextureOpCaps & 64) != -1) {
                     if (~(512 & var9.TextureOpCaps) != -1) {
                        if ((33554432 & var9.TextureOpCaps) == 0) {
                           throw new RuntimeException("");
                        } else if (~(16 & var9.SrcBlendCaps & var9.DestBlendCaps) != -1) {
                           if (~(32 & var9.DestBlendCaps & var9.SrcBlendCaps) != -1) {
                              if ((2 & var9.SrcBlendCaps & var9.DestBlendCaps) != 0) {
                                 if (0 < var9.MaxActiveLights && ~var9.MaxActiveLights > -3) {
                                    throw new RuntimeException("");
                                 } else if (~var9.MaxStreams > -6) {
                                    throw new RuntimeException("");
                                 } else {
                                    D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                                    if (method1282(arg3, var6, (byte)-120, var5, var8, var10)) {
                                       var10.Windowed = true;
                                       var10.PresentationInterval = Integer.MIN_VALUE;
                                       var10.EnableAutoDepthStencil = true;
                                       int var11 = 2;
                                       if ((var9.DevCaps & 1048576) != 0) {
                                          var11 |= 16;
                                       }

                                       Object var12 = null;

                                       IDirect3DDevice var13;
                                       try {
                                          var13 = var8.method3140(var5, var6, arg0, 64 | var11, var10);
                                       } catch (class401 var17) {
                                          var13 = var8.method3140(var5, var6, arg0, var11 | 32, var10);
                                       }

                                       class741 var15 = new class741(var13.method3124(0), var13.method3116());
                                       var4 = new class125(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                                       var4.method1989(0);
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
            var4.method229();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "s",
      descriptor = "()V"
   )
   public final void method229() {
      this.field2006.method3164((byte)108);
      super.method229();
   }

   @OriginalMember(
      owner = "client!mv",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method235(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "R",
      descriptor = "(I)V"
   )
   public final void method1253(int arg0) {
      if (!this.field3394) {
         this.field3392.method3892(-122, field1996);
      } else {
         field1996[13] = 0.0F;
         field1996[6] = 0.0F;
         field1996[4] = 0.0F;
         field1996[3] = 0.0F;
         field1996[8] = 0.0F;
         field1996[12] = 0.0F;
         field1996[0] = 1.0F;
         field1996[5] = 1.0F;
         field1996[14] = 0.0F;
         field1996[1] = 0.0F;
         field1996[11] = 0.0F;
         field1996[10] = 1.0F;
         field1996[2] = 0.0F;
         field1996[7] = 0.0F;
         field1996[15] = 1.0F;
         field1996[9] = 0.0F;
      }

      if (arg0 == 0) {
         this.field2013.SetTransform(256, field1996);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ILdca;I)V"
   )
   public final void method1254(int arg0, class581 arg1, int arg2) {
      class649 var4 = (class649)arg1;
      if (arg2 == 4) {
         this.field2013.SetStreamSource(arg0, var4.field9189, 0, var4.method4736((byte)32));
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIBILsr;[FIZ)Lpga;"
   )
   public final class371 method1255(int arg0, int arg1, byte arg2, int arg3, class78 arg4, float[] arg5, int arg6, boolean arg7) {
      return arg2 != -13 ? (class371)null : null;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "C",
      descriptor = "(I)V"
   )
   public final void method1256(int arg0) {
      if (arg0 != 1) {
         this.method178();
      }

      if (class283.field4272 != this.field3443) {
         if (class8.field144 == this.field3443) {
            this.field2013.SetRenderState(19, 2);
            this.field2013.SetRenderState(20, 2);
         } else if (class51.field760 == this.field3443) {
            this.field2013.SetRenderState(19, 9);
            this.field2013.SetRenderState(20, 2);
         }
      } else {
         this.field2013.SetRenderState(19, 5);
         this.field2013.SetRenderState(20, 6);
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "t",
      descriptor = "(B)V"
   )
   public final void method1257(byte arg0) {
      if (arg0 >= -41) {
         method1282(73, -95, (byte)-57, 21, (IDirect3D)null, (D3DPRESENT_PARAMETERS)null);
      }

      this.field2013.method3127(7, this.field3458);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "v",
      descriptor = "()Lam;"
   )
   public final class56 method157() {
      D3DADAPTER_IDENTIFIER var1 = this.field2004.method3138(this.field2016, 0);
      return new class56(var1.VendorID, field2019, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "A",
      descriptor = "()V"
   )
   public final void method171() {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(BLhj;)I"
   )
   private static final int method1258(byte arg0, class670 arg1) {
      int var2 = -26 % ((-68 - arg0) / 33);
      if (class339.field5001 == arg1) {
         return 2;
      } else if (class151.field2323 == arg1) {
         return 0;
      } else if (class77.field1238 != arg1) {
         if (class172.field2572 != arg1) {
            throw new IllegalArgumentException();
         } else {
            return 3;
         }
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lpl;B)V"
   )
   public final void method1259(class168 arg0, byte arg1) {
      int var3 = 0;
      if (arg1 > 122) {
         if (class263.field4025 != arg0) {
            if (class798.field11600 == arg0) {
               var3 = 131072;
            } else if (class635.field8997 == arg0) {
               var3 = 196608;
            }
         } else {
            var3 = 65536;
         }

         this.field2013.SetTextureStageState(this.field3434, 11, this.field3434 | var3);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method184(int arg0) {
      this.field2013.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "I",
      descriptor = "()I"
   )
   public final int method156() {
      return 0;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public final Object method1260(byte arg0, Canvas arg1) {
      return arg0 < 92 ? (Object)null : null;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "K",
      descriptor = "(I)V"
   )
   public final void method1261(int arg0) {
      this.field3420 = (float)(-this.field3479 + this.field3447);
      this.field3476 = (float)(-this.field3451) + this.field3420;
      if (this.field3476 < (float)this.field3494) {
         this.field3476 = (float)this.field3494;
      }

      this.field2013.method3132(36, this.field3476);
      this.field2013.method3132(37, this.field3420);
      if (arg0 != 0) {
         this.method1233((byte)73);
      }

      this.field2013.SetRenderState(34, this.field3446);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIILsr;Lob;)Lpga;"
   )
   public final class371 method1262(int arg0, int arg1, int arg2, class78 arg3, class779 arg4) {
      int var6 = 65 / ((-29 - arg1) / 52);
      return new class641(this, arg3, arg4, arg0, arg2);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "ya",
      descriptor = "()V"
   )
   public final void method144() {
      this.method1960(true, (byte)103);
      this.field2013.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lrs;I)V"
   )
   public final void method1263(class297 arg0, int arg1) {
      if (arg1 < 41) {
         this.method1255(88, -30, (byte)-126, 101, (class78)null, (float[])null, 16, false);
      }

      dxVertexLayout var3 = (dxVertexLayout)arg0;
      this.field2013.SetVertexDeclaration(var3.field6366);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "l",
      descriptor = "(B)V"
   )
   public final void method1264(byte arg0) {
      float var2 = !this.field3456 ? 0.0F : this.field3417;
      float var3 = this.field3456 ? -this.field3411 : 0.0F;
      this.field2015.SetDiffuse(this.field3438 * var2, this.field3462 * var2, this.field3429 * var2, 0.0F);
      if (arg0 < 101) {
         this.field2000 = true;
      }

      this.field1994.SetDiffuse(this.field3438 * var3, this.field3462 * var3, this.field3429 * var3, 0.0F);
      this.field2001 = false;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "w",
      descriptor = "(B)V"
   )
   public final void method1265(byte arg0) {
      if (arg0 < 2) {
         this.method1254(108, (class581)null, 48);
      }

      if (this.field3495.method3812((byte)118)) {
         this.field3398.method3892(-127, field1996);
      } else {
         field1996[2] = 0.0F;
         field1996[10] = 1.0F;
         field1996[4] = 0.0F;
         field1996[12] = 0.0F;
         field1996[14] = 0.0F;
         field1996[11] = 0.0F;
         field1996[5] = 1.0F;
         field1996[15] = 1.0F;
         field1996[8] = 0.0F;
         field1996[9] = 0.0F;
         field1996[7] = 0.0F;
         field1996[0] = 1.0F;
         field1996[13] = 0.0F;
         field1996[6] = 0.0F;
         field1996[3] = 0.0F;
         field1996[1] = 0.0F;
      }

      this.field2013.SetTransform(2, field1996);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "M",
      descriptor = "(I)V"
   )
   public final void method1266(int arg0) {
      if (arg0 != 2) {
         this.method1283(-57, (Canvas)null, (Object)null);
      }

      this.field2013.method3127(137, this.field3432 && !this.field3448);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "u",
      descriptor = "(B)V"
   )
   public final void method1267(byte arg0) {
      if (arg0 != -110) {
         this.field1995 = (class359[])null;
      }

      this.field2015.SetAmbient(this.field3492 * this.field3438, this.field3492 * this.field3462, this.field3492 * this.field3429, 0.0F);
      this.field2001 = false;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "d",
      descriptor = "(II)Lni;"
   )
   public final class795 method216(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "ab",
      descriptor = "(I)V"
   )
   public final void method1268(int arg0) {
      for(int var2 = 0; ~var2 > ~this.field3455; ++var2) {
         this.field2013.SetSamplerState(var2, 7, 0);
         this.field2013.SetSamplerState(var2, 6, 2);
         this.field2013.SetSamplerState(var2, 5, 2);
         this.field2013.SetSamplerState(var2, 1, 1);
         this.field2013.SetSamplerState(var2, 2, 1);
         this.field1995[var2] = class391.field5689;
         this.field1993[var2] = this.field2018[var2] = true;
         this.field2002[var2] = false;
         this.field1998[var2] = 0;
      }

      this.field2013.SetTextureStageState(0, 6, 1);
      this.field2013.SetRenderState(9, 2);
      this.field2013.SetRenderState(23, 4);
      this.field2013.SetRenderState(25, 5);
      this.field2013.SetRenderState(24, 0);
      this.field2013.SetRenderState(22, 2);
      this.field2013.SetRenderState(147, 1);
      this.field2013.SetRenderState(145, arg0);
      this.field2013.method3132(38, 0.95F);
      this.field2013.SetRenderState(140, 3);
      this.field2015.SetType(3);
      this.field1994.SetType(3);
      this.field2007.SetType(1);
      this.field2001 = false;
      super.method1268(arg0 + 0);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "n",
      descriptor = "()V"
   )
   public final void method178() {
      IDirect3DEventQuery var1 = this.field2013.method3128();
      if (class402.method3144(-2005530595, var1.Issue())) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method3157(-103);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/aj;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lu;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lsa;I)V"
   )
   private class125(int arg0, int arg1, Canvas arg2, class406 arg3, IDirect3D arg4, IDirect3DDevice arg5, class741 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class672 arg9, class39 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field1992 = arg6;
         this.field2004 = arg4;
         this.field2013 = arg5;
         this.field2012 = arg1;
         this.field2014 = arg8;
         this.field2016 = arg0;
         this.field1997 = arg7;
         this.field2006 = arg3;
         this.field2015 = new class400(this.field2006);
         this.field1994 = new class400(this.field2006);
         this.field2007 = new class400(this.field2006);
         this.field2017 = new PixelBuffer(this.field2006);
         this.field2009 = new GeometryBuffer(this.field2006);
         new GeometryBuffer(this.field2006);
         this.field3465 = -1 <= ~this.field2014.MaxActiveLights ? 8 : this.field2014.MaxActiveLights;
         this.field3455 = this.field2014.MaxSimultaneousTextures;
         this.field3406 = (8192 & this.field2014.TextureCaps) != 0;
         this.field2000 = (this.field2014.TextureCaps & 65536) != 0;
         this.field1991 = (2 & this.field2014.TextureCaps) == 0;
         this.field1999 = ~(this.field2014.TextureCaps & 16384) != -1;
         this.field3414 = ~(2048 & this.field2014.TextureCaps) != -1;
         this.field3457 = ~this.field3415 < -1 || this.field2004.CheckDeviceMultiSampleType(this.field2016, this.field2012, this.field1997.BackBufferFormat, true, 2) == 0;
         this.field2002 = new boolean[this.field3455];
         this.field1998 = new int[this.field3455];
         this.field1993 = new boolean[this.field3455];
         this.field2003 = new boolean[this.field3455];
         this.field2018 = new boolean[this.field3455];
         this.field1995 = new class359[this.field3455];
         this.field2013.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method181(true);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(I[[IIZ)Lcca;"
   )
   public final class293 method1269(int arg0, int[][] arg1, int arg2, boolean arg3) {
      if (arg0 != 0) {
         this.method152((class382)null, (class382)null, -0.867552F, (class382)null);
      }

      return new class624(this, arg2, arg3, arg1);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method217(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method205() {
      return false;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "U",
      descriptor = "(I)V"
   )
   public final void method1270(int arg0) {
      if (arg0 <= -21) {
         this.field2013.SetViewport(this.field3473, this.field3452, this.field3321, this.field3295, 0.0F, 1.0F);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "(Lef;B)I"
   )
   private static final int method1271(class171 arg0, byte arg1) {
      if (class74.field1188 == arg0) {
         return 1;
      } else if (class183.field2686 != arg0) {
         if (class303.field4584 != arg0) {
            if (class278.field4211 != arg0) {
               if (class585.field8206 != arg0) {
                  return arg1 != 34 ? -95 : 0;
               } else {
                  return 256;
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
      owner = "client!mv",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method237() {
      return false;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "i",
      descriptor = "(II)Lsp;"
   )
   public final class575 method1272(int arg0, int arg1) {
      if (arg0 != -27221) {
         this.method1261(38);
      }

      if (arg1 == 3) {
         return new class736(this, this.field3210);
      } else if (~arg1 != -5) {
         return ~arg1 != -9 ? super.method1272(-27221, arg1) : new class688(this, this.field3210, this.field3343);
      } else {
         return new class447(this, this.field3210, this.field3343);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V"
   )
   public final void method1273(Canvas arg0, Object arg1, byte arg2) {
      int var4 = -13 % ((2 - arg2) / 63);
      this.field1992 = (class741)arg1;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "P",
      descriptor = "(I)V"
   )
   public final void method1274(int arg0) {
      this.field2013.method3127(15, this.field3454);
      if (arg0 != 0) {
         this.field2002 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lhca;I)V"
   )
   public final void method1275(class676 arg0, int arg1) {
      if (arg1 == 8679) {
         this.field2013.SetTexture(this.field3434, arg0.method4596((byte)-35));
         if (this.field1995[this.field3434] == arg0.field9461) {
            if (this.field2002[this.field3434] == !arg0.field9464) {
               this.field2013.SetSamplerState(this.field3434, 7, arg0.field9464 ? method1245(arg1 ^ 4259, arg0.field9461) : 0);
               this.field2002[this.field3434] = arg0.field9464;
            }
         } else {
            int var3 = method1245(12612, arg0.field9461);
            this.field2013.SetSamplerState(this.field3434, 6, var3);
            this.field2013.SetSamplerState(this.field3434, 5, var3);
            this.field1995[this.field3434] = arg0.field9461;
            if (this.field2002[this.field3434] == !arg0.field9464) {
               this.field2013.SetSamplerState(this.field3434, 7, arg0.field9464 ? method1245(arg1 + 3933, arg0.field9461) : 0);
               this.field2002[this.field3434] = arg0.field9464;
            }
         }

         if (!this.field2003[this.field3434]) {
            this.field2003[this.field3434] = true;
            this.method1292(1);
            this.method1237(true);
         }

      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lbh;)V"
   )
   public final void method251(class758 arg0) {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method182(int arg0, int arg1) throws class37 {
      this.field2013.EndScene();
      if (this.field1992.method5348(true)) {
         this.field2005 = 0;
         if (class402.method3145(this.field1992.method5350((byte)-93, 0), (byte)123)) {
            this.method1240((byte)52);
         }
      } else {
         if (-51 > ~(++this.field2005)) {
            throw new class37();
         }

         this.method1240((byte)52);
      }

      this.field2013.BeginScene();
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IZLhj;I)V"
   )
   public final void method1276(int arg0, boolean arg1, class670 arg2, int arg3) {
      byte var6;
      if (~arg0 != -2) {
         if (arg0 != 2) {
            var6 = 5;
         } else {
            var6 = 27;
         }
      } else {
         var6 = 6;
      }

      int var7 = arg3;
      if (arg1) {
         var7 = arg3 | 16;
      }

      this.field2013.SetTextureStageState(this.field3434, var6, var7 | method1258((byte)-101, arg2));
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(BLob;Lsr;)I"
   )
   public static final int method1277(byte arg0, class779 arg1, class78 arg2) {
      if (arg0 != 46) {
         createToolkit((Canvas)null, (class672)null, (class39)null, (Integer)null);
      }

      if (class779.field11371 == arg1) {
         if (class317.field4744 == arg2) {
            return 22;
         }

         if (class31.field438 == arg2) {
            return 21;
         }

         if (class106.field1654 == arg2) {
            return 28;
         }

         if (class171.field2564 == arg2) {
            return 50;
         }

         if (class73.field1175 == arg2) {
            return 51;
         }

         if (class480.field6902 == arg2) {
            return 77;
         }
      }

      throw new IllegalArgumentException("");
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lsr;Lob;I)Z"
   )
   public final boolean method1278(class78 arg0, class779 arg1, int arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg2 <= 101) {
         this.method236(-59, -104);
      }

      return class402.method3144(-2005530595, this.field2004.method3141(this.field2016, var4)) && class402.method3144(-2005530595, this.field2004.CheckDeviceFormat(this.field2016, this.field2012, var4.Format, 0, 4, method1277((byte)46, arg1, arg0)));
   }

   @OriginalMember(
      owner = "client!mv",
      name = "D",
      descriptor = "(I)V"
   )
   public final void method1279(int arg0) {
      if (arg0 == 1) {
         this.field2013.SetTransform(3, this.field3490);
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ZLnc;)V"
   )
   public final void method1280(boolean arg0, class658 arg1) {
      this.method1275(arg1, 8679);
      if (!this.field1993[this.field3434]) {
         this.field2013.SetSamplerState(this.field3434, 1, 1);
         this.field1993[this.field3434] = true;
      }

      if (!arg0) {
         this.field2003 = (boolean[])null;
      }

      if (!this.field2018[this.field3434]) {
         this.field2013.SetSamplerState(this.field3434, 2, 1);
         this.field2018[this.field3434] = true;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method195(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "r",
      descriptor = "(B)V"
   )
   public final void method1281(byte arg0) {
      this.method1264((byte)115);
      this.method1232(-2);
      if (arg0 >= -110) {
         this.field2006 = (class406)null;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIBILjagdx/IDirect3D;Ljagdx/D3DPRESENT_PARAMETERS;)Z"
   )
   private static final boolean method1282(int arg0, int arg1, byte arg2, int arg3, IDirect3D arg4, D3DPRESENT_PARAMETERS arg5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 42 / ((-39 - arg2) / 41);
      int var9 = 0;

      try {
         D3DDISPLAYMODE var10 = new D3DDISPLAYMODE();
         if (class402.method3145(arg4.method3141(arg3, var10), (byte)123)) {
            return false;
         } else {
            label88:
            while(-1 >= ~arg0) {
               if (arg0 != 1) {
                  var9 = arg0 + 0;

                  for(int var11 = 0; field2008.length > var11; ++var11) {
                     if (~arg4.CheckDeviceType(arg3, arg1, var10.Format, field2008[var11], true) == -1 && arg4.CheckDeviceFormat(arg3, arg1, var10.Format, 1, 1, field2008[var11]) == 0 && (arg0 == 0 || -1 == ~arg4.CheckDeviceMultiSampleType(arg3, arg1, field2008[var11], true, var9))) {
                        for(int var12 = 0; field2010.length > var12; ++var12) {
                           if (0 == arg4.CheckDeviceFormat(arg3, arg1, var10.Format, 2, 1, field2010[var12]) && arg4.CheckDepthStencilMatch(arg3, arg1, var10.Format, field2008[var11], field2010[var12]) == 0 && (arg0 == 0 || 0 == arg4.CheckDeviceMultiSampleType(arg3, arg1, field2010[var11], true, var9))) {
                              var6 = field2010[var12];
                              var7 = field2008[var11];
                              break label88;
                           }
                        }
                     }
                  }
               }

               --arg0;
            }

            if (~arg0 <= -1 && var7 != 0 && var6 != 0) {
               arg5.AutoDepthStencilFormat = var6;
               arg5.MultiSampleType = var9;
               arg5.MultiSampleQuality = 0;
               arg5.BackBufferFormat = var7;
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
      owner = "client!mv",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V"
   )
   public final void method1283(int arg0, Canvas arg1, Object arg2) {
      if (arg0 < 52) {
         this.field1995 = (class359[])null;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Lni;Ljj;)Lbh;"
   )
   public final class758 method261(class795 arg0, class334 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "h",
      descriptor = "(II)V"
   )
   public final void method1284(int arg0, int arg1) {
      this.field2013.SetTextureStageState(this.field3434, 11, arg1);
      int var3 = -88 % ((arg0 - 23) / 42);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "V",
      descriptor = "(I)V"
   )
   public final void method1285(int arg0) {
      this.field2013.method3127(28, this.field3450 && this.field3437 && ~this.field3451 <= -1);
      if (arg0 != -32617) {
         this.method151();
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "x",
      descriptor = "()V"
   )
   public final void method210() {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ZZ)Ldca;"
   )
   public final class581 method1286(boolean arg0, boolean arg1) {
      return arg0 ? (class581)null : new class649(this, arg1);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method191(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!mv",
      name = "g",
      descriptor = "(Z)V"
   )
   public final void method1287(boolean arg0) {
      this.field2013.method3127(27, this.field3461);
      if (arg0) {
         this.method1270(-109);
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IZIII[II)Lpga;"
   )
   public final class371 method1288(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
      if (arg6 != 0) {
         this.method229();
      }

      return new class641(this, arg0, arg3, arg1, arg5, arg2, arg4);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(ILjagdx/IDirect3DPixelShader;)V"
   )
   public final void method1289(int arg0, IDirect3DPixelShader arg1) {
      this.field2013.SetPixelShader(arg1);
      if (arg0 != 0) {
         this.method251((class758)null);
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(I[Len;)Lrs;"
   )
   public final class297 method1290(int arg0, class446[] arg1) {
      if (arg0 < 71) {
         this.method1278((class78)null, (class779)null, 39);
      }

      return new dxVertexLayout(this, arg1);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "i",
      descriptor = "(Z)V"
   )
   public final void method1291(boolean arg0) {
      if (!arg0) {
         this.field2017 = (PixelBuffer)null;
      }

      if (this.field2011 == null && this.field3469[this.field3434] != class349.field5123) {
         if (this.field3469[this.field3434] != class183.field2686) {
            this.field2013.SetTransform(this.field3434 + 16, this.field3491[this.field3434].method3892(-124, field1996));
         } else {
            this.field2013.SetTransform(this.field3434 + 16, this.field3491[this.field3434].method3901((byte)57, field1996));
         }

         int var2 = method1271(this.field3469[this.field3434], (byte)34);
         if (this.field1998[this.field3434] != var2) {
            this.field2013.SetTextureStageState(this.field3434, 24, var2);
            this.field1998[this.field3434] = var2;
         }
      } else {
         this.field2013.SetTextureStageState(this.field3434, 24, 0);
         this.field1998[this.field3434] = 0;
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "I",
      descriptor = "(I)V"
   )
   public final void method1292(int arg0) {
      int var2 = this.field2003[this.field3434] ? method1242(this.field3403[this.field3434], -18847) : 1;
      if (arg0 != 1) {
         this.method1285(-34);
      }

      this.field2013.SetTextureStageState(this.field3434, 4, var2);
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1293(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1294(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
