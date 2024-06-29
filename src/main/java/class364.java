import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class364 extends class512 {
   @OriginalMember(
      owner = "client!gha",
      name = "e",
      descriptor = "Lfe;"
   )
   public class596 field5462;
   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5466 = new String[]{method2831(method2830(":\u0013")), method2831(method2830("4\u0014Ffm{")), method2831(method2830("4\u0014Ffj{")), method2831(method2830("4\u0014Ffl{")), method2831(method2830("=\tK$")), method2831(method2830("4\u0014Ff\u0012:\u0012N<\u0010{")), method2831(method2830("(R\tfS"))};
   @OriginalMember(
      owner = "client!gha",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5465 = new String[100];
   @OriginalMember(
      owner = "client!gha",
      name = "c",
      descriptor = "I"
   )
   public static int field5463;
   @OriginalMember(
      owner = "client!gha",
      name = "f",
      descriptor = "I"
   )
   public static int field5464;
   @OriginalMember(
      owner = "client!gha",
      name = "g",
      descriptor = "[[I"
   )
   public static int[][] field5461;

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method2827(int arg0) {
      try {
         field5461 = null;
         int var1 = 33 % ((-15 - arg0) / 62);
         field5465 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5466[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(B)Z",
      line = 16
   )
   public static final boolean method2828(byte arg0) {
      try {
         int var1 = 29 / ((arg0 - -41) / 55);
         ++field5463;
         return class627.field9106 != 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5466[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "<init>",
      descriptor = "(Lck;II[B)V",
      line = 25
   )
   public class364(class667 arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.field5462 = class553.method4090(false, arg1, 6406, 6406, arg0, arg2, arg3, (byte)115);
         this.field5462.method1893(true, false, false);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5466[5] + (arg0 != null ? field5466[6] : field5466[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5466[6] : field5466[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "b",
      descriptor = "(I)Ljr;",
      line = 37
   )
   public static final class120 method2829(int arg0) {
      try {
         if (arg0 != 6406) {
            return null;
         } else {
            ++field5464;

            try {
               return (class120)Class.forName(field5466[0]).newInstance();
            } catch (Throwable var2) {
               return null;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5466[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2830(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2831(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
