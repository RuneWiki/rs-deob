import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class760;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class144 implements class11 {
   @OriginalMember(
      owner = "client!hs",
      name = "g",
      descriptor = "Z"
   )
   private boolean field1811 = false;
   @OriginalMember(
      owner = "client!hs",
      name = "e",
      descriptor = "Z"
   )
   private boolean field1814;
   @OriginalMember(
      owner = "client!hs",
      name = "f",
      descriptor = "Lub;"
   )
   private class165 field1812;
   @OriginalMember(
      owner = "client!hs",
      name = "d",
      descriptor = "B"
   )
   private byte field1813;
   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "I"
   )
   private int field1809;
   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "I"
   )
   private int field1810;
   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "Ljagdx/IDirect3DVertexBuffer;"
   )
   public IDirect3DVertexBuffer field1815;

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1175(byte arg0) {
      return arg0 <= 17 ? -9 : this.field1813;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method101(int arg0, int arg1, int arg2) {
      this.field1813 = (byte)arg2;
      if (arg0 != 30842) {
         this.field1812 = (class165)null;
      }

      this.field1810 = arg1;
      if (this.field1810 > this.field1809) {
         int var4 = 8;
         byte var5;
         if (!this.field1814) {
            var5 = 1;
         } else {
            var4 |= 512;
            var5 = 0;
         }

         if (this.field1815 != null) {
            this.field1815.method2971((byte)-78);
         }

         this.field1815 = this.field1812.field2093.method5506(this.field1810, var4, 0, var5, this.field1815);
         this.field1809 = this.field1810;
      }

      return this.field1815 != null;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method105(int arg0) {
      if (arg0 <= -89) {
         if (this.field1815 != null) {
            this.field1815.method2971((byte)126);
            this.field1815 = null;
         }

         this.field1809 = 0;
         this.field1810 = 0;
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method104(int arg0) {
      if (this.field1811 && class760.method5514(25060, this.field1815.Unlock())) {
         this.field1811 = false;
         return true;
      } else {
         if (arg0 != -19749) {
            this.method105(-20);
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method102(byte arg0, boolean arg1) {
      if (this.field1815 != null) {
         boolean var3 = arg1 & this.field1814;
         if (!this.field1811 && class760.method5514(25060, this.field1815.Lock(0, this.field1809, !var3 ? 0 : 8192, this.field1812.field2102))) {
            this.field1811 = true;
            return this.field1812.field2102;
         } else {
            return arg0 > -35 ? (Buffer)null : null;
         }
      } else {
         return null;
      }
   }

   @OriginalMember(
      owner = "client!hs",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method917(int arg0) {
      if (arg0 <= 85) {
         this.field1809 = 60;
      }

      return this.field1810;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "a",
      descriptor = "(ILjaclib/memory/Source;IB)Z"
   )
   public final boolean method103(int arg0, Source arg1, int arg2, byte arg3) {
      int var5 = -9 / ((20 - arg3) / 35);
      return this.method101(30842, arg0, arg2) ? this.field1815.method5489(arg1, 0, 0, this.field1810, !this.field1814 ? 0 : 8192) : false;
   }

   @OriginalMember(
      owner = "client!hs",
      name = "<init>",
      descriptor = "(Lub;Z)V"
   )
   public class144(class165 arg0, boolean arg1) {
      this.field1814 = arg1;
      this.field1812 = arg0;
   }
}
