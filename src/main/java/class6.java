import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {
   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field106 = new String[]{method57(method56(",9\u00040")), method57(method56("9bFrY")), method57(method56("+)F\u0018\f")), method57(method56("+)F\u0019\f")), method57(method56("+)F\u001f\f")), method57(method56("+)F\u001d\f")), method57(method56("+)F\u001e\f"))};
   @OriginalMember(
      owner = "client!ie",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field102 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!ie",
      name = "f",
      descriptor = "I"
   )
   public static int field100;
   @OriginalMember(
      owner = "client!ie",
      name = "d",
      descriptor = "I"
   )
   public static int field101;
   @OriginalMember(
      owner = "client!ie",
      name = "b",
      descriptor = "I"
   )
   public static int field103;
   @OriginalMember(
      owner = "client!ie",
      name = "e",
      descriptor = "I"
   )
   public static int field104;
   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "I"
   )
   public static int field105;

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I"
   )
   public static final int method51(String arg0, String arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field103;
         int var5 = arg1.length();
         int var6 = arg0.length();
         if (arg3 != 3) {
            return -68;
         } else {
            int var7 = 0;
            int var8 = 0;
            char var9 = 0;
            char var10 = 0;

            int var10000;
            label124:
            while(~(-var9 + var7) > ~var5 || -var10 + var8 < var6) {
               var10000 = ~var5;
               int var10001 = ~(-var9 + var7);

               while(var10000 < var10001) {
                  if (~(-var10 + var8) <= ~var6) {
                     return 1;
                  }

                  char var11;
                  label114: {
                     if (~var9 == -1) {
                        var11 = arg1.charAt(var7++);
                        if (var4 == 0) {
                           break label114;
                        }
                     }

                     var11 = var9;
                     boolean var12 = false;
                  }

                  char var13;
                  label109: {
                     if (var10 != 0) {
                        var13 = var10;
                        boolean var14 = false;
                        if (var4 == 0) {
                           break label109;
                        }
                     }

                     var13 = arg0.charAt(var8++);
                  }

                  var9 = class182.method1430(true, var11);
                  var10 = class182.method1430(true, var13);
                  char var15 = class450.method3391(arg2, var11, true);
                  char var16 = class450.method3391(arg2, var13, true);
                  if (~var15 == ~var16) {
                     continue label124;
                  }

                  var10000 = ~Character.toUpperCase(var15);
                  var10001 = ~Character.toUpperCase(var16);
                  if (var4 == 0) {
                     if (var10000 != var10001) {
                        char var17 = Character.toLowerCase(var15);
                        char var18 = Character.toLowerCase(var16);
                        if (~var17 != ~var18) {
                           return class327.method2465(arg2, arg3 + -80, var17) - class327.method2465(arg2, -106, var18);
                        }
                     }
                     continue label124;
                  }
               }

               return -1;
            }

            int var19 = Math.min(var5, var6);
            int var20 = 0;
            int var21;
            int var22;
            char var23;
            char var24;
            char var25;
            char var26;
            if (var4 != 0) {
               if (~arg2 == -3) {
                  var21 = var5 - var20 + -1;
                  var22 = -var20 + -1 + var6;
                  if (var4 != 0) {
                     var22 = var20;
                     var21 = var20;
                  }
               } else {
                  var22 = var20;
                  var21 = var20;
               }

               var23 = arg1.charAt(var21);
               var24 = arg0.charAt(var22);
               if (~var23 != ~var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
                  var25 = Character.toLowerCase(var23);
                  var26 = Character.toLowerCase(var24);
                  if (var25 != var26) {
                     return class327.method2465(arg2, arg3 + -62, var25) - class327.method2465(arg2, -126, var26);
                  }
               }

               ++var20;
            }

            while(true) {
               byte var34;
               if (~var19 >= ~var20) {
                  int var27 = var5 - var6;
                  var10000 = ~var27;
                  var34 = -1;
                  if (var4 == 0) {
                     if (var10000 != -1) {
                        return var27;
                     }

                     int var28 = 0;
                     char var33;
                     if (var4 != 0) {
                        var33 = arg1.charAt(var28);
                     } else if (var28 >= var19) {
                        var33 = 0;
                        if (var4 == 0) {
                           return 0;
                        }
                     } else {
                        var33 = arg1.charAt(var28);
                     }

                     while(true) {
                        char var29 = var33;
                        char var30 = arg0.charAt(var28);
                        if (~var29 != ~var30) {
                           return class327.method2465(arg2, arg3 + -123, var29) - class327.method2465(arg2, -94, var30);
                        }

                        ++var28;
                        if (var28 >= var19) {
                           var33 = 0;
                           if (var4 == 0) {
                              return 0;
                           }
                        } else {
                           var33 = arg1.charAt(var28);
                        }
                     }
                  }
               } else {
                  var10000 = ~arg2;
                  var34 = -3;
               }

               if (var10000 == var34) {
                  var21 = var5 - var20 + -1;
                  var22 = -var20 + -1 + var6;
                  if (var4 != 0) {
                     var22 = var20;
                     var21 = var20;
                  }
               } else {
                  var22 = var20;
                  var21 = var20;
               }

               var23 = arg1.charAt(var21);
               var24 = arg0.charAt(var22);
               if (~var23 != ~var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
                  var25 = Character.toLowerCase(var23);
                  var26 = Character.toLowerCase(var24);
                  if (var25 != var26) {
                     return class327.method2465(arg2, arg3 + -62, var25) - class327.method2465(arg2, -126, var26);
                  }
               }

               ++var20;
            }
         }
      } catch (RuntimeException var32) {
         throw class670.method4877(var32, field106[4] + (arg0 != null ? field106[1] : field106[0]) + ',' + (arg1 != null ? field106[1] : field106[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method52(int arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field101;
         int var3 = arg1.length();
         int var4 = arg0;
         int var5 = 0;
         if (var2 != 0) {
            var4 = class601.method4395(-104, arg1.charAt(var5)) + (arg0 << 5) + -arg0;
            ++var5;
         }

         while(true) {
            while(~var5 > ~var3) {
               var4 = class601.method4395(-104, arg1.charAt(var5)) + (var4 << 5) + -var4;
               ++var5;
            }

            if (var2 == 0) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field106[2] + arg0 + ',' + (arg1 != null ? field106[1] : field106[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method53(boolean arg0) {
      try {
         field102 = null;
         if (arg0) {
            method51((String)null, (String)null, -90, 23);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field106[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method54(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 >= -59) {
            field102 = null;
         }

         ++field100;
         return arg0 != 1 && ~arg0 != -4 ? class545.field8104[3 & arg2] : class242.field3078[arg2 & 3];
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field106[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "a",
      descriptor = "(II[BIIB)V"
   )
   public static final void method55(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
      int var6 = client.field4530;

      try {
         ++field105;
         if (arg1 > arg0) {
            arg3 = -arg0 + arg1 >> 2;
            arg4 += arg0;
            int var9;
            if (var6 != 0) {
               var9 = arg4 + 1;
               arg2[arg4] = 1;
               int var10 = var9 + 1;
               arg2[var9] = 1;
               int var11 = var10 + 1;
               arg2[var10] = 1;
               arg4 = var11 + 1;
               arg2[var11] = 1;
            }

            while(true) {
               while(true) {
                  --arg3;
                  if (~arg3 > -1) {
                     arg3 = 3 & arg1 - arg0;
                     if (var6 == 0) {
                        if (arg5 != 113) {
                           return;
                        }

                        while(true) {
                           --arg3;
                           if (~arg3 > -1) {
                              return;
                           }

                           arg2[arg4++] = 1;
                        }
                     }

                     arg2[arg4++] = 1;
                  } else {
                     var9 = arg4 + 1;
                     arg2[arg4] = 1;
                     arg2[var9++] = 1;
                     arg2[var9++] = 1;
                     arg4 = var9 + 1;
                     arg2[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field106[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field106[1] : field106[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method56(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ie",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method57(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
