import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class167 extends class124 {
   @OriginalMember(
      owner = "client!kt",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2113 = new String[]{method1319(method1318("aSr{\u0004")), method1319(method1318("aSrq\u0004")), method1319(method1318("aSr}\u0004"))};
   @OriginalMember(
      owner = "client!kt",
      name = "H",
      descriptor = "Lod;"
   )
   public static class536 field2109 = new class536();
   @OriginalMember(
      owner = "client!kt",
      name = "K",
      descriptor = "I"
   )
   public static int field2108;
   @OriginalMember(
      owner = "client!kt",
      name = "I",
      descriptor = "I"
   )
   public static int field2110;
   @OriginalMember(
      owner = "client!kt",
      name = "G",
      descriptor = "I"
   )
   public static int field2111;
   @OriginalMember(
      owner = "client!kt",
      name = "L",
      descriptor = "I"
   )
   public static int field2112;
   @OriginalMember(
      owner = "client!kt",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field2107;

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1316(byte arg0) {
      try {
         if (arg0 < 9) {
            field2111 = 0;
         }

         field2109 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2113[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(ZIII)[B"
   )
   public final byte[] method1317(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2108;
         if (!arg0) {
            field2112 = 68;
         }

         this.field2107 = new byte[arg3 * 2 * arg2 * arg1];
         this.method1350(arg2, arg3, arg1, (byte)-10);
         return this.field2107;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2113[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1039(int arg0, int arg1, byte arg2) {
      try {
         ++field2110;
         int var4 = 38 % ((arg1 - 39) / 62);
         int var5 = arg0 * 2;
         int var10001 = var5;
         int var9 = var5 + 1;
         this.field2107[var10001] = -1;
         int var6 = 255 & arg2;
         this.field2107[var9] = (byte)(var6 * 3 >> 5);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2113[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "<init>",
      descriptor = "()V"
   )
   public class167() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1319(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
