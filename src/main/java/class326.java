import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class326 {
   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4630 = new String[]{method2464(method2463("<ZfcS\u007f")), method2464(method2463("9Dk!")), method2464(method2463(",\u001f)cl")), method2464(method2463("<ZfcP\u007f"))};
   @OriginalMember(
      owner = "client!kka",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field4628 = new int[]{28, 35, 40, 44};
   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "I"
   )
   public static int field4627;
   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "I"
   )
   public static int field4629;

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2461(byte arg0) {
      try {
         if (arg0 != -3) {
            field4628 = null;
         }

         field4628 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4630[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(ILvw;)V"
   )
   public static final void method2462(int arg0, class319 arg1) {
      int var2 = client.field4530;

      try {
         ++field4627;
         arg1.field4565 = null;
         int var3 = arg1.field4560.length;
         int var4 = 0;
         if (var2 != 0) {
            arg1.field4560[var4].field9523 = false;
            ++var4;
         }

         while(true) {
            while(var4 < var3) {
               arg1.field4560[var4].field9523 = false;
               ++var4;
            }

            if (var2 == 0) {
               if (arg0 != -201) {
                  field4628 = null;
               }

               class14[] var5 = class751.field11113;
               synchronized(class751.field11113) {
                  if (class751.field11113.length > var3 && ~class130.field1614[var3] > -201) {
                     class751.field11113[var3].method100(arg1, 1);
                     int var10002 = class130.field1614[var3]++;
                  }

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4630[0] + arg0 + ',' + (arg1 != null ? field4630[2] : field4630[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2463(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2464(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
