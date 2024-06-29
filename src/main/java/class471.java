import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class471 extends class500 {
   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6530 = new String[]{method3456(method3455("'>+\u0004F")), method3456(method3455(">~+i\u0013")), method3456(method3455("+%i+")), method3456(method3455("'>+\u0005F")), method3456(method3455("'>+\u0006F"))};
   @OriginalMember(
      owner = "client!bn",
      name = "o",
      descriptor = "Lbga;"
   )
   public static class378 field6522 = new class378(55, 1);
   @OriginalMember(
      owner = "client!bn",
      name = "m",
      descriptor = "Lbga;"
   )
   public static class378 field6529 = new class378(19, 28);
   @OriginalMember(
      owner = "client!bn",
      name = "s",
      descriptor = "I"
   )
   public static int field6520;
   @OriginalMember(
      owner = "client!bn",
      name = "n",
      descriptor = "I"
   )
   public int field6523;
   @OriginalMember(
      owner = "client!bn",
      name = "r",
      descriptor = "I"
   )
   public int field6525;
   @OriginalMember(
      owner = "client!bn",
      name = "k",
      descriptor = "I"
   )
   public static int field6526;
   @OriginalMember(
      owner = "client!bn",
      name = "p",
      descriptor = "Lme;"
   )
   public class206 field6527;
   @OriginalMember(
      owner = "client!bn",
      name = "j",
      descriptor = "Lnw;"
   )
   public class616 field6524;
   @OriginalMember(
      owner = "client!bn",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field6521;
   @OriginalMember(
      owner = "client!bn",
      name = "q",
      descriptor = "[Lbo;"
   )
   public static class763[] field6528;

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method3452(boolean arg0) {
      try {
         field6529 = null;
         field6522 = null;
         field6528 = null;
         if (!arg0) {
            method3454(91L, -62, 83, -5, false, 85, (class74)null, 42);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6530[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3453(int arg0) {
      try {
         ++field6520;
         if (~class686.field10070 > ~class739.field10766.length) {
            int var2 = 23 / ((arg0 - -49) / 36);
            class739.field10766[class686.field10070++] = this;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6530[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(JIIIZILqh;I)V"
   )
   public static final void method3454(long arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class74 arg6, int arg7) {
      try {
         class700.field10201 = arg0;
         class479.field6625 = 10000;
         class693.field10121 = arg2;
         ++field6526;
         class382.field5353 = arg4;
         class104.field1328 = arg7;
         class188.field2305 = arg6;
         class728.field10669 = null;
         class449.field6210 = 1;
         class671.field9870 = arg1;
         class370.field5220 = arg5;
         if (arg3 != 10186) {
            method3452(false);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6530[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6530[1] : field6530[2]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3456(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
