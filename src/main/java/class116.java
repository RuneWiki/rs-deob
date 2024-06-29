import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class116 extends class247 {
   @OriginalMember(
      owner = "client!bp",
      name = "m",
      descriptor = "J"
   )
   public long field1839;
   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1841 = new String[]{method1135(method1134("l\u0001*ll`\u0018pn-")), method1135(method1134("l\u0001*\u0011-"))};
   @OriginalMember(
      owner = "client!bp",
      name = "l",
      descriptor = "[F"
   )
   public static float[] field1836 = new float[16384];
   @OriginalMember(
      owner = "client!bp",
      name = "j",
      descriptor = "[F"
   )
   public static float[] field1837 = new float[16384];
   @OriginalMember(
      owner = "client!bp",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field1838 = false;
   @OriginalMember(
      owner = "client!bp",
      name = "k",
      descriptor = "I"
   )
   public static int field1840;

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1133(int arg0) {
      try {
         field1837 = null;
         if (arg0 > 32) {
            field1836 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1841[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "()V"
   )
   public class116() {
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "(J)V"
   )
   public class116(long arg0) {
      try {
         this.field1839 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1841[0] + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field1837[var2] = (float)Math.sin((double)var2 * var0);
         field1836[var2] = (float)Math.cos((double)var2 * var0);
      }

      field1840 = 0;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1134(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1135(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
