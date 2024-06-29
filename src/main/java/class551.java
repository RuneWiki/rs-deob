import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class551 {
   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7958 = new String[]{method4111(method4110("\"WJp\u0013")), method4111(method4110("\"WJGT\u0017G\u0016ZU#\u001b")), method4111(method4110("\"WJq\u0013")), method4111(method4110("\"WJr\u0013")), method4111(method4110("\"WJw\u0013")), method4111(method4110("\"WJv\u0013")), method4111(method4110("*F\b_")), method4111(method4110("?\u001dJ\u001dF"))};
   @OriginalMember(
      owner = "client!fd",
      name = "c",
      descriptor = "Lwh;"
   )
   public static class157 field7952 = new class157();
   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7956 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!fd",
      name = "e",
      descriptor = "I"
   )
   public static int field7949;
   @OriginalMember(
      owner = "client!fd",
      name = "f",
      descriptor = "I"
   )
   public static int field7950;
   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "I"
   )
   public static int field7951;
   @OriginalMember(
      owner = "client!fd",
      name = "h",
      descriptor = "I"
   )
   public static int field7953;
   @OriginalMember(
      owner = "client!fd",
      name = "g",
      descriptor = "I"
   )
   public static int field7954;
   @OriginalMember(
      owner = "client!fd",
      name = "i",
      descriptor = "I"
   )
   public static int field7955;
   @OriginalMember(
      owner = "client!fd",
      name = "d",
      descriptor = "I"
   )
   public static int field7957;

   @OriginalMember(
      owner = "client!fd",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field7949;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7958[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;"
   )
   public static final Class method4105(String arg0, int arg1) throws ClassNotFoundException {
      try {
         ++field7950;
         if (arg0.equals("B")) {
            return Byte.TYPE;
         } else if (arg0.equals("I")) {
            return Integer.TYPE;
         } else if (arg0.equals("S")) {
            return Short.TYPE;
         } else if (arg0.equals("J")) {
            return Long.TYPE;
         } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
         } else {
            if (arg1 != 24408) {
               field7952 = null;
            }

            if (arg0.equals("F")) {
               return Float.TYPE;
            } else if (arg0.equals("D")) {
               return Double.TYPE;
            } else {
               return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7958[5] + (arg0 != null ? field7958[7] : field7958[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4106(int arg0) {
      try {
         field7956 = null;
         field7952 = null;
         if (arg0 <= 106) {
            method4109((byte)23, 115, 33);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7958[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4107(int arg0) {
      try {
         if (arg0 >= -85) {
            return true;
         } else {
            ++field7953;
            return class56.field1113 == this | class6.field63 == this;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7958[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4108(byte arg0) {
      try {
         ++field7954;
         if (arg0 == 61) {
            class112.field1810 = new class587(class100.field1603.method961(class385.field5684, true), "", class135.field2225, 1004, -1, 0L, 0, 0, true, false, 0L, true);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7958[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method4109(byte arg0, int arg1, int arg2) {
      try {
         ++field7951;
         if (arg0 != 117) {
            field7956 = null;
         }

         class536 var3 = class108.method1038((long)arg2, arg0 + -33, 7);
         var3.method4017(24076);
         var3.field7800 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7958[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4110(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4111(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
