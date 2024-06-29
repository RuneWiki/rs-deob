import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class717 extends class141 {
   @OriginalMember(
      owner = "client!bs",
      name = "o",
      descriptor = "Lbb;"
   )
   private class353 field10462;
   @OriginalMember(
      owner = "client!bs",
      name = "n",
      descriptor = "Laq;"
   )
   private class172 field10465;
   @OriginalMember(
      owner = "client!bs",
      name = "m",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10464;
   @OriginalMember(
      owner = "client!bs",
      name = "r",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field10467;
   @OriginalMember(
      owner = "client!bs",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10461;
   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10468 = new String[]{method5217(method5216("2\u000b\u001bb-8\u000b\u0000n1#:\u0000j/'\u0000\tT(6\u0011\by\u0000!")), method5217(method5216("3\u001d")), method5217(method5216("2\u000b\u001bb-8\u000b\u0000n1#:\u0000j/'\u0000\tT(6\u0011\by\u00001"))};
   @OriginalMember(
      owner = "client!bs",
      name = "s",
      descriptor = "[F"
   )
   private static float[] field10466 = new float[16];
   @OriginalMember(
      owner = "client!bs",
      name = "p",
      descriptor = "Z"
   )
   private boolean field10463;

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      class349 var3 = this.field1801.method2779(-122);
      if (this.field10461 && var3 != null) {
         IDirect3DDevice var4 = this.field10462.field4742;
         this.field10462.method2629((byte)102, this.field10464);
         this.field10462.method2626((byte)113, this.field10467);
         this.field1801.method2763(1, -47);
         this.field1801.method2804(var3, -2);
         this.field1801.method2763(0, -68);
         this.field1801.method2804(this.field10465.field2386, -2);
         this.field10463 = true;
         this.method316(29);
         this.method308((byte)86);
         this.method315((byte)-127);
         this.method314((byte)94);
         var4.method3720(1, -this.field1801.field5338[0], -this.field1801.field5338[1], -this.field1801.field5338[2], 0.0F);
         var4.method3720(2, this.field1801.field5296, this.field1801.field5322, this.field1801.field5283, 1.0F);
         var4.method3720(3, 928.0F * Math.abs(this.field1801.field5338[1]) + 96.0F, 0.0F, 0.0F, 0.0F);
      }

      if (arg0) {
         this.field10467 = (IDirect3DPixelShader)null;
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      if (arg2 != 0) {
         this.field10465 = (class172)null;
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method312(byte arg0) {
      if (this.field10463) {
         IDirect3DDevice var2 = this.field10462.field4742;
         class716 var3 = this.field10462.method2764(2);
         var2.method3716(0, var3.method5192(field10466, 3));
      }

      if (arg0 < 121) {
         this.field10462 = (class353)null;
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      if (arg0) {
         this.field10465 = (class172)null;
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      return !arg0 ? true : this.field10461;
   }

   @OriginalMember(
      owner = "client!bs",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      if (this.field10463) {
         this.field10462.method2629((byte)102, (IDirect3DVertexShader)null);
         this.field10462.method2626((byte)123, (IDirect3DPixelShader)null);
         this.field1801.method2763(1, -44);
         this.field1801.method2804((class205)null, -2);
         this.field1801.method2763(0, -125);
         this.field1801.method2804((class205)null, -2);
         this.field10463 = false;
      }

      if (arg0 < 102) {
         this.method309(true, false);
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      if (arg0 != 0) {
         this.field10467 = (IDirect3DPixelShader)null;
      }

      if (this.field10463) {
         IDirect3DDevice var4 = this.field10462.field4742;
         int var5 = 1 << (3 & arg2);
         float var6 = (float)(1 << ((59 & arg2) >> 3)) / 32.0F;
         int var7 = 65535 & arg1;
         var4.method3714(14, (float)(this.field1801.field5301 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         float var8 = (float)(3 & arg1 >> 16) / 8.0F;
         var4.method3714(15, var6, 0.0F, 0.0F, 0.0F);
         var4.method3720(4, (float)var7, 0.0F, 0.0F, 0.0F);
         var4.method3720(5, var8, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method316(int arg0) {
      if (this.field10463) {
         IDirect3DDevice var2 = this.field10462.field4742;
         class716 var3 = this.field10462.method2817(78);
         class716 var4 = this.field10462.method2764(2);
         var2.method3716(0, var4.method5192(field10466, 3));
         var2.method3716(4, var3.method5208(true, field10466));
      }

      if (arg0 <= 19) {
         this.method309(false, false);
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "<init>",
      descriptor = "(Lbb;Lkf;Laq;)V"
   )
   public class717(class353 arg0, class266 arg1, class172 arg2) {
      super(arg0);
      this.field10462 = arg0;
      this.field10465 = arg2;
      if (arg1 != null && this.field1801.field5324 && this.field1801.field5281 && 257 <= (this.field10462.field4747.VertexShaderVersion & 65535)) {
         this.field10464 = this.field10462.field4742.method3715(arg1.method2032(field10468[0], (byte)-72, field10468[1]));
         this.field10467 = this.field10462.field4742.method3719(arg1.method2032(field10468[2], (byte)-72, field10468[1]));
         this.field10461 = this.field10464 != null && this.field10467 != null && this.field10465.method1398(-33);
      } else {
         this.field10467 = null;
         this.field10464 = null;
         this.field10461 = false;
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method315(byte arg0) {
      int var2 = -18 / ((-34 - arg0) / 52);
      if (this.field10463) {
         IDirect3DDevice var3 = this.field10462.field4742;
         var3.method3716(8, this.field1801.method2790(false, field10466));
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method308(byte arg0) {
      if (arg0 != 86) {
         this.field10467 = (IDirect3DPixelShader)null;
      }

      if (this.field10463) {
         IDirect3DDevice var2 = this.field10462.field4742;
         class716 var3 = this.field1801.method2780(-114);
         var2.SetVertexShaderConstantF(12, var3.method5202(6073, field10466), 2);
      }

   }

   @OriginalMember(
      owner = "client!bs",
      name = "g",
      descriptor = "(B)V"
   )
   public final void method314(byte arg0) {
      if (arg0 == 94) {
         if (this.field10463) {
            IDirect3DDevice var2 = this.field10462.field4742;
            if (~this.field1801.field5285 >= -1) {
               var2.method3714(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
               float var3 = this.field1801.field5293;
               float var4 = this.field1801.field5313;
               var2.method3714(16, var3, 1.0F / (-var4 + var3), 0.0F, 0.0F);
            }

            var2.method3720(0, (float)(this.field1801.field5269 >> 16 & 255) / 255.0F, (float)((this.field1801.field5269 & 65524) >> 8) / 255.0F, (float)(this.field1801.field5269 & 255) / 255.0F, 0.0F);
         }

      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5216(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5217(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
