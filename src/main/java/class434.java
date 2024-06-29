import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class434 {
   @OriginalMember(
      owner = "client!rm",
      name = "f",
      descriptor = "Lqh;"
   )
   private class74 field6041;
   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "I"
   )
   public int field6037;
   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6043 = new String[]{method3243(method3242("U?v-m")), method3243(method3242("\\|vB8")), method3243(method3242("U?vP,I;,Rm")), method3243(method3242("I'4\u0000")), method3243(method3242("U?v/m")), method3243(method3242("U?v.m"))};
   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "[Ldea;"
   )
   public static class259[] field6040 = new class259[37];
   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "I"
   )
   public static int field6038;
   @OriginalMember(
      owner = "client!rm",
      name = "e",
      descriptor = "I"
   )
   public static int field6039;
   @OriginalMember(
      owner = "client!rm",
      name = "d",
      descriptor = "I"
   )
   public static int field6042;

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3239(int arg0, int arg1) {
      try {
         ++field6042;
         if (arg0 != 7469) {
            field6040 = null;
         }

         return arg1 == 4 || ~arg1 == -9 || ~arg1 == -13 || ~arg1 == -11;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6043[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3240(int arg0) {
      try {
         field6040 = null;
         if (arg0 != -11) {
            method3240(-61);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6043[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3241(int arg0, int arg1, int arg2) {
      try {
         ++field6039;
         if (arg1 >= 21) {
            class446 var3 = class635.method4607(108, (long)arg0, 14);
            var3.method3311(true);
            var3.field6167 = arg2;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6043[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class434(class26 arg0, int arg1, class74 arg2) {
      new class590(64);

      try {
         this.field6041 = arg2;
         this.field6037 = this.field6041.method727(15, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6043[2] + (arg0 != null ? field6043[1] : field6043[3]) + ',' + arg1 + ',' + (arg2 != null ? field6043[1] : field6043[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
