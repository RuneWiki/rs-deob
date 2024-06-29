import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class609 extends class393 {
   @OriginalMember(
      owner = "client!tp",
      name = "l",
      descriptor = "Ldd;"
   )
   private class712 field9000;
   @OriginalMember(
      owner = "client!tp",
      name = "j",
      descriptor = "Lub;"
   )
   private class165 field9002;
   @OriginalMember(
      owner = "client!tp",
      name = "m",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9001;
   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9003 = new String[]{method4503(method4502("}|")), method4503(method4502("mvu\";ief)&m[c-<|v"))};
   @OriginalMember(
      owner = "client!tp",
      name = "k",
      descriptor = "[F"
   )
   private static float[] field8999 = new float[16];

   @OriginalMember(
      owner = "client!tp",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method2735(byte arg0) {
      if (this.field9001 != null) {
         IDirect3DDevice var2 = this.field9002.field2093;
         var2.method5510(4, this.field5438.method2232(0, field8999));
      }

      if (arg0 != 117) {
         this.method1459(false, (byte)68);
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2737(int arg0) {
      if (this.field9001 != null) {
         IDirect3DDevice var2 = this.field9002.field2093;
         class620 var3 = this.field9002.method2227(99);
         var2.method5510(0, var3.method4586(field8999, 10));
      }

      if (arg0 != 0) {
         this.method1464(-42, false);
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "<init>",
      descriptor = "(Lub;Lww;Ldd;)V"
   )
   public class609(class165 arg0, class339 arg1, class712 arg2) {
      super(arg0);
      this.field9000 = arg2;
      this.field9002 = arg0;
      if (arg1 != null && this.field9000.method5201((byte)-87) && 257 <= (65535 & this.field9002.field2091.VertexShaderVersion)) {
         this.field9001 = this.field9002.field2093.method5499(arg1.method2692(field9003[0], field9003[1], (byte)-86));
      } else {
         this.field9001 = null;
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      if (arg1 == 7313) {
         IDirect3DDevice var4 = this.field9002.field2093;
         if (this.field9000.field10445) {
            float var5 = (float)(this.field5438.field3805 % 4000) / 4000.0F;
            this.field5438.method2265(this.field9000.field10444, (byte)-48);
            var4.method5505(11, var5, 0.0F, 0.0F, 0.0F);
         } else {
            int var6 = this.field5438.field3805 % 4000 * 16 / 4000;
            this.field5438.method2265(this.field9000.field10455[var6], (byte)88);
            var4.method5505(11, 0.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      if (arg0) {
         this.method2735((byte)-23);
      }

      return this.field9001 != null;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2738(int arg0) {
      if (this.field9001 != null) {
         IDirect3DDevice var2 = this.field9002.field2093;
         if (0 < this.field5438.field3854) {
            float var3 = this.field5438.field3871;
            float var4 = this.field5438.field3855;
            float var5 = var4 + -512.0F;
            var2.method5505(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
         } else {
            var2.method5505(10, 0.0F, 0.0F, 0.0F, 0.0F);
         }

         this.field5438.method2276(this.field5438.field3813, arg0 ^ 114);
      }

      if (arg0 != 0) {
         this.method1457((byte)-111);
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      if (arg0 != 29404) {
         this.method2317((byte)-119);
      }

      this.field5438.method2231(class749.field10941, class242.field3052, (byte)42);
   }

   @OriginalMember(
      owner = "client!tp",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2736(boolean arg0) {
      if (!arg0) {
         this.method1460(true);
      }

      if (this.field9001 != null) {
         IDirect3DDevice var2 = this.field9002.field2093;
         class620 var3 = this.field9002.method2227(78);
         var2.method5510(0, var3.method4586(field8999, 10));
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      this.field9002.method1388((IDirect3DVertexShader)null, 11);
      this.field5438.method2288((byte)-10, class363.field5039, 0);
      int var2 = -1 % ((arg0 - 22) / 63);
      this.field5438.method2288((byte)-10, class733.field10690, 1);
      this.field5438.method2288((byte)-10, class354.field4947, 2);
      this.field5438.method2267(1, true);
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2317(byte arg0) {
      if (arg0 != -109) {
         this.method2738(-66);
      }

      if (this.field9001 != null) {
         IDirect3DDevice var2 = this.field9002.field2093;
         class620 var3 = this.field5438.method2226(2702);
         var3.method4591((byte)70, field8999);
         field8999[5] *= 0.25F;
         field8999[1] *= 0.25F;
         field8999[6] *= 0.25F;
         field8999[4] *= 0.25F;
         field8999[3] *= 0.25F;
         field8999[0] *= 0.25F;
         field8999[2] *= 0.25F;
         field8999[7] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field8999, 2);
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      this.field5438.method2288((byte)-10, class363.field5039, 0);
      this.field5438.method2288((byte)-10, class354.field4947, 1);
      if (arg1 == 32) {
         this.field5438.method1409(true, false, class733.field10690, 2, -120);
         this.field5438.method2267(1, false);
         this.field9002.method1388(this.field9001, 11);
         this.method2736(true);
         this.method2317((byte)-109);
         this.method2735((byte)117);
         this.method2738(0);
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      if (arg1 <= 84) {
         this.method2736(false);
      }

   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4502(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4503(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
