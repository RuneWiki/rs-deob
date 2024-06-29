import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class696 implements class26 {
   @OriginalMember(
      owner = "client!no",
      name = "p",
      descriptor = "I"
   )
   public int field10327;
   @OriginalMember(
      owner = "client!no",
      name = "d",
      descriptor = "I"
   )
   public int field10329;
   @OriginalMember(
      owner = "client!no",
      name = "r",
      descriptor = "I"
   )
   public int field10330;
   @OriginalMember(
      owner = "client!no",
      name = "o",
      descriptor = "Z"
   )
   public boolean field10341;
   @OriginalMember(
      owner = "client!no",
      name = "m",
      descriptor = "I"
   )
   public int field10334;
   @OriginalMember(
      owner = "client!no",
      name = "i",
      descriptor = "I"
   )
   public int field10338;
   @OriginalMember(
      owner = "client!no",
      name = "q",
      descriptor = "I"
   )
   public int field10328;
   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "I"
   )
   public int field10340;
   @OriginalMember(
      owner = "client!no",
      name = "e",
      descriptor = "I"
   )
   public int field10337;
   @OriginalMember(
      owner = "client!no",
      name = "k",
      descriptor = "Lrga;"
   )
   public class694 field10333;
   @OriginalMember(
      owner = "client!no",
      name = "g",
      descriptor = "Lgea;"
   )
   public class750 field10331;
   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10345 = new String[]{method5116(method5115("zNpUr")), method5116(method5115("zNpWr")), method5116(method5115("o\u000fp:'")), method5116(method5115("zNp(3zH**r")), method5116(method5115("zT2x")), method5116(method5115("zNpVr"))};
   @OriginalMember(
      owner = "client!no",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field10339 = new class113(62, 8);
   @OriginalMember(
      owner = "client!no",
      name = "h",
      descriptor = "Lbda;"
   )
   public static class783 field10344 = new class783(2, 2);
   @OriginalMember(
      owner = "client!no",
      name = "b",
      descriptor = "I"
   )
   public static int field10332;
   @OriginalMember(
      owner = "client!no",
      name = "j",
      descriptor = "I"
   )
   public static int field10335;
   @OriginalMember(
      owner = "client!no",
      name = "l",
      descriptor = "I"
   )
   public static int field10336;
   @OriginalMember(
      owner = "client!no",
      name = "n",
      descriptor = "I"
   )
   public static int field10342;
   @OriginalMember(
      owner = "client!no",
      name = "f",
      descriptor = "I"
   )
   public static int field10343;

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5113(int arg0, int arg1, int arg2) {
      try {
         arg1 = (127 & arg0) * arg1 >> 7;
         ++field10335;
         if (arg1 >= 2) {
            if (arg1 <= 126) {
               return arg2 < 109 ? -12 : (arg0 & 65408) + arg1;
            }

            arg1 = 126;
            if (!client.field1786) {
               return arg2 < 109 ? -12 : (arg0 & 65408) + arg1;
            }
         }

         arg1 = 2;
         return arg2 < 109 ? -12 : (arg0 & 65408) + arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10345[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public final class783 method193(int arg0) {
      try {
         if (arg0 != -1) {
            this.field10331 = null;
         }

         ++field10336;
         return class147.field2205;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10345[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5114(int arg0) {
      try {
         field10339 = null;
         field10344 = null;
         if (arg0 != 0) {
            field10343 = -88;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10345[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "<init>",
      descriptor = "(ILrga;Lgea;IIIIIIIZ)V"
   )
   public class696(int arg0, class694 arg1, class750 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      try {
         this.field10327 = arg6;
         this.field10329 = arg9;
         this.field10330 = arg5;
         this.field10341 = arg10;
         this.field10334 = arg7;
         this.field10338 = arg0;
         this.field10328 = arg3;
         this.field10340 = arg8;
         this.field10337 = arg4;
         this.field10333 = arg1;
         this.field10331 = arg2;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10345[3] + arg0 + ',' + (arg1 != null ? field10345[2] : field10345[4]) + ',' + (arg2 != null ? field10345[2] : field10345[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
