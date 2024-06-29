import jaclib.peer.class701;
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
import jagdx.class508;
import jagdx.class509;
import jagdx.class510;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class582 extends class338 {
   @OriginalMember(
      owner = "client!fi",
      name = "bh",
      descriptor = "Z"
   )
   private boolean field8623 = false;
   @OriginalMember(
      owner = "client!fi",
      name = "ch",
      descriptor = "I"
   )
   private int field8622 = 0;
   @OriginalMember(
      owner = "client!fi",
      name = "Rg",
      descriptor = "I"
   )
   private int field8630;
   @OriginalMember(
      owner = "client!fi",
      name = "Lg",
      descriptor = "I"
   )
   private int field8634;
   @OriginalMember(
      owner = "client!fi",
      name = "Ug",
      descriptor = "Ljagdx/IDirect3DDevice;"
   )
   public IDirect3DDevice field8614;
   @OriginalMember(
      owner = "client!fi",
      name = "Qg",
      descriptor = "Ljagdx/D3DCAPS;"
   )
   public D3DCAPS field8629;
   @OriginalMember(
      owner = "client!fi",
      name = "Tg",
      descriptor = "Ljagdx/D3DPRESENT_PARAMETERS;"
   )
   private D3DPRESENT_PARAMETERS field8626;
   @OriginalMember(
      owner = "client!fi",
      name = "Xg",
      descriptor = "Ltb;"
   )
   private class419 field8621;
   @OriginalMember(
      owner = "client!fi",
      name = "ah",
      descriptor = "Ljagdx/IDirect3D;"
   )
   private IDirect3D field8615;
   @OriginalMember(
      owner = "client!fi",
      name = "Og",
      descriptor = "Ljaclib/peer/ia;"
   )
   public class701 field8631;
   @OriginalMember(
      owner = "client!fi",
      name = "Jg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class510 field8633;
   @OriginalMember(
      owner = "client!fi",
      name = "Mg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class510 field8616;
   @OriginalMember(
      owner = "client!fi",
      name = "Pg",
      descriptor = "Ljagdx/D3DLIGHT;"
   )
   private class510 field8636;
   @OriginalMember(
      owner = "client!fi",
      name = "Gg",
      descriptor = "Ljagdx/PixelBuffer;"
   )
   public PixelBuffer field8628;
   @OriginalMember(
      owner = "client!fi",
      name = "Zg",
      descriptor = "Ljagdx/GeometryBuffer;"
   )
   public GeometryBuffer field8624;
   @OriginalMember(
      owner = "client!fi",
      name = "Ng",
      descriptor = "Z"
   )
   public boolean field8632;
   @OriginalMember(
      owner = "client!fi",
      name = "Wg",
      descriptor = "Z"
   )
   public boolean field8620;
   @OriginalMember(
      owner = "client!fi",
      name = "Cg",
      descriptor = "Z"
   )
   public boolean field8613;
   @OriginalMember(
      owner = "client!fi",
      name = "Sg",
      descriptor = "[Z"
   )
   private boolean[] field8618;
   @OriginalMember(
      owner = "client!fi",
      name = "Hg",
      descriptor = "[I"
   )
   private int[] field8619;
   @OriginalMember(
      owner = "client!fi",
      name = "Kg",
      descriptor = "[Z"
   )
   private boolean[] field8617;
   @OriginalMember(
      owner = "client!fi",
      name = "Ig",
      descriptor = "[Luh;"
   )
   private class176[] field8635;
   @OriginalMember(
      owner = "client!fi",
      name = "Yg",
      descriptor = "[Z"
   )
   private boolean[] field8625;
   @OriginalMember(
      owner = "client!fi",
      name = "Fg",
      descriptor = "[Z"
   )
   private boolean[] field8612;
   @OriginalMember(
      owner = "client!fi",
      name = "dh",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8640 = method4297(method4296("2K;\nk\u0002\u0011\r"));
   @OriginalMember(
      owner = "client!fi",
      name = "Dg",
      descriptor = "[I"
   )
   private static int[] field8627 = new int[]{77, 80};
   @OriginalMember(
      owner = "client!fi",
      name = "Bg",
      descriptor = "[F"
   )
   private static float[] field8637 = new float[16];
   @OriginalMember(
      owner = "client!fi",
      name = "Vg",
      descriptor = "[I"
   )
   private static int[] field8639 = new int[]{22, 23};
   @OriginalMember(
      owner = "client!fi",
      name = "Eg",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field8638;

   @OriginalMember(
      owner = "client!fi",
      name = "v",
      descriptor = "()V"
   )
   public final void method624() {
      this.field8631.method5109((byte)-44);
      super.method624();
   }

   @OriginalMember(
      owner = "client!fi",
      name = "w",
      descriptor = "(B)V"
   )
   public final void method2572(byte arg0) {
      if (arg0 != -103) {
         this.field8630 = 119;
      }

      this.field8633.SetAmbient(this.field5082 * this.field5059, this.field5059 * this.field5047, this.field5062 * this.field5059, 0.0F);
      this.field8623 = false;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method627(int arg0, int arg1) throws class280 {
      this.field8614.EndScene();
      if (this.field8621.method3203((byte)-126)) {
         this.field8622 = 0;
         if (class508.method3767(this.field8621.method3200(0, (byte)12), false)) {
            this.method4284((byte)-51);
         }
      } else {
         if (-51 > ~(++this.field8622)) {
            throw new class280();
         }

         this.method4284((byte)-51);
      }

      this.field8614.BeginScene();
   }

   @OriginalMember(
      owner = "client!fi",
      name = "createToolkit",
      descriptor = "(Ljava/awt/Canvas;Ld;Leaa;Ljava/lang/Integer;)Lha;"
   )
   public static final class66 createToolkit(Canvas arg0, class160 arg1, class526 arg2, Integer arg3) {
      class582 var4 = null;

      try {
         byte var5 = 0;
         byte var6 = 1;
         class701 var7 = new class701();
         IDirect3D var8 = IDirect3D.method3769(-2147483616, var7);
         D3DCAPS var9 = var8.method3772(var5, var6);
         if ((16777216 & var9.RasterCaps) == 0) {
            throw new RuntimeException("");
         } else if (~var9.MaxSimultaneousTextures <= -3) {
            if (~(var9.TextureOpCaps & 2) != -1) {
               if ((8 & var9.TextureOpCaps) == 0) {
                  throw new RuntimeException("");
               } else if ((var9.TextureOpCaps & 64) != 0) {
                  if (~(512 & var9.TextureOpCaps) == -1) {
                     throw new RuntimeException("");
                  } else if (~(33554432 & var9.TextureOpCaps) == -1) {
                     throw new RuntimeException("");
                  } else if ((16 & var9.DestBlendCaps & var9.SrcBlendCaps) != 0) {
                     if ((var9.DestBlendCaps & var9.SrcBlendCaps & 32) != 0) {
                        if (~(var9.SrcBlendCaps & var9.DestBlendCaps & 2) != -1) {
                           if (-1 > ~var9.MaxActiveLights && 2 > var9.MaxActiveLights) {
                              throw new RuntimeException("");
                           } else if (-6 >= ~var9.MaxStreams) {
                              D3DPRESENT_PARAMETERS var10 = new D3DPRESENT_PARAMETERS(arg0);
                              if (method4288((byte)-105, var5, arg3, var10, var8, var6)) {
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
                                    var13 = var8.method3768(var5, var6, arg0, var11 | 64, var10);
                                 } catch (class509 var17) {
                                    var13 = var8.method3768(var5, var6, arg0, var11 | 32, var10);
                                 }

                                 class419 var15 = new class419(var13.method3774(0), var13.method3787());
                                 var4 = new class582(var5, var6, arg0, var7, var8, var13, var15, var10, var9, arg1, arg2, arg3);
                                 var4.method2668(111);
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
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var18) {
         if (var4 != null) {
            var4.method624();
         }

         throw var18;
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method543(boolean arg0) {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(ZI)Lcd;"
   )
   public final class331 method2579(boolean arg0, int arg1) {
      if (!arg0) {
         this.method597(117);
      }

      if (~arg1 != -4) {
         if (arg1 == 4) {
            return new class52(this, this.field4949, this.field4843);
         } else {
            return arg1 != 8 ? super.method2579(true, arg1) : new class340(this, this.field4949, this.field4843);
         }
      } else {
         return new class203(this, this.field4949);
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "ya",
      descriptor = "()V"
   )
   public final void method561() {
      this.method2551(18702, true);
      this.field8614.Clear(2, 0, 1.0F, 0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILjagdx/IDirect3DVertexShader;)V"
   )
   public final void method4283(int arg0, IDirect3DVertexShader arg1) {
      this.field8638 = arg1;
      int var3 = 121 / ((-41 - arg0) / 57);
      this.field8614.SetVertexShader(arg1);
      this.method2557((byte)-36);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ZB)Lhi;"
   )
   public final class215 method2670(boolean arg0, byte arg1) {
      if (arg1 > -44) {
         this.field8616 = (class510)null;
      }

      return new class517(this, class513.field7520, arg0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method605(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class280 {
      this.method627(arg2, arg3);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method2627(int arg0, int arg1) {
      if (arg0 < 33) {
         this.method640(47, -110, 88, 104, -0.9177672262533275D);
      }

      this.field8614.SetTextureStageState(this.field5087, 11, arg1);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method597(int arg0) {
      this.field8614.Clear(1, arg0, 0.0F, 0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "G",
      descriptor = "(B)Z"
   )
   private final boolean method4284(byte arg0) {
      int var2 = this.field8614.TestCooperativeLevel();
      if (var2 == 0 || var2 == -2005530519) {
         class419 var3 = (class419)this.field4964;
         this.method2587(arg0 ^ -51);
         var3.method3201(arg0 ^ 6092);
         this.field8626.BackBufferHeight = 0;
         this.field8626.BackBufferWidth = 0;
         if (method4288((byte)-105, this.field8630, this.field5049, this.field8626, this.field8615, this.field8634)) {
            int var4 = this.field8614.Reset(this.field8626);
            if (class508.method3766(var4, (byte)-44)) {
               var3.method3202(0, this.field8614.method3787(), this.field8614.method3774(0));
               this.method2640((byte)72);
               this.method2558((byte)107);
               return true;
            }
         }
      }

      if (arg0 != -51) {
         this.field8636 = (class510)null;
      }

      return false;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILcs;)I"
   )
   private static final int method4285(int arg0, class358 arg1) {
      if (class680.field10213 == arg1) {
         return 2;
      } else if (class556.field8257 == arg1) {
         return 4;
      } else if (class225.field2891 != arg1) {
         if (class325.field4618 != arg1) {
            if (class64.field793 != arg1) {
               if (arg0 <= 2) {
                  field8627 = (int[])null;
               }

               throw new IllegalArgumentException();
            } else {
               return 10;
            }
         } else {
            return 7;
         }
      } else {
         return 26;
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method640(int arg0, int arg1, int arg2, int arg3, double arg4) {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "f",
      descriptor = "(Z)V"
   )
   public final void method2643(boolean arg0) {
      this.field8614.method3778(15, this.field5006);
      if (arg0) {
         this.method2642((class163)null, (byte)-33);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "t",
      descriptor = "(B)V"
   )
   public final void method2560(byte arg0) {
      this.field5020 = (float)(-this.field5089 + this.field5028);
      this.field5093 = this.field5020 - (float)this.field5077;
      if ((float)this.field5096 > this.field5093) {
         this.field5093 = (float)this.field5096;
      }

      if (arg0 != 111) {
         this.method4290((byte)-103, (class615)null);
      }

      this.field8614.method3785(36, this.field5093);
      this.field8614.method3785(37, this.field5020);
      this.field8614.SetRenderState(34, this.field5083);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "i",
      descriptor = "(B)V"
   )
   public final void method2557(byte arg0) {
      int var2 = 41 % ((7 - arg0) / 32);
      if (this.field8638 == null && this.field5045[this.field5087] != class62.field773) {
         if (this.field5045[this.field5087] != class66.field817) {
            this.field8614.SetTransform(this.field5087 + 16, this.field5052[this.field5087].method3664(field8637, -15746));
         } else {
            this.field8614.SetTransform(16 - -this.field5087, this.field5052[this.field5087].method3680(field8637, -14812));
         }

         int var3 = method4294(110, this.field5045[this.field5087]);
         if (this.field8619[this.field5087] != var3) {
            this.field8614.SetTextureStageState(this.field5087, 24, var3);
            this.field8619[this.field5087] = var3;
         }
      } else {
         this.field8614.SetTextureStageState(this.field5087, 24, 0);
         this.field8619[this.field5087] = 0;
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lada;IIZZ)V"
   )
   public final void method2629(class173 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      int var6 = 65 / ((arg1 - -9) / 39);
      byte var8;
      if (~arg2 != -2) {
         if (~arg2 != -3) {
            var8 = 2;
         } else {
            var8 = 26;
         }
      } else {
         var8 = 3;
      }

      int var9 = 0;
      if (arg4) {
         var9 |= 32;
      }

      if (arg3) {
         var9 |= 16;
      }

      this.field8614.SetTextureStageState(this.field5087, var8, var9 | method4292(arg0, (byte)-122));
   }

   @OriginalMember(
      owner = "client!fi",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method2604(int arg0) {
      int var2 = !this.field8612[this.field5087] ? 1 : method4285(9, this.field5063[this.field5087]);
      this.field8614.SetTextureStageState(this.field5087, 4, var2);
      if (arg0 != -16090) {
         this.method2579(false, 125);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "j",
      descriptor = "(B)V"
   )
   public final void method2608(byte arg0) {
      this.field8614.method3778(7, this.field5100);
      int var2 = 112 / ((arg0 - -19) / 38);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Luaa;Luaa;FLuaa;)Luaa;"
   )
   public final class126 method608(class126 arg0, class126 arg1, float arg2, class126 arg3) {
      return 0.5F > arg2 ? arg0 : arg1;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "([Lrd;Z)Lib;"
   )
   public final class163 method2601(class354[] arg0, boolean arg1) {
      if (arg1) {
         this.field8633 = (class510)null;
      }

      return new dxVertexLayout(this, arg0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lef;Lii;B)Z"
   )
   public final boolean method2597(class513 arg0, class579 arg1, byte arg2) {
      if (arg2 != -109) {
         this.field8624 = (GeometryBuffer)null;
      }

      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      return class508.method3766(this.field8615.method3771(this.field8630, var4), (byte)-44) && class508.method3766(this.field8615.CheckDeviceFormat(this.field8630, this.field8634, var4.Format, 0, 3, method4287(false, arg0, arg1)), (byte)-44);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BLjagdx/IDirect3DPixelShader;)V"
   )
   public final void method4286(byte arg0, IDirect3DPixelShader arg1) {
      if (arg0 >= -119) {
         this.field8631 = (class701)null;
      }

      this.field8614.SetPixelShader(arg1);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method551(float arg0, float arg1, float arg2) {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BIZLii;I[FII)Loia;"
   )
   public final class95 method2563(byte arg0, int arg1, boolean arg2, class579 arg3, int arg4, float[] arg5, int arg6, int arg7) {
      int var9 = 20 % ((10 - arg0) / 59);
      return null;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "r",
      descriptor = "(B)V"
   )
   public final void method2594(byte arg0) {
      if (arg0 > 69) {
         int var2 = !this.field8612[this.field5087] ? 1 : method4285(32, this.field5040[this.field5087]);
         this.field8614.SetTextureStageState(this.field5087, 1, var2);
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "l",
      descriptor = "(I)V"
   )
   public final void method2660(int arg0) {
      if (arg0 != 1) {
         this.field8615 = (IDirect3D)null;
      }

      this.method2554(-118);
      this.method2625(0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lib;B)V"
   )
   public final void method2642(class163 arg0, byte arg1) {
      if (arg1 != 118) {
         this.method578(-44, 95);
      }

      dxVertexLayout var3 = (dxVertexLayout)arg0;
      this.field8614.SetVertexDeclaration(var3.field5154);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "U",
      descriptor = "(I)V"
   )
   public final void method2663(int arg0) {
      this.field8614.SetViewport(this.field5044, this.field5011, this.field4938, this.field4861, 0.0F, 1.0F);
      if (arg0 != -8) {
         this.method2558((byte)90);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IZ[[II)Lcea;"
   )
   public final class223 method2580(int arg0, boolean arg1, int[][] arg2, int arg3) {
      if (arg3 != -4944) {
         this.method2624((byte)-19);
      }

      return new class376(this, arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IIII[BIZLii;)Loia;"
   )
   public final class95 method2602(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, boolean arg6, class579 arg7) {
      if (arg3 != -8116) {
         this.field8614 = (IDirect3DDevice)null;
      }

      return new class542(this, arg7, arg1, arg2, arg6, arg4, arg0, arg5);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lvha;Z)V"
   )
   public final void method2635(class713 arg0, boolean arg1) {
      int var3 = 0;
      if (class448.field6808 != arg0) {
         if (class171.field2116 != arg0) {
            if (class104.field1257 == arg0) {
               var3 = 196608;
            }
         } else {
            var3 = 131072;
         }
      } else {
         var3 = 65536;
      }

      if (arg1) {
         this.field8614.SetTextureStageState(this.field5087, 11, var3 | this.field5087);
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "([BIIILii;I)Ldka;"
   )
   public final class13 method2615(byte[] arg0, int arg1, int arg2, int arg3, class579 arg4, int arg5) {
      if (arg5 != 512) {
         this.field8638 = (IDirect3DVertexShader)null;
      }

      return new class615(this, arg4, arg2, arg3, arg1, arg0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BLef;IILii;)Loia;"
   )
   public final class95 method2584(byte arg0, class513 arg1, int arg2, int arg3, class579 arg4) {
      int var6 = -63 / ((-5 - arg0) / 41);
      return new class542(this, arg4, arg1, arg3, arg2);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "E",
      descriptor = "(I)V"
   )
   public final void method2626(int arg0) {
      this.field8614.method3778(27, this.field5106);
      if (arg0 != 15) {
         this.field8628 = (PixelBuffer)null;
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "()V"
   )
   public final void method581() {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ZLef;Lii;)I"
   )
   public static final int method4287(boolean arg0, class513 arg1, class579 arg2) {
      if (class513.field7519 == arg1) {
         if (class70.field883 == arg2) {
            return 22;
         }

         if (class75.field963 == arg2) {
            return 21;
         }

         if (class740.field10984 == arg2) {
            return 28;
         }

         if (class128.field1559 == arg2) {
            return 50;
         }

         if (class158.field2002 == arg2) {
            return 51;
         }

         if (class614.field8987 == arg2) {
            return 77;
         }
      }

      if (arg0) {
         return -82;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lada;ZII)V"
   )
   public final void method2618(class173 arg0, boolean arg1, int arg2, int arg3) {
      int var5 = 0;
      byte var7;
      if (~arg3 != -2) {
         if (arg3 == 2) {
            var7 = 27;
         } else {
            var7 = 5;
         }
      } else {
         var7 = 6;
      }

      if (arg2 != 2) {
         this.field8632 = false;
      }

      if (arg1) {
         var5 |= 16;
      }

      this.field8614.SetTextureStageState(this.field5087, var7, method4292(arg0, (byte)-123) | var5);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(II)Llba;"
   )
   public final class575 method578(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "x",
      descriptor = "(B)V"
   )
   public final void method2603(byte arg0) {
      this.field8614.SetRenderState(60, this.field5064);
      if (arg0 != 88) {
         this.field8618 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method2556(boolean arg0, int arg1) {
      this.field8614.method3778(161, arg0);
      if (arg1 != -26182) {
         this.method608((class126)null, (class126)null, -1.0980874F, (class126)null);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILgp;I)V"
   )
   public final void method2659(int arg0, class53 arg1, int arg2) {
      if (arg0 >= 101) {
         class439 var4 = (class439)arg1;
         this.field8614.SetStreamSource(arg2, var4.field6692, 0, var4.method3321(-94));
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BIILjagdx/D3DPRESENT_PARAMETERS;Ljagdx/IDirect3D;I)Z"
   )
   private static final boolean method4288(byte arg0, int arg1, int arg2, D3DPRESENT_PARAMETERS arg3, IDirect3D arg4, int arg5) {
      int var6 = 0;
      int var7 = 0;
      if (arg0 != -105) {
         return true;
      } else {
         int var8 = 0;

         try {
            D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
            if (class508.method3767(arg4.method3771(arg1, var9), false)) {
               return false;
            } else {
               label90:
               while(arg2 >= 0) {
                  if (arg2 != 1) {
                     var8 = arg2 + 0;

                     for(int var10 = 0; ~field8639.length < ~var10; ++var10) {
                        if (0 == arg4.CheckDeviceType(arg1, arg5, var9.Format, field8639[var10], true) && ~arg4.CheckDeviceFormat(arg1, arg5, var9.Format, 1, 1, field8639[var10]) == -1 && (arg2 == 0 || -1 == ~arg4.CheckDeviceMultiSampleType(arg1, arg5, field8639[var10], true, var8))) {
                           for(int var11 = 0; ~field8627.length < ~var11; ++var11) {
                              if (0 == arg4.CheckDeviceFormat(arg1, arg5, var9.Format, 2, 1, field8627[var11]) && arg4.CheckDepthStencilMatch(arg1, arg5, var9.Format, field8639[var10], field8627[var11]) == 0 && (arg2 == 0 || arg4.CheckDeviceMultiSampleType(arg1, arg5, field8627[var10], true, var8) == 0)) {
                                 var7 = field8639[var10];
                                 var6 = field8627[var11];
                                 break label90;
                              }
                           }
                        }
                     }
                  }

                  --arg2;
               }

               if (0 <= arg2 && ~var7 != -1 && var6 != 0) {
                  arg3.BackBufferFormat = var7;
                  arg3.MultiSampleQuality = 0;
                  arg3.MultiSampleType = var8;
                  arg3.AutoDepthStencilFormat = var6;
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
      owner = "client!fi",
      name = "a",
      descriptor = "(ILdn;)V"
   )
   public final void method4289(int arg0, class542 arg1) {
      this.method4293((byte)58, arg1);
      if (arg1.field7899 == !this.field8617[this.field5087]) {
         this.field8614.SetSamplerState(this.field5087, 1, arg1.field7899 ? 1 : 3);
         this.field8617[this.field5087] = arg1.field7899;
      }

      if (arg0 != -20474) {
         this.method2643(true);
      }

      if (arg1.field7895 == !this.field8618[this.field5087]) {
         this.field8614.SetSamplerState(this.field5087, 2, !arg1.field7895 ? 3 : 1);
         this.field8618[this.field5087] = arg1.field7895;
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "q",
      descriptor = "(I)V"
   )
   public final void method2589(int arg0) {
      int var2;
      for(var2 = 0; this.field5105 > var2; ++var2) {
         class744 var3 = this.field5050[var2];
         int var4 = var2 - -2;
         int var5 = var3.method5421(-66);
         float var6 = var3.method5422((byte)67) / 255.0F;
         this.field8636.SetPosition((float)var3.method5420(true), (float)var3.method5423(3378), (float)var3.method5425((byte)-81));
         this.field8636.SetDiffuse((float)((16713156 & var5) >> 16) * var6, (float)(255 & var5 >> 8) * var6, (float)(var5 & 255) * var6, 0.0F);
         this.field8636.SetAttenuation(0.0F, 0.0F, 1.0F / (float)(var3.method5424(34065) * var3.method5424(34065)));
         this.field8636.SetRange((float)var3.method5424(34065));
         this.field8614.SetLight(var4, this.field8636);
         this.field8614.LightEnable(var4, true);
      }

      while(~this.field5027 < ~var2) {
         this.field8614.LightEnable(var2 - -2, false);
         ++var2;
      }

      int var7 = -52 % ((arg0 - -29) / 61);
      super.method2589(116);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "c",
      descriptor = "()V"
   )
   public final void method616() {
      IDirect3DEventQuery var1 = this.field8614.method3779();
      if (class508.method3766(var1.Issue(), (byte)-44)) {
         while(true) {
            int var2 = var1.IsSignaled();
            if (~var2 != -2) {
               break;
            }

            Thread.yield();
         }
      }

      var1.method5106(true);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IIIILnda;ILhi;)V"
   )
   public final void method2628(int arg0, int arg1, int arg2, int arg3, class583 arg4, int arg5, class215 arg6) {
      this.field8614.SetIndices(((class517)arg6).field7550);
      if (arg3 != 16) {
         this.method569(-30, 81, 15, -94);
      }

      this.field8614.DrawIndexedPrimitive(method4295(0, arg4), 0, arg2, arg0, arg1, arg5);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(II[IIIZI)Loia;"
   )
   public final class95 method2676(int arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int arg6) {
      if (arg0 != 16777215) {
         this.field8629 = (D3DCAPS)null;
      }

      return new class542(this, arg1, arg3, arg5, arg2, arg4, arg6);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method633(int arg0, int arg1, int arg2, int arg3) {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method638(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V"
   )
   public final void method2679(boolean arg0, Object arg1, Canvas arg2) {
      if (arg0) {
         this.method2624((byte)-115);
      }

      if (this.field4818 == arg2) {
         Dimension var4 = arg2.getSize();
         if (var4.width > 0 && 0 < var4.height) {
            this.field8614.EndScene();
            this.method4284((byte)-51);
            this.field8614.BeginScene();
         }
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILef;Lii;)Z"
   )
   public final boolean method2591(int arg0, class513 arg1, class579 arg2) {
      D3DDISPLAYMODE var4 = new D3DDISPLAYMODE();
      if (arg0 != 5395) {
         field8627 = (int[])null;
      }

      return class508.method3766(this.field8615.method3771(this.field8630, var4), (byte)-44) && class508.method3766(this.field8615.CheckDeviceFormat(this.field8630, this.field8634, var4.Format, 0, 4, method4287(false, arg1, arg2)), (byte)-44);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lsea;)V"
   )
   public final void method566(class725 arg0) {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BLnda;II)V"
   )
   public final void method2639(byte arg0, class583 arg1, int arg2, int arg3) {
      this.field8614.DrawPrimitive(method4295(0, arg1), arg3, arg2);
      if (arg0 != 28) {
         this.method4293((byte)20, (class422)null);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(IZ)Lgp;"
   )
   public final class53 method2610(int arg0, boolean arg1) {
      return arg0 != -2 ? (class53)null : new class439(this, arg1);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method651() {
      return false;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "d",
      descriptor = "(II)Lps;"
   )
   public final class103 method568(int arg0, int arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BLot;)V"
   )
   public final void method4290(byte arg0, class615 arg1) {
      this.method4293((byte)58, arg1);
      if (!this.field8617[this.field5087]) {
         this.field8614.SetSamplerState(this.field5087, 1, 1);
         this.field8617[this.field5087] = true;
      }

      if (!this.field8618[this.field5087]) {
         this.field8614.SetSamplerState(this.field5087, 2, 1);
         this.field8618[this.field5087] = true;
      }

      int var3 = 11 / ((arg0 - -65) / 41);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method2625(int arg0) {
      if (arg0 == 0) {
         if (!this.field8623) {
            this.field8614.LightEnable(0, false);
            this.field8614.LightEnable(1, false);
            this.field8614.SetLight(0, this.field8633);
            this.field8614.SetLight(1, this.field8616);
            this.field8614.LightEnable(0, true);
            this.field8614.LightEnable(1, true);
            this.field8623 = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V"
   )
   public final void method2548(Canvas arg0, int arg1, Object arg2) {
      if (arg1 == 2269) {
         this.field8621 = (class419)arg2;
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "y",
      descriptor = "(I)V"
   )
   public final void method2588(int arg0) {
      if (!this.field5018.method2074(31348)) {
         field8637[7] = 0.0F;
         field8637[10] = 1.0F;
         field8637[14] = 0.0F;
         field8637[13] = 0.0F;
         field8637[12] = 0.0F;
         field8637[15] = 1.0F;
         field8637[2] = 0.0F;
         field8637[9] = 0.0F;
         field8637[4] = 0.0F;
         field8637[3] = 0.0F;
         field8637[5] = 1.0F;
         field8637[0] = 1.0F;
         field8637[6] = 0.0F;
         field8637[8] = 0.0F;
         field8637[11] = 0.0F;
         field8637[1] = 0.0F;
      } else {
         this.field5003.method3664(field8637, -15746);
      }

      this.field8614.SetTransform(2, field8637);
      if (arg0 != -4756) {
         this.field8634 = -18;
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "I",
      descriptor = "(I)V"
   )
   public final void method2592(int arg0) {
      int var2 = -89 / ((-10 - arg0) / 63);
      this.field8614.method3778(137, this.field5048 && !this.field5054);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "v",
      descriptor = "(B)V"
   )
   public final void method2624(byte arg0) {
      this.field8614.method3778(174, this.field5130);
      int var2 = -27 / ((arg0 - -75) / 32);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "I",
      descriptor = "()I"
   )
   public final int method631() {
      return 0;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "W",
      descriptor = "(I)V"
   )
   public final void method2561(int arg0) {
      this.field8614.SetTransform(3, this.field5031);
      if (arg0 != 21113) {
         this.method640(69, -83, 92, -41, -0.9364905251304502D);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V"
   )
   public final void method2631(int arg0, Canvas arg1, Object arg2) {
      if (arg0 < 61) {
         this.method578(13, -63);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method569(int arg0, int arg1, int arg2, int arg3) {
      int[] var5 = null;
      IDirect3DSurface var6 = this.field8614.method3773(0);
      IDirect3DSurface var7 = this.field8614.method3788(arg2, arg3, 21, 0, 0, true);
      if (class508.method3766(this.field8614.StretchRect(var6, arg0, arg1, arg2, arg3, var7, 0, 0, arg2, arg3, 0), (byte)-44) && class508.method3766(var7.LockRect(0, 0, arg2, arg3, 16, this.field8628), (byte)-44)) {
         var5 = new int[arg2 * arg3];
         int var8 = this.field8628.getRowPitch();
         if (~(arg2 * 4) != ~var8) {
            for(int var9 = 0; arg3 > var9; ++var9) {
               this.field8628.method3795(var5, arg2 * var9, var8 * var9, arg2);
            }
         } else {
            this.field8628.method3795(var5, 0, 0, arg2 * arg3);
         }

         var7.UnlockRect();
      }

      var6.method5106(true);
      var7.method5106(true);
      return var5;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method555(int arg0) {
      this.field8631.method5108(-5708);
      super.method555(arg0);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method2585(int arg0) {
      if (arg0 != Integer.MIN_VALUE) {
         this.method2615((byte[])null, 118, -63, 38, (class579)null, -18);
      }

      this.field8614.SetScissorRect(this.field5044 - -this.field5038, this.field5016 + this.field5011, this.field5013, this.field5025);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ZLuh;)I"
   )
   private static final int method4291(boolean arg0, class176 arg1) {
      if (arg0) {
         field8637 = (float[])null;
      }

      if (class524.field7600 != arg1) {
         if (class711.field10617 == arg1) {
            return 1;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         return 2;
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "u",
      descriptor = "(I)F"
   )
   public final float method2674(int arg0) {
      return arg0 != 30807 ? 1.5715476F : -0.5F;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "b",
      descriptor = "()Lqha;"
   )
   public final class110 method595() {
      D3DADAPTER_IDENTIFIER var1 = this.field8615.method3770(this.field8630, 0);
      return new class110(var1.VendorID, field8640, 9, var1.Description, var1.DriverVersion);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "<init>",
      descriptor = "(IILjava/awt/Canvas;Ljaclib/peer/ia;Ljagdx/IDirect3D;Ljagdx/IDirect3DDevice;Ltb;Ljagdx/D3DPRESENT_PARAMETERS;Ljagdx/D3DCAPS;Ld;Leaa;I)V"
   )
   private class582(int arg0, int arg1, Canvas arg2, class701 arg3, IDirect3D arg4, IDirect3DDevice arg5, class419 arg6, D3DPRESENT_PARAMETERS arg7, D3DCAPS arg8, class160 arg9, class526 arg10, int arg11) {
      super(arg2, arg6, arg9, arg10, arg11, 0);

      try {
         this.field8630 = arg0;
         this.field8634 = arg1;
         this.field8614 = arg5;
         this.field8629 = arg8;
         this.field8626 = arg7;
         this.field8621 = arg6;
         this.field8615 = arg4;
         this.field8631 = arg3;
         this.field8633 = new class510(this.field8631);
         this.field8616 = new class510(this.field8631);
         this.field8636 = new class510(this.field8631);
         this.field8628 = new PixelBuffer(this.field8631);
         this.field8624 = new GeometryBuffer(this.field8631);
         new GeometryBuffer(this.field8631);
         this.field5055 = this.field8629.MaxSimultaneousTextures;
         this.field8632 = ~(2 & this.field8629.TextureCaps) == -1;
         this.field8620 = ~(this.field8629.TextureCaps & 65536) != -1;
         this.field5015 = 0 < this.field8629.MaxActiveLights ? this.field8629.MaxActiveLights : 8;
         this.field5019 = (this.field8629.TextureCaps & 8192) != 0;
         this.field8613 = ~(16384 & this.field8629.TextureCaps) != -1;
         this.field5056 = (this.field8629.TextureCaps & 2048) != 0;
         this.field5076 = -1 > ~this.field5049 || 0 == this.field8615.CheckDeviceMultiSampleType(this.field8630, this.field8634, this.field8626.BackBufferFormat, true, 2);
         this.field8618 = new boolean[this.field5055];
         this.field8619 = new int[this.field5055];
         this.field8617 = new boolean[this.field5055];
         this.field8635 = new class176[this.field5055];
         this.field8625 = new boolean[this.field5055];
         this.field8612 = new boolean[this.field5055];
         this.field8614.BeginScene();
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method653(-124);
         throw new RuntimeException("");
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lps;Llba;)Lsea;"
   )
   public final class725 method541(class103 arg0, class575 arg1) {
      return null;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "w",
      descriptor = "(I)V"
   )
   public final void method2682(int arg0) {
      this.field8633.SetDirection(-this.field5057[0], -this.field5057[1], -this.field5057[2]);
      this.field8616.SetDirection(-this.field5023[0], -this.field5023[arg0], -this.field5023[2]);
      this.field8623 = false;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;"
   )
   public final Object method2678(Canvas arg0, int arg1) {
      if (arg1 != -1) {
         this.method2615((byte[])null, 63, -37, 59, (class579)null, -55);
      }

      return null;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "C",
      descriptor = "(B)V"
   )
   public final void method2645(byte arg0) {
      if (arg0 < 110) {
         this.method2554(76);
      }

      if (this.field8612[this.field5087]) {
         this.field8612[this.field5087] = false;
         this.field8614.SetTexture(this.field5087, (IDirect3DBaseTexture)null);
         this.method2604(-16090);
         this.method2594((byte)112);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "R",
      descriptor = "(I)V"
   )
   public final void method2598(int arg0) {
      this.field8614.method3778(14, this.field5085 && this.field5092);
      if (arg0 != -21822) {
         this.method2554(86);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method2558(byte arg0) {
      int var2 = 0;
      if (arg0 < 84) {
         this.field8631 = (class701)null;
      }

      while(~var2 > ~this.field5055) {
         this.field8614.SetSamplerState(var2, 7, 0);
         this.field8614.SetSamplerState(var2, 6, 2);
         this.field8614.SetSamplerState(var2, 5, 2);
         this.field8614.SetSamplerState(var2, 1, 1);
         this.field8614.SetSamplerState(var2, 2, 1);
         this.field8635[var2] = class524.field7600;
         this.field8617[var2] = this.field8618[var2] = true;
         this.field8625[var2] = false;
         this.field8619[var2] = 0;
         ++var2;
      }

      this.field8614.SetTextureStageState(0, 6, 1);
      this.field8614.SetRenderState(9, 2);
      this.field8614.SetRenderState(23, 4);
      this.field8614.SetRenderState(25, 5);
      this.field8614.SetRenderState(24, 0);
      this.field8614.SetRenderState(22, 2);
      this.field8614.SetRenderState(147, 1);
      this.field8614.SetRenderState(145, 1);
      this.field8614.method3785(38, 0.95F);
      this.field8614.SetRenderState(140, 3);
      this.field8633.SetType(3);
      this.field8616.SetType(3);
      this.field8636.SetType(1);
      this.field8623 = false;
      super.method2558((byte)115);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "Q",
      descriptor = "(I)V"
   )
   public final void method2586(int arg0) {
      if (class279.field3890 == this.field5079) {
         this.field8614.SetRenderState(19, 5);
         this.field8614.SetRenderState(20, 6);
      } else if (class564.field8414 == this.field5079) {
         this.field8614.SetRenderState(19, 2);
         this.field8614.SetRenderState(20, 2);
      } else if (class739.field10971 == this.field5079) {
         this.field8614.SetRenderState(19, 9);
         this.field8614.SetRenderState(20, 2);
      }

      if (arg0 > -116) {
         this.field8612 = (boolean[])null;
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(Lada;B)I"
   )
   private static final int method4292(class173 arg0, byte arg1) {
      if (class496.field7336 == arg0) {
         return 2;
      } else if (class219.field2784 == arg0) {
         return 0;
      } else if (class309.field4402 == arg0) {
         return 1;
      } else if (class522.field7591 == arg0) {
         return 3;
      } else {
         int var2 = -33 % ((arg1 - -65) / 57);
         throw new IllegalArgumentException();
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method657() {
      return false;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(BLga;)V"
   )
   public final void method4293(byte arg0, class422 arg1) {
      this.field8614.SetTexture(this.field5087, arg1.method2911(10183));
      if (this.field8635[this.field5087] != arg1.field6417) {
         int var3 = method4291(false, arg1.field6417);
         this.field8614.SetSamplerState(this.field5087, 6, var3);
         this.field8614.SetSamplerState(this.field5087, 5, var3);
         this.field8635[this.field5087] = arg1.field6417;
         if (!this.field8625[this.field5087] != !arg1.field6416) {
            this.field8614.SetSamplerState(this.field5087, 7, !arg1.field6416 ? 0 : method4291(false, arg1.field6417));
            this.field8625[this.field5087] = arg1.field6416;
         }
      } else if (this.field8625[this.field5087] != arg1.field6416) {
         this.field8614.SetSamplerState(this.field5087, 7, !arg1.field6416 ? 0 : method4291(false, arg1.field6417));
         this.field8625[this.field5087] = arg1.field6416;
      }

      if (arg0 != 58) {
         this.field8623 = false;
      }

      if (!this.field8612[this.field5087]) {
         this.field8612[this.field5087] = true;
         this.method2604(arg0 ^ -16100);
         this.method2594((byte)103);
      }

   }

   @OriginalMember(
      owner = "client!fi",
      name = "O",
      descriptor = "(I)V"
   )
   public final void method2554(int arg0) {
      float var2 = this.field5066 ? this.field5024 : 0.0F;
      float var3 = !this.field5066 ? 0.0F : -this.field5072;
      this.field8633.SetDiffuse(this.field5082 * var2, this.field5047 * var2, this.field5062 * var2, 0.0F);
      this.field8616.SetDiffuse(this.field5082 * var3, this.field5047 * var3, this.field5062 * var3, 0.0F);
      if (arg0 >= -87) {
         this.method2610(104, false);
      }

      this.field8623 = false;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "f",
      descriptor = "()V"
   )
   public final void method549() {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "F",
      descriptor = "(B)V"
   )
   public final void method2664(byte arg0) {
      if (arg0 >= -30) {
         this.field8621 = (class419)null;
      }

      if (!this.field4997) {
         this.field4998.method3664(field8637, -15746);
      } else {
         field8637[11] = 0.0F;
         field8637[5] = 1.0F;
         field8637[1] = 0.0F;
         field8637[15] = 1.0F;
         field8637[13] = 0.0F;
         field8637[3] = 0.0F;
         field8637[7] = 0.0F;
         field8637[14] = 0.0F;
         field8637[9] = 0.0F;
         field8637[2] = 0.0F;
         field8637[4] = 0.0F;
         field8637[8] = 0.0F;
         field8637[6] = 0.0F;
         field8637[12] = 0.0F;
         field8637[10] = 1.0F;
         field8637[0] = 1.0F;
      }

      this.field8614.SetTransform(256, field8637);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "A",
      descriptor = "(I)V"
   )
   public final void method2648(int arg0) {
      int var2 = -51 % ((-65 - arg0) / 54);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "p",
      descriptor = "()V"
   )
   public final void method614() {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILpn;)I"
   )
   private static final int method4294(int arg0, class776 arg1) {
      if (class205.field2635 != arg1) {
         if (class66.field817 != arg1) {
            if (class180.field2210 == arg1) {
               return 3;
            } else if (class623.field9078 == arg1) {
               return 4;
            } else if (class277.field3861 != arg1) {
               int var2 = 105 / ((arg0 - -56) / 63);
               return 0;
            } else {
               return 256;
            }
         } else {
            return 2;
         }
      } else {
         return 1;
      }
   }

   @OriginalMember(
      owner = "client!fi",
      name = "h",
      descriptor = "(B)V"
   )
   public final void method2581(byte arg0) {
      this.field8614.method3778(28, this.field5090 && this.field5030 && ~this.field5077 <= -1);
      int var2 = 19 % ((arg0 - -53) / 63);
   }

   @OriginalMember(
      owner = "client!fi",
      name = "w",
      descriptor = "()V"
   )
   public final void method647() {
   }

   @OriginalMember(
      owner = "client!fi",
      name = "a",
      descriptor = "(ILnda;)I"
   )
   private static final int method4295(int arg0, class583 arg1) {
      if (class10.field142 != arg1) {
         if (class288.field4042 != arg1) {
            if (class246.field3166 == arg1) {
               return 1;
            } else if (class260.field3546 != arg1) {
               if (class264.field3616 == arg1) {
                  return 6;
               } else if (class214.field2716 == arg1) {
                  return 5;
               } else if (arg0 != 0) {
                  return -26;
               } else {
                  throw new IllegalArgumentException("");
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
      owner = "client!fi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4296(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4297(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
