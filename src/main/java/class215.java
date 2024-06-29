import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class215 extends class686 {
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3079 = new String[]{method1858(method1857("] E\u00190\u0011")), method1858(method1857("W7H[")), method1858(method1857("Bl\n\u0019\u000e")), method1858(method1857("] E\u00191\u0011")), method1858(method1857("] E\u00192\u0011")), method1858(method1857("] E\u00197\u0011")), method1858(method1857("] E\u00196\u0011"))};
   @OriginalMember(
      owner = "client!dba",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field3073 = new int[13];
   @OriginalMember(
      owner = "client!dba",
      name = "u",
      descriptor = "I"
   )
   public static int field3068;
   @OriginalMember(
      owner = "client!dba",
      name = "q",
      descriptor = "I"
   )
   public static int field3069;
   @OriginalMember(
      owner = "client!dba",
      name = "r",
      descriptor = "I"
   )
   public static int field3070;
   @OriginalMember(
      owner = "client!dba",
      name = "w",
      descriptor = "I"
   )
   public static int field3071;
   @OriginalMember(
      owner = "client!dba",
      name = "l",
      descriptor = "I"
   )
   public static int field3072;
   @OriginalMember(
      owner = "client!dba",
      name = "m",
      descriptor = "I"
   )
   public int field3074;
   @OriginalMember(
      owner = "client!dba",
      name = "o",
      descriptor = "I"
   )
   public int field3075;
   @OriginalMember(
      owner = "client!dba",
      name = "n",
      descriptor = "I"
   )
   public static int field3076;
   @OriginalMember(
      owner = "client!dba",
      name = "s",
      descriptor = "I"
   )
   public int field3077;
   @OriginalMember(
      owner = "client!dba",
      name = "t",
      descriptor = "I"
   )
   public int field3078;
   @OriginalMember(
      owner = "client!dba",
      name = "p",
      descriptor = "Lbt;"
   )
   public class395 field3067;

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Ljq;I)I"
   )
   public static final int method1852(class211 arg0, int arg1) {
      try {
         ++field3072;
         int var2 = -54 / ((arg1 - -47) / 50);
         String var3 = class259.method2224(arg0, 8);
         return class705.field10143.method3429(-115, class134.field2183, var3);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3079[5] + (arg0 != null ? field3079[2] : field3079[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method1853(int arg0, String arg1) {
      try {
         ++field3068;
         if (arg0 == 2) {
            class203.method1764(0, (byte)-7, "", "", 0, "", arg1);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3079[4] + arg0 + ',' + (arg1 != null ? field3079[2] : field3079[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1854(byte arg0) {
      try {
         if (arg0 >= -123) {
            field3070 = 110;
         }

         class451.field6572 = true;
         ++field3069;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3079[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V"
   )
   public static final void method1855(String arg0, String arg1, int arg2, int arg3) {
      try {
         ++field3071;
         class527.field7461 = class745.field10605;
         class585.field8203 = arg3;
         class793.field11537 = 2;
         class216.method1867(arg0, false, false, 0, arg1);
         int var4 = 85 / ((-19 - arg2) / 50);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3079[0] + (arg0 != null ? field3079[2] : field3079[1]) + ',' + (arg1 != null ? field3079[2] : field3079[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1856(int arg0) {
      try {
         if (arg0 != 0) {
            method1854((byte)125);
         }

         field3073 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3079[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1857(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1858(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
