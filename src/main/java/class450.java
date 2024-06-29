import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class450 implements class191 {
   @OriginalMember(
      owner = "client!q",
      name = "i",
      descriptor = "Lvh;"
   )
   public class378 field6833;
   @OriginalMember(
      owner = "client!q",
      name = "j",
      descriptor = "Lwm;"
   )
   public class590 field6837;
   @OriginalMember(
      owner = "client!q",
      name = "h",
      descriptor = "I"
   )
   public int field6835;
   @OriginalMember(
      owner = "client!q",
      name = "d",
      descriptor = "I"
   )
   public int field6834;
   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "I"
   )
   public int field6842;
   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6844 = new String[]{method3397(method3396("N\u001e\u000eR")), method3397(method3396("D\u001eaT8")), method3397(method3396("N\u001es\u0013+VDqR")), method3397(method3396("QE#\u0016")), method3397(method3396("N\u001e\tR")), method3397(method3396("N\u001e\bR")), method3397(method3396("N\u001e\u0006R")), method3397(method3396("N\u001e\u0005R")), method3397(method3396("N\u001e\u0007R"))};
   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "Lwia;"
   )
   public static class791 field6839 = new class791(16);
   @OriginalMember(
      owner = "client!q",
      name = "l",
      descriptor = "[[B"
   )
   public static byte[][] field6840 = new byte[1000][];
   @OriginalMember(
      owner = "client!q",
      name = "e",
      descriptor = "I"
   )
   public static int field6831;
   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "I"
   )
   public static int field6832;
   @OriginalMember(
      owner = "client!q",
      name = "k",
      descriptor = "I"
   )
   public static int field6836;
   @OriginalMember(
      owner = "client!q",
      name = "m",
      descriptor = "I"
   )
   public static int field6838;
   @OriginalMember(
      owner = "client!q",
      name = "f",
      descriptor = "I"
   )
   public static int field6843;
   @OriginalMember(
      owner = "client!q",
      name = "g",
      descriptor = "Lat;"
   )
   public static class396 field6841;

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(ICZ)C",
      line = 4
   )
   public static final char method3391(int arg0, char arg1, boolean arg2) {
      try {
         ++field6831;
         if (~arg1 <= -193 && ~arg1 >= -256) {
            if (arg1 >= 192 && ~arg1 >= -199) {
               return 'A';
            }

            if (arg1 == 199) {
               return 'C';
            }

            if (arg1 >= 200 && ~arg1 >= -204) {
               return 'E';
            }

            if (arg1 >= 204 && ~arg1 >= -208) {
               return 'I';
            }

            if (arg1 >= 210 && arg1 <= 214) {
               return 'O';
            }

            if (arg1 >= 217 && ~arg1 >= -221) {
               return 'U';
            }

            if (~arg1 == -222) {
               return 'Y';
            }

            if (arg1 == 223) {
               return 's';
            }

            if (~arg1 <= -225 && ~arg1 >= -231) {
               return 'a';
            }

            if (arg1 == 231) {
               return 'c';
            }

            if (~arg1 <= -233 && arg1 <= 235) {
               return 'e';
            }

            if (~arg1 <= -237 && ~arg1 >= -240) {
               return 'i';
            }

            if (~arg1 <= -243 && ~arg1 >= -247) {
               return 'o';
            }

            if (arg1 >= 249 && arg1 <= 252) {
               return 'u';
            }

            if (~arg1 == -254 || arg1 == 255) {
               return 'y';
            }
         }

         if (arg1 == 338) {
            return 'O';
         } else if (!arg2) {
            return (char)65487;
         } else if (arg1 == 339) {
            return 'o';
         } else if (arg1 == 376) {
            return 'Y';
         } else {
            return arg1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6844[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(I)Loi;",
      line = 85
   )
   public class79 method1311(int arg0) {
      try {
         ++field6843;
         return arg0 > -106 ? null : class362.field5454;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6844[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "(I)V",
      line = 104
   )
   public static void method3392(int arg0) {
      try {
         field6839 = null;
         field6840 = null;
         field6841 = null;
         if (arg0 != 1) {
            field6839 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6844[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "(I)V",
      line = 122
   )
   public static final void method3393(int arg0) {
      try {
         ++field6838;
         if (arg0 == -237) {
            if (!class231.field2938) {
               class231.field2938 = true;
               class186.field2333 += (-class186.field2333 + 12.0F) / 2.0F;
               class630.field9159 = true;
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6844[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(B)V",
      line = 145
   )
   public static final void method3394(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field6836;
         if (class547.field8113) {
            if (arg0 != -115) {
               field6840 = null;
            }

            do {
               while(~class433.field6609.length < ~class42.field458) {
                  class21 var2 = class433.field6609[class42.field458];
                  if (var2 == null || ~var2.field228 != 0) {
                     ++class42.field458;
                     if (var1 == 0) {
                        continue;
                     }
                  }

                  if (class339.field5143 == null) {
                     class339.field5143 = class351.field5316.method5174(var2.field226, arg0 + 69);
                  }

                  int var3 = class339.field5143.field6133;
                  if (var3 == -1) {
                     return;
                  }

                  ++class42.field458;
                  class339.field5143 = null;
                  var2.field228 = var3;
               }
            } while(var1 != 0);

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6844[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "<init>",
      descriptor = "(ILwm;Lvh;II)V",
      line = 186
   )
   public class450(int arg0, class590 arg1, class378 arg2, int arg3, int arg4) {
      try {
         this.field6833 = arg2;
         this.field6837 = arg1;
         this.field6835 = arg0;
         this.field6834 = arg4;
         this.field6842 = arg3;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6844[2] + arg0 + ',' + (arg1 != null ? field6844[1] : field6844[3]) + ',' + (arg2 != null ? field6844[1] : field6844[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(ILlw;I[I)V",
      line = 198
   )
   public static final void method3395(int arg0, class687 arg1, int arg2, int[] arg3) {
      int var4 = client.field4530;

      try {
         int var5 = 1 % ((57 - arg2) / 36);
         if (arg1.field6101 != null) {
            int var10000;
            label94: {
               byte var6 = 1;
               int var7 = 0;
               if (var4 != 0) {
                  var10000 = arg3[var7];
               } else if (arg1.field6101.length <= var7) {
                  var10000 = var6;
                  if (var4 == 0) {
                     break label94;
                  }
               } else {
                  var10000 = arg3[var7];
               }

               label93:
               do {
                  while(true) {
                     if (var10000 != arg1.field6101[var7]) {
                        var6 = 0;
                        if (var4 == 0) {
                           var10000 = var6;
                           break;
                        }

                        ++var7;
                     } else {
                        ++var7;
                     }

                     if (arg1.field6101.length <= var7) {
                        var10000 = var6;
                        if (var4 == 0) {
                           break label93;
                        }
                     } else {
                        var10000 = arg3[var7];
                     }
                  }
               } while(var4 != 0);
            }

            if (var10000 != 0 && ~arg1.field6072 != 0) {
               class676 var8 = class576.field8554.method3189(arg1.field6072, (byte)-84);
               int var9 = var8.field10152;
               if (var9 == 1) {
                  arg1.field6045 = 1;
                  arg1.field6043 = 0;
                  arg1.field6030 = 0;
                  arg1.field6053 = 0;
                  arg1.field6092 = arg0;
                  if (!arg1.field6025) {
                     class718.method5194(arg1, arg1.field6043, var8, true);
                  }
               }

               if (~var9 == -3) {
                  arg1.field6030 = 0;
               }
            }
         }

         ++field6832;
         byte var10 = 1;
         int var11 = 0;
         if (var4 != 0) {
            if (arg3[var11] != -1) {
               var10 = 0;
            }
         } else if (~arg3.length >= ~var11) {
            if (var4 == 0) {
               if (var10 != 0) {
                  arg1.field6101 = arg3;
                  arg1.field6092 = arg0;
                  return;
               }

               return;
            }

            if (var10 != -1) {
               var10 = 0;
            }
         } else if (arg3[var11] != -1) {
            var10 = 0;
         }

         while(true) {
            while(true) {
               if (arg1.field6101 != null && arg1.field6101[var11] != -1 && class576.field8554.method3189(arg3[var11], (byte)-117).field10162 < class576.field8554.method3189(arg1.field6101[var11], (byte)-67).field10162) {
                  ++var11;
                  break;
               }

               arg1.field6101 = arg3;
               arg1.field6092 = arg0;
               if (var4 != 0) {
                  ++var11;
                  break;
               }

               if (var4 == 0) {
                  if (var10 != 0) {
                     arg1.field6101 = arg3;
                     arg1.field6092 = arg0;
                     return;
                  }

                  return;
               }

               if (var10 != -1) {
                  var10 = 0;
               }
            }

            if (~arg3.length >= ~var11) {
               if (var4 == 0) {
                  if (var10 != 0) {
                     arg1.field6101 = arg3;
                     arg1.field6092 = arg0;
                     return;
                  }

                  return;
               }

               if (var10 != -1) {
                  var10 = 0;
               }
            } else if (arg3[var11] != -1) {
               var10 = 0;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6844[6] + arg0 + ',' + (arg1 != null ? field6844[1] : field6844[3]) + ',' + arg2 + ',' + (arg3 != null ? field6844[1] : field6844[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3396(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3397(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
