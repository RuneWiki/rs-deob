import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class431 {
   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "Z"
   )
   private boolean field6157 = true;
   @OriginalMember(
      owner = "client!we",
      name = "i",
      descriptor = "I"
   )
   public int field6158 = 443;
   @OriginalMember(
      owner = "client!we",
      name = "d",
      descriptor = "Z"
   )
   private boolean field6164 = false;
   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "I"
   )
   public int field6163 = 43594;
   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6165 = new String[]{method3189(method3188("L%RyP")), method3189(method3188("L%RzP")), method3189(method3188("U5\u0010T")), method3189(method3188("@nR\u0016\u0005")), method3189(method3188("L%R{P"))};
   @OriginalMember(
      owner = "client!we",
      name = "h",
      descriptor = "I"
   )
   public int field6156;
   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "I"
   )
   public static int field6159;
   @OriginalMember(
      owner = "client!we",
      name = "e",
      descriptor = "I"
   )
   public static int field6160;
   @OriginalMember(
      owner = "client!we",
      name = "g",
      descriptor = "I"
   )
   public static int field6162;
   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field6161;

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(BLnu;)Lvca;"
   )
   public final class296 method3185(byte arg0, class619 arg1) {
      try {
         if (arg0 >= -68) {
            return null;
         } else {
            ++field6162;
            return arg1.method4494(this.field6161, 0, this.field6164, !this.field6157 ? this.field6163 : this.field6158);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6165[4] + arg0 + ',' + (arg1 != null ? field6165[3] : field6165[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(ILwe;)Z"
   )
   public final boolean method3186(int arg0, class431 arg1) {
      try {
         ++field6160;
         if (arg0 != 443) {
            this.method3187((byte)66);
         }

         if (arg1 == null) {
            return false;
         } else {
            return this.field6156 == arg1.field6156 && this.field6161.equals(arg1.field6161);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6165[1] + arg0 + ',' + (arg1 != null ? field6165[3] : field6165[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3187(byte arg0) {
      boolean var2 = client.field4360;

      try {
         label34: {
            ++field6159;
            if (!this.field6157) {
               this.field6164 = true;
               this.field6157 = true;
               if (!var2) {
                  break label34;
               }
            }

            if (this.field6164) {
               this.field6164 = false;
               if (!var2) {
                  break label34;
               }
            }

            this.field6157 = false;
         }

         if (arg0 != -26) {
            this.field6156 = -87;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6165[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3188(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3189(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
