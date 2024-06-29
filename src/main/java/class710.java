import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class710 extends class673 {
   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10424 = new String[]{method5190(method5189("\r\u001cZ\rIC")), method5190(method5189("\r\u001cZ\rHC")), method5190(method5189("\r\u001cZ\rKC")), method5190(method5189("\r\u001cZ\rNC")), method5190(method5189("\r\u001cZ\rOC"))};
   @OriginalMember(
      owner = "client!fda",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field10421 = new int[2048];
   @OriginalMember(
      owner = "client!fda",
      name = "o",
      descriptor = "I"
   )
   public int field10417;
   @OriginalMember(
      owner = "client!fda",
      name = "l",
      descriptor = "I"
   )
   public static int field10418;
   @OriginalMember(
      owner = "client!fda",
      name = "p",
      descriptor = "I"
   )
   public static int field10419;
   @OriginalMember(
      owner = "client!fda",
      name = "r",
      descriptor = "I"
   )
   public static int field10420;
   @OriginalMember(
      owner = "client!fda",
      name = "m",
      descriptor = "I"
   )
   public int field10422;
   @OriginalMember(
      owner = "client!fda",
      name = "n",
      descriptor = "I"
   )
   public static int field10423;

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method5184(byte arg0, int arg1, int arg2) {
      try {
         ++field10423;
         if (arg0 != -8) {
            field10421 = null;
         }

         class487 var3 = class2.method12((long)arg2, 16, (byte)43);
         var3.method3694(arg0 + -21784);
         var3.field6794 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10424[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(B)Ljava/lang/String;"
   )
   public static final String method5185(byte arg0) {
      try {
         ++field10420;
         if (!class652.field9742 && class213.field2705 != null) {
            return arg0 > -60 ? null : class213.field2705.field7905;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10424[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5186(int arg0) {
      try {
         field10421 = null;
         if (arg0 != -1) {
            field10421 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10424[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5187(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg3 != 6647) {
            field10421 = null;
         }

         if (~class415.field5689 >= ~arg1 && ~class282.field3921 <= ~arg1) {
            int var7 = class180.method1522(arg3 ^ 31328, class577.field8561, class586.field8647, arg0);
            int var8 = class180.method1522(25495, class577.field8561, class586.field8647, arg4);
            class694.method5059(arg2, (byte)-38, arg1, var7, var8);
         }

         ++field10418;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10424[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(ZIII)I"
   )
   public static final int method5188(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10419;
         class657 var4 = class733.method5295(arg3, arg0, (byte)115);
         if (var4 == null) {
            return -1;
         } else if (arg1 >= 0 && ~arg1 > ~var4.field9798.length) {
            if (arg2 != -1) {
               field10421 = null;
            }

            return var4.field9798[arg1];
         } else {
            return -1;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10424[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5189(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5190(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
