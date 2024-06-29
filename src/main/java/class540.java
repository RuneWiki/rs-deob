import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class760;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class540 extends class717 implements class531 {
   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "I"
   )
   private int field7899;
   @OriginalMember(
      owner = "client!mo",
      name = "f",
      descriptor = "Ljagdx/IDirect3DCubeTexture;"
   )
   private IDirect3DCubeTexture field7898;

   @OriginalMember(
      owner = "client!mo",
      name = "<init>",
      descriptor = "(Lub;IZ[[I)V"
   )
   public class540(class165 arg0, int arg1, boolean arg2, int[][] arg3) {
      super(arg0, class606.field8967, class576.field8541, arg2 && arg0.field2113, arg1 * arg1 * 6);
      this.field7899 = arg1;
      if (this.field10519) {
         this.field7898 = this.field10517.field2093.method5507(this.field7899, 0, 1024, 21, 1);
      } else {
         this.field7898 = this.field10517.field2093.method5507(this.field7899, 1, 0, 21, 1);
      }

      PixelBuffer var5 = this.field10517.field2094;

      for(int var6 = 0; 6 > var6; ++var6) {
         int var7 = this.field7898.LockRect(var6, 0, 0, 0, this.field7899, this.field7899, 0, var5);
         if (class760.method5514(25060, var7)) {
            int var8 = var5.getRowPitch();
            if (this.field7899 * 4 != var8) {
               for(int var9 = 0; ~var9 > ~this.field7899; ++var9) {
                  var5.method5487(arg3[var6], this.field7899 * var9, var8 * var9, this.field7899);
               }
            } else {
               var5.method5487(arg3[var6], 0, 0, this.field7899 * this.field7899);
            }

            this.field7898.UnlockRect(var6, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2873(byte arg0) {
      if (arg0 != 2) {
         this.method2868((class782)null, (byte)65);
      }

      this.field10517.method1405(false, this);
   }

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method3244(byte arg0) {
      if (arg0 != 5) {
         this.method2873((byte)-38);
      }

      return this.field7898;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(Lrj;B)V"
   )
   public final void method2868(class782 arg0, byte arg1) {
      super.method2868(arg0, arg1);
   }
}
