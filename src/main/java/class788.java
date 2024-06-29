import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class788 extends class391 {
   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11546 = new String[]{method5714(method5713("E~,\u0017\u0015\u001d")), method5714(method5713("[l!U")), method5714(method5713("E~,\u0017\u0016\u001d")), method5714(method5713("N7c\u0017*"))};
   @OriginalMember(
      owner = "client!pga",
      name = "k",
      descriptor = "I"
   )
   public static int field11541;
   @OriginalMember(
      owner = "client!pga",
      name = "m",
      descriptor = "Lbaa;"
   )
   public class109 field11544;
   @OriginalMember(
      owner = "client!pga",
      name = "n",
      descriptor = "Lsn;"
   )
   public static class675 field11542;
   @OriginalMember(
      owner = "client!pga",
      name = "l",
      descriptor = "Z"
   )
   public boolean field11543;
   @OriginalMember(
      owner = "client!pga",
      name = "o",
      descriptor = "[Lk;"
   )
   public class49[] field11545;

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method5711(int arg0, int arg1, int arg2, class610 arg3) {
      boolean var5 = client.field1786;

      try {
         ++field11541;
         int var6 = this.field11544.method1041((byte)-94);
         if (arg1 != 0) {
            this.field11543 = false;
         }

         if (this.field11545 != null) {
            int var7 = 0;
            if (var5 || var7 < this.field11545.length) {
               do {
                  this.field11545[var7].field631 <<= var6;
                  if (this.field11545[var7].method344(arg0, arg2) && this.field11544.method43(arg3, arg2, arg0, false)) {
                     this.field11545[var7].field631 >>= var6;
                     return true;
                  }

                  this.field11545[var7].field631 >>= var6;
                  ++var7;
               } while(var7 < this.field11545.length);
            }
         }

         return false;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11546[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11546[3] : field11546[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5712(int arg0) {
      try {
         if (arg0 != -25721) {
            method5712(-78);
         }

         field11542 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11546[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5713(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5714(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
