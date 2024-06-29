import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class71;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class165 implements class631 {
   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "Z"
   )
   private boolean field2507 = false;
   @OriginalMember(
      owner = "client!ck",
      name = "g",
      descriptor = "Z"
   )
   private boolean field2504;
   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "Leb;"
   )
   private class163 field2508;
   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "B"
   )
   private byte field2506;
   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "I"
   )
   private int field2503;
   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "I"
   )
   private int field2505;
   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field2509;

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public final void method1533(int arg0) {
      if (this.field2509 != null) {
         this.field2509.method5223(-18900);
         this.field2509 = null;
      }

      if (arg0 != 16966) {
         this.method1539(63);
      }

      this.field2505 = 0;
      this.field2503 = 0;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(I)Z",
      line = 22
   )
   public final boolean method1534(int arg0) {
      if (this.field2507 && class71.method550(this.field2509.Unlock(), (byte)-80)) {
         this.field2507 = false;
         return true;
      } else {
         int var2 = -101 / ((arg0 - -81) / 36);
         return false;
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;",
      line = 41
   )
   public final Buffer method1535(boolean arg0, int arg1) {
      if (this.field2509 != null) {
         int var3 = 61 % ((arg1 - 43) / 39);
         boolean var4 = arg0 & this.field2504;
         if (!this.field2507 && class71.method550(this.field2509.Lock(0, this.field2505, var4 ? 8192 : 0, this.field2508.field2443), (byte)-80)) {
            this.field2507 = true;
            return this.field2508.field2443;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;III)Z",
      line = 64
   )
   public final boolean method1536(Source arg0, int arg1, int arg2, int arg3) {
      if (arg1 != 6701) {
         this.method1538(52);
      }

      return !this.method1537(arg3, arg2, arg1 + 15550) ? false : this.field2509.method551(arg0, 0, 0, this.field2503, this.field2504 ? 8192 : 0);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(III)Z",
      line = 81
   )
   public final boolean method1537(int arg0, int arg1, int arg2) {
      this.field2503 = arg1;
      if (arg2 != 22251) {
         return false;
      } else {
         this.field2506 = (byte)arg0;
         if (this.field2505 < this.field2503) {
            int var4 = 8;
            byte var5;
            if (this.field2504) {
               var5 = 0;
               var4 |= 512;
            } else {
               var5 = 1;
            }

            if (this.field2509 != null) {
               this.field2509.method5223(arg2 ^ -7993);
            }

            this.field2509 = this.field2508.field2447.method571(this.field2503, var4, 0, var5, this.field2509);
            this.field2505 = this.field2503;
         }

         return this.field2509 != null;
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(I)I",
      line = 118
   )
   public final int method1538(int arg0) {
      if (arg0 < 13) {
         this.method1538(-69);
      }

      return this.field2503;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "<init>",
      descriptor = "(Leb;Z)V",
      line = 144
   )
   public class165(class163 arg0, boolean arg1) {
      this.field2504 = arg1;
      this.field2508 = arg0;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(I)I",
      line = 135
   )
   public final int method1539(int arg0) {
      if (arg0 <= 97) {
         this.field2503 = -126;
      }

      return this.field2506;
   }
}
