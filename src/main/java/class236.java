import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class236 extends class356 {
   @OriginalMember(
      owner = "client!jda",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3436 = new String[]{method1938(method1937(" \u0011pvvb")), method1938(method1937(" \u0011pvwb")), method1938(method1937(" \u0011pvqb"))};
   @OriginalMember(
      owner = "client!jda",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field3433 = new int[2];
   @OriginalMember(
      owner = "client!jda",
      name = "E",
      descriptor = "I"
   )
   public static int field3432;
   @OriginalMember(
      owner = "client!jda",
      name = "C",
      descriptor = "I"
   )
   public static int field3435;
   @OriginalMember(
      owner = "client!jda",
      name = "F",
      descriptor = "[B"
   )
   private byte[] field3431;
   @OriginalMember(
      owner = "client!jda",
      name = "D",
      descriptor = "[[[J"
   )
   public static long[][][] field3434;

   @OriginalMember(
      owner = "client!jda",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1935(int arg0) {
      try {
         field3434 = null;
         field3433 = null;
         if (arg0 != 2) {
            method1935(-40);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3436[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(IIII)[B"
   )
   public final byte[] method1936(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var5 = 16 % ((74 - arg3) / 32);
         ++field3432;
         this.field3431 = new byte[arg1 * arg2 * 2 * arg0];
         this.method2345(arg1, false, arg0, arg2);
         return this.field3431;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3436[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "<init>",
      descriptor = "()V"
   )
   public class236() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   @OriginalMember(
      owner = "client!jda",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method1529(int arg0, int arg1, byte arg2) {
      try {
         ++field3435;
         int var4 = arg0 * 2;
         if (arg1 >= -87) {
            this.method1529(-49, -88, (byte)63);
         }

         this.field3431[var4++] = -1;
         int var5 = arg2 & 255;
         this.field3431[var4] = (byte)(var5 * 3 >> 5);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3436[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1937(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1938(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
