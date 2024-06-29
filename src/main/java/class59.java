import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class59 extends class690 {
   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field629 = new String[]{method447(method446("y$\u001d}")), method447(method446("a6_Rk")), method447(method446("l\u007f_?>")), method447(method446("a6_Wk")), method447(method446("a6_Uk")), method447(method446("a6_Pk")), method447(method446("a6_Tk")), method447(method446("a6_Sk"))};
   @OriginalMember(
      owner = "client!vg",
      name = "r",
      descriptor = "Lou;"
   )
   public static class635 field623 = new class635();
   @OriginalMember(
      owner = "client!vg",
      name = "s",
      descriptor = "I"
   )
   public static int field621;
   @OriginalMember(
      owner = "client!vg",
      name = "m",
      descriptor = "I"
   )
   public static int field622;
   @OriginalMember(
      owner = "client!vg",
      name = "q",
      descriptor = "I"
   )
   public static int field624;
   @OriginalMember(
      owner = "client!vg",
      name = "u",
      descriptor = "I"
   )
   public static int field626;
   @OriginalMember(
      owner = "client!vg",
      name = "o",
      descriptor = "I"
   )
   public static int field627;
   @OriginalMember(
      owner = "client!vg",
      name = "p",
      descriptor = "I"
   )
   private int field628;
   @OriginalMember(
      owner = "client!vg",
      name = "v",
      descriptor = "J"
   )
   private long field625;
   @OriginalMember(
      owner = "client!vg",
      name = "t",
      descriptor = "Lfea;"
   )
   public static class151 field619;
   @OriginalMember(
      owner = "client!vg",
      name = "n",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field620;

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method442(int arg0) {
      try {
         field623 = null;
         field619 = null;
         field620 = null;
         if (arg0 != -20049) {
            field619 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field629[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method443(byte arg0) {
      try {
         int var1 = -104 % ((42 - arg0) / 56);
         ++field621;
         class347.field4975.method4245(true);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field629[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         arg1.method1175(this.field628, this.field625, (byte)96);
         ++field627;
         if (arg0) {
            field619 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field629[1] + arg0 + ',' + (arg1 != null ? field629[2] : field629[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         ++field622;
         this.field628 = arg0.method4302(true);
         this.field625 = arg0.method4304((byte)-90);
         if (arg1 > -19) {
            field620 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field629[4] + (arg0 != null ? field629[2] : field629[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(Ljava/lang/String;IILjava/lang/String;)V"
   )
   public static final void method444(String arg0, int arg1, int arg2, String arg3) {
      try {
         if (arg1 <= -57) {
            class766.field11046 = arg2;
            class604.field8418 = class605.field8474;
            class619.field8658 = 2;
            ++field626;
            class396.method3008(false, arg3, (byte)-86, false, arg0);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field629[3] + (arg0 != null ? field629[2] : field629[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field629[2] : field629[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public static final void method445(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      boolean var5 = client.field4273;

      try {
         ++field624;
         class225 var8;
         if (arg3 != 8 && arg3 != 16) {
            var8 = class111.field1404[arg0][arg1][arg2];
            if (var8 != null) {
               label135: {
                  if (~arg3 != -2) {
                     if (~arg3 != -3) {
                        break label135;
                     }

                     var8.field2827 = 0;
                     if (!var5) {
                        break label135;
                     }
                  }

                  var8.field2819 = 0;
               }
            }

            class685.method5008(0);
         } else {
            int var6 = 0;
            if (!var5 && ~class28.field350 >= ~var6) {
               if (var5) {
                  var8 = class111.field1404[arg0][arg1][arg2];
                  if (var8 != null) {
                     label136: {
                        if (~arg3 != -2) {
                           if (~arg3 != -3) {
                              break label136;
                           }

                           var8.field2827 = 0;
                           if (!var5) {
                              break label136;
                           }
                        }

                        var8.field2819 = 0;
                     }
                  }

                  class685.method5008(0);
               }
            } else {
               while(true) {
                  class777 var7 = class397.field5579[var6];
                  if (var7.field11296 == arg3 && ~var7.field11310 == ~arg1 && ~var7.field11299 == ~arg2 || ~var7.field11304 == ~arg1 && ~var7.field11299 == ~arg2) {
                     if (class28.field350 != var6) {
                        class714.method5193(class397.field5579, var6 + 1, class397.field5579, var6, class397.field5579.length - 1 - var6);
                     }

                     --class28.field350;
                     return;
                  }

                  ++var6;
                  if (~class28.field350 >= ~var6) {
                     if (!var5) {
                        break;
                     }

                     var8 = class111.field1404[arg0][arg1][arg2];
                     if (var8 != null) {
                        label137: {
                           if (~arg3 != -2) {
                              if (~arg3 != -3) {
                                 break label137;
                              }

                              var8.field2827 = 0;
                              if (!var5) {
                                 break label137;
                              }
                           }

                           var8.field2819 = 0;
                        }
                     }

                     class685.method5008(0);
                     break;
                  }
               }
            }
         }

         if (arg4 > -58) {
            method445(43, -105, 118, -26, (byte)88);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field629[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method446(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method447(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
