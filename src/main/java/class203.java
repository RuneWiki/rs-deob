import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class203 extends class657 {
   @OriginalMember(
      owner = "client!pq",
      name = "s",
      descriptor = "I"
   )
   public int field3037 = -1;
   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3043 = new String[]{method1740(method1739("h\u0013\u007fW\u0001")), method1740(method1739("h\u0013\u007fQ\u0001")), method1740(method1739("h\u0013\u007fP\u0001")), method1740(method1739("v\u0017=\u007f")), method1740(method1739("cL\u007f=T")), method1740(method1739("h\u0013\u007fR\u0001"))};
   @OriginalMember(
      owner = "client!pq",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field3035 = new int[2];
   @OriginalMember(
      owner = "client!pq",
      name = "p",
      descriptor = "I"
   )
   public static int field3034 = 0;
   @OriginalMember(
      owner = "client!pq",
      name = "q",
      descriptor = "I"
   )
   public static int field3041 = 0;
   @OriginalMember(
      owner = "client!pq",
      name = "v",
      descriptor = "I"
   )
   public int field3032;
   @OriginalMember(
      owner = "client!pq",
      name = "x",
      descriptor = "I"
   )
   public static int field3036;
   @OriginalMember(
      owner = "client!pq",
      name = "t",
      descriptor = "I"
   )
   public static int field3038;
   @OriginalMember(
      owner = "client!pq",
      name = "r",
      descriptor = "I"
   )
   public static int field3039;
   @OriginalMember(
      owner = "client!pq",
      name = "n",
      descriptor = "I"
   )
   public static int field3040;
   @OriginalMember(
      owner = "client!pq",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   public String field3033;
   @OriginalMember(
      owner = "client!pq",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field3042;

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1735(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg0 & 3;
         ++field3038;
         if (var6 == 0) {
            return arg3;
         } else if (~var6 == -2) {
            return 7 - arg2;
         } else {
            if (arg1 != 16807) {
               method1738((byte)8);
            }

            return ~var6 == -3 ? -arg3 + 7 : arg2;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3043[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "(B)Laq;"
   )
   public final class168 method1736(byte arg0) {
      try {
         if (arg0 != 0) {
            this.method1736((byte)97);
         }

         ++field3039;
         return class373.field5544[super.field9589];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3043[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIIZI[B)Z"
   )
   public static final boolean method1737(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte[] arg5) {
      boolean var6 = client.field4564;

      try {
         if (arg3) {
            return true;
         } else {
            ++field3040;
            boolean var7 = true;
            class473 var8 = new class473(arg5);
            int var9 = -1;

            boolean var10000;
            while(true) {
               int var10 = var8.method3544(119);
               if (var10 != 0) {
                  var9 += var10;
                  int var11 = 0;
                  var10000 = false;
                  if (var6) {
                     break;
                  }

                  boolean var12 = false;

                  label87:
                  do {
                     byte var10001;
                     int var23;
                     while(true) {
                        if (!var12) {
                           int var13 = var8.method3586(122);
                           var23 = ~var13;
                           var10001 = -1;
                           if (var6) {
                              break;
                           }

                           if (var23 == -1) {
                              break label87;
                           }

                           var11 += var13 - 1;
                           int var14 = 63 & var11;
                           int var15 = (var11 & 4032) >> 6;
                           int var16 = var8.method3564((byte)-102) >> 2;
                           int var17 = var15 - -arg2;
                           int var18 = var14 - -arg4;
                           if (var17 <= 0 || var18 <= 0 || var17 >= arg0 + -1 || ~var18 <= ~(arg1 + -1)) {
                              continue;
                           }

                           class670 var19 = class634.field9256.method2559(var9, 0);
                           if (var16 == 22 && ~class510.field7454.field11188.method3669(arg3) == -1 && ~var19.field9770 == -1 && var19.field9761 != 1 && !var19.field9777) {
                              continue label87;
                           }

                           if (!var19.method4902(17375)) {
                              var7 = false;
                              ++class270.field3837;
                           }

                           var12 = true;
                           if (!var6) {
                              continue;
                           }
                        }

                        int var20 = var8.method3586(112);
                        var23 = ~var20;
                        var10001 = -1;
                        break;
                     }

                     if (var23 == var10001) {
                        break;
                     }

                     var8.method3564((byte)-72);
                  } while(!var6);

                  if (!var6) {
                     continue;
                  }
               }

               var10000 = var7;
               break;
            }

            return var10000;
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field3043[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3043[4] : field3043[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1738(byte arg0) {
      try {
         int var1 = -94 / ((-66 - arg0) / 56);
         field3035 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3043[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1739(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1740(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
