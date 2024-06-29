import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class463 implements class677 {
   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "Lke;"
   )
   private class333 field6737;
   @OriginalMember(
      owner = "client!jda",
      name = "l",
      descriptor = "[Lwha;"
   )
   private class534[] field6733;
   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6746 = new String[]{method3572(method3571("'}h%\u0012e")), method3572(method3571("'}h%\u0010e")), method3572(method3571("'}h%\u0011e")), method3572(method3571("'}h%\u0016e")), method3572(method3571("'}h%\u001de")), method3572(method3571("#leg")), method3572(method3571("'}h%i$w`\u007fke")), method3572(method3571("67'%(")), method3572(method3571("'}h%\u0013e")), method3572(method3571("'}h%\u001ce")), method3572(method3571("'}h%\u001fe")), method3572(method3571("'}h%\u0017e")), method3572(method3571("\bVO")), method3572(method3571("'}h%\u0014e"))};
   @OriginalMember(
      owner = "client!jda",
      name = "p",
      descriptor = "Lfm;"
   )
   public static class164 field6734 = new class164(74, 0);
   @OriginalMember(
      owner = "client!jda",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field6742 = new int[250];
   @OriginalMember(
      owner = "client!jda",
      name = "h",
      descriptor = "Lhha;"
   )
   public static class724 field6741 = new class724(135, -2);
   @OriginalMember(
      owner = "client!jda",
      name = "n",
      descriptor = "I"
   )
   public static int field6744 = 2;
   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "Ljga;"
   )
   public static class91 field6743 = null;
   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field6745 = false;
   @OriginalMember(
      owner = "client!jda",
      name = "s",
      descriptor = "I"
   )
   public static int field6726;
   @OriginalMember(
      owner = "client!jda",
      name = "i",
      descriptor = "I"
   )
   public static int field6727;
   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "I"
   )
   public static int field6728;
   @OriginalMember(
      owner = "client!jda",
      name = "q",
      descriptor = "I"
   )
   public static int field6730;
   @OriginalMember(
      owner = "client!jda",
      name = "g",
      descriptor = "I"
   )
   public static int field6731;
   @OriginalMember(
      owner = "client!jda",
      name = "k",
      descriptor = "I"
   )
   public static int field6735;
   @OriginalMember(
      owner = "client!jda",
      name = "j",
      descriptor = "I"
   )
   public static int field6736;
   @OriginalMember(
      owner = "client!jda",
      name = "e",
      descriptor = "I"
   )
   public static int field6738;
   @OriginalMember(
      owner = "client!jda",
      name = "r",
      descriptor = "I"
   )
   public static int field6739;
   @OriginalMember(
      owner = "client!jda",
      name = "f",
      descriptor = "I"
   )
   public static int field6740;
   @OriginalMember(
      owner = "client!jda",
      name = "t",
      descriptor = "Lha;"
   )
   private class17 field6732;
   @OriginalMember(
      owner = "client!jda",
      name = "o",
      descriptor = "Z"
   )
   private boolean field6729;

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1093(int arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6740;
         boolean var9 = true;
         if (arg0 != 7496) {
            method3570(106, false, -120);
         }

         class534[] var4 = this.field6733;
         int var5 = 0;
         if (!var3 && var4.length <= var5) {
            this.field6729 = false;
         } else {
            do {
               class534 var6 = var4[var5];
               if (var6 != null) {
                  var6.method983(!var9 ? this.field6729 : true, -72);
                  ++var5;
               } else {
                  ++var5;
               }
            } while(var4.length > var5);

            this.field6729 = false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6746[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3567(int arg0) {
      try {
         field6734 = null;
         field6741 = null;
         if (arg0 != -1) {
            method3569(112);
         }

         field6743 = null;
         field6742 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6746[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "(I)Loea;"
   )
   public static final class647 method3568(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field6735;
         class610 var2 = null;
         class647 var3 = new class647(class343.field5054, arg0);

         try {
            class92 var4 = class720.field10318.method877(true, 108, "");
            if (var1) {
               class97.method968(32353, 1L);
            }

            while(true) {
               int var10000;
               if (var4.field1526 != 0) {
                  var10000 = var4.field1526;
                  if (!var1) {
                     if (var10000 == 1) {
                        var2 = (class610)var4.field1525;
                        byte[] var5 = new byte[(int)var2.method4495(1191)];
                        int var6 = 0;
                        if (var1 || var5.length > var6) {
                           do {
                              int var7 = var2.method4492(9236, var5.length + -var6, var6, var5);
                              if (~var7 == 0) {
                                 throw new IOException(field6746[12]);
                              }

                              var6 += var7;
                           } while(var5.length > var6);
                        }

                        var3 = new class647(new class65(var5), class343.field5054, 0);
                     }
                     break;
                  }
               } else {
                  var10000 = 32353;
               }

               class97.method968(var10000, 1L);
            }
         } catch (Exception var10) {
         }

         try {
            if (var2 != null) {
               var2.method4494((byte)77);
            }
         } catch (Exception var9) {
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field6746[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method3569(int arg0) {
      try {
         ++field6731;
         if (class589.field8273 != arg0) {
            class629.method4616(6798, -1, -1, false, class589.field8273);
            class589.field8273 = -1;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6746[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method3570(int arg0, boolean arg1, int arg2) {
      try {
         ++field6730;
         class360 var3 = !arg1 ? class143.field2276 : class724.field10354;
         if (var3 != null && arg2 >= 0 && ~arg2 > ~var3.field5329) {
            class622 var4 = var3.field5311[arg2];
            if (var4.field8883 == -1) {
               String var5 = var4.field8891;
               class242 var6 = class735.method5318(-112);
               int var7 = 80 % ((37 - arg0) / 57);
               class381 var8 = class801.method5775(class174.field2593, 0, var6.field3718);
               var8.field5570.method656((byte)-119, class519.method3880(false, var5) + 3);
               var8.field5570.method656((byte)-114, arg1 ? 1 : 0);
               var8.field5570.method653(arg2, -85);
               var8.field5570.method658(var5, -38);
               var6.method2111(14024, var8);
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6746[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1095(byte arg0) {
      try {
         ++field6738;
         int var2 = 112 / ((-1 - arg0) / 43);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6746[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "<init>",
      descriptor = "(Lke;Llfa;)V"
   )
   public class463(class333 param1, class667 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1103(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (class54.field794 != this.field6732) {
            this.field6729 = true;
            this.field6732 = class54.field794;
         }

         ++field6736;
         this.field6732.method184(0);
         class534[] var3 = this.field6733;
         if (arg0 <= -125) {
            int var4 = 0;
            if (var2 || var4 < var3.length) {
               do {
                  class534 var5 = var3[var4];
                  if (var5 != null) {
                     var5.method988((byte)98);
                  }

                  ++var4;
               } while(var4 < var3.length);

            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6746[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1094(int arg0) {
      try {
         ++field6726;
         if (arg0 != -5230) {
            this.field6732 = null;
         }

         return this.field6737.field4947;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6746[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ZJ)Z"
   )
   public final boolean method1096(boolean arg0, long arg1) {
      try {
         ++field6739;
         if (!arg0) {
            this.method1103(114);
         }

         return ~class604.method4452(103) <= ~(arg1 - -((long)this.field6737.field4949));
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6746[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1092(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field6727;
         int var3 = 0;
         class534[] var4 = this.field6733;
         int var5 = 0;
         class534 var6;
         if (arg0 != -14458) {
            field6741 = null;
            if (var2) {
               var6 = var4[var5];
               if (var6 != null) {
                  if (var6.method984(81)) {
                     ++var3;
                     ++var5;
                  } else {
                     ++var5;
                  }
               } else {
                  ++var3;
                  ++var5;
               }
            }
         }

         while(~var5 > ~var4.length) {
            var6 = var4[var5];
            if (var6 != null) {
               if (var6.method984(81)) {
                  ++var3;
                  ++var5;
               } else {
                  ++var5;
               }
            } else {
               ++var3;
               ++var5;
            }
         }

         return var3 * 100 / this.field6733.length;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6746[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3571(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3572(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
