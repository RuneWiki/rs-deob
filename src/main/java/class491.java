import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class491 {
   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7157 = new String[]{method3709(method3708("\u0019\b\u0002WD;\u0019^JE\u000fE")), method3709(method3708("\u0019\b\u0002a\u0003")), method3709(method3708("\u0019\b\u0002b\u0003"))};
   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7153 = new int[3];
   @OriginalMember(
      owner = "client!qe",
      name = "d",
      descriptor = "[Z"
   )
   public static boolean[] field7155 = new boolean[8];
   @OriginalMember(
      owner = "client!qe",
      name = "e",
      descriptor = "I"
   )
   public static int field7152;
   @OriginalMember(
      owner = "client!qe",
      name = "c",
      descriptor = "I"
   )
   public static int field7154;
   @OriginalMember(
      owner = "client!qe",
      name = "b",
      descriptor = "I"
   )
   public static int field7156;

   @OriginalMember(
      owner = "client!qe",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 8
   )
   public final String toString() {
      try {
         ++field7152;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7157[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(DI)V",
      line = 27
   )
   public static final void method3706(double arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (class485.field7060 != arg0) {
            int var4 = 0;
            int var5;
            if (var3) {
               var5 = (int)(255.0D * Math.pow((double)var4 / 255.0D, arg0));
               class321.field4628[var4] = var5 > 255 ? 255 : var5;
               ++var4;
            }

            while(true) {
               double var10000;
               if (~var4 <= -257) {
                  var10000 = arg0;
                  if (!var3) {
                     class485.field7060 = arg0;
                     break;
                  }
               } else {
                  var10000 = 255.0D * Math.pow((double)var4 / 255.0D, arg0);
               }

               var5 = (int)var10000;
               class321.field4628[var4] = var5 > 255 ? 255 : var5;
               ++var4;
            }
         }

         if (arg1 == 255) {
            ++field7156;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7157[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "a",
      descriptor = "(B)V",
      line = 54
   )
   public static void method3707(byte arg0) {
      try {
         if (arg0 == 42) {
            field7153 = null;
            field7155 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7157[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
