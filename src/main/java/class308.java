import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class308 {
   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4440 = new String[]{method2408(method2407("\u001di_\u0000O")), method2408(method2407("\u001di_\u0003O"))};
   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "Lgh;"
   )
   public static class572 field4436 = new class572(92, 6);
   @OriginalMember(
      owner = "client!tr",
      name = "d",
      descriptor = "Lega;"
   )
   public static class738 field4438 = new class738();
   @OriginalMember(
      owner = "client!tr",
      name = "b",
      descriptor = "I"
   )
   public static int field4437;
   @OriginalMember(
      owner = "client!tr",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field4439;

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Lvca;Z[[[BIB)Z"
   )
   public static final boolean method2404(class294 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!class53.field1099) {
         return false;
      } else {
         int var5 = arg0.field4101 >> class76.field1336;
         int var6 = var5;
         int var7 = arg0.field4096 >> class76.field1336;
         int var8 = var7;
         if (arg0 instanceof class144) {
            var6 = ((class144)arg0).field2356;
            var8 = ((class144)arg0).field2348;
            var5 = ((class144)arg0).field2354;
            var7 = ((class144)arg0).field2347;
         }

         for(int var9 = var5; var9 <= var6; ++var9) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (arg0.field4091 < class323.field4655 && var9 >= class474.field6928 && var9 < class62.field1162 && var10 >= class543.field7875 && var10 < class677.field9935) {
                  if ((arg2 == null || arg0.field4090 < arg3 || arg2[arg0.field4090][var9][var10] != arg4) && arg0.method1365(-1) && !arg0.method1362(0, class49.field1047)) {
                     return false;
                  }

                  if (!arg1 && var9 >= class566.field8206 - 16 && var9 <= class566.field8206 + 16 && var10 >= class115.field1864 - 16 && var10 <= class115.field1864 + 16) {
                     if (class593.field8538) {
                        class224.field3333[class114.field1841++].method2660((byte)73, arg0);
                        class114.field1841 %= class85.field1409;
                     } else {
                        arg0.method598(true, class49.field1047);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2405(int arg0) {
      try {
         int var1 = 97 / ((-38 - arg0) / 62);
         class252.field3606 = true;
         ++field4437;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4440[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2406(boolean arg0) {
      try {
         if (!arg0) {
            method2405(-86);
         }

         field4436 = null;
         field4438 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4440[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2407(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2408(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
