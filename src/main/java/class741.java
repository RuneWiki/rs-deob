import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class741 {
   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10845 = new String[]{method5381(method5380("6f\b<u")), method5381(method5380("#=J~")), method5381(method5380("\",G<Je")), method5381(method5380("\",G<Ie"))};
   @OriginalMember(
      owner = "client!oda",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10843 = new int[25];
   @OriginalMember(
      owner = "client!oda",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field10840 = new class418(92, 8);
   @OriginalMember(
      owner = "client!oda",
      name = "b",
      descriptor = "I"
   )
   public static int field10841;
   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "I"
   )
   public static int field10842;
   @OriginalMember(
      owner = "client!oda",
      name = "e",
      descriptor = "Lww;"
   )
   public static class339 field10844;

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5378(byte arg0) {
      try {
         if (arg0 < -49) {
            field10840 = null;
            field10844 = null;
            field10843 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10845[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Z"
   )
   public static final boolean method5379(String arg0, String arg1, String arg2, String arg3, byte arg4) {
      try {
         ++field10842;
         if (arg0 != null && arg2 != null) {
            if (arg4 != 95) {
               field10840 = null;
            }

            return !arg0.startsWith("#") && !arg2.startsWith("#") ? arg1.equals(arg3) : arg0.equals(arg2);
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10845[2] + (arg0 != null ? field10845[0] : field10845[1]) + ',' + (arg1 != null ? field10845[0] : field10845[1]) + ',' + (arg2 != null ? field10845[0] : field10845[1]) + ',' + (arg3 != null ? field10845[0] : field10845[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5380(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5381(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
