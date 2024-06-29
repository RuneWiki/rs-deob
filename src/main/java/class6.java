import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class6 {
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field38 = new String[]{method29(method28(" ~E'\u0010")), method29(method28(" ~E$\u0010")), method29(method28(" ~E\"\u0010")), method29(method28(")d\u000e\bR5")), method29(method28("=:EHE")), method29(method28("(a\u0007\n")), method29(method28(" ~E%\u0010"))};
   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "Lhka;"
   )
   public static class377 field33 = new class377(10, 2);
   @OriginalMember(
      owner = "client!fj",
      name = "e",
      descriptor = "I"
   )
   public static int field37 = 0;
   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "I"
   )
   public static int field32;
   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "I"
   )
   public static int field34;
   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "I"
   )
   public static int field35;
   @OriginalMember(
      owner = "client!fj",
      name = "f",
      descriptor = "[Lbaa;"
   )
   public static class109[] field36;

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(ZLjava/lang/String;IZLsu;)V"
   )
   public static final void method24(boolean arg0, String arg1, int arg2, boolean arg3, class289 arg4) {
      try {
         if (arg2 != 5857) {
            field37 = 27;
         }

         class78.method736(field38[3], arg0, 23902, arg4, arg3, arg1);
         ++field34;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field38[6] + arg0 + ',' + (arg1 != null ? field38[4] : field38[5]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field38[4] : field38[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method25(int arg0) {
      try {
         int var1 = 115 % ((14 - arg0) / 50);
         field33 = null;
         field36 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field38[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method26(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         ++field32;
         if (class450.field6888 != null) {
            if (arg0) {
               field33 = null;
            }

            label61: {
               int var4 = class13.field166;
               int var5 = class395.field6185;
               class214.method1864(arg1, (byte)7, arg2);
               if (class67.field883 != 0) {
                  if (~class67.field883 != -2 || class35.field423 != null && class13.field166 == var4 && class395.field6185 == var5) {
                     break label61;
                  }

                  class35.field423 = new class141[class395.field6185 * class13.field166];
                  int var6 = 0;
                  if (var3) {
                     class35.field423[var6] = class450.field6888.method609(class450.field6888.method620(class155.field2316, class37.field444), class450.field6888.method638(class155.field2316, class37.field444));
                     ++var6;
                  }

                  while(true) {
                     while(class35.field423.length > var6) {
                        class35.field423[var6] = class450.field6888.method609(class450.field6888.method620(class155.field2316, class37.field444), class450.field6888.method638(class155.field2316, class37.field444));
                        ++var6;
                     }

                     class456.field7001 = 1;
                     class276.field4410 = new int[class395.field6185 * class13.field166];
                     if (!var3) {
                        if (!var3) {
                           break label61;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               class595.field8748 = null;
               class595.field8748 = class450.field6888.method609(class450.field6888.method620(class790.field11557, class63.field837), class450.field6888.method638(class790.field11557, class63.field837));
            }

            class67.field884 = true;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field38[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1786;

      try {
         ++field35;
         int var9 = arg0 + arg7;
         int var10 = -arg0 + arg3;
         int var11 = arg7;
         if (var8) {
            class689.method5076(arg2, arg4, (byte)57, class512.field7820[arg7], arg6);
            var11 = arg7 + 1;
         }

         while(true) {
            int var10000;
            if (~var9 >= ~var11) {
               int var12 = arg2 - arg0;
               var10000 = arg5;
               if (!var8) {
                  if (arg5 != 0) {
                     field33 = null;
                  }

                  int var13 = arg3;
                  if (var8) {
                     class689.method5076(arg2, arg4, (byte)57, class512.field7820[arg3], arg6);
                     var13 = arg3 - 1;
                  }

                  while(true) {
                     while(~var13 < ~var10) {
                        class689.method5076(arg2, arg4, (byte)57, class512.field7820[var13], arg6);
                        --var13;
                     }

                     int var14 = arg0 + arg4;
                     int var15 = var9;
                     if (!var8) {
                        if (!var8 && var9 > var10) {
                           return;
                        }

                        do {
                           int[] var16 = class512.field7820[var15];
                           class689.method5076(var14, arg4, (byte)57, var16, arg6);
                           class689.method5076(var12, var14, (byte)57, var16, arg1);
                           class689.method5076(arg2, var12, (byte)57, var16, arg6);
                           ++var15;
                        } while(var15 <= var10);

                        return;
                     }

                     --var13;
                  }
               }
            } else {
               var10000 = arg2;
            }

            class689.method5076(var10000, arg4, (byte)57, class512.field7820[var11], arg6);
            ++var11;
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field38[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method28(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method29(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
