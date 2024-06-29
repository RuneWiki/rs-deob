import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class465 extends class76 {
   @OriginalMember(
      owner = "client!ks",
      name = "A",
      descriptor = "[B"
   )
   public byte[] field6713;
   @OriginalMember(
      owner = "client!ks",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6714 = new String[]{method3388(method3387("D\u0007R(gA\u001d\b*&")), method3388(method3387("A\u0001\u0010x")), method3388(method3387("TZR:s")), method3388(method3387("D\u0007RV&")), method3388(method3387("D\u0007RU&"))};
   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "I"
   )
   public static int field6711;
   @OriginalMember(
      owner = "client!ks",
      name = "B",
      descriptor = "I"
   )
   public static int field6712;

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3385(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 8448) {
            method3386((class793)null, -27);
         }

         ++field6712;
         return ~(arg2 & 458752) != -1 | class760.method5514(arg2, arg0, -1) || class197.method1553(arg0, arg1 ^ 8448, arg2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6714[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "a",
      descriptor = "(Lwia;I)I"
   )
   public static final int method3386(class793 arg0, int arg1) {
      try {
         ++field6711;
         if (class603.field8872 != arg0) {
            if (class458.field6587 == arg0) {
               return 8448;
            } else if (class144.field1826 != arg0) {
               if (class358.field4889 == arg0) {
                  return 260;
               } else if (class470.field6749 == arg0) {
                  return 34023;
               } else {
                  if (arg1 != 458752) {
                     method3385(-47, 76, 32);
                  }

                  throw new IllegalArgumentException();
               }
            } else {
               return 34165;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6714[3] + (arg0 != null ? field6714[2] : field6714[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class465(byte[] arg0) {
      try {
         this.field6713 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6714[0] + (arg0 != null ? field6714[2] : field6714[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3387(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ks",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3388(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
