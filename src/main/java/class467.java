import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class467 implements class570 {
   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6725 = new String[]{method3395(method3394(")\u001eX}\u0007")), method3395(method3394("&YX\u0011R")), method3395(method3394("3\u0002\u001aS")), method3395(method3394(")\u001eX~\u0007"))};
   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "I"
   )
   public static int field6724;
   @OriginalMember(
      owner = "client!ti",
      name = "b",
      descriptor = "Lru;"
   )
   public static class206 field6723;
   @OriginalMember(
      owner = "client!ti",
      name = "c",
      descriptor = "[Lbg;"
   )
   public static class492[] field6722;

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3392(int arg0) {
      try {
         field6722 = null;
         if (arg0 != 0) {
            method3392(-34);
         }

         field6723 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6725[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(JLwu;I[I)Ljava/lang/String;"
   )
   public final String method3393(long arg0, class395 arg1, int arg2, int[] arg3) {
      try {
         ++field6724;
         if (class64.field783 == arg1) {
            class153 var6 = class424.field6042.method3912(arg3[0], (byte)105);
            return var6.method1289((byte)-118, (int)arg0);
         } else if (class286.field3960 != arg1 && class226.field3208 != arg1) {
            if (arg2 != -8284) {
               return null;
            } else {
               return class94.field1221 != arg1 && class601.field8838 != arg1 && class649.field9475 != arg1 ? null : class424.field6042.method3912(arg3[0], (byte)125).method1289((byte)-118, (int)arg0);
            }
         } else {
            class358 var7 = class468.field6728.method2261(arg2 + 8283, (int)arg0);
            return var7.field4830;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field6725[3] + arg0 + ',' + (arg1 != null ? field6725[1] : field6725[2]) + ',' + arg2 + ',' + (arg3 != null ? field6725[1] : field6725[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3394(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3395(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
