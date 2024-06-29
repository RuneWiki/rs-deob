import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class147 implements class726 {
   @OriginalMember(
      owner = "client!cg",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private String field2382;
   @OriginalMember(
      owner = "client!cg",
      name = "d",
      descriptor = "Lhw;"
   )
   private class141 field2386;
   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2388 = new String[]{method1384(method1383("{\u000b5+!")), method1384(method1383("{\u000b5S`v\u0005oQ!")), method1384(method1383("cB5At")), method1384(method1383("v\u0019w\u0003")), method1384(method1383("{\u000b5-!")), method1384(method1383("{\u000b5.!")), method1384(method1383("{\u000b5,!"))};
   @OriginalMember(
      owner = "client!cg",
      name = "i",
      descriptor = "I"
   )
   public static int field2381 = 0;
   @OriginalMember(
      owner = "client!cg",
      name = "f",
      descriptor = "I"
   )
   public static int field2385 = -2;
   @OriginalMember(
      owner = "client!cg",
      name = "g",
      descriptor = "Lkea;"
   )
   public static class248 field2383 = new class248("", 14);
   @OriginalMember(
      owner = "client!cg",
      name = "h",
      descriptor = "Lqda;"
   )
   public static class112 field2387 = new class112();
   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "I"
   )
   public static int field2379;
   @OriginalMember(
      owner = "client!cg",
      name = "e",
      descriptor = "I"
   )
   public static int field2380;
   @OriginalMember(
      owner = "client!cg",
      name = "b",
      descriptor = "I"
   )
   public static int field2384;

   @OriginalMember(
      owner = "client!cg",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1379(byte arg0) {
      try {
         ++field2379;
         if (this.field2386.method1320(this.field2382, 100)) {
            return 100;
         } else {
            if (arg0 <= 52) {
               this.field2382 = null;
            }

            return this.field2386.method1350(this.field2382, (byte)-58);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2388[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1380(boolean arg0) {
      try {
         field2383 = null;
         field2387 = null;
         if (!arg0) {
            field2381 = -96;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2388[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1381(int arg0, int arg1) {
      try {
         ++field2380;
         return arg1 != 100 ? 119 : arg0 & 127;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2388[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(B)Lpu;"
   )
   public final class586 method1382(byte arg0) {
      try {
         if (arg0 != 79) {
            method1380(false);
         }

         ++field2384;
         return class586.field8472;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2388[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "<init>",
      descriptor = "(Lhw;Ljava/lang/String;)V"
   )
   public class147(class141 arg0, String arg1) {
      try {
         this.field2382 = arg1;
         this.field2386 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2388[1] + (arg0 != null ? field2388[2] : field2388[3]) + ',' + (arg1 != null ? field2388[2] : field2388[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1383(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1384(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
