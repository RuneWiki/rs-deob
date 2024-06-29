import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class421 extends class302 {
   @OriginalMember(
      owner = "client!je",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6412 = new String[]{method3213(method3212("&g\u0004S")), method3213(method3212("3<F\u0011\u0010")), method3213(method3212("\"wF|E")), method3213(method3212("\"wFzE")), method3213(method3212("\"wF~E"))};
   @OriginalMember(
      owner = "client!je",
      name = "I",
      descriptor = "I"
   )
   public static int field6409;
   @OriginalMember(
      owner = "client!je",
      name = "J",
      descriptor = "I"
   )
   public static int field6411;
   @OriginalMember(
      owner = "client!je",
      name = "H",
      descriptor = "Leaa;"
   )
   public static class526 field6410;

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      try {
         ++field6411;
         if (arg1 >= -37) {
            this.method401(-87, 126);
         }

         return class757.field11167;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6412[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "a",
      descriptor = "(IILha;III)V"
   )
   public static final void method3210(int arg0, int arg1, class66 arg2, int arg3, int arg4, int arg5) {
      try {
         ++field6409;
         class616.field9011 = arg2;
         class283.field3939 = class616.field9011.method559();
         class681.field10231 = class616.field9011.method559();
         class280.field3897 = class616.field9011.method559();
         if (arg0 != -12957) {
            method3210(-114, -110, (class66)null, -68, 30, -12);
         }

         class122.field1489 = arg3;
         class4.field85 = 0;
         class178.field2201 = null;
         class344.field5248 = arg4;
         class102.field1254 = null;
         class785.method5640(arg1, -113, arg5);
         class96.field1187 = -1;
         class252.field3376 = -1;
         class445.field6759 = -1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6412[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6412[1] : field6412[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3211(int arg0) {
      try {
         field6410 = null;
         int var1 = 83 / ((arg0 - -47) / 62);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6412[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!je",
      name = "<init>",
      descriptor = "()V"
   )
   public class421() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3212(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!je",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3213(char[] arg0) {
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
            var10005 = 18;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
