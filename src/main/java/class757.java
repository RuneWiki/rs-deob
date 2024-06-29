import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class class757 extends class331 {
   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11215 = new String[]{method5556(method5555("eM#\u0018v")), method5556(method5555("eM#\u0019v")), method5556(method5555("eM#\u001ev")), method5556(method5555("&l7{")), method5556(method5555("eM#\u001fv"))};
   @OriginalMember(
      owner = "client!cr",
      name = "i",
      descriptor = "Luk;"
   )
   public static class498 field11212 = new class498(18, 4);
   @OriginalMember(
      owner = "client!cr",
      name = "k",
      descriptor = "[C"
   )
   private static char[] field11213 = new char[64];
   @OriginalMember(
      owner = "client!cr",
      name = "h",
      descriptor = "I"
   )
   public static int field11209;
   @OriginalMember(
      owner = "client!cr",
      name = "g",
      descriptor = "I"
   )
   public static int field11210;
   @OriginalMember(
      owner = "client!cr",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field11214;
   @OriginalMember(
      owner = "client!cr",
      name = "f",
      descriptor = "[[[B"
   )
   public static byte[][][] field11211;

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5551(byte arg0) {
      try {
         field11212 = null;
         field11213 = null;
         field11211 = null;
         if (arg0 >= -29) {
            field11213 = null;
         }

         field11214 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11215[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(II)Leq;"
   )
   public static final class305 method5552(int arg0, int arg1) {
      try {
         ++field11209;
         class305 var2 = (class305)class511.field7812.method3178(0, (long)arg1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class357.field5518.method5017(arg1, arg0, (byte)71);
            if (var3 != null && ~var3.length < -2) {
               class305 var4;
               try {
                  var4 = class9.method64(-20943, var3);
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + field11215[3] + arg1);
               }

               class511.field7812.method3183((long)arg1, var4, (byte)81);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11215[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5553(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -28284) {
            return false;
         } else {
            ++field11210;
            return ~(arg2 & 65536) != -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11215[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method5554(long arg0, long arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11215[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "c",
      descriptor = "(I)Lan;"
   )
   public abstract class496 method3169(int arg0);

   static {
      for(int var0 = 0; var0 < 26; ++var0) {
         field11213[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field11213[var1] = (char)(var1 + 97 - 26);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field11213[var2] = (char)(var2 + 48 - 52);
      }

      field11213[63] = '-';
      field11213[62] = '*';
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5555(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5556(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
