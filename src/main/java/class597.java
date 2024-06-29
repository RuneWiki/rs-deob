import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class71;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class597 extends class567 implements class496 {
   @OriginalMember(
      owner = "client!us",
      name = "g",
      descriptor = "I"
   )
   private int field8766;
   @OriginalMember(
      owner = "client!us",
      name = "f",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field8765;

   @OriginalMember(
      owner = "client!us",
      name = "<init>",
      descriptor = "(Leb;IZ[[I)V"
   )
   public class597(class163 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class364.field5628, class650.field9371, arg2 && arg0.field2430, arg1 * 6 * arg1);
      this.field8766 = arg1;
      if (!this.field8404) {
         this.field8765 = this.field8407.field2447.method566(this.field8766, 1, 0, 21, 1);
      } else {
         this.field8765 = this.field8407.field2447.method566(this.field8766, 0, 1024, 21, 1);
      }

      PixelBuffer var5 = this.field8407.field2428;

      for(int var6 = 0; -7 < ~var6; ++var6) {
         int var7 = this.field8765.LockRect(var6, 0, 0, 0, this.field8766, this.field8766, 0, var5);
         if (class71.method550(var7, (byte)-80)) {
            int var8 = var5.getRowPitch();
            if (this.field8766 * 4 == var8) {
               var5.method560(arg3[var6], 0, 0, this.field8766 * this.field8766);
            } else {
               for(int var9 = 0; this.field8766 > var9; ++var9) {
                  var5.method560(arg3[var6], this.field8766 * var9, var8 * var9, this.field8766);
               }
            }

            this.field8765.UnlockRect(var6, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "a",
      descriptor = "(ILpi;)V"
   )
   public final void method216(int arg0, class427 arg1) {
      if (arg0 < 125) {
         this.field8766 = 26;
      }

      super.method216(127, arg1);
   }

   @OriginalMember(
      owner = "client!us",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method214(int arg0) {
      this.field8407.method1466(this, (byte)-114);
      if (arg0 < 44) {
         this.field8766 = 103;
      }

   }

   @OriginalMember(
      owner = "client!us",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method215(byte arg0) {
      int var2 = -1 % ((49 - arg0) / 50);
      return this.field8765;
   }
}
