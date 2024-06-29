import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class205 {
   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2640 = new String[]{method1573(method1572("@WD==")), method1573(method1572("V\u001cDRh")), method1573(method1572("@WD?=")), method1573(method1572("e[\u000e\u0018pC\u001f\u001f\u000fp")), method1573(method1572("CG\u0006\u0010")), method1573(method1572("@WD>=")), method1573(method1572("@WD8="))};
   @OriginalMember(
      owner = "client!me",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field2637 = false;
   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "Lpn;"
   )
   public static class776 field2635 = new class776();
   @OriginalMember(
      owner = "client!me",
      name = "f",
      descriptor = "I"
   )
   public static int field2632;
   @OriginalMember(
      owner = "client!me",
      name = "e",
      descriptor = "I"
   )
   public static int field2634;
   @OriginalMember(
      owner = "client!me",
      name = "d",
      descriptor = "I"
   )
   public static int field2636;
   @OriginalMember(
      owner = "client!me",
      name = "b",
      descriptor = "I"
   )
   public static int field2638;
   @OriginalMember(
      owner = "client!me",
      name = "h",
      descriptor = "I"
   )
   public static int field2639;
   @OriginalMember(
      owner = "client!me",
      name = "g",
      descriptor = "Lrf;"
   )
   public static class90 field2633;

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(IZI)V",
      line = 6
   )
   public static final void method1568(int arg0, boolean arg1, int arg2) {
      try {
         ++class791.field11489;
         if (!arg1) {
            method1571(105, false, -74, 7, 41);
         }

         ++field2634;
         class180 var3 = class486.method3603(class767.field11254, (byte)-127, class48.field583);
         var3.field2211.method1079(arg0, 1856);
         var3.field2211.method1060(-23626, arg2);
         class763.method5527(false, var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2640[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(BLhv;)Ljava/lang/String;",
      line = 30
   )
   public static final String method1569(byte arg0, class544 arg1) {
      try {
         ++field2638;
         if (~client.method2388(arg1).method3546(arg0 ^ 2302) == -1) {
            return null;
         } else if (arg1.field8059 != null && ~arg1.field8059.trim().length() != -1) {
            if (arg0 != -86) {
               method1569((byte)93, (class544)null);
            }

            return arg1.field8059;
         } else {
            return class384.field5876 ? field2640[3] : null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2640[2] + arg0 + ',' + (arg1 != null ? field2640[1] : field2640[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(I)V",
      line = 57
   )
   public static void method1570(int arg0) {
      try {
         int var1 = -115 % ((2 - arg0) / 57);
         field2633 = null;
         field2635 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2640[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(IZIII)Lai;",
      line = 72
   )
   public static final class624 method1571(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2639;
         class624 var5 = new class624();
         var5.field9087 = arg3;
         if (arg2 != -984767860) {
            field2637 = false;
         }

         var5.field9086 = arg4;
         class573.field8525.method5682((long)arg0, var5, (byte)7);
         class389.method2986(arg3, (byte)123);
         class544 var6 = class543.method4011(arg0, (byte)127);
         if (var6 != null) {
            class140.method1188(var6, (byte)116);
         }

         if (class458.field6935 != null) {
            class140.method1188(class458.field6935, (byte)-128);
            class458.field6935 = null;
         }

         class589.method4334(-124);
         if (var6 != null) {
            class783.method5626(var6, !arg1, -12725);
         }

         if (!arg1) {
            class265.method2014(arg3);
         }

         if (!arg1 && class198.field2452 != -1) {
            class393.method3001(class198.field2452, arg2 ^ 984767859, 1);
         }

         return var5;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2640[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1573(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
