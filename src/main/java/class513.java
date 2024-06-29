import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class513 {
   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "Z"
   )
   public boolean field7276;
   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7288 = new String[]{method3867(method3866(":\u0007\u0019690\u001eC4x")), method3867(method3866(":\u0007\u0019Hx")), method3867(method3866(":\u0007\u0019Ix")), method3867(method3866(":\u0007\u0019Kx")), method3867(method3866(":\u0007\u0019Nx"))};
   @OriginalMember(
      owner = "client!dp",
      name = "j",
      descriptor = "I"
   )
   public static int field7284 = 0;
   @OriginalMember(
      owner = "client!dp",
      name = "f",
      descriptor = "Lfm;"
   )
   public static class164 field7281 = new class164(55, 7);
   @OriginalMember(
      owner = "client!dp",
      name = "g",
      descriptor = "Liw;"
   )
   public static class107 field7286 = new class107(8);
   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "Lhha;"
   )
   public static class724 field7287 = new class724(58, 6);
   @OriginalMember(
      owner = "client!dp",
      name = "e",
      descriptor = "I"
   )
   public static int field7277;
   @OriginalMember(
      owner = "client!dp",
      name = "h",
      descriptor = "I"
   )
   public static int field7280;
   @OriginalMember(
      owner = "client!dp",
      name = "k",
      descriptor = "I"
   )
   public static int field7282;
   @OriginalMember(
      owner = "client!dp",
      name = "i",
      descriptor = "Lha;"
   )
   public static class17 field7285;
   @OriginalMember(
      owner = "client!dp",
      name = "l",
      descriptor = "Lida;"
   )
   public class99 field7278;
   @OriginalMember(
      owner = "client!dp",
      name = "d",
      descriptor = "Lida;"
   )
   public class99 field7283;
   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "Z"
   )
   public boolean field7279;

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method3862(boolean arg0) {
      try {
         ++field7282;
         if (arg0) {
            return true;
         } else {
            return this.field7279 && !this.field7276;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7288[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method3863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         label35: {
            if (~class729.field10384 < ~arg2 || ~arg1 < ~class604.field8618 || ~class587.field8239 < ~arg5 || arg3 > class767.field11011) {
               class19.method271(arg0, arg4, arg1, arg7, 125, arg3, arg2, arg5);
               if (!client.field10022) {
                  break label35;
               }
            }

            class561.method4179(arg0, arg2, arg3, arg5, false, arg7, arg1, arg4);
         }

         ++field7280;
         if (arg6 > -8) {
            method3863(118, 74, 81, 24, 7, -124, -35, 96);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7288[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3864(int arg0) {
      try {
         ++field7277;
         if (arg0 != 8) {
            this.method3862(true);
         }

         if (this.field7283 != null) {
            this.field7283.method358(true);
         }

         this.field7279 = false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7288[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3865(byte arg0) {
      try {
         field7286 = null;
         field7287 = null;
         field7281 = null;
         field7285 = null;
         if (arg0 <= 75) {
            field7286 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7288[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class513(boolean arg0) {
      try {
         this.field7276 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7288[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3866(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3867(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
