import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class692 extends class610 {
   @OriginalMember(
      owner = "client!rda",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10187 = new String[]{method5052(method5051("\u0007\"&X']")), method5052(method5051("\u0007\"&X$]")), method5052(method5051("\u0007\"&X ]")), method5052(method5051("\u0007\"&X+]"))};
   @OriginalMember(
      owner = "client!rda",
      name = "G",
      descriptor = "Lek;"
   )
   public static class536 field10181 = new class536(66, -1);
   @OriginalMember(
      owner = "client!rda",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field10186 = new int[4];
   @OriginalMember(
      owner = "client!rda",
      name = "E",
      descriptor = "I"
   )
   public static int field10182;
   @OriginalMember(
      owner = "client!rda",
      name = "H",
      descriptor = "I"
   )
   public static int field10183;
   @OriginalMember(
      owner = "client!rda",
      name = "F",
      descriptor = "I"
   )
   public static int field10184;
   @OriginalMember(
      owner = "client!rda",
      name = "J",
      descriptor = "I"
   )
   public static int field10185;

   @OriginalMember(
      owner = "client!rda",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public final void method4438(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10184;
         int var6 = super.field8948.method960();
         if (arg0 > -88) {
            method5050(7);
         }

         int var7 = ((class655)super.field10175).field9590 * class351.method2558((byte)91) / 10 % var6;
         super.field8948.method3569(arg4 + var7 + -var6, arg1, arg2 + var6 + -var7, arg3);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field10187[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5048(boolean arg0) {
      try {
         field10186 = null;
         field10181 = null;
         if (arg0) {
            field10186 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10187[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5049(byte arg0) {
      try {
         class300.field4107.method3301(25349, class300.field4107.field6424, 1);
         ++field10183;
         class300.field4107.method3301(25349, class300.field4107.field6412, 1);
         class300.field4107.method3301(25349, class300.field4107.field6408, 1);
         class300.field4107.method3301(25349, class300.field4107.field6413, 1);
         class300.field4107.method3301(25349, class300.field4107.field6448, 1);
         class300.field4107.method3301(25349, class300.field4107.field6449, 1);
         class300.field4107.method3301(25349, class300.field4107.field6437, 0);
         class300.field4107.method3301(25349, class300.field4107.field6411, 0);
         class300.field4107.method3301(25349, class300.field4107.field6427, 0);
         if (arg0 <= 32) {
            method5048(true);
         }

         class300.field4107.method3301(25349, class300.field4107.field6423, 0);
         class300.field4107.method3301(25349, class300.field4107.field6434, 0);
         class300.field4107.method3301(25349, class300.field4107.field6431, 0);
         class300.field4107.method3301(25349, class300.field4107.field6407, 0);
         class300.field4107.method3301(25349, class300.field4107.field6455, 0);
         class300.field4107.method3301(25349, class300.field4107.field6453, 0);
         class300.field4107.method3301(25349, class300.field4107.field6421, 0);
         class300.field4107.method3301(25349, class300.field4107.field6436, 0);
         class300.field4107.method3301(25349, class300.field4107.field6429, 0);
         class300.field4107.method3301(25349, class300.field4107.field6450, 0);
         class11.method59(true);
         class300.field4107.method3301(25349, class300.field4107.field6444, 2);
         class300.field4107.method3301(25349, class300.field4107.field6432, 2);
         class793.method5717(5539);
         class85.method760(0);
         class101.field1292 = true;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10187[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "<init>",
      descriptor = "(Lkf;Lkf;Loo;)V"
   )
   public class692(class266 arg0, class266 arg1, class655 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!rda",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method5050(int arg0) {
      try {
         if (arg0 < -36) {
            ++field10182;
            if (class168.field2350 != -1) {
               class199.method1572(class168.field2350, false, -1, false, -1);
               class168.field2350 = -1;
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10187[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5051(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5052(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
