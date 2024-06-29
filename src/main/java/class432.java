import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class432 extends class76 {
   @OriginalMember(
      owner = "client!taa",
      name = "C",
      descriptor = "Lgfa;"
   )
   public class784 field6168;
   @OriginalMember(
      owner = "client!taa",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6171 = new String[]{method3194(method3193("\u000fP\u0017<\u0002S")), method3194(method3193("\u0000\u001fX<>")), method3194(method3193("\u000fP\u0017<\u007f\u0012_\u001ff}S")), method3194(method3193("\u0015D\u001a~")), method3194(method3193("\u000fP\u0017<\u0000S")), method3194(method3193("\u000fP\u0017<\u0001S"))};
   @OriginalMember(
      owner = "client!taa",
      name = "A",
      descriptor = "Leg;"
   )
   public static class118 field6166 = new class118(141, 5);
   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "I"
   )
   public static int field6167;
   @OriginalMember(
      owner = "client!taa",
      name = "D",
      descriptor = "I"
   )
   public static int field6170;
   @OriginalMember(
      owner = "client!taa",
      name = "B",
      descriptor = "[Lbg;"
   )
   public static class492[] field6169;

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3190(int arg0) {
      try {
         field6169 = null;
         if (arg0 <= -55) {
            field6166 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6171[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(Lwf;I)V"
   )
   public static final void method3191(class147 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field6170;
         int var3 = -45 % ((arg1 - 39) / 52);
         int var4 = 0;
         if (var2 || ~var4 > ~class152.field2145) {
            do {
               int var5 = arg0.method1145((byte)49);
               int var6 = arg0.method1211(-26166);
               if (~var6 == -65536) {
                  var6 = -1;
               }

               if (class123.field1606[var5] != null) {
                  class123.field1606[var5].field2309 = var6;
               }

               ++var4;
            } while(~var4 > ~class152.field2145);

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6171[5] + (arg0 != null ? field6171[1] : field6171[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "c",
      descriptor = "(B)Lwf;"
   )
   public static final class147 method3192(byte arg0) {
      try {
         ++field6167;
         class147 var1 = new class147(518);
         class559.field8012 = new int[4];
         class559.field8012[3] = (int)(9.9999999E7D * Math.random());
         class559.field8012[0] = (int)(9.9999999E7D * Math.random());
         class559.field8012[2] = (int)(9.9999999E7D * Math.random());
         class559.field8012[1] = (int)(Math.random() * 9.9999999E7D);
         if (arg0 > -96) {
            method3190(66);
         }

         var1.method1186(10, 0);
         var1.method1160(93, class559.field8012[0]);
         var1.method1160(83, class559.field8012[1]);
         var1.method1160(103, class559.field8012[2]);
         var1.method1160(115, class559.field8012[3]);
         return var1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6171[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "(Lgfa;)V"
   )
   public class432(class784 arg0) {
      try {
         this.field6168 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6171[2] + (arg0 != null ? field6171[1] : field6171[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3193(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3194(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
