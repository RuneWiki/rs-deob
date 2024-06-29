import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class22 {
   @OriginalMember(
      owner = "client!ub",
      name = "k",
      descriptor = "I"
   )
   public int field275;
   @OriginalMember(
      owner = "client!ub",
      name = "f",
      descriptor = "B"
   )
   public byte field272;
   @OriginalMember(
      owner = "client!ub",
      name = "u",
      descriptor = "I"
   )
   private int field274;
   @OriginalMember(
      owner = "client!ub",
      name = "o",
      descriptor = "I"
   )
   public int field277;
   @OriginalMember(
      owner = "client!ub",
      name = "t",
      descriptor = "I"
   )
   public int field271;
   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field291 = new String[]{method190(method189("4\u001d\u000brt")), method190(method189("4\u001d\u000bst")), method190(method189("4\u001d\u000bqt")), method190(method189("4\u001d\u000btt")), method190(method189("4\u001d\u000b\f5/\u0016Q\u000et"))};
   @OriginalMember(
      owner = "client!ub",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field286 = new class616(40, 3);
   @OriginalMember(
      owner = "client!ub",
      name = "p",
      descriptor = "I"
   )
   public static int field270;
   @OriginalMember(
      owner = "client!ub",
      name = "q",
      descriptor = "I"
   )
   public int field273;
   @OriginalMember(
      owner = "client!ub",
      name = "e",
      descriptor = "I"
   )
   public int field276;
   @OriginalMember(
      owner = "client!ub",
      name = "c",
      descriptor = "I"
   )
   public int field278;
   @OriginalMember(
      owner = "client!ub",
      name = "j",
      descriptor = "I"
   )
   public static int field280;
   @OriginalMember(
      owner = "client!ub",
      name = "i",
      descriptor = "I"
   )
   public int field282;
   @OriginalMember(
      owner = "client!ub",
      name = "m",
      descriptor = "I"
   )
   public int field283;
   @OriginalMember(
      owner = "client!ub",
      name = "s",
      descriptor = "I"
   )
   public int field284;
   @OriginalMember(
      owner = "client!ub",
      name = "l",
      descriptor = "I"
   )
   public static int field285;
   @OriginalMember(
      owner = "client!ub",
      name = "b",
      descriptor = "I"
   )
   public int field287;
   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "I"
   )
   public int field288;
   @OriginalMember(
      owner = "client!ub",
      name = "n",
      descriptor = "I"
   )
   public int field289;
   @OriginalMember(
      owner = "client!ub",
      name = "d",
      descriptor = "I"
   )
   public static int field290;
   @OriginalMember(
      owner = "client!ub",
      name = "g",
      descriptor = "Lub;"
   )
   public class22 field279;
   @OriginalMember(
      owner = "client!ub",
      name = "r",
      descriptor = "Ljk;"
   )
   public static class663 field281;

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(IBII)Lub;"
   )
   public final class22 method185(int arg0, byte arg1, int arg2, int arg3) {
      try {
         int var5 = -16 / ((-51 - arg1) / 62);
         ++field280;
         return new class22(this.field274, arg2, arg0, arg3, this.field272);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field291[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method186(boolean arg0) {
      try {
         ++field285;
         class590 var1 = class588.field8104;
         synchronized(class588.field8104) {
            class588.field8104.method4244(arg0);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field291[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method187(byte arg0) {
      try {
         if (arg0 >= -103) {
            field281 = null;
         }

         field286 = null;
         field281 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field291[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "a",
      descriptor = "(I)Lrf;"
   )
   public final class91 method188(int arg0) {
      try {
         ++field270;
         if (arg0 != 26344) {
            this.field275 = -105;
         }

         return class284.method2161(0, this.field274);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field291[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "<init>",
      descriptor = "(IIIIB)V"
   )
   public class22(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field275 = arg3;
         this.field272 = arg4;
         this.field274 = arg0;
         this.field277 = arg1;
         this.field271 = arg2;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field291[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method189(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ub",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method190(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
