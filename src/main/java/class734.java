import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class734 {
   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field10735;
   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field10736;
   @OriginalMember(
      owner = "client!dd",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field10734;

   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "(I)V",
      line = 4
   )
   public final void method5338(int arg0) {
      if (this.field10736 != null) {
         this.field10736.method5120(9575);
         this.field10736 = null;
      }

      if (this.field10735 != null) {
         this.field10735.method5120(9575);
         this.field10735 = null;
      }

      if (arg0 >= 11) {
         if (this.field10734 != null) {
            this.field10734.method5120(9575);
            this.field10734 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(II)I",
      line = 34
   )
   public final int method5339(int arg0, int arg1) {
      return arg1 != -25046 ? -54 : this.field10734.Present(arg0);
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(I)Z",
      line = 44
   )
   public final boolean method5340(int arg0) {
      if (arg0 < 118) {
         this.field10735 = (IDirect3DSurface)null;
      }

      return this.field10734 != null;
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(BLjagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V",
      line = 54
   )
   public final void method5341(byte arg0, IDirect3DSwapChain arg1, IDirect3DSurface arg2) {
      this.field10735 = arg2;
      this.field10734 = arg1;
      if (arg0 != -10) {
         this.field10734 = (IDirect3DSwapChain)null;
      }

      this.field10736 = this.field10734.method3732(0, 0);
   }

   @OriginalMember(
      owner = "client!dd",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V",
      line = 64
   )
   public class734(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method5341((byte)-10, arg0, arg1);
   }
}
