import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class70 {
   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field866 = new String[]{method656(method655("S'W53")), method656(method655("LeWZf")), method656(method655("Y>\u0015\u0018")), method656(method655("S'W63")), method656(method655("S'W73")), method656(method655("S'W03")), method656(method655("S'W13"))};
   @OriginalMember(
      owner = "client!dl",
      name = "f",
      descriptor = "I"
   )
   public static int field865 = 0;
   @OriginalMember(
      owner = "client!dl",
      name = "c",
      descriptor = "I"
   )
   public static int field860;
   @OriginalMember(
      owner = "client!dl",
      name = "e",
      descriptor = "I"
   )
   public static int field861;
   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "I"
   )
   public static int field862;
   @OriginalMember(
      owner = "client!dl",
      name = "d",
      descriptor = "I"
   )
   public static int field864;
   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "Lhn;"
   )
   public static class753 field863;

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method650(int arg0) {
      try {
         int var1 = -7 % ((32 - arg0) / 56);
         field863 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field866[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method651(byte arg0) {
      try {
         ++field861;
         if (arg0 != -63) {
            method650(62);
         }

         if (class316.field4304.field9134 && ~class333.field4546.field6156 != 0) {
            class7.method36(class333.field4546.field6156, arg0 + 23, class333.field4546.field6161);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field866[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(Ljava/lang/String;IILjava/lang/String;)I"
   )
   public static final int method652(String arg0, int arg1, int arg2, String arg3) {
      boolean var4 = client.field4360;

      try {
         int var5 = 10 / ((1 - arg2) / 33);
         ++field862;
         int var6 = arg0.length();
         int var7 = arg3.length();
         int var8 = 0;
         int var9 = 0;
         char var10 = 0;
         char var11 = 0;

         int var10000;
         label185:
         while(var6 > var8 - var10 || var7 > -var11 + var9) {
            var10000 = var6;
            int var10001 = -var10 + var8;

            while(var10000 > var10001) {
               if (~var7 >= ~(-var11 + var9)) {
                  return 1;
               }

               char var12;
               label110: {
                  if (var10 != 0) {
                     var12 = var10;
                     boolean var13 = false;
                     if (!var4) {
                        break label110;
                     }
                  }

                  var12 = arg0.charAt(var8++);
               }

               char var14;
               label105: {
                  if (~var11 == -1) {
                     var14 = arg3.charAt(var9++);
                     if (!var4) {
                        break label105;
                     }
                  }

                  var14 = var11;
                  boolean var15 = false;
               }

               var10 = class148.method1231(126, var12);
               var11 = class148.method1231(81, var14);
               char var16 = class434.method3205(var12, arg1, 79);
               char var17 = class434.method3205(var14, arg1, 79);
               if (~var16 == ~var17) {
                  continue label185;
               }

               var10000 = ~Character.toUpperCase(var16);
               var10001 = ~Character.toUpperCase(var17);
               if (!var4) {
                  if (var10000 != var10001) {
                     char var18 = Character.toLowerCase(var16);
                     char var19 = Character.toLowerCase(var17);
                     if (var18 != var19) {
                        return class301.method2243(var18, 1, arg1) + -class301.method2243(var19, 1, arg1);
                     }
                  }
                  continue label185;
               }
            }

            return -1;
         }

         int var20 = Math.min(var6, var7);
         int var21 = 0;
         int var28;
         int var29;
         char var30;
         char var31;
         char var34;
         byte var35;
         if (var4) {
            var10000 = arg1;
            var35 = 2;
         } else if (~var20 >= ~var21) {
            var28 = -var7 + var6;
            var10000 = ~var28;
            var35 = -1;
            if (!var4) {
               if (var10000 != -1) {
                  return var28;
               }

               var29 = 0;
               if (var4) {
                  var34 = arg0.charAt(var29);
               } else if (var20 <= var29) {
                  var34 = 0;
                  if (!var4) {
                     return 0;
                  }
               } else {
                  var34 = arg0.charAt(var29);
               }

               while(true) {
                  var30 = var34;
                  var31 = arg3.charAt(var29);
                  if (var30 != var31) {
                     return class301.method2243(var30, 1, arg1) - class301.method2243(var31, 1, arg1);
                  }

                  ++var29;
                  if (var20 <= var29) {
                     var34 = 0;
                     if (!var4) {
                        return 0;
                     }
                  } else {
                     var34 = arg0.charAt(var29);
                  }
               }
            }
         } else {
            var10000 = arg1;
            var35 = 2;
         }

         while(true) {
            int var22;
            int var23;
            if (var10000 != var35) {
               var22 = var21;
               var23 = var21;
               if (var4) {
                  var23 = var6 + -1 - var21;
                  var22 = var7 + -1 - var21;
               }
            } else {
               var23 = var6 + -1 - var21;
               var22 = var7 + -1 - var21;
            }

            char var24 = arg0.charAt(var23);
            char var25 = arg3.charAt(var22);
            if (var24 != var25 && ~Character.toUpperCase(var24) != ~Character.toUpperCase(var25)) {
               char var26 = Character.toLowerCase(var24);
               char var27 = Character.toLowerCase(var25);
               if (~var26 != ~var27) {
                  return class301.method2243(var26, 1, arg1) + -class301.method2243(var27, 1, arg1);
               }
            }

            ++var21;
            if (~var20 >= ~var21) {
               var28 = -var7 + var6;
               var10000 = ~var28;
               var35 = -1;
               if (!var4) {
                  if (var10000 != -1) {
                     return var28;
                  }

                  var29 = 0;
                  if (var4) {
                     var34 = arg0.charAt(var29);
                  } else if (var20 <= var29) {
                     var34 = 0;
                     if (!var4) {
                        return 0;
                     }
                  } else {
                     var34 = arg0.charAt(var29);
                  }

                  while(true) {
                     var30 = var34;
                     var31 = arg3.charAt(var29);
                     if (var30 != var31) {
                        return class301.method2243(var30, 1, arg1) - class301.method2243(var31, 1, arg1);
                     }

                     ++var29;
                     if (var20 <= var29) {
                        var34 = 0;
                        if (!var4) {
                           return 0;
                        }
                     } else {
                        var34 = arg0.charAt(var29);
                     }
                  }
               }
            } else {
               var10000 = arg1;
               var35 = 2;
            }
         }
      } catch (RuntimeException var33) {
         throw class237.method1823(var33, field866[3] + (arg0 != null ? field866[1] : field866[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field866[1] : field866[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(ZB)V"
   )
   public static final void method653(boolean arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         if (class706.field10315 == null) {
            class706.field10315 = new byte[4][class644.field9403][class337.field4594];
         }

         ++field860;
         if (arg0) {
            int var3 = 0;
            if (var2 || ~var3 > -5) {
               do {
                  int var4 = 0;
                  if (var2 || ~var4 > ~class644.field9403) {
                     do {
                        int var5 = 0;
                        if (var2) {
                           class706.field10315[var3][var4][var5] = arg1;
                           ++var5;
                        }

                        while(true) {
                           while(~class337.field4594 < ~var5) {
                              class706.field10315[var3][var4][var5] = arg1;
                              ++var5;
                           }

                           if (!var2) {
                              ++var4;
                              break;
                           }

                           ++var5;
                        }
                     } while(~var4 > ~class644.field9403);
                  }

                  ++var3;
               } while(~var3 > -5);

            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field866[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method654(byte arg0) {
      try {
         ++field864;
         if (arg0 > -80) {
            field865 = 9;
         }

         return class165.method1366(0, false);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field866[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method655(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method656(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
