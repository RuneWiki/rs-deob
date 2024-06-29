import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class508;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class615 extends class422 implements class13 {
   @OriginalMember(
      owner = "client!ot",
      name = "f",
      descriptor = "I"
   )
   private int field8993;
   @OriginalMember(
      owner = "client!ot",
      name = "h",
      descriptor = "I"
   )
   private int field8995;
   @OriginalMember(
      owner = "client!ot",
      name = "g",
      descriptor = "I"
   )
   private int field8992;
   @OriginalMember(
      owner = "client!ot",
      name = "i",
      descriptor = "Ljagdx/IDirect3DVolumeTexture;"
   )
   private IDirect3DVolumeTexture field8994;

   @OriginalMember(
      owner = "client!ot",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method1915(int arg0) {
      this.field6415.method4290((byte)-23, this);
      if (arg0 >= -63) {
         this.field8994 = (IDirect3DVolumeTexture)null;
      }

   }

   @OriginalMember(
      owner = "client!ot",
      name = "e",
      descriptor = "(I)Ljagdx/IDirect3DBaseTexture;"
   )
   public final IDirect3DBaseTexture method2911(int arg0) {
      if (arg0 != 10183) {
         this.method1914(-18, (class176)null);
      }

      return this.field8994;
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(ILuh;)V"
   )
   public final void method1914(int arg0, class176 arg1) {
      super.method1914(arg0 + 0, arg1);
      if (arg0 != -15226) {
         this.method1915(-63);
      }

   }

   @OriginalMember(
      owner = "client!ot",
      name = "<init>",
      descriptor = "(Lfi;Lii;III[B)V"
   )
   public class615(class582 arg0, class579 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, arg1, class513.field7519, false, arg2 * arg3 * arg4);
      this.field8993 = arg2;
      this.field8995 = arg3;
      this.field8992 = arg4;
      this.field8994 = this.field6415.field8614.method3786(arg2, arg3, arg4, 1, 0, class582.method4287(false, this.field6414, arg1), 1);
      PixelBuffer var7 = this.field6415.field8628;
      int var8 = this.field8994.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
      if (class508.method3766(var8, (byte)-44)) {
         int var9 = this.field6413.field8583 * this.field8993;
         int var10 = this.field8995 * var9;
         int var11 = var7.getSlicePitch();
         if (~var10 == ~var11) {
            var7.method3792(arg5, 0, 0, this.field8995 * var9 * this.field8992);
         } else {
            int var12 = var7.getRowPitch();
            if (~var9 == ~var12) {
               for(int var15 = 0; ~var15 > ~this.field8992; ++var15) {
                  var7.method3792(arg5, var10 * var15, var11 * var15, var10);
               }
            } else {
               for(int var13 = 0; this.field8992 > var13; ++var13) {
                  for(int var14 = 0; ~this.field8995 < ~var14; ++var14) {
                     var7.method3792(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                  }
               }
            }
         }

         this.field8994.UnlockBox(0);
      }

   }
}
