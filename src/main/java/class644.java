import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class512;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class644 implements class499 {
   @OriginalMember(
      owner = "client!te",
      name = "g",
      descriptor = "Z"
   )
   private boolean field9042 = false;
   @OriginalMember(
      owner = "client!te",
      name = "d",
      descriptor = "Lvn;"
   )
   private class332 field9036;
   @OriginalMember(
      owner = "client!te",
      name = "f",
      descriptor = "Z"
   )
   private boolean field9040;
   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "B"
   )
   private byte field9039;
   @OriginalMember(
      owner = "client!te",
      name = "e",
      descriptor = "I"
   )
   private int field9037;
   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "I"
   )
   private int field9038;
   @OriginalMember(
      owner = "client!te",
      name = "c",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field9041;

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method788(byte arg0) {
      if (this.field9041 != null) {
         this.field9041.method5123(-1928);
         this.field9041 = null;
      }

      this.field9038 = 0;
      if (arg0 < 21) {
         this.method787((byte)-80);
      }

      this.field9037 = 0;
   }

   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method787(byte arg0) {
      if (arg0 != 108) {
         this.field9036 = (class332)null;
      }

      if (this.field9042 && class512.method3718(this.field9041.Unlock(), arg0 + 2005530411)) {
         this.field9042 = false;
         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method4646(boolean arg0) {
      return arg0 ? 81 : this.field9039;
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method789(int arg0, int arg1, int arg2) {
      this.field9038 = arg1;
      this.field9039 = (byte)arg2;
      if (arg0 != -6222) {
         this.method788((byte)-28);
      }

      if (~this.field9038 < ~this.field9037) {
         int var4 = 8;
         byte var5;
         if (this.field9040) {
            var5 = 0;
            var4 |= 512;
         } else {
            var5 = 1;
         }

         if (this.field9041 != null) {
            this.field9041.method5123(arg0 + 4294);
         }

         this.field9041 = this.field9036.field4766.method3725(this.field9038, var4, 0, var5, this.field9041);
         this.field9037 = this.field9038;
      }

      return this.field9041 != null;
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method794(int arg0) {
      return arg0 != 1143968105 ? 119 : this.field9038;
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method786(int arg0, boolean arg1) {
      if (this.field9041 == null) {
         return null;
      } else {
         if (arg0 != -9609) {
            this.field9040 = true;
         }

         boolean var3 = arg1 & this.field9040;
         if (!this.field9042 && class512.method3718(this.field9041.Lock(0, this.field9037, var3 ? 8192 : 0, this.field9036.field4758), 2005530519)) {
            this.field9042 = true;
            return this.field9036.field4758;
         } else {
            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IZILjaclib/memory/Source;)Z"
   )
   public final boolean method792(int arg0, boolean arg1, int arg2, Source arg3) {
      if (!this.method789(-6222, arg2, arg0)) {
         if (arg1) {
            this.method788((byte)42);
         }

         return false;
      } else {
         return this.field9041.method3743(arg3, 0, 0, this.field9038, this.field9040 ? 8192 : 0);
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "<init>",
      descriptor = "(Lvn;Z)V"
   )
   public class644(class332 arg0, boolean arg1) {
      this.field9036 = arg0;
      this.field9040 = arg1;
   }
}
