import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class368 implements class272 {
   @OriginalMember(
      owner = "client!ik",
      name = "f",
      descriptor = "Lrr;"
   )
   private class678 field5726;
   @OriginalMember(
      owner = "client!ik",
      name = "e",
      descriptor = "Lrr;"
   )
   private class678 field5725;
   @OriginalMember(
      owner = "client!ik",
      name = "g",
      descriptor = "Lej;"
   )
   private class665 field5719;
   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5730 = new String[]{method3018(method3017("T$\tj\u007f")), method3018(method3017("T$\tm\u007f")), method3018(method3017("T$\ti\u007f")), method3018(method3017("T$\t\u0017>S&S\u0015\u007f")), method3018(method3017("S:KG")), method3018(method3017("Fa\t\u0005*")), method3018(method3017("T$\tn\u007f")), method3018(method3017("T$\th\u007f")), method3018(method3017("T$\to\u007f"))};
   @OriginalMember(
      owner = "client!ik",
      name = "d",
      descriptor = "I"
   )
   public static int field5724 = 0;
   @OriginalMember(
      owner = "client!ik",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field5729 = new int[200];
   @OriginalMember(
      owner = "client!ik",
      name = "i",
      descriptor = "I"
   )
   public static int field5720;
   @OriginalMember(
      owner = "client!ik",
      name = "h",
      descriptor = "I"
   )
   public static int field5722;
   @OriginalMember(
      owner = "client!ik",
      name = "k",
      descriptor = "I"
   )
   public static int field5723;
   @OriginalMember(
      owner = "client!ik",
      name = "c",
      descriptor = "I"
   )
   public static int field5727;
   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "I"
   )
   public static int field5728;
   @OriginalMember(
      owner = "client!ik",
      name = "b",
      descriptor = "Lda;"
   )
   private class288 field5721;

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method3014(int arg0, boolean arg1) {
      try {
         class751.field11131 = arg0;
         if (!arg1) {
            ++field5722;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field5730[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method282(byte arg0) {
      try {
         ++field5728;
         class697 var2 = class227.method1961((byte)-96, this.field5719.field9963, this.field5726);
         this.field5721 = class351.field5356.method598(var2, class776.method5643(this.field5725, this.field5719.field9963), true);
         if (arg0 <= 98) {
            method3015(-79, (byte)69, -55);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5730[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method3015(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 < 80) {
            method3016(-45);
         }

         ++field5723;
         return (2048 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5730[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3016(int arg0) {
      try {
         field5729 = null;
         if (arg0 != 18581) {
            method3014(37, true);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5730[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method284(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            if (arg1) {
               int var3 = this.field5719.field9949.method5105(126, class154.field2293, this.field5719.field9955) - -this.field5719.field9951;
               int var4 = this.field5719.field9967.method5508(100, class445.field6835, this.field5719.field9950) - -this.field5719.field9960;
               this.field5721.method2408(this.field5719.field9959, this.field5719.field9955, var4, (int[])null, this.field5719.field9953, var3, 0, (class96)null, this.field5719.field9954, this.field5719.field9965, this.field5719.field9950, this.field5719.field9956, 0, -27121, this.field5719.field9952, (class672[])null);
            }

            ++field5727;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5730[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Lej;)V"
   )
   public class368(class678 arg0, class678 arg1, class665 arg2) {
      try {
         this.field5726 = arg1;
         this.field5725 = arg0;
         this.field5719 = arg2;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5730[3] + (arg0 != null ? field5730[5] : field5730[4]) + ',' + (arg1 != null ? field5730[5] : field5730[4]) + ',' + (arg2 != null ? field5730[5] : field5730[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method285(byte arg0) {
      try {
         ++field5720;
         boolean var2 = true;
         if (arg0 != 8) {
            this.method285((byte)-108);
         }

         if (!this.field5725.method5002(this.field5719.field9963, (byte)118)) {
            var2 = false;
         }

         if (!this.field5726.method5002(this.field5719.field9963, (byte)89)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5730[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3017(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ik",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3018(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
