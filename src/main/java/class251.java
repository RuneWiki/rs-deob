import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class251 {
   @OriginalMember(
      owner = "client!fm",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field3803;
   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field3805;
   @OriginalMember(
      owner = "client!fm",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field3804;

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(II)I",
      line = 5
   )
   public final int method2126(int arg0, int arg1) {
      int var3 = -16 % ((26 - arg0) / 61);
      return this.field3804.Present(arg1);
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(I)Z",
      line = 14
   )
   public final boolean method2127(int arg0) {
      if (arg0 >= -68) {
         return true;
      } else {
         return this.field3804 != null;
      }
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DSurface;ILjagdx/IDirect3DSwapChain;)V",
      line = 25
   )
   public final void method2128(IDirect3DSurface arg0, int arg1, IDirect3DSwapChain arg2) {
      this.field3804 = arg2;
      this.field3803 = arg0;
      if (arg1 != 13384) {
         this.field3805 = (IDirect3DSurface)null;
      }

      this.field3805 = this.field3804.method558(0, 0);
   }

   @OriginalMember(
      owner = "client!fm",
      name = "a",
      descriptor = "(B)V",
      line = 38
   )
   public final void method2129(byte arg0) {
      if (this.field3805 != null) {
         this.field3805.method5223(-18900);
         this.field3805 = null;
      }

      if (this.field3803 != null) {
         this.field3803.method5223(arg0 + -18896);
         this.field3803 = null;
      }

      if (arg0 != -4) {
         this.method2129((byte)126);
      }

      if (this.field3804 != null) {
         this.field3804.method5223(-18900);
         this.field3804 = null;
      }

   }

   @OriginalMember(
      owner = "client!fm",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V",
      line = 65
   )
   public class251(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method2128(arg1, 13384, arg0);
   }
}
