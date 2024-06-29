import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class80 extends class258 {
   @OriginalMember(
      owner = "client!wea",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1261 = new String[]{method864(method863("Nooh\\\u0011")), method864(method863("Nooh_\u0011")), method864(method863("NoohUx\"")), method864(method863("NoohJ\u0011")), method864(method863("B$ h`")), method864(method863("W\u007fb*"))};
   @OriginalMember(
      owner = "client!wea",
      name = "T",
      descriptor = "I"
   )
   public static int field1258 = 0;
   @OriginalMember(
      owner = "client!wea",
      name = "R",
      descriptor = "Lsb;"
   )
   public static class261 field1259 = new class261();
   @OriginalMember(
      owner = "client!wea",
      name = "Q",
      descriptor = "I"
   )
   public static int field1256;
   @OriginalMember(
      owner = "client!wea",
      name = "S",
      descriptor = "I"
   )
   public static int field1257;
   @OriginalMember(
      owner = "client!wea",
      name = "P",
      descriptor = "I"
   )
   public static int field1260;

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(IIIIIIB)I"
   )
   public static final int method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         if (~(1 & arg1) == -2) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
         }

         ++field1260;
         int var10 = arg5 & 3;
         if (var10 == 0) {
            return arg4;
         } else {
            if (arg6 != -6) {
               method860((byte)-88);
            }

            if (~var10 == -2) {
               return arg3;
            } else {
               return ~var10 == -3 ? -arg4 + 7 - (arg0 + -1) : -arg2 - -1 + -arg3 + 7;
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field1261[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "e",
      descriptor = "(B)V"
   )
   public static final void method860(byte arg0) {
      try {
         ++field1257;
         class709.field10189 = false;
         if (arg0 != 72) {
            method862(false);
         }

         class258.method2194(-78);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1261[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "a",
      descriptor = "(Luf;BI)V"
   )
   public final void method861(class33 arg0, byte arg1, int arg2) {
      try {
         ++field1256;
         int var4 = -73 / ((arg1 - -23) / 57);
         class127.method1305(1621035944, arg2, arg0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1261[3] + (arg0 != null ? field1261[4] : field1261[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "<init>",
      descriptor = "()V"
   )
   public class80() {
      super(false);
   }

   @OriginalMember(
      owner = "client!wea",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method862(boolean arg0) {
      try {
         if (arg0) {
            field1258 = -68;
         }

         field1259 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1261[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method863(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method864(char[] arg0) {
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
            var10005 = 10;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
