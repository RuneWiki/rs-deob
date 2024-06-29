import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class173 {
   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2160 = new String[]{method1349(method1348("=;\u000es\u0015t")), method1349(method1348("=;\u000es\u0016t"))};
   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "I"
   )
   public static int field2159 = 0;
   @OriginalMember(
      owner = "client!ada",
      name = "e",
      descriptor = "I"
   )
   public static int field2155;
   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "I"
   )
   public static int field2156;
   @OriginalMember(
      owner = "client!ada",
      name = "d",
      descriptor = "I"
   )
   public static int field2157;
   @OriginalMember(
      owner = "client!ada",
      name = "b",
      descriptor = "I"
   )
   public static int field2158;

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(I)[Lgf;"
   )
   public static final class292[] method1346(int arg0) {
      try {
         ++field2155;
         if (arg0 != 0) {
            field2158 = -34;
         }

         return new class292[]{class553.field7604, class553.field7610, class553.field7611, class553.field7612, class553.field7613, class553.field7614, class553.field7615, class553.field7616, class553.field7617, class553.field7618, class553.field7619, class553.field7620, class553.field7621};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2160[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method1347(int arg0, long arg1) {
      try {
         ++field2156;
         int var3 = 97 % ((arg0 - -25) / 46);
         if (arg1 > 0L) {
            if (arg1 % 10L != 0L) {
               class771.method5516(arg1, -88);
            } else {
               class771.method5516(arg1 + -1L, -122);
               class771.method5516(1L, -46);
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2160[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1349(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
