import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class758 extends class588 {
   @OriginalMember(
      owner = "client!cm",
      name = "u",
      descriptor = "I"
   )
   private int field11009 = -1;
   @OriginalMember(
      owner = "client!cm",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11016 = new String[]{method5489(method5488("l\"\u0018Yd")), method5489(method5488("a:Zs")), method5489(method5488("ta\u001811")), method5489(method5488("\u007f?")), method5489(method5488("l\"\u0018^d")), method5489(method5488("l\"\u0018[d")), method5489(method5488("l\"\u0018Zd")), method5489(method5488("l\"\u0018Wd")), method5489(method5488("l\"\u0018]d"))};
   @OriginalMember(
      owner = "client!cm",
      name = "v",
      descriptor = "I"
   )
   public static int field11005;
   @OriginalMember(
      owner = "client!cm",
      name = "p",
      descriptor = "I"
   )
   public static int field11006;
   @OriginalMember(
      owner = "client!cm",
      name = "r",
      descriptor = "I"
   )
   private int field11007;
   @OriginalMember(
      owner = "client!cm",
      name = "y",
      descriptor = "I"
   )
   private int field11008;
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "I"
   )
   public static int field11010;
   @OriginalMember(
      owner = "client!cm",
      name = "t",
      descriptor = "I"
   )
   public static int field11011;
   @OriginalMember(
      owner = "client!cm",
      name = "q",
      descriptor = "I"
   )
   public static int field11012;
   @OriginalMember(
      owner = "client!cm",
      name = "s",
      descriptor = "I"
   )
   private int field11013;
   @OriginalMember(
      owner = "client!cm",
      name = "x",
      descriptor = "I"
   )
   public static int field11014;
   @OriginalMember(
      owner = "client!cm",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field11015;

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(IIIILkfa;)V"
   )
   public static final void method5483(int arg0, int arg1, int arg2, int arg3, class626 arg4) {
      class600 var5 = class18.method134(arg0, arg1, arg2);
      if (var5 != null) {
         arg4.field4101 = (arg1 << class76.field1336) + class760.field11026;
         arg4.field4097 = arg3;
         arg4.field4096 = (arg2 << class76.field1336) + class760.field11026;
         var5.field8657 = arg4;
         int var6 = class455.field6647 == class269.field3810 ? 1 : 0;
         if (arg4.method593((byte)-94)) {
            if (arg4.method588(1)) {
               arg4.field4088 = class559.field8137[var6];
               class559.field8137[var6] = arg4;
               return;
            }

            arg4.field4088 = class529.field7698[var6];
            class529.field7698[var6] = arg4;
            class186.field2818 = true;
            return;
         }

         arg4.field4088 = class389.field5744[var6];
         class389.field5744[var6] = arg4;
      }

   }

   @OriginalMember(
      owner = "client!cm",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5484(byte arg0) {
      try {
         field11015 = null;
         if (arg0 != 83) {
            method5485(-21);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11016[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(I)Lwl;"
   )
   public static final class427 method5485(int arg0) {
      try {
         ++field11012;

         try {
            return new class606();
         } catch (Throwable var3) {
            try {
               return (class427)Class.forName(field11016[3]).newInstance();
            } catch (Throwable var2) {
               return arg0 != 0 ? null : new class603();
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11016[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method5486(int arg0, int arg1) {
      try {
         ++field11010;
         if (arg0 != 65354) {
            field11015 = null;
         }

         return (255 & arg1 >> 24) + "." + (arg1 >> 16 & 255) + "." + ((arg1 & 65354) >> 8) + "." + (arg1 & 255);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11016[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         if (arg1 <= -120) {
            ++field11011;
            arg0.method5611(0, this.field11009, this.field11007, this.field11013, this.field11008);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11016[8] + (arg0 != null ? field11016[2] : field11016[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(Loha;IIIIILoha;III)V"
   )
   public static final void method5487(class771 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class771 arg6, int arg7, int arg8, int arg9) {
      try {
         ++field11005;
         int var10 = arg0.method3397((byte)-83);
         if (~var10 != 0) {
            Object var11 = null;
            class476 var12 = (class476)class530.field7713.method1584((long)var10, arg5 ^ -2);
            if (var12 == null) {
               class94[] var13 = class94.method917(class392.field5782, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class444.field6473.method307(var13[0], true);
               class530.field7713.method1581((long)var10, ~arg5, var12);
            }

            class417.method3184(arg6.field4101, 0, -22719, arg6.field4090, arg2 >> 1, arg6.method3438(false) * 256, arg6.field4096, arg4 >> 1, arg9, arg3);
            int var14 = arg7 + -18 + class409.field6005[0];
            int var15 = arg1 - -class409.field6005[1] + -16 + -54;
            int var16 = arg8 / 4 * 18 + var14;
            int var17 = arg8 % 4 * 18 + var15;
            var12.method3609(var16, var17);
            if (arg0 == arg6) {
               class444.field6473.method691((byte)121, -256, 18, var17 + -1, 18, var16 + -1);
            }

            class670.method4896(var16 - -18, 0, arg5 + var16, var17 - -18, var17 + -1);
            class731 var18 = class224.method1875((byte)63);
            var18.field10510 = arg0;
            var18.field10506 = var16;
            var18.field10509 = var17 + 16;
            var18.field10507 = var17;
            var18.field10503 = var16 + 16;
            class344.field4908.method1398(true, var18);
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field11016[0] + (arg0 != null ? field11016[2] : field11016[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field11016[2] : field11016[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         ++field11014;
         this.field11009 = arg1.method3565(true);
         int var3 = 123 / ((arg0 - -26) / 33);
         this.field11013 = arg1.method3567(31871);
         this.field11008 = arg1.method3564((byte)-82);
         this.field11007 = arg1.method3564((byte)-121);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11016[7] + arg0 + ',' + (arg1 != null ? field11016[2] : field11016[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5488(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5489(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
