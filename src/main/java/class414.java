import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class760;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class414 extends class717 implements class177 {
   @OriginalMember(
      owner = "client!bga",
      name = "j",
      descriptor = "I"
   )
   private int field5685;
   @OriginalMember(
      owner = "client!bga",
      name = "i",
      descriptor = "I"
   )
   private int field5683;
   @OriginalMember(
      owner = "client!bga",
      name = "h",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field5681;
   @OriginalMember(
      owner = "client!bga",
      name = "g",
      descriptor = "Z"
   )
   public boolean field5682;
   @OriginalMember(
      owner = "client!bga",
      name = "f",
      descriptor = "Z"
   )
   public boolean field5684;

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IIII[III)V"
   )
   public final void method1509(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
      if (class606.field8967 == this.field10515 && class576.field8541 == this.field10516) {
         PixelBuffer var8 = this.field10517.field2094;
         int var9 = this.field5681.LockRect(0, arg1, arg6, arg3, arg0, 16, var8);
         if (arg2 != 3971) {
            this.method1514((byte)122, -1.0860844F);
         }

         if (class760.method5514(25060, var9)) {
            int var10 = var8.getRowPitch();
            if (~(arg3 * 4) != ~var10) {
               for(int var11 = 0; ~arg0 < ~var11; ++var11) {
                  var8.method5486(arg4, arg5 - -(arg3 * var11), var10 * var11, arg3);
               }
            } else {
               var8.method5486(arg4, arg5, 0, arg4.length);
            }

            this.field5681.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "<init>",
      descriptor = "(Lub;IIZ[III)V"
   )
   public class414(class165 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class606.field8967, class576.field8541, arg3 && arg0.field2105, arg1 * arg2);
      if (this.field10517.field2092) {
         this.field5685 = arg2;
         this.field5683 = arg1;
      } else {
         this.field5683 = class109.method978(-1, arg1);
         this.field5685 = class109.method978(-1, arg2);
      }

      if (arg3) {
         this.field5681 = this.field10517.field2093.method5509(this.field5683, this.field5685, 0, 1024, 21, 1);
      } else {
         this.field5681 = this.field10517.field2093.method5509(this.field5683, this.field5685, 1, 0, 21, 1);
      }

      PixelBuffer var8 = this.field10517.field2094;
      int var9 = this.field5681.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class760.method5514(25060, var9)) {
         if (~arg6 == -1) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (~(arg1 * 4) == ~var10 && ~arg1 == ~arg6) {
            var8.method5487(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; var11 < arg2; ++var11) {
               var8.method5487(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
            }
         }

         this.field5681.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public final void method1516(boolean arg0, boolean arg1, int arg2) {
      this.field5682 = arg0;
      this.field5684 = arg1;
      if (arg2 != 13852) {
         this.field5681 = (IDirect3DTexture)null;
      }

   }

   @OriginalMember(
      owner = "client!bga",
      name = "<init>",
      descriptor = "(Lub;Ldja;Lwn;II)V"
   )
   public class414(class165 arg0, class45 arg1, class576 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (!this.field10517.field2092) {
         this.field5683 = class109.method978(-1, arg3);
         this.field5685 = class109.method978(-1, arg4);
      } else {
         this.field5685 = arg4;
         this.field5683 = arg3;
      }

      this.field5681 = this.field10517.field2093.method5509(arg3, arg4, 1, 0, class165.method1366(this.field10515, this.field10516, -31143), 1);
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(BF)F"
   )
   public final float method1514(byte arg0, float arg1) {
      if (arg0 < 28) {
         this.method1513((byte)-86);
      }

      return arg1 / (float)this.field5683;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(I[IIIIIII)V"
   )
   public final void method1512(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      if (arg4 != -29005) {
         this.method1509(84, 70, 2, -102, (int[])null, -79, 117);
      }

      if (class606.field8967 == this.field10515 && class576.field8541 == this.field10516) {
         PixelBuffer var9 = this.field10517.field2094;
         int var10 = this.field5681.LockRect(0, arg7, arg6, arg2, arg5, 0, var9);
         if (class760.method5514(25060, var10)) {
            int var11 = var9.getRowPitch();
            if (~(arg2 * 4) == ~var11 && ~arg0 == ~arg2) {
               var9.method5487(arg1, arg3, 0, arg2 * arg5);
            } else {
               for(int var12 = 0; var12 < arg5; ++var12) {
                  var9.method5487(arg1, arg0 * var12 + arg3, var11 * var12, arg2);
               }
            }

            this.field5681.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(IF)F"
   )
   public final float method1510(int arg0, float arg1) {
      int var3 = -21 % ((arg0 - 5) / 36);
      return arg1 / (float)this.field5685;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1511(int arg0) {
      if (arg0 != 23351) {
         this.field5682 = false;
      }

      return this.field5683;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method3244(byte arg0) {
      if (arg0 != 5) {
         this.field5684 = false;
      }

      return this.field5681;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1513(byte arg0) {
      return arg0 != -115 ? -8 : this.field5685;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1517(int arg0) {
      if (arg0 != 20668) {
         this.method1511(-13);
      }

      return true;
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(Lrj;B)V"
   )
   public final void method2868(class782 arg0, byte arg1) {
      super.method2868(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bga",
      name = "<init>",
      descriptor = "(Lub;Ldja;IIZ[BII)V"
   )
   public class414(class165 arg0, class45 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class576.field8541, arg4 && arg0.field2105, arg2 * arg3);
      if (this.field10517.field2092) {
         this.field5683 = arg2;
         this.field5685 = arg3;
      } else {
         this.field5683 = class109.method978(-1, arg2);
         this.field5685 = class109.method978(-1, arg3);
      }

      if (arg4) {
         this.field5681 = this.field10517.field2093.method5509(this.field5683, this.field5685, 0, 1024, class165.method1366(this.field10515, class576.field8541, -31143), 1);
      } else {
         this.field5681 = this.field10517.field2093.method5509(this.field5683, this.field5685, 1, 0, class165.method1366(this.field10515, class576.field8541, -31143), 1);
      }

      PixelBuffer var9 = this.field10517.field2094;
      int var10 = this.field5681.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class760.method5514(25060, var10)) {
         if (~arg7 == -1) {
            arg7 = arg2;
         }

         int var11 = this.field10515.field576 * arg7;
         int var12 = this.field10515.field576 * arg2;
         int var13 = var9.getRowPitch();
         if (~var12 == ~var13 && ~var11 == ~var12) {
            var9.method231(arg5, arg6, 0, arg3 * var12);
         } else {
            for(int var14 = 0; ~arg3 < ~var14; ++var14) {
               var9.method231(arg5, arg6 - -(var11 * var14), var13 * var14, var12);
            }
         }

         this.field5681.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!bga",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2873(byte arg0) {
      if (arg0 == 2) {
         this.field10517.method1365(this, -24407);
      }
   }

   @OriginalMember(
      owner = "client!bga",
      name = "a",
      descriptor = "(III[BLdja;IIII)V"
   )
   public final void method1515(int arg0, int arg1, int arg2, byte[] arg3, class45 arg4, int arg5, int arg6, int arg7, int arg8) {
      if (this.field10515 == arg4 && class576.field8541 == this.field10516) {
         PixelBuffer var10 = this.field10517.field2094;
         int var11 = this.field5681.LockRect(0, arg6, arg1, arg5, arg2, 0, var10);
         if (arg8 > -74) {
            this.field5681 = (IDirect3DTexture)null;
         }

         if (class760.method5514(25060, var11)) {
            int var12 = this.field10515.field576 * arg5;
            int var13 = this.field10515.field576 * arg7;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && ~var12 == ~var13) {
               var10.method231(arg3, arg0, 0, arg2 * var12);
            } else {
               for(int var15 = 0; arg2 > var15; ++var15) {
                  var10.method231(arg3, arg0 - -(var13 * var15), var14 * var15, var12);
               }
            }

            this.field5681.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }
}
