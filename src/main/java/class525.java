import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class525 {
   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7634 = new String[]{method3873(method3872("a\u001d)CT")), method3873(method3872("a\u001d)AT")), method3873(method3872("a\u001d)FT")), method3873(method3872("v^),\u0001")), method3873(method3872("c\u0005kn")), method3873(method3872("a\u001d)GT")), method3873(method3872("a\u001d)@T"))};
   @OriginalMember(
      owner = "client!lm",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field7632 = new class101(93, 4);
   @OriginalMember(
      owner = "client!lm",
      name = "g",
      descriptor = "I"
   )
   public static int field7627;
   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "I"
   )
   public static int field7628;
   @OriginalMember(
      owner = "client!lm",
      name = "f",
      descriptor = "I"
   )
   public static int field7629;
   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "I"
   )
   public static int field7631;
   @OriginalMember(
      owner = "client!lm",
      name = "c",
      descriptor = "Leaa;"
   )
   public static class526 field7630;
   @OriginalMember(
      owner = "client!lm",
      name = "e",
      descriptor = "Log;"
   )
   public static class674 field7633;

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3867(int arg0) {
      try {
         field7630 = null;
         field7632 = null;
         field7633 = null;
         int var1 = -64 % ((-64 - arg0) / 40);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7634[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3868(int arg0) {
      try {
         ++field7631;
         int var1 = -34 % ((arg0 - 86) / 38);
         if (class352.field5348 != null) {
            class352.field5348 = null;
            class181.method1420((byte)-39, class501.field7452, class276.field3848, class164.field2062, class707.field10582);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7634[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(BI)Ljava/lang/String;"
   )
   public static final String method3869(byte arg0, int arg1) {
      try {
         if (arg0 != -120) {
            method3869((byte)27, -79);
         }

         ++field7627;
         return (arg1 >> 24 & 255) + "." + (arg1 >> 16 & 255) + "." + (arg1 >> 8 & 255) + "." + (arg1 & 255);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7634[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public static final void method3870(int arg0, class128 arg1) {
      int var2 = client.field4530;

      try {
         ++field7628;
         if (~(arg1.field1552.length - arg1.field1590) <= -2) {
            int var3 = arg1.method1104(255);
            if (var3 >= 0 && var3 <= 1) {
               if (~(arg1.field1552.length + -arg1.field1590) <= -3) {
                  if (arg0 != -23980) {
                     method3871(14, -23);
                  }

                  int var4 = arg1.method1038((byte)-99);
                  if (arg1.field1552.length - arg1.field1590 >= var4 * 6) {
                     int var5 = 0;
                     if (var2 != 0 || ~var4 < ~var5) {
                        do {
                           int var6 = arg1.method1038((byte)-120);
                           int var7 = arg1.method1041(arg0 ^ -20286);
                           if (~class732.field10855.length < ~var6) {
                              if (!class491.field7260[var6] && var2 == 0) {
                                 ++var5;
                              } else if (class622.field9071.method148(arg0 + 23858, var6).field1650 == '1') {
                                 if (var7 >= -1) {
                                    if (var7 > 1) {
                                       if (var2 != 0) {
                                          class732.field10855[var6] = var7;
                                          ++var5;
                                       } else {
                                          ++var5;
                                       }
                                    } else {
                                       class732.field10855[var6] = var7;
                                       ++var5;
                                    }
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 class732.field10855[var6] = var7;
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } while(~var4 < ~var5);

                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field7634[2] + arg0 + ',' + (arg1 != null ? field7634[3] : field7634[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3871(int arg0, int arg1) {
      try {
         ++field7629;
         if (arg1 != 0) {
            return false;
         } else {
            return arg0 == 0 || ~arg0 == -2 || ~arg0 == -3;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7634[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3872(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3873(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
