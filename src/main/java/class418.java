import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class418 extends class175 {
   @OriginalMember(
      owner = "client!jba",
      name = "G",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field6394;
   @OriginalMember(
      owner = "client!jba",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6397 = new String[]{method3199(method3198("/X<Y[m")), method3199(method3198("/X<YXm")), method3199(method3198(">\u0014sYk")), method3199(method3198("+O1\u001b")), method3199(method3198("/X<Y*,T4\u0003(m")), method3199(method3198("/X<Y]m"))};
   @OriginalMember(
      owner = "client!jba",
      name = "F",
      descriptor = "I"
   )
   public static int field6393;
   @OriginalMember(
      owner = "client!jba",
      name = "D",
      descriptor = "I"
   )
   public static int field6395;
   @OriginalMember(
      owner = "client!jba",
      name = "E",
      descriptor = "I"
   )
   public static int field6396;

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1191(byte arg0) {
      try {
         int var2 = 88 / ((-84 - arg0) / 38);
         ++field6393;
         return false;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6397[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class418(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field6394 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6397[4] + (arg0 != null ? field6397[2] : field6397[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method3197(int arg0, String arg1) {
      try {
         if (arg0 != 2) {
            return -32;
         } else {
            ++field6395;
            return arg1.length() + 2;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6397[1] + arg0 + ',' + (arg1 != null ? field6397[2] : field6397[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "g",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method1192(int arg0) {
      try {
         ++field6396;
         if (arg0 != -1) {
            this.method1191((byte)100);
         }

         return this.field6394;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6397[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3198(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3199(char[] arg0) {
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
            var10005 = 58;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
