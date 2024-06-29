import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class298 extends class510 {
   @OriginalMember(
      owner = "client!ol",
      name = "f",
      descriptor = "Lnfa;"
   )
   public class706 field4165;
   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4169 = new String[]{method2326(method2325("\u0012jm\\ \u0013o7^a")), method2326(method2325("\u0013s/\f")), method2326(method2325("\u0006(mN4")), method2326(method2325("\u0012jm#a"))};
   @OriginalMember(
      owner = "client!ol",
      name = "g",
      descriptor = "Liw;"
   )
   public static class332 field4166 = new class332();
   @OriginalMember(
      owner = "client!ol",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4168 = new int[25];
   @OriginalMember(
      owner = "client!ol",
      name = "h",
      descriptor = "I"
   )
   public static int field4167;

   @OriginalMember(
      owner = "client!ol",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2324(int arg0) {
      try {
         field4168 = null;
         field4166 = null;
         if (arg0 < 46) {
            field4166 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4169[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "<init>",
      descriptor = "(Lcs;II[B)V"
   )
   public class298(class357 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field4165 = arg0.method2790(arg3, 73, false, arg2, class776.field11354, arg1);
         this.field4165.method884(false, 70, false);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4169[0] + (arg0 != null ? field4169[2] : field4169[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4169[2] : field4169[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "<init>",
      descriptor = "(Lcs;II[I)V"
   )
   public class298(class357 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field4165 = arg0.method2766(false, arg1, arg2, (byte)104, arg3);
         this.field4165.method884(false, -9, false);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4169[0] + (arg0 != null ? field4169[2] : field4169[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4169[2] : field4169[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2325(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2326(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
