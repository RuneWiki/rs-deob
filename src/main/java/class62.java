import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class62 extends class567 {
   @OriginalMember(
      owner = "client!fw",
      name = "q",
      descriptor = "Z"
   )
   private boolean field682 = false;
   @OriginalMember(
      owner = "client!fw",
      name = "y",
      descriptor = "Lvn;"
   )
   private class332 field681;
   @OriginalMember(
      owner = "client!fw",
      name = "w",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field686;
   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field679;
   @OriginalMember(
      owner = "client!fw",
      name = "x",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field687;
   @OriginalMember(
      owner = "client!fw",
      name = "p",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field680;
   @OriginalMember(
      owner = "client!fw",
      name = "v",
      descriptor = "Z"
   )
   private boolean field683;
   @OriginalMember(
      owner = "client!fw",
      name = "u",
      descriptor = "Lgu;"
   )
   private class610 field690;
   @OriginalMember(
      owner = "client!fw",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field691 = new String[]{method470(method469("\\4\u007f'RF6N$\u007fE*T")), method470(method469("\\4\u007f'RF6N$\u007f\\-L)T")), method470(method469("M;")), method470(method469("\\4\u007f-OM&L\u001fL@7")), method470(method469("\\4\u007f-OM&L\u001fUG/I4"))};
   @OriginalMember(
      owner = "client!fw",
      name = "t",
      descriptor = "[F"
   )
   private static float[] field685 = new float[4];
   @OriginalMember(
      owner = "client!fw",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field689 = new float[16];
   @OriginalMember(
      owner = "client!fw",
      name = "s",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field684;
   @OriginalMember(
      owner = "client!fw",
      name = "r",
      descriptor = "Z"
   )
   private boolean field688;

   @OriginalMember(
      owner = "client!fw",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method2(int arg0) {
      if (arg0 == 7938) {
         if (this.field684 != null) {
            IDirect3DDevice var2 = this.field681.field4766;
            var2.method3732(4, this.field7728.method2543(-22, field689));
         }

      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4(int arg0) {
      int var2 = 43 % ((62 - arg0) / 45);
      if (this.field684 != null) {
         IDirect3DDevice var3 = this.field681.field4766;
         int var4 = this.field7728.method578();
         int var5 = this.field7728.method567();
         float var6 = (float)var4 - (float)(-var5 + var4) * 0.125F;
         float var7 = (float)var4 + -((float)(var4 - var5) * 0.25F);
         var3.method3736(10, var7, 1.0F / (var6 - var7), var6, 1.0F / ((float)var4 - var6));
         var3.method3736(11, 1.0F / (float)this.field7728.method2565(-27805), (float)this.field7728.method2473((byte)-107) / 255.0F, this.field7728.field4606, 1.0F / (-this.field7728.field4635 + this.field7728.field4606));
         this.field7728.method2552(this.field7728.method2528(false), true);
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method6(int arg0) {
      if (this.field684 != null) {
         IDirect3DDevice var2 = this.field681.field4766;
         class251 var3 = this.field7728.method2601(false);
         var2.SetVertexShaderConstantF(8, var3.method1892((byte)68, field689), 2);
      }

      if (arg0 <= 103) {
         this.method468(-80);
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      int var4 = 120 % ((63 - arg1) / 58);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method467(byte arg0) {
      IDirect3DDevice var2 = this.field681.field4766;
      int var3 = this.field7728.method2534((byte)-49);
      class251 var4 = this.field7728.method2494(-129);
      if (arg0 > -44) {
         this.field690 = (class610)null;
      }

      IDirect3DVertexShader var5;
      if (this.field688) {
         var5 = ~var3 == Integer.MIN_VALUE ? this.field679 : this.field680;
      } else {
         var5 = ~var3 != Integer.MIN_VALUE ? this.field687 : this.field686;
      }

      if (this.field684 != var5) {
         this.field684 = var5;
         this.field681.method2635((byte)-102, var5);
         this.method468(-477699928);
         this.method2(7938);
         this.method6(124);
         this.method10(-16711936);
         this.method5(-114);
         this.method4(108);
      }

      var4.method1894(0.0F, true, (float)var3, 0.0F, field685, -1.0F);
      var2.method3732(12, field685);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      return arg0 > -64 ? true : this.field683;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5(int arg0) {
      if (this.field684 != null) {
         IDirect3DDevice var2 = this.field681.field4766;
         class251 var3 = this.field681.method2546((byte)15);
         var2.method3732(0, var3.method1906(field689, -79));
      }

      if (arg0 >= -38) {
         this.field688 = true;
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      this.field7728.method2506(1, -46);
      this.field7728.method2581((class159)null, 18);
      this.field7728.method2587(class449.field6203, 121, class449.field6203);
      this.field7728.method2547(arg0, class550.field7513, 0);
      this.field7728.method2547(2, class206.field2525, 0);
      this.field7728.method2592(0, class550.field7513, arg0 + 0);
      this.field7728.method2506(0, arg0 + -6);
      if (this.field682) {
         this.field7728.method2547(0, class550.field7513, 0);
         this.field7728.method2592(0, class550.field7513, 0);
         this.field682 = false;
      }

      if (this.field684 != null) {
         this.field681.method2635((byte)-102, (IDirect3DVertexShader)null);
         this.field684 = null;
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      if (arg1 == null) {
         if (!this.field682) {
            this.field7728.method2581(this.field7728.field4660, 19);
            this.field7728.method2593(0, 1);
            this.field7728.method2547(0, class529.field7261, 0);
            this.field7728.method2592(0, class529.field7261, 0);
            this.field682 = true;
         }
      } else {
         if (this.field682) {
            this.field7728.method2547(0, class550.field7513, 0);
            this.field7728.method2592(0, class550.field7513, 0);
            this.field682 = false;
         }

         this.field7728.method2581(arg1, 125);
         this.field7728.method2593(0, arg2);
      }

      if (!arg0) {
         this.method9(76, -9, 2);
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      if (arg0 != -1309) {
         this.field686 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method10(int arg0) {
      if (this.field684 != null) {
         IDirect3DDevice var2 = this.field681.field4766;
         class251 var3 = this.field681.method2546((byte)15);
         var2.method3732(0, var3.method1906(field689, -56));
      }

      if (arg0 != -16711936) {
         this.method10(68);
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      this.field688 = arg0;
      this.field7728.method2506(1, 123);
      if (arg1 != 10286) {
         this.method10(75);
      }

      this.field7728.method2581(this.field690, 111);
      this.field7728.method2587(class535.field7314, -117, class581.field7982);
      this.field7728.method2547(0, class206.field2525, 0);
      this.field7728.method2517(class550.field7513, -1, 2, true, false);
      this.field7728.method2592(0, class529.field7261, 0);
      this.field7728.method2506(0, 110);
      this.method467((byte)-118);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method468(int arg0) {
      if (arg0 != -477699928) {
         this.method11((byte)-94);
      }

      if (this.field684 != null && this.field688) {
         class251 var2 = this.field7728.method2579((byte)125);
         IDirect3DDevice var3 = this.field681.field4766;
         var3.method3736(13, this.field7728.field4584 * this.field7728.field4571, this.field7728.field4622 * this.field7728.field4571, this.field7728.field4571 * this.field7728.field4568, 1.0F);
         var3.method3736(14, this.field7728.field4644 * this.field7728.field4584, this.field7728.field4644 * this.field7728.field4622, this.field7728.field4644 * this.field7728.field4568, 1.0F);
         var3.method3736(16, this.field7728.field4586 * this.field7728.field4584, this.field7728.field4622 * this.field7728.field4586, this.field7728.field4586 * this.field7728.field4568, 1.0F);
         var2.method1899(field685, this.field7728.field4662[2], arg0 ^ -477699926, this.field7728.field4662[1], this.field7728.field4662[0]);
         var3.SetVertexShaderConstantF(15, field685, 1);
         var2.method1899(field685, this.field7728.field4656[2], 2, this.field7728.field4656[1], this.field7728.field4656[0]);
         var3.SetVertexShaderConstantF(17, field685, 1);
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "(Lvn;Lqh;)V"
   )
   public class62(class332 arg0, class74 arg1) {
      super(arg0);
      this.field681 = arg0;
      if (arg1 != null && 257 <= (65535 & this.field681.field4768.VertexShaderVersion)) {
         this.field686 = this.field681.field4766.method3723(arg1.method720(false, field691[1], field691[2]));
         this.field679 = this.field681.field4766.method3723(arg1.method720(false, field691[0], field691[2]));
         this.field687 = this.field681.field4766.method3723(arg1.method720(false, field691[4], field691[2]));
         this.field680 = this.field681.field4766.method3723(arg1.method720(false, field691[3], field691[2]));
         if (!(this.field680 != null & this.field679 != null & this.field686 != null & this.field687 != null)) {
            this.field683 = false;
         } else {
            this.field690 = this.field7728.method2484(new int[]{0, -1}, false, 2, 1, (byte)2);
            this.field690.method36(10251, false, false);
            this.field683 = true;
         }
      } else {
         this.field683 = false;
      }

   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method470(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
