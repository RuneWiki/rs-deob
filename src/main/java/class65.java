import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class65 {
   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field801 = new String[]{method538(method537("s|d\u0006+")), method538(method537("f'&D")), method538(method537("f dj~")), method538(method537("f dl~")), method538(method537("f di~"))};
   @OriginalMember(
      owner = "client!nr",
      name = "b",
      descriptor = "I"
   )
   public static int field800 = 0;
   @OriginalMember(
      owner = "client!nr",
      name = "c",
      descriptor = "I"
   )
   public static int field798;
   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "I"
   )
   public static int field799;
   @OriginalMember(
      owner = "client!nr",
      name = "d",
      descriptor = "[[[B"
   )
   public static byte[][][] field797;

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method531(int arg0) {
      try {
         if (arg0 <= 122) {
            method533(86, -26, -7, -38, (class180)null);
         }

         field797 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field801[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(B[B)V"
   )
   public abstract void method532(byte arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(IIIILld;)V"
   )
   public static final void method533(int arg0, int arg1, int arg2, int arg3, class180 arg4) {
      try {
         if (arg2 == 0) {
            ++field799;
            arg4.field2211.method1094(-74, arg3);
            arg4.field2211.method1103(arg1, -101);
            arg4.field2211.method1079(arg0, 1856);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field801[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field801[0] : field801[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(Ljj;I)Ltc;"
   )
   public static final class370 method534(class128 arg0, int arg1) {
      try {
         ++field798;
         class590 var2 = class721.method5223(arg1 ^ 15178)[arg0.method1104(255)];
         class378 var3 = class168.method1358(0)[arg0.method1104(arg1 + 15398)];
         if (arg1 != -15143) {
            field797 = null;
         }

         int var4 = arg0.method1066(32767);
         int var5 = arg0.method1066(32767);
         int var6 = arg0.method1038((byte)-101);
         int var7 = arg0.method1038((byte)-101);
         int var8 = arg0.method1066(32767);
         int var9 = arg0.method1041(arg1 ^ -10673);
         int var10 = arg0.method1041(4758);
         return new class370(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field801[4] + (arg0 != null ? field801[0] : field801[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(IBI)[B"
   )
   public abstract byte[] method535(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!nr",
      name = "a",
      descriptor = "(B)[B"
   )
   public abstract byte[] method536(byte arg0);

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method537(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method538(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
