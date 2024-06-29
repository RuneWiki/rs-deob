import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class368 {
   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5440 = new String[]{method2903(method2902("\u0017s<\u0018\u0017R")), method2903(method2902("\u0017s<\u0018\u0010R")), method2903(method2902("\u0014c1Z")), method2903(method2902("\u00018s\u0018)")), method2903(method2902("\u0017s<\u0018\u0011R")), method2903(method2902("\u0017s<\u0018\u0015R")), method2903(method2902("\u0017s<\u0018\u0016R"))};
   @OriginalMember(
      owner = "client!mea",
      name = "f",
      descriptor = "I"
   )
   public static int field5433 = 0;
   @OriginalMember(
      owner = "client!mea",
      name = "b",
      descriptor = "I"
   )
   public static int field5435 = -1;
   @OriginalMember(
      owner = "client!mea",
      name = "d",
      descriptor = "Leu;"
   )
   public static class634 field5439 = new class634();
   @OriginalMember(
      owner = "client!mea",
      name = "g",
      descriptor = "I"
   )
   public static int field5434;
   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "I"
   )
   public static int field5436;
   @OriginalMember(
      owner = "client!mea",
      name = "e",
      descriptor = "I"
   )
   public static int field5437;
   @OriginalMember(
      owner = "client!mea",
      name = "c",
      descriptor = "I"
   )
   public static int field5438;

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(ILha;ZI)Ljg;"
   )
   public static final class24 method2897(int arg0, class17 arg1, boolean arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field5434;
         if (~arg0 == 0) {
            return null;
         } else {
            if (class556.field7901 != null) {
               int var5 = 0;
               if (var4 || ~var5 > ~class556.field7901.length) {
                  do {
                     if (class556.field7901[var5] == arg0) {
                        return class61.field873[var5];
                     }

                     ++var5;
                  } while(~var5 > ~class556.field7901.length);
               }
            }

            class24 var6 = (class24)class521.field7326.method1041((long)arg0, 8);
            if (arg3 != -570166910) {
               field5435 = -42;
            }

            if (var6 != null) {
               if (arg2 && var6.field350 == null) {
                  class440 var7 = class604.method4453(arg0, 29306, class793.field11535);
                  if (var7 == null) {
                     return null;
                  }

                  var6.field350 = var7;
               }

               return var6;
            } else {
               class433[] var8 = class433.method3381(class222.field3159, arg0);
               if (var8 == null) {
                  return null;
               } else {
                  class440 var9 = class604.method4453(arg0, arg3 ^ -570194952, class793.field11535);
                  if (var9 == null) {
                     return null;
                  } else {
                     class24 var10;
                     label56: {
                        if (!arg2) {
                           var10 = new class24(arg1.method170(var9, var8, true));
                           if (!var4) {
                              break label56;
                           }
                        }

                        var10 = new class24(arg1.method170(var9, var8, true), var9);
                     }

                     class521.field7326.method1050(-78, var10, (long)arg0);
                     return var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field5440[4] + arg0 + ',' + (arg1 != null ? field5440[3] : field5440[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2898(byte arg0) {
      try {
         field5439 = null;
         if (arg0 != -9) {
            field5435 = -77;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5440[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(B[BLjava/lang/String;I)I"
   )
   public static final int method2899(byte arg0, byte[] arg1, String arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         if (arg0 != 94) {
            return -57;
         } else {
            ++field5436;
            int var5 = arg3;
            int var6 = arg2.length();
            int var7 = 0;
            int var10000;
            if (var4) {
               var10000 = class664.method4827(arg2.charAt(var7), -1);
            } else if (~var6 >= ~var7) {
               var10000 = -arg3 + arg3;
               if (!var4) {
                  return var10000;
               }
            } else {
               var10000 = class664.method4827(arg2.charAt(var7), -1);
            }

            do {
               while(true) {
                  int var8 = var10000;
                  int var9 = var6 <= var7 - -1 ? -1 : class664.method4827(arg2.charAt(var7 + 1), -1);
                  int var10 = ~(var7 - -2) <= ~var6 ? -1 : class664.method4827(arg2.charAt(var7 + 2), -1);
                  int var11 = var6 > var7 - -3 ? class664.method4827(arg2.charAt(var7 + 3), -1) : -1;
                  arg1[arg3++] = (byte)class91.method932(var8 << 2, var9 >>> 4);
                  if (~var10 == 0 && !var4) {
                     var10000 = -var5 + arg3;
                     break;
                  }

                  arg1[arg3++] = (byte)class91.method932(class697.method5101(240, var9 << 4), var10 >>> 2);
                  if (var11 == -1) {
                     if (!var4) {
                        var10000 = -var5 + arg3;
                        if (!var4) {
                           return var10000;
                        }
                        continue;
                     }

                     arg1[arg3++] = (byte)class91.method932(var11, class697.method5101(3, var10) << 6);
                     var7 += 4;
                  } else {
                     arg1[arg3++] = (byte)class91.method932(var11, class697.method5101(3, var10) << 6);
                     var7 += 4;
                  }

                  if (~var6 >= ~var7) {
                     var10000 = -var5 + arg3;
                     if (!var4) {
                        return var10000;
                     }
                  } else {
                     var10000 = class664.method4827(arg2.charAt(var7), -1);
                  }
               }
            } while(var4);

            return var10000;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5440[6] + arg0 + ',' + (arg1 != null ? field5440[3] : field5440[2]) + ',' + (arg2 != null ? field5440[3] : field5440[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(BC)Z"
   )
   public static final boolean method2900(byte arg0, char arg1) {
      boolean var2 = client.field10022;

      try {
         ++field5437;
         if (Character.isISOControl(arg1)) {
            return false;
         } else if (class484.method3692(-47, arg1)) {
            return true;
         } else {
            char[] var3 = class583.field8195;
            int var4 = 0;
            if (var2) {
               char var5 = var3[var4];
               if (~arg1 == ~var5) {
                  return true;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (var4 >= var3.length) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 != -81) {
                        method2897(-28, (class17)null, true, -109);
                     }

                     char[] var6 = class59.field846;
                     int var7 = 0;
                     char var8;
                     if (var2) {
                        var8 = var6[var7];
                        if (~arg1 == ~var8) {
                           return true;
                        }

                        ++var7;
                     }

                     while(true) {
                        char var12;
                        if (var7 >= var6.length) {
                           var12 = 0;
                           if (!var2) {
                              return false;
                           }
                        } else {
                           var12 = var6[var7];
                        }

                        var8 = var12;
                        if (~arg1 == ~var8) {
                           return true;
                        }

                        ++var7;
                     }
                  }
               } else {
                  var10000 = var3[var4];
               }

               int var11 = var10000;
               if (~arg1 == ~var11) {
                  return true;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5440[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2901(int arg0, int arg1) {
      try {
         ++field5438;
         class331.method2655((byte)-119);
         if (arg1 == -1) {
            int var2 = class690.field9935.method3948(44, arg0).field7172;
            if (var2 != 0) {
               int var3 = class344.field5074.field5631[arg0];
               if (~var2 == -6) {
                  class525.field7421 = var3;
               }

               if (~var2 == -7) {
                  class452.field6591 = var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5440[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2902(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2903(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
