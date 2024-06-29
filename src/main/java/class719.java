import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class719 extends class393 {
   @OriginalMember(
      owner = "client!kha",
      name = "k",
      descriptor = "Z"
   )
   private boolean field10541 = false;
   @OriginalMember(
      owner = "client!kha",
      name = "n",
      descriptor = "Lub;"
   )
   private class165 field10539;
   @OriginalMember(
      owner = "client!kha",
      name = "p",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10538;
   @OriginalMember(
      owner = "client!kha",
      name = "m",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10537;
   @OriginalMember(
      owner = "client!kha",
      name = "l",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10540;
   @OriginalMember(
      owner = "client!kha",
      name = "t",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10535;
   @OriginalMember(
      owner = "client!kha",
      name = "u",
      descriptor = "Lcb;"
   )
   private class177 field10545;
   @OriginalMember(
      owner = "client!kha",
      name = "o",
      descriptor = "Z"
   )
   private boolean field10536;
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10546 = new String[]{method5232(method5231(",.\u0014\fL6,%\u000fa50?")), method5232(method5231("=!")), method5232(method5231(",.\u0014\u0006Q=<'4K75\"\u001f")), method5232(method5231(",.\u0014\fL6,%\u000fa,7'\u0002J")), method5232(method5231(",.\u0014\u0006Q=<'4R0-"))};
   @OriginalMember(
      owner = "client!kha",
      name = "s",
      descriptor = "[F"
   )
   private static float[] field10534 = new float[4];
   @OriginalMember(
      owner = "client!kha",
      name = "q",
      descriptor = "[F"
   )
   private static float[] field10544 = new float[16];
   @OriginalMember(
      owner = "client!kha",
      name = "r",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10543;
   @OriginalMember(
      owner = "client!kha",
      name = "j",
      descriptor = "Z"
   )
   private boolean field10542;

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2737(int arg0) {
      if (this.field10543 != null) {
         IDirect3DDevice var2 = this.field10539.field2093;
         class620 var3 = this.field10539.method2227(76);
         var2.method5510(0, var3.method4586(field10544, 10));
      }

      if (arg0 != 0) {
         this.method3101((byte)-39);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      this.field5438.method2238(9, 1);
      this.field5438.method2265((class421)null, (byte)88);
      this.field5438.method2231(class231.field2873, class231.field2873, (byte)-127);
      int var2 = -32 / ((22 - arg0) / 63);
      this.field5438.method2288((byte)-10, class363.field5039, 0);
      this.field5438.method2288((byte)-10, class354.field4947, 2);
      this.field5438.method2211((byte)64, class363.field5039, 0);
      this.field5438.method2238(9, 0);
      if (this.field10541) {
         this.field5438.method2288((byte)-10, class363.field5039, 0);
         this.field5438.method2211((byte)34, class363.field5039, 0);
         this.field10541 = false;
      }

      if (this.field10543 != null) {
         this.field10539.method1388((IDirect3DVertexShader)null, 11);
         this.field10543 = null;
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2736(boolean arg0) {
      if (this.field10543 != null) {
         IDirect3DDevice var2 = this.field10539.field2093;
         class620 var3 = this.field10539.method2227(113);
         var2.method5510(0, var3.method4586(field10544, 10));
      }

      if (!arg0) {
         this.method1461((class421)null, 126, 2);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      if (arg0 != 29404) {
         this.method1461((class421)null, 67, 85);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3101(byte arg0) {
      if (arg0 == -86) {
         IDirect3DDevice var2 = this.field10539.field2093;
         int var3 = this.field5438.method2221(-98);
         class620 var4 = this.field5438.method2241((byte)-124);
         IDirect3DVertexShader var5;
         if (!this.field10542) {
            var5 = ~var3 != Integer.MIN_VALUE ? this.field10540 : this.field10538;
         } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field10537 : this.field10535;
         }

         if (this.field10543 != var5) {
            this.field10543 = var5;
            this.field10539.method1388(var5, 11);
            this.method5230((byte)53);
            this.method2735((byte)117);
            this.method2317((byte)-109);
            this.method2736(true);
            this.method2737(arg0 ^ -86);
            this.method2738(arg0 ^ -86);
         }

         var4.method4592((float)var3, 0.0F, (byte)120, -1.0F, field10534, 0.0F);
         var2.method5510(12, field10534);
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method5230(byte arg0) {
      if (arg0 != 53) {
         this.field10537 = (IDirect3DVertexShader)null;
      }

      if (this.field10543 != null && this.field10542) {
         class620 var2 = this.field5438.method2254(-2);
         IDirect3DDevice var3 = this.field10539.field2093;
         var3.method5505(13, this.field5438.field3862 * this.field5438.field3821, this.field5438.field3826 * this.field5438.field3821, this.field5438.field3821 * this.field5438.field3795, 1.0F);
         var3.method5505(14, this.field5438.field3869 * this.field5438.field3862, this.field5438.field3869 * this.field5438.field3826, this.field5438.field3869 * this.field5438.field3795, 1.0F);
         var3.method5505(16, this.field5438.field3862 * this.field5438.field3817, this.field5438.field3826 * this.field5438.field3817, this.field5438.field3817 * this.field5438.field3795, 1.0F);
         var2.method4578(this.field5438.field3803[2], 24230, this.field5438.field3803[0], this.field5438.field3803[1], field10534);
         var3.SetVertexShaderConstantF(15, field10534, 1);
         var2.method4578(this.field5438.field3836[2], 24230, this.field5438.field3836[0], this.field5438.field3836[1], field10534);
         var3.SetVertexShaderConstantF(17, field10534, 1);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      this.field10542 = arg0;
      this.field5438.method2238(9, 1);
      this.field5438.method2265(this.field10545, (byte)-95);
      this.field5438.method2231(class749.field10941, class318.field4380, (byte)-69);
      this.field5438.method2288((byte)-10, class354.field4947, 0);
      this.field5438.method1409(false, true, class363.field5039, 2, arg1 + -126);
      this.field5438.method2211((byte)102, class48.field640, 0);
      this.field5438.method2238(arg1 + -23, 0);
      if (arg1 != 32) {
         this.field10541 = false;
      }

      this.method3101((byte)-86);
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      return arg0 ? false : this.field10536;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2738(int arg0) {
      if (arg0 != 0) {
         this.field10538 = (IDirect3DVertexShader)null;
      }

      if (this.field10543 != null) {
         IDirect3DDevice var2 = this.field10539.field2093;
         int var3 = this.field5438.method499();
         int var4 = this.field5438.method519();
         float var5 = (float)var3 + -((float)(var3 - var4) * 0.125F);
         float var6 = (float)var3 - (float)(-var4 + var3) * 0.25F;
         var2.method5505(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float)var3 - var5));
         var2.method5505(11, 1.0F / (float)this.field5438.method2246(8), (float)this.field5438.method2245(0) / 255.0F, this.field5438.field3871, 1.0F / (-this.field5438.field3855 + this.field5438.field3871));
         this.field5438.method2276(this.field5438.method2292(0), arg0 ^ 78);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      if (arg1 != 7313) {
         this.method1457((byte)56);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      if (arg1 > 84) {
         if (arg0 != null) {
            if (this.field10541) {
               this.field5438.method2288((byte)-10, class363.field5039, 0);
               this.field5438.method2211((byte)-123, class363.field5039, 0);
               this.field10541 = false;
            }

            this.field5438.method2265(arg0, (byte)-24);
            this.field5438.method2240(-4, arg2);
         } else if (!this.field10541) {
            this.field5438.method2265(this.field5438.field3878, (byte)-117);
            this.field5438.method2240(-4, 1);
            this.field5438.method2288((byte)-10, class48.field640, 0);
            this.field5438.method2211((byte)-126, class48.field640, 0);
            this.field10541 = true;
         }

      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method2735(byte arg0) {
      if (this.field10543 != null) {
         IDirect3DDevice var2 = this.field10539.field2093;
         var2.method5510(4, this.field5438.method2232(0, field10544));
      }

      if (arg0 != 117) {
         this.method2317((byte)-40);
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2317(byte arg0) {
      if (this.field10543 != null) {
         IDirect3DDevice var2 = this.field10539.field2093;
         class620 var3 = this.field5438.method2226(arg0 + 2811);
         var2.SetVertexShaderConstantF(8, var3.method4591((byte)70, field10544), 2);
      }

      if (arg0 != -109) {
         this.field10538 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "<init>",
      descriptor = "(Lub;Lww;)V"
   )
   public class719(class165 arg0, class339 arg1) {
      super(arg0);
      this.field10539 = arg0;
      if (arg1 != null && -258 >= ~(this.field10539.field2091.VertexShaderVersion & 65535)) {
         this.field10538 = this.field10539.field2093.method5499(arg1.method2692(field10546[1], field10546[3], (byte)-86));
         this.field10537 = this.field10539.field2093.method5499(arg1.method2692(field10546[1], field10546[0], (byte)-86));
         this.field10540 = this.field10539.field2093.method5499(arg1.method2692(field10546[1], field10546[2], (byte)-86));
         this.field10535 = this.field10539.field2093.method5499(arg1.method2692(field10546[1], field10546[4], (byte)-86));
         if (this.field10538 != null & this.field10537 != null & this.field10540 != null & this.field10535 != null) {
            this.field10545 = this.field5438.method2283((byte)-53, 2, false, 1, new int[]{0, -1});
            this.field10545.method1516(false, false, 13852);
            this.field10536 = true;
         } else {
            this.field10536 = false;
         }
      } else {
         this.field10536 = false;
      }

   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5231(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5232(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
