import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class335 {
   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5150 = new String[]{method2738(method2737("?n\u001ekWd")), method2738(method2737("?n\u001ekVd")), method2738(method2737("?n\u001ekTd"))};
   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "I"
   )
   public static int field5146;
   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "I"
   )
   public static int field5148;
   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "I"
   )
   public static int field5149;
   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "Lkp;"
   )
   public static class776 field5147;

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2734(boolean arg0) {
      try {
         field5147 = null;
         if (!arg0) {
            method2735(0);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5150[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2735(int arg0) {
      try {
         ++field5149;
         class203.field3098 = null;
         if (class281.field4472 && class187.method1682((byte)-30) != 1) {
            class492.method3810(0, ~class342.field5204 == -4 || class342.field5204 == 7, -1179648, 0, class2.method9(true), class334.method2730(120));
         }

         int var1 = 0;
         int var2 = arg0;
         if (class281.field4472) {
            var1 = class600.method4443(0);
            var2 = class218.method1890(0);
         }

         class640.method4674(var1, class316.field4878 + var1, var2, class288.field4539, -25977, var1, class692.field10301 + var2, -1, var2);
         if (class203.field3098 != null) {
            class419.method3338(class42.field567, var2, (byte)-77, class432.field6655.field5858, class692.field10301 + var2, class421.field6506, true, var1 - -class316.field4878, var1, -1412584499, class203.field3098);
            class203.field3098 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5150[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(IIIIIB)I"
   )
   public static final int method2736(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      try {
         ++field5148;
         if (class385.field6076 == null) {
            return 0;
         } else {
            int var6 = 85 % ((12 - arg5) / 55);
            if (~arg2 > -4) {
               int var7 = arg0 >> 9;
               int var8 = arg3 >> 9;
               if (arg1 < 0 || ~arg4 > -1 || ~(class513.field7828 + -1) > ~arg1 || ~arg4 < ~(class475.field7230 - 1)) {
                  return 0;
               }

               if (~var7 > -2 || var8 < 1 || ~var7 < ~(class513.field7828 + -1) || ~(class475.field7230 - 1) > ~var8) {
                  return 0;
               }

               boolean var9 = ~(2 & class757.field11211[1][arg0 >> 9][arg3 >> 9]) != -1;
               if (~(511 & arg0) == -1) {
                  boolean var10 = (class757.field11211[1][var7 + -1][arg3 >> 9] & 2) != 0;
                  boolean var11 = (class757.field11211[1][var7][arg3 >> 9] & 2) != 0;
                  if (!var11 == var10) {
                     var9 = ~(class757.field11211[1][arg1][arg4] & 2) != -1;
                  }
               }

               if ((511 & arg3) == 0) {
                  boolean var12 = (class757.field11211[1][arg0 >> 9][var8 + -1] & 2) != 0;
                  boolean var13 = ~(class757.field11211[1][arg0 >> 9][var8] & 2) != -1;
                  if (var13 == !var12) {
                     var9 = (class757.field11211[1][arg1][arg4] & 2) != 0;
                  }
               }

               if (var9) {
                  ++arg2;
               }
            }

            return class385.field6076[arg2].method2312(arg0, arg3, 86);
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field5150[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2737(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2738(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
