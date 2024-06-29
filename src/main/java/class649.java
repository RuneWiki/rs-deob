import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class649 implements class581 {
   @OriginalMember(
      owner = "client!sk",
      name = "c",
      descriptor = "Z"
   )
   private boolean field9186 = false;
   @OriginalMember(
      owner = "client!sk",
      name = "b",
      descriptor = "Z"
   )
   private boolean field9190;
   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "Lmv;"
   )
   private class125 field9187;
   @OriginalMember(
      owner = "client!sk",
      name = "d",
      descriptor = "B"
   )
   private byte field9185;
   @OriginalMember(
      owner = "client!sk",
      name = "g",
      descriptor = "I"
   )
   private int field9184;
   @OriginalMember(
      owner = "client!sk",
      name = "f",
      descriptor = "I"
   )
   private int field9188;
   @OriginalMember(
      owner = "client!sk",
      name = "e",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field9189;

   @OriginalMember(
      owner = "client!sk",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method350(int arg0) {
      if (arg0 < 77) {
         this.field9185 = 105;
      }

      return this.field9184;
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method358(boolean arg0) {
      if (this.field9189 != null) {
         this.field9189.method3157(102);
         this.field9189 = null;
      }

      this.field9188 = 0;
      this.field9184 = 0;
      if (!arg0) {
         this.method4736((byte)-99);
      }

   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   public final Buffer method353(boolean arg0, byte arg1) {
      if (this.field9189 != null) {
         boolean var3 = arg0 & this.field9190;
         if (arg1 < 98) {
            this.method350(-41);
         }

         if (!this.field9186 && class402.method3144(-2005530595, this.field9189.Lock(0, this.field9188, !var3 ? 0 : 8192, this.field9187.field2009))) {
            this.field9186 = true;
            return this.field9187.field2009;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4736(byte arg0) {
      if (arg0 != 32) {
         this.field9188 = 45;
      }

      return this.field9185;
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method352(int arg0) {
      if (arg0 != -2070) {
         this.method4736((byte)-99);
      }

      if (this.field9186 && class402.method3144(-2005530595, this.field9189.Unlock())) {
         this.field9186 = false;
         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(IILjaclib/memory/Source;I)Z"
   )
   public final boolean method355(int arg0, int arg1, Source arg2, int arg3) {
      if (arg1 != -23537) {
         return false;
      } else {
         return !this.method351((byte)38, arg3, arg0) ? false : this.field9189.method3142(arg2, 0, 0, this.field9184, !this.field9190 ? 0 : 8192);
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(BII)Z"
   )
   public final boolean method351(byte arg0, int arg1, int arg2) {
      this.field9185 = (byte)arg2;
      this.field9184 = arg1;
      if (arg0 != 38) {
         this.field9185 = -80;
      }

      if (~this.field9184 < ~this.field9188) {
         int var4 = 8;
         byte var5;
         if (!this.field9190) {
            var5 = 1;
         } else {
            var5 = 0;
            var4 |= 512;
         }

         if (this.field9189 != null) {
            this.field9189.method3157(-25);
         }

         this.field9189 = this.field9187.field2013.method3129(this.field9184, var4, 0, var5, this.field9189);
         this.field9188 = this.field9184;
      }

      return this.field9189 != null;
   }

   @OriginalMember(
      owner = "client!sk",
      name = "<init>",
      descriptor = "(Lmv;Z)V"
   )
   public class649(class125 arg0, boolean arg1) {
      this.field9190 = arg1;
      this.field9187 = arg0;
   }
}
