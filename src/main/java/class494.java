import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class494 implements class262 {
   @OriginalMember(
      owner = "client!rja",
      name = "l",
      descriptor = "Lmj;"
   )
   public class730 field7048;
   @OriginalMember(
      owner = "client!rja",
      name = "h",
      descriptor = "I"
   )
   public int field7043;
   @OriginalMember(
      owner = "client!rja",
      name = "b",
      descriptor = "Leu;"
   )
   public class634 field7045;
   @OriginalMember(
      owner = "client!rja",
      name = "m",
      descriptor = "I"
   )
   public int field7046;
   @OriginalMember(
      owner = "client!rja",
      name = "d",
      descriptor = "I"
   )
   public int field7050;
   @OriginalMember(
      owner = "client!rja",
      name = "c",
      descriptor = "I"
   )
   public int field7053;
   @OriginalMember(
      owner = "client!rja",
      name = "e",
      descriptor = "I"
   )
   public int field7039;
   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "I"
   )
   public int field7041;
   @OriginalMember(
      owner = "client!rja",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field7044;
   @OriginalMember(
      owner = "client!rja",
      name = "o",
      descriptor = "I"
   )
   public int field7049;
   @OriginalMember(
      owner = "client!rja",
      name = "f",
      descriptor = "I"
   )
   public int field7047;
   @OriginalMember(
      owner = "client!rja",
      name = "p",
      descriptor = "I"
   )
   public int field7052;
   @OriginalMember(
      owner = "client!rja",
      name = "j",
      descriptor = "I"
   )
   public int field7040;
   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7055 = new String[]{method3752(method3751("o$i&L5")), method3752(method3751("s;dd")), method3752(method3751("o$i&1t a|35")), method3752(method3751("f`&&p")), method3752(method3751("o$i&O5"))};
   @OriginalMember(
      owner = "client!rja",
      name = "k",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7042 = new String[]{method3752(method3751("N;f")), method3752(method3751("P!f")), method3752(method3751("I;m")), method3752(method3751("J+l")), method3752(method3751("I&}")), method3752(method3751("[<a")), method3752(method3751("N/|"))};
   @OriginalMember(
      owner = "client!rja",
      name = "g",
      descriptor = "I"
   )
   public static int field7051;
   @OriginalMember(
      owner = "client!rja",
      name = "n",
      descriptor = "I"
   )
   public static int field7054;

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3750(int arg0) {
      try {
         field7042 = null;
         int var1 = -115 / ((-30 - arg0) / 51);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7055[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Leu;Lmj;IIIIIIIIII)V"
   )
   public class494(String arg0, class634 arg1, class730 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field7048 = arg2;
         this.field7043 = arg6;
         this.field7045 = arg1;
         this.field7046 = arg8;
         this.field7050 = arg10;
         this.field7053 = arg5;
         this.field7039 = arg9;
         this.field7041 = arg12;
         this.field7044 = arg0;
         this.field7049 = arg3;
         this.field7047 = arg11;
         this.field7052 = arg4;
         this.field7040 = arg7;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7055[2] + (arg0 != null ? field7055[3] : field7055[1]) + ',' + (arg1 != null ? field7055[3] : field7055[1]) + ',' + (arg2 != null ? field7055[3] : field7055[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         if (arg0 >= -70) {
            this.method108((byte)-92);
         }

         ++field7051;
         return class294.field4385;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7055[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3751(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3752(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
