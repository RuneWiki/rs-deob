import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class300 implements class110 {
   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "I"
   )
   public int field4185;
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4188 = new String[]{method2414(method2413("xU)\u0005}rTs\u0007<")), method2414(method2413("xU){<")), method2414(method2413("xU)x<"))};
   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "Z"
   )
   public static volatile boolean field4186 = false;
   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field4187 = new int[500];
   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "I"
   )
   public static int field4184;

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         int var2 = -29 % ((4 - arg0) / 37);
         ++field4184;
         return class238.field3011;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4188[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2412(int arg0) {
      try {
         field4187 = null;
         if (arg0 != 500) {
            field4187 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4188[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class300(int arg0) {
      try {
         this.field4185 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4188[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2413(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2414(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
