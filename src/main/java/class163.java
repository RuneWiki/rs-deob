import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class163 extends class97 implements class703 {
   @OriginalMember(
      owner = "client!faa",
      name = "e",
      descriptor = "I"
   )
   private int field2589;
   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2592 = new String[]{method1492(method1491("a\u000fW+t/")), method1492(method1491("a\u000fW+u/")), method1492(method1491("a\u000fW+r/")), method1492(method1491("i\u001bZi")), method1492(method1491("|@\u0018+L")), method1492(method1491("a\u000fW+\rn\u0000_q\u000f/")), method1492(method1491("a\u000fW+s/")), method1492(method1491("a\u000fW+p/"))};
   @OriginalMember(
      owner = "client!faa",
      name = "i",
      descriptor = "I"
   )
   public static int field2590 = -1;
   @OriginalMember(
      owner = "client!faa",
      name = "c",
      descriptor = "I"
   )
   public static int field2585;
   @OriginalMember(
      owner = "client!faa",
      name = "d",
      descriptor = "I"
   )
   public static int field2587;
   @OriginalMember(
      owner = "client!faa",
      name = "f",
      descriptor = "I"
   )
   public static int field2588;
   @OriginalMember(
      owner = "client!faa",
      name = "h",
      descriptor = "I"
   )
   public static int field2591;
   @OriginalMember(
      owner = "client!faa",
      name = "g",
      descriptor = "[Ltd;"
   )
   public static class476[] field2586;

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(IIILtb;)V",
      line = 5
   )
   public static final void method1485(int arg0, int arg1, int arg2, class417 arg3) {
      class600 var4 = class18.method134(arg0, arg1, arg2);
      if (var4 != null) {
         var4.field8654 = arg3;
         int var5 = class455.field6647 == class269.field3810 ? 1 : 0;
         if (arg3.method593((byte)-94)) {
            if (arg3.method588(1)) {
               arg3.field4088 = class559.field8137[var5];
               class559.field8137[var5] = arg3;
               return;
            }

            arg3.field4088 = class529.field7698[var5];
            class529.field7698[var5] = arg3;
            class186.field2818 = true;
            return;
         }

         arg3.field4088 = class389.field5744[var5];
         class389.field5744[var5] = arg3;
      }

   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(Z)I",
      line = 37
   )
   public final int method1486(boolean arg0) {
      try {
         ++field2587;
         return arg0 ? -75 : this.field2589;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2592[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "b",
      descriptor = "(I)J",
      line = 49
   )
   public final long method1487(int arg0) {
      try {
         if (arg0 != -31810) {
            field2586 = null;
         }

         ++field2588;
         return super.field1548.getAddress();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2592[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "<init>",
      descriptor = "(Lrk;I[BI)V",
      line = 62
   )
   public class163(class35 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field2589 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2592[5] + (arg0 != null ? field2592[4] : field2592[3]) + ',' + arg1 + ',' + (arg2 != null ? field2592[4] : field2592[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "([BIII)V",
      line = 72
   )
   public final void method1488(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2591;
         this.method926(arg0, arg3);
         this.field2589 = arg1;
         if (arg2 != -15857) {
            this.field2589 = 81;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2592[7] + (arg0 != null ? field2592[4] : field2592[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(I)I",
      line = 85
   )
   public final int method1489(int arg0) {
      try {
         ++field2585;
         if (arg0 > -63) {
            field2586 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2592[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(B)V",
      line = 100
   )
   public static void method1490(byte arg0) {
      try {
         field2586 = null;
         int var1 = -34 / ((arg0 - 31) / 45);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2592[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
