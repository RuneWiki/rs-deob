import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public abstract class class403 extends class713 {
   @OriginalMember(
      owner = "client!lka",
      name = "v",
      descriptor = "S"
   )
   public short field5535;
   @OriginalMember(
      owner = "client!lka",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5542 = new String[]{method3164(method3163("iA\u001e fD\u0002")), method3164(method3163("iA\u001e }-")), method3164(method3163("iA\u001e iD\u0002")), method3164(method3163("~\u0004Q S")), method3164(method3163("iA\u001e hD\u0002")), method3164(method3163("k_\u0013b")), method3164(method3163("iA\u001e gD\u0002")), method3164(method3163("iA\u001e dD\u0002")), method3164(method3163("iA\u001e \u0012lD\u0016z\u0010-")), method3164(method3163("iA\u001e kD\u0002")), method3164(method3163("MC\u001bjKk\u0007\n}K"))};
   @OriginalMember(
      owner = "client!lka",
      name = "D",
      descriptor = "Laka;"
   )
   public static class418 field5536 = new class418(88, -1);
   @OriginalMember(
      owner = "client!lka",
      name = "x",
      descriptor = "B"
   )
   public static byte field5540;
   @OriginalMember(
      owner = "client!lka",
      name = "y",
      descriptor = "I"
   )
   public static int field5531;
   @OriginalMember(
      owner = "client!lka",
      name = "w",
      descriptor = "I"
   )
   public static int field5533;
   @OriginalMember(
      owner = "client!lka",
      name = "u",
      descriptor = "I"
   )
   public static int field5534;
   @OriginalMember(
      owner = "client!lka",
      name = "E",
      descriptor = "I"
   )
   public static int field5538;
   @OriginalMember(
      owner = "client!lka",
      name = "B",
      descriptor = "I"
   )
   public static int field5539;
   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "I"
   )
   public static int field5541;
   @OriginalMember(
      owner = "client!lka",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field5532;
   @OriginalMember(
      owner = "client!lka",
      name = "C",
      descriptor = "[Ljca;"
   )
   public static class656[] field5537;

   @OriginalMember(
      owner = "client!lka",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method244(boolean arg0) {
      try {
         ++field5531;
         if (arg0) {
            method3161(-56);
         }

         return class276.field3516[(super.field10467 >> class783.field11447) + class106.field1403 + -class699.field10231][(super.field10468 >> class783.field11447) - class664.field9833 + class106.field1403];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5542[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(ILoca;)Ljava/lang/String;"
   )
   public static final String method3159(int arg0, class642 arg1) {
      try {
         ++field5533;
         if (~client.method999(arg1).method5275(4004219) == arg0) {
            return null;
         } else if (arg1.field9567 != null && ~arg1.field9567.trim().length() != -1) {
            return arg1.field9567;
         } else {
            return class497.field6955 ? field5542[10] : null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5542[9] + arg0 + ',' + (arg1 != null ? field5542[3] : field5542[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method3160(int arg0) {
      try {
         ++field5541;
         if (arg0 <= 66) {
            field5536 = null;
         }

         class91.field1238 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5542[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method242(int arg0, class479 arg1) {
      try {
         if (arg0 != -5) {
            field5537 = null;
         }

         ++field5539;
         return class725.method5252(super.field10468 >> class783.field11447, super.field10459, super.field10467 >> class783.field11447, -1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5542[6] + arg0 + ',' + (arg1 != null ? field5542[3] : field5542[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3161(int arg0) {
      try {
         if (arg0 != -1) {
            method3160(-125);
         }

         field5536 = null;
         field5532 = null;
         field5537 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5542[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(I[Lue;)I"
   )
   public final int method240(int arg0, class243[] arg1) {
      try {
         ++field5538;
         return arg0 != 1 ? 97 : this.method5206(super.field10467 >> class783.field11447, super.field10468 >> class783.field11447, arg1, (byte)56);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5542[4] + arg0 + ',' + (arg1 != null ? field5542[3] : field5542[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "f",
      descriptor = "(B)Ltk;"
   )
   public static final class111 method3162(byte arg0) {
      try {
         ++field5534;
         if (class586.field8649 < class426.field5795.length) {
            return class426.field5795[class586.field8649++];
         } else {
            if (arg0 != 5) {
               field5536 = null;
            }

            return null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5542[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field10457 = (byte)arg3;
         super.field10467 = arg0;
         this.field5535 = (short)arg5;
         super.field10468 = arg2;
         super.field10459 = (byte)arg4;
         super.field10466 = arg1;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5542[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3163(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3164(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
