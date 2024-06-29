import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class180 extends class242 {
   @OriginalMember(
      owner = "client!cda",
      name = "q",
      descriptor = "Lvea;"
   )
   private class287 field2776;
   @OriginalMember(
      owner = "client!cda",
      name = "o",
      descriptor = "Lqu;"
   )
   private class105 field2778;
   @OriginalMember(
      owner = "client!cda",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2779;
   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2780 = new String[]{method1601(method1600("\u001b\u0012")), method1601(method1600("\u000b\u0018 ]\u0002\u000f\u000b3V\u001f\u000b56R\u0005\u001a\u0018"))};
   @OriginalMember(
      owner = "client!cda",
      name = "p",
      descriptor = "[F"
   )
   private static float[] field2777 = new float[16];

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(ZZ)V",
      line = 4
   )
   public final void method70(boolean arg0, boolean arg1) {
      if (arg0) {
         this.field3498.method2761(class226.field3348, (byte)-69, class345.field4912);
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "<init>",
      descriptor = "(Lvea;Lhw;Lqu;)V",
      line = 14
   )
   public class180(class287 arg0, class141 arg1, class105 arg2) {
      super(arg0);
      this.field2776 = arg0;
      this.field2778 = arg2;
      if (arg1 != null && this.field2778.method1022(4) && 257 <= (65535 & this.field2776.field4014.VertexShaderVersion)) {
         this.field2779 = this.field2776.field4018.method3805(arg1.method1348(field2780[0], field2780[1], 58));
      } else {
         this.field2779 = null;
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(ZI)V",
      line = 31
   )
   public final void method72(boolean arg0, int arg1) {
      this.field3498.method2779(8, 0, class540.field7850);
      this.field3498.method2779(arg1 + 29469, 1, class295.field4119);
      this.field3498.method1177(true, 2, false, class701.field10248, -115);
      this.field3498.method2792(false, arg1 + 29461);
      this.field2776.method2234(36, this.field2779);
      this.method1596((byte)121);
      this.method1598(97);
      this.method1597(25728);
      if (arg1 == -29461) {
         this.method74(-1);
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "f",
      descriptor = "(I)V",
      line = 49
   )
   public final void method68(int arg0) {
      this.field2776.method2234(36, (IDirect3DVertexShader)null);
      this.field3498.method2779(8, 0, class540.field7850);
      this.field3498.method2779(8, 1, class701.field10248);
      this.field3498.method2779(8, 2, class295.field4119);
      int var2 = -23 % ((27 - arg0) / 34);
      this.field3498.method2792(true, 0);
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(B)V",
      line = 63
   )
   public final void method1596(byte arg0) {
      int var2 = 100 % ((arg0 - -39) / 62);
      if (this.field2779 != null) {
         IDirect3DDevice var3 = this.field2776.field4018;
         class104 var4 = this.field2776.method2775((byte)76);
         var3.method3816(0, var4.method1012((byte)-28, field2777));
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(I)V",
      line = 80
   )
   public final void method74(int arg0) {
      if (this.field2779 != null) {
         IDirect3DDevice var2 = this.field2776.field4018;
         if (~this.field3498.field5310 >= -1) {
            var2.method3817(10, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field3498.field5238;
            float var4 = this.field3498.field5301;
            float var5 = var4 + -512.0F;
            var2.method3817(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
         }

         this.field3498.method2754(this.field3498.field5319, (byte)-73);
      }

      if (arg0 != -1) {
         this.method72(false, -123);
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(IIB)V",
      line = 113
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      if (arg2 >= -64) {
         this.method74(-81);
      }

      IDirect3DDevice var4 = this.field2776.field4018;
      if (this.field2778.field1744) {
         float var5 = (float)(this.field3498.field5227 % 4000) / 4000.0F;
         this.field3498.method2806(false, this.field2778.field1749);
         var4.method3817(11, var5, 0.0F, 0.0F, 0.0F);
      } else {
         int var6 = this.field3498.field5227 % 4000 * 16 / 4000;
         this.field3498.method2806(false, this.field2778.field1746[var6]);
         var4.method3817(11, 0.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "b",
      descriptor = "(I)V",
      line = 138
   )
   public final void method1597(int arg0) {
      if (arg0 != 25728) {
         this.method68(-126);
      }

      if (this.field2779 != null) {
         IDirect3DDevice var2 = this.field2776.field4018;
         var2.method3816(4, this.field3498.method2763(field2777, (byte)-125));
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "c",
      descriptor = "(I)V",
      line = 154
   )
   public final void method1598(int arg0) {
      if (this.field2779 != null) {
         IDirect3DDevice var2 = this.field2776.field4018;
         class104 var3 = this.field3498.method2794(false);
         var3.method995((byte)-116, field2777);
         field2777[1] *= 0.25F;
         field2777[4] *= 0.25F;
         field2777[2] *= 0.25F;
         field2777[0] *= 0.25F;
         field2777[7] *= 0.25F;
         field2777[5] *= 0.25F;
         field2777[3] *= 0.25F;
         field2777[6] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field2777, 2);
      }

      if (arg0 < 54) {
         this.method72(true, -19);
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "b",
      descriptor = "(B)V",
      line = 183
   )
   public final void method1599(byte arg0) {
      if (this.field2779 != null) {
         IDirect3DDevice var2 = this.field2776.field4018;
         class104 var3 = this.field2776.method2775((byte)60);
         var2.method3816(0, var3.method1012((byte)-28, field2777));
      }

      if (arg0 > -96) {
         this.field2779 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(IILbt;)V",
      line = 203
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      if (arg1 <= 12) {
         this.method1596((byte)31);
      }

   }

   @OriginalMember(
      owner = "client!cda",
      name = "e",
      descriptor = "(I)Z",
      line = 215
   )
   public final boolean method69(int arg0) {
      if (arg0 != 30453) {
         this.field2778 = (class105)null;
      }

      return this.field2779 != null;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1600(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1601(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
