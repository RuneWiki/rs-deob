import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class188 {
   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2351 = new String[]{method1465(method1464("\u0002f =5N")), method1465(method1464("\u0002f =2N"))};
   @OriginalMember(
      owner = "client!dca",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field2344 = new class101(21, 4);
   @OriginalMember(
      owner = "client!dca",
      name = "f",
      descriptor = "I"
   )
   public static int field2348 = 0;
   @OriginalMember(
      owner = "client!dca",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2349 = new int[14];
   @OriginalMember(
      owner = "client!dca",
      name = "g",
      descriptor = "I"
   )
   public static int field2345;
   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "I"
   )
   public static int field2347;
   @OriginalMember(
      owner = "client!dca",
      name = "d",
      descriptor = "I"
   )
   public static int field2350;
   @OriginalMember(
      owner = "client!dca",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2346;

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Lvs;)V",
      line = 12
   )
   public static final void method1460(class616 arg0) {
      class261.field3550.method621(arg0.field9003, arg0.field8998 + (arg0.method11(0) >> 1), arg0.field9007, class638.field9292);
      arg0.field9006 = class638.field9292[0];
      arg0.field9001 = class638.field9292[1];
      arg0.field9000 = class638.field9292[2];
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(II)V",
      line = 19
   )
   public static final void method1461(int arg0, int arg1) {
      class193 var2 = null;

      for(int var3 = arg0; var3 < arg1; ++var3) {
         class293 var4 = class147.field1843[var3];
         if (var4 != null) {
            for(int var5 = 0; var5 < class220.field2796; ++var5) {
               for(int var6 = 0; var6 < class239.field3036; ++var6) {
                  var2 = var4.method779(var6, var5, var2);
                  if (var2 != null) {
                     int var7 = var6 << class459.field6950;
                     int var8 = var5 << class459.field6950;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        class293 var10 = class147.field1843[var9];
                        if (var10 != null) {
                           int var11 = var4.method2235(var5, 2116912585, var6) - var10.method2235(var5, 2116912585, var6);
                           int var12 = var4.method2235(var5, 2116912585, var6 + 1) - var10.method2235(var5, 2116912585, var6 + 1);
                           int var13 = var4.method2235(var5 + 1, 2116912585, var6 + 1) - var10.method2235(var5 + 1, 2116912585, var6 + 1);
                           int var14 = var4.method2235(var5 + 1, 2116912585, var6) - var10.method2235(var5 + 1, 2116912585, var6);
                           var10.method775(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Z)J",
      line = 88
   )
   public static final synchronized long method1462(boolean arg0) {
      try {
         ++field2345;
         long var1 = System.currentTimeMillis();
         if (!arg0) {
            field2348 = 71;
         }

         if (var1 < class27.field304) {
            class27.field303 += -var1 + class27.field304;
         }

         class27.field304 = var1;
         return var1 - -class27.field303;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2351[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(B)V",
      line = 112
   )
   public static void method1463(byte arg0) {
      try {
         if (arg0 < 73) {
            method1461(91, -111);
         }

         field2349 = null;
         field2344 = null;
         field2346 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2351[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1464(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1465(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
