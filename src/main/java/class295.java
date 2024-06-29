import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class295 extends class147 {
   @OriginalMember(
      owner = "client!js",
      name = "k",
      descriptor = "I"
   )
   private int field4133 = 0;
   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4135 = new String[]{method2385(method2384("f(0nK")), method2385(method2384("f(0jK")), method2385(method2384("b.rE")), method2385(method2384("wu0\u0007\u001e")), method2385(method2384("f(0hK")), method2385(method2384("f(0kK"))};
   @OriginalMember(
      owner = "client!js",
      name = "m",
      descriptor = "I"
   )
   public static int field4130;
   @OriginalMember(
      owner = "client!js",
      name = "o",
      descriptor = "I"
   )
   public static int field4131;
   @OriginalMember(
      owner = "client!js",
      name = "n",
      descriptor = "I"
   )
   public static int field4132;
   @OriginalMember(
      owner = "client!js",
      name = "l",
      descriptor = "I"
   )
   public static int field4134;

   @OriginalMember(
      owner = "client!js",
      name = "<init>",
      descriptor = "(Lww;Lm;)V"
   )
   public class295(class339 arg0, class555 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method222(int arg0, boolean arg1) {
      try {
         ++field4131;
         int var3 = super.field1840.field5093.method1893((byte)-49, super.field1834.method2406(), class286.field3961) - -super.field1840.field5098;
         if (arg0 == -22493) {
            int var4 = super.field1840.field5095.method4440(class627.field9254, arg0 + 22562, super.field1834.method2396()) - -super.field1840.field5094;
            super.field1834.method4763((float)(var3 - -(super.field1834.method2406() / 2)), (float)(super.field1834.method2396() / 2 + var4), 4096, this.field4133);
            this.field4133 += ((class555)super.field1840).field8145;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4135[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "(IZ)Llia;"
   )
   public static final class633 method2381(int arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++field4134;
         class633[] var3 = class688.method5029((byte)-44);
         if (arg1) {
            method2381(-27, true);
         }

         int var4 = 0;
         if (!var2 && var4 >= var3.length) {
            return null;
         } else {
            do {
               class633 var5 = var3[var4];
               if (var5.field9330 == arg0) {
                  return var5;
               }

               ++var4;
            } while(var4 < var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4135[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "c",
      descriptor = "(IZ)V"
   )
   public static final void method2382(int arg0, boolean arg1) {
      try {
         class381.field5303 = arg0;
         ++field4130;
         class491.field6864 = -1;
         class491.field6864 = -1;
         class541.method4094(arg1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4135[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Ljava/lang/String;ZB)V"
   )
   public static final void method2383(String arg0, boolean arg1, byte arg2) {
      try {
         class163.method1354(-1, false, arg1, -1, arg0);
         ++field4132;
         int var3 = 7 / ((-16 - arg2) / 46);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4135[1] + (arg0 != null ? field4135[3] : field4135[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2384(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2385(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
