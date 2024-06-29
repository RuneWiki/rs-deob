import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class668 extends class606 {
   @OriginalMember(
      owner = "client!dt",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9393 = new String[]{method4852(method4851("&J[\u001a\n")), method4852(method4851("&J[\u0017\n")), method4852(method4851("&J[\u0011\n"))};
   @OriginalMember(
      owner = "client!dt",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field9388 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!dt",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field9390 = new int[]{3, 7, 15};
   @OriginalMember(
      owner = "client!dt",
      name = "D",
      descriptor = "I"
   )
   public static int field9389;
   @OriginalMember(
      owner = "client!dt",
      name = "F",
      descriptor = "I"
   )
   public static int field9391;
   @OriginalMember(
      owner = "client!dt",
      name = "H",
      descriptor = "I"
   )
   public static int field9392;

   @OriginalMember(
      owner = "client!dt",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4849(int arg0) {
      try {
         int var1 = -38 % ((arg0 - 7) / 44);
         field9388 = null;
         field9390 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9393[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field9392;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            field9390 = null;
         }

         if (super.field8645.field4884) {
            int var5 = class693.field10001[arg1];
            int var6 = 0;
            if (var3 || ~var6 > ~class563.field8014) {
               do {
                  var4[var6] = this.method4850(class607.method4473(arg0, 67), var5, class387.field5650[var6]) % 4096;
                  ++var6;
               } while(~var6 > ~class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9393[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "<init>",
      descriptor = "()V"
   )
   public class668() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!dt",
      name = "b",
      descriptor = "(III)I"
   )
   private final int method4850(int arg0, int arg1, int arg2) {
      try {
         if (arg0 < 62) {
            method4849(23);
         }

         ++field9389;
         int var4 = arg1 * 57 + arg2;
         int var5 = var4 ^ var4 << 1;
         return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9393[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4851(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4852(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
