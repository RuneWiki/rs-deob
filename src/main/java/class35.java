import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class35 extends class618 {
   @OriginalMember(
      owner = "client!tfa",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field400 = new String[]{method274(method273("\u001f2ne")), method274(method273("\ni,'\u0015")), method274(method273("\u0005!c'*Y")), method274(method273("\u0005!c')Y")), method274(method273("\u0005!c'+Y"))};
   @OriginalMember(
      owner = "client!tfa",
      name = "R",
      descriptor = "Lnw;"
   )
   public static class616 field396 = new class616(77, 3);
   @OriginalMember(
      owner = "client!tfa",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field399 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!tfa",
      name = "S",
      descriptor = "I"
   )
   public static int field397;
   @OriginalMember(
      owner = "client!tfa",
      name = "N",
      descriptor = "I"
   )
   public static int field398;

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method270(byte arg0, String arg1) {
      try {
         if (arg0 != 84) {
            return 105;
         } else {
            ++field397;
            return arg1.length() - -2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field400[3] + arg0 + ',' + (arg1 != null ? field400[1] : field400[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method271(int arg0) {
      try {
         field399 = null;
         field396 = null;
         if (arg0 < 53) {
            method270((byte)5, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field400[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(ILme;)V"
   )
   public static final void method272(int param0, class206 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method273(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method274(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
