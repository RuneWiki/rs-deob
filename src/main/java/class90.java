import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class90 {
   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field1214;
   @OriginalMember(
      owner = "client!jda",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field1217;
   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field1218;
   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1222 = new String[]{method841(method840("gpl\u0015_%")), method841(method840("gpl\u0015X%")), method841(method840("gpl\u0015Z%")), method841(method840("caaW")), method841(method840("gpl\u0015%dzdO'%")), method841(method840("v:#\u0015d")), method841(method840("gpl\u0015]%")), method841(method840("gpl\u0015\\%")), method841(method840("gpl\u0015[%"))};
   @OriginalMember(
      owner = "client!jda",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field1216 = new class418(63, -2);
   @OriginalMember(
      owner = "client!jda",
      name = "f",
      descriptor = "F"
   )
   public static float field1213;
   @OriginalMember(
      owner = "client!jda",
      name = "e",
      descriptor = "I"
   )
   public static int field1211;
   @OriginalMember(
      owner = "client!jda",
      name = "g",
      descriptor = "I"
   )
   public static int field1212;
   @OriginalMember(
      owner = "client!jda",
      name = "k",
      descriptor = "I"
   )
   public static int field1215;
   @OriginalMember(
      owner = "client!jda",
      name = "h",
      descriptor = "I"
   )
   public static int field1219;
   @OriginalMember(
      owner = "client!jda",
      name = "b",
      descriptor = "I"
   )
   public static int field1220;
   @OriginalMember(
      owner = "client!jda",
      name = "i",
      descriptor = "I"
   )
   public static int field1221;

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method834(byte arg0) {
      try {
         if (arg0 != -60) {
            field1213 = 2.3082626F;
         }

         field1216 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1222[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method835(int arg0) {
      boolean var1 = client.field1481;

      try {
         int var2 = 0;
         int var10000;
         if (var1) {
            var10000 = 0;
         } else if (class245.field3092.length <= var2) {
            var10000 = arg0;
            if (!var1) {
               if (arg0 > -85) {
                  field1213 = -1.9002753F;
               }

               ++field1211;
               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            label93: {
               int var3 = var10000;
               int var4;
               if (var1) {
                  var4 = 0;
                  if (var1) {
                     class245.field3092[var2][var3][var4] = 0;
                     ++var4;
                  }
               } else {
                  if (~var3 <= ~class245.field3092[0].length) {
                     break label93;
                  }

                  var4 = 0;
                  if (var1) {
                     class245.field3092[var2][var3][var4] = 0;
                     ++var4;
                  }
               }

               while(true) {
                  while(~class245.field3092[0][0].length < ~var4) {
                     class245.field3092[var2][var3][var4] = 0;
                     ++var4;
                  }

                  if (!var1) {
                     ++var3;
                     if (~var3 <= ~class245.field3092[0].length) {
                        break;
                     }

                     var4 = 0;
                     if (var1) {
                        class245.field3092[var2][var3][var4] = 0;
                        ++var4;
                     }
                  } else {
                     ++var4;
                  }
               }
            }

            ++var2;
            if (class245.field3092.length <= var2) {
               var10000 = arg0;
               if (!var1) {
                  if (arg0 > -85) {
                     field1213 = -1.9002753F;
                  }

                  ++field1211;
                  return;
               }
            } else {
               var10000 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1222[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method836(int arg0, int arg1) {
      try {
         ++field1215;
         if (arg0 > 0) {
            field1216 = null;
         }

         return ~arg1 == -16711936 ? -1 : class605.method4483(arg1, 256);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1222[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ZILid;I)V"
   )
   public static final void method837(boolean arg0, int arg1, class438 arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field1219;
         if (class652.field9742) {
            int var5 = 0;
            class541 var6 = (class541)arg2.field5971.method5265(-127);
            int var7;
            if (var4) {
               var7 = class653.method4796(var6, -1);
               if (~var5 > ~var7) {
                  var5 = var7;
               }

               var6 = (class541)arg2.field5971.method5266(false);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var5 += 8;
                  var10000 = arg2.field5970 * 16;
                  if (!var4) {
                     class779.field11362 = var10000 - -(class476.field6634 ? 26 : 22);
                     int var8 = arg2.field5970 * 16 + 21;
                     int var9 = class664.field9834 + class457.field6293;
                     if (var9 - -var5 > class204.field2605) {
                        var9 = -var5 + class664.field9834;
                     }

                     if (arg0) {
                        return;
                     }

                     if (~var9 > -1) {
                        var9 = 0;
                     }

                     int var10 = !class476.field6634 ? 31 : 33;
                     int var11 = arg1 + 13 - var10;
                     if (var8 + var11 > class91.field1242) {
                        var11 = -var8 + class91.field1242;
                     }

                     if (var11 < 0) {
                        var11 = 0;
                     }

                     class288.field3984 = var9;
                     class641.field9433 = arg2;
                     class387.field5356 = var5;
                     class169.field2203 = var11;
                     return;
                  }
               } else {
                  var10000 = class653.method4796(var6, -1);
               }

               var7 = var10000;
               if (~var5 > ~var7) {
                  var5 = var7;
               }

               var6 = (class541)arg2.field5971.method5266(false);
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field1222[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1222[5] : field1222[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method838(int arg0, int arg1, int arg2) {
      try {
         int var3 = 66 % ((arg2 - 50) / 60);
         ++field1220;
         return (arg0 & 32768) != 0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1222[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(ZLtk;Ltk;II)I"
   )
   public static final int method839(boolean arg0, class111 arg1, class111 arg2, int arg3, int arg4) {
      try {
         ++field1212;
         if (arg3 == arg4) {
            int var5 = arg1.field8331;
            int var6 = arg2.field8331;
            if (!arg0) {
               if (var6 == -1) {
                  var6 = 2001;
               }

               if (var5 == -1) {
                  var5 = 2001;
               }
            }

            return -var6 + var5;
         } else if (arg4 == 2) {
            return class676.method4945(arg2.method1003(-1).field5271, arg1.method1003(-1).field5271, class782.field11389, 12455);
         } else if (~arg4 == -4) {
            if (arg1.field1487.equals("-")) {
               if (arg2.field1487.equals("-")) {
                  return 0;
               } else {
                  return !arg0 ? 1 : -1;
               }
            } else if (arg2.field1487.equals("-")) {
               return !arg0 ? -1 : 1;
            } else {
               return class676.method4945(arg2.field1487, arg1.field1487, class782.field11389, 12455);
            }
         } else if (~arg4 == -5) {
            if (!arg1.method4251(arg3 + 9003)) {
               return !arg2.method4251(9004) ? 0 : -1;
            } else {
               return !arg2.method4251(9004) ? 1 : 0;
            }
         } else if (arg4 == 5) {
            if (arg1.method4256(0)) {
               return !arg2.method4256(0) ? 1 : 0;
            } else {
               return arg2.method4256(0) ? -1 : 0;
            }
         } else if (~arg4 == -7) {
            if (!arg1.method4255(arg3 ^ -114)) {
               return arg2.method4255(-123) ? -1 : 0;
            } else {
               return !arg2.method4255(48) ? 1 : 0;
            }
         } else if (~arg4 == -8) {
            if (arg1.method4250((byte)83)) {
               return arg2.method4250((byte)122) ? 0 : 1;
            } else {
               return arg2.method4250((byte)77) ? -1 : 0;
            }
         } else if (arg4 != 8) {
            return -arg2.field1488 + arg1.field1488;
         } else {
            int var7 = arg1.field1483;
            int var8 = arg2.field1483;
            if (arg0) {
               if (var8 == 1000) {
                  var8 = -1;
               }

               if (var7 != 1000) {
                  return -var8 + var7;
               }

               var7 = -1;
               if (!client.field1481) {
                  return -var8 + var7;
               }
            }

            if (var8 == -1) {
               var8 = 1000;
            }

            if (~var7 == 0) {
               var7 = 1000;
            }

            return -var8 + var7;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1222[6] + arg0 + ',' + (arg1 != null ? field1222[5] : field1222[3]) + ',' + (arg2 != null ? field1222[5] : field1222[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
   )
   public class90(String arg0, String arg1, String arg2) {
      try {
         this.field1214 = arg2;
         this.field1217 = arg0;
         this.field1218 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1222[4] + (arg0 != null ? field1222[5] : field1222[3]) + ',' + (arg1 != null ? field1222[5] : field1222[3]) + ',' + (arg2 != null ? field1222[5] : field1222[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method840(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method841(char[] arg0) {
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
            var10005 = 20;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
