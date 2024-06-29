import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class736 extends class575 {
   @OriginalMember(
      owner = "client!is",
      name = "p",
      descriptor = "Z"
   )
   private boolean field10491 = false;
   @OriginalMember(
      owner = "client!is",
      name = "r",
      descriptor = "Lmv;"
   )
   private class125 field10494;
   @OriginalMember(
      owner = "client!is",
      name = "l",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10490;
   @OriginalMember(
      owner = "client!is",
      name = "t",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10498;
   @OriginalMember(
      owner = "client!is",
      name = "n",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10488;
   @OriginalMember(
      owner = "client!is",
      name = "s",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10489;
   @OriginalMember(
      owner = "client!is",
      name = "v",
      descriptor = "Lpga;"
   )
   private class371 field10493;
   @OriginalMember(
      owner = "client!is",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10497;
   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10500 = new String[]{method5331(method5330(">$/PX/6\u001cbB%?\u0019I")), method5331(method5330(">$/PX/6\u001cb[\"'")), method5331(method5330("/+")), method5331(method5330(">$/ZE$&\u001eYh':\u0004")), method5331(method5330(">$/ZE$&\u001eYh>=\u001cTC"))};
   @OriginalMember(
      owner = "client!is",
      name = "u",
      descriptor = "[F"
   )
   private static float[] field10496 = new float[16];
   @OriginalMember(
      owner = "client!is",
      name = "w",
      descriptor = "[F"
   )
   private static float[] field10499 = new float[4];
   @OriginalMember(
      owner = "client!is",
      name = "o",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field10492;
   @OriginalMember(
      owner = "client!is",
      name = "m",
      descriptor = "Z"
   )
   private boolean field10495;

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      this.field10495 = arg0;
      this.field8129.method1953(-24, 1);
      this.field8129.method1943(0, this.field10493);
      this.field8129.method1945((byte)-86, class74.field1189, class117.field1846);
      this.field8129.method2009(0, 0, class172.field2572);
      this.field8129.method1239(2, class339.field5001, 2, arg1, false);
      this.field8129.method1937(class77.field1238, 0, 0);
      this.field8129.method1953(106, 0);
      this.method3480(0);
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      if (arg1 != 23) {
         this.field10493 = (class371)null;
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3466(int arg0) {
      if (this.field10492 != null) {
         IDirect3DDevice var2 = this.field10494.field2013;
         class522 var3 = this.field10494.method1972(arg0 ^ 24504);
         var2.method3123(0, var3.method3907(field10496, arg0 ^ -24494));
      }

      if (arg0 != 24515) {
         this.method84(-39, 118, (byte)-73);
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3480(int arg0) {
      IDirect3DDevice var2 = this.field10494.field2013;
      int var3 = this.field8129.method1946(-1);
      class522 var4 = this.field8129.method1983(102);
      IDirect3DVertexShader var5;
      if (!this.field10495) {
         var5 = var3 != Integer.MAX_VALUE ? this.field10488 : this.field10490;
      } else {
         var5 = var3 != Integer.MAX_VALUE ? this.field10489 : this.field10498;
      }

      if (this.field10492 != var5) {
         this.field10492 = var5;
         this.field10494.method1244(var5, 78);
         this.method5329(117);
         this.method3464(-72);
         this.method3465((byte)-15);
         this.method3466(arg0 + 24515);
         this.method3468(false);
         this.method3467((byte)-84);
      }

      if (arg0 != 0) {
         this.field10498 = (IDirect3DVertexShader)null;
      }

      var4.method3897((float)var3, 1, 0.0F, -1.0F, 0.0F, field10499);
      var2.method3123(12, field10499);
   }

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      if (arg0 != 15385) {
         this.method84(121, 77, (byte)-62);
      }

      return this.field10497;
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      if (arg2 < 61) {
         this.field10490 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3468(boolean arg0) {
      if (arg0) {
         this.field10492 = (IDirect3DVertexShader)null;
      }

      if (this.field10492 != null) {
         IDirect3DDevice var2 = this.field10494.field2013;
         class522 var3 = this.field10494.method1972(119);
         var2.method3123(0, var3.method3907(field10496, 32));
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3465(byte arg0) {
      if (arg0 != -15) {
         this.field10492 = (IDirect3DVertexShader)null;
      }

      if (this.field10492 != null) {
         IDirect3DDevice var2 = this.field10494.field2013;
         class522 var3 = this.field8129.method1956(28194);
         var2.SetVertexShaderConstantF(8, var3.method3896(field10496, 2), 2);
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3464(int arg0) {
      if (this.field10492 != null) {
         IDirect3DDevice var2 = this.field10494.field2013;
         var2.method3123(4, this.field8129.method1987(-79, field10496));
      }

      int var3 = -94 / ((11 - arg0) / 54);
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      if (arg2 == null) {
         if (!this.field10491) {
            this.field8129.method1943(0, this.field8129.field3409);
            this.field8129.method1966(1, -5);
            this.field8129.method2009(0, 0, class77.field1238);
            this.field8129.method1937(class77.field1238, 0, 0);
            this.field10491 = true;
         }
      } else {
         if (this.field10491) {
            this.field8129.method2009(0, 0, class339.field5001);
            this.field8129.method1937(class339.field5001, 0, 0);
            this.field10491 = false;
         }

         this.field8129.method1943(0, arg2);
         this.field8129.method1966(arg0, -5);
      }

      if (!arg1) {
         field10496 = (float[])null;
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method5329(int arg0) {
      if (this.field10492 != null && this.field10495) {
         class522 var2 = this.field8129.method1947(-102);
         IDirect3DDevice var3 = this.field10494.field2013;
         var3.method3131(13, this.field8129.field3492 * this.field8129.field3438, this.field8129.field3492 * this.field8129.field3462, this.field8129.field3492 * this.field8129.field3429, 1.0F);
         var3.method3131(14, this.field8129.field3438 * this.field8129.field3417, this.field8129.field3462 * this.field8129.field3417, this.field8129.field3429 * this.field8129.field3417, 1.0F);
         var3.method3131(16, this.field8129.field3438 * this.field8129.field3411, this.field8129.field3462 * this.field8129.field3411, this.field8129.field3429 * this.field8129.field3411, 1.0F);
         var2.method3910(false, this.field8129.field3435[0], this.field8129.field3435[1], this.field8129.field3435[2], field10499);
         var3.SetVertexShaderConstantF(15, field10499, 1);
         var2.method3910(false, this.field8129.field3498[0], this.field8129.field3498[1], this.field8129.field3498[2], field10499);
         var3.SetVertexShaderConstantF(17, field10499, 1);
      }

      int var4 = -78 % ((7 - arg0) / 52);
   }

   @OriginalMember(
      owner = "client!is",
      name = "<init>",
      descriptor = "(Lmv;Lsa;)V"
   )
   public class736(class125 arg0, class39 arg1) {
      super(arg0);
      this.field10494 = arg0;
      if (arg1 != null && -258 >= ~(65535 & this.field10494.field2014.VertexShaderVersion)) {
         this.field10490 = this.field10494.field2013.method3115(arg1.method458(0, field10500[2], field10500[4]));
         this.field10498 = this.field10494.field2013.method3115(arg1.method458(0, field10500[2], field10500[3]));
         this.field10488 = this.field10494.field2013.method3115(arg1.method458(0, field10500[2], field10500[0]));
         this.field10489 = this.field10494.field2013.method3115(arg1.method458(0, field10500[2], field10500[1]));
         if (this.field10488 != null & this.field10490 != null & this.field10498 != null & this.field10489 != null) {
            this.field10493 = this.field8129.method2017(false, 2, 0, 1, new int[]{0, -1});
            this.field10493.method31(false, false, false);
            this.field10497 = true;
         } else {
            this.field10497 = false;
         }
      } else {
         this.field10497 = false;
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3467(byte arg0) {
      if (this.field10492 != null) {
         IDirect3DDevice var2 = this.field10494.field2013;
         int var3 = this.field8129.method212();
         int var4 = this.field8129.method141();
         float var5 = (float)var3 - (float)(-var4 + var3) * 0.125F;
         float var6 = (float)var3 + -((float)(-var4 + var3) * 0.25F);
         var2.method3131(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float)var3 - var5));
         var2.method3131(11, 1.0F / (float)this.field8129.method1978(arg0 ^ -20022), (float)this.field8129.method2007(true) / 255.0F, this.field8129.field3420, 1.0F / (this.field8129.field3420 - this.field8129.field3476));
         this.field8129.method1939(this.field8129.method2016(30963), (byte)-60);
      }

      if (arg0 != -84) {
         this.field10488 = (IDirect3DVertexShader)null;
      }

   }

   @OriginalMember(
      owner = "client!is",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      this.field8129.method1953(103, 1);
      this.field8129.method1943(0, (class683)null);
      this.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
      this.field8129.method2009(0, 0, class339.field5001);
      this.field8129.method2009(0, 2, class172.field2572);
      if (!arg0) {
         this.field8129.method1937(class339.field5001, 0, 0);
         this.field8129.method1953(110, 0);
         if (this.field10491) {
            this.field8129.method2009(0, 0, class339.field5001);
            this.field8129.method1937(class339.field5001, 0, 0);
            this.field10491 = false;
         }

         if (this.field10492 != null) {
            this.field10494.method1244((IDirect3DVertexShader)null, 95);
            this.field10492 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5330(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5331(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
