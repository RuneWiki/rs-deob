import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class274 {
   @OriginalMember(
      owner = "client!oca",
      name = "d",
      descriptor = "I"
   )
   public int field3882;
   @OriginalMember(
      owner = "client!oca",
      name = "h",
      descriptor = "Lrfa;"
   )
   private class209 field3875;
   @OriginalMember(
      owner = "client!oca",
      name = "f",
      descriptor = "I"
   )
   private int field3879;
   @OriginalMember(
      owner = "client!oca",
      name = "e",
      descriptor = "I"
   )
   public int field3881;
   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3892 = new String[]{method2161(method2160("*~Q\u000f\u0003*NDS\u001e+z\u0018")), method2161(method2160("*~Q\u000f6m")), method2161(method2160("*~Q\u000f5m")), method2161(method2160("+h\\M")), method2161(method2160("*~Q\u000fK,sYUIm")), method2161(method2160(">3\u001e\u000f\n"))};
   @OriginalMember(
      owner = "client!oca",
      name = "c",
      descriptor = "Loca;"
   )
   public static class274 field3883 = new class274(0, 3, class209.field3110);
   @OriginalMember(
      owner = "client!oca",
      name = "l",
      descriptor = "Loca;"
   )
   public static class274 field3884 = new class274(1, 3, class209.field3110);
   @OriginalMember(
      owner = "client!oca",
      name = "q",
      descriptor = "Loca;"
   )
   public static class274 field3885 = new class274(2, 4, class209.field3106);
   @OriginalMember(
      owner = "client!oca",
      name = "j",
      descriptor = "Loca;"
   )
   public static class274 field3886 = new class274(3, 1, class209.field3110);
   @OriginalMember(
      owner = "client!oca",
      name = "n",
      descriptor = "Loca;"
   )
   public static class274 field3887 = new class274(4, 2, class209.field3110);
   @OriginalMember(
      owner = "client!oca",
      name = "k",
      descriptor = "Loca;"
   )
   public static class274 field3888 = new class274(5, 3, class209.field3110);
   @OriginalMember(
      owner = "client!oca",
      name = "m",
      descriptor = "Loca;"
   )
   public static class274 field3889 = new class274(6, 4, class209.field3110);
   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "I"
   )
   public static int field3890 = class752.method5444(-63, 16);
   @OriginalMember(
      owner = "client!oca",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field3891 = false;
   @OriginalMember(
      owner = "client!oca",
      name = "p",
      descriptor = "I"
   )
   public static int field3876;
   @OriginalMember(
      owner = "client!oca",
      name = "i",
      descriptor = "I"
   )
   public static int field3877;
   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "I"
   )
   public static int field3878;
   @OriginalMember(
      owner = "client!oca",
      name = "o",
      descriptor = "I"
   )
   public static int field3880;

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method2158(byte arg0) {
      try {
         if (arg0 > -51) {
            method2158((byte)26);
         }

         field3886 = null;
         field3884 = null;
         field3885 = null;
         field3888 = null;
         field3889 = null;
         field3887 = null;
         field3883 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3892[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 23
   )
   public final String toString() {
      try {
         ++field3877;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3892[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(II)Loca;",
      line = 35
   )
   public static final class274 method2159(int arg0, int arg1) {
      try {
         ++field3878;
         if (arg1 != -7) {
            field3890 = 3;
         }

         if (~arg0 != -1) {
            if (~arg0 == -2) {
               return field3884;
            }

            if (~arg0 == -3) {
               return field3885;
            }

            if (arg0 == 3) {
               return field3886;
            }

            if (arg0 == 4) {
               return field3887;
            }

            if (~arg0 == -6) {
               return field3888;
            }

            if (~arg0 != -7) {
               return null;
            }

            if (!client.field4564) {
               return field3889;
            }
         }

         return field3883;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3892[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "<init>",
      descriptor = "(IILrfa;)V",
      line = 110
   )
   private class274(int arg0, int arg1, class209 arg2) {
      try {
         this.field3882 = arg0;
         this.field3875 = arg2;
         this.field3879 = arg1;
         this.field3881 = this.field3875.field3103 * this.field3879;
         if (this.field3882 >= 16) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3892[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3892[5] : field3892[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2160(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2161(char[] arg0) {
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
            var10005 = 29;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
