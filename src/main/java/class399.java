import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class399 {
   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6253 = new String[]{method3222(method3221("K\u001bC\u0003B")), method3222(method3221("K\u001bC\u0002B")), method3222(method3221("G\u001f\u0001,")), method3222(method3221("K\u001bC\u0001B")), method3222(method3221("RDCn\u0017"))};
   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6250 = new int[1000];
   @OriginalMember(
      owner = "client!bq",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field6248 = new class498(130, 1);
   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "I"
   )
   public static int field6252 = 0;
   @OriginalMember(
      owner = "client!bq",
      name = "d",
      descriptor = "I"
   )
   public static int field6249;
   @OriginalMember(
      owner = "client!bq",
      name = "e",
      descriptor = "I"
   )
   public static int field6251;

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3218(byte arg0) {
      try {
         class304 var1 = class670.field9994;
         synchronized(class670.field9994) {
            class670.field9994.method2551(true);
         }

         ++field6249;
         class304 var2 = class357.field5503;
         synchronized(class357.field5503) {
            if (arg0 == 86) {
               class357.field5503.method2551(true);
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6253[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method3219(int arg0, class610 arg1) {
      try {
         ++field6251;
         int var2 = -8 / ((arg0 - 55) / 42);
         if (~class655.field9789 != ~class476.field7251.field1506) {
            if (class711.field10694 != null) {
               if (class548.method4165(class476.field7251.field1506, arg1, (byte)127)) {
                  class655.field9789 = class476.field7251.field1506;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6253[3] + arg0 + ',' + (arg1 != null ? field6253[4] : field6253[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3220(byte arg0) {
      try {
         field6248 = null;
         field6250 = null;
         if (arg0 != -58) {
            field6248 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6253[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3221(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3222(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
