import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class576 extends class370 {
   @OriginalMember(
      owner = "client!cba",
      name = "w",
      descriptor = "I"
   )
   public int field8558;
   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "I"
   )
   public int field8560;
   @OriginalMember(
      owner = "client!cba",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8561 = new String[]{method4259(method4258("|\u001eTI}7")), method4259(method4258("|\u001eTI~7")), method4259(method4258("q\tY\u000b")), method4259(method4258("dR\u001bIB")), method4259(method4258("|\u001eTI\u0003v\u0012\\\u0013\u00017")), method4259(method4258("|\u001eTI|7"))};
   @OriginalMember(
      owner = "client!cba",
      name = "r",
      descriptor = "I"
   )
   public static int field8559 = -1;
   @OriginalMember(
      owner = "client!cba",
      name = "x",
      descriptor = "Z"
   )
   public static boolean field8555 = false;
   @OriginalMember(
      owner = "client!cba",
      name = "t",
      descriptor = "F"
   )
   public static float field8552;
   @OriginalMember(
      owner = "client!cba",
      name = "u",
      descriptor = "I"
   )
   public static int field8553;
   @OriginalMember(
      owner = "client!cba",
      name = "y",
      descriptor = "I"
   )
   public static int field8557;
   @OriginalMember(
      owner = "client!cba",
      name = "v",
      descriptor = "Lsg;"
   )
   public static class417 field8554;
   @OriginalMember(
      owner = "client!cba",
      name = "s",
      descriptor = "Lwe;"
   )
   public static class427 field8556;

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4256(int arg0, int arg1, int arg2) {
      try {
         ++field8557;
         if (arg2 < 59) {
            method4256(41, -87, 35);
         }

         return (2048 & arg1) != 0 && ~(55 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8561[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4257(int arg0) {
      try {
         field8554 = null;
         if (arg0 != 55) {
            method4257(-113);
         }

         field8556 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8561[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(I)Loi;"
   )
   public final class79 method1311(int arg0) {
      try {
         if (arg0 > -106) {
            field8559 = -111;
         }

         ++field8553;
         return class33.field367;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8561[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "<init>",
      descriptor = "(Lwm;Lvh;IIIIIIIIII)V"
   )
   public class576(class590 arg0, class378 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field8558 = arg11;
         this.field8560 = arg10;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8561[4] + (arg0 != null ? field8561[3] : field8561[2]) + ',' + (arg1 != null ? field8561[3] : field8561[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4258(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4259(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
