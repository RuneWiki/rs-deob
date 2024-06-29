import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class266 {
   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3656 = new String[]{method2035(method2034("W.9,N\u0019")), method2035(method2034("W.9,O\u0019")), method2035(method2034("_<4n")), method2035(method2034("Jgv,q")), method2035(method2034("W.9,M\u0019"))};
   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "Lnn;"
   )
   public static class436 field3653 = new class436(method2035(method2034("}\u0006\u001bC@")), "", method2035(method2034("]&;c`")), 4);
   @OriginalMember(
      owner = "client!fga",
      name = "b",
      descriptor = "I"
   )
   public static int field3655 = 0;
   @OriginalMember(
      owner = "client!fga",
      name = "c",
      descriptor = "I"
   )
   public static int field3652;
   @OriginalMember(
      owner = "client!fga",
      name = "d",
      descriptor = "I"
   )
   public static int field3654;

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2031(int arg0) {
      try {
         field3653 = null;
         if (arg0 != 28311) {
            method2032(26, -29, 98, 104, (class739)null, -32, 108, 71, 91, -33, -62, -127);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3656[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(IIIILega;IIIIIII)Z"
   )
   public static final boolean method2032(int param0, int param1, int param2, int param3, class739 param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fga",
      name = "a",
      descriptor = "(ZIIII)V"
   )
   public static final void method2033(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var5 = -52 % ((-46 - arg4) / 58);
         ++field3652;
         if (class647.method4669(arg1, (byte)-93)) {
            class553.method4091(false, -1, arg3, arg0, arg2, class136.field1744[arg1]);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3656[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2034(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2035(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
