import java.lang.reflect.Field;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class527 implements class775 {
   @OriginalMember(
      owner = "client!bia",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   private String field7545;
   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7551 = new String[]{method3817(method3816("YF=\b+\u0013")), method3817(method3816("@\u0001r\b\u0014")), method3817(method3816("UZ0J")), method3817(method3816("YF=\bURA5RW\u0013")), method3817(method3816("YF=\b*\u0013")), method3817(method3816("YF=\b.\u0013")), method3817(method3816("YF=\b(\u0013")), method3817(method3816("YF=\b,\u0013")), method3817(method3816("YF=\b-\u0013")), method3817(method3816("YF=\b!\u0013")), method3817(method3816("LM=")), method3817(method3816("RI=")), method3817(method3816("YF=\b/\u0013"))};
   @OriginalMember(
      owner = "client!bia",
      name = "l",
      descriptor = "I"
   )
   public static int field7538;
   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "I"
   )
   public static int field7539;
   @OriginalMember(
      owner = "client!bia",
      name = "k",
      descriptor = "I"
   )
   public static int field7540;
   @OriginalMember(
      owner = "client!bia",
      name = "m",
      descriptor = "I"
   )
   public static int field7541;
   @OriginalMember(
      owner = "client!bia",
      name = "i",
      descriptor = "I"
   )
   public static int field7542;
   @OriginalMember(
      owner = "client!bia",
      name = "d",
      descriptor = "I"
   )
   public static int field7543;
   @OriginalMember(
      owner = "client!bia",
      name = "b",
      descriptor = "I"
   )
   public static int field7547;
   @OriginalMember(
      owner = "client!bia",
      name = "f",
      descriptor = "I"
   )
   public static int field7548;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bia",
      name = "g",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7549;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!bia",
      name = "h",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7550;
   @OriginalMember(
      owner = "client!bia",
      name = "c",
      descriptor = "Z"
   )
   private boolean field7544;
   @OriginalMember(
      owner = "client!bia",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field7546;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method3815(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(II)Lci;",
      line = 5
   )
   public static final class476 method3809(int arg0, int arg1) {
      try {
         ++field7542;
         if (arg1 != 30811) {
            method3811(-33, (String)null, (char)65452);
         }

         if (~arg0 == -1) {
            if ((double)class650.field9501 == 3.0D) {
               return class278.field3783;
            }

            if ((double)class650.field9501 == 4.0D) {
               return class744.field10853;
            }

            if ((double)class650.field9501 == 6.0D) {
               return class12.field132;
            }

            if ((double)class650.field9501 >= 8.0D) {
               return class271.field3744;
            }
         } else if (~arg0 != -2) {
            if (arg0 == 2) {
               if ((double)class650.field9501 == 3.0D) {
                  return class25.field373;
               }

               if ((double)class650.field9501 == 4.0D) {
                  return class286.field3961;
               }

               if ((double)class650.field9501 == 6.0D) {
                  return class144.field1839;
               }

               if ((double)class650.field9501 >= 8.0D) {
                  return class136.field1734;
               }
            }
         } else {
            if ((double)class650.field9501 == 3.0D) {
               return class12.field132;
            }

            if ((double)class650.field9501 == 4.0D) {
               return class271.field3744;
            }

            if ((double)class650.field9501 == 6.0D) {
               return class25.field373;
            }

            if ((double)class650.field9501 >= 8.0D) {
               return class286.field3961;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7551[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(ZJIB)Ljava/lang/String;",
      line = 72
   )
   public static final String method3810(boolean arg0, long arg1, int arg2, byte arg3) {
      try {
         Calendar var5;
         label14: {
            ++field7547;
            if (!arg0) {
               class111.method907((byte)-67, arg1);
               var5 = class176.field2442;
               if (!client.field4360) {
                  break label14;
               }
            }

            class559.method4007(arg1, false);
            var5 = class176.field2431;
         }

         int var6 = var5.get(5);
         int var7 = var5.get(2) - -1;
         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = 52 % ((65 - arg3) / 34);
         int var11 = var5.get(12);
         return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var11 / 10 + var11 % 10;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field7551[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;",
      line = 106
   )
   public static final String[] method3811(int arg0, String arg1, char arg2) {
      boolean var3 = client.field4360;

      try {
         ++field7538;
         int var4 = class552.method3965(arg1, arg2, -32261);
         if (arg0 != -29619) {
            field7546 = true;
         }

         String[] var5 = new String[var4 + 1];
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9;
         if (var3) {
            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         } else {
            if (~var8 <= ~var4) {
               var5[var4] = arg1.substring(var7);
               return var5;
            }

            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         }

         while(true) {
            while(arg1.charAt(var9) != arg2) {
               ++var9;
            }

            var5[var6++] = arg1.substring(var7, var9);
            var7 = var9 - -1;
            ++var8;
            if (~var8 <= ~var4) {
               var5[var4] = arg1.substring(var7);
               return var5;
            }

            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field7551[9] + arg0 + ',' + (arg1 != null ? field7551[1] : field7551[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "d",
      descriptor = "(I)I",
      line = 141
   )
   public static final int method3812(int arg0) {
      boolean var1 = client.field4360;

      try {
         int var2 = -116 % ((arg0 - -87) / 32);
         ++field7540;
         int var3 = 0;
         Field[] var4 = (field7549 != null ? field7549 : (field7549 = method3815(field7551[11]))).getDeclaredFields();
         Field[] var5 = var4;
         int var6 = 0;
         if (!var1 && var6 >= var4.length) {
            return var3 + 1;
         } else {
            do {
               Field var7 = var5[var6];
               if ((field7550 != null ? field7550 : (field7550 = method3815(field7551[10]))).isAssignableFrom(var7.getType())) {
                  ++var3;
               }

               ++var6;
            } while(var6 < var5.length);

            return var3 + 1;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field7551[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(I)Ltfa;",
      line = 173
   )
   public final class36 method2559(int arg0) {
      try {
         if (arg0 != -24883) {
            return null;
         } else {
            ++field7541;
            return class36.field515;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7551[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "b",
      descriptor = "(I)I",
      line = 186
   )
   public final int method2561(int arg0) {
      try {
         ++field7548;
         int var2 = class389.method2953(arg0 + 29206, this.field7545);
         if (var2 >= 0 && ~var2 >= -101) {
            return var2;
         } else {
            this.field7544 = true;
            return arg0 != -29119 ? -41 : 100;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7551[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 204
   )
   public class527(String arg0) {
      try {
         this.field7545 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7551[3] + (arg0 != null ? field7551[1] : field7551[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "c",
      descriptor = "(I)Z",
      line = 213
   )
   public final boolean method3813(int arg0) {
      try {
         ++field7543;
         int var2 = 74 / ((-55 - arg0) / 39);
         return this.field7544;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7551[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(JI)I",
      line = 223
   )
   public static final int method3814(long arg0, int arg1) {
      try {
         if (arg1 < 124) {
            return -30;
         } else {
            ++field7539;
            return (int)(arg0 / 86400000L) + -11745;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7551[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3816(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3817(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
