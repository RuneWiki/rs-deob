import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class282 extends class564 {
   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3770 = new String[]{method2153(method2152("W\b}Jm")), method2153(method2152("W\b}Km")), method2153(method2152("^H}&8")), method2153(method2152("K\u0013?d"))};
   @OriginalMember(
      owner = "client!rn",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field3765 = new class378(93, 8);
   @OriginalMember(
      owner = "client!rn",
      name = "g",
      descriptor = "[B"
   )
   public static byte[] field3766;
   @OriginalMember(
      owner = "client!rn",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field3769;
   @OriginalMember(
      owner = "client!rn",
      name = "f",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field3768;
   @OriginalMember(
      owner = "client!rn",
      name = "i",
      descriptor = "I"
   )
   public static int field3767;
   @OriginalMember(
      owner = "client!rn",
      name = "h",
      descriptor = "Ljba;"
   )
   public static class422 field3764;

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(ILjava/lang/String;)J"
   )
   public static final long method2150(int arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field3767;
         int var3 = arg1.length();
         long var4 = 0L;
         int var6 = 0;
         if (var2) {
            var4 = (var4 << 5) - var4 + (long)arg1.charAt(var6);
            ++var6;
         }

         while(true) {
            while(var3 > var6) {
               var4 = (var4 << 5) - var4 + (long)arg1.charAt(var6);
               ++var6;
            }

            int var7 = -31 % ((18 - arg0) / 37);
            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3770[1] + arg0 + ',' + (arg1 != null ? field3770[2] : field3770[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2151(int arg0) {
      try {
         field3768 = null;
         field3765 = null;
         if (arg0 == 0) {
            field3764 = null;
            field3766 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3770[0] + arg0 + ')');
      }
   }

   static {
      int var0 = 0;
      field3766 = new byte[32896];

      for(int var1 = 0; var1 < 256; ++var1) {
         for(int var2 = 0; var2 <= var1; ++var2) {
            field3766[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)(var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
         }
      }

      field3769 = false;
      field3768 = new CRC32();
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2152(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2153(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
