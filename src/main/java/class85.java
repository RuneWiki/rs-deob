import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class85 implements class575 {
   @OriginalMember(
      owner = "client!aka",
      name = "c",
      descriptor = "I"
   )
   public int field1042;
   @OriginalMember(
      owner = "client!aka",
      name = "f",
      descriptor = "[F"
   )
   public float[] field1041;
   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "I"
   )
   public int field1045;
   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1047 = new String[]{method800(method799("t]J\u0013]=")), method800(method799("t]J\u0013^=")), method800(method799("t]J\u0013#|XBI!=")), method800(method799("t]J\u0013\\="))};
   @OriginalMember(
      owner = "client!aka",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field1046 = null;
   @OriginalMember(
      owner = "client!aka",
      name = "e",
      descriptor = "I"
   )
   public static int field1040 = 0;
   @OriginalMember(
      owner = "client!aka",
      name = "h",
      descriptor = "I"
   )
   public static int field1043;
   @OriginalMember(
      owner = "client!aka",
      name = "b",
      descriptor = "I"
   )
   public static int field1044;
   @OriginalMember(
      owner = "client!aka",
      name = "g",
      descriptor = "Leaa;"
   )
   public static class526 field1039;

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(I)V",
      line = 9
   )
   public static void method796(int arg0) {
      try {
         field1046 = null;
         if (arg0 < -40) {
            field1039 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1047[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(B)Lbu;",
      line = 20
   )
   public static final class21 method797(byte arg0) {
      try {
         if (arg0 >= -23) {
            field1040 = -73;
         }

         ++field1043;
         return class433.field6609.length > class746.field11056 ? class433.field6609[class746.field11056++] : null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1047[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "a",
      descriptor = "(III)Z",
      line = 35
   )
   public static final boolean method798(int arg0, int arg1, int arg2) {
      try {
         ++field1044;
         if (arg1 != -31754) {
            return false;
         } else {
            return (arg0 & 458752) != 0 | class209.method1592(arg0, arg2, (byte)73) || class368.method2860(arg2, arg0, 20428);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1047[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "<init>",
      descriptor = "(II)V",
      line = 55
   )
   public class85(int arg0, int arg1) {
      try {
         this.field1042 = arg1;
         this.field1041 = new float[arg0 * arg1];
         this.field1045 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1047[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method799(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method800(char[] arg0) {
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
            var10005 = 54;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
