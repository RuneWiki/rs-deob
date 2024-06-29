import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class74 extends class191 {
   @OriginalMember(
      owner = "client!ib",
      name = "n",
      descriptor = "I"
   )
   private int field1179 = 0;
   @OriginalMember(
      owner = "client!ib",
      name = "v",
      descriptor = "J"
   )
   private long field1181 = -1L;
   @OriginalMember(
      owner = "client!ib",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field1185 = null;
   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1190 = new String[]{method828(method827("\u0018\u0006\u0006,\"")), method828(method827("\nJ\u0006@w")), method828(method827("\r]Dn")), method828(method827("\nJ\u0006Fw")), method828(method827("\nJ\u0006Dw")), method828(method827("\nJ\u0006Gw")), method828(method827("\u000eME`:\u0011@Iq7Y")), method828(method827("\nJ\u0006Aw")), method828(method827("CEMo=\u0006ZFc2\u0006\u0012")), method828(method827("\nJ\u0006Ew"))};
   @OriginalMember(
      owner = "client!ib",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field1183 = false;
   @OriginalMember(
      owner = "client!ib",
      name = "r",
      descriptor = "Lff;"
   )
   public static class732 field1187 = new class732();
   @OriginalMember(
      owner = "client!ib",
      name = "l",
      descriptor = "Lef;"
   )
   public static class171 field1188 = new class171();
   @OriginalMember(
      owner = "client!ib",
      name = "w",
      descriptor = "Lgq;"
   )
   public static class200 field1189 = new class200();
   @OriginalMember(
      owner = "client!ib",
      name = "q",
      descriptor = "I"
   )
   public static int field1178;
   @OriginalMember(
      owner = "client!ib",
      name = "s",
      descriptor = "I"
   )
   public static int field1180;
   @OriginalMember(
      owner = "client!ib",
      name = "m",
      descriptor = "I"
   )
   public static int field1182;
   @OriginalMember(
      owner = "client!ib",
      name = "o",
      descriptor = "I"
   )
   public static int field1184;
   @OriginalMember(
      owner = "client!ib",
      name = "p",
      descriptor = "I"
   )
   public static int field1186;

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         if (arg0.method665(false) != 255) {
            --arg0.field945;
            this.field1181 = arg0.method680(-129);
         }

         ++field1182;
         if (arg1 >= -97) {
            method826((byte)6, -22L);
         }

         this.field1185 = arg0.method641((byte)66);
         this.field1179 = arg0.method685(-2);
         if (class455.field6615) {
            System.out.println(field1190[6] + this.field1181 + field1190[8] + this.field1185);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1190[7] + (arg0 != null ? field1190[0] : field1190[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method823(int arg0) {
      try {
         field1187 = null;
         field1188 = null;
         if (arg0 <= 92) {
            method824(-25, -17L, -67, false, 85);
         }

         field1189 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1190[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(IJIZI)Ljava/lang/String;"
   )
   public static final String method824(int arg0, long arg1, int arg2, boolean arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field1186;
         char var7 = ',';
         char var8 = '.';
         if (arg0 != -4896) {
            return null;
         } else {
            if (arg2 == 0) {
               var8 = ',';
               var7 = '.';
            }

            if (arg2 == 2) {
               var8 = 160;
            }

            byte var9 = 0;
            if (~arg1 > -1L) {
               var9 = 1;
               arg1 = -arg1;
            }

            StringBuffer var10 = new StringBuffer(26);
            if (arg4 > 0) {
               int var11 = 0;
               if (var6 || ~var11 > ~arg4) {
                  do {
                     int var12 = (int)arg1;
                     arg1 /= 10L;
                     var10.append((char)(var12 + 48 - (int)arg1 * 10));
                     ++var11;
                  } while(~var11 > ~arg4);
               }

               var10.append(var7);
            }

            int var13 = 0;

            int var10000;
            while(true) {
               int var14 = (int)arg1;
               arg1 /= 10L;
               var10.append((char)(48 - ((int)arg1 * 10 + -var14)));
               if (arg1 != 0L) {
                  if (!arg3) {
                     continue;
                  }

                  ++var13;
                  var10000 = ~(var13 % 3);
                  if (var6) {
                     break;
                  }

                  if (var10000 != -1) {
                     continue;
                  }

                  var10.append(var8);
                  if (!var6) {
                     continue;
                  }
               }

               var10000 = var9;
               break;
            }

            if (var10000 != 0) {
               var10.append('-');
            }

            return var10.reverse().toString();
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field1190[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method825(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 255) {
            method824(-37, -109L, -55, true, -107);
         }

         ++field1184;
         ++class362.field5346;
         class381 var3 = class801.method5775(class711.field10203, 0, class745.field10605.field3718);
         var3.field5570.method650(false, arg2);
         var3.field5570.method636(false, arg1);
         class745.field10605.method2111(14024, var3);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1190[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(BJ)I"
   )
   public static final int method826(byte arg0, long arg1) {
      try {
         int var3 = 5 / ((48 - arg0) / 49);
         ++field1178;
         return (int)(arg1 / 86400000L) + -11745;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1190[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         arg1.method3516(this.field1185, this.field1179, (byte)-122, this.field1181);
         ++field1180;
         if (arg0 >= -106) {
            method824(77, 63L, -2, false, 46);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1190[1] + arg0 + ',' + (arg1 != null ? field1190[0] : field1190[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
