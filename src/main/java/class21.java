import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 {
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field342 = new String[]{method153(method152("-\u007fdz2")), method153(method152("!\u007f&T")), method153(method152("-\u007fdy2")), method153(method152("4$d\u0016g"))};
   @OriginalMember(
      owner = "client!bu",
      name = "b",
      descriptor = "Lej;"
   )
   public static class133 field339 = new class133();
   @OriginalMember(
      owner = "client!bu",
      name = "c",
      descriptor = "Leb;"
   )
   public static class650 field341 = new class650(6, 8);
   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "I"
   )
   public static int field340;

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method150(byte arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         ++field340;
         if (class85.field1410 && (24 & class585.field8461) != 0) {
            boolean var3 = false;
            int var4 = class158.field2525;
            if (arg0 > -111) {
               field339 = null;
            }

            int[] var5 = class442.field6446;
            int var6 = 0;
            if (var2 || var6 < var4) {
               do {
                  class457 var7 = class458.field6723[var5[var6]];
                  if (var7.field6665 != null && var7.field6665.equalsIgnoreCase(arg1) && (class304.field4398 == var7 && ~(class585.field8461 & 16) != -1 || var7 != null && ~(class585.field8461 & 8) != -1)) {
                     ++class171.field2655;
                     class542 var8 = class549.method4093((byte)-113, class416.field6093, class126.field2108);
                     var8.field7859.method3571(255, 0);
                     var8.field7859.method3532(class780.field11429, 1605771280);
                     var8.field7859.method3550(class752.field10823, 29620);
                     var8.field7859.method3541(-23112, class513.field7486);
                     var8.field7859.method3541(-23112, var5[var6]);
                     class740.method5332(var8, (byte)77);
                     var3 = true;
                     class681.method4970(var7.method3438(false), 0, -2, var7.method3438(false), true, var7.field11313[0], 0, var7.field11322[0], 0);
                     if (!var2) {
                        break;
                     }
                  }

                  ++var6;
               } while(var6 < var4);
            }

            if (!var3) {
               class126.method1228(class100.field1620.method961(class385.field5684, true) + arg1, (byte)-102, 4);
            }

            if (class85.field1410) {
               class449.method3386((byte)-21);
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field342[2] + arg0 + ',' + (arg1 != null ? field342[3] : field342[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method151(boolean arg0) {
      try {
         field341 = null;
         if (arg0) {
            field339 = null;
         }

         field339 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field342[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method152(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method153(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
