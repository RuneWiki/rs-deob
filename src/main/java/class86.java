import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class86 extends class717 implements class425 {
   @OriginalMember(
      owner = "client!kl",
      name = "i",
      descriptor = "I"
   )
   private int field1422;
   @OriginalMember(
      owner = "client!kl",
      name = "h",
      descriptor = "I"
   )
   private int field1424;
   @OriginalMember(
      owner = "client!kl",
      name = "g",
      descriptor = "I"
   )
   private int field1421;
   @OriginalMember(
      owner = "client!kl",
      name = "f",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field1423;

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public final void method461(byte arg0) {
      this.field10367.method2233((byte)36, this);
      if (arg0 != 89) {
         this.method461((byte)-40);
      }

   }

   @OriginalMember(
      owner = "client!kl",
      name = "a",
      descriptor = "(BLega;)V",
      line = 17
   )
   public final void method460(byte arg0, class738 arg1) {
      if (arg0 >= 0) {
         this.method460((byte)-25, (class738)null);
      }

      super.method460((byte)-109, arg1);
   }

   @OriginalMember(
      owner = "client!kl",
      name = "<init>",
      descriptor = "(Lvea;Ltv;III[B)V",
      line = 26
   )
   public class86(class287 arg0, class584 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class209.field3106, false, arg2 * arg3 * arg4);
      this.field1422 = arg4;
      this.field1424 = arg2;
      this.field1421 = arg3;
      this.field1423 = this.field10367.field4018.method3807(arg2, arg3, arg4, 1, 0, class287.method2229(631, this.field10365, arg1), 1);
      PixelBuffer var7 = this.field10367.field4017;
      int var8 = this.field1423.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class507.method3795(var8, -41)) {
         int var9 = this.field10368.field8449 * this.field1424;
         int var10 = this.field1421 * var9;
         int var11 = var7.getSlicePitch();
         if (var10 == var11) {
            var7.method3821(arg5, 0, 0, this.field1421 * var9 * this.field1422);
         } else {
            int var12 = var7.getRowPitch();
            if (var9 == var12) {
               for(int var13 = 0; this.field1422 > var13; ++var13) {
                  var7.method3821(arg5, var10 * var13, var11 * var13, var10);
               }
            } else {
               for(int var14 = 0; var14 < this.field1422; ++var14) {
                  for(int var15 = 0; this.field1421 > var15; ++var15) {
                     var7.method3821(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                  }
               }
            }
         }

         this.field1423.UnlockBox(0);
      }

   }

   @OriginalMember(
      owner = "client!kl",
      name = "b",
      descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;",
      line = 97
   )
   public final IDirect3DBaseTexture method835(boolean arg0) {
      return arg0 ? (IDirect3DBaseTexture)null : this.field1423;
   }
}
