import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class646 {
   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field9058;
   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field9059;
   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field9060;

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V"
   )
   public final void method4654(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
      this.field9059 = arg0;
      this.field9060 = arg1;
      if (arg2 == -98) {
         this.field9058 = this.field9060.method3738(0, 0);
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4655(int arg0) {
      if (arg0 != 0) {
         this.field9059 = (IDirect3DSurface)null;
      }

      if (this.field9058 != null) {
         this.field9058.method5123(-1928);
         this.field9058 = null;
      }

      if (this.field9059 != null) {
         this.field9059.method5123(-1928);
         this.field9059 = null;
      }

      if (this.field9060 != null) {
         this.field9060.method5123(-1928);
         this.field9060 = null;
      }

   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4656(byte arg0) {
      if (arg0 != -48) {
         this.field9059 = (IDirect3DSurface)null;
      }

      return this.field9060 != null;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method4657(byte arg0, int arg1) {
      return arg0 != 69 ? -43 : this.field9060.Present(arg1);
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V"
   )
   public class646(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method4654(arg1, arg0, (byte)-98);
   }
}
