import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class234 {
   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "I"
   )
   private int field3417;
   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "Z"
   )
   private boolean field3411;
   @OriginalMember(
      owner = "client!qb",
      name = "g",
      descriptor = "Z"
   )
   private boolean field3414;
   @OriginalMember(
      owner = "client!qb",
      name = "e",
      descriptor = "I"
   )
   private int field3421;
   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3425 = new String[]{method1934(method1933("D9Q^$")), method1934(method1933("D9QY$")), method1934(method1933("D9Q_$")), method1934(method1933("D9QT$")), method1934(method1933("D9Q]$")), method1934(method1933("D9QU$")), method1934(method1933("D9QZ$")), method1934(method1933("D9Q e[2\u000b\"$")), method1934(method1933("D9QX$")), method1934(method1933("[.\u0013p")), method1934(method1933("D9Q[$")), method1934(method1933("NuQ2q"))};
   @OriginalMember(
      owner = "client!qb",
      name = "p",
      descriptor = "I"
   )
   public static int field3415 = 0;
   @OriginalMember(
      owner = "client!qb",
      name = "f",
      descriptor = "I"
   )
   public static int field3412 = 0;
   @OriginalMember(
      owner = "client!qb",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field3420 = false;
   @OriginalMember(
      owner = "client!qb",
      name = "o",
      descriptor = "I"
   )
   public static int field3407;
   @OriginalMember(
      owner = "client!qb",
      name = "m",
      descriptor = "I"
   )
   public static int field3408;
   @OriginalMember(
      owner = "client!qb",
      name = "q",
      descriptor = "I"
   )
   public static int field3409;
   @OriginalMember(
      owner = "client!qb",
      name = "i",
      descriptor = "I"
   )
   public static int field3410;
   @OriginalMember(
      owner = "client!qb",
      name = "n",
      descriptor = "I"
   )
   public static int field3416;
   @OriginalMember(
      owner = "client!qb",
      name = "l",
      descriptor = "I"
   )
   public static int field3418;
   @OriginalMember(
      owner = "client!qb",
      name = "h",
      descriptor = "I"
   )
   public static int field3422;
   @OriginalMember(
      owner = "client!qb",
      name = "k",
      descriptor = "I"
   )
   public static int field3423;
   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "I"
   )
   public static int field3424;
   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "[Ltd;"
   )
   public static class476[] field3413;
   @OriginalMember(
      owner = "client!qb",
      name = "r",
      descriptor = "[Lgq;"
   )
   public static class538[] field3419;

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(II[I[Ljava/lang/Object;I)V",
      line = 8
   )
   public static final void method1924(int arg0, int arg1, int[] arg2, Object[] arg3, int arg4) {
      boolean var5 = client.field4564;

      try {
         if (~arg1 > ~arg0) {
            int var6 = (arg1 - -arg0) / 2;
            int var7 = arg1;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var8;
            Object var9 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = var8 != Integer.MAX_VALUE ? 1 : 0;
            int var11 = arg1;
            int var12;
            Object var13;
            if (var5) {
               if (var8 - -(arg1 & var10) > arg2[arg1]) {
                  var12 = arg2[arg1];
                  arg2[arg1] = arg2[arg1];
                  arg2[arg1] = var12;
                  var13 = arg3[arg1];
                  arg3[arg1] = arg3[arg1];
                  var7 = arg1 + 1;
                  arg3[arg1] = var13;
               }

               var11 = arg1 + 1;
            }

            while(true) {
               int var10000;
               int var10001;
               if (~var11 <= ~arg0) {
                  arg2[arg0] = arg2[var7];
                  arg2[var7] = var8;
                  arg3[arg0] = arg3[var7];
                  arg3[var7] = var9;
                  method1924(var7 - 1, arg1, arg2, arg3, 5944);
                  var10000 = arg0;
                  var10001 = var7 - -1;
                  if (!var5) {
                     method1924(arg0, var10001, arg2, arg3, 5944);
                     break;
                  }
               } else {
                  var10000 = var8 - -(var11 & var10);
                  var10001 = arg2[var11];
               }

               if (var10000 > var10001) {
                  var12 = arg2[var11];
                  arg2[var11] = arg2[var7];
                  arg2[var7] = var12;
                  var13 = arg3[var11];
                  arg3[var11] = arg3[var7];
                  arg3[var7++] = var13;
               }

               ++var11;
            }
         }

         if (arg4 == 5944) {
            ++field3418;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field3425[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3425[11] : field3425[9]) + ',' + (arg3 != null ? field3425[11] : field3425[9]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(IB)Z",
      line = 67
   )
   public static final boolean method1925(int arg0, byte arg1) {
      try {
         ++field3423;
         if (arg1 < 125) {
            field3408 = 45;
         }

         return arg0 >= 12 && ~arg0 >= -18;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3425[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(III)Z",
      line = 85
   )
   public static final boolean method1926(int arg0, int arg1, int arg2) {
      try {
         ++field3407;
         if (arg2 <= 54) {
            method1928(11);
         }

         return class28.method204(arg1, arg0, (byte)21) || class543.method4063(arg1, arg0, 105);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3425[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(IBI)B",
      line = 100
   )
   public static final byte method1927(int arg0, byte arg1, int arg2) {
      try {
         ++field3410;
         if (arg1 <= 6) {
            field3408 = 103;
         }

         if (~arg2 != -10) {
            return 0;
         } else {
            return (byte)((1 & arg0) != 0 ? 2 : 1);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3425[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "(I)V",
      line = 124
   )
   public static void method1928(int arg0) {
      try {
         field3419 = null;
         field3413 = null;
         if (arg0 != -1) {
            field3413 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3425[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(I)Z",
      line = 138
   )
   public final boolean method1929(int arg0) {
      try {
         ++field3422;
         if (arg0 >= -44) {
            field3415 = 61;
         }

         return this.field3411;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3425[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I)I",
      line = 149
   )
   public final int method1930(int arg0) {
      try {
         if (arg0 <= 106) {
            this.method1929(-14);
         }

         ++field3409;
         return this.field3421;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3425[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "<init>",
      descriptor = "(ZIIZ)V",
      line = 161
   )
   public class234(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field3417 = arg1;
         this.field3411 = arg0;
         this.field3414 = arg3;
         this.field3421 = arg2;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field3425[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(B)I",
      line = 173
   )
   public final int method1931(byte arg0) {
      try {
         ++field3416;
         if (arg0 < 35) {
            method1926(-125, 124, -51);
         }

         return this.field3417;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3425[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(B)Z",
      line = 184
   )
   public final boolean method1932(byte arg0) {
      try {
         ++field3424;
         return arg0 >= -109 ? true : this.field3414;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3425[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1933(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1934(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
