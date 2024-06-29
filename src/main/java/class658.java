import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class658 extends class676 implements class145 {
   @OriginalMember(
      owner = "client!nc",
      name = "h",
      descriptor = "I"
   )
   private int field9298;
   @OriginalMember(
      owner = "client!nc",
      name = "i",
      descriptor = "I"
   )
   private int field9295;
   @OriginalMember(
      owner = "client!nc",
      name = "g",
      descriptor = "I"
   )
   private int field9297;
   @OriginalMember(
      owner = "client!nc",
      name = "f",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field9296;

   @OriginalMember(
      owner = "client!nc",
      name = "<init>",
      descriptor = "(Lmv;Lsr;III[B)V"
   )
   public class658(class125 arg0, class78 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class779.field11371, false, arg2 * arg3 * arg4);
      this.field9298 = arg4;
      this.field9295 = arg2;
      this.field9297 = arg3;
      this.field9296 = this.field9460.field2013.method3126(arg2, arg3, arg4, 1, 0, class125.method1277((byte)46, this.field9463, arg1), 1);
      PixelBuffer var7 = this.field9460.field2017;
      int var8 = this.field9296.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class402.method3144(-2005530595, var8)) {
         int var9 = this.field9462.field1242 * this.field9295;
         int var10 = this.field9297 * var9;
         int var11 = var7.getSlicePitch();
         if (~var10 == ~var11) {
            var7.method3134(arg5, 0, 0, this.field9297 * var9 * this.field9298);
         } else {
            int var12 = var7.getRowPitch();
            if (~var9 == ~var12) {
               for(int var15 = 0; ~var15 > ~this.field9298; ++var15) {
                  var7.method3134(arg5, var10 * var15, var11 * var15, var10);
               }
            } else {
               for(int var13 = 0; ~this.field9298 < ~var13; ++var13) {
                  for(int var14 = 0; ~var14 > ~this.field9297; ++var14) {
                     var7.method3134(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                  }
               }
            }
         }

         this.field9296.UnlockBox(0);
      }

   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(Lmb;B)V"
   )
   public final void method1075(class359 arg0, byte arg1) {
      super.method1075(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method1071(boolean arg0) {
      this.field9460.method1280(arg0, this);
   }

   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method4596(byte arg0) {
      int var2 = 51 % ((arg0 - 40) / 42);
      return this.field9296;
   }
}
