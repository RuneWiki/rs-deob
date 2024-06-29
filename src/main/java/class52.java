import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 extends class331 {
   @OriginalMember(
      owner = "client!kaa",
      name = "o",
      descriptor = "Lwr;"
   )
   private class482 field610;
   @OriginalMember(
      owner = "client!kaa",
      name = "p",
      descriptor = "Lfi;"
   )
   private class582 field611;
   @OriginalMember(
      owner = "client!kaa",
      name = "q",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field612;
   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field614 = new String[]{method419(method418("\u0007Z")), method419(method418("\u0017P`'g\u0013Cs,z\u0017}v(`\u0006P"))};
   @OriginalMember(
      owner = "client!kaa",
      name = "n",
      descriptor = "[F"
   )
   private static float[] field613 = new float[16];

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method407(byte arg0) {
      if (arg0 < 16) {
         return false;
      } else {
         return this.field612 != null;
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method408(int arg0) {
      if (this.field612 != null) {
         IDirect3DDevice var2 = this.field611.field8614;
         class495 var3 = this.field611.method2638((byte)-45);
         var2.method3776(0, var3.method3678(field613, 0));
      }

      if (arg0 <= 57) {
         this.method408(71);
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method409(int arg0) {
      if (this.field612 != null) {
         IDirect3DDevice var2 = this.field611.field8614;
         var2.method3776(4, this.field4745.method2606(field613, false));
      }

      if (arg0 != -20939) {
         this.field612 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method410(int arg0, boolean arg1) {
      this.field4745.method2636(-103, 0, class496.field7336);
      this.field4745.method2636(-120, 1, class522.field7591);
      this.field4745.method2629(class219.field2784, -91, 2, true, false);
      this.field4745.method2634(2, false);
      this.field611.method4283(17, this.field612);
      this.method415(true);
      this.method416(true);
      this.method409(-20939);
      this.method413((byte)87);
      if (arg0 <= 3) {
         field613 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method411(int arg0) {
      this.field611.method4283(102, (IDirect3DVertexShader)null);
      this.field4745.method2636(-122, 0, class496.field7336);
      this.field4745.method2636(-105, 1, class219.field2784);
      this.field4745.method2636(-124, 2, class522.field7591);
      if (arg0 < -21) {
         this.field4745.method2634(2, true);
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "(Lfi;Leaa;Lwr;)V"
   )
   public class52(class582 arg0, class526 arg1, class482 arg2) {
      super(arg0);
      this.field610 = arg2;
      this.field611 = arg0;
      if (arg1 != null && this.field610.method3579(2) && ~(this.field611.field8629.VertexShaderVersion & 65535) <= -258) {
         this.field612 = this.field611.field8614.method3783(arg1.method3878(false, field614[0], field614[1]));
      } else {
         this.field612 = null;
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method412(int arg0, int arg1, int arg2) {
      if (arg1 != 9950) {
         this.method409(-24);
      }

      IDirect3DDevice var4 = this.field611.field8614;
      if (this.field610.field7152) {
         float var5 = (float)(this.field4745.field5008 % 4000) / 4000.0F;
         this.field4745.method2578(this.field610.field7155, true);
         var4.method3781(11, var5, 0.0F, 0.0F, 0.0F);
      } else {
         int var6 = this.field4745.field5008 % 4000 * 16 / 4000;
         this.field4745.method2578(this.field610.field7153[var6], true);
         var4.method3781(11, 0.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method413(byte arg0) {
      if (arg0 != 87) {
         this.method407((byte)-36);
      }

      if (this.field612 != null) {
         IDirect3DDevice var2 = this.field611.field8614;
         if (~this.field4745.field5077 >= -1) {
            var2.method3781(10, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field4745.field5020;
            float var4 = this.field4745.field5093;
            float var5 = var4 + -512.0F;
            var2.method3781(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (-var4 + var3));
         }

         this.field4745.method2646(this.field4745.field5083, 123);
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      if (arg0 != 0) {
         this.field611 = (class582)null;
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method415(boolean arg0) {
      if (arg0) {
         if (this.field612 != null) {
            IDirect3DDevice var2 = this.field611.field8614;
            class495 var3 = this.field611.method2638((byte)-115);
            var2.method3776(0, var3.method3678(field613, 0));
         }

      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method416(boolean arg0) {
      if (this.field612 != null) {
         IDirect3DDevice var2 = this.field611.field8614;
         class495 var3 = this.field4745.method2559(0);
         var3.method3669((byte)-126, field613);
         field613[2] *= 0.25F;
         field613[4] *= 0.25F;
         field613[3] *= 0.25F;
         field613[6] *= 0.25F;
         field613[7] *= 0.25F;
         field613[0] *= 0.25F;
         field613[1] *= 0.25F;
         field613[5] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field613, 2);
      }

      if (!arg0) {
         this.method411(121);
      }

   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method417(boolean arg0, byte arg1) {
      if (arg1 == -102) {
         this.field4745.method2568(class225.field2891, class325.field4618, false);
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method418(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method419(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
