import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public abstract class class791 {
   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11527 = new String[]{method5713(method5712("\\f~Kx\u0016")), method5713(method5712("\\f~Kv\u0016")), method5713(method5712("\\f~Kt\u0016")), method5713(method5712("\\f~K{\u0016")), method5713(method5712("E#1KL")), method5713(method5712("\\f~Kz\u0016")), method5713(method5712("Pxs\t")), method5713(method5712("\\f~Kw\u0016")), method5713(method5712("\\f~Ky\u0016"))};
   @OriginalMember(
      owner = "client!bka",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field11526 = false;
   @OriginalMember(
      owner = "client!bka",
      name = "d",
      descriptor = "I"
   )
   public static int field11515;
   @OriginalMember(
      owner = "client!bka",
      name = "i",
      descriptor = "I"
   )
   public static int field11516;
   @OriginalMember(
      owner = "client!bka",
      name = "l",
      descriptor = "I"
   )
   public static int field11517;
   @OriginalMember(
      owner = "client!bka",
      name = "f",
      descriptor = "I"
   )
   public int field11518;
   @OriginalMember(
      owner = "client!bka",
      name = "k",
      descriptor = "I"
   )
   public int field11519;
   @OriginalMember(
      owner = "client!bka",
      name = "e",
      descriptor = "I"
   )
   public static int field11520;
   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "I"
   )
   public static int field11521;
   @OriginalMember(
      owner = "client!bka",
      name = "g",
      descriptor = "I"
   )
   public static int field11522;
   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "I"
   )
   public static int field11523;
   @OriginalMember(
      owner = "client!bka",
      name = "c",
      descriptor = "I"
   )
   public static int field11524;
   @OriginalMember(
      owner = "client!bka",
      name = "h",
      descriptor = "I"
   )
   public int field11525;

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method5705(byte arg0) {
      try {
         if (arg0 != -48) {
            this.method5709(-42);
         }

         ++field11523;
         return ~(2 & this.field11518) != -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11527[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method5706(int arg0) {
      try {
         ++field11517;
         if (arg0 != 0) {
            this.field11525 = -89;
         }

         return (this.field11518 & 4) != 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11527[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method5707(int arg0) {
      try {
         if (arg0 != 1024) {
            return true;
         } else {
            ++field11521;
            return (this.field11518 & 8) != 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11527[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(ILjava/lang/String;)J"
   )
   public static final long method5708(int arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg0 >= -18) {
            return -56L;
         } else {
            long var3;
            label105: {
               ++field11522;
               var3 = 0L;
               int var5 = arg1.length();
               int var6 = 0;
               if (var2) {
                  var3 *= 37L;
               } else if (var5 <= var6) {
                  if (!var2) {
                     if (var2) {
                        var3 /= 37L;
                     }
                     break label105;
                  }
               } else {
                  var3 *= 37L;
               }

               while(true) {
                  label122: {
                     char var7 = arg1.charAt(var6);
                     if (~var7 > -66 || ~var7 < -91) {
                        if (~var7 <= -98 && var7 <= 'z') {
                           var3 += (long)(var7 + -97 + 1);
                           if (!var2) {
                              break label122;
                           }
                        }

                        if (var7 < '0' || var7 > '9') {
                           break label122;
                        }

                        var3 += (long)(-21 - -var7);
                        if (!var2) {
                           break label122;
                        }
                     }

                     var3 += (long)(var7 + 1 + -65);
                  }

                  if (~var3 <= -177917621779460414L) {
                     if (!var2) {
                        break;
                     }

                     ++var6;
                  } else {
                     ++var6;
                  }

                  if (var5 <= var6) {
                     if (!var2) {
                        if (var2) {
                           var3 /= 37L;
                        }
                        break;
                     }
                  } else {
                     var3 *= 37L;
                  }
               }
            }

            long var10000;
            while(~(var3 % 37L) == -1L) {
               var10000 = ~var3;
               if (var2) {
                  return var10000;
               }

               if (var10000 == -1L) {
                  break;
               }

               var3 /= 37L;
            }

            var10000 = var3;
            return var10000;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field11527[5] + arg0 + ',' + (arg1 != null ? field11527[4] : field11527[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method5709(int arg0) {
      try {
         ++field11516;
         if (arg0 != -31850) {
            field11524 = -59;
         }

         return (1 & this.field11518) != 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11527[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(IIFI[BZLgb;FIFIFF)V"
   )
   public static final void method5710(int arg0, int arg1, float arg2, int arg3, byte[] arg4, boolean arg5, class570 arg6, float arg7, int arg8, float arg9, int arg10, float arg11, float arg12) {
      boolean var13 = client.field10022;

      try {
         int var14 = 0;
         if (var13) {
            class219.method1896(arg9, arg0, arg3, arg12, arg11, arg1, (byte)-42, var14, arg6, arg7, arg10, arg4, arg8, arg2);
            arg8 += arg3 * arg10;
            ++var14;
         }

         while(true) {
            while(arg0 > var14) {
               class219.method1896(arg9, arg0, arg3, arg12, arg11, arg1, (byte)-42, var14, arg6, arg7, arg10, arg4, arg8, arg2);
               arg8 += arg3 * arg10;
               ++var14;
            }

            if (!var13) {
               if (arg5 != 1) {
                  return;
               }

               ++field11515;
               return;
            }

            arg8 = arg5 + 1;
            ++var14;
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field11527[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11527[4] : field11527[6]) + ',' + arg5 + ',' + (arg6 != null ? field11527[4] : field11527[6]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5711(int arg0, int arg1) {
      try {
         ++field11520;
         if (class613.method4509(127)) {
            if (~class777.field11335 != ~arg1) {
               class704.field10134 = "";
            }

            class777.field11335 = arg1;
            class745.field10604.method2114(0);
            class755.method5457(arg0, false);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11527[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5713(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
