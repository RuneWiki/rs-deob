import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class185 extends class588 {
   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2810 = new String[]{method1627(method1626(":A\u0004m\u0010s")), method1627(method1626("5V\t/")), method1627(method1626(":A\u0004m\u001bs")), method1627(method1626(" \rKm.")), method1627(method1626(":A\u0004m\u0012s")), method1627(method1626(":A\u0004m\u0011s"))};
   @OriginalMember(
      owner = "client!aba",
      name = "y",
      descriptor = "S"
   )
   public static short field2807 = 1;
   @OriginalMember(
      owner = "client!aba",
      name = "u",
      descriptor = "Lega;"
   )
   public static class738 field2801 = new class738();
   @OriginalMember(
      owner = "client!aba",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field2809 = false;
   @OriginalMember(
      owner = "client!aba",
      name = "x",
      descriptor = "I"
   )
   private int field2800;
   @OriginalMember(
      owner = "client!aba",
      name = "t",
      descriptor = "I"
   )
   public static int field2802;
   @OriginalMember(
      owner = "client!aba",
      name = "p",
      descriptor = "I"
   )
   public static int field2803;
   @OriginalMember(
      owner = "client!aba",
      name = "r",
      descriptor = "I"
   )
   private int field2804;
   @OriginalMember(
      owner = "client!aba",
      name = "s",
      descriptor = "I"
   )
   private int field2805;
   @OriginalMember(
      owner = "client!aba",
      name = "w",
      descriptor = "I"
   )
   public static int field2806;
   @OriginalMember(
      owner = "client!aba",
      name = "v",
      descriptor = "I"
   )
   private int field2808;

   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method1624(int arg0) {
      try {
         if (class536.method4018(true)) {
            if (class745.field10758 == null) {
               class373.method2918((byte)72);
            }

            class527.field7681 = true;
            class114.field1843 = 0;
         }

         ++field2803;
         if (arg0 < 51) {
            method1625(-2);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2810[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(I)V",
      line = 30
   )
   public static void method1625(int arg0) {
      try {
         if (arg0 == 11) {
            field2801 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2810[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 41
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field2804 = arg1.method3567(31871);
         ++field2802;
         this.field2805 = arg1.method3567(31871);
         int var3 = -63 / ((-26 - arg0) / 33);
         this.field2808 = arg1.method3564((byte)-100);
         this.field2800 = arg1.method3564((byte)-121);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2810[2] + arg0 + ',' + (arg1 != null ? field2810[3] : field2810[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(Lwga;I)V",
      line = 62
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.method5614(this.field2808, -20600, this.field2804, this.field2800, this.field2805);
         if (arg1 < -120) {
            ++field2806;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2810[5] + (arg0 != null ? field2810[3] : field2810[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1626(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1627(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
