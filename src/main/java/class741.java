import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class741 {
   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field10563;
   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field10565;
   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field10564;

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method5347(boolean arg0) {
      if (arg0) {
         this.method5349((IDirect3DSurface)null, (byte)-120, (IDirect3DSwapChain)null);
      }

      if (this.field10563 != null) {
         this.field10563.method3157(100);
         this.field10563 = null;
      }

      if (this.field10565 != null) {
         this.field10565.method3157(112);
         this.field10565 = null;
      }

      if (this.field10564 != null) {
         this.field10564.method3157(-111);
         this.field10564 = null;
      }

   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method5348(boolean arg0) {
      if (!arg0) {
         return false;
      } else {
         return this.field10564 != null;
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DSurface;BLjagdx/IDirect3DSwapChain;)V"
   )
   public final void method5349(IDirect3DSurface arg0, byte arg1, IDirect3DSwapChain arg2) {
      this.field10564 = arg2;
      this.field10565 = arg0;
      if (arg1 > -66) {
         this.field10565 = (IDirect3DSurface)null;
      }

      this.field10563 = this.field10564.method3143(0, 0);
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V"
   )
   public class741(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method5349(arg1, (byte)-75, arg0);
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method5350(byte arg0, int arg1) {
      if (arg0 >= -90) {
         this.method5350((byte)27, 111);
      }

      return this.field10564.Present(arg1);
   }
}
