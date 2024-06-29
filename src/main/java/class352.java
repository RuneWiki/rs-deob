import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class352 {
   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4736 = new String[]{method2572(method2571("-1]}")), method2572(method2571("8j\u001f?\u0018")), method2572(method2571("3&P?'k")), method2572(method2571("3&P?$k")), method2572(method2571("3&P?&k")), method2572(method2571("3&P?!k")), method2572(method2571("\u000b-Uu\u0000-iDb\u0000"))};
   @OriginalMember(
      owner = "client!pba",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field4728 = new int[1024];
   @OriginalMember(
      owner = "client!pba",
      name = "d",
      descriptor = "Lll;"
   )
   public static class387 field4734 = new class387();
   @OriginalMember(
      owner = "client!pba",
      name = "c",
      descriptor = "I"
   )
   public static int field4729;
   @OriginalMember(
      owner = "client!pba",
      name = "f",
      descriptor = "I"
   )
   public static int field4730;
   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "I"
   )
   public static int field4732;
   @OriginalMember(
      owner = "client!pba",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4731;
   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field4733;
   @OriginalMember(
      owner = "client!pba",
      name = "g",
      descriptor = "[Lbg;"
   )
   public static class492[] field4735;

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(Lbl;I)Ljava/lang/String;",
      line = 7
   )
   public static final String method2567(class678 arg0, int arg1) {
      try {
         ++field4729;
         if (~client.method2351(arg0).method2167((byte)-111) == -1) {
            return null;
         } else if (arg0.field9989 != null && ~arg0.field9989.trim().length() != -1) {
            if (arg1 != 2) {
               field4734 = null;
            }

            return arg0.field9989;
         } else {
            return class661.field9629 ? field4736[6] : null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4736[5] + (arg0 != null ? field4736[1] : field4736[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "(I)V",
      line = 34
   )
   public static final void method2568(int arg0) {
      try {
         class450.field6385 = 200;
         class338.field4605 = (int)((double)class644.field9403 * 34.46D);
         ++field4732;
         if (arg0 != 0) {
            method2567((class678)null, 2);
         }

         class338.field4605 <<= 2;
         if (class383.field5543.method507()) {
            class338.field4605 += 512;
         }

         class123.method995(-2, false);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4736[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(I)V",
      line = 54
   )
   public static void method2569(int arg0) {
      try {
         field4731 = null;
         field4733 = null;
         field4734 = null;
         field4728 = null;
         field4735 = null;
         if (arg0 != 32352) {
            method2568(38);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4736[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(Ljava/lang/String;Lkf;ZB)Lrf;",
      line = 79
   )
   public static final class92 method2570(String arg0, class266 arg1, boolean arg2, byte arg3) {
      boolean var4 = client.field4360;

      try {
         ++field4730;
         int var5 = arg1.method2031(0, arg0);
         if (~var5 == 0) {
            return new class92(0);
         } else {
            int[] var6 = arg1.method2028((byte)-120, var5);
            class92 var7 = new class92(var6.length);
            if (arg3 > -97) {
               return null;
            } else {
               int var8 = 0;
               int var9 = 0;
               class147 var10;
               int var11;
               int var12;
               int var13;
               if (var4) {
                  var10 = new class147(arg1.method2037(false, var6[var9++], var5));
                  var11 = var10.method1164(19693);
                  var12 = var10.method1211(-26166);
                  var13 = var10.method1143(-15465);
                  if (!arg2) {
                     if (~var13 == -2) {
                        --var7.field1198;
                        if (var4) {
                           var7.field1196[var8] = var11;
                           var7.field1200[var8] = var12;
                           ++var8;
                        }
                     } else {
                        var7.field1196[var8] = var11;
                        var7.field1200[var8] = var12;
                        ++var8;
                     }
                  } else {
                     var7.field1196[var8] = var11;
                     var7.field1200[var8] = var12;
                     ++var8;
                  }
               }

               do {
                  while(~var8 > ~var7.field1198) {
                     var10 = new class147(arg1.method2037(false, var6[var9++], var5));
                     var11 = var10.method1164(19693);
                     var12 = var10.method1211(-26166);
                     var13 = var10.method1143(-15465);
                     if (!arg2) {
                        if (~var13 == -2) {
                           --var7.field1198;
                           if (var4) {
                              var7.field1196[var8] = var11;
                              var7.field1200[var8] = var12;
                              ++var8;
                           }
                        } else {
                           var7.field1196[var8] = var11;
                           var7.field1200[var8] = var12;
                           ++var8;
                        }
                     } else {
                        var7.field1196[var8] = var11;
                        var7.field1200[var8] = var12;
                        ++var8;
                     }
                  }
               } while(var4);

               return var7;
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field4736[2] + (arg0 != null ? field4736[1] : field4736[0]) + ',' + (arg1 != null ? field4736[1] : field4736[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2571(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2572(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
