import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class237 {
   @OriginalMember(
      owner = "client!em",
      name = "d",
      descriptor = "Ltv;"
   )
   private class590 field2932 = new class590(64);
   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "Lqh;"
   )
   private class74 field2938;
   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2940 = new String[]{method1782(method1781("uxdc0")), method1782(method1781("uxd`0")), method1782(method1781("uxdb0")), method1782(method1781("X|.E}~8?R}")), method1782(method1781("k;d\u000fe")), method1782(method1781("~`&M")), method1782(method1781("uxd\u001dq~|>\u001f0"))};
   @OriginalMember(
      owner = "client!em",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field2934 = false;
   @OriginalMember(
      owner = "client!em",
      name = "g",
      descriptor = "Lbga;"
   )
   public static class378 field2936 = new class378(41, -2);
   @OriginalMember(
      owner = "client!em",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field2939 = new class616(37, 7);
   @OriginalMember(
      owner = "client!em",
      name = "f",
      descriptor = "I"
   )
   public static int field2933;
   @OriginalMember(
      owner = "client!em",
      name = "e",
      descriptor = "I"
   )
   public static int field2937;
   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field2935;

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(II)Lwb;"
   )
   public final class350 method1778(int arg0, int arg1) {
      try {
         ++field2933;
         class590 var3 = this.field2932;
         class350 var4;
         synchronized(this.field2932) {
            var4 = (class350)this.field2932.method4239((long)arg0, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field2938;
            byte[] var6;
            synchronized(this.field2938) {
               var6 = this.field2938.method732(arg0, 5, (byte)116);
            }

            class350 var7 = new class350();
            if (var6 != null) {
               var7.method2760(new class594(var6), true);
            }

            class590 var8 = this.field2932;
            synchronized(this.field2932) {
               this.field2932.method4238(arg1 ^ -25645, var7, (long)arg0);
            }

            if (arg1 != -25673) {
               this.method1778(11, -58);
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2940[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1779(int arg0) {
      try {
         field2939 = null;
         field2935 = null;
         field2936 = null;
         int var1 = -63 % ((6 - arg0) / 62);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2940[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(ILeb;)Ljava/lang/String;"
   )
   public static final String method1780(int arg0, class657 arg1) {
      try {
         int var2 = 108 / ((arg0 - -60) / 45);
         ++field2937;
         if (client.method2396(arg1).method3160(-26038) == 0) {
            return null;
         } else if (arg1.field9362 != null && arg1.field9362.trim().length() != 0) {
            return arg1.field9362;
         } else {
            return class92.field1233 ? field2940[3] : null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2940[2] + arg0 + ',' + (arg1 != null ? field2940[4] : field2940[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class237(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field2938 = arg2;
         this.field2938.method727(5, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2940[6] + (arg0 != null ? field2940[4] : field2940[5]) + ',' + arg1 + ',' + (arg2 != null ? field2940[4] : field2940[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1781(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1782(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
