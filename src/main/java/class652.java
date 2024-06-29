import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class652 extends class242 {
   @OriginalMember(
      owner = "client!go",
      name = "o",
      descriptor = "Z"
   )
   private boolean field9466 = false;
   @OriginalMember(
      owner = "client!go",
      name = "s",
      descriptor = "Lvea;"
   )
   private class287 field9467;
   @OriginalMember(
      owner = "client!go",
      name = "u",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9469;
   @OriginalMember(
      owner = "client!go",
      name = "r",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9468;
   @OriginalMember(
      owner = "client!go",
      name = "w",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9474;
   @OriginalMember(
      owner = "client!go",
      name = "v",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9476;
   @OriginalMember(
      owner = "client!go",
      name = "t",
      descriptor = "Lnfa;"
   )
   private class706 field9475;
   @OriginalMember(
      owner = "client!go",
      name = "x",
      descriptor = "Z"
   )
   private boolean field9471;
   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9477 = new String[]{method4798(method4797("m;/;\u000ew9\u001e8#m\"\u001c5\b")), method4798(method4797("|4")), method4798(method4797("m;/1\u0013|)\u001c\u0003\u0010q8")), method4798(method4797("m;/1\u0013|)\u001c\u0003\tv \u0019(")), method4798(method4797("m;/;\u000ew9\u001e8#t%\u0004"))};
   @OriginalMember(
      owner = "client!go",
      name = "n",
      descriptor = "[F"
   )
   private static float[] field9470 = new float[4];
   @OriginalMember(
      owner = "client!go",
      name = "y",
      descriptor = "[F"
   )
   private static float[] field9472 = new float[16];
   @OriginalMember(
      owner = "client!go",
      name = "p",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9465;
   @OriginalMember(
      owner = "client!go",
      name = "q",
      descriptor = "Z"
   )
   private boolean field9473;

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(IIB)V",
      line = 5
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      if (arg2 > -64) {
         this.method69(31);
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "b",
      descriptor = "(I)V",
      line = 14
   )
   public final void method1597(int arg0) {
      if (arg0 != 25728) {
         field9470 = (float[])null;
      }

      if (this.field9465 != null) {
         IDirect3DDevice var2 = this.field9467.field4018;
         var2.method3816(4, this.field3498.method2763(field9472, (byte)-127));
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "c",
      descriptor = "(I)V",
      line = 31
   )
   public final void method1598(int arg0) {
      if (this.field9465 != null) {
         IDirect3DDevice var2 = this.field9467.field4018;
         class104 var3 = this.field3498.method2794(false);
         var2.SetVertexShaderConstantF(8, var3.method995((byte)-116, field9472), 2);
      }

      if (arg0 <= 54) {
         this.field9467 = (class287)null;
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "e",
      descriptor = "(I)Z",
      line = 50
   )
   public final boolean method69(int arg0) {
      return arg0 != 30453 ? false : this.field9471;
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(IILbt;)V",
      line = 60
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      if (arg1 < 12) {
         this.method68(-7);
      }

      if (arg2 != null) {
         if (this.field9466) {
            this.field3498.method2779(8, 0, class540.field7850);
            this.field3498.method2783(3592, class540.field7850, 0);
            this.field9466 = false;
         }

         this.field3498.method2806(false, arg2);
         this.field3498.method2738(-98, arg0);
      } else if (!this.field9466) {
         this.field3498.method2806(false, this.field3498.field5295);
         this.field3498.method2738(-112, 1);
         this.field3498.method2779(8, 0, class315.field4537);
         this.field3498.method2783(3592, class315.field4537, 0);
         this.field9466 = true;
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "<init>",
      descriptor = "(Lvea;Lhw;)V",
      line = 93
   )
   public class652(class287 arg0, class141 arg1) {
      super(arg0);
      this.field9467 = arg0;
      if (arg1 != null && 257 <= (65535 & this.field9467.field4014.VertexShaderVersion)) {
         this.field9469 = this.field9467.field4018.method3805(arg1.method1348(field9477[1], field9477[0], 99));
         this.field9468 = this.field9467.field4018.method3805(arg1.method1348(field9477[1], field9477[4], 95));
         this.field9474 = this.field9467.field4018.method3805(arg1.method1348(field9477[1], field9477[3], 51));
         this.field9476 = this.field9467.field4018.method3805(arg1.method1348(field9477[1], field9477[2], 22));
         if (this.field9476 != null & this.field9469 != null & this.field9468 != null & this.field9474 != null) {
            this.field9475 = this.field3498.method2766(false, 2, 1, (byte)104, new int[]{0, -1});
            this.field9475.method884(false, -66, false);
            this.field9471 = true;
         } else {
            this.field9471 = false;
         }
      } else {
         this.field9471 = false;
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(B)V",
      line = 122
   )
   public final void method1596(byte arg0) {
      int var2 = -96 / ((-39 - arg0) / 62);
      if (this.field9465 != null) {
         IDirect3DDevice var3 = this.field9467.field4018;
         class104 var4 = this.field9467.method2775((byte)-64);
         var3.method3816(0, var4.method1012((byte)-28, field9472));
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "f",
      descriptor = "(I)V",
      line = 141
   )
   public final void method68(int arg0) {
      this.field3498.method2767((byte)-112, 1);
      this.field3498.method2806(false, (class47)null);
      int var2 = -10 % ((arg0 - 27) / 34);
      this.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
      this.field3498.method2779(8, 0, class540.field7850);
      this.field3498.method2779(8, 2, class295.field4119);
      this.field3498.method2783(3592, class540.field7850, 0);
      this.field3498.method2767((byte)-112, 0);
      if (this.field9466) {
         this.field3498.method2779(8, 0, class540.field7850);
         this.field3498.method2783(3592, class540.field7850, 0);
         this.field9466 = false;
      }

      if (this.field9465 != null) {
         this.field9467.method2234(36, (IDirect3DVertexShader)null);
         this.field9465 = null;
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "d",
      descriptor = "(B)V",
      line = 171
   )
   private final void method4796(byte arg0) {
      if (this.field9465 != null && this.field9473) {
         class104 var2 = this.field3498.method2780(0);
         IDirect3DDevice var3 = this.field9467.field4018;
         var3.method3817(13, this.field3498.field5274 * this.field3498.field5270, this.field3498.field5313 * this.field3498.field5270, this.field3498.field5324 * this.field3498.field5270, 1.0F);
         var3.method3817(14, this.field3498.field5274 * this.field3498.field5239, this.field3498.field5313 * this.field3498.field5239, this.field3498.field5324 * this.field3498.field5239, 1.0F);
         var3.method3817(16, this.field3498.field5274 * this.field3498.field5240, this.field3498.field5313 * this.field3498.field5240, this.field3498.field5324 * this.field3498.field5240, 1.0F);
         var2.method978(this.field3498.field5260[2], 7, this.field3498.field5260[0], this.field3498.field5260[1], field9470);
         var3.SetVertexShaderConstantF(15, field9470, 1);
         var2.method978(this.field3498.field5225[2], 7, this.field3498.field5225[0], this.field3498.field5225[1], field9470);
         var3.SetVertexShaderConstantF(17, field9470, 1);
      }

      if (arg0 >= -37) {
         this.field9474 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "b",
      descriptor = "(B)V",
      line = 204
   )
   public final void method1599(byte arg0) {
      if (arg0 >= -96) {
         this.field9467 = (class287)null;
      }

      if (this.field9465 != null) {
         IDirect3DDevice var2 = this.field9467.field4018;
         class104 var3 = this.field9467.method2775((byte)67);
         var2.method3816(0, var3.method1012((byte)-28, field9472));
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "d",
      descriptor = "(I)V",
      line = 224
   )
   public final void method66(int arg0) {
      if (arg0 != 29015) {
         this.field9467 = (class287)null;
      }

      IDirect3DDevice var2 = this.field9467.field4018;
      int var3 = this.field3498.method2733(0);
      class104 var4 = this.field3498.method2808(0);
      IDirect3DVertexShader var5;
      if (this.field9473) {
         var5 = var3 == Integer.MAX_VALUE ? this.field9468 : this.field9476;
      } else {
         var5 = var3 == Integer.MAX_VALUE ? this.field9469 : this.field9474;
      }

      if (this.field9465 != var5) {
         this.field9465 = var5;
         this.field9467.method2234(36, var5);
         this.method4796((byte)-76);
         this.method1597(25728);
         this.method1598(121);
         this.method1596((byte)45);
         this.method1599((byte)-97);
         this.method74(arg0 ^ -29016);
      }

      var4.method983(-1.0F, (float)var3, (byte)113, field9470, 0.0F, 0.0F);
      var2.method3816(12, field9470);
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(I)V",
      line = 272
   )
   public final void method74(int arg0) {
      if (arg0 != -1) {
         this.field9474 = (IDirect3DVertexShader)null;
      }

      if (this.field9465 != null) {
         IDirect3DDevice var2 = this.field9467.field4018;
         int var3 = this.field3498.method437();
         int var4 = this.field3498.method291();
         float var5 = (float)var3 - (float)(-var4 + var3) * 0.125F;
         float var6 = (float)var3 - (float)(-var4 + var3) * 0.25F;
         var2.method3817(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float)var3 - var5));
         var2.method3817(11, 1.0F / (float)this.field3498.method2750(1), (float)this.field3498.method2770((byte)-41) / 255.0F, this.field3498.field5238, 1.0F / (-this.field3498.field5301 + this.field3498.field5238));
         this.field3498.method2754(this.field3498.method2809(true), (byte)-97);
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(ZZ)V",
      line = 299
   )
   public final void method70(boolean arg0, boolean arg1) {
      if (!arg0) {
         this.method73(-85, -38, (class47)null);
      }

   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(ZI)V",
      line = 308
   )
   public final void method72(boolean arg0, int arg1) {
      this.field9473 = arg0;
      if (arg1 != -29461) {
         field9470 = (float[])null;
      }

      this.field3498.method2767((byte)-112, 1);
      this.field3498.method2806(false, this.field9475);
      this.field3498.method2761(class226.field3348, (byte)-69, class641.field9348);
      this.field3498.method2779(8, 0, class295.field4119);
      this.field3498.method1177(false, 2, true, class540.field7850, -58);
      this.field3498.method2783(3592, class315.field4537, 0);
      this.field3498.method2767((byte)-112, 0);
      this.method66(29015);
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4797(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4798(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
