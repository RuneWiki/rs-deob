import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class614 extends class770 {
   @OriginalMember(
      owner = "client!pm",
      name = "i",
      descriptor = "I"
   )
   public int field8581;
   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8582 = new String[]{method4467(method4466(")^r\u0012F")), method4467(method4466(")^rm\u00077Z(oF")), method4467(method4466(")^r\u0015F")), method4467(method4466("\"\u001dr\u007f\u0013")), method4467(method4466("7F0=")), method4467(method4466(")^r\u0013F")), method4467(method4466(")^r\u0010F"))};
   @OriginalMember(
      owner = "client!pm",
      name = "k",
      descriptor = "I"
   )
   public static int field8575;
   @OriginalMember(
      owner = "client!pm",
      name = "f",
      descriptor = "I"
   )
   public static int field8577;
   @OriginalMember(
      owner = "client!pm",
      name = "h",
      descriptor = "I"
   )
   public static int field8579;
   @OriginalMember(
      owner = "client!pm",
      name = "g",
      descriptor = "Lil;"
   )
   public static class7 field8576;
   @OriginalMember(
      owner = "client!pm",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field8578;
   @OriginalMember(
      owner = "client!pm",
      name = "j",
      descriptor = "[Lqc;"
   )
   public static class777[] field8580;

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(IIIB)I"
   )
   public static final int method4462(int arg0, int arg1, int arg2, byte arg3) {
      try {
         int var6 = arg0 & 3;
         ++field8575;
         if (var6 == 0) {
            return arg2;
         } else if (arg3 != -94) {
            return 21;
         } else if (var6 == 1) {
            return -arg1 + 7;
         } else {
            return var6 == 2 ? -arg2 + 7 : arg1;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8582[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(IIIIIILjava/lang/String;B)V"
   )
   public static final void method4463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, byte arg7) {
      try {
         if (arg7 != 18) {
            method4465(61);
         }

         ++field8579;
         class89 var8 = new class89();
         var8.field1139 = arg4;
         var8.field1132 = arg6;
         var8.field1137 = arg3;
         var8.field1138 = arg0;
         var8.field1135 = class369.field5205 + arg5;
         var8.field1136 = arg1;
         var8.field1133 = arg2;
         class266.field3457.method3116(var8, arg7 + 81);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field8582[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8582[3] : field8582[4]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4464(int arg0) {
      try {
         field8580 = null;
         field8576 = null;
         if (arg0 > -87) {
            method4464(117);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8582[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4465(int arg0) {
      try {
         if (arg0 == -28047) {
            class17.field235.method4245(true);
            ++field8577;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8582[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class614(int arg0) {
      try {
         this.field8581 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8582[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4466(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4467(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
