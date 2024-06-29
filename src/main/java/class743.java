import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class743 extends class72 {
   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10867 = new String[]{method5394(method5393("t\u001a2\u001c")), method5394(method5393("aAp^\b")), method5394(method5393("i\u0001p7]")), method5394(method5393("i\u0001p9]")), method5394(method5393("i\u0001p8]")), method5394(method5393("i\u0001p4]"))};
   @OriginalMember(
      owner = "client!sn",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field10861 = false;
   @OriginalMember(
      owner = "client!sn",
      name = "d",
      descriptor = "I"
   )
   public static int field10865 = 0;
   @OriginalMember(
      owner = "client!sn",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field10863 = false;
   @OriginalMember(
      owner = "client!sn",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field10862 = new class418(21, -1);
   @OriginalMember(
      owner = "client!sn",
      name = "k",
      descriptor = "I"
   )
   public static int field10858;
   @OriginalMember(
      owner = "client!sn",
      name = "i",
      descriptor = "I"
   )
   public static int field10859;
   @OriginalMember(
      owner = "client!sn",
      name = "h",
      descriptor = "I"
   )
   public static int field10864;
   @OriginalMember(
      owner = "client!sn",
      name = "g",
      descriptor = "I"
   )
   public static int field10866;
   @OriginalMember(
      owner = "client!sn",
      name = "j",
      descriptor = "[[I"
   )
   public static int[][] field10860;

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method5389(byte arg0, class479 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10859;
         int var3 = 0;
         int var4 = 0;
         if (arg0 >= 50) {
            if (class28.field416) {
               var3 = class356.method2825(0);
               var4 = class465.method3538(-26506);
            }

            int var5;
            int var6;
            int var7;
            int var8;
            byte var9;
            int var10;
            int var11;
            int var10000;
            label233: {
               var5 = class664.field9834 + var3;
               var6 = class338.field4629 + var4;
               var7 = class457.field6293;
               var8 = class99.field1314 + -3;
               var9 = 20;
               class1.method3(class457.field6293, arg1, class664.field9834 + var3, class99.field1314, class606.field8927.method4490(class782.field11389, -16777216), class338.field4629 + var4, (byte)-96, var9);
               var10 = class372.field5216.method1570(29658) + var3;
               var11 = var4 + class372.field5216.method1566(0);
               if (!class341.field4710) {
                  int var12 = 0;
                  class541 var13 = (class541)class500.field6967.method288(0);
                  if (var2 || var13 != null) {
                     do {
                        int var14 = var6 - (-((-var12 + -1 + class455.field6279) * 16) + -13) + var9;
                        ++var12;
                        if (~var10 < ~(class664.field9834 + var3) && ~var10 > ~(class457.field6293 + var3 + class664.field9834) && var14 - 13 < var11 && var11 < var14 + 4 && var13.field7904) {
                           arg1.method513(class664.field9834 + var3, var14 - 12, class457.field6293, 16, class168.field2194 | -class111.field1490 + 255 << 24, 1);
                        }

                        var13 = (class541)class500.field6967.method290(17958);
                     } while(var13 != null);
                  }

                  if (!var2) {
                     break label233;
                  }
               }

               int var15 = 0;
               class438 var16 = (class438)class723.field10572.method5265(-128);
               if (var2 || var16 != null) {
                  do {
                     int var17 = var6 + var9 + 13 - -(var15 * 16);
                     if (var10 > class664.field9834 + var3 && ~(class664.field9834 + var3 + class457.field6293) < ~var10 && var17 + -13 < var11 && ~var11 > ~(var17 - -4) && (var16.field5970 > 1 || ((class541)var16.field5971.field10622.field272).field7904)) {
                        arg1.method513(class664.field9834 + var3, var17 + -12, class457.field6293, 16, -class111.field1490 + 255 << 24 | class168.field2194, 1);
                     }

                     ++var15;
                     var16 = (class438)class723.field10572.method5266(false);
                  } while(var16 != null);
               }

               if (class641.field9433 != null) {
                  label169: {
                     class1.method3(class387.field5356, arg1, class288.field3984, class779.field11362, class641.field9433.field5962, class169.field2203, (byte)-32, var9);
                     int var18 = 0;
                     class541 var19 = (class541)class641.field9433.field5971.method5265(-125);
                     if (var2) {
                        var10000 = class169.field2203 - -(var18 * 16) + var9 + 13;
                     } else if (var19 == null) {
                        var10000 = 107;
                        if (!var2) {
                           break label169;
                        }
                     } else {
                        var10000 = class169.field2203 - -(var18 * 16) + var9 + 13;
                     }

                     while(true) {
                        int var20 = var10000;
                        ++var18;
                        if (~class288.field3984 > ~var10 && ~var10 > ~(class387.field5356 + class288.field3984) && ~(var20 + -13) > ~var11 && ~var11 > ~(var20 + 4) && var19.field7904) {
                           arg1.method513(class288.field3984, var20 + -12, class387.field5356, 16, -class111.field1490 + 255 << 24 | class168.field2194, 1);
                        }

                        var19 = (class541)class641.field9433.field5971.method5266(false);
                        if (var19 == null) {
                           var10000 = 107;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = class169.field2203 - -(var18 * 16) + var9 + 13;
                        }
                     }
                  }

                  class538.method4078((byte)var10000, arg1, class288.field3984, class387.field5356, class169.field2203, var9, class779.field11362);
               }
            }

            label221: {
               class538.method4078((byte)118, arg1, class664.field9834 + var3, class457.field6293, class338.field4629 - -var4, var9, class99.field1314);
               if (class341.field4710) {
                  int var21 = 0;
                  class438 var22 = (class438)class723.field10572.method5265(-125);
                  if (var2 || var22 != null) {
                     do {
                        label145: {
                           int var23 = var21 * 16 + (var4 + 13 + class338.field4629 - -var9);
                           ++var21;
                           if (~var22.field5970 != -2) {
                              class329.method2612(arg1, -16777216 | class541.field7916, class99.field1314, -16777216 | class93.field1260, var22, var10, -87, class457.field6293, var11, var23, class664.field9834 + var3, class338.field4629 + var4);
                              if (!var2) {
                                 break label145;
                              }
                           }

                           class789.method5680(class664.field9834 + var3, var11, var23, class338.field4629 + var4, arg1, class457.field6293, true, -16777216 | class541.field7916, -16777216 | class93.field1260, class99.field1314, var10, (class541)var22.field5971.field10622.field272);
                        }

                        var22 = (class438)class723.field10572.method5266(false);
                     } while(var22 != null);
                  }

                  if (class641.field9433 == null) {
                     break label221;
                  }

                  int var10001;
                  int var10002;
                  label132: {
                     int var24 = 0;
                     class541 var25 = (class541)class641.field9433.field5971.method5265(-126);
                     if (var2) {
                        var10000 = class169.field2203 + 13 - -var9;
                        var10001 = 16;
                        var10002 = var24;
                     } else if (var25 == null) {
                        var10000 = class169.field2203;
                        var10001 = class288.field3984;
                        var10002 = 21273;
                        if (!var2) {
                           break label132;
                        }
                     } else {
                        var10000 = class169.field2203 + 13 - -var9;
                        var10001 = 16;
                        var10002 = var24;
                     }

                     while(true) {
                        int var26 = var10000 - -(var10001 * var10002);
                        class789.method5680(class288.field3984, var11, var26, class169.field2203, arg1, class387.field5356, true, class541.field7916 | -16777216, class93.field1260 | -16777216, class779.field11362, var10, var25);
                        ++var24;
                        var25 = (class541)class641.field9433.field5971.method5266(false);
                        if (var25 == null) {
                           var10000 = class169.field2203;
                           var10001 = class288.field3984;
                           var10002 = 21273;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = class169.field2203 + 13 - -var9;
                           var10001 = 16;
                           var10002 = var24;
                        }
                     }
                  }

                  class538.method4077(var10000, var10001, var10002, class779.field11362, class387.field5356);
                  if (!var2) {
                     break label221;
                  }
               }

               int var27 = 0;
               class541 var28 = (class541)class500.field6967.method288(0);
               if (var2 || var28 != null) {
                  do {
                     int var29 = var6 - (-var9 + -13) - -((class455.field6279 - 1 + -var27) * 16);
                     class789.method5680(var5, var11, var29, var6, arg1, var7, true, class541.field7916 | -16777216, class93.field1260 | -16777216, var8, var10, var28);
                     ++var27;
                     var28 = (class541)class500.field6967.method290(17958);
                  } while(var28 != null);
               }
            }

            class538.method4077(class338.field4629 - -var4, class664.field9834 + var3, 21273, class99.field1314, class457.field6293);
         }
      } catch (RuntimeException var31) {
         throw class93.method866(var31, field10867[5] + arg0 + ',' + (arg1 != null ? field10867[1] : field10867[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(I)Lph;"
   )
   public abstract class789 method1100(int arg0);

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method5390(byte arg0, boolean arg1) {
      try {
         class757.field11093.method5438(true, class757.field11093.field10983, 0);
         ++field10866;
         class757.field11093.method5438(true, class757.field11093.field10978, 0);
         class757.field11093.method5438(true, class757.field11093.field11004, 1);
         class757.field11093.method5438(true, class757.field11093.field11018, 1);
         class757.field11093.method5438(true, class757.field11093.field11011, 0);
         class757.field11093.method5438(true, class757.field11093.field10999, 0);
         class757.field11093.method5438(true, class757.field11093.field10967, 0);
         class757.field11093.method5438(true, class757.field11093.field10987, 0);
         class757.field11093.method5438(true, class757.field11093.field10998, 0);
         class757.field11093.method5438(true, class757.field11093.field11015, 0);
         class757.field11093.method5438(true, class757.field11093.field11003, 0);
         class757.field11093.method5438(true, class757.field11093.field10973, 0);
         class757.field11093.method5438(true, class757.field11093.field11016, 0);
         class757.field11093.method5438(true, class757.field11093.field11005, 0);
         class757.field11093.method5438(true, class757.field11093.field11019, 0);
         class757.field11093.method5438(true, class757.field11093.field10969, 0);
         class757.field11093.method5438(true, class757.field11093.field10972, 0);
         class757.field11093.method5438(true, class757.field11093.field11009, 0);
         class757.field11093.method5438(true, class757.field11093.field11000, 0);
         class315.method2498((byte)110);
         class757.field11093.method5438(true, class757.field11093.field11010, 2);
         class757.field11093.method5438(true, class757.field11093.field10966, 1);
         class281.method2266(true);
         if (arg0 <= 13) {
            method5391(-88);
         }

         class274.method2167(-1662);
         class187.field2382 = true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10867[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5391(int arg0) {
      try {
         field10862 = null;
         if (arg0 > 8) {
            field10860 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10867[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(IIIII[BI)Z"
   )
   public static final boolean method5392(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         int var9;
         label84: {
            ++field10858;
            int var8 = arg1 % arg4;
            if (var8 == 0) {
               var9 = 0;
               if (!var7) {
                  break label84;
               }
            }

            var9 = -var8 + arg4;
         }

         int var10 = -((arg2 + arg4 + -1) / arg4);
         int var11 = -((arg1 + arg4 + -1) / arg4);
         if (arg6 != 255) {
            field10865 = 44;
         }

         int var12 = var10;
         int var10000;
         if (var7) {
            var10000 = var11;
         } else if (var10 >= 0) {
            var10000 = 0;
            if (!var7) {
               return false;
            }
         } else {
            var10000 = var11;
         }

         while(true) {
            int var13 = var10000;
            if (var7) {
               if (~arg5[arg0] == -1) {
                  return true;
               }

               arg0 += arg4;
               ++var13;
            }

            while(true) {
               byte var10001;
               if (~var13 <= -1) {
                  arg0 -= var9;
                  var10000 = ~arg5[arg0 - 1];
                  var10001 = -1;
                  if (!var7) {
                     if (var10000 == -1) {
                        return true;
                     }

                     arg0 += arg3;
                     ++var12;
                     if (var12 >= 0) {
                        var10000 = 0;
                        if (!var7) {
                           return false;
                        }
                     } else {
                        var10000 = var11;
                     }
                     break;
                  }
               } else {
                  var10000 = ~arg5[arg0];
                  var10001 = -1;
               }

               if (var10000 == var10001) {
                  return true;
               }

               arg0 += arg4;
               ++var13;
            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field10867[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10867[1] : field10867[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5393(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5394(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
