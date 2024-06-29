import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class376 extends class721 {
   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5986 = new String[]{method3084(method3083("U\r\u0000 \n")), method3084(method3083("U\r\u0000!\n"))};
   @OriginalMember(
      owner = "client!tw",
      name = "j",
      descriptor = "Luk;"
   )
   public static class498 field5981 = new class498(69, 0);
   @OriginalMember(
      owner = "client!tw",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field5984 = false;
   @OriginalMember(
      owner = "client!tw",
      name = "k",
      descriptor = "I"
   )
   public static int field5985 = -1;
   @OriginalMember(
      owner = "client!tw",
      name = "f",
      descriptor = "I"
   )
   public static int field5980;
   @OriginalMember(
      owner = "client!tw",
      name = "g",
      descriptor = "I"
   )
   public static int field5982;
   @OriginalMember(
      owner = "client!tw",
      name = "i",
      descriptor = "Lpr;"
   )
   public static class331 field5983;

   @OriginalMember(
      owner = "client!tw",
      name = "c",
      descriptor = "(I)V",
      line = 8
   )
   public static void method3081(int arg0) {
      try {
         if (arg0 != 1) {
            field5982 = 79;
         }

         field5981 = null;
         field5983 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5986[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "d",
      descriptor = "(I)V",
      line = 23
   )
   public static final void method3082(int arg0) {
      try {
         ++field5980;
         if (arg0 <= -70) {
            int var1 = 0;
            if (class687.field10213 != null) {
               var1 = class687.field10213.field530.method2039(480102311);
            }

            if (~var1 == -3) {
               int var2 = class155.field2322 > 800 ? 800 : class155.field2322;
               class316.field4878 = var2;
               class16.field213 = (-var2 + class155.field2322) / 2;
               int var3 = ~class145.field2067 < -601 ? 600 : class145.field2067;
               class692.field10301 = var3;
               class519.field7895 = 0;
            } else if (var1 == 1) {
               int var4 = class155.field2322 > 1024 ? 1024 : class155.field2322;
               class16.field213 = (-var4 + class155.field2322) / 2;
               class316.field4878 = var4;
               int var5 = class145.field2067 > 768 ? 768 : class145.field2067;
               class692.field10301 = var5;
               class519.field7895 = 0;
            } else {
               class692.field10301 = class145.field2067;
               class16.field213 = 0;
               class316.field4878 = class155.field2322;
               class519.field7895 = 0;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5986[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3083(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3084(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
