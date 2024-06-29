import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class542 extends class22 {
   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7866 = new String[]{method4059(method4058("'y'z\u007f")), method4059(method4058("4!'\u0010*")), method4059(method4058("!zeR")), method4059(method4058("'y'|\u007f")), method4059(method4058("'y'\u007f\u007f")), method4059(method4058("'y'}\u007f"))};
   @OriginalMember(
      owner = "client!hv",
      name = "k",
      descriptor = "Lhm;"
   )
   public static class230 field7860 = new class230(0, 2, 2, 1);
   @OriginalMember(
      owner = "client!hv",
      name = "m",
      descriptor = "I"
   )
   public int field7857;
   @OriginalMember(
      owner = "client!hv",
      name = "s",
      descriptor = "I"
   )
   public static int field7858;
   @OriginalMember(
      owner = "client!hv",
      name = "n",
      descriptor = "I"
   )
   public int field7861;
   @OriginalMember(
      owner = "client!hv",
      name = "o",
      descriptor = "I"
   )
   public static int field7862;
   @OriginalMember(
      owner = "client!hv",
      name = "j",
      descriptor = "I"
   )
   public static int field7864;
   @OriginalMember(
      owner = "client!hv",
      name = "p",
      descriptor = "Lkk;"
   )
   public class200 field7859;
   @OriginalMember(
      owner = "client!hv",
      name = "q",
      descriptor = "Lqba;"
   )
   public static class423 field7856;
   @OriginalMember(
      owner = "client!hv",
      name = "r",
      descriptor = "Luw;"
   )
   public class435 field7865;
   @OriginalMember(
      owner = "client!hv",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field7863;

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(I)V",
      line = 9
   )
   public static void method4054(int arg0) {
      try {
         if (arg0 == 4) {
            field7860 = null;
            field7856 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7866[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 27
   )
   public static final void method4055(String arg0, int arg1) {
      try {
         if (arg1 != 6653) {
            method4054(126);
         }

         ++field7862;
         class304.field4406 = arg0;
         class588.field8497 = class304.field4406.length();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7866[3] + (arg0 != null ? field7866[1] : field7866[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(ZILjava/lang/String;)V",
      line = 39
   )
   public static final void method4056(boolean arg0, int arg1, String arg2) {
      boolean var3 = client.field4564;

      try {
         ++field7864;
         if (arg2 != null) {
            if (~class791.field11564 <= -101) {
               class126.method1228(class100.field1638.method961(class385.field5684, true), (byte)123, 4);
            } else {
               if (arg1 != 4) {
                  field7863 = false;
               }

               String var4 = class496.method3743(arg2, false);
               if (var4 != null) {
                  int var5 = 0;
                  if (var3 || ~class791.field11564 < ~var5) {
                     do {
                        String var6 = class496.method3743(class306.field4428[var5], false);
                        if (var6 != null && var6.equals(var4)) {
                           class126.method1228(arg2 + class100.field1639.method961(class385.field5684, true), (byte)125, 4);
                           return;
                        }

                        if (class497.field7272[var5] != null) {
                           String var7 = class496.method3743(class497.field7272[var5], false);
                           if (var7 != null && var7.equals(var4)) {
                              class126.method1228(arg2 + class100.field1639.method961(class385.field5684, true), (byte)-17, 4);
                              return;
                           }
                        }

                        ++var5;
                     } while(~class791.field11564 < ~var5);
                  }

                  int var8 = 0;
                  String var9;
                  String var10;
                  if (var3) {
                     var9 = class496.method3743(class670.field9809[var8], false);
                     if (var9 != null && var9.equals(var4)) {
                        class126.method1228(class100.field1644.method961(class385.field5684, true) + arg2 + class100.field1645.method961(class385.field5684, true), (byte)127, 4);
                        return;
                     }

                     if (class269.field3809[var8] != null) {
                        var10 = class496.method3743(class269.field3809[var8], false);
                        if (var10 != null && var10.equals(var4)) {
                           class126.method1228(class100.field1644.method961(class385.field5684, true) + arg2 + class100.field1645.method961(class385.field5684, true), (byte)124, 4);
                           return;
                        }
                     }

                     ++var8;
                  }

                  while(true) {
                     String var10000;
                     if (~class128.field2146 >= ~var8) {
                        var10000 = class496.method3743(class304.field4398.field6665, false);
                        if (!var3) {
                           if (var10000.equals(var4)) {
                              class126.method1228(class100.field1641.method961(class385.field5684, true), (byte)127, 4);
                              return;
                           }

                           ++class497.field7268;
                           class542 var11 = class549.method4093((byte)-113, class624.field9089, class126.field2108);
                           var11.field7859.method3571(255, class70.method747(arg2, -9) + 1);
                           var11.field7859.method3546((byte)-112, arg2);
                           var11.field7859.method3571(arg1 ^ 251, !arg0 ? 0 : 1);
                           class740.method5332(var11, (byte)77);
                           return;
                        }
                     } else {
                        var10000 = class496.method3743(class670.field9809[var8], false);
                     }

                     var9 = var10000;
                     if (var9 != null && var9.equals(var4)) {
                        class126.method1228(class100.field1644.method961(class385.field5684, true) + arg2 + class100.field1645.method961(class385.field5684, true), (byte)127, 4);
                        return;
                     }

                     if (class269.field3809[var8] != null) {
                        var10 = class496.method3743(class269.field3809[var8], false);
                        if (var10 != null && var10.equals(var4)) {
                           class126.method1228(class100.field1644.method961(class385.field5684, true) + arg2 + class100.field1645.method961(class385.field5684, true), (byte)124, 4);
                           return;
                        }
                     }

                     ++var8;
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field7866[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7866[1] : field7866[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(I)V",
      line = 137
   )
   public final void method4057(int arg0) {
      try {
         ++field7858;
         if (class710.field10321.length > class494.field7227) {
            class710.field10321[class494.field7227++] = this;
            int var2 = 19 / ((31 - arg0) / 54);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7866[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4058(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4059(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
