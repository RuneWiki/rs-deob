import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class284 {
   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4288 = new String[]{method2379(method2378("@$2Xm")), method2379(method2378("K|278")), method2379(method2378("^'pu")), method2379(method2378("@$2[m"))};
   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "I"
   )
   public static int field4286;
   @OriginalMember(
      owner = "client!pv",
      name = "b",
      descriptor = "I"
   )
   public static int field4287;

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2376(int arg0, int arg1, int arg2) {
      try {
         int var3 = 75 / ((arg2 - -3) / 41);
         ++field4286;
         return (2048 & arg0) != 0 && (55 & arg1) != 0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4288[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(I[BI)[B"
   )
   public static final byte[] method2377(int arg0, byte[] arg1, int arg2) {
      try {
         ++field4287;
         if (arg0 != 43) {
            method2376(-31, -56, -77);
         }

         byte[] var3 = new byte[arg2];
         class474.method3640(arg1, 0, var3, 0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4288[0] + arg0 + ',' + (arg1 != null ? field4288[1] : field4288[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2378(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2379(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
