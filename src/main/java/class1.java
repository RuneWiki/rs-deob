import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class567 {
   @OriginalMember(
      owner = "client!us",
      name = "q",
      descriptor = "Lvn;"
   )
   private class332 field1;
   @OriginalMember(
      owner = "client!us",
      name = "o",
      descriptor = "Lfa;"
   )
   private class246 field3;
   @OriginalMember(
      owner = "client!us",
      name = "r",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4;
   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5 = new String[]{method13(method12("\u0001+")), method13(method12("\u0011!X\u0018U\u00152K\u0013H\u0011\fN\u0017R\u0000!"))};
   @OriginalMember(
      owner = "client!us",
      name = "p",
      descriptor = "[F"
   )
   private static float[] field2 = new float[16];

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      if (arg0 == -1309) {
         this.field7728.method2587(class59.field623, arg0 + 1205, class581.field7982);
      }
   }

   @OriginalMember(
      owner = "client!us",
      name = "<init>",
      descriptor = "(Lvn;Lqh;Lfa;)V"
   )
   public class1(class332 arg0, class74 arg1, class246 arg2) {
      super(arg0);
      this.field1 = arg0;
      this.field3 = arg2;
      if (arg1 != null && this.field3.method1858(572) && (this.field1.field4768.VertexShaderVersion & 65535) >= 257) {
         this.field4 = this.field1.field4766.method3723(arg1.method720(false, field5[1], field5[0]));
      } else {
         this.field4 = null;
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method2(int arg0) {
      if (this.field4 != null) {
         IDirect3DDevice var2 = this.field1.field4766;
         var2.method3732(4, this.field7728.method2543(arg0 + -7942, field2));
      }

      if (arg0 != 7938) {
         this.method7(true, 47);
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      this.field1.method2635((byte)-102, (IDirect3DVertexShader)null);
      this.field7728.method2547(0, class550.field7513, 0);
      this.field7728.method2547(1, class544.field7429, 0);
      this.field7728.method2547(2, class206.field2525, arg0);
      this.field7728.method2556(true, false);
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4(int arg0) {
      int var2 = -26 / ((62 - arg0) / 45);
      if (this.field4 != null) {
         IDirect3DDevice var3 = this.field1.field4766;
         if (0 >= this.field7728.field4580) {
            var3.method3736(10, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var4 = this.field7728.field4606;
            float var5 = this.field7728.field4635;
            float var6 = var5 + -512.0F;
            var3.method3736(10, var6, 1.0F / (var5 - var6), var5, 1.0F / (var4 - var5));
         }

         this.field7728.method2552(this.field7728.field4628, true);
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5(int arg0) {
      if (this.field4 != null) {
         IDirect3DDevice var2 = this.field1.field4766;
         class251 var3 = this.field1.method2546((byte)15);
         var2.method3732(0, var3.method1906(field2, -98));
      }

      if (arg0 >= -38) {
         this.method7(true, 32);
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method6(int arg0) {
      if (this.field4 != null) {
         IDirect3DDevice var2 = this.field1.field4766;
         class251 var3 = this.field7728.method2601(false);
         var3.method1892((byte)-127, field2);
         field2[2] *= 0.25F;
         field2[3] *= 0.25F;
         field2[5] *= 0.25F;
         field2[1] *= 0.25F;
         field2[0] *= 0.25F;
         field2[4] *= 0.25F;
         field2[7] *= 0.25F;
         field2[6] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field2, 2);
      }

      if (arg0 <= 103) {
         this.field4 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      this.field7728.method2547(0, class550.field7513, arg1 ^ arg1);
      this.field7728.method2547(1, class206.field2525, 0);
      this.field7728.method2517(class544.field7429, arg1 ^ -10287, 2, false, true);
      this.field7728.method2556(false, false);
      this.field1.method2635((byte)-102, this.field4);
      this.method10(-16711936);
      this.method6(arg1 ^ 10304);
      this.method2(arg1 ^ 14124);
      this.method4(arg1 ^ 10306);
   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      if (!arg0) {
         this.field3 = (class246)null;
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      int var4 = 119 % ((63 - arg1) / 58);
      IDirect3DDevice var5 = this.field1.field4766;
      if (this.field3.field3087) {
         float var6 = (float)(this.field7728.field4578 % 4000) / 4000.0F;
         this.field7728.method2581(this.field3.field3088, -116);
         var5.method3736(11, var6, 0.0F, 0.0F, 0.0F);
      } else {
         int var7 = this.field7728.field4578 % 4000 * 16 / 4000;
         this.field7728.method2581(this.field3.field3084[var7], 117);
         var5.method3736(11, 0.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method10(int arg0) {
      if (this.field4 != null) {
         IDirect3DDevice var2 = this.field1.field4766;
         class251 var3 = this.field1.method2546((byte)15);
         var2.method3732(0, var3.method1906(field2, arg0 ^ -16711817));
      }

      if (arg0 != -16711936) {
         this.method10(-30);
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      if (arg0 >= -64) {
         this.field4 = (IDirect3DVertexShader)null;
      }

      return this.field4 != null;
   }

   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method12(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!us",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method13(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
