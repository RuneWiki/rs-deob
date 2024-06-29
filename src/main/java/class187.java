import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class187 {
   @OriginalMember(
      owner = "client!aba",
      name = "d",
      descriptor = "I"
   )
   public int field2338 = 0;
   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2343 = new String[]{method1459(method1458(";3pwer")), method1459(method1458("!\u007f?wY")), method1459(method1458(";3pwgr")), method1459(method1458("4$}5")), method1459(method1458(";3pwfr"))};
   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field2340 = new class101(38, 4);
   @OriginalMember(
      owner = "client!aba",
      name = "c",
      descriptor = "I"
   )
   public static int field2339;
   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "I"
   )
   public static int field2342;
   @OriginalMember(
      owner = "client!aba",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2341;

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 14
   )
   public final void method1455(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field2339;

         while(true) {
            int var4 = arg0.method1104(255);
            if (~var4 != -1) {
               this.method1457(var4, true, arg0);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            if (arg1 != -1) {
               field2340 = null;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2343[4] + (arg0 != null ? field2343[1] : field2343[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(B)V",
      line = 37
   )
   public static void method1456(byte arg0) {
      try {
         field2341 = null;
         if (arg0 <= 17) {
            method1456((byte)-23);
         }

         field2340 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2343[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(IZLjj;)V",
      line = 48
   )
   private final void method1457(int arg0, boolean arg1, class128 arg2) {
      try {
         if (arg1) {
            if (arg0 == 5) {
               this.field2338 = arg2.method1038((byte)-109);
            }

            ++field2342;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2343[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2343[1] : field2343[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1458(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1459(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
