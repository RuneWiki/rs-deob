import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class543 {
   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8177 = new String[]{method4148(method4147(">X/G\u001fu")), method4148(method4147("&\u001e`G ")), method4148(method4147("3E\"\u0005")), method4148(method4147(">X/G\u001cu"))};
   @OriginalMember(
      owner = "client!cha",
      name = "b",
      descriptor = "I"
   )
   public static int field8175;
   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "I"
   )
   public static int field8176;

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;"
   )
   public static final String method4145(int arg0, int arg1, int arg2, String[] arg3) {
      boolean var4 = client.field1786;

      try {
         ++field8175;
         if (arg0 == 0) {
            return "";
         } else if (arg0 == 1) {
            String var5 = arg3[arg2];
            return var5 == null ? field8177[2] : var5.toString();
         } else {
            int var6 = arg0 + arg2;
            int var7 = arg1;
            int var8 = arg2;
            if (var4 || ~var6 < ~arg2) {
               do {
                  String var9 = arg3[var8];
                  if (var9 == null) {
                     var7 += 4;
                     if (var4) {
                        var7 += var9.length();
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var7 += var9.length();
                     ++var8;
                  }
               } while(~var6 < ~var8);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = arg2;
            String var10000;
            if (var4) {
               var10000 = arg3[arg2];
            } else if (~arg2 <= ~var6) {
               var10000 = var10.toString();
               if (!var4) {
                  return var10000;
               }
            } else {
               var10000 = arg3[arg2];
            }

            while(true) {
               String var12 = var10000;
               if (var12 != null) {
                  var10.append(var12);
                  if (var4) {
                     var10.append(field8177[2]);
                     ++var11;
                  } else {
                     ++var11;
                  }
               } else {
                  var10.append(field8177[2]);
                  ++var11;
               }

               if (~var11 <= ~var6) {
                  var10000 = var10.toString();
                  if (!var4) {
                     return var10000;
                  }
               } else {
                  var10000 = arg3[var11];
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field8177[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8177[1] : field8177[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(IIIBI)V"
   )
   public static final void method4146(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         ++field8176;
         class190 var8;
         if (~arg0 != -9 && ~arg0 != -17) {
            var8 = class711.field10694[arg2][arg1][arg4];
            if (var8 != null) {
               label134: {
                  if (~arg0 != -2) {
                     if (arg0 != 2) {
                        break label134;
                     }

                     var8.field2957 = 0;
                     if (!var5) {
                        break label134;
                     }
                  }

                  var8.field2958 = 0;
               }
            }

            class500.method3881(-22);
         } else {
            int var6 = 0;
            if (!var5 && var6 >= class711.field10691) {
               if (var5) {
                  var8 = class711.field10694[arg2][arg1][arg4];
                  if (var8 != null) {
                     label135: {
                        if (~arg0 != -2) {
                           if (arg0 != 2) {
                              break label135;
                           }

                           var8.field2957 = 0;
                           if (!var5) {
                              break label135;
                           }
                        }

                        var8.field2958 = 0;
                     }
                  }

                  class500.method3881(-22);
               }
            } else {
               while(true) {
                  class409 var7 = class293.field4646[var6];
                  if (~var7.field6375 == ~arg0 && var7.field6373 == arg1 && var7.field6377 == arg4 || ~var7.field6366 == ~arg1 && var7.field6377 == arg4) {
                     if (~class711.field10691 != ~var6) {
                        class107.method1022(class293.field4646, var6 - -1, class293.field4646, var6, class293.field4646.length + -1 + -var6);
                     }

                     --class711.field10691;
                     return;
                  }

                  ++var6;
                  if (var6 >= class711.field10691) {
                     if (!var5) {
                        break;
                     }

                     var8 = class711.field10694[arg2][arg1][arg4];
                     if (var8 != null) {
                        label136: {
                           if (~arg0 != -2) {
                              if (arg0 != 2) {
                                 break label136;
                              }

                              var8.field2957 = 0;
                              if (!var5) {
                                 break label136;
                              }
                           }

                           var8.field2958 = 0;
                        }
                     }

                     class500.method3881(-22);
                     break;
                  }
               }
            }
         }

         if (arg3 < -9) {
            ;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field8177[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4147(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4148(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
