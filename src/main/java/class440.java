import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class440 extends class385 {
   @OriginalMember(
      owner = "client!ep",
      name = "h",
      descriptor = "I"
   )
   private int field6415;
   @OriginalMember(
      owner = "client!ep",
      name = "m",
      descriptor = "I"
   )
   private int field6420;
   @OriginalMember(
      owner = "client!ep",
      name = "n",
      descriptor = "I"
   )
   private int field6430;
   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "I"
   )
   private int field6416;
   @OriginalMember(
      owner = "client!ep",
      name = "j",
      descriptor = "I"
   )
   private int field6413;
   @OriginalMember(
      owner = "client!ep",
      name = "l",
      descriptor = "I"
   )
   private int field6418;
   @OriginalMember(
      owner = "client!ep",
      name = "y",
      descriptor = "I"
   )
   private int field6419;
   @OriginalMember(
      owner = "client!ep",
      name = "k",
      descriptor = "I"
   )
   private int field6422;
   @OriginalMember(
      owner = "client!ep",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6432 = new String[]{method3319(method3318("\\;7! ")), method3319(method3318("\\;7& ")), method3319(method3318("\\;7# ")), method3319(method3318("\\;7% ")), method3319(method3318("\\;7  ")), method3319(method3318("\\;7[aW\"mY ")), method3319(method3318("\\;7$ ")), method3319(method3318("\\;7/ ")), method3319(method3318("\\;7\" "))};
   @OriginalMember(
      owner = "client!ep",
      name = "i",
      descriptor = "I"
   )
   public static int field6428 = 1337;
   @OriginalMember(
      owner = "client!ep",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field6426 = false;
   @OriginalMember(
      owner = "client!ep",
      name = "q",
      descriptor = "I"
   )
   public static int field6414;
   @OriginalMember(
      owner = "client!ep",
      name = "p",
      descriptor = "I"
   )
   public static int field6417;
   @OriginalMember(
      owner = "client!ep",
      name = "o",
      descriptor = "I"
   )
   public static int field6421;
   @OriginalMember(
      owner = "client!ep",
      name = "u",
      descriptor = "I"
   )
   public static int field6423;
   @OriginalMember(
      owner = "client!ep",
      name = "x",
      descriptor = "I"
   )
   public static int field6424;
   @OriginalMember(
      owner = "client!ep",
      name = "w",
      descriptor = "I"
   )
   public static int field6425;
   @OriginalMember(
      owner = "client!ep",
      name = "r",
      descriptor = "I"
   )
   public static int field6427;
   @OriginalMember(
      owner = "client!ep",
      name = "v",
      descriptor = "I"
   )
   public static int field6429;
   @OriginalMember(
      owner = "client!ep",
      name = "t",
      descriptor = "Lcca;"
   )
   public static class258 field6431;

   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method3313(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= 40) {
            return true;
         } else {
            ++field6414;
            return (33 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6432[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IIZ)Z",
      line = 14
   )
   public static final boolean method3314(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            field6428 = -11;
         }

         ++field6425;
         return (arg1 & 55) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6432[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(III)V",
      line = 27
   )
   public final void method2104(int arg0, int arg1, int arg2) {
      try {
         ++field6429;
         int var4 = this.field6420 * arg1 >> 12;
         int var5 = this.field6430 * arg0 >> 12;
         int var6 = this.field6422 * arg1 >> 12;
         int var7 = this.field6419 * arg0 >> 12;
         if (arg2 == 5598) {
            int var8 = this.field6415 * arg1 >> 12;
            int var9 = this.field6416 * arg0 >> 12;
            int var10 = this.field6413 * arg1 >> 12;
            int var11 = this.field6418 * arg0 >> 12;
            class46.method572(var4, super.field5687, var9, var10, var7, var6, var5, false, var11, var8);
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6432[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(I)V",
      line = 54
   )
   public static void method3315(int arg0) {
      try {
         if (arg0 >= 0) {
            field6431 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6432[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(II)V",
      line = 67
   )
   public static final void method3316(int arg0, int arg1) {
      try {
         ++field6423;
         int var2 = 86 % ((11 - arg0) / 52);
         if (class85.field1400 == null || class85.field1400.length < arg1) {
            class85.field1400 = new int[arg1];
         }

      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6432[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(BII)V",
      line = 83
   )
   public final void method2103(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != -38) {
            this.field6415 = 113;
         }

         ++field6421;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6432[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V",
      line = 98
   )
   public class440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field6415 = arg4;
         this.field6420 = arg0;
         this.field6430 = arg1;
         this.field6416 = arg5;
         this.field6413 = arg6;
         this.field6418 = arg7;
         this.field6419 = arg3;
         this.field6422 = arg2;
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field6432[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "(IBI)Z",
      line = 113
   )
   public static final boolean method3317(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= 53) {
            return false;
         } else {
            ++field6427;
            return ~(arg0 & 262144) != -1 | class594.method4387(true, arg2, arg0) || class383.method2980(arg0, 0, arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6432[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(IBI)V",
      line = 124
   )
   public final void method2108(int arg0, byte arg1, int arg2) {
      try {
         ++field6417;
         int var4 = 100 % ((-3 - arg1) / 51);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6432[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3319(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
