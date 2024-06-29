import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class371 extends class207 {
   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5655 = new String[]{method2889(method2888("\u0005k\u0006!\u0018")), method2889(method2888("\u0019|D\f")), method2889(method2888("\f'\u0006NM")), method2889(method2888("\u0005k\u0006$\u0018")), method2889(method2888("\u0005k\u0006#\u0018")), method2889(method2888("\u0005k\u0006\"\u0018"))};
   @OriginalMember(
      owner = "client!rb",
      name = "q",
      descriptor = "I"
   )
   public static int field5649;
   @OriginalMember(
      owner = "client!rb",
      name = "n",
      descriptor = "I"
   )
   public static int field5650;
   @OriginalMember(
      owner = "client!rb",
      name = "o",
      descriptor = "I"
   )
   private int field5651;
   @OriginalMember(
      owner = "client!rb",
      name = "s",
      descriptor = "I"
   )
   public static int field5653;
   @OriginalMember(
      owner = "client!rb",
      name = "p",
      descriptor = "I"
   )
   public static int field5654;
   @OriginalMember(
      owner = "client!rb",
      name = "r",
      descriptor = "J"
   )
   private long field5652;

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.method1828(this.field5652, this.field5651, 3);
         ++field5654;
         if (!arg1) {
            method2885(-27, -57, 123);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5655[5] + (arg0 != null ? field5655[2] : field5655[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method791((class244)null, true);
         }

         this.field5651 = arg0.method1041(4758);
         ++field5653;
         this.field5652 = arg0.method1063(108);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5655[0] + (arg0 != null ? field5655[2] : field5655[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method2885(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      if (var3 != null) {
         class29.method205(var3.field919);
         if (var3.field919 != null) {
            var3.field919 = null;
         }

      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(ZIII)I"
   )
   public static final int method2886(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         int var4 = -37 / ((22 - arg1) / 56);
         ++field5650;
         class5 var5 = class289.method2200(arg3, 0, arg0);
         if (var5 == null) {
            return -1;
         } else {
            return ~arg2 <= -1 && ~var5.field88.length < ~arg2 ? var5.field88[arg2] : -1;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field5655[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "a",
      descriptor = "(BIII)V"
   )
   public static final void method2887(byte arg0, int arg1, int arg2, int arg3) {
      try {
         class65.field797 = new byte[arg3][arg2][arg1];
         if (arg0 != -96) {
            method2886(true, -27, 63, 60);
         }

         ++field5649;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5655[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2888(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2889(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
