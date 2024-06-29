import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class675 extends class207 {
   @OriginalMember(
      owner = "client!bl",
      name = "s",
      descriptor = "I"
   )
   private int field10141 = -1;
   @OriginalMember(
      owner = "client!bl",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10148 = new String[]{method4930(method4929("`Z;'T")), method4930(method4929("`Z;!T")), method4930(method4929("lCy\u000e")), method4930(method4929("y\u0018;L\u0001")), method4930(method4929("`Z; T")), method4930(method4929("`Z;&T")), method4930(method4929("`Z;$T")), method4930(method4929("`Z;#T"))};
   @OriginalMember(
      owner = "client!bl",
      name = "x",
      descriptor = "Lsd;"
   )
   public static class101 field10140 = new class101(124, 6);
   @OriginalMember(
      owner = "client!bl",
      name = "p",
      descriptor = "Loi;"
   )
   public static class79 field10143 = new class79(3, 2);
   @OriginalMember(
      owner = "client!bl",
      name = "o",
      descriptor = "I"
   )
   private int field10134;
   @OriginalMember(
      owner = "client!bl",
      name = "A",
      descriptor = "I"
   )
   public static int field10135;
   @OriginalMember(
      owner = "client!bl",
      name = "w",
      descriptor = "I"
   )
   public static int field10136;
   @OriginalMember(
      owner = "client!bl",
      name = "v",
      descriptor = "I"
   )
   public static int field10137;
   @OriginalMember(
      owner = "client!bl",
      name = "q",
      descriptor = "I"
   )
   private int field10138;
   @OriginalMember(
      owner = "client!bl",
      name = "t",
      descriptor = "I"
   )
   public static int field10139;
   @OriginalMember(
      owner = "client!bl",
      name = "r",
      descriptor = "I"
   )
   public static int field10142;
   @OriginalMember(
      owner = "client!bl",
      name = "y",
      descriptor = "I"
   )
   private int field10145;
   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "I"
   )
   public static int field10146;
   @OriginalMember(
      owner = "client!bl",
      name = "n",
      descriptor = "I"
   )
   public static int field10147;
   @OriginalMember(
      owner = "client!bl",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10144;

   @OriginalMember(
      owner = "client!bl",
      name = "b",
      descriptor = "(Z)I"
   )
   public static final int method4925(boolean arg0) {
      try {
         if (arg0) {
            field10135 = -22;
         }

         ++field10137;
         return class26.field276++;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10148[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.method1817(this.field10141, this.field10134, this.field10145, this.field10138, 1);
         if (!arg1) {
            field10135 = 115;
         }

         ++field10146;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10148[4] + (arg0 != null ? field10148[3] : field10148[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method4926(int arg0, int arg1) {
      try {
         if (arg1 > -33) {
            field10144 = null;
         }

         ++field10136;
         return arg0 & 255;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10148[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         this.field10141 = arg0.method1038((byte)-112);
         ++field10147;
         this.field10138 = arg0.method1041(4758);
         this.field10134 = arg0.method1104(255);
         if (arg1) {
            this.field10145 = arg0.method1104(255);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10148[7] + (arg0 != null ? field10148[3] : field10148[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4927(boolean arg0) {
      try {
         if (!arg0) {
            method4925(true);
         }

         field10143 = null;
         field10144 = null;
         field10140 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10148[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method4928(int arg0, byte arg1, int arg2) {
      try {
         int var3 = -46 / ((arg1 - 17) / 40);
         ++field10139;
         return ~arg2 != -2 && arg2 != 3 ? class678.field10205[3 & arg0] : class346.field5268[3 & arg0];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10148[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
