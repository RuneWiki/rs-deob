import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class134 implements class102 {
   @OriginalMember(
      owner = "client!gm",
      name = "f",
      descriptor = "Z"
   )
   private boolean field2209 = false;
   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "Lvea;"
   )
   private class287 field2211;
   @OriginalMember(
      owner = "client!gm",
      name = "d",
      descriptor = "Z"
   )
   private boolean field2208;
   @OriginalMember(
      owner = "client!gm",
      name = "g",
      descriptor = "B"
   )
   private byte field2212;
   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "I"
   )
   private int field2210;
   @OriginalMember(
      owner = "client!gm",
      name = "c",
      descriptor = "I"
   )
   private int field2213;
   @OriginalMember(
      owner = "client!gm",
      name = "e",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field2207;

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(IIZLjaclib/memory/Source;)Z",
      line = 4
   )
   public final boolean method573(int arg0, int arg1, boolean arg2, Source arg3) {
      if (this.method568(22407, arg1, arg0)) {
         return this.field2207.method3825(arg3, 0, 0, this.field2213, !this.field2208 ? 0 : 8192);
      } else {
         if (arg2) {
            this.field2211 = (class287)null;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;",
      line = 19
   )
   public final Buffer method567(boolean arg0, byte arg1) {
      if (this.field2207 != null) {
         boolean var3 = arg0 & this.field2208;
         if (!this.field2209 && class507.method3795(this.field2207.Lock(0, this.field2210, var3 ? 8192 : 0, this.field2211.field4013), -105)) {
            this.field2209 = true;
            return this.field2211.field4013;
         } else {
            if (arg1 != 49) {
               this.method574(-123);
            }

            return null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(I)I",
      line = 44
   )
   public final int method570(int arg0) {
      return arg0 != 1 ? 14 : this.field2213;
   }

   @OriginalMember(
      owner = "client!gm",
      name = "c",
      descriptor = "(I)I",
      line = 56
   )
   public final int method1277(int arg0) {
      if (arg0 != 31294) {
         this.field2207 = (IDirect3DVertexBuffer)null;
      }

      return this.field2212;
   }

   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "(I)Z",
      line = 67
   )
   public final boolean method569(int arg0) {
      if (this.field2209 && class507.method3795(this.field2207.Unlock(), arg0 + -1606)) {
         this.field2209 = false;
         return true;
      } else {
         if (arg0 != 1571) {
            this.field2211 = (class287)null;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "d",
      descriptor = "(I)V",
      line = 88
   )
   public final void method574(int arg0) {
      if (arg0 == 29079) {
         if (this.field2207 != null) {
            this.field2207.method5108((byte)7);
            this.field2207 = null;
         }

         this.field2210 = 0;
         this.field2213 = 0;
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "<init>",
      descriptor = "(Lvea;Z)V",
      line = 144
   )
   public class134(class287 arg0, boolean arg1) {
      this.field2211 = arg0;
      this.field2208 = arg1;
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(III)Z",
      line = 110
   )
   public final boolean method568(int arg0, int arg1, int arg2) {
      this.field2212 = (byte)arg1;
      if (arg0 != 22407) {
         this.field2213 = -103;
      }

      this.field2213 = arg2;
      if (~this.field2213 < ~this.field2210) {
         int var4 = 8;
         byte var5;
         if (this.field2208) {
            var4 |= 512;
            var5 = 0;
         } else {
            var5 = 1;
         }

         if (this.field2207 != null) {
            this.field2207.method5108((byte)7);
         }

         this.field2207 = this.field2211.field4018.method3809(this.field2213, var4, 0, var5, this.field2207);
         this.field2210 = this.field2213;
      }

      return this.field2207 != null;
   }
}
