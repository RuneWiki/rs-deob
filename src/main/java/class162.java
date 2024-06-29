import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class162 {
   @OriginalMember(
      owner = "client!se",
      name = "d",
      descriptor = "Lom;"
   )
   private class722 field2468;
   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2475 = new String[]{method1532(method1531("\r\u0019@uj")), method1532(method1531("\r\u0019@rj")), method1532(method1531("\r\u0019@tj")), method1532(method1531("\u0010\t\u0002]")), method1532(method1531("\r\u0019@\r+\u0010\u0015\u001a\u000fj")), method1532(method1531("\u0005R@\u001f?")), method1532(method1531("\r\u0019@wj")), method1532(method1531("\r\u0019@sj"))};
   @OriginalMember(
      owner = "client!se",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2467 = new String[100];
   @OriginalMember(
      owner = "client!se",
      name = "g",
      descriptor = "I"
   )
   public static int field2470;
   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "I"
   )
   public static int field2471;
   @OriginalMember(
      owner = "client!se",
      name = "h",
      descriptor = "I"
   )
   public static int field2472;
   @OriginalMember(
      owner = "client!se",
      name = "f",
      descriptor = "I"
   )
   public static int field2474;
   @OriginalMember(
      owner = "client!se",
      name = "e",
      descriptor = "Lgga;"
   )
   public static class502 field2469;
   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "Lfn;"
   )
   private class96 field2473;

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(I)Lfn;"
   )
   public final class96 method1525(int arg0) {
      try {
         ++field2470;
         class96 var2 = this.field2468.field10341.field1553;
         if (arg0 != 32768) {
            this.field2473 = null;
         }

         if (this.field2468.field10341 == var2) {
            this.field2473 = null;
            return null;
         } else {
            this.field2473 = var2.field1553;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2475[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1526(int arg0, int arg1) {
      try {
         ++field2474;
         if (arg0 != -455717720) {
            method1529(-27);
         }

         return arg1 >>> 8;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2475[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(Z)Lfn;"
   )
   public final class96 method1527(boolean arg0) {
      try {
         if (arg0) {
            this.method1527(true);
         }

         ++field2471;
         class96 var2 = this.field2473;
         if (this.field2468.field10341 == var2) {
            this.field2473 = null;
            return null;
         } else {
            this.field2473 = var2.field1553;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2475[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1528(int arg0, int arg1, int arg2) {
      try {
         ++field2472;
         if (arg1 != 0) {
            method1530();
         }

         return (arg2 & 32768) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2475[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1529(int arg0) {
      try {
         field2469 = null;
         if (arg0 != 100) {
            method1529(87);
         }

         field2467 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2475[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1530() {
      class416.field6098 = class416.field6085;
   }

   @OriginalMember(
      owner = "client!se",
      name = "<init>",
      descriptor = "()V"
   )
   public class162() {
   }

   @OriginalMember(
      owner = "client!se",
      name = "<init>",
      descriptor = "(Lom;)V"
   )
   public class162(class722 arg0) {
      try {
         this.field2468 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2475[4] + (arg0 != null ? field2475[5] : field2475[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
