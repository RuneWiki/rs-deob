import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class84 extends class717 implements class568 {
   @OriginalMember(
      owner = "client!dha",
      name = "f",
      descriptor = "I"
   )
   private int field1386;
   @OriginalMember(
      owner = "client!dha",
      name = "g",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field1387;

   @OriginalMember(
      owner = "client!dha",
      name = "b",
      descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;",
      line = 4
   )
   public final IDirect3DBaseTexture method835(boolean arg0) {
      if (arg0) {
         this.field1387 = (IDirect3DCubeTexture)null;
      }

      return this.field1387;
   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(B)V",
      line = 16
   )
   public final void method461(byte arg0) {
      this.field10367.method2240(this, 0);
      if (arg0 != 89) {
         this.field1387 = (IDirect3DCubeTexture)null;
      }

   }

   @OriginalMember(
      owner = "client!dha",
      name = "a",
      descriptor = "(BLega;)V",
      line = 27
   )
   public final void method460(byte arg0, class738 arg1) {
      super.method460((byte)-39, arg1);
      if (arg0 > 0) {
         this.field1386 = 124;
      }

   }

   @OriginalMember(
      owner = "client!dha",
      name = "<init>",
      descriptor = "(Lvea;IZ[[I)V",
      line = 36
   )
   public class84(class287 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class296.field4146, class209.field3106, arg2 && arg0.field4033, arg1 * arg1 * 6);
      this.field1386 = arg1;
      if (!this.field10364) {
         this.field1387 = this.field10367.field4018.method3818(this.field1386, 1, 0, 21, 1);
      } else {
         this.field1387 = this.field10367.field4018.method3818(this.field1386, 0, 1024, 21, 1);
      }

      PixelBuffer var5 = this.field10367.field4017;

      for(int var6 = 0; -7 < ~var6; ++var6) {
         int var7 = this.field1387.LockRect(var6, 0, 0, 0, this.field1386, this.field1386, 0, var5);
         if (class507.method3795(var7, -123)) {
            int var8 = var5.getRowPitch();
            if (~(this.field1386 * 4) != ~var8) {
               for(int var9 = 0; ~this.field1386 < ~var9; ++var9) {
                  var5.method3823(arg3[var6], this.field1386 * var9, var8 * var9, this.field1386);
               }
            } else {
               var5.method3823(arg3[var6], 0, 0, this.field1386 * this.field1386);
            }

            this.field1387.UnlockRect(var6, 0);
         }
      }

   }
}
