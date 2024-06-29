import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class347 extends class264 {
   @OriginalMember(
      owner = "client!saa",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4696 = new String[]{method2540(method2539("+i_\u0010l1fWJnp")), method2540(method2539("+i_\u0010\u0011p")), method2540(method2539("#&\u0010\u0010-")), method2540(method2539("6}RR")), method2540(method2539("+i_\u0010\u0017p")), method2540(method2539("+i_\u0010\u0014p")), method2540(method2539("+i_\u0010\u0013p"))};
   @OriginalMember(
      owner = "client!saa",
      name = "I",
      descriptor = "Leg;"
   )
   public static class118 field4687 = new class118(96, -1);
   @OriginalMember(
      owner = "client!saa",
      name = "Q",
      descriptor = "D"
   )
   public static double field4691;
   @OriginalMember(
      owner = "client!saa",
      name = "L",
      descriptor = "I"
   )
   private int field4685;
   @OriginalMember(
      owner = "client!saa",
      name = "O",
      descriptor = "I"
   )
   public static int field4686;
   @OriginalMember(
      owner = "client!saa",
      name = "P",
      descriptor = "I"
   )
   private int field4688;
   @OriginalMember(
      owner = "client!saa",
      name = "H",
      descriptor = "I"
   )
   private int field4689;
   @OriginalMember(
      owner = "client!saa",
      name = "M",
      descriptor = "I"
   )
   public static int field4692;
   @OriginalMember(
      owner = "client!saa",
      name = "K",
      descriptor = "I"
   )
   public static int field4694;
   @OriginalMember(
      owner = "client!saa",
      name = "J",
      descriptor = "I"
   )
   public static int field4695;
   @OriginalMember(
      owner = "client!saa",
      name = "N",
      descriptor = "Lru;"
   )
   public static class206 field4690;
   @OriginalMember(
      owner = "client!saa",
      name = "G",
      descriptor = "Lwe;"
   )
   public static class431 field4693;

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "(I)V",
      line = 5
   )
   private class347(int arg0) {
      super(0, false);

      try {
         this.method2537((byte)94, arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4696[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "()V",
      line = 18
   )
   public class347() {
      this(0);
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(BI)V",
      line = 23
   )
   private final void method2537(byte arg0, int arg1) {
      try {
         this.field4689 = arg1 << 4 & 4080;
         this.field4688 = (65280 & arg1) >> 4;
         ++field4692;
         if (arg0 <= 41) {
            method2538(17);
         }

         this.field4685 = (arg1 & 16711680) >> 12;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4696[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IB)[[I",
      line = 36
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field4694;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            this.field4685 = 106;
         }

         if (super.field3634.field8828) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || ~class430.field6152 < ~var8) {
               do {
                  var5[var8] = this.field4685;
                  var6[var8] = this.field4688;
                  var7[var8] = this.field4689;
                  ++var8;
               } while(~class430.field6152 < ~var8);
            }
         }

         return var4;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4696[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 78
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (arg2 < 49) {
            method2538(4);
         }

         ++field4695;
         if (~arg0 == -1) {
            this.method2537((byte)73, arg1.method1166((byte)-117));
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4696[1] + arg0 + ',' + (arg1 != null ? field4696[2] : field4696[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "d",
      descriptor = "(I)V",
      line = 106
   )
   public static void method2538(int arg0) {
      try {
         field4687 = null;
         field4690 = null;
         if (arg0 == -27200) {
            field4693 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4696[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2539(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2540(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
