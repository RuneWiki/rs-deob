import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class10 extends class550 {
   @OriginalMember(
      owner = "client!hk",
      name = "m",
      descriptor = "Z"
   )
   private boolean field120 = false;
   @OriginalMember(
      owner = "client!hk",
      name = "p",
      descriptor = "Leb;"
   )
   private class163 field124;
   @OriginalMember(
      owner = "client!hk",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field123;
   @OriginalMember(
      owner = "client!hk",
      name = "q",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field122;
   @OriginalMember(
      owner = "client!hk",
      name = "j",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field121;
   @OriginalMember(
      owner = "client!hk",
      name = "t",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field119;
   @OriginalMember(
      owner = "client!hk",
      name = "u",
      descriptor = "Z"
   )
   private boolean field129;
   @OriginalMember(
      owner = "client!hk",
      name = "s",
      descriptor = "Lbc;"
   )
   private class282 field128;
   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field131 = new String[]{method81(method80("}[")), method81(method80("lTjI\u000evV[J#lMYG\b")), method81(method80("lTjI\u000evV[J#uJA")), method81(method80("lTjC\u0013}FYq\twO\\Z")), method81(method80("lTjC\u0013}FYq\u0010pW"))};
   @OriginalMember(
      owner = "client!hk",
      name = "r",
      descriptor = "[F"
   )
   private static float[] field127 = new float[16];
   @OriginalMember(
      owner = "client!hk",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field130 = new float[4];
   @OriginalMember(
      owner = "client!hk",
      name = "l",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field125;
   @OriginalMember(
      owner = "client!hk",
      name = "k",
      descriptor = "Z"
   )
   private boolean field126;

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      if (arg0 != 90) {
         this.method68(42);
      }

   }

   @OriginalMember(
      owner = "client!hk",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method68(int arg0) {
      if (arg0 == 10) {
         if (this.field125 != null) {
            IDirect3DDevice var2 = this.field124.field2447;
            class504 var3 = this.field124.method2200(arg0 ^ 245);
            var2.method563(0, var3.method3905(-97, field127));
         }

      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method69(byte arg0) {
      if (arg0 != 120) {
         this.field125 = (IDirect3DVertexShader)null;
      }

      return this.field129;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method70(int arg0) {
      if (arg0 == -2) {
         if (this.field125 != null) {
            IDirect3DDevice var2 = this.field124.field2447;
            class504 var3 = this.field8234.method2180((byte)-101);
            var2.SetVertexShaderConstantF(8, var3.method3915(field127, false), 2);
         }

      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(IBLwm;)V"
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      if (arg2 == null) {
         if (!this.field120) {
            this.field8234.method2193(this.field8234.field4153, (byte)-19);
            this.field8234.method2255(1, (byte)90);
            this.field8234.method2185((byte)-126, 0, class36.field435);
            this.field8234.method2221(0, (byte)51, class36.field435);
            this.field120 = true;
         }
      } else {
         if (this.field120) {
            this.field8234.method2185((byte)-120, 0, class751.field11122);
            this.field8234.method2221(0, (byte)51, class751.field11122);
            this.field120 = false;
         }

         this.field8234.method2193(arg2, (byte)-19);
         this.field8234.method2255(arg0, (byte)90);
      }

      int var4 = 99 % ((arg1 - 18) / 60);
   }

   @OriginalMember(
      owner = "client!hk",
      name = "<init>",
      descriptor = "(Leb;Lrr;)V"
   )
   public class10(class163 arg0, class678 arg1) {
      super(arg0);
      this.field124 = arg0;
      if (arg1 != null && -258 >= ~(this.field124.field2438.VertexShaderVersion & 65535)) {
         this.field123 = this.field124.field2447.method573(arg1.method5023(field131[1], field131[0], 0));
         this.field122 = this.field124.field2447.method573(arg1.method5023(field131[2], field131[0], 0));
         this.field121 = this.field124.field2447.method573(arg1.method5023(field131[3], field131[0], 0));
         this.field119 = this.field124.field2447.method573(arg1.method5023(field131[4], field131[0], 0));
         if (!(this.field121 != null & this.field122 != null & this.field123 != null & this.field119 != null)) {
            this.field129 = false;
         } else {
            this.field128 = this.field8234.method2177(false, -1, 2, new int[]{0, -1}, 1);
            this.field128.method2358(-3545, false, false);
            this.field129 = true;
         }
      } else {
         this.field129 = false;
      }

   }

   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method72(int arg0) {
      this.field8234.method2220(1, 14);
      this.field8234.method2193((class428)null, (byte)-19);
      if (arg0 != -2) {
         this.field124 = (class163)null;
      }

      this.field8234.method2212((byte)119, class716.field10733, class716.field10733);
      this.field8234.method2185((byte)-104, 0, class751.field11122);
      this.field8234.method2185((byte)-103, 2, class700.field10441);
      this.field8234.method2221(0, (byte)51, class751.field11122);
      this.field8234.method2220(0, 14);
      if (this.field120) {
         this.field8234.method2185((byte)-100, 0, class751.field11122);
         this.field8234.method2221(0, (byte)51, class751.field11122);
         this.field120 = false;
      }

      if (this.field125 != null) {
         this.field124.method1456((IDirect3DVertexShader)null, (byte)-27);
         this.field125 = null;
      }

   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method73(boolean arg0, byte arg1) {
      this.field126 = arg0;
      this.field8234.method2220(1, 14);
      this.field8234.method2193(this.field128, (byte)-19);
      this.field8234.method2212((byte)119, class582.field8586, class453.field6943);
      this.field8234.method2185((byte)-102, 0, class700.field10441);
      this.field8234.method1494(0, true, 2, class751.field11122, false);
      if (arg1 > -44) {
         this.method72(108);
      }

      this.field8234.method2221(0, (byte)51, class36.field435);
      this.field8234.method2220(0, 14);
      this.method75((byte)-67);
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method74(int arg0) {
      if (arg0 == -29053) {
         if (this.field125 != null) {
            IDirect3DDevice var2 = this.field124.field2447;
            class504 var3 = this.field124.method2200(arg0 ^ -29060);
            var2.method563(0, var3.method3905(-77, field127));
         }

      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method75(byte arg0) {
      IDirect3DDevice var2 = this.field124.field2447;
      int var3 = -36 % ((arg0 - 39) / 58);
      int var4 = this.field8234.method2210(-9155);
      class504 var5 = this.field8234.method2240(-117);
      IDirect3DVertexShader var6;
      if (this.field126) {
         var6 = var4 != Integer.MAX_VALUE ? this.field119 : this.field122;
      } else {
         var6 = ~var4 == Integer.MIN_VALUE ? this.field123 : this.field121;
      }

      if (this.field125 != var6) {
         this.field125 = var6;
         this.field124.method1456(var6, (byte)126);
         this.method79(4);
         this.method77(-2);
         this.method70(-2);
         this.method74(-29053);
         this.method68(10);
         this.method76((byte)71);
      }

      var5.method3917((float)var4, 0.0F, 0, 0.0F, -1.0F, field130);
      var2.method563(12, field130);
   }

   @OriginalMember(
      owner = "client!hk",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method76(byte arg0) {
      if (arg0 != 71) {
         this.field120 = true;
      }

      if (this.field125 != null) {
         IDirect3DDevice var2 = this.field124.field2447;
         int var3 = this.field8234.method616();
         int var4 = this.field8234.method635();
         float var5 = (float)var3 + -((float)(-var4 + var3) * 0.125F);
         float var6 = (float)var3 + -((float)(-var4 + var3) * 0.25F);
         var2.method565(10, var6, 1.0F / (-var6 + var5), var5, 1.0F / ((float)var3 - var5));
         var2.method565(11, 1.0F / (float)this.field8234.method2201((byte)-111), (float)this.field8234.method2253((byte)121) / 255.0F, this.field8234.field4156, 1.0F / (this.field8234.field4156 - this.field8234.field4175));
         this.field8234.method2218(this.field8234.method2238((byte)-125), 22121);
      }

   }

   @OriginalMember(
      owner = "client!hk",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method77(int arg0) {
      if (arg0 != -2) {
         field127 = (float[])null;
      }

      if (this.field125 != null) {
         IDirect3DDevice var2 = this.field124.field2447;
         var2.method563(4, this.field8234.method2207(field127, 1));
      }

   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method78(byte arg0, boolean arg1) {
      if (arg0 < 82) {
         this.field121 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!hk",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method79(int arg0) {
      if (this.field125 != null && this.field126) {
         class504 var2 = this.field8234.method2215(true);
         IDirect3DDevice var3 = this.field124.field2447;
         var3.method565(13, this.field8234.field4177 * this.field8234.field4160, this.field8234.field4194 * this.field8234.field4177, this.field8234.field4211 * this.field8234.field4177, 1.0F);
         var3.method565(14, this.field8234.field4161 * this.field8234.field4160, this.field8234.field4194 * this.field8234.field4161, this.field8234.field4211 * this.field8234.field4161, 1.0F);
         var3.method565(16, this.field8234.field4213 * this.field8234.field4160, this.field8234.field4213 * this.field8234.field4194, this.field8234.field4213 * this.field8234.field4211, 1.0F);
         var2.method3907(0, field130, this.field8234.field4203[1], this.field8234.field4203[2], this.field8234.field4203[0]);
         var3.SetVertexShaderConstantF(15, field130, 1);
         var2.method3907(0, field130, this.field8234.field4226[1], this.field8234.field4226[2], this.field8234.field4226[0]);
         var3.SetVertexShaderConstantF(17, field130, 1);
      }

      int var4 = -72 % ((-52 - arg0) / 55);
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method80(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method81(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
