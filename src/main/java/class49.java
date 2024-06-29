import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class49 extends class684 {
   @OriginalMember(
      owner = "client!hga",
      name = "d",
      descriptor = "Lpga;"
   )
   public class371 field749;
   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field750 = new String[]{method541(method540("\u000f\u0019\u001fS\u000f")), method541(method540("\u001cPPSN\u001dYX\tL\\")), method541(method540("\u001aB]\u0011")), method541(method540("\u001cPPS3\\"))};
   @OriginalMember(
      owner = "client!hga",
      name = "e",
      descriptor = "J"
   )
   public static long field748 = -1L;
   @OriginalMember(
      owner = "client!hga",
      name = "f",
      descriptor = "Lea;"
   )
   public static class456 field747;

   @OriginalMember(
      owner = "client!hga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method539(byte arg0) {
      try {
         if (arg0 < -21) {
            field747 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field750[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "<init>",
      descriptor = "(Ldaa;II[B)V"
   )
   public class49(class226 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field749 = arg0.method1997(arg3, class106.field1654, arg1, arg2, 0, false);
         this.field749.method31(false, false, false);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field750[1] + (arg0 != null ? field750[0] : field750[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field750[0] : field750[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "<init>",
      descriptor = "(Ldaa;II[I)V"
   )
   public class49(class226 arg0, int arg1, int arg2, int[] arg3) {
      try {
         this.field749 = arg0.method2017(false, arg1, 0, arg2, arg3);
         this.field749.method31(false, false, false);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field750[1] + (arg0 != null ? field750[0] : field750[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field750[0] : field750[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method540(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method541(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
