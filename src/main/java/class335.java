import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class335 extends class141 {
   @OriginalMember(
      owner = "client!iw",
      name = "v",
      descriptor = "Z"
   )
   private boolean field4562 = false;
   @OriginalMember(
      owner = "client!iw",
      name = "p",
      descriptor = "Lbb;"
   )
   private class353 field4560;
   @OriginalMember(
      owner = "client!iw",
      name = "r",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4557;
   @OriginalMember(
      owner = "client!iw",
      name = "o",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4558;
   @OriginalMember(
      owner = "client!iw",
      name = "u",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4556;
   @OriginalMember(
      owner = "client!iw",
      name = "x",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4566;
   @OriginalMember(
      owner = "client!iw",
      name = "m",
      descriptor = "Lfc;"
   )
   private class272 field4564;
   @OriginalMember(
      owner = "client!iw",
      name = "s",
      descriptor = "Z"
   )
   private boolean field4555;
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4567 = new String[]{method2472(method2471("Cx!\u000bYYz\u0010\btCa\u0012\u0005_")), method2472(method2471("Cx!\u0001DRj\u00123^Xc\u0017\u0018")), method2472(method2471("Rw")), method2472(method2471("Cx!\u0001DRj\u00123G_{")), method2472(method2471("Cx!\u000bYYz\u0010\btZf\n"))};
   @OriginalMember(
      owner = "client!iw",
      name = "q",
      descriptor = "[F"
   )
   private static float[] field4561 = new float[4];
   @OriginalMember(
      owner = "client!iw",
      name = "t",
      descriptor = "[F"
   )
   private static float[] field4565 = new float[16];
   @OriginalMember(
      owner = "client!iw",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field4559;
   @OriginalMember(
      owner = "client!iw",
      name = "w",
      descriptor = "Z"
   )
   private boolean field4563;

   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "(B)V",
      line = 4
   )
   public final void method315(byte arg0) {
      if (this.field4559 != null) {
         IDirect3DDevice var2 = this.field4560.field4742;
         var2.method3716(4, this.field1801.method2790(false, field4565));
      }

      int var3 = -96 % ((-34 - arg0) / 52);
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Z)Z",
      line = 24
   )
   public final boolean method313(boolean arg0) {
      if (!arg0) {
         this.field4564 = (class272)null;
      }

      return this.field4555;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "(B)V",
      line = 34
   )
   public final void method314(byte arg0) {
      if (this.field4559 != null) {
         IDirect3DDevice var2 = this.field4560.field4742;
         int var3 = this.field1801.method504();
         int var4 = this.field1801.method595();
         float var5 = (float)var3 - (float)(-var4 + var3) * 0.125F;
         float var6 = (float)var3 + -((float)(-var4 + var3) * 0.25F);
         var2.method3714(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float)var3 + -var5));
         var2.method3714(11, 1.0F / (float)this.field1801.method2777((byte)48), (float)this.field1801.method2773((byte)-125) / 255.0F, this.field1801.field5293, 1.0F / (-this.field1801.field5313 + this.field1801.field5293));
         this.field1801.method2752(this.field1801.method2793((byte)125), (byte)50);
      }

      if (arg0 != 94) {
         this.field4560 = (class353)null;
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(B)V",
      line = 61
   )
   public final void method312(byte arg0) {
      if (this.field4559 != null) {
         IDirect3DDevice var2 = this.field4560.field4742;
         class716 var3 = this.field4560.method2764(2);
         var2.method3716(0, var3.method5192(field4565, 3));
      }

      if (arg0 < 121) {
         this.method309(false, true);
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I)V",
      line = 79
   )
   public final void method316(int arg0) {
      if (this.field4559 != null) {
         IDirect3DDevice var2 = this.field4560.field4742;
         class716 var3 = this.field4560.method2764(2);
         var2.method3716(0, var3.method5192(field4565, 3));
      }

      if (arg0 < 19) {
         this.method313(true);
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "(B)V",
      line = 98
   )
   public final void method307(byte arg0) {
      this.field1801.method2763(1, -72);
      this.field1801.method2804((class205)null, -2);
      this.field1801.method2745(-30, class458.field6587, class458.field6587);
      this.field1801.method2814(0, class10.field93, true);
      this.field1801.method2814(2, class304.field4150, true);
      this.field1801.method2787(class10.field93, (byte)-51, 0);
      this.field1801.method2763(0, -77);
      if (arg0 < 102) {
         this.method317(-73, 63, -30);
      }

      if (this.field4562) {
         this.field1801.method2814(0, class10.field93, true);
         this.field1801.method2787(class10.field93, (byte)-51, 0);
         this.field4562 = false;
      }

      if (this.field4559 != null) {
         this.field4560.method2629((byte)102, (IDirect3DVertexShader)null);
         this.field4559 = null;
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ZZ)V",
      line = 128
   )
   public final void method311(boolean arg0, boolean arg1) {
      if (arg0) {
         this.field4558 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(III)V",
      line = 140
   )
   public final void method317(int arg0, int arg1, int arg2) {
      if (arg0 != 0) {
         this.method1117((byte)-50);
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(Lbb;Lkf;)V",
      line = 151
   )
   public class335(class353 arg0, class266 arg1) {
      super(arg0);
      this.field4560 = arg0;
      if (arg1 != null && 257 <= (this.field4560.field4747.VertexShaderVersion & 65535)) {
         this.field4557 = this.field4560.field4742.method3715(arg1.method2032(field4567[0], (byte)-72, field4567[2]));
         this.field4558 = this.field4560.field4742.method3715(arg1.method2032(field4567[4], (byte)-72, field4567[2]));
         this.field4556 = this.field4560.field4742.method3715(arg1.method2032(field4567[1], (byte)-72, field4567[2]));
         this.field4566 = this.field4560.field4742.method3715(arg1.method2032(field4567[3], (byte)-72, field4567[2]));
         if (this.field4566 != null & this.field4556 != null & this.field4558 != null & this.field4557 != null) {
            this.field4564 = this.field1801.method2759(false, 1, 0, new int[]{0, -1}, 2);
            this.field4564.method277(true, false, false);
            this.field4555 = true;
         } else {
            this.field4555 = false;
         }
      } else {
         this.field4555 = false;
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lm;II)V",
      line = 179
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      if (arg0 != null) {
         if (this.field4562) {
            this.field1801.method2814(0, class10.field93, true);
            this.field1801.method2787(class10.field93, (byte)-51, 0);
            this.field4562 = false;
         }

         this.field1801.method2804(arg0, arg2 + -2);
         this.field1801.method2747((byte)-87, arg1);
      } else if (!this.field4562) {
         this.field1801.method2804(this.field1801.field5259, arg2 + -2);
         this.field1801.method2747((byte)-95, 1);
         this.field1801.method2814(0, class706.field10312, true);
         this.field1801.method2787(class706.field10312, (byte)-51, 0);
         this.field4562 = true;
      }

      if (arg2 != 0) {
         this.field4560 = (class353)null;
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(I)V",
      line = 213
   )
   private final void method2470(int arg0) {
      if (arg0 == 30338) {
         if (this.field4559 != null && this.field4563) {
            class716 var2 = this.field1801.method2774(true);
            IDirect3DDevice var3 = this.field4560.field4742;
            var3.method3714(13, this.field1801.field5296 * this.field1801.field5255, this.field1801.field5322 * this.field1801.field5255, this.field1801.field5283 * this.field1801.field5255, 1.0F);
            var3.method3714(14, this.field1801.field5296 * this.field1801.field5244, this.field1801.field5322 * this.field1801.field5244, this.field1801.field5283 * this.field1801.field5244, 1.0F);
            var3.method3714(16, this.field1801.field5296 * this.field1801.field5257, this.field1801.field5322 * this.field1801.field5257, this.field1801.field5283 * this.field1801.field5257, 1.0F);
            var2.method5201(field4561, this.field1801.field5338[2], this.field1801.field5338[1], 0, this.field1801.field5338[0]);
            var3.SetVertexShaderConstantF(15, field4561, 1);
            var2.method5201(field4561, this.field1801.field5321[2], this.field1801.field5321[1], 0, this.field1801.field5321[0]);
            var3.SetVertexShaderConstantF(17, field4561, 1);
         }

      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "(B)V",
      line = 238
   )
   public final void method308(byte arg0) {
      if (this.field4559 != null) {
         IDirect3DDevice var2 = this.field4560.field4742;
         class716 var3 = this.field1801.method2780(49);
         var2.SetVertexShaderConstantF(8, var3.method5202(6073, field4565), 2);
      }

      if (arg0 != 86) {
         this.field4563 = false;
      }

   }

   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "(B)V",
      line = 264
   )
   public final void method1117(byte arg0) {
      IDirect3DDevice var2 = this.field4560.field4742;
      if (arg0 <= -43) {
         int var3 = this.field1801.method2767((byte)63);
         class716 var4 = this.field1801.method2817(93);
         IDirect3DVertexShader var5;
         if (!this.field4563) {
            var5 = var3 == Integer.MAX_VALUE ? this.field4557 : this.field4556;
         } else {
            var5 = ~var3 != Integer.MIN_VALUE ? this.field4566 : this.field4558;
         }

         if (this.field4559 != var5) {
            this.field4559 = var5;
            this.field4560.method2629((byte)102, var5);
            this.method2470(30338);
            this.method315((byte)49);
            this.method308((byte)86);
            this.method312((byte)124);
            this.method316(123);
            this.method314((byte)94);
         }

         var4.method5205(-7122, 0.0F, -1.0F, 0.0F, field4561, (float)var3);
         var2.method3716(12, field4561);
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(ZZ)V",
      line = 307
   )
   public final void method309(boolean arg0, boolean arg1) {
      this.field4563 = arg1;
      this.field1801.method2763(1, -50);
      this.field1801.method2804(this.field4564, -2);
      this.field1801.method2745(-30, class144.field1826, class603.field8872);
      this.field1801.method2814(0, class304.field4150, true);
      this.field1801.method2635(class10.field93, 2, -125, true, arg0);
      this.field1801.method2787(class706.field10312, (byte)-51, 0);
      this.field1801.method2763(0, -47);
      this.method1117((byte)-76);
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2472(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
