import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class449 extends class493 {
   @OriginalMember(
      owner = "client!sf",
      name = "i",
      descriptor = "I"
   )
   private int field6087;
   @OriginalMember(
      owner = "client!sf",
      name = "m",
      descriptor = "I"
   )
   private int field6089;
   @OriginalMember(
      owner = "client!sf",
      name = "p",
      descriptor = "I"
   )
   private int field6084;
   @OriginalMember(
      owner = "client!sf",
      name = "l",
      descriptor = "I"
   )
   private int field6083;
   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6094 = new String[]{method3447(method3446("\u007f<\u0016kj")), method3447(method3446("\u007f<\u0016dj")), method3447(method3446("\u007f<\u0016mj")), method3447(method3446("\u007f<\u0016\u0010+b3L\u0012j")), method3447(method3446("\u007f<\u0016oj")), method3447(method3446("\u007f<\u0016ij")), method3447(method3446("\u007f<\u0016jj"))};
   @OriginalMember(
      owner = "client!sf",
      name = "h",
      descriptor = "Lse;"
   )
   public static class6 field6091 = new class6(76, -1);
   @OriginalMember(
      owner = "client!sf",
      name = "k",
      descriptor = "I"
   )
   public static int field6085;
   @OriginalMember(
      owner = "client!sf",
      name = "j",
      descriptor = "I"
   )
   public static int field6086;
   @OriginalMember(
      owner = "client!sf",
      name = "g",
      descriptor = "I"
   )
   public static int field6088;
   @OriginalMember(
      owner = "client!sf",
      name = "o",
      descriptor = "I"
   )
   public static int field6090;
   @OriginalMember(
      owner = "client!sf",
      name = "n",
      descriptor = "I"
   )
   public static int field6092;
   @OriginalMember(
      owner = "client!sf",
      name = "q",
      descriptor = "Lea;"
   )
   public static class21 field6093;

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method3443(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 110) {
            field6093 = null;
         }

         ++field6085;
         return ~(arg0 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6094[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3444(byte arg0) {
      try {
         if (arg0 <= 4) {
            field6093 = null;
         }

         ++field6090;
         class254.field3204.method3187(-23825);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6094[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field6087 = arg3;
         this.field6089 = arg1;
         this.field6084 = arg0;
         this.field6083 = arg2;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6094[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3445(int arg0) {
      try {
         field6091 = null;
         field6093 = null;
         if (arg0 != 2048) {
            method3443(16, -102, (byte)-44);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6094[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IZI)V"
   )
   public final void method2668(int arg0, boolean arg1, int arg2) {
      try {
         ++field6088;
         if (!arg1) {
            int var4 = this.field6084 * arg0 >> 12;
            int var5 = this.field6083 * arg0 >> 12;
            int var6 = this.field6089 * arg2 >> 12;
            int var7 = this.field6087 * arg2 >> 12;
            class582.method4349(0, var4, super.field6884, var7, super.field6886, var6, super.field6887, var5);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6094[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2671(int arg0, int arg1, int arg2) {
      try {
         ++field6086;
         if (arg1 == -2) {
            int var4 = this.field6084 * arg2 >> 12;
            int var5 = this.field6083 * arg2 >> 12;
            int var6 = this.field6089 * arg0 >> 12;
            int var7 = this.field6087 * arg0 >> 12;
            class276.method2178(var5, var6, arg1 + -18735, var7, var4, super.field6886);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6094[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method2673(int arg0, int arg1, boolean arg2) {
      try {
         ++field6092;
         if (!arg2) {
            this.field6083 = -12;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6094[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3446(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3447(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
