import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class595 {
   @OriginalMember(
      owner = "client!im",
      name = "l",
      descriptor = "I"
   )
   public int field8577 = 128;
   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "I"
   )
   public int field8584 = 128;
   @OriginalMember(
      owner = "client!im",
      name = "g",
      descriptor = "I"
   )
   public int field8576;
   @OriginalMember(
      owner = "client!im",
      name = "i",
      descriptor = "I"
   )
   public int field8581;
   @OriginalMember(
      owner = "client!im",
      name = "n",
      descriptor = "I"
   )
   public int field8575;
   @OriginalMember(
      owner = "client!im",
      name = "e",
      descriptor = "I"
   )
   public int field8587;
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8590 = new String[]{method4402(method4401("7g\u0002aJ0cXc\u000b")), method4402(method4401("7g\u0002\u001f\u000b")), method4402(method4401("%$\u0002s^")), method4402(method4401("7g\u0002\u0019\u000b")), method4402(method4401("0\u007f@1")), method4402(method4401("7g\u0002\u001c\u000b"))};
   @OriginalMember(
      owner = "client!im",
      name = "o",
      descriptor = "I"
   )
   public static int field8582 = -1;
   @OriginalMember(
      owner = "client!im",
      name = "k",
      descriptor = "I"
   )
   public static int field8574;
   @OriginalMember(
      owner = "client!im",
      name = "d",
      descriptor = "I"
   )
   public int field8578;
   @OriginalMember(
      owner = "client!im",
      name = "h",
      descriptor = "I"
   )
   public int field8579;
   @OriginalMember(
      owner = "client!im",
      name = "m",
      descriptor = "I"
   )
   public static int field8580;
   @OriginalMember(
      owner = "client!im",
      name = "j",
      descriptor = "I"
   )
   public int field8583;
   @OriginalMember(
      owner = "client!im",
      name = "p",
      descriptor = "I"
   )
   public int field8585;
   @OriginalMember(
      owner = "client!im",
      name = "c",
      descriptor = "I"
   )
   public int field8586;
   @OriginalMember(
      owner = "client!im",
      name = "b",
      descriptor = "I"
   )
   public static int field8588;
   @OriginalMember(
      owner = "client!im",
      name = "f",
      descriptor = "I"
   )
   public static int field8589;

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method4397(int arg0) {
      class413.field6047 = arg0;
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 12
   )
   public static final boolean method4398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field8574;
         if (~arg3 > ~(arg0 - -arg5) && arg3 + arg7 > arg0) {
            if (arg1 != -1) {
               return true;
            } else {
               return ~(arg4 - -arg6) < ~arg8 && ~arg4 > ~(arg8 - -arg2);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8590[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Lim;Z)V",
      line = 30
   )
   public final void method4399(class595 arg0, boolean arg1) {
      try {
         this.field8577 = arg0.field8577;
         ++field8588;
         this.field8581 = arg0.field8581;
         this.field8584 = arg0.field8584;
         this.field8576 = arg0.field8576;
         this.field8587 = arg0.field8587;
         this.field8575 = arg0.field8575;
         if (arg1) {
            this.field8586 = -106;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8590[3] + (arg0 != null ? field8590[2] : field8590[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(I)V",
      line = 73
   )
   public class595(int arg0) {
      try {
         this.field8576 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8590[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 82
   )
   private class595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field8581 = arg4;
         this.field8584 = arg2;
         this.field8577 = arg1;
         this.field8575 = arg3;
         this.field8576 = arg0;
         this.field8587 = arg5;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8590[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Z)Lim;",
      line = 60
   )
   public final class595 method4400(boolean arg0) {
      try {
         ++field8580;
         return arg0 ? null : new class595(this.field8576, this.field8577, this.field8584, this.field8575, this.field8581, this.field8587);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8590[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4401(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4402(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
