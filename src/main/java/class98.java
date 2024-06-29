import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class98 extends class320 {
   @OriginalMember(
      owner = "client!in",
      name = "n",
      descriptor = "I"
   )
   public int field1281;
   @OriginalMember(
      owner = "client!in",
      name = "l",
      descriptor = "[B"
   )
   public byte[] field1277;
   @OriginalMember(
      owner = "client!in",
      name = "o",
      descriptor = "I"
   )
   public int field1278;
   @OriginalMember(
      owner = "client!in",
      name = "m",
      descriptor = "I"
   )
   public int field1280;
   @OriginalMember(
      owner = "client!in",
      name = "k",
      descriptor = "Z"
   )
   public boolean field1279;

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(Ldu;)Lin;"
   )
   public final class98 method904(class377 arg0) {
      this.field1277 = arg0.method2908(this.field1277, 0);
      this.field1281 = arg0.method2910(this.field1281, (byte)-124);
      if (this.field1280 == this.field1278) {
         this.field1278 = this.field1280 = arg0.method2909(this.field1278, -127);
      } else {
         this.field1278 = arg0.method2909(this.field1278, -110);
         this.field1280 = arg0.method2909(this.field1280, -82);
         if (this.field1280 == this.field1278) {
            --this.field1278;
         }
      }

      return this;
   }

   @OriginalMember(
      owner = "client!in",
      name = "<init>",
      descriptor = "(I[BII)V"
   )
   public class98(int arg0, byte[] arg1, int arg2, int arg3) {
      this.field1281 = arg0;
      this.field1277 = arg1;
      this.field1278 = arg2;
      this.field1280 = arg3;
   }

   @OriginalMember(
      owner = "client!in",
      name = "<init>",
      descriptor = "(I[BIIZ)V"
   )
   public class98(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
      this.field1281 = arg0;
      this.field1277 = arg1;
      this.field1278 = arg2;
      this.field1280 = arg3;
      this.field1279 = arg4;
   }
}
