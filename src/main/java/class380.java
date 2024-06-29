import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class380 {
   @OriginalMember(
      owner = "client!rr",
      name = "h",
      descriptor = "S"
   )
   public short field5842;
   @OriginalMember(
      owner = "client!rr",
      name = "e",
      descriptor = "B"
   )
   public byte field5845;
   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "B"
   )
   public byte field5844;
   @OriginalMember(
      owner = "client!rr",
      name = "f",
      descriptor = "Lgka;"
   )
   public class390 field5840;
   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5849 = new String[]{method2940(method2939("\u0016\u0004`\u0005v")), method2940(method2939("\u001fX`\u0017b\u0003C:\u0015#")), method2940(method2939("\u0003_\"G")), method2940(method2939("\u001fX`i#")), method2940(method2939("\u001fX`j#"))};
   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "I"
   )
   public static int field5846 = 0;
   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field5841 = new class101(35, 4);
   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "Lhv;"
   )
   public static class544 field5847 = null;
   @OriginalMember(
      owner = "client!rr",
      name = "i",
      descriptor = "Loi;"
   )
   public static class79 field5848 = new class79(9, 2);
   @OriginalMember(
      owner = "client!rr",
      name = "g",
      descriptor = "I"
   )
   public static int field5843;

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2937(int arg0, int arg1, int arg2) {
      try {
         ++field5843;
         if (arg1 != 35) {
            return true;
         } else {
            return ~(2048 & arg0) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5849[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "<init>",
      descriptor = "(Lgka;III)V"
   )
   public class380(class390 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5842 = (short)arg1;
         this.field5845 = (byte)arg2;
         this.field5844 = (byte)arg3;
         this.field5840 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5849[1] + (arg0 != null ? field5849[0] : field5849[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2938(byte arg0) {
      try {
         field5841 = null;
         field5848 = null;
         int var1 = -30 % ((21 - arg0) / 44);
         field5847 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5849[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2939(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2940(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
