import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class100 {
   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1289 = new String[]{method841(method840("=kc?Ft")), method841(method840("=kc?Gt")), method841(method840("=kc?Et"))};
   @OriginalMember(
      owner = "client!aja",
      name = "l",
      descriptor = "Lwu;"
   )
   public static class395 field1285 = new class395(12, 0, 1, 0);
   @OriginalMember(
      owner = "client!aja",
      name = "d",
      descriptor = "I"
   )
   public static int field1288 = 0;
   @OriginalMember(
      owner = "client!aja",
      name = "f",
      descriptor = "I"
   )
   public int field1277;
   @OriginalMember(
      owner = "client!aja",
      name = "i",
      descriptor = "I"
   )
   public int field1278;
   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "I"
   )
   public static int field1279;
   @OriginalMember(
      owner = "client!aja",
      name = "e",
      descriptor = "I"
   )
   public int field1280;
   @OriginalMember(
      owner = "client!aja",
      name = "j",
      descriptor = "I"
   )
   public int field1281;
   @OriginalMember(
      owner = "client!aja",
      name = "h",
      descriptor = "I"
   )
   public int field1282;
   @OriginalMember(
      owner = "client!aja",
      name = "k",
      descriptor = "I"
   )
   public static int field1283;
   @OriginalMember(
      owner = "client!aja",
      name = "c",
      descriptor = "I"
   )
   public static int field1284;
   @OriginalMember(
      owner = "client!aja",
      name = "b",
      descriptor = "I"
   )
   public static int field1286;
   @OriginalMember(
      owner = "client!aja",
      name = "g",
      descriptor = "I"
   )
   public int field1287;

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(I)[Llea;"
   )
   public static final class639[] method837(int arg0) {
      try {
         ++field1284;
         return arg0 != 0 ? null : new class639[]{class111.field1393, class72.field885, class700.field10243, class160.field2278, class130.field1663, class65.field792, class264.field3643, class589.field8692, class763.field11275, class679.field10004, class110.field1372, class23.field266, class191.field2719, class208.field2972, class227.field3216};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1289[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method838(byte arg0) {
      try {
         field1285 = null;
         if (arg0 >= -42) {
            method837(109);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1289[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method839(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1283;
         if (class424.field6038 != arg1) {
            class644.field9403 = class337.field4594 = class761.field11250[arg1];
            class352.method2568(arg0 + 1697555133);
            class470.field6756 = new int[4][class644.field9403 >> 3][class337.field4594 >> 3];
            class141.field1805 = new int[class644.field9403][class337.field4594];
            class318.field4341 = new int[class644.field9403][class337.field4594];
            int var3 = 0;
            if (var2) {
               class767.field11309[var3] = class425.method3139((byte)-70, class337.field4594, class644.field9403);
               ++var3;
            }

            while(true) {
               while(var3 < 4) {
                  class767.field11309[var3] = class425.method3139((byte)-70, class337.field4594, class644.field9403);
                  ++var3;
               }

               class706.field10315 = new byte[4][class644.field9403][class337.field4594];
               class712.method5175(class644.field9403, arg0 + 1697529542, class337.field4594, 4);
               class426.method3157(5174, class644.field9403 >> 3, class337.field4594 >> 3, class383.field5543);
               class424.field6038 = arg1;
               if (!var2) {
                  if (arg0 != -1697555133) {
                     field1288 = 38;
                     return;
                  }

                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1289[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method840(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method841(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
