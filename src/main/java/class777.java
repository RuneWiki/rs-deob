import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class777 {
   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11342 = new String[]{method5617(method5616("Z,\u0017'\u0012\u0004")), method5617(method5616("Z,\u0017'\u0013\u0004")), method5617(method5616("Z,\u0017'\u0015\u0004")), method5617(method5616("Z,\u0017'\u0010\u0004"))};
   @OriginalMember(
      owner = "client!vba",
      name = "f",
      descriptor = "I"
   )
   public static int field11335 = -1;
   @OriginalMember(
      owner = "client!vba",
      name = "e",
      descriptor = "I"
   )
   public static int field11340 = 0;
   @OriginalMember(
      owner = "client!vba",
      name = "b",
      descriptor = "Ldb;"
   )
   public static class685 field11338 = new class685(6, 2);
   @OriginalMember(
      owner = "client!vba",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field11341 = false;
   @OriginalMember(
      owner = "client!vba",
      name = "g",
      descriptor = "I"
   )
   public static int field11336;
   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "I"
   )
   public static int field11337;
   @OriginalMember(
      owner = "client!vba",
      name = "d",
      descriptor = "I"
   )
   public static int field11339;

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method5612(int arg0, int arg1, int arg2) {
      try {
         ++field11337;
         class111 var3 = class796.method5734(arg1, (long)arg2, (byte)-116);
         var3.method1087(0);
         var3.field1740 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11342[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5613(int arg0) {
      try {
         field11338 = null;
         if (arg0 != 6) {
            method5614(-39, 42);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11342[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(II)Lrf;"
   )
   public static final class34 method5614(int arg0, int arg1) {
      try {
         ++field11336;
         if (arg0 <= 57) {
            field11340 = -100;
         }

         class34 var2 = (class34)class792.field11528.method1041((long)arg1, 8);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class596.field8394.method460((byte)-11, arg1, 1);
            class34 var4 = new class34();
            var4.field511 = arg1;
            if (var3 != null) {
               var4.method388(false, new class65(var3));
            }

            var4.method391((byte)20);
            if (~var4.field507 == -3 && class30.field434.method3101(-1, (long)arg1) == null) {
               class30.field434.method3098((long)arg1, new class288(class552.field7874), -1);
               class316.field4724[class552.field7874++] = var4;
            }

            class792.field11528.method1050(-70, var4, (long)arg1);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11342[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method5615(byte arg0, int arg1) {
      try {
         if (arg0 != -35) {
            method5615((byte)-66, 50);
         }

         ++field11339;
         class111 var2 = class796.method5734(16, (long)arg1, (byte)-104);
         var2.method1083(-85);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11342[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5616(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5617(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
