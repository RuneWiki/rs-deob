import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class587 extends class302 {
   @OriginalMember(
      owner = "client!ug",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8697 = new String[]{method4333(method4332("^m`Q\u000e")), method4333(method4332("^m`P\u000e")), method4333(method4332("^m`W\u000e")), method4333(method4332("^m`T\u000e")), method4333(method4332("E\u007f\"~")), method4333(method4332("P$`<[")), method4333(method4332("^m`S\u000e")), method4333(method4332("^m`U\u000e"))};
   @OriginalMember(
      owner = "client!ug",
      name = "O",
      descriptor = "I"
   )
   public static int field8695 = 0;
   @OriginalMember(
      owner = "client!ug",
      name = "N",
      descriptor = "Lwga;"
   )
   public static class779 field8689 = new class779(16);
   @OriginalMember(
      owner = "client!ug",
      name = "J",
      descriptor = "Lsd;"
   )
   public static class101 field8696 = new class101(40, 3);
   @OriginalMember(
      owner = "client!ug",
      name = "K",
      descriptor = "I"
   )
   public static int field8690;
   @OriginalMember(
      owner = "client!ug",
      name = "M",
      descriptor = "I"
   )
   public static int field8691;
   @OriginalMember(
      owner = "client!ug",
      name = "L",
      descriptor = "I"
   )
   public static int field8692;
   @OriginalMember(
      owner = "client!ug",
      name = "P",
      descriptor = "I"
   )
   public static int field8693;
   @OriginalMember(
      owner = "client!ug",
      name = "I",
      descriptor = "I"
   )
   public static int field8694;

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(IIIII)V",
      line = 3
   )
   public static final void method4329(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class610.field8935 = arg0;
         if (arg3 != 1) {
            method4329(-1, 62, 40, -124, 107);
         }

         class425.field6453 = arg4;
         ++field8694;
         class555.field8227 = arg1;
         class230.field2932 = arg2;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8697[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 21
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field8690;
         if (arg0 == arg1) {
            super.field4313 = arg2.method1104(arg1 + 255) == 1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8697[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8697[5] : field8697[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(BI)[[I",
      line = 32
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8691;
         int[][] var4 = super.field4292.method3409(arg1, arg0 ^ -90);
         if (super.field4292.field6892) {
            int[][] var5 = this.method2297(0, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 != 0 || class344.field5238 > var12) {
               do {
                  var9[var12] = -var6[var12] + 4096;
                  var10[var12] = -var7[var12] + 4096;
                  var11[var12] = -var8[var12] + 4096;
                  ++var12;
               } while(class344.field5238 > var12);
            }
         }

         if (arg0 != -90) {
            method4330(-85, -127, -46);
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8697[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "<init>",
      descriptor = "()V",
      line = 80
   )
   public class587() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ug",
      name = "c",
      descriptor = "(III)Z",
      line = 83
   )
   public static final boolean method4330(int arg0, int arg1, int arg2) {
      try {
         if (arg2 >= -33) {
            method4329(56, -101, 44, 14, 101);
         }

         ++field8693;
         return (65536 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8697[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "f",
      descriptor = "(I)V",
      line = 95
   )
   public static void method4331(int arg0) {
      try {
         if (arg0 != 0) {
            method4331(106);
         }

         field8689 = null;
         field8696 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8697[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "a",
      descriptor = "(II)[I",
      line = 114
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8692;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 > -37) {
            method4330(95, -62, -87);
         }

         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 0);
            int var6 = 0;
            if (var3 != 0 || class344.field5238 > var6) {
               do {
                  var4[var6] = -var5[var6] + 4096;
                  ++var6;
               } while(class344.field5238 > var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8697[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4332(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ug",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4333(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
