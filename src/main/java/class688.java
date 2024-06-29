import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class688 extends class575 {
   @OriginalMember(
      owner = "client!w",
      name = "o",
      descriptor = "Lmv;"
   )
   private class125 field9913;
   @OriginalMember(
      owner = "client!w",
      name = "q",
      descriptor = "Lqc;"
   )
   private class497 field9918;
   @OriginalMember(
      owner = "client!w",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field9915;
   @OriginalMember(
      owner = "client!w",
      name = "p",
      descriptor = "Ljagdx/IDirect3DPixelShader;"
   )
   private IDirect3DPixelShader field9919;
   @OriginalMember(
      owner = "client!w",
      name = "m",
      descriptor = "Z"
   )
   private boolean field9917;
   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9920 = new String[]{method5002(method5001("($[<o\"$@0s9\u0015@4m=/I\nj,>H'B;")), method5002(method5001("($[<o\"$@0s9\u0015@4m=/I\nj,>H'B+")), method5002(method5001(")2"))};
   @OriginalMember(
      owner = "client!w",
      name = "r",
      descriptor = "[F"
   )
   private static float[] field9916 = new float[16];
   @OriginalMember(
      owner = "client!w",
      name = "l",
      descriptor = "Z"
   )
   private boolean field9914;

   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      if (!arg0) {
         if (this.field9914) {
            this.field9913.method1244((IDirect3DVertexShader)null, 109);
            this.field9913.method1289(0, (IDirect3DPixelShader)null);
            this.field8129.method1953(-16, 1);
            this.field8129.method1943(0, (class683)null);
            this.field8129.method1953(-105, 0);
            this.field8129.method1943(0, (class683)null);
            this.field9914 = false;
         }

      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3468(boolean arg0) {
      if (this.field9914) {
         IDirect3DDevice var2 = this.field9913.field2013;
         class522 var3 = this.field9913.method1983(116);
         class522 var4 = this.field9913.method1972(-12);
         var2.method3123(0, var4.method3907(field9916, 9));
         var2.method3123(4, var3.method3914(26801, field9916));
      }

      if (arg0) {
         this.method3468(false);
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3467(byte arg0) {
      if (this.field9914) {
         IDirect3DDevice var2 = this.field9913.field2013;
         if (-1 <= ~this.field8129.field3451) {
            var2.method3131(16, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field8129.field3420;
            float var4 = this.field8129.field3476;
            var2.method3131(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
         }

         var2.method3119(0, (float)(255 & this.field8129.field3446 >> 16) / 255.0F, (float)(this.field8129.field3446 >> 8 & 255) / 255.0F, (float)(this.field8129.field3446 & 255) / 255.0F, 0.0F);
      }

      if (arg0 != -84) {
         this.field9913 = (class125)null;
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      if (arg2 <= 61) {
         this.method3466(-115);
      }

      if (this.field9914) {
         IDirect3DDevice var4 = this.field9913.field2013;
         int var5 = 1 << (3 & arg1);
         float var6 = (float)(1 << ((arg1 & 59) >> 3)) / 32.0F;
         int var7 = 65535 & arg0;
         var4.method3131(14, (float)(this.field8129.field3488 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
         float var8 = (float)((arg0 & 229948) >> 16) / 8.0F;
         var4.method3131(15, var6, 0.0F, 0.0F, 0.0F);
         var4.method3119(4, (float)var7, 0.0F, 0.0F, 0.0F);
         var4.method3119(5, var8, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3465(byte arg0) {
      if (this.field9914) {
         IDirect3DDevice var2 = this.field9913.field2013;
         class522 var3 = this.field8129.method1956(28194);
         var2.SetVertexShaderConstantF(12, var3.method3896(field9916, 2), 2);
      }

      if (arg0 != -15) {
         this.method3466(114);
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      if (arg0 != 15385) {
         this.method88(68, true, (class683)null);
      }

      return this.field9917;
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      class293 var3 = this.field8129.method2005(false);
      if (!arg1) {
         this.field9919 = (IDirect3DPixelShader)null;
      }

      if (this.field9917 && var3 != null) {
         IDirect3DDevice var4 = this.field9913.field2013;
         this.field9913.method1244(this.field9915, 82);
         this.field9913.method1289(0, this.field9919);
         this.field8129.method1953(95, 1);
         this.field8129.method1943(0, var3);
         this.field8129.method1953(114, 0);
         this.field8129.method1943(0, this.field9918.field7088);
         this.field9914 = true;
         this.method3468(false);
         this.method3465((byte)-15);
         this.method3464(-75);
         this.method3467((byte)-84);
         var4.method3119(1, -this.field8129.field3435[0], -this.field8129.field3435[1], -this.field8129.field3435[2], 0.0F);
         var4.method3119(2, this.field8129.field3438, this.field8129.field3462, this.field8129.field3429, 1.0F);
         var4.method3119(3, 928.0F * Math.abs(this.field8129.field3435[1]) + 96.0F, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      if (arg1 != 23) {
         this.field9913 = (class125)null;
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      if (!arg1) {
         this.field9919 = (IDirect3DPixelShader)null;
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3466(int arg0) {
      if (this.field9914) {
         IDirect3DDevice var2 = this.field9913.field2013;
         class522 var3 = this.field9913.method1972(117);
         var2.method3123(0, var3.method3907(field9916, 44));
      }

      if (arg0 != 24515) {
         this.method3465((byte)-6);
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3464(int arg0) {
      int var2 = 108 / ((11 - arg0) / 54);
      if (this.field9914) {
         IDirect3DDevice var3 = this.field9913.field2013;
         var3.method3123(8, this.field8129.method1987(-78, field9916));
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "<init>",
      descriptor = "(Lmv;Lsa;Lqc;)V"
   )
   public class688(class125 arg0, class39 arg1, class497 arg2) {
      super(arg0);
      this.field9913 = arg0;
      this.field9918 = arg2;
      if (arg1 != null && this.field8129.field3414 && this.field8129.field3406 && (65535 & this.field9913.field2014.VertexShaderVersion) >= 257) {
         this.field9915 = this.field9913.field2013.method3115(arg1.method458(0, field9920[2], field9920[0]));
         this.field9919 = this.field9913.field2013.method3121(arg1.method458(0, field9920[2], field9920[1]));
         this.field9917 = this.field9915 != null && this.field9919 != null && this.field9918.method3770(27);
      } else {
         this.field9915 = null;
         this.field9919 = null;
         this.field9917 = false;
      }

   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5001(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5002(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
