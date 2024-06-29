import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class120 {
   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1944 = new String[]{method1136(method1135("\u0013{\u0000,h")), method1136(method1135("\u0013{\u0000.h")), method1136(method1135("\u0013{\u0000/h"))};
   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field1939 = new class435(40, -1);
   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "Lhm;"
   )
   public static class230 field1943 = new class230(13, 0, 1, 0);
   @OriginalMember(
      owner = "client!rv",
      name = "d",
      descriptor = "I"
   )
   public static int field1940;
   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "I"
   )
   public static int field1942;
   @OriginalMember(
      owner = "client!rv",
      name = "e",
      descriptor = "[S"
   )
   public static short[] field1941;

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1132(int arg0, int arg1, int arg2) {
      try {
         int var3 = -105 / ((-65 - arg1) / 34);
         ++field1940;
         class536 var4 = class108.method1038((long)arg0, 89, 17);
         var4.method4017(24076);
         var4.field7800 = arg2;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1944[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1133(int arg0, int arg1) {
      try {
         ++field1942;
         if (arg1 < -125) {
            class23.field355.method1579(107, arg0);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1944[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1134(int arg0) {
      try {
         field1943 = null;
         int var1 = -28 % ((arg0 - 29) / 63);
         field1939 = null;
         field1941 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1944[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1135(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1136(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
