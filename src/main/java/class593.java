import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class593 extends class96 {
   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8375 = new String[]{method4361(method4360("8#\u0018Sq")), method4361(method4360("8#\u0018Wq")), method4361(method4360(",b\u0018?$")), method4361(method4360("8#\u0018Rq")), method4361(method4360("99Z}")), method4361(method4360("8#\u0018Uq")), method4361(method4360("8#\u0018Pq")), method4361(method4360(";#Qv<3#Ce")), method4361(method4360("8#\u0018Tq"))};
   @OriginalMember(
      owner = "client!oo",
      name = "u",
      descriptor = "I"
   )
   public static int field8368;
   @OriginalMember(
      owner = "client!oo",
      name = "q",
      descriptor = "I"
   )
   public static int field8369;
   @OriginalMember(
      owner = "client!oo",
      name = "w",
      descriptor = "I"
   )
   public static int field8370;
   @OriginalMember(
      owner = "client!oo",
      name = "t",
      descriptor = "I"
   )
   public static int field8371;
   @OriginalMember(
      owner = "client!oo",
      name = "s",
      descriptor = "I"
   )
   public static int field8372;
   @OriginalMember(
      owner = "client!oo",
      name = "v",
      descriptor = "I"
   )
   public static int field8373;
   @OriginalMember(
      owner = "client!oo",
      name = "r",
      descriptor = "Lbga;"
   )
   private class398 field8374;

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   private final void method4354(class65 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method4355(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg0.method665(false);
            if (var4 != 0) {
               this.method4354(arg0, -121, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != -1) {
               return;
            }

            ++field8371;
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8375[3] + (arg0 != null ? field8375[2] : field8375[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method4356(int arg0, int arg1, int arg2) {
      try {
         ++field8370;
         if (this.field8374 == null) {
            return arg2;
         } else {
            if (arg1 != 249) {
               this.field8374 = null;
            }

            class288 var4 = (class288)this.field8374.method3101(-1, (long)arg0);
            return var4 == null ? arg2 : var4.field4298;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8375[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIBIII)V"
   )
   public static final void method4357(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      try {
         class784.field11425 = arg4;
         class155.field2379 = arg5;
         class494.field7054 = arg3;
         ++field8372;
         class699.field10073 = arg1;
         if (arg2 == -128) {
            class215.field3070 = arg0;
            if (~class784.field11425 <= -101) {
               int var6 = class494.field7054 * 512 + 256;
               int var7 = class155.field2379 * 512 + 256;
               int var8 = class478.method3658(class128.field2049, var6, var7, (byte)-20) + -class699.field10073;
               int var9 = -class670.field9407 + var6;
               int var10 = -class576.field8141 + var8;
               int var11 = var7 - class222.field3158;
               int var12 = (int)Math.sqrt((double)(var9 * var9 - -(var11 * var11)));
               class313.field4701 = (int)(2607.5945876176133D * Math.atan2((double)var10, (double)var12)) & 16383;
               class75.field1201 = 16383 & (int)(-2607.5945876176133D * Math.atan2((double)var9, (double)var11));
               if (class313.field4701 < 1024) {
                  class313.field4701 = 1024;
               }

               class103.field1628 = 0;
               if (class313.field4701 > 3072) {
                  class313.field4701 = 3072;
               }
            }

            class306.field4639 = 2;
            class27.field402 = -1;
            class555.field7892 = -1;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field8375[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4358(int arg0, boolean arg1) {
      boolean var2 = client.field10022;

      try {
         class242[] var3 = class745.field10606;
         int var4 = 0;
         if (var2 || var3.length > var4) {
            do {
               class242 var5 = var3[var4];
               var5.method2114(0);
               ++var4;
            } while(var3.length > var4);
         }

         ++field8373;
         class127.method1303(0);
         class372.method2915((byte)35);
         class321.method2594();
         int var6 = 0;
         if (var2) {
            class100.field1588[var6].method4812((byte)-13);
            ++var6;
         }

         while(true) {
            while(var6 < 4) {
               class100.field1588[var6].method4812((byte)-13);
               ++var6;
            }

            class182.method1647(false, arg0 + -40223);
            System.gc();
            class34.method387(1, 2);
            class24.field344 = -1;
            class253.field3843 = false;
            class108.method1060(false);
            if (!var2) {
               if (arg0 != 21995) {
                  method4357(-111, 95, (byte)-15, 95, -104, -47);
               }

               class356.method2802((byte)74, true);
               class88.method908(-15118);
               class543.method4051((byte)42);
               class344.method2735(-75);
               if (!arg1) {
                  class755.method5457(3, false);

                  try {
                     class726.method5254(110, class289.field4303, field8375[7]);
                     return;
                  } catch (Throwable var8) {
                     return;
                  }
               }

               class755.method5457(13, false);
               return;
            }

            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8375[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;"
   )
   public final String method4359(int arg0, String arg1, int arg2) {
      try {
         ++field8369;
         if (this.field8374 == null) {
            return arg1;
         } else {
            if (arg0 != 3) {
               this.field8374 = null;
            }

            class354 var4 = (class354)this.field8374.method3101(-1, (long)arg2);
            return var4 == null ? arg1 : var4.field5236;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8375[8] + arg0 + ',' + (arg1 != null ? field8375[2] : field8375[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4360(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4361(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
