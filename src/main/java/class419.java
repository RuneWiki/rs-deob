import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class419 {
   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field6398;
   @OriginalMember(
      owner = "client!tb",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field6399;
   @OriginalMember(
      owner = "client!tb",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field6400;

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method3200(int arg0, byte arg1) {
      int var3 = 40 % ((arg1 - 63) / 47);
      return this.field6400.Present(arg0);
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3201(int arg0) {
      if (arg0 != -6143) {
         this.method3203((byte)-70);
      }

      if (this.field6398 != null) {
         this.field6398.method5106(true);
         this.field6398 = null;
      }

      if (this.field6399 != null) {
         this.field6399.method5106(true);
         this.field6399 = null;
      }

      if (this.field6400 != null) {
         this.field6400.method5106(true);
         this.field6400 = null;
      }

   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(ILjagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;)V"
   )
   public final void method3202(int arg0, IDirect3DSurface arg1, IDirect3DSwapChain arg2) {
      this.field6400 = arg2;
      this.field6399 = arg1;
      this.field6398 = this.field6400.method3791(arg0, 0);
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3203(byte arg0) {
      if (arg0 >= -123) {
         this.field6398 = (IDirect3DSurface)null;
      }

      return this.field6400 != null;
   }

   @OriginalMember(
      owner = "client!tb",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V"
   )
   public class419(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method3202(0, arg1, arg0);
   }
}
