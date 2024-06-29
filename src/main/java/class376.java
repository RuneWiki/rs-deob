import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class376 extends class422 implements class223 {
   @OriginalMember(
      owner = "client!ws",
      name = "f",
      descriptor = "I"
   )
   private int field5708;
   @OriginalMember(
      owner = "client!ws",
      name = "g",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field5707;

   @OriginalMember(
      owner = "client!ws",
      name = "d",
      descriptor = "(I)V",
      line = 6
   )
   public final void method1915(int arg0) {
      if (arg0 > -63) {
         this.method2911(-22);
      }

      this.field6415.method4293((byte)58, this);
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(ILuh;)V",
      line = 17
   )
   public final void method1914(int arg0, class176 arg1) {
      super.method1914(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "(Lfi;IZ[[I)V",
      line = 23
   )
   public class376(class582 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class75.field963, class513.field7519, arg2 && arg0.field8620, arg1 * 6 * arg1);
      this.field5708 = arg1;
      if (this.field6416) {
         this.field5707 = this.field6415.field8614.method3775(this.field5708, 0, 1024, 21, 1);
      } else {
         this.field5707 = this.field6415.field8614.method3775(this.field5708, 1, 0, 21, 1);
      }

      PixelBuffer var5 = this.field6415.field8628;

      for(int var6 = 0; var6 < 6; ++var6) {
         int var7 = this.field5707.LockRect(var6, 0, 0, 0, this.field5708, this.field5708, 0, var5);
         if (class508.method3766(var7, (byte)-44)) {
            int var8 = var5.getRowPitch();
            if (~(this.field5708 * 4) != ~var8) {
               for(int var9 = 0; ~var9 > ~this.field5708; ++var9) {
                  var5.method3794(arg3[var6], this.field5708 * var9, var8 * var9, this.field5708);
               }
            } else {
               var5.method3794(arg3[var6], 0, 0, this.field5708 * this.field5708);
            }

            this.field5707.UnlockRect(var6, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!ws",
      name = "e",
      descriptor = "(I)Ljagdx/IDirect3DBaseTexture;",
      line = 76
   )
   public final IDirect3DBaseTexture method2911(int arg0) {
      return arg0 != 10183 ? (IDirect3DBaseTexture)null : this.field5707;
   }
}
