import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class233 extends class580 {
   @OriginalMember(
      owner = "client!kea",
      name = "y",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field3612;
   @OriginalMember(
      owner = "client!kea",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3615 = new String[]{method2070(method2069("\"*\u0018F\u001da")), method2070(method2069("\"*\u0018F\u0018a")), method2070(method2069("':\u0015\u0004")), method2070(method2069("\"*\u0018F` !\u0010\u001cba")), method2070(method2069("2aWF!"))};
   @OriginalMember(
      owner = "client!kea",
      name = "w",
      descriptor = "J"
   )
   public static long field3609 = -1L;
   @OriginalMember(
      owner = "client!kea",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field3613 = false;
   @OriginalMember(
      owner = "client!kea",
      name = "v",
      descriptor = "I"
   )
   public static int field3610;
   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "I"
   )
   public static int field3611;
   @OriginalMember(
      owner = "client!kea",
      name = "x",
      descriptor = "I"
   )
   public static int field3614;

   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2067(byte arg0) {
      try {
         if (arg0 < 117) {
            return true;
         } else {
            ++field3611;
            return false;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3615[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class233(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field3612 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field3615[3] + (arg0 != null ? field3615[4] : field3615[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method2068(byte arg0) {
      try {
         ++field3614;
         return arg0 != 50 ? null : this.field3612;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3615[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2069(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2070(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
