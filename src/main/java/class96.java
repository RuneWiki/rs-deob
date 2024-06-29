import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class96 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1356 = new String[]{method950(method949("x\fI\\m")), method950(method949("x\fI]m")), method950(method949("x\fI_m"))};
   @OriginalMember(
      owner = "client!aa",
      name = "c",
      descriptor = "Let;"
   )
   public static class389 field1351 = new class389(16);
   @OriginalMember(
      owner = "client!aa",
      name = "d",
      descriptor = "[Z"
   )
   public static boolean[] field1352 = new boolean[8];
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "[Z"
   )
   public static boolean[] field1354 = new boolean[8];
   @OriginalMember(
      owner = "client!aa",
      name = "f",
      descriptor = "Lrga;"
   )
   public static class694 field1353 = new class694();
   @OriginalMember(
      owner = "client!aa",
      name = "e",
      descriptor = "I"
   )
   public static int field1349;
   @OriginalMember(
      owner = "client!aa",
      name = "g",
      descriptor = "I"
   )
   public static int field1350;
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "[Ls;"
   )
   public static class271[] field1355;

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(II)V",
      line = 5
   )
   public static final void method946(int arg0, int arg1) {
      try {
         ++field1350;
         class475.field7231 = 3;
         class600.field8790 = arg0;
         class739.field10981 = arg1;
         class241.field3658 = 100;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1356[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 17
   )
   public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field1349;
         class400.field6271 = arg1;
         class459.field7004 = arg3;
         class603.field8817 = arg0;
         class103.field1437 = arg5;
         class85.field1247 = arg2;
         if (arg4 != 1024) {
            method946(-36, -30);
         }

         if (~class603.field8817 <= -101) {
            int var6 = class459.field7004 * 512 + 256;
            int var7 = class103.field1437 * 512 - -256;
            int var8 = class477.method3711(class464.field7054, var6, (byte)0, var7) + -class400.field6271;
            int var9 = -class401.field6288 + var6;
            int var10 = -class653.field9780 + var8;
            int var11 = -class691.field10259 + var7;
            int var12 = (int)Math.sqrt((double)(var9 * var9 - -(var11 * var11)));
            class703.field10589 = (int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) & 16383;
            class317.field4895 = (int)(-2607.5945876176133D * Math.atan2((double)var9, (double)var11)) & 16383;
            if (~class703.field10589 > -1025) {
               class703.field10589 = 1024;
            }

            class674.field10029 = 0;
            if (class703.field10589 > 3072) {
               class703.field10589 = 3072;
            }
         }

         class572.field8464 = -1;
         class697.field10346 = -1;
         class648.field9340 = 2;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field1356[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(I)V",
      line = 70
   )
   public static void method948(int arg0) {
      try {
         field1354 = null;
         field1355 = null;
         field1351 = null;
         field1353 = null;
         field1352 = null;
         if (arg0 != 4462) {
            method947(122, 46, 69, 25, 69, -124);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1356[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method949(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method950(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
