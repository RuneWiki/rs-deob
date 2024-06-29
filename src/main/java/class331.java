import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class331 extends class437 {
   @OriginalMember(
      owner = "client!cd",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4740 = new String[]{method2573(method2572("&\u0007\u000e\u0013}")), method2573(method2572(">M\u000e|(")), method2573(method2572("+\u0016L>")), method2573(method2572("&\u0007\u000e\u0011}")), method2573(method2572("&\u0007\u000e\u001b}")), method2573(method2572("&\u0007\u000e\u001a}")), method2573(method2572("&\u0007\u000e\u0015}")), method2573(method2572("&\u0007\u000e\u0014}")), method2573(method2572("&\u0007\u000e\u0018}"))};
   @OriginalMember(
      owner = "client!cd",
      name = "B",
      descriptor = "Lej;"
   )
   public static class133 field4734 = new class133();
   @OriginalMember(
      owner = "client!cd",
      name = "I",
      descriptor = "F"
   )
   public static float field4738;
   @OriginalMember(
      owner = "client!cd",
      name = "H",
      descriptor = "I"
   )
   public static int field4730;
   @OriginalMember(
      owner = "client!cd",
      name = "E",
      descriptor = "I"
   )
   public static int field4731;
   @OriginalMember(
      owner = "client!cd",
      name = "A",
      descriptor = "I"
   )
   public static int field4732;
   @OriginalMember(
      owner = "client!cd",
      name = "y",
      descriptor = "I"
   )
   public static int field4733;
   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "I"
   )
   public static int field4736;
   @OriginalMember(
      owner = "client!cd",
      name = "F",
      descriptor = "I"
   )
   public static int field4739;
   @OriginalMember(
      owner = "client!cd",
      name = "G",
      descriptor = "Lhw;"
   )
   public static class141 field4737;
   @OriginalMember(
      owner = "client!cd",
      name = "C",
      descriptor = "[B"
   )
   private byte[] field4735;

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "([FII)[F"
   )
   public static final float[] method2565(float[] arg0, int arg1, int arg2) {
      try {
         ++field4736;
         float[] var3 = new float[arg2];
         class365.method2857(arg0, 0, var3, 0, arg2);
         if (arg1 >= -59) {
            method2565((float[])null, -94, 43);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4740[0] + (arg0 != null ? field4740[1] : field4740[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2566(int arg0, int arg1) {
      try {
         ++field4739;
         if (arg0 != -3009) {
            return true;
         } else {
            return arg1 == 0 || ~arg1 == -3;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4740[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(Ld;Lhw;I)V"
   )
   public static final void method2567(class160 arg0, class141 arg1, int arg2) {
      try {
         if (arg2 != 3072) {
            field4738 = 0.31565076F;
         }

         ++field4731;
         class474.field6926 = arg1;
         class484.field7035 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4740[4] + (arg0 != null ? field4740[1] : field4740[2]) + ',' + (arg1 != null ? field4740[1] : field4740[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method2568(byte arg0) {
      try {
         class725.field10457 = 0;
         ++field4732;
         int var1 = (class304.field4398.field4101 >> 9) + class347.field4939;
         int var2 = (class304.field4398.field4096 >> 9) + class753.field10887;
         if (arg0 != 70) {
            field4737 = null;
         }

         if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
            class725.field10457 = 1;
         }

         if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class725.field10457 = 1;
         }

         if (~class725.field10457 == -2 && var1 >= 3139 && var1 <= 3199 && ~var2 <= -3009 && var2 <= 3062) {
            class725.field10457 = 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4740[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "<init>",
      descriptor = "()V"
   )
   public class331() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IIIB)[B"
   )
   public final byte[] method2569(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field4733;
         this.field4735 = new byte[arg0 * arg1 * arg2 * 2];
         if (arg3 >= -32) {
            this.method2569(-62, 94, -122, (byte)3);
         }

         this.method2345(arg2, false, arg0, arg1);
         return this.field4735;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4740[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2570(boolean arg0) {
      try {
         field4737 = null;
         if (arg0) {
            field4734 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4740[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(BBI)V"
   )
   public final void method2571(byte arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= 85) {
            method2565((float[])null, 43, 92);
         }

         ++field4730;
         byte var7 = (byte)((arg0 >> 1 & 127) + 127);
         int var4 = arg2 * 2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field4735[var10001] = var7;
         this.field4735[var8] = var7;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4740[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2572(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2573(char[] arg0) {
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
            var10005 = 99;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
