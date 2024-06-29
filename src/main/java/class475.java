import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class475 {
   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6581 = new String[]{method3474(method3473("\tU1\u0015~")), method3474(method3473("4Z{33\u0012\u001e")), method3474(method3473("\u0012Fs;")), method3474(method3473("\u0007\u001d1y+")), method3474(method3473("\tU1\u0016~"))};
   @OriginalMember(
      owner = "client!uf",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field6574 = new float[16384];
   @OriginalMember(
      owner = "client!uf",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field6579 = new float[16384];
   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "I"
   )
   public int field6575;
   @OriginalMember(
      owner = "client!uf",
      name = "g",
      descriptor = "I"
   )
   public static int field6576;
   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "I"
   )
   public int field6577;
   @OriginalMember(
      owner = "client!uf",
      name = "d",
      descriptor = "I"
   )
   public int field6578;
   @OriginalMember(
      owner = "client!uf",
      name = "f",
      descriptor = "I"
   )
   public static int field6580;

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(ZLeb;I)Ljava/lang/String;"
   )
   public static final String method3471(boolean arg0, class657 arg1, int arg2) {
      try {
         if (arg0) {
            method3472(-15);
         }

         ++field6576;
         if (!client.method2396(arg1).method3162((byte)75, arg2) && arg1.field9346 == null) {
            return null;
         } else if (arg1.field9323 != null && arg2 < arg1.field9323.length && arg1.field9323[arg2] != null && arg1.field9323[arg2].trim().length() != 0) {
            return arg1.field9323[arg2];
         } else {
            return class92.field1233 ? field6581[1] + arg2 : null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6581[0] + arg0 + ',' + (arg1 != null ? field6581[3] : field6581[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3472(int arg0) {
      try {
         if (arg0 != 16384) {
            field6574 = null;
         }

         field6579 = null;
         field6574 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6581[4] + arg0 + ')');
      }
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field6579[var2] = (float)Math.sin((double)var2 * var0);
         field6574[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
