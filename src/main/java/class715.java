import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class715 extends class345 {
   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10357 = new String[]{method5190(method5189("2L\u0016>\b")), method5190(method5189("2L\u00162\b")), method5190(method5189("+\u0015\u0016W]")), method5190(method5189(">NT\u0015")), method5190(method5189("2L\u0016EI>RLG\b")), method5190(method5189("2L\u0016?\b")), method5190(method5189("2L\u0016:\b")), method5190(method5189("2L\u0016;\b")), method5190(method5189("2L\u00168\b")), method5190(method5189("2L\u0016<\b")), method5190(method5189("2L\u0016=\b"))};
   @OriginalMember(
      owner = "client!bw",
      name = "i",
      descriptor = "I"
   )
   public static int field10348;
   @OriginalMember(
      owner = "client!bw",
      name = "o",
      descriptor = "I"
   )
   public static int field10349;
   @OriginalMember(
      owner = "client!bw",
      name = "k",
      descriptor = "I"
   )
   public static int field10350;
   @OriginalMember(
      owner = "client!bw",
      name = "n",
      descriptor = "I"
   )
   public static int field10352;
   @OriginalMember(
      owner = "client!bw",
      name = "l",
      descriptor = "I"
   )
   public static int field10353;
   @OriginalMember(
      owner = "client!bw",
      name = "m",
      descriptor = "I"
   )
   public static int field10354;
   @OriginalMember(
      owner = "client!bw",
      name = "p",
      descriptor = "I"
   )
   public static int field10355;
   @OriginalMember(
      owner = "client!bw",
      name = "q",
      descriptor = "I"
   )
   public static int field10356;
   @OriginalMember(
      owner = "client!bw",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10351;

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(BI)I",
      line = 5
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field10352;
         if (arg0 > -45) {
            return 51;
         } else {
            return ~super.field4914.method5554(-1).method1931((byte)47) > -97 ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10357[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(IB)V",
      line = 26
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         if (arg1 >= 99) {
            ++field10348;
            class412.method3148(super.field4913, (byte)-51);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10357[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(I)V",
      line = 39
   )
   public final void method51(int arg0) {
      try {
         if (~super.field4914.method5554(~arg0).method1931((byte)122) > -97) {
            super.field4913 = 0;
         }

         ++field10354;
         if (super.field4913 < arg0 || super.field4913 > 2) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10357[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(ZI)V",
      line = 52
   )
   public static final void method5185(boolean arg0, int arg1) {
      try {
         if (arg1 > -45) {
            field10349 = 108;
         }

         ++field10355;
         class763.method5509(class720.field10406, class277.field3907, 74, arg0, class218.field3296);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10357[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 66
   )
   public class715(class768 arg0) {
      super(arg0);

      try {
         class412.method3148(super.field4913, (byte)108);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10357[4] + (arg0 != null ? field10357[2] : field10357[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(Z)I",
      line = 74
   )
   public final int method53(boolean arg0) {
      try {
         ++field10353;
         if (super.field4914.method5554(-1).method1931((byte)109) < 96) {
            return 0;
         } else {
            if (arg0) {
               this.method52((byte)87, -77);
            }

            return 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10357[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "(I)V",
      line = 88
   )
   public static void method5186(int arg0) {
      try {
         if (arg0 == -16056) {
            field10351 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10357[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(B)Z",
      line = 98
   )
   public final boolean method5187(byte arg0) {
      try {
         ++field10350;
         if (arg0 >= -127) {
            return true;
         } else {
            return super.field4914.method5554(-1).method1931((byte)44) >= 96;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10357[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 114
   )
   public class715(int arg0, class768 arg1) {
      super(arg0, arg1);

      try {
         class412.method3148(super.field4913, (byte)114);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10357[4] + arg0 + ',' + (arg1 != null ? field10357[2] : field10357[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "(Z)I",
      line = 123
   )
   public final int method5188(boolean arg0) {
      try {
         if (arg0) {
            field10351 = null;
         }

         ++field10356;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10357[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5189(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5190(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
