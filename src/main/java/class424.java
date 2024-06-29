import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class424 extends class532 {
   @OriginalMember(
      owner = "client!hja",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6170 = new String[]{method3221(method3220("\u007ff\u000bF\u0012?")), method3221(method3220("y\u007f\u0004X")), method3221(method3220("y\u007f\u0004Z")), method3221(method3220("y\u007f\u0004[")), method3221(method3220("l\"DF ")), method3221(method3220("y\u007f\u0004Y")), method3221(method3220("yy\u0006\u0004")), method3221(method3220("\u007ff\u000bF\u0013?")), method3221(method3220("\u007ff\u000bF\f?")), method3221(method3220("\u007ff\u000bF\r?"))};
   @OriginalMember(
      owner = "client!hja",
      name = "H",
      descriptor = "I"
   )
   public static int field6164;
   @OriginalMember(
      owner = "client!hja",
      name = "I",
      descriptor = "I"
   )
   public static int field6165;
   @OriginalMember(
      owner = "client!hja",
      name = "L",
      descriptor = "I"
   )
   public static int field6166;
   @OriginalMember(
      owner = "client!hja",
      name = "G",
      descriptor = "I"
   )
   public static int field6168;
   @OriginalMember(
      owner = "client!hja",
      name = "K",
      descriptor = "I"
   )
   public static int field6169;
   @OriginalMember(
      owner = "client!hja",
      name = "J",
      descriptor = "Lru;"
   )
   public static class202 field6167;

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(BLkk;)V"
   )
   public static final void method3216(byte param0, class200 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hja",
      name = "<init>",
      descriptor = "(Lhw;Lhw;Lfea;)V"
   )
   public class424(class141 arg0, class141 arg1, class151 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IZI)Ljava/lang/String;"
   )
   public static final String method3217(int arg0, boolean arg1, int arg2) {
      try {
         ++field6168;
         if (arg0 > -10) {
            return null;
         } else {
            return arg1 && ~arg2 <= -1 ? class397.method3063(arg1, 338, arg2, 10) : Integer.toString(arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6170[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public final void method3218(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         int var6 = 89 % ((arg1 - -64) / 36);
         ++field6166;
         int var7 = super.field7753.method3009();
         int var8 = ((class151)super.field4464).field2419 * class655.method4814(0) / 10 % var7;
         super.field7753.method3607(-var7 + var8 + arg3, arg4, arg0 + var7 + -var8, arg2);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field6170[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3219(byte arg0) {
      try {
         if (arg0 == 28) {
            field6167 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6170[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3220(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3221(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
