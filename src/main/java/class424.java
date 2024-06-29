import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class424 extends class775 {
   @OriginalMember(
      owner = "client!dm",
      name = "v",
      descriptor = "I"
   )
   private int field6544 = -1;
   @OriginalMember(
      owner = "client!dm",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6552 = new String[]{method3365(method3364("I}>\u0003>")), method3365(method3364("V>>lk")), method3365(method3364("Ce|.")), method3365(method3364("I}>\u0001>")), method3365(method3364("k`cx")), method3365(method3364("I}>\u0007>")), method3365(method3364("`u}x")), method3365(method3364("c\u007f~bu]!\"w$\rsx#dLsd'd\r h")), method3365(method3364("\r`b-`Dtu&")), method3365(method3364("I}>\u0006>")), method3365(method3364("I}>\u0000>"))};
   @OriginalMember(
      owner = "client!dm",
      name = "B",
      descriptor = "[Luo;"
   )
   public static class619[] field6543 = new class619[8];
   @OriginalMember(
      owner = "client!dm",
      name = "D",
      descriptor = "I"
   )
   public static int field6550 = 0;
   @OriginalMember(
      owner = "client!dm",
      name = "u",
      descriptor = "I"
   )
   private int field6541;
   @OriginalMember(
      owner = "client!dm",
      name = "t",
      descriptor = "I"
   )
   public static int field6542;
   @OriginalMember(
      owner = "client!dm",
      name = "y",
      descriptor = "I"
   )
   private int field6545;
   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "I"
   )
   public static int field6546;
   @OriginalMember(
      owner = "client!dm",
      name = "w",
      descriptor = "I"
   )
   public static int field6547;
   @OriginalMember(
      owner = "client!dm",
      name = "x",
      descriptor = "I"
   )
   public static int field6548;
   @OriginalMember(
      owner = "client!dm",
      name = "C",
      descriptor = "I"
   )
   public static int field6549;
   @OriginalMember(
      owner = "client!dm",
      name = "A",
      descriptor = "I"
   )
   private int field6551;

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 3
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         this.field6544 = arg0.method2848(-109);
         ++field6547;
         this.field6545 = arg0.method2894(102);
         int var3 = -48 / ((-84 - arg1) / 34);
         this.field6541 = arg0.method2855(-31007);
         this.field6551 = arg0.method2855(-31007);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6552[3] + (arg0 != null ? field6552[1] : field6552[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(BB)C",
      line = 21
   )
   public static final char method3361(byte arg0, byte arg1) {
      try {
         ++field6542;
         if (arg0 <= 32) {
            field6550 = -100;
         }

         int var2 = 255 & arg1;
         if (~var2 == -1) {
            throw new IllegalArgumentException(field6552[7] + Integer.toString(var2, 16) + field6552[8]);
         } else {
            if (var2 >= 128 && var2 < 160) {
               char var3 = class653.field9779[var2 + -128];
               if (~var3 == -1) {
                  var3 = '?';
               }

               var2 = var3;
            }

            return (char)var2;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6552[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 49
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         ++field6546;
         int var3 = -21 % ((-23 - arg1) / 45);
         arg0.method1939(this.field6544, this.field6541, this.field6545, -61, this.field6551);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6552[0] + (arg0 != null ? field6552[1] : field6552[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "b",
      descriptor = "(B)V",
      line = 74
   )
   public static void method3362(byte arg0) {
      try {
         if (arg0 >= 122) {
            field6543 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6552[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ILha;ILd;III)V",
      line = 92
   )
   public static final void method3363(int arg0, class610 arg1, int arg2, class150 arg3, int arg4, int arg5, int arg6) {
      try {
         if (class598.field8777 < 100) {
            class593.method4415(arg3, true, arg1);
         }

         ++field6549;
         arg1.method629(arg4, arg0, arg4 - -arg2, arg0 + arg6);
         if (class598.field8777 < 100) {
            byte var7 = 20;
            int var8 = arg2 / 2 + arg4;
            arg1.method631(arg4, arg0, arg2, arg6, -16777216, 0);
            int var9 = arg6 / 2 + -var7 + arg0 + -18;
            arg1.method602(var8 + -152, var9, 304, 34, class233.field3563[class174.field2686].getRGB(), 0);
            arg1.method631(var8 - 150, var9 + 2, class598.field8777 * 3, 30, class222.field3347[class174.field2686].getRGB(), 0);
            class156.field2324.method2405(var9 - -var7, class499.field7606.method3875(class493.field7455, 127), -1, var8, class440.field6777[class174.field2686].getRGB(), (byte)-23);
         } else {
            int var10 = -((int)((float)arg2 / class60.field751)) + class354.field5389;
            int var11 = class546.field8195 - -((int)((float)arg6 / class60.field751));
            int var12 = (int)((float)arg2 / class60.field751) + class354.field5389;
            class781.field11452 = -((int)((float)arg6 / class60.field751)) + class546.field8195;
            int var13 = -((int)((float)arg6 / class60.field751)) + class546.field8195;
            class503.field7682 = (int)((float)(arg2 * 2) / class60.field751);
            class43.field574 = class354.field5389 - (int)((float)arg2 / class60.field751);
            class561.field8340 = (int)((float)(arg6 * 2) / class60.field751);
            class60.method444(class60.field774 + var10, class60.field763 + var11, class60.field774 + var12, var13 - -class60.field763, arg4, arg0, arg4 - -arg2, arg0 + 1 + arg6);
            class60.method447(arg1);
            class675 var14 = class60.method462(arg1);
            int var15 = -56 / ((-63 - arg5) / 51);
            class247.method2098(0, arg1, var14, 0, 0);
            if (class475.field7231 > 0) {
               --class241.field3658;
               if (class241.field3658 == 0) {
                  --class475.field7231;
                  class241.field3658 = 20;
               }
            }

            if (class636.field9187) {
               int var16 = arg2 - 5 + arg4;
               int var17 = arg6 - 8 + arg0;
               class577.field8538.method2403(25, var16, var17, -1, 16776960, field6552[4] + class14.field178);
               int var23 = var17 - 15;
               Runtime var18 = Runtime.getRuntime();
               int var19 = (int)((var18.totalMemory() + -var18.freeMemory()) / 1024L);
               int var20 = 16776960;
               if (var19 > 65536) {
                  var20 = 16711680;
               }

               class577.field8538.method2403(-12, var16, var23, -1, var20, field6552[6] + var19 + "k");
               var17 = var23 - 15;
            }
         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field6552[5] + arg0 + ',' + (arg1 != null ? field6552[1] : field6552[2]) + ',' + arg2 + ',' + (arg3 != null ? field6552[1] : field6552[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3364(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3365(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
