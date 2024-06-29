import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends class141 {
   @OriginalMember(
      owner = "client!rk",
      name = "o",
      descriptor = "Lbb;"
   )
   private class353 field504;
   @OriginalMember(
      owner = "client!rk",
      name = "m",
      descriptor = "Laq;"
   )
   private class172 field506;
   @OriginalMember(
      owner = "client!rk",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field505;
   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field507 = new String[]{method319(method318("]V\u0004/-YE\u0017$0]{\u0012 *LV")), method319(method318("M\\"))};
   @OriginalMember(
      owner = "client!rk",
      name = "p",
      descriptor = "[F"
   )
   private static float[] field503 = new float[16];

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "(B)V",
      line = 4
   )
   public final void method307(byte arg0) {
      this.field504.method2629((byte)102, (IDirect3DVertexShader)null);
      this.field1801.method2814(0, class10.field93, true);
      this.field1801.method2814(1, class691.field10171, true);
      this.field1801.method2814(2, class304.field4150, true);
      if (arg0 <= 102) {
         this.field505 = (IDirect3DVertexShader)null;
      }

      this.field1801.method2813(true, 8);
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(B)V",
      line = 19
   )
   public final void method308(byte arg0) {
      if (this.field505 != null) {
         IDirect3DDevice var2 = this.field504.field4742;
         class716 var3 = this.field1801.method2780(arg0 + -2);
         var3.method5202(arg0 ^ 6127, field503);
         field503[6] *= 0.25F;
         field503[5] *= 0.25F;
         field503[1] *= 0.25F;
         field503[0] *= 0.25F;
         field503[4] *= 0.25F;
         field503[7] *= 0.25F;
         field503[3] *= 0.25F;
         field503[2] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field503, 2);
      }

      if (arg0 != 86) {
         this.field504 = (class353)null;
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(ZZ)V",
      line = 46
   )
   public final void method309(boolean arg0, boolean arg1) {
      this.field1801.method2814(0, class10.field93, true);
      this.field1801.method2814(1, class304.field4150, true);
      this.field1801.method2635(class691.field10171, 2, -125, arg0, true);
      this.field1801.method2813(false, 8);
      this.field504.method2629((byte)102, this.field505);
      this.method312((byte)124);
      this.method308((byte)86);
      this.method315((byte)50);
      this.method314((byte)94);
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lm;II)V",
      line = 61
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      if (arg2 != 0) {
         this.method311(false, true);
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZZ)V",
      line = 73
   )
   public final void method311(boolean arg0, boolean arg1) {
      this.field1801.method2745(-30, class144.field1826, class358.field4889);
      if (arg0) {
         this.field506 = (class172)null;
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(B)V",
      line = 83
   )
   public final void method312(byte arg0) {
      if (arg0 >= 121) {
         if (this.field505 != null) {
            IDirect3DDevice var2 = this.field504.field4742;
            class716 var3 = this.field504.method2764(2);
            var2.method3716(0, var3.method5192(field503, 3));
         }

      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "(Lbb;Lkf;Laq;)V",
      line = 104
   )
   public class35(class353 arg0, class266 arg1, class172 arg2) {
      super(arg0);
      this.field504 = arg0;
      this.field506 = arg2;
      if (arg1 != null && this.field506.method1401(-74) && -258 >= ~(65535 & this.field504.field4747.VertexShaderVersion)) {
         this.field505 = this.field504.field4742.method3715(arg1.method2032(field507[0], (byte)-72, field507[1]));
      } else {
         this.field505 = null;
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Z)Z",
      line = 123
   )
   public final boolean method313(boolean arg0) {
      if (!arg0) {
         return true;
      } else {
         return this.field505 != null;
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "g",
      descriptor = "(B)V",
      line = 133
   )
   public final void method314(byte arg0) {
      if (this.field505 != null) {
         IDirect3DDevice var2 = this.field504.field4742;
         if (~this.field1801.field5285 < -1) {
            float var3 = this.field1801.field5293;
            float var4 = this.field1801.field5313;
            float var5 = var4 - 512.0F;
            var2.method3714(10, var5, 1.0F / (-var5 + var4), var4, 1.0F / (var3 - var4));
         } else {
            var2.method3714(10, 0.0F, 0.0F, 0.0F, 0.0F);
         }

         this.field1801.method2752(this.field1801.field5269, (byte)50);
      }

      if (arg0 != 94) {
         this.method313(false);
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(B)V",
      line = 163
   )
   public final void method315(byte arg0) {
      int var2 = -17 % ((-34 - arg0) / 52);
      if (this.field505 != null) {
         IDirect3DDevice var3 = this.field504.field4742;
         var3.method3716(4, this.field1801.method2790(false, field503));
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I)V",
      line = 177
   )
   public final void method316(int arg0) {
      if (arg0 < 19) {
         this.field505 = (IDirect3DVertexShader)null;
      }

      if (this.field505 != null) {
         IDirect3DDevice var2 = this.field504.field4742;
         class716 var3 = this.field504.method2764(2);
         var2.method3716(0, var3.method5192(field503, 3));
      }

   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(III)V",
      line = 196
   )
   public final void method317(int arg0, int arg1, int arg2) {
      IDirect3DDevice var4 = this.field504.field4742;
      if (arg0 == 0) {
         if (this.field506.field2393) {
            float var5 = (float)(this.field1801.field5301 % 4000) / 4000.0F;
            this.field1801.method2804(this.field506.field2387, -2);
            var4.method3714(11, var5, 0.0F, 0.0F, 0.0F);
         } else {
            int var6 = this.field1801.field5301 % 4000 * 16 / 4000;
            this.field1801.method2804(this.field506.field2397[var6], arg0 ^ -2);
            var4.method3714(11, 0.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method319(char[] arg0) {
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
            var10005 = 36;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
