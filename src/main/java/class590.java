import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class590 extends class730 {
   @OriginalMember(
      owner = "client!cn",
      name = "o",
      descriptor = "I"
   )
   private int field8694;
   @OriginalMember(
      owner = "client!cn",
      name = "m",
      descriptor = "I"
   )
   private int field8697;
   @OriginalMember(
      owner = "client!cn",
      name = "p",
      descriptor = "I"
   )
   private int field8699;
   @OriginalMember(
      owner = "client!cn",
      name = "r",
      descriptor = "I"
   )
   private int field8701;
   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8702 = new String[]{method4402(method4401("\u001f\u000ehC8")), method4402(method4401("\u001f\u000ehE8")), method4402(method4401("\u001f\u000ehD8")), method4402(method4401("\u001f\u000ehF8")), method4402(method4401("\u001f\u000eh;y\u0012\t298"))};
   @OriginalMember(
      owner = "client!cn",
      name = "s",
      descriptor = "I"
   )
   public static int field8700 = 0;
   @OriginalMember(
      owner = "client!cn",
      name = "n",
      descriptor = "I"
   )
   public static int field8693;
   @OriginalMember(
      owner = "client!cn",
      name = "u",
      descriptor = "I"
   )
   public static int field8695;
   @OriginalMember(
      owner = "client!cn",
      name = "q",
      descriptor = "I"
   )
   public static int field8698;
   @OriginalMember(
      owner = "client!cn",
      name = "t",
      descriptor = "[[[I"
   )
   public static int[][][] field8696;

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method2081(boolean arg0, int arg1, int arg2) {
      try {
         ++field8698;
         int var4 = this.field8694 * arg2 >> 12;
         int var5 = this.field8699 * arg2 >> 12;
         int var6 = this.field8697 * arg1 >> 12;
         int var7 = this.field8701 * arg1 >> 12;
         if (!arg0) {
            this.method2083(-125, -7, -62);
         }

         class744.method5470(var7, var5, (byte)60, super.field10892, var4, var6);
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8702[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method2083(int arg0, int arg1, int arg2) {
      try {
         int var4 = -58 / ((arg1 - -13) / 40);
         ++field8695;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8702[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field8694 = arg0;
         this.field8697 = arg1;
         this.field8699 = arg2;
         this.field8701 = arg3;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8702[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4400(byte arg0) {
      try {
         field8696 = null;
         if (arg0 != -14) {
            method4400((byte)69);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8702[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2080(int arg0, int arg1, int arg2) {
      try {
         ++field8693;
         int var4 = this.field8694 * arg1 >> 12;
         int var5 = this.field8699 * arg1 >> 12;
         int var6 = this.field8697 * arg0 >> 12;
         if (arg2 == 19856) {
            int var7 = this.field8701 * arg0 >> 12;
            class697.method5122(var5, super.field10892, -115, var4, super.field10896, var7, super.field10899, var6);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8702[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4401(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4402(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
