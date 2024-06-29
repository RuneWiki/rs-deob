import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class284 {
   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3968 = new String[]{method2216(method2215("\u001a?\u00149 ")), method2216(method2215("\u001a?\u00148 ")), method2216(method2215("\u001a?\u0014; "))};
   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field3961 = new class435(18, 6);
   @OriginalMember(
      owner = "client!kg",
      name = "f",
      descriptor = "I"
   )
   public static int field3964 = 0;
   @OriginalMember(
      owner = "client!kg",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field3965 = new class572(43, 4);
   @OriginalMember(
      owner = "client!kg",
      name = "c",
      descriptor = "I"
   )
   public static int field3966 = 0;
   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "Lgh;"
   )
   public static class572 field3967 = new class572(62, 10);
   @OriginalMember(
      owner = "client!kg",
      name = "e",
      descriptor = "I"
   )
   public static int field3962;
   @OriginalMember(
      owner = "client!kg",
      name = "g",
      descriptor = "I"
   )
   public static int field3963;

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2212(int arg0, boolean arg1) {
      try {
         ++field3962;
         int var2 = class670.field9752;
         int var3 = class431.field6248;
         if (arg1 && class679.field9962) {
            var2 <<= 1;
            var3 = -var2;
         }

         class444.field6473.method296(var3, var2);
         if (arg0 != 12639) {
            field3965 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3968[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2213(int arg0) {
      try {
         field3967 = null;
         field3965 = null;
         if (arg0 == 18) {
            field3961 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3968[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2214(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field3963;
         if (class398.field5860) {
            int var2 = 32 % ((arg0 - -68) / 40);

            do {
               while(class771.field11308.length > class567.field8227) {
                  class203 var3 = class771.field11308[class567.field8227];
                  if (var3 == null || var3.field3037 != -1) {
                     ++class567.field8227;
                     if (!var1) {
                        continue;
                     }
                  }

                  if (class448.field6540 == null) {
                     class448.field6540 = class692.field10150.method5415(var3.field3033, false);
                  }

                  int var4 = class448.field6540.field1487;
                  if (~var4 == 0) {
                     return;
                  }

                  var3.field3037 = var4;
                  ++class567.field8227;
                  class448.field6540 = null;
               }
            } while(var1);

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3968[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2215(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2216(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
