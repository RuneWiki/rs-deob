import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class724 {
   @OriginalMember(
      owner = "client!hha",
      name = "c",
      descriptor = "I"
   )
   public int field10356;
   @OriginalMember(
      owner = "client!hha",
      name = "e",
      descriptor = "I"
   )
   private int field10349;
   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10357 = new String[]{method5244(method5243("nO\u001effit\u000b:{h@W")), method5244(method5243("nO\u001efQ.")), method5244(method5243("hR\u0013$")), method5244(method5243("}\tQfo")), method5244(method5243("nO\u001efS.")), method5244(method5243("nO\u001ef.oI\u0016<,.")), method5244(method5243("nO\u001efP."))};
   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field10351 = new class164(60, 7);
   @OriginalMember(
      owner = "client!hha",
      name = "h",
      descriptor = "I"
   )
   public static int field10352;
   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "I"
   )
   public static int field10353;
   @OriginalMember(
      owner = "client!hha",
      name = "d",
      descriptor = "I"
   )
   public static int field10355;
   @OriginalMember(
      owner = "client!hha",
      name = "g",
      descriptor = "Lhka;"
   )
   public static class360 field10354;
   @OriginalMember(
      owner = "client!hha",
      name = "f",
      descriptor = "[J"
   )
   public static long[] field10350;

   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method5240(byte arg0) {
      try {
         ++field10355;
         if (arg0 >= -34) {
            field10350 = null;
         }

         return this.field10349;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10357[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "([BIBI)Ljava/lang/String;"
   )
   public static final String method5241(byte[] arg0, int arg1, byte arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field10352;
         char[] var5 = new char[arg3];
         int var6 = -37 / ((arg2 - 59) / 45);
         int var7 = 0;
         int var8 = 0;
         if (!var4 && ~var8 <= ~arg3) {
            return new String(var5, 0, var7);
         } else {
            do {
               int var9 = 255 & arg0[arg1 + var8];
               if (var9 != 0) {
                  if (var9 >= 128 && ~var9 > -161) {
                     char var10 = class574.field8113[var9 + -128];
                     if (~var10 == -1) {
                        var10 = '?';
                     }

                     var9 = var10;
                  }

                  var5[var7++] = (char)var9;
               }

               ++var8;
            } while(~var8 > ~arg3);

            return new String(var5, 0, var7);
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field10357[1] + (arg0 != null ? field10357[3] : field10357[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10353;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10357[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5242(byte arg0) {
      try {
         field10351 = null;
         if (arg0 != 22) {
            method5242((byte)79);
         }

         field10350 = null;
         field10354 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10357[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class724(int arg0, int arg1) {
      try {
         this.field10356 = arg1;
         this.field10349 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10357[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5243(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5244(char[] arg0) {
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
            var10005 = 39;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
