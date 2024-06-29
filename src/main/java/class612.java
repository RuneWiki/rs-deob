import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class612 implements class227 {
   @OriginalMember(
      owner = "client!pf",
      name = "g",
      descriptor = "Lqh;"
   )
   private class74 field8546;
   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private String field8551;
   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8552 = new String[]{method4452(method4451("f{fn\u0007")), method4452(method4451("xh$A")), method4452(method4451("m3f\u0003R")), method4452(method4451("f{f\u0011Fxt<\u0013\u0007")), method4452(method4451("f{fo\u0007")), method4452(method4451("f{fl\u0007"))};
   @OriginalMember(
      owner = "client!pf",
      name = "f",
      descriptor = "J"
   )
   public static long field8548 = 0L;
   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "I"
   )
   public static int field8545;
   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "I"
   )
   public static int field8547;
   @OriginalMember(
      owner = "client!pf",
      name = "c",
      descriptor = "I"
   )
   public static int field8549;
   @OriginalMember(
      owner = "client!pf",
      name = "e",
      descriptor = "I"
   )
   public static int field8550;

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(B)Lbf;"
   )
   public final class566 method1008(byte arg0) {
      try {
         ++field8545;
         int var2 = 93 % ((arg0 - -46) / 53);
         return class566.field7720;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8552[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Laa;ILjava/lang/String;ILjk;Lda;IIBLeb;II)V"
   )
   public static final void method4450(class516 arg0, int arg1, String arg2, int arg3, class663 arg4, class66 arg5, int arg6, int arg7, byte arg8, class657 arg9, int arg10, int arg11) {
      try {
         int var12;
         label67: {
            ++field8549;
            if (class635.field8977 != 4) {
               var12 = 16383 & (int)class363.field5142 - -class661.field9423;
               if (!client.field4273) {
                  break label67;
               }
            }

            var12 = 16383 & (int)class363.field5142;
         }

         int var13 = 10 + Math.max(arg9.field9379 / 2, arg9.field9360 / 2);
         int var14 = arg1 * arg1 + arg6 * arg6;
         if (var14 <= var13 * var13) {
            int var15 = class192.field2342[var12];
            int var16 = class192.field2341[var12];
            if (class635.field8977 != 4) {
               var16 = var16 * 256 / (class356.field5080 + 256);
               var15 = var15 * 256 / (class356.field5080 + 256);
            }

            if (arg8 <= -55) {
               int var17 = arg1 * var15 + arg6 * var16 >> 14;
               int var18 = arg1 * var16 - arg6 * var15 >> 14;
               int var19 = arg4.method4808(arg2, 100, (byte)77, (class763[])null);
               int var20 = arg4.method4805((class763[])null, 100, 109, 0, arg2);
               int var21 = var17 - var19 / 2;
               if (~var21 <= ~(-arg9.field9379) && ~var21 >= ~arg9.field9379 && -arg9.field9360 <= var18 && ~var18 >= ~arg9.field9360) {
                  arg5.method628((class763[])null, 1, arg9.field9360 / 2 + -var20 + arg10 + -arg7 + -var18, var19, (byte)103, (int[])null, 0, arg0, 0, arg3, 0, arg9.field9379 / 2 + arg11 + var21, arg11, arg2, 50, arg10);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field8552[0] + (arg0 != null ? field8552[2] : field8552[1]) + ',' + arg1 + ',' + (arg2 != null ? field8552[2] : field8552[1]) + ',' + arg3 + ',' + (arg4 != null ? field8552[2] : field8552[1]) + ',' + (arg5 != null ? field8552[2] : field8552[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field8552[2] : field8552[1]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1010(boolean arg0) {
      try {
         if (!arg0) {
            return -64;
         } else {
            ++field8547;
            return this.field8546.method741(-16463, this.field8551) ? 100 : this.field8546.method710(0, this.field8551);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8552[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "<init>",
      descriptor = "(Lqh;Ljava/lang/String;)V"
   )
   public class612(class74 arg0, String arg1) {
      try {
         this.field8546 = arg0;
         this.field8551 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8552[3] + (arg0 != null ? field8552[2] : field8552[1]) + ',' + (arg1 != null ? field8552[2] : field8552[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
