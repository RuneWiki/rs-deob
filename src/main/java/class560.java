import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class560 extends class510 {
   @OriginalMember(
      owner = "client!bf",
      name = "i",
      descriptor = "Lpe;"
   )
   public class633 field8145;
   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8153 = new String[]{method4184(method4183("*\u0007\u0016vy")), method4184(method4183("*\u0007\u0016\u000f8&\bL\ry")), method4184(method4183("&\u0014T_")), method4184(method4183("3O\u0016\u001d,")), method4184(method4183("*\u0007\u0016py")), method4184(method4183("*\u0007\u0016wy")), method4184(method4183("*\u0007\u0016uy"))};
   @OriginalMember(
      owner = "client!bf",
      name = "h",
      descriptor = "Lqe;"
   )
   public static class491 field8147 = new class491();
   @OriginalMember(
      owner = "client!bf",
      name = "m",
      descriptor = "[C"
   )
   private static char[] field8151 = new char[64];
   @OriginalMember(
      owner = "client!bf",
      name = "l",
      descriptor = "I"
   )
   public static int field8146;
   @OriginalMember(
      owner = "client!bf",
      name = "k",
      descriptor = "I"
   )
   public static int field8148;
   @OriginalMember(
      owner = "client!bf",
      name = "f",
      descriptor = "I"
   )
   public static int field8149;
   @OriginalMember(
      owner = "client!bf",
      name = "g",
      descriptor = "I"
   )
   public static int field8150;
   @OriginalMember(
      owner = "client!bf",
      name = "j",
      descriptor = "I"
   )
   public static int field8152;

   @OriginalMember(
      owner = "client!bf",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method4179(int arg0) {
      try {
         client.field4559 = class139.method1297(4, 35, arg0, 8, 0.4F, true, 8, -29551);
         ++field8150;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8153[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4180(int arg0) {
      try {
         field8151 = null;
         if (arg0 != 6406) {
            method4180(96);
         }

         field8147 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8153[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "<init>",
      descriptor = "(Lrk;II[B)V"
   )
   public class560(class35 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field8145 = class690.method5026(-103, arg0, arg2, 6406, arg3, 6406, arg1, false);
         this.field8145.method2195(false, (byte)-59, false);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8153[1] + (arg0 != null ? field8153[3] : field8153[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8153[3] : field8153[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(ZII)Lcf;"
   )
   public static final class628 method4181(boolean arg0, int arg1, int arg2) {
      try {
         ++field8148;
         if (!arg0) {
            field8149 = -10;
         }

         class628 var3 = new class628();
         var3.field9143 = -1;
         var3.field9147 = -1;
         var3.field9132 = arg2 - -6;
         var3.field9138 = arg1 - -1 + 5;
         var3.field9137 = new int[var3.field9132][var3.field9138];
         var3.method4602(-12962);
         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8153[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "c",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method4182(int arg0) {
      try {
         if (arg0 != -1) {
            return null;
         } else {
            ++field8146;
            if (!class442.field6452 && class450.field6572 != null) {
               return (class450.field6572.field8477 == null || ~class450.field6572.field8477.length() == -1) && class450.field6572.field8480 != null && ~class450.field6572.field8480.length() < -1 ? class450.field6572.field8480 : class450.field6572.field8477;
            } else {
               return "";
            }
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8153[4] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field8151[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field8151[var1] = (char)(var1 + 97 + -26);
      }

      for(int var2 = 52; ~var2 > -63; ++var2) {
         field8151[var2] = (char)(var2 + -4);
      }

      field8151[63] = '-';
      field8151[62] = '*';
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4184(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
