import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class662 {
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field9822;
   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field9823;
   @OriginalMember(
      owner = "client!pa",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field9821;

   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4839(int arg0) {
      if (this.field9823 != null) {
         this.field9823.method2971((byte)123);
         this.field9823 = null;
      }

      if (this.field9822 != null) {
         this.field9822.method2971((byte)-67);
         this.field9822 = null;
      }

      if (this.field9821 != null) {
         this.field9821.method2971((byte)-105);
         this.field9821 = null;
      }

      int var2 = -120 / ((47 - arg0) / 44);
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4840(int arg0) {
      if (arg0 < 74) {
         this.method4840(107);
      }

      return this.field9821 != null;
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method4841(int arg0, int arg1) {
      return arg0 != 0 ? 107 : this.field9821.Present(arg1);
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DSwapChain;ILjagdx/IDirect3DSurface;)V"
   )
   public final void method4842(IDirect3DSwapChain arg0, int arg1, IDirect3DSurface arg2) {
      this.field9822 = arg2;
      this.field9821 = arg0;
      if (arg1 < 121) {
         this.method4840(98);
      }

      this.field9823 = this.field9821.method5488(0, 0);
   }

   @OriginalMember(
      owner = "client!pa",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V"
   )
   public class662(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method4842(arg0, 122, arg1);
   }
}
