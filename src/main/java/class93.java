import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class93 {
   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1531 = new String[]{method949(method948("\\#`?A\u001c")), method949(method948("\\#`?B\u001c"))};
   @OriginalMember(
      owner = "client!hba",
      name = "d",
      descriptor = "Lfm;"
   )
   public static class164 field1528 = new class164(45, 8);
   @OriginalMember(
      owner = "client!hba",
      name = "b",
      descriptor = "[F"
   )
   public static float[] field1529 = new float[4];
   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "I"
   )
   public static int field1527;
   @OriginalMember(
      owner = "client!hba",
      name = "c",
      descriptor = "Lfea;"
   )
   public static class82 field1530;

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(II)Lbu;"
   )
   public static final class234 method946(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field1527;
         class234[] var3 = class27.method344(-30306);
         int var4 = arg0;
         if (var2) {
            if (var3[arg0].field3616 == arg1) {
               return var3[arg0];
            }

            var4 = arg0 + 1;
         }

         while(true) {
            while(~var4 > ~var3.length) {
               if (var3[var4].field3616 == arg1) {
                  return var3[var4];
               }

               ++var4;
            }

            if (!var2) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1531[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method947(boolean arg0) {
      try {
         field1530 = null;
         field1528 = null;
         if (!arg0) {
            method946(17, -113);
         }

         field1529 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1531[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method948(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method949(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
