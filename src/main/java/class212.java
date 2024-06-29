import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class212 {
   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2696 = new String[]{method1611(method1610("\u0012v")), method1611(method1610("\nt8rj")), method1611(method1610("\u0005-8\u001f?")), method1611(method1610("\nt8tj")), method1611(method1610("\u0010vz]")), method1611(method1610("\nt8pj")), method1611(method1610("\nt8uj"))};
   @OriginalMember(
      owner = "client!tw",
      name = "j",
      descriptor = "Lsd;"
   )
   public static class101 field2692 = new class101(96, 1);
   @OriginalMember(
      owner = "client!tw",
      name = "b",
      descriptor = "J"
   )
   public static long field2694 = 1L;
   @OriginalMember(
      owner = "client!tw",
      name = "g",
      descriptor = "B"
   )
   public byte field2687;
   @OriginalMember(
      owner = "client!tw",
      name = "h",
      descriptor = "I"
   )
   public static int field2684;
   @OriginalMember(
      owner = "client!tw",
      name = "c",
      descriptor = "I"
   )
   public int field2689;
   @OriginalMember(
      owner = "client!tw",
      name = "l",
      descriptor = "I"
   )
   public static int field2690;
   @OriginalMember(
      owner = "client!tw",
      name = "k",
      descriptor = "I"
   )
   public static int field2691;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!tw",
      name = "d",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2695;
   @OriginalMember(
      owner = "client!tw",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field2685;
   @OriginalMember(
      owner = "client!tw",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field2686;
   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field2688;
   @OriginalMember(
      owner = "client!tw",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field2693;

   @OriginalMember(
      owner = "client!tw",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1604(int arg0) {
      try {
         field2692 = null;
         if (arg0 != 1) {
            field2692 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2696[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method1605(String arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field2690;
         if (arg0 == null) {
            return false;
         } else {
            if (arg1 < 11) {
               method1607();
            }

            int var3 = 0;
            if (var2 != 0) {
               if (arg0.equalsIgnoreCase(class185.field2294[var3])) {
                  return true;
               }

               if (arg0.equalsIgnoreCase(class163.field2049[var3])) {
                  return true;
               }

               ++var3;
            }

            while(true) {
               boolean var10000;
               if (var3 >= class67.field821) {
                  var10000 = false;
                  if (var2 == 0) {
                     return false;
                  }
               } else {
                  var10000 = arg0.equalsIgnoreCase(class185.field2294[var3]);
               }

               if (var10000) {
                  return true;
               }

               if (arg0.equalsIgnoreCase(class163.field2049[var3])) {
                  return true;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2696[3] + (arg0 != null ? field2696[2] : field2696[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1606(int arg0) throws class280 {
      try {
         if (arg0 != 8) {
            method1608(-90, 14L);
         }

         ++field2691;
         if (~class4.field85 == -2) {
            class616.field9011.method627(class706.field10569, class538.field7870);
         } else {
            class616.field9011.method627(0, 0);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2696[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1607() {
      for(int var0 = 0; var0 < class48.field579; ++var0) {
         if (!class442.field6736[var0]) {
            class33 var1 = class535.field7812[var0];
            class744 var2 = var1.field356;
            int var3 = var1.field371;
            int var4 = var2.method5424(34065) - class572.field8520;
            int var5 = (var4 * 2 >> class459.field6950) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method5420(true) - var4 >> class459.field6950;
            int var9 = var2.method5425((byte)-81) - var4 >> class459.field6950;
            int var10 = var2.method5425((byte)-81) + var4 >> class459.field6950;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class220.field2796) {
               var10 = class220.field2796 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field368[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class239.field3036) {
                  var16 = class239.field3036 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class741 var19 = class660.method4742(var3, var17, var11, field2695 != null ? field2695 : (field2695 = method1609(field2696[0])));
                  if (var19 != null && var19.field10997 != 0) {
                     if (var19.field10997 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field368[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field368[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field368[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field368[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class442.field6736[var0] = true;
            class377.field5711[var3].method776(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(IJ)Ljava/lang/String;"
   )
   public static final String method1608(int arg0, long arg1) {
      int var3 = client.field4530;

      try {
         ++field2684;
         if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % (long)arg0) == -1L) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3 != 0) {
                  ++var4;
                  var5 = arg1 / 37L;
               }

               while(true) {
                  if (~var5 == -1L) {
                     StringBuffer var7 = new StringBuffer(var4);
                     if (var3 == 0) {
                        if (var3 == 0 && arg1 == 0L) {
                           var7.reverse();
                           var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                           return var7.toString();
                        } else {
                           do {
                              long var8 = arg1;
                              arg1 /= 37L;
                              char var10 = class258.field3491[(int)(-(arg1 * 37L) + var8)];
                              if (var10 == '_') {
                                 int var11 = var7.length() - 1;
                                 var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                                 var10 = 160;
                              }

                              var7.append(var10);
                           } while(arg1 != 0L);

                           var7.reverse();
                           var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                           return var7.toString();
                        }
                     }
                  } else {
                     ++var4;
                  }

                  var5 /= 37L;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field2696[5] + arg0 + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!tw",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1609(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1610(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1611(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
