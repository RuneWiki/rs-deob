import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class139 extends class550 {
   @OriginalMember(
      owner = "client!rha",
      name = "l",
      descriptor = "Lsc;"
   )
   private class97 field2008;
   @OriginalMember(
      owner = "client!rha",
      name = "j",
      descriptor = "Leb;"
   )
   private class163 field2009;
   @OriginalMember(
      owner = "client!rha",
      name = "k",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field2011;
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2012 = new String[]{method1279(method1278("\u001f\u0003eh\u0004\u001b\u0010vc\u0019\u001f.sg\u0003\u000e\u0003")), method1279(method1278("\u000f\t"))};
   @OriginalMember(
      owner = "client!rha",
      name = "m",
      descriptor = "[F"
   )
   private static float[] field2010 = new float[16];

   @OriginalMember(
      owner = "client!rha",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method70(int arg0) {
      if (this.field2011 != null) {
         IDirect3DDevice var2 = this.field2009.field2447;
         class504 var3 = this.field8234.method2180((byte)-85);
         var3.method3915(field2010, false);
         field2010[3] *= 0.25F;
         field2010[6] *= 0.25F;
         field2010[1] *= 0.25F;
         field2010[7] *= 0.25F;
         field2010[2] *= 0.25F;
         field2010[4] *= 0.25F;
         field2010[5] *= 0.25F;
         field2010[0] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field2010, 2);
      }

      if (arg0 != -2) {
         this.field2008 = (class97)null;
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method72(int arg0) {
      this.field2009.method1456((IDirect3DVertexShader)null, (byte)-75);
      this.field8234.method2185((byte)-124, 0, class751.field11122);
      this.field8234.method2185((byte)-128, 1, class53.field655);
      this.field8234.method2185((byte)-106, 2, class700.field10441);
      this.field8234.method2203(true, 3);
      if (arg0 != -2) {
         this.method78((byte)49, false);
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(IBLwm;)V"
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      int var4 = 127 % ((18 - arg1) / 60);
   }

   @OriginalMember(
      owner = "client!rha",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method77(int arg0) {
      if (this.field2011 != null) {
         IDirect3DDevice var2 = this.field2009.field2447;
         var2.method563(4, this.field8234.method2207(field2010, arg0 + 3));
      }

      if (arg0 != -2) {
         this.field2011 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method73(boolean arg0, byte arg1) {
      if (arg1 >= -44) {
         this.field2009 = (class163)null;
      }

      this.field8234.method2185((byte)-128, 0, class751.field11122);
      this.field8234.method2185((byte)-113, 1, class700.field10441);
      this.field8234.method1494(0, false, 2, class53.field655, true);
      this.field8234.method2203(false, 3);
      this.field2009.method1456(this.field2011, (byte)121);
      this.method74(-29053);
      this.method70(-2);
      this.method77(-2);
      this.method76((byte)71);
   }

   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method68(int arg0) {
      if (this.field2011 != null) {
         IDirect3DDevice var2 = this.field2009.field2447;
         class504 var3 = this.field2009.method2200(255);
         var2.method563(0, var3.method3905(arg0 + 104, field2010));
      }

      if (arg0 != 10) {
         field2010 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method78(byte arg0, boolean arg1) {
      if (arg0 <= 82) {
         this.method74(-58);
      }

      this.field8234.method2212((byte)119, class582.field8586, class154.field2302);
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method74(int arg0) {
      if (arg0 == -29053) {
         if (this.field2011 != null) {
            IDirect3DDevice var2 = this.field2009.field2447;
            class504 var3 = this.field2009.method2200(arg0 ^ -29060);
            var2.method563(0, var3.method3905(112, field2010));
         }

      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method76(byte arg0) {
      if (this.field2011 != null) {
         IDirect3DDevice var2 = this.field2009.field2447;
         if (this.field8234.field4169 <= 0) {
            var2.method565(10, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field8234.field4156;
            float var4 = this.field8234.field4175;
            float var5 = var4 - 512.0F;
            var2.method565(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
         }

         this.field8234.method2218(this.field8234.field4219, 22121);
      }

      if (arg0 != 71) {
         this.method77(23);
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "<init>",
      descriptor = "(Leb;Lrr;Lsc;)V"
   )
   public class139(class163 arg0, class678 arg1, class97 arg2) {
      super(arg0);
      this.field2008 = arg2;
      this.field2009 = arg0;
      if (arg1 != null && this.field2008.method955((byte)-95) && (65535 & this.field2009.field2438.VertexShaderVersion) >= 257) {
         this.field2011 = this.field2009.field2447.method573(arg1.method5023(field2012[0], field2012[1], 0));
      } else {
         this.field2011 = null;
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method69(byte arg0) {
      if (arg0 != 120) {
         this.field2009 = (class163)null;
      }

      return this.field2011 != null;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      IDirect3DDevice var4 = this.field2009.field2447;
      if (arg0 != 90) {
         this.field2011 = (IDirect3DVertexShader)null;
      }

      if (this.field2008.field1361) {
         float var5 = (float)(this.field8234.field4155 % 4000) / 4000.0F;
         this.field8234.method2193(this.field2008.field1367, (byte)-19);
         var4.method565(11, var5, 0.0F, 0.0F, 0.0F);
      } else {
         int var6 = this.field8234.field4155 % 4000 * 16 / 4000;
         this.field8234.method2193(this.field2008.field1363[var6], (byte)-19);
         var4.method565(11, 0.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1278(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1279(char[] arg0) {
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
            var10005 = 113;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
