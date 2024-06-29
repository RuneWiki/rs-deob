import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class444 extends class391 {
   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6815 = new String[]{method3493(method3492("\u0011 V\u0001")), method3493(method3492("\u001c1[C'W")), method3493(method3492("\u0004{\u0014C\u0010")), method3493(method3492("\u001c1[C!W")), method3493(method3492("\u001c1[C&W"))};
   @OriginalMember(
      owner = "client!cda",
      name = "n",
      descriptor = "Liq;"
   )
   public static class92 field6811 = null;
   @OriginalMember(
      owner = "client!cda",
      name = "m",
      descriptor = "I"
   )
   public static int field6812 = -1;
   @OriginalMember(
      owner = "client!cda",
      name = "q",
      descriptor = "I"
   )
   public static int field6810;
   @OriginalMember(
      owner = "client!cda",
      name = "l",
      descriptor = "I"
   )
   public static int field6813;
   @OriginalMember(
      owner = "client!cda",
      name = "k",
      descriptor = "Lro;"
   )
   public static class148 field6808;
   @OriginalMember(
      owner = "client!cda",
      name = "o",
      descriptor = "Lcda;"
   )
   public class444 field6809;
   @OriginalMember(
      owner = "client!cda",
      name = "p",
      descriptor = "Lcda;"
   )
   public class444 field6814;

   @OriginalMember(
      owner = "client!cda",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method3489(boolean arg0) {
      try {
         field6811 = null;
         field6808 = null;
         if (!arg0) {
            field6808 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6815[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(FFIIFILoga;FFII)[B"
   )
   public static final byte[] method3490(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, class62 arg6, float arg7, float arg8, int arg9, int arg10) {
      try {
         ++field6810;
         byte[] var11 = new byte[arg9 * arg10 * arg3];
         class29.method208(arg4, arg10, arg1, arg2, arg0, arg3, arg9, arg8, arg7, arg6, arg5, 0, var11);
         return var11;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field6815[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6815[2] : field6815[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3491(int arg0) {
      try {
         int var2 = 52 % ((arg0 - 56) / 46);
         ++field6813;
         if (this.field6809 != null) {
            this.field6809.field6814 = this.field6814;
            this.field6814.field6809 = this.field6809;
            this.field6814 = null;
            this.field6809 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6815[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
