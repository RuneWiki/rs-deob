import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class624 extends class676 implements class293 {
   @OriginalMember(
      owner = "client!gp",
      name = "f",
      descriptor = "I"
   )
   private int field8918;
   @OriginalMember(
      owner = "client!gp",
      name = "g",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field8917;

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(Lmb;B)V"
   )
   public final void method1075(class359 arg0, byte arg1) {
      super.method1075(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!gp",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1071(boolean arg0) {
      this.field9460.method1275(this, 8679);
      if (!arg0) {
         this.field8918 = -101;
      }

   }

   @OriginalMember(
      owner = "client!gp",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method4596(byte arg0) {
      int var2 = -1 % ((40 - arg0) / 42);
      return this.field8917;
   }

   @OriginalMember(
      owner = "client!gp",
      name = "<init>",
      descriptor = "(Lmv;IZ[[I)V"
   )
   public class624(class125 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class31.field438, class779.field11371, arg2 && arg0.field2000, arg1 * 6 * arg1);
      this.field8918 = arg1;
      if (!this.field9464) {
         this.field8917 = this.field9460.field2013.method3130(this.field8918, 1, 0, 21, 1);
      } else {
         this.field8917 = this.field9460.field2013.method3130(this.field8918, 0, 1024, 21, 1);
      }

      PixelBuffer var5 = this.field9460.field2017;

      for(int var6 = 0; 6 > var6; ++var6) {
         int var7 = this.field8917.LockRect(var6, 0, 0, 0, this.field8918, this.field8918, 0, var5);
         if (class402.method3144(-2005530595, var7)) {
            int var8 = var5.getRowPitch();
            if (this.field8918 * 4 != var8) {
               for(int var9 = 0; ~this.field8918 < ~var9; ++var9) {
                  var5.method3136(arg3[var6], this.field8918 * var9, var8 * var9, this.field8918);
               }
            } else {
               var5.method3136(arg3[var6], 0, 0, this.field8918 * this.field8918);
            }

            this.field8917.UnlockRect(var6, 0);
         }
      }

   }
}
