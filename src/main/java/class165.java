import jaclib.peer.class378;
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
import jagdx.class758;
import jagdx.class759;
import jagdx.class760;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class165 extends class281 {
   @OriginalMember(
      owner = "client!ub",
      name = "eh",
      descriptor = "Z"
   )
   private boolean field2095 = false;
   @OriginalMember(
      owner = "client!ub",
      name = "Xg",
      descriptor = "I"
   )
   private int field2103 = 0;
   @OriginalMember(
      owner = "client!ub",
      name = "Rg",
      descriptor = "Lpa;"
   )
   private class662 field2107;
   @OriginalMember(
      owner = "client!ub",
      name = "bh",
      descriptor = "I"
   )
   private int field2111;
   @OriginalMember(
      owner = "client!ub",
      name = "Hg",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field2093;
   @OriginalMember(
      owner = "client!ub",
      name = "Kg",
      descriptor = "I"
   )
   private int field2101;
   @OriginalMember(
      owner = "client!ub",
      name = "gh",
      descriptor = "Ljaclib/peer/ida;"
   )
   public class378 field2106;
   @OriginalMember(
      owner = "client!ub",
      name = "hh",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field2108;
   @OriginalMember(
      owner = "client!ub",
      name = "Mg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field2091;
   @OriginalMember(
      owner = "client!ub",
      name = "ih",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field2112;
   @OriginalMember(
      owner = "client!ub",
      name = "Sg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class758 field2098;
   @OriginalMember(
      owner = "client!ub",
      name = "Yg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class758 field2089;
   @OriginalMember(
      owner = "client!ub",
      name = "dh",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class758 field2110;
   @OriginalMember(
      owner = "client!ub",
      name = "ch",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field2094;
   @OriginalMember(
      owner = "client!ub",
      name = "Pg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field2102;
   @OriginalMember(
      owner = "client!ub",
      name = "fh",
      descriptor = "Z"
   )
   public boolean field2113;
   @OriginalMember(
      owner = "client!ub",
      name = "Qg",
      descriptor = "Z"
   )
   public boolean field2092;
   @OriginalMember(
      owner = "client!ub",
      name = "ah",
      descriptor = "Z"
   )
   public boolean field2105;
   @OriginalMember(
      owner = "client!ub",
      name = "Ng",
      descriptor = "[Z"
   )
   private boolean[] field2087;
   @OriginalMember(
      owner = "client!ub",
      name = "Vg",
      descriptor = "[Z"
   )
   private boolean[] field2099;
   @OriginalMember(
      owner = "client!ub",
      name = "Lg",
      descriptor = "[Z"
   )
   private boolean[] field2100;
   @OriginalMember(
      owner = "client!ub",
      name = "Ug",
      descriptor = "[I"
   )
   private int[] field2088;
   @OriginalMember(
      owner = "client!ub",
      name = "Wg",
      descriptor = "[Z"
   )
   private boolean[] field2109;
   @OriginalMember(
      owner = "client!ub",
      name = "Zg",
      descriptor = "[Lrj;"
   )
   private class782[] field2096;
   @OriginalMember(
      owner = "client!ub",
      name = "jh",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2114 = method1432(method1431("cnRZ\u0012S4d"));
   @OriginalMember(
      owner = "client!ub",
      name = "Tg",
      descriptor = "[F"
   )
   private static float[] field2090 = new float[16];
   @OriginalMember(
      owner = "client!ub",
      name = "Jg",
      descriptor = "[I"
   )
   private static int[] field2086 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!ub",
      name = "Ig",
      descriptor = "[I"
   )
   private static int[] field2097 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!ub",
      name = "Og",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2104;

   @OriginalMember(
      owner = "client!ub",
      name = "u",
      descriptor = "()V"
   )
   public final void method438() {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method410(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lbga;I)V"
   )
   public final void method1365(class414 arg0, int arg1) {
      this.method1405(false, arg0);
      if (!this.field2099[this.field3793] != !arg0.field5684) {
         this.field2093.SetSamplerState(this.field3793, 1, !arg0.field5684 ? 3 : 1);
         this.field2099[this.field3793] = arg0.field5684;
      }

      if (this.field2087[this.field3793] == !arg0.field5682) {
         this.field2093.SetSamplerState(this.field3793, 2, arg0.field5682 ? 1 : 3);
         this.field2087[this.field3793] = arg0.field5682;
      }

      if (arg1 != -24407) {
         method1366((class45)null, (class576)null, -87);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Ldja;Lwn;I)I"
   )
   public static final int method1366(class45 arg0, class576 arg1, int arg2) {
      if (class576.field8541 == arg1) {
         if (class519.field7274 == arg0) {
            return 22;
         }

         if (class606.field8967 == arg0) {
            return 21;
         }

         if (class673.field9968 == arg0) {
            return 28;
         }

         if (class529.field7424 == arg0) {
            return 50;
         }

         if (class7.field88 == arg0) {
            return 51;
         }

         if (class439.field5979 == arg0) {
            return 77;
         }
      }

      if (arg2 != -31143) {
         return -25;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lrj;I)I"
   )
   private static final int method1367(class782 arg0, int arg1) {
      if (arg1 != 0) {
         method1386((class255)null, true);
      }

      if (class206.field2625 != arg0) {
         if (class632.field9325 == arg0) {
            return 1;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "j",
      descriptor = "(B)V"
   )
   public final void method1368(byte arg0) {
      this.field2093.method5512(27, this.field3861);
      if (arg0 != 80) {
         this.method1403((byte)9);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method1369(byte arg0) {
      int var2 = -48 / ((arg0 - 48) / 34);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "l",
      descriptor = "(II)Lob;"
   )
   public final class393 method1370(int arg0, int arg1) {
      if (arg0 != 2) {
         this.field2107 = (class662)null;
      }

      if (arg1 != 3) {
         if (~arg1 != -5) {
            return ~arg1 == -9 ? new class346(this, this.field3760, this.field3651) : super.method1370(arg0 + 0, arg1);
         } else {
            return new class609(this, this.field3760, this.field3651);
         }
      } else {
         return new class719(this, this.field3760);
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IIILdja;IIZ[F)Lcb;"
   )
   public final class177 method1371(int arg0, int arg1, int arg2, class45 arg3, int arg4, int arg5, boolean arg6, float[] arg7) {
      return arg2 != -32 ? (class177)null : null;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method399() {
      return false;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "o",
      descriptor = "(B)V"
   )
   public final void method1372(byte arg0) {
      this.field2098.SetAmbient(this.field3862 * this.field3821, this.field3826 * this.field3821, this.field3821 * this.field3795, 0.0F);
      this.field2095 = false;
      if (arg0 <= 52) {
         this.field2106 = (class378)null;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ILwn;Ldja;)Z"
   )
   public final boolean method1373(int arg0, class576 arg1, class45 arg2) {
      if (arg0 >= -45) {
         this.method1376(-1);
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return class760.method5514(25060, this.field2112.method5492(this.field2111, var4)) && class760.method5514(25060, this.field2112.CheckDeviceFormat(this.field2111, this.field2101, var4.Format, 0, 4, method1366(arg2, arg1, -31143)));
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(BLkca;)V"
   )
   public final void method1374(byte arg0, class416 arg1) {
      this.method1405(false, arg1);
      if (!this.field2099[this.field3793]) {
         this.field2093.SetSamplerState(this.field3793, 1, 1);
         this.field2099[this.field3793] = true;
      }

      if (!this.field2087[this.field3793]) {
         this.field2093.SetSamplerState(this.field3793, 2, 1);
         this.field2087[this.field3793] = true;
      }

      if (arg0 != 89) {
         this.field2101 = -91;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lbc;ZI)V"
   )
   public final void method1375(class11 arg0, boolean arg1, int arg2) {
      if (!arg1) {
         this.field2105 = false;
      }

      class144 var4 = (class144)arg0;
      this.field2093.SetStreamSource(arg2, var4.field1815, 0, var4.method1175((byte)79));
   }

   @OriginalMember(
      owner = "client!ub",
      name = "w",
      descriptor = "(I)V"
   )
   public final void method1376(int arg0) {
      if (arg0 == 0) {
         this.method1377((byte)-111);
         this.method1422(false);
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "s",
      descriptor = "(B)V"
   )
   public final void method1377(byte arg0) {
      float var2 = !this.field3830 ? 0.0F : this.field3869;
      float var3 = !this.field3830 ? 0.0F : -this.field3817;
      this.field2098.SetDiffuse(this.field3862 * var2, this.field3826 * var2, this.field3795 * var2, 0.0F);
      this.field2089.SetDiffuse(this.field3862 * var3, this.field3826 * var3, this.field3795 * var3, 0.0F);
      if (arg0 >= -26) {
         this.field2110 = (class758)null;
      }

      this.field2095 = false;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lvv;I)I"
   )
   private static final int method1378(class467 arg0, int arg1) {
      if (arg1 <= 104) {
         return 104;
      } else if (class318.field4380 == arg0) {
         return 2;
      } else if (class231.field2873 != arg0) {
         if (class749.field10941 != arg0) {
            if (class242.field3052 == arg0) {
               return 7;
            } else if (class371.field5192 != arg0) {
               throw new IllegalArgumentException();
            } else {
               return 10;
            }
         } else {
            return 26;
         }
      } else {
         return 4;
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class221 {
      this.method476(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method432(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "x",
      descriptor = "(B)Z"
   )
   private final boolean method1379(byte arg0) {
      int var2 = this.field2093.TestCooperativeLevel();
      if (var2 == 0 || var2 == -2005530519) {
         class662 var3 = (class662)this.field3751;
         this.method2216(-47);
         var3.method4839(91);
         this.field2108.BackBufferWidth = 0;
         this.field2108.BackBufferHeight = 0;
         if (method1420((byte)115, this.field2112, this.field2101, this.field3853, this.field2111, this.field2108)) {
            int var4 = this.field2093.Reset(this.field2108);
            if (class760.method5514(25060, var4)) {
               var3.method4842(this.field2093.method5497(0), 122, this.field2093.method5495());
               this.method2268(-9727);
               this.method1424(0);
               return true;
            }
         }
      }

      int var5 = 67 / ((31 - arg0) / 39);
      return false;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V"
   )
   public final void method1380(Canvas arg0, Object arg1, byte arg2) {
      if (arg2 == -120) {
         if (this.field3709 == arg0) {
            Dimension var4 = arg0.getSize();
            if (-1 > ~var4.width && -1 > ~var4.height) {
               this.field2093.EndScene();
               this.method1379((byte)-40);
               this.field2093.BeginScene();
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "V",
      descriptor = "(I)F"
   )
   public final float method1381(int arg0) {
      if (arg0 != 21158) {
         this.method507();
      }

      return -0.5F;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ida;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Lpa;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Lww;I)V"
   )
   private class165(int arg0, int arg1, Canvas arg2, class378 arg3, IDirect3D arg4, IDirect3DDevice arg5, class662 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class102 arg9, class339 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field2107 = arg6;
         this.field2111 = arg0;
         this.field2093 = arg5;
         this.field2101 = arg1;
         this.field2106 = arg3;
         this.field2108 = arg7;
         this.field2091 = arg8;
         this.field2112 = arg4;
         this.field2098 = new class758(this.field2106);
         this.field2089 = new class758(this.field2106);
         this.field2110 = new class758(this.field2106);
         this.field2094 = new PixelBuffer(this.field2106);
         this.field2102 = new GeometryBuffer(this.field2106);
         new GeometryBuffer(this.field2106);
         this.field3829 = this.field2091.MaxSimultaneousTextures;
         this.field3780 = ~this.field2091.MaxActiveLights < -1 ? this.field2091.MaxActiveLights : 8;
         this.field2113 = ~(this.field2091.TextureCaps & 65536) != -1;
         this.field2092 = (2 & this.field2091.TextureCaps) == 0;
         this.field3816 = ~(this.field2091.TextureCaps & 8192) != -1;
         this.field2105 = ~(16384 & this.field2091.TextureCaps) != -1;
         this.field3789 = (2048 & this.field2091.TextureCaps) != 0;
         this.field3815 = -1 > ~this.field3853 || ~this.field2112.CheckDeviceMultiSampleType(this.field2111, this.field2101, this.field2108.BackBufferFormat, true, 2) == -1;
         this.field2087 = new boolean[this.field3829];
         this.field2099 = new boolean[this.field3829];
         this.field2100 = new boolean[this.field3829];
         this.field2088 = new int[this.field3829];
         this.field2109 = new boolean[this.field3829];
         this.field2096 = new class782[this.field3829];
         this.field2093.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method3649(false);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(III[BLdja;I)Lrh;"
   )
   public final class722 method1382(int arg0, int arg1, int arg2, byte[] arg3, class45 arg4, int arg5) {
      return arg2 < 47 ? (class722)null : new class416(this, arg4, arg1, arg5, arg0, arg3);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "()V"
   )
   public final void method481() {
      IDirect3DEventQuery var1 = this.field2093.method5500();
      if (class760.method5514(25060, var1.Issue())) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (var2 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method2971((byte)122);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "o",
      descriptor = "(Z)V"
   )
   public final void method1383(boolean arg0) {
      if (arg0) {
         this.method1368((byte)38);
      }

      if (this.field3773) {
         field2090[14] = 0.0F;
         field2090[3] = 0.0F;
         field2090[4] = 0.0F;
         field2090[10] = 1.0F;
         field2090[8] = 0.0F;
         field2090[2] = 0.0F;
         field2090[0] = 1.0F;
         field2090[12] = 0.0F;
         field2090[9] = 0.0F;
         field2090[13] = 0.0F;
         field2090[6] = 0.0F;
         field2090[5] = 1.0F;
         field2090[15] = 1.0F;
         field2090[11] = 0.0F;
         field2090[1] = 0.0F;
         field2090[7] = 0.0F;
      } else {
         this.field3770.method4585((byte)109, field2090);
      }

      this.field2093.SetTransform(256, field2090);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "l",
      descriptor = "(I)V"
   )
   public final void method1384(int arg0) {
      if (arg0 == 0) {
         this.field2093.method5512(28, this.field3846 && this.field3851 && -1 >= ~this.field3854);
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Ldja;IZI[BIZI)Lcb;"
   )
   public final class177 method1385(class45 arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, boolean arg6, int arg7) {
      return arg6 ? (class177)null : new class414(this, arg0, arg5, arg7, arg2, arg4, arg1, arg3);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "(II)Lsq;"
   )
   public final class220 method409(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "()Ljv;"
   )
   public final class776 method425() {
      D3DADAPTER_IDENTIFIER var1 = this.field2112.method5491(this.field2111, 0);
      return new class776(var1.VendorID, field2114, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "w",
      descriptor = "()V"
   )
   public final void method401() {
      this.field2106.method2981(30982);
      super.method401();
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lwk;Z)I"
   )
   private static final int method1386(class255 arg0, boolean arg1) {
      if (arg1) {
         method1389((byte)-33, (class95)null);
      }

      if (class363.field5039 != arg0) {
         if (class733.field10690 != arg0) {
            if (class48.field640 == arg0) {
               return 1;
            } else if (class354.field4947 != arg0) {
               throw new IllegalArgumentException();
            } else {
               return 3;
            }
         } else {
            return 0;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(BLjagdx/IDirect3DPixelShader;)V"
   )
   public final void method1387(byte arg0, IDirect3DPixelShader arg1) {
      this.field2093.SetPixelShader(arg1);
      if (arg0 < -33) {
         ;
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DVertexShader;I)V"
   )
   public final void method1388(IDirect3DVertexShader arg0, int arg1) {
      if (arg1 != 11) {
         this.field2099 = (boolean[])null;
      }

      this.field2104 = arg0;
      this.field2093.SetVertexShader(arg0);
      this.method1425(true);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(BLcba;)I"
   )
   private static final int method1389(byte arg0, class95 arg1) {
      if (arg0 != 16) {
         field2086 = (int[])null;
      }

      if (class30.field432 == arg1) {
         return 1;
      } else if (class152.field1892 != arg1) {
         if (class644.field9663 == arg1) {
            return 3;
         } else if (class266.field3361 != arg1) {
            return class707.field10401 == arg1 ? 256 : 0;
         } else {
            return 4;
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lwk;ZIB)V"
   )
   public final void method1390(class255 arg0, boolean arg1, int arg2, byte arg3) {
      if (arg3 <= 66) {
         this.method405(-0.6648609F, -2.041002F, 2.1569097F);
      }

      int var5 = 0;
      byte var7;
      if (arg2 != 1) {
         if (~arg2 == -3) {
            var7 = 27;
         } else {
            var7 = 5;
         }
      } else {
         var7 = 6;
      }

      if (arg1) {
         var5 |= 16;
      }

      this.field2093.SetTextureStageState(this.field3793, var7, var5 | method1386(arg0, false));
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Loga;Lsq;)Lkr;"
   )
   public final class122 method445(class179 arg0, class220 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V"
   )
   public final void method1391(Canvas arg0, byte arg1, Object arg2) {
      this.field2107 = (class662)arg2;
      if (arg1 != 11) {
         this.method1403((byte)-37);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method464(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field2093.method5508(0);
      IDirect3DSurface var7 = this.field2093.method5504(arg2, arg3, 21, 0, 0, true);
      if (class760.method5514(25060, this.field2093.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0)) && class760.method5514(25060, var7.LockRect(0, 0, arg2, arg3, 16, this.field2094))) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field2094.getRowPitch();
         if (arg2 * 4 == var8) {
            this.field2094.method5486(var5, 0, 0, arg2 * arg3);
         } else {
            for(int var9 = 0; arg3 > var9; ++var9) {
               this.field2094.method5486(var5, arg2 * var9, var8 * var9, arg2);
            }
         }

         var7.UnlockRect();
      }

      var6.method2971((byte)-74);
      var7.method2971((byte)116);
      return var5;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;"
   )
   public final Object method1392(int arg0, Canvas arg1) {
      if (arg0 != 31256) {
         this.method1383(false);
      }

      return null;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IIZLdja;Lwn;)Lcb;"
   )
   public final class177 method1393(int arg0, int arg1, boolean arg2, class45 arg3, class576 arg4) {
      if (!arg2) {
         this.field2101 = 17;
      }

      return new class414(this, arg3, arg4, arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "u",
      descriptor = "(I)V"
   )
   public final void method1394(int arg0) {
      if (arg0 >= -49) {
         this.method1395(false);
      }

      if (class735.field10729 == this.field3841) {
         this.field2093.SetRenderState(19, 5);
         this.field2093.SetRenderState(20, 6);
      } else if (class584.field8622 != this.field3841) {
         if (class562.field8269 == this.field3841) {
            this.field2093.SetRenderState(19, 9);
            this.field2093.SetRenderState(20, 2);
         }
      } else {
         this.field2093.SetRenderState(19, 2);
         this.field2093.SetRenderState(20, 2);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "(II)Loga;"
   )
   public final class179 method415(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method426(int arg0) {
      this.field2093.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "n",
      descriptor = "(Z)V"
   )
   public final void method1395(boolean arg0) {
      int var2;
      for(var2 = 0; ~this.field3785 < ~var2; ++var2) {
         class243 var3 = this.field3864[var2];
         int var4 = var2 + 2;
         int var5 = var3.method1929(-1);
         float var6 = var3.method1931(!arg0) / 255.0F;
         this.field2110.SetPosition((float)var3.method1927((byte)-8), (float)var3.method1926(20), (float)var3.method1928(-49));
         this.field2110.SetDiffuse((float)(255 & var5 >> 16) * var6, (float)(var5 >> 8 & 255) * var6, (float)(var5 & 255) * var6, 0.0F);
         this.field2110.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method1933(false) * var3.method1933(false)));
         this.field2110.SetRange((float)var3.method1933(false));
         this.field2093.SetLight(var4, this.field2110);
         this.field2093.LightEnable(var4, true);
      }

      while(~this.field3843 < ~var2) {
         this.field2093.LightEnable(var2 + 2, false);
         ++var2;
      }

      super.method1395(arg0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method458(int arg0) {
      this.field2106.method2980((byte)76);
      super.method458(arg0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lkr;)V"
   )
   public final void method510(class122 arg0) {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "([Lkm;I)Lkfa;"
   )
   public final class428 method1396(class207[] arg0, int arg1) {
      return arg1 >= -65 ? (class428)null : new dxVertexLayout(this, arg0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "i",
      descriptor = "(B)V"
   )
   public final void method1397(byte arg0) {
      this.field2093.SetRenderState(60, this.field3859);
      int var2 = 29 / ((-22 - arg0) / 50);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ZB)Lbc;"
   )
   public final class11 method1398(boolean arg0, byte arg1) {
      return arg1 != 98 ? (class11)null : new class144(this, arg0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "E",
      descriptor = "(I)V"
   )
   public final void method1399(int arg0) {
      if (arg0 != 8912) {
         this.field2101 = -78;
      }

      this.field2093.SetTransform(3, this.field3824);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "m",
      descriptor = "(B)V"
   )
   public final void method1400(byte arg0) {
      this.field2093.method5512(14, this.field3863 && this.field3848);
      if (arg0 < 34) {
         this.field2110 = (class758)null;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public final void method1401(int arg0, Object arg1, Canvas arg2) {
      if (arg0 != 50) {
         this.field2093 = (IDirect3DDevice)null;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ILkfa;)V"
   )
   public final void method1402(int arg0, class428 arg1) {
      dxVertexLayout var3 = (dxVertexLayout)arg1;
      this.field2093.SetVertexDeclaration(var3.field11217);
      if (arg0 != 1) {
         this.field2105 = true;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1403(byte arg0) {
      this.field2093.method5512(137, this.field3845 && !this.field3852);
      if (arg0 != -29) {
         this.method445((class179)null, (class220)null);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method405(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IZBII[II)Lcb;"
   )
   public final class177 method1404(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
      if (arg2 != 74) {
         this.method1429(-116);
      }

      return new class414(this, arg3, arg6, arg1, arg5, arg4, arg0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "ya",
      descriptor = "()V"
   )
   public final void method502() {
      this.method2287(true, 111);
      this.field2093.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ZLrl;)V"
   )
   public final void method1405(boolean arg0, class717 arg1) {
      this.field2093.SetTexture(this.field3793, arg1.method3244((byte)5));
      if (this.field2096[this.field3793] != arg1.field10518) {
         int var3 = method1367(arg1.field10518, 0);
         this.field2093.SetSamplerState(this.field3793, 6, var3);
         this.field2093.SetSamplerState(this.field3793, 5, var3);
         this.field2096[this.field3793] = arg1.field10518;
         if (this.field2100[this.field3793] != arg1.field10519) {
            this.field2093.SetSamplerState(this.field3793, 7, arg1.field10519 ? method1367(arg1.field10518, 0) : 0);
            this.field2100[this.field3793] = arg1.field10519;
         }
      } else if (this.field2100[this.field3793] != arg1.field10519) {
         this.field2093.SetSamplerState(this.field3793, 7, arg1.field10519 ? method1367(arg1.field10518, 0) : 0);
         this.field2100[this.field3793] = arg1.field10519;
      }

      if (arg0) {
         this.field2113 = false;
      }

      if (!this.field2109[this.field3793]) {
         this.field2109[this.field3793] = true;
         this.method1421(-8);
         this.method1408((byte)-49);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "B",
      descriptor = "(I)V"
   )
   public final void method1406(int arg0) {
      this.field2098.SetDirection(-this.field3803[0], -this.field3803[1], -this.field3803[2]);
      if (arg0 != 4) {
         this.field2095 = true;
      }

      this.field2089.SetDirection(-this.field3836[0], -this.field3836[1], -this.field3836[2]);
      this.field2095 = false;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "q",
      descriptor = "()V"
   )
   public final void method518() {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "y",
      descriptor = "()V"
   )
   public final void method393() {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lwn;ILdja;)Z"
   )
   public final boolean method1407(class576 arg0, int arg1, class45 arg2) {
      if (arg1 != -2) {
         this.method1403((byte)-109);
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return class760.method5514(25060, this.field2112.method5492(this.field2111, var4)) && class760.method5514(25060, this.field2112.CheckDeviceFormat(this.field2111, this.field2101, var4.Format, 0, 3, method1366(arg2, arg0, -31143)));
   }

   @OriginalMember(
      owner = "client!ub",
      name = "I",
      descriptor = "()I"
   )
   public final int method450() {
      return 0;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1408(byte arg0) {
      if (arg0 <= -37) {
         int var2 = this.field2109[this.field3793] ? method1378(this.field3875[this.field3793], 114) : 1;
         this.field2093.SetTextureStageState(this.field3793, 1, var2);
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ZZLwk;II)V"
   )
   public final void method1409(boolean arg0, boolean arg1, class255 arg2, int arg3, int arg4) {
      byte var7;
      if (~arg3 == -2) {
         var7 = 3;
      } else if (~arg3 != -3) {
         var7 = 2;
      } else {
         var7 = 26;
      }

      if (arg4 > -54) {
         this.field2095 = true;
      }

      int var8 = 0;
      if (arg1) {
         var8 |= 32;
      }

      if (arg0) {
         var8 |= 16;
      }

      this.field2093.SetTextureStageState(this.field3793, var7, method1386(arg2, false) | var8);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IZ)Lfi;"
   )
   public final class265 method1410(int arg0, boolean arg1) {
      return arg0 < 61 ? (class265)null : new class148(this, class576.field8542, arg1);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method476(int arg0, int arg1) throws class221 {
      this.field2093.EndScene();
      if (!this.field2107.method4840(103)) {
         if (++this.field2103 > 50) {
            throw new class221();
         }

         this.method1379((byte)-80);
      } else {
         this.field2103 = 0;
         if (class760.method5513(false, this.field2107.method4841(0, 0))) {
            this.method1379((byte)-93);
         }
      }

      this.field2093.BeginScene();
   }

   @OriginalMember(
      owner = "client!ub",
      name = "n",
      descriptor = "(B)V"
   )
   public final void method1411(byte arg0) {
      if (this.field2109[this.field3793]) {
         this.field2109[this.field3793] = false;
         this.field2093.SetTexture(this.field3793, (IDirect3DBaseTexture)null);
         this.method1421(-8);
         this.method1408((byte)-103);
      }

      if (arg0 != 93) {
         this.method1392(-78, (Canvas)null);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(I)V"
   )
   public final void method1412(int arg0) {
      if (arg0 < 51) {
         this.method1398(false, (byte)-123);
      }

      this.field2093.method5512(15, this.field3827);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ZIILqb;)V"
   )
   public final void method1413(boolean arg0, int arg1, int arg2, class68 arg3) {
      this.field2093.DrawPrimitive(method1417(1, arg3), arg2, arg1);
      if (!arg0) {
         method1417(23, (class68)null);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "h",
      descriptor = "()V"
   )
   public final void method507() {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method431(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!ub",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method1414(int arg0, int arg1) {
      this.field2093.SetTextureStageState(this.field3793, 11, arg1);
      int var3 = 69 % ((-26 - arg0) / 60);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lkc;Lkc;FLkc;)Lkc;"
   )
   public final class72 method407(class72 arg0, class72 arg1, float arg2, class72 arg3) {
      return !(arg2 < 0.5F) ? arg1 : arg0;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "m",
      descriptor = "(I)V"
   )
   public final void method1415(int arg0) {
      this.field2093.SetViewport(this.field3879, this.field3838, this.field3585, this.field3661, (float)arg0, 1.0F);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "w",
      descriptor = "(B)V"
   )
   public final void method1416(byte arg0) {
      if (arg0 >= 125) {
         this.field2093.method5512(174, this.field3903);
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ILqb;)I"
   )
   private static final int method1417(int arg0, class68 arg1) {
      if (class772.field11246 != arg1) {
         if (class665.field9857 != arg1) {
            if (class464.field6386 == arg1) {
               return 1;
            } else if (class629.field9286 != arg1) {
               if (class437.field5958 != arg1) {
                  if (class13.field246 == arg1) {
                     return 5;
                  } else {
                     if (arg0 != 1) {
                        field2090 = (float[])null;
                     }

                     throw new IllegalArgumentException("");
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
      owner = "client!ub",
      name = "g",
      descriptor = "(B)V"
   )
   public final void method1418(byte arg0) {
      this.field3871 = (float)(-this.field3831 + this.field3834);
      this.field3855 = (float)(-this.field3854) + this.field3871;
      if (this.field3855 < (float)this.field3874) {
         this.field3855 = (float)this.field3874;
      }

      this.field2093.method5498(36, this.field3855);
      this.field2093.method5498(37, this.field3871);
      if (arg0 > -125) {
         method1367((class782)null, -34);
      }

      this.field2093.SetRenderState(34, this.field3813);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IIILqb;IILfi;)V"
   )
   public final void method1419(int arg0, int arg1, int arg2, class68 arg3, int arg4, int arg5, class265 arg6) {
      if (arg2 <= 18) {
         this.field2109 = (boolean[])null;
      }

      this.field2093.SetIndices(((class148)arg6).field1847);
      this.field2093.DrawIndexedPrimitive(method1417(1, arg3), 0, arg0, arg5, arg1, arg4);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(BLjagdx/IDirect3D;IIILjagdx/D3DPRESENT_PARAMETERS;)Z"
   )
   private static final boolean method1420(byte arg0, IDirect3D arg1, int arg2, int arg3, int arg4, D3DPRESENT_PARAMETERS arg5) {
      if (arg0 != 115) {
         field2097 = (int[])null;
      }

      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
         if (class760.method5513(false, arg1.method5492(arg4, var9))) {
            return false;
         } else {
            label91:
            while(~arg3 <= -1) {
               if (arg3 != 1) {
                  var8 = arg3 + 0;

                  for(int var10 = 0; var10 < field2097.length; ++var10) {
                     if (0 == arg1.CheckDeviceType(arg4, arg2, var9.Format, field2097[var10], true) && arg1.CheckDeviceFormat(arg4, arg2, var9.Format, 1, 1, field2097[var10]) == 0 && (arg3 == 0 || arg1.CheckDeviceMultiSampleType(arg4, arg2, field2097[var10], true, var8) == 0)) {
                        for(int var11 = 0; field2086.length > var11; ++var11) {
                           if (-1 == ~arg1.CheckDeviceFormat(arg4, arg2, var9.Format, 2, 1, field2086[var11]) && arg1.CheckDepthStencilMatch(arg4, arg2, var9.Format, field2097[var10], field2086[var11]) == 0 && (arg3 == 0 || arg1.CheckDeviceMultiSampleType(arg4, arg2, field2086[var10], true, var8) == 0)) {
                              var7 = field2097[var10];
                              var6 = field2086[var11];
                              break label91;
                           }
                        }
                     }
                  }
               }

               --arg3;
            }

            if (0 <= arg3 && ~var7 != -1 && var6 != 0) {
               arg5.MultiSampleQuality = 0;
               arg5.AutoDepthStencilFormat = var6;
               arg5.BackBufferFormat = var7;
               arg5.MultiSampleType = var8;
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
      owner = "client!ub",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Lww;Ljava/lang/Integer;)Lha;"
   )
   public static final class479 createToolkit(Canvas arg0, class102 arg1, class339 arg2, Integer arg3) {
      class165 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class378 var7 = new class378();
         IDirect3D var8 = IDirect3D.method5490(-2147483616, var7);
         D3DCAPS var9 = var8.method5494(var5, var6);
         if ((var9.RasterCaps & 16777216) == 0) {
            throw new RuntimeException("");
         } else if (-3 < ~var9.MaxSimultaneousTextures) {
            throw new RuntimeException("");
         } else if (~(var9.TextureOpCaps & 2) != -1) {
            if ((8 & var9.TextureOpCaps) != 0) {
               if (~(64 & var9.TextureOpCaps) == -1) {
                  throw new RuntimeException("");
               } else if ((var9.TextureOpCaps & 512) != 0) {
                  if (~(var9.TextureOpCaps & 33554432) != -1) {
                     if ((16 & var9.DestBlendCaps & var9.SrcBlendCaps) != 0) {
                        if ((32 & var9.SrcBlendCaps & var9.DestBlendCaps) == 0) {
                           throw new RuntimeException("");
                        } else if (~(var9.DestBlendCaps & var9.SrcBlendCaps & 2) == -1) {
                           throw new RuntimeException("");
                        } else if (~var9.MaxActiveLights < -1 && 2 > var9.MaxActiveLights) {
                           throw new RuntimeException("");
                        } else if (5 <= var9.MaxStreams) {
                           D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                           if (!method1420((byte)115, var8, var6, arg3, var5, var10)) {
                              throw new RuntimeException("");
                           } else {
                              var10.EnableAutoDepthStencil = true;
                              var10.PresentationInterval = Integer.MIN_VALUE;
                              var10.Windowed = true;
                              int var11 = 2;
                              if (~(var9.DevCaps & 1048576) != -1) {
                                 var11 |= 16;
                              }

                              Object var12 = null;

                              IDirect3DDevice var13;
                              try {
                                 var13 = var8.method5493(var5, var6, arg0, 64 | var11, var10);
                              } catch (class759 var17) {
                                 var13 = var8.method5493(var5, var6, arg0, 32 | var11, var10);
                              }

                              class662 var15 = new class662(var13.method5497(0), var13.method5495());
                              var4 = new class165(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                              var4.method2243(65);
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
            var4.method401();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method1421(int arg0) {
      int var2 = this.field2109[this.field3793] ? method1378(this.field3842[this.field3793], 118) : 1;
      this.field2093.SetTextureStageState(this.field3793, 4, var2);
      if (arg0 != -8) {
         this.method1390((class255)null, false, -108, (byte)-38);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "l",
      descriptor = "(Z)V"
   )
   public final void method1422(boolean arg0) {
      if (!this.field2095) {
         this.field2093.LightEnable(0, false);
         this.field2093.LightEnable(1, false);
         this.field2093.SetLight(0, this.field2098);
         this.field2093.SetLight(1, this.field2089);
         this.field2093.LightEnable(0, true);
         this.field2093.LightEnable(1, true);
         this.field2095 = true;
      }

      if (arg0) {
         this.field2089 = (class758)null;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "(ZB)V"
   )
   public final void method1423(boolean arg0, byte arg1) {
      if (arg1 != -35) {
         this.field2104 = (IDirect3DVertexShader)null;
      }

      this.field2093.method5512(161, arg0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "f",
      descriptor = "()Z"
   )
   public final boolean method440() {
      return false;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "S",
      descriptor = "(I)V"
   )
   public final void method1424(int arg0) {
      for(int var2 = 0; this.field3829 > var2; ++var2) {
         this.field2093.SetSamplerState(var2, 7, 0);
         this.field2093.SetSamplerState(var2, 6, 2);
         this.field2093.SetSamplerState(var2, 5, 2);
         this.field2093.SetSamplerState(var2, 1, 1);
         this.field2093.SetSamplerState(var2, 2, 1);
         this.field2096[var2] = class206.field2625;
         this.field2099[var2] = this.field2087[var2] = true;
         this.field2100[var2] = false;
         this.field2088[var2] = 0;
      }

      this.field2093.SetTextureStageState(arg0, 6, 1);
      this.field2093.SetRenderState(9, 2);
      this.field2093.SetRenderState(23, 4);
      this.field2093.SetRenderState(25, 5);
      this.field2093.SetRenderState(24, 0);
      this.field2093.SetRenderState(22, 2);
      this.field2093.SetRenderState(147, 1);
      this.field2093.SetRenderState(145, 1);
      this.field2093.method5498(38, 0.95F);
      this.field2093.SetRenderState(140, 3);
      this.field2098.SetType(3);
      this.field2089.SetType(3);
      this.field2110.SetType(1);
      this.field2095 = false;
      super.method1424(0);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "j",
      descriptor = "(Z)V"
   )
   public final void method1425(boolean arg0) {
      if (!arg0) {
         this.field2099 = (boolean[])null;
      }

      if (this.field2104 == null && this.field3823[this.field3793] != class581.field8588) {
         if (this.field3823[this.field3793] == class152.field1892) {
            this.field2093.SetTransform(this.field3793 + 16, this.field3839[this.field3793].method4587((byte)-120, field2090));
         } else {
            this.field2093.SetTransform(16 - -this.field3793, this.field3839[this.field3793].method4585((byte)124, field2090));
         }

         int var2 = method1389((byte)16, this.field3823[this.field3793]);
         if (~this.field2088[this.field3793] != ~var2) {
            this.field2093.SetTextureStageState(this.field3793, 24, var2);
            this.field2088[this.field3793] = var2;
         }
      } else {
         this.field2093.SetTextureStageState(this.field3793, 24, 0);
         this.field2088[this.field3793] = 0;
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "h",
      descriptor = "(Z)V"
   )
   public final void method1426(boolean arg0) {
      this.field2093.method5512(7, this.field3794);
      if (arg0) {
         this.method1418((byte)7);
      }

   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(ZII[[I)Ltt;"
   )
   public final class531 method1427(boolean arg0, int arg1, int arg2, int[][] arg3) {
      if (arg1 != -8) {
         this.field2101 = -34;
      }

      return new class540(this, arg2, arg0, arg3);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Lcfa;B)V"
   )
   public final void method1428(class187 arg0, byte arg1) {
      if (arg1 < 46) {
         this.method1373(7, (class576)null, (class45)null);
      }

      int var3 = 0;
      if (class167.field2159 != arg0) {
         if (class494.field6892 != arg0) {
            if (class354.field4945 == arg0) {
               var3 = 196608;
            }
         } else {
            var3 = 131072;
         }
      } else {
         var3 = 65536;
      }

      this.field2093.SetTextureStageState(this.field3793, 11, this.field3793 | var3);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "U",
      descriptor = "(I)V"
   )
   public final void method1429(int arg0) {
      if (arg0 != 0) {
         this.field2110 = (class758)null;
      }

      this.field2093.SetScissorRect(this.field3879 - -this.field3872, this.field3838 - -this.field3844, this.field3850, this.field3809);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "F",
      descriptor = "(I)V"
   )
   public final void method1430(int arg0) {
      if (!this.field3806.method2493((byte)-91)) {
         field2090[6] = 0.0F;
         field2090[3] = 0.0F;
         field2090[5] = 1.0F;
         field2090[12] = 0.0F;
         field2090[11] = 0.0F;
         field2090[14] = 0.0F;
         field2090[8] = 0.0F;
         field2090[4] = 0.0F;
         field2090[9] = 0.0F;
         field2090[10] = 1.0F;
         field2090[2] = 0.0F;
         field2090[0] = 1.0F;
         field2090[13] = 0.0F;
         field2090[7] = 0.0F;
         field2090[15] = 1.0F;
         field2090[1] = 0.0F;
      } else {
         this.field3776.method4585((byte)79, field2090);
      }

      if (arg0 != 1) {
         this.field2107 = (class662)null;
      }

      this.field2093.SetTransform(2, field2090);
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1431(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1432(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
