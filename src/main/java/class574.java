import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class574 extends class309 implements class272 {
   @OriginalMember(
      owner = "client!el",
      name = "f",
      descriptor = "I"
   )
   private int field8507;
   @OriginalMember(
      owner = "client!el",
      name = "j",
      descriptor = "I"
   )
   private int field8510;
   @OriginalMember(
      owner = "client!el",
      name = "h",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field8509;
   @OriginalMember(
      owner = "client!el",
      name = "i",
      descriptor = "Z"
   )
   public boolean field8506;
   @OriginalMember(
      owner = "client!el",
      name = "g",
      descriptor = "Z"
   )
   public boolean field8508;

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(ILgj;)V"
   )
   public final void method1425(int arg0, class663 arg1) {
      if (arg0 < -116) {
         super.method1425(-120, arg1);
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method279(boolean arg0) {
      if (!arg0) {
         this.method1425(79, (class663)null);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method274(int arg0, float arg1) {
      if (arg0 != 11535) {
         this.field8509 = (IDirect3DTexture)null;
      }

      return arg1 / (float)this.field8510;
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(IILak;III[BII)V"
   )
   public final void method276(int arg0, int arg1, class371 arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      if (arg3 == -8262) {
         if (this.field4253 == arg2 && class301.field4117 == this.field4252) {
            PixelBuffer var10 = this.field4250.field4763;
            int var11 = this.field8509.LockRect(0, arg8, arg4, arg7, arg0, 0, var10);
            if (class512.method3730((byte)-126, var11)) {
               int var12 = this.field4253.field5392 * arg1;
               int var13 = this.field4253.field5392 * arg7;
               int var14 = var10.getRowPitch();
               if (var13 == var14 && var12 == var13) {
                  var10.method3733(arg6, arg5, 0, arg0 * var13);
               } else {
                  for(int var15 = 0; ~arg0 < ~var15; ++var15) {
                     var10.method3733(arg6, var12 * var15 + arg5, var14 * var15, var13);
                  }
               }

               this.field8509.UnlockRect(0);
            }

         } else {
            throw new RuntimeException();
         }
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(B[IIIIIII)V"
   )
   public final void method281(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (class424.field6036 == this.field4253 && class301.field4117 == this.field4252) {
         if (arg0 != -2) {
            this.method1424((byte)37);
         }

         PixelBuffer var9 = this.field4250.field4763;
         int var10 = this.field8509.LockRect(0, arg2, arg5, arg6, arg3, 0, var9);
         if (class512.method3730((byte)120, var10)) {
            int var11 = var9.getRowPitch();
            if (~(arg6 * 4) == ~var11 && ~arg6 == ~arg7) {
               var9.method3735(arg1, arg4, 0, arg3 * arg6);
            } else {
               for(int var12 = 0; var12 < arg3; ++var12) {
                  var9.method3735(arg1, arg4 - -(arg7 * var12), var11 * var12, arg6);
               }
            }

            this.field8509.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1423(int arg0) {
      if (arg0 == 3038) {
         this.field4250.method2632((byte)-127, this);
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(ZZZ)V"
   )
   public final void method277(boolean arg0, boolean arg1, boolean arg2) {
      if (!arg0) {
         this.method279(false);
      }

      this.field8508 = arg2;
      this.field8506 = arg1;
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method272(byte arg0) {
      if (arg0 != -13) {
         this.method1425(8, (class663)null);
      }

      return this.field8510;
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(FB)F"
   )
   public final float method282(float arg0, byte arg1) {
      if (arg1 != 26) {
         this.field8508 = true;
      }

      return arg0 / (float)this.field8507;
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "(Lbb;Lak;Lria;II)V"
   )
   public class574(class353 arg0, class371 arg1, class301 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (!this.field4250.field4761) {
         this.field8507 = class350.method2552(false, arg3);
         this.field8510 = class350.method2552(false, arg4);
      } else {
         this.field8507 = arg3;
         this.field8510 = arg4;
      }

      this.field8509 = this.field4250.field4742.method3721(arg3, arg4, 1, 0, class353.method2608(this.field4253, (byte)51, this.field4252), 1);
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "(Lbb;Lak;IIZ[BII)V"
   )
   public class574(class353 arg0, class371 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class301.field4117, arg4 && arg0.field4748, arg2 * arg3);
      if (this.field4250.field4761) {
         this.field8507 = arg2;
         this.field8510 = arg3;
      } else {
         this.field8507 = class350.method2552(false, arg2);
         this.field8510 = class350.method2552(false, arg3);
      }

      if (!arg4) {
         this.field8509 = this.field4250.field4742.method3721(this.field8507, this.field8510, 1, 0, class353.method2608(this.field4253, (byte)51, class301.field4117), 1);
      } else {
         this.field8509 = this.field4250.field4742.method3721(this.field8507, this.field8510, 0, 1024, class353.method2608(this.field4253, (byte)51, class301.field4117), 1);
      }

      PixelBuffer var9 = this.field4250.field4763;
      int var10 = this.field8509.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class512.method3730((byte)-36, var10)) {
         if (arg7 == 0) {
            arg7 = arg2;
         }

         int var11 = this.field4253.field5392 * arg7;
         int var12 = this.field4253.field5392 * arg2;
         int var13 = var9.getRowPitch();
         if (var12 == var13 && var11 == var12) {
            var9.method3733(arg5, arg6, 0, arg3 * var12);
         } else {
            for(int var14 = 0; ~arg3 < ~var14; ++var14) {
               var9.method3733(arg5, var11 * var14 + arg6, var13 * var14, var12);
            }
         }

         this.field8509.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method1424(byte arg0) {
      if (arg0 != -89) {
         this.field8507 = 58;
      }

      return this.field8509;
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "(Lbb;IIZ[III)V"
   )
   public class574(class353 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class424.field6036, class301.field4117, arg3 && arg0.field4748, arg1 * arg2);
      if (!this.field4250.field4761) {
         this.field8507 = class350.method2552(false, arg1);
         this.field8510 = class350.method2552(false, arg2);
      } else {
         this.field8507 = arg1;
         this.field8510 = arg2;
      }

      if (arg3) {
         this.field8509 = this.field4250.field4742.method3721(this.field8507, this.field8510, 0, 1024, 21, 1);
      } else {
         this.field8509 = this.field4250.field4742.method3721(this.field8507, this.field8510, 1, 0, 21, 1);
      }

      PixelBuffer var8 = this.field4250.field4763;
      int var9 = this.field8509.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class512.method3730((byte)120, var9)) {
         if (~arg6 == -1) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (arg1 * 4 == var10 && ~arg1 == ~arg6) {
            var8.method3735(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; var11 < arg2; ++var11) {
               var8.method3735(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
            }
         }

         this.field8509.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method283(boolean arg0) {
      return !arg0 ? 64 : this.field8507;
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "([IIIIBII)V"
   )
   public final void method275(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      if (class424.field6036 == this.field4253 && class301.field4117 == this.field4252) {
         PixelBuffer var8 = this.field4250.field4763;
         int var9 = this.field8509.LockRect(0, arg6, arg3, arg5, arg1, 16, var8);
         if (arg4 != -96) {
            this.method272((byte)97);
         }

         if (class512.method3730((byte)120, var9)) {
            int var10 = var8.getRowPitch();
            if (arg5 * 4 == var10) {
               var8.method3736(arg0, arg2, 0, arg0.length);
            } else {
               for(int var11 = 0; ~arg1 < ~var11; ++var11) {
                  var8.method3736(arg0, arg2 - -(arg5 * var11), var10 * var11, arg5);
               }
            }

            this.field8509.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }
}
