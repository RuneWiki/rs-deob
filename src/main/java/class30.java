import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class71;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class30 extends class567 implements class196 {
   @OriginalMember(
      owner = "client!fba",
      name = "f",
      descriptor = "I"
   )
   private int field380;
   @OriginalMember(
      owner = "client!fba",
      name = "h",
      descriptor = "I"
   )
   private int field377;
   @OriginalMember(
      owner = "client!fba",
      name = "i",
      descriptor = "I"
   )
   private int field379;
   @OriginalMember(
      owner = "client!fba",
      name = "g",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field378;

   @OriginalMember(
      owner = "client!fba",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method214(int arg0) {
      this.field8407.method1459(this, false);
      if (arg0 <= 44) {
         this.field379 = -74;
      }

   }

   @OriginalMember(
      owner = "client!fba",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method215(byte arg0) {
      int var2 = -4 % ((arg0 - 49) / 50);
      return this.field378;
   }

   @OriginalMember(
      owner = "client!fba",
      name = "<init>",
      descriptor = "(Leb;Leh;III[B)V"
   )
   public class30(class163 arg0, class19 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class650.field9371, false, arg3 * arg4 * arg2);
      this.field380 = arg2;
      this.field377 = arg4;
      this.field379 = arg3;
      this.field378 = this.field8407.field2447.method570(arg2, arg3, arg4, 1, 0, class163.method1482(arg1, false, this.field8403), 1);
      PixelBuffer var7 = this.field8407.field2428;
      int var8 = this.field378.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class71.method550(var8, (byte)-80)) {
         int var9 = this.field8406.field240 * this.field380;
         int var10 = this.field379 * var9;
         int var11 = var7.getSlicePitch();
         if (var10 == var11) {
            var7.method548(arg5, 0, 0, this.field379 * var9 * this.field377);
         } else {
            int var12 = var7.getRowPitch();
            if (~var9 == ~var12) {
               for(int var13 = 0; this.field377 > var13; ++var13) {
                  var7.method548(arg5, var10 * var13, var11 * var13, var10);
               }
            } else {
               for(int var14 = 0; var14 < this.field377; ++var14) {
                  for(int var15 = 0; this.field379 > var15; ++var15) {
                     var7.method548(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                  }
               }
            }
         }

         this.field378.UnlockBox(0);
      }

   }

   @OriginalMember(
      owner = "client!fba",
      name = "a",
      descriptor = "(ILpi;)V"
   )
   public final void method216(int arg0, class427 arg1) {
      if (arg0 <= 125) {
         this.method214(-101);
      }

      super.method216(126, arg1);
   }
}
