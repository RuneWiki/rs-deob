import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class385 extends class15 {
   @OriginalMember(
      owner = "client!gd",
      name = "x",
      descriptor = "[B"
   )
   public byte[] field5334;
   @OriginalMember(
      owner = "client!gd",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5337 = new String[]{method3050(method3049("nJk\u0002\u000b")), method3050(method3049("nJkzJgG1x\u000b")), method3050(method3049("g[)*")), method3050(method3049("r\u0000kh^")), method3050(method3049("%\u000e")), method3050(method3049(")i\b\u0012")), method3050(method3049("nJk\u0007\u000b")), method3050(method3049("nJk\u0005\u000b")), method3050(method3049("nJk\u0004\u000b"))};
   @OriginalMember(
      owner = "client!gd",
      name = "s",
      descriptor = "I"
   )
   public static int field5333 = -1;
   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "I"
   )
   public static int field5335 = 1;
   @OriginalMember(
      owner = "client!gd",
      name = "y",
      descriptor = "I"
   )
   public static int field5329;
   @OriginalMember(
      owner = "client!gd",
      name = "v",
      descriptor = "I"
   )
   public static int field5330;
   @OriginalMember(
      owner = "client!gd",
      name = "w",
      descriptor = "I"
   )
   public static int field5331;
   @OriginalMember(
      owner = "client!gd",
      name = "u",
      descriptor = "I"
   )
   public static int field5332;
   @OriginalMember(
      owner = "client!gd",
      name = "t",
      descriptor = "I"
   )
   public static int field5336;

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(II[IIB)V"
   )
   public static final void method3045(int arg0, int arg1, int[] arg2, int arg3, byte arg4) {
      boolean var5 = client.field1481;

      try {
         --arg3;
         ++field5329;
         int var9 = arg1 - 1;
         int var6 = -7 + var9;
         int var10;
         if (var5) {
            var10 = arg3 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            int var14 = var13 + 1;
            arg2[var14] = arg0;
            int var15 = var14 + 1;
            arg2[var15] = arg0;
            int var16 = var15 + 1;
            arg2[var16] = arg0;
            arg3 = var16 + 1;
            arg2[arg3] = arg0;
         }

         while(true) {
            while(arg3 < var6) {
               var10 = arg3 + 1;
               arg2[var10] = arg0;
               ++var10;
               arg2[var10] = arg0;
               ++var10;
               arg2[var10] = arg0;
               ++var10;
               arg2[var10] = arg0;
               ++var10;
               arg2[var10] = arg0;
               ++var10;
               arg2[var10] = arg0;
               ++var10;
               arg2[var10] = arg0;
               arg3 = var10 + 1;
               arg2[arg3] = arg0;
            }

            if (!var5) {
               if (var5) {
                  ++arg3;
                  arg2[arg3] = arg0;
               }

               while(var9 > arg3) {
                  ++arg3;
                  arg2[arg3] = arg0;
               }

               if (arg4 >= -58) {
                  method3045(-54, -73, (int[])null, -28, (byte)-3);
                  return;
               } else {
                  return;
               }
            }

            ++arg3;
            arg2[arg3] = arg0;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5337[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5337[3] : field5337[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(BJ)Ljava/lang/String;"
   )
   public static final String method3046(byte arg0, long arg1) {
      try {
         if (arg0 != -52) {
            field5335 = -93;
         }

         ++field5330;
         class652.field9740.setTime(new Date(arg1));
         int var3 = class652.field9740.get(7);
         int var4 = class652.field9740.get(5);
         int var5 = class652.field9740.get(2);
         int var6 = class652.field9740.get(1);
         int var7 = class652.field9740.get(11);
         int var8 = class652.field9740.get(12);
         int var9 = class652.field9740.get(13);
         return class78.field1049[var3 + -1] + field5337[4] + var4 / 10 + var4 % 10 + "-" + class167.field2172[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field5337[5];
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field5337[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(F[FIIBIIFII[FI)V"
   )
   public static final void method3047(float arg0, float[] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, float arg7, int arg8, int arg9, float[] arg10, int arg11) {
      boolean var12 = client.field1481;

      try {
         int var24 = arg9 - arg6;
         int var22 = arg3 - arg11;
         int var23 = arg8 - arg2;
         ++field5336;
         float var13 = arg1[2] * (float)var22 + arg1[0] * (float)var24 + arg1[1] * (float)var23;
         if (arg4 < 54) {
            method3048(119, (byte)-33);
         }

         float var14 = arg1[5] * (float)var22 + arg1[4] * (float)var23 + arg1[3] * (float)var24;
         float var15 = arg1[8] * (float)var22 + arg1[6] * (float)var24 + arg1[7] * (float)var23;
         float var16 = (float)Math.atan2((double)var13, (double)var15) / 6.2831855F + 0.5F;
         if (arg7 != 1.0F) {
            var16 = arg7 * var16;
         }

         float var17;
         label51: {
            var17 = var14 + 0.5F + arg0;
            if (~arg5 == -2) {
               float var18 = var16;
               var16 = -var17;
               var17 = var18;
               if (!var12) {
                  break label51;
               }
            }

            if (arg5 == 2) {
               var16 = -var16;
               var17 = -var17;
               if (!var12) {
                  break label51;
               }
            }

            if (arg5 == 3) {
               float var19 = var16;
               var16 = var17;
               var17 = -var19;
            }
         }

         arg10[1] = var17;
         arg10[0] = var16;
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field5337[8] + arg0 + ',' + (arg1 != null ? field5337[3] : field5337[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field5337[3] : field5337[2]) + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method3048(int arg0, byte arg1) {
      try {
         int var2 = -53 % ((arg1 - 75) / 42);
         ++field5332;
         return ~arg0 == -8 || arg0 == 8 || arg0 == 9 || arg0 == 10;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5337[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class385(byte[] arg0) {
      try {
         this.field5334 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5337[1] + (arg0 != null ? field5337[3] : field5337[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3049(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3050(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
