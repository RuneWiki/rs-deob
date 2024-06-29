import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public class class46 extends class125 {
   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field592 = new String[]{method349(method348("f\u001b\u0005u{<")), method349(method348("f\u001b\u0005up<")), method349(method348("f\u001b\u0005u\u007f<")), method349(method348("f\u001b\u0005uy<")), method349(method348("f\u001b\u0005ux<")), method349(method348("f\u001b\u0005u|<")), method349(method348("o_JuG")), method349(method348("z\u0004\b7")), method349(method348("f\u001b\u0005u~<")), method349(method348("f\u001b\u0005u}<"))};
   @OriginalMember(
      owner = "client!rja",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field581 = false;
   @OriginalMember(
      owner = "client!rja",
      name = "f",
      descriptor = "Ll;"
   )
   public static class292 field583 = new class292("", 17);
   @OriginalMember(
      owner = "client!rja",
      name = "i",
      descriptor = "J"
   )
   public static long field591 = 0L;
   @OriginalMember(
      owner = "client!rja",
      name = "p",
      descriptor = "I"
   )
   public static int field582;
   @OriginalMember(
      owner = "client!rja",
      name = "h",
      descriptor = "I"
   )
   public static int field584;
   @OriginalMember(
      owner = "client!rja",
      name = "m",
      descriptor = "I"
   )
   public static int field585;
   @OriginalMember(
      owner = "client!rja",
      name = "o",
      descriptor = "I"
   )
   public static int field587;
   @OriginalMember(
      owner = "client!rja",
      name = "k",
      descriptor = "I"
   )
   public static int field588;
   @OriginalMember(
      owner = "client!rja",
      name = "n",
      descriptor = "I"
   )
   public static int field589;
   @OriginalMember(
      owner = "client!rja",
      name = "j",
      descriptor = "I"
   )
   public static int field590;
   @OriginalMember(
      owner = "client!rja",
      name = "l",
      descriptor = "[[[I"
   )
   public static int[][][] field586;

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         super.field1630.method3987(false, 117);
         ++field588;
         if (arg0 != 5) {
            field583 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field592[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      try {
         ++field587;
         if (arg0 >= -125) {
            method342(-59);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field592[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method342(int arg0) {
      try {
         field583 = null;
         if (arg0 != 27458) {
            field583 = null;
         }

         field586 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field592[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         ++field584;
         super.field1630.method3987(true, 124);
         if (arg1 != 3) {
            method342(-58);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field592[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(BLka;III)Lnk;"
   )
   public static final class484 method344(byte arg0, class232 arg1, int arg2, int arg3, int arg4) {
      try {
         ++field590;
         if (arg0 < 125) {
            field591 = -90L;
         }

         return arg1 == null ? null : new class484(arg3, arg4, arg2, arg1.method1303(), arg1.method1226(), arg1.method1295(), arg1.method1287(), arg1.method1286(), arg1.method1261(), arg1.method1250());
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field592[9] + arg0 + ',' + (arg1 != null ? field592[6] : field592[7]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         if (arg1 != -23385) {
            field586 = null;
         }

         super.field1630.method4006(arg0, (byte)-27);
         ++field582;
         super.field1630.method4009(arg2, arg1 + 23386);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field592[8] + (arg0 != null ? field592[6] : field592[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class46(class530 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rja",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         ++field585;
         if (!arg0) {
            field583 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field592[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         if (arg0) {
            return true;
         } else {
            ++field589;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field592[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method348(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method349(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
