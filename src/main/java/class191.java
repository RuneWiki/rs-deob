import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class191 extends class55 {
   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2720 = new String[]{method1511(method1510("k\u007f*\b\u0019")), method1511(method1510("k\u007f*\u0007\u0019")), method1511(method1510("k\u007f*\t\u0019")), method1511(method1510("k\u007f*\u000e\u0019")), method1511(method1510("k\u007f*\f\u0019")), method1511(method1510("k\u007f*\n\u0019")), method1511(method1510("k\u007f*\r\u0019"))};
   @OriginalMember(
      owner = "client!ei",
      name = "n",
      descriptor = "Lwv;"
   )
   public static class37 field2708 = new class37(8);
   @OriginalMember(
      owner = "client!ei",
      name = "q",
      descriptor = "[S"
   )
   private static short[] field2714 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!ei",
      name = "l",
      descriptor = "[S"
   )
   private static short[] field2715 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!ei",
      name = "p",
      descriptor = "[S"
   )
   private static short[] field2718 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!ei",
      name = "f",
      descriptor = "[[S"
   )
   public static short[][] field2716 = new short[][]{field2715, field2718, field2714};
   @OriginalMember(
      owner = "client!ei",
      name = "h",
      descriptor = "Leg;"
   )
   public static class118 field2712 = new class118(94, 12);
   @OriginalMember(
      owner = "client!ei",
      name = "k",
      descriptor = "Llea;"
   )
   public static class639 field2719 = new class639(12, 2);
   @OriginalMember(
      owner = "client!ei",
      name = "m",
      descriptor = "I"
   )
   public static int field2707;
   @OriginalMember(
      owner = "client!ei",
      name = "i",
      descriptor = "I"
   )
   public static int field2709;
   @OriginalMember(
      owner = "client!ei",
      name = "e",
      descriptor = "I"
   )
   public static int field2710;
   @OriginalMember(
      owner = "client!ei",
      name = "j",
      descriptor = "I"
   )
   public static int field2711;
   @OriginalMember(
      owner = "client!ei",
      name = "o",
      descriptor = "I"
   )
   public static int field2713;
   @OriginalMember(
      owner = "client!ei",
      name = "g",
      descriptor = "I"
   )
   public static int field2717;

   @OriginalMember(
      owner = "client!ei",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1507(boolean arg0) {
      try {
         field2715 = null;
         field2719 = null;
         field2716 = null;
         field2708 = null;
         field2712 = null;
         field2714 = null;
         if (!arg0) {
            method1507(false);
         }

         field2718 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2720[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(Z)Ljava/lang/String;"
   )
   public static final String method1508(boolean arg0) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field2710;
            if (!class131.field1677 && class521.field7496 != null) {
               return (class521.field7496.field471 == null || ~class521.field7496.field471.length() == -1) && class521.field7496.field467 != null && ~class521.field7496.field467.length() < -1 ? class521.field7496.field467 : class521.field7496.field471;
            } else {
               return "";
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2720[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field2707;
         return arg0 > -116 ? -103 : 3;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2720[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field2717;
         if (~super.field680 > -1 || super.field680 > 4) {
            super.field680 = this.method101(-122);
         }

         if (arg0 != 0) {
            field2712 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2720[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class191(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field2709;
         if (arg1 != 105) {
            field2718 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2720[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1509(int arg0) {
      try {
         int var2 = 118 / ((36 - arg0) / 41);
         ++field2711;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2720[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         super.field680 = arg0;
         int var3 = -38 / ((arg1 - 47) / 46);
         ++field2713;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2720[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ei",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class191(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1510(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ei",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1511(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
