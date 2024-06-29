import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class510 implements class534 {
   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "Loka;"
   )
   private class385 field7236;
   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7244 = new String[]{method3845(method3844("9'\u00142&")), method3845(method3844("9'\u00141&")), method3845(method3844("35V\u001c")), method3845(method3844("&n\u0014^s")), method3845(method3844("9'\u00148&")), method3845(method3844("9'\u0014Lg3)NN&")), method3845(method3844("9'\u00143&")), method3845(method3844("9'\u00149&")), method3845(method3844("9'\u00147&"))};
   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "[Lpf;"
   )
   public static class424[] field7239 = new class424[5];
   @OriginalMember(
      owner = "client!dg",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field7241;
   @OriginalMember(
      owner = "client!dg",
      name = "j",
      descriptor = "Lhha;"
   )
   public static class724 field7240;
   @OriginalMember(
      owner = "client!dg",
      name = "e",
      descriptor = "I"
   )
   public static int field7234;
   @OriginalMember(
      owner = "client!dg",
      name = "i",
      descriptor = "I"
   )
   public static int field7235;
   @OriginalMember(
      owner = "client!dg",
      name = "g",
      descriptor = "I"
   )
   public static int field7237;
   @OriginalMember(
      owner = "client!dg",
      name = "d",
      descriptor = "I"
   )
   public static int field7238;
   @OriginalMember(
      owner = "client!dg",
      name = "f",
      descriptor = "I"
   )
   public static int field7242;
   @OriginalMember(
      owner = "client!dg",
      name = "h",
      descriptor = "Lda;"
   )
   public static class216 field7243;

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method983(boolean arg0, int arg1) {
      try {
         ++field7234;
         if (arg0) {
            class54.field794.method226(0, 0, class557.field7909, class140.field2243, this.field7236.field5619, 0);
         }

         if (arg1 >= -55) {
            field7241 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7244[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method3841(String arg0, int arg1) {
      try {
         ++field7237;
         class381 var2 = class563.method4194((byte)113);
         var2.field5570.method656((byte)94, class765.field10980.field11484);
         var2.field5570.method653(0, -112);
         int var3 = var2.field5570.field945;
         var2.field5570.method653(arg1, -86);
         int[] var4 = class171.method1588(var2, 2041);
         int var5 = var2.field5570.field945;
         var2.field5570.method658(arg0, arg1 + -758);
         var2.field5570.method656((byte)-124, class777.field11340);
         var2.field5570.field945 += 7;
         var2.field5570.method657(var2.field5570.field945, var4, var5, (byte)101);
         var2.field5570.method670((byte)-7, -var3 + var2.field5570.field945);
         class745.field10604.method2111(arg1 + 13364, var2);
         class330.field4925 = 0;
         class617.field8766 = -3;
         class467.field6773 = 1;
         class699.field10075 = 0;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7244[6] + (arg0 != null ? field7244[3] : field7244[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method984(int arg0) {
      try {
         if (arg0 < 67) {
            this.field7236 = null;
         }

         ++field7235;
         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7244[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method988(byte arg0) {
      try {
         ++field7242;
         if (arg0 < 88) {
            method3843(97);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7244[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method3842(String arg0, int arg1) {
      try {
         int var2 = 70 / ((arg1 - -3) / 51);
         ++field7238;
         return class24.method312(arg0, 10, true, -37);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7244[1] + (arg0 != null ? field7244[3] : field7244[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3843(int arg0) {
      try {
         field7243 = null;
         field7239 = null;
         field7241 = null;
         if (arg0 > -73) {
            method3841((String)null, 25);
         }

         field7240 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7244[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "<init>",
      descriptor = "(Loka;)V"
   )
   public class510(class385 arg0) {
      try {
         this.field7236 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7244[5] + (arg0 != null ? field7244[3] : field7244[2]) + ')');
      }
   }

   static {
      for(int var0 = 0; field7239.length > var0; ++var0) {
         field7239[var0] = new class424();
      }

      field7241 = new float[4];
      field7240 = new class724(10, 4);
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3844(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3845(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
