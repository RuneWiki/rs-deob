import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class461 extends class404 {
   @OriginalMember(
      owner = "client!km",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7018 = new String[]{method3585(method3584("\u0004X[0\u0017")), method3585(method3584("\u0004X[2\u0017")), method3585(method3584("\u0004X[3\u0017"))};
   @OriginalMember(
      owner = "client!km",
      name = "F",
      descriptor = "I"
   )
   public static int field7015 = 0;
   @OriginalMember(
      owner = "client!km",
      name = "I",
      descriptor = "Luk;"
   )
   public static class498 field7013 = new class498(120, 4);
   @OriginalMember(
      owner = "client!km",
      name = "K",
      descriptor = "I"
   )
   public static int field7012;
   @OriginalMember(
      owner = "client!km",
      name = "J",
      descriptor = "I"
   )
   public static int field7014;
   @OriginalMember(
      owner = "client!km",
      name = "H",
      descriptor = "I"
   )
   public static int field7016;
   @OriginalMember(
      owner = "client!km",
      name = "G",
      descriptor = "[J"
   )
   public static long[] field7017;

   @OriginalMember(
      owner = "client!km",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method3583(int arg0) {
      try {
         field7013 = null;
         field7017 = null;
         if (arg0 > -18) {
            method3583(-62);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7018[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class461(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method152(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         super.field6301 = arg1;
         if (!arg3) {
            super.field6314 = arg2;
            super.field6312 = arg0;
            ++field7012;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7018[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(BF)V"
   )
   public final void method151(byte arg0, float arg1) {
      try {
         super.field6319 = arg1;
         if (arg0 != -115) {
            field7017 = null;
         }

         ++field7014;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7018[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3584(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3585(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
