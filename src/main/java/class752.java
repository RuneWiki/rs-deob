import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class752 extends class70 {
   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "I"
   )
   public int field11124 = 0;
   @OriginalMember(
      owner = "client!rl",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11127 = new String[]{method5479(method5478("ndKm&")), method5479(method5478("g&K\bs")), method5479(method5478("r}\tJ")), method5479(method5478("ndKl&")), method5479(method5478("ndKo&"))};
   @OriginalMember(
      owner = "client!rl",
      name = "A",
      descriptor = "I"
   )
   public static int field11122 = -1;
   @OriginalMember(
      owner = "client!rl",
      name = "x",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field11125 = null;
   @OriginalMember(
      owner = "client!rl",
      name = "B",
      descriptor = "I"
   )
   public static int field11123;
   @OriginalMember(
      owner = "client!rl",
      name = "y",
      descriptor = "I"
   )
   public static int field11126;

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 3
   )
   public final void method5475(class128 arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         if (!arg1) {
            this.field11124 = -14;
         }

         ++field11126;

         do {
            int var4 = arg0.method1104(255);
            if (~var4 == -1) {
               break;
            }

            this.method5476(arg0, var4, 116);
         } while(var3 == 0);

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11127[3] + (arg0 != null ? field11127[1] : field11127[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(Ljj;II)V",
      line = 30
   )
   private final void method5476(class128 arg0, int arg1, int arg2) {
      try {
         ++field11123;
         if (~arg1 == -3) {
            this.field11124 = arg0.method1038((byte)-117);
         }

         if (arg2 <= 115) {
            field11122 = 4;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11127[0] + (arg0 != null ? field11127[1] : field11127[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(B)V",
      line = 47
   )
   public static void method5477(byte arg0) {
      try {
         int var1 = -24 / ((arg0 - 41) / 35);
         field11125 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11127[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5478(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5479(char[] arg0) {
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
            var10005 = 8;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
