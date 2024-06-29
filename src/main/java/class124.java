import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class124 {
   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1794 = new String[]{method1182(method1181("\n\u0000Z1N")), method1182(method1181("\u0003_Z\\\u001b")), method1182(method1181("\u0016\u0004\u0018\u001e")), method1182(method1181("\n\u0000Z0N")), method1182(method1181("\n\u0000Z3N"))};
   @OriginalMember(
      owner = "client!rq",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field1789 = new class498(42, 3);
   @OriginalMember(
      owner = "client!rq",
      name = "e",
      descriptor = "I"
   )
   public static int field1792 = -50;
   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "I"
   )
   public static int field1788;
   @OriginalMember(
      owner = "client!rq",
      name = "f",
      descriptor = "I"
   )
   public static int field1791;
   @OriginalMember(
      owner = "client!rq",
      name = "b",
      descriptor = "Lle;"
   )
   public class172 field1790;
   @OriginalMember(
      owner = "client!rq",
      name = "c",
      descriptor = "[Lnf;"
   )
   public static class782[] field1793;

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1178(byte arg0) {
      try {
         field1789 = null;
         if (arg0 < -6) {
            field1793 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1794[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(ILdj;)Z"
   )
   public static final boolean method1179(int arg0, class434 arg1) {
      try {
         ++field1791;
         if (arg0 != 7) {
            field1792 = 113;
         }

         class333 var2 = class102.field1434.method1411(arg1.method236((byte)-11), -93);
         if (~var2.field5107 == 0) {
            return true;
         } else {
            class287 var3 = class230.field3520.method4009(var2.field5107, arg0 ^ -110);
            return var3.field4506 == -1 ? true : var3.method2392(true);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1794[3] + arg0 + ',' + (arg1 != null ? field1794[1] : field1794[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(Ljava/lang/String;ZILjava/lang/String;I)V"
   )
   public static final void method1180(String arg0, boolean arg1, int arg2, String arg3, int arg4) {
      try {
         ++field1788;
         class577 var5 = class262.method2277(arg4 + 12370);
         var5.field8531.method2864(-26110, class389.field6125.field4916);
         var5.field8531.method2873(0, (byte)-83);
         int var6 = var5.field8531.field5436;
         var5.field8531.method2873(659, (byte)119);
         int[] var7 = class746.method5479(var5, arg4 + -19977);
         int var8 = var5.field8531.field5436;
         var5.field8531.method2862(arg0, true);
         var5.field8531.method2873(class320.field4912, (byte)-45);
         var5.field8531.method2862(arg3, true);
         var5.field8531.method2892(-87, class5.field28);
         var5.field8531.method2864(-26110, class493.field7455);
         if (arg4 != 19977) {
            field1789 = null;
         }

         var5.field8531.method2864(arg4 ^ -11253, class410.field6382.field4824);
         class29.method201(var5.field8531, (byte)-114);
         String var9 = class395.field6192;
         var5.field8531.method2864(-26110, var9 == null ? 0 : 1);
         if (var9 != null) {
            var5.field8531.method2862(var9, true);
         }

         var5.field8531.method2864(arg4 + -46087, arg2);
         var5.field8531.method2864(-26110, arg1 ? 1 : 0);
         var5.field8531.field5436 += 7;
         var5.field8531.method2844(var5.field8531.field5436, var8, var7, 1);
         var5.field8531.method2882((byte)29, -var6 + var5.field8531.field5436);
         class510.field7800.method211(var5, arg4 + -19850);
         class18.field238 = 0;
         class425.field6575 = 0;
         class159.field2363 = 1;
         class56.field693 = -3;
         if (arg2 < 13) {
            class283.field4478 = true;
            class316.method2618(-118);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1794[0] + (arg0 != null ? field1794[1] : field1794[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1794[1] : field1794[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1181(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1182(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
