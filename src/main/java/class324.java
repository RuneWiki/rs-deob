import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class324 extends class557 {
   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4829 = new String[]{method2608(method2607("\u000e;Ah1")), method2608(method2607("\u000e;Ak1")), method2608(method2607("\u000e;Ac1")), method2608(method2607("\u000e;Am1")), method2608(method2607("\u000e;Ao1")), method2608(method2607("\u000e;An1")), method2608(method2607("\u000e;Aj1"))};
   @OriginalMember(
      owner = "client!gs",
      name = "l",
      descriptor = "I"
   )
   public static int field4821 = 0;
   @OriginalMember(
      owner = "client!gs",
      name = "p",
      descriptor = "I"
   )
   public static int field4819;
   @OriginalMember(
      owner = "client!gs",
      name = "i",
      descriptor = "I"
   )
   public static int field4820;
   @OriginalMember(
      owner = "client!gs",
      name = "h",
      descriptor = "I"
   )
   public static int field4822;
   @OriginalMember(
      owner = "client!gs",
      name = "q",
      descriptor = "I"
   )
   public static int field4823;
   @OriginalMember(
      owner = "client!gs",
      name = "o",
      descriptor = "I"
   )
   public static int field4824;
   @OriginalMember(
      owner = "client!gs",
      name = "j",
      descriptor = "I"
   )
   public static int field4828;
   @OriginalMember(
      owner = "client!gs",
      name = "m",
      descriptor = "Lsa;"
   )
   public static class39 field4825;
   @OriginalMember(
      owner = "client!gs",
      name = "k",
      descriptor = "Lsa;"
   )
   public static class39 field4827;
   @OriginalMember(
      owner = "client!gs",
      name = "n",
      descriptor = "[[[Lhs;"
   )
   public static class312[][][] field4826;

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2604(boolean arg0) {
      try {
         field4826 = null;
         field4827 = null;
         if (arg0) {
            field4825 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4829[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (arg1) {
            ++field4819;
            super.field7905 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4829[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2605(int arg0) {
      try {
         if (arg0 > -52) {
            return 0;
         } else {
            ++field4823;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4829[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class324(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method2606(int arg0, byte arg1, int arg2) {
      try {
         ++field4820;
         int var3 = 86 % ((arg1 - 57) / 39);
         int var4 = arg0 >>> 24;
         int var5 = -var4 + 255;
         int var8 = ((arg0 & 65280) * var4 & 16711680 | (16711935 & arg0) * var4 & -16711936) >>> 8;
         return ((16711680 & (65280 & arg2) * var5 | (arg2 & 16711935) * var5 & -16711936) >>> 8) + var8;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4829[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field4824;
         if (arg0 != 1) {
            field4821 = -95;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4829[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field4822;
         if (arg0 != 0) {
            field4827 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4829[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 != -22) {
            this.method2605(-128);
         }

         if (~super.field7905 != -2 && super.field7905 != 0) {
            super.field7905 = this.method97(0);
         }

         ++field4828;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4829[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class324(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2608(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
