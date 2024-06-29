import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class662 extends class347 {
   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9598 = new String[]{method4754(method4753("\u0017\u001b>X1")), method4754(method4753("\u0017\u001b>[1"))};
   @OriginalMember(
      owner = "client!qt",
      name = "t",
      descriptor = "Lpd;"
   )
   public static class268 field9593 = new class268();
   @OriginalMember(
      owner = "client!qt",
      name = "l",
      descriptor = "I"
   )
   public int field9584;
   @OriginalMember(
      owner = "client!qt",
      name = "m",
      descriptor = "I"
   )
   public int field9586;
   @OriginalMember(
      owner = "client!qt",
      name = "n",
      descriptor = "I"
   )
   public static int field9587;
   @OriginalMember(
      owner = "client!qt",
      name = "i",
      descriptor = "I"
   )
   public int field9588;
   @OriginalMember(
      owner = "client!qt",
      name = "s",
      descriptor = "I"
   )
   public int field9590;
   @OriginalMember(
      owner = "client!qt",
      name = "u",
      descriptor = "I"
   )
   public int field9591;
   @OriginalMember(
      owner = "client!qt",
      name = "q",
      descriptor = "I"
   )
   public static int field9592;
   @OriginalMember(
      owner = "client!qt",
      name = "r",
      descriptor = "I"
   )
   public int field9594;
   @OriginalMember(
      owner = "client!qt",
      name = "v",
      descriptor = "I"
   )
   public static int field9596;
   @OriginalMember(
      owner = "client!qt",
      name = "p",
      descriptor = "Lhv;"
   )
   public class544 field9585;
   @OriginalMember(
      owner = "client!qt",
      name = "j",
      descriptor = "Lhv;"
   )
   public class544 field9589;
   @OriginalMember(
      owner = "client!qt",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public String field9583;
   @OriginalMember(
      owner = "client!qt",
      name = "o",
      descriptor = "Z"
   )
   public boolean field9597;
   @OriginalMember(
      owner = "client!qt",
      name = "k",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field9595;

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4751(byte arg0) {
      try {
         field9593 = null;
         if (arg0 > -40) {
            field9596 = 39;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9598[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4752(int arg0, boolean arg1) {
      try {
         class351.method2741(8);
         ++field9592;
         if (class1.method21((byte)107, class672.field10112)) {
            ++class31.field339;
            if (~class31.field339 <= -51 || arg1) {
               class31.field339 = 0;
               if (!class768.field11267 && class429.field6546 != null) {
                  ++class31.field342;
                  class180 var2 = class486.method3603(class281.field3916, (byte)-73, class48.field583);
                  class763.method5527(false, var2);

                  try {
                     class694.method5045((byte)124);
                  } catch (IOException var4) {
                     class768.field11267 = true;
                  }
               }

               if (arg0 < 69) {
                  field9587 = 22;
               }

               class351.method2741(8);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9598[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4753(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4754(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
