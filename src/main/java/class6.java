import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class598 implements class610 {
   @OriginalMember(
      owner = "client!ie",
      name = "f",
      descriptor = "I"
   )
   private int field36;
   @OriginalMember(
      owner = "client!ie",
      name = "h",
      descriptor = "I"
   )
   private int field35;
   @OriginalMember(
      owner = "client!ie",
      name = "i",
      descriptor = "Ljagdx/IDirect3DTexture;"
   )
   private IDirect3DTexture field32;
   @OriginalMember(
      owner = "client!ie",
      name = "g",
      descriptor = "Z"
   )
   public boolean field33;
   @OriginalMember(
      owner = "client!ie",
      name = "j",
      descriptor = "Z"
   )
   public boolean field34;

   @OriginalMember(
      owner = "client!ie",
      name = "<init>",
      descriptor = "(Lvn;Ltga;Liw;II)V"
   )
   public class6(class332 arg0, class63 arg1, class335 arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, false, arg3 * arg4);
      if (this.field8326.field4763) {
         this.field36 = arg3;
         this.field35 = arg4;
      } else {
         this.field36 = class546.method3944(10, arg3);
         this.field35 = class546.method3944(10, arg4);
      }

      this.field32 = this.field8326.field4766.method3728(arg3, arg4, 1, 0, class332.method2641(21, this.field8328, this.field8325), 1);
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(IIIII[III)V"
   )
   public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
      if (class622.field8682 == this.field8325 && class335.field4803 == this.field8328) {
         PixelBuffer var9 = this.field8326.field4747;
         if (arg7 == -16856) {
            int var10 = this.field32.LockRect(0, arg3, arg4, arg1, arg2, 0, var9);
            if (class512.method3718(var10, 2005530519)) {
               int var11 = var9.getRowPitch();
               if (~(arg1 * 4) == ~var11 && ~arg1 == ~arg6) {
                  var9.method3742(arg5, arg0, 0, arg1 * arg2);
               } else {
                  for(int var12 = 0; ~var12 > ~arg2; ++var12) {
                     var9.method3742(arg5, arg6 * var12 + arg0, var11 * var12, arg1);
                  }
               }

               this.field32.UnlockRect(0);
            }

         }
      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method36(int arg0, boolean arg1, boolean arg2) {
      if (arg0 != 10251) {
         this.method38(-101, 79, (byte[])null, (class63)null, -88, 127, true, 116, 66);
      }

      this.field34 = arg2;
      this.field33 = arg1;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method37(float arg0, int arg1) {
      return arg1 >= -29 ? -0.6082422F : arg0 / (float)this.field35;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(II[BLtga;IIZII)V"
   )
   public final void method38(int arg0, int arg1, byte[] arg2, class63 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
      if (this.field8325 == arg3 && class335.field4803 == this.field8328) {
         PixelBuffer var10 = this.field8326.field4747;
         int var11 = this.field32.LockRect(0, arg0, arg5, arg8, arg4, 0, var10);
         if (class512.method3718(var11, 2005530519)) {
            int var12 = this.field8325.field693 * arg8;
            int var13 = this.field8325.field693 * arg7;
            int var14 = var10.getRowPitch();
            if (~var12 == ~var14 && var12 == var13) {
               var10.method3739(arg2, arg1, 0, arg4 * var12);
            } else {
               for(int var15 = 0; ~arg4 < ~var15; ++var15) {
                  var10.method3739(arg2, var13 * var15 + arg1, var14 * var15, var12);
               }
            }

            this.field32.UnlockRect(0);
         }

         if (!arg6) {
            this.method37(-0.14068322F, 43);
         }

      } else {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "<init>",
      descriptor = "(Lvn;Ltga;IIZ[BII)V"
   )
   public class6(class332 arg0, class63 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, arg1, class335.field4803, arg4 && arg0.field4752, arg2 * arg3);
      if (this.field8326.field4763) {
         this.field35 = arg3;
         this.field36 = arg2;
      } else {
         this.field36 = class546.method3944(10, arg2);
         this.field35 = class546.method3944(10, arg3);
      }

      if (arg4) {
         this.field32 = this.field8326.field4766.method3728(this.field36, this.field35, 0, 1024, class332.method2641(21, class335.field4803, this.field8325), 1);
      } else {
         this.field32 = this.field8326.field4766.method3728(this.field36, this.field35, 1, 0, class332.method2641(21, class335.field4803, this.field8325), 1);
      }

      PixelBuffer var9 = this.field8326.field4747;
      int var10 = this.field32.LockRect(0, 0, 0, arg2, arg3, 0, var9);
      if (class512.method3718(var10, 2005530519)) {
         if (~arg7 == -1) {
            arg7 = arg2;
         }

         int var11 = this.field8325.field693 * arg2;
         int var12 = this.field8325.field693 * arg7;
         int var13 = var9.getRowPitch();
         if (~var11 == ~var13 && var11 == var12) {
            var9.method3739(arg5, arg6, 0, arg3 * var11);
         } else {
            for(int var14 = 0; arg3 > var14; ++var14) {
               var9.method3739(arg5, var12 * var14 + arg6, var13 * var14, var11);
            }
         }

         this.field32.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method39(int arg0) {
      if (arg0 >= -14) {
         this.field35 = -114;
      }

      return this.field35;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "<init>",
      descriptor = "(Lvn;IIZ[III)V"
   )
   public class6(class332 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, class622.field8682, class335.field4803, arg3 && arg0.field4752, arg1 * arg2);
      if (this.field8326.field4763) {
         this.field36 = arg1;
         this.field35 = arg2;
      } else {
         this.field36 = class546.method3944(10, arg1);
         this.field35 = class546.method3944(10, arg2);
      }

      if (arg3) {
         this.field32 = this.field8326.field4766.method3728(this.field36, this.field35, 0, 1024, 21, 1);
      } else {
         this.field32 = this.field8326.field4766.method3728(this.field36, this.field35, 1, 0, 21, 1);
      }

      PixelBuffer var8 = this.field8326.field4747;
      int var9 = this.field32.LockRect(0, 0, 0, arg1, arg2, 0, var8);
      if (class512.method3718(var9, 2005530519)) {
         if (arg6 == 0) {
            arg6 = arg1;
         }

         int var10 = var8.getRowPitch();
         if (arg1 * 4 == var10 && arg1 == arg6) {
            var8.method3742(arg4, arg5, 0, arg1 * arg2);
         } else {
            for(int var11 = 0; ~arg2 < ~var11; ++var11) {
               var8.method3742(arg4, arg5 - -(arg6 * var11), var10 * var11, arg1);
            }
         }

         this.field32.UnlockRect(0);
      }

   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(Lrb;B)V"
   )
   public final void method40(class374 arg0, byte arg1) {
      int var3 = -110 / ((-72 - arg1) / 37);
      super.method40(arg0, (byte)-117);
   }

   @OriginalMember(
      owner = "client!ie",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method41(int arg0) {
      this.field8326.method2633(1, this);
      if (arg0 != -26708) {
         this.method36(-123, false, true);
      }

   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(BF)F"
   )
   public final float method42(byte arg0, float arg1) {
      return arg0 != 15 ? 2.1339085F : arg1 / (float)this.field36;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method43(byte arg0) {
      return arg0 < 10 ? (IDirect3DBaseTexture)null : this.field32;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method44(byte arg0) {
      if (arg0 != 64) {
         this.method36(26, true, false);
      }

      return this.field36;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method45(int arg0) {
      return arg0 != -23234 ? true : true;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(III[IIII)V"
   )
   public final void method46(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
      if (class622.field8682 == this.field8325 && class335.field4803 == this.field8328) {
         int var8 = 38 / ((arg2 - -48) / 62);
         PixelBuffer var9 = this.field8326.field4747;
         int var10 = this.field32.LockRect(0, arg0, arg6, arg5, arg4, 16, var9);
         if (class512.method3718(var10, 2005530519)) {
            int var11 = var9.getRowPitch();
            if (~(arg5 * 4) != ~var11) {
               for(int var12 = 0; ~arg4 < ~var12; ++var12) {
                  var9.method3741(arg3, arg5 * var12 + arg1, var11 * var12, arg5);
               }
            } else {
               var9.method3741(arg3, arg1, 0, arg3.length);
            }

            this.field32.UnlockRect(0);
         }

      } else {
         throw new RuntimeException();
      }
   }
}
