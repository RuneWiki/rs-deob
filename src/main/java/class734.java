import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class734 extends class247 implements class12 {
   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10440 = new String[]{method5312(method5311("U/)B\u0011")), method5312(method5311("U/)A\u0011")), method5312(method5311("U/)@\u0011")), method5312(method5311("U/)G\u0011")), method5312(method5311("U/)E\u0011")), method5312(method5311("U/)F\u0011"))};
   @OriginalMember(
      owner = "client!la",
      name = "n",
      descriptor = "Lhha;"
   )
   public static class724 field10426 = new class724(48, 4);
   @OriginalMember(
      owner = "client!la",
      name = "s",
      descriptor = "Lfm;"
   )
   public static class164 field10433 = new class164(87, 8);
   @OriginalMember(
      owner = "client!la",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field10436 = new int[1000];
   @OriginalMember(
      owner = "client!la",
      name = "r",
      descriptor = "I"
   )
   public static int field10439 = 0;
   @OriginalMember(
      owner = "client!la",
      name = "u",
      descriptor = "I"
   )
   public static int field10438 = 0;
   @OriginalMember(
      owner = "client!la",
      name = "y",
      descriptor = "C"
   )
   public char field10425;
   @OriginalMember(
      owner = "client!la",
      name = "o",
      descriptor = "I"
   )
   public int field10424;
   @OriginalMember(
      owner = "client!la",
      name = "v",
      descriptor = "I"
   )
   public static int field10427;
   @OriginalMember(
      owner = "client!la",
      name = "q",
      descriptor = "I"
   )
   public int field10428;
   @OriginalMember(
      owner = "client!la",
      name = "j",
      descriptor = "I"
   )
   public static int field10429;
   @OriginalMember(
      owner = "client!la",
      name = "p",
      descriptor = "I"
   )
   public static int field10430;
   @OriginalMember(
      owner = "client!la",
      name = "l",
      descriptor = "I"
   )
   public static int field10431;
   @OriginalMember(
      owner = "client!la",
      name = "w",
      descriptor = "I"
   )
   public int field10432;
   @OriginalMember(
      owner = "client!la",
      name = "t",
      descriptor = "I"
   )
   public static int field10434;
   @OriginalMember(
      owner = "client!la",
      name = "k",
      descriptor = "I"
   )
   public static int field10435;
   @OriginalMember(
      owner = "client!la",
      name = "m",
      descriptor = "J"
   )
   public long field10437;

   @OriginalMember(
      owner = "client!la",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method102(byte arg0) {
      try {
         ++field10435;
         if (arg0 != 2) {
            this.field10424 = -94;
         }

         return this.field10424;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10440[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method105(int arg0) {
      try {
         if (arg0 != 23717) {
            this.method105(9);
         }

         ++field10431;
         return this.field10428;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10440[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method5310(byte arg0) {
      try {
         field10436 = null;
         field10433 = null;
         field10426 = null;
         int var1 = 11 % ((arg0 - -7) / 35);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10440[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method103(int arg0) {
      try {
         ++field10430;
         if (arg0 != -29121) {
            this.method102((byte)-28);
         }

         return this.field10437;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10440[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "a",
      descriptor = "(B)C"
   )
   public final char method106(byte arg0) {
      try {
         int var2 = -120 / ((arg0 - -32) / 59);
         ++field10427;
         return this.field10425;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10440[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method104(byte arg0) {
      try {
         if (arg0 >= -71) {
            this.field10425 = (char)65425;
         }

         ++field10429;
         return this.field10432;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10440[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5311(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!la",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5312(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
