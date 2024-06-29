import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class542 extends class422 implements class95 {
   @OriginalMember(
      owner = "client!dn",
      name = "f",
      descriptor = "I"
   )
   private int field7897;
   @OriginalMember(
      owner = "client!dn",
      name = "h",
      descriptor = "I"
   )
   private int field7898;
   @OriginalMember(
      owner = "client!dn",
      name = "j",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field7896;
   @OriginalMember(
      owner = "client!dn",
      name = "g",
      descriptor = "Z"
   )
   public boolean field7895;
   @OriginalMember(
      owner = "client!dn",
      name = "i",
      descriptor = "Z"
   )
   public boolean field7899;

   @OriginalMember(
      owner = "client!dn",
      name = "<init>",
      descriptor = "(Lfi;Lii;IIZ[BII)V"
   )
   public class542(class582 arg0, class579 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class513.field7519, arg4 && arg0.field8613, arg2 * arg3);
      if (this.field6415.field8632) {
         this.field7897 = arg2;
         this.field7898 = arg3;
      } else {
         this.field7897 = class7.method63(arg2, false);
         this.field7898 = class7.method63(arg3, false);
      }

      if (!arg4) {
         this.field7896 = this.field6415.field8614.method3790(this.field7897, this.field7898, 1, 0, class582.method4287(false, class513.field7519, this.field6413), 1);
      } else {
         this.field7896 = this.field6415.field8614.method3790(this.field7897, this.field7898, 0, 1024, class582.method4287(false, class513.field7519, this.field6413), 1);
      }

      PixelBuffer var9 = this.field6415.field8628;
      int var10 = this.field7896.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class508.method3766(var10, (byte)-44)) {
         if (~arg7 == -1) {
            arg7 = arg2;
         }

         int var11 = this.field6413.field8583 * arg2;
         int var12 = this.field6413.field8583 * arg7;
         int var13 = var9.getRowPitch();
         if (~var11 == ~var13 && ~var11 == ~var12) {
            var9.method3792(arg5, arg6, 0, arg3 * var11);
         } else {
            for(int var14 = 0; arg3 > var14; ++var14) {
               var9.method3792(arg5, var12 * var14 + arg6, var13 * var14, var11);
            }
         }

         this.field7896.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method505(int arg0) {
      if (arg0 != 9987) {
         this.field7899 = false;
      }

      return this.field7897;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "<init>",
      descriptor = "(Lfi;Lii;Lef;II)V"
   )
   public class542(class582 arg0, class579 arg1, class513 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (this.field6415.field8632) {
         this.field7897 = arg3;
         this.field7898 = arg4;
      } else {
         this.field7897 = class7.method63(arg3, false);
         this.field7898 = class7.method63(arg4, false);
      }

      this.field7896 = this.field6415.field8614.method3790(arg3, arg4, 1, 0, class582.method4287(false, this.field6414, this.field6413), 1);
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method499(int arg0) {
      return arg0 != 27891 ? true : true;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method503(float arg0, int arg1) {
      return arg1 != 25525 ? 1.2504653F : arg0 / (float)this.field7898;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(III[IIII)V"
   )
   public final void method510(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
      if (arg4 != -18779) {
         this.method503(0.5612372F, 4);
      }

      if (class75.field963 == this.field6413 && class513.field7519 == this.field6414) {
         PixelBuffer var8 = this.field6415.field8628;
         int var9 = this.field7896.LockRect(0, arg1, arg5, arg2, arg0, 16, var8);
         if (class508.method3766(var9, (byte)-44)) {
            int var10 = var8.getRowPitch();
            if (arg2 * 4 != var10) {
               for(int var11 = 0; arg0 > var11; ++var11) {
                  var8.method3795(arg3, arg2 * var11 + arg6, var10 * var11, arg2);
               }
            } else {
               var8.method3795(arg3, arg6, 0, arg3.length);
            }

            this.field7896.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method502(int arg0, boolean arg1, boolean arg2) {
      this.field7895 = arg2;
      if (arg0 >= 90) {
         this.field7899 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "b",
      descriptor = "(FI)F"
   )
   public final float method504(float arg0, int arg1) {
      if (arg1 != 2029) {
         this.method502(60, false, false);
      }

      return arg0 / (float)this.field7897;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1915(int arg0) {
      if (arg0 >= -63) {
         this.method499(-105);
      }

      this.field6415.method4289(-20474, this);
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(ILuh;)V"
   )
   public final void method1914(int arg0, class176 arg1) {
      super.method1914(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dn",
      name = "e",
      descriptor = "(I)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method2911(int arg0) {
      if (arg0 != 10183) {
         this.field7895 = false;
      }

      return this.field7896;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "([BILii;IIIIII)V"
   )
   public final void method498(byte[] arg0, int arg1, class579 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (this.field6413 == arg2 && class513.field7519 == this.field6414) {
         PixelBuffer var10 = this.field6415.field8628;
         int var11 = this.field7896.LockRect(0, arg8, arg5, arg6, arg3, 0, var10);
         if (arg1 != 776) {
            this.method508(-100, -63, 119, (int[])null, 103, -58, -85, -93);
         }

         if (class508.method3766(var11, (byte)-44)) {
            int var12 = this.field6413.field8583 * arg6;
            int var13 = this.field6413.field8583 * arg4;
            int var14 = var10.getRowPitch();
            if (~var12 == ~var14 && ~var12 == ~var13) {
               var10.method3792(arg0, arg7, 0, arg3 * var12);
            } else {
               for(int var15 = 0; ~arg3 < ~var15; ++var15) {
                  var10.method3792(arg0, var13 * var15 + arg7, var14 * var15, var12);
               }
            }

            this.field7896.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!dn",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method500(int arg0) {
      if (arg0 != -32545) {
         this.method499(8);
      }

      return this.field7898;
   }

   @OriginalMember(
      owner = "client!dn",
      name = "<init>",
      descriptor = "(Lfi;IIZ[III)V"
   )
   public class542(class582 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class75.field963, class513.field7519, arg3 && arg0.field8613, arg1 * arg2);
      if (this.field6415.field8632) {
         this.field7898 = arg2;
         this.field7897 = arg1;
      } else {
         this.field7897 = class7.method63(arg1, false);
         this.field7898 = class7.method63(arg2, false);
      }

      if (!arg3) {
         this.field7896 = this.field6415.field8614.method3790(this.field7897, this.field7898, 1, 0, 21, 1);
      } else {
         this.field7896 = this.field6415.field8614.method3790(this.field7897, this.field7898, 0, 1024, 21, 1);
      }

      PixelBuffer var8 = this.field6415.field8628;
      int var9 = this.field7896.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class508.method3766(var9, (byte)-44)) {
         if (arg6 == 0) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (~(arg1 * 4) == ~var10 && ~arg1 == ~arg6) {
            var8.method3794(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; var11 < arg2; ++var11) {
               var8.method3794(arg4, arg5 - -(arg6 * var11), var10 * var11, arg1);
            }
         }

         this.field7896.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!dn",
      name = "a",
      descriptor = "(III[IIIII)V"
   )
   public final void method508(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg4 < -106) {
         if (class75.field963 == this.field6413 && class513.field7519 == this.field6414) {
            PixelBuffer var9 = this.field6415.field8628;
            int var10 = this.field7896.LockRect(0, arg6, arg5, arg2, arg0, 0, var9);
            if (class508.method3766(var10, (byte)-44)) {
               int var11 = var9.getRowPitch();
               if (arg2 * 4 == var11 && arg2 == arg7) {
                  var9.method3794(arg3, arg1, 0, arg0 * arg2);
               } else {
                  for(int var12 = 0; ~var12 > ~arg0; ++var12) {
                     var9.method3794(arg3, arg7 * var12 + arg1, var11 * var12, arg2);
                  }
               }

               this.field7896.UnlockRect(0);
            }

         } else {
            throw new RuntimeException();
         }
      }
   }
}
