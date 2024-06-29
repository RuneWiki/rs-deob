import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class410 {
   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5653 = new String[]{method3222(method3221("\u0017\u0013qo\u0011")), method3222(method3221("\u0017\u0013qh\u0011")), method3222(method3221("\u0017\u0013qj\u0011"))};
   @OriginalMember(
      owner = "client!eg",
      name = "f",
      descriptor = "I"
   )
   public static int field5647;
   @OriginalMember(
      owner = "client!eg",
      name = "e",
      descriptor = "I"
   )
   public static int field5648;
   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "I"
   )
   public static int field5649;
   @OriginalMember(
      owner = "client!eg",
      name = "d",
      descriptor = "I"
   )
   public static int field5650;
   @OriginalMember(
      owner = "client!eg",
      name = "c",
      descriptor = "I"
   )
   public static int field5651;
   @OriginalMember(
      owner = "client!eg",
      name = "b",
      descriptor = "I"
   )
   public static int field5652;

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(IIZII)V"
   )
   public static final void method3217(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field5648;
         if (class792.method5717((byte)-108, arg0)) {
            class391.method3092(-28853, arg4, arg2, arg3, class419.field5722[arg0], arg1);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5653[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method3218(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            method3218(-65, true, -42);
         }

         ++field5649;
         return ~(50560 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5653[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3219(int arg0) {
      try {
         if (arg0 > -76) {
            method3219(100);
         }

         class754.field11042 = 0;
         class712.field10454 = 0;
         class737.field10781 = 0;
         class606.field8968 = 0;
         ++field5651;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5653[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eg",
      name = "a",
      descriptor = "([Lnl;II)V"
   )
   public static final void method3220(class713[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class713 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field10460;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field10460 > (var7 & 1) + var6) {
               class713 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method3220(arg0, arg1, var4 - 1);
         method3220(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3221(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3222(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
