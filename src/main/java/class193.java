import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class193 extends class70 {
   @OriginalMember(
      owner = "client!r",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2427 = new String[]{method1488(method1487(":b3F")), method1488(method1487(":b1F")), method1488(method1487(":b2F"))};
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "I"
   )
   public static int field2424;
   @OriginalMember(
      owner = "client!r",
      name = "x",
      descriptor = "I"
   )
   public static int field2425;
   @OriginalMember(
      owner = "client!r",
      name = "y",
      descriptor = "[Lgb;"
   )
   public static class224[] field2426;

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method1484(int arg0, boolean arg1) {
      int var2 = client.field4530;

      try {
         ++field2424;
         if (arg0 == 8) {
            if (arg1) {
               if (class198.field2452 != -1) {
                  class777.method5594(class198.field2452, 118);
               }

               int var10000;
               label59: {
                  class624 var3 = (class624)class573.field8525.method5677((byte)44);
                  if (var2 != 0) {
                     var10000 = var3.method2716(0);
                  } else if (var3 == null) {
                     class198.field2452 = -1;
                     class573.field8525 = new class791(8);
                     class357.method2787(-17687);
                     class198.field2452 = class314.field4492;
                     class520.method3833(false, (byte)-79);
                     class491.method3635((byte)-19);
                     var10000 = class198.field2452;
                     if (var2 == 0) {
                        break label59;
                     }
                  } else {
                     var10000 = var3.method2716(0);
                  }

                  label58:
                  do {
                     while(true) {
                        if (var10000 == 0) {
                           var3 = (class624)class573.field8525.method5677((byte)44);
                           if (var3 == null) {
                              if (var2 == 0) {
                                 class198.field2452 = -1;
                                 class573.field8525 = new class791(8);
                                 class357.method2787(-17687);
                                 class198.field2452 = class314.field4492;
                                 class520.method3833(false, (byte)-79);
                                 class491.method3635((byte)-19);
                                 var10000 = class198.field2452;
                                 break;
                              }

                              class217.method1640(var3, (byte)18, true, false);
                              var3 = (class624)class573.field8525.method5671(106);
                           } else {
                              class217.method1640(var3, (byte)18, true, false);
                              var3 = (class624)class573.field8525.method5671(106);
                           }
                        } else {
                           class217.method1640(var3, (byte)18, true, false);
                           var3 = (class624)class573.field8525.method5671(106);
                        }

                        if (var3 == null) {
                           class198.field2452 = -1;
                           class573.field8525 = new class791(8);
                           class357.method2787(-17687);
                           class198.field2452 = class314.field4492;
                           class520.method3833(false, (byte)-79);
                           class491.method3635((byte)-19);
                           var10000 = class198.field2452;
                           if (var2 == 0) {
                              break label58;
                           }
                        } else {
                           var10000 = var3.method2716(0);
                        }
                     }
                  } while(var2 != 0);
               }

               class265.method2014(var10000);
            }

            class721.field10733 = true;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2427[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1485(byte arg0) {
      try {
         if (arg0 != 67) {
            method1485((byte)39);
         }

         field2426 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2427[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method1486(long arg0, int arg1) {
      try {
         ++field2425;

         try {
            Thread.sleep(arg0);
         } catch (InterruptedException var4) {
         }

         if (arg1 > -109) {
            field2426 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2427[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
