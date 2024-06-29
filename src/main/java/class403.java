import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class403 {
   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5940 = new String[]{method3151(method3150("(k8+5p")), method3151(method3150("#/w+\t")), method3151(method3150("6t5i")), method3151(method3150("(k8+0p")), method3151(method3150("(k8+6p")), method3151(method3150("(k8+7p"))};
   @OriginalMember(
      owner = "client!pja",
      name = "c",
      descriptor = "Lfm;"
   )
   public static class164 field5936 = new class164(13, 7);
   @OriginalMember(
      owner = "client!pja",
      name = "b",
      descriptor = "I"
   )
   public static int field5935;
   @OriginalMember(
      owner = "client!pja",
      name = "d",
      descriptor = "I"
   )
   public static int field5937;
   @OriginalMember(
      owner = "client!pja",
      name = "e",
      descriptor = "I"
   )
   public static int field5938;
   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "I"
   )
   public static int field5939;

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3146(byte arg0) {
      boolean var1 = client.field10022;

      try {
         if (arg0 > -127) {
            field5936 = null;
         }

         class238 var2 = (class238)class801.field11657.method2245((byte)-94);
         if (!var1 && var2 == null) {
            ++field5939;
         } else {
            do {
               class364 var3 = var2.field3675;
               var3.method2862((byte)-125, class327.field4859);
               if (!var3.method2861(0)) {
                  if (var3.method2860(0)) {
                     class575.method4259(var3, true);
                     if (var1) {
                        var2.method2140((byte)102);
                        var3.method2857((byte)88);
                     }
                  }
               } else {
                  var2.method2140((byte)102);
                  var3.method2857((byte)88);
               }

               var2 = (class238)class801.field11657.method2239((byte)107);
            } while(var2 != null);

            ++field5939;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5940[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lsa;ZI)Lma;"
   )
   public static final class148 method3147(class39 arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            field5936 = null;
         }

         ++field5937;
         class148 var3 = (class148)class366.field5423.method1041((long)arg2, 8);
         if (var3 == null) {
            label27: {
               if (!class78.field1243) {
                  var3 = class119.method1186(arg0.method449(arg2, (byte)-62), 116);
                  if (!client.field10022) {
                     break label27;
                  }
               }

               var3 = class54.field794.method187(class433.method3371(arg0, arg2), true);
            }

            class366.field5423.method1050(-94, var3, (long)arg2);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5940[3] + (arg0 != null ? field5940[1] : field5940[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3148(int arg0) {
      try {
         field5936 = null;
         if (arg0 != 1) {
            field5936 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5940[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(II)J"
   )
   public static final long method3149(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            method3149(-39, 91);
         }

         ++field5935;
         return (long)(arg1 + 11745) * 86400000L;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5940[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3150(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3151(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
