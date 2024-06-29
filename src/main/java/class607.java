import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class607 extends class493 {
   @OriginalMember(
      owner = "client!gk",
      name = "o",
      descriptor = "I"
   )
   private int field8976;
   @OriginalMember(
      owner = "client!gk",
      name = "j",
      descriptor = "I"
   )
   private int field8979;
   @OriginalMember(
      owner = "client!gk",
      name = "k",
      descriptor = "I"
   )
   private int field8972;
   @OriginalMember(
      owner = "client!gk",
      name = "g",
      descriptor = "I"
   )
   private int field8980;
   @OriginalMember(
      owner = "client!gk",
      name = "n",
      descriptor = "I"
   )
   private int field8973;
   @OriginalMember(
      owner = "client!gk",
      name = "p",
      descriptor = "I"
   )
   private int field8982;
   @OriginalMember(
      owner = "client!gk",
      name = "i",
      descriptor = "I"
   )
   private int field8971;
   @OriginalMember(
      owner = "client!gk",
      name = "q",
      descriptor = "I"
   )
   private int field8978;
   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8984 = new String[]{method4496(method4495("a-2;\u0005")), method4496(method4495("a-28\u0005")), method4496(method4495("a-2>\u0005")), method4496(method4495("a-2<\u0005")), method4496(method4495("a-2ADh/hC\u0005"))};
   @OriginalMember(
      owner = "client!gk",
      name = "r",
      descriptor = "Laka;"
   )
   public static class418 field8977 = new class418(56, 5);
   @OriginalMember(
      owner = "client!gk",
      name = "s",
      descriptor = "I"
   )
   public static int field8981 = -1;
   @OriginalMember(
      owner = "client!gk",
      name = "l",
      descriptor = "I"
   )
   public static int field8974;
   @OriginalMember(
      owner = "client!gk",
      name = "h",
      descriptor = "I"
   )
   public static int field8975;
   @OriginalMember(
      owner = "client!gk",
      name = "m",
      descriptor = "I"
   )
   public static int field8983;

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2671(int arg0, int arg1, int arg2) {
      try {
         ++field8974;
         if (arg1 != -2) {
            field8981 = -123;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8984[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method2673(int arg0, int arg1, boolean arg2) {
      try {
         ++field8983;
         int var4 = this.field8971 * arg0 >> 12;
         int var5 = this.field8972 * arg1 >> 12;
         if (arg2) {
            int var6 = this.field8980 * arg0 >> 12;
            int var7 = this.field8982 * arg1 >> 12;
            int var8 = this.field8973 * arg0 >> 12;
            int var9 = this.field8976 * arg1 >> 12;
            int var10 = this.field8979 * arg0 >> 12;
            int var11 = this.field8978 * arg1 >> 12;
            class432.method3347(var7, var4, var5, (byte)-26, var6, var9, var8, var10, var11, super.field6887);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field8984[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4494(int arg0) {
      try {
         field8977 = null;
         if (arg0 != -13623) {
            field8981 = -12;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8984[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method2668(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            this.method2673(-14, 56, false);
         }

         ++field8975;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8984[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field8976 = arg5;
         this.field8979 = arg6;
         this.field8972 = arg1;
         this.field8980 = arg2;
         this.field8973 = arg4;
         this.field8982 = arg3;
         this.field8971 = arg0;
         this.field8978 = arg7;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field8984[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4495(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4496(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
