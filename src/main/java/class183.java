import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class183 extends class243 {
   @OriginalMember(
      owner = "client!mja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2325 = new String[]{method1541(method1540("`\u0015K\u0012\\")), method1541(method1540("uN\tP")), method1541(method1540("vQ\u0004\u0012l3")), method1541(method1540("vQ\u0004\u0012e3")), method1541(method1540("vQ\u0004\u0012m3")), method1541(method1540("vQ\u0004\u0012`3")), method1541(method1540("vQ\u0004\u0012o3"))};
   @OriginalMember(
      owner = "client!mja",
      name = "H",
      descriptor = "Lse;"
   )
   public static class6 field2322 = new class6(46, -1);
   @OriginalMember(
      owner = "client!mja",
      name = "F",
      descriptor = "Lsp;"
   )
   public static class774 field2324 = new class774();
   @OriginalMember(
      owner = "client!mja",
      name = "B",
      descriptor = "I"
   )
   public static int field2318;
   @OriginalMember(
      owner = "client!mja",
      name = "G",
      descriptor = "I"
   )
   public static int field2320;
   @OriginalMember(
      owner = "client!mja",
      name = "D",
      descriptor = "I"
   )
   public static int field2321;
   @OriginalMember(
      owner = "client!mja",
      name = "E",
      descriptor = "I"
   )
   public static int field2323;
   @OriginalMember(
      owner = "client!mja",
      name = "C",
      descriptor = "Lae;"
   )
   public static class285 field2319;

   @OriginalMember(
      owner = "client!mja",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1534(boolean arg0) {
      try {
         if (!arg0) {
            field2324 = null;
         }

         field2322 = null;
         field2319 = null;
         field2324 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2325[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1535(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2321;
         if (~(8 & class245.field3092[arg3][arg0][arg1]) != -1) {
            return 0;
         } else {
            return arg3 > arg2 && (2 & class245.field3092[1][arg0][arg1]) != 0 ? arg3 + -1 : arg3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2325[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method1536(int arg0, float arg1) {
      try {
         ++field2323;
         super.field3067 = arg1;
         if (arg0 != 58) {
            field2324 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2325[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public final void method1537(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         super.field3070 = arg2;
         super.field3065 = arg1;
         if (!arg0) {
            field2319 = null;
         }

         super.field3062 = arg3;
         ++field2318;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2325[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   public static final void method1538(int arg0, String arg1, int arg2) {
      try {
         ++class267.field3375;
         ++field2320;
         class594 var3 = class145.method1177((byte)104);
         class702 var4 = class19.method142(var3.field8765, class702.field10268, (byte)-113);
         var4.field10264.method593(class398.method3129(12, arg1) + 1, 867770704);
         if (arg2 != 46) {
            method1534(true);
         }

         var4.field10264.method595(-15010, arg1);
         var4.field10264.method593(arg0, arg2 + 867770658);
         var3.method4423(var4, (byte)127);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2325[2] + arg0 + ',' + (arg1 != null ? field2325[0] : field2325[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class183(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(Lrea;)V"
   )
   public static final void method1539(class39 arg0) {
      class422.field5749 = arg0;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1540(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1541(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
