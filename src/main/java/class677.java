import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class677 {
   @OriginalMember(
      owner = "client!fh",
      name = "l",
      descriptor = "I"
   )
   public int field10188 = -1;
   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "I"
   )
   public int field10192 = -1;
   @OriginalMember(
      owner = "client!fh",
      name = "g",
      descriptor = "I"
   )
   public int field10190 = -1;
   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10197 = new String[]{method4947(method4946("\f#\u001c,\u0010")), method4947(method4946("\f#\u001c-\u0010")), method4947(method4946("\f#\u001c/\u0010"))};
   @OriginalMember(
      owner = "client!fh",
      name = "m",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field10187 = Calendar.getInstance(TimeZone.getTimeZone(method4947(method4946("-\u0006f"))));
   @OriginalMember(
      owner = "client!fh",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field10196 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!fh",
      name = "j",
      descriptor = "I"
   )
   public int field10184;
   @OriginalMember(
      owner = "client!fh",
      name = "i",
      descriptor = "I"
   )
   public int field10185;
   @OriginalMember(
      owner = "client!fh",
      name = "f",
      descriptor = "I"
   )
   public int field10186;
   @OriginalMember(
      owner = "client!fh",
      name = "e",
      descriptor = "I"
   )
   public int field10189;
   @OriginalMember(
      owner = "client!fh",
      name = "c",
      descriptor = "I"
   )
   public int field10191;
   @OriginalMember(
      owner = "client!fh",
      name = "k",
      descriptor = "I"
   )
   public int field10193;
   @OriginalMember(
      owner = "client!fh",
      name = "b",
      descriptor = "I"
   )
   public static int field10194;
   @OriginalMember(
      owner = "client!fh",
      name = "d",
      descriptor = "I"
   )
   public static int field10195;

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4943(int arg0) {
      try {
         if (arg0 != 4484) {
            method4945(102, (byte)-41, -64);
         }

         field10196 = null;
         field10187 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10197[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4944(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            field10196 = null;
         }

         ++field10195;
         return ~arg0 == -8 || ~arg0 == -9 || ~arg0 == -10;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10197[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method4945(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= 82) {
            return 91;
         } else {
            ++field10194;
            int var3 = arg0 + -1 & arg2 >> 31;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10197[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fh",
      name = "<init>",
      descriptor = "(Lln;)V"
   )
   public class677(class397 arg0) {
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4946(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4947(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
