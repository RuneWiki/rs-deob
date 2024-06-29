import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class460 extends class128 {
   @OriginalMember(
      owner = "client!sg",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   private String field6708 = null;
   @OriginalMember(
      owner = "client!sg",
      name = "v",
      descriptor = "J"
   )
   private long field6711 = -1L;
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6713 = new String[]{method3557(method3556("H\u0007jkF\r\u0018agI\rP")), method3557(method3556("\u0005\u000fbdA\u001a\u0002nuLR")), method3557(method3556("\u001b\r!D\f")), method3557(method3556("\u0013D!(Y")), method3557(method3556("\u0006\u001fcj")), method3557(method3556("\u001b\r!G\f")), method3557(method3556("\u001b\r!C\f")), method3557(method3556("\u001b\r!E\f")), method3557(method3556("\u001b\r!B\f"))};
   @OriginalMember(
      owner = "client!sg",
      name = "o",
      descriptor = "I"
   )
   public static int field6701 = -1;
   @OriginalMember(
      owner = "client!sg",
      name = "y",
      descriptor = "Lsb;"
   )
   public static class261 field6702 = new class261();
   @OriginalMember(
      owner = "client!sg",
      name = "q",
      descriptor = "B"
   )
   private byte field6703;
   @OriginalMember(
      owner = "client!sg",
      name = "n",
      descriptor = "I"
   )
   public static int field6704;
   @OriginalMember(
      owner = "client!sg",
      name = "u",
      descriptor = "I"
   )
   public static int field6705;
   @OriginalMember(
      owner = "client!sg",
      name = "w",
      descriptor = "I"
   )
   private int field6706;
   @OriginalMember(
      owner = "client!sg",
      name = "x",
      descriptor = "I"
   )
   public static int field6707;
   @OriginalMember(
      owner = "client!sg",
      name = "s",
      descriptor = "I"
   )
   public static int field6710;
   @OriginalMember(
      owner = "client!sg",
      name = "t",
      descriptor = "[I"
   )
   public static int[] field6709;
   @OriginalMember(
      owner = "client!sg",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field6712;

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(Laa;BIILjga;ILma;I)V"
   )
   public static final void method3553(class684 arg0, byte arg1, int arg2, int arg3, class91 arg4, int arg5, class148 arg6, int arg7) {
      try {
         ++field6705;
         if (arg6 != null) {
            int var8;
            label47: {
               if (class306.field4639 != 4) {
                  var8 = 16383 & (int)class86.field1312 + class647.field9122;
                  if (!client.field10022) {
                     break label47;
                  }
               }

               var8 = (int)class86.field1312 & 16383;
            }

            int var9 = 10 + Math.max(arg4.field1513 / 2, arg4.field1452 / 2);
            int var10 = arg3 * arg3 + arg5 * arg5;
            if (var9 * var9 >= var10) {
               int var11 = class160.field2447[var8];
               if (arg1 >= -13) {
                  method3555(-44);
               }

               int var12 = class160.field2446[var8];
               if (class306.field4639 != 4) {
                  var11 = var11 * 256 / (class455.field6620 + 256);
                  var12 = var12 * 256 / (class455.field6620 + 256);
               }

               int var13 = arg3 * var11 + arg5 * var12 >> 14;
               int var14 = arg3 * var12 - arg5 * var11 >> 14;
               arg6.method1347(var13 + arg4.field1513 / 2 + arg2 + -(arg6.method1351() / 2), arg4.field1452 / 2 + arg7 - (var14 - -(arg6.method1356() / 2)), arg0, arg2, arg7);
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field6713[8] + (arg0 != null ? field6713[3] : field6713[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6713[3] : field6713[4]) + ',' + arg5 + ',' + (arg6 != null ? field6713[3] : field6713[4]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "b",
      descriptor = "(II)Ljga;"
   )
   public static final class91 method3554(int arg0, int arg1) {
      try {
         ++field6710;
         if (arg0 >= -77) {
            field6701 = 91;
         }

         int var2 = arg1 >> 16;
         int var3 = arg1 & 65535;
         if (class315.field4719[var2] == null || class315.field4719[var2][var3] == null) {
            boolean var4 = class132.method1345(-128, var2);
            if (!var4) {
               return null;
            }
         }

         return class315.field4719[var2][var3];
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6713[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method608(class65 arg0, int arg1) {
      try {
         if (~arg0.method665(false) != -256) {
            --arg0.field945;
            this.field6711 = arg0.method680(-129);
         }

         ++field6704;
         this.field6708 = arg0.method641((byte)81);
         this.field6706 = arg0.method685(-2);
         this.field6703 = arg0.method638(true);
         if (arg1 == 4206) {
            arg0.method680(-129);
            if (class705.field10148) {
               System.out.println(field6713[1] + this.field6711 + field6713[0] + this.field6708);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6713[2] + (arg0 != null ? field6713[3] : field6713[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public final void method606(class360 arg0, byte arg1) {
      try {
         ++field6707;
         class622 var3 = new class622();
         var3.field8883 = this.field6703;
         int var4 = 36 / ((50 - arg1) / 53);
         var3.field8891 = this.field6708;
         var3.field8890 = this.field6706;
         arg0.method2831(5668, var3);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6713[7] + (arg0 != null ? field6713[3] : field6713[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3555(int arg0) {
      try {
         field6709 = null;
         field6712 = null;
         field6702 = null;
         int var1 = 93 % ((33 - arg0) / 62);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6713[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3556(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3557(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
