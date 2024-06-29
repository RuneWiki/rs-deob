import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class570 {
   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8084 = new String[]{method4229(method4228("r\u0016\u0001\u0018\u0006")), method4229(method4228("nZ\u0001wS")), method4229(method4228("r\u0016\u0001\u001c\u0006")), method4229(method4228("{\u0001C5")), method4229(method4228("r\u0016\u0001\u001b\u0006")), method4229(method4228("P\u0006]6\\/T")), method4229(method4228("0DN")), method4229(method4228("r\u0016\u0001\u001f\u0006"))};
   @OriginalMember(
      owner = "client!gb",
      name = "c",
      descriptor = "S"
   )
   public static short field8080 = 205;
   @OriginalMember(
      owner = "client!gb",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field8077 = false;
   @OriginalMember(
      owner = "client!gb",
      name = "d",
      descriptor = "I"
   )
   public static int field8078;
   @OriginalMember(
      owner = "client!gb",
      name = "b",
      descriptor = "I"
   )
   public static int field8079;
   @OriginalMember(
      owner = "client!gb",
      name = "g",
      descriptor = "I"
   )
   public static int field8081;
   @OriginalMember(
      owner = "client!gb",
      name = "e",
      descriptor = "I"
   )
   public static int field8082;
   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "I"
   )
   public static int field8083;

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(Lkaa;Z)V"
   )
   public static final void method4222(class158 arg0, boolean arg1) {
      try {
         if (arg1) {
            ++field8082;
            class268 var2 = (class268)class639.field9022.method3101(-1, (long)arg0.field5826);
            if (var2 != null) {
               var2.method2288(256);
            } else {
               class449.method3479(60, arg0.field5865[0], (class799)null, 0, arg0.field6824, arg0, (class544)null, arg0.field5861[0]);
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8084[2] + (arg0 != null ? field8084[1] : field8084[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4223(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -24229) {
            return true;
         } else {
            ++field8081;
            return ~(arg1 & 32) != -1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8084[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4224(int arg0) {
      try {
         ++field8078;
         if (class239.method2100(class394.field5712, true)) {
            class593.method4358(arg0 + 21981, false);
         } else {
            class567.field8053 = class745.field10605.field3713;
            class745.field10605.field3713 = null;
            class755.method5457(arg0, false);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8084[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method4225(long arg0, int arg1) {
      try {
         ++field8083;
         class309.field4655.setTime(new Date(arg0));
         if (arg1 != -12382) {
            method4225(59L, -43);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8084[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method4226(byte arg0, String arg1) {
      ++field8079;
      System.out.println(field8084[5] + class311.method2541(field8084[6], true, arg1, "\n"));
      if (arg0 != -77) {
         method4224(-62);
      }
   }

   @OriginalMember(
      owner = "client!gb",
      name = "a",
      descriptor = "(IFFFIIIIB[FF)V"
   )
   public abstract void method4227(int arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, float[] arg9, float arg10);

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4228(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4229(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
