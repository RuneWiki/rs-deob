import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public class class325 extends class242 {
   @OriginalMember(
      owner = "client!qja",
      name = "r",
      descriptor = "Lvea;"
   )
   private class287 field4667;
   @OriginalMember(
      owner = "client!qja",
      name = "p",
      descriptor = "Lqu;"
   )
   private class105 field4670;
   @OriginalMember(
      owner = "client!qja",
      name = "t",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4673;
   @OriginalMember(
      owner = "client!qja",
      name = "q",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field4668;
   @OriginalMember(
      owner = "client!qja",
      name = "o",
      descriptor = "Z"
   )
   private boolean field4671;
   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4674 = new String[]{method2524(method2523("\tlI\tm\u0003lR\u0005q\u0018]R\u0001o\u001cg[?h\rvZ\u0012@\u001a")), method2524(method2523("\bz")), method2524(method2523("\tlI\tm\u0003lR\u0005q\u0018]R\u0001o\u001cg[?h\rvZ\u0012@\n"))};
   @OriginalMember(
      owner = "client!qja",
      name = "s",
      descriptor = "[F"
   )
   private static float[] field4669 = new float[16];
   @OriginalMember(
      owner = "client!qja",
      name = "n",
      descriptor = "Z"
   )
   private boolean field4672;

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      if (arg2 >= -64) {
         this.method73(40, 15, (class47)null);
      }

      if (this.field4672) {
         IDirect3DDevice var4 = this.field4667.field4018;
         int var5 = 1 << (arg0 & 3);
         float var6 = (float)(1 << (7 & arg0 >> 3)) / 32.0F;
         int var7 = arg1 & 65535;
         var4.method3817(14, (float)(this.field3498.field5227 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         float var8 = (float)((arg1 & 251846) >> 16) / 8.0F;
         var4.method3817(15, var6, 0.0F, 0.0F, 0.0F);
         var4.method3819(4, (float)var7, 0.0F, 0.0F, 0.0F);
         var4.method3819(5, var8, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method68(int arg0) {
      int var2 = -21 / ((arg0 - 27) / 34);
      if (this.field4672) {
         this.field4667.method2234(36, (IDirect3DVertexShader)null);
         this.field4667.method2236((IDirect3DPixelShader)null, (byte)3);
         this.field3498.method2767((byte)-112, 1);
         this.field3498.method2806(false, (class47)null);
         this.field3498.method2767((byte)-112, 0);
         this.field3498.method2806(false, (class47)null);
         this.field4672 = false;
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1596(byte arg0) {
      int var2 = 93 % ((arg0 - -39) / 62);
      if (this.field4672) {
         IDirect3DDevice var3 = this.field4667.field4018;
         class104 var4 = this.field4667.method2775((byte)-119);
         var3.method3816(0, var4.method1012((byte)-28, field4669));
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method70(boolean arg0, boolean arg1) {
      if (!arg0) {
         this.field4671 = true;
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method69(int arg0) {
      if (arg0 != 30453) {
         this.field4667 = (class287)null;
      }

      return this.field4671;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "<init>",
      descriptor = "(Lvea;Lhw;Lqu;)V"
   )
   public class325(class287 arg0, class141 arg1, class105 arg2) {
      super(arg0);
      this.field4667 = arg0;
      this.field4670 = arg2;
      if (arg1 != null && this.field3498.field5293 && this.field3498.field5242 && (65535 & this.field4667.field4014.VertexShaderVersion) >= 257) {
         this.field4673 = this.field4667.field4018.method3805(arg1.method1348(field4674[1], field4674[0], 32));
         this.field4668 = this.field4667.field4018.method3806(arg1.method1348(field4674[1], field4674[2], 42));
         this.field4671 = this.field4673 != null && this.field4668 != null && this.field4670.method1021((byte)66);
      } else {
         this.field4671 = false;
         this.field4668 = null;
         this.field4673 = null;
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(IILbt;)V"
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      if (arg1 <= 12) {
         this.method65(-16, -81, (byte)-53);
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method74(int arg0) {
      if (this.field4672) {
         IDirect3DDevice var2 = this.field4667.field4018;
         if (this.field3498.field5310 <= 0) {
            var2.method3817(16, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field3498.field5238;
            float var4 = this.field3498.field5301;
            var2.method3817(16, var3, 1.0F / (-var4 + var3), 0.0F, 0.0F);
         }

         var2.method3819(0, (float)(255 & this.field3498.field5319 >> 16) / 255.0F, (float)((this.field3498.field5319 & 65431) >> 8) / 255.0F, (float)(this.field3498.field5319 & 255) / 255.0F, 0.0F);
      }

      if (arg0 != -1) {
         this.method74(47);
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method72(boolean arg0, int arg1) {
      if (arg1 != -29461) {
         this.method65(-112, 98, (byte)-72);
      }

      class568 var3 = this.field3498.method2740((byte)83);
      if (this.field4671 && var3 != null) {
         IDirect3DDevice var4 = this.field4667.field4018;
         this.field4667.method2234(36, this.field4673);
         this.field4667.method2236(this.field4668, (byte)3);
         this.field3498.method2767((byte)-112, 1);
         this.field3498.method2806(false, var3);
         this.field3498.method2767((byte)-112, 0);
         this.field3498.method2806(false, this.field4670.field1745);
         this.field4672 = true;
         this.method1599((byte)-125);
         this.method1598(arg1 ^ -29563);
         this.method1597(25728);
         this.method74(-1);
         var4.method3819(1, -this.field3498.field5260[0], -this.field3498.field5260[1], -this.field3498.field5260[2], 0.0F);
         var4.method3819(2, this.field3498.field5274, this.field3498.field5313, this.field3498.field5324, 1.0F);
         var4.method3819(3, 96.0F + 928.0F * Math.abs(this.field3498.field5260[1]), 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1599(byte arg0) {
      if (arg0 > -96) {
         this.method72(true, -61);
      }

      if (this.field4672) {
         IDirect3DDevice var2 = this.field4667.field4018;
         class104 var3 = this.field4667.method2808(0);
         class104 var4 = this.field4667.method2775((byte)88);
         var2.method3816(0, var4.method1012((byte)-28, field4669));
         var2.method3816(4, var3.method1000(8, field4669));
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1598(int arg0) {
      if (this.field4672) {
         IDirect3DDevice var2 = this.field4667.field4018;
         class104 var3 = this.field3498.method2794(false);
         var2.SetVertexShaderConstantF(12, var3.method995((byte)-116, field4669), 2);
      }

      if (arg0 <= 54) {
         this.method1596((byte)-12);
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1597(int arg0) {
      if (this.field4672) {
         IDirect3DDevice var2 = this.field4667.field4018;
         var2.method3816(8, this.field3498.method2763(field4669, (byte)-125));
      }

      if (arg0 != 25728) {
         this.field4672 = false;
      }

   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
