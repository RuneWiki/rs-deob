import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class604 {
   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8621 = new String[]{method4456(method4455("<xzp.x")), method4456(method4455("<xzp-x")), method4456(method4455(">lw2")), method4456(method4455("+75p\u0011")), method4456(method4455("<xzp/x"))};
   @OriginalMember(
      owner = "client!laa",
      name = "e",
      descriptor = "F"
   )
   public static float field8615 = 1024.0F;
   @OriginalMember(
      owner = "client!laa",
      name = "d",
      descriptor = "I"
   )
   public static int field8618 = 100;
   @OriginalMember(
      owner = "client!laa",
      name = "b",
      descriptor = "I"
   )
   public static int field8620 = 0;
   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field8617 = new class164(68, 3);
   @OriginalMember(
      owner = "client!laa",
      name = "f",
      descriptor = "I"
   )
   public static int field8616;
   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "I"
   )
   public static int field8619;

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(I)J"
   )
   public static final synchronized long method4452(int arg0) {
      try {
         ++field8619;
         long var1 = System.currentTimeMillis();
         if (~var1 > ~class589.field8280) {
            class264.field4043 += -var1 + class589.field8280;
         }

         class589.field8280 = var1;
         int var3 = -76 / ((arg0 - -61) / 45);
         return class264.field4043 + var1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8621[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(IILsa;)Lwm;"
   )
   public static final class440 method4453(int arg0, int arg1, class39 arg2) {
      try {
         ++field8616;
         byte[] var3 = arg2.method449(arg0, (byte)-62);
         if (var3 == null) {
            return null;
         } else {
            if (arg1 != 29306) {
               field8618 = 48;
            }

            return new class440(var3);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8621[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8621[3] : field8621[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4454(byte arg0) {
      try {
         if (arg0 == -7) {
            field8617 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8621[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4456(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
