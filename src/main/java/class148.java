import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class760;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class148 implements class265 {
   @OriginalMember(
      owner = "client!fq",
      name = "g",
      descriptor = "Z"
   )
   private boolean field1844 = false;
   @OriginalMember(
      owner = "client!fq",
      name = "b",
      descriptor = "Lwn;"
   )
   private class576 field1845;
   @OriginalMember(
      owner = "client!fq",
      name = "f",
      descriptor = "Lub;"
   )
   private class165 field1850;
   @OriginalMember(
      owner = "client!fq",
      name = "d",
      descriptor = "Z"
   )
   private boolean field1848;
   @OriginalMember(
      owner = "client!fq",
      name = "e",
      descriptor = "I"
   )
   private int field1846;
   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "I"
   )
   private int field1849;
   @OriginalMember(
      owner = "client!fq",
      name = "c",
      descriptor = "Ljagdx/IDirect3DIndexBuffer;"
   )
   public IDirect3DIndexBuffer field1847;

   @OriginalMember(
      owner = "client!fq",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method105(int arg0) {
      if (this.field1847 != null) {
         this.field1847.method2971((byte)124);
         this.field1847 = null;
      }

      this.field1849 = 0;
      if (arg0 > -89) {
         this.field1846 = -47;
      }

      this.field1846 = 0;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1192(int arg0, int arg1) {
      this.field1849 = this.field1845.field8536 * arg1;
      if (this.field1846 < this.field1849) {
         int var3 = 8;
         byte var4;
         if (!this.field1848) {
            var4 = 1;
         } else {
            var4 = 0;
            var3 |= 512;
         }

         if (this.field1847 != null) {
            this.field1847.method2971((byte)99);
         }

         this.field1847 = this.field1850.field2093.method5496(this.field1849, var3, class576.field8542 == this.field1845 ? 101 : 102, var4, this.field1847);
         this.field1846 = this.field1849;
      }

      if (arg0 > -51) {
         this.method1192(48, 74);
      }

   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(B)Lwn;"
   )
   public final class576 method1193(byte arg0) {
      return arg0 < 104 ? (class576)null : this.field1845;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1194(byte arg0) {
      if (this.field1844 && class760.method5514(25060, this.field1847.Unlock())) {
         this.field1844 = false;
         return true;
      } else {
         return arg0 <= 100 ? false : false;
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method917(int arg0) {
      if (arg0 <= 85) {
         this.method917(126);
      }

      return this.field1849;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;"
   )
   public final Buffer method1195(boolean arg0, int arg1) {
      if (arg1 != -4298) {
         return (Buffer)null;
      } else if (this.field1847 == null) {
         return null;
      } else {
         boolean var3 = arg0 & this.field1848;
         if (!this.field1844 && class760.method5514(25060, this.field1847.Lock(0, this.field1846, var3 ? 8192 : 0, this.field1850.field2102))) {
            this.field1844 = true;
            return this.field1850.field2102;
         } else {
            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "<init>",
      descriptor = "(Lub;Lwn;Z)V"
   )
   public class148(class165 arg0, class576 arg1, boolean arg2) {
      this.field1845 = arg1;
      this.field1850 = arg0;
      this.field1848 = arg2;
   }
}
