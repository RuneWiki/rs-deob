import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class431 extends class598 implements class557 {
   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "I"
   )
   private int field6024;
   @OriginalMember(
      owner = "client!we",
      name = "h",
      descriptor = "I"
   )
   private int field6021;
   @OriginalMember(
      owner = "client!we",
      name = "g",
      descriptor = "I"
   )
   private int field6022;
   @OriginalMember(
      owner = "client!we",
      name = "i",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field6023;

   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method43(byte arg0) {
      return arg0 < 10 ? (IDirect3DBaseTexture)null : this.field6023;
   }

   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method41(int arg0) {
      this.field8326.method2637(this, -120);
      if (arg0 != -26708) {
         this.field6024 = -73;
      }

   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(Lrb;B)V"
   )
   public final void method40(class374 arg0, byte arg1) {
      int var3 = 121 / ((arg1 - -72) / 37);
      super.method40(arg0, (byte)-3);
   }

   @OriginalMember(
      owner = "client!we",
      name = "<init>",
      descriptor = "(Lvn;Ltga;III[B)V"
   )
   public class431(class332 arg0, class63 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class335.field4803, false, arg3 * arg4 * arg2);
      this.field6024 = arg3;
      this.field6021 = arg4;
      this.field6022 = arg2;
      this.field6023 = this.field8326.field4766.method3734(arg2, arg3, arg4, 1, 0, class332.method2641(21, this.field8328, arg1), 1);
      PixelBuffer var7 = this.field8326.field4747;
      int var8 = this.field6023.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class512.method3718(var8, 2005530519)) {
         int var9 = this.field8325.field693 * this.field6022;
         int var10 = this.field6024 * var9;
         int var11 = var7.getSlicePitch();
         if (var10 == var11) {
            var7.method3739(arg5, 0, 0, this.field6024 * this.field6021 * var9);
         } else {
            int var12 = var7.getRowPitch();
            if (~var9 == ~var12) {
               for(int var13 = 0; var13 < this.field6021; ++var13) {
                  var7.method3739(arg5, var10 * var13, var11 * var13, var10);
               }
            } else {
               for(int var14 = 0; ~this.field6021 < ~var14; ++var14) {
                  for(int var15 = 0; ~var15 > ~this.field6024; ++var15) {
                     var7.method3739(arg5, var10 * var14 - -(var9 * var15), var11 * var14 + var12 * var15, var9);
                  }
               }
            }
         }

         this.field6023.UnlockBox(0);
      }

   }
}
