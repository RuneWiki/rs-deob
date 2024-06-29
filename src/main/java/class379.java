import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class71;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class379 extends class567 implements class282 {
   @OriginalMember(
      owner = "client!kka",
      name = "g",
      descriptor = "I"
   )
   private int field6005;
   @OriginalMember(
      owner = "client!kka",
      name = "f",
      descriptor = "I"
   )
   private int field6007;
   @OriginalMember(
      owner = "client!kka",
      name = "i",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field6004;
   @OriginalMember(
      owner = "client!kka",
      name = "j",
      descriptor = "Z"
   )
   public boolean field6006;
   @OriginalMember(
      owner = "client!kka",
      name = "h",
      descriptor = "Z"
   )
   public boolean field6008;

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2362(byte arg0) {
      if (arg0 < 40) {
         this.field6008 = true;
      }

      return true;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method214(int arg0) {
      this.field8407.method1451(this, (byte)93);
      if (arg0 < 44) {
         this.method215((byte)125);
      }

   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method2363(int arg0, float arg1) {
      if (arg0 >= -24) {
         this.method2362((byte)47);
      }

      return arg1 / (float)this.field6007;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2361(int arg0) {
      return arg0 != -19616 ? 42 : this.field6007;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "<init>",
      descriptor = "(Leb;IIZ[III)V"
   )
   public class379(class163 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class364.field5628, class650.field9371, arg3 && arg0.field2433, arg1 * arg2);
      if (!this.field8407.field2448) {
         this.field6005 = class510.method3964(arg1, (byte)99);
         this.field6007 = class510.method3964(arg2, (byte)99);
      } else {
         this.field6007 = arg2;
         this.field6005 = arg1;
      }

      if (arg3) {
         this.field6004 = this.field8407.field2447.method561(this.field6005, this.field6007, 0, 1024, 21, 1);
      } else {
         this.field6004 = this.field8407.field2447.method561(this.field6005, this.field6007, 1, 0, 21, 1);
      }

      PixelBuffer var8 = this.field8407.field2428;
      int var9 = this.field6004.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class71.method550(var9, (byte)-80)) {
         if (arg6 == 0) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (~(arg1 * 4) == ~var10 && ~arg1 == ~arg6) {
            var8.method560(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; arg2 > var11; ++var11) {
               var8.method560(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
            }
         }

         this.field6004.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2355(int arg0) {
      if (arg0 != 20759) {
         this.field6007 = 70;
      }

      return this.field6005;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(B[IIIIII)V"
   )
   public final void method2356(byte arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (class364.field5628 == this.field8406 && class650.field9371 == this.field8403) {
         if (arg0 > 81) {
            PixelBuffer var8 = this.field8407.field2428;
            int var9 = this.field6004.LockRect(0, arg5, arg2, arg3, arg6, 16, var8);
            if (class71.method550(var9, (byte)-80)) {
               int var10 = var8.getRowPitch();
               if (arg3 * 4 != var10) {
                  for(int var11 = 0; var11 < arg6; ++var11) {
                     var8.method559(arg1, arg3 * var11 + arg4, var10 * var11, arg3);
                  }
               } else {
                  var8.method559(arg1, arg4, 0, arg1.length);
               }

               this.field6004.UnlockRect(0);
            }

         }
      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "<init>",
      descriptor = "(Leb;Leh;IIZ[BII)V"
   )
   public class379(class163 arg0, class19 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class650.field9371, arg4 && arg0.field2433, arg2 * arg3);
      if (this.field8407.field2448) {
         this.field6007 = arg3;
         this.field6005 = arg2;
      } else {
         this.field6005 = class510.method3964(arg2, (byte)119);
         this.field6007 = class510.method3964(arg3, (byte)112);
      }

      if (!arg4) {
         this.field6004 = this.field8407.field2447.method561(this.field6005, this.field6007, 1, 0, class163.method1482(this.field8406, false, class650.field9371), 1);
      } else {
         this.field6004 = this.field8407.field2447.method561(this.field6005, this.field6007, 0, 1024, class163.method1482(this.field8406, false, class650.field9371), 1);
      }

      PixelBuffer var9 = this.field8407.field2428;
      int var10 = this.field6004.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class71.method550(var10, (byte)-80)) {
         if (arg7 == 0) {
            arg7 = arg2;
         }

         int var11 = this.field8406.field240 * arg2;
         int var12 = this.field8406.field240 * arg7;
         int var13 = var9.getRowPitch();
         if (~var11 == ~var13 && var11 == var12) {
            var9.method548(arg5, arg6, 0, arg3 * var11);
         } else {
            for(int var14 = 0; ~var14 > ~arg3; ++var14) {
               var9.method548(arg5, var12 * var14 + arg6, var13 * var14, var11);
            }
         }

         this.field6004.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(ILpi;)V"
   )
   public final void method216(int arg0, class427 arg1) {
      if (arg0 >= 125) {
         super.method216(126, arg1);
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "<init>",
      descriptor = "(Leb;Leh;Lpc;II)V"
   )
   public class379(class163 arg0, class19 arg1, class650 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (this.field8407.field2448) {
         this.field6007 = arg4;
         this.field6005 = arg3;
      } else {
         this.field6005 = class510.method3964(arg3, (byte)117);
         this.field6007 = class510.method3964(arg4, (byte)105);
      }

      this.field6004 = this.field8407.field2447.method561(arg3, arg4, 1, 0, class163.method1482(this.field8406, false, this.field8403), 1);
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(FB)F"
   )
   public final float method2359(float arg0, byte arg1) {
      return arg1 != 32 ? -1.2399937F : arg0 / (float)this.field6005;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method215(byte arg0) {
      int var2 = 104 / ((49 - arg0) / 50);
      return this.field6004;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(BIIIILeh;II[B)V"
   )
   public final void method2360(byte arg0, int arg1, int arg2, int arg3, int arg4, class19 arg5, int arg6, int arg7, byte[] arg8) {
      if (this.field8406 == arg5 && class650.field9371 == this.field8403) {
         if (arg0 < -11) {
            PixelBuffer var10 = this.field8407.field2428;
            int var11 = this.field6004.LockRect(0, arg4, arg7, arg1, arg2, 0, var10);
            if (class71.method550(var11, (byte)-80)) {
               int var12 = this.field8406.field240 * arg6;
               int var13 = this.field8406.field240 * arg1;
               int var14 = var10.getRowPitch();
               if (var13 == var14 && var12 == var13) {
                  var10.method548(arg8, arg3, 0, arg2 * var13);
               } else {
                  for(int var15 = 0; ~arg2 < ~var15; ++var15) {
                     var10.method548(arg8, var12 * var15 + arg3, var14 * var15, var13);
                  }
               }

               this.field6004.UnlockRect(0);
            }

         }
      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(IIIII[III)V"
   )
   public final void method2357(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
      if (class364.field5628 == this.field8406 && class650.field9371 == this.field8403) {
         PixelBuffer var9 = this.field8407.field2428;
         if (arg1 != -24773) {
            this.field6007 = 104;
         }

         int var10 = this.field6004.LockRect(0, arg2, arg0, arg4, arg3, 0, var9);
         if (class71.method550(var10, (byte)-80)) {
            int var11 = var9.getRowPitch();
            if (arg4 * 4 == var11 && arg4 == arg6) {
               var9.method560(arg5, arg7, 0, arg3 * arg4);
            } else {
               for(int var12 = 0; var12 < arg3; ++var12) {
                  var9.method560(arg5, arg7 - -(arg6 * var12), var11 * var12, arg4);
               }
            }

            this.field6004.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method2358(int arg0, boolean arg1, boolean arg2) {
      this.field6006 = arg2;
      this.field6008 = arg1;
      if (arg0 != -3545) {
         this.method2359(1.0771122F, (byte)23);
      }

   }
}
