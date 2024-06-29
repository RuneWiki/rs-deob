import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class501 {
   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7302 = new String[]{method3766(method3765("t/\n+T0")), method3766(method3765("u/\bwzk)\rq"))};
   @OriginalMember(
      owner = "client!lia",
      name = "e",
      descriptor = "I"
   )
   public static int field7296;
   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "I"
   )
   public static int field7298;
   @OriginalMember(
      owner = "client!lia",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field7299;
   @OriginalMember(
      owner = "client!lia",
      name = "c",
      descriptor = "[S"
   )
   public short[] field7297;
   @OriginalMember(
      owner = "client!lia",
      name = "d",
      descriptor = "[S"
   )
   public short[] field7300;
   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "[S"
   )
   public short[] field7301;

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(I)V",
      line = 12
   )
   public static final void method3764(int arg0) {
      boolean var1 = client.field4564;

      try {
         label30: {
            ++field7298;
            if (class651.field9455.toLowerCase().indexOf(field7302[1]) == -1) {
               label27: {
                  class791.field11565[59] = 57;
                  class791.field11565[47] = 73;
                  class791.field11565[46] = 72;
                  class791.field11565[61] = 27;
                  class791.field11565[91] = 42;
                  if (class651.field9435 == null) {
                     class791.field11565[222] = 59;
                     class791.field11565[192] = 58;
                     if (!var1) {
                        break label27;
                     }
                  }

                  class791.field11565[222] = 58;
                  class791.field11565[192] = 28;
                  class791.field11565[520] = 59;
               }

               class791.field11565[93] = 43;
               class791.field11565[92] = 74;
               class791.field11565[45] = 26;
               class791.field11565[44] = 71;
               if (!var1) {
                  break label30;
               }
            }

            class791.field11565[188] = 71;
            class791.field11565[191] = 73;
            class791.field11565[187] = 27;
            class791.field11565[192] = 58;
            class791.field11565[220] = 74;
            class791.field11565[189] = 26;
            class791.field11565[190] = 72;
            class791.field11565[222] = 59;
            class791.field11565[223] = 28;
            class791.field11565[219] = 42;
            class791.field11565[221] = 43;
            class791.field11565[186] = 57;
         }

         if (arg0 != 43) {
            method3764(-25);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7302[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3765(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3766(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
