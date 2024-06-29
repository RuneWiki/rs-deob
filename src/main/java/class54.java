import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class54 extends class598 implements class142 {
   @OriginalMember(
      owner = "client!wba",
      name = "g",
      descriptor = "I"
   )
   private int field586;
   @OriginalMember(
      owner = "client!wba",
      name = "f",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field587;

   @OriginalMember(
      owner = "client!wba",
      name = "<init>",
      descriptor = "(Lvn;IZ[[I)V"
   )
   public class54(class332 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class622.field8682, class335.field4803, arg2 && arg0.field4760, arg1 * 6 * arg1);
      this.field586 = arg1;
      if (this.field8327) {
         this.field587 = this.field8326.field4766.method3724(this.field586, 0, 1024, 21, 1);
      } else {
         this.field587 = this.field8326.field4766.method3724(this.field586, 1, 0, 21, 1);
      }

      PixelBuffer var5 = this.field8326.field4747;

      for(int var6 = 0; -7 < ~var6; ++var6) {
         int var7 = this.field587.LockRect(var6, 0, 0, 0, this.field586, this.field586, 0, var5);
         if (class512.method3718(var7, 2005530519)) {
            int var8 = var5.getRowPitch();
            if (~(this.field586 * 4) == ~var8) {
               var5.method3742(arg3[var6], 0, 0, this.field586 * this.field586);
            } else {
               for(int var9 = 0; this.field586 > var9; ++var9) {
                  var5.method3742(arg3[var6], this.field586 * var9, var8 * var9, this.field586);
               }
            }

            this.field587.UnlockRect(var6, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(Lrb;B)V"
   )
   public final void method40(class374 arg0, byte arg1) {
      int var3 = -67 % ((arg1 - -72) / 37);
      super.method40(arg0, (byte)24);
   }

   @OriginalMember(
      owner = "client!wba",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method41(int arg0) {
      this.field8326.method2642(false, this);
      if (arg0 != -26708) {
         this.method43((byte)110);
      }

   }

   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method43(byte arg0) {
      if (arg0 <= 10) {
         this.field586 = -123;
      }

      return this.field587;
   }
}
