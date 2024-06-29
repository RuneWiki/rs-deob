import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class415 extends class428 {
   @OriginalMember(
      owner = "client!rr",
      name = "o",
      descriptor = "[Lkm;"
   )
   public class207[] field5687;
   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5693 = new String[]{method3250(method3249("\u0019D\u0007X")), method3250(method3249("\u0005CE\b<\u0019X\u001f\n}")), method3250(method3249("\f\u001fE\u001a(")), method3250(method3249("\u0005CEw}")), method3250(method3249("\u0005CEp}")), method3250(method3249("\u0005CEu}")), method3250(method3249("\u0005CEv}")), method3250(method3249(">_\u001dU9\u001eUKF4\u0013X\u0013\u000e"))};
   @OriginalMember(
      owner = "client!rr",
      name = "i",
      descriptor = "I"
   )
   public static int field5686 = 0;
   @OriginalMember(
      owner = "client!rr",
      name = "l",
      descriptor = "I"
   )
   public static int field5689 = 0;
   @OriginalMember(
      owner = "client!rr",
      name = "n",
      descriptor = "I"
   )
   public static int field5688;
   @OriginalMember(
      owner = "client!rr",
      name = "k",
      descriptor = "I"
   )
   public static int field5690;
   @OriginalMember(
      owner = "client!rr",
      name = "m",
      descriptor = "I"
   )
   public static int field5691;
   @OriginalMember(
      owner = "client!rr",
      name = "j",
      descriptor = "I"
   )
   public static int field5692;

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Lkw;B)I"
   )
   public static final int method3245(class9 arg0, byte arg1) {
      try {
         if (arg1 >= -86) {
            field5686 = 11;
         }

         ++field5691;
         if (arg0.field162 == 0) {
            return 0;
         } else {
            if (arg0.field110 != -1) {
               class9 var2 = null;
               if (arg0.field110 >= 32768) {
                  if (arg0.field110 >= 32768) {
                     var2 = class59.field771[arg0.field110 + -32768];
                  }
               } else {
                  class411 var3 = (class411)class35.field493.method1818(-1, (long)arg0.field110);
                  if (var3 != null) {
                     var2 = var3.field5654;
                  }
               }

               if (var2 != null) {
                  int var4 = -var2.field10467 + arg0.field10467;
                  int var5 = arg0.field10468 - var2.field10468;
                  if (~var4 != -1 || ~var5 != -1) {
                     arg0.method82(0, 16383 & (int)(Math.atan2((double)var4, (double)var5) * 2607.5945876176133D));
                  }
               }
            }

            if (arg0 instanceof class783) {
               class783 var6 = (class783)arg0;
               if (var6.field11409 == -1 || ~var6.field208 != -1 && ~var6.field206 >= -1) {
                  return arg0.method81((byte)-97);
               }

               var6.method82(0, var6.field11409);
               var6.field11409 = -1;
               if (!client.field1481) {
                  return arg0.method81((byte)-97);
               }
            }

            if (arg0 instanceof class81) {
               class81 var7 = (class81)arg0;
               if (var7.field1141 != -1 && (var7.field208 == 0 || var7.field206 > 0)) {
                  int var8 = -((-class539.field7889 + var7.field1141 + -class539.field7889) * 256) + var7.field10467;
                  int var9 = -((-class353.field4940 + var7.field1138 + -class353.field4940) * 256) + var7.field10468;
                  if (~var8 != -1 || var9 != 0) {
                     var7.method82(0, 16383 & (int)(Math.atan2((double)var8, (double)var9) * 2607.5945876176133D));
                  }

                  var7.field1141 = -1;
               }
            }

            return arg0.method81((byte)-97);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field5693[3] + (arg0 != null ? field5693[2] : field5693[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3246(int arg0) {
      try {
         ++field5688;
         field5686 = 0;
         int var1 = (class204.field2593.field10467 >> 9) + class539.field7889;
         int var2 = (class204.field2593.field10468 >> 9) + class353.field4940;
         int var3 = -8 / ((arg0 - -13) / 57);
         if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
            field5686 = 1;
         }

         if (var1 >= 3072 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            field5686 = 1;
         }

         if (~field5686 == -2 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
            field5686 = 0;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5693[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(ZIZI)Ljava/lang/String;"
   )
   public static final String method3247(boolean arg0, int arg1, boolean arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         if (!arg0) {
            field5686 = 96;
         }

         ++field5692;
         if (~arg3 <= -3 && ~arg3 >= -37) {
            if (arg2 && arg1 >= 0) {
               int var5 = 2;
               int var6 = arg1 / arg3;
               if (var4) {
                  var6 /= arg3;
                  ++var5;
               }

               while(true) {
                  while(var6 != 0) {
                     var6 /= arg3;
                     ++var5;
                  }

                  char[] var7 = new char[var5];
                  var7[0] = '+';
                  int var8 = var5 + -1;
                  if (!var4) {
                     if (!var4 && ~var8 >= -1) {
                        return new String(var7);
                     } else {
                        do {
                           int var9 = arg1;
                           arg1 /= arg3;
                           int var10 = -(arg1 * arg3) + var9;
                           if (~var10 > -11) {
                              var7[var8] = (char)(var10 + 48);
                              if (var4) {
                                 var7[var8] = (char)(var10 + 87);
                                 --var8;
                              } else {
                                 --var8;
                              }
                           } else {
                              var7[var8] = (char)(var10 + 87);
                              --var8;
                           }
                        } while(~var8 < -1);

                        return new String(var7);
                     }
                  }

                  ++var5;
               }
            } else {
               return Integer.toString(arg1, arg3);
            }
         } else {
            throw new IllegalArgumentException(field5693[7] + arg3);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field5693[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "<init>",
      descriptor = "([Lkm;)V"
   )
   public class415(class207[] arg0) {
      try {
         this.field5687 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5693[1] + (arg0 != null ? field5693[2] : field5693[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(Lwk;B)I"
   )
   public static final int method3248(class255 arg0, byte arg1) {
      try {
         ++field5690;
         if (arg1 != -39) {
            method3247(true, 116, true, -21);
         }

         if (class363.field5039 != arg0) {
            if (class733.field10690 != arg0) {
               if (class48.field640 != arg0) {
                  if (class354.field4947 == arg0) {
                     return 34166;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 34168;
               }
            } else {
               return 34167;
            }
         } else {
            return 5890;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5693[5] + (arg0 != null ? field5693[2] : field5693[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3249(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3250(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
