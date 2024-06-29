import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class448 extends class673 {
   @OriginalMember(
      owner = "client!wm",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6082 = new String[]{method3442(method3441("X\u0014F=f")), method3442(method3441("X\u0014F?f"))};
   @OriginalMember(
      owner = "client!wm",
      name = "o",
      descriptor = "I"
   )
   public int field6058;
   @OriginalMember(
      owner = "client!wm",
      name = "n",
      descriptor = "I"
   )
   public int field6059;
   @OriginalMember(
      owner = "client!wm",
      name = "G",
      descriptor = "I"
   )
   public int field6060;
   @OriginalMember(
      owner = "client!wm",
      name = "w",
      descriptor = "I"
   )
   public int field6064;
   @OriginalMember(
      owner = "client!wm",
      name = "p",
      descriptor = "I"
   )
   public int field6065;
   @OriginalMember(
      owner = "client!wm",
      name = "J",
      descriptor = "I"
   )
   public int field6066;
   @OriginalMember(
      owner = "client!wm",
      name = "t",
      descriptor = "I"
   )
   public static int field6067;
   @OriginalMember(
      owner = "client!wm",
      name = "A",
      descriptor = "I"
   )
   public int field6068;
   @OriginalMember(
      owner = "client!wm",
      name = "y",
      descriptor = "I"
   )
   public int field6071;
   @OriginalMember(
      owner = "client!wm",
      name = "B",
      descriptor = "I"
   )
   public int field6073;
   @OriginalMember(
      owner = "client!wm",
      name = "F",
      descriptor = "I"
   )
   public int field6074;
   @OriginalMember(
      owner = "client!wm",
      name = "H",
      descriptor = "I"
   )
   public int field6075;
   @OriginalMember(
      owner = "client!wm",
      name = "r",
      descriptor = "I"
   )
   public int field6076;
   @OriginalMember(
      owner = "client!wm",
      name = "m",
      descriptor = "I"
   )
   public int field6077;
   @OriginalMember(
      owner = "client!wm",
      name = "q",
      descriptor = "I"
   )
   public int field6078;
   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "I"
   )
   public int field6079;
   @OriginalMember(
      owner = "client!wm",
      name = "v",
      descriptor = "I"
   )
   public int field6080;
   @OriginalMember(
      owner = "client!wm",
      name = "s",
      descriptor = "I"
   )
   public int field6081;
   @OriginalMember(
      owner = "client!wm",
      name = "u",
      descriptor = "J"
   )
   public static long field6062;
   @OriginalMember(
      owner = "client!wm",
      name = "C",
      descriptor = "Lwd;"
   )
   public class180 field6072;
   @OriginalMember(
      owner = "client!wm",
      name = "l",
      descriptor = "Lbja;"
   )
   public class251 field6061;
   @OriginalMember(
      owner = "client!wm",
      name = "I",
      descriptor = "Lra;"
   )
   public class402 field6063;
   @OriginalMember(
      owner = "client!wm",
      name = "x",
      descriptor = "Lgb;"
   )
   public class521 field6069;
   @OriginalMember(
      owner = "client!wm",
      name = "D",
      descriptor = "Lce;"
   )
   public static class591 field6070;

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3438(int arg0) {
      try {
         this.field6063 = null;
         if (arg0 > -103) {
            this.method3438(-50);
         }

         ++field6067;
         this.field6072 = null;
         this.field6061 = null;
         this.field6069 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6082[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3439(byte arg0) {
      try {
         field6070 = null;
         if (arg0 > -90) {
            method3439((byte)68);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6082[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "a",
      descriptor = "(Lnl;ZZ)V"
   )
   public static final void method3440(class713 arg0, boolean arg1, boolean arg2) {
      arg0.field10463 = arg2;
      if (class203.field2588) {
         if (arg1) {
            class700.field10259[class700.field10259.length - 1].method1692((byte)-77, arg0);
         } else {
            int var3 = class49.method363(arg0.field10465);
            int var4 = class653.field9757[2] * arg0.method74(true) / arg0.field10460;
            int var5 = class49.method363(arg0.field10465 - var4);
            int var6 = class49.method363(arg0.field10465 + var4);
            if (var5 == var6) {
               class700.field10259[var3].method1692((byte)-7, arg0);
            } else if (var6 - var5 == 1) {
               class700.field10259[class385.field5335 + var5].method1692((byte)-64, arg0);
            } else {
               class700.field10259[class700.field10259.length - 1].method1692((byte)-52, arg0);
            }
         }
      } else {
         class782.method5644(arg0, class460.field6316);
      }
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3442(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
