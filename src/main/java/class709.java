import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class709 extends class450 {
   @OriginalMember(
      owner = "client!qf",
      name = "q",
      descriptor = "I"
   )
   public int field10586;
   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10593 = new String[]{method5143(method5142("fio\u0002\u0013yf5\u0000R")), method5143(method5142("yz-R")), method5143(method5142("l!o\u0010\u0007")), method5143(method5142("fio\u007fR")), method5143(method5142("fio{R")), method5143(method5142("fio}R")), method5143(method5142("fiozR")), method5143(method5142("fio|R"))};
   @OriginalMember(
      owner = "client!qf",
      name = "p",
      descriptor = "[B"
   )
   public static byte[] field10589 = new byte[2048];
   @OriginalMember(
      owner = "client!qf",
      name = "s",
      descriptor = "I"
   )
   public static int field10587;
   @OriginalMember(
      owner = "client!qf",
      name = "o",
      descriptor = "I"
   )
   public static int field10588;
   @OriginalMember(
      owner = "client!qf",
      name = "r",
      descriptor = "I"
   )
   public static int field10590;
   @OriginalMember(
      owner = "client!qf",
      name = "n",
      descriptor = "I"
   )
   public static int field10591;
   @OriginalMember(
      owner = "client!qf",
      name = "t",
      descriptor = "I"
   )
   public static int field10592;

   @OriginalMember(
      owner = "client!qf",
      name = "<init>",
      descriptor = "(ILwm;Lvh;III)V",
      line = 4
   )
   public class709(int arg0, class590 arg1, class378 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field10586 = arg5;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10593[0] + arg0 + ',' + (arg1 != null ? field10593[2] : field10593[1]) + ',' + (arg2 != null ? field10593[2] : field10593[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(IIIII)V",
      line = 13
   )
   public static final void method5138(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10590;
         class403 var5 = class453.method3410((long)arg4, true, 8);
         var5.method3093(22144);
         if (arg1 != 9101) {
            field10589 = null;
         }

         var5.field6185 = arg2;
         var5.field6187 = arg0;
         var5.field6183 = arg3;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10593[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(IZ)V",
      line = 29
   )
   public static final void method5139(int arg0, boolean arg1) {
      try {
         ++field10588;
         class448.field6805 = 2;
         if (!arg1) {
            class149.field1859 = arg0;
            class18.method127(class591.field8737.equals(""), class591.field8737, true, 0, "");
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10593[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "d",
      descriptor = "(I)V",
      line = 42
   )
   public static void method5140(int arg0) {
      try {
         field10589 = null;
         if (arg0 != -12602) {
            method5140(-83);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10593[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(Lwb;Lwb;I)V",
      line = 58
   )
   public static final void method5141(class347 arg0, class347 arg1, int arg2) {
      try {
         ++field10592;
         if (arg1.field5277 != null) {
            arg1.method2720(0);
         }

         arg1.field5278 = arg0;
         if (arg2 == 2) {
            arg1.field5277 = arg0.field5277;
            arg1.field5277.field5278 = arg1;
            arg1.field5278.field5277 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10593[4] + (arg0 != null ? field10593[2] : field10593[1]) + ',' + (arg1 != null ? field10593[2] : field10593[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(I)Loi;",
      line = 76
   )
   public final class79 method1311(int arg0) {
      try {
         if (arg0 > -106) {
            field10589 = null;
         }

         ++field10591;
         return class335.field4792;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10593[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5142(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5143(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
