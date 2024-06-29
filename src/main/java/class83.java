import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class83 {
   @OriginalMember(
      owner = "client!qw",
      name = "c",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field1384;
   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "Ljagdx/IDirect3DSurface;"
   )
   private IDirect3DSurface field1385;
   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "Ljagdx/IDirect3DSwapChain;"
   )
   private IDirect3DSwapChain field1383;

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public final void method831(int arg0) {
      if (arg0 != 0) {
         this.method834((byte)-40, 113);
      }

      if (this.field1384 != null) {
         this.field1384.method5108((byte)7);
         this.field1384 = null;
      }

      if (this.field1385 != null) {
         this.field1385.method5108((byte)7);
         this.field1385 = null;
      }

      if (this.field1383 != null) {
         this.field1383.method5108((byte)7);
         this.field1383 = null;
      }

   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(B)Z",
      line = 33
   )
   public final boolean method832(byte arg0) {
      if (arg0 != 21) {
         this.field1385 = (IDirect3DSurface)null;
      }

      return this.field1383 != null;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(Ljagdx/IDirect3DSwapChain;Ljagdx/IDirect3DSurface;)V",
      line = 43
   )
   public class83(IDirect3DSwapChain arg0, IDirect3DSurface arg1) {
      this.method833(arg1, arg0, (byte)75);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(Ljagdx/IDirect3DSurface;Ljagdx/IDirect3DSwapChain;B)V",
      line = 52
   )
   public final void method833(IDirect3DSurface arg0, IDirect3DSwapChain arg1, byte arg2) {
      this.field1383 = arg1;
      this.field1385 = arg0;
      if (arg2 != 75) {
         this.field1384 = (IDirect3DSurface)null;
      }

      this.field1384 = this.field1383.method3820(0, 0);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(BI)I",
      line = 64
   )
   public final int method834(byte arg0, int arg1) {
      if (arg0 <= 40) {
         this.method834((byte)-121, 26);
      }

      return this.field1383.Present(arg1);
   }
}
