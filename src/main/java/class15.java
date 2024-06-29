import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class15 extends class673 {
   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field279 = new String[]{method129(method128("6.;tC")), method129(method128("6.;uC")), method129(method128("6.;wC"))};
   @OriginalMember(
      owner = "client!oe",
      name = "p",
      descriptor = "I"
   )
   public static int field276;
   @OriginalMember(
      owner = "client!oe",
      name = "o",
      descriptor = "I"
   )
   public static int field277;
   @OriginalMember(
      owner = "client!oe",
      name = "q",
      descriptor = "I"
   )
   public static int field278;
   @OriginalMember(
      owner = "client!oe",
      name = "l",
      descriptor = "J"
   )
   public long field275;
   @OriginalMember(
      owner = "client!oe",
      name = "n",
      descriptor = "Loe;"
   )
   public class15 field272;
   @OriginalMember(
      owner = "client!oe",
      name = "r",
      descriptor = "Loe;"
   )
   public class15 field274;
   @OriginalMember(
      owner = "client!oe",
      name = "m",
      descriptor = "Lam;"
   )
   public static class323 field273;

   @OriginalMember(
      owner = "client!oe",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method125(int arg0) {
      try {
         ++field278;
         if (this.field274 != null) {
            if (arg0 == 13582) {
               this.field274.field272 = this.field272;
               this.field272.field274 = this.field274;
               this.field274 = null;
               this.field272 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field279[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method126(int arg0) {
      try {
         ++field277;
         if (this.field274 == null) {
            return false;
         } else {
            if (arg0 != 23348) {
               this.method125(-48);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field279[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method127(byte arg0) {
      try {
         if (arg0 != -94) {
            method127((byte)56);
         }

         field273 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field279[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
