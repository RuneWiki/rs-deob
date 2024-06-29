import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class221 {
   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2765 = new String[]{method1689(method1688("\u0002lD7=")), method1689(method1688("\u0005r\u0006\u0019")), method1689(method1688("\u0002lD4=")), method1689(method1688("\u0010)D[h"))};
   @OriginalMember(
      owner = "client!ik",
      name = "e",
      descriptor = "Lo;"
   )
   public static class31 field2759 = new class31(9, 8);
   @OriginalMember(
      owner = "client!ik",
      name = "d",
      descriptor = "I"
   )
   public static int field2763 = 0;
   @OriginalMember(
      owner = "client!ik",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field2764 = false;
   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "I"
   )
   public static int field2761;
   @OriginalMember(
      owner = "client!ik",
      name = "f",
      descriptor = "I"
   )
   public static int field2762;
   @OriginalMember(
      owner = "client!ik",
      name = "b",
      descriptor = "Lef;"
   )
   public static class517 field2760;

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1686(int arg0) {
      try {
         field2760 = null;
         field2759 = null;
         if (arg0 >= -72) {
            method1686(-68);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2765[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(Ljava/util/Random;II)I"
   )
   public static final int method1687(Random arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field2761;
         if (~arg2 >= -1) {
            throw new IllegalArgumentException();
         } else if (class685.method5005(arg2, (byte)123)) {
            return (int)((4294967295L & (long)arg0.nextInt()) * (long)arg2 >> 32);
         } else {
            int var4 = -((int)(4294967296L % (long)arg2)) + Integer.MIN_VALUE;
            int var5 = 116 / (arg1 / 33);

            while(true) {
               int var6 = arg0.nextInt();

               while(~var6 > ~var4) {
                  if (!var3) {
                     return class348.method2749(var6, arg2, (byte)-72);
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2765[2] + (arg0 != null ? field2765[3] : field2765[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1688(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1689(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
