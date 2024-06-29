import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class315 extends class309 implements class349 {
   @OriginalMember(
      owner = "client!gaa",
      name = "f",
      descriptor = "I"
   )
   private int field4298;
   @OriginalMember(
      owner = "client!gaa",
      name = "g",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field4297;

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(ILgj;)V",
      line = 7
   )
   public final void method1425(int arg0, class663 arg1) {
      super.method1425(-123, arg1);
      if (arg0 >= -116) {
         this.field4298 = 58;
      }

   }

   @OriginalMember(
      owner = "client!gaa",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;",
      line = 17
   )
   public final IDirect3DBaseTexture method1424(byte arg0) {
      if (arg0 != -89) {
         this.field4297 = (IDirect3DCubeTexture)null;
      }

      return this.field4297;
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(I)V",
      line = 28
   )
   public final void method1423(int arg0) {
      if (arg0 != 3038) {
         this.method1424((byte)-51);
      }

      this.field4250.method2616((byte)-102, this);
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "<init>",
      descriptor = "(Lbb;IZ[[I)V",
      line = 38
   )
   public class315(class353 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class424.field6036, class301.field4117, arg2 && arg0.field4737, arg1 * arg1 * 6);
      this.field4298 = arg1;
      if (this.field4251) {
         this.field4297 = this.field4250.field4742.method3726(this.field4298, 0, 1024, 21, 1);
      } else {
         this.field4297 = this.field4250.field4742.method3726(this.field4298, 1, 0, 21, 1);
      }

      PixelBuffer var5 = this.field4250.field4763;

      for(int var6 = 0; 6 > var6; ++var6) {
         int var7 = this.field4297.LockRect(var6, 0, 0, 0, this.field4298, this.field4298, 0, var5);
         if (class512.method3730((byte)-41, var7)) {
            int var8 = var5.getRowPitch();
            if (this.field4298 * 4 == var8) {
               var5.method3735(arg3[var6], 0, 0, this.field4298 * this.field4298);
            } else {
               for(int var9 = 0; this.field4298 > var9; ++var9) {
                  var5.method3735(arg3[var6], this.field4298 * var9, var8 * var9, this.field4298);
               }
            }

            this.field4297.UnlockRect(var6, 0);
         }
      }

   }
}
