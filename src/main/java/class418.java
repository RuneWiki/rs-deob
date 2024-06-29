import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class418 extends class500 {
   @OriginalMember(
      owner = "client!wj",
      name = "k",
      descriptor = "I"
   )
   public int field5875;
   @OriginalMember(
      owner = "client!wj",
      name = "r",
      descriptor = "I"
   )
   public int field5871;
   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5876 = new String[]{method3169(method3168("ry;h$")), method3169(method3168("ry;f$")), method3169(method3168("ry;o$")), method3169(method3168("ry;j$")), method3169(method3168("ry;g$")), method3169(method3168("ry;k$")), method3169(method3168("ry;\u0012ekza\u0010$")), method3169(method3168("ry;m$")), method3169(method3168("ry;i$")), method3169(method3168("ry;l$"))};
   @OriginalMember(
      owner = "client!wj",
      name = "p",
      descriptor = "I"
   )
   public static int field5865;
   @OriginalMember(
      owner = "client!wj",
      name = "q",
      descriptor = "I"
   )
   public static int field5866;
   @OriginalMember(
      owner = "client!wj",
      name = "j",
      descriptor = "I"
   )
   public static int field5867;
   @OriginalMember(
      owner = "client!wj",
      name = "s",
      descriptor = "I"
   )
   public static int field5868;
   @OriginalMember(
      owner = "client!wj",
      name = "n",
      descriptor = "I"
   )
   public static int field5869;
   @OriginalMember(
      owner = "client!wj",
      name = "t",
      descriptor = "I"
   )
   public static int field5870;
   @OriginalMember(
      owner = "client!wj",
      name = "m",
      descriptor = "I"
   )
   public static int field5872;
   @OriginalMember(
      owner = "client!wj",
      name = "o",
      descriptor = "I"
   )
   public static int field5873;
   @OriginalMember(
      owner = "client!wj",
      name = "l",
      descriptor = "I"
   )
   public static int field5874;

   @OriginalMember(
      owner = "client!wj",
      name = "f",
      descriptor = "(I)Z"
   )
   public final boolean method3159(int arg0) {
      try {
         ++field5874;
         if (arg0 != -1) {
            this.method3162((byte)64, -12);
         }

         return (1 & this.field5875 >> 22) != 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5876[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3160(int arg0) {
      try {
         ++field5867;
         if (arg0 != -26038) {
            this.method3162((byte)-71, -113);
         }

         return class791.method5702(this.field5875, 88);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5876[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3161(int arg0, byte arg1) {
      try {
         ++field5869;
         if (class202.field2481 == null || ~class202.field2481.length > ~arg0) {
            class202.field2481 = new int[arg0];
         }

         int var2 = 31 % ((-8 - arg1) / 55);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5876[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(BI)Z"
   )
   public final boolean method3162(byte arg0, int arg1) {
      try {
         ++field5865;
         if (arg0 <= 68) {
            this.method3167((byte)-93);
         }

         return (1 & this.field5875 >> arg1 + 1) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5876[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method3163(boolean arg0) {
      try {
         if (!arg0) {
            return 82;
         } else {
            ++field5873;
            return this.field5875 >> 18 & 7;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5876[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method3164(int arg0) {
      try {
         if (arg0 != -1) {
            this.method3164(101);
         }

         ++field5870;
         return ~(this.field5875 & 1) != -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5876[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3165(int arg0, int arg1, byte arg2) {
      try {
         ++field5868;
         return arg2 != 52;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5876[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method3166(int arg0) {
      try {
         ++field5866;
         int var1 = class282.field3764.method3187((byte)108);
         if (~(class378.field5302.length + -1) < ~var1) {
            class282.field3764 = class378.field5302[var1 + 1];
         }

         return arg0 != 1 ? 19 : 100;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5876[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3167(byte arg0) {
      try {
         int var2 = 22 % ((-18 - arg0) / 48);
         ++field5872;
         return ~((this.field5875 & 2623397) >> 21) != -1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5876[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class418(int arg0, int arg1) {
      try {
         this.field5875 = arg0;
         this.field5871 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5876[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3168(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3169(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
