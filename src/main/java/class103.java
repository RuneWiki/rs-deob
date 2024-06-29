import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class103 extends class327 {
   @OriginalMember(
      owner = "client!qa",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1630 = new String[]{method1016(method1015("0)\u0001\"%")), method1016(method1015("/=C\n")), method1016(method1015(":f\u0001Hp")), method1016(method1015("0)\u0001-%")), method1016(method1015("0)\u0001*%")), method1016(method1015("0)\u0001+%"))};
   @OriginalMember(
      owner = "client!qa",
      name = "M",
      descriptor = "I"
   )
   public static int field1625 = 0;
   @OriginalMember(
      owner = "client!qa",
      name = "I",
      descriptor = "Lfm;"
   )
   public static class164 field1622 = new class164(56, -1);
   @OriginalMember(
      owner = "client!qa",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field1629 = null;
   @OriginalMember(
      owner = "client!qa",
      name = "O",
      descriptor = "I"
   )
   public static int field1623;
   @OriginalMember(
      owner = "client!qa",
      name = "H",
      descriptor = "I"
   )
   public static int field1626;
   @OriginalMember(
      owner = "client!qa",
      name = "J",
      descriptor = "I"
   )
   public static int field1627;
   @OriginalMember(
      owner = "client!qa",
      name = "N",
      descriptor = "I"
   )
   public static int field1628;
   @OriginalMember(
      owner = "client!qa",
      name = "K",
      descriptor = "[B"
   )
   private byte[] field1624;

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1011(int arg0, int arg1, byte arg2) {
      try {
         ++field1626;
         int var4 = arg0 * 2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field1624[var10001] = -1;
         int var5 = arg2 & 255;
         if (arg1 <= 3) {
            field1622 = null;
         }

         this.field1624[var8] = (byte)(var5 * 3 >> 5);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1630[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "<init>",
      descriptor = "()V"
   )
   public class103() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!qa",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1012(int arg0) {
      try {
         field1629 = null;
         if (arg0 == 5) {
            field1622 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1630[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(IIBI)[B"
   )
   public final byte[] method1013(int arg0, int arg1, byte arg2, int arg3) {
      try {
         int var5 = -116 / ((arg2 - 32) / 43);
         ++field1627;
         this.field1624 = new byte[arg1 * arg3 * arg0 * 2];
         this.method1522(arg0, arg1, arg3, -95);
         return this.field1624;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1630[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(ZILcu;)V"
   )
   public static final void method1014(boolean arg0, int arg1, class65 arg2) {
      try {
         ++field1623;
         if (class365.field5401 != null) {
            try {
               class365.field5401.method1788(0L, 0);
               class365.field5401.method1785(arg2.field942, 24, arg1, (byte)121);
            } catch (Exception var4) {
            }
         }

         if (arg0) {
            field1622 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1630[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1630[2] : field1630[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1015(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1016(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
