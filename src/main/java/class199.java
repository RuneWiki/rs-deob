import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class199 extends class730 {
   @OriginalMember(
      owner = "client!ffa",
      name = "k",
      descriptor = "I"
   )
   public int field2827;
   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2835 = new String[]{method1574(method1573("?L\u0011|g")), method1574(method1573("\"\u0004^|Yl")), method1574(method1573("*\u0017S>")), method1574(method1573("\"\u0004^|&-\fV&$l")), method1574(method1573("\"\u0004^|^l")), method1574(method1573("\"\u0004^|[l")), method1574(method1573("\"\u0004^|Xl")), method1574(method1573("\"\u0004^|_l"))};
   @OriginalMember(
      owner = "client!ffa",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field2830 = new int[4];
   @OriginalMember(
      owner = "client!ffa",
      name = "p",
      descriptor = "Lii;"
   )
   public static class580 field2828 = new class580();
   @OriginalMember(
      owner = "client!ffa",
      name = "m",
      descriptor = "I"
   )
   public static int field2833 = 1;
   @OriginalMember(
      owner = "client!ffa",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field2834 = false;
   @OriginalMember(
      owner = "client!ffa",
      name = "n",
      descriptor = "I"
   )
   public static int field2826;
   @OriginalMember(
      owner = "client!ffa",
      name = "o",
      descriptor = "I"
   )
   public static int field2829;
   @OriginalMember(
      owner = "client!ffa",
      name = "j",
      descriptor = "I"
   )
   public static int field2831;
   @OriginalMember(
      owner = "client!ffa",
      name = "l",
      descriptor = "I"
   )
   public static int field2832;

   @OriginalMember(
      owner = "client!ffa",
      name = "<init>",
      descriptor = "(ILkt;Lada;III)V",
      line = 9
   )
   public class199(int arg0, class169 arg1, class175 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field2827 = arg5;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2835[3] + arg0 + ',' + (arg1 != null ? field2835[0] : field2835[2]) + ',' + (arg2 != null ? field2835[0] : field2835[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(ILkf;)V",
      line = 17
   )
   public static final void method1569(int arg0, class266 arg1) {
      try {
         ++field2826;
         class86.field1132 = 0;
         class238.field3340 = 0;
         class663.field9658 = new class762();
         class508.field7406 = new class737[1024];
         class785.field11517 = new class577[class360.field4920[class2.field9] + 1];
         class213.field3042 = 0;
         class362.field4934 = 0;
         class710.method5164(arg0 + 5249, arg1);
         if (arg0 != -5249) {
            field2833 = 95;
         }

         class549.method3936(4000, arg1);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2835[1] + arg0 + ',' + (arg1 != null ? field2835[0] : field2835[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(III)Z",
      line = 39
   )
   public static final boolean method1570(int arg0, int arg1, int arg2) {
      try {
         ++field2829;
         if (arg0 != 10194) {
            field2834 = false;
         }

         return ~(arg2 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2835[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "b",
      descriptor = "(B)V",
      line = 57
   )
   public static void method1571(byte arg0) {
      try {
         field2830 = null;
         if (arg0 == -101) {
            field2828 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2835[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(IZIZI)V",
      line = 68
   )
   public static final void method1572(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
      try {
         label20: {
            if (~class300.field4107.field6419.method391(-16) != -1) {
               class165.field2337 = class300.field4107.field6419.method391(-14);
               class42.method358(0, -3, true);
               if (!client.field4360) {
                  break label20;
               }
            }

            class389.method2954(false, (byte)-101);
         }

         ++field2831;
         class303.field4129 = arg1;
         class709.field10353 = arg2;
         class85.field1115 = arg4;
         if (arg3) {
            field2828 = null;
         }

         class650.method4740(arg0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2835[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(B)Lqca;",
      line = 98
   )
   public final class127 method993(byte arg0) {
      try {
         ++field2832;
         if (arg0 != -48) {
            field2830 = null;
         }

         return class116.field1445;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2835[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1573(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1574(char[] arg0) {
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
            var10005 = 98;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
