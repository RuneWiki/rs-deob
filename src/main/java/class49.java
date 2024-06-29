import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class49 {
   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1051 = new String[]{method609(method608("iU\\\u0016\u001b2")), method609(method608("iU\\\u0016\u001c2")), method609(method608("a\u0018\u0013\u0016%")), method609(method608("iU\\\u0016\u001a2")), method609(method608("tCQT")), method609(method608("iU\\\u0016\u00192"))};
   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "D"
   )
   public static double field1050;
   @OriginalMember(
      owner = "client!sca",
      name = "e",
      descriptor = "I"
   )
   public static int field1046;
   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "I"
   )
   public static int field1048;
   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "I"
   )
   public static int field1049;
   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "Lha;"
   )
   public static class65 field1047;

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V",
      line = 4
   )
   public static final void method604(int arg0, String arg1, int arg2) {
      try {
         ++field1048;
         class536 var3 = class108.method1038((long)arg0, 14, arg2);
         var3.method4017(24076);
         var3.field7801 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1051[3] + arg0 + ',' + (arg1 != null ? field1051[2] : field1051[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "(B)V",
      line = 17
   )
   public static void method605(byte arg0) {
      try {
         int var1 = -111 / ((arg0 - -48) / 46);
         field1047 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1051[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(B)V",
      line = 30
   )
   public static final void method606(byte arg0) {
      boolean var1 = client.field4564;

      try {
         label30: {
            if (class444.field6473.method404()) {
               label27: {
                  class444.field6473.method417(class386.field5692);
                  class450.method3389(-4925);
                  if (class262.field3734) {
                     class240.method1963((byte)-108, class386.field5692);
                     if (!var1) {
                        break label27;
                     }
                  }

                  Dimension var2 = class386.field5692.getSize();
                  class444.field6473.method336(class386.field5692, var2.width, var2.height);
               }

               class444.field6473.method315(class386.field5692);
               if (!var1) {
                  break label30;
               }
            }

            class363.method2847((byte)34, false, class510.field7454.field11145.method2098(false));
         }

         ++field1049;
         class585.method4337((byte)126);
         class186.field2818 = true;
         if (arg0 > -124) {
            method607(-35, -82, 65, 26, 40, 101);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1051[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 65
   )
   public static final void method607(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method608(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method609(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
