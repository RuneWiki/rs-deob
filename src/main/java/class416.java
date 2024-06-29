import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class760;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class416 extends class717 implements class722 {
   @OriginalMember(
      owner = "client!kca",
      name = "h",
      descriptor = "I"
   )
   private int field5694;
   @OriginalMember(
      owner = "client!kca",
      name = "f",
      descriptor = "I"
   )
   private int field5697;
   @OriginalMember(
      owner = "client!kca",
      name = "g",
      descriptor = "I"
   )
   private int field5696;
   @OriginalMember(
      owner = "client!kca",
      name = "i",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field5695;

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(Lrj;B)V"
   )
   public final void method2868(class782 arg0, byte arg1) {
      super.method2868(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2873(byte arg0) {
      this.field10517.method1374((byte)89, this);
      if (arg0 != 2) {
         this.field5695 = (IDirect3DVolumeTexture)null;
      }

   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "(Lub;Ldja;III[B)V"
   )
   public class416(class165 arg0, class45 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class576.field8541, false, arg2 * arg3 * arg4);
      this.field5694 = arg4;
      this.field5697 = arg2;
      this.field5696 = arg3;
      this.field5695 = this.field10517.field2093.method5503(arg2, arg3, arg4, 1, 0, class165.method1366(arg1, this.field10516, -31143), 1);
      PixelBuffer var7 = this.field10517.field2094;
      int var8 = this.field5695.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class760.method5514(25060, var8)) {
         int var9 = this.field10515.field576 * this.field5697;
         int var10 = this.field5696 * var9;
         int var11 = var7.getSlicePitch();
         if (var10 == var11) {
            var7.method231(arg5, 0, 0, this.field5696 * var9 * this.field5694);
         } else {
            int var12 = var7.getRowPitch();
            if (~var9 == ~var12) {
               for(int var15 = 0; var15 < this.field5694; ++var15) {
                  var7.method231(arg5, var10 * var15, var11 * var15, var10);
               }
            } else {
               for(int var13 = 0; ~this.field5694 < ~var13; ++var13) {
                  for(int var14 = 0; this.field5696 > var14; ++var14) {
                     var7.method231(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                  }
               }
            }
         }

         this.field5695.UnlockBox(0);
      }

   }

   @OriginalMember(
      owner = "client!kca",
      name = "c",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method3244(byte arg0) {
      return arg0 != 5 ? (IDirect3DBaseTexture)null : this.field5695;
   }
}
