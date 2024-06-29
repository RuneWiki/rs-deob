import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class83 extends class567 {
   @OriginalMember(
      owner = "client!qw",
      name = "u",
      descriptor = "Lfa;"
   )
   private class246 field1082;
   @OriginalMember(
      owner = "client!qw",
      name = "s",
      descriptor = "Lvn;"
   )
   private class332 field1084;
   @OriginalMember(
      owner = "client!qw",
      name = "p",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field1083;
   @OriginalMember(
      owner = "client!qw",
      name = "r",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field1085;
   @OriginalMember(
      owner = "client!qw",
      name = "t",
      descriptor = "Z"
   )
   private boolean field1081;
   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1087 = new String[]{method818(method817("zM")), method818(method817("{[s\u001csq[h\u0010ojjh\u0014qnPa*v\u007fA`\u0007^h")), method818(method817("{[s\u001csq[h\u0010ojjh\u0014qnPa*v\u007fA`\u0007^x"))};
   @OriginalMember(
      owner = "client!qw",
      name = "q",
      descriptor = "[F"
   )
   private static float[] field1080 = new float[16];
   @OriginalMember(
      owner = "client!qw",
      name = "o",
      descriptor = "Z"
   )
   private boolean field1086;

   @OriginalMember(
      owner = "client!qw",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      if (this.field1086) {
         this.field1084.method2635((byte)-102, (IDirect3DVertexShader)null);
         this.field1084.method2645(arg0 ^ -110, (IDirect3DPixelShader)null);
         this.field7728.method2506(1, 89);
         this.field7728.method2581((class159)null, -7);
         this.field7728.method2506(0, 81);
         this.field7728.method2581((class159)null, arg0 ^ 121);
         this.field1086 = false;
      }

      if (arg0 != 0) {
         this.method6(80);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      if (arg0 >= -64) {
         this.field1082 = (class246)null;
      }

      return this.field1081;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method10(int arg0) {
      if (this.field1086) {
         IDirect3DDevice var2 = this.field1084.field4766;
         class251 var3 = this.field1084.method2546((byte)15);
         var2.method3732(0, var3.method1906(field1080, 84));
      }

      if (arg0 != -16711936) {
         this.method5(5);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(Lvn;Lqh;Lfa;)V"
   )
   public class83(class332 arg0, class74 arg1, class246 arg2) {
      super(arg0);
      this.field1082 = arg2;
      this.field1084 = arg0;
      if (arg1 != null && this.field7728.field4593 && this.field7728.field4666 && (this.field1084.field4768.VertexShaderVersion & 65535) >= 257) {
         this.field1083 = this.field1084.field4766.method3723(arg1.method720(false, field1087[1], field1087[0]));
         this.field1085 = this.field1084.field4766.method3731(arg1.method720(false, field1087[2], field1087[0]));
         this.field1081 = this.field1083 != null && this.field1085 != null && this.field1082.method1856(-105);
      } else {
         this.field1083 = null;
         this.field1081 = false;
         this.field1085 = null;
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      if (!arg0) {
         this.method9(-2, 7, 65);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      if (arg0 != -1309) {
         this.method4(33);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      int var4 = -32 / ((63 - arg1) / 58);
      if (this.field1086) {
         IDirect3DDevice var5 = this.field1084.field4766;
         int var6 = 1 << (3 & arg2);
         float var7 = (float)(1 << (arg2 >> 3 & 7)) / 32.0F;
         int var8 = arg0 & 65535;
         float var9 = (float)(arg0 >> 16 & 3) / 8.0F;
         var5.method3736(14, (float)(this.field7728.field4578 * var6 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         var5.method3736(15, var7, 0.0F, 0.0F, 0.0F);
         var5.method3730(4, (float)var8, 0.0F, 0.0F, 0.0F);
         var5.method3730(5, var9, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4(int arg0) {
      int var2 = 25 / ((arg0 - 62) / 45);
      if (this.field1086) {
         IDirect3DDevice var3 = this.field1084.field4766;
         if (-1 <= ~this.field7728.field4580) {
            var3.method3736(16, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var4 = this.field7728.field4606;
            float var5 = this.field7728.field4635;
            var3.method3736(16, var4, 1.0F / (var4 - var5), 0.0F, 0.0F);
         }

         var3.method3730(0, (float)((16765916 & this.field7728.field4628) >> 16) / 255.0F, (float)((this.field7728.field4628 & 65327) >> 8) / 255.0F, (float)(255 & this.field7728.field4628) / 255.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method2(int arg0) {
      if (this.field1086) {
         IDirect3DDevice var2 = this.field1084.field4766;
         var2.method3732(8, this.field7728.method2543(-87, field1080));
      }

      if (arg0 != 7938) {
         this.field1082 = (class246)null;
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method6(int arg0) {
      if (this.field1086) {
         IDirect3DDevice var2 = this.field1084.field4766;
         class251 var3 = this.field7728.method2601(false);
         var2.SetVertexShaderConstantF(12, var3.method1892((byte)-121, field1080), 2);
      }

      if (arg0 < 103) {
         this.field1081 = false;
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      if (arg1 != 10286) {
         this.method5(-34);
      }

      class142 var3 = this.field7728.method2492((byte)-90);
      if (this.field1081 && var3 != null) {
         IDirect3DDevice var4 = this.field1084.field4766;
         this.field1084.method2635((byte)-102, this.field1083);
         this.field1084.method2645(-86, this.field1085);
         this.field7728.method2506(1, -24);
         this.field7728.method2581(var3, arg1 + -10169);
         this.field7728.method2506(0, -30);
         this.field7728.method2581(this.field1082.field3085, 112);
         this.field1086 = true;
         this.method5(-67);
         this.method6(arg1 ^ 10332);
         this.method2(7938);
         this.method4(120);
         var4.method3730(1, -this.field7728.field4662[0], -this.field7728.field4662[1], -this.field7728.field4662[2], 0.0F);
         var4.method3730(2, this.field7728.field4584, this.field7728.field4622, this.field7728.field4568, 1.0F);
         var4.method3730(3, Math.abs(this.field7728.field4662[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5(int arg0) {
      if (this.field1086) {
         IDirect3DDevice var2 = this.field1084.field4766;
         class251 var3 = this.field1084.method2494(-129);
         class251 var4 = this.field1084.method2546((byte)15);
         var2.method3732(0, var4.method1906(field1080, -116));
         var2.method3732(4, var3.method1895(field1080, 16383));
      }

      if (arg0 > -38) {
         this.method2(-75);
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method817(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method818(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
