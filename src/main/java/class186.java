import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class186 {
   @OriginalMember(
      owner = "client!gg",
      name = "d",
      descriptor = "I"
   )
   public int field2283;
   @OriginalMember(
      owner = "client!gg",
      name = "c",
      descriptor = "Lor;"
   )
   private class670 field2287;
   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2290 = new String[]{method1421(method1420("\\(A\u001b^")), method1421(method1420("U:\u00036")), method1421(method1420("\\(Af\u001fU&\u001bd^")), method1421(method1420("@aAt\u000b")), method1421(method1420("\\(A\u001e^")), method1421(method1420("\\(A\u0018^")), method1421(method1420("\u001bbO")), method1421(method1420("o}OwV")), method1421(method1420("\\(A\u0019^")), method1421(method1420("\\(A<\u001fU.\u00033\f^g"))};
   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2281 = new int[4];
   @OriginalMember(
      owner = "client!gg",
      name = "e",
      descriptor = "Law;"
   )
   public static class82 field2284 = null;
   @OriginalMember(
      owner = "client!gg",
      name = "g",
      descriptor = "I"
   )
   public static int field2280;
   @OriginalMember(
      owner = "client!gg",
      name = "h",
      descriptor = "I"
   )
   public static int field2282;
   @OriginalMember(
      owner = "client!gg",
      name = "i",
      descriptor = "I"
   )
   public static int field2285;
   @OriginalMember(
      owner = "client!gg",
      name = "b",
      descriptor = "I"
   )
   public static int field2286;
   @OriginalMember(
      owner = "client!gg",
      name = "j",
      descriptor = "I"
   )
   public static int field2288;
   @OriginalMember(
      owner = "client!gg",
      name = "f",
      descriptor = "I"
   )
   public static int field2289;

   @OriginalMember(
      owner = "client!gg",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field2282;
         this.field2287.method4853(1373, this.field2283);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2290[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(Laha;II[I)V"
   )
   public static final void method1416(class404 arg0, int arg1, int arg2, int[] arg3) {
      boolean var4 = client.field4273;

      try {
         if (arg1 == 1) {
            ++field2286;
            if (arg0.field7789 != null) {
               int var10000;
               label97: {
                  byte var5 = 1;
                  int var6 = 0;
                  if (var4) {
                     var10000 = arg3[var6];
                  } else if (arg0.field7789.length <= var6) {
                     var10000 = var5;
                     if (!var4) {
                        break label97;
                     }
                  } else {
                     var10000 = arg3[var6];
                  }

                  label96:
                  do {
                     while(true) {
                        if (var10000 != arg0.field7789[var6]) {
                           var5 = 0;
                           if (!var4) {
                              var10000 = var5;
                              break;
                           }

                           ++var6;
                        } else {
                           ++var6;
                        }

                        if (arg0.field7789.length <= var6) {
                           var10000 = var5;
                           if (!var4) {
                              break label96;
                           }
                        } else {
                           var10000 = arg3[var6];
                        }
                     }
                  } while(var4);
               }

               if (var10000 != 0 && arg0.field7842 != -1) {
                  class61 var7 = class392.field5479.method1477(arg1, arg0.field7842);
                  int var8 = var7.field648;
                  if (var8 == 1) {
                     arg0.field7769 = 0;
                     arg0.field7818 = 0;
                     arg0.field7830 = 1;
                     arg0.field7758 = arg2;
                     arg0.field7837 = 0;
                     if (!arg0.field7821) {
                        class779.method5586(arg0, var7, arg0.field7837, -20543);
                     }
                  }

                  if (var8 == 2) {
                     arg0.field7818 = 0;
                  }
               }
            }

            boolean var9 = true;
            int var10 = 0;
            if (var4) {
               if (~arg3[var10] != 0) {
                  var9 = false;
               }
            } else if (arg3.length <= var10) {
               if (!var4) {
                  if (var9) {
                     arg0.field7758 = arg2;
                     arg0.field7789 = arg3;
                     return;
                  }

                  return;
               }

               if (var9) {
                  var9 = false;
               }
            } else if (~arg3[var10] != 0) {
               var9 = false;
            }

            while(true) {
               while(true) {
                  if (arg0.field7789 != null && ~arg0.field7789[var10] != 0 && class392.field5479.method1477(1, arg3[var10]).field654 < class392.field5479.method1477(arg1, arg0.field7789[var10]).field654) {
                     ++var10;
                     break;
                  }

                  arg0.field7758 = arg2;
                  arg0.field7789 = arg3;
                  if (var4) {
                     ++var10;
                     break;
                  }

                  if (!var4) {
                     if (var9) {
                        arg0.field7758 = arg2;
                        arg0.field7789 = arg3;
                        return;
                     }

                     return;
                  }

                  if (var9) {
                     var9 = false;
                  }
               }

               if (arg3.length <= var10) {
                  if (!var4) {
                     if (var9) {
                        arg0.field7758 = arg2;
                        arg0.field7789 = arg3;
                        return;
                     }

                     return;
                  }

                  if (var9) {
                     var9 = false;
                  }
               } else if (~arg3[var10] != 0) {
                  var9 = false;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2290[8] + (arg0 != null ? field2290[3] : field2290[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2290[3] : field2290[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(ILeq;)Z"
   )
   public static final boolean method1417(int arg0, class223 arg1) {
      boolean var2 = client.field4273;

      try {
         ++field2285;

         try {
            return arg0 != 0 ? false : class229.method1736((byte)44, arg1);
         } catch (IOException var7) {
            if (~class445.field6162 == -10) {
               arg1.field2779 = null;
               return false;
            } else {
               class709.method5177((byte)-44);
               return true;
            }
         } catch (Exception var8) {
            int var10000;
            byte var10001;
            label69: {
               String var4;
               label68: {
                  var4 = field2290[7] + (arg1.field2790 != null ? arg1.field2790.method2917(true) : -1) + "," + (arg1.field2797 == null ? -1 : arg1.field2797.method2917(true)) + "," + (arg1.field2796 != null ? arg1.field2796.method2917(true) : -1) + field2290[6] + arg1.field2798 + "," + (class278.field3709.field7853[0] + class752.field10921) + "," + (class278.field3709.field7855[0] + class17.field237) + field2290[6];
                  int var5 = 0;
                  if (!var2) {
                     if (~var5 <= ~arg1.field2798) {
                        break label68;
                     }

                     var10000 = var5;
                     var10001 = 50;
                     if (var2) {
                        break label69;
                     }

                     if (var5 >= 50) {
                        break label68;
                     }
                  }

                  do {
                     var4 = var4 + arg1.field2788.field8227[var5] + ",";
                     ++var5;
                     if (~var5 <= ~arg1.field2798) {
                        break;
                     }

                     var10000 = var5;
                     var10001 = 50;
                     if (var2) {
                        break label69;
                     }
                  } while(var5 < 50);
               }

               class106.method940(var4, var8, (byte)-33);
               var10000 = 0;
               var10001 = -10;
            }

            class316.method2373((boolean)var10000, var10001);
            return true;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field2290[5] + arg0 + ',' + (arg1 != null ? field2290[3] : field2290[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1418(byte arg0) {
      try {
         if (arg0 <= 115) {
            field2284 = null;
         }

         field2281 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2290[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "<init>",
      descriptor = "(Lor;II)V"
   )
   public class186(class670 arg0, int arg1, int arg2) {
      try {
         this.field2283 = arg2;
         this.field2287 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2290[2] + (arg0 != null ? field2290[3] : field2290[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1419(int arg0, int arg1, int arg2) {
      try {
         ++field2288;
         if (!(class793.method5714(arg2, arg0, (byte)-101) | (arg2 & 65536) != 0) && !class216.method1641(arg0, arg2, false)) {
            if (arg1 >= -102) {
               return false;
            } else {
               return (55 & arg0) == 0 && class302.method2276(arg0, (byte)-103, arg2);
            }
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2290[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1421(char[] arg0) {
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
            var10005 = 79;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
