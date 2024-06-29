import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class776 extends class333 {
   @OriginalMember(
      owner = "client!kr",
      name = "p",
      descriptor = "I"
   )
   private int field11353 = 0;
   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11357 = new String[]{method5608(method5607(" Z\u001fpc")), method5608(method5607(" Z\u001fqc")), method5608(method5607(" Z\u001fwc"))};
   @OriginalMember(
      owner = "client!kr",
      name = "o",
      descriptor = "Ltv;"
   )
   public static class584 field11354 = new class584(1);
   @OriginalMember(
      owner = "client!kr",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field11355 = new int[250];
   @OriginalMember(
      owner = "client!kr",
      name = "m",
      descriptor = "Lqh;"
   )
   public static class74 field11356 = new class74();
   @OriginalMember(
      owner = "client!kr",
      name = "k",
      descriptor = "I"
   )
   public static int field11351;
   @OriginalMember(
      owner = "client!kr",
      name = "n",
      descriptor = "I"
   )
   public static int field11352;

   @OriginalMember(
      owner = "client!kr",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public static void method5605(byte arg0) {
      try {
         int var1 = -77 / ((arg0 - 55) / 35);
         field11355 = null;
         field11354 = null;
         field11356 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11357[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(ZI)V",
      line = 15
   )
   public final void method58(boolean arg0, int arg1) {
      try {
         ++field11352;
         if (arg1 != 9124) {
            field11354 = null;
         }

         int var3 = super.field4763.field11547.method4952(super.field4765.method3009(), class140.field2281, true) - -super.field4763.field11546;
         int var4 = super.field4763.field11550.method1060(super.field4765.method3000(), -99, class664.field9661) + super.field4763.field11551;
         super.field4765.method3601((float)(super.field4765.method3009() / 2 + var3), (float)(var4 - -(super.field4765.method3000() / 2)), 4096, this.field11353);
         this.field11353 += ((class62)super.field4763).field1157;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11357[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "<init>",
      descriptor = "(Lhw;Lfw;)V",
      line = 34
   )
   public class776(class141 arg0, class62 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kr",
      name = "a",
      descriptor = "(III)I",
      line = 37
   )
   public static final int method5606(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field11351;
         int var5;
         if (arg2 < arg0) {
            int var4 = arg2;
            arg2 = arg0;
            arg0 = var4;
            if (var3) {
               var5 = arg2 % var4;
               arg2 = var4;
               arg0 = var5;
            }
         }

         while(true) {
            int var10000;
            int var10001;
            if (~arg0 == -1) {
               var10000 = arg1;
               var10001 = 1;
               if (!var3) {
                  if (arg1 != 1) {
                     return 85;
                  }

                  return arg2;
               }
            } else {
               var10000 = arg2;
               var10001 = arg0;
            }

            var5 = var10000 % var10001;
            arg2 = arg0;
            arg0 = var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field11357[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
