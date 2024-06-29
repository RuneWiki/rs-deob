import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class689 extends class515 {
   @OriginalMember(
      owner = "client!lw",
      name = "p",
      descriptor = "Lfc;"
   )
   public class272 field10149;
   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10152 = new String[]{method5032(method5031("RA HLP_zJ\r")), method5032(method5031("E\u0018 ZX")), method5032(method5031("PCb\u0018")), method5032(method5031("RA 6\r")), method5032(method5031("RA 7\r")), method5032(method5031("RA 5\r"))};
   @OriginalMember(
      owner = "client!lw",
      name = "m",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field10147 = new String[][]{{method5032(method5031("s\u0007")), method5032(method5031("s\u0004")), method5032(method5031("m\u0007")), "F"}, {method5032(method5031("s\u0007")), method5032(method5031("s\u0004")), method5032(method5031("s\u0005")), method5032(method5031("m\u0007")), method5032(method5031("m\u0004")), "F"}, {method5032(method5031("s\u0007")), method5032(method5031("s\u0004")), method5032(method5031("s\u0005")), method5032(method5031("s\u0002")), method5032(method5031("m\u0007")), method5032(method5031("m\u0004")), method5032(method5031("m\u0005")), "F"}};
   @OriginalMember(
      owner = "client!lw",
      name = "l",
      descriptor = "I"
   )
   public static int field10146;
   @OriginalMember(
      owner = "client!lw",
      name = "n",
      descriptor = "I"
   )
   public static int field10148;
   @OriginalMember(
      owner = "client!lw",
      name = "o",
      descriptor = "I"
   )
   public static int field10150;
   @OriginalMember(
      owner = "client!lw",
      name = "q",
      descriptor = "I"
   )
   public static int field10151;

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(B)V",
      line = 7
   )
   public static void method5028(byte arg0) {
      try {
         field10147 = null;
         int var1 = -70 % ((50 - arg0) / 61);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10152[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(IB)Z",
      line = 16
   )
   public static final boolean method5029(int arg0, byte arg1) {
      try {
         ++field10150;
         if (arg1 >= -83) {
            field10151 = -124;
         }

         return ~arg0 <= -13 && ~arg0 >= -18;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10152[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "c",
      descriptor = "(I)[I",
      line = 33
   )
   public static final int[] method5030(int arg0) {
      try {
         int var1 = -84 / ((arg0 - -53) / 58);
         ++field10146;
         return new int[]{class660.field9616, class351.field4726, class709.field10357};
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10152[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "(Lsc;II[B)V",
      line = 45
   )
   public class689(class369 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field10149 = arg0.method2743(arg2, false, class46.field621, arg3, -5, arg1);
         this.field10149.method277(true, false, false);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10152[0] + (arg0 != null ? field10152[1] : field10152[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10152[1] : field10152[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "(Lsc;II[I)V",
      line = 57
   )
   public class689(class369 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field10149 = arg0.method2759(false, arg2, 0, arg3, arg1);
         this.field10149.method277(true, false, false);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10152[0] + (arg0 != null ? field10152[1] : field10152[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10152[1] : field10152[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5031(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5032(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
