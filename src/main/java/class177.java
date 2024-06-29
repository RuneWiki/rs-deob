import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class177 extends class309 implements class297 {
   @OriginalMember(
      owner = "client!dfa",
      name = "i",
      descriptor = "I"
   )
   private int field2453;
   @OriginalMember(
      owner = "client!dfa",
      name = "f",
      descriptor = "I"
   )
   private int field2452;
   @OriginalMember(
      owner = "client!dfa",
      name = "h",
      descriptor = "I"
   )
   private int field2451;
   @OriginalMember(
      owner = "client!dfa",
      name = "g",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field2454;

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public final void method1423(int arg0) {
      this.field4250.method2595(this, 1);
      if (arg0 != 3038) {
         this.field2453 = 63;
      }

   }

   @OriginalMember(
      owner = "client!dfa",
      name = "<init>",
      descriptor = "(Lbb;Lak;III[B)V",
      line = 18
   )
   public class177(class353 arg0, class371 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class301.field4117, false, arg3 * arg4 * arg2);
      this.field2453 = arg2;
      this.field2452 = arg4;
      this.field2451 = arg3;
      this.field2454 = this.field4250.field4742.method3713(arg2, arg3, arg4, 1, 0, class353.method2608(arg1, (byte)51, this.field4252), 1);
      PixelBuffer var7 = this.field4250.field4763;
      int var8 = this.field2454.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class512.method3730((byte)120, var8)) {
         int var9 = this.field4253.field5392 * this.field2453;
         int var10 = this.field2451 * var9;
         int var11 = var7.getSlicePitch();
         if (~var10 == ~var11) {
            var7.method3733(arg5, 0, 0, this.field2452 * this.field2451 * var9);
         } else {
            int var12 = var7.getRowPitch();
            if (var9 == var12) {
               for(int var13 = 0; ~this.field2452 < ~var13; ++var13) {
                  var7.method3733(arg5, var10 * var13, var11 * var13, var10);
               }
            } else {
               for(int var14 = 0; ~this.field2452 < ~var14; ++var14) {
                  for(int var15 = 0; ~var15 > ~this.field2451; ++var15) {
                     var7.method3733(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                  }
               }
            }
         }

         this.field2454.UnlockBox(0);
      }

   }

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "(B)Ljagdx/IDirect3DBaseTexture;",
      line = 89
   )
   public final IDirect3DBaseTexture method1424(byte arg0) {
      return arg0 != -89 ? (IDirect3DBaseTexture)null : this.field2454;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(ILgj;)V",
      line = 101
   )
   public final void method1425(int arg0, class663 arg1) {
      super.method1425(-128, arg1);
      if (arg0 > -116) {
         this.method1423(-106);
      }

   }
}
