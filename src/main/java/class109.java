import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class109 extends class650 {
   @OriginalMember(
      owner = "client!eda",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1387 = new String[]{method968(method967(" %\u001ca!m")), method968(method967(" %\u001ca,m")), method968(method967(" %\u001ca?m"))};
   @OriginalMember(
      owner = "client!eda",
      name = "K",
      descriptor = "Ldia;"
   )
   public static class245 field1381 = new class245(4);
   @OriginalMember(
      owner = "client!eda",
      name = "I",
      descriptor = "I"
   )
   public static int field1385 = 0;
   @OriginalMember(
      owner = "client!eda",
      name = "M",
      descriptor = "Lbga;"
   )
   public static class378 field1384 = new class378(82, -2);
   @OriginalMember(
      owner = "client!eda",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field1386 = new int[8];
   @OriginalMember(
      owner = "client!eda",
      name = "L",
      descriptor = "I"
   )
   public static int field1380;
   @OriginalMember(
      owner = "client!eda",
      name = "J",
      descriptor = "I"
   )
   public static int field1382;
   @OriginalMember(
      owner = "client!eda",
      name = "N",
      descriptor = "I"
   )
   public static int field1383;

   @OriginalMember(
      owner = "client!eda",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method963(int arg0) {
      try {
         field1381 = null;
         field1384 = null;
         field1386 = null;
         int var1 = -40 % ((-3 - arg0) / 42);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1387[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Lgw;)V"
   )
   public class109(class74 arg0, class74 arg1, class181 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method964(int arg0, int arg1) {
      try {
         class479.field6625 = arg0;
         class188.field2305 = null;
         ++field1382;
         class104.field1328 = -1;
         class449.field6210 = 1;
         class671.field9870 = 0;
         class728.field10669 = null;
         if (arg1 == 17818) {
            class370.field5220 = -1;
            class382.field5353 = false;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1387[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(IIIILec;)V"
   )
   public static final void method965(int arg0, int arg1, int arg2, int arg3, class247 arg4) {
      class225 var5 = class12.method96(arg0, arg1, arg2);
      if (var5 != null) {
         arg4.field999 = (arg1 << class76.field965) + class187.field2291;
         arg4.field998 = arg3;
         arg4.field1003 = (arg2 << class76.field965) + class187.field2291;
         var5.field2826 = arg4;
         int var6 = class93.field1241 == class73.field900 ? 1 : 0;
         if (arg4.method780(88)) {
            if (arg4.method775(0)) {
               arg4.field1004 = class735.field10736[var6];
               class735.field10736[var6] = arg4;
               return;
            }

            arg4.field1004 = class8.field111[var6];
            class8.field111[var6] = arg4;
            class591.field8180 = true;
            return;
         }

         arg4.field1004 = class234.field2900[var6];
         class234.field2900[var6] = arg4;
      }

   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public final void method966(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1380;
         int var6 = super.field9109.method2125();
         if (arg1 == 3) {
            int var7 = ((class181)super.field6345).field2237 * class243.method1822(-30288) / 10 % var6;
            super.field9109.method5484(-var6 + var7 + arg2, arg4, -var7 + var6 + arg3, arg0);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1387[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
