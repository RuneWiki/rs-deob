import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public class class732 extends class550 {
   @OriginalMember(
      owner = "client!tka",
      name = "o",
      descriptor = "Leb;"
   )
   private class163 field10922;
   @OriginalMember(
      owner = "client!tka",
      name = "p",
      descriptor = "Lsc;"
   )
   private class97 field10919;
   @OriginalMember(
      owner = "client!tka",
      name = "m",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10917;
   @OriginalMember(
      owner = "client!tka",
      name = "j",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field10920;
   @OriginalMember(
      owner = "client!tka",
      name = "l",
      descriptor = "Z"
   )
   private boolean field10923;
   @OriginalMember(
      owner = "client!tka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10924 = new String[]{method5397(method5396("DI1\u0004lNI*\bpUx*\fnQB#2i@S\"\u001fAG")), method5397(method5396("DI1\u0004lNI*\bpUx*\fnQB#2i@S\"\u001fAW")), method5397(method5396("E_"))};
   @OriginalMember(
      owner = "client!tka",
      name = "n",
      descriptor = "[F"
   )
   private static float[] field10918 = new float[16];
   @OriginalMember(
      owner = "client!tka",
      name = "k",
      descriptor = "Z"
   )
   private boolean field10921;

   @OriginalMember(
      owner = "client!tka",
      name = "b",
      descriptor = "(I)V",
      line = 9
   )
   public final void method72(int arg0) {
      if (this.field10921) {
         this.field10922.method1456((IDirect3DVertexShader)null, (byte)94);
         this.field10922.method1497(0, (IDirect3DPixelShader)null);
         this.field8234.method2220(1, 14);
         this.field8234.method2193((class428)null, (byte)-19);
         this.field8234.method2220(0, 14);
         this.field8234.method2193((class428)null, (byte)-19);
         this.field10921 = false;
      }

      if (arg0 != -2) {
         field10918 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public final void method74(int arg0) {
      if (this.field10921) {
         IDirect3DDevice var2 = this.field10922.field2447;
         class504 var3 = this.field10922.method2200(255);
         var2.method563(0, var3.method3905(arg0 + 29159, field10918));
      }

      if (arg0 != -29053) {
         this.field10922 = (class163)null;
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "d",
      descriptor = "(I)V",
      line = 48
   )
   public final void method70(int arg0) {
      if (arg0 == -2) {
         if (this.field10921) {
            IDirect3DDevice var2 = this.field10922.field2447;
            class504 var3 = this.field8234.method2180((byte)-84);
            var2.SetVertexShaderConstantF(12, var3.method3915(field10918, false), 2);
         }

      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(BII)V",
      line = 67
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      if (this.field10921) {
         IDirect3DDevice var4 = this.field10922.field2447;
         int var5 = 1 << (arg2 & 3);
         float var6 = (float)(1 << (arg2 >> 3 & 7)) / 32.0F;
         int var7 = 65535 & arg1;
         float var8 = (float)(arg1 >> 16 & 3) / 8.0F;
         var4.method565(14, (float)(this.field8234.field4155 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         var4.method565(15, var6, 0.0F, 0.0F, 0.0F);
         var4.method572(4, (float)var7, 0.0F, 0.0F, 0.0F);
         var4.method572(5, var8, 0.0F, 0.0F, 0.0F);
      }

      if (arg0 != 90) {
         this.method69((byte)-36);
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "<init>",
      descriptor = "(Leb;Lrr;Lsc;)V",
      line = 94
   )
   public class732(class163 arg0, class678 arg1, class97 arg2) {
      super(arg0);
      this.field10922 = arg0;
      this.field10919 = arg2;
      if (arg1 != null && this.field8234.field4215 && this.field8234.field4205 && -258 >= ~(this.field10922.field2438.VertexShaderVersion & 65535)) {
         this.field10917 = this.field10922.field2447.method573(arg1.method5023(field10924[1], field10924[2], 0));
         this.field10920 = this.field10922.field2447.method575(arg1.method5023(field10924[0], field10924[2], 0));
         this.field10923 = this.field10917 != null && this.field10920 != null && this.field10919.method953(99);
      } else {
         this.field10920 = null;
         this.field10917 = null;
         this.field10923 = false;
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(BZ)V",
      line = 117
   )
   public final void method78(byte arg0, boolean arg1) {
      if (arg0 <= 82) {
         this.method72(34);
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 129
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      int var4 = -105 % ((18 - arg1) / 60);
   }

   @OriginalMember(
      owner = "client!tka",
      name = "c",
      descriptor = "(B)Z",
      line = 136
   )
   public final boolean method69(byte arg0) {
      if (arg0 != 120) {
         this.field10923 = false;
      }

      return this.field10923;
   }

   @OriginalMember(
      owner = "client!tka",
      name = "d",
      descriptor = "(B)V",
      line = 147
   )
   public final void method76(byte arg0) {
      if (this.field10921) {
         IDirect3DDevice var2 = this.field10922.field2447;
         if (~this.field8234.field4169 < -1) {
            float var3 = this.field8234.field4156;
            float var4 = this.field8234.field4175;
            var2.method565(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
         } else {
            var2.method565(16, 0.0F, 0.0F, 0.0F, 0.0F);
         }

         var2.method572(0, (float)((16745506 & this.field8234.field4219) >> 16) / 255.0F, (float)(this.field8234.field4219 >> 8 & 255) / 255.0F, (float)(this.field8234.field4219 & 255) / 255.0F, 0.0F);
      }

      if (arg0 != 71) {
         this.method76((byte)-44);
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(ZB)V",
      line = 176
   )
   public final void method73(boolean arg0, byte arg1) {
      class496 var3 = this.field8234.method2223(16);
      if (arg1 < -44) {
         if (this.field10923 && var3 != null) {
            IDirect3DDevice var4 = this.field10922.field2447;
            this.field10922.method1456(this.field10917, (byte)109);
            this.field10922.method1497(0, this.field10920);
            this.field8234.method2220(1, 14);
            this.field8234.method2193(var3, (byte)-19);
            this.field8234.method2220(0, 14);
            this.field8234.method2193(this.field10919.field1360, (byte)-19);
            this.field10921 = true;
            this.method68(10);
            this.method70(-2);
            this.method77(-2);
            this.method76((byte)71);
            var4.method572(1, -this.field8234.field4203[0], -this.field8234.field4203[1], -this.field8234.field4203[2], 0.0F);
            var4.method572(2, this.field8234.field4160, this.field8234.field4194, this.field8234.field4211, 1.0F);
            var4.method572(3, 96.0F + Math.abs(this.field8234.field4203[1]) * 928.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "e",
      descriptor = "(I)V",
      line = 206
   )
   public final void method77(int arg0) {
      if (this.field10921) {
         IDirect3DDevice var2 = this.field10922.field2447;
         var2.method563(8, this.field8234.method2207(field10918, 1));
      }

      if (arg0 != -2) {
         this.method71(6, (byte)-69, (class428)null);
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "c",
      descriptor = "(I)V",
      line = 223
   )
   public final void method68(int arg0) {
      if (this.field10921) {
         IDirect3DDevice var2 = this.field10922.field2447;
         class504 var3 = this.field10922.method2240(arg0 + -124);
         class504 var4 = this.field10922.method2200(255);
         var2.method563(0, var4.method3905(-84, field10918));
         var2.method563(4, var3.method3911(field10918, (byte)75));
      }

      if (arg0 != 10) {
         field10918 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!tka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5396(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5397(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
