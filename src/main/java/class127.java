import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class class127 extends class500 {
   @OriginalMember(
      owner = "client!oda",
      name = "s",
      descriptor = "F"
   )
   public float field1596;
   @OriginalMember(
      owner = "client!oda",
      name = "k",
      descriptor = "I"
   )
   public int field1608;
   @OriginalMember(
      owner = "client!oda",
      name = "q",
      descriptor = "I"
   )
   private int field1603;
   @OriginalMember(
      owner = "client!oda",
      name = "j",
      descriptor = "I"
   )
   public int field1595;
   @OriginalMember(
      owner = "client!oda",
      name = "r",
      descriptor = "I"
   )
   public int field1594;
   @OriginalMember(
      owner = "client!oda",
      name = "x",
      descriptor = "I"
   )
   private int field1597;
   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1609 = new String[]{method1073(method1072("#\u001cVN\u0016d")), method1073(method1072("#\u001cVNg%\u0016^\u0014ed")), method1073(method1072("7V\u0019N&")), method1073(method1072("#\u001cVN\u0011d")), method1073(method1072("\"\r[\f")), method1073(method1072("#\u001cVN\u001cd")), method1073(method1072("#\u001cVN\u0017d")), method1073(method1072("#\u001cVN\u0012d")), method1073(method1072("#\u001cVN\u0013d")), method1073(method1072("#\u001cVN\u001dd")), method1073(method1072("#\u001cVN\u0015d")), method1073(method1072("#\u001cVN\u0010d"))};
   @OriginalMember(
      owner = "client!oda",
      name = "m",
      descriptor = "Lod;"
   )
   public static class536 field1601 = new class536();
   @OriginalMember(
      owner = "client!oda",
      name = "w",
      descriptor = "I"
   )
   public static int field1593;
   @OriginalMember(
      owner = "client!oda",
      name = "n",
      descriptor = "I"
   )
   public static int field1598;
   @OriginalMember(
      owner = "client!oda",
      name = "u",
      descriptor = "I"
   )
   public static int field1599;
   @OriginalMember(
      owner = "client!oda",
      name = "p",
      descriptor = "I"
   )
   public static int field1600;
   @OriginalMember(
      owner = "client!oda",
      name = "y",
      descriptor = "I"
   )
   public static int field1602;
   @OriginalMember(
      owner = "client!oda",
      name = "l",
      descriptor = "I"
   )
   public static int field1604;
   @OriginalMember(
      owner = "client!oda",
      name = "v",
      descriptor = "I"
   )
   public static int field1605;
   @OriginalMember(
      owner = "client!oda",
      name = "t",
      descriptor = "I"
   )
   public static int field1606;
   @OriginalMember(
      owner = "client!oda",
      name = "o",
      descriptor = "I"
   )
   public static int field1607;

   @OriginalMember(
      owner = "client!oda",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1063(int arg0) {
      try {
         if (arg0 != -1) {
            return -84;
         } else {
            ++field1604;
            return this.field1594;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1609[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method1064(int arg0) {
      try {
         ++field1602;
         return arg0 < 123 ? -28 : this.field1597;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1609[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1065(byte arg0) {
      try {
         if (arg0 >= -49) {
            this.method78(-55, -75, 104, (byte)32);
         }

         ++field1600;
         return this.field1608;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1609[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(IF)V"
   )
   public abstract void method76(int arg0, float arg1);

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1066(int arg0) {
      try {
         if (arg0 != -1) {
            this.field1608 = 83;
         }

         ++field1605;
         return this.field1603;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1609[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1067(int arg0) {
      try {
         if (arg0 != -1) {
            return -103;
         } else {
            ++field1599;
            return this.field1595;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1609[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "b",
      descriptor = "(B)[Lsq;"
   )
   public static final class190[] method1068(byte arg0) {
      try {
         if (arg0 != 71) {
            return null;
         } else {
            ++field1598;
            return new class190[]{class118.field1442, class387.field5419, class166.field2105};
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1609[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public abstract void method78(int arg0, int arg1, int arg2, byte arg3);

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;I)V"
   )
   public static final void method1069(int arg0, String arg1, String arg2, byte arg3, String arg4, String arg5, int arg6) {
      try {
         class131.method1098(arg2, arg6, -1, arg1, false, arg0, arg5, arg4, (String)null);
         ++field1593;
         if (arg3 <= 45) {
            method1069(-56, (String)null, (String)null, (byte)-45, (String)null, (String)null, 71);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1609[3] + arg0 + ',' + (arg1 != null ? field1609[2] : field1609[4]) + ',' + (arg2 != null ? field1609[2] : field1609[4]) + ',' + arg3 + ',' + (arg4 != null ? field1609[2] : field1609[4]) + ',' + (arg5 != null ? field1609[2] : field1609[4]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "g",
      descriptor = "(I)F"
   )
   public final float method1070(int arg0) {
      try {
         ++field1606;
         if (arg0 != -1) {
            field1607 = 52;
         }

         return this.field1596;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1609[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class127(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         this.field1596 = arg5;
         this.field1608 = arg1;
         this.field1603 = arg3;
         this.field1595 = arg2;
         this.field1594 = arg0;
         this.field1597 = arg4;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1609[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1071(byte arg0) {
      try {
         if (arg0 != -55) {
            field1601 = null;
         }

         field1601 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1609[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1073(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
