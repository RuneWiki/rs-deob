import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class340 extends class331 {
   @OriginalMember(
      owner = "client!db",
      name = "p",
      descriptor = "Lfi;"
   )
   private class582 field5157;
   @OriginalMember(
      owner = "client!db",
      name = "r",
      descriptor = "Lwr;"
   )
   private class482 field5159;
   @OriginalMember(
      owner = "client!db",
      name = "q",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field5156;
   @OriginalMember(
      owner = "client!db",
      name = "t",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field5155;
   @OriginalMember(
      owner = "client!db",
      name = "o",
      descriptor = "Z"
   )
   private boolean field5158;
   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5162 = new String[]{method2695(method2694("\r\r8/\u0019\u0007\r##\u0005\u001c<#'\u001b\u0018\u0006*\u0019\u001c\t\u0017+44\u001e")), method2695(method2694("\f\u001b")), method2695(method2694("\r\r8/\u0019\u0007\r##\u0005\u001c<#'\u001b\u0018\u0006*\u0019\u001c\t\u0017+44\u000e"))};
   @OriginalMember(
      owner = "client!db",
      name = "s",
      descriptor = "[F"
   )
   private static float[] field5160 = new float[16];
   @OriginalMember(
      owner = "client!db",
      name = "n",
      descriptor = "Z"
   )
   private boolean field5161;

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public final void method416(boolean arg0) {
      if (!arg0) {
         field5160 = (float[])null;
      }

      if (this.field5161) {
         IDirect3DDevice var2 = this.field5157.field8614;
         class495 var3 = this.field4745.method2559(0);
         var2.SetVertexShaderConstantF(12, var3.method3669((byte)-116, field5160), 2);
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(B)Z",
      line = 22
   )
   public final boolean method407(byte arg0) {
      if (arg0 <= 16) {
         this.method409(-12);
      }

      return this.field5158;
   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(I)V",
      line = 32
   )
   public final void method411(int arg0) {
      if (this.field5161) {
         this.field5157.method4283(-113, (IDirect3DVertexShader)null);
         this.field5157.method4286((byte)-121, (IDirect3DPixelShader)null);
         this.field4745.method2574(103, 1);
         this.field4745.method2578((class254)null, true);
         this.field4745.method2574(90, 0);
         this.field4745.method2578((class254)null, true);
         this.field5161 = false;
      }

      if (arg0 >= -21) {
         this.method410(-66, false);
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "d",
      descriptor = "(I)V",
      line = 59
   )
   public final void method409(int arg0) {
      if (arg0 != -20939) {
         this.field5156 = (IDirect3DVertexShader)null;
      }

      if (this.field5161) {
         IDirect3DDevice var2 = this.field5157.field8614;
         var2.method3776(8, this.field4745.method2606(field5160, false));
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(Z)V",
      line = 76
   )
   public final void method415(boolean arg0) {
      if (this.field5161) {
         IDirect3DDevice var2 = this.field5157.field8614;
         class495 var3 = this.field5157.method2638((byte)-91);
         var2.method3776(0, var3.method3678(field5160, 0));
      }

      if (!arg0) {
         this.field5159 = (class482)null;
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(III)V",
      line = 95
   )
   public final void method412(int arg0, int arg1, int arg2) {
      if (arg1 != 9950) {
         this.method408(69);
      }

      if (this.field5161) {
         IDirect3DDevice var4 = this.field5157.field8614;
         int var5 = 1 << (arg0 & 3);
         float var6 = (float)(1 << (7 & arg0 >> 3)) / 32.0F;
         int var7 = 65535 & arg2;
         var4.method3781(14, (float)(this.field4745.field5008 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         float var8 = (float)(3 & arg2 >> 16) / 8.0F;
         var4.method3781(15, var6, 0.0F, 0.0F, 0.0F);
         var4.method3777(4, (float)var7, 0.0F, 0.0F, 0.0F);
         var4.method3777(5, var8, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "<init>",
      descriptor = "(Lfi;Leaa;Lwr;)V",
      line = 122
   )
   public class340(class582 arg0, class526 arg1, class482 arg2) {
      super(arg0);
      this.field5157 = arg0;
      this.field5159 = arg2;
      if (arg1 != null && this.field4745.field5056 && this.field4745.field5019 && (this.field5157.field8629.VertexShaderVersion & 65535) >= 257) {
         this.field5156 = this.field5157.field8614.method3783(arg1.method3878(false, field5162[1], field5162[0]));
         this.field5155 = this.field5157.field8614.method3780(arg1.method3878(false, field5162[1], field5162[2]));
         this.field5158 = this.field5156 != null && this.field5155 != null && this.field5159.method3575(false);
      } else {
         this.field5156 = null;
         this.field5158 = false;
         this.field5155 = null;
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "b",
      descriptor = "(B)V",
      line = 146
   )
   public final void method413(byte arg0) {
      if (arg0 != 87) {
         this.field5155 = (IDirect3DPixelShader)null;
      }

      if (this.field5161) {
         IDirect3DDevice var2 = this.field5157.field8614;
         if (0 < this.field4745.field5077) {
            float var3 = this.field4745.field5020;
            float var4 = this.field4745.field5093;
            var2.method3781(16, var3, 1.0F / (-var4 + var3), 0.0F, 0.0F);
         } else {
            var2.method3781(16, 0.0F, 0.0F, 0.0F, 0.0F);
         }

         var2.method3777(0, (float)((this.field4745.field5083 & 16764696) >> 16) / 255.0F, (float)(255 & this.field4745.field5083 >> 8) / 255.0F, (float)(255 & this.field4745.field5083) / 255.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "e",
      descriptor = "(I)V",
      line = 174
   )
   public final void method408(int arg0) {
      if (this.field5161) {
         IDirect3DDevice var2 = this.field5157.field8614;
         class495 var3 = this.field5157.method2681(false);
         class495 var4 = this.field5157.method2638((byte)-70);
         var2.method3776(0, var4.method3678(field5160, 0));
         var2.method3776(4, var3.method3667(field5160, (byte)-77));
      }

      if (arg0 < 57) {
         this.field5158 = false;
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(IILuha;)V",
      line = 199
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      if (arg0 != 0) {
         field5160 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(IZ)V",
      line = 209
   )
   public final void method410(int arg0, boolean arg1) {
      if (arg0 >= 3) {
         class223 var3 = this.field4745.method2669(-720);
         if (this.field5158 && var3 != null) {
            IDirect3DDevice var4 = this.field5157.field8614;
            this.field5157.method4283(-108, this.field5156);
            this.field5157.method4286((byte)-127, this.field5155);
            this.field4745.method2574(98, 1);
            this.field4745.method2578(var3, true);
            this.field4745.method2574(104, 0);
            this.field4745.method2578(this.field5159.field7150, true);
            this.field5161 = true;
            this.method408(74);
            this.method416(true);
            this.method409(-20939);
            this.method413((byte)87);
            var4.method3777(1, -this.field4745.field5057[0], -this.field4745.field5057[1], -this.field4745.field5057[2], 0.0F);
            var4.method3777(2, this.field4745.field5082, this.field4745.field5047, this.field4745.field5062, 1.0F);
            var4.method3777(3, 928.0F * Math.abs(this.field4745.field5057[1]) + 96.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   @OriginalMember(
      owner = "client!db",
      name = "a",
      descriptor = "(ZB)V",
      line = 239
   )
   public final void method417(boolean arg0, byte arg1) {
      if (arg1 != -102) {
         this.field5155 = (IDirect3DPixelShader)null;
      }

   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2694(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!db",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2695(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
