import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class199 extends class651 {
   @OriginalMember(
      owner = "client!fk",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2877 = new String[]{method1747(method1746("W{n\u0004$\u0019")), method1747(method1746("W{n\u0003$\u0019")), method1747(method1746("W{n\u0002$\u0019"))};
   @OriginalMember(
      owner = "client!fk",
      name = "P",
      descriptor = "I"
   )
   public static int field2874;
   @OriginalMember(
      owner = "client!fk",
      name = "R",
      descriptor = "I"
   )
   public static int field2875;
   @OriginalMember(
      owner = "client!fk",
      name = "Q",
      descriptor = "Lsa;"
   )
   public static class39 field2876;

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(IIIBI)Lnf;"
   )
   public static final class773 method1742(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field2874;
         int var5 = -86 / ((67 - arg3) / 33);
         long var6 = 65535L & (long)arg1 | (65535L & (long)arg4) << 32 | (long)arg0 << 48 & 65535L << 48 | (long)arg2 << 16 & 65535L << 16;
         class773 var8 = (class773)class53.field783.method1041(var6, 8);
         if (var8 == null) {
            var8 = class705.field10141.method1458(class376.field5487, arg1, arg4, arg2, 0, arg0);
            class53.field783.method1050(-95, var8, var6);
         }

         return var8;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2877[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1743(int arg0, int arg1, int arg2) {
      boolean var3 = class324.field4826[0][arg1][arg2] != null && class324.field4826[0][arg1][arg2].field4685 != null;

      for(int var4 = arg0; var4 >= 0; --var4) {
         if (class324.field4826[var4][arg1][arg2] == null) {
            class312 var5 = class324.field4826[var4][arg1][arg2] = new class312(var4);
            if (var3) {
               ++var5.field4687;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!fk",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1744(int arg0) {
      try {
         if (arg0 != 1234792416) {
            field2876 = null;
         }

         field2876 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2877[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method1745(int arg0) {
      try {
         if (class375.field5484 != null) {
            class375.field5484.method5669((byte)77);
         }

         ++field2875;
         if (arg0 == 972958544) {
            if (class486.field6943 != null) {
               class486.field6943.method5669((byte)99);
            }
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2877[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1746(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1747(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
