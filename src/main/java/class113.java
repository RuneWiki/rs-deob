import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class113 {
   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1422 = new String[]{method922(method921("\u0013u\u0016\u000eYJ")), method922(method921("\u0013u\u0016\u000eZJ"))};
   @OriginalMember(
      owner = "client!qda",
      name = "b",
      descriptor = "I"
   )
   public static int field1419 = 0;
   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "I"
   )
   public static int field1420;
   @OriginalMember(
      owner = "client!qda",
      name = "c",
      descriptor = "I"
   )
   public static int field1421;

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(IB)I",
      line = 11
   )
   public static final int method919(int arg0, byte arg1) {
      try {
         ++field1420;
         int var2 = arg0 & 63;
         int var3 = (arg0 & 246) >> 6;
         if (~var2 == -19) {
            if (~var3 == -1) {
               return 1;
            }

            if (~var3 == -2) {
               return 2;
            }

            if (~var3 == -3) {
               return 4;
            }

            if (~var3 == -4) {
               return 8;
            }
         } else if (var2 == 19 || ~var2 == -22) {
            if (var3 == 0) {
               return 16;
            }

            if (~var3 == -2) {
               return 32;
            }

            if (~var3 == -3) {
               return 64;
            }

            if (~var3 == -4) {
               return 128;
            }
         }

         int var4 = -43 / ((arg1 - -35) / 47);
         return 0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1422[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 70
   )
   public static final void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         if (arg5 != 30399) {
            method920(91, -37, 61, -23, -43, 81);
         }

         if (~class699.field10237 <= ~arg3 && class245.field3374 <= arg0) {
            label168: {
               boolean var7;
               label157: {
                  if (arg2 < class457.field6528) {
                     arg2 = class457.field6528;
                     var7 = false;
                     if (!var6) {
                        break label157;
                     }
                  }

                  if (~class348.field4702 > ~arg2) {
                     var7 = false;
                     arg2 = class348.field4702;
                     if (!var6) {
                        break label157;
                     }
                  }

                  var7 = true;
               }

               boolean var8;
               label158: {
                  if (~arg4 > ~class457.field6528) {
                     var8 = false;
                     arg4 = class457.field6528;
                     if (!var6) {
                        break label158;
                     }
                  }

                  if (~class348.field4702 <= ~arg4) {
                     var8 = true;
                     if (!var6) {
                        break label158;
                     }
                  }

                  var8 = false;
                  arg4 = class348.field4702;
               }

               label131: {
                  if (arg3 >= class245.field3374) {
                     class149.method1249(arg5 ^ -30394, arg2, arg1, class341.field4631[arg3++], arg4);
                     if (!var6) {
                        break label131;
                     }
                  }

                  arg3 = class245.field3374;
               }

               label126: {
                  if (class699.field10237 >= arg0) {
                     class149.method1249(-7, arg2, arg1, class341.field4631[arg0--], arg4);
                     if (!var6) {
                        break label126;
                     }
                  }

                  arg0 = class699.field10237;
               }

               if (!var7 || !var8) {
                  if (var7) {
                     int var9 = arg3;
                     if (var6) {
                        class341.field4631[arg3][arg2] = arg1;
                        var9 = arg3 + 1;
                     }

                     while(true) {
                        while(~var9 >= ~arg0) {
                           class341.field4631[var9][arg2] = arg1;
                           ++var9;
                        }

                        if (!var6) {
                           if (!var6) {
                              break label168;
                           }
                           break;
                        }

                        ++var9;
                     }
                  }

                  if (!var8) {
                     break label168;
                  }

                  int var10 = arg3;
                  if (var6) {
                     class341.field4631[arg3][arg4] = arg1;
                     var10 = arg3 + 1;
                  }

                  while(true) {
                     while(var10 <= arg0) {
                        class341.field4631[var10][arg4] = arg1;
                        ++var10;
                     }

                     if (!var6) {
                        if (!var6) {
                           break label168;
                        }
                        break;
                     }

                     ++var10;
                  }
               }

               int var11 = arg3;
               if (var6 || ~arg0 <= ~arg3) {
                  do {
                     int[] var12 = class341.field4631[var11];
                     var12[arg2] = var12[arg4] = arg1;
                     ++var11;
                  } while(~arg0 <= ~var11);
               }
            }
         }

         ++field1421;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field1422[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
