import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class233 {
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2902 = new String[]{method1851(method1850("yf\u0007IX")), method1851(method1850("l=E\u000b")), method1851(method1850("k?\u0007%\r")), method1851(method1850("k?\u0007$\r")), method1851(method1850("k?\u0007&\r"))};
   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2893 = new int[32];
   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "I"
   )
   public static int field2896 = 0;
   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "I"
   )
   public static int field2894 = 0;
   @OriginalMember(
      owner = "client!iw",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field2895 = new int[]{2047, 16383, 65535};
   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "I"
   )
   public static int field2898 = 0;
   @OriginalMember(
      owner = "client!iw",
      name = "h",
      descriptor = "I"
   )
   public static int field2897;
   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "I"
   )
   public static int field2899;
   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "I"
   )
   public static int field2901;
   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field2900;

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILoca;B)I"
   )
   public static final int method1847(int arg0, class642 arg1, byte arg2) {
      try {
         ++field2901;
         if (!client.method999(arg1).method5276(arg0, (byte)107) && arg1.field9612 == null) {
            return -1;
         } else {
            if (arg2 != 62) {
               method1847(-127, (class642)null, (byte)-53);
            }

            return arg1.field9577 != null && ~arg1.field9577.length < ~arg0 ? arg1.field9577[arg0] : -1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2902[2] + arg0 + ',' + (arg1 != null ? field2902[0] : field2902[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method1848(int arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field2899;
         int var3 = arg1.length();
         int var4 = 0;
         int var5 = -72 / ((arg0 - 59) / 37);
         int var6 = 0;
         if (var2) {
            var4 = (var4 << 5) + -var4 + class530.method4038(-117, arg1.charAt(var6));
            ++var6;
         }

         while(true) {
            while(~var6 > ~var3) {
               var4 = (var4 << 5) + -var4 + class530.method4038(-117, arg1.charAt(var6));
               ++var6;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2902[4] + arg0 + ',' + (arg1 != null ? field2902[0] : field2902[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1849(int arg0) {
      try {
         field2893 = null;
         field2900 = null;
         int var1 = -96 % ((arg0 - -62) / 54);
         field2895 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2902[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
