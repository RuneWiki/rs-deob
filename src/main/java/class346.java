import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class346 extends class393 {
   @OriginalMember(
      owner = "client!fe",
      name = "k",
      descriptor = "Lub;"
   )
   private class165 field4748;
   @OriginalMember(
      owner = "client!fe",
      name = "j",
      descriptor = "Ldd;"
   )
   private class712 field4751;
   @OriginalMember(
      owner = "client!fe",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4752;
   @OriginalMember(
      owner = "client!fe",
      name = "l",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field4750;
   @OriginalMember(
      owner = "client!fe",
      name = "m",
      descriptor = "Z"
   )
   private boolean field4746;
   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4753 = new String[]{method2740(method2739("#js$\u0012)jh(\u000e2[h,\u00106aa\u0012\u0017'p`?? ")), method2740(method2739("#js$\u0012)jh(\u000e2[h,\u00106aa\u0012\u0017'p`??0")), method2740(method2739("\"|"))};
   @OriginalMember(
      owner = "client!fe",
      name = "p",
      descriptor = "[F"
   )
   private static float[] field4747 = new float[16];
   @OriginalMember(
      owner = "client!fe",
      name = "o",
      descriptor = "Z"
   )
   private boolean field4749;

   @OriginalMember(
      owner = "client!fe",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method2735(byte arg0) {
      if (this.field4749) {
         IDirect3DDevice var2 = this.field4748.field2093;
         var2.method5510(8, this.field5438.method2232(0, field4747));
      }

      if (arg0 != 117) {
         field4747 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2736(boolean arg0) {
      if (this.field4749) {
         IDirect3DDevice var2 = this.field4748.field2093;
         class620 var3 = this.field4748.method2227(108);
         var2.method5510(0, var3.method4586(field4747, 10));
      }

      if (!arg0) {
         this.field4746 = false;
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2737(int arg0) {
      if (this.field4749) {
         IDirect3DDevice var2 = this.field4748.field2093;
         class620 var3 = this.field4748.method2241((byte)-107);
         class620 var4 = this.field4748.method2227(73);
         var2.method5510(0, var4.method4586(field4747, arg0 + 10));
         var2.method5510(4, var3.method4575(field4747, false));
      }

      if (arg0 != 0) {
         this.method2317((byte)32);
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2317(byte arg0) {
      if (this.field4749) {
         IDirect3DDevice var2 = this.field4748.field2093;
         class620 var3 = this.field5438.method2226(2702);
         var2.SetVertexShaderConstantF(12, var3.method4591((byte)70, field4747), 2);
      }

      if (arg0 != -109) {
         this.method1462(-54, 126, -15);
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      if (arg1 != 7313) {
         this.field4748 = (class165)null;
      }

      if (this.field4749) {
         IDirect3DDevice var4 = this.field4748.field2093;
         int var5 = 1 << (arg0 & 3);
         float var6 = (float)(1 << ((arg0 & 58) >> 3)) / 32.0F;
         int var7 = 65535 & arg2;
         var4.method5505(14, (float)(this.field5438.field3805 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         float var8 = (float)((arg2 & 201242) >> 16) / 8.0F;
         var4.method5505(15, var6, 0.0F, 0.0F, 0.0F);
         var4.method5511(4, (float)var7, 0.0F, 0.0F, 0.0F);
         var4.method5511(5, var8, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      if (arg0 != 29404) {
         this.field4751 = (class712)null;
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      if (arg0) {
         this.field4748 = (class165)null;
      }

      return this.field4746;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      if (this.field4749) {
         this.field4748.method1388((IDirect3DVertexShader)null, 11);
         this.field4748.method1387((byte)-92, (IDirect3DPixelShader)null);
         this.field5438.method2238(9, 1);
         this.field5438.method2265((class421)null, (byte)-71);
         this.field5438.method2238(9, 0);
         this.field5438.method2265((class421)null, (byte)116);
         this.field4749 = false;
      }

      int var2 = 47 % ((22 - arg0) / 63);
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      if (arg1 < 84) {
         this.field4748 = (class165)null;
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "<init>",
      descriptor = "(Lub;Lww;Ldd;)V"
   )
   public class346(class165 arg0, class339 arg1, class712 arg2) {
      super(arg0);
      this.field4748 = arg0;
      this.field4751 = arg2;
      if (arg1 != null && this.field5438.field3789 && this.field5438.field3816 && ~(65535 & this.field4748.field2091.VertexShaderVersion) <= -258) {
         this.field4752 = this.field4748.field2093.method5499(arg1.method2692(field4753[2], field4753[1], (byte)-86));
         this.field4750 = this.field4748.field2093.method5502(arg1.method2692(field4753[2], field4753[0], (byte)-86));
         this.field4746 = this.field4752 != null && this.field4750 != null && this.field4751.method5202((byte)-96);
      } else {
         this.field4750 = null;
         this.field4746 = false;
         this.field4752 = null;
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      if (arg1 == 32) {
         class531 var3 = this.field5438.method2286(-105);
         if (this.field4746 && var3 != null) {
            IDirect3DDevice var4 = this.field4748.field2093;
            this.field4748.method1388(this.field4752, 11);
            this.field4748.method1387((byte)-93, this.field4750);
            this.field5438.method2238(9, 1);
            this.field5438.method2265(var3, (byte)123);
            this.field5438.method2238(9, 0);
            this.field5438.method2265(this.field4751.field10447, (byte)126);
            this.field4749 = true;
            this.method2737(arg1 + -32);
            this.method2317((byte)-109);
            this.method2735((byte)117);
            this.method2738(0);
            var4.method5511(1, -this.field5438.field3803[0], -this.field5438.field3803[1], -this.field5438.field3803[2], 0.0F);
            var4.method5511(2, this.field5438.field3862, this.field5438.field3826, this.field5438.field3795, 1.0F);
            var4.method5511(3, 928.0F * Math.abs(this.field5438.field3803[1]) + 96.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   @OriginalMember(
      owner = "client!fe",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2738(int arg0) {
      if (arg0 != 0) {
         this.method2736(true);
      }

      if (this.field4749) {
         IDirect3DDevice var2 = this.field4748.field2093;
         if (0 >= this.field5438.field3854) {
            var2.method5505(16, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field5438.field3871;
            float var4 = this.field5438.field3855;
            var2.method5505(16, var3, 1.0F / (-var4 + var3), 0.0F, 0.0F);
         }

         var2.method5511(0, (float)(255 & this.field5438.field3813 >> 16) / 255.0F, (float)(this.field5438.field3813 >> 8 & 255) / 255.0F, (float)(this.field5438.field3813 & 255) / 255.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2739(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2740(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
