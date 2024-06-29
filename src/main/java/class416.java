import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class416 extends class38 implements class568 {
   @OriginalMember(
      owner = "client!jba",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6095 = new String[]{method3180(method3179("ro\u001e4")), method3180(method3179("g4\\vC")), method3180(method3179("vx\u0013v\u0002ut\u001b,\u00004")), method3180(method3179("vx\u0013vx4")), method3180(method3179("vx\u0013v|4")), method3180(method3179("vx\u0013vz4")), method3180(method3179("vx\u0013vy4")), method3180(method3179("vx\u0013v{4"))};
   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field6089 = false;
   @OriginalMember(
      owner = "client!jba",
      name = "y",
      descriptor = "I"
   )
   public static int field6090 = 0;
   @OriginalMember(
      owner = "client!jba",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field6091 = new int[2];
   @OriginalMember(
      owner = "client!jba",
      name = "w",
      descriptor = "Luw;"
   )
   public static class435 field6093 = new class435(15, 11);
   @OriginalMember(
      owner = "client!jba",
      name = "F",
      descriptor = "I"
   )
   public static int field6086;
   @OriginalMember(
      owner = "client!jba",
      name = "x",
      descriptor = "I"
   )
   public static int field6087;
   @OriginalMember(
      owner = "client!jba",
      name = "C",
      descriptor = "I"
   )
   public static int field6088;
   @OriginalMember(
      owner = "client!jba",
      name = "B",
      descriptor = "I"
   )
   public static int field6092;
   @OriginalMember(
      owner = "client!jba",
      name = "E",
      descriptor = "I"
   )
   public static int field6094;

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static final void method3174(boolean arg0) {
      try {
         ++field6086;
         int var1 = 0;
         if (~class510.field7454.field11139.method5300(arg0) == -2) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
         }

         if (class510.field7454.field11166.method5470(arg0) == 0) {
            var1 |= 64;
         }

         class778.method5609(var1, (byte)84);
         class634.field9256.method2555(4925, var1);
         class408.field5993.method839((byte)-23, var1);
         class373.field5547.method2059(var1, arg0);
         class760.field11030.method3424(!arg0, var1);
         class243.method1978(57, var1);
         class604.method4446((byte)-113, var1);
         class411.method3143(-24596, var1);
         class305.method2386((byte)100, var1);
         class281.method2201((byte)-96);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6095[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(I)V",
      line = 41
   )
   public static void method3175(int arg0) {
      try {
         field6091 = null;
         if (arg0 >= 126) {
            field6093 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6095[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "<init>",
      descriptor = "(Lbba;IZ[[I)V",
      line = 56
   )
   public class416(class124 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(ZII)I",
      line = 91
   )
   public static final int method3176(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field6092;
         int var4 = 0;
         if (var3) {
            var4 = 1 & arg1 | var4 << 1;
            --arg2;
            arg1 >>>= 1;
         }

         while(true) {
            while(arg2 > 0) {
               var4 = 1 & arg1 | var4 << 1;
               --arg2;
               arg1 >>>= 1;
            }

            if (!var3) {
               if (arg0 != 1) {
                  return -30;
               }

               return var4;
            }

            arg1 = arg0 >>> 1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6095[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "f",
      descriptor = "(B)V",
      line = 115
   )
   public static final void method3177(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field6088;
         int var2 = class158.field2525;
         int[] var3 = class442.field6446;
         if (arg0 != -124) {
            method3174(false);
         }

         int var4 = 0;
         if (var1 || var4 < var2) {
            do {
               class457 var5 = class458.field6723[var3[var4]];
               if (var5 != null && ~var5.field11281 < -1) {
                  --var5.field11281;
                  if (var5.field11281 == 0) {
                     var5.field11238 = null;
                  }
               }

               ++var4;
            } while(var4 < var2);
         }

         int var6 = 0;
         if (var1 || var6 < class16.field293) {
            do {
               long var7 = (long)class577.field8316[var6];
               class272 var9 = (class272)class78.field1344.method1572(var7, -16289);
               if (var9 != null) {
                  class451 var10 = var9.field3851;
                  if (~var10.field11281 < -1) {
                     --var10.field11281;
                     if (var10.field11281 == 0) {
                        var10.field11238 = null;
                     }
                  }
               }

               ++var6;
            } while(var6 < class16.field293);

         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field6095[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(III)Z",
      line = 176
   )
   public static final boolean method3178(int arg0, int arg1, int arg2) {
      try {
         ++field6094;
         if (arg1 != -1) {
            method3174(false);
         }

         return (arg2 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6095[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3179(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3180(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
