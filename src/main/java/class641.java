import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class641 extends class676 implements class371 {
   @OriginalMember(
      owner = "client!qn",
      name = "f",
      descriptor = "I"
   )
   private int field9027;
   @OriginalMember(
      owner = "client!qn",
      name = "j",
      descriptor = "I"
   )
   private int field9029;
   @OriginalMember(
      owner = "client!qn",
      name = "g",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field9030;
   @OriginalMember(
      owner = "client!qn",
      name = "i",
      descriptor = "Z"
   )
   public boolean field9028;
   @OriginalMember(
      owner = "client!qn",
      name = "h",
      descriptor = "Z"
   )
   public boolean field9031;

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IIILsr;IIII[B)V"
   )
   public final void method22(int arg0, int arg1, int arg2, class78 arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
      if (this.field9462 == arg3 && class779.field11371 == this.field9463) {
         if (arg2 < -17) {
            PixelBuffer var10 = this.field9460.field2017;
            int var11 = this.field9030.LockRect(0, arg4, arg1, arg5, arg7, 0, var10);
            if (class402.method3144(-2005530595, var11)) {
               int var12 = this.field9462.field1242 * arg0;
               int var13 = this.field9462.field1242 * arg5;
               int var14 = var10.getRowPitch();
               if (~var13 == ~var14 && ~var12 == ~var13) {
                  var10.method3134(arg8, arg6, 0, arg7 * var13);
               } else {
                  for(int var15 = 0; var15 < arg7; ++var15) {
                     var10.method3134(arg8, var12 * var15 + arg6, var14 * var15, var13);
                  }
               }

               this.field9030.UnlockRect(0);
            }

         }
      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method27(boolean arg0) {
      if (arg0) {
         this.method31(false, false, false);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IIIIII[II)V"
   )
   public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
      if (class31.field438 == this.field9462 && class779.field11371 == this.field9463) {
         PixelBuffer var9 = this.field9460.field2017;
         int var10 = this.field9030.LockRect(0, arg7, arg1, arg5, arg3, 0, var9);
         if (arg2 != -20998) {
            this.method26(0.790411F, 71);
         }

         if (class402.method3144(arg2 ^ 2005509607, var10)) {
            int var11 = var9.getRowPitch();
            if (~(arg5 * 4) == ~var11 && arg4 == arg5) {
               var9.method3136(arg6, arg0, 0, arg3 * arg5);
            } else {
               for(int var12 = 0; ~arg3 < ~var12; ++var12) {
                  var9.method3136(arg6, arg4 * var12 + arg0, var11 * var12, arg5);
               }
            }

            this.field9030.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   public final void method24(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      if (arg6 != 351) {
         this.field9028 = false;
      }

      if (class31.field438 == this.field9462 && class779.field11371 == this.field9463) {
         PixelBuffer var8 = this.field9460.field2017;
         int var9 = this.field9030.LockRect(0, arg3, arg2, arg1, arg5, 16, var8);
         if (class402.method3144(arg6 ^ -2005530302, var9)) {
            int var10 = var8.getRowPitch();
            if (~(arg1 * 4) == ~var10) {
               var8.method3135(arg4, arg0, 0, arg4.length);
            } else {
               for(int var11 = 0; var11 < arg5; ++var11) {
                  var8.method3135(arg4, arg1 * var11 + arg0, var10 * var11, arg1);
               }
            }

            this.field9030.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(Lmb;B)V"
   )
   public final void method1075(class359 arg0, byte arg1) {
      super.method1075(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(Lmv;Lsr;IIZ[BII)V"
   )
   public class641(class125 arg0, class78 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class779.field11371, arg4 && arg0.field1999, arg2 * arg3);
      if (!this.field9460.field1991) {
         this.field9027 = class645.method4694(arg2, (byte)-128);
         this.field9029 = class645.method4694(arg3, (byte)-128);
      } else {
         this.field9027 = arg2;
         this.field9029 = arg3;
      }

      if (arg4) {
         this.field9030 = this.field9460.field2013.method3118(this.field9027, this.field9029, 0, 1024, class125.method1277((byte)46, class779.field11371, this.field9462), 1);
      } else {
         this.field9030 = this.field9460.field2013.method3118(this.field9027, this.field9029, 1, 0, class125.method1277((byte)46, class779.field11371, this.field9462), 1);
      }

      PixelBuffer var9 = this.field9460.field2017;
      int var10 = this.field9030.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class402.method3144(-2005530595, var10)) {
         if (arg7 == 0) {
            arg7 = arg2;
         }

         int var11 = this.field9462.field1242 * arg7;
         int var12 = this.field9462.field1242 * arg2;
         int var13 = var9.getRowPitch();
         if (~var12 == ~var13 && var11 == var12) {
            var9.method3134(arg5, arg6, 0, arg3 * var12);
         } else {
            for(int var14 = 0; arg3 > var14; ++var14) {
               var9.method3134(arg5, var11 * var14 + arg6, var13 * var14, var12);
            }
         }

         this.field9030.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method4596(byte arg0) {
      int var2 = -47 % ((arg0 - 40) / 42);
      return this.field9030;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(ZZZ)V"
   )
   public final void method31(boolean arg0, boolean arg1, boolean arg2) {
      this.field9031 = arg0;
      this.field9028 = arg2;
      if (arg1) {
         this.field9029 = -105;
      }

   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1071(boolean arg0) {
      this.field9460.method1243((byte)-118, this);
      if (!arg0) {
         this.field9028 = false;
      }

   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(Lmv;Lsr;Lob;II)V"
   )
   public class641(class125 arg0, class78 arg1, class779 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (!this.field9460.field1991) {
         this.field9027 = class645.method4694(arg3, (byte)-128);
         this.field9029 = class645.method4694(arg4, (byte)-128);
      } else {
         this.field9027 = arg3;
         this.field9029 = arg4;
      }

      this.field9030 = this.field9460.field2013.method3118(arg3, arg4, 1, 0, class125.method1277((byte)46, this.field9463, this.field9462), 1);
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method28(byte arg0) {
      if (arg0 > -53) {
         this.method1075((class359)null, (byte)110);
      }

      return this.field9029;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(FI)F"
   )
   public final float method26(float arg0, int arg1) {
      return arg1 != -22887 ? 1.7131503F : arg0 / (float)this.field9029;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(Lmv;IIZ[III)V"
   )
   public class641(class125 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class31.field438, class779.field11371, arg3 && arg0.field1999, arg1 * arg2);
      if (!this.field9460.field1991) {
         this.field9027 = class645.method4694(arg1, (byte)-128);
         this.field9029 = class645.method4694(arg2, (byte)-128);
      } else {
         this.field9029 = arg2;
         this.field9027 = arg1;
      }

      if (arg3) {
         this.field9030 = this.field9460.field2013.method3118(this.field9027, this.field9029, 0, 1024, 21, 1);
      } else {
         this.field9030 = this.field9460.field2013.method3118(this.field9027, this.field9029, 1, 0, 21, 1);
      }

      PixelBuffer var8 = this.field9460.field2017;
      int var9 = this.field9030.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class402.method3144(-2005530595, var9)) {
         if (~arg6 == -1) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (arg1 * 4 == var10 && ~arg1 == ~arg6) {
            var8.method3136(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; var11 < arg2; ++var11) {
               var8.method3136(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
            }
         }

         this.field9030.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method21(float arg0, int arg1) {
      if (arg1 != 11439) {
         this.method24(-127, 119, -20, -95, (int[])null, -93, 12);
      }

      return arg0 / (float)this.field9027;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method18(byte arg0) {
      if (arg0 != -9) {
         this.method4596((byte)74);
      }

      return this.field9027;
   }
}
