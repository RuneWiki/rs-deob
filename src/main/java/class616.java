import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class616 implements class765 {
   @OriginalMember(
      owner = "client!nu",
      name = "g",
      descriptor = "Lkga;"
   )
   private class569 field8956;
   @OriginalMember(
      owner = "client!nu",
      name = "i",
      descriptor = "Lqs;"
   )
   private class627 field8952;
   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8958 = new String[]{method4521(method4520(")dZk\f")), method4521(method4520(")d\u0018F")), method4521(method4520("<?Z\u0004Y")), method4521(method4520(")dZm\f")), method4521(method4520(")dZi\f")), method4521(method4520(")dZc\f")), method4521(method4520(")dZn\f")), method4521(method4520(")dZh\f")), method4521(method4520(")dZ\u0016M)x\u0000\u0014\f"))};
   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "Lgw;"
   )
   public static class179 field8954 = new class179(64);
   @OriginalMember(
      owner = "client!nu",
      name = "f",
      descriptor = "I"
   )
   public static int field8949;
   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "I"
   )
   public static int field8950;
   @OriginalMember(
      owner = "client!nu",
      name = "h",
      descriptor = "I"
   )
   public static int field8953;
   @OriginalMember(
      owner = "client!nu",
      name = "e",
      descriptor = "I"
   )
   public static int field8955;
   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "I"
   )
   public static int field8957;
   @OriginalMember(
      owner = "client!nu",
      name = "d",
      descriptor = "Ltj;"
   )
   public static class206 field8951;

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public final void method61(int arg0) {
      try {
         ++field8950;
         if (arg0 != -15367) {
            this.field8956 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8958[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "(B)V",
      line = 17
   )
   public static void method4517(byte arg0) {
      try {
         field8954 = null;
         field8951 = null;
         if (arg0 >= -89) {
            method4518((byte)-118);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8958[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(ZI)V",
      line = 30
   )
   public final void method58(boolean arg0, int arg1) {
      try {
         ++field8957;
         class396 var3 = this.field8952.method4595((byte)113, this.field8956.field8246);
         if (var3 != null) {
            int var4 = this.field8956.field8239.method4952(this.field8956.field8243, class140.field2281, true) - -this.field8956.field8235;
            int var5 = this.field8956.field8241.method1060(this.field8956.field8240, 112, class664.field9661) - -this.field8956.field8248;
            if (this.field8956.field8245) {
               class444.field6473.method403(var4, var5, this.field8956.field8243, this.field8956.field8240, this.field8956.field8244, 0);
            }

            int var6 = var5 + this.method4519(-122, var3.field5813, var5, 5, class296.field4151, var4) * 12;
            int var11 = var6 + 8;
            if (this.field8956.field8245) {
               class444.field6473.method340(var4, var11, this.field8956.field8243 + -1 + var4, var11, this.field8956.field8244, 0);
            }

            var6 = var11 + 1;
            int var7 = var6 + 12 * this.method4519(-83, var3.field5814, var6, 5, class296.field4151, var4);
            int var12 = var7 + 5;
            int var10000 = var12 + this.method4519(arg1 + -9203, var3.field5819, var12, 5, class296.field4151, var4) * 12;
         }

         if (arg1 != 9124) {
            this.field8956 = null;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8958[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "(B)V",
      line = 66
   )
   public static final void method4518(byte arg0) {
      try {
         if (class299.field4192 == null) {
            class236 var1 = new class236();
            byte[] var2 = var1.method1936(16, 128, 128, -1);
            class299.field4192 = class194.method1687(false, -137, var2);
         }

         ++field8949;
         if (class323.field4658 == null) {
            class470 var3 = new class470();
            byte[] var4 = var3.method3512(16, 128, 128, (byte)-109);
            class323.field4658 = class194.method1687(false, -137, var4);
         }

         if (arg0 != -75) {
            field8951 = null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8958[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "<init>",
      descriptor = "(Lqs;Lkga;)V",
      line = 94
   )
   public class616(class627 arg0, class569 arg1) {
      try {
         this.field8956 = arg1;
         this.field8952 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8958[8] + (arg0 != null ? field8958[2] : field8958[1]) + ',' + (arg1 != null ? field8958[2] : field8958[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(B)Z",
      line = 103
   )
   public final boolean method59(byte arg0) {
      try {
         ++field8955;
         int var2 = -102 / ((arg0 - 62) / 51);
         return this.field8952.method4592(5677);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8958[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(ILjava/lang/String;IILda;I)I",
      line = 117
   )
   private final int method4519(int arg0, String arg1, int arg2, int arg3, class66 arg4, int arg5) {
      try {
         if (arg0 >= -64) {
            return -115;
         } else {
            ++field8953;
            return arg4.method717((int[])null, arg3 + arg5, 0, this.field8956.field8240 - arg3 * 2, 0, (class476[])null, 0, -(arg3 * 2) + this.field8956.field8243, this.field8956.field8237, arg2 + arg3, arg1, 0, (class510)null, this.field8956.field8238, 0, 255);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8958[0] + arg0 + ',' + (arg1 != null ? field8958[2] : field8958[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8958[2] : field8958[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4520(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4521(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
