import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class203 extends class331 {
   @OriginalMember(
      owner = "client!ru",
      name = "p",
      descriptor = "Z"
   )
   private boolean field2549 = false;
   @OriginalMember(
      owner = "client!ru",
      name = "v",
      descriptor = "Lfi;"
   )
   private class582 field2557;
   @OriginalMember(
      owner = "client!ru",
      name = "q",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2554;
   @OriginalMember(
      owner = "client!ru",
      name = "u",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2556;
   @OriginalMember(
      owner = "client!ru",
      name = "s",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2548;
   @OriginalMember(
      owner = "client!ru",
      name = "y",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2547;
   @OriginalMember(
      owner = "client!ru",
      name = "r",
      descriptor = "Z"
   )
   private boolean field2555;
   @OriginalMember(
      owner = "client!ru",
      name = "w",
      descriptor = "Loia;"
   )
   private class95 field2553;
   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2559 = new String[]{method1561(method1560("\u001e:\u0018(<\u000f(+\u001a?\u00029")), method1561(method1560("\u001e:\u0018(<\u000f(+\u001a&\u0005!.1")), method1561(method1560("\u000f5")), method1561(method1560("\u001e:\u0018\"!\u00048)!\f\u0007$3")), method1561(method1560("\u001e:\u0018\"!\u00048)!\f\u001e#+,'"))};
   @OriginalMember(
      owner = "client!ru",
      name = "o",
      descriptor = "[F"
   )
   private static float[] field2550 = new float[16];
   @OriginalMember(
      owner = "client!ru",
      name = "x",
      descriptor = "[F"
   )
   private static float[] field2551 = new float[4];
   @OriginalMember(
      owner = "client!ru",
      name = "t",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2552;
   @OriginalMember(
      owner = "client!ru",
      name = "n",
      descriptor = "Z"
   )
   private boolean field2558;

   @OriginalMember(
      owner = "client!ru",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method409(int arg0) {
      if (this.field2552 != null) {
         IDirect3DDevice var2 = this.field2557.field8614;
         var2.method3776(4, this.field4745.method2606(field2550, false));
      }

      if (arg0 != -20939) {
         this.method416(true);
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "<init>",
      descriptor = "(Lfi;Leaa;)V"
   )
   public class203(class582 arg0, class526 arg1) {
      super(arg0);
      this.field2557 = arg0;
      if (arg1 != null && 257 <= (this.field2557.field8629.VertexShaderVersion & 65535)) {
         this.field2554 = this.field2557.field8614.method3783(arg1.method3878(false, field2559[2], field2559[4]));
         this.field2556 = this.field2557.field8614.method3783(arg1.method3878(false, field2559[2], field2559[3]));
         this.field2548 = this.field2557.field8614.method3783(arg1.method3878(false, field2559[2], field2559[1]));
         this.field2547 = this.field2557.field8614.method3783(arg1.method3878(false, field2559[2], field2559[0]));
         if (!(this.field2548 != null & this.field2556 != null & this.field2554 != null & this.field2547 != null)) {
            this.field2555 = false;
         } else {
            this.field2553 = this.field4745.method2577(false, 2, new int[]{0, -1}, 1, 2);
            this.field2553.method502(111, false, false);
            this.field2555 = true;
         }
      } else {
         this.field2555 = false;
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method1558(int arg0) {
      if (arg0 == -1007208543) {
         if (this.field2552 != null && this.field2558) {
            class495 var2 = this.field4745.method2641(63);
            IDirect3DDevice var3 = this.field2557.field8614;
            var3.method3781(13, this.field4745.field5082 * this.field4745.field5059, this.field4745.field5059 * this.field4745.field5047, this.field4745.field5062 * this.field4745.field5059, 1.0F);
            var3.method3781(14, this.field4745.field5082 * this.field4745.field5024, this.field4745.field5047 * this.field4745.field5024, this.field4745.field5062 * this.field4745.field5024, 1.0F);
            var3.method3781(16, this.field4745.field5082 * this.field4745.field5072, this.field4745.field5072 * this.field4745.field5047, this.field4745.field5072 * this.field4745.field5062, 1.0F);
            var2.method3663(this.field4745.field5057[2], (byte)108, field2551, this.field4745.field5057[0], this.field4745.field5057[1]);
            var3.SetVertexShaderConstantF(15, field2551, 1);
            var2.method3663(this.field4745.field5023[2], (byte)107, field2551, this.field4745.field5023[0], this.field4745.field5023[1]);
            var3.SetVertexShaderConstantF(17, field2551, 1);
         }

      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method412(int arg0, int arg1, int arg2) {
      if (arg1 != 9950) {
         this.method409(-58);
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method416(boolean arg0) {
      if (arg0) {
         if (this.field2552 != null) {
            IDirect3DDevice var2 = this.field2557.field8614;
            class495 var3 = this.field4745.method2559(0);
            var2.SetVertexShaderConstantF(8, var3.method3669((byte)-121, field2550), 2);
         }

      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1559(int arg0) {
      IDirect3DDevice var2 = this.field2557.field8614;
      int var3 = this.field4745.method2590((byte)84);
      if (arg0 == -27966) {
         class495 var4 = this.field4745.method2681(false);
         IDirect3DVertexShader var5;
         if (this.field2558) {
            var5 = var3 == Integer.MAX_VALUE ? this.field2556 : this.field2547;
         } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field2554 : this.field2548;
         }

         if (this.field2552 != var5) {
            this.field2552 = var5;
            this.field2557.method4283(-116, var5);
            this.method1558(-1007208543);
            this.method409(arg0 ^ 15607);
            this.method416(true);
            this.method415(true);
            this.method408(82);
            this.method413((byte)87);
         }

         var4.method3660(field2551, -1.0F, 0.0F, 0.0F, (float)var3, 0);
         var2.method3776(12, field2551);
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method413(byte arg0) {
      if (arg0 == 87) {
         if (this.field2552 != null) {
            IDirect3DDevice var2 = this.field2557.field8614;
            int var3 = this.field4745.method639();
            int var4 = this.field4745.method635();
            float var5 = (float)var3 + -((float)(-var4 + var3) * 0.125F);
            float var6 = (float)var3 + -((float)(var3 - var4) * 0.25F);
            var2.method3781(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float)var3 - var5));
            var2.method3781(11, 1.0F / (float)this.field4745.method2620((byte)69), (float)this.field4745.method2605(113) / 255.0F, this.field4745.field5020, 1.0F / (-this.field4745.field5093 + this.field4745.field5020));
            this.field4745.method2646(this.field4745.method2570(1), 78);
         }

      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method410(int arg0, boolean arg1) {
      if (arg0 > 3) {
         this.field2558 = arg1;
         this.field4745.method2574(79, 1);
         this.field4745.method2578(this.field2553, true);
         this.field4745.method2568(class225.field2891, class680.field10213, false);
         this.field4745.method2636(-91, 0, class522.field7591);
         this.field4745.method2629(class496.field7336, -101, 2, false, true);
         this.field4745.method2662(true, class309.field4402, 0);
         this.field4745.method2574(109, 0);
         this.method1559(-27966);
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IILuha;)V"
   )
   public final void method414(int arg0, int arg1, class254 arg2) {
      if (arg0 != 0) {
         field2551 = (float[])null;
      }

      if (arg2 != null) {
         if (this.field2549) {
            this.field4745.method2636(-119, 0, class496.field7336);
            this.field4745.method2662(true, class496.field7336, 0);
            this.field2549 = false;
         }

         this.field4745.method2578(arg2, true);
         this.field4745.method2649((byte)119, arg1);
      } else if (!this.field2549) {
         this.field4745.method2578(this.field4745.field5042, true);
         this.field4745.method2649((byte)119, 1);
         this.field4745.method2636(-125, 0, class309.field4402);
         this.field4745.method2662(true, class309.field4402, 0);
         this.field2549 = true;
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method411(int arg0) {
      this.field4745.method2574(121, 1);
      this.field4745.method2578((class254)null, true);
      this.field4745.method2568(class556.field8257, class556.field8257, false);
      if (arg0 > -21) {
         this.method407((byte)0);
      }

      this.field4745.method2636(-103, 0, class496.field7336);
      this.field4745.method2636(-117, 2, class522.field7591);
      this.field4745.method2662(true, class496.field7336, 0);
      this.field4745.method2574(41, 0);
      if (this.field2549) {
         this.field4745.method2636(-95, 0, class496.field7336);
         this.field4745.method2662(true, class496.field7336, 0);
         this.field2549 = false;
      }

      if (this.field2552 != null) {
         this.field2557.method4283(57, (IDirect3DVertexShader)null);
         this.field2552 = null;
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method407(byte arg0) {
      return arg0 <= 16 ? false : this.field2555;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method415(boolean arg0) {
      if (!arg0) {
         this.method408(-120);
      }

      if (this.field2552 != null) {
         IDirect3DDevice var2 = this.field2557.field8614;
         class495 var3 = this.field2557.method2638((byte)-113);
         var2.method3776(0, var3.method3678(field2550, 0));
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method417(boolean arg0, byte arg1) {
      if (arg1 != -102) {
         this.field2555 = false;
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method408(int arg0) {
      if (this.field2552 != null) {
         IDirect3DDevice var2 = this.field2557.field8614;
         class495 var3 = this.field2557.method2638((byte)-65);
         var2.method3776(0, var3.method3678(field2550, 0));
      }

      if (arg0 <= 57) {
         this.field2553 = (class95)null;
      }

   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1560(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1561(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
