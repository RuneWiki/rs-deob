import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class59 extends class128 {
   @OriginalMember(
      owner = "client!rha",
      name = "p",
      descriptor = "I"
   )
   private int field851 = -1;
   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field854 = new String[]{method612(method611("'gT\u0017")), method612(method611(";zYUua")), method612(method611("2<\u0016UK")), method612(method611(";zYUsa")), method612(method611(";zYUta")), method612(method611(";zYUwa")), method612(method611(";zYU~a")), method612(method611(";zYUra"))};
   @OriginalMember(
      owner = "client!rha",
      name = "q",
      descriptor = "[C"
   )
   public static char[] field846 = new char[]{'[', ']', '#'};
   @OriginalMember(
      owner = "client!rha",
      name = "o",
      descriptor = "Lfm;"
   )
   public static class164 field847 = new class164(20, 8);
   @OriginalMember(
      owner = "client!rha",
      name = "t",
      descriptor = "I"
   )
   public static int field844;
   @OriginalMember(
      owner = "client!rha",
      name = "u",
      descriptor = "I"
   )
   public static int field845;
   @OriginalMember(
      owner = "client!rha",
      name = "r",
      descriptor = "I"
   )
   public static int field848;
   @OriginalMember(
      owner = "client!rha",
      name = "v",
      descriptor = "I"
   )
   public static int field850;
   @OriginalMember(
      owner = "client!rha",
      name = "w",
      descriptor = "I"
   )
   public static int field852;
   @OriginalMember(
      owner = "client!rha",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field853;
   @OriginalMember(
      owner = "client!rha",
      name = "n",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field849;

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method605(int arg0) {
      try {
         if (arg0 != -29104) {
            field847 = null;
         }

         field853 = null;
         field846 = null;
         field849 = null;
         field847 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field854[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public final void method606(class360 arg0, byte arg1) {
      try {
         int var3 = 57 / ((arg1 - 50) / 53);
         arg0.method2826(this.field851, -104);
         ++field850;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field854[1] + (arg0 != null ? field854[2] : field854[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method607(String arg0, byte arg1) {
      try {
         ++field848;
         class772.field11182 = arg0;
         class454.field6601 = class772.field11182.length();
         if (arg1 < 33) {
            method610(-74, -81, -31, -12, (class17)null, (class544)null);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field854[6] + (arg0 != null ? field854[2] : field854[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method608(class65 arg0, int arg1) {
      try {
         ++field852;
         this.field851 = arg0.method685(-2);
         if (arg1 != 4206) {
            method605(114);
         }

         arg0.method665(false);
         if (arg0.method665(false) != 255) {
            --arg0.field945;
            arg0.method680(-129);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field854[4] + (arg0 != null ? field854[2] : field854[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method609(byte arg0, int arg1) {
      try {
         class107 var2 = class455.field6619;
         synchronized(class455.field6619) {
            class455.field6619.method1048(arg1, -8543);
         }

         if (arg0 != -56) {
            method605(121);
         }

         ++field844;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field854[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "a",
      descriptor = "(IIIILha;Lbha;)V"
   )
   public static final void method610(int arg0, int arg1, int arg2, int arg3, class17 arg4, class544 arg5) {
      try {
         ++field845;
         if (arg0 == 4) {
            class104 var6 = class376.field5490.method2363(arg5.field7691, arg0 + 116);
            if (var6.field1640 != -1) {
               label48: {
                  if (!arg5.field7683) {
                     arg2 = 0;
                     if (!client.field10022) {
                        break label48;
                     }
                  }

                  arg2 += arg5.field7709;
                  arg2 &= 3;
               }

               class148 var7 = var6.method1020(1, arg4, arg5.field7736, arg2);
               if (var7 != null) {
                  int var8 = arg5.field7755;
                  int var9 = arg5.field7687;
                  if (~(arg2 & 1) == -2) {
                     var9 = arg5.field7755;
                     var8 = arg5.field7687;
                  }

                  int var10 = var7.method1351();
                  int var11 = var7.method1356();
                  if (var6.field1642) {
                     var11 = var9 * 4;
                     var10 = var8 * 4;
                  }

                  if (~var6.field1633 != -1) {
                     var7.method1450(arg1, -(var9 * 4) + arg3 + 4, var10, var11, 0, -16777216 | var6.field1633, 1);
                  } else {
                     var7.method1449(arg1, -((var9 + -1) * 4) + arg3, var10, var11);
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field854[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field854[2] : field854[0]) + ',' + (arg5 != null ? field854[2] : field854[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method611(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method612(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
