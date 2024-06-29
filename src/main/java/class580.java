import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class class580 extends class96 {
   @OriginalMember(
      owner = "client!qea",
      name = "s",
      descriptor = "I"
   )
   public int field8167;
   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8171 = new String[]{method4278(method4277("ny^Md7")), method4278(method4277("ny^Me7")), method4278(method4277("ny^M\u001avrV\u0017\u00187"))};
   @OriginalMember(
      owner = "client!qea",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field8169 = new int[4];
   @OriginalMember(
      owner = "client!qea",
      name = "t",
      descriptor = "I"
   )
   public static int field8168;
   @OriginalMember(
      owner = "client!qea",
      name = "q",
      descriptor = "I"
   )
   public static int field8170;
   @OriginalMember(
      owner = "client!qea",
      name = "r",
      descriptor = "Lsa;"
   )
   public static class39 field8166;

   @OriginalMember(
      owner = "client!qea",
      name = "b",
      descriptor = "(B)Z"
   )
   public abstract boolean method2067(byte arg0);

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4275(int arg0) {
      try {
         field8166 = null;
         field8169 = null;
         if (arg0 != -21460) {
            field8169 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8171[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class580(int arg0) {
      try {
         this.field8167 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8171[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "a",
      descriptor = "(IIIIBIII)V"
   )
   public static final void method4276(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
      try {
         int var8;
         label30: {
            ++field8170;
            var8 = arg2 + -334;
            if (var8 < 0) {
               var8 = 0;
               if (!client.field10022) {
                  break label30;
               }
            }

            if (var8 > 100) {
               var8 = 100;
            }
         }

         int var9 = class708.field10163 - -((class562.field7992 - class708.field10163) * var8 / 100);
         int var17 = arg6 * var9 >> 8;
         class582.field8178 = class582.field8174 * var9 >> 8;
         int var10 = 16383 & -arg3 + 16384;
         int var11 = 16383 & 16384 - arg5;
         int var12 = 0;
         int var13 = 0;
         if (arg4 < 94) {
            field8166 = null;
         }

         int var14 = var17;
         if (var10 != 0) {
            var13 = class160.field2447[var10] * -var17 >> 14;
            var14 = class160.field2446[var10] * var17 >> 14;
         }

         if (~var11 != -1) {
            var12 = class160.field2447[var11] * var14 >> 14;
            var14 = class160.field2446[var11] * var14 >> 14;
         }

         class576.field8141 = -var13 + arg7;
         class313.field4701 = arg3;
         class222.field3158 = arg1 - var14;
         class670.field9407 = -var12 + arg0;
         class75.field1201 = arg5;
         class103.field1628 = 0;
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field8171[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qea",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method2068(byte arg0);

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4277(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4278(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
