import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class747 {
   @OriginalMember(
      owner = "client!qha",
      name = "f",
      descriptor = "I"
   )
   public int field10623;
   @OriginalMember(
      owner = "client!qha",
      name = "b",
      descriptor = "I"
   )
   public int field10616;
   @OriginalMember(
      owner = "client!qha",
      name = "e",
      descriptor = "I"
   )
   public int field10624;
   @OriginalMember(
      owner = "client!qha",
      name = "g",
      descriptor = "I"
   )
   public int field10618;
   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10625 = new String[]{method5381(method5380("<#b\u0012*e")), method5381(method5380("<#b\u0012/e")), method5381(method5380("<#b\u0012,e")), method5381(method5380("<#b\u0012R$%jHPe")), method5381(method5380("<#b\u0012-e"))};
   @OriginalMember(
      owner = "client!qha",
      name = "h",
      descriptor = "B"
   )
   public static byte field10622 = -6;
   @OriginalMember(
      owner = "client!qha",
      name = "c",
      descriptor = "I"
   )
   public static int field10619;
   @OriginalMember(
      owner = "client!qha",
      name = "i",
      descriptor = "I"
   )
   public static int field10620;
   @OriginalMember(
      owner = "client!qha",
      name = "d",
      descriptor = "I"
   )
   public static int field10621;
   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10617;

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(IIIIIBIII)V"
   )
   public static final void method5376(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
      try {
         class776.method5602(arg0, 0, arg6, arg1, arg3, (byte)96, arg7, arg2, arg8, arg4);
         ++field10621;
         if (arg5 != 116) {
            field10622 = -60;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10625[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class747(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10623 = arg0;
         this.field10616 = arg3;
         this.field10624 = arg1;
         this.field10618 = arg2;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field10625[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5377(boolean arg0) {
      try {
         if (arg0) {
            method5377(false);
         }

         field10617 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10625[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method5378(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10625[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(BI)Lqha;"
   )
   public final class747 method5379(byte arg0, int arg1) {
      try {
         if (arg0 != -25) {
            this.field10623 = -14;
         }

         ++field10619;
         return new class747(this.field10623, arg1, this.field10618, this.field10616);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10625[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5380(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5381(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
