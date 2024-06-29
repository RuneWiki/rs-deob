import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class406 extends class717 implements class706 {
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "I"
   )
   private int field5984;
   @OriginalMember(
      owner = "client!kda",
      name = "j",
      descriptor = "I"
   )
   private int field5985;
   @OriginalMember(
      owner = "client!kda",
      name = "i",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field5983;
   @OriginalMember(
      owner = "client!kda",
      name = "h",
      descriptor = "Z"
   )
   public boolean field5986;
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "Z"
   )
   public boolean field5987;

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(I)I",
      line = 5
   )
   public final int method886(int arg0) {
      if (arg0 != -19759) {
         this.field5986 = false;
      }

      return this.field5985;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I[IIIIIZI)V",
      line = 15
   )
   public final void method887(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
      if (class296.field4146 == this.field10368 && class209.field3106 == this.field10365) {
         PixelBuffer var9 = this.field10367.field4017;
         if (arg6) {
            this.method881(-0.07083163F, true);
         }

         int var10 = this.field5983.LockRect(0, arg3, arg0, arg7, arg4, 0, var9);
         if (class507.method3795(var10, -5)) {
            int var11 = var9.getRowPitch();
            if (~(arg7 * 4) == ~var11 && arg2 == arg7) {
               var9.method3823(arg1, arg5, 0, arg4 * arg7);
            } else {
               for(int var12 = 0; var12 < arg4; ++var12) {
                  var9.method3823(arg1, arg2 * var12 + arg5, var11 * var12, arg7);
               }
            }

            this.field5983.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(Z)Z",
      line = 54
   )
   public final boolean method878(boolean arg0) {
      if (!arg0) {
         this.field5984 = -120;
      }

      return true;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "(Lvea;IIZ[III)V",
      line = 63
   )
   public class406(class287 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class296.field4146, class209.field3106, arg3 && arg0.field4015, arg1 * arg2);
      if (!this.field10367.field4036) {
         this.field5984 = class71.method752(arg1, true);
         this.field5985 = class71.method752(arg2, true);
      } else {
         this.field5984 = arg1;
         this.field5985 = arg2;
      }

      if (arg3) {
         this.field5983 = this.field10367.field4018.method3813(this.field5984, this.field5985, 0, 1024, 21, 1);
      } else {
         this.field5983 = this.field10367.field4018.method3813(this.field5984, this.field5985, 1, 0, 21, 1);
      }

      PixelBuffer var8 = this.field10367.field4017;
      int var9 = this.field5983.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class507.method3795(var9, -88)) {
         if (arg6 == 0) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (arg1 * 4 == var10 && arg1 == arg6) {
            var8.method3823(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; ~arg2 < ~var11; ++var11) {
               var8.method3823(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
            }
         }

         this.field5983.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(IF)F",
      line = 124
   )
   public final float method880(int arg0, float arg1) {
      if (arg0 != -10745) {
         this.field5986 = true;
      }

      return arg1 / (float)this.field5984;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(BLega;)V",
      line = 134
   )
   public final void method460(byte arg0, class738 arg1) {
      if (arg0 < 0) {
         super.method460((byte)-12, arg1);
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "(Lvea;Ltv;Lrfa;II)V",
      line = 143
   )
   public class406(class287 arg0, class584 arg1, class209 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (!this.field10367.field4036) {
         this.field5984 = class71.method752(arg3, true);
         this.field5985 = class71.method752(arg4, true);
      } else {
         this.field5984 = arg3;
         this.field5985 = arg4;
      }

      this.field5983 = this.field10367.field4018.method3813(arg3, arg4, 1, 0, class287.method2229(631, this.field10365, this.field10368), 1);
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(FZ)F",
      line = 163
   )
   public final float method881(float arg0, boolean arg1) {
      if (arg1) {
         this.field5983 = (IDirect3DTexture)null;
      }

      return arg0 / (float)this.field5985;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "(Lvea;Ltv;IIZ[BII)V",
      line = 172
   )
   public class406(class287 arg0, class584 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class209.field3106, arg4 && arg0.field4015, arg2 * arg3);
      if (this.field10367.field4036) {
         this.field5984 = arg2;
         this.field5985 = arg3;
      } else {
         this.field5984 = class71.method752(arg2, true);
         this.field5985 = class71.method752(arg3, true);
      }

      if (arg4) {
         this.field5983 = this.field10367.field4018.method3813(this.field5984, this.field5985, 0, 1024, class287.method2229(631, class209.field3106, this.field10368), 1);
      } else {
         this.field5983 = this.field10367.field4018.method3813(this.field5984, this.field5985, 1, 0, class287.method2229(631, class209.field3106, this.field10368), 1);
      }

      PixelBuffer var9 = this.field10367.field4017;
      int var10 = this.field5983.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class507.method3795(var10, -98)) {
         if (~arg7 == -1) {
            arg7 = arg2;
         }

         int var11 = this.field10368.field8449 * arg2;
         int var12 = this.field10368.field8449 * arg7;
         int var13 = var9.getRowPitch();
         if (~var11 == ~var13 && var11 == var12) {
            var9.method3821(arg5, arg6, 0, arg3 * var11);
         } else {
            for(int var14 = 0; var14 < arg3; ++var14) {
               var9.method3821(arg5, var12 * var14 + arg6, var13 * var14, var11);
            }
         }

         this.field5983.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(B)V",
      line = 231
   )
   public final void method461(byte arg0) {
      if (arg0 != 89) {
         this.field5987 = true;
      }

      this.field10367.method2237(this, (byte)105);
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I)I",
      line = 241
   )
   public final int method889(int arg0) {
      if (arg0 != 28570) {
         this.method889(107);
      }

      return this.field5984;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(III[IBII)V",
      line = 251
   )
   public final void method883(int arg0, int arg1, int arg2, int[] arg3, byte arg4, int arg5, int arg6) {
      if (class296.field4146 == this.field10368 && class209.field3106 == this.field10365) {
         PixelBuffer var8 = this.field10367.field4017;
         int var9 = this.field5983.LockRect(0, arg5, arg1, arg6, arg2, 16, var8);
         if (class507.method3795(var9, -4)) {
            int var10 = var8.getRowPitch();
            if (~(arg6 * 4) != ~var10) {
               for(int var11 = 0; var11 < arg2; ++var11) {
                  var8.method3824(arg3, arg6 * var11 + arg0, var10 * var11, arg6);
               }
            } else {
               var8.method3824(arg3, arg0, 0, arg3.length);
            }

            this.field5983.UnlockRect(0);
         }

         if (arg4 >= -100) {
            this.field5984 = -45;
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(ILtv;IIIB[BII)V",
      line = 290
   )
   public final void method885(int arg0, class584 arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
      if (arg5 <= 9) {
         this.method881(-0.29373994F, true);
      }

      if (this.field10368 == arg1 && class209.field3106 == this.field10365) {
         PixelBuffer var10 = this.field10367.field4017;
         int var11 = this.field5983.LockRect(0, arg7, arg8, arg2, arg4, 0, var10);
         if (class507.method3795(var11, -41)) {
            int var12 = this.field10368.field8449 * arg0;
            int var13 = this.field10368.field8449 * arg2;
            int var14 = var10.getRowPitch();
            if (~var13 == ~var14 && ~var12 == ~var13) {
               var10.method3821(arg6, arg3, 0, arg4 * var13);
            } else {
               for(int var15 = 0; ~arg4 < ~var15; ++var15) {
                  var10.method3821(arg6, var12 * var15 + arg3, var14 * var15, var13);
               }
            }

            this.field5983.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(ZIZ)V",
      line = 332
   )
   public final void method884(boolean arg0, int arg1, boolean arg2) {
      this.field5987 = arg2;
      this.field5986 = arg0;
      int var4 = 70 % ((30 - arg1) / 37);
   }

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;",
      line = 342
   )
   public final IDirect3DBaseTexture method835(boolean arg0) {
      return arg0 ? (IDirect3DBaseTexture)null : this.field5983;
   }
}
