import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class180 extends class347 {
   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2224 = new String[]{method1419(method1418("\u0003M:hf")), method1419(method1418("\u0014\u0007:\u00053")), method1419(method1418("\u0016\u0016x*")), method1419(method1418("\u0014\u0007:\u00043")), method1419(method1418("\u0014\u0007:\u00073")), method1419(method1418("\u0014\u0007:\u00023")), method1419(method1418("\u0014\u0007:\u00033"))};
   @OriginalMember(
      owner = "client!ld",
      name = "p",
      descriptor = "Lpn;"
   )
   public static class776 field2210 = new class776();
   @OriginalMember(
      owner = "client!ld",
      name = "t",
      descriptor = "I"
   )
   public static int field2220 = 0;
   @OriginalMember(
      owner = "client!ld",
      name = "k",
      descriptor = "Lqo;"
   )
   public static class24 field2219 = new class24(method1419(method1418("\u000b\u0017q*w\u0019\u0011p'l\u0016")), method1419(method1418("+\u0017q*w\u0019\u00114\u0002z\u000f\r")), 1);
   @OriginalMember(
      owner = "client!ld",
      name = "i",
      descriptor = "F"
   )
   public static float field2221 = 0.25F;
   @OriginalMember(
      owner = "client!ld",
      name = "n",
      descriptor = "I"
   )
   public static int field2223 = 0;
   @OriginalMember(
      owner = "client!ld",
      name = "q",
      descriptor = "I"
   )
   public static int field2212;
   @OriginalMember(
      owner = "client!ld",
      name = "m",
      descriptor = "I"
   )
   public static int field2213;
   @OriginalMember(
      owner = "client!ld",
      name = "l",
      descriptor = "I"
   )
   public int field2215;
   @OriginalMember(
      owner = "client!ld",
      name = "u",
      descriptor = "I"
   )
   public static int field2216;
   @OriginalMember(
      owner = "client!ld",
      name = "j",
      descriptor = "I"
   )
   public int field2217;
   @OriginalMember(
      owner = "client!ld",
      name = "r",
      descriptor = "I"
   )
   public static int field2218;
   @OriginalMember(
      owner = "client!ld",
      name = "s",
      descriptor = "Lsda;"
   )
   public class269 field2214;
   @OriginalMember(
      owner = "client!ld",
      name = "v",
      descriptor = "Loh;"
   )
   public static class424 field2222;
   @OriginalMember(
      owner = "client!ld",
      name = "o",
      descriptor = "Liaa;"
   )
   public class520 field2211;

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IIII)Z",
      line = 6
   )
   public static final boolean method1413(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var4 = -114 / ((9 - arg0) / 47);
         class169.field2101.method1521(arg1, arg2, arg3, class746.field11058);
         ++field2213;
         int var5 = class746.field11058[2];
         if (~var5 > -51) {
            return false;
         } else {
            class746.field11058[1] = class746.field11058[1] * class11.field150 / var5 + class138.field1784;
            class746.field11058[2] = var5;
            class746.field11058[0] = class528.field7693 - -(class746.field11058[0] * class739.field10982 / var5);
            return true;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2224[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public static void method1414(int arg0) {
      try {
         if (arg0 != 11317) {
            field2210 = null;
         }

         field2222 = null;
         field2219 = null;
         field2210 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2224[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(IB[BIIII)Z",
      line = 43
   )
   public static final boolean method1415(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
      int var7 = client.field4530;

      try {
         ++field2212;
         if (arg1 != 55) {
            return true;
         } else {
            int var9;
            label45: {
               int var8 = arg5 % arg4;
               if (var8 == 0) {
                  var9 = 0;
                  if (var7 == 0) {
                     break label45;
                  }
               }

               var9 = -var8 + arg4;
            }

            int var10 = -((arg3 + -1 + arg4) / arg4);
            int var11 = -((arg5 + -1 + arg4) / arg4);
            int var12 = var10;
            int var10000;
            if (var7 != 0) {
               var10000 = var11;
            } else if (var10 >= 0) {
               var10000 = 0;
               if (var7 == 0) {
                  return false;
               }
            } else {
               var10000 = var11;
            }

            while(true) {
               int var13 = var10000;
               if (var7 != 0) {
                  if (~arg2[arg6] == -1) {
                     return true;
                  }

                  arg6 += arg4;
                  ++var13;
               }

               while(true) {
                  if (var13 >= 0) {
                     arg6 -= var9;
                     var10000 = arg2[arg6 + -1];
                     if (var7 == 0) {
                        if (var10000 == 0) {
                           return true;
                        }

                        arg6 += arg0;
                        ++var12;
                        if (var12 >= 0) {
                           var10000 = 0;
                           if (var7 == 0) {
                              return false;
                           }
                        } else {
                           var10000 = var11;
                        }
                        break;
                     }
                  } else {
                     var10000 = ~arg2[arg6];
                  }

                  if (var10000 == -1) {
                     return true;
                  }

                  arg6 += arg4;
                  ++var13;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field2224[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2224[0] : field2224[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "b",
      descriptor = "(I)V",
      line = 94
   )
   public final void method1416(int arg0) {
      try {
         if (arg0 != -1) {
            method1417((class667)null, (byte)61);
         }

         ++field2218;
         if (~class23.field245 > ~class597.field8794.length) {
            class597.field8794[class23.field245++] = this;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2224[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "a",
      descriptor = "(Lck;B)V",
      line = 110
   )
   public static final void method1417(class667 arg0, byte arg1) {
      try {
         int var2 = 30 / ((-14 - arg1) / 47);
         ++field2216;
         if (class693.field10417 == null) {
            class349 var3 = new class349();
            byte[] var4 = var3.method2731(128, 128, 16, (byte)111);
            class693.field10417 = class756.method5493(var4, 78, false);
         }

         if (class455.field6906 == null) {
            class257 var5 = new class257();
            byte[] var6 = var5.method1948(128, 128, 16, -128);
            class455.field6906 = class756.method5493(var6, -116, false);
         }

         class30 var7 = arg0.field9899;
         if (var7.method215(0) && class486.field7196 == null) {
            byte[] var8 = class487.method3610(128, 116, 4.0F, new class322(419684), 8, 16, 0.5F, 16.0F, 0.6F, 128, 4.0F);
            class486.field7196 = class756.method5493(var8, 76, false);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2224[1] + (arg0 != null ? field2224[0] : field2224[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1418(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ld",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1419(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
