import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class666 extends class500 {
   @OriginalMember(
      owner = "client!qt",
      name = "l",
      descriptor = "I"
   )
   public int field9471;
   @OriginalMember(
      owner = "client!qt",
      name = "k",
      descriptor = "I"
   )
   public int field9472;
   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9477 = new String[]{method4821(method4820("U}CeR")), method4821(method4820("U}C\u0018\u0013J`\u0019\u001aR")), method4821(method4820("U}CfR"))};
   @OriginalMember(
      owner = "client!qt",
      name = "p",
      descriptor = "Lbga;"
   )
   public static class378 field9469 = new class378(27, -1);
   @OriginalMember(
      owner = "client!qt",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field9473 = false;
   @OriginalMember(
      owner = "client!qt",
      name = "j",
      descriptor = "I"
   )
   public static int field9474 = 0;
   @OriginalMember(
      owner = "client!qt",
      name = "o",
      descriptor = "F"
   )
   public static float field9476;
   @OriginalMember(
      owner = "client!qt",
      name = "m",
      descriptor = "I"
   )
   public static int field9470;
   @OriginalMember(
      owner = "client!qt",
      name = "n",
      descriptor = "I"
   )
   public static int field9475;

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4818(byte arg0) {
      try {
         field9469 = null;
         if (arg0 <= 22) {
            method4819(0, 65, 110, (byte)-4, -4, -114, -62, -46);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9477[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(IIIBIIII)V"
   )
   public static final void method4819(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field9470;
         if (arg3 != -96) {
            method4819(-70, 91, -89, (byte)-109, -102, -32, 61, -90);
         }

         if (arg7 >= class265.field3451 && arg2 <= class663.field9442 && arg1 >= class478.field6604 && ~arg5 >= ~class313.field4171) {
            class7.method53(arg2, arg4, (byte)-11, arg7, arg5, arg1, arg0, arg6);
         } else {
            class245.method1848(arg2, arg5, arg1, -10134, arg6, arg0, arg7, arg4);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9477[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class666(int arg0, int arg1) {
      try {
         this.field9471 = arg0;
         this.field9472 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9477[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4820(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4821(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
