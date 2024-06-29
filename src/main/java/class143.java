import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class143 extends class247 {
   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2279 = new String[]{method1426(method1425("W@\u0000$O")), method1426(method1425("W@\u0000%O")), method1426(method1425("W@\u0000+O"))};
   @OriginalMember(
      owner = "client!sc",
      name = "o",
      descriptor = "Lvja;"
   )
   public static class414 field2275 = new class414(0, -1);
   @OriginalMember(
      owner = "client!sc",
      name = "n",
      descriptor = "Lhha;"
   )
   public static class724 field2277 = new class724(89, 2);
   @OriginalMember(
      owner = "client!sc",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field2278 = new class724(27, 1);
   @OriginalMember(
      owner = "client!sc",
      name = "m",
      descriptor = "I"
   )
   public static int field2273;
   @OriginalMember(
      owner = "client!sc",
      name = "p",
      descriptor = "I"
   )
   public static int field2274;
   @OriginalMember(
      owner = "client!sc",
      name = "l",
      descriptor = "Ltea;"
   )
   public static class272 field2272;
   @OriginalMember(
      owner = "client!sc",
      name = "j",
      descriptor = "Lhka;"
   )
   public static class360 field2276;

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(IB)Lfia;"
   )
   public static final class351 method1422(int arg0, byte arg1) {
      try {
         ++field2274;
         class351 var2 = (class351)class662.field9322.method1041((long)arg0, 8);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class237.field3666.method460((byte)-11, arg0, 0);
            class351 var4 = new class351();
            if (var3 != null) {
               var4.method2772((byte)66, new class65(var3));
            }

            var4.method2768(arg1 ^ -32014);
            class662.field9322.method1050(-91, var4, (long)arg0);
            if (arg1 != 47) {
               field2272 = null;
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2279[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(B)I"
   )
   public abstract int method500(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1423(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         byte var3;
         label31: {
            ++field2273;
            if (arg1 >= arg0) {
               if (~arg0 >= -5001) {
                  if (arg0 > 2000) {
                     class542.method4042(arg1 ^ 12000);
                     var3 = 2;
                     if (!var2) {
                        break label31;
                     }
                  }

                  class194.method1708(true, 0);
                  var3 = 1;
                  if (!var2) {
                     break label31;
                  }
               }

               class156.method1491(1);
               var3 = 3;
               if (!var2) {
                  break label31;
               }
            }

            var3 = 4;
            class664.method4828(true);
         }

         if (~class476.field6870.field9109.method4676(arg1 ^ -11905) != -3) {
            class476.field6870.method4707(2, false, class476.field6870.field9103);
            class508.method3828(arg1 + -11999, false, 2);
         }

         class737.method5332(arg1 ^ 12000);
         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2279[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method502(int arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "c",
      descriptor = "(B)J"
   )
   public abstract long method501(byte arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "b",
      descriptor = "(Z)I"
   )
   public abstract int method504(boolean arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1424(byte arg0) {
      try {
         field2272 = null;
         field2276 = null;
         field2277 = null;
         int var1 = -126 % ((62 - arg0) / 33);
         field2275 = null;
         field2278 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2279[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sc",
      name = "a",
      descriptor = "(Z)I"
   )
   public abstract int method503(boolean arg0);

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1425(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1426(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
