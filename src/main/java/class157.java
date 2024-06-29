import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class157 {
   @OriginalMember(
      owner = "client!wh",
      name = "k",
      descriptor = "Z"
   )
   private boolean field2016;
   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "I"
   )
   private int field2012;
   @OriginalMember(
      owner = "client!wh",
      name = "l",
      descriptor = "Z"
   )
   private boolean field2014;
   @OriginalMember(
      owner = "client!wh",
      name = "e",
      descriptor = "I"
   )
   private int field2021;
   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2025 = new String[]{method1284(method1283("f'R[\u0002")), method1284(method1283("f'R#C\u007f&\b!\u0002")), method1284(method1283("f'RY\u0002")), method1284(method1283("f'RZ\u0002")), method1284(method1283("f'R^\u0002")), method1284(method1283("f'R\\\u0002")), method1284(method1283("f'R]\u0002"))};
   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "I"
   )
   public static int field2020 = 2;
   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "F"
   )
   public static float field2018 = 0.0F;
   @OriginalMember(
      owner = "client!wh",
      name = "i",
      descriptor = "J"
   )
   public static long field2017 = -1L;
   @OriginalMember(
      owner = "client!wh",
      name = "h",
      descriptor = "Lbga;"
   )
   public static class378 field2023 = new class378(68, -1);
   @OriginalMember(
      owner = "client!wh",
      name = "d",
      descriptor = "I"
   )
   public static int field2013;
   @OriginalMember(
      owner = "client!wh",
      name = "j",
      descriptor = "I"
   )
   public static int field2015;
   @OriginalMember(
      owner = "client!wh",
      name = "n",
      descriptor = "I"
   )
   public static int field2019;
   @OriginalMember(
      owner = "client!wh",
      name = "m",
      descriptor = "I"
   )
   public static int field2022;
   @OriginalMember(
      owner = "client!wh",
      name = "f",
      descriptor = "I"
   )
   public static int field2024;
   @OriginalMember(
      owner = "client!wh",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field2011;

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1277(boolean arg0) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field2024;
            return this.field2016;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2025[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method1278(int arg0) {
      try {
         ++field2013;
         if (arg0 <= 86) {
            this.method1282((byte)-1);
         }

         return this.field2014;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2025[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1279(int arg0) {
      try {
         if (arg0 != 128) {
            return -100;
         } else {
            ++field2015;
            return this.field2021;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2025[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1280(int arg0) {
      try {
         if (arg0 <= 105) {
            method1281(-1, true);
         }

         field2011 = null;
         field2023 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2025[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method1281(int arg0, boolean arg1) {
      try {
         ++field2022;
         if (!arg1) {
            field2011 = null;
         }

         int var2 = arg0 & 63;
         int var3 = (arg0 & 252) >> 6;
         if (var2 != 18) {
            if (var2 == 19 || var2 == 21) {
               if (var3 == 0) {
                  return 16;
               }

               if (~var3 == -2) {
                  return 32;
               }

               if (var3 == 2) {
                  return 64;
               }

               if (~var3 == -4) {
                  return 128;
               }
            }
         } else {
            if (~var3 == -1) {
               return 1;
            }

            if (~var3 == -2) {
               return 2;
            }

            if (var3 == 2) {
               return 4;
            }

            if (var3 == 3) {
               return 8;
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2025[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1282(byte arg0) {
      try {
         ++field2019;
         if (arg0 != -79) {
            this.method1277(false);
         }

         return this.field2012;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2025[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "<init>",
      descriptor = "(ZIIZ)V"
   )
   public class157(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field2016 = arg0;
         this.field2012 = arg1;
         this.field2014 = arg3;
         this.field2021 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2025[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1283(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1284(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
