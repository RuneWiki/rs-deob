import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class211 {
   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3157 = method1795(method1794("hTu\re"));
   @OriginalMember(
      owner = "client!fq",
      name = "h",
      descriptor = "Lpg;"
   )
   public static class762 field3152 = new class762(method1795(method1794("Yq\n\r")), method1795(method1794("aC=%.k")), method1795(method1794("QT:")), 2);
   @OriginalMember(
      owner = "client!fq",
      name = "e",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field3153 = new Rectangle[100];
   @OriginalMember(
      owner = "client!fq",
      name = "g",
      descriptor = "S"
   )
   public static short field3154 = 256;
   @OriginalMember(
      owner = "client!fq",
      name = "j",
      descriptor = "I"
   )
   public static int field3155 = -1;
   @OriginalMember(
      owner = "client!fq",
      name = "d",
      descriptor = "F"
   )
   public static float field3156;
   @OriginalMember(
      owner = "client!fq",
      name = "b",
      descriptor = "I"
   )
   public int field3147;
   @OriginalMember(
      owner = "client!fq",
      name = "i",
      descriptor = "I"
   )
   public int field3148;
   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "I"
   )
   public int field3149;
   @OriginalMember(
      owner = "client!fq",
      name = "c",
      descriptor = "I"
   )
   public int field3151;
   @OriginalMember(
      owner = "client!fq",
      name = "f",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field3150;

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1792(int arg0, int arg1) {
      return class634.field9246 != null ? class634.field9246[arg0][arg1] & 255 : 0;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1793(byte arg0) {
      try {
         field3150 = null;
         if (arg0 != 29) {
            method1792(53, -47);
         }

         field3153 = null;
         field3152 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3157 + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 100; ++var0) {
         field3153[var0] = new Rectangle();
      }

   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1795(char[] arg0) {
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
            var10005 = 37;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
