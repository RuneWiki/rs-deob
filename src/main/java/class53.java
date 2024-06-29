import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class53 extends class612 {
   @OriginalMember(
      owner = "client!iu",
      name = "x",
      descriptor = "I"
   )
   public int field782;
   @OriginalMember(
      owner = "client!iu",
      name = "n",
      descriptor = "I"
   )
   public int field780;
   @OriginalMember(
      owner = "client!iu",
      name = "w",
      descriptor = "I"
   )
   public int field779;
   @OriginalMember(
      owner = "client!iu",
      name = "t",
      descriptor = "I"
   )
   public int field776;
   @OriginalMember(
      owner = "client!iu",
      name = "o",
      descriptor = "I"
   )
   public int field777;
   @OriginalMember(
      owner = "client!iu",
      name = "s",
      descriptor = "I"
   )
   public int field781;
   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field787 = new String[]{method572(method571("pc\u007f<a")), method572(method571("pc\u007f8a")), method572(method571("b8\u007fW4")), method572(method571("wc=\u0015")), method572(method571("pc\u007fE w\u007f%Ga"))};
   @OriginalMember(
      owner = "client!iu",
      name = "v",
      descriptor = "Liw;"
   )
   public static class107 field783 = new class107(8);
   @OriginalMember(
      owner = "client!iu",
      name = "q",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field784 = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
   @OriginalMember(
      owner = "client!iu",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field786 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!iu",
      name = "r",
      descriptor = "I"
   )
   public static int field785 = 1406;
   @OriginalMember(
      owner = "client!iu",
      name = "p",
      descriptor = "I"
   )
   public static int field778;

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method570(boolean arg0) {
      try {
         if (!arg0) {
            method570(false);
         }

         field784 = null;
         field783 = null;
         field786 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field787[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public class577 method108(byte arg0) {
      try {
         if (arg0 > -70) {
            this.method108((byte)-70);
         }

         ++field778;
         return class33.field484;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field787[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "<init>",
      descriptor = "(Leu;Lmj;IIIIIIIIIIIII)V"
   )
   public class53(class634 arg0, class730 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field782 = arg14;
         this.field780 = arg9;
         this.field779 = arg11;
         this.field776 = arg10;
         this.field777 = arg12;
         this.field781 = arg13;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field787[4] + (arg0 != null ? field787[2] : field787[3]) + ',' + (arg1 != null ? field787[2] : field787[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method571(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method572(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
