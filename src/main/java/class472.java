import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class472 extends class606 {
   @OriginalMember(
      owner = "client!qw",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6845 = new String[]{method3616(method3615("\"\u0004vSv")), method3616(method3615("\"\u0004vXv"))};
   @OriginalMember(
      owner = "client!qw",
      name = "E",
      descriptor = "I"
   )
   public static int field6843;
   @OriginalMember(
      owner = "client!qw",
      name = "D",
      descriptor = "I"
   )
   public static int field6844;

   @OriginalMember(
      owner = "client!qw",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method3614(int arg0, int arg1) {
      try {
         ++field6843;
         if (arg1 == 3) {
            class585.field8203 = arg0;
            class793.field11537 = 2;
            class527.field7461 = class745.field10605;
            class216.method1867("", true, class704.field10134.equals(""), 0, class704.field10134);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6845[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field6844;
         if (arg0 != 0) {
            method3614(-97, 44);
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[][] var5 = this.method4467(0, arg1, (byte)99);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int var9 = 0;
            if (var3 || ~class563.field8014 < ~var9) {
               do {
                  var4[var9] = (var6[var9] + var7[var9] + var8[var9]) / 3;
                  ++var9;
               } while(~class563.field8014 < ~var9);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field6845[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "()V"
   )
   public class472() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3615(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3616(char[] arg0) {
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
            var10005 = 115;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
