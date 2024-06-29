import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class447 extends class575 {
   @OriginalMember(
      owner = "client!pd",
      name = "l",
      descriptor = "Lqc;"
   )
   private class497 field6510;
   @OriginalMember(
      owner = "client!pd",
      name = "n",
      descriptor = "Lmv;"
   )
   private class125 field6509;
   @OriginalMember(
      owner = "client!pd",
      name = "o",
      descriptor = "Ljagdx/IDirect3DVertexShader;"
   )
   private IDirect3DVertexShader field6507;
   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6511 = new String[]{method3470(method3469("p.\u007f&?t=l-\"p\u0003i)8a.")), method3470(method3469("`$"))};
   @OriginalMember(
      owner = "client!pd",
      name = "m",
      descriptor = "[F"
   )
   private static float[] field6508 = new float[16];

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      if (arg1 == 23) {
         this.field8129.method1945((byte)-86, class717.field10280, class117.field1846);
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      this.field8129.method2009(0, 0, class339.field5001);
      this.field8129.method2009(0, 1, class172.field2572);
      this.field8129.method1239(2, class151.field2323, 2, false, arg1);
      this.field8129.method1936(false, 103);
      this.field6509.method1244(this.field6507, 79);
      this.method3466(24515);
      this.method3465((byte)-15);
      this.method3464(67);
      this.method3467((byte)-84);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      if (arg2 < 61) {
         this.field6509 = (class125)null;
      }

      IDirect3DDevice var4 = this.field6509.field2013;
      if (!this.field6510.field7090) {
         int var5 = this.field8129.field3488 % 4000 * 16 / 4000;
         this.field8129.method1943(0, this.field6510.field7085[var5]);
         var4.method3131(11, 0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         float var6 = (float)(this.field8129.field3488 % 4000) / 4000.0F;
         this.field8129.method1943(0, this.field6510.field7083);
         var4.method3131(11, var6, 0.0F, 0.0F, 0.0F);
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3464(int arg0) {
      if (this.field6507 != null) {
         IDirect3DDevice var2 = this.field6509.field2013;
         var2.method3123(4, this.field8129.method1987(-37, field6508));
      }

      int var3 = -65 % ((arg0 - 11) / 54);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3465(byte arg0) {
      if (this.field6507 != null) {
         IDirect3DDevice var2 = this.field6509.field2013;
         class522 var3 = this.field8129.method1956(28194);
         var3.method3896(field6508, arg0 + 17);
         field6508[3] *= 0.25F;
         field6508[2] *= 0.25F;
         field6508[6] *= 0.25F;
         field6508[0] *= 0.25F;
         field6508[5] *= 0.25F;
         field6508[1] *= 0.25F;
         field6508[7] *= 0.25F;
         field6508[4] *= 0.25F;
         var2.SetVertexShaderConstantF(8, field6508, 2);
      }

      if (arg0 != -15) {
         this.method84(-62, -21, (byte)89);
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      this.field6509.method1244((IDirect3DVertexShader)null, 122);
      this.field8129.method2009(0, 0, class339.field5001);
      this.field8129.method2009(0, 1, class151.field2323);
      this.field8129.method2009(0, 2, class172.field2572);
      this.field8129.method1936(true, 124);
      if (arg0) {
         this.field6509 = (class125)null;
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3466(int arg0) {
      if (this.field6507 != null) {
         IDirect3DDevice var2 = this.field6509.field2013;
         class522 var3 = this.field6509.method1972(120);
         var2.method3123(0, var3.method3907(field6508, 66));
      }

      if (arg0 != 24515) {
         this.method84(49, 81, (byte)5);
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "<init>",
      descriptor = "(Lmv;Lsa;Lqc;)V"
   )
   public class447(class125 arg0, class39 arg1, class497 arg2) {
      super(arg0);
      this.field6510 = arg2;
      this.field6509 = arg0;
      if (arg1 != null && this.field6510.method3771(true) && (this.field6509.field2014.VertexShaderVersion & 65535) >= 257) {
         this.field6507 = this.field6509.field2013.method3115(arg1.method458(0, field6511[1], field6511[0]));
      } else {
         this.field6507 = null;
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3467(byte arg0) {
      if (arg0 != -84) {
         this.method3464(-61);
      }

      if (this.field6507 != null) {
         IDirect3DDevice var2 = this.field6509.field2013;
         if (0 >= this.field8129.field3451) {
            var2.method3131(10, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            float var3 = this.field8129.field3420;
            float var4 = this.field8129.field3476;
            float var5 = var4 + -512.0F;
            var2.method3131(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
         }

         this.field8129.method1939(this.field8129.field3446, (byte)-60);
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3468(boolean arg0) {
      if (this.field6507 != null) {
         IDirect3DDevice var2 = this.field6509.field2013;
         class522 var3 = this.field6509.method1972(116);
         var2.method3123(0, var3.method3907(field6508, 75));
      }

      if (arg0) {
         this.method84(36, -59, (byte)-78);
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      if (arg0 != 15385) {
         return true;
      } else {
         return this.field6507 != null;
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      if (!arg1) {
         this.method3467((byte)-37);
      }

   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3470(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
